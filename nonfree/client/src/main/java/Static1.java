import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_6;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "J")
	public static long aLong78;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!u;")
	private static Class74 aClass74_1406 = Static72.method1077("Login");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_1396 = aClass74_1406;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!u;")
	public static Class74 aClass74_1397 = Static72.method1077(" ");

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!u;")
	private static Class74 aClass74_1403 = Static72.method1077("Players");

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_1398 = aClass74_1403;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!u;")
	private static Class74 aClass74_1404 = Static72.method1077("K");

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_1399 = aClass74_1404;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_1400 = Static72.method1077(" loggt sich aus)3");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_1401 = Static72.method1077("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!u;")
	private static Class74 aClass74_1402 = Static72.method1077("Public chat");

	@OriginalMember(owner = "client!a", name = "j", descriptor = "[I")
	public static int[] anIntArray306 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	public static int anInt2101 = 0;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_1405 = aClass74_1404;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
	public static int[] anIntArray307 = new int[50];

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
	public static final boolean aBoolean85 = false;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Lclient!u;")
	public static Class74 aClass74_1407 = Static72.method1077("invback");

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_1408 = aClass74_1402;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method1458() {
		for (@Pc(3) int local3 = 0; local3 < Static107.anInt2342; local3++) {
			@Pc(9) int local9 = Static81.anIntArray255[local3];
			@Pc(13) Class2_Sub2_Sub2_Sub1_Sub1 local13 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = Static19.aClass2_Sub10_Sub1_1.method1514();
			@Pc(25) int local25;
			@Pc(34) int local34;
			if ((local17 & 0x40) != 0) {
				local25 = Static19.aClass2_Sub10_Sub1_1.method1506();
				if (local25 == 65535) {
					local25 = -1;
				}
				local34 = Static19.aClass2_Sub10_Sub1_1.method1514();
				if (local25 == local13.anInt2670 && local25 != -1) {
					@Pc(50) int local50 = Static12.method270(local25).anInt1528;
					if (local50 == 1) {
						local13.anInt2677 = 0;
						local13.anInt2719 = 0;
						local13.anInt2690 = 0;
						local13.anInt2675 = local34;
					}
					if (local50 == 2) {
						local13.anInt2719 = 0;
					}
				} else if (local25 == -1 || local13.anInt2670 == -1 || Static12.method270(local25).anInt1527 >= Static12.method270(local13.anInt2670).anInt1527) {
					local13.anInt2670 = local25;
					local13.anInt2690 = 0;
					local13.anInt2677 = 0;
					local13.anInt2684 = local13.anInt2691;
					local13.anInt2719 = 0;
					local13.anInt2675 = local34;
				}
			}
			if ((local17 & 0x1) != 0) {
				local13.aClass2_Sub2_Sub9_1 = Static8.method168(Static19.aClass2_Sub10_Sub1_1.method1525());
				local13.anInt2703 = local13.aClass2_Sub2_Sub9_1.anInt1103;
				local13.anInt2692 = local13.aClass2_Sub2_Sub9_1.anInt1082;
				local13.anInt2707 = local13.aClass2_Sub2_Sub9_1.anInt1087;
				local13.anInt2708 = local13.aClass2_Sub2_Sub9_1.anInt1080;
				local13.anInt2697 = local13.aClass2_Sub2_Sub9_1.anInt1078;
				local13.anInt2688 = local13.aClass2_Sub2_Sub9_1.anInt1101;
				local13.anInt2722 = local13.aClass2_Sub2_Sub9_1.anInt1110;
				local13.anInt2682 = local13.aClass2_Sub2_Sub9_1.anInt1095;
				local13.anInt2693 = local13.aClass2_Sub2_Sub9_1.anInt1100;
			}
			if ((local17 & 0x10) != 0) {
				local25 = Static19.aClass2_Sub10_Sub1_1.method1503();
				local34 = Static19.aClass2_Sub10_Sub1_1.method1503();
				local13.method1862(local25, local34, Static107.anInt2338);
				local13.anInt2667 = Static107.anInt2338 + 300;
				local13.anInt2694 = Static19.aClass2_Sub10_Sub1_1.method1503();
				local13.anInt2671 = Static19.aClass2_Sub10_Sub1_1.method1503();
			}
			if ((local17 & 0x80) != 0) {
				local13.anInt2717 = Static19.aClass2_Sub10_Sub1_1.method1525();
				if (local13.anInt2717 == 65535) {
					local13.anInt2717 = -1;
				}
			}
			if ((local17 & 0x2) != 0) {
				local13.aClass74_1657 = Static19.aClass2_Sub10_Sub1_1.method1530();
				local13.anInt2687 = 100;
			}
			if ((local17 & 0x20) != 0) {
				local13.anInt2660 = Static19.aClass2_Sub10_Sub1_1.method1525();
				local25 = Static19.aClass2_Sub10_Sub1_1.method1498();
				if (local13.anInt2660 == 65535) {
					local13.anInt2660 = -1;
				}
				local13.anInt2685 = local25 >> 16;
				local13.anInt2689 = (local25 & 0xFFFF) + Static107.anInt2338;
				local13.anInt2715 = 0;
				local13.anInt2696 = 0;
				if (Static107.anInt2338 < local13.anInt2689) {
					local13.anInt2696 = -1;
				}
			}
			if ((local17 & 0x8) != 0) {
				local25 = Static19.aClass2_Sub10_Sub1_1.method1518();
				local34 = Static19.aClass2_Sub10_Sub1_1.method1490();
				local13.method1862(local25, local34, Static107.anInt2338);
				local13.anInt2667 = Static107.anInt2338 + 300;
				local13.anInt2694 = Static19.aClass2_Sub10_Sub1_1.method1503();
				local13.anInt2671 = Static19.aClass2_Sub10_Sub1_1.method1503();
			}
			if ((local17 & 0x4) != 0) {
				local13.anInt2664 = Static19.aClass2_Sub10_Sub1_1.method1517();
				local13.anInt2713 = Static19.aClass2_Sub10_Sub1_1.method1525();
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!jc;)V")
	public static void method1459(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static98.aBoolean87) {
			method1461(arg0);
			return;
		}
		if (Static41.anInt973 == 1 && Static120.anInt2565 >= 715 && Static15.anInt442 >= 453) {
			Static4.aBoolean6 = !Static4.aBoolean6;
			if (Static4.aBoolean6) {
				Static87.method926();
			} else {
				Static43.method686(Static49.aClass74_843, Static14.aClass74_398, Static35.aClass26_Sub1_77);
			}
		}
		if (Static68.anInt1490 == 5) {
			return;
		}
		Static36.anInt875++;
		if (Static68.anInt1490 != 10) {
			return;
		}
		if (Static54.anInt1321 != 2 && Static95.anInt2095 == 0) {
			if (Static41.anInt973 == 1 && Static120.anInt2565 >= 5 && Static120.anInt2565 <= 105 && Static15.anInt442 >= 463 && Static15.anInt442 <= 498) {
				Static92.method1349();
				return;
			}
			if (Static23.aClass57_1 != null) {
				Static92.method1349();
			}
		}
		@Pc(117) int local117 = Static41.anInt973;
		@Pc(119) int local119 = Static120.anInt2565;
		@Pc(121) int local121 = Static15.anInt442;
		if (Static31.anInt791 == 0) {
			if (local117 == 1 && local119 >= 227 && local119 <= 377 && local121 >= 271 && local121 <= 311) {
				Static31.anInt791 = 3;
				Static120.anInt2555 = 0;
			}
			if (local117 == 1 && local119 >= 387 && local119 <= 537 && local121 >= 271 && local121 <= 311) {
				Static49.aClass74_851 = Static10.aClass74_274;
				Static49.aClass74_847 = Static89.aClass74_1291;
				Static31.anInt791 = 2;
				Static120.anInt2555 = 0;
				Static49.aClass74_849 = Static10.aClass74_283;
				return;
			}
		} else if (Static31.anInt791 == 2) {
			@Pc(263) short local263 = 231;
			@Pc(264) int local264 = local263 + 30;
			if (local117 == 1 && local121 >= 246 && local121 < 261) {
				Static120.anInt2555 = 0;
			}
			local264 += 15;
			if (local117 == 1 && local121 >= 261 && local121 < 276) {
				Static120.anInt2555 = 1;
			}
			local264 += 15;
			if (local117 == 1 && local119 >= 227 && local119 <= 377 && local121 >= 301 && local121 <= 341) {
				Static49.aClass74_842 = Static49.aClass74_842.method1709().method1720();
				if (Static49.aClass74_842.method1695() == 0) {
					Static52.method874(Static91.aClass74_1303, Static10.aClass74_267, Static10.aClass74_272);
					return;
				}
				if (Static49.aClass74_853.method1695() == 0) {
					Static52.method874(Static72.aClass74_1101, Static10.aClass74_253, Static10.aClass74_284);
					return;
				}
				Static52.method874(Static117.aClass74_1586, Static10.aClass74_273, Static10.aClass74_293);
				Static106.method1597(20);
				return;
			}
			if (local117 == 1 && local119 >= 387 && local119 <= 537 && local121 >= 301 && local121 <= 341) {
				Static49.aClass74_853 = Static49.aClass74_843;
				Static31.anInt791 = 0;
				Static49.aClass74_842 = Static49.aClass74_843;
			}
			while (true) {
				while (Static103.method1588()) {
					@Pc(432) boolean local432 = false;
					for (@Pc(434) int local434 = 0; local434 < Static71.aClass74_1094.method1695(); local434++) {
						if (Static27.anInt676 == Static71.aClass74_1094.method1703(local434)) {
							local432 = true;
							break;
						}
					}
					if (Static120.anInt2555 == 0) {
						if (Static39.anInt951 == 85 && Static49.aClass74_842.method1695() > 0) {
							Static49.aClass74_842 = Static49.aClass74_842.method1706(0, Static49.aClass74_842.method1695() - 1);
						}
						if (Static39.anInt951 == 84 || Static39.anInt951 == 80) {
							Static120.anInt2555 = 1;
						}
						if (local432 && Static49.aClass74_842.method1695() < 12) {
							Static49.aClass74_842 = Static49.aClass74_842.method1702(Static27.anInt676);
						}
					} else if (Static120.anInt2555 == 1) {
						if (Static39.anInt951 == 85 && Static49.aClass74_853.method1695() > 0) {
							Static49.aClass74_853 = Static49.aClass74_853.method1706(0, Static49.aClass74_853.method1695() - 1);
						}
						if (Static39.anInt951 == 84 || Static39.anInt951 == 80) {
							Static120.anInt2555 = 0;
						}
						if (local432 && Static49.aClass74_853.method1695() < 20) {
							Static49.aClass74_853 = Static49.aClass74_853.method1702(Static27.anInt676);
						}
					}
				}
				return;
			}
		} else if (Static31.anInt791 == 3 && local117 == 1 && local119 >= 307 && local119 <= 457 && local121 >= 301 && local121 <= 341) {
			Static31.anInt791 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!g;Lclient!g;ILclient!g;)V")
	public static void method1460(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) Class26 arg2) {
		Static29.aClass26_4 = arg1;
		Static78.aClass26_18 = arg0;
		Static89.aClass26_22 = arg2;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!jc;)V")
	private static void method1461(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static41.anInt973 != 1) {
			return;
		}
		if (Static120.anInt2565 >= 280 && Static120.anInt2565 <= 294 && Static15.anInt442 >= 4 && Static15.anInt442 <= 18) {
			Static18.method407(0, 0);
			return;
		}
		if (Static120.anInt2565 >= 295 && Static120.anInt2565 <= 360 && Static15.anInt442 >= 4 && Static15.anInt442 <= 18) {
			Static18.method407(1, 0);
			return;
		}
		if (Static120.anInt2565 >= 390 && Static120.anInt2565 <= 404 && Static15.anInt442 >= 4 && Static15.anInt442 <= 18) {
			Static18.method407(0, 1);
			return;
		}
		if (Static120.anInt2565 >= 405 && Static120.anInt2565 <= 470 && Static15.anInt442 >= 4 && Static15.anInt442 <= 18) {
			Static18.method407(1, 1);
			return;
		}
		if (Static120.anInt2565 >= 500 && Static120.anInt2565 <= 514 && Static15.anInt442 >= 4 && Static15.anInt442 <= 18) {
			Static18.method407(0, 2);
			return;
		}
		if (Static120.anInt2565 >= 515 && Static120.anInt2565 <= 580 && Static15.anInt442 >= 4 && Static15.anInt442 <= 18) {
			Static18.method407(1, 2);
			return;
		}
		if (Static120.anInt2565 >= 610 && Static120.anInt2565 <= 624 && Static15.anInt442 >= 4 && Static15.anInt442 <= 18) {
			Static18.method407(0, 3);
			return;
		}
		if (Static120.anInt2565 >= 625 && Static120.anInt2565 <= 690 && Static15.anInt442 >= 4 && Static15.anInt442 <= 18) {
			Static18.method407(1, 3);
			return;
		}
		if (Static120.anInt2565 >= 708 && Static15.anInt442 >= 4 && Static120.anInt2565 <= 758 && Static15.anInt442 <= 20) {
			Static98.aBoolean87 = false;
			Static109.aClass2_Sub2_Sub1_Sub2_7.method207(0, 0);
			Static62.aClass2_Sub2_Sub1_Sub2_2.method207(382, 0);
			Static24.aClass2_Sub2_Sub1_Sub1_15.method97(382 - Static24.aClass2_Sub2_Sub1_Sub1_15.anInt116 / 2, 18);
			return;
		}
		if (Static100.anInt2217 == -1) {
			return;
		}
		@Pc(276) Class32 local276 = Static83.aClass32Array1[Static100.anInt2217];
		if (local276.aBoolean38 == aBoolean86) {
			@Pc(300) byte[] local300 = Static91.method1340(new Class74[] { local276.aClass74_712, Static54.aClass74_937 }).method1725();
			Static88.aString4 = new String(local300, 0, local300.length);
			Static98.aBoolean87 = false;
			Static45.anInt1033 = local276.anInt988;
			if (Static37.anInt1938 != 0) {
				Static53.anInt1292 = 43594;
				Static109.anInt2397 = 43594;
				Static37.anInt1938 = 0;
				Static8.anInt252 = 443;
			}
			Static109.aClass2_Sub2_Sub1_Sub2_7.method207(0, 0);
			Static62.aClass2_Sub2_Sub1_Sub2_2.method207(382, 0);
			Static24.aClass2_Sub2_Sub1_Sub1_15.method97(382 - Static24.aClass2_Sub2_Sub1_Sub1_15.anInt116 / 2, 18);
			return;
		}
		@Pc(398) Class74 local398 = Static91.method1340(new Class74[] { Static15.aClass74_405, local276.aClass74_712, Static54.aClass74_937, Static97.aClass74_1727, Static19.aClass74_451, Static56.method940(Static84.aBoolean73 ? 1 : 0), Static106.aClass74_1493, Static56.method940(Static54.anInt1321), Static34.aClass74_625, Static56.method940(Static36.anInt866) });
		try {
			arg0.getAppletContext().showDocument(local398.method1711(), "_self");
			return;
		} catch (@Pc(407) Exception local407) {
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method1462() {
		aClass74_1399 = null;
		aClass74_1398 = null;
		anIntArray307 = null;
		aClass74_1406 = null;
		aByteArrayArray7 = null;
		aClass74_1404 = null;
		aClass74_1396 = null;
		anIntArray306 = null;
		aClass74_1400 = null;
		aClass74_1408 = null;
		aClass74_1402 = null;
		aClass74_1397 = null;
		aClass74_1401 = null;
		aClass74_1405 = null;
		aClass2_Sub2_Sub1_Sub2_6 = null;
		aClass74_1403 = null;
		aClass74_1407 = null;
	}
}
