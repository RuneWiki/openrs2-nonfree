import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!v", name = "F", descriptor = "I")
	public static int anInt2776;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "I")
	public static int anInt2787;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Lclient!cb;")
	public static Class12 aClass12_26 = new Class12(100);

	@OriginalMember(owner = "client!v", name = "T", descriptor = "Lclient!od;")
	public static Class60 aClass60_1083 = Static41.method597(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Lclient!od;")
	private static Class60 aClass60_1084 = Static41.method597("Unexpected server response");

	@OriginalMember(owner = "client!v", name = "V", descriptor = "Lclient!od;")
	public static Class60 aClass60_1085 = aClass60_1084;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	public static void method1913() {
		aClass12_26 = null;
		aClass60_1084 = null;
		aClass60_1085 = null;
		aClass60_1083 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Z")
	public static boolean method1914(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!me;Lclient!me;Z)V")
	public static void method1915(@OriginalArg(0) Class4_Sub3_Sub6_Sub1_Sub1 arg0, @OriginalArg(1) Class4_Sub3_Sub6_Sub1_Sub1 arg1) {
		if (Static51.aClass4_Sub3_Sub6_Sub3Array7 == null) {
			Static51.aClass4_Sub3_Sub6_Sub3Array7 = Static36.method562(Static68.aClass60_674, Static6.aClass60_39, Static16.aClass10_Sub1_4);
		}
		if (Static107.aClass4_Sub3_Sub6_Sub2Array10 == null) {
			Static107.aClass4_Sub3_Sub6_Sub2Array10 = Static82.method1299(Static75.aClass60_464, Static16.aClass10_Sub1_4, Static68.aClass60_674);
		}
		if (Static107.aClass4_Sub3_Sub6_Sub2Array9 == null) {
			Static107.aClass4_Sub3_Sub6_Sub2Array9 = Static82.method1299(Static31.aClass60_313, Static16.aClass10_Sub1_4, Static68.aClass60_674);
		}
		if (Static74.aClass4_Sub3_Sub6_Sub2Array8 == null) {
			Static74.aClass4_Sub3_Sub6_Sub2Array8 = Static82.method1299(Static23.aClass60_248, Static16.aClass10_Sub1_4, Static68.aClass60_674);
		}
		Static34.method1649(0, 23, 765, 480, 0);
		Static34.method1657(0, 0, 125, 23, 12425273, 9135624);
		Static34.method1657(125, 0, 640, 23, 5197647, 2697513);
		arg1.method1202(Static8.aClass60_61, 62, 15, 0, -1);
		if (Static74.aClass4_Sub3_Sub6_Sub2Array8 != null) {
			Static74.aClass4_Sub3_Sub6_Sub2Array8[1].method1558(140, 1);
			arg0.method1204(Static123.aClass60_1095, 152, 10, 16777215, -1);
			Static74.aClass4_Sub3_Sub6_Sub2Array8[0].method1558(140, 12);
			arg0.method1204(Static48.aClass60_445, 152, 21, 16777215, -1);
		}
		if (Static107.aClass4_Sub3_Sub6_Sub2Array9 != null) {
			if (Static63.anIntArray179[0] == 0 && Static3.anIntArray4[0] == 0) {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[2].method1558(280, 4);
			} else {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[0].method1558(280, 4);
			}
			if (Static63.anIntArray179[0] == 0 && Static3.anIntArray4[0] == 1) {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[3].method1558(295, 4);
			} else {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[1].method1558(295, 4);
			}
			arg1.method1204(Static24.aClass60_270, 312, 17, 16777215, -1);
			if (Static63.anIntArray179[0] == 1 && Static3.anIntArray4[0] == 0) {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[2].method1558(390, 4);
			} else {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[0].method1558(390, 4);
			}
			if (Static63.anIntArray179[0] == 1 && Static3.anIntArray4[0] == 1) {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[3].method1558(405, 4);
			} else {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[1].method1558(405, 4);
			}
			arg1.method1204(Static71.aClass60_751, 422, 17, 16777215, -1);
			if (Static63.anIntArray179[0] == 2 && Static3.anIntArray4[0] == 0) {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[2].method1558(500, 4);
			} else {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[0].method1558(500, 4);
			}
			if (Static63.anIntArray179[0] == 2 && Static3.anIntArray4[0] == 1) {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[3].method1558(515, 4);
			} else {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[1].method1558(515, 4);
			}
			arg1.method1204(Static28.aClass60_828, 532, 17, 16777215, -1);
			if (Static63.anIntArray179[0] == 3 && Static3.anIntArray4[0] == 0) {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[2].method1558(610, 4);
			} else {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[0].method1558(610, 4);
			}
			if (Static63.anIntArray179[0] == 3 && Static3.anIntArray4[0] == 1) {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[3].method1558(625, 4);
			} else {
				Static107.aClass4_Sub3_Sub6_Sub2Array9[1].method1558(625, 4);
			}
			arg1.method1204(Static46.aClass60_424, 642, 17, 16777215, -1);
		}
		Static34.method1649(708, 4, 50, 16, 0);
		arg0.method1202(Static119.aClass60_1072, 733, 16, 16777215, -1);
		Static29.anInt894 = -1;
		if (Static51.aClass4_Sub3_Sub6_Sub3Array7 != null) {
			@Pc(395) int local395 = 8;
			@Pc(401) int local401 = 24;
			@Pc(413) int local413;
			@Pc(403) int local403;
			do {
				local403 = local395;
				if ((local395 - 1) * local401 >= Static133.anInt2968) {
					local395--;
				}
				local413 = local401;
				if (Static133.anInt2968 <= (local401 - 1) * local395) {
					local401--;
				}
				if (local395 * (local401 - 1) >= Static133.anInt2968) {
					local401--;
				}
			} while (local413 != local401 || local395 != local403);
			local403 = (480 - local401 * 19) / (local401 + 1);
			local413 = (765 - local395 * 88) / (local395 + 1);
			if (local403 > 5) {
				local403 = 5;
			}
			if (local413 > 5) {
				local413 = 5;
			}
			@Pc(490) int local490 = (480 - (local401 - 1) * local403 - local401 * 19) / 2;
			@Pc(492) int local492 = 0;
			@Pc(496) int local496 = local490 + 23;
			@Pc(512) int local512 = (765 - (local395 - 1) * local413 - local395 * 88) / 2;
			@Pc(514) int local514 = local512;
			for (@Pc(516) int local516 = 0; local516 < Static133.anInt2968; local516++) {
				@Pc(522) Class22 local522 = Static77.aClass22Array1[local516];
				@Pc(527) Class60 local527 = Static65.method1051(local522.anInt916);
				@Pc(529) boolean local529 = true;
				if (local522.anInt916 == -1) {
					local527 = Static29.aClass60_307;
					local529 = false;
				} else if (local522.anInt916 > 1980) {
					local527 = Static23.aClass60_252;
					local529 = false;
				}
				if (Static36.anInt1006 >= local514 && local496 <= Static85.anInt2015 && local514 + 88 > Static36.anInt1006 && local496 + 19 > Static85.anInt2015 && local529) {
					Static29.anInt894 = local516;
					Static51.aClass4_Sub3_Sub6_Sub3Array7[local522.aBoolean37 ? 1 : 0].method1610(local514, local496);
				} else {
					Static51.aClass4_Sub3_Sub6_Sub3Array7[local522.aBoolean37 ? 1 : 0].method1629(local514, local496);
				}
				if (Static107.aClass4_Sub3_Sub6_Sub2Array10 != null) {
					Static107.aClass4_Sub3_Sub6_Sub2Array10[local522.anInt914 + (local522.aBoolean37 ? 8 : 0)].method1558(local514 + 29, local496);
				}
				arg1.method1202(Static65.method1051(local522.anInt915), local514 + 15, 5 + 9 + local496, 0, -1);
				arg0.method1202(local527, local514 + 60, local496 + 9 + 5, 268435455, -1);
				local496 += local403 + 19;
				local492++;
				if (local492 >= local401) {
					local492 = 0;
					local496 = local490 + 23;
					local514 += local413 + 88;
				}
			}
		}
		try {
			@Pc(688) Graphics local688 = Static110.aCanvas1.getGraphics();
			Static86.aClass14_1.method690(local688);
		} catch (@Pc(696) Exception local696) {
			Static110.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	public static void method1916() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
	public static void method1917(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class4_Sub8 local6 = (Class4_Sub8) Static128.aClass75_14.method1897(); local6 != null; local6 = (Class4_Sub8) Static128.aClass75_14.method1891()) {
			if ((long) arg0 == (local6.aLong100 >> 48 & 0xFFFFL)) {
				local6.method1989();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method1918() {
		if (Static48.anInt1175 > 0) {
			Static48.anInt1175--;
		}
		if (Static16.anInt552 > 1) {
			Static16.anInt552--;
		}
		if (Static66.aBoolean59) {
			Static66.aBoolean59 = false;
			Static116.method1880();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static54.method869(); local27++) {
		}
		if (Static120.anInt2757 != 30) {
			return;
		}
		Static105.method1731(Static14.aClass4_Sub9_Sub1_1);
		@Pc(49) Object local49 = Static35.aClass25_1.anObject1;
		@Pc(81) int local81;
		@Pc(83) int local83;
		@Pc(85) int local85;
		@Pc(101) int local101;
		@Pc(123) int local123;
		synchronized (Static35.aClass25_1.anObject1) {
			if (!Static125.aBoolean122) {
				Static35.aClass25_1.anInt1061 = 0;
			} else if (Static97.anInt2284 != 0 || Static35.aClass25_1.anInt1061 >= 40) {
				Static14.aClass4_Sub9_Sub1_1.method826(58);
				Static14.aClass4_Sub9_Sub1_1.method819(0);
				local81 = Static14.aClass4_Sub9_Sub1_1.anInt1312;
				local83 = 0;
				for (local85 = 0; Static35.aClass25_1.anInt1061 > local85 && Static14.aClass4_Sub9_Sub1_1.anInt1312 - local81 < 240; local85++) {
					local101 = Static35.aClass25_1.anIntArray110[local85];
					local83++;
					if (local101 < 0) {
						local101 = 0;
					} else if (local101 > 502) {
						local101 = 502;
					}
					local123 = Static35.aClass25_1.anIntArray111[local85];
					if (local123 < 0) {
						local123 = 0;
					} else if (local123 > 764) {
						local123 = 764;
					}
					@Pc(140) int local140 = local123 + local101 * 765;
					if (Static35.aClass25_1.anIntArray110[local85] == -1 && Static35.aClass25_1.anIntArray111[local85] == -1) {
						local101 = -1;
						local140 = 524287;
						local123 = -1;
					}
					if (Static125.anInt2828 != local123 || local101 != Static77.anInt1877) {
						@Pc(189) int local189 = local101 - Static77.anInt1877;
						Static77.anInt1877 = local101;
						@Pc(196) int local196 = local123 - Static125.anInt2828;
						Static125.anInt2828 = local123;
						if (Static39.anInt1046 < 8 && local196 >= -32 && local196 <= 31 && local189 >= -32 && local189 <= 31) {
							local189 += 32;
							local196 += 32;
							Static14.aClass4_Sub9_Sub1_1.method786((Static39.anInt1046 << 12) + (local196 << 6) + local189);
							Static39.anInt1046 = 0;
						} else if (Static39.anInt1046 < 8) {
							Static14.aClass4_Sub9_Sub1_1.method799(local140 + (Static39.anInt1046 << 19) + 8388608);
							Static39.anInt1046 = 0;
						} else {
							Static14.aClass4_Sub9_Sub1_1.method808(local140 + (Static39.anInt1046 << 19) - 1073741824);
							Static39.anInt1046 = 0;
						}
					} else if (Static39.anInt1046 < 2047) {
						Static39.anInt1046++;
					}
				}
				Static14.aClass4_Sub9_Sub1_1.method817(Static14.aClass4_Sub9_Sub1_1.anInt1312 - local81);
				if (local83 >= Static35.aClass25_1.anInt1061) {
					Static35.aClass25_1.anInt1061 = 0;
				} else {
					Static35.aClass25_1.anInt1061 -= local83;
					for (local101 = 0; local101 < Static35.aClass25_1.anInt1061; local101++) {
						Static35.aClass25_1.anIntArray111[local101] = Static35.aClass25_1.anIntArray111[local101 + local83];
						Static35.aClass25_1.anIntArray110[local101] = Static35.aClass25_1.anIntArray110[local101 + local83];
					}
				}
			}
		}
		if (Static97.anInt2284 != 0) {
			@Pc(352) long local352 = (Static96.aLong75 - Static109.aLong85) / 50L;
			Static109.aLong85 = Static96.aLong75;
			if (local352 > 4095L) {
				local352 = 4095L;
			}
			local83 = Static122.anInt2791;
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 764) {
				local83 = 764;
			}
			local81 = Static63.anInt1591;
			local123 = (int) local352;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > 502) {
				local81 = 502;
			}
			local85 = local81 * 765 + local83;
			@Pc(406) byte local406 = 0;
			if (Static97.anInt2284 == 2) {
				local406 = 1;
			}
			Static14.aClass4_Sub9_Sub1_1.method826(43);
			Static14.aClass4_Sub9_Sub1_1.method820(local85 + (local406 << 19) + (local123 << 20));
		}
		if (Static25.aBooleanArray4[96] || Static25.aBooleanArray4[97] || Static25.aBooleanArray4[98] || Static25.aBooleanArray4[99]) {
			Static21.aBoolean32 = true;
		}
		if (Static32.anInt940 > 0) {
			Static32.anInt940--;
		}
		if (Static21.aBoolean32 && Static32.anInt940 <= 0) {
			Static21.aBoolean32 = false;
			Static32.anInt940 = 20;
			Static14.aClass4_Sub9_Sub1_1.method826(73);
			Static14.aClass4_Sub9_Sub1_1.method772(Static48.anInt1174);
			Static14.aClass4_Sub9_Sub1_1.method796(Static79.anInt1896);
		}
		if (Static97.aBoolean83 && !Static33.aBoolean38) {
			Static33.aBoolean38 = true;
			Static14.aClass4_Sub9_Sub1_1.method826(83);
			Static14.aClass4_Sub9_Sub1_1.method819(1);
		}
		if (!Static97.aBoolean83 && Static33.aBoolean38) {
			Static33.aBoolean38 = false;
			Static14.aClass4_Sub9_Sub1_1.method826(83);
			Static14.aClass4_Sub9_Sub1_1.method819(0);
		}
		Static22.method416();
		if (Static120.anInt2757 != 30) {
			return;
		}
		Static26.method452();
		Static49.method683();
		Static98.anInt2287++;
		if (Static98.anInt2287 > 750) {
			Static116.method1880();
			return;
		}
		Static32.method495();
		Static14.method288();
		Static4.method50();
		if (Static69.anInt1722 != 0) {
			Static66.anInt1659 += 20;
			if (Static66.anInt1659 >= 400) {
				Static69.anInt1722 = 0;
			}
		}
		Static116.anInt2713++;
		if (Static23.aClass4_Sub14_5 != null) {
			Static66.anInt1661++;
			if (Static66.anInt1661 >= 15) {
				Static36.method558(Static23.aClass4_Sub14_5);
				Static23.aClass4_Sub14_5 = null;
			}
		}
		@Pc(687) Class4_Sub14 local687;
		if (Static75.aClass4_Sub14_9 != null) {
			Static36.method558(Static75.aClass4_Sub14_9);
			if (Static90.anInt2122 + 5 < Static36.anInt1006 || Static36.anInt1006 < Static90.anInt2122 - 5 || Static16.anInt553 + 5 < Static85.anInt2015 || Static16.anInt553 - 5 > Static85.anInt2015) {
				Static74.aBoolean65 = true;
			}
			Static120.anInt2753++;
			if (Static24.anInt834 == 0) {
				if (Static74.aBoolean65 && Static120.anInt2753 >= 5) {
					if (Static72.aClass4_Sub14_11 == Static75.aClass4_Sub14_9 && Static46.anInt1139 != Static69.anInt1721) {
						local687 = Static75.aClass4_Sub14_9;
						@Pc(689) byte local689 = 0;
						if (Static85.anInt2017 == 1 && local687.anInt2432 == 206) {
							local689 = 1;
						}
						if (local687.anIntArray312[Static46.anInt1139] <= 0) {
							local689 = 0;
						}
						if (Static40.method584(Static38.method575(local687))) {
							local81 = Static69.anInt1721;
							local83 = Static46.anInt1139;
							local687.anIntArray312[local83] = local687.anIntArray312[local81];
							local687.anIntArray311[local83] = local687.anIntArray311[local81];
							local687.anIntArray312[local81] = -1;
							local687.anIntArray311[local81] = 0;
						} else if (local689 == 1) {
							local81 = Static69.anInt1721;
							local83 = Static46.anInt1139;
							while (local83 != local81) {
								if (local83 < local81) {
									local687.method1690(local81, local81 - 1);
									local81--;
								} else if (local81 < local83) {
									local687.method1690(local81, local81 + 1);
									local81++;
								}
							}
						} else {
							local687.method1690(Static69.anInt1721, Static46.anInt1139);
						}
						Static14.aClass4_Sub9_Sub1_1.method826(124);
						Static14.aClass4_Sub9_Sub1_1.method786(Static69.anInt1721);
						Static14.aClass4_Sub9_Sub1_1.method781(Static75.aClass4_Sub14_9.anInt2388);
						Static14.aClass4_Sub9_Sub1_1.method819(local689);
						Static14.aClass4_Sub9_Sub1_1.method803(Static46.anInt1139);
					}
				} else if ((Static18.anInt630 == 1 || Static132.method1987(Static48.anInt1184 - 1)) && Static48.anInt1184 > 2) {
					Static84.method1351();
				} else if (Static48.anInt1184 > 0) {
					Static96.method1570(Static48.anInt1184 - 1);
				}
				Static97.anInt2284 = 0;
				Static66.anInt1661 = 10;
				Static75.aClass4_Sub14_9 = null;
			}
		}
		Static115.aBoolean116 = false;
		Static14.aBoolean18 = false;
		Static50.anInt1437 = 0;
		Static31.aClass4_Sub14_7 = null;
		local687 = Static18.aClass4_Sub14_4;
		@Pc(840) Class4_Sub14 local840 = Static128.aClass4_Sub14_16;
		Static128.aClass4_Sub14_16 = null;
		Static18.aClass4_Sub14_4 = null;
		while (Static43.method621() && Static50.anInt1437 < 128) {
			Static99.anIntArray75[Static50.anInt1437] = Static81.anInt1917;
			Static31.anIntArray94[Static50.anInt1437] = Static9.anInt136;
			Static50.anInt1437++;
		}
		Static5.method56(Static52.anInt1452, 0, 503, 765, 0, 0, 0);
		Static87.anInt2052++;
		while (true) {
			@Pc(884) Class4_Sub21 local884;
			@Pc(897) Class4_Sub14 local897;
			@Pc(889) Class4_Sub14 local889;
			do {
				local884 = (Class4_Sub21) Static47.aClass45_8.method995();
				if (local884 == null) {
					while (true) {
						do {
							local884 = (Class4_Sub21) Static21.aClass45_3.method995();
							if (local884 == null) {
								while (true) {
									do {
										local884 = (Class4_Sub21) Static25.aClass45_5.method995();
										if (local884 == null) {
											if (Static81.aClass4_Sub14_12 != null) {
												Static78.method1271();
											}
											if (Static64.anInt1625 != -1) {
												local81 = Static64.anInt1625;
												local83 = Static64.anInt1610;
												@Pc(1047) boolean local1047 = Static36.method564(local83, 0, 0, 0, true, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local81, 0);
												Static64.anInt1625 = -1;
												if (local1047) {
													Static115.anInt2693 = Static63.anInt1591;
													Static66.anInt1659 = 0;
													Static69.anInt1722 = 1;
													Static24.anInt833 = Static122.anInt2791;
												}
											}
											Static9.method92();
											if (local687 != Static18.aClass4_Sub14_4) {
												if (local687 != null) {
													Static36.method558(local687);
												}
												if (Static18.aClass4_Sub14_4 != null) {
													Static36.method558(Static18.aClass4_Sub14_4);
												}
											}
											if (Static128.aClass4_Sub14_16 != local840 && Static123.anInt2794 == Static129.anInt1202) {
												if (local840 != null) {
													Static36.method558(local840);
												}
												if (Static128.aClass4_Sub14_16 != null) {
													Static36.method558(Static128.aClass4_Sub14_16);
												}
											}
											if (Static128.aClass4_Sub14_16 == null) {
												if (Static129.anInt1202 > 0) {
													Static129.anInt1202--;
												}
											} else if (Static129.anInt1202 < Static123.anInt2794) {
												Static129.anInt1202++;
												if (Static129.anInt1202 == Static123.anInt2794) {
													Static36.method558(Static128.aClass4_Sub14_16);
												}
											}
											Static22.method423();
											if (Static67.aBoolean60) {
												Static38.method574();
											}
											for (local81 = 0; local81 < 5; local81++) {
												@Pc(1134) int local1134 = Static118.anIntArray337[local81]++;
											}
											local83 = Static41.method594();
											local85 = Static68.method1095();
											if (local83 > 4500 && local85 > 4500) {
												Static48.anInt1175 = 250;
												Static22.method419(4000);
												Static14.aClass4_Sub9_Sub1_1.method826(35);
											}
											Static47.anInt1150++;
											if (Static47.anInt1150 > 500) {
												Static47.anInt1150 = 0;
												local101 = (int) (Math.random() * 8.0D);
												if ((local101 & 0x1) == 1) {
													Static12.anInt2546 += Static40.anInt1056;
												}
												if ((local101 & 0x4) == 4) {
													Static130.anInt2896 += Static9.anInt106;
												}
												if ((local101 & 0x2) == 2) {
													Static50.anInt1418 += Static86.anInt2031;
												}
											}
											Static68.anInt1697++;
											if (Static130.anInt2896 < -40) {
												Static9.anInt106 = 1;
											}
											if (Static68.anInt1697 > 500) {
												local101 = (int) (Math.random() * 8.0D);
												Static68.anInt1697 = 0;
												if ((local101 & 0x2) == 2) {
													Static116.anInt2717 += Static72.anInt1826;
												}
												if ((local101 & 0x1) == 1) {
													Static62.anInt1585 += Static38.anInt1041;
												}
											}
											if (Static130.anInt2896 > 40) {
												Static9.anInt106 = -1;
											}
											if (Static116.anInt2717 < -20) {
												Static72.anInt1826 = 1;
											}
											Static117.anInt2722++;
											if (Static62.anInt1585 < -60) {
												Static38.anInt1041 = 2;
											}
											if (Static50.anInt1418 < -55) {
												Static86.anInt2031 = 2;
											}
											if (Static62.anInt1585 > 60) {
												Static38.anInt1041 = -2;
											}
											if (Static12.anInt2546 < -50) {
												Static40.anInt1056 = 2;
											}
											if (Static50.anInt1418 > 55) {
												Static86.anInt2031 = -2;
											}
											if (Static116.anInt2717 > 10) {
												Static72.anInt1826 = -1;
											}
											if (Static12.anInt2546 > 50) {
												Static40.anInt1056 = -2;
											}
											if (Static117.anInt2722 > 50) {
												Static14.aClass4_Sub9_Sub1_1.method826(164);
											}
											try {
												if (Static72.aClass37_6 != null && Static14.aClass4_Sub9_Sub1_1.anInt1312 > 0) {
													Static72.aClass37_6.method875(Static14.aClass4_Sub9_Sub1_1.anInt1312, Static14.aClass4_Sub9_Sub1_1.aByteArray6);
													Static117.anInt2722 = 0;
													Static14.aClass4_Sub9_Sub1_1.anInt1312 = 0;
													return;
												}
												return;
											} catch (@Pc(1353) IOException local1353) {
												Static116.method1880();
												return;
											}
										}
										local889 = local884.aClass4_Sub14_14;
										if (local889.anInt2403 < 0) {
											break;
										}
										local897 = Static61.method991(local889.anInt2397);
									} while (local897 == null || local897.aClass4_Sub14Array3 == null || local897.aClass4_Sub14Array3.length <= local889.anInt2403 || local897.aClass4_Sub14Array3[local889.anInt2403] != local889);
									Static28.method1353(local884);
								}
							}
							local889 = local884.aClass4_Sub14_14;
							if (local889.anInt2403 < 0) {
								break;
							}
							local897 = Static61.method991(local889.anInt2397);
						} while (local897 == null || local897.aClass4_Sub14Array3 == null || local889.anInt2403 >= local897.aClass4_Sub14Array3.length || local889 != local897.aClass4_Sub14Array3[local889.anInt2403]);
						Static28.method1353(local884);
					}
				}
				local889 = local884.aClass4_Sub14_14;
				if (local889.anInt2403 < 0) {
					break;
				}
				local897 = Static61.method991(local889.anInt2397);
			} while (local897 == null || local897.aClass4_Sub14Array3 == null || local889.anInt2403 >= local897.aClass4_Sub14Array3.length || local897.aClass4_Sub14Array3[local889.anInt2403] != local889);
			Static28.method1353(local884);
		}
	}
}
