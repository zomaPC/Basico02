/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas02;

import java.util.Scanner;

/**
 *
 * @author exels
 */
public class Basicas02 {

   public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;
        System.out.println("********************************");
        System.out.println("* Sistema Vacacional coca-cola*");
        System.out.println("********************************");
        
        System.out.println("¿Cual es el Nombre del trabajador?");
        nombre = entrada.nextLine();
        System.out.println("");
        System.out.println("Escribe la antiguedad");
        antiguedad = entrada.nextInt();
        System.out.println("");
        System.out.println("Clave del trabjador");
        clave  = entrada.nextInt();
        System.out.println("");
        
        if(clave == 1){
            if(antiguedad == 1){
                System.out.println(nombre + "Tiene 6 dias vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre + "Tiene derecho a 14 dias");
            }else if (antiguedad >= 7 ){
                System.out.println( nombre + "Tiene derecho a 20 dias");
            }
        }else if(clave == 2){
           if(antiguedad == 1){
                System.out.println(nombre + "Tiene 7 dias vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre + "Tiene derecho a 15 dias");
            }else if (antiguedad >= 7 ){
                System.out.println( nombre + "Tiene derecho a 22 dias");
            }
        }else if(clave==3){
            if(antiguedad == 1){
                System.out.println(nombre + "Tiene 8 dias vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre + "Tiene derecho a 20 dias");
            }else if (antiguedad >= 7 ){
                System.out.println( nombre + "Tiene derecho a 30 dias");
            }
        
        }else{
            System.out.println("Error, la clave no  existe");}
    }
    
}
