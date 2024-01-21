import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!ob;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_308 = Static146.method2172("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public static volatile int anInt715 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method513() {
		aClass58_1 = null;
		aClass77_308 = null;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	private static void method514() {
		for (@Pc(15) int local15 = 0; local15 < Static90.anInt2345; local15++) {
			@Pc(21) int local21 = Static139.anIntArray504[local15]--;
			if (Static139.anIntArray504[local15] >= -10) {
				@Pc(88) Class76 local88 = Static46.aClass76Array1[local15];
				if (local88 == null) {
					local88 = Static188.method2449(Static55.aClass43_Sub1_9, Static103.anIntArray402[local15], 0);
					if (local88 == null) {
						continue;
					}
					Static139.anIntArray504[local15] += local88.method2448();
					Static46.aClass76Array1[local15] = local88;
				}
				if (Static139.anIntArray504[local15] < 0) {
					@Pc(125) int local125;
					if (Static79.anIntArray351[local15] == 0) {
						local125 = Static31.anInt883;
					} else {
						@Pc(135) int local135 = (Static79.anIntArray351[local15] & 0xFF) * 128;
						@Pc(143) int local143 = Static79.anIntArray351[local15] >> 16 & 0xFF;
						@Pc(151) int local151 = Static79.anIntArray351[local15] >> 8 & 0xFF;
						@Pc(161) int local161 = local143 * 128 + 64 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400;
						@Pc(171) int local171 = local151 * 128 + 64 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385;
						if (local171 < 0) {
							local171 = -local171;
						}
						if (local161 < 0) {
							local161 = -local161;
						}
						@Pc(190) int local190 = local171 + local161 - 128;
						if (local135 < local190) {
							Static139.anIntArray504[local15] = -100;
							continue;
						}
						if (local190 < 0) {
							local190 = 0;
						}
						local125 = Static18.anInt617 * (local135 - local190) / local135;
					}
					if (local125 > 0) {
						@Pc(226) Class2_Sub5_Sub1 local226 = local88.method2447().method1397(Static150.aClass27_1);
						@Pc(231) Class2_Sub9_Sub1 local231 = Static187.method1708(local226, local125);
						local231.method1723(Static59.anIntArray239[local15] - 1);
						Static153.aClass2_Sub9_Sub4_2.method2932(local231);
					}
					Static139.anIntArray504[local15] = -100;
				}
			} else {
				Static90.anInt2345--;
				for (@Pc(35) int local35 = local15; local35 < Static90.anInt2345; local35++) {
					Static103.anIntArray402[local35] = Static103.anIntArray402[local35 + 1];
					Static46.aClass76Array1[local35] = Static46.aClass76Array1[local35 + 1];
					Static59.anIntArray239[local35] = Static59.anIntArray239[local35 + 1];
					Static139.anIntArray504[local35] = Static139.anIntArray504[local35 + 1];
					Static79.anIntArray351[local35] = Static79.anIntArray351[local35 + 1];
				}
				local15--;
			}
		}
		if (Static8.aBoolean10 && !Static82.method1514()) {
			if (Static120.anInt1042 != 0 && Static99.anInt2498 != -1) {
				Static58.method1066(Static176.aClass43_Sub1_20, 0, Static120.anInt1042, Static99.anInt2498);
			}
			Static8.aBoolean10 = false;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ke;IBI)[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] method515(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static152.method2595(arg2, arg1, arg0) ? Static136.method2290() : null;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public static void method516() {
		if (Static63.anInt1682 > 0) {
			Static63.anInt1682--;
		}
		if (Static92.anInt2387 > 1) {
			Static92.anInt2387--;
		}
		if (Static149.aBoolean148) {
			Static149.aBoolean148 = false;
			Static115.method2044();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static171.method2869(); local30++) {
		}
		if (Static97.anInt2440 != 30) {
			return;
		}
		Static157.method2673(Static124.aClass2_Sub18_Sub1_3);
		@Pc(52) Object local52 = Static55.aClass40_1.anObject2;
		@Pc(82) int local82;
		@Pc(84) int local84;
		@Pc(86) int local86;
		@Pc(100) int local100;
		@Pc(118) int local118;
		synchronized (Static55.aClass40_1.anObject2) {
			if (!Static172.aBoolean178) {
				Static55.aClass40_1.anInt1983 = 0;
			} else if (Static50.anInt1384 != 0 || Static55.aClass40_1.anInt1983 >= 40) {
				Static124.aClass2_Sub18_Sub1_3.method2398(93);
				Static124.aClass2_Sub18_Sub1_3.method2389(0);
				local82 = Static124.aClass2_Sub18_Sub1_3.anInt3423;
				local84 = 0;
				for (local86 = 0; Static55.aClass40_1.anInt1983 > local86 && Static124.aClass2_Sub18_Sub1_3.anInt3423 - local82 < 240; local86++) {
					local84++;
					local100 = Static55.aClass40_1.anIntArray332[local86];
					if (local100 < 0) {
						local100 = 0;
					} else if (local100 > 502) {
						local100 = 502;
					}
					local118 = Static55.aClass40_1.anIntArray331[local86];
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 764) {
						local118 = 764;
					}
					@Pc(140) int local140 = local118 + local100 * 765;
					if (Static55.aClass40_1.anIntArray332[local86] == -1 && Static55.aClass40_1.anIntArray331[local86] == -1) {
						local140 = 524287;
						local118 = -1;
						local100 = -1;
					}
					if (local118 != Static165.anInt4026 || local100 != Static131.anInt4357) {
						@Pc(186) int local186 = local118 - Static165.anInt4026;
						@Pc(191) int local191 = local100 - Static131.anInt4357;
						Static165.anInt4026 = local118;
						Static131.anInt4357 = local100;
						if (Static53.anInt1465 < 8 && local186 >= -32 && local186 <= 31 && local191 >= -32 && local191 <= 31) {
							local191 += 32;
							local186 += 32;
							Static124.aClass2_Sub18_Sub1_3.method2369((local186 << 6) + (Static53.anInt1465 << 12) + local191);
							Static53.anInt1465 = 0;
						} else if (Static53.anInt1465 < 8) {
							Static124.aClass2_Sub18_Sub1_3.method2360((Static53.anInt1465 << 19) + local140 + 8388608);
							Static53.anInt1465 = 0;
						} else {
							Static124.aClass2_Sub18_Sub1_3.method2370(local140 + (Static53.anInt1465 << 19) - 1073741824);
							Static53.anInt1465 = 0;
						}
					} else if (Static53.anInt1465 < 2047) {
						Static53.anInt1465++;
					}
				}
				Static124.aClass2_Sub18_Sub1_3.method2371(Static124.aClass2_Sub18_Sub1_3.anInt3423 - local82);
				if (local84 >= Static55.aClass40_1.anInt1983) {
					Static55.aClass40_1.anInt1983 = 0;
				} else {
					Static55.aClass40_1.anInt1983 -= local84;
					for (local100 = 0; local100 < Static55.aClass40_1.anInt1983; local100++) {
						Static55.aClass40_1.anIntArray331[local100] = Static55.aClass40_1.anIntArray331[local100 + local84];
						Static55.aClass40_1.anIntArray332[local100] = Static55.aClass40_1.anIntArray332[local100 + local84];
					}
				}
			}
		}
		if (Static50.anInt1384 != 0) {
			@Pc(355) long local355 = (Static114.aLong92 - Static150.aLong109) / 50L;
			if (local355 > 4095L) {
				local355 = 4095L;
			}
			local84 = Static156.anInt3884;
			if (local84 < 0) {
				local84 = 0;
			} else if (local84 > 764) {
				local84 = 764;
			}
			Static150.aLong109 = Static114.aLong92;
			@Pc(383) byte local383 = 0;
			if (Static50.anInt1384 == 2) {
				local383 = 1;
			}
			local82 = Static38.anInt1113;
			Static124.aClass2_Sub18_Sub1_3.method2398(110);
			local118 = (int) local355;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 502) {
				local82 = 502;
			}
			local86 = local82 * 765 + local84;
			Static124.aClass2_Sub18_Sub1_3.method2370(local86 + (local383 << 19) + (local118 << 20));
		}
		if (Static146.aBooleanArray12[96] || Static146.aBooleanArray12[97] || Static146.aBooleanArray12[98] || Static146.aBooleanArray12[99]) {
			Static168.aBoolean170 = true;
		}
		if (Static105.anInt2568 > 0) {
			Static105.anInt2568--;
		}
		if (Static168.aBoolean170 && Static105.anInt2568 <= 0) {
			Static105.anInt2568 = 20;
			Static168.aBoolean170 = false;
			Static124.aClass2_Sub18_Sub1_3.method2398(8);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static28.anInt832);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static146.anInt3057);
		}
		if (Static41.aBoolean57 && !Static84.aBoolean125) {
			Static84.aBoolean125 = true;
			Static124.aClass2_Sub18_Sub1_3.method2398(255);
			Static124.aClass2_Sub18_Sub1_3.method2389(1);
		}
		if (!Static41.aBoolean57 && Static84.aBoolean125) {
			Static84.aBoolean125 = false;
			Static124.aClass2_Sub18_Sub1_3.method2398(255);
			Static124.aClass2_Sub18_Sub1_3.method2389(0);
		}
		Static76.method1426();
		if (Static97.anInt2440 != 30) {
			return;
		}
		Static3.method67();
		method514();
		Static42.anInt1177++;
		if (Static42.anInt1177 > 750) {
			Static115.method2044();
			return;
		}
		Static79.method1466();
		Static123.method2154();
		Static124.method2158();
		Static131.anInt4359++;
		if (Static2.anInt97 != 0) {
			Static94.anInt2407 += 20;
			if (Static94.anInt2407 >= 400) {
				Static2.anInt97 = 0;
			}
		}
		if (Static111.aClass66_8 != null) {
			Static84.anInt3147++;
			if (Static84.anInt3147 >= 15) {
				Static57.method2994(Static111.aClass66_8);
				Static111.aClass66_8 = null;
			}
		}
		@Pc(671) Class66 local671;
		if (Static149.aClass66_12 != null) {
			Static57.method2994(Static149.aClass66_12);
			Static45.anInt1191++;
			if (Static20.anInt631 > Static132.anInt3177 + 5 || Static20.anInt631 < Static132.anInt3177 - 5 || Static132.anInt3185 > Static62.anInt1661 + 5 || Static62.anInt1661 - 5 > Static132.anInt3185) {
				Static24.aBoolean40 = true;
			}
			if (Static31.anInt887 == 0) {
				if (Static24.aBoolean40 && Static45.anInt1191 >= 5) {
					if (Static139.aClass66_11 == Static149.aClass66_12 && Static124.anInt3033 != Static58.anInt1522) {
						@Pc(669) byte local669 = 0;
						local671 = Static149.aClass66_12;
						if (Static60.anInt1612 == 1 && local671.anInt3224 == 206) {
							local669 = 1;
						}
						if (local671.anIntArray468[Static58.anInt1522] <= 0) {
							local669 = 0;
						}
						if (Static78.method1458(Static63.method1160(local671))) {
							local82 = Static124.anInt3033;
							local84 = Static58.anInt1522;
							local671.anIntArray468[local84] = local671.anIntArray468[local82];
							local671.anIntArray474[local84] = local671.anIntArray474[local82];
							local671.anIntArray468[local82] = -1;
							local671.anIntArray474[local82] = 0;
						} else if (local669 == 1) {
							local82 = Static124.anInt3033;
							local84 = Static58.anInt1522;
							while (local82 != local84) {
								if (local82 > local84) {
									local671.method2250(local82 - 1, local82);
									local82--;
								} else if (local82 < local84) {
									local671.method2250(local82 + 1, local82);
									local82++;
								}
							}
						} else {
							local671.method2250(Static58.anInt1522, Static124.anInt3033);
						}
						Static124.aClass2_Sub18_Sub1_3.method2398(252);
						Static124.aClass2_Sub18_Sub1_3.method2396(Static124.anInt3033);
						Static124.aClass2_Sub18_Sub1_3.method2342(Static149.aClass66_12.anInt3229);
						Static124.aClass2_Sub18_Sub1_3.method2396(Static58.anInt1522);
						Static124.aClass2_Sub18_Sub1_3.method2355(local669);
					}
				} else if ((Static98.anInt2481 == 1 || Static131.method2904(Static18.anInt618 - 1)) && Static18.anInt618 > 2) {
					Static80.method1473();
				} else if (Static18.anInt618 > 0) {
					Static53.method1024(Static18.anInt618 - 1);
				}
				Static84.anInt3147 = 10;
				Static149.aClass66_12 = null;
				Static50.anInt1384 = 0;
			}
		}
		Static109.aClass66_4 = null;
		Static50.aBoolean70 = false;
		local671 = Static112.aClass66_9;
		Static112.aClass66_9 = null;
		@Pc(819) Class66 local819 = Static9.aClass66_1;
		Static56.aBoolean77 = false;
		Static9.aClass66_1 = null;
		for (Static31.anInt885 = 0; Static173.method2918() && Static31.anInt885 < 128; Static31.anInt885++) {
			Static48.anIntArray211[Static31.anInt885] = Static53.anInt1463;
			Static94.anIntArray388[Static31.anInt885] = Static33.anInt968;
		}
		Static108.method1924(0, 0, 503, Static93.anInt2394, 0, 0, 765);
		Static52.anInt1417++;
		while (true) {
			@Pc(867) Class2_Sub21 local867;
			@Pc(883) Class66 local883;
			@Pc(872) Class66 local872;
			do {
				local867 = (Class2_Sub21) Static76.aClass10_58.method449();
				if (local867 == null) {
					while (true) {
						do {
							local867 = (Class2_Sub21) Static174.aClass10_114.method449();
							if (local867 == null) {
								while (true) {
									do {
										local867 = (Class2_Sub21) Static167.aClass10_106.method449();
										if (local867 == null) {
											if (Static34.aClass66_5 != null) {
												Static109.method624();
											}
											if (Static116.anInt2881 != -1) {
												local84 = Static116.anInt2886;
												local82 = Static116.anInt2881;
												@Pc(1041) boolean local1041 = Static142.method2411(true, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local82, 0, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local84, 0);
												if (local1041) {
													Static105.anInt2571 = Static38.anInt1113;
													Static58.anInt1518 = Static156.anInt3884;
													Static2.anInt97 = 1;
													Static94.anInt2407 = 0;
												}
												Static116.anInt2881 = -1;
											}
											Static126.method1617();
											if (local671 != Static112.aClass66_9) {
												if (local671 != null) {
													Static57.method2994(local671);
												}
												if (Static112.aClass66_9 != null) {
													Static57.method2994(Static112.aClass66_9);
												}
											}
											if (Static9.aClass66_1 != local819 && Static112.anInt2797 == Static179.anInt4564) {
												if (local819 != null) {
													Static57.method2994(local819);
												}
												if (Static9.aClass66_1 != null) {
													Static57.method2994(Static9.aClass66_1);
												}
											}
											if (Static9.aClass66_1 == null) {
												if (Static112.anInt2797 > 0) {
													Static112.anInt2797--;
												}
											} else if (Static179.anInt4564 > Static112.anInt2797) {
												Static112.anInt2797++;
												if (Static112.anInt2797 == Static179.anInt4564) {
													Static57.method2994(Static9.aClass66_1);
												}
											}
											Static26.method525();
											if (Static16.aBoolean29) {
												Static108.method1925();
											}
											for (local82 = 0; local82 < 5; local82++) {
												@Pc(1133) int local1133 = Static119.anIntArray449[local82]++;
											}
											local84 = Static93.method1686();
											local86 = Static104.method1831();
											if (local84 > 4500 && local86 > 4500) {
												Static63.anInt1682 = 250;
												Static80.method1472(4000);
												Static124.aClass2_Sub18_Sub1_3.method2398(190);
											}
											Static120.anInt1044++;
											Static169.anInt4189++;
											Static145.anInt3531++;
											if (Static169.anInt4189 > 500) {
												Static169.anInt4189 = 0;
												local100 = (int) (Math.random() * 8.0D);
												if ((local100 & 0x2) == 2) {
													Static6.anInt175 += Static137.anInt3305;
												}
												if ((local100 & 0x4) == 4) {
													Static149.anInt3649 += Static103.anInt2514;
												}
												if ((local100 & 0x1) == 1) {
													Static4.anInt4368 += Static49.anInt1349;
												}
											}
											if (Static4.anInt4368 < -50) {
												Static49.anInt1349 = 2;
											}
											if (Static6.anInt175 < -55) {
												Static137.anInt3305 = 2;
											}
											if (Static6.anInt175 > 55) {
												Static137.anInt3305 = -2;
											}
											if (Static149.anInt3649 < -40) {
												Static103.anInt2514 = 1;
											}
											if (Static145.anInt3531 > 500) {
												Static145.anInt3531 = 0;
												local100 = (int) (Math.random() * 8.0D);
												if ((local100 & 0x2) == 2) {
													Static130.anInt3166 += Static6.anInt182;
												}
												if ((local100 & 0x1) == 1) {
													Static160.anInt4572 += Static143.anInt3517;
												}
											}
											if (Static130.anInt3166 < -20) {
												Static6.anInt182 = 1;
											}
											if (Static149.anInt3649 > 40) {
												Static103.anInt2514 = -1;
											}
											if (Static4.anInt4368 > 50) {
												Static49.anInt1349 = -2;
											}
											if (Static130.anInt3166 > 10) {
												Static6.anInt182 = -1;
											}
											if (Static160.anInt4572 < -60) {
												Static143.anInt3517 = 2;
											}
											if (Static160.anInt4572 > 60) {
												Static143.anInt3517 = -2;
											}
											if (Static120.anInt1044 > 50) {
												Static124.aClass2_Sub18_Sub1_3.method2398(46);
											}
											try {
												if (Static2.aClass29_2 != null && Static124.aClass2_Sub18_Sub1_3.anInt3423 > 0) {
													Static2.aClass29_2.method969(Static124.aClass2_Sub18_Sub1_3.anInt3423, Static124.aClass2_Sub18_Sub1_3.aByteArray39);
													Static120.anInt1044 = 0;
													Static124.aClass2_Sub18_Sub1_3.anInt3423 = 0;
													return;
												}
												return;
											} catch (@Pc(1352) IOException local1352) {
												Static115.method2044();
												return;
											}
										}
										local872 = local867.aClass66_14;
										if (local872.anInt3212 < 0) {
											break;
										}
										local883 = Static55.method1034(local872.anInt3237);
									} while (local883 == null || local883.aClass66Array2 == null || local872.anInt3212 >= local883.aClass66Array2.length || local872 != local883.aClass66Array2[local872.anInt3212]);
									Static150.method2565(local867);
								}
							}
							local872 = local867.aClass66_14;
							if (local872.anInt3212 < 0) {
								break;
							}
							local883 = Static55.method1034(local872.anInt3237);
						} while (local883 == null || local883.aClass66Array2 == null || local883.aClass66Array2.length <= local872.anInt3212 || local872 != local883.aClass66Array2[local872.anInt3212]);
						Static150.method2565(local867);
					}
				}
				local872 = local867.aClass66_14;
				if (local872.anInt3212 < 0) {
					break;
				}
				local883 = Static55.method1034(local872.anInt3237);
			} while (local883 == null || local883.aClass66Array2 == null || local872.anInt3212 >= local883.aClass66Array2.length || local872 != local883.aClass66Array2[local872.anInt3212]);
			Static150.method2565(local867);
		}
	}
}
