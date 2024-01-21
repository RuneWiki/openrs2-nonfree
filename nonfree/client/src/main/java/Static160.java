import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!th", name = "yb", descriptor = "I")
	public static int anInt3952;

	@OriginalMember(owner = "client!th", name = "wb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1508 = Static169.method2903("::");

	@OriginalMember(owner = "client!th", name = "xb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1509 = Static169.method2903("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!th", name = "zb", descriptor = "[I")
	public static int[] anIntArray540 = new int[128];

	@OriginalMember(owner = "client!th", name = "Bb", descriptor = "I")
	public static int anInt3954 = 2;

	@OriginalMember(owner = "client!th", name = "Db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1510 = Static169.method2903("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	public static void method2775() {
		aClass23_1508 = null;
		aClass23_1510 = null;
		aClass23_1509 = null;
		anIntArray540 = null;
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
	public static void method2776() {
		Static113.aClass79_16.method2659();
		Static20.aClass79_2.method2659();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZZ)V")
	private static void method2777(@OriginalArg(3) boolean arg0) {
		Static80.aBoolean110 = arg0;
		Static35.anInt974 = 22050;
		Static24.anInt726 = 2;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(Z)Lclient!r;")
	public static Class1_Sub1_Sub15 method2778() {
		if (Static81.aClass1_Sub1_Sub15_2 == null) {
			Static81.aClass1_Sub1_Sub15_2 = new Class1_Sub1_Sub15();
		}
		return Static81.aClass1_Sub1_Sub15_2;
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
	public static void method2779() {
		@Pc(20) int local20;
		if (Static54.anInt1548 == 0) {
			Static123.aClass80_1 = new Class80(4, 104, 104, Static141.anIntArrayArrayArray3);
			for (local20 = 0; local20 < 4; local20++) {
				Static132.aClass69Array3[local20] = new Class69(104, 104);
			}
			Static8.aClass1_Sub1_Sub12_Sub1_1 = new Class1_Sub1_Sub12_Sub1(512, 512);
			Static54.anInt1548 = 20;
			Static86.anInt2301 = 5;
			Static61.aClass23_606 = Static112.aClass23_1105;
			return;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(77) int local77;
		@Pc(71) int local71;
		if (Static54.anInt1548 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local67 = local59 * 32 + 143;
				local71 = Class1_Sub1_Sub12_Sub2.anIntArray416[local67];
				local77 = local67 * 3 + 600;
				local57[local59] = local77 * local71 >> 16;
			}
			Static159.method2669(local57);
			Static61.aClass23_606 = Static82.aClass23_810;
			Static54.anInt1548 = 30;
			Static86.anInt2301 = 10;
		} else if (Static54.anInt1548 == 30) {
			Static33.aClass30_Sub1_3 = Static100.method1709(true, false, 0, true);
			Static140.aClass30_Sub1_15 = Static100.method1709(true, false, 1, true);
			Static129.aClass30_Sub1_13 = Static100.method1709(false, true, 2, true);
			Static29.aClass30_Sub1_2 = Static100.method1709(true, false, 3, true);
			Static161.aClass30_Sub1_16 = Static100.method1709(true, false, 4, true);
			Static4.aClass30_Sub1_1 = Static100.method1709(true, true, 5, true);
			Static167.aClass30_Sub1_18 = Static100.method1709(true, true, 6, false);
			Static99.aClass30_Sub1_9 = Static100.method1709(true, false, 7, true);
			Static140.aClass30_Sub1_14 = Static100.method1709(true, false, 8, true);
			Static42.aClass30_Sub1_4 = Static100.method1709(false, true, 9, true);
			Static52.aClass30_Sub1_6 = Static100.method1709(true, false, 10, true);
			Static72.aClass30_Sub1_7 = Static100.method1709(true, false, 11, true);
			Static115.aClass30_Sub1_10 = Static100.method1709(true, false, 12, true);
			Static162.aClass30_Sub1_17 = Static100.method1709(false, true, 13, true);
			Static85.aClass30_Sub1_8 = Static100.method1709(true, false, 14, false);
			Static120.aClass30_Sub1_11 = Static100.method1709(true, false, 15, true);
			Static86.anInt2301 = 20;
			Static54.anInt1548 = 40;
			Static61.aClass23_606 = Static49.aClass23_515;
		} else if (Static54.anInt1548 == 40) {
			local20 = Static33.aClass30_Sub1_3.method1312() * 4 / 100;
			local20 += Static140.aClass30_Sub1_15.method1312() * 4 / 100;
			local20 += Static129.aClass30_Sub1_13.method1312() * 2 / 100;
			local20 += Static29.aClass30_Sub1_2.method1312() * 2 / 100;
			local20 += Static161.aClass30_Sub1_16.method1312() * 6 / 100;
			local20 += Static4.aClass30_Sub1_1.method1312() * 4 / 100;
			local20 += Static167.aClass30_Sub1_18.method1312() * 2 / 100;
			local20 += Static99.aClass30_Sub1_9.method1312() * 60 / 100;
			local20 += Static140.aClass30_Sub1_14.method1312() * 2 / 100;
			local20 += Static42.aClass30_Sub1_4.method1312() * 2 / 100;
			local20 += Static52.aClass30_Sub1_6.method1312() * 2 / 100;
			local20 += Static72.aClass30_Sub1_7.method1312() * 2 / 100;
			local20 += Static115.aClass30_Sub1_10.method1312() * 2 / 100;
			local20 += Static162.aClass30_Sub1_17.method1312() * 2 / 100;
			local20 += Static85.aClass30_Sub1_8.method1312() * 2 / 100;
			local20 += Static120.aClass30_Sub1_11.method1312() * 2 / 100;
			if (local20 == 100) {
				Static86.anInt2301 = 30;
				Static61.aClass23_606 = Static38.aClass23_401;
				Static54.anInt1548 = 45;
			} else {
				if (local20 != 0) {
					Static61.aClass23_606 = Static149.method2571(new Class23[] { Static20.aClass23_242, Static27.method498(local20), Static82.aClass23_813 });
				}
				Static86.anInt2301 = 30;
			}
		} else if (Static54.anInt1548 == 45) {
			method2777(!Static8.aBoolean17);
			@Pc(464) Class1_Sub11_Sub2 local464 = new Class1_Sub11_Sub2();
			local464.method1779();
			Static74.aClass40_1 = Static77.method1390(0, Static91.aCanvas1, Static29.aClass74_2, 22050);
			Static74.aClass40_1.method2517(local464);
			Static85.method1494(Static120.aClass30_Sub1_11, local464, Static85.aClass30_Sub1_8, Static161.aClass30_Sub1_16);
			Static149.aClass40_2 = Static77.method1390(1, Static91.aCanvas1, Static29.aClass74_2, 2048);
			Static163.aClass1_Sub11_Sub3_2 = new Class1_Sub11_Sub3();
			Static149.aClass40_2.method2517(Static163.aClass1_Sub11_Sub3_2);
			Static94.aClass9_1 = new Class9(22050, Static35.anInt974);
			Static86.anInt2301 = 35;
			Static61.aClass23_606 = Static99.aClass23_969;
			Static54.anInt1548 = 50;
		} else if (Static54.anInt1548 == 50) {
			local20 = 0;
			if (Static81.aClass1_Sub1_Sub12_Sub3_Sub1_3 == null) {
				Static81.aClass1_Sub1_Sub12_Sub3_Sub1_3 = Static99.method1684(Static15.aClass23_181, Static101.aClass23_1001, Static140.aClass30_Sub1_14, Static162.aClass30_Sub1_17);
			} else {
				local20++;
			}
			if (Static109.aClass1_Sub1_Sub12_Sub3_Sub1_7 == null) {
				Static109.aClass1_Sub1_Sub12_Sub3_Sub1_7 = Static81.aClass1_Sub1_Sub12_Sub3_Sub1_3;
			} else {
				local20++;
			}
			if (Static20.aClass1_Sub1_Sub12_Sub3_Sub1_1 == null) {
				Static20.aClass1_Sub1_Sub12_Sub3_Sub1_1 = Static99.method1684(Static10.aClass23_133, Static101.aClass23_1001, Static140.aClass30_Sub1_14, Static162.aClass30_Sub1_17);
			} else {
				local20++;
			}
			if (Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6 == null) {
				Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6 = Static99.method1684(Static82.aClass23_811, Static101.aClass23_1001, Static140.aClass30_Sub1_14, Static162.aClass30_Sub1_17);
			} else {
				local20++;
			}
			if (local20 < 4) {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static135.aClass23_1278, Static27.method498(local20 * 100 / 4), Static82.aClass23_813 });
				Static86.anInt2301 = 40;
			} else {
				Static61.aClass23_606 = Static12.aClass23_157;
				Static86.anInt2301 = 40;
				Static54.anInt1548 = 60;
			}
		} else if (Static54.anInt1548 == 60) {
			local20 = Static111.method1963(Static52.aClass30_Sub1_6, Static140.aClass30_Sub1_14);
			local59 = Static7.method166();
			if (local20 < local59) {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static70.aClass23_698, Static27.method498(local20 * 100 / local59), Static82.aClass23_813 });
				Static86.anInt2301 = 50;
			} else {
				Static86.anInt2301 = 50;
				Static61.aClass23_606 = Static66.aClass23_644;
				Static32.method567(5);
				Static54.anInt1548 = 70;
			}
		} else if (Static54.anInt1548 == 70) {
			if (Static129.aClass30_Sub1_13.method1288()) {
				Static23.method398(Static129.aClass30_Sub1_13);
				Static167.method2887(Static129.aClass30_Sub1_13);
				Static181.method3139(Static99.aClass30_Sub1_9, Static129.aClass30_Sub1_13);
				Static113.method2007(Static8.aBoolean17, Static129.aClass30_Sub1_13, Static99.aClass30_Sub1_9);
				Static93.method1622(Static99.aClass30_Sub1_9, Static129.aClass30_Sub1_13);
				Static81.method890(Static99.aClass30_Sub1_9, Static129.aClass30_Sub1_13, Static176.aBoolean209, Static109.aClass1_Sub1_Sub12_Sub3_Sub1_7);
				Static2.method116(Static129.aClass30_Sub1_13, Static140.aClass30_Sub1_15, Static33.aClass30_Sub1_3);
				Static67.method1181(Static99.aClass30_Sub1_9, Static129.aClass30_Sub1_13);
				Static58.method1099(Static129.aClass30_Sub1_13);
				Static179.method3084(Static129.aClass30_Sub1_13);
				Static82.method1447(Static99.aClass30_Sub1_9, Static162.aClass30_Sub1_17, Static140.aClass30_Sub1_14, Static29.aClass30_Sub1_2);
				Static29.method535(Static129.aClass30_Sub1_13);
				Static72.method1304(Static129.aClass30_Sub1_13);
				Static61.aClass23_606 = Static104.aClass23_1025;
				Static86.anInt2301 = 60;
				Static108.method1218();
				Static54.anInt1548 = 80;
			} else {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static165.aClass23_1546, Static27.method498(Static129.aClass30_Sub1_13.method1305()), Static82.aClass23_813 });
				Static86.anInt2301 = 60;
			}
		} else if (Static54.anInt1548 == 80) {
			local20 = 0;
			if (Static98.aClass1_Sub1_Sub12_Sub1_5 == null) {
				Static98.aClass1_Sub1_Sub12_Sub1_5 = Static2.method112(Static101.aClass23_1001, Static167.aClass23_1566, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static16.aClass1_Sub1_Sub12_Sub1_2 == null) {
				Static16.aClass1_Sub1_Sub12_Sub1_2 = Static2.method112(Static101.aClass23_1001, Static18.aClass23_217, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static59.aClass1_Sub1_Sub12_Sub4Array5 == null) {
				Static59.aClass1_Sub1_Sub12_Sub4Array5 = Static76.method1367(Static140.aClass30_Sub1_14, Static71.aClass23_715, Static101.aClass23_1001);
			} else {
				local20++;
			}
			if (Static69.aClass1_Sub1_Sub12_Sub1Array4 == null) {
				Static69.aClass1_Sub1_Sub12_Sub1Array4 = Static97.method1670(Static17.aClass23_204, Static101.aClass23_1001, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static155.aClass1_Sub1_Sub12_Sub1Array8 == null) {
				Static155.aClass1_Sub1_Sub12_Sub1Array8 = Static97.method1670(Static20.aClass23_240, Static101.aClass23_1001, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static182.aClass1_Sub1_Sub12_Sub1Array11 == null) {
				Static182.aClass1_Sub1_Sub12_Sub1Array11 = Static97.method1670(Static104.aClass23_1022, Static101.aClass23_1001, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static23.aClass1_Sub1_Sub12_Sub1Array2 == null) {
				Static23.aClass1_Sub1_Sub12_Sub1Array2 = Static97.method1670(Static154.aClass23_1452, Static101.aClass23_1001, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static122.aClass1_Sub1_Sub12_Sub1Array9 == null) {
				Static122.aClass1_Sub1_Sub12_Sub1Array9 = Static97.method1670(Static163.aClass23_1530, Static101.aClass23_1001, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static123.aClass1_Sub1_Sub12_Sub1Array7 == null) {
				Static123.aClass1_Sub1_Sub12_Sub1Array7 = Static97.method1670(Static144.aClass23_1379, Static101.aClass23_1001, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static4.aClass1_Sub1_Sub12_Sub1Array1 == null) {
				Static4.aClass1_Sub1_Sub12_Sub1Array1 = Static97.method1670(Static12.aClass23_156, Static101.aClass23_1001, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static164.aClass1_Sub1_Sub12_Sub1Array10 == null) {
				Static164.aClass1_Sub1_Sub12_Sub1Array10 = Static97.method1670(Static20.aClass23_239, Static101.aClass23_1001, Static140.aClass30_Sub1_14);
			} else {
				local20++;
			}
			if (Static62.aClass1_Sub1_Sub12_Sub4Array6 == null) {
				Static62.aClass1_Sub1_Sub12_Sub4Array6 = Static76.method1367(Static140.aClass30_Sub1_14, Static122.aClass23_1506, Static101.aClass23_1001);
			} else {
				local20++;
			}
			if (Static33.aClass1_Sub1_Sub12_Sub4Array1 == null) {
				Static33.aClass1_Sub1_Sub12_Sub4Array1 = Static76.method1367(Static140.aClass30_Sub1_14, Static146.aClass23_1395, Static101.aClass23_1001);
			} else {
				local20++;
			}
			if (Static127.aClass1_Sub1_Sub12_Sub4_5 == null) {
				Static127.aClass1_Sub1_Sub12_Sub4_5 = Static170.method477(Static140.aClass30_Sub1_14, Static101.aClass23_1001, Static74.aClass23_732);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static40.aClass23_412, Static27.method498(local20 * 100 / 14), Static82.aClass23_813 });
				Static86.anInt2301 = 70;
			} else {
				Static136.aClass1_Sub1_Sub12_Sub4Array10 = Static33.aClass1_Sub1_Sub12_Sub4Array1;
				Static16.aClass1_Sub1_Sub12_Sub1_2.method1934();
				local59 = (int) (Math.random() * 21.0D) - 10;
				local67 = (int) (Math.random() * 21.0D) - 10;
				local77 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(983) int local983 = 0; local983 < Static69.aClass1_Sub1_Sub12_Sub1Array4.length; local983++) {
					Static69.aClass1_Sub1_Sub12_Sub1Array4[local983].method1924(local59 + local71, local67 - -local71, local71 + local77);
				}
				Static59.aClass1_Sub1_Sub12_Sub4Array5[0].method2744(local59 + local71, local67 - -local71, local77 + local71);
				Static90.method1593();
				Static86.anInt2301 = 70;
				Static54.anInt1548 = 90;
				Static61.aClass23_606 = Static16.aClass23_190;
			}
		} else if (Static54.anInt1548 == 90) {
			if (Static42.aClass30_Sub1_4.method1288()) {
				@Pc(1079) Class2 local1079 = new Class2(Static42.aClass30_Sub1_4, Static140.aClass30_Sub1_14, 20, Static8.aBoolean17 ? 64 : 128);
				Static121.method2145(local1079);
				Static121.method2144(0.7F);
				Static54.anInt1548 = 110;
				Static61.aClass23_606 = Static139.aClass23_1340;
				Static86.anInt2301 = 90;
			} else {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static111.aClass23_1085, Static27.method498(Static42.aClass30_Sub1_4.method1305()), Static82.aClass23_813 });
				Static86.anInt2301 = 90;
			}
		} else if (Static54.anInt1548 == 110) {
			Static20.aClass73_1 = new Class73();
			Static29.aClass74_2.method2484(Static20.aClass73_1, 10);
			Static61.aClass23_606 = Static137.aClass23_1310;
			Static54.anInt1548 = 120;
			Static86.anInt2301 = 94;
		} else if (Static54.anInt1548 == 120) {
			if (Static52.aClass30_Sub1_6.method1295(Static104.aClass23_1026, Static101.aClass23_1001)) {
				@Pc(1148) Class67 local1148 = new Class67(Static52.aClass30_Sub1_6.method1289(Static101.aClass23_1001, Static104.aClass23_1026));
				Static13.method253(local1148);
				Static61.aClass23_606 = Static127.aClass23_1251;
				Static86.anInt2301 = 96;
				Static54.anInt1548 = 130;
			} else {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static157.aClass23_1475, Static24.aClass23_262 });
				Static86.anInt2301 = 96;
			}
		} else if (Static54.anInt1548 == 130) {
			if (!Static29.aClass30_Sub1_2.method1288()) {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static124.aClass23_1200, Static27.method498(Static29.aClass30_Sub1_2.method1305() * 4 / 5), Static82.aClass23_813 });
				Static86.anInt2301 = 100;
			} else if (!Static115.aClass30_Sub1_10.method1288()) {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static124.aClass23_1200, Static27.method498(Static115.aClass30_Sub1_10.method1305() / 6 + 80), Static82.aClass23_813 });
				Static86.anInt2301 = 100;
			} else if (Static162.aClass30_Sub1_17.method1288()) {
				Static61.aClass23_606 = Static110.aClass23_1074;
				Static86.anInt2301 = 100;
				Static54.anInt1548 = 140;
			} else {
				Static61.aClass23_606 = Static149.method2571(new Class23[] { Static124.aClass23_1200, Static27.method498(Static162.aClass30_Sub1_17.method1305() / 20 + 96), Static82.aClass23_813 });
				Static86.anInt2301 = 100;
			}
		} else if (Static54.anInt1548 == 140) {
			Static32.method567(10);
		}
	}
}
