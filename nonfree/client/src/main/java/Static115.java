import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!od", name = "C", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_37;

	@OriginalMember(owner = "client!od", name = "D", descriptor = "I")
	public static int anInt2604;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "Lclient!sb;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!od", name = "db", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1117 = Static51.method932("Service unavailable)3");

	@OriginalMember(owner = "client!od", name = "H", descriptor = "[I")
	public static int[] anIntArray274 = new int[128];

	@OriginalMember(owner = "client!od", name = "O", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1118 = Static51.method932("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!od", name = "P", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1119 = Static51.method932("Ausw-=hlen");

	@OriginalMember(owner = "client!od", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1120 = Static51.method932("welle:");

	@OriginalMember(owner = "client!od", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1121 = Static51.method932("mapdots");

	@OriginalMember(owner = "client!od", name = "W", descriptor = "I")
	public static int anInt2612 = 0;

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1122 = Static51.method932(")1j");

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1124 = aClass10_1117;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	public static void method1841() {
		if (Static79.anInt1819 > 1) {
			Static79.anInt1819--;
		}
		if (Static74.anInt2929 > 0) {
			Static74.anInt2929--;
		}
		if (Static167.aBoolean86) {
			Static167.aBoolean86 = false;
			Static106.method1721();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static120.method1932(); local29++) {
		}
		if (Static49.anInt1185 != 30) {
			return;
		}
		Static67.method2097(Static141.aClass2_Sub11_Sub1_3);
		@Pc(57) Object local57 = Static14.aClass87_1.anObject4;
		@Pc(89) int local89;
		@Pc(82) int local82;
		@Pc(91) int local91;
		@Pc(106) int local106;
		@Pc(123) int local123;
		synchronized (Static14.aClass87_1.anObject4) {
			if (!Static1.aBoolean1) {
				Static14.aClass87_1.anInt3791 = 0;
			} else if (Static40.anInt976 != 0 || Static14.aClass87_1.anInt3791 >= 40) {
				Static141.aClass2_Sub11_Sub1_3.method1495(201);
				local82 = 0;
				Static141.aClass2_Sub11_Sub1_3.method1439(0);
				local89 = Static141.aClass2_Sub11_Sub1_3.anInt2077;
				for (local91 = 0; local91 < Static14.aClass87_1.anInt3791 && Static141.aClass2_Sub11_Sub1_3.anInt2077 - local89 < 240; local91++) {
					local106 = Static14.aClass87_1.anIntArray419[local91];
					if (local106 < 0) {
						local106 = 0;
					} else if (local106 > 502) {
						local106 = 502;
					}
					local82++;
					local123 = Static14.aClass87_1.anIntArray420[local91];
					if (local123 < 0) {
						local123 = 0;
					} else if (local123 > 764) {
						local123 = 764;
					}
					@Pc(143) int local143 = local106 * 765 + local123;
					if (Static14.aClass87_1.anIntArray419[local91] == -1 && Static14.aClass87_1.anIntArray420[local91] == -1) {
						local106 = -1;
						local143 = 524287;
						local123 = -1;
					}
					if (local123 != Static133.anInt2946 || local106 != Static179.anInt3813) {
						@Pc(184) int local184 = local123 - Static133.anInt2946;
						@Pc(189) int local189 = local106 - Static179.anInt3813;
						Static133.anInt2946 = local123;
						Static179.anInt3813 = local106;
						if (Static36.anInt917 < 8 && local184 >= -32 && local184 <= 31 && local189 >= -32 && local189 <= 31) {
							local184 += 32;
							local189 += 32;
							Static141.aClass2_Sub11_Sub1_3.method1479((local184 << 6) + (Static36.anInt917 << 12) + local189);
							Static36.anInt917 = 0;
						} else if (Static36.anInt917 < 8) {
							Static141.aClass2_Sub11_Sub1_3.method1478((Static36.anInt917 << 19) + local143 + 8388608);
							Static36.anInt917 = 0;
						} else {
							Static141.aClass2_Sub11_Sub1_3.method1445(local143 + (Static36.anInt917 << 19) - 1073741824);
							Static36.anInt917 = 0;
						}
					} else if (Static36.anInt917 < 2047) {
						Static36.anInt917++;
					}
				}
				Static141.aClass2_Sub11_Sub1_3.method1465(Static141.aClass2_Sub11_Sub1_3.anInt2077 - local89);
				if (Static14.aClass87_1.anInt3791 > local82) {
					Static14.aClass87_1.anInt3791 -= local82;
					for (local106 = 0; local106 < Static14.aClass87_1.anInt3791; local106++) {
						Static14.aClass87_1.anIntArray420[local106] = Static14.aClass87_1.anIntArray420[local82 + local106];
						Static14.aClass87_1.anIntArray419[local106] = Static14.aClass87_1.anIntArray419[local82 + local106];
					}
				} else {
					Static14.aClass87_1.anInt3791 = 0;
				}
			}
		}
		if (Static40.anInt976 != 0) {
			@Pc(343) long local343 = (Static130.aLong97 - Static34.aLong30) / 50L;
			if (local343 > 4095L) {
				local343 = 4095L;
			}
			Static34.aLong30 = Static130.aLong97;
			local89 = Static40.anInt977;
			if (local89 < 0) {
				local89 = 0;
			} else if (local89 > 502) {
				local89 = 502;
			}
			local82 = Static62.anInt1534;
			@Pc(375) byte local375 = 0;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 764) {
				local82 = 764;
			}
			if (Static40.anInt976 == 2) {
				local375 = 1;
			}
			local91 = local89 * 765 + local82;
			Static141.aClass2_Sub11_Sub1_3.method1495(148);
			local123 = (int) local343;
			Static141.aClass2_Sub11_Sub1_3.method1470((local375 << 19) + ((local123 << 20) + local91));
		}
		if (Static24.anInt568 > 0) {
			Static24.anInt568--;
		}
		if (Static99.aBooleanArray9[96] || Static99.aBooleanArray9[97] || Static99.aBooleanArray9[98] || Static99.aBooleanArray9[99]) {
			Static44.aBoolean46 = true;
		}
		if (Static44.aBoolean46 && Static24.anInt568 <= 0) {
			Static24.anInt568 = 20;
			Static44.aBoolean46 = false;
			Static141.aClass2_Sub11_Sub1_3.method1495(199);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static45.anInt1123);
			Static141.aClass2_Sub11_Sub1_3.method1480(Static12.anInt365);
		}
		if (Static62.aBoolean66 && !Static94.aBoolean95) {
			Static94.aBoolean95 = true;
			Static141.aClass2_Sub11_Sub1_3.method1495(244);
			Static141.aClass2_Sub11_Sub1_3.method1439(1);
		}
		if (!Static62.aBoolean66 && Static94.aBoolean95) {
			Static94.aBoolean95 = false;
			Static141.aClass2_Sub11_Sub1_3.method1495(244);
			Static141.aClass2_Sub11_Sub1_3.method1439(0);
		}
		Static37.method770();
		if (Static49.anInt1185 != 30) {
			return;
		}
		Static7.method138();
		Static89.method1501();
		Static175.anInt3786++;
		if (Static175.anInt3786 > 750) {
			Static106.method1721();
			return;
		}
		Static69.method1167();
		Static86.method1369();
		Static79.method1280();
		if (Static54.anInt1339 != 0) {
			Static90.anInt2132 += 20;
			if (Static90.anInt2132 >= 400) {
				Static54.anInt1339 = 0;
			}
		}
		Static123.anInt2778++;
		if (Static83.aClass23_7 != null) {
			Static152.anInt3296++;
			if (Static152.anInt3296 >= 15) {
				Static3.method34(Static83.aClass23_7);
				Static83.aClass23_7 = null;
			}
		}
		@Pc(647) Class23 local647;
		if (Static169.aClass23_12 != null) {
			Static3.method34(Static169.aClass23_12);
			if (Static72.anInt1723 > Static12.anInt366 + 5 || Static12.anInt366 - 5 > Static72.anInt1723 || Static83.anInt1905 + 5 < Static61.anInt3635 || Static61.anInt3635 < Static83.anInt1905 - 5) {
				Static105.aBoolean108 = true;
			}
			Static149.anInt3232++;
			if (Static95.anInt2252 == 0) {
				if (Static105.aBoolean108 && Static149.anInt3232 >= 5) {
					if (Static169.aClass23_12 == Static29.aClass23_2 && Static59.anInt1475 != Static19.anInt494) {
						local647 = Static169.aClass23_12;
						@Pc(653) byte local653 = 0;
						if (Static168.anInt3660 == 1 && local647.anInt1088 == 206) {
							local653 = 1;
						}
						if (local647.anIntArray131[Static59.anInt1475] <= 0) {
							local653 = 0;
						}
						if (method1842(Static126.method2068(local647))) {
							local89 = Static19.anInt494;
							local82 = Static59.anInt1475;
							local647.anIntArray131[local82] = local647.anIntArray131[local89];
							local647.anIntArray126[local82] = local647.anIntArray126[local89];
							local647.anIntArray131[local89] = -1;
							local647.anIntArray126[local89] = 0;
						} else if (local653 == 1) {
							local89 = Static19.anInt494;
							local82 = Static59.anInt1475;
							while (local82 != local89) {
								if (local89 > local82) {
									local647.method843(local89 - 1, local89);
									local89--;
								} else if (local89 < local82) {
									local647.method843(local89 + 1, local89);
									local89++;
								}
							}
						} else {
							local647.method843(Static59.anInt1475, Static19.anInt494);
						}
						Static141.aClass2_Sub11_Sub1_3.method1495(151);
						Static141.aClass2_Sub11_Sub1_3.method1474(Static59.anInt1475);
						Static141.aClass2_Sub11_Sub1_3.method1479(Static19.anInt494);
						Static141.aClass2_Sub11_Sub1_3.method1484(local653);
						Static141.aClass2_Sub11_Sub1_3.method1453(Static169.aClass23_12.anInt1057);
					}
				} else if ((Static131.anInt2911 == 1 || Static139.method2197(Static46.anInt1135 - 1)) && Static46.anInt1135 > 2) {
					Static8.method156();
				} else if (Static46.anInt1135 > 0) {
					Static38.method780(Static46.anInt1135 - 1);
				}
				Static40.anInt976 = 0;
				Static169.aClass23_12 = null;
				Static152.anInt3296 = 10;
			}
		}
		Static60.aClass23_5 = null;
		Static131.aBoolean131 = false;
		Static142.aBoolean140 = false;
		@Pc(829) Class23 local829 = Static175.aClass23_14;
		Static175.aClass23_14 = null;
		Static69.anInt1633 = 0;
		local647 = Static59.aClass23_4;
		Static59.aClass23_4 = null;
		while (Static75.method1259() && Static69.anInt1633 < 128) {
			Static58.anIntArray164[Static69.anInt1633] = Static64.anInt1577;
			Static171.anIntArray402[Static69.anInt1633] = Static149.anInt3227;
			Static69.anInt1633++;
		}
		Static107.method1726(765, 0, 0, Static107.anInt2446, 0, 0, 503);
		Static12.anInt364++;
		while (true) {
			@Pc(877) Class2_Sub18 local877;
			@Pc(890) Class23 local890;
			@Pc(882) Class23 local882;
			do {
				local877 = (Class2_Sub18) Static59.aClass12_5.method385();
				if (local877 == null) {
					while (true) {
						do {
							local877 = (Class2_Sub18) Static120.aClass12_10.method385();
							if (local877 == null) {
								while (true) {
									do {
										local877 = (Class2_Sub18) Static21.aClass12_2.method385();
										if (local877 == null) {
											if (Static16.aClass23_1 != null) {
												Static70.method1188();
											}
											if (Static113.anInt2544 != -1) {
												local82 = Static113.anInt2551;
												local89 = Static113.anInt2544;
												@Pc(1048) boolean local1048 = Static165.method2527(0, true, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local89, 0, 0, 0, local82, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
												if (local1048) {
													Static90.anInt2132 = 0;
													Static160.anInt3405 = Static62.anInt1534;
													Static136.anInt3023 = Static40.anInt977;
													Static54.anInt1339 = 1;
												}
												Static113.anInt2544 = -1;
											}
											Static24.method387();
											if (local647 != Static59.aClass23_4) {
												if (local647 != null) {
													Static3.method34(local647);
												}
												if (Static59.aClass23_4 != null) {
													Static3.method34(Static59.aClass23_4);
												}
											}
											if (Static175.aClass23_14 != local829 && Static159.anInt3397 == Static114.anInt2583) {
												if (local829 != null) {
													Static3.method34(local829);
												}
												if (Static175.aClass23_14 != null) {
													Static3.method34(Static175.aClass23_14);
												}
											}
											if (Static175.aClass23_14 == null) {
												if (Static159.anInt3397 > 0) {
													Static159.anInt3397--;
												}
											} else if (Static159.anInt3397 < Static114.anInt2583) {
												Static159.anInt3397++;
												if (Static114.anInt2583 == Static159.anInt3397) {
													Static3.method34(Static175.aClass23_14);
												}
											}
											Static156.method2399();
											if (Static161.aBoolean153) {
												Static109.method1748();
											}
											for (local89 = 0; local89 < 5; local89++) {
												@Pc(1134) int local1134 = Static117.anIntArray282[local89]++;
											}
											local82 = Static119.method1926();
											local91 = Static50.method930();
											if (local82 > 4500 && local91 > 4500) {
												Static74.anInt2929 = 250;
												Static33.method674(4000);
												Static141.aClass2_Sub11_Sub1_3.method1495(177);
											}
											Static94.anInt2230++;
											Static74.anInt2922++;
											if (Static74.anInt2922 > 500) {
												local106 = (int) (Math.random() * 8.0D);
												Static74.anInt2922 = 0;
												if ((local106 & 0x4) == 4) {
													Static66.anInt1599 += Static48.anInt1166;
												}
												if ((local106 & 0x2) == 2) {
													Static160.anInt3400 += Static54.anInt1338;
												}
												if ((local106 & 0x1) == 1) {
													Static25.anInt670 += Static28.anInt777;
												}
											}
											if (Static66.anInt1599 < -40) {
												Static48.anInt1166 = 1;
											}
											if (Static160.anInt3400 < -55) {
												Static54.anInt1338 = 2;
											}
											if (Static66.anInt1599 > 40) {
												Static48.anInt1166 = -1;
											}
											if (Static160.anInt3400 > 55) {
												Static54.anInt1338 = -2;
											}
											if (Static25.anInt670 < -50) {
												Static28.anInt777 = 2;
											}
											if (Static25.anInt670 > 50) {
												Static28.anInt777 = -2;
											}
											Static26.anInt736++;
											if (Static26.anInt736 > 500) {
												Static26.anInt736 = 0;
												local106 = (int) (Math.random() * 8.0D);
												if ((local106 & 0x2) == 2) {
													Static96.anInt3690 += Static49.anInt1188;
												}
												if ((local106 & 0x1) == 1) {
													Static64.anInt1576 += Static92.anInt2193;
												}
											}
											if (Static64.anInt1576 < -60) {
												Static92.anInt2193 = 2;
											}
											if (Static64.anInt1576 > 60) {
												Static92.anInt2193 = -2;
											}
											if (Static96.anInt3690 < -20) {
												Static49.anInt1188 = 1;
											}
											if (Static96.anInt3690 > 10) {
												Static49.anInt1188 = -1;
											}
											if (Static94.anInt2230 > 50) {
												Static141.aClass2_Sub11_Sub1_3.method1495(120);
											}
											try {
												if (Static98.aClass34_5 != null && Static141.aClass2_Sub11_Sub1_3.anInt2077 > 0) {
													Static98.aClass34_5.method1130(Static141.aClass2_Sub11_Sub1_3.anInt2077, Static141.aClass2_Sub11_Sub1_3.aByteArray24);
													Static141.aClass2_Sub11_Sub1_3.anInt2077 = 0;
													Static94.anInt2230 = 0;
													return;
												}
												return;
											} catch (@Pc(1351) IOException local1351) {
												Static106.method1721();
												return;
											}
										}
										local882 = local877.aClass23_9;
										if (local882.anInt1056 < 0) {
											break;
										}
										local890 = Static102.method2541(local882.anInt1045);
									} while (local890 == null || local890.aClass23Array1 == null || local882.anInt1056 >= local890.aClass23Array1.length || local882 != local890.aClass23Array1[local882.anInt1056]);
									Static47.method881(local877);
								}
							}
							local882 = local877.aClass23_9;
							if (local882.anInt1056 < 0) {
								break;
							}
							local890 = Static102.method2541(local882.anInt1045);
						} while (local890 == null || local890.aClass23Array1 == null || local890.aClass23Array1.length <= local882.anInt1056 || local882 != local890.aClass23Array1[local882.anInt1056]);
						Static47.method881(local877);
					}
				}
				local882 = local877.aClass23_9;
				if (local882.anInt1056 < 0) {
					break;
				}
				local890 = Static102.method2541(local882.anInt1045);
			} while (local890 == null || local890.aClass23Array1 == null || local882.anInt1056 >= local890.aClass23Array1.length || local882 != local890.aClass23Array1[local882.anInt1056]);
			Static47.method881(local877);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
	public static boolean method1842(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public static void method1845() {
		aClass38_1 = null;
		anIntArray274 = null;
		aBooleanArray13 = null;
		aClass10_1122 = null;
		aClass10_1117 = null;
		aClass29_Sub1_37 = null;
		aClass10_1124 = null;
		aClass10_1121 = null;
		aClass10_1118 = null;
		aClass10_1120 = null;
		aByteArrayArray9 = null;
		aClass10_1119 = null;
	}
}
