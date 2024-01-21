import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!jb;")
	public static Class25 aClass25_30;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!mf;")
	public static Class3_Sub15 aClass3_Sub15_4;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!ra;")
	public static Class3_Sub12_Sub1 aClass3_Sub12_Sub1_3 = new Class3_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1242 = Static59.method1195("Registrierter Benutzer");

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1243 = Static59.method1195("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public static int anInt2962 = 0;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray72 = new int[104][104];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!nc;BZ)V")
	public static void method1986(@OriginalArg(0) Class47 arg0, @OriginalArg(2) boolean arg1) {
		if (Static105.aClass47_4 != null) {
			try {
				Static105.aClass47_4.method1564();
			} catch (@Pc(12) Exception local12) {
			}
			Static105.aClass47_4 = null;
		}
		Static105.aClass47_4 = arg0;
		Static117.method2133(arg1);
		Static55.anInt1758 = 0;
		Static119.aClass3_Sub12_8.anInt2886 = 0;
		Static85.aClass3_Sub1_Sub4_1 = null;
		Static124.aClass3_Sub12_7 = null;
		while (true) {
			@Pc(33) Class3_Sub1_Sub4 local33 = (Class3_Sub1_Sub4) Static39.aClass82_4.method2306();
			if (local33 == null) {
				while (true) {
					local33 = (Class3_Sub1_Sub4) Static29.aClass82_3.method2306();
					if (local33 == null) {
						if (Static28.aByte13 != 0) {
							try {
								@Pc(93) Class3_Sub12 local93 = new Class3_Sub12(4);
								local93.method1937(4);
								local93.method1937(Static28.aByte13);
								local93.method1922(0);
								Static105.aClass47_4.method1562(local93.aByteArray77, 4);
							} catch (@Pc(116) IOException local116) {
								try {
									Static105.aClass47_4.method1564();
								} catch (@Pc(123) Exception local123) {
								}
								Static105.aClass47_4 = null;
								Static108.anInt3059++;
							}
						}
						Static105.anInt3027 = 0;
						Static39.aLong43 = Static102.method1996();
						return;
					}
					Static128.aClass43_2.method1389(local33);
					Static64.aClass82_7.method2303(local33, local33.aLong107);
					Static48.anInt1544++;
					Static48.anInt1548--;
				}
			}
			Static58.aClass82_6.method2303(local33, local33.aLong107);
			Static30.anInt1030++;
			Static98.anInt2826--;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method1987() {
		anIntArrayArray72 = null;
		aClass3_Sub15_4 = null;
		aClass25_30 = null;
		aClass3_Sub12_Sub1_3 = null;
		aByteArrayArrayArray6 = null;
		aClass60_1243 = null;
		aClass60_1242 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!u;Lclient!la;I)V")
	public static void method1988(@OriginalArg(1) Class74 arg0, @OriginalArg(2) Class3_Sub12 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub19 local9 = new Class3_Sub19();
		local9.anInt2776 = arg1.method1936();
		local9.anInt2767 = arg1.method1920();
		local9.aClass7Array2 = new Class7[local9.anInt2776];
		local9.anIntArray300 = new int[local9.anInt2776];
		local9.anIntArray301 = new int[local9.anInt2776];
		local9.aByteArrayArrayArray5 = new byte[local9.anInt2776][][];
		local9.aClass7Array1 = new Class7[local9.anInt2776];
		local9.anIntArray299 = new int[local9.anInt2776];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt2776; local51++) {
			try {
				@Pc(57) int local57 = arg1.method1936();
				@Pc(78) String local78;
				@Pc(89) String local89;
				@Pc(91) int local91;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local78 = new String(arg1.method1943().method1861());
					local89 = new String(arg1.method1943().method1861());
					local91 = 0;
					if (local57 == 1) {
						local91 = arg1.method1920();
					}
					local9.anIntArray301[local51] = local57;
					local9.anIntArray299[local51] = local91;
					local9.aClass7Array1[local51] = arg0.method2123(local89, Static60.method1204(local78));
				} else if (local57 == 3 || local57 == 4) {
					local78 = new String(arg1.method1943().method1861());
					local89 = new String(arg1.method1943().method1861());
					local91 = arg1.method1936();
					@Pc(156) String[] local156 = new String[local91];
					for (@Pc(158) int local158 = 0; local158 < local91; local158++) {
						local156[local158] = new String(arg1.method1943().method1861());
					}
					@Pc(182) byte[][] local182 = new byte[local91][];
					@Pc(195) int local195;
					if (local57 == 3) {
						for (@Pc(189) int local189 = 0; local189 < local91; local189++) {
							local195 = arg1.method1920();
							local182[local189] = new byte[local195];
							arg1.method1941(local182[local189], local195);
						}
					}
					@Pc(215) Class[] local215 = new Class[local91];
					local9.anIntArray301[local51] = local57;
					for (local195 = 0; local195 < local91; local195++) {
						local215[local195] = Static60.method1204(local156[local195]);
					}
					local9.aClass7Array2[local51] = arg0.method2127(local215, local89, Static60.method1204(local78));
					local9.aByteArrayArrayArray5[local51] = local182;
				}
			} catch (@Pc(259) ClassNotFoundException local259) {
				local9.anIntArray300[local51] = -1;
			} catch (@Pc(266) SecurityException local266) {
				local9.anIntArray300[local51] = -2;
			} catch (@Pc(273) NullPointerException local273) {
				local9.anIntArray300[local51] = -3;
			} catch (@Pc(280) Exception local280) {
				local9.anIntArray300[local51] = -4;
			} catch (@Pc(287) Throwable local287) {
				local9.anIntArray300[local51] = -5;
			}
		}
		Static51.aClass5_12.method87(local9);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1989() {
		@Pc(20) int local20;
		if (Static100.anInt2953 == 0) {
			Static13.aClass58_1 = new Class58(4, 104, 104, Static51.anIntArrayArrayArray3);
			for (local20 = 0; local20 < 4; local20++) {
				Static89.aClass72Array1[local20] = new Class72(104, 104);
			}
			Static12.aClass3_Sub1_Sub2_Sub3_1 = new Class3_Sub1_Sub2_Sub3(512, 512);
			Static100.anInt2953 = 20;
			Static78.anInt2433 = 5;
			Static105.aClass60_1275 = Static82.aClass60_1093;
			return;
		}
		@Pc(55) int local55;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static100.anInt2953 == 20) {
			@Pc(53) int[] local53 = new int[9];
			for (local55 = 0; local55 < 9; local55++) {
				local65 = local55 * 32 + 128 + 15;
				local71 = local65 * 3 + 600;
				local75 = Class3_Sub1_Sub2_Sub1.anIntArray41[local65];
				local53[local55] = local75 * local71 >> 16;
			}
			Static94.method1742(local53);
			Static78.anInt2433 = 10;
			Static105.aClass60_1275 = Static17.aClass60_283;
			Static100.anInt2953 = 30;
		} else if (Static100.anInt2953 == 30) {
			Static68.aClass25_Sub1_11 = Static95.method1789(0, false, true, true);
			Static82.aClass25_Sub1_12 = Static95.method1789(1, false, true, true);
			Static100.aClass25_Sub1_14 = Static95.method1789(2, true, false, true);
			Static51.aClass25_Sub1_6 = Static95.method1789(3, false, true, true);
			Static26.aClass25_Sub1_4 = Static95.method1789(4, false, true, true);
			Static112.aClass25_Sub1_17 = Static95.method1789(5, true, true, true);
			Static41.aClass25_Sub1_7 = Static95.method1789(6, true, true, false);
			Static55.aClass25_Sub1_8 = Static95.method1789(7, false, true, true);
			Static113.aClass25_Sub1_18 = Static95.method1789(8, false, true, true);
			Static24.aClass25_Sub1_3 = Static95.method1789(9, false, true, true);
			Static64.aClass25_Sub1_9 = Static95.method1789(10, false, true, true);
			Static16.aClass25_Sub1_1 = Static95.method1789(11, false, true, true);
			Static117.aClass25_Sub1_19 = Static95.method1789(12, false, true, true);
			Static100.aClass25_Sub1_15 = Static95.method1789(13, true, false, true);
			Static66.aClass25_Sub1_10 = Static95.method1789(14, false, true, false);
			Static98.aClass25_Sub1_13 = Static95.method1789(15, false, true, true);
			Static78.anInt2433 = 20;
			Static105.aClass60_1275 = Static18.aClass60_295;
			Static100.anInt2953 = 40;
		} else if (Static100.anInt2953 == 40) {
			local20 = Static68.aClass25_Sub1_11.method939() * 4 / 100;
			local20 += Static82.aClass25_Sub1_12.method939() * 4 / 100;
			local20 += Static100.aClass25_Sub1_14.method939() * 2 / 100;
			local20 += Static51.aClass25_Sub1_6.method939() * 2 / 100;
			local20 += Static26.aClass25_Sub1_4.method939() * 6 / 100;
			local20 += Static112.aClass25_Sub1_17.method939() * 4 / 100;
			local20 += Static41.aClass25_Sub1_7.method939() * 2 / 100;
			local20 += Static55.aClass25_Sub1_8.method939() * 60 / 100;
			local20 += Static113.aClass25_Sub1_18.method939() * 2 / 100;
			local20 += Static24.aClass25_Sub1_3.method939() * 2 / 100;
			local20 += Static64.aClass25_Sub1_9.method939() * 2 / 100;
			local20 += Static16.aClass25_Sub1_1.method939() * 2 / 100;
			local20 += Static117.aClass25_Sub1_19.method939() * 2 / 100;
			local20 += Static100.aClass25_Sub1_15.method939() * 2 / 100;
			local20 += Static66.aClass25_Sub1_10.method939() * 2 / 100;
			local20 += Static98.aClass25_Sub1_13.method939() * 2 / 100;
			if (local20 == 100) {
				Static105.aClass60_1275 = Static36.aClass60_474;
				Static78.anInt2433 = 30;
				Static100.anInt2953 = 45;
			} else {
				if (local20 != 0) {
					Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static32.aClass60_429, Static65.method1341(local20), Static35.aClass60_463 });
				}
				Static78.anInt2433 = 30;
			}
		} else if (Static100.anInt2953 == 45) {
			Static74.method1550(!Static14.aBoolean15);
			@Pc(452) Class3_Sub2_Sub4 local452 = new Class3_Sub2_Sub4();
			local452.method2185();
			Static99.aClass34_2 = Static85.method1671(0, 22050, Static2.aCanvas1, Static35.aClass74_1);
			Static99.aClass34_2.method1724(local452);
			Static118.method2138(Static66.aClass25_Sub1_10, Static98.aClass25_Sub1_13, Static26.aClass25_Sub1_4, local452);
			Static73.aClass34_1 = Static85.method1671(1, 2048, Static2.aCanvas1, Static35.aClass74_1);
			Static125.aClass3_Sub2_Sub2_2 = new Class3_Sub2_Sub2();
			Static73.aClass34_1.method1724(Static125.aClass3_Sub2_Sub2_2);
			Static99.aClass56_1 = new Class56(22050, Static68.anInt2134);
			Static105.aClass60_1275 = Static14.aClass60_183;
			Static100.anInt2953 = 50;
			Static78.anInt2433 = 35;
		} else if (Static100.anInt2953 == 50) {
			local20 = 0;
			if (Static20.aClass3_Sub1_Sub2_Sub2_1 == null) {
				Static20.aClass3_Sub1_Sub2_Sub2_1 = Static52.method1124(Static120.aClass60_1369, Static118.aClass60_1352, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static20.aClass3_Sub1_Sub2_Sub2_2 == null) {
				Static20.aClass3_Sub1_Sub2_Sub2_2 = Static52.method1124(Static120.aClass60_1369, Static105.aClass60_1285, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static123.aClass3_Sub1_Sub2_Sub2_4 == null) {
				Static123.aClass3_Sub1_Sub2_Sub2_4 = Static52.method1124(Static120.aClass60_1369, Static4.aClass60_73, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static28.aClass60_1392, Static65.method1341(local20 * 100 / 3), Static35.aClass60_463 });
				Static78.anInt2433 = 40;
			} else {
				Static105.aClass60_1275 = Static13.aClass60_175;
				Static100.anInt2953 = 60;
				Static78.anInt2433 = 40;
			}
		} else if (Static100.anInt2953 == 60) {
			local20 = Static67.method1382(Static64.aClass25_Sub1_9, Static113.aClass25_Sub1_18);
			local55 = Static72.method1499();
			if (local20 < local55) {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static68.aClass60_932, Static65.method1341(local20 * 100 / local55), Static35.aClass60_463 });
				Static78.anInt2433 = 50;
			} else {
				Static78.anInt2433 = 50;
				Static105.aClass60_1275 = Static49.aClass60_699;
				Static50.method1075(5);
				Static100.anInt2953 = 70;
			}
		} else if (Static100.anInt2953 == 70) {
			if (Static100.aClass25_Sub1_14.method916()) {
				Static70.method1462(Static100.aClass25_Sub1_14);
				Static32.method732(Static100.aClass25_Sub1_14);
				Static112.method2070(Static55.aClass25_Sub1_8, Static100.aClass25_Sub1_14);
				Static20.method544(Static55.aClass25_Sub1_8, Static100.aClass25_Sub1_14, Static14.aBoolean15);
				Static79.method1592(Static55.aClass25_Sub1_8, Static100.aClass25_Sub1_14);
				Static21.method564(Static20.aClass3_Sub1_Sub2_Sub2_1, Static124.aBoolean117, Static55.aClass25_Sub1_8, Static100.aClass25_Sub1_14);
				Static73.method1525(Static82.aClass25_Sub1_12, Static68.aClass25_Sub1_11, Static100.aClass25_Sub1_14);
				Static76.method1556(Static100.aClass25_Sub1_14, Static55.aClass25_Sub1_8);
				Static26.method647(Static100.aClass25_Sub1_14);
				Static91.method1712(Static100.aClass25_Sub1_14);
				Static61.method1246(Static55.aClass25_Sub1_8, Static113.aClass25_Sub1_18, Static51.aClass25_Sub1_6);
				Static120.method2175(Static100.aClass25_Sub1_14);
				Static123.method2246(Static100.aClass25_Sub1_14);
				Static78.anInt2433 = 60;
				Static100.anInt2953 = 80;
				Static105.aClass60_1275 = Static79.aClass60_1050;
			} else {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static73.aClass60_996, Static65.method1341(Static100.aClass25_Sub1_14.method935()), Static35.aClass60_463 });
				Static78.anInt2433 = 60;
			}
		} else if (Static100.anInt2953 == 80) {
			local20 = 0;
			if (Static65.aClass3_Sub1_Sub2_Sub3_3 == null) {
				Static65.aClass3_Sub1_Sub2_Sub3_3 = Static79.method1602(Static59.aClass60_820, Static113.aClass25_Sub1_18, Static120.aClass60_1369);
			} else {
				local20++;
			}
			if (Static129.aClass3_Sub1_Sub2_Sub3_6 == null) {
				Static129.aClass3_Sub1_Sub2_Sub3_6 = Static79.method1602(Static63.aClass60_1228, Static113.aClass25_Sub1_18, Static120.aClass60_1369);
			} else {
				local20++;
			}
			if (Static112.aClass3_Sub1_Sub2_Sub4Array9 == null) {
				Static112.aClass3_Sub1_Sub2_Sub4Array9 = Static52.method1130(Static113.aClass25_Sub1_18, Static118.aClass60_1353, Static120.aClass60_1369);
			} else {
				local20++;
			}
			if (Static114.aClass3_Sub1_Sub2_Sub3Array9 == null) {
				Static114.aClass3_Sub1_Sub2_Sub3Array9 = Static38.method873(Static120.aClass60_1369, Static109.aClass60_1306, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static14.aClass3_Sub1_Sub2_Sub3Array1 == null) {
				Static14.aClass3_Sub1_Sub2_Sub3Array1 = Static38.method873(Static120.aClass60_1369, Static91.aClass60_1151, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static54.aClass3_Sub1_Sub2_Sub3Array4 == null) {
				Static54.aClass3_Sub1_Sub2_Sub3Array4 = Static38.method873(Static120.aClass60_1369, Static75.aClass60_1022, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static24.aClass3_Sub1_Sub2_Sub3Array3 == null) {
				Static24.aClass3_Sub1_Sub2_Sub3Array3 = Static38.method873(Static120.aClass60_1369, Static113.aClass60_1329, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static98.aClass3_Sub1_Sub2_Sub3Array6 == null) {
				Static98.aClass3_Sub1_Sub2_Sub3Array6 = Static38.method873(Static120.aClass60_1369, Static126.aClass60_1418, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static97.aClass3_Sub1_Sub2_Sub3_5 == null) {
				Static97.aClass3_Sub1_Sub2_Sub3_5 = Static79.method1602(Static54.aClass60_775, Static113.aClass25_Sub1_18, Static120.aClass60_1369);
			} else {
				local20++;
			}
			if (Static123.aClass3_Sub1_Sub2_Sub3Array10 == null) {
				Static123.aClass3_Sub1_Sub2_Sub3Array10 = Static38.method873(Static120.aClass60_1369, Static67.aClass60_926, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static103.aClass3_Sub1_Sub2_Sub3Array7 == null) {
				Static103.aClass3_Sub1_Sub2_Sub3Array7 = Static38.method873(Static120.aClass60_1369, Static21.aClass60_329, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static20.aClass3_Sub1_Sub2_Sub3Array2 == null) {
				Static20.aClass3_Sub1_Sub2_Sub3Array2 = Static38.method873(Static120.aClass60_1369, Static64.aClass60_890, Static113.aClass25_Sub1_18);
			} else {
				local20++;
			}
			if (Static87.aClass3_Sub1_Sub2_Sub4Array4 == null) {
				Static87.aClass3_Sub1_Sub2_Sub4Array4 = Static52.method1130(Static113.aClass25_Sub1_18, Static98.aClass60_1203, Static120.aClass60_1369);
			} else {
				local20++;
			}
			if (Static98.aClass3_Sub1_Sub2_Sub4Array8 == null) {
				Static98.aClass3_Sub1_Sub2_Sub4Array8 = Static52.method1130(Static113.aClass25_Sub1_18, Static27.aClass60_381, Static120.aClass60_1369);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static117.aClass60_1343, Static65.method1341(local20 * 100 / 14), Static35.aClass60_463 });
				Static78.anInt2433 = 70;
			} else {
				Static129.aClass3_Sub1_Sub2_Sub3_6.method1432();
				local65 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 41.0D) - 20;
				local71 = (int) (Math.random() * 21.0D) - 10;
				local55 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(964) int local964 = 0; local964 < Static114.aClass3_Sub1_Sub2_Sub3Array9.length; local964++) {
					Static114.aClass3_Sub1_Sub2_Sub3Array9[local964].method1436(local75 + local55, local65 + local75, local75 + local71);
				}
				Static112.aClass3_Sub1_Sub2_Sub4Array9[0].method1899(local55 + local75, local75 + local65, local71 + local75);
				Static100.anInt2953 = 85;
				Static78.anInt2433 = 70;
				Static105.aClass60_1275 = Static14.aClass60_184;
			}
		} else if (Static100.anInt2953 == 85) {
			local20 = Static123.method2247(Static113.aClass25_Sub1_18);
			local55 = Static119.method2147();
			if (local20 < local55) {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static33.aClass60_445, Static65.method1341(local20 * 100 / local55), Static35.aClass60_463 });
				Static78.anInt2433 = 80;
			} else {
				Static78.anInt2433 = 80;
				Static105.aClass60_1275 = Static125.aClass60_1403;
				Static100.anInt2953 = 90;
			}
		} else if (Static100.anInt2953 == 90) {
			if (Static24.aClass25_Sub1_3.method916()) {
				@Pc(1109) Class37 local1109 = new Class37(Static24.aClass25_Sub1_3, Static113.aClass25_Sub1_18, 20, 0.8D, Static14.aBoolean15 ? 64 : 128);
				Static7.method283(local1109);
				Static7.method272(0.8D);
				Static100.anInt2953 = 110;
				Static78.anInt2433 = 90;
				Static105.aClass60_1275 = Static100.aClass60_1238;
			} else {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static89.aClass60_1143, Static65.method1341(Static24.aClass25_Sub1_3.method935()), Static35.aClass60_463 });
				Static78.anInt2433 = 90;
			}
		} else if (Static100.anInt2953 == 110) {
			Static21.aClass79_1 = new Class79();
			Static35.aClass74_1.method2122(Static21.aClass79_1, 10);
			Static78.anInt2433 = 94;
			Static100.anInt2953 = 120;
			Static105.aClass60_1275 = Static50.aClass60_727;
		} else if (Static100.anInt2953 == 120) {
			if (Static64.aClass25_Sub1_9.method925(Static120.aClass60_1369, Static100.aClass60_1239)) {
				@Pc(1176) Class21 local1176 = new Class21(Static64.aClass25_Sub1_9.method914(Static120.aClass60_1369, Static100.aClass60_1239));
				Static65.method1340(local1176);
				Static105.aClass60_1275 = Static51.aClass60_587;
				Static78.anInt2433 = 96;
				Static100.anInt2953 = 130;
			} else {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static52.aClass60_760, Static35.aClass60_465 });
				Static78.anInt2433 = 96;
			}
		} else if (Static100.anInt2953 == 130) {
			if (!Static51.aClass25_Sub1_6.method916()) {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static113.aClass60_1328, Static65.method1341(Static51.aClass25_Sub1_6.method935() * 4 / 5), Static35.aClass60_463 });
				Static78.anInt2433 = 100;
			} else if (!Static117.aClass25_Sub1_19.method916()) {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static113.aClass60_1328, Static65.method1341(Static117.aClass25_Sub1_19.method935() / 6 + 80), Static35.aClass60_463 });
				Static78.anInt2433 = 100;
			} else if (Static100.aClass25_Sub1_15.method916()) {
				Static105.aClass60_1275 = Static30.aClass60_406;
				Static78.anInt2433 = 100;
				Static100.anInt2953 = 140;
			} else {
				Static105.aClass60_1275 = Static60.method1211(new Class60[] { Static113.aClass60_1328, Static65.method1341(Static100.aClass25_Sub1_15.method935() / 20 + 96), Static35.aClass60_463 });
				Static78.anInt2433 = 100;
			}
		} else if (Static100.anInt2953 == 140) {
			Static50.method1075(10);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) Class3_Sub7 local15 = null;
		for (@Pc(20) Class3_Sub7 local20 = (Class3_Sub7) Static80.aClass5_18.method92(); local20 != null; local20 = (Class3_Sub7) Static80.aClass5_18.method90()) {
			if (local20.anInt795 == arg6 && arg7 == local20.anInt797 && local20.anInt792 == arg5 && local20.anInt787 == arg4) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class3_Sub7();
			local15.anInt787 = arg4;
			local15.anInt792 = arg5;
			local15.anInt795 = arg6;
			local15.anInt797 = arg7;
			Static111.method2067(local15);
			Static80.aClass5_18.method87(local15);
		}
		local15.anInt802 = arg3;
		local15.anInt801 = arg8;
		local15.anInt799 = arg2;
		local15.anInt791 = arg0;
		local15.anInt790 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!jb;)Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class25 arg2) {
		return Static55.method1140(arg1, arg0, arg2) ? Static8.method288() : null;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	public static void method1992() {
		Static45.anImage2 = null;
		Static36.aFontMetrics1 = null;
		Static56.aFont1 = null;
	}
}
