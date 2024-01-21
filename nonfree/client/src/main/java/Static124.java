import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!od", name = "T", descriptor = "Lclient!ne;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "Lclient!ne;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub1_Sub2_Sub1_6;

	@OriginalMember(owner = "client!od", name = "W", descriptor = "[Lclient!ig;")
	public static Class39[] aClass39Array2;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_12;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "[I")
	public static int[] anIntArray325 = new int[32];

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "[I")
	public static int[] anIntArray326 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method2526() {
		if (Static179.anInt4501 > 0) {
			Static179.anInt4501--;
		}
		if (Static166.anInt4305 > 1) {
			Static166.anInt4305--;
		}
		if (Static109.aBoolean125) {
			Static109.aBoolean125 = false;
			Static109.method2272();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static93.method2006(); local30++) {
		}
		if (Static15.anInt445 != 30) {
			return;
		}
		Static147.method2883(Static131.aClass1_Sub9_Sub1_3);
		@Pc(58) Object local58 = Static67.aClass38_1.anObject4;
		@Pc(85) int local85;
		@Pc(87) int local87;
		@Pc(89) int local89;
		@Pc(106) int local106;
		@Pc(125) int local125;
		synchronized (Static67.aClass38_1.anObject4) {
			if (!Static100.aBoolean114) {
				Static67.aClass38_1.anInt2252 = 0;
			} else if (Static63.anInt1966 != 0 || Static67.aClass38_1.anInt2252 >= 40) {
				Static131.aClass1_Sub9_Sub1_3.method1283(189);
				Static131.aClass1_Sub9_Sub1_3.method1260(0);
				local85 = Static131.aClass1_Sub9_Sub1_3.anInt1592;
				local87 = 0;
				for (local89 = 0; local89 < Static67.aClass38_1.anInt2252 && Static131.aClass1_Sub9_Sub1_3.anInt1592 - local85 < 240; local89++) {
					local87++;
					local106 = Static67.aClass38_1.anIntArray213[local89];
					if (local106 < 0) {
						local106 = 0;
					} else if (local106 > 502) {
						local106 = 502;
					}
					local125 = Static67.aClass38_1.anIntArray214[local89];
					if (local125 < 0) {
						local125 = 0;
					} else if (local125 > 764) {
						local125 = 764;
					}
					@Pc(146) int local146 = local106 * 765 + local125;
					if (Static67.aClass38_1.anIntArray213[local89] == -1 && Static67.aClass38_1.anIntArray214[local89] == -1) {
						local146 = 524287;
						local106 = -1;
						local125 = -1;
					}
					if (Static99.anInt4548 != local125 || Static107.anInt3030 != local106) {
						@Pc(195) int local195 = local125 - Static99.anInt4548;
						Static99.anInt4548 = local125;
						@Pc(202) int local202 = local106 - Static107.anInt3030;
						Static107.anInt3030 = local106;
						if (Static100.anInt2847 < 8 && local195 >= -32 && local195 <= 31 && local202 >= -32 && local202 <= 31) {
							local202 += 32;
							local195 += 32;
							Static131.aClass1_Sub9_Sub1_3.method1236((Static100.anInt2847 << 12) + (local195 << 6) + local202);
							Static100.anInt2847 = 0;
						} else if (Static100.anInt2847 < 8) {
							Static131.aClass1_Sub9_Sub1_3.method1226((Static100.anInt2847 << 19) + local146 + 8388608);
							Static100.anInt2847 = 0;
						} else {
							Static131.aClass1_Sub9_Sub1_3.method1259((Static100.anInt2847 << 19) + local146 - 1073741824);
							Static100.anInt2847 = 0;
						}
					} else if (Static100.anInt2847 < 2047) {
						Static100.anInt2847++;
					}
				}
				Static131.aClass1_Sub9_Sub1_3.method1249(Static131.aClass1_Sub9_Sub1_3.anInt1592 - local85);
				if (local87 >= Static67.aClass38_1.anInt2252) {
					Static67.aClass38_1.anInt2252 = 0;
				} else {
					Static67.aClass38_1.anInt2252 -= local87;
					for (local106 = 0; local106 < Static67.aClass38_1.anInt2252; local106++) {
						Static67.aClass38_1.anIntArray214[local106] = Static67.aClass38_1.anIntArray214[local87 + local106];
						Static67.aClass38_1.anIntArray213[local106] = Static67.aClass38_1.anIntArray213[local87 + local106];
					}
				}
			}
		}
		if (Static63.anInt1966 != 0) {
			@Pc(364) long local364 = (Static118.aLong103 - Static94.aLong86) / 50L;
			Static94.aLong86 = Static118.aLong103;
			if (local364 > 4095L) {
				local364 = 4095L;
			}
			local85 = Static15.anInt450;
			local87 = Static170.anInt4392;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 502) {
				local85 = 502;
			}
			@Pc(394) byte local394 = 0;
			if (local87 < 0) {
				local87 = 0;
			} else if (local87 > 764) {
				local87 = 764;
			}
			if (Static63.anInt1966 == 2) {
				local394 = 1;
			}
			Static131.aClass1_Sub9_Sub1_3.method1283(246);
			local125 = (int) local364;
			local89 = local87 + local85 * 765;
			Static131.aClass1_Sub9_Sub1_3.method1264(local89 + (local125 << 20) + (local394 << 19));
		}
		if (Static111.aBooleanArray14[96] || Static111.aBooleanArray14[97] || Static111.aBooleanArray14[98] || Static111.aBooleanArray14[99]) {
			Static73.aBoolean77 = true;
		}
		if (Static163.anInt4253 > 0) {
			Static163.anInt4253--;
		}
		if (Static73.aBoolean77 && Static163.anInt4253 <= 0) {
			Static163.anInt4253 = 20;
			Static73.aBoolean77 = false;
			Static131.aClass1_Sub9_Sub1_3.method1283(44);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static40.anInt1395);
			Static131.aClass1_Sub9_Sub1_3.method1251(Static71.anInt2223);
		}
		if (Static167.aBoolean168 && !Static174.aBoolean174) {
			Static174.aBoolean174 = true;
			Static131.aClass1_Sub9_Sub1_3.method1283(48);
			Static131.aClass1_Sub9_Sub1_3.method1260(1);
		}
		if (!Static167.aBoolean168 && Static174.aBoolean174) {
			Static174.aBoolean174 = false;
			Static131.aClass1_Sub9_Sub1_3.method1283(48);
			Static131.aClass1_Sub9_Sub1_3.method1260(0);
		}
		Static89.method1936();
		if (Static15.anInt445 != 30) {
			return;
		}
		Static167.method3340();
		Static78.method1788();
		Static6.anInt276++;
		if (Static6.anInt276 > 750) {
			Static109.method2272();
			return;
		}
		Static53.method1333();
		Static185.method3520();
		Static75.method1678();
		if (Static115.anInt3162 != 0) {
			Static100.anInt2853 += 20;
			if (Static100.anInt2853 >= 400) {
				Static115.anInt3162 = 0;
			}
		}
		Static72.anInt2243++;
		if (Static118.aClass39_33 != null) {
			Static4.anInt192++;
			if (Static4.anInt192 >= 15) {
				Static171.method3407(Static118.aClass39_33);
				Static118.aClass39_33 = null;
			}
		}
		@Pc(703) Class39 local703;
		if (Static20.aClass39_6 != null) {
			Static171.method3407(Static20.aClass39_6);
			Static69.anInt2126++;
			if (Static140.anInt3677 + 5 < Static21.anInt591 || Static21.anInt591 < Static140.anInt3677 - 5 || Static70.anInt2156 > Static77.anInt2390 + 5 || Static70.anInt2156 < Static77.anInt2390 - 5) {
				Static166.aBoolean162 = true;
			}
			if (Static109.anInt3064 == 0) {
				if (Static166.aBoolean162 && Static69.anInt2126 >= 5) {
					if (Static20.aClass39_6 == Static53.aClass39_16 && Static146.anInt3839 != Static109.anInt3062) {
						local703 = Static20.aClass39_6;
						@Pc(709) byte local709 = 0;
						if (Static139.anInt3675 == 1 && local703.anInt2381 == 206) {
							local709 = 1;
						}
						if (local703.anIntArray228[Static109.anInt3062] <= 0) {
							local709 = 0;
						}
						if (Static95.method2046(Static20.method439(local703))) {
							local85 = Static146.anInt3839;
							local87 = Static109.anInt3062;
							local703.anIntArray228[local87] = local703.anIntArray228[local85];
							local703.anIntArray231[local87] = local703.anIntArray231[local85];
							local703.anIntArray228[local85] = -1;
							local703.anIntArray231[local85] = 0;
						} else if (local709 == 1) {
							local85 = Static146.anInt3839;
							local87 = Static109.anInt3062;
							while (local85 != local87) {
								if (local87 < local85) {
									local703.method1750(local85, local85 - 1);
									local85--;
								} else if (local85 < local87) {
									local703.method1750(local85, local85 + 1);
									local85++;
								}
							}
						} else {
							local703.method1750(Static146.anInt3839, Static109.anInt3062);
						}
						Static131.aClass1_Sub9_Sub1_3.method1283(140);
						Static131.aClass1_Sub9_Sub1_3.method1281(local709);
						Static131.aClass1_Sub9_Sub1_3.method1231(Static20.aClass39_6.anInt2355);
						Static131.aClass1_Sub9_Sub1_3.method1236(Static146.anInt3839);
						Static131.aClass1_Sub9_Sub1_3.method1254(Static109.anInt3062);
					}
				} else if ((Static154.anInt4063 == 1 || Static108.method2265(Static162.anInt4331 - 1)) && Static162.anInt4331 > 2) {
					Static26.method551();
				} else if (Static162.anInt4331 > 0) {
					Static71.method1642(Static162.anInt4331 - 1);
				}
				Static4.anInt192 = 10;
				Static20.aClass39_6 = null;
				Static63.anInt1966 = 0;
			}
		}
		Static48.aBoolean61 = false;
		Static80.aBoolean93 = false;
		Static121.aClass39_36 = null;
		local703 = Static144.aClass39_42;
		Static144.aClass39_42 = null;
		@Pc(856) Class39 local856 = Static107.aClass39_28;
		Static63.anInt1967 = 0;
		Static107.aClass39_28 = null;
		while (Static154.method3106() && Static63.anInt1967 < 128) {
			Static98.anIntArray269[Static63.anInt1967] = Static38.anInt1337;
			Static111.anIntArray300[Static63.anInt1967] = Static53.anInt1721;
			Static63.anInt1967++;
		}
		if (Static58.anInt1865 != -1) {
			Static166.method3304(765, 0, Static58.anInt1865, 0, 0, 0, 503);
		}
		Static58.anInt1875++;
		while (true) {
			@Pc(903) Class1_Sub19 local903;
			@Pc(919) Class39 local919;
			@Pc(908) Class39 local908;
			do {
				local903 = (Class1_Sub19) Static113.aClass4_12.method173();
				if (local903 == null) {
					while (true) {
						do {
							local903 = (Class1_Sub19) Static28.aClass4_2.method173();
							if (local903 == null) {
								while (true) {
									do {
										local903 = (Class1_Sub19) Static47.aClass4_7.method173();
										if (local903 == null) {
											if (Static110.aClass39_30 != null) {
												Static110.method2285();
											}
											if (Static90.anInt2640 != -1) {
												local85 = Static90.anInt2640;
												local87 = Static85.anInt2551;
												@Pc(1069) boolean local1069 = Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local85, 0, 0, 0, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local87, 0, 0, true);
												if (local1069) {
													Static107.anInt3036 = Static170.anInt4392;
													Static100.anInt2853 = 0;
													Static115.anInt3162 = 1;
													Static126.anInt822 = Static15.anInt450;
												}
												Static90.anInt2640 = -1;
											}
											Static57.method1394();
											if (local703 != Static144.aClass39_42) {
												if (local703 != null) {
													Static171.method3407(local703);
												}
												if (Static144.aClass39_42 != null) {
													Static171.method3407(Static144.aClass39_42);
												}
											}
											if (Static107.aClass39_28 != local856 && Static133.anInt3476 == Static126.anInt823) {
												if (local856 != null) {
													Static171.method3407(local856);
												}
												if (Static107.aClass39_28 != null) {
													Static171.method3407(Static107.aClass39_28);
												}
											}
											if (Static107.aClass39_28 == null) {
												if (Static126.anInt823 > 0) {
													Static126.anInt823--;
												}
											} else if (Static133.anInt3476 > Static126.anInt823) {
												Static126.anInt823++;
												if (Static126.anInt823 == Static133.anInt3476) {
													Static171.method3407(Static107.aClass39_28);
												}
											}
											Static134.method2579();
											if (Static176.aBoolean176) {
												Static117.method2400();
											}
											for (local85 = 0; local85 < 5; local85++) {
												@Pc(1164) int local1164 = Static105.anIntArray289[local85]++;
											}
											local87 = Static154.method3108();
											local89 = Static83.method3497();
											if (local87 > 4500 && local89 > 4500) {
												Static179.anInt4501 = 250;
												Static12.method338(4000);
												Static131.aClass1_Sub9_Sub1_3.method1283(160);
											}
											Static73.anInt2247++;
											Static38.anInt1333++;
											if (Static38.anInt1333 > 500) {
												local106 = (int) (Math.random() * 8.0D);
												Static38.anInt1333 = 0;
												if ((local106 & 0x2) == 2) {
													Static16.anInt465 += Static185.anInt4576;
												}
												if ((local106 & 0x4) == 4) {
													Static39.anInt1374 += Static58.anInt1870;
												}
												if ((local106 & 0x1) == 1) {
													Static72.anInt2246 += Static129.anInt4423;
												}
											}
											if (Static72.anInt2246 < -50) {
												Static129.anInt4423 = 2;
											}
											if (Static39.anInt1374 < -40) {
												Static58.anInt1870 = 1;
											}
											if (Static39.anInt1374 > 40) {
												Static58.anInt1870 = -1;
											}
											Static27.anInt734++;
											if (Static27.anInt734 > 500) {
												local106 = (int) (Math.random() * 8.0D);
												if ((local106 & 0x1) == 1) {
													Static50.anInt1667 += Static99.anInt4546;
												}
												if ((local106 & 0x2) == 2) {
													Static25.anInt692 += Static114.anInt3115;
												}
												Static27.anInt734 = 0;
											}
											if (Static25.anInt692 < -20) {
												Static114.anInt3115 = 1;
											}
											if (Static16.anInt465 < -55) {
												Static185.anInt4576 = 2;
											}
											if (Static72.anInt2246 > 50) {
												Static129.anInt4423 = -2;
											}
											if (Static25.anInt692 > 10) {
												Static114.anInt3115 = -1;
											}
											if (Static50.anInt1667 < -60) {
												Static99.anInt4546 = 2;
											}
											if (Static16.anInt465 > 55) {
												Static185.anInt4576 = -2;
											}
											if (Static50.anInt1667 > 60) {
												Static99.anInt4546 = -2;
											}
											if (Static73.anInt2247 > 50) {
												Static131.aClass1_Sub9_Sub1_3.method1283(52);
											}
											try {
												if (Static85.aClass43_22 != null && Static131.aClass1_Sub9_Sub1_3.anInt1592 > 0) {
													Static85.aClass43_22.method2045(Static131.aClass1_Sub9_Sub1_3.aByteArray25, Static131.aClass1_Sub9_Sub1_3.anInt1592);
													Static131.aClass1_Sub9_Sub1_3.anInt1592 = 0;
													Static73.anInt2247 = 0;
													return;
												}
												return;
											} catch (@Pc(1376) IOException local1376) {
												Static109.method2272();
												return;
											}
										}
										local908 = local903.aClass39_31;
										if (local908.anInt2344 < 0) {
											break;
										}
										local919 = Static128.method3227(local908.anInt2325);
									} while (local919 == null || local919.aClass39Array1 == null || local919.aClass39Array1.length <= local908.anInt2344 || local908 != local919.aClass39Array1[local908.anInt2344]);
									Static60.method1460(local903);
								}
							}
							local908 = local903.aClass39_31;
							if (local908.anInt2344 < 0) {
								break;
							}
							local919 = Static128.method3227(local908.anInt2325);
						} while (local919 == null || local919.aClass39Array1 == null || local919.aClass39Array1.length <= local908.anInt2344 || local919.aClass39Array1[local908.anInt2344] != local908);
						Static60.method1460(local903);
					}
				}
				local908 = local903.aClass39_31;
				if (local908.anInt2344 < 0) {
					break;
				}
				local919 = Static128.method3227(local908.anInt2325);
			} while (local919 == null || local919.aClass39Array1 == null || local919.aClass39Array1.length <= local908.anInt2344 || local919.aClass39Array1[local908.anInt2344] != local908);
			Static60.method1460(local903);
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)V")
	public static void method2527() {
		aClass76_Sub1_12 = null;
		anIntArray325 = null;
		anIntArray326 = null;
		aClass1_Sub1_Sub1_Sub2_Sub1_6 = null;
		aClass1_Sub1_Sub1_Sub2_Sub1_5 = null;
		aClass39Array2 = null;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(II)Lclient!hb;")
	public static Class1_Sub1_Sub8 method2528(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub1_Sub8 local11 = (Class1_Sub1_Sub8) Static74.aClass25_12.method1302((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static32.aClass76_28.method3316(arg0, 1);
		local11 = new Class1_Sub1_Sub8();
		if (local25 != null) {
			local11.method1541(new Class1_Sub9(local25), arg0);
		}
		Static74.aClass25_12.method1299(local11, (long) arg0);
		return local11;
	}
}
