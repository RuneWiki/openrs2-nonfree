import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_3 = new Class28(1, 2, 2, 0);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1084() {
		for (@Pc(1) int local1 = 0; local1 < Static188.anInt3850; local1++) {
			@Pc(6) int[] local6 = Static173.anIntArrayArray18[local1];
			for (@Pc(8) int local8 = 0; local8 < Static49.anInt1174; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1086() {
		@Pc(1) int local1 = Static376.anInt6647;
		@Pc(3) int[] local3 = Static557.anIntArray665;
		@Pc(20) boolean local20 = Static72.aClass2_Sub12_Sub1_1.anInt1905 == 1 && local1 > 200 || Static72.aClass2_Sub12_Sub1_1.anInt1905 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class6_Sub1_Sub1_Sub1_Sub2 local29 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local3[local22]];
			if (local29.method6175()) {
				local29.method6152();
				if (local29.aShort85 >= 0 && local29.aShort83 >= 0 && local29.aShort86 < Static188.anInt3850 && local29.aShort84 < Static49.anInt1174) {
					local29.aBoolean577 = local29.aBoolean569 ? local20 : false;
					if (local29 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2) {
						local29.anInt7381 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean570) {
							local75++;
						}
						if (local29.anInt7410 > Static412.anInt575) {
							local75 += 2;
						}
						local75 += 5 - local29.method6165() << 2;
						if (local29.aBoolean575) {
							local75 += 512;
						} else {
							if (Static570.anInt6322 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7381 = local75 + 1;
					}
				} else {
					local29.anInt7381 = -1;
				}
			} else {
				local29.anInt7381 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static416.anInt7186; local116++) {
			@Pc(127) Class6_Sub1_Sub1_Sub1_Sub1 local127 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local116])).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			if (local127.method155() && local127.aClass86_1.method1572(Static70.aClass78_1)) {
				local127.method6152();
				if (local127.aShort85 >= 0 && local127.aShort83 >= 0 && local127.aShort86 < Static188.anInt3850 && local127.aShort84 < Static49.anInt1174) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean570) {
						local164++;
					}
					if (local127.anInt7410 > Static412.anInt575) {
						local164 += 2;
					}
					local164 += 5 - local127.method6165() << 2;
					if (Static570.anInt6322 == 0) {
						if (local127.aClass86_1.aBoolean198) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static570.anInt6322 == 1) {
						if (local127.aClass86_1.aBoolean198) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass86_1.aBoolean193) {
						local164 += 1024;
					} else if (!local127.aClass86_1.aBoolean195) {
						local164 += 256;
					}
					local127.anInt7381 = local164 + 1;
				} else {
					local127.anInt7381 = -1;
				}
			} else {
				local127.anInt7381 = -1;
			}
		}
		for (local75 = 0; local75 < Static134.aClass246Array1.length; local75++) {
			@Pc(230) Class246 local230 = Static134.aClass246Array1[local75];
			if (local230 != null) {
				if (local230.anInt6838 == 1) {
					@Pc(244) Class2_Sub32 local244 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local230.anInt6841);
					if (local244 != null) {
						@Pc(249) Class6_Sub1_Sub1_Sub1_Sub1 local249 = local244.aClass6_Sub1_Sub1_Sub1_Sub1_1;
						if (local249.anInt7381 >= 0) {
							local249.anInt7381 += 2048;
						}
					}
				} else if (local230.anInt6838 == 10) {
					@Pc(268) Class6_Sub1_Sub1_Sub1_Sub2 local268 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local230.anInt6841];
					if (local268 != null && local268 != Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 && local268.anInt7381 >= 0) {
						local268.anInt7381 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1087(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static376.anInt6647;
		@Pc(3) int[] local3 = Static557.anIntArray665;
		@Pc(11) int local11 = Static440.aBoolean612 ? local1 : local1 + Static416.anInt7186;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class6_Sub1_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local13 - local1])).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			}
			if (local23.aByte112 == arg0) {
				local23.anInt7401 = 0;
				if (local23.anInt7381 < 0) {
					local23.aBoolean570 = false;
				} else {
					@Pc(54) int local54 = local23.method6165();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8761 & 0x1FF) != 0 || (local23.anInt8764 & 0x1FF) != 0) {
							local23.aBoolean570 = false;
							continue;
						}
					} else if ((local23.anInt8761 & 0x1FF) != 256 || (local23.anInt8764 & 0x1FF) != 256) {
						local23.aBoolean570 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8761 >> 9;
						local101 = local23.anInt8764 >> 9;
						if (local23.anInt7381 != Static173.anIntArrayArray18[local96][local101]) {
							local23.aBoolean570 = true;
							continue;
						}
						if (Static590.anIntArrayArray70[local96][local101] > 1) {
							local126 = Static590.anIntArrayArray70[local96][local101]--;
							local23.aBoolean570 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8761 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8764 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8761 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8764 + local96 >> 9;
						if (!Static353.method5259(local162, local101, local155, local23.anInt7381, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt7381 == Static173.anIntArrayArray18[local180][local183]) {
										local126 = Static590.anIntArrayArray70[local180][local183]--;
									}
								}
							}
							local23.aBoolean570 = true;
							continue;
						}
					}
					local23.aBoolean570 = false;
					local23.anInt8759 = Static524.method7217(local23.anInt8761, local23.aByte112, local23.anInt8764);
					Static516.method7139(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kp;)Lclient!kp;")
	public static Class196 method1088(@OriginalArg(0) Class196 arg0) {
		@Pc(4) int local4 = method1102(arg0).method5421();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static117.method1748(arg0.anInt5089);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!kp;IIIIIIIII)V")
	public static void method1089(@OriginalArg(0) Class196[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class196 local6 = arg0[local1];
			if (local6 != null && local6.anInt5089 == arg1) {
				@Pc(17) int local17 = local6.anInt5095 + arg6;
				@Pc(22) int local22 = local6.anInt5093 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt5098 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt5130;
					@Pc(45) int local45 = local22 + local6.anInt5078;
					if (local6.anInt5098 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt5098 == 0 || local6.aBoolean407 || method1102(local6).anInt6464 != 0 || local6 == Static453.aClass196_8 || local6.anInt5090 == Static514.anInt401 || local6.anInt5090 == Static311.anInt5567) {
					if (!method1092(local6)) {
						if (local6 == Static288.aClass196_3 && Static114.method1700(Static288.aClass196_3) != null) {
							Static43.aBoolean627 = true;
							Static196.anInt3904 = local17;
							Static225.anInt4216 = local22;
						}
						if (local6.aBoolean414 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean412 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class2_Sub31 local156 = (Class2_Sub31) Static516.aClass8_60.method210(); local156 != null; local156 = (Class2_Sub31) Static516.aClass8_60.method218()) {
									if (local156.aBoolean484) {
										local156.method7966();
										local156.aClass196_4.aBoolean410 = false;
									}
								}
								if (Static7.anInt333 == 0) {
									Static288.aClass196_3 = null;
									Static453.aClass196_8 = null;
								}
								Static36.anInt909 = 0;
								Static381.aBoolean544 = false;
								Static164.aBoolean287 = false;
								if (!Static167.aBoolean291) {
									Static540.method7371();
								}
							}
							@Pc(212) boolean local212;
							if (Static326.aClass149_1.method5879() >= local28 && Static326.aClass149_1.method5875() >= local30 && Static326.aClass149_1.method5879() < local32 && Static326.aClass149_1.method5875() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static25.aBoolean32 && local212) {
								if (local6.anInt5156 >= 0) {
									Static78.anInt9033 = local6.anInt5156;
								} else if (local6.aBoolean412) {
									Static78.anInt9033 = -1;
								}
							}
							if (!Static167.aBoolean291 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static490.method6855(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(256) boolean local256 = false;
							if (Static326.aClass149_1.method5884() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class2_Sub16 local271 = (Class2_Sub16) Static445.aClass8_54.method210();
							if (local271 != null && local271.method6008() == 0 && local271.method6004() >= local28 && local271.method6005() >= local30 && local271.method6004() < local32 && local271.method6005() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray60 != null && !Static462.method6517()) {
								for (local307 = 0; local307 < local6.aByteArray60.length; local307++) {
									if (Static529.aClass177_10.method4001(local6.aByteArray60[local307])) {
										if (local6.anIntArray348 == null || Static412.anInt575 >= local6.anIntArray348[local307]) {
											@Pc(339) byte local339 = local6.aByteArray61[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static529.aClass177_10.method4001(86) && !Static529.aClass177_10.method4001(82) && !Static529.aClass177_10.method4001(81)) && ((local339 & 0x2) == 0 || Static529.aClass177_10.method4001(86)) && ((local339 & 0x1) == 0 || Static529.aClass177_10.method4001(82)) && ((local339 & 0x4) == 0 || Static529.aClass177_10.method4001(81))) {
												if (local307 < 10) {
													Static56.method939(-1, local307 + 1, "", local6.anInt5112);
												} else if (local307 == 10) {
													Static566.method7699();
													@Pc(410) Class2_Sub35 local410 = method1102(local6);
													Static119.method1773(local6, local410.method5420(), local410.anInt6469);
													Static271.aString38 = Static509.method7072(local6);
													if (Static271.aString38 == null) {
														Static271.aString38 = "Null";
													}
													Static12.aString4 = local6.aString41 + "<col=ffffff>";
												}
												local441 = local6.anIntArray357[local307];
												if (local6.anIntArray348 == null) {
													local6.anIntArray348 = new int[local6.aByteArray60.length];
												}
												if (local441 == 0) {
													local6.anIntArray348[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray348[local307] = Static412.anInt575 + local441;
												}
											}
										}
									} else if (local6.anIntArray348 != null) {
										local6.anIntArray348[local307] = 0;
									}
								}
							}
							if (local266) {
								Static580.method7845(local271.method6004() - local17, local6, local271.method6005() - local22);
							}
							if (Static288.aClass196_3 != null && Static288.aClass196_3 != local6 && local212 && method1102(local6).method5422()) {
								Static49.aClass196_1 = local6;
							}
							if (local6 == Static453.aClass196_8) {
								Static578.aBoolean720 = true;
								Static419.anInt6521 = local17;
								Static547.anInt6998 = local22;
							}
							if (local6.aBoolean407 || local6.anInt5090 != 0) {
								@Pc(526) Class2_Sub31 local526;
								if (local212 && Static148.anInt3056 != 0 && local6.anObjectArray10 != null) {
									local526 = new Class2_Sub31();
									local526.aBoolean484 = true;
									local526.aClass196_4 = local6;
									local526.anInt6076 = Static148.anInt3056;
									local526.anObjectArray32 = local6.anObjectArray10;
									Static516.aClass8_60.method212(local526);
								}
								if (Static288.aClass196_3 != null || Static167.aBoolean291 || local6.anInt5090 != Static248.anInt4653 && Static36.anInt909 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt5090 != 0) {
									if (local6.anInt5090 == Static315.anInt8437 || local6.anInt5090 == Static490.anInt8277) {
										Static512.aClass196_11 = local6;
										if (Static459.aClass326_1 != null) {
											Static459.aClass326_1.method7196(local6.anInt5078, Static307.aClass100_6);
										}
										if (local6.anInt5090 == Static315.anInt8437) {
											if (!Static167.aBoolean291 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static321.method4969(arg8, Static307.aClass100_6, arg9);
												for (@Pc(609) Class6_Sub2 local609 = (Class6_Sub2) Static104.aClass109_3.method2314(); local609 != null; local609 = (Class6_Sub2) Static104.aClass109_3.method2312()) {
													if (arg8 >= local609.anInt2383 && arg8 < local609.anInt2378 && arg9 >= local609.anInt2379 && arg9 < local609.anInt2382) {
														Static540.method7371();
														Static452.method6457(local609.aClass6_Sub1_Sub1_Sub1_1);
													}
												}
											}
											Static120.method1777(local22, local17, local6);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt5090 == Static514.anInt401) {
										if (local6.method4250(Static307.aClass100_6) == null || Static422.anInt7227 != 0 && Static422.anInt7227 != 3 || Static167.aBoolean291 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray355[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray358[local681]) {
											continue;
										}
										local307 -= local6.anInt5130 / 2;
										local681 -= local6.anInt5078 / 2;
										if (Static311.anInt5570 == 4) {
											local720 = (int) Static447.aFloat233 & 0x3FFF;
										} else {
											local720 = (int) Static447.aFloat233 + Static417.anInt7188 & 0x3FFF;
										}
										@Pc(732) int local732 = Class363.anIntArray697[local720];
										@Pc(736) int local736 = Class363.anIntArray698[local720];
										if (Static311.anInt5570 != 4) {
											local732 = local732 * (Static557.anInt9152 + 256) >> 8;
											local736 = local736 * (Static557.anInt9152 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static311.anInt5570 == 4) {
											local786 = (Static156.anInt8481 >> 9) + (local765 >> 2);
											local794 = (Static433.anInt7318 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6165() - 1) * 256;
											local786 = (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 - local803 >> 9) + (local765 >> 2);
											local794 = (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 - local803 >> 9) - (local775 >> 2);
										}
										if (Static25.aBoolean32 && (Static242.anInt4524 & 0x40) != 0) {
											@Pc(836) Class196 local836 = Static217.method3485(Static514.anInt406, Static428.anInt7337);
											if (local836 == null) {
												Static566.method7699();
											} else {
												Static304.method4554(local786, false, local794, local6.anInt5152, true, Static540.anInt8826, 1L, " ->", 30, Static271.aString38);
											}
											continue;
										}
										if (Static328.aClass284_2 == Static404.aClass284_3) {
											Static304.method4554(local786, false, local794, -1, true, -1, 1L, "", 21, Static290.aClass198_29.method4365(Static52.anInt1264));
										}
										Static304.method4554(local786, false, local794, -1, true, Static233.anInt4344, 1L, "", 10, Static320.aString49);
										continue;
									}
									if (local6.anInt5090 == Static248.anInt4653) {
										Static368.aClass196_6 = local6;
										if (local212) {
											Static381.aBoolean544 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method6004() - local17 - local6.anInt5130 / 2) * 2.0D / (double) Static270.aFloat47);
											local681 = (int) -((double) (local271.method6005() - local22 - local6.anInt5078 / 2) * 2.0D / (double) Static270.aFloat47);
											local441 = Static549.anInt8926 + local307 + Static270.anInt1801;
											local720 = Static75.anInt1651 + local681 + Static270.anInt1800;
											@Pc(950) Class2_Sub3_Sub3 local950 = Static352.method5250();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method1632(local720, local441, local955);
											if (local955 != null) {
												if (Static529.aClass177_10.method4001(82) && Static210.anInt4045 > 0) {
													Static325.method7943(local955[0], local955[2], local955[1]);
													continue;
												}
												Static164.aBoolean287 = true;
												Static70.anInt1598 = local955[0];
												Static105.anInt2172 = local955[1];
												Static392.anInt6871 = local955[2];
											}
											Static36.anInt909 = 1;
											Static496.aBoolean650 = false;
											Static403.anInt7032 = Static326.aClass149_1.method5879();
											Static339.anInt2916 = Static326.aClass149_1.method5875();
											continue;
										}
										if (local256 && Static36.anInt909 > 0) {
											if (Static36.anInt909 == 1 && (Static403.anInt7032 != Static326.aClass149_1.method5879() || Static339.anInt2916 != Static326.aClass149_1.method5875())) {
												Static156.anInt8482 = Static549.anInt8926;
												Static289.anInt5285 = Static75.anInt1651;
												Static36.anInt909 = 2;
											}
											if (Static36.anInt909 == 2) {
												Static496.aBoolean650 = true;
												Static280.method4196(Static156.anInt8482 + (int) ((double) (Static403.anInt7032 - Static326.aClass149_1.method5879()) * 2.0D / (double) Static270.aFloat48));
												Static212.method3435(Static289.anInt5285 - (int) ((double) (Static339.anInt2916 - Static326.aClass149_1.method5875()) * 2.0D / (double) Static270.aFloat48));
											}
											continue;
										}
										if (Static36.anInt909 > 0 && !Static496.aBoolean650) {
											if ((Static224.anInt4203 == 1 || Static411.method5983()) && Static347.anInt6255 > 2) {
												Static277.method4189(Static403.anInt7032, Static339.anInt2916);
											} else if (Static181.method3116()) {
												Static277.method4189(Static403.anInt7032, Static339.anInt2916);
											}
										}
										Static36.anInt909 = 0;
										continue;
									}
									if (local6.anInt5090 == Static483.anInt8217) {
										if (local256) {
											Static371.method5506(local6.anInt5078, Static326.aClass149_1.method5879() - local17, Static326.aClass149_1.method5875() - local22, local6.anInt5130);
										}
										continue;
									}
									if (local6.anInt5090 == Static311.anInt5567) {
										Static581.method7884(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean408 && local266) {
									local6.aBoolean408 = true;
									if (local6.anObjectArray18 != null) {
										local526 = new Class2_Sub31();
										local526.aBoolean484 = true;
										local526.aClass196_4 = local6;
										local526.anInt6077 = local271.method6004() - local17;
										local526.anInt6076 = local271.method6005() - local22;
										local526.anObjectArray32 = local6.anObjectArray18;
										Static516.aClass8_60.method212(local526);
									}
								}
								if (local6.aBoolean408 && local256 && local6.anObjectArray26 != null) {
									local526 = new Class2_Sub31();
									local526.aBoolean484 = true;
									local526.aClass196_4 = local6;
									local526.anInt6077 = Static326.aClass149_1.method5879() - local17;
									local526.anInt6076 = Static326.aClass149_1.method5875() - local22;
									local526.anObjectArray32 = local6.anObjectArray26;
									Static516.aClass8_60.method212(local526);
								}
								if (local6.aBoolean408 && !local256) {
									local6.aBoolean408 = false;
									if (local6.anObjectArray11 != null) {
										local526 = new Class2_Sub31();
										local526.aBoolean484 = true;
										local526.aClass196_4 = local6;
										local526.anInt6077 = Static326.aClass149_1.method5879() - local17;
										local526.anInt6076 = Static326.aClass149_1.method5875() - local22;
										local526.anObjectArray32 = local6.anObjectArray11;
										Static50.aClass8_4.method212(local526);
									}
								}
								if (local256 && local6.anObjectArray19 != null) {
									local526 = new Class2_Sub31();
									local526.aBoolean484 = true;
									local526.aClass196_4 = local6;
									local526.anInt6077 = Static326.aClass149_1.method5879() - local17;
									local526.anInt6076 = Static326.aClass149_1.method5875() - local22;
									local526.anObjectArray32 = local6.anObjectArray19;
									Static516.aClass8_60.method212(local526);
								}
								if (!local6.aBoolean410 && local212) {
									local6.aBoolean410 = true;
									if (local6.anObjectArray1 != null) {
										local526 = new Class2_Sub31();
										local526.aBoolean484 = true;
										local526.aClass196_4 = local6;
										local526.anInt6077 = Static326.aClass149_1.method5879() - local17;
										local526.anInt6076 = Static326.aClass149_1.method5875() - local22;
										local526.anObjectArray32 = local6.anObjectArray1;
										Static516.aClass8_60.method212(local526);
									}
								}
								if (local6.aBoolean410 && local212 && local6.anObjectArray14 != null) {
									local526 = new Class2_Sub31();
									local526.aBoolean484 = true;
									local526.aClass196_4 = local6;
									local526.anInt6077 = Static326.aClass149_1.method5879() - local17;
									local526.anInt6076 = Static326.aClass149_1.method5875() - local22;
									local526.anObjectArray32 = local6.anObjectArray14;
									Static516.aClass8_60.method212(local526);
								}
								if (local6.aBoolean410 && !local212) {
									local6.aBoolean410 = false;
									if (local6.anObjectArray16 != null) {
										local526 = new Class2_Sub31();
										local526.aBoolean484 = true;
										local526.aClass196_4 = local6;
										local526.anInt6077 = Static326.aClass149_1.method5879() - local17;
										local526.anInt6076 = Static326.aClass149_1.method5875() - local22;
										local526.anObjectArray32 = local6.anObjectArray16;
										Static50.aClass8_4.method212(local526);
									}
								}
								if (local6.anObjectArray8 != null) {
									local526 = new Class2_Sub31();
									local526.aClass196_4 = local6;
									local526.anObjectArray32 = local6.anObjectArray8;
									Static24.aClass8_1.method212(local526);
								}
								@Pc(1494) Class2_Sub31 local1494;
								if (local6.anObjectArray2 != null && Static195.anInt3899 > local6.anInt5106) {
									if (local6.anIntArray354 == null || Static195.anInt3899 - local6.anInt5106 > 32) {
										local526 = new Class2_Sub31();
										local526.aClass196_4 = local6;
										local526.anObjectArray32 = local6.anObjectArray2;
										Static516.aClass8_60.method212(local526);
									} else {
										label683: for (local307 = local6.anInt5106; local307 < Static195.anInt3899; local307++) {
											local681 = Static309.anIntArray410[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray354.length; local441++) {
												if (local6.anIntArray354[local441] == local681) {
													local1494 = new Class2_Sub31();
													local1494.aClass196_4 = local6;
													local1494.anObjectArray32 = local6.anObjectArray2;
													Static516.aClass8_60.method212(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt5106 = Static195.anInt3899;
								}
								if (local6.anObjectArray9 != null && Static441.anInt7763 > local6.anInt5126) {
									if (local6.anIntArray353 == null || Static441.anInt7763 - local6.anInt5126 > 32) {
										local526 = new Class2_Sub31();
										local526.aClass196_4 = local6;
										local526.anObjectArray32 = local6.anObjectArray9;
										Static516.aClass8_60.method212(local526);
									} else {
										label659: for (local307 = local6.anInt5126; local307 < Static441.anInt7763; local307++) {
											local681 = Static292.anIntArray365[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray353.length; local441++) {
												if (local6.anIntArray353[local441] == local681) {
													local1494 = new Class2_Sub31();
													local1494.aClass196_4 = local6;
													local1494.anObjectArray32 = local6.anObjectArray9;
													Static516.aClass8_60.method212(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt5126 = Static441.anInt7763;
								}
								if (local6.anObjectArray27 != null && Static202.anInt3969 > local6.anInt5118) {
									if (local6.anIntArray349 == null || Static202.anInt3969 - local6.anInt5118 > 32) {
										local526 = new Class2_Sub31();
										local526.aClass196_4 = local6;
										local526.anObjectArray32 = local6.anObjectArray27;
										Static516.aClass8_60.method212(local526);
									} else {
										label635: for (local307 = local6.anInt5118; local307 < Static202.anInt3969; local307++) {
											local681 = Static541.anIntArray640[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray349.length; local441++) {
												if (local6.anIntArray349[local441] == local681) {
													local1494 = new Class2_Sub31();
													local1494.aClass196_4 = local6;
													local1494.anObjectArray32 = local6.anObjectArray27;
													Static516.aClass8_60.method212(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt5118 = Static202.anInt3969;
								}
								if (local6.anObjectArray23 != null && Static396.anInt4772 > local6.anInt5082) {
									if (local6.anIntArray350 == null || Static396.anInt4772 - local6.anInt5082 > 32) {
										local526 = new Class2_Sub31();
										local526.aClass196_4 = local6;
										local526.anObjectArray32 = local6.anObjectArray23;
										Static516.aClass8_60.method212(local526);
									} else {
										label611: for (local307 = local6.anInt5082; local307 < Static396.anInt4772; local307++) {
											local681 = Static217.anIntArray261[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray350.length; local441++) {
												if (local6.anIntArray350[local441] == local681) {
													local1494 = new Class2_Sub31();
													local1494.aClass196_4 = local6;
													local1494.anObjectArray32 = local6.anObjectArray23;
													Static516.aClass8_60.method212(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt5082 = Static396.anInt4772;
								}
								if (local6.anObjectArray21 != null && Static193.anInt3881 > local6.anInt5120) {
									if (local6.anIntArray356 == null || Static193.anInt3881 - local6.anInt5120 > 32) {
										local526 = new Class2_Sub31();
										local526.aClass196_4 = local6;
										local526.anObjectArray32 = local6.anObjectArray21;
										Static516.aClass8_60.method212(local526);
									} else {
										label587: for (local307 = local6.anInt5120; local307 < Static193.anInt3881; local307++) {
											local681 = Static206.anIntArray242[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray356.length; local441++) {
												if (local6.anIntArray356[local441] == local681) {
													local1494 = new Class2_Sub31();
													local1494.aClass196_4 = local6;
													local1494.anObjectArray32 = local6.anObjectArray21;
													Static516.aClass8_60.method212(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt5120 = Static193.anInt3881;
								}
								if (Static9.anInt415 > local6.anInt5166 && local6.anObjectArray5 != null) {
									local526 = new Class2_Sub31();
									local526.aClass196_4 = local6;
									local526.anObjectArray32 = local6.anObjectArray5;
									Static516.aClass8_60.method212(local526);
								}
								if (Static455.anInt7881 > local6.anInt5166 && local6.anObjectArray6 != null) {
									local526 = new Class2_Sub31();
									local526.aClass196_4 = local6;
									local526.anObjectArray32 = local6.anObjectArray6;
									Static516.aClass8_60.method212(local526);
								}
								if (Static445.anInt7791 > local6.anInt5166 && local6.anObjectArray12 != null) {
									local526 = new Class2_Sub31();
									local526.aClass196_4 = local6;
									local526.anObjectArray32 = local6.anObjectArray12;
									Static516.aClass8_60.method212(local526);
								}
								if (Static229.anInt4293 > local6.anInt5166 && local6.anObjectArray22 != null) {
									local526 = new Class2_Sub31();
									local526.aClass196_4 = local6;
									local526.anObjectArray32 = local6.anObjectArray22;
									Static516.aClass8_60.method212(local526);
								}
								if (Static504.anInt8433 > local6.anInt5166 && local6.anObjectArray17 != null) {
									local526 = new Class2_Sub31();
									local526.aClass196_4 = local6;
									local526.anObjectArray32 = local6.anObjectArray17;
									Static516.aClass8_60.method212(local526);
								}
								local6.anInt5166 = Static500.anInt8403;
								if (local6.anObjectArray28 != null) {
									for (local307 = 0; local307 < Static398.anInt8718; local307++) {
										@Pc(1962) Class2_Sub31 local1962 = new Class2_Sub31();
										local1962.aClass196_4 = local6;
										local1962.anInt6080 = Static577.anInterface2Array2[local307].method5040();
										local1962.anInt6075 = Static577.anInterface2Array2[local307].method5044();
										local1962.anObjectArray32 = local6.anObjectArray28;
										Static516.aClass8_60.method212(local1962);
									}
								}
								if (Static526.aBoolean668 && local6.anObjectArray4 != null) {
									local526 = new Class2_Sub31();
									local526.aClass196_4 = local6;
									local526.anObjectArray32 = local6.anObjectArray4;
									Static516.aClass8_60.method212(local526);
								}
							}
							if (local6.anInt5098 == 5 && local6.anInt5150 != -1) {
								local6.method4241(Static197.aClass147_1, Static416.aClass232_1).method7196(local6.anInt5078, Static307.aClass100_6);
							}
							Static505.method7027(local6);
							if (local6.anInt5098 == 0) {
								method1089(arg0, local6.anInt5112, local28, local30, local32, local34, local17 - local6.anInt5125, local22 - local6.anInt5115, arg8, arg9);
								if (local6.aClass196Array2 != null) {
									method1089(local6.aClass196Array2, local6.anInt5112, local28, local30, local32, local34, local17 - local6.anInt5125, local22 - local6.anInt5115, arg8, arg9);
								}
								@Pc(2084) Class2_Sub44 local2084 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local6.anInt5112);
								if (local2084 != null) {
									if (Static328.aClass284_2 == Static574.aClass284_4 && local2084.anInt8607 == 0 && !Static167.aBoolean291 && local212 && !Static298.aBoolean425) {
										Static540.method7371();
									}
									Static436.method6176(local17, arg8, local28, local32, local30, local2084.anInt8608, local22, arg9, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static505.method7027(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBZIF)[[I")
	public static int[][] method1091(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub2_Sub35 local13 = new Class2_Sub2_Sub35();
		local13.anInt9149 = (int) (arg0 * 4096.0F);
		local13.aBoolean707 = false;
		local13.anInt9148 = 4;
		local13.anInt9154 = 4;
		local13.anInt9151 = 3;
		local13.method7948();
		Static226.method4128(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method7612(local45, local9[local45]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kp;)Z")
	public static boolean method1092(@OriginalArg(0) Class196 arg0) {
		if (Static298.aBoolean425) {
			if (method1102(arg0).anInt6464 != 0) {
				return false;
			}
			if (arg0.anInt5098 == 0) {
				return false;
			}
		}
		return arg0.aBoolean416;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1094() {
		@Pc(1) int local1 = Static376.anInt6647;
		@Pc(3) int[] local3 = Static557.anIntArray665;
		@Pc(11) int local11 = Static440.aBoolean612 ? local1 : local1 + Static416.anInt7186;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class6_Sub1_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local13 - local1])).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			}
			if (local23.anInt7381 >= 0) {
				@Pc(43) int local43 = local23.method6165();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8761 & 0x1FF) == 0 && (local23.anInt8764 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8761 & 0x1FF) == 256 && (local23.anInt8764 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt8759 = Static524.method7217(local23.anInt8761, local23.aByte112, local23.anInt8764);
				Static516.method7139(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1098() {
		Static436.anInt7464 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static416.anInt7186; local3++) {
			@Pc(14) Class6_Sub1_Sub1_Sub1_Sub1 local14 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local3])).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			if (local14.aBoolean570 && local14.method6158() != -1) {
				@Pc(32) int local32 = (local14.method6165() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8761 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8764 - local32 >> 9;
				@Pc(53) Class6_Sub1_Sub1_Sub1 local53 = Static386.method5686(local39, local14.aByte112, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.lb;
					if (local53 instanceof Class6_Sub1_Sub1_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt7401 == 0 && local53.method6158() != -1) {
						Static430.anIntArray498[Static436.anInt7464] = local58;
						Static339.anIntArray175[Static436.anInt7464] = local58;
						Static436.anInt7464++;
						local53.anInt7401++;
					}
					Static430.anIntArray498[Static436.anInt7464] = local58;
					Static339.anIntArray175[Static436.anInt7464] = local14.lb + 2048;
					Static436.anInt7464++;
					local53.anInt7401++;
				}
			}
		}
		Static587.method7952(0, Static430.anIntArray498, Static436.anInt7464 - 1, Static339.anIntArray175);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)I")
	public static int method1099(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Z")
	public static boolean method1100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1101(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static376.anInt6647;
		@Pc(3) int[] local3 = Static557.anIntArray665;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static416.anInt7186; local5++) {
			@Pc(15) Class6_Sub1_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local5 - local1])).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			}
			if (local15.aByte112 == arg0 && local15.anInt7381 >= 0) {
				@Pc(39) int local39 = local15.method6165();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8761 & 0x1FF) != 0 || (local15.anInt8764 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8761 & 0x1FF) != 256 || (local15.anInt8764 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8761 >> 9;
					local80 = local15.anInt8764 >> 9;
					if (local15.anInt7381 > Static173.anIntArrayArray18[local75][local80]) {
						Static173.anIntArrayArray18[local75][local80] = local15.anInt7381;
						Static590.anIntArrayArray70[local75][local80] = 1;
					} else if (local15.anInt7381 == Static173.anIntArrayArray18[local75][local80]) {
						local116 = Static590.anIntArrayArray70[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8761 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8764 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8761 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8764 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt7381 > Static173.anIntArrayArray18[local158][local161]) {
								Static173.anIntArrayArray18[local158][local161] = local15.anInt7381;
								Static590.anIntArrayArray70[local158][local161] = 1;
							} else if (local15.anInt7381 == Static173.anIntArrayArray18[local158][local161]) {
								local116 = Static590.anIntArrayArray70[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!kp;)Lclient!nm;")
	public static Class2_Sub35 method1102(@OriginalArg(0) Class196 arg0) {
		@Pc(13) Class2_Sub35 local13 = (Class2_Sub35) Static9.aClass162_2.method3519(((long) arg0.anInt5112 << 32) + (long) arg0.anInt5154);
		return local13 == null ? arg0.aClass2_Sub35_1 : local13;
	}
}
