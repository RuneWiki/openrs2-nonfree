import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array12;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!je;")
	private static Class40 aClass40_847 = Static69.method1231(" more options");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_848 = Static69.method1231("ams");

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
	public static volatile long aLong47 = 0L;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_849 = aClass40_847;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!je;")
	private static Class40 aClass40_852 = Static69.method1231("Malformed login packet)3");

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_850 = aClass40_852;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[Lclient!rf;")
	public static Class66[] aClass66Array1 = new Class66[50];

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_851 = Static69.method1231("hitmarks");

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	public static int anInt1725 = 0;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!je;")
	private static Class40 aClass40_853 = Static69.method1231("Click to switch");

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "Lclient!je;")
	public static Class40 aClass40_854 = aClass40_853;

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "Z")
	public static volatile boolean aBoolean128 = true;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1140() {
		if (Static10.anInt2975 > 0) {
			Static10.anInt2975--;
		}
		if (Static1.anInt9 > 1) {
			Static1.anInt9--;
		}
		if (Static119.aBoolean231) {
			Static119.aBoolean231 = false;
			Static49.method887();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static70.method1216(); local27++) {
		}
		if (Static105.anInt2533 != 30) {
			return;
		}
		Static77.method1345(Static57.aClass2_Sub9_Sub1_2);
		@Pc(53) Object local53 = Static114.aClass61_1.anObject5;
		@Pc(88) int local88;
		@Pc(81) int local81;
		@Pc(90) int local90;
		@Pc(107) int local107;
		@Pc(128) int local128;
		synchronized (Static114.aClass61_1.anObject5) {
			if (!Static105.aBoolean205) {
				Static114.aClass61_1.anInt2402 = 0;
			} else if (Static68.anInt1856 != 0 || Static114.aClass61_1.anInt2402 >= 40) {
				Static57.aClass2_Sub9_Sub1_2.method673(91);
				local81 = 0;
				Static57.aClass2_Sub9_Sub1_2.method644(0);
				local88 = Static57.aClass2_Sub9_Sub1_2.anInt976;
				for (local90 = 0; Static114.aClass61_1.anInt2402 > local90 && Static57.aClass2_Sub9_Sub1_2.anInt976 - local88 < 240; local90++) {
					local81++;
					local107 = Static114.aClass61_1.anIntArray262[local90];
					if (local107 < 0) {
						local107 = 0;
					} else if (local107 > 502) {
						local107 = 502;
					}
					local128 = Static114.aClass61_1.anIntArray261[local90];
					if (local128 < 0) {
						local128 = 0;
					} else if (local128 > 764) {
						local128 = 764;
					}
					@Pc(149) int local149 = local107 * 765 + local128;
					if (Static114.aClass61_1.anIntArray262[local90] == -1 && Static114.aClass61_1.anIntArray261[local90] == -1) {
						local128 = -1;
						local107 = -1;
						local149 = 524287;
					}
					if (local128 != Static112.anInt2614 || Static96.anInt2439 != local107) {
						@Pc(194) int local194 = local128 - Static112.anInt2614;
						@Pc(199) int local199 = local107 - Static96.anInt2439;
						Static96.anInt2439 = local107;
						Static112.anInt2614 = local128;
						if (Static69.anInt1926 < 8 && local194 >= -32 && local194 <= 31 && local199 >= -32 && local199 <= 31) {
							local199 += 32;
							local194 += 32;
							Static57.aClass2_Sub9_Sub1_2.method657(local199 + (local194 << 6) + (Static69.anInt1926 << 12));
							Static69.anInt1926 = 0;
						} else if (Static69.anInt1926 < 8) {
							Static57.aClass2_Sub9_Sub1_2.method638((Static69.anInt1926 << 19) + local149 + 8388608);
							Static69.anInt1926 = 0;
						} else {
							Static57.aClass2_Sub9_Sub1_2.method620((Static69.anInt1926 << 19) + local149 - 1073741824);
							Static69.anInt1926 = 0;
						}
					} else if (Static69.anInt1926 < 2047) {
						Static69.anInt1926++;
					}
				}
				Static57.aClass2_Sub9_Sub1_2.method608(Static57.aClass2_Sub9_Sub1_2.anInt976 - local88);
				if (Static114.aClass61_1.anInt2402 <= local81) {
					Static114.aClass61_1.anInt2402 = 0;
				} else {
					Static114.aClass61_1.anInt2402 -= local81;
					for (local107 = 0; local107 < Static114.aClass61_1.anInt2402; local107++) {
						Static114.aClass61_1.anIntArray261[local107] = Static114.aClass61_1.anIntArray261[local107 + local81];
						Static114.aClass61_1.anIntArray262[local107] = Static114.aClass61_1.anIntArray262[local81 + local107];
					}
				}
			}
		}
		if (Static68.anInt1856 != 0) {
			@Pc(347) long local347 = (Static93.aLong65 - Static25.aLong17) / 50L;
			if (local347 > 4095L) {
				local347 = 4095L;
			}
			Static25.aLong17 = Static93.aLong65;
			local88 = Static103.anInt2511;
			if (local88 < 0) {
				local88 = 0;
			} else if (local88 > 502) {
				local88 = 502;
			}
			local128 = (int) local347;
			@Pc(378) byte local378 = 0;
			if (Static68.anInt1856 == 2) {
				local378 = 1;
			}
			local81 = Static41.anInt1096;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > 764) {
				local81 = 764;
			}
			Static57.aClass2_Sub9_Sub1_2.method673(64);
			local90 = local81 + local88 * 765;
			Static57.aClass2_Sub9_Sub1_2.method624(local90 + (local128 << 20) + (local378 << 19));
		}
		if (Static51.aBooleanArray14[96] || Static51.aBooleanArray14[97] || Static51.aBooleanArray14[98] || Static51.aBooleanArray14[99]) {
			Static65.aBoolean129 = true;
		}
		if (Static48.anInt1295 > 0) {
			Static48.anInt1295--;
		}
		if (Static65.aBoolean129 && Static48.anInt1295 <= 0) {
			Static65.aBoolean129 = false;
			Static48.anInt1295 = 20;
			Static57.aClass2_Sub9_Sub1_2.method673(154);
			Static57.aClass2_Sub9_Sub1_2.method657(Static33.anInt2670);
			Static57.aClass2_Sub9_Sub1_2.method657(Static39.anInt1035);
		}
		if (Static116.aBoolean223 && !Static104.aBoolean203) {
			Static104.aBoolean203 = true;
			Static57.aClass2_Sub9_Sub1_2.method673(137);
			Static57.aClass2_Sub9_Sub1_2.method644(1);
		}
		if (!Static116.aBoolean223 && Static104.aBoolean203) {
			Static104.aBoolean203 = false;
			Static57.aClass2_Sub9_Sub1_2.method673(137);
			Static57.aClass2_Sub9_Sub1_2.method644(0);
		}
		Static19.method379();
		if (Static105.anInt2533 != 30) {
			return;
		}
		Static65.method1145();
		Static97.method1770();
		Static58.anInt1520++;
		if (Static58.anInt1520 > 750) {
			Static49.method887();
			return;
		}
		Static109.method2117();
		Static122.method2065();
		Static2.method69();
		Static49.anInt1315++;
		if (Static74.anInt920 != 0) {
			Static124.anInt2881 += 20;
			if (Static124.anInt2881 >= 400) {
				Static74.anInt920 = 0;
			}
		}
		if (Static115.aClass2_Sub13_15 != null) {
			Static124.anInt2887++;
			if (Static124.anInt2887 >= 15) {
				Static17.method316(Static115.aClass2_Sub13_15);
				Static115.aClass2_Sub13_15 = null;
			}
		}
		@Pc(653) Class2_Sub13 local653;
		if (Static101.aClass2_Sub13_14 != null) {
			Static17.method316(Static101.aClass2_Sub13_14);
			Static18.anInt605++;
			if (Static112.anInt2616 > Static58.anInt1525 + 5 || Static112.anInt2616 < Static58.anInt1525 - 5 || Static85.anInt2261 > anInt1725 + 5 || Static85.anInt2261 < anInt1725 - 5) {
				Static51.aBoolean97 = true;
			}
			if (Static107.anInt2544 == 0) {
				if (Static51.aBoolean97 && Static18.anInt605 >= 5) {
					if (Static101.aClass2_Sub13_14 == Static101.aClass2_Sub13_13 && Static101.anInt2475 != Static19.anInt613) {
						@Pc(651) byte local651 = 0;
						local653 = Static101.aClass2_Sub13_14;
						if (Static10.anInt2973 == 1 && local653.anInt1586 == 206) {
							local651 = 1;
						}
						if (local653.anIntArray161[Static101.anInt2475] <= 0) {
							local651 = 0;
						}
						if (Static61.method1112(Static116.method1945(local653))) {
							local88 = Static19.anInt613;
							local81 = Static101.anInt2475;
							local653.anIntArray161[local81] = local653.anIntArray161[local88];
							local653.anIntArray154[local81] = local653.anIntArray154[local88];
							local653.anIntArray161[local88] = -1;
							local653.anIntArray154[local88] = 0;
						} else if (local651 == 1) {
							local88 = Static19.anInt613;
							local81 = Static101.anInt2475;
							while (local81 != local88) {
								if (local81 < local88) {
									local653.method1041(local88 - 1, local88);
									local88--;
								} else if (local88 < local81) {
									local653.method1041(local88 + 1, local88);
									local88++;
								}
							}
						} else {
							local653.method1041(Static101.anInt2475, Static19.anInt613);
						}
						Static57.aClass2_Sub9_Sub1_2.method673(143);
						Static57.aClass2_Sub9_Sub1_2.method609(local651);
						Static57.aClass2_Sub9_Sub1_2.method646(Static19.anInt613);
						Static57.aClass2_Sub9_Sub1_2.method616(Static101.anInt2475);
						Static57.aClass2_Sub9_Sub1_2.method629(Static101.aClass2_Sub13_14.anInt1560);
					}
				} else if ((Static23.anInt650 == 1 || Static54.method947(Static57.anInt1500 - 1)) && Static57.anInt1500 > 2) {
					Static12.method2205();
				} else if (Static57.anInt1500 > 0) {
					Static19.method375(Static57.anInt1500 - 1);
				}
				Static68.anInt1856 = 0;
				Static101.aClass2_Sub13_14 = null;
				Static124.anInt2887 = 10;
			}
		}
		Static121.anInt2834 = 0;
		Static25.aBoolean50 = false;
		Static73.aBoolean141 = false;
		Static13.aClass2_Sub13_1 = null;
		local653 = Static134.aClass2_Sub13_10;
		Static134.aClass2_Sub13_10 = null;
		@Pc(844) Class2_Sub13 local844 = Static54.aClass2_Sub13_6;
		Static54.aClass2_Sub13_6 = null;
		while (Static104.method1822() && Static121.anInt2834 < 128) {
			Static75.anIntArray208[Static121.anInt2834] = Static59.anInt1587;
			Static84.anIntArray246[Static121.anInt2834] = Static48.anInt1299;
			Static121.anInt2834++;
		}
		Static119.method2010(0, 503, 0, 765, 0, 0, Static92.anInt2332);
		Static70.anInt1886++;
		while (true) {
			@Pc(886) Class2_Sub7 local886;
			@Pc(902) Class2_Sub13 local902;
			@Pc(891) Class2_Sub13 local891;
			do {
				local886 = (Class2_Sub7) Static79.aClass3_13.method78();
				if (local886 == null) {
					while (true) {
						do {
							local886 = (Class2_Sub7) Static127.aClass3_17.method78();
							if (local886 == null) {
								while (true) {
									do {
										local886 = (Class2_Sub7) Static62.aClass3_8.method78();
										if (local886 == null) {
											if (Static38.aClass2_Sub13_5 != null) {
												Static70.method1217();
											}
											if (Static42.anInt1115 != -1) {
												local81 = Static42.anInt1121;
												local88 = Static42.anInt1115;
												@Pc(1052) boolean local1052 = Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 0, true, 0, 0, 0, local81, local88, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
												if (local1052) {
													Static74.anInt920 = 1;
													Static124.anInt2881 = 0;
													Static65.anInt1730 = Static103.anInt2511;
													Static12.anInt3049 = Static41.anInt1096;
												}
												Static42.anInt1115 = -1;
											}
											Static7.method173();
											if (Static134.aClass2_Sub13_10 != local653) {
												if (local653 != null) {
													Static17.method316(local653);
												}
												if (Static134.aClass2_Sub13_10 != null) {
													Static17.method316(Static134.aClass2_Sub13_10);
												}
											}
											if (Static54.aClass2_Sub13_6 != local844 && Static37.anInt1000 == Static41.anInt1090) {
												if (local844 != null) {
													Static17.method316(local844);
												}
												if (Static54.aClass2_Sub13_6 != null) {
													Static17.method316(Static54.aClass2_Sub13_6);
												}
											}
											if (Static54.aClass2_Sub13_6 == null) {
												if (Static41.anInt1090 > 0) {
													Static41.anInt1090--;
												}
											} else if (Static37.anInt1000 > Static41.anInt1090) {
												Static41.anInt1090++;
												if (Static37.anInt1000 == Static41.anInt1090) {
													Static17.method316(Static54.aClass2_Sub13_6);
												}
											}
											Static7.method171();
											if (Static20.aBoolean47) {
												Static127.method2108();
											}
											for (local88 = 0; local88 < 5; local88++) {
												@Pc(1136) int local1136 = Static95.anIntArray263[local88]++;
											}
											local81 = Static118.method2002();
											local90 = Static59.method1050();
											if (local81 > 4500 && local90 > 4500) {
												Static10.anInt2975 = 250;
												Static13.method212(4000);
												Static57.aClass2_Sub9_Sub1_2.method673(167);
											}
											Static31.anInt738++;
											Static50.anInt1322++;
											Static93.anInt2392++;
											if (Static93.anInt2392 > 500) {
												local107 = (int) (Math.random() * 8.0D);
												if ((local107 & 0x1) == 1) {
													Static127.anInt2941 += Static1.anInt4;
												}
												if ((local107 & 0x4) == 4) {
													Static123.anInt2870 += Static122.anInt2861;
												}
												if ((local107 & 0x2) == 2) {
													Static65.anInt1733 += Static57.anInt1498;
												}
												Static93.anInt2392 = 0;
											}
											if (Static123.anInt2870 < -40) {
												Static122.anInt2861 = 1;
											}
											if (Static65.anInt1733 < -55) {
												Static57.anInt1498 = 2;
											}
											if (Static65.anInt1733 > 55) {
												Static57.anInt1498 = -2;
											}
											if (Static123.anInt2870 > 40) {
												Static122.anInt2861 = -1;
											}
											if (Static127.anInt2941 < -50) {
												Static1.anInt4 = 2;
											}
											if (Static127.anInt2941 > 50) {
												Static1.anInt4 = -2;
											}
											if (Static31.anInt738 > 500) {
												local107 = (int) (Math.random() * 8.0D);
												if ((local107 & 0x1) == 1) {
													Static19.anInt616 += Static133.anInt3069;
												}
												Static31.anInt738 = 0;
												if ((local107 & 0x2) == 2) {
													Static94.anInt2403 += Static63.anInt364;
												}
											}
											if (Static19.anInt616 < -60) {
												Static133.anInt3069 = 2;
											}
											if (Static19.anInt616 > 60) {
												Static133.anInt3069 = -2;
											}
											if (Static94.anInt2403 < -20) {
												Static63.anInt364 = 1;
											}
											if (Static94.anInt2403 > 10) {
												Static63.anInt364 = -1;
											}
											if (Static50.anInt1322 > 50) {
												Static57.aClass2_Sub9_Sub1_2.method673(7);
											}
											try {
												if (Static85.aClass57_2 != null && Static57.aClass2_Sub9_Sub1_2.anInt976 > 0) {
													Static85.aClass57_2.method1591(Static57.aClass2_Sub9_Sub1_2.aByteArray16, Static57.aClass2_Sub9_Sub1_2.anInt976);
													Static50.anInt1322 = 0;
													Static57.aClass2_Sub9_Sub1_2.anInt976 = 0;
													return;
												}
												return;
											} catch (@Pc(1349) IOException local1349) {
												Static49.method887();
												return;
											}
										}
										local891 = local886.aClass2_Sub13_4;
										if (local891.anInt1578 < 0) {
											break;
										}
										local902 = Static55.method972(local891.anInt1543);
									} while (local902 == null || local902.aClass2_Sub13Array2 == null || local902.aClass2_Sub13Array2.length <= local891.anInt1578 || local902.aClass2_Sub13Array2[local891.anInt1578] != local891);
									Static58.method1028(local886);
								}
							}
							local891 = local886.aClass2_Sub13_4;
							if (local891.anInt1578 < 0) {
								break;
							}
							local902 = Static55.method972(local891.anInt1543);
						} while (local902 == null || local902.aClass2_Sub13Array2 == null || local891.anInt1578 >= local902.aClass2_Sub13Array2.length || local891 != local902.aClass2_Sub13Array2[local891.anInt1578]);
						Static58.method1028(local886);
					}
				}
				local891 = local886.aClass2_Sub13_4;
				if (local891.anInt1578 < 0) {
					break;
				}
				local902 = Static55.method972(local891.anInt1543);
			} while (local902 == null || local902.aClass2_Sub13Array2 == null || local902.aClass2_Sub13Array2.length <= local891.anInt1578 || local902.aClass2_Sub13Array2[local891.anInt1578] != local891);
			Static58.method1028(local886);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1141() {
		aClass40_847 = null;
		aClass40_854 = null;
		anIntArrayArrayArray5 = null;
		aClass40_852 = null;
		aClass66Array1 = null;
		aClass2_Sub1_Sub2_Sub4Array12 = null;
		aClass40_849 = null;
		aClass40_851 = null;
		aClass40_853 = null;
		aClass40_848 = null;
		aBooleanArray17 = null;
		anIntArrayArray19 = null;
		aClass40_850 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Lclient!jb;")
	public static Class2_Sub1_Sub5 method1142(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub1_Sub5 local6 = (Class2_Sub1_Sub5) Static24.aClass55_91.method1410((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static104.aClass24_28.method1931(arg0, 14);
		local6 = new Class2_Sub1_Sub5();
		if (local25 != null) {
			local6.method941(new Class2_Sub9(local25));
		}
		Static24.aClass55_91.method1411((long) arg0, local6);
		return local6;
	}
}
