import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Lclient!hb;")
	private static Class27 aClass27_125 = Static87.method1648("Loaded title screen");

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!hb;")
	public static Class27 aClass27_124 = aClass27_125;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public static int anInt262 = 0;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Lclient!fc;")
	public static Class21 aClass21_9 = new Class21(500);

	@OriginalMember(owner = "client!c", name = "z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_126 = Static87.method1648("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!c", name = "L", descriptor = "Lclient!hb;")
	private static Class27 aClass27_133 = Static87.method1648("Invalid username or password)3");

	@OriginalMember(owner = "client!c", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_127 = aClass27_133;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	public static int anInt267 = 0;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "Lclient!hb;")
	public static Class27 aClass27_128 = Static87.method1648("Offline");

	@OriginalMember(owner = "client!c", name = "P", descriptor = "Lclient!hb;")
	private static Class27 aClass27_135 = Static87.method1648("Prepared sound engine");

	@OriginalMember(owner = "client!c", name = "D", descriptor = "Lclient!hb;")
	public static Class27 aClass27_129 = aClass27_135;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "Lclient!hb;")
	public static Class27 aClass27_130 = null;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "I")
	public static int anInt268 = 0;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "Lclient!hb;")
	public static Class27 aClass27_131 = Static87.method1648("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!c", name = "H", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "I")
	public static int anInt269 = 0;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!hb;")
	public static Class27 aClass27_132 = Static87.method1648("Name eingeben:");

	@OriginalMember(owner = "client!c", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!c", name = "M", descriptor = "I")
	public static int anInt270 = 0;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!hb;")
	public static Class27 aClass27_134 = Static87.method1648("System)2Update in: ");

	@OriginalMember(owner = "client!c", name = "O", descriptor = "[I")
	public static int[] anIntArray50 = new int[128];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BILclient!m;)I")
	public static int method229(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3_Sub6 arg1) {
		if (arg1.anIntArrayArray46 == null || arg0 >= arg1.anIntArrayArray46.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray46[arg0];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local24++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local22;
				}
				if (local36 == 1) {
					local38 = Static17.anIntArray59[local20[local24++]];
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 2) {
					local38 = Static109.anIntArray325[local20[local24++]];
				}
				if (local36 == 3) {
					local38 = Static66.anIntArray298[local20[local24++]];
				}
				@Pc(94) int local94;
				@Pc(105) Class3_Sub3_Sub6 local105;
				@Pc(110) int local110;
				@Pc(123) int local123;
				if (local36 == 4) {
					local94 = local20[local24++] << 16;
					@Pc(101) int local101 = local94 + local20[local24++];
					local105 = Static77.method1516(local101);
					local110 = local20[local24++];
					if (local110 != -1 && (!Static37.method696(local110).aBoolean93 || Static83.aBoolean117)) {
						for (local123 = 0; local123 < local105.anIntArray274.length; local123++) {
							if (local105.anIntArray274[local123] == local110 + 1) {
								local38 += local105.anIntArray275[local123];
							}
						}
					}
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 5) {
					local38 = Static18.anIntArray60[local20[local24++]];
				}
				if (local36 == 6) {
					local38 = Class5_Sub1.anIntArray148[Static109.anIntArray325[local20[local24++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static18.anIntArray60[local20[local24++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2438;
				}
				if (local36 == 9) {
					for (local94 = 0; local94 < 25; local94++) {
						if (Static89.aBooleanArray13[local94]) {
							local38 += Static109.anIntArray325[local94];
						}
					}
				}
				if (local36 == 10) {
					local94 = local20[local24++] << 16;
					local94 += local20[local24++];
					local105 = Static77.method1516(local94);
					local110 = local20[local24++];
					if (local110 != -1 && (!Static37.method696(local110).aBoolean93 || Static83.aBoolean117)) {
						for (local123 = 0; local123 < local105.anIntArray274.length; local123++) {
							if (local105.anIntArray274[local123] == local110 + 1) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static96.anInt1720;
				}
				if (local36 == 12) {
					local38 = Static92.anInt2542;
				}
				if (local36 == 13) {
					local94 = Static18.anIntArray60[local20[local24++]];
					@Pc(331) int local331 = local20[local24++];
					local38 = (local94 & 0x1 << local331) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local94 = local20[local24++];
					local38 = Static93.method1749(local94);
				}
				if (local36 == 18) {
					local38 = Static89.anInt2464 + (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 >> 7);
				}
				if (local36 == 19) {
					local38 = Static101.anInt2631 + (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 >> 7);
				}
				if (local36 == 20) {
					local38 = local20[local24++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local22 += local38;
					}
					if (local31 == 1) {
						local22 -= local38;
					}
					if (local31 == 2 && local38 != 0) {
						local22 /= local38;
					}
					if (local31 == 3) {
						local22 *= local38;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(428) Exception local428) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method230() {
		if (Static89.aBoolean121) {
			Static89.aBoolean121 = false;
			Static11.method1872();
			Static13.aBoolean40 = true;
			Static75.aBoolean101 = true;
			Static86.aBoolean116 = true;
			Static89.aBoolean120 = true;
		}
		Static25.method487();
		if (Static12.aBoolean16 && Static22.anInt582 == 1) {
			Static75.aBoolean101 = true;
		}
		@Pc(43) boolean local43;
		if (Static41.anInt1210 != -1) {
			local43 = Static56.method1073(Static41.anInt1210);
			if (local43) {
				Static75.aBoolean101 = true;
			}
		}
		if (Static87.anInt2334 == 2) {
			Static75.aBoolean101 = true;
		}
		if (Static31.anInt805 == 2) {
			Static75.aBoolean101 = true;
		}
		if (Static75.aBoolean101) {
			Static75.aBoolean101 = false;
			Static8.method176();
		}
		@Pc(116) int local116;
		if (Static84.anInt2220 == -1) {
			Static36.aClass3_Sub3_Sub6_1.anInt1618 = Static105.anInt2744 - Static74.anInt2075 - 77;
			if (Static85.anInt2297 > 448 && Static85.anInt2297 < 560 && Static93.anInt2546 > 332) {
				Static97.method1622(Static85.anInt2297 - 17, Static93.anInt2546 + -357, 463, 0, 77, -1, Static105.anInt2744, Static36.aClass3_Sub3_Sub6_1);
			}
			local116 = Static105.anInt2744 - Static36.aClass3_Sub3_Sub6_1.anInt1618 - 77;
			if (local116 < 0) {
				local116 = 0;
			}
			if (local116 > Static105.anInt2744 - 77) {
				local116 = Static105.anInt2744 - 77;
			}
			if (local116 != Static74.anInt2075) {
				Static13.aBoolean40 = true;
				Static74.anInt2075 = local116;
			}
		}
		if (Static84.anInt2220 == -1 && Static68.anInt1744 == 3) {
			Static36.aClass3_Sub3_Sub6_1.anInt1618 = Static85.anInt2296;
			local116 = Static87.anInt2340 * 14 + 7;
			if (Static85.anInt2297 > 448 && Static85.anInt2297 < 560 && Static93.anInt2546 > 332) {
				Static97.method1622(Static85.anInt2297 - 17, Static93.anInt2546 + -357, 463, 0, 77, -1, local116, Static36.aClass3_Sub3_Sub6_1);
			}
			@Pc(183) int local183 = Static36.aClass3_Sub3_Sub6_1.anInt1618;
			if (local183 < 0) {
				local183 = 0;
			}
			if (local116 - 77 < local183) {
				local183 = local116 - 77;
			}
			if (Static85.anInt2296 != local183) {
				Static13.aBoolean40 = true;
				Static85.anInt2296 = local183;
			}
		}
		if (Static84.anInt2220 != -1) {
			local43 = Static56.method1073(Static84.anInt2220);
			if (local43) {
				Static13.aBoolean40 = true;
			}
		}
		if (Static87.anInt2334 == 3) {
			Static13.aBoolean40 = true;
		}
		if (Static31.anInt805 == 3) {
			Static13.aBoolean40 = true;
		}
		if (Static109.aClass27_960 != null) {
			Static13.aBoolean40 = true;
		}
		if (Static12.aBoolean16 && Static22.anInt582 == 2) {
			Static13.aBoolean40 = true;
		}
		if (Static13.aBoolean40) {
			Static13.aBoolean40 = false;
			Static18.method320();
		}
		Static50.method984();
		if (Static1.anInt8 != -1) {
			Static86.aBoolean116 = true;
		}
		if (Static86.aBoolean116) {
			if (Static1.anInt8 != -1 && Static34.anInt825 == Static1.anInt8) {
				Static1.anInt8 = -1;
				Static78.aClass3_Sub11_Sub1_3.method1478(64);
				Static78.aClass3_Sub11_Sub1_3.method1443(Static34.anInt825);
			}
			Static55.aBoolean74 = true;
			Static86.aBoolean116 = false;
			Static25.method489(Static34.anInt825, Static41.anInt1210 == -1, Static2.anInt38 % 20 < 10 ? -1 : Static1.anInt8, Static91.anIntArray372);
		}
		if (Static89.aBoolean120) {
			Static55.aBoolean74 = true;
			Static89.aBoolean120 = false;
			Static24.method480(Static61.anInt1554, Static88.aClass3_Sub3_Sub2_Sub1_2, Static76.anInt2134, Static34.anInt828);
		}
		method234(Static39.anInt989, Static68.anInt1747, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399);
		Static39.anInt989 = 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method231() {
		if (Static61.anInt1553 < 2 && Static42.anInt1235 == 0 && Static39.anInt964 == 0) {
			return;
		}
		@Pc(56) Class27 local56;
		if (Static42.anInt1235 == 1 && Static61.anInt1553 < 2) {
			local56 = Static98.method1779(new Class27[] { Static8.aClass27_115, Static13.aClass27_380, Static81.aClass27_1046, Static24.aClass27_321 });
		} else if (Static39.anInt964 == 1 && Static61.anInt1553 < 2) {
			local56 = Static98.method1779(new Class27[] { aClass27_130, Static13.aClass27_380, Static16.aClass27_189, Static24.aClass27_321 });
		} else {
			local56 = Static55.aClass27Array9[Static61.anInt1553 - 1];
		}
		if (Static61.anInt1553 > 2) {
			local56 = Static98.method1779(new Class27[] { local56, Static72.aClass27_925, Static97.method1616(Static61.anInt1553 - 2), Static48.aClass27_1141 });
		}
		Static31.aClass3_Sub3_Sub2_Sub1_1.method595(local56, 4, 16777215, Static2.anInt38 / 1000);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method232() {
		Static25.anInt658 = 0;
		@Pc(74) int local74;
		for (@Pc(9) int local9 = -1; local9 < Static104.anInt2718 + Static104.anInt2724; local9++) {
			@Pc(24) Class3_Sub3_Sub1_Sub4 local24;
			if (local9 == -1) {
				local24 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1;
			} else if (local9 < Static104.anInt2718) {
				local24 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[Static99.anIntArray387[local9]];
			} else {
				local24 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[Static85.anIntArray349[local9 - Static104.anInt2718]];
			}
			if (local24 != null && local24.method1679()) {
				@Pc(54) Class3_Sub3_Sub3 local54;
				if (local24 instanceof Class3_Sub3_Sub1_Sub4_Sub1) {
					local54 = ((Class3_Sub3_Sub1_Sub4_Sub1) local24).aClass3_Sub3_Sub3_1;
					if (local54.anIntArray166 != null) {
						local54 = local54.method720();
					}
					if (local54 == null) {
						continue;
					}
				}
				if (Static104.anInt2718 <= local9) {
					local54 = ((Class3_Sub3_Sub1_Sub4_Sub1) local24).aClass3_Sub3_Sub3_1;
					if (local54.anInt939 >= 0 && local54.anInt939 < Static96.aClass3_Sub3_Sub2_Sub2Array9.length) {
						Static74.method1481(local24.anInt2384 + 15, local24);
						if (Static28.anInt746 > -1) {
							Static96.aClass3_Sub3_Sub2_Sub2Array9[local54.anInt939].method804(Static28.anInt746 - 12, Static77.anInt2149 + -30);
						}
					}
					if (Static74.anInt2080 == 1 && Static42.anInt1229 == Static85.anIntArray349[local9 - Static104.anInt2718] && Static2.anInt38 % 20 < 10) {
						Static74.method1481(local24.anInt2384 + 15, local24);
						if (Static28.anInt746 > -1) {
							Static19.aClass3_Sub3_Sub2_Sub2Array6[0].method804(Static28.anInt746 - 12, Static77.anInt2149 - 28);
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Class3_Sub3_Sub1_Sub4_Sub2 local77 = (Class3_Sub3_Sub1_Sub4_Sub2) local24;
					if (local77.anInt2437 != -1 || local77.anInt2436 != -1) {
						Static74.method1481(local24.anInt2384 + 15, local24);
						if (Static28.anInt746 > -1) {
							if (local77.anInt2437 != -1) {
								Static88.aClass3_Sub3_Sub2_Sub2Array12[local77.anInt2437].method804(Static28.anInt746 - 12, Static77.anInt2149 + -30);
								local74 += 25;
							}
							if (local77.anInt2436 != -1) {
								Static96.aClass3_Sub3_Sub2_Sub2Array9[local77.anInt2436].method804(Static28.anInt746 - 12, Static77.anInt2149 - local74);
								local74 += 25;
							}
						}
					}
					if (local9 >= 0 && Static74.anInt2080 == 10 && Static99.anIntArray387[local9] == Static41.anInt1222) {
						Static74.method1481(local24.anInt2384 + 15, local24);
						if (Static28.anInt746 > -1) {
							Static19.aClass3_Sub3_Sub2_Sub2Array6[1].method804(Static28.anInt746 - 12, -local74 + Static77.anInt2149);
						}
					}
				}
				if (local24.aClass27_1138 != null && (local9 >= Static104.anInt2718 || Static76.anInt2134 == 0 || Static76.anInt2134 == 3 || Static76.anInt2134 == 1 && Static50.method971(((Class3_Sub3_Sub1_Sub4_Sub2) local24).aClass27_1150))) {
					Static74.method1481(local24.anInt2384, local24);
					if (Static28.anInt746 > -1 && Static48.anInt2394 > Static25.anInt658) {
						Static48.anIntArray363[Static25.anInt658] = Static31.aClass3_Sub3_Sub2_Sub1_1.method606(local24.aClass27_1138) / 2;
						Static48.anIntArray365[Static25.anInt658] = Static31.aClass3_Sub3_Sub2_Sub1_1.anInt742;
						Static48.anIntArray355[Static25.anInt658] = Static28.anInt746;
						Static48.anIntArray360[Static25.anInt658] = Static77.anInt2149;
						Static48.anIntArray361[Static25.anInt658] = local24.anInt2379;
						Static48.anIntArray362[Static25.anInt658] = local24.anInt2383;
						Static48.anIntArray358[Static25.anInt658] = local24.anInt2400;
						Static48.aClass27Array14[Static25.anInt658] = local24.aClass27_1138;
						Static25.anInt658++;
					}
				}
				if (local24.anInt2380 > Static2.anInt38) {
					Static74.method1481(local24.anInt2384 + 15, local24);
					if (Static28.anInt746 > -1) {
						local74 = local24.anInt2413 * 30 / local24.anInt2396;
						if (local74 > 30) {
							local74 = 30;
						}
						Static95.method1322(Static28.anInt746 - 15, Static77.anInt2149 - 3, local74, 5, 65280);
						Static95.method1322(local74 + Static28.anInt746 - 15, Static77.anInt2149 + -3, 30 - local74, 5, 16711680);
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (local24.anIntArray364[local74] > Static2.anInt38) {
						Static74.method1481(local24.anInt2384 / 2, local24);
						if (Static28.anInt746 > -1) {
							if (local74 == 1) {
								Static77.anInt2149 -= 20;
							}
							if (local74 == 2) {
								Static77.anInt2149 -= 10;
								Static28.anInt746 -= 15;
							}
							if (local74 == 3) {
								Static77.anInt2149 -= 10;
								Static28.anInt746 += 15;
							}
							Static72.aClass3_Sub3_Sub2_Sub2Array11[local24.anIntArray354[local74]].method804(Static28.anInt746 - 12, Static77.anInt2149 + -12);
							Static89.aClass3_Sub3_Sub2_Sub1_3.method603(Static97.method1616(local24.anIntArray356[local74]), Static28.anInt746, Static77.anInt2149 + 4, 0);
							Static89.aClass3_Sub3_Sub2_Sub1_3.method603(Static97.method1616(local24.anIntArray356[local74]), Static28.anInt746 - 1, Static77.anInt2149 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(502) int local502 = 0; local502 < Static25.anInt658; local502++) {
			local74 = Static48.anIntArray355[local502];
			@Pc(512) int local512 = Static48.anIntArray363[local502];
			@Pc(516) int local516 = Static48.anIntArray365[local502];
			@Pc(520) int local520 = Static48.anIntArray360[local502];
			@Pc(522) boolean local522 = true;
			while (local522) {
				local522 = false;
				for (@Pc(528) int local528 = 0; local528 < local502; local528++) {
					if (Static48.anIntArray360[local528] - Static48.anIntArray365[local528] < local520 - -2 && local520 - local516 < Static48.anIntArray360[local528] - -2 && local74 - local512 < Static48.anIntArray355[local528] + Static48.anIntArray363[local528] && Static48.anIntArray355[local528] - Static48.anIntArray363[local528] < local512 + local74 && Static48.anIntArray360[local528] - Static48.anIntArray365[local528] < local520) {
						local520 = Static48.anIntArray360[local528] - Static48.anIntArray365[local528];
						local522 = true;
					}
				}
			}
			Static28.anInt746 = Static48.anIntArray355[local502];
			Static77.anInt2149 = Static48.anIntArray360[local502] = local520;
			@Pc(622) Class27 local622 = Static48.aClass27Array14[local502];
			if (Static62.anInt1582 == 0) {
				@Pc(642) int local642 = 16776960;
				if (Static48.anIntArray361[local502] < 6) {
					local642 = Static62.anIntArray268[Static48.anIntArray361[local502]];
				}
				if (Static48.anIntArray361[local502] == 6) {
					local642 = Static31.anInt803 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static48.anIntArray361[local502] == 7) {
					local642 = Static31.anInt803 % 20 >= 10 ? 65535 : 255;
				}
				if (Static48.anIntArray361[local502] == 8) {
					local642 = Static31.anInt803 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(713) int local713;
				if (Static48.anIntArray361[local502] == 9) {
					local713 = 150 - Static48.anIntArray358[local502];
					if (local713 < 50) {
						local642 = local713 * 1280 + 16711680;
					} else if (local713 < 100) {
						local642 = 16384000 + 16776960 - local713 * 327680;
					} else if (local713 < 150) {
						local642 = (local713 - 100) * 5 + 65280;
					}
				}
				if (Static48.anIntArray361[local502] == 10) {
					local713 = 150 - Static48.anIntArray358[local502];
					if (local713 < 50) {
						local642 = local713 * 5 + 16711680;
					} else if (local713 < 100) {
						local642 = 16711935 + 16384000 - local713 * 327680;
					} else if (local713 < 150) {
						local642 = (local713 + -100) * 327680 + 255 - (local713 - 100) * 5;
					}
				}
				if (Static48.anIntArray361[local502] == 11) {
					local713 = 150 - Static48.anIntArray358[local502];
					if (local713 < 50) {
						local642 = 16777215 - local713 * 327685;
					} else if (local713 < 100) {
						local642 = local713 * 327685 + 65280 - 16384250;
					} else if (local713 < 150) {
						local642 = 16777215 - (local713 - 100) * 327680;
					}
				}
				if (Static48.anIntArray362[local502] == 0) {
					Static31.aClass3_Sub3_Sub2_Sub1_1.method603(local622, Static28.anInt746, Static77.anInt2149 + 1, 0);
					Static31.aClass3_Sub3_Sub2_Sub1_1.method603(local622, Static28.anInt746, Static77.anInt2149, local642);
				}
				if (Static48.anIntArray362[local502] == 1) {
					Static31.aClass3_Sub3_Sub2_Sub1_1.method611(local622, Static28.anInt746, Static77.anInt2149 + 1, 0, Static31.anInt803);
					Static31.aClass3_Sub3_Sub2_Sub1_1.method611(local622, Static28.anInt746, Static77.anInt2149, local642, Static31.anInt803);
				}
				if (Static48.anIntArray362[local502] == 2) {
					Static31.aClass3_Sub3_Sub2_Sub1_1.method609(local622, Static28.anInt746, Static77.anInt2149 + 1, 0, Static31.anInt803);
					Static31.aClass3_Sub3_Sub2_Sub1_1.method609(local622, Static28.anInt746, Static77.anInt2149, local642, Static31.anInt803);
				}
				if (Static48.anIntArray362[local502] == 3) {
					Static31.aClass3_Sub3_Sub2_Sub1_1.method614(local622, Static28.anInt746, Static77.anInt2149 + 1, 0, Static31.anInt803, 150 - Static48.anIntArray358[local502]);
					Static31.aClass3_Sub3_Sub2_Sub1_1.method614(local622, Static28.anInt746, Static77.anInt2149, local642, Static31.anInt803, 150 - Static48.anIntArray358[local502]);
				}
				@Pc(985) int local985;
				if (Static48.anIntArray362[local502] == 4) {
					local713 = Static31.aClass3_Sub3_Sub2_Sub1_1.method606(local622);
					local985 = (150 - Static48.anIntArray358[local502]) * (local713 + 100) / 150;
					Static95.method1325(Static28.anInt746 - 50, 0, Static28.anInt746 + 50, 334);
					Static31.aClass3_Sub3_Sub2_Sub1_1.method610(local622, Static28.anInt746 + 50 - local985, Static77.anInt2149 + 1, 0);
					Static31.aClass3_Sub3_Sub2_Sub1_1.method610(local622, Static28.anInt746 + 50 - local985, Static77.anInt2149, local642);
					Static95.method1327();
				}
				if (Static48.anIntArray362[local502] == 5) {
					local713 = 150 - Static48.anIntArray358[local502];
					local985 = 0;
					Static95.method1325(0, Static77.anInt2149 - Static31.aClass3_Sub3_Sub2_Sub1_1.anInt742 - 1, 512, Static77.anInt2149 + 5);
					if (local713 < 25) {
						local985 = local713 - 25;
					} else if (local713 > 125) {
						local985 = local713 - 125;
					}
					Static31.aClass3_Sub3_Sub2_Sub1_1.method603(local622, Static28.anInt746, local985 + Static77.anInt2149 + 1, 0);
					Static31.aClass3_Sub3_Sub2_Sub1_1.method603(local622, Static28.anInt746, local985 + Static77.anInt2149, local642);
					Static95.method1327();
				}
			} else {
				Static31.aClass3_Sub3_Sub2_Sub1_1.method603(local622, Static28.anInt746, Static77.anInt2149 + 1, 0);
				Static31.aClass3_Sub3_Sub2_Sub1_1.method603(local622, Static28.anInt746, Static77.anInt2149, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method233() {
		for (@Pc(15) int local15 = 0; local15 < Static37.anInt887; local15++) {
			@Pc(21) int local21 = Static12.anIntArray53[local15]--;
			if (Static12.anIntArray53[local15] >= -10) {
				@Pc(90) Class36 local90 = Static92.aClass36Array1[local15];
				if (local90 == null) {
					local90 = Static114.method1067(Static90.aClass54_Sub1_44, Static36.anIntArray159[local15]);
					if (local90 == null) {
						continue;
					}
					Static12.anIntArray53[local15] += local90.method1066();
					Static92.aClass36Array1[local15] = local90;
				}
				if (Static12.anIntArray53[local15] < 0) {
					@Pc(121) int local121 = Static41.anInt1224;
					if (Static8.anIntArray41[local15] != 0) {
						@Pc(133) int local133 = (Static8.anIntArray41[local15] & 0xFF) * 128;
						@Pc(141) int local141 = Static8.anIntArray41[local15] >> 16 & 0xFF;
						@Pc(151) int local151 = local141 * 128 + 64 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408;
						if (local151 < 0) {
							local151 = -local151;
						}
						@Pc(164) int local164 = Static8.anIntArray41[local15] >> 8 & 0xFF;
						@Pc(174) int local174 = local164 * 128 + 64 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399;
						if (local174 < 0) {
							local174 = -local174;
						}
						@Pc(185) int local185 = local174 + local151 - 128;
						if (local133 < local185) {
							Static12.anIntArray53[local15] = -100;
							continue;
						}
						if (local185 < 0) {
							local185 = 0;
						}
						local121 = Static41.anInt1224 * (local133 - local185) / local133;
					}
					@Pc(219) Class3_Sub7_Sub1 local219 = local90.method1064().method1851(Static77.aClass47_1);
					@Pc(224) Class3_Sub1_Sub2 local224 = Static111.method146(local219, local121);
					local224.method159(Static57.anIntArray245[local15] - 1);
					Static36.aClass3_Sub1_Sub1_1.method52(local224);
					Static12.anIntArray53[local15] = -100;
				}
			} else {
				Static37.anInt887--;
				for (@Pc(37) int local37 = local15; local37 < Static37.anInt887; local37++) {
					Static36.anIntArray159[local37] = Static36.anIntArray159[local37 + 1];
					Static92.aClass36Array1[local37] = Static92.aClass36Array1[local37 + 1];
					Static57.anIntArray245[local37] = Static57.anIntArray245[local37 + 1];
					Static12.anIntArray53[local37] = Static12.anIntArray53[local37 + 1];
					Static8.anIntArray41[local37] = Static8.anIntArray41[local37 + 1];
				}
				local15--;
			}
		}
		if (Static98.anInt2576 <= 0) {
			return;
		}
		Static98.anInt2576 -= 20;
		if (Static98.anInt2576 < 0) {
			Static98.anInt2576 = 0;
		}
		if (Static98.anInt2576 == 0 && Static71.anInt1874 != 0 && Static12.anInt283 != -1) {
			Static1.method4(0, Static71.anInt1874, Static80.aClass54_Sub1_38, Static12.anInt283);
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	private static void method234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub9 local10 = (Class3_Sub9) Static40.aClass28_9.method884(); local10 != null; local10 = (Class3_Sub9) Static40.aClass28_9.method875()) {
			if (local10.anInt1420 != -1 || local10.anIntArray233 != null) {
				@Pc(30) int local30 = 0;
				if (arg2 > local10.anInt1408) {
					local30 = arg2 - local10.anInt1408;
				} else if (local10.anInt1411 > arg2) {
					local30 = local10.anInt1411 - arg2;
				}
				if (local10.anInt1415 < arg3) {
					local30 += arg3 - local10.anInt1415;
				} else if (local10.anInt1413 > arg3) {
					local30 += local10.anInt1413 - arg3;
				}
				if (local10.anInt1412 < local30 - 64 || Static41.anInt1224 == 0 || arg1 != local10.anInt1410) {
					if (local10.aClass3_Sub1_Sub2_2 != null) {
						Static36.aClass3_Sub1_Sub1_1.method57(local10.aClass3_Sub1_Sub2_2);
						local10.aClass3_Sub1_Sub2_2 = null;
					}
					if (local10.aClass3_Sub1_Sub2_1 != null) {
						Static36.aClass3_Sub1_Sub1_1.method57(local10.aClass3_Sub1_Sub2_1);
						local10.aClass3_Sub1_Sub2_1 = null;
					}
				} else {
					local30 -= 64;
					if (local30 < 0) {
						local30 = 0;
					}
					@Pc(142) int local142 = Static41.anInt1224 * (local10.anInt1412 - local30) / local10.anInt1412;
					if (local10.aClass3_Sub1_Sub2_2 != null) {
						local10.aClass3_Sub1_Sub2_2.method155(local142);
					} else if (local10.anInt1420 >= 0) {
						@Pc(154) Class36 local154 = Static114.method1067(Static90.aClass54_Sub1_44, local10.anInt1420);
						if (local154 != null) {
							@Pc(161) Class3_Sub7_Sub1 local161 = local154.method1064().method1851(Static77.aClass47_1);
							@Pc(166) Class3_Sub1_Sub2 local166 = Static111.method146(local161, local142);
							local166.method159(-1);
							Static36.aClass3_Sub1_Sub1_1.method52(local166);
							local10.aClass3_Sub1_Sub2_2 = local166;
						}
					}
					if (local10.aClass3_Sub1_Sub2_1 != null) {
						local10.aClass3_Sub1_Sub2_1.method155(local142);
						if (!local10.aClass3_Sub1_Sub2_1.method153()) {
							local10.aClass3_Sub1_Sub2_1 = null;
						}
					} else if (local10.anIntArray233 != null && (local10.anInt1417 -= arg0) <= 0) {
						@Pc(216) int local216 = (int) (Math.random() * (double) local10.anIntArray233.length);
						@Pc(224) Class36 local224 = Static114.method1067(Static90.aClass54_Sub1_44, local10.anIntArray233[local216]);
						if (local224 != null) {
							@Pc(231) Class3_Sub7_Sub1 local231 = local224.method1064().method1851(Static77.aClass47_1);
							@Pc(236) Class3_Sub1_Sub2 local236 = Static111.method146(local231, local142);
							local236.method159(0);
							Static36.aClass3_Sub1_Sub1_1.method52(local236);
							local10.anInt1417 = (int) ((double) (local10.anInt1421 - local10.anInt1419) * Math.random()) + local10.anInt1419;
							local10.aClass3_Sub1_Sub2_1 = local236;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method235() {
		aClass27_124 = null;
		aClass27_126 = null;
		aClass27_127 = null;
		aClass27_135 = null;
		aBooleanArray3 = null;
		aClass27_125 = null;
		aClass27_132 = null;
		aClass27_129 = null;
		aClass27_133 = null;
		aClass27_130 = null;
		aClass21_9 = null;
		anIntArray50 = null;
		aClass27_128 = null;
		aClass27_131 = null;
		aClass27_134 = null;
	}
}
