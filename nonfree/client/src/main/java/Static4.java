import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
	public static int anInt120;

	@OriginalMember(owner = "client!ad", name = "Fb", descriptor = "I")
	public static int anInt145;

	@OriginalMember(owner = "client!ad", name = "Gb", descriptor = "Lclient!ba;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "Lclient!na;")
	private static Class53 aClass53_52 = Static109.method1737("wave2:");

	@OriginalMember(owner = "client!ad", name = "kb", descriptor = "Lclient!na;")
	private static Class53 aClass53_51 = aClass53_52;

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lclient!ud;")
	public static Class77 aClass77_1 = new Class77(4096);

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "Lclient!na;")
	public static Class53 aClass53_53 = aClass53_52;

	@OriginalMember(owner = "client!ad", name = "zb", descriptor = "Lclient!na;")
	public static Class53 aClass53_54 = Static109.method1737("Freunde");

	@OriginalMember(owner = "client!ad", name = "Eb", descriptor = "I")
	public static int anInt144 = 0;

	@OriginalMember(owner = "client!ad", name = "Hb", descriptor = "[I")
	public static int[] anIntArray13 = new int[5];

	@OriginalMember(owner = "client!ad", name = "Ib", descriptor = "[J")
	public static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!ad", name = "Jb", descriptor = "I")
	public static int anInt146 = -1;

	@OriginalMember(owner = "client!ad", name = "Kb", descriptor = "Lclient!na;")
	public static Class53 aClass53_55 = Static109.method1737("p11_full");

	@OriginalMember(owner = "client!ad", name = "Lb", descriptor = "Lclient!na;")
	public static Class53 aClass53_56 = Static109.method1737(" x ");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLclient!vb;)Lclient!na;")
	public static Class53 method76(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub15 arg1) {
		if (!Static59.method1076(arg0, Static50.method1914(arg1))) {
			return null;
		} else if (arg1.aClass53Array20 == null || arg0 >= arg1.aClass53Array20.length || arg1.aClass53Array20[arg0] == null || arg1.aClass53Array20[arg0].method1256().method1294() == 0) {
			return Static102.aBoolean101 ? Static103.method1689(new Class53[] { Static116.aClass53_1331, Static108.method1725(arg0) }) : null;
		} else {
			return arg1.aClass53Array20[arg0];
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ff;Lclient!ff;I)V")
	public static void method78(@OriginalArg(0) Class3_Sub1_Sub5_Sub2 arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub2 arg1) {
		if (Static86.aBoolean79) {
			Static56.method1045(arg1, arg0);
			return;
		}
		if (Static78.anInt1957 == 0 || Static78.anInt1957 == 5) {
			arg1.method735(Static88.aClass53_1011, 382, 225, 16777215);
			Static84.method1324(230, 233, 304, 34, 9179409);
			Static84.method1324(231, 234, 302, 32, 0);
			Static84.method1316(232, 235, Static113.anInt2601 * 3, 30, 9179409);
			Static84.method1316(Static113.anInt2601 * 3 + 232, 235, 300 - Static113.anInt2601 * 3, 30, 0);
			arg1.method735(Static122.aClass53_1404, 382, 256, 16777215);
		}
		@Pc(107) short local107;
		@Pc(115) int local115;
		if (Static78.anInt1957 == 20) {
			Static91.aClass3_Sub1_Sub5_Sub3_21.method813(382 - Static91.aClass3_Sub1_Sub5_Sub3_21.anInt1168 / 2, 271 - Static91.aClass3_Sub1_Sub5_Sub3_21.anInt1167 / 2);
			local107 = 211;
			arg1.method733(Static122.aClass53_1412, 382, 211, 16776960, true);
			local115 = local107 + 15;
			arg1.method733(Static122.aClass53_1413, 382, 226, 16776960, true);
			@Pc(123) int local123 = local115 + 15;
			arg1.method733(Static122.aClass53_1408, 382, 241, 16776960, true);
			@Pc(131) int local131 = local123 + 15;
			@Pc(132) int local132 = local131 + 10;
			arg1.method749(Static103.method1689(new Class53[] { Static18.aClass53_175, Static122.aClass53_1409 }), 292, 266, 16777215, true);
			@Pc(151) int local151 = local132 + 15;
			arg1.method749(Static103.method1689(new Class53[] { Static106.aClass53_1224, Static122.aClass53_1406.method1257() }), 294, 281, 16777215, true);
			@Pc(172) int local172 = local151 + 15;
		}
		if (Static78.anInt1957 == 10) {
			Static91.aClass3_Sub1_Sub5_Sub3_21.method813(202, 171);
			if (Static105.anInt2431 == 0) {
				local107 = 251;
				arg1.method733(Static11.aClass53_112, 382, 251, 16776960, true);
				local115 = local107 + 30;
				Static9.aClass3_Sub1_Sub5_Sub3_3.method813(229, 271);
				arg1.method739(Static5.aClass53_73, 229, 271, 144, 40, 16777215, true, 1, 1, 0);
				Static9.aClass3_Sub1_Sub5_Sub3_3.method813(389, 271);
				arg1.method739(Static124.aClass53_1447, 389, 271, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static105.anInt2431 == 2) {
				local107 = 211;
				arg1.method733(Static122.aClass53_1412, 382, 211, 16776960, true);
				local115 = local107 + 15;
				arg1.method733(Static122.aClass53_1413, 382, 226, 16776960, true);
				local115 += 15;
				arg1.method733(Static122.aClass53_1408, 382, 241, 16776960, true);
				local115 += 15;
				local115 += 10;
				arg1.method749(Static103.method1689(new Class53[] { Static18.aClass53_175, Static122.aClass53_1409, Static27.anInt843 % 40 < 20 & Static31.anInt1066 == 0 ? Static83.aClass53_939 : Static122.aClass53_1407 }), 292, 266, 16777215, true);
				local115 += 15;
				arg1.method749(Static103.method1689(new Class53[] { Static106.aClass53_1224, Static122.aClass53_1406.method1257(), Static31.anInt1066 == 1 & Static27.anInt843 % 40 < 20 ? Static83.aClass53_939 : Static122.aClass53_1407 }), 294, 281, 16777215, true);
				local115 += 15;
				Static9.aClass3_Sub1_Sub5_Sub3_3.method813(229, 301);
				arg1.method733(Static83.aClass53_937, 302, 326, 16777215, true);
				Static9.aClass3_Sub1_Sub5_Sub3_3.method813(389, 301);
				arg1.method733(Static95.aClass53_1096, 462, 326, 16777215, true);
			} else if (Static105.anInt2431 == 3) {
				arg1.method733(Static52.aClass53_635, 382, 211, 16776960, true);
				local107 = 236;
				arg1.method733(Static53.aClass53_994, 382, 236, 16777215, true);
				local115 = local107 + 15;
				arg1.method733(Static61.aClass53_707, 382, 251, 16777215, true);
				local115 += 15;
				arg1.method733(Static7.aClass53_82, 382, 266, 16777215, true);
				local115 += 15;
				arg1.method733(Static91.aClass53_1053, 382, 281, 16777215, true);
				local115 += 15;
				Static9.aClass3_Sub1_Sub5_Sub3_3.method813(309, 301);
				arg1.method733(Static95.aClass53_1096, 382, 326, 16777215, true);
			}
		}
		if (Static50.anInt2786 > 0) {
			Static83.method1427(Static50.anInt2786);
			Static50.anInt2786 = 0;
		}
		Static38.method780();
		Static89.aClass3_Sub1_Sub5_Sub3Array8[Static76.aBoolean70 ? 1 : 0].method813(725, 463);
		if (Static78.anInt1957 > 5 && Static59.anInt1542 != 2 && Static87.anInt2095 == 0) {
			if (Static32.aClass3_Sub1_Sub5_Sub3_8 == null) {
				Static32.aClass3_Sub1_Sub5_Sub3_8 = Static20.method374(Static75.aClass53_841, Static58.aClass62_Sub1_9, Static122.aClass53_1407);
			} else {
				Static32.aClass3_Sub1_Sub5_Sub3_8.method813(5, 463);
				arg1.method733(Static103.method1689(new Class53[] { Static108.aClass53_1244, Static116.aClass53_1330, Static108.method1725(Static31.anInt1056) }), 55, 478, 16777215, true);
				if (Static99.aClass28_1 == null) {
					arg0.method733(Static89.aClass53_1021, 55, 492, 16777215, true);
				} else {
					arg0.method733(Static42.aClass53_540, 55, 492, 16777215, true);
				}
			}
		}
		try {
			@Pc(613) Graphics local613 = Static87.aCanvas1.getGraphics();
			Static122.aClass27_47.method1536(0, local613, 0);
		} catch (@Pc(621) Exception local621) {
			Static87.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
	public static void method84() {
		anIntArray13 = null;
		aClass53_52 = null;
		aClass53_51 = null;
		aClass53_56 = null;
		aClass6_1 = null;
		aLongArray2 = null;
		aClass53_53 = null;
		aClass53_55 = null;
		aClass53_54 = null;
		aClass77_1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
	public static void method85() {
		while (Static62.method1105()) {
			if (Static111.anInt2556 != -1 && Static111.anInt2556 == Static82.anInt957) {
				if (Static20.anInt702 == 85 && Static35.aClass53_473.method1294() > 0) {
					Static35.aClass53_473 = Static35.aClass53_473.method1267(Static35.aClass53_473.method1294() - 1, 0);
				}
				if ((Static53.method1445(Static122.anInt2839) || Static122.anInt2839 == 32) && Static35.aClass53_473.method1294() < 12) {
					Static35.aClass53_473 = Static35.aClass53_473.method1261(Static122.anInt2839);
				}
			} else {
				@Pc(152) int local152;
				if (Static68.aBoolean62) {
					if (Static20.anInt702 == 85 && Static35.aClass53_475.method1294() > 0) {
						Static35.aClass53_475 = Static35.aClass53_475.method1267(Static35.aClass53_475.method1294() - 1, 0);
						Static52.aBoolean50 = true;
					}
					if (Static96.method1030(Static122.anInt2839) && Static35.aClass53_475.method1294() < 80) {
						Static35.aClass53_475 = Static35.aClass53_475.method1261(Static122.anInt2839);
						Static52.aBoolean50 = true;
					}
					if (Static20.anInt702 == 84) {
						Static68.aBoolean62 = false;
						Static52.aBoolean50 = true;
						@Pc(110) long local110;
						if (Static102.anInt2386 == 1) {
							local110 = Static35.aClass53_475.method1286();
							Static35.method760(local110);
						}
						if (Static102.anInt2386 == 2 && Static68.anInt1724 > 0) {
							local110 = Static35.aClass53_475.method1286();
							Static77.method1359(local110);
						}
						if (Static102.anInt2386 == 3 && Static35.aClass53_475.method1294() > 0) {
							Static115.aClass3_Sub7_Sub1_3.method662(49);
							Static115.aClass3_Sub7_Sub1_3.method625(0);
							local152 = Static115.aClass3_Sub7_Sub1_3.anInt964;
							Static115.aClass3_Sub7_Sub1_3.method633(Static49.aLong53);
							Static62.method1108(Static35.aClass53_475, Static115.aClass3_Sub7_Sub1_3);
							Static115.aClass3_Sub7_Sub1_3.method648(Static115.aClass3_Sub7_Sub1_3.anInt964 - local152);
							if (Static9.anInt237 == 2) {
								Static9.anInt237 = 1;
								Static119.aBoolean25 = true;
								Static115.aClass3_Sub7_Sub1_3.method662(220);
								Static115.aClass3_Sub7_Sub1_3.method625(Static68.anInt1720);
								Static115.aClass3_Sub7_Sub1_3.method625(Static9.anInt237);
								Static115.aClass3_Sub7_Sub1_3.method625(Static88.anInt2106);
							}
						}
						if (Static102.anInt2386 == 4 && Static23.anInt737 < 100) {
							local110 = Static35.aClass53_475.method1286();
							Static61.method1094(local110);
						}
						if (Static102.anInt2386 == 5 && Static23.anInt737 > 0) {
							local110 = Static35.aClass53_475.method1286();
							Static57.method1047(local110);
						}
					}
				} else if (Static105.anInt2427 == 1) {
					if (Static20.anInt702 == 85 && Static35.aClass53_479.method1294() > 0) {
						Static35.aClass53_479 = Static35.aClass53_479.method1267(Static35.aClass53_479.method1294() - 1, 0);
						Static52.aBoolean50 = true;
					}
					if (Static51.method944(Static122.anInt2839) && Static35.aClass53_479.method1294() < 10) {
						Static35.aClass53_479 = Static35.aClass53_479.method1261(Static122.anInt2839);
						Static52.aBoolean50 = true;
					}
					if (Static20.anInt702 == 84) {
						if (Static35.aClass53_479.method1294() > 0) {
							local152 = 0;
							if (Static35.aClass53_479.method1272()) {
								local152 = Static35.aClass53_479.method1271();
							}
							Static115.aClass3_Sub7_Sub1_3.method662(130);
							Static115.aClass3_Sub7_Sub1_3.method642(local152);
						}
						Static105.anInt2427 = 0;
						Static52.aBoolean50 = true;
					}
				} else if (Static105.anInt2427 == 2) {
					if (Static20.anInt702 == 85 && Static35.aClass53_479.method1294() > 0) {
						Static35.aClass53_479 = Static35.aClass53_479.method1267(Static35.aClass53_479.method1294() - 1, 0);
						Static52.aBoolean50 = true;
					}
					if ((Static53.method1445(Static122.anInt2839) || Static122.anInt2839 == 32) && Static35.aClass53_479.method1294() < 12) {
						Static35.aClass53_479 = Static35.aClass53_479.method1261(Static122.anInt2839);
						Static52.aBoolean50 = true;
					}
					if (Static20.anInt702 == 84) {
						if (Static35.aClass53_479.method1294() > 0) {
							Static115.aClass3_Sub7_Sub1_3.method662(132);
							Static115.aClass3_Sub7_Sub1_3.method633(Static35.aClass53_479.method1286());
						}
						Static105.anInt2427 = 0;
						Static52.aBoolean50 = true;
					}
				} else if (Static105.anInt2427 == 3) {
					if (Static20.anInt702 == 85 && Static35.aClass53_479.method1294() > 0) {
						Static35.aClass53_479 = Static35.aClass53_479.method1267(Static35.aClass53_479.method1294() - 1, 0);
						Static52.aBoolean50 = true;
					}
					if (Static96.method1030(Static122.anInt2839) && Static35.aClass53_479.method1294() < 40) {
						Static35.aClass53_479 = Static35.aClass53_479.method1261(Static122.anInt2839);
						Static52.aBoolean50 = true;
					}
				} else if (Static105.anInt2427 == 4) {
					if (Static20.anInt702 == 85 && Static35.aClass53_479.method1294() > 0) {
						Static35.aClass53_479 = Static35.aClass53_479.method1267(Static35.aClass53_479.method1294() - 1, 0);
						Static52.aBoolean50 = true;
					}
					if ((Static96.method1030(Static122.anInt2839) || Static122.anInt2839 == 32) && Static35.aClass53_479.method1294() < 80) {
						Static35.aClass53_479 = Static35.aClass53_479.method1261(Static122.anInt2839);
						Static52.aBoolean50 = true;
					}
					if (Static20.anInt702 == 84) {
						if (Static35.aClass53_479.method1294() > 0) {
							Static115.aClass3_Sub7_Sub1_3.method662(131);
							Static115.aClass3_Sub7_Sub1_3.method625(Static35.aClass53_479.method1294() + 1);
							Static115.aClass3_Sub7_Sub1_3.method598(Static35.aClass53_479);
						}
						Static105.anInt2427 = 0;
						Static52.aBoolean50 = true;
					}
				} else if (Static123.anInt2865 == -1 && Static123.anInt2858 == -1) {
					if (Static95.anInt2276 != 0 || Static105.anInt2436 > 1) {
						Static107.method1720();
					}
					if (Static20.anInt702 == 85 && Static35.aClass53_469.method1294() > 0) {
						Static35.aClass53_469 = Static35.aClass53_469.method1267(Static35.aClass53_469.method1294() - 1, 0);
						Static52.aBoolean50 = true;
					}
					if (Static96.method1030(Static122.anInt2839) && Static35.aClass53_469.method1294() < 80) {
						Static35.aClass53_469 = Static35.aClass53_469.method1261(Static122.anInt2839);
						Static52.aBoolean50 = true;
					}
					if (Static20.anInt702 == 84 && Static35.aClass53_469.method1294() > 0) {
						if (Static95.anInt2276 != 0 || Static105.anInt2436 > 1) {
							Static107.aClass53Array18[Static100.anInt2360++] = Static35.aClass53_469;
							if (Static100.anInt2360 >= 20) {
								Static100.anInt2360 = 0;
							}
							Static76.anInt1896 = -1;
						}
						if (Static105.anInt2436 == 2) {
							if (Static35.aClass53_469.method1282(Static65.aClass53_739)) {
								System.gc();
							}
							if (Static35.aClass53_469.method1282(Static102.aClass53_1166)) {
								Static113.method1804();
							}
							if (Static35.aClass53_469.method1282(Static22.aClass53_276)) {
								Static102.aBoolean102 = true;
							}
							if (Static35.aClass53_469.method1282(Static61.aClass53_705)) {
								Static102.aBoolean102 = false;
							}
							if (Static35.aClass53_469.method1282(Static25.aClass53_332)) {
								for (local152 = 0; local152 < 4; local152++) {
									for (@Pc(450) int local450 = 1; local450 < 103; local450++) {
										for (@Pc(454) int local454 = 1; local454 < 103; local454++) {
											Static90.aClass9Array1[local152].anIntArrayArray1[local450][local454] = 0;
										}
									}
								}
							}
							if (Static35.aClass53_469.method1282(Static46.aClass53_1437) && Static95.anInt2276 == 2) {
								throw new RuntimeException();
							}
							if (Static35.aClass53_469.method1282(Static99.aClass53_1139)) {
								Static102.aBoolean101 = true;
							}
						}
						if (Static35.aClass53_469.method1291(Static91.aClass53_1052)) {
							Static115.aClass3_Sub7_Sub1_3.method662(216);
							Static115.aClass3_Sub7_Sub1_3.method625(Static35.aClass53_469.method1294() - 1);
							Static115.aClass3_Sub7_Sub1_3.method598(Static35.aClass53_469.method1289(2));
						} else {
							@Pc(507) byte local507 = 0;
							@Pc(511) Class53 local511 = Static35.aClass53_469.method1269();
							if (local511.method1291(Static43.aClass53_553)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static43.aClass53_553.method1294());
								local507 = 0;
							} else if (local511.method1291(Static49.aClass53_619)) {
								local507 = 1;
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static49.aClass53_619.method1294());
							} else if (local511.method1291(Static118.aClass53_1370)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static118.aClass53_1370.method1294());
								local507 = 2;
							} else if (local511.method1291(Static102.aClass53_1167)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static102.aClass53_1167.method1294());
								local507 = 3;
							} else if (local511.method1291(Static79.aClass53_891)) {
								local507 = 4;
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static79.aClass53_891.method1294());
							} else if (local511.method1291(Static98.aClass53_1131)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static98.aClass53_1131.method1294());
								local507 = 5;
							} else if (local511.method1291(Static95.aClass53_1092)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static95.aClass53_1092.method1294());
								local507 = 6;
							} else if (local511.method1291(Static109.aClass53_1264)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static109.aClass53_1264.method1294());
								local507 = 7;
							} else if (local511.method1291(Static124.aClass53_1443)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static124.aClass53_1443.method1294());
								local507 = 8;
							} else if (local511.method1291(Static72.aClass53_812)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static72.aClass53_812.method1294());
								local507 = 9;
							} else if (local511.method1291(Static90.aClass53_1029)) {
								local507 = 10;
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static90.aClass53_1029.method1294());
							} else if (local511.method1291(Static75.aClass53_839)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static75.aClass53_839.method1294());
								local507 = 11;
							} else if (Static87.anInt2095 != 0) {
								if (local511.method1291(Static43.aClass53_549)) {
									local507 = 0;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static43.aClass53_549.method1294());
								} else if (local511.method1291(Static49.aClass53_618)) {
									local507 = 1;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static49.aClass53_618.method1294());
								} else if (local511.method1291(Static118.aClass53_1367)) {
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static118.aClass53_1367.method1294());
									local507 = 2;
								} else if (local511.method1291(Static102.aClass53_1165)) {
									local507 = 3;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static102.aClass53_1165.method1294());
								} else if (local511.method1291(Static79.aClass53_890)) {
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static79.aClass53_890.method1294());
									local507 = 4;
								} else if (local511.method1291(Static98.aClass53_1116)) {
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static98.aClass53_1116.method1294());
									local507 = 5;
								} else if (local511.method1291(Static95.aClass53_1090)) {
									local507 = 6;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static95.aClass53_1090.method1294());
								} else if (local511.method1291(Static109.aClass53_1259)) {
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static109.aClass53_1259.method1294());
									local507 = 7;
								} else if (local511.method1291(Static124.aClass53_1444)) {
									local507 = 8;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static124.aClass53_1444.method1294());
								} else if (local511.method1291(Static72.aClass53_816)) {
									local507 = 9;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static72.aClass53_816.method1294());
								} else if (local511.method1291(Static90.aClass53_1030)) {
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static90.aClass53_1030.method1294());
									local507 = 10;
								} else if (local511.method1291(Static75.aClass53_840)) {
									local507 = 11;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static75.aClass53_840.method1294());
								}
							}
							local511 = Static35.aClass53_469.method1269();
							@Pc(908) byte local908 = 0;
							if (local511.method1291(Static98.aClass53_1132)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static98.aClass53_1132.method1294());
								local908 = 1;
							} else if (local511.method1291(aClass53_51)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(aClass53_51.method1294());
								local908 = 2;
							} else if (local511.method1291(Static104.aClass53_1279)) {
								local908 = 3;
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static104.aClass53_1279.method1294());
							} else if (local511.method1291(Static19.aClass53_1203)) {
								local908 = 4;
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static19.aClass53_1203.method1294());
							} else if (local511.method1291(Static87.aClass53_1000)) {
								Static35.aClass53_469 = Static35.aClass53_469.method1289(Static87.aClass53_1000.method1294());
								local908 = 5;
							} else if (Static87.anInt2095 != 0) {
								if (local511.method1291(Static98.aClass53_1117)) {
									local908 = 1;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static98.aClass53_1117.method1294());
								} else if (local511.method1291(aClass53_53)) {
									Static35.aClass53_469 = Static35.aClass53_469.method1289(aClass53_53.method1294());
									local908 = 2;
								} else if (local511.method1291(Static104.aClass53_1282)) {
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static104.aClass53_1282.method1294());
									local908 = 3;
								} else if (local511.method1291(Static19.aClass53_1207)) {
									local908 = 4;
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static19.aClass53_1207.method1294());
								} else if (local511.method1291(Static87.aClass53_998)) {
									Static35.aClass53_469 = Static35.aClass53_469.method1289(Static87.aClass53_998.method1294());
									local908 = 5;
								}
							}
							Static115.aClass3_Sub7_Sub1_3.method662(206);
							Static115.aClass3_Sub7_Sub1_3.method625(0);
							@Pc(1079) int local1079 = Static115.aClass3_Sub7_Sub1_3.anInt964;
							Static115.aClass3_Sub7_Sub1_3.method625(local507);
							Static115.aClass3_Sub7_Sub1_3.method625(local908);
							Static62.method1108(Static35.aClass53_469, Static115.aClass3_Sub7_Sub1_3);
							Static115.aClass3_Sub7_Sub1_3.method648(Static115.aClass3_Sub7_Sub1_3.anInt964 - local1079);
							if (Static68.anInt1720 == 2) {
								Static119.aBoolean25 = true;
								Static68.anInt1720 = 3;
								Static115.aClass3_Sub7_Sub1_3.method662(220);
								Static115.aClass3_Sub7_Sub1_3.method625(Static68.anInt1720);
								Static115.aClass3_Sub7_Sub1_3.method625(Static9.anInt237);
								Static115.aClass3_Sub7_Sub1_3.method625(Static88.anInt2106);
							}
						}
						Static52.aBoolean50 = true;
						Static35.aClass53_469 = Static35.aClass53_476;
					}
				}
			}
		}
	}
}
