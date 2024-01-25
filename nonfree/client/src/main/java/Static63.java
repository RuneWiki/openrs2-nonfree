import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	public static void method1279(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static235.anInt2721;
		@Pc(3) int[] local3 = Static130.anIntArray267;
		@Pc(11) int local11 = Static159.aBoolean274 ? local1 : local1 + Static221.anInt4798;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class6_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local13 - local1])).aClass6_Sub1_Sub2_Sub2_1;
			}
			if (local23.aByte100 == arg0) {
				local23.anInt8536 = 0;
				if (local23.anInt8597 < 0) {
					local23.aBoolean631 = false;
				} else {
					@Pc(54) int local54 = local23.method7083();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8811 & 0x1FF) != 0 || (local23.anInt8813 & 0x1FF) != 0) {
							local23.aBoolean631 = false;
							continue;
						}
					} else if ((local23.anInt8811 & 0x1FF) != 256 || (local23.anInt8813 & 0x1FF) != 256) {
						local23.aBoolean631 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8811 >> 9;
						local101 = local23.anInt8813 >> 9;
						if (local23.anInt8597 != Static405.anIntArrayArray72[local96][local101]) {
							local23.aBoolean631 = true;
							continue;
						}
						if (Static169.anIntArrayArray42[local96][local101] > 1) {
							local126 = Static169.anIntArrayArray42[local96][local101]--;
							local23.aBoolean631 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8811 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8813 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8811 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8813 + local96 >> 9;
						if (!Static149.method2555(local23.anInt8597, local169, local162, local155, local101)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8597 == Static405.anIntArrayArray72[local180][local183]) {
										local126 = Static169.anIntArrayArray42[local180][local183]--;
									}
								}
							}
							local23.aBoolean631 = true;
							continue;
						}
					}
					if (local23 instanceof Class6_Sub1_Sub2_Sub1 && local23.aClass3_Sub38_3 != null && Static223.anInt4829 >= local23.aClass3_Sub38_3.anInt6985 && Static223.anInt4829 < local23.aClass3_Sub38_3.anInt6986) {
						((Class6_Sub1_Sub2_Sub1) local23).aBoolean163 = false;
					}
					local23.aBoolean631 = false;
					local23.anInt8814 = Static58.method1166(local23.anInt8813, local23.anInt8811, local23.aByte100);
					Static483.method7135(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!qf;)Lclient!qf;")
	public static Class245 method1280(@OriginalArg(0) Class245 arg0) {
		@Pc(4) int local4 = method1295(arg0).method1753();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static46.method1005(arg0.anInt7238);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
	public static int method1281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1282() {
		@Pc(1) int local1 = Static235.anInt2721;
		@Pc(3) int[] local3 = Static130.anIntArray267;
		@Pc(20) boolean local20 = Static7.aClass3_Sub15_Sub1_1.anInt8368 == 1 && local1 > 200 || Static7.aClass3_Sub15_Sub1_1.anInt8368 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class6_Sub1_Sub2_Sub1 local29 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local3[local22]];
			if (local29.method2048()) {
				local29.method7237();
				if (local29.aShort123 >= 0 && local29.aShort120 >= 0 && local29.aShort122 < Static118.anInt2527 && local29.aShort121 < Static549.anInt9482) {
					local29.aBoolean163 = local29.aBoolean630 ? local20 : false;
					if (local29 == Static111.aClass6_Sub1_Sub2_Sub1_3) {
						local29.anInt8597 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean631) {
							local75++;
						}
						if (local29.anInt8553 > Static223.anInt4829) {
							local75 += 2;
						}
						local75 += 5 - local29.method7083() << 2;
						if (local29.aBoolean165) {
							local75 += 512;
						} else {
							if (Static243.anInt5022 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt8597 = local75 + 1;
					}
				} else {
					local29.anInt8597 = -1;
				}
			} else {
				local29.anInt8597 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static221.anInt4798; local116++) {
			@Pc(127) Class6_Sub1_Sub2_Sub2 local127 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local116])).aClass6_Sub1_Sub2_Sub2_1;
			if (local127.method7095() && local127.aClass230_1.method5891(Static127.aClass215_1)) {
				local127.method7237();
				if (local127.aShort123 >= 0 && local127.aShort120 >= 0 && local127.aShort122 < Static118.anInt2527 && local127.aShort121 < Static549.anInt9482) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean631) {
						local164++;
					}
					if (local127.anInt8553 > Static223.anInt4829) {
						local164 += 2;
					}
					local164 += 5 - local127.method7083() << 2;
					if (Static243.anInt5022 == 0) {
						if (local127.aClass230_1.aBoolean448) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static243.anInt5022 == 1) {
						if (local127.aClass230_1.aBoolean448) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass230_1.aBoolean455) {
						local164 += 1024;
					} else if (!local127.aClass230_1.aBoolean453) {
						local164 += 256;
					}
					local127.anInt8597 = local164 + 1;
				} else {
					local127.anInt8597 = -1;
				}
			} else {
				local127.anInt8597 = -1;
			}
		}
		for (local75 = 0; local75 < Static518.aClass296Array2.length; local75++) {
			@Pc(230) Class296 local230 = Static518.aClass296Array2[local75];
			if (local230 != null) {
				if (local230.anInt8744 == 1) {
					@Pc(244) Class3_Sub3 local244 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local230.anInt8745);
					if (local244 != null) {
						@Pc(249) Class6_Sub1_Sub2_Sub2 local249 = local244.aClass6_Sub1_Sub2_Sub2_1;
						if (local249.anInt8597 >= 0) {
							local249.anInt8597 += 2048;
						}
					}
				} else if (local230.anInt8744 == 10) {
					@Pc(268) Class6_Sub1_Sub2_Sub1 local268 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local230.anInt8745];
					if (local268 != null && local268 != Static111.aClass6_Sub1_Sub2_Sub1_3 && local268.anInt8597 >= 0) {
						local268.anInt8597 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!qf;IIIIIIIII)V")
	public static void method1284(@OriginalArg(0) Class245[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class245 local6 = arg0[local1];
			if (local6 != null && local6.anInt7238 == arg1) {
				@Pc(17) int local17 = local6.anInt7260 + arg6;
				@Pc(22) int local22 = local6.anInt7295 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt7223 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt7249;
					@Pc(45) int local45 = local22 + local6.anInt7229;
					if (local6.anInt7223 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt7223 == 0 || local6.aBoolean507 || method1295(local6).anInt1859 != 0 || local6 == Static143.aClass245_6 || local6.anInt7273 == Static25.anInt757) {
					if (!method1297(local6)) {
						if (local6 == Static166.aClass245_12 && Static161.method3128(Static166.aClass245_12) != null) {
							Static489.aBoolean645 = true;
							Static282.anInt5796 = local17;
							Static89.anInt1948 = local22;
						}
						if (local6.aBoolean501 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean505 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class3_Sub21 local152 = (Class3_Sub21) Static471.aClass71_64.method2089(); local152 != null; local152 = (Class3_Sub21) Static471.aClass71_64.method2086()) {
									if (local152.aBoolean306) {
										local152.method7820();
										local152.aClass245_8.aBoolean498 = false;
									}
								}
								if (Static339.anInt5664 == 0) {
									Static166.aClass245_12 = null;
									Static143.aClass245_6 = null;
								}
								Static523.anInt9115 = 0;
								Static514.aBoolean665 = false;
								Static526.aBoolean674 = false;
								if (!Static228.aBoolean342) {
									Static238.method4168();
								}
							}
							@Pc(208) boolean local208;
							if (Static35.aClass54_1.method4074() >= local28 && Static35.aClass54_1.method4071() >= local30 && Static35.aClass54_1.method4074() < local32 && Static35.aClass54_1.method4071() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static506.aBoolean659 && local208) {
								if (local6.anInt7304 >= 0) {
									Static7.anInt488 = local6.anInt7304;
								} else if (local6.aBoolean505) {
									Static7.anInt488 = -1;
								}
							}
							if (!Static228.aBoolean342 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static140.method2461(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(252) boolean local252 = false;
							if (Static35.aClass54_1.method4070() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class3_Sub19 local267 = (Class3_Sub19) Static71.aClass71_16.method2089();
							if (local267 != null && local267.method4962() == 0 && local267.method4956() >= local28 && local267.method4957() >= local30 && local267.method4956() < local32 && local267.method4957() < local34) {
								local262 = true;
							}
							@Pc(300) int local300;
							@Pc(434) int local434;
							if (local6.aByteArray84 != null) {
								for (local300 = 0; local300 < local6.aByteArray84.length; local300++) {
									if (Static364.aClass101_1.method2589(local6.aByteArray84[local300])) {
										if (local6.anIntArray645 == null || Static223.anInt4829 >= local6.anIntArray645[local300]) {
											@Pc(332) byte local332 = local6.aByteArray83[local300];
											if (local332 == 0 || ((local332 & 0x8) == 0 || !Static364.aClass101_1.method2589(86) && !Static364.aClass101_1.method2589(82) && !Static364.aClass101_1.method2589(81)) && ((local332 & 0x2) == 0 || Static364.aClass101_1.method2589(86)) && ((local332 & 0x1) == 0 || Static364.aClass101_1.method2589(82)) && ((local332 & 0x4) == 0 || Static364.aClass101_1.method2589(81))) {
												if (local300 < 10) {
													Static264.method4646(local6.anInt7256, "", local300 + 1, -1);
												} else if (local300 == 10) {
													Static320.method5152();
													@Pc(403) Class3_Sub13 local403 = method1295(local6);
													Static432.method6571(local403.method1751(), local403.anInt1864, local6);
													Static88.aString19 = Static27.method796(local6);
													if (Static88.aString19 == null) {
														Static88.aString19 = "Null";
													}
													Static117.aString29 = local6.aString56 + "<col=ffffff>";
												}
												local434 = local6.anIntArray646[local300];
												if (local6.anIntArray645 == null) {
													local6.anIntArray645 = new int[local6.aByteArray84.length];
												}
												if (local434 == 0) {
													local6.anIntArray645[local300] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray645[local300] = Static223.anInt4829 + local434;
												}
											}
										}
									} else if (local6.anIntArray645 != null) {
										local6.anIntArray645[local300] = 0;
									}
								}
							}
							if (local262) {
								Static435.method6595(local267.method4956() - local17, local267.method4957() - local22, local6);
							}
							if (Static166.aClass245_12 != null && Static166.aClass245_12 != local6 && local208 && method1295(local6).method1758()) {
								Static143.aClass245_5 = local6;
							}
							if (local6 == Static143.aClass245_6) {
								Static509.aBoolean661 = true;
								Static495.anInt5639 = local17;
								Static282.anInt5795 = local22;
							}
							if (local6.aBoolean507 || local6.anInt7273 != 0) {
								@Pc(519) Class3_Sub21 local519;
								if (local208 && Static118.anInt2530 != 0 && local6.anObjectArray15 != null) {
									local519 = new Class3_Sub21();
									local519.aBoolean306 = true;
									local519.aClass245_8 = local6;
									local519.anInt4199 = Static118.anInt2530;
									local519.anObjectArray4 = local6.anObjectArray15;
									Static471.aClass71_64.method2076(local519);
								}
								if (Static166.aClass245_12 != null || Static228.aBoolean342 || local6.anInt7273 != Static97.anInt2025 && Static523.anInt9115 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(674) int local674;
								if (local6.anInt7273 != 0) {
									if (local6.anInt7273 == Static135.anInt2757 || local6.anInt7273 == Static436.anInt7979) {
										Static20.aClass245_1 = local6;
										if (Static87.aClass178_1 != null) {
											Static87.aClass178_1.method4788(local6.anInt7229, Static121.aClass5_7);
										}
										if (local6.anInt7273 == Static135.anInt2757) {
											if (!Static228.aBoolean342 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static23.method5779(arg9, Static121.aClass5_7, arg8);
												for (@Pc(602) Class4_Sub5 local602 = (Class4_Sub5) Static499.aClass90_5.method2326(); local602 != null; local602 = (Class4_Sub5) Static499.aClass90_5.method2325()) {
													if (arg8 >= local602.anInt7020 && arg8 < local602.anInt7022 && arg9 >= local602.anInt7019 && arg9 < local602.anInt7015) {
														Static238.method4168();
														Static293.method7017(local602.aClass6_Sub1_Sub2_1);
													}
												}
											}
											Static402.method7156(local22, local6, local17);
											continue;
										}
									}
									@Pc(713) int local713;
									if (local6.anInt7273 == Static25.anInt757) {
										if (local6.method6006(Static121.aClass5_7) == null || Static262.anInt5487 != 0 && Static262.anInt5487 != 3 || Static228.aBoolean342 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local300 = arg8 - local17;
										local674 = arg9 - local22;
										local434 = local6.anIntArray644[local674];
										if (local300 < local434 || local300 > local434 + local6.anIntArray643[local674]) {
											continue;
										}
										local300 -= local6.anInt7249 / 2;
										local674 -= local6.anInt7229 / 2;
										if (Static305.anInt5998 == 4) {
											local713 = (int) Static487.aFloat258 & 0x3FFF;
										} else {
											local713 = (int) Static487.aFloat258 + Static262.anInt5488 & 0x3FFF;
										}
										@Pc(725) int local725 = Class5.anIntArray761[local713];
										@Pc(729) int local729 = Class5.anIntArray760[local713];
										if (Static305.anInt5998 != 4) {
											local725 = local725 * (Static509.anInt8869 + 256) >> 8;
											local729 = local729 * (Static509.anInt8869 + 256) >> 8;
										}
										@Pc(758) int local758 = local674 * local725 + local300 * local729 >> 14;
										@Pc(768) int local768 = local674 * local729 - local300 * local725 >> 14;
										@Pc(779) int local779;
										@Pc(787) int local787;
										if (Static305.anInt5998 == 4) {
											local779 = (Static40.anInt1002 >> 9) + (local758 >> 2);
											local787 = (Static157.anInt3699 >> 9) - (local768 >> 2);
										} else {
											@Pc(796) int local796 = (Static111.aClass6_Sub1_Sub2_Sub1_3.method7083() - 1) * 256;
											local779 = (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 - local796 >> 9) + (local758 >> 2);
											local787 = (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 - local796 >> 9) - (local768 >> 2);
										}
										if (Static506.aBoolean659 && (Static170.anInt3907 & 0x40) != 0) {
											@Pc(829) Class245 local829 = Static80.method1631(Static508.anInt8865, Static448.anInt8198);
											if (local829 == null) {
												Static320.method5152();
											} else {
												Static507.method7642(true, " ->", local6.anInt7271, Static88.aString19, Static46.anInt1080, local787, local779, false, 44, 1L);
											}
											continue;
										}
										if (Static222.aClass44_2 == Static332.aClass44_4) {
											Static507.method7642(true, "", -1, Static116.aClass67_32.method1934(Static193.anInt7803), -1, local787, local779, false, 23, 1L);
										}
										Static507.method7642(true, "", -1, Static441.aString63, Static54.anInt1188, local787, local779, false, 21, 1L);
										continue;
									}
									if (local6.anInt7273 == Static97.anInt2025) {
										Static303.aClass245_11 = local6;
										if (local208) {
											Static514.aBoolean665 = true;
										}
										if (local262) {
											local300 = (int) ((double) (local267.method4956() - local17 - local6.anInt7249 / 2) * 2.0D / (double) Static55.aFloat69);
											local674 = (int) -((double) (local267.method4957() - local22 - local6.anInt7229 / 2) * 2.0D / (double) Static55.aFloat69);
											local434 = Static256.anInt5191 + local300 + Static55.anInt1978;
											local713 = Static129.anInt2692 + local674 + Static55.anInt1974;
											@Pc(943) Class3_Sub10_Sub5 local943 = Static455.method6840();
											if (local943 == null) {
												continue;
											}
											@Pc(948) int[] local948 = new int[3];
											local943.method1774(local713, local948, local434);
											if (local948 != null) {
												if (Static364.aClass101_1.method2589(82) && Static353.anInt6659 > 0) {
													Static152.method2631(local948[0], local948[1], local948[2]);
													continue;
												}
												Static526.aBoolean674 = true;
												Static400.anInt7396 = local948[0];
												Static97.anInt2020 = local948[1];
												Static22.anInt8149 = local948[2];
											}
											Static523.anInt9115 = 1;
											Static473.aBoolean578 = false;
											Static21.anInt706 = Static35.aClass54_1.method4074();
											Static392.anInt7212 = Static35.aClass54_1.method4071();
											continue;
										}
										if (local252 && Static523.anInt9115 > 0) {
											if (Static523.anInt9115 == 1 && (Static21.anInt706 != Static35.aClass54_1.method4074() || Static392.anInt7212 != Static35.aClass54_1.method4071())) {
												Static208.anInt4580 = Static256.anInt5191;
												Static485.anInt8695 = Static129.anInt2692;
												Static523.anInt9115 = 2;
											}
											if (Static523.anInt9115 == 2) {
												Static473.aBoolean578 = true;
												Static328.method5244(Static208.anInt4580 + (int) ((double) (Static21.anInt706 - Static35.aClass54_1.method4074()) * 2.0D / (double) Static55.aFloat68));
												Static462.method6897(Static485.anInt8695 - (int) ((double) (Static392.anInt7212 - Static35.aClass54_1.method4071()) * 2.0D / (double) Static55.aFloat68));
											}
											continue;
										}
										if (Static523.anInt9115 > 0 && !Static473.aBoolean578) {
											if ((Static19.anInt703 == 1 || Static10.method637()) && Static179.anInt4933 > 2) {
												Static432.method6574(Static392.anInt7212, Static21.anInt706);
											} else if (Static376.method7297()) {
												Static432.method6574(Static392.anInt7212, Static21.anInt706);
											}
										}
										Static523.anInt9115 = 0;
										continue;
									}
									if (local6.anInt7273 == Static89.anInt1941) {
										if (local252) {
											Static30.method2205(Static35.aClass54_1.method4074() - local17, local6.anInt7229, Static35.aClass54_1.method4071() - local22, local6.anInt7249);
										}
										continue;
									}
									if (local6.anInt7273 == Static150.anInt3028) {
										Static324.method5200(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean504 && local262) {
									local6.aBoolean504 = true;
									if (local6.anObjectArray32 != null) {
										local519 = new Class3_Sub21();
										local519.aBoolean306 = true;
										local519.aClass245_8 = local6;
										local519.anInt4201 = local267.method4956() - local17;
										local519.anInt4199 = local267.method4957() - local22;
										local519.anObjectArray4 = local6.anObjectArray32;
										Static471.aClass71_64.method2076(local519);
									}
								}
								if (local6.aBoolean504 && local252 && local6.anObjectArray9 != null) {
									local519 = new Class3_Sub21();
									local519.aBoolean306 = true;
									local519.aClass245_8 = local6;
									local519.anInt4201 = Static35.aClass54_1.method4074() - local17;
									local519.anInt4199 = Static35.aClass54_1.method4071() - local22;
									local519.anObjectArray4 = local6.anObjectArray9;
									Static471.aClass71_64.method2076(local519);
								}
								if (local6.aBoolean504 && !local252) {
									local6.aBoolean504 = false;
									if (local6.anObjectArray33 != null) {
										local519 = new Class3_Sub21();
										local519.aBoolean306 = true;
										local519.aClass245_8 = local6;
										local519.anInt4201 = Static35.aClass54_1.method4074() - local17;
										local519.anInt4199 = Static35.aClass54_1.method4071() - local22;
										local519.anObjectArray4 = local6.anObjectArray33;
										Static375.aClass71_56.method2076(local519);
									}
								}
								if (local252 && local6.anObjectArray10 != null) {
									local519 = new Class3_Sub21();
									local519.aBoolean306 = true;
									local519.aClass245_8 = local6;
									local519.anInt4201 = Static35.aClass54_1.method4074() - local17;
									local519.anInt4199 = Static35.aClass54_1.method4071() - local22;
									local519.anObjectArray4 = local6.anObjectArray10;
									Static471.aClass71_64.method2076(local519);
								}
								if (!local6.aBoolean498 && local208) {
									local6.aBoolean498 = true;
									if (local6.anObjectArray35 != null) {
										local519 = new Class3_Sub21();
										local519.aBoolean306 = true;
										local519.aClass245_8 = local6;
										local519.anInt4201 = Static35.aClass54_1.method4074() - local17;
										local519.anInt4199 = Static35.aClass54_1.method4071() - local22;
										local519.anObjectArray4 = local6.anObjectArray35;
										Static471.aClass71_64.method2076(local519);
									}
								}
								if (local6.aBoolean498 && local208 && local6.anObjectArray29 != null) {
									local519 = new Class3_Sub21();
									local519.aBoolean306 = true;
									local519.aClass245_8 = local6;
									local519.anInt4201 = Static35.aClass54_1.method4074() - local17;
									local519.anInt4199 = Static35.aClass54_1.method4071() - local22;
									local519.anObjectArray4 = local6.anObjectArray29;
									Static471.aClass71_64.method2076(local519);
								}
								if (local6.aBoolean498 && !local208) {
									local6.aBoolean498 = false;
									if (local6.anObjectArray31 != null) {
										local519 = new Class3_Sub21();
										local519.aBoolean306 = true;
										local519.aClass245_8 = local6;
										local519.anInt4201 = Static35.aClass54_1.method4074() - local17;
										local519.anInt4199 = Static35.aClass54_1.method4071() - local22;
										local519.anObjectArray4 = local6.anObjectArray31;
										Static375.aClass71_56.method2076(local519);
									}
								}
								if (local6.anObjectArray8 != null) {
									local519 = new Class3_Sub21();
									local519.aClass245_8 = local6;
									local519.anObjectArray4 = local6.anObjectArray8;
									Static233.aClass71_40.method2076(local519);
								}
								@Pc(1487) Class3_Sub21 local1487;
								if (local6.anObjectArray23 != null && Static326.anInt6220 > local6.anInt7313) {
									if (local6.anIntArray642 == null || Static326.anInt6220 - local6.anInt7313 > 32) {
										local519 = new Class3_Sub21();
										local519.aClass245_8 = local6;
										local519.anObjectArray4 = local6.anObjectArray23;
										Static471.aClass71_64.method2076(local519);
									} else {
										label680: for (local300 = local6.anInt7313; local300 < Static326.anInt6220; local300++) {
											local674 = Static137.anIntArray274[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray642.length; local434++) {
												if (local6.anIntArray642[local434] == local674) {
													local1487 = new Class3_Sub21();
													local1487.aClass245_8 = local6;
													local1487.anObjectArray4 = local6.anObjectArray23;
													Static471.aClass71_64.method2076(local1487);
													break label680;
												}
											}
										}
									}
									local6.anInt7313 = Static326.anInt6220;
								}
								if (local6.anObjectArray11 != null && Static90.anInt1953 > local6.anInt7228) {
									if (local6.anIntArray648 == null || Static90.anInt1953 - local6.anInt7228 > 32) {
										local519 = new Class3_Sub21();
										local519.aClass245_8 = local6;
										local519.anObjectArray4 = local6.anObjectArray11;
										Static471.aClass71_64.method2076(local519);
									} else {
										label656: for (local300 = local6.anInt7228; local300 < Static90.anInt1953; local300++) {
											local674 = Static178.anIntArray393[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray648.length; local434++) {
												if (local6.anIntArray648[local434] == local674) {
													local1487 = new Class3_Sub21();
													local1487.aClass245_8 = local6;
													local1487.anObjectArray4 = local6.anObjectArray11;
													Static471.aClass71_64.method2076(local1487);
													break label656;
												}
											}
										}
									}
									local6.anInt7228 = Static90.anInt1953;
								}
								if (local6.anObjectArray21 != null && Static345.anInt6584 > local6.anInt7225) {
									if (local6.anIntArray647 == null || Static345.anInt6584 - local6.anInt7225 > 32) {
										local519 = new Class3_Sub21();
										local519.aClass245_8 = local6;
										local519.anObjectArray4 = local6.anObjectArray21;
										Static471.aClass71_64.method2076(local519);
									} else {
										label632: for (local300 = local6.anInt7225; local300 < Static345.anInt6584; local300++) {
											local674 = Static216.anIntArray224[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray647.length; local434++) {
												if (local6.anIntArray647[local434] == local674) {
													local1487 = new Class3_Sub21();
													local1487.aClass245_8 = local6;
													local1487.anObjectArray4 = local6.anObjectArray21;
													Static471.aClass71_64.method2076(local1487);
													break label632;
												}
											}
										}
									}
									local6.anInt7225 = Static345.anInt6584;
								}
								if (local6.anObjectArray30 != null && Static339.anInt5659 > local6.anInt7263) {
									if (local6.anIntArray641 == null || Static339.anInt5659 - local6.anInt7263 > 32) {
										local519 = new Class3_Sub21();
										local519.aClass245_8 = local6;
										local519.anObjectArray4 = local6.anObjectArray30;
										Static471.aClass71_64.method2076(local519);
									} else {
										label608: for (local300 = local6.anInt7263; local300 < Static339.anInt5659; local300++) {
											local674 = Static275.anIntArray508[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray641.length; local434++) {
												if (local6.anIntArray641[local434] == local674) {
													local1487 = new Class3_Sub21();
													local1487.aClass245_8 = local6;
													local1487.anObjectArray4 = local6.anObjectArray30;
													Static471.aClass71_64.method2076(local1487);
													break label608;
												}
											}
										}
									}
									local6.anInt7263 = Static339.anInt5659;
								}
								if (local6.lb != null && Static263.anInt5497 > local6.anInt7227) {
									if (local6.anIntArray639 == null || Static263.anInt5497 - local6.anInt7227 > 32) {
										local519 = new Class3_Sub21();
										local519.aClass245_8 = local6;
										local519.anObjectArray4 = local6.lb;
										Static471.aClass71_64.method2076(local519);
									} else {
										label584: for (local300 = local6.anInt7227; local300 < Static263.anInt5497; local300++) {
											local674 = Static45.anIntArray143[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray639.length; local434++) {
												if (local6.anIntArray639[local434] == local674) {
													local1487 = new Class3_Sub21();
													local1487.aClass245_8 = local6;
													local1487.anObjectArray4 = local6.lb;
													Static471.aClass71_64.method2076(local1487);
													break label584;
												}
											}
										}
									}
									local6.anInt7227 = Static263.anInt5497;
								}
								if (Static367.anInt6860 > local6.anInt7236 && local6.anObjectArray25 != null) {
									local519 = new Class3_Sub21();
									local519.aClass245_8 = local6;
									local519.anObjectArray4 = local6.anObjectArray25;
									Static471.aClass71_64.method2076(local519);
								}
								if (Static305.anInt5997 > local6.anInt7236 && local6.anObjectArray13 != null) {
									local519 = new Class3_Sub21();
									local519.aClass245_8 = local6;
									local519.anObjectArray4 = local6.anObjectArray13;
									Static471.aClass71_64.method2076(local519);
								}
								if (Static367.anInt6867 > local6.anInt7236 && local6.anObjectArray19 != null) {
									local519 = new Class3_Sub21();
									local519.aClass245_8 = local6;
									local519.anObjectArray4 = local6.anObjectArray19;
									Static471.aClass71_64.method2076(local519);
								}
								if (Static82.anInt1212 > local6.anInt7236 && local6.anObjectArray34 != null) {
									local519 = new Class3_Sub21();
									local519.aClass245_8 = local6;
									local519.anObjectArray4 = local6.anObjectArray34;
									Static471.aClass71_64.method2076(local519);
								}
								if (Static483.anInt8679 > local6.anInt7236 && local6.anObjectArray22 != null) {
									local519 = new Class3_Sub21();
									local519.aClass245_8 = local6;
									local519.anObjectArray4 = local6.anObjectArray22;
									Static471.aClass71_64.method2076(local519);
								}
								local6.anInt7236 = Static446.anInt8177;
								if (local6.anObjectArray7 != null) {
									for (local300 = 0; local300 < Static372.anInt6997; local300++) {
										@Pc(1955) Class3_Sub21 local1955 = new Class3_Sub21();
										local1955.aClass245_8 = local6;
										local1955.anInt4198 = Static373.anInterface2Array1[local300].method4017();
										local1955.anInt4200 = Static373.anInterface2Array1[local300].method4020();
										local1955.anObjectArray4 = local6.anObjectArray7;
										Static471.aClass71_64.method2076(local1955);
									}
								}
								if (Static396.aBoolean511 && local6.anObjectArray17 != null) {
									local519 = new Class3_Sub21();
									local519.aClass245_8 = local6;
									local519.anObjectArray4 = local6.anObjectArray17;
									Static471.aClass71_64.method2076(local519);
								}
							}
							if (local6.anInt7223 == 5 && local6.anInt7242 != -1) {
								local6.method6014(Static443.aClass72_1, Static144.aClass274_1).method4788(local6.anInt7229, Static121.aClass5_7);
							}
							Static478.method7105(local6);
							if (local6.anInt7223 == 0) {
								method1284(arg0, local6.anInt7256, local28, local30, local32, local34, local17 - local6.anInt7268, local22 - local6.anInt7309, arg8, arg9);
								if (local6.aClass245Array2 != null) {
									method1284(local6.aClass245Array2, local6.anInt7256, local28, local30, local32, local34, local17 - local6.anInt7268, local22 - local6.anInt7309, arg8, arg9);
								}
								@Pc(2077) Class3_Sub29 local2077 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local6.anInt7256);
								if (local2077 != null) {
									if (Static222.aClass44_2 == Static8.aClass44_1 && local2077.anInt5521 == 0 && !Static228.aBoolean342 && local208 && !Static362.aBoolean430) {
										Static238.method4168();
									}
									Static110.method2116(local28, local30, local17, arg8, arg9, local22, local34, local2077.anInt5522, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static478.method7105(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1290(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static235.anInt2721;
		@Pc(3) int[] local3 = Static130.anIntArray267;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static221.anInt4798; local5++) {
			@Pc(15) Class6_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local5 - local1])).aClass6_Sub1_Sub2_Sub2_1;
			}
			if (local15.aByte100 == arg0 && local15.anInt8597 >= 0) {
				@Pc(39) int local39 = local15.method7083();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8811 & 0x1FF) != 0 || (local15.anInt8813 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8811 & 0x1FF) != 256 || (local15.anInt8813 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8811 >> 9;
					local80 = local15.anInt8813 >> 9;
					if (local15.anInt8597 > Static405.anIntArrayArray72[local75][local80]) {
						Static405.anIntArrayArray72[local75][local80] = local15.anInt8597;
						Static169.anIntArrayArray42[local75][local80] = 1;
					} else if (local15.anInt8597 == Static405.anIntArrayArray72[local75][local80]) {
						local116 = Static169.anIntArrayArray42[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8811 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8813 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8811 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8813 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8597 > Static405.anIntArrayArray72[local158][local161]) {
								Static405.anIntArrayArray72[local158][local161] = local15.anInt8597;
								Static169.anIntArrayArray42[local158][local161] = 1;
							} else if (local15.anInt8597 == Static405.anIntArrayArray72[local158][local161]) {
								local116 = Static169.anIntArrayArray42[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1291() {
		for (@Pc(1) int local1 = 0; local1 < Static118.anInt2527; local1++) {
			@Pc(6) int[] local6 = Static405.anIntArrayArray72[local1];
			for (@Pc(8) int local8 = 0; local8 < Static549.anInt9482; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1292() {
		Static327.anInt6263 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static221.anInt4798; local3++) {
			@Pc(14) Class6_Sub1_Sub2_Sub2 local14 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local3])).aClass6_Sub1_Sub2_Sub2_1;
			if (local14.aBoolean631 && local14.method7073() != -1) {
				@Pc(32) int local32 = (local14.method7083() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8811 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8813 - local32 >> 9;
				@Pc(53) Class6_Sub1_Sub2 local53 = Static109.method2106(local46, local14.aByte100, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8587;
					if (local53 instanceof Class6_Sub1_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt8536 == 0 && local53.method7073() != -1) {
						Static98.anIntArray217[Static327.anInt6263] = local58;
						Static135.anIntArray272[Static327.anInt6263] = local58;
						Static327.anInt6263++;
						local53.anInt8536++;
					}
					Static98.anIntArray217[Static327.anInt6263] = local58;
					Static135.anIntArray272[Static327.anInt6263] = local14.anInt8587 + 2048;
					Static327.anInt6263++;
					local53.anInt8536++;
				}
			}
		}
		Static142.method2466(Static98.anIntArray217, Static135.anIntArray272, Static327.anInt6263 - 1, 0);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1294() {
		@Pc(1) int local1 = Static235.anInt2721;
		@Pc(3) int[] local3 = Static130.anIntArray267;
		@Pc(11) int local11 = Static159.aBoolean274 ? local1 : local1 + Static221.anInt4798;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class6_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local13 - local1])).aClass6_Sub1_Sub2_Sub2_1;
			}
			if (local23.anInt8597 >= 0) {
				@Pc(43) int local43 = local23.method7083();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8811 & 0x1FF) == 0 && (local23.anInt8813 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8811 & 0x1FF) == 256 && (local23.anInt8813 & 0x1FF) == 256) {
					continue;
				}
				if (local23 instanceof Class6_Sub1_Sub2_Sub1 && local23.aClass3_Sub38_3 != null && Static223.anInt4829 >= local23.aClass3_Sub38_3.anInt6985 && Static223.anInt4829 < local23.aClass3_Sub38_3.anInt6986) {
					((Class6_Sub1_Sub2_Sub1) local23).aBoolean163 = false;
				}
				local23.anInt8814 = Static58.method1166(local23.anInt8813, local23.anInt8811, local23.aByte100);
				Static483.method7135(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!qf;)Lclient!dh;")
	public static Class3_Sub13 method1295(@OriginalArg(0) Class245 arg0) {
		@Pc(13) Class3_Sub13 local13 = (Class3_Sub13) Static447.aClass267_39.method6644(((long) arg0.anInt7256 << 32) + (long) arg0.anInt7264);
		return local13 == null ? arg0.aClass3_Sub13_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!qf;)Z")
	public static boolean method1297(@OriginalArg(0) Class245 arg0) {
		if (Static362.aBoolean430) {
			if (method1295(arg0).anInt1859 != 0) {
				return false;
			}
			if (arg0.anInt7223 == 0) {
				return false;
			}
		}
		return arg0.aBoolean502;
	}
}
