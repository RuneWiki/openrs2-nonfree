import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public static int anInt630;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_6;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!lb;")
	public static Class5_Sub2_Sub2 aClass5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] aClass5_Sub1_Sub10_Sub3Array4;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!vc;")
	public static Class71 aClass71_354 = Static38.method736("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!vc;")
	private static Class71 aClass71_355 = Static38.method736("Private chat");

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
	public static int[] anIntArray78 = new int[128];

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!vc;")
	private static Class71 aClass71_356 = Static38.method736("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_357 = aClass71_355;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!da", name = "s", descriptor = "I")
	public static int anInt640 = 0;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!vc;")
	private static Class71 aClass71_358 = Static38.method736(" has logged in)3");

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_359 = aClass71_358;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!vc;")
	private static Class71 aClass71_360 = Static38.method736("Accept trade");

	@OriginalMember(owner = "client!da", name = "x", descriptor = "Lclient!vc;")
	public static Class71 aClass71_361 = aClass71_360;

	@OriginalMember(owner = "client!da", name = "y", descriptor = "Lclient!vc;")
	public static Class71 aClass71_362 = aClass71_356;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_363 = Static38.method736(")2");

	@OriginalMember(owner = "client!da", name = "C", descriptor = "Lclient!vc;")
	public static Class71 aClass71_364 = Static38.method736("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!da", name = "F", descriptor = "Lclient!vc;")
	public static Class71 aClass71_365 = Static38.method736("mapdots");

	@OriginalMember(owner = "client!da", name = "H", descriptor = "I")
	public static int anInt644 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method488() {
		Static86.aClass5_Sub11_Sub1_12.method1556();
		@Pc(13) int local13 = Static86.aClass5_Sub11_Sub1_12.method1555(8);
		@Pc(18) int local18;
		if (Static90.anInt3005 > local13) {
			for (local18 = local13; local18 < Static90.anInt3005; local18++) {
				Static27.anIntArray95[Static47.anInt1293++] = Static61.anIntArray175[local18];
			}
		}
		if (local13 > Static90.anInt3005) {
			throw new RuntimeException("gnpov1");
		}
		Static90.anInt3005 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(56) int local56 = Static61.anIntArray175[local18];
			@Pc(60) Class5_Sub1_Sub1_Sub3_Sub1 local60 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local56];
			@Pc(65) int local65 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
			if (local65 == 0) {
				Static61.anIntArray175[Static90.anInt3005++] = local56;
				local60.anInt2469 = Static95.anInt2285;
			} else {
				@Pc(88) int local88 = Static86.aClass5_Sub11_Sub1_12.method1555(2);
				if (local88 == 0) {
					Static61.anIntArray175[Static90.anInt3005++] = local56;
					local60.anInt2469 = Static95.anInt2285;
					Static72.anIntArray224[Static57.anInt1493++] = local56;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local88 == 1) {
						Static61.anIntArray175[Static90.anInt3005++] = local56;
						local60.anInt2469 = Static95.anInt2285;
						local135 = Static86.aClass5_Sub11_Sub1_12.method1555(3);
						local60.method1679(false, local135);
						local145 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
						if (local145 == 1) {
							Static72.anIntArray224[Static57.anInt1493++] = local56;
						}
					} else if (local88 == 2) {
						Static61.anIntArray175[Static90.anInt3005++] = local56;
						local60.anInt2469 = Static95.anInt2285;
						local135 = Static86.aClass5_Sub11_Sub1_12.method1555(3);
						local60.method1679(true, local135);
						local145 = Static86.aClass5_Sub11_Sub1_12.method1555(3);
						local60.method1679(true, local145);
						@Pc(199) int local199 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
						if (local199 == 1) {
							Static72.anIntArray224[Static57.anInt1493++] = local56;
						}
					} else if (local88 == 3) {
						Static27.anIntArray95[Static47.anInt1293++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Lclient!we;")
	public static Class5_Sub1_Sub10_Sub4 method489() {
		@Pc(17) Class5_Sub1_Sub10_Sub4 local17 = new Class5_Sub1_Sub10_Sub4(Static40.anIntArray85, Static5.anIntArray8, Static48.anIntArray157, Static40.anIntArray84, Static116.aByteArrayArray10);
		Static74.method676();
		return local17;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIII)I")
	public static int method490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * local4 & 0xFF00FF00) + ((arg2 & 0xFF00) * local4 + ((arg1 & 0xFF00) * arg0) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public static void method491() {
		aClass71_361 = null;
		anIntArray78 = null;
		aClass71_356 = null;
		aClass5_Sub2_Sub2_1 = null;
		aClass71_354 = null;
		anIntArray79 = null;
		aClass71_364 = null;
		aShortArrayArray1 = null;
		aClass71_362 = null;
		aClass71_360 = null;
		aClass71_355 = null;
		aClass71_358 = null;
		aClass71_365 = null;
		aClass5_Sub1_Sub10_Sub3Array4 = null;
		aClass71_363 = null;
		aClass24_Sub1_6 = null;
		aClass71_359 = null;
		aClass71_357 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	public static void method492(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static47.anIntArray151[arg0];
		@Pc(17) int local17 = Static49.anIntArray158[arg0];
		@Pc(21) int local21 = Static116.anIntArray286[arg0];
		@Pc(25) int local25 = Static66.anIntArray191[arg0];
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		if (Static77.anInt1917 != 0 && local25 != 1005) {
			Static77.anInt1917 = 0;
			Static68.aBoolean72 = true;
		}
		@Pc(52) Class5_Sub1_Sub1_Sub3_Sub1 local52;
		if (local25 == 22) {
			local52 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local21];
			if (local52 != null) {
				Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local52.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local52.anIntArray261[0], 1, 0);
				Static46.anInt1117 = 0;
				Static9.anInt298 = 2;
				Static66.anInt1650 = Static32.anInt847;
				Static115.anInt2742 = Static30.anInt800;
				Static61.aClass5_Sub11_Sub1_8.method1553(72);
				Static61.aClass5_Sub11_Sub1_8.method1528(local21);
			}
		}
		if (local25 == 33) {
			Static61.aClass5_Sub11_Sub1_8.method1553(99);
			Static61.aClass5_Sub11_Sub1_8.method1499(Static10.anInt308);
			Static61.aClass5_Sub11_Sub1_8.method1528(local13);
			Static61.aClass5_Sub11_Sub1_8.method1501(Static100.anInt2363);
			Static61.aClass5_Sub11_Sub1_8.method1499(local17);
		}
		@Pc(156) int local156;
		@Pc(170) long local170;
		@Pc(151) Class71 local151;
		if (local25 == 36 || local25 == 16 || local25 == 21 || local25 == 24) {
			local151 = Static24.aClass71Array8[arg0];
			local156 = local151.method1790(Static68.aClass71_824);
			if (local156 != -1) {
				local170 = local151.method1822(local156 + 5).method1821().method1817();
				if (local25 == 36) {
					Static31.method600(local170);
				}
				if (local25 == 16) {
					Static77.method1268(local170);
				}
				if (local25 == 21) {
					Static48.method924(local170);
				}
				if (local25 == 24) {
					Static105.method1655(local170);
				}
			}
		}
		@Pc(209) Class5_Sub1_Sub1_Sub3_Sub2 local209;
		if (local25 == 26) {
			local209 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local21];
			if (local209 != null) {
				Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local209.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local209.anIntArray261[0], 1, 0);
				Static66.anInt1650 = Static32.anInt847;
				Static115.anInt2742 = Static30.anInt800;
				Static46.anInt1117 = 0;
				Static9.anInt298 = 2;
				Static61.aClass5_Sub11_Sub1_8.method1553(48);
				Static61.aClass5_Sub11_Sub1_8.method1531(Static94.anInt2274);
				Static61.aClass5_Sub11_Sub1_8.method1528(Static85.anInt2041);
				Static61.aClass5_Sub11_Sub1_8.method1499(Static116.anInt2808);
				Static61.aClass5_Sub11_Sub1_8.method1531(local21);
			}
		}
		@Pc(302) boolean local302;
		if (local25 == 10) {
			local302 = Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 0, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 0, 0);
			if (!local302) {
				Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 1, 0);
			}
			Static115.anInt2742 = Static30.anInt800;
			Static9.anInt298 = 2;
			Static66.anInt1650 = Static32.anInt847;
			Static46.anInt1117 = 0;
			Static61.aClass5_Sub11_Sub1_8.method1553(75);
			Static61.aClass5_Sub11_Sub1_8.method1528(Static76.anInt1884 + local17);
			Static61.aClass5_Sub11_Sub1_8.method1501(local21);
			Static61.aClass5_Sub11_Sub1_8.method1501(local13 + Static48.anInt1367);
		}
		if (local25 == 39) {
			if (Static65.aBoolean71) {
				Static7.aClass43_1.method1088(local13 - 4, local17 - 4);
			} else {
				Static7.aClass43_1.method1088(Static30.anInt800 - 4, Static32.anInt847 + -4);
			}
		}
		if (local25 == 14) {
			Static61.aClass5_Sub11_Sub1_8.method1553(1);
			Static61.aClass5_Sub11_Sub1_8.method1505(local21);
			Static61.aClass5_Sub11_Sub1_8.method1536(local17);
			Static61.aClass5_Sub11_Sub1_8.method1501(local13);
			Static17.anInt606 = 0;
			Static21.anInt698 = local13;
			Static107.anInt2567 = local17;
			Static48.anInt1378 = 2;
			if (local17 >> 16 == Static47.anInt1298) {
				Static48.anInt1378 = 1;
			}
			if (Static62.anInt1577 == local17 >> 16) {
				Static48.anInt1378 = 3;
			}
		}
		if (local25 == 5) {
			Static61.aClass5_Sub11_Sub1_8.method1553(116);
			Static61.aClass5_Sub11_Sub1_8.method1536(local17);
			Static61.aClass5_Sub11_Sub1_8.method1531(local21);
			Static61.aClass5_Sub11_Sub1_8.method1505(local13);
			Static48.anInt1378 = 2;
			if (local17 >> 16 == Static47.anInt1298) {
				Static48.anInt1378 = 1;
			}
			if (Static62.anInt1577 == local17 >> 16) {
				Static48.anInt1378 = 3;
			}
			Static107.anInt2567 = local17;
			Static17.anInt606 = 0;
			Static21.anInt698 = local13;
		}
		if (local25 == 53) {
			Static61.aClass5_Sub11_Sub1_8.method1553(19);
			Static61.aClass5_Sub11_Sub1_8.method1499(local17);
			Static61.aClass5_Sub11_Sub1_8.method1505(Static94.anInt2274);
			Static61.aClass5_Sub11_Sub1_8.method1509(Static116.anInt2808);
			Static61.aClass5_Sub11_Sub1_8.method1531(local13);
			Static61.aClass5_Sub11_Sub1_8.method1501(local21);
			Static61.aClass5_Sub11_Sub1_8.method1505(Static85.anInt2041);
			Static17.anInt606 = 0;
			Static48.anInt1378 = 2;
			if (local17 >> 16 == Static47.anInt1298) {
				Static48.anInt1378 = 1;
			}
			Static107.anInt2567 = local17;
			if (local17 >> 16 == Static62.anInt1577) {
				Static48.anInt1378 = 3;
			}
			Static21.anInt698 = local13;
		}
		if (local25 == 55) {
			local302 = Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 0, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 0, 0);
			if (!local302) {
				Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 1, 0);
			}
			Static66.anInt1650 = Static32.anInt847;
			Static46.anInt1117 = 0;
			Static9.anInt298 = 2;
			Static115.anInt2742 = Static30.anInt800;
			Static61.aClass5_Sub11_Sub1_8.method1553(212);
			Static61.aClass5_Sub11_Sub1_8.method1505(local21);
			Static61.aClass5_Sub11_Sub1_8.method1528(local17 + Static76.anInt1884);
			Static61.aClass5_Sub11_Sub1_8.method1528(local13 + Static48.anInt1367);
		}
		if (local25 == 29) {
			Static61.aClass5_Sub11_Sub1_8.method1553(254);
			Static61.aClass5_Sub11_Sub1_8.method1499(local17);
			Static61.aClass5_Sub11_Sub1_8.method1528(local13);
			Static61.aClass5_Sub11_Sub1_8.method1505(local21);
			Static48.anInt1378 = 2;
			Static107.anInt2567 = local17;
			Static21.anInt698 = local13;
			if (Static47.anInt1298 == local17 >> 16) {
				Static48.anInt1378 = 1;
			}
			if (Static62.anInt1577 == local17 >> 16) {
				Static48.anInt1378 = 3;
			}
			Static17.anInt606 = 0;
		}
		@Pc(708) int local708;
		if (local25 == 37 || local25 == 28) {
			local151 = Static24.aClass71Array8[arg0];
			local156 = local151.method1790(Static68.aClass71_824);
			if (local156 != -1) {
				local151 = local151.method1822(local156 + 5).method1821();
				@Pc(704) Class71 local704 = local151.method1796().method1803();
				@Pc(706) boolean local706 = false;
				for (local708 = 0; local708 < Static37.anInt594; local708++) {
					@Pc(716) Class5_Sub1_Sub1_Sub3_Sub2 local716 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[Static116.anIntArray285[local708]];
					if (local716 != null && local716.aClass71_1236 != null && local716.aClass71_1236.method1785(local704)) {
						Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local716.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local716.anIntArray261[0], 1, 0);
						if (local25 == 37) {
							Static61.aClass5_Sub11_Sub1_8.method1553(54);
							Static61.aClass5_Sub11_Sub1_8.method1528(Static116.anIntArray285[local708]);
						}
						if (local25 == 28) {
							Static61.aClass5_Sub11_Sub1_8.method1553(202);
							Static61.aClass5_Sub11_Sub1_8.method1505(Static116.anIntArray285[local708]);
						}
						local706 = true;
						break;
					}
				}
				if (!local706) {
					Static92.method1500(0, Static74.method677(new Class71[] { Static6.aClass71_159, local704 }), Static38.aClass71_568);
				}
			}
		}
		if (local25 == 2 && Static88.anInt2058 == -1) {
			Static75.method1232(local17, local13);
			Static88.anInt2058 = local17;
			Static30.anInt799 = local13;
		}
		if (local25 == 4) {
			Static10.method203(local13, local21, local17);
			Static61.aClass5_Sub11_Sub1_8.method1553(233);
			Static61.aClass5_Sub11_Sub1_8.method1505(local21 >> 14 & 0x7FFF);
			Static61.aClass5_Sub11_Sub1_8.method1531(Static76.anInt1884 + local17);
			Static61.aClass5_Sub11_Sub1_8.method1531(Static48.anInt1367 + local13);
		}
		if (local25 == 27) {
			local151 = Static24.aClass71Array8[arg0];
			local156 = local151.method1790(Static68.aClass71_824);
			if (local156 != -1) {
				if (Static47.anInt1298 == -1) {
					Static2.method1237();
					if (Static14.anInt496 != -1) {
						Static38.aClass71_571 = local151.method1822(local156 + 5).method1821();
						Static117.anInt2911 = Static47.anInt1298 = Static14.anInt496;
						Static38.aBoolean44 = false;
					}
				} else {
					Static92.method1500(0, Static81.aClass71_984, Static38.aClass71_568);
					if (Static78.aClass71_521 != null) {
						Static92.method1500(0, Static78.aClass71_521, Static38.aClass71_568);
					}
				}
			}
		}
		if (local25 == 38) {
			Static61.aClass5_Sub11_Sub1_8.method1553(87);
			Static61.aClass5_Sub11_Sub1_8.method1528(local13);
			Static61.aClass5_Sub11_Sub1_8.method1528(local21);
			Static61.aClass5_Sub11_Sub1_8.method1525(local17);
			Static21.anInt698 = local13;
			Static17.anInt606 = 0;
			Static48.anInt1378 = 2;
			Static107.anInt2567 = local17;
			if (Static47.anInt1298 == local17 >> 16) {
				Static48.anInt1378 = 1;
			}
			if (local17 >> 16 == Static62.anInt1577) {
				Static48.anInt1378 = 3;
			}
		}
		if (local25 == 1003) {
			Static9.anInt298 = 2;
			Static115.anInt2742 = Static30.anInt800;
			Static46.anInt1117 = 0;
			Static66.anInt1650 = Static32.anInt847;
			Static61.aClass5_Sub11_Sub1_8.method1553(175);
			Static61.aClass5_Sub11_Sub1_8.method1531(local21 >> 14 & 0x7FFF);
		}
		if (local25 == 32) {
			Static61.aClass5_Sub11_Sub1_8.method1553(105);
			Static61.aClass5_Sub11_Sub1_8.method1525(local17);
			Static61.aClass5_Sub11_Sub1_8.method1531(local21);
			Static61.aClass5_Sub11_Sub1_8.method1505(local13);
			Static107.anInt2567 = local17;
			Static17.anInt606 = 0;
			Static48.anInt1378 = 2;
			if (Static47.anInt1298 == local17 >> 16) {
				Static48.anInt1378 = 1;
			}
			if (Static62.anInt1577 == local17 >> 16) {
				Static48.anInt1378 = 3;
			}
			Static21.anInt698 = local13;
		}
		if (local25 == 23) {
			local52 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local21];
			if (local52 != null) {
				Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local52.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local52.anIntArray261[0], 1, 0);
				Static46.anInt1117 = 0;
				Static115.anInt2742 = Static30.anInt800;
				Static9.anInt298 = 2;
				Static66.anInt1650 = Static32.anInt847;
				Static61.aClass5_Sub11_Sub1_8.method1553(122);
				Static61.aClass5_Sub11_Sub1_8.method1531(local21);
			}
		}
		@Pc(1144) Class5_Sub1_Sub11 local1144;
		if (local25 == 56) {
			local1144 = Static23.method550(local13, local17);
			if (local1144 != null) {
				Static116.method1893();
				Static71.method1181(local17, Static69.method1162(Static23.method545(local1144)), local13);
				Static28.aBoolean33 = true;
				Static81.anInt1990 = 0;
				Static82.aClass71_991 = Static92.method1542(local1144);
				if (Static82.aClass71_991 == null) {
					Static82.aClass71_991 = Static72.aClass71_886;
				}
				if (local1144.aBoolean75) {
					Static10.aClass71_222 = Static74.method677(new Class71[] { local1144.aClass71_876, Static68.aClass71_824 });
				} else {
					Static10.aClass71_222 = Static74.method677(new Class71[] { Static28.aClass71_448, local1144.aClass71_882, Static68.aClass71_824 });
				}
				if (Static24.anInt741 == 16 && !local1144.aBoolean75) {
					Static16.aBoolean22 = true;
					Static28.aBoolean33 = true;
					Static64.anInt2489 = 3;
				}
			}
		} else if (local25 == 17) {
			Static116.method1893();
			Static116.anInt2808 = local17;
			Static85.anInt2041 = local21;
			Static94.anInt2274 = local13;
			Static81.anInt1990 = 1;
			Static28.aBoolean33 = true;
			Static94.aClass71_1106 = Static74.method677(new Class71[] { Static82.aClass71_990, Static33.method691(local21).aClass71_1359, Static68.aClass71_824 });
			if (Static94.aClass71_1106 == null) {
				Static94.aClass71_1106 = Static30.aClass71_469;
			}
		} else {
			if (local25 == 35) {
				Static2.method1237();
			}
			if (local25 == 47) {
				Static61.aClass5_Sub11_Sub1_8.method1553(90);
				Static61.aClass5_Sub11_Sub1_8.method1501(local13);
				Static61.aClass5_Sub11_Sub1_8.method1499(local17);
				Static61.aClass5_Sub11_Sub1_8.method1501(local21);
				Static48.anInt1378 = 2;
				Static21.anInt698 = local13;
				Static107.anInt2567 = local17;
				if (local17 >> 16 == Static47.anInt1298) {
					Static48.anInt1378 = 1;
				}
				if (local17 >> 16 == Static62.anInt1577) {
					Static48.anInt1378 = 3;
				}
				Static17.anInt606 = 0;
			}
			if (local25 == 58) {
				Static10.method203(local13, local21, local17);
				Static61.aClass5_Sub11_Sub1_8.method1553(135);
				Static61.aClass5_Sub11_Sub1_8.method1531(local17 + Static76.anInt1884);
				Static61.aClass5_Sub11_Sub1_8.method1505(local21 >> 14 & 0x7FFF);
				Static61.aClass5_Sub11_Sub1_8.method1531(local13 + Static48.anInt1367);
			}
			if (local25 == 52) {
				local302 = Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 0, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 0, 0);
				if (!local302) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 1, 0);
				}
				Static115.anInt2742 = Static30.anInt800;
				Static46.anInt1117 = 0;
				Static66.anInt1650 = Static32.anInt847;
				Static9.anInt298 = 2;
				Static61.aClass5_Sub11_Sub1_8.method1553(187);
				Static61.aClass5_Sub11_Sub1_8.method1505(local21);
				Static61.aClass5_Sub11_Sub1_8.method1528(Static100.anInt2363);
				Static61.aClass5_Sub11_Sub1_8.method1501(Static48.anInt1367 + local13);
				Static61.aClass5_Sub11_Sub1_8.method1536(Static10.anInt308);
				Static61.aClass5_Sub11_Sub1_8.method1505(local17 + Static76.anInt1884);
			}
			if (local25 == 6) {
				local1144 = Static118.method1937(local17);
				@Pc(1464) boolean local1464 = true;
				if (local1144.anInt1764 > 0) {
					local1464 = Static105.method1656(local1144);
				}
				if (local1464) {
					Static61.aClass5_Sub11_Sub1_8.method1553(42);
					Static61.aClass5_Sub11_Sub1_8.method1525(local17);
				}
			}
			if (local25 == 11) {
				Static61.aClass5_Sub11_Sub1_8.method1553(144);
				Static61.aClass5_Sub11_Sub1_8.method1501(local21);
				Static61.aClass5_Sub11_Sub1_8.method1509(Static10.anInt308);
				Static61.aClass5_Sub11_Sub1_8.method1528(Static100.anInt2363);
				Static61.aClass5_Sub11_Sub1_8.method1528(local13);
				Static61.aClass5_Sub11_Sub1_8.method1499(local17);
				Static48.anInt1378 = 2;
				Static17.anInt606 = 0;
				if (local17 >> 16 == Static47.anInt1298) {
					Static48.anInt1378 = 1;
				}
				Static107.anInt2567 = local17;
				if (local17 >> 16 == Static62.anInt1577) {
					Static48.anInt1378 = 3;
				}
				Static21.anInt698 = local13;
			}
			if (local25 == 46) {
				Static10.method203(local13, local21, local17);
				Static61.aClass5_Sub11_Sub1_8.method1553(101);
				Static61.aClass5_Sub11_Sub1_8.method1528(Static48.anInt1367 + local13);
				Static61.aClass5_Sub11_Sub1_8.method1531(local21 >> 14 & 0x7FFF);
				Static61.aClass5_Sub11_Sub1_8.method1531(Static76.anInt1884 + local17);
			}
			if (local25 == 19) {
				Static61.aClass5_Sub11_Sub1_8.method1553(165);
				Static61.aClass5_Sub11_Sub1_8.method1531(local13);
				Static61.aClass5_Sub11_Sub1_8.method1499(local17);
				Static61.aClass5_Sub11_Sub1_8.method1528(local21);
				Static48.anInt1378 = 2;
				Static21.anInt698 = local13;
				if (local17 >> 16 == Static47.anInt1298) {
					Static48.anInt1378 = 1;
				}
				if (Static62.anInt1577 == local17 >> 16) {
					Static48.anInt1378 = 3;
				}
				Static107.anInt2567 = local17;
				Static17.anInt606 = 0;
			}
			if (local25 == 45) {
				local209 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local21];
				if (local209 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local209.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local209.anIntArray261[0], 1, 0);
					Static66.anInt1650 = Static32.anInt847;
					Static9.anInt298 = 2;
					Static115.anInt2742 = Static30.anInt800;
					Static46.anInt1117 = 0;
					Static61.aClass5_Sub11_Sub1_8.method1553(240);
					Static61.aClass5_Sub11_Sub1_8.method1531(local21);
				}
			}
			if (local25 == 1004) {
				Static115.anInt2742 = Static30.anInt800;
				Static46.anInt1117 = 0;
				Static9.anInt298 = 2;
				Static66.anInt1650 = Static32.anInt847;
				local52 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local21];
				if (local52 != null) {
					@Pc(1723) Class5_Sub1_Sub16 local1723 = local52.aClass5_Sub1_Sub16_1;
					if (local1723.anIntArray284 != null) {
						local1723 = local1723.method1891();
					}
					if (local1723 != null) {
						Static61.aClass5_Sub11_Sub1_8.method1553(164);
						Static61.aClass5_Sub11_Sub1_8.method1505(local1723.anInt2823);
					}
				}
			}
			if (local25 == 7) {
				Static61.aClass5_Sub11_Sub1_8.method1553(143);
				Static61.aClass5_Sub11_Sub1_8.method1536(local17);
				Static61.aClass5_Sub11_Sub1_8.method1501(local13);
				Static61.aClass5_Sub11_Sub1_8.method1505(local21);
				Static21.anInt698 = local13;
				Static107.anInt2567 = local17;
				Static48.anInt1378 = 2;
				if (Static47.anInt1298 == local17 >> 16) {
					Static48.anInt1378 = 1;
				}
				if (Static62.anInt1577 == local17 >> 16) {
					Static48.anInt1378 = 3;
				}
				Static17.anInt606 = 0;
			}
			if (local25 == 1002) {
				local1144 = Static118.method1937(local17);
				if (local1144 == null || local1144.anIntArray217[local13] < 100000) {
					Static61.aClass5_Sub11_Sub1_8.method1553(147);
					Static61.aClass5_Sub11_Sub1_8.method1531(local21);
				} else {
					Static92.method1500(0, Static74.method677(new Class71[] { Static51.method962(local1144.anIntArray217[local13]), Static60.aClass71_789, Static33.method691(local21).aClass71_1359 }), Static38.aClass71_568);
				}
				Static48.anInt1378 = 2;
				Static107.anInt2567 = local17;
				Static17.anInt606 = 0;
				Static21.anInt698 = local13;
				if (local17 >> 16 == Static47.anInt1298) {
					Static48.anInt1378 = 1;
				}
				if (Static62.anInt1577 == local17 >> 16) {
					Static48.anInt1378 = 3;
				}
			}
			if (local25 == 43) {
				Static61.aClass5_Sub11_Sub1_8.method1553(42);
				Static61.aClass5_Sub11_Sub1_8.method1525(local17);
				local1144 = Static118.method1937(local17);
				if (local1144.anIntArrayArray22 != null && local1144.anIntArrayArray22[0][0] == 5) {
					local156 = local1144.anIntArrayArray22[0][1];
					Static23.anIntArray87[local156] = 1 - Static23.anIntArray87[local156];
					Static82.method1345(local156);
					Static28.aBoolean33 = true;
				}
			}
			if (local25 == 51 && Static10.method203(local13, local21, local17)) {
				Static61.aClass5_Sub11_Sub1_8.method1553(59);
				Static61.aClass5_Sub11_Sub1_8.method1501(Static76.anInt1884 + local17);
				Static61.aClass5_Sub11_Sub1_8.method1531(local21 >> 14 & 0x7FFF);
				Static61.aClass5_Sub11_Sub1_8.method1501(Static48.anInt1367 + local13);
				Static61.aClass5_Sub11_Sub1_8.method1499(Static116.anInt2808);
				Static61.aClass5_Sub11_Sub1_8.method1531(Static85.anInt2041);
				Static61.aClass5_Sub11_Sub1_8.method1528(Static94.anInt2274);
			}
			if (local25 == 1006) {
				Static115.anInt2742 = Static30.anInt800;
				Static66.anInt1650 = Static32.anInt847;
				Static46.anInt1117 = 0;
				Static9.anInt298 = 2;
				Static61.aClass5_Sub11_Sub1_8.method1553(147);
				Static61.aClass5_Sub11_Sub1_8.method1531(local21);
			}
			if (local25 == 1) {
				local52 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local21];
				if (local52 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local52.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local52.anIntArray261[0], 1, 0);
					Static9.anInt298 = 2;
					Static66.anInt1650 = Static32.anInt847;
					Static46.anInt1117 = 0;
					Static115.anInt2742 = Static30.anInt800;
					Static61.aClass5_Sub11_Sub1_8.method1553(130);
					Static61.aClass5_Sub11_Sub1_8.method1528(local21);
				}
			}
			if (local25 == 48) {
				local302 = Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 0, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 0, 0);
				if (!local302) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 1, 0);
				}
				Static66.anInt1650 = Static32.anInt847;
				Static115.anInt2742 = Static30.anInt800;
				Static46.anInt1117 = 0;
				Static9.anInt298 = 2;
				Static61.aClass5_Sub11_Sub1_8.method1553(159);
				Static61.aClass5_Sub11_Sub1_8.method1531(local21);
				Static61.aClass5_Sub11_Sub1_8.method1501(local17 + Static76.anInt1884);
				Static61.aClass5_Sub11_Sub1_8.method1505(local13 + Static48.anInt1367);
			}
			if (local25 == 8 && Static10.method203(local13, local21, local17)) {
				Static61.aClass5_Sub11_Sub1_8.method1553(171);
				Static61.aClass5_Sub11_Sub1_8.method1528(local21 >> 14 & 0x7FFF);
				Static61.aClass5_Sub11_Sub1_8.method1531(Static76.anInt1884 + local17);
				Static61.aClass5_Sub11_Sub1_8.method1501(Static100.anInt2363);
				Static61.aClass5_Sub11_Sub1_8.method1531(Static48.anInt1367 + local13);
				Static61.aClass5_Sub11_Sub1_8.method1509(Static10.anInt308);
			}
			if (local25 == 3) {
				local302 = Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 0, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 0, 0);
				if (!local302) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 1, 0);
				}
				Static9.anInt298 = 2;
				Static66.anInt1650 = Static32.anInt847;
				Static46.anInt1117 = 0;
				Static115.anInt2742 = Static30.anInt800;
				Static61.aClass5_Sub11_Sub1_8.method1553(176);
				Static61.aClass5_Sub11_Sub1_8.method1505(local21);
				Static61.aClass5_Sub11_Sub1_8.method1501(local13 + Static48.anInt1367);
				Static61.aClass5_Sub11_Sub1_8.method1531(local17 + Static76.anInt1884);
			}
			if (local25 == 42) {
				local52 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local21];
				if (local52 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local52.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local52.anIntArray261[0], 1, 0);
					Static66.anInt1650 = Static32.anInt847;
					Static46.anInt1117 = 0;
					Static115.anInt2742 = Static30.anInt800;
					Static9.anInt298 = 2;
					Static61.aClass5_Sub11_Sub1_8.method1553(57);
					Static61.aClass5_Sub11_Sub1_8.method1501(local21);
				}
			}
			if (local25 == 40) {
				local209 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local21];
				if (local209 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local209.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local209.anIntArray261[0], 1, 0);
					Static66.anInt1650 = Static32.anInt847;
					Static115.anInt2742 = Static30.anInt800;
					Static46.anInt1117 = 0;
					Static9.anInt298 = 2;
					Static61.aClass5_Sub11_Sub1_8.method1553(77);
					Static61.aClass5_Sub11_Sub1_8.method1531(local21);
				}
			}
			if (local25 == 13) {
				Static61.aClass5_Sub11_Sub1_8.method1553(10);
				Static61.aClass5_Sub11_Sub1_8.method1528(local13);
				Static61.aClass5_Sub11_Sub1_8.method1499(local17);
				Static61.aClass5_Sub11_Sub1_8.method1531(local21);
				Static48.anInt1378 = 2;
				if (local17 >> 16 == Static47.anInt1298) {
					Static48.anInt1378 = 1;
				}
				Static17.anInt606 = 0;
				Static107.anInt2567 = local17;
				Static21.anInt698 = local13;
				if (Static62.anInt1577 == local17 >> 16) {
					Static48.anInt1378 = 3;
				}
			}
			if (local25 == 18) {
				local209 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local21];
				if (local209 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local209.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local209.anIntArray261[0], 1, 0);
					Static66.anInt1650 = Static32.anInt847;
					Static9.anInt298 = 2;
					Static46.anInt1117 = 0;
					Static115.anInt2742 = Static30.anInt800;
					Static61.aClass5_Sub11_Sub1_8.method1553(202);
					Static61.aClass5_Sub11_Sub1_8.method1505(local21);
				}
			}
			if (local25 == 20) {
				Static10.method203(local13, local21, local17);
				Static61.aClass5_Sub11_Sub1_8.method1553(174);
				Static61.aClass5_Sub11_Sub1_8.method1501(Static48.anInt1367 + local13);
				Static61.aClass5_Sub11_Sub1_8.method1528(local21 >> 14 & 0x7FFF);
				Static61.aClass5_Sub11_Sub1_8.method1501(local17 + Static76.anInt1884);
			}
			if (local25 == 9) {
				local52 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local21];
				if (local52 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local52.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local52.anIntArray261[0], 1, 0);
					Static9.anInt298 = 2;
					Static115.anInt2742 = Static30.anInt800;
					Static46.anInt1117 = 0;
					Static66.anInt1650 = Static32.anInt847;
					Static61.aClass5_Sub11_Sub1_8.method1553(109);
					Static61.aClass5_Sub11_Sub1_8.method1531(local21);
				}
			}
			if (local25 == 25) {
				Static61.aClass5_Sub11_Sub1_8.method1553(249);
				Static61.aClass5_Sub11_Sub1_8.method1531(local13);
				Static61.aClass5_Sub11_Sub1_8.method1505(local21);
				Static61.aClass5_Sub11_Sub1_8.method1509(local17);
				Static21.anInt698 = local13;
				Static48.anInt1378 = 2;
				Static107.anInt2567 = local17;
				Static17.anInt606 = 0;
				if (local17 >> 16 == Static47.anInt1298) {
					Static48.anInt1378 = 1;
				}
				if (local17 >> 16 == Static62.anInt1577) {
					Static48.anInt1378 = 3;
				}
			}
			if (local25 == 57) {
				local302 = Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 0, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 0, 0);
				if (!local302) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 1, 0);
				}
				Static46.anInt1117 = 0;
				Static9.anInt298 = 2;
				Static115.anInt2742 = Static30.anInt800;
				Static66.anInt1650 = Static32.anInt847;
				Static61.aClass5_Sub11_Sub1_8.method1553(206);
				Static61.aClass5_Sub11_Sub1_8.method1536(Static116.anInt2808);
				Static61.aClass5_Sub11_Sub1_8.method1528(Static94.anInt2274);
				Static61.aClass5_Sub11_Sub1_8.method1531(Static85.anInt2041);
				Static61.aClass5_Sub11_Sub1_8.method1501(local21);
				Static61.aClass5_Sub11_Sub1_8.method1505(Static76.anInt1884 + local17);
				Static61.aClass5_Sub11_Sub1_8.method1505(local13 + Static48.anInt1367);
			}
			if (local25 == 1001) {
				Static10.method203(local13, local21, local17);
				Static61.aClass5_Sub11_Sub1_8.method1553(39);
				Static61.aClass5_Sub11_Sub1_8.method1505(local13 + Static48.anInt1367);
				Static61.aClass5_Sub11_Sub1_8.method1531(local21 >> 14 & 0x7FFF);
				Static61.aClass5_Sub11_Sub1_8.method1531(local17 + Static76.anInt1884);
			}
			if (local25 == 44) {
				local209 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local21];
				if (local209 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local209.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local209.anIntArray261[0], 1, 0);
					Static115.anInt2742 = Static30.anInt800;
					Static66.anInt1650 = Static32.anInt847;
					Static46.anInt1117 = 0;
					Static9.anInt298 = 2;
					Static61.aClass5_Sub11_Sub1_8.method1553(54);
					Static61.aClass5_Sub11_Sub1_8.method1528(local21);
				}
			}
			if (local25 == 41) {
				Static61.aClass5_Sub11_Sub1_8.method1553(42);
				Static61.aClass5_Sub11_Sub1_8.method1525(local17);
				local1144 = Static118.method1937(local17);
				if (local1144.anIntArrayArray22 != null && local1144.anIntArrayArray22[0][0] == 5) {
					local156 = local1144.anIntArrayArray22[0][1];
					if (Static23.anIntArray87[local156] != local1144.anIntArray220[0]) {
						Static23.anIntArray87[local156] = local1144.anIntArray220[0];
						Static82.method1345(local156);
						Static28.aBoolean33 = true;
					}
				}
			}
			if (local25 == 30) {
				local302 = Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 0, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 0, 0);
				if (!local302) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local13, 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local17, 1, 0);
				}
				Static66.anInt1650 = Static32.anInt847;
				Static46.anInt1117 = 0;
				Static9.anInt298 = 2;
				Static115.anInt2742 = Static30.anInt800;
				Static61.aClass5_Sub11_Sub1_8.method1553(91);
				Static61.aClass5_Sub11_Sub1_8.method1505(local17 + Static76.anInt1884);
				Static61.aClass5_Sub11_Sub1_8.method1528(local21);
				Static61.aClass5_Sub11_Sub1_8.method1501(Static48.anInt1367 + local13);
			}
			if (local25 == 50) {
				local209 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local21];
				if (local209 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local209.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local209.anIntArray261[0], 1, 0);
					Static9.anInt298 = 2;
					Static66.anInt1650 = Static32.anInt847;
					Static46.anInt1117 = 0;
					Static115.anInt2742 = Static30.anInt800;
					Static61.aClass5_Sub11_Sub1_8.method1553(35);
					Static61.aClass5_Sub11_Sub1_8.method1536(Static10.anInt308);
					Static61.aClass5_Sub11_Sub1_8.method1528(Static100.anInt2363);
					Static61.aClass5_Sub11_Sub1_8.method1531(local21);
				}
			}
			if (local25 == 31) {
				local52 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local21];
				if (local52 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local52.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local52.anIntArray261[0], 1, 0);
					Static115.anInt2742 = Static30.anInt800;
					Static9.anInt298 = 2;
					Static46.anInt1117 = 0;
					Static66.anInt1650 = Static32.anInt847;
					Static61.aClass5_Sub11_Sub1_8.method1553(98);
					Static61.aClass5_Sub11_Sub1_8.method1499(Static116.anInt2808);
					Static61.aClass5_Sub11_Sub1_8.method1528(Static85.anInt2041);
					Static61.aClass5_Sub11_Sub1_8.method1531(Static94.anInt2274);
					Static61.aClass5_Sub11_Sub1_8.method1505(local21);
				}
			}
			if (local25 == 54) {
				Static117.method1924(Static7.anInt275);
				Static68.aBoolean72 = true;
				Static7.anInt275 = -1;
			}
			if (local25 == 49) {
				Static73.method1219(local17, local13, local21);
			}
			if (local25 == 12) {
				local52 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local21];
				if (local52 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local52.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local52.anIntArray261[0], 1, 0);
					Static66.anInt1650 = Static32.anInt847;
					Static46.anInt1117 = 0;
					Static115.anInt2742 = Static30.anInt800;
					Static9.anInt298 = 2;
					Static61.aClass5_Sub11_Sub1_8.method1553(40);
					Static61.aClass5_Sub11_Sub1_8.method1536(Static10.anInt308);
					Static61.aClass5_Sub11_Sub1_8.method1505(local21);
					Static61.aClass5_Sub11_Sub1_8.method1501(Static100.anInt2363);
				}
			}
			if (local25 == 15) {
				local151 = Static24.aClass71Array8[arg0];
				local156 = local151.method1790(Static68.aClass71_824);
				if (local156 != -1) {
					local708 = -1;
					local170 = local151.method1822(local156 + 5).method1821().method1817();
					for (@Pc(3250) int local3250 = 0; local3250 < Static68.anInt1685; local3250++) {
						if (local170 == Static57.aLongArray6[local3250]) {
							local708 = local3250;
							break;
						}
					}
					if (local708 != -1 && Static70.anIntArray216[local708] > 0) {
						Static68.aBoolean72 = true;
						Static27.anInt759 = 3;
						Static58.aBoolean66 = true;
						Static77.anInt1917 = 0;
						Static38.aClass71_573 = Static38.aClass71_568;
						Static88.aLong76 = Static57.aLongArray6[local708];
						Static38.aClass71_569 = Static74.method677(new Class71[] { Static51.aClass71_726, Static81.aClass71Array13[local708] });
					}
				}
			}
			if (local25 == 34) {
				local209 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local21];
				if (local209 != null) {
					Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], local209.anIntArray264[0], 0, 2, 1, false, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], local209.anIntArray261[0], 1, 0);
					Static66.anInt1650 = Static32.anInt847;
					Static46.anInt1117 = 0;
					Static9.anInt298 = 2;
					Static115.anInt2742 = Static30.anInt800;
					Static61.aClass5_Sub11_Sub1_8.method1553(183);
					Static61.aClass5_Sub11_Sub1_8.method1531(local21);
				}
			}
			if (Static81.anInt1990 != 0) {
				Static28.aBoolean33 = true;
				Static81.anInt1990 = 0;
			}
			if (Static33.aBoolean40) {
				Static116.method1893();
				Static28.aBoolean33 = true;
			}
		}
	}
}
