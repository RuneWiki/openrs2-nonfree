import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
	public static int anInt927;

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "Lclient!nb;")
	public static Class24 aClass24_11;

	@OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
	public static int anInt937;

	@OriginalMember(owner = "client!fc", name = "mb", descriptor = "I")
	public static int anInt930 = -1;

	@OriginalMember(owner = "client!fc", name = "rb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_514 = Static38.method736("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!fc", name = "ub", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!fc", name = "vb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_515 = Static38.method736("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
	public static int anInt935 = 0;

	@OriginalMember(owner = "client!fc", name = "Cb", descriptor = "I")
	public static int anInt940 = 0;

	@OriginalMember(owner = "client!fc", name = "Gb", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!fc", name = "Ib", descriptor = "Lclient!vc;")
	public static Class71 aClass71_516 = Static38.method736("backright1");

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	public static void method682() {
		while (Static25.method560()) {
			if (Static47.anInt1298 != -1 && Static117.anInt2911 == Static47.anInt1298) {
				if (Static10.anInt312 == 85 && Static38.aClass71_571.method1784() > 0) {
					Static38.aClass71_571 = Static38.aClass71_571.method1800(Static38.aClass71_571.method1784() - 1, 0);
				}
				if ((Static68.method1142(Static90.anInt3004) || Static90.anInt3004 == 32) && Static38.aClass71_571.method1784() < 12) {
					Static38.aClass71_571 = Static38.aClass71_571.method1791(Static90.anInt3004);
				}
			} else {
				@Pc(157) int local157;
				if (Static58.aBoolean66) {
					if (Static10.anInt312 == 85 && Static38.aClass71_573.method1784() > 0) {
						Static38.aClass71_573 = Static38.aClass71_573.method1800(Static38.aClass71_573.method1784() - 1, 0);
						Static68.aBoolean72 = true;
					}
					if (Static71.method1180(Static90.anInt3004) && Static38.aClass71_573.method1784() < 80) {
						Static38.aClass71_573 = Static38.aClass71_573.method1791(Static90.anInt3004);
						Static68.aBoolean72 = true;
					}
					if (Static10.anInt312 == 84) {
						Static68.aBoolean72 = true;
						Static58.aBoolean66 = false;
						@Pc(118) long local118;
						if (Static27.anInt759 == 1) {
							local118 = Static38.aClass71_573.method1817();
							Static31.method600(local118);
						}
						if (Static27.anInt759 == 2 && Static68.anInt1685 > 0) {
							local118 = Static38.aClass71_573.method1817();
							Static48.method924(local118);
						}
						if (Static27.anInt759 == 3 && Static38.aClass71_573.method1784() > 0) {
							Static61.aClass5_Sub11_Sub1_8.method1553(229);
							Static61.aClass5_Sub11_Sub1_8.method1545(0);
							local157 = Static61.aClass5_Sub11_Sub1_8.anInt2233;
							Static61.aClass5_Sub11_Sub1_8.method1548(Static88.aLong76);
							Static3.method64(Static38.aClass71_573, Static61.aClass5_Sub11_Sub1_8);
							Static61.aClass5_Sub11_Sub1_8.method1518(Static61.aClass5_Sub11_Sub1_8.anInt2233 - local157);
							if (Static60.anInt1551 == 2) {
								Static99.aBoolean103 = true;
								Static60.anInt1551 = 1;
								Static61.aClass5_Sub11_Sub1_8.method1553(13);
								Static61.aClass5_Sub11_Sub1_8.method1545(Static16.anInt518);
								Static61.aClass5_Sub11_Sub1_8.method1545(Static60.anInt1551);
								Static61.aClass5_Sub11_Sub1_8.method1545(Static93.anInt2252);
							}
						}
						if (Static27.anInt759 == 4 && anInt935 < 100) {
							local118 = Static38.aClass71_573.method1817();
							Static77.method1268(local118);
						}
						if (Static27.anInt759 == 5 && anInt935 > 0) {
							local118 = Static38.aClass71_573.method1817();
							Static105.method1655(local118);
						}
					}
				} else if (Static77.anInt1917 == 1) {
					if (Static10.anInt312 == 85 && Static38.aClass71_563.method1784() > 0) {
						Static38.aClass71_563 = Static38.aClass71_563.method1800(Static38.aClass71_563.method1784() - 1, 0);
						Static68.aBoolean72 = true;
					}
					if (Static90.method2003(Static90.anInt3004) && Static38.aClass71_563.method1784() < 10) {
						Static38.aClass71_563 = Static38.aClass71_563.method1791(Static90.anInt3004);
						Static68.aBoolean72 = true;
					}
					if (Static10.anInt312 == 84) {
						if (Static38.aClass71_563.method1784() > 0) {
							local157 = 0;
							if (Static38.aClass71_563.method1815()) {
								local157 = Static38.aClass71_563.method1808();
							}
							Static61.aClass5_Sub11_Sub1_8.method1553(8);
							Static61.aClass5_Sub11_Sub1_8.method1525(local157);
						}
						Static68.aBoolean72 = true;
						Static77.anInt1917 = 0;
					}
				} else if (Static77.anInt1917 == 2) {
					if (Static10.anInt312 == 85 && Static38.aClass71_563.method1784() > 0) {
						Static38.aClass71_563 = Static38.aClass71_563.method1800(Static38.aClass71_563.method1784() - 1, 0);
						Static68.aBoolean72 = true;
					}
					if ((Static68.method1142(Static90.anInt3004) || Static90.anInt3004 == 32) && Static38.aClass71_563.method1784() < 12) {
						Static38.aClass71_563 = Static38.aClass71_563.method1791(Static90.anInt3004);
						Static68.aBoolean72 = true;
					}
					if (Static10.anInt312 == 84) {
						if (Static38.aClass71_563.method1784() > 0) {
							Static61.aClass5_Sub11_Sub1_8.method1553(180);
							Static61.aClass5_Sub11_Sub1_8.method1548(Static38.aClass71_563.method1817());
						}
						Static77.anInt1917 = 0;
						Static68.aBoolean72 = true;
					}
				} else if (Static77.anInt1917 == 3) {
					if (Static10.anInt312 == 85 && Static38.aClass71_563.method1784() > 0) {
						Static38.aClass71_563 = Static38.aClass71_563.method1800(Static38.aClass71_563.method1784() - 1, 0);
						Static68.aBoolean72 = true;
					}
					if (Static71.method1180(Static90.anInt3004) && Static38.aClass71_563.method1784() < 40) {
						Static38.aClass71_563 = Static38.aClass71_563.method1791(Static90.anInt3004);
						Static68.aBoolean72 = true;
					}
				} else if (Static77.anInt1917 == 4) {
					if (Static10.anInt312 == 85 && Static38.aClass71_563.method1784() > 0) {
						Static38.aClass71_563 = Static38.aClass71_563.method1800(Static38.aClass71_563.method1784() - 1, 0);
						Static68.aBoolean72 = true;
					}
					if ((Static71.method1180(Static90.anInt3004) || Static90.anInt3004 == 32) && Static38.aClass71_563.method1784() < 80) {
						Static38.aClass71_563 = Static38.aClass71_563.method1791(Static90.anInt3004);
						Static68.aBoolean72 = true;
					}
					if (Static10.anInt312 == 84) {
						if (Static38.aClass71_563.method1784() > 0) {
							Static61.aClass5_Sub11_Sub1_8.method1553(100);
							Static61.aClass5_Sub11_Sub1_8.method1545(Static38.aClass71_563.method1784() + 1);
							Static61.aClass5_Sub11_Sub1_8.method1534(Static38.aClass71_563);
						}
						Static77.anInt1917 = 0;
						Static68.aBoolean72 = true;
					}
				} else if (Static62.anInt1577 == -1 && Static68.anInt1659 == -1) {
					if (Static10.anInt312 == 85 && Static38.aClass71_564.method1784() > 0) {
						Static38.aClass71_564 = Static38.aClass71_564.method1800(Static38.aClass71_564.method1784() - 1, 0);
						Static68.aBoolean72 = true;
					}
					if (Static71.method1180(Static90.anInt3004) && Static38.aClass71_564.method1784() < 80) {
						Static38.aClass71_564 = Static38.aClass71_564.method1791(Static90.anInt3004);
						Static68.aBoolean72 = true;
					}
					if (Static10.anInt312 == 84 && Static38.aClass71_564.method1784() > 0) {
						if (Static9.anInt302 == 2) {
							if (Static38.aClass71_564.method1813(Static92.aClass71_1089)) {
								System.gc();
							}
							if (Static38.aClass71_564.method1813(Static88.aClass71_1037)) {
								Static61.method1042();
							}
							if (Static38.aClass71_564.method1813(Static109.aClass71_1275)) {
								Static89.aBoolean99 = true;
							}
							if (Static38.aClass71_564.method1813(Static51.aClass71_722)) {
								Static89.aBoolean99 = false;
							}
							if (Static38.aClass71_564.method1813(Static71.aClass71_855)) {
								for (local157 = 0; local157 < 4; local157++) {
									for (@Pc(494) int local494 = 1; local494 < 103; local494++) {
										for (@Pc(498) int local498 = 1; local498 < 103; local498++) {
											Static111.aClass33Array3[local157].anIntArrayArray14[local494][local498] = 0;
										}
									}
								}
							}
							if (Static38.aClass71_564.method1813(Static51.aClass71_725) && Static98.anInt1928 == 2) {
								throw new RuntimeException();
							}
							if (Static38.aClass71_564.method1813(Static6.aClass71_163)) {
								Static3.aBoolean3 = true;
							}
						}
						if (Static38.aClass71_564.method1801(Static93.aClass71_1099)) {
							Static61.aClass5_Sub11_Sub1_8.method1553(142);
							Static61.aClass5_Sub11_Sub1_8.method1545(Static38.aClass71_564.method1784() - 1);
							Static61.aClass5_Sub11_Sub1_8.method1534(Static38.aClass71_564.method1822(2));
						} else {
							@Pc(572) byte local572 = 0;
							@Pc(580) Class71 local580 = Static38.aClass71_564.method1792();
							if (local580.method1801(Static100.aClass71_1168)) {
								local572 = 0;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static100.aClass71_1168.method1784());
							} else if (local580.method1801(Static86.aClass71_1420)) {
								local572 = 1;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static86.aClass71_1420.method1784());
							} else if (local580.method1801(Static18.aClass71_348)) {
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static18.aClass71_348.method1784());
								local572 = 2;
							} else if (local580.method1801(Static76.aClass71_910)) {
								local572 = 3;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static76.aClass71_910.method1784());
							} else if (local580.method1801(Static79.aClass71_952)) {
								local572 = 4;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static79.aClass71_952.method1784());
							} else if (local580.method1801(Static5.aClass71_151)) {
								local572 = 5;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static5.aClass71_151.method1784());
							} else if (local580.method1801(Static59.aClass71_779)) {
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static59.aClass71_779.method1784());
								local572 = 6;
							} else if (local580.method1801(Static77.aClass71_935)) {
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static77.aClass71_935.method1784());
								local572 = 7;
							} else if (local580.method1801(Static50.aClass71_716)) {
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static50.aClass71_716.method1784());
								local572 = 8;
							} else if (local580.method1801(Static25.aClass71_431)) {
								local572 = 9;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static25.aClass71_431.method1784());
							} else if (local580.method1801(Static16.aClass71_309)) {
								local572 = 10;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static16.aClass71_309.method1784());
							} else if (local580.method1801(Static117.aClass71_1371)) {
								local572 = 11;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static117.aClass71_1371.method1784());
							}
							local580 = Static38.aClass71_564.method1792();
							@Pc(776) byte local776 = 0;
							if (local580.method1801(Static75.aClass71_900)) {
								local776 = 1;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static75.aClass71_900.method1784());
							} else if (local580.method1801(Static94.aClass71_1108)) {
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static94.aClass71_1108.method1784());
								local776 = 2;
							} else if (local580.method1801(Static79.aClass71_955)) {
								local776 = 3;
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static79.aClass71_955.method1784());
							} else if (local580.method1801(Static25.aClass71_430)) {
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static25.aClass71_430.method1784());
								local776 = 4;
							} else if (local580.method1801(Static88.aClass71_1035)) {
								Static38.aClass71_564 = Static38.aClass71_564.method1822(Static88.aClass71_1035.method1784());
								local776 = 5;
							}
							Static61.aClass5_Sub11_Sub1_8.method1553(170);
							Static61.aClass5_Sub11_Sub1_8.method1545(0);
							@Pc(865) int local865 = Static61.aClass5_Sub11_Sub1_8.anInt2233;
							Static61.aClass5_Sub11_Sub1_8.method1545(local572);
							Static61.aClass5_Sub11_Sub1_8.method1545(local776);
							Static3.method64(Static38.aClass71_564, Static61.aClass5_Sub11_Sub1_8);
							Static61.aClass5_Sub11_Sub1_8.method1518(Static61.aClass5_Sub11_Sub1_8.anInt2233 - local865);
							if (Static16.anInt518 == 2) {
								Static99.aBoolean103 = true;
								Static16.anInt518 = 3;
								Static61.aClass5_Sub11_Sub1_8.method1553(13);
								Static61.aClass5_Sub11_Sub1_8.method1545(Static16.anInt518);
								Static61.aClass5_Sub11_Sub1_8.method1545(Static60.anInt1551);
								Static61.aClass5_Sub11_Sub1_8.method1545(Static93.anInt2252);
							}
						}
						Static68.aBoolean72 = true;
						Static38.aClass71_564 = Static38.aClass71_568;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	public static void method685() {
		Static48.method937();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (Static66.anInt1647 == 2) {
			@Pc(13) byte[] local13 = Static4.aClass5_Sub1_Sub10_Sub1_3.aByteArray8;
			@Pc(15) int[] local15 = Static52.anIntArray309;
			local18 = local13.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local13[local20] == 0) {
					local15[local20] = 0;
				}
			}
			Static37.aClass5_Sub1_Sub10_Sub3_12.method1874(0, 0, 33, 33, 25, 25, Static88.anInt2060, 256, Static6.anIntArray10, Static76.anIntArray233);
			Static37.method452();
			return;
		}
		@Pc(58) int local58 = Static88.anInt2060 + Static101.anInt2378 & 0x7FF;
		@Pc(65) int local65 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32 + 48;
		local18 = 464 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
		Static79.aClass5_Sub1_Sub10_Sub3_35.method1874(25, 5, 146, 151, local65, local18, local58, Static66.anInt1651 + 256, Static41.anIntArray122, Static27.anIntArray93);
		for (local20 = 0; local20 < Static51.anInt1420; local20++) {
			local65 = Static85.anIntArray252[local20] * 4 + 2 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32;
			local18 = Static83.anIntArray248[local20] * 4 + 2 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
			Static118.method1936(Static76.aClass5_Sub1_Sub10_Sub3Array9[local20], local18, local65);
		}
		@Pc(142) int local142;
		for (@Pc(136) int local136 = 0; local136 < 104; local136++) {
			for (local142 = 0; local142 < 104; local142++) {
				@Pc(152) Class52 local152 = Static34.aClass52ArrayArrayArray1[Static23.anInt728][local136][local142];
				if (local152 != null) {
					local18 = local142 * 4 + 2 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
					local65 = local136 * 4 + 2 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32;
					Static118.method1936(Static9.aClass5_Sub1_Sub10_Sub3Array3[0], local18, local65);
				}
			}
		}
		for (local142 = 0; local142 < Static90.anInt3005; local142++) {
			@Pc(205) Class5_Sub1_Sub1_Sub3_Sub1 local205 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[Static61.anIntArray175[local142]];
			if (local205 != null && local205.method1680()) {
				@Pc(214) Class5_Sub1_Sub16 local214 = local205.aClass5_Sub1_Sub16_1;
				if (local214 != null && local214.anIntArray284 != null) {
					local214 = local214.method1891();
				}
				if (local214 != null && local214.aBoolean122 && local214.aBoolean123) {
					local18 = local205.anInt2452 / 32 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
					local65 = local205.anInt2474 / 32 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32;
					Static118.method1936(Static9.aClass5_Sub1_Sub10_Sub3Array3[1], local18, local65);
				}
			}
		}
		@Pc(274) Class5_Sub1_Sub1_Sub3_Sub2 local274;
		for (@Pc(266) int local266 = 0; local266 < Static37.anInt594; local266++) {
			local274 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[Static116.anIntArray285[local266]];
			if (local274 != null && local274.method1680()) {
				@Pc(282) boolean local282 = false;
				local65 = local274.anInt2474 / 32 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32;
				local18 = local274.anInt2452 / 32 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
				@Pc(308) long local308 = local274.aClass71_1236.method1817();
				for (@Pc(310) int local310 = 0; local310 < Static68.anInt1685; local310++) {
					if (local308 == Static57.aLongArray6[local310] && Static70.anIntArray216[local310] != 0) {
						local282 = true;
						break;
					}
				}
				@Pc(336) boolean local336 = false;
				if (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2498 != 0 && local274.anInt2498 != 0 && Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2498 == local274.anInt2498) {
					local336 = true;
				}
				if (local282) {
					Static118.method1936(Static9.aClass5_Sub1_Sub10_Sub3Array3[3], local18, local65);
				} else if (local336) {
					Static118.method1936(Static9.aClass5_Sub1_Sub10_Sub3Array3[4], local18, local65);
				} else {
					Static118.method1936(Static9.aClass5_Sub1_Sub10_Sub3Array3[2], local18, local65);
				}
			}
		}
		if (Static6.anInt227 != 0 && Static95.anInt2285 % 20 < 10) {
			if (Static6.anInt227 == 1 && Static20.anInt678 >= 0 && Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1.length > Static20.anInt678) {
				@Pc(421) Class5_Sub1_Sub1_Sub3_Sub1 local421 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[Static20.anInt678];
				if (local421 != null) {
					local65 = local421.anInt2474 / 32 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32;
					local18 = local421.anInt2452 / 32 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
					Static99.method1614(local18, Static8.aClass5_Sub1_Sub10_Sub3Array2[1], local65);
				}
			}
			if (Static6.anInt227 == 2) {
				local65 = (Static101.anInt2379 - Static48.anInt1367) * 4 + 2 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32;
				local18 = (Static98.anInt1921 - Static76.anInt1884) * 4 + 2 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
				Static99.method1614(local18, Static8.aClass5_Sub1_Sub10_Sub3Array2[1], local65);
			}
			if (Static6.anInt227 == 10 && Static40.anInt713 >= 0 && Static40.anInt713 < Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1.length) {
				local274 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[Static40.anInt713];
				if (local274 != null) {
					local18 = local274.anInt2452 / 32 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
					local65 = local274.anInt2474 / 32 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32;
					Static99.method1614(local18, Static8.aClass5_Sub1_Sub10_Sub3Array2[1], local65);
				}
			}
		}
		if (Static41.anInt1068 != 0) {
			local65 = Static41.anInt1068 * 4 + 2 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 / 32;
			local18 = Static61.anInt1564 * 4 + 2 - Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 / 32;
			Static118.method1936(Static8.aClass5_Sub1_Sub10_Sub3Array2[0], local18, local65);
		}
		Static52.method2024(97, 78, 3, 3, 16777215);
		Static37.aClass5_Sub1_Sub10_Sub3_12.method1874(0, 0, 33, 33, 25, 25, Static88.anInt2060, 256, Static6.anIntArray10, Static76.anIntArray233);
		Static37.method452();
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
	public static void method686() {
		if (Static6.anInt227 == 2) {
			Static2.method1233(Static29.anInt776 + (Static101.anInt2379 - Static48.anInt1367 << 7), Static81.anInt1992 * 2, Static6.anInt226 + (Static98.anInt1921 - Static76.anInt1884 << 7));
			if (Static42.anInt1070 > -1 && Static95.anInt2285 % 20 < 10) {
				Static74.aClass5_Sub1_Sub10_Sub3Array7[0].method1862(Static42.anInt1070 - 12, Static95.anInt2287 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
	public static void method689() {
		aClass71_516 = null;
		aClass24_11 = null;
		aClass71_514 = null;
		aClass71_515 = null;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)Lclient!wa;")
	public static Class5_Sub1_Sub17 method691(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub1_Sub17 local14 = (Class5_Sub1_Sub17) Static60.aClass54_26.method1397((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static77.aClass24_15.method679(10, arg0);
		local14 = new Class5_Sub1_Sub17();
		local14.anInt2906 = arg0;
		if (local28 != null) {
			local14.method1929(new Class5_Sub11(local28));
		}
		local14.method1928();
		if (local14.anInt2905 != -1) {
			local14.method1926(method691(local14.anInt2905), method691(local14.anInt2895));
		}
		if (!Static91.aBoolean100 && local14.aBoolean127) {
			local14.aClass71Array18 = null;
			local14.aClass71_1359 = Static16.aClass71_328;
			local14.aClass71Array17 = null;
			local14.anInt2908 = 0;
		}
		Static60.aClass54_26.method1399(local14, (long) arg0);
		return local14;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!me;)[I")
	public static int[] method693(@OriginalArg(1) Class5_Sub1_Sub11 arg0) {
		@Pc(10) int local10 = arg0.anInt1760 >> 16;
		if (!Static106.method1689(local10)) {
			return null;
		}
		@Pc(24) int local24 = arg0.anInt1817;
		@Pc(27) int local27 = arg0.anInt1804;
		@Pc(40) Class5_Sub1_Sub11 local40;
		for (@Pc(30) int local30 = arg0.anInt1785; local30 != -1; local30 = local40.anInt1785) {
			local40 = Static30.aClass5_Sub1_Sub11ArrayArray1[local10][local30 & 0xFFFF];
			local27 += local40.anInt1804 - local40.anInt1778;
			local24 += local40.anInt1817 - local40.anInt1774;
		}
		return new int[] { local27, local24 };
	}
}
