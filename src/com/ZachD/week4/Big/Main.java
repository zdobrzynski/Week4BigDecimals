package com.ZachD.week4.Big;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal Wisconsin = new BigDecimal(5726398);
        BigDecimal California = new BigDecimal(38041430);
        BigDecimal Texas = new BigDecimal(26059203);

        System.out.println("If all " + Wisconsin + " people in Wisconsin had to write a letter to every person in California(" + California + "), there would be " +
                Wisconsin.multiply(California) + " letters.");
        System.out.println("Now if there were to be a copy for every person in Texas(" + Texas + "), there would be " +
                Wisconsin.multiply(California).multiply(Texas) + " letters.");
        System.out.println("If those then had to be mailed to everyone in Texas at $3.23 each, it would cost $" +
                Wisconsin.multiply(California).multiply(Texas).doubleValue() * 3.23);
    }
}
