import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!ta;")
	public static Class14 aClass14_34;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!qc;")
	public static Class2_Sub1_Sub4_Sub2_Sub2 aClass2_Sub1_Sub4_Sub2_Sub2_3;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!ac;")
	public static Class3 aClass3_24;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Lclient!ta;")
	public static Class14 aClass14_35;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!gd;")
	public static Class22 aClass22_35 = new Class22(64);

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[Lclient!wd;")
	public static Class2_Sub12[] aClass2_Sub12Array3 = new Class2_Sub12[2048];

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1324 = Static14.method2017("Connecting to update server");

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1322 = aClass36_1324;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1325 = Static14.method2017("Enter object name");

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1323 = aClass36_1325;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Lclient!gd;")
	public static Class22 aClass22_36 = new Class22(64);

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1326 = Static14.method2017("backtop1");

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	public static int anInt2712 = 0;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
	public static int anInt2714 = 0;

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "[I")
	public static int[] anIntArray329 = new int[500];

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1327 = Static14.method2017(" )2> ");

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1328 = null;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "Lclient!gd;")
	public static Class22 aClass22_37 = new Class22(500);

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public static void method1920() {
		aClass14_35 = null;
		aClass36_1323 = null;
		aClass2_Sub1_Sub4_Sub2_Sub2_3 = null;
		aClass22_37 = null;
		aClass2_Sub12Array3 = null;
		aClass36_1326 = null;
		aClass36_1322 = null;
		aClass14_34 = null;
		aClass36_1325 = null;
		aClass36_1328 = null;
		anIntArray329 = null;
		aClass36_1327 = null;
		aClass22_36 = null;
		aClass36_1324 = null;
		aClass3_24 = null;
		aClass22_35 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method1922() {
		Static35.aBoolean51 = true;
		Static93.aBoolean108 = true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
	public static void method1925(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static51.anIntArray317[arg0];
		@Pc(16) int local16 = Static57.anIntArray187[arg0];
		@Pc(20) int local20 = anIntArray329[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(28) int local28 = Static22.anIntArray38[arg0];
		if (Static32.anInt910 != 0 && local20 != 1006) {
			Static115.aBoolean77 = true;
			Static32.anInt910 = 0;
		}
		@Pc(49) Class36 local49;
		@Pc(54) int local54;
		if (local20 == 21) {
			local49 = Static90.aClass36Array40[arg0];
			local54 = local49.method1009(Static36.aClass36_489);
			if (local54 != -1) {
				if (Static78.anInt2037 == -1) {
					Static11.method220();
					if (Static41.anInt1077 != -1) {
						Static105.aClass36_1348 = local49.method1020(local54 + 5).method1014();
						Static66.aBoolean75 = false;
						Static15.anInt319 = Static78.anInt2037 = Static41.anInt1077;
					}
				} else {
					Static40.method1546(Static53.aClass36_700, 0, Static105.aClass36_1352);
				}
			}
		}
		@Pc(99) Class2_Sub1_Sub4_Sub2_Sub1 local99;
		if (local20 == 54) {
			local99 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local28];
			if (local99 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local99.anIntArray252[0], 2, local99.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static7.anInt193 = 2;
				Static15.anInt313 = Static90.anInt2349;
				Static40.anInt2190 = Static59.anInt1578;
				Static92.anInt2411 = 0;
				Static42.aClass2_Sub12_Sub1_1.method1422(210);
				Static42.aClass2_Sub12_Sub1_1.method1392(local28);
			}
		}
		if (local20 == 24) {
			Static42.aClass2_Sub12_Sub1_1.method1422(90);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28);
			Static42.aClass2_Sub12_Sub1_1.method1379(local16);
			Static42.aClass2_Sub12_Sub1_1.method1405(local12);
			Static104.anInt2700 = local16;
			Static85.anInt2207 = 0;
			Static69.anInt1750 = local12;
			Static20.anInt498 = 2;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 9) {
			local99 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local28];
			if (local99 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local99.anIntArray252[0], 2, local99.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static40.anInt2190 = Static59.anInt1578;
				Static15.anInt313 = Static90.anInt2349;
				Static92.anInt2411 = 0;
				Static7.anInt193 = 2;
				Static42.aClass2_Sub12_Sub1_1.method1422(199);
				Static42.aClass2_Sub12_Sub1_1.method1392(local28);
				Static42.aClass2_Sub12_Sub1_1.method1383(Static112.anInt2923);
				Static42.aClass2_Sub12_Sub1_1.method1403(Static81.anInt2064);
				Static42.aClass2_Sub12_Sub1_1.method1379(Static71.anInt1806);
			}
		}
		@Pc(282) Class2_Sub1_Sub4_Sub2_Sub2 local282;
		if (local20 == 17) {
			local282 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local28];
			if (local282 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local282.anIntArray252[0], 2, local282.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static7.anInt193 = 2;
				Static15.anInt313 = Static90.anInt2349;
				Static92.anInt2411 = 0;
				Static40.anInt2190 = Static59.anInt1578;
				Static42.aClass2_Sub12_Sub1_1.method1422(46);
				Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			}
		}
		@Pc(359) boolean local359;
		if (local20 == 22) {
			local359 = Static29.method623(0, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			if (!local359) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			}
			Static15.anInt313 = Static90.anInt2349;
			Static40.anInt2190 = Static59.anInt1578;
			Static92.anInt2411 = 0;
			Static7.anInt193 = 2;
			Static42.aClass2_Sub12_Sub1_1.method1422(101);
			Static42.aClass2_Sub12_Sub1_1.method1373(local16 + Static25.anInt632);
			Static42.aClass2_Sub12_Sub1_1.method1379(local12 + Static23.anInt592);
			Static42.aClass2_Sub12_Sub1_1.method1383(local28);
		}
		if (local20 == 48) {
			Static11.method220();
		}
		if (local20 == 49) {
			Static42.aClass2_Sub12_Sub1_1.method1422(252);
			Static42.aClass2_Sub12_Sub1_1.method1379(local28);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static112.anInt2923);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static71.anInt1806);
			Static42.aClass2_Sub12_Sub1_1.method1405(local12);
			Static42.aClass2_Sub12_Sub1_1.method1394(Static81.anInt2064);
			Static42.aClass2_Sub12_Sub1_1.method1379(local16);
			Static20.anInt498 = 2;
			Static69.anInt1750 = local12;
			Static104.anInt2700 = local16;
			Static85.anInt2207 = 0;
			if (Static78.anInt2037 == local12 >> 16) {
				Static20.anInt498 = 1;
			}
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
		}
		@Pc(489) Class2_Sub1_Sub6 local489;
		if (local20 == 20) {
			local489 = Static76.method1462(local16, local12);
			if (local489 != null) {
				Static27.method566();
				Static112.method2034(local16, Static89.method1638(Static67.method1163(local489)), local12);
				Static20.anInt500 = 0;
				Static100.aBoolean118 = true;
				aClass36_1328 = Static58.method1078(local489);
				if (aClass36_1328 == null) {
					aClass36_1328 = Static109.aClass36_1399;
				}
				if (local489.aBoolean27) {
					Static73.aClass36_890 = Static49.method949(new Class36[] { local489.aClass36_368, Static36.aClass36_489 });
				} else {
					Static73.aClass36_890 = Static49.method949(new Class36[] { Static20.aClass36_261, local489.aClass36_372, Static36.aClass36_489 });
				}
				if (Static88.anInt2320 == 16 && !local489.aBoolean27) {
					Static109.anInt2825 = 3;
					Static78.aBoolean85 = true;
					Static100.aBoolean118 = true;
				}
			}
			return;
		}
		if (local20 == 2) {
			Static42.aClass2_Sub12_Sub1_1.method1422(152);
			Static42.aClass2_Sub12_Sub1_1.method1383(local16);
			Static42.aClass2_Sub12_Sub1_1.method1403(local12);
			Static42.aClass2_Sub12_Sub1_1.method1392(local28);
			Static104.anInt2700 = local16;
			Static69.anInt1750 = local12;
			Static85.anInt2207 = 0;
			Static20.anInt498 = 2;
			if (Static78.anInt2037 == local12 >> 16) {
				Static20.anInt498 = 1;
			}
			if (local12 >> 16 == Static49.anInt1312) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 25) {
			local99 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local28];
			if (local99 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local99.anIntArray252[0], 2, local99.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static92.anInt2411 = 0;
				Static7.anInt193 = 2;
				Static40.anInt2190 = Static59.anInt1578;
				Static15.anInt313 = Static90.anInt2349;
				Static42.aClass2_Sub12_Sub1_1.method1422(150);
				Static42.aClass2_Sub12_Sub1_1.method1380(Static1.anInt5);
				Static42.aClass2_Sub12_Sub1_1.method1379(Static65.anInt1670);
				Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			}
		}
		if (local20 == 56) {
			Static27.method566();
			Static20.anInt500 = 1;
			Static112.anInt2923 = local16;
			Static71.anInt1806 = local28;
			Static100.aBoolean118 = true;
			Static81.anInt2064 = local12;
			Static78.aClass36_958 = Static49.method949(new Class36[] { Static96.aClass36_1235, Static43.method832(local28).aClass36_1397, Static36.aClass36_489 });
			if (Static78.aClass36_958 == null) {
				Static78.aClass36_958 = Static118.aClass36_1465;
			}
			return;
		}
		@Pc(756) int local756;
		if (local20 == 10 || local20 == 40) {
			local49 = Static90.aClass36Array40[arg0];
			local54 = local49.method1009(Static36.aClass36_489);
			if (local54 != -1) {
				local49 = local49.method1020(local54 + 5).method1014();
				@Pc(752) Class36 local752 = local49.method1026().method1017();
				@Pc(754) boolean local754 = false;
				for (local756 = 0; local756 < Static65.anInt1689; local756++) {
					@Pc(764) Class2_Sub1_Sub4_Sub2_Sub2 local764 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[Static99.anIntArray243[local756]];
					if (local764 != null && local764.aClass36_1027 != null && local764.aClass36_1027.method1024(local752)) {
						Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local764.anIntArray252[0], 2, local764.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
						if (local20 == 10) {
							Static42.aClass2_Sub12_Sub1_1.method1422(153);
							Static42.aClass2_Sub12_Sub1_1.method1379(Static99.anIntArray243[local756]);
						}
						if (local20 == 40) {
							Static42.aClass2_Sub12_Sub1_1.method1422(2);
							Static42.aClass2_Sub12_Sub1_1.method1379(Static99.anIntArray243[local756]);
						}
						local754 = true;
						break;
					}
				}
				if (!local754) {
					Static40.method1546(Static49.method949(new Class36[] { Static41.aClass36_537, local752 }), 0, Static105.aClass36_1352);
				}
			}
		}
		if (local20 == 1005) {
			local489 = Static71.method1274(local12);
			if (local489 == null || local489.anIntArray54[local16] < 100000) {
				Static42.aClass2_Sub12_Sub1_1.method1422(247);
				Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			} else {
				Static40.method1546(Static49.method949(new Class36[] { Static57.method1055(local489.anIntArray54[local16]), Static104.aClass36_1320, Static43.method832(local28).aClass36_1397 }), 0, Static105.aClass36_1352);
			}
			Static85.anInt2207 = 0;
			Static69.anInt1750 = local12;
			Static20.anInt498 = 2;
			Static104.anInt2700 = local16;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			if (local12 >> 16 == Static49.anInt1312) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 1003) {
			Static47.method915(local12, local16, local28);
			Static42.aClass2_Sub12_Sub1_1.method1422(73);
			Static42.aClass2_Sub12_Sub1_1.method1373(local16 + Static25.anInt632);
			Static42.aClass2_Sub12_Sub1_1.method1383(local28 >> 14 & 0x7FFF);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static23.anInt592 + local12);
		}
		if (local20 == 5) {
			local359 = Static29.method623(0, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			if (!local359) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			}
			Static40.anInt2190 = Static59.anInt1578;
			Static15.anInt313 = Static90.anInt2349;
			Static92.anInt2411 = 0;
			Static7.anInt193 = 2;
			Static42.aClass2_Sub12_Sub1_1.method1422(176);
			Static42.aClass2_Sub12_Sub1_1.method1379(local12 + Static23.anInt592);
			Static42.aClass2_Sub12_Sub1_1.method1379(local28);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static25.anInt632 + local16);
		}
		if (local20 == 38 && Static47.method915(local12, local16, local28)) {
			Static42.aClass2_Sub12_Sub1_1.method1422(193);
			Static42.aClass2_Sub12_Sub1_1.method1380(Static81.anInt2064);
			Static42.aClass2_Sub12_Sub1_1.method1379(local28 >> 14 & 0x7FFF);
			Static42.aClass2_Sub12_Sub1_1.method1383(local12 + Static23.anInt592);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static25.anInt632 + local16);
			Static42.aClass2_Sub12_Sub1_1.method1373(Static71.anInt1806);
			Static42.aClass2_Sub12_Sub1_1.method1373(Static112.anInt2923);
		}
		if (local20 == 16) {
			Static71.method1275(Static39.anInt980);
			Static39.anInt980 = -1;
			Static115.aBoolean77 = true;
		}
		if (local20 == 43) {
			Static42.aClass2_Sub12_Sub1_1.method1422(160);
			Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			Static42.aClass2_Sub12_Sub1_1.method1373(local16);
			Static42.aClass2_Sub12_Sub1_1.method1394(local12);
			Static104.anInt2700 = local16;
			Static69.anInt1750 = local12;
			Static20.anInt498 = 2;
			Static85.anInt2207 = 0;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
		}
		@Pc(1205) long local1205;
		if (local20 == 44) {
			local49 = Static90.aClass36Array40[arg0];
			local54 = local49.method1009(Static36.aClass36_489);
			if (local54 != -1) {
				local1205 = local49.method1020(local54 + 5).method1014().method1021();
				local756 = -1;
				for (@Pc(1209) int local1209 = 0; local1209 < Static7.anInt189; local1209++) {
					if (local1205 == Static24.aLongArray2[local1209]) {
						local756 = local1209;
						break;
					}
				}
				if (local756 != -1 && Static36.anIntArray130[local756] > 0) {
					Static115.aBoolean77 = true;
					Static105.aClass36_1347 = Static105.aClass36_1352;
					Static23.anInt594 = 3;
					Static32.anInt910 = 0;
					Static16.aBoolean8 = true;
					Static118.aLong90 = Static24.aLongArray2[local756];
					Static105.aClass36_1343 = Static49.method949(new Class36[] { Static59.aClass36_760, Static43.aClass36Array21[local756] });
				}
			}
		}
		if (local20 == 32) {
			local282 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local28];
			if (local282 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local282.anIntArray252[0], 2, local282.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static92.anInt2411 = 0;
				Static7.anInt193 = 2;
				Static40.anInt2190 = Static59.anInt1578;
				Static15.anInt313 = Static90.anInt2349;
				Static42.aClass2_Sub12_Sub1_1.method1422(2);
				Static42.aClass2_Sub12_Sub1_1.method1379(local28);
			}
		}
		if (local20 == 29) {
			Static47.method915(local12, local16, local28);
			Static42.aClass2_Sub12_Sub1_1.method1422(61);
			Static42.aClass2_Sub12_Sub1_1.method1373(local16 + Static25.anInt632);
			Static42.aClass2_Sub12_Sub1_1.method1383(local12 + Static23.anInt592);
			Static42.aClass2_Sub12_Sub1_1.method1392(local28 >> 14 & 0x7FFF);
		}
		if (local20 == 57) {
			Static47.method915(local12, local16, local28);
			Static42.aClass2_Sub12_Sub1_1.method1422(78);
			Static42.aClass2_Sub12_Sub1_1.method1373(Static25.anInt632 + local16);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28 >> 14 & 0x7FFF);
			Static42.aClass2_Sub12_Sub1_1.method1379(Static23.anInt592 + local12);
		}
		if (local20 == 14) {
			Static42.aClass2_Sub12_Sub1_1.method1422(9);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static65.anInt1670);
			Static42.aClass2_Sub12_Sub1_1.method1405(Static1.anInt5);
			Static42.aClass2_Sub12_Sub1_1.method1392(local16);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28);
			Static42.aClass2_Sub12_Sub1_1.method1380(local12);
			Static20.anInt498 = 2;
			Static104.anInt2700 = local16;
			Static85.anInt2207 = 0;
			Static69.anInt1750 = local12;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			if (local12 >> 16 == Static49.anInt1312) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 13) {
			local282 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local28];
			if (local282 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local282.anIntArray252[0], 2, local282.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static40.anInt2190 = Static59.anInt1578;
				Static7.anInt193 = 2;
				Static92.anInt2411 = 0;
				Static15.anInt313 = Static90.anInt2349;
				Static42.aClass2_Sub12_Sub1_1.method1422(229);
				Static42.aClass2_Sub12_Sub1_1.method1383(Static112.anInt2923);
				Static42.aClass2_Sub12_Sub1_1.method1403(Static81.anInt2064);
				Static42.aClass2_Sub12_Sub1_1.method1392(Static71.anInt1806);
				Static42.aClass2_Sub12_Sub1_1.method1392(local28);
			}
		}
		if (local20 == 19) {
			Static42.aClass2_Sub12_Sub1_1.method1422(108);
			Static42.aClass2_Sub12_Sub1_1.method1379(local28);
			Static42.aClass2_Sub12_Sub1_1.method1392(local16);
			Static42.aClass2_Sub12_Sub1_1.method1403(local12);
			Static20.anInt498 = 2;
			if (Static78.anInt2037 == local12 >> 16) {
				Static20.anInt498 = 1;
			}
			Static104.anInt2700 = local16;
			Static85.anInt2207 = 0;
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
			Static69.anInt1750 = local12;
		}
		if (local20 == 26) {
			local99 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local28];
			if (local99 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local99.anIntArray252[0], 2, local99.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static40.anInt2190 = Static59.anInt1578;
				Static92.anInt2411 = 0;
				Static7.anInt193 = 2;
				Static15.anInt313 = Static90.anInt2349;
				Static42.aClass2_Sub12_Sub1_1.method1422(97);
				Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			}
		}
		if (local20 == 27) {
			Static42.aClass2_Sub12_Sub1_1.method1422(76);
			Static42.aClass2_Sub12_Sub1_1.method1379(local28);
			Static42.aClass2_Sub12_Sub1_1.method1403(local12);
			Static42.aClass2_Sub12_Sub1_1.method1383(local16);
			Static85.anInt2207 = 0;
			Static104.anInt2700 = local16;
			Static69.anInt1750 = local12;
			Static20.anInt498 = 2;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			if (local12 >> 16 == Static49.anInt1312) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 46) {
			Static42.aClass2_Sub12_Sub1_1.method1422(254);
			Static42.aClass2_Sub12_Sub1_1.method1394(local12);
			local489 = Static71.method1274(local12);
			if (local489.anIntArrayArray8 != null && local489.anIntArrayArray8[0][0] == 5) {
				local54 = local489.anIntArrayArray8[0][1];
				Static4.anIntArray14[local54] = 1 - Static4.anIntArray14[local54];
				Static73.method1299(local54);
				Static100.aBoolean118 = true;
			}
		}
		if (local20 == 23) {
			Static47.method915(local12, local16, local28);
			Static42.aClass2_Sub12_Sub1_1.method1422(203);
			Static42.aClass2_Sub12_Sub1_1.method1373(local12 + Static23.anInt592);
			Static42.aClass2_Sub12_Sub1_1.method1392(local28 >> 14 & 0x7FFF);
			Static42.aClass2_Sub12_Sub1_1.method1379(local16 + Static25.anInt632);
		}
		if (local20 == 51) {
			local99 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local28];
			if (local99 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local99.anIntArray252[0], 2, local99.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static92.anInt2411 = 0;
				Static40.anInt2190 = Static59.anInt1578;
				Static15.anInt313 = Static90.anInt2349;
				Static7.anInt193 = 2;
				Static42.aClass2_Sub12_Sub1_1.method1422(44);
				Static42.aClass2_Sub12_Sub1_1.method1373(local28);
			}
		}
		if (local20 == 52 && Static80.anInt2060 == -1) {
			Static10.method211(local12, local16);
			Static105.anInt2731 = local16;
			Static80.anInt2060 = local12;
		}
		if (local20 == 6) {
			local359 = Static29.method623(0, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			if (!local359) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			}
			Static15.anInt313 = Static90.anInt2349;
			Static92.anInt2411 = 0;
			Static7.anInt193 = 2;
			Static40.anInt2190 = Static59.anInt1578;
			Static42.aClass2_Sub12_Sub1_1.method1422(186);
			Static42.aClass2_Sub12_Sub1_1.method1373(local12 + Static23.anInt592);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static65.anInt1670);
			Static42.aClass2_Sub12_Sub1_1.method1380(Static1.anInt5);
			Static42.aClass2_Sub12_Sub1_1.method1379(local28);
			Static42.aClass2_Sub12_Sub1_1.method1392(local16 + Static25.anInt632);
		}
		if (local20 == 11 || local20 == 3 || local20 == 50 || local20 == 28) {
			local49 = Static90.aClass36Array40[arg0];
			local54 = local49.method1009(Static36.aClass36_489);
			if (local54 != -1) {
				local1205 = local49.method1020(local54 + 5).method1014().method1021();
				if (local20 == 11) {
					Static77.method1467(local1205);
				}
				if (local20 == 3) {
					Static59.method1101(local1205);
				}
				if (local20 == 50) {
					Static7.method170(local1205);
				}
				if (local20 == 28) {
					Static11.method221(local1205);
				}
			}
		}
		if (local20 == 12) {
			Static42.aClass2_Sub12_Sub1_1.method1422(254);
			Static42.aClass2_Sub12_Sub1_1.method1394(local12);
			local489 = Static71.method1274(local12);
			if (local489.anIntArrayArray8 != null && local489.anIntArrayArray8[0][0] == 5) {
				local54 = local489.anIntArrayArray8[0][1];
				if (Static4.anIntArray14[local54] != local489.anIntArray55[0]) {
					Static4.anIntArray14[local54] = local489.anIntArray55[0];
					Static73.method1299(local54);
					Static100.aBoolean118 = true;
				}
			}
		}
		if (local20 == 31) {
			local359 = Static29.method623(0, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			if (!local359) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			}
			Static7.anInt193 = 2;
			Static92.anInt2411 = 0;
			Static40.anInt2190 = Static59.anInt1578;
			Static15.anInt313 = Static90.anInt2349;
			Static42.aClass2_Sub12_Sub1_1.method1422(119);
			Static42.aClass2_Sub12_Sub1_1.method1379(Static25.anInt632 + local16);
			Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static23.anInt592 + local12);
		}
		if (local20 == 30) {
			local359 = Static29.method623(0, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			if (!local359) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			}
			Static92.anInt2411 = 0;
			Static7.anInt193 = 2;
			Static40.anInt2190 = Static59.anInt1578;
			Static15.anInt313 = Static90.anInt2349;
			Static42.aClass2_Sub12_Sub1_1.method1422(147);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static25.anInt632 + local16);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static23.anInt592 + local12);
			Static42.aClass2_Sub12_Sub1_1.method1392(local28);
		}
		if (local20 == 37) {
			Static42.aClass2_Sub12_Sub1_1.method1422(246);
			Static42.aClass2_Sub12_Sub1_1.method1405(local12);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28);
			Static42.aClass2_Sub12_Sub1_1.method1373(local16);
			Static104.anInt2700 = local16;
			Static20.anInt498 = 2;
			Static69.anInt1750 = local12;
			Static85.anInt2207 = 0;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 1) {
			Static42.aClass2_Sub12_Sub1_1.method1422(81);
			Static42.aClass2_Sub12_Sub1_1.method1394(local12);
			Static42.aClass2_Sub12_Sub1_1.method1405(Static1.anInt5);
			Static42.aClass2_Sub12_Sub1_1.method1383(local16);
			Static42.aClass2_Sub12_Sub1_1.method1373(Static65.anInt1670);
		}
		if (local20 == 18) {
			if (Static73.aBoolean82) {
				Static85.aClass61_1.method1718(local16 - 4, local12 + -4);
			} else {
				Static85.aClass61_1.method1718(Static59.anInt1578 - 4, Static90.anInt2349 + -4);
			}
		}
		if (local20 == 1002) {
			Static40.anInt2190 = Static59.anInt1578;
			Static15.anInt313 = Static90.anInt2349;
			Static7.anInt193 = 2;
			Static92.anInt2411 = 0;
			local99 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local28];
			if (local99 != null) {
				@Pc(2347) Class2_Sub1_Sub9 local2347 = local99.aClass2_Sub1_Sub9_1;
				if (local2347.anIntArray192 != null) {
					local2347 = local2347.method1071();
				}
				if (local2347 != null) {
					Static42.aClass2_Sub12_Sub1_1.method1422(248);
					Static42.aClass2_Sub12_Sub1_1.method1379(local2347.anInt1546);
				}
			}
		}
		if (local20 == 15) {
			Static42.aClass2_Sub12_Sub1_1.method1422(121);
			Static42.aClass2_Sub12_Sub1_1.method1380(local12);
			Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			Static42.aClass2_Sub12_Sub1_1.method1383(local16);
			Static85.anInt2207 = 0;
			Static69.anInt1750 = local12;
			Static20.anInt498 = 2;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			Static104.anInt2700 = local16;
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 33) {
			local489 = Static71.method1274(local12);
			@Pc(2423) boolean local2423 = true;
			if (local489.anInt694 > 0) {
				local2423 = Static60.method1109(local489);
			}
			if (local2423) {
				Static42.aClass2_Sub12_Sub1_1.method1422(254);
				Static42.aClass2_Sub12_Sub1_1.method1394(local12);
			}
		}
		if (local20 == 39) {
			Static47.method915(local12, local16, local28);
			Static42.aClass2_Sub12_Sub1_1.method1422(47);
			Static42.aClass2_Sub12_Sub1_1.method1383(local12 + Static23.anInt592);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static25.anInt632 + local16);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28 >> 14 & 0x7FFF);
		}
		if (local20 == 8) {
			Static42.aClass2_Sub12_Sub1_1.method1422(63);
			Static42.aClass2_Sub12_Sub1_1.method1405(local12);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28);
			Static42.aClass2_Sub12_Sub1_1.method1373(local16);
			Static85.anInt2207 = 0;
			Static20.anInt498 = 2;
			Static69.anInt1750 = local12;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			Static104.anInt2700 = local16;
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 35 && Static47.method915(local12, local16, local28)) {
			Static42.aClass2_Sub12_Sub1_1.method1422(86);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static23.anInt592 + local12);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static65.anInt1670);
			Static42.aClass2_Sub12_Sub1_1.method1403(Static1.anInt5);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28 >> 14 & 0x7FFF);
			Static42.aClass2_Sub12_Sub1_1.method1379(Static25.anInt632 + local16);
		}
		if (local20 == 45) {
			Static111.method2004(local28, local16, local12);
		}
		if (local20 == 7) {
			local282 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local28];
			if (local282 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local282.anIntArray252[0], 2, local282.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static92.anInt2411 = 0;
				Static7.anInt193 = 2;
				Static15.anInt313 = Static90.anInt2349;
				Static40.anInt2190 = Static59.anInt1578;
				Static42.aClass2_Sub12_Sub1_1.method1422(161);
				Static42.aClass2_Sub12_Sub1_1.method1373(local28);
			}
		}
		if (local20 == 58) {
			local99 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local28];
			if (local99 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local99.anIntArray252[0], 2, local99.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static15.anInt313 = Static90.anInt2349;
				Static7.anInt193 = 2;
				Static40.anInt2190 = Static59.anInt1578;
				Static92.anInt2411 = 0;
				Static42.aClass2_Sub12_Sub1_1.method1422(69);
				Static42.aClass2_Sub12_Sub1_1.method1373(local28);
			}
		}
		if (local20 == 34) {
			local359 = Static29.method623(0, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			if (!local359) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			}
			Static92.anInt2411 = 0;
			Static40.anInt2190 = Static59.anInt1578;
			Static7.anInt193 = 2;
			Static15.anInt313 = Static90.anInt2349;
			Static42.aClass2_Sub12_Sub1_1.method1422(70);
			Static42.aClass2_Sub12_Sub1_1.method1379(local12 + Static23.anInt592);
			Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			Static42.aClass2_Sub12_Sub1_1.method1379(local16 + Static25.anInt632);
		}
		if (local20 == 55) {
			Static42.aClass2_Sub12_Sub1_1.method1422(173);
			Static42.aClass2_Sub12_Sub1_1.method1383(local16);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28);
			Static42.aClass2_Sub12_Sub1_1.method1380(local12);
			Static85.anInt2207 = 0;
			Static104.anInt2700 = local16;
			Static69.anInt1750 = local12;
			Static20.anInt498 = 2;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 1001) {
			Static7.anInt193 = 2;
			Static15.anInt313 = Static90.anInt2349;
			Static92.anInt2411 = 0;
			Static40.anInt2190 = Static59.anInt1578;
			Static42.aClass2_Sub12_Sub1_1.method1422(247);
			Static42.aClass2_Sub12_Sub1_1.method1383(local28);
		}
		if (local20 == 36) {
			local282 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local28];
			if (local282 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local282.anIntArray252[0], 2, local282.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static92.anInt2411 = 0;
				Static7.anInt193 = 2;
				Static40.anInt2190 = Static59.anInt1578;
				Static15.anInt313 = Static90.anInt2349;
				Static42.aClass2_Sub12_Sub1_1.method1422(153);
				Static42.aClass2_Sub12_Sub1_1.method1379(local28);
			}
		}
		if (local20 == 42) {
			local282 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local28];
			if (local282 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local282.anIntArray252[0], 2, local282.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static40.anInt2190 = Static59.anInt1578;
				Static15.anInt313 = Static90.anInt2349;
				Static92.anInt2411 = 0;
				Static7.anInt193 = 2;
				Static42.aClass2_Sub12_Sub1_1.method1422(113);
				Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			}
		}
		if (local20 == 47) {
			local359 = Static29.method623(0, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			if (!local359) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local16, 2, local12, 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			}
			Static15.anInt313 = Static90.anInt2349;
			Static7.anInt193 = 2;
			Static92.anInt2411 = 0;
			Static40.anInt2190 = Static59.anInt1578;
			Static42.aClass2_Sub12_Sub1_1.method1422(23);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static25.anInt632 + local16);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static112.anInt2923);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static23.anInt592 + local12);
			Static42.aClass2_Sub12_Sub1_1.method1405(Static81.anInt2064);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static71.anInt1806);
			Static42.aClass2_Sub12_Sub1_1.method1379(local28);
		}
		if (local20 == 41) {
			local282 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local28];
			if (local282 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local282.anIntArray252[0], 2, local282.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static15.anInt313 = Static90.anInt2349;
				Static92.anInt2411 = 0;
				Static7.anInt193 = 2;
				Static40.anInt2190 = Static59.anInt1578;
				Static42.aClass2_Sub12_Sub1_1.method1422(189);
				Static42.aClass2_Sub12_Sub1_1.method1379(local28);
				Static42.aClass2_Sub12_Sub1_1.method1403(Static1.anInt5);
				Static42.aClass2_Sub12_Sub1_1.method1373(Static65.anInt1670);
			}
		}
		if (local20 == 53) {
			local99 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local28];
			if (local99 != null) {
				Static29.method623(1, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 1, local99.anIntArray252[0], 2, local99.anIntArray258[0], 0, false, 0, aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
				Static40.anInt2190 = Static59.anInt1578;
				Static92.anInt2411 = 0;
				Static15.anInt313 = Static90.anInt2349;
				Static7.anInt193 = 2;
				Static42.aClass2_Sub12_Sub1_1.method1422(94);
				Static42.aClass2_Sub12_Sub1_1.method1383(local28);
			}
		}
		if (local20 == 4) {
			Static42.aClass2_Sub12_Sub1_1.method1422(184);
			Static42.aClass2_Sub12_Sub1_1.method1379(local28);
			Static42.aClass2_Sub12_Sub1_1.method1379(local16);
			Static42.aClass2_Sub12_Sub1_1.method1380(local12);
			Static104.anInt2700 = local16;
			Static20.anInt498 = 2;
			Static69.anInt1750 = local12;
			if (local12 >> 16 == Static78.anInt2037) {
				Static20.anInt498 = 1;
			}
			Static85.anInt2207 = 0;
			if (Static49.anInt1312 == local12 >> 16) {
				Static20.anInt498 = 3;
			}
		}
		if (local20 == 1004) {
			Static7.anInt193 = 2;
			Static92.anInt2411 = 0;
			Static40.anInt2190 = Static59.anInt1578;
			Static15.anInt313 = Static90.anInt2349;
			Static42.aClass2_Sub12_Sub1_1.method1422(135);
			Static42.aClass2_Sub12_Sub1_1.method1373(local28 >> 14 & 0x7FFF);
		}
		if (Static20.anInt500 != 0) {
			Static20.anInt500 = 0;
			Static100.aBoolean118 = true;
		}
		if (Static56.aBoolean70) {
			Static27.method566();
			Static100.aBoolean118 = true;
		}
	}
}
