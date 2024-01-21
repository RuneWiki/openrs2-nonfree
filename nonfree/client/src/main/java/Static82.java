import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int anInt2430;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static volatile int anInt2420 = 0;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_653 = Static158.method3034("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public static int anInt2433 = 0;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_654 = Static158.method3034("titlebox");

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
	public static int anInt2436 = 0;

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "[I")
	public static final int[] anIntArray272 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ob;I)I")
	public static int method1917(@OriginalArg(0) Class60 arg0) {
		if (Static132.anInt3564 == 1) {
			return 7;
		} else if (arg0.method2697(Static31.aClass60_224)) {
			return 1;
		} else if (arg0.method2697(Static42.aClass60_303)) {
			return 1;
		} else if (arg0.method2697(Static187.aClass60_1324)) {
			return 2;
		} else if (arg0.method2697(Static47.aClass60_821)) {
			return 2;
		} else if (arg0.method2697(Static19.aClass60_864)) {
			return 3;
		} else if (arg0.method2697(Static22.aClass60_165)) {
			return 4;
		} else if (arg0.method2697(Static73.aClass60_536)) {
			return 4;
		} else if (arg0.method2697(Static6.aClass60_60)) {
			return 5;
		} else if (arg0.method2697(Static80.aClass60_645)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII[Lclient!ra;IIII)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class72[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static133.method2110(arg2, arg8, arg0, arg1);
		Static45.method1048();
		for (@Pc(18) int local18 = 0; local18 < arg5.length; local18++) {
			@Pc(24) Class72 local24 = arg5[local18];
			if (local24 != null && (arg4 == local24.anInt3937 || arg4 == -1412584499 && local24 == Static62.aClass72_5)) {
				@Pc(74) int local74;
				if (arg3 == -1) {
					Static38.anIntArray101[Static42.anInt1305] = arg6 + local24.anInt3907;
					Static16.anIntArray42[Static42.anInt1305] = local24.anInt3919 + arg7;
					Static99.anIntArray329[Static42.anInt1305] = local24.anInt3878;
					Static98.anIntArray326[Static42.anInt1305] = local24.anInt3871;
					local74 = Static42.anInt1305++;
				} else {
					local74 = arg3;
				}
				local24.anInt3928 = local74;
				local24.anInt3872 = Static20.anInt580;
				if (!local24.aBoolean151 || !Static20.method445(local24)) {
					if (local24.anInt3884 > 0) {
						Static56.method1333(local24);
					}
					@Pc(106) int local106 = local24.anInt3919 + arg7;
					@Pc(111) int local111 = arg6 + local24.anInt3907;
					@Pc(114) int local114 = local24.anInt3890;
					@Pc(144) int local144;
					@Pc(150) int local150;
					if (local24 == Static62.aClass72_5) {
						if (arg4 != -1412584499 && !local24.aBoolean155) {
							Static102.anInt2945 = arg7;
							Static196.aClass72Array2 = arg5;
							Static101.anInt2913 = arg6;
							continue;
						}
						if (!local24.aBoolean155) {
							local114 = 128;
						}
						if (Static179.aBoolean174 && Static100.aBoolean111) {
							local144 = Static131.anInt215;
							local144 -= Static187.anInt4632;
							local150 = Static157.anInt3985;
							if (local144 < Static182.anInt4408) {
								local144 = Static182.anInt4408;
							}
							if (local24.anInt3878 + local144 > Static181.aClass72_13.anInt3878 + Static182.anInt4408) {
								local144 = Static181.aClass72_13.anInt3878 + Static182.anInt4408 - local24.anInt3878;
							}
							local111 = local144;
							local150 -= Static174.anInt4252;
							if (local150 < Static145.anInt3787) {
								local150 = Static145.anInt3787;
							}
							if (Static145.anInt3787 + Static181.aClass72_13.anInt3871 < local24.anInt3871 + local150) {
								local150 = Static145.anInt3787 + Static181.aClass72_13.anInt3871 - local24.anInt3871;
							}
							local106 = local150;
						}
					}
					@Pc(233) int local233;
					@Pc(231) int local231;
					@Pc(262) int local262;
					@Pc(274) int local274;
					@Pc(296) int local296;
					@Pc(314) int local314;
					if (local24.anInt3932 == 2) {
						local150 = arg8;
						local231 = arg1;
						local233 = arg0;
						local144 = arg2;
					} else if (local24.anInt3932 == 9) {
						local262 = local111;
						local274 = local106;
						local296 = local111 + local24.anInt3878;
						if (local296 < local111) {
							local262 = local296;
							local296 = local111;
						}
						local314 = local106 + local24.anInt3871;
						if (local106 > local314) {
							local274 = local314;
							local314 = local106;
						}
						local296++;
						local150 = local274 > arg8 ? local274 : arg8;
						local314++;
						local144 = arg2 >= local262 ? arg2 : local262;
						local231 = local314 >= arg1 ? arg1 : local314;
						local233 = local296 < arg0 ? local296 : arg0;
					} else {
						local144 = local111 <= arg2 ? arg2 : local111;
						local150 = local106 > arg8 ? local106 : arg8;
						local262 = local111 + local24.anInt3878;
						local233 = local262 >= arg0 ? arg0 : local262;
						local274 = local24.anInt3871 + local106;
						local231 = local274 < arg1 ? local274 : arg1;
					}
					if (!local24.aBoolean151 || local144 < local233 && local231 > local150) {
						if (local24.anInt3884 != 0) {
							if (local24.anInt3884 == 1337) {
								Static127.anInt3488 = local111;
								Static158.anInt4008 = local106;
								Static174.method3266(local24.anInt3878, local111, local24.anInt3871, local106);
								Static133.method2110(arg2, arg8, arg0, arg1);
								continue;
							}
							if (local24.anInt3884 == 1338) {
								if (local24.method2984()) {
									Static1.method4(local74, local24, local106, local111);
									Static133.method2110(arg2, arg8, arg0, arg1);
								}
								continue;
							}
							if (local24.anInt3884 == 1339) {
								if (local24.method2984()) {
									Static47.method2314(local74, local111, local106, local24);
									Static133.method2110(arg2, arg8, arg0, arg1);
								}
								continue;
							}
						}
						local262 = Static131.anInt215;
						local274 = Static157.anInt3985;
						if (!Static103.aBoolean115 && local144 <= local262 && local150 <= local274 && local233 > local262 && local231 > local274) {
							Static46.method1059(local24, local274 - local106, local262 + -local111);
						}
						if (local24.anInt3932 == 0) {
							if (!local24.aBoolean151 && Static20.method445(local24) && Static150.aClass72_8 != local24) {
								continue;
							}
							if (!local24.aBoolean151) {
								if (local24.anInt3926 > local24.anInt3886 - local24.anInt3871) {
									local24.anInt3926 = local24.anInt3886 - local24.anInt3871;
								}
								if (local24.anInt3926 < 0) {
									local24.anInt3926 = 0;
								}
							}
							method1923(local233, local231, local144, local74, local24.anInt3935, arg5, local111 - local24.anInt3903, local106 - local24.anInt3926, local150);
							if (local24.aClass72Array1 != null) {
								method1923(local233, local231, local144, local74, local24.anInt3935, local24.aClass72Array1, local111 - local24.anInt3903, local106 + -local24.anInt3926, local150);
							}
							@Pc(587) Class2_Sub20 local587 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local24.anInt3935);
							if (local587 != null) {
								if (local587.anInt3989 == 0 && Static131.anInt215 >= local144 && local150 <= Static157.anInt3985 && Static131.anInt215 < local233 && Static157.anInt3985 < local231 && !Static103.aBoolean115 && !Static89.aBoolean102) {
									Static169.anInt4148 = 1;
									Static22.aClass60Array5[0] = Static43.aClass60_311;
									Static140.aShortArray53[0] = 1006;
									Static196.aClass60Array26[0] = Static101.aClass60_807;
								}
								Static16.method401(local144, local74, local106, local233, local587.anInt3986, local231, local150, local111);
							}
							Static133.method2110(arg2, arg8, arg0, arg1);
							Static45.method1048();
						}
						if (Static174.aBooleanArray16[local74] || Static159.anInt4432 > 1) {
							if (local24.anInt3932 == 0 && !local24.aBoolean151 && local24.anInt3886 > local24.anInt3871) {
								Static150.method2970(local24.anInt3871, local106, local24.anInt3926, local24.anInt3878 + local111, local24.anInt3886);
							}
							if (local24.anInt3932 != 1) {
								@Pc(703) int local703;
								@Pc(723) int local723;
								@Pc(898) int local898;
								@Pc(786) int local786;
								@Pc(955) int local955;
								@Pc(953) int local953;
								@Pc(979) int local979;
								@Pc(714) int local714;
								@Pc(903) int local903;
								if (local24.anInt3932 == 2) {
									local296 = 0;
									for (local314 = 0; local314 < local24.anInt3871; local314++) {
										for (local703 = 0; local703 < local24.anInt3878; local703++) {
											local714 = local106 + local314 * (local24.anInt3888 + 32);
											local723 = (local24.anInt3899 + 32) * local703 + local111;
											if (local296 < 20) {
												local714 += local24.anIntArray426[local296];
												local723 += local24.anIntArray428[local296];
											}
											if (local24.anIntArray436[local296] > 0) {
												local786 = local24.anIntArray436[local296] - 1;
												if (local723 + 32 > arg2 && local723 < arg0 && arg8 < local714 + 32 && arg1 > local714 || local24 == Static131.aClass72_2 && local296 == Static157.anInt3993) {
													@Pc(845) Class2_Sub1_Sub7_Sub4 local845;
													if (Static29.anInt889 == 1 && Static6.anInt275 == local296 && local24.anInt3935 == Static16.anInt517) {
														local845 = Static78.method1885(2, false, local786, local24.anIntArray430[local296], 0);
													} else {
														local845 = Static78.method1885(1, false, local786, local24.anIntArray430[local296], 3153952);
													}
													if (local845 == null) {
														Static39.method900(local24);
													} else if (Static131.aClass72_2 == local24 && local296 == Static157.anInt3993) {
														local898 = Static157.anInt3985 - Static77.anInt2336;
														local903 = Static131.anInt215 - Static47.anInt2935;
														if (local898 < 5 && local898 > -5) {
															local898 = 0;
														}
														if (local903 < 5 && local903 > -5) {
															local903 = 0;
														}
														if (Static15.anInt506 < 5) {
															local898 = 0;
															local903 = 0;
														}
														local845.method2132(local903 + local723, local714 - -local898, 128);
														if (arg4 != -1) {
															@Pc(951) Class72 local951 = arg5[arg4 & 0xFFFF];
															local953 = Static133.anInt2689;
															local955 = Static133.anInt2686;
															if (local714 + local898 < local955 && local951.anInt3926 > 0) {
																local979 = Static35.anInt3071 * (local955 - local898 - local714) / 3;
																if (local979 > Static35.anInt3071 * 10) {
																	local979 = Static35.anInt3071 * 10;
																}
																if (local951.anInt3926 < local979) {
																	local979 = local951.anInt3926;
																}
																Static77.anInt2336 += local979;
																local951.anInt3926 -= local979;
																Static39.method900(local951);
															}
															if (local898 + local714 + 32 > local953 && local951.anInt3886 - local951.anInt3871 > local951.anInt3926) {
																local979 = Static35.anInt3071 * (local714 + local898 + 32 - local953) / 3;
																if (local979 > Static35.anInt3071 * 10) {
																	local979 = Static35.anInt3071 * 10;
																}
																if (local951.anInt3886 - local951.anInt3926 - local951.anInt3871 < local979) {
																	local979 = local951.anInt3886 - local951.anInt3926 - local951.anInt3871;
																}
																local951.anInt3926 += local979;
																Static77.anInt2336 -= local979;
																Static39.method900(local951);
															}
														}
													} else if (local24 == Static172.aClass72_12 && Static17.anInt549 == local296) {
														local845.method2132(local723, local714, 128);
													} else {
														local845.method2151(local723, local714);
													}
												}
											} else if (local24.anIntArray432 != null && local296 < 20) {
												@Pc(760) Class2_Sub1_Sub7_Sub4 local760 = local24.method2979(local296);
												if (local760 != null) {
													local760.method2151(local723, local714);
												} else if (Static163.aBoolean159) {
													Static39.method900(local24);
												}
											}
											local296++;
										}
									}
								} else if (local24.anInt3932 == 3) {
									if (Static122.method2601(local24)) {
										local296 = local24.anInt3869;
										if (Static150.aClass72_8 == local24 && local24.anInt3877 != 0) {
											local296 = local24.anInt3877;
										}
									} else {
										local296 = local24.anInt3879;
										if (Static150.aClass72_8 == local24 && local24.anInt3905 != 0) {
											local296 = local24.anInt3905;
										}
									}
									if (local114 == 0) {
										if (local24.aBoolean153) {
											Static133.method2120(local111, local106, local24.anInt3878, local24.anInt3871, local296);
										} else {
											Static133.method2111(local111, local106, local24.anInt3878, local24.anInt3871, local296);
										}
									} else if (local24.aBoolean153) {
										Static133.method2123(local111, local106, local24.anInt3878, local24.anInt3871, local296, 256 - (local114 & 0xFF));
									} else {
										Static133.method2115(local111, local106, local24.anInt3878, local24.anInt3871, local296, 256 - (local114 & 0xFF));
									}
								} else {
									@Pc(1239) Class2_Sub1_Sub7_Sub3_Sub1 local1239;
									if (local24.anInt3932 == 4) {
										local1239 = local24.method2971(Static22.aClass2_Sub1_Sub7_Sub2Array1);
										if (local1239 != null) {
											@Pc(1251) Class60 local1251 = local24.aClass60_1057;
											if (Static122.method2601(local24)) {
												local314 = local24.anInt3869;
												if (local24 == Static150.aClass72_8 && local24.anInt3877 != 0) {
													local314 = local24.anInt3877;
												}
												if (local24.aClass60_1056.method2673() > 0) {
													local1251 = local24.aClass60_1056;
												}
											} else {
												local314 = local24.anInt3879;
												if (Static150.aClass72_8 == local24 && local24.anInt3905 != 0) {
													local314 = local24.anInt3905;
												}
											}
											if (local24.aBoolean151 && local24.anInt3913 != -1) {
												@Pc(1301) Class2_Sub1_Sub8 local1301 = Static88.method2046(local24.anInt3913);
												local1251 = local1301.aClass60_363;
												if (local1251 == null) {
													local1251 = Static197.aClass60_1333;
												}
												if ((local1301.anInt1535 == 1 || local24.anInt3939 != 1) && local24.anInt3939 != -1) {
													local1251 = Static193.method3536(new Class60[] { Static103.aClass60_840, local1251, Static85.aClass60_678, Static192.method3523(local24.anInt3939) });
												}
											}
											if (Static164.aClass72_10 == local24) {
												local314 = local24.anInt3879;
												local1251 = Static70.aClass60_526;
											}
											if (!local24.aBoolean151) {
												local1251 = Static30.method724(local1251, local24);
											}
											local1239.method1791(local1251, local111, local106, local24.anInt3878, local24.anInt3871, local314, local24.aBoolean145 ? 0 : -1, local24.anInt3876, local24.anInt3897, local24.anInt3862);
										} else if (Static163.aBoolean159) {
											Static39.method900(local24);
										}
									} else if (local24.anInt3932 == 5) {
										@Pc(1404) Class2_Sub1_Sub7_Sub4 local1404;
										if (local24.aBoolean151) {
											if (local24.anInt3913 == -1) {
												local1404 = local24.method2983(false);
											} else {
												local1404 = Static78.method1885(local24.anInt3916, false, local24.anInt3913, local24.anInt3939, local24.anInt3868);
											}
											if (local1404 != null) {
												local703 = local1404.anInt2692;
												local314 = local1404.anInt2696;
												if (local24.aBoolean147) {
													Static133.method2127(local111, local106, local111 + local24.anInt3878, local24.anInt3871 + local106);
													local723 = (local314 + local24.anInt3878 - 1) / local314;
													local714 = (local703 + local24.anInt3871 - 1) / local703;
													for (local903 = 0; local903 < local723; local903++) {
														for (local898 = 0; local898 < local714; local898++) {
															if (local24.anInt3882 != 0) {
																local1404.method2148(local903 * local314 + local111 + local314 / 2, local703 / 2 + local106 - -(local703 * local898), local24.anInt3882, 4096);
															} else if (local114 == 0) {
																local1404.method2151(local111 + local314 * local903, local703 * local898 + local106);
															} else {
																local1404.method2132(local111 + local903 * local314, local106 - -(local898 * local703), 256 - (local114 & 0xFF));
															}
														}
													}
													Static133.method2110(arg2, arg8, arg0, arg1);
												} else {
													local723 = local24.anInt3878 * 4096 / local314;
													if (local24.anInt3882 != 0) {
														local1404.method2148(local24.anInt3878 / 2 + local111, local106 - -(local24.anInt3871 / 2), local24.anInt3882, local723);
													} else if (local114 != 0) {
														local1404.method2139(local111, local106, local24.anInt3878, local24.anInt3871, 256 - (local114 & 0xFF));
													} else if (local314 == local24.anInt3878 && local24.anInt3871 == local703) {
														local1404.method2151(local111, local106);
													} else {
														local1404.method2129(local111, local106, local24.anInt3878, local24.anInt3871);
													}
												}
											} else if (Static163.aBoolean159) {
												Static39.method900(local24);
											}
										} else {
											local1404 = local24.method2983(Static122.method2601(local24));
											if (local1404 != null) {
												local1404.method2151(local111, local106);
											} else if (Static163.aBoolean159) {
												Static39.method900(local24);
											}
										}
									} else {
										@Pc(1816) Class2_Sub1_Sub8 local1816;
										if (local24.anInt3932 == 6) {
											@Pc(1675) boolean local1675 = Static122.method2601(local24);
											if (local1675) {
												local314 = local24.anInt3929;
											} else {
												local314 = local24.anInt3923;
											}
											@Pc(1687) Class2_Sub1_Sub1_Sub4 local1687 = null;
											local723 = 0;
											if (local24.anInt3913 != -1) {
												local1816 = Static88.method2046(local24.anInt3913);
												if (local1816 != null) {
													local1816 = local1816.method1152(local24.anInt3939);
													local1687 = local1816.method1148(null, 1, 0);
													if (local1687 == null) {
														Static39.method900(local24);
													} else {
														local723 = -local1687.method3179() / 2;
													}
												}
											} else if (local24.anInt3885 == 5) {
												if (local24.anInt3891 == -1) {
													local1687 = Static130.aClass32_2.method1580(-1, -1, null, null);
												} else {
													local714 = local24.anInt3891 & 0x7FF;
													if (Static89.anInt2601 == local714) {
														local714 = 2047;
													}
													@Pc(1728) Class2_Sub1_Sub1_Sub3_Sub1 local1728 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local714];
													@Pc(1739) Class2_Sub1_Sub5 local1739 = local314 == -1 ? null : Static103.method2357(local314);
													if (local1728 != null && (int) local1728.aClass60_288.method2691() << 11 == (local24.anInt3891 & 0xFFFFF800)) {
														local1687 = local1728.aClass32_1.method1580(local24.anInt3941, 0, null, local1739);
													}
												}
											} else if (local314 == -1) {
												local1687 = local24.method2972(local1675, -1, null, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1);
												if (local1687 == null && Static163.aBoolean159) {
													Static39.method900(local24);
												}
											} else {
												@Pc(1791) Class2_Sub1_Sub5 local1791 = Static103.method2357(local314);
												local1687 = local24.method2972(local1675, local24.anInt3941, local1791, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1);
												if (local1687 == null && Static163.aBoolean159) {
													Static39.method900(local24);
												}
											}
											if (local1687 != null) {
												Static45.method1058(local111 + local24.anInt3878 / 2 + local24.anInt3914, local24.anInt3908 + local106 + local24.anInt3871 / 2);
												local714 = Class2_Sub1_Sub7_Sub1.anIntArray133[local24.anInt3865] * local24.anInt3874 >> 16;
												local903 = local24.anInt3874 * Class2_Sub1_Sub7_Sub1.anIntArray129[local24.anInt3865] >> 16;
												if (!local24.aBoolean151) {
													local1687.method1614(local24.anInt3881, 0, local24.anInt3865, 0, local714, local903);
												} else if (local24.aBoolean146) {
													local1687.method1624(local24.anInt3881, local24.anInt3925, local24.anInt3865, local24.anInt3889, local24.anInt3940 + local723 + local714, local24.anInt3940 + local903, local24.anInt3874);
												} else {
													local1687.method1614(local24.anInt3881, local24.anInt3925, local24.anInt3865, local24.anInt3889, local714 + local723 + local24.anInt3940, local24.anInt3940 + local903);
												}
												Static45.method1044();
											}
										} else {
											if (local24.anInt3932 == 7) {
												local1239 = local24.method2971(Static22.aClass2_Sub1_Sub7_Sub2Array1);
												if (local1239 == null) {
													if (Static163.aBoolean159) {
														Static39.method900(local24);
													}
													continue;
												}
												local314 = 0;
												for (local703 = 0; local703 < local24.anInt3871; local703++) {
													for (local723 = 0; local723 < local24.anInt3878; local723++) {
														if (local24.anIntArray436[local314] > 0) {
															local1816 = Static88.method2046(local24.anIntArray436[local314] - 1);
															@Pc(2041) Class60 local2041;
															if (local1816.anInt1535 != 1 && local24.anIntArray430[local314] == 1) {
																local2041 = Static193.method3536(new Class60[] { Static103.aClass60_840, local1816.aClass60_363, Static167.aClass60_1131 });
															} else {
																local2041 = Static193.method3536(new Class60[] { Static103.aClass60_840, local1816.aClass60_363, Static85.aClass60_678, Static192.method3523(local24.anIntArray430[local314]) });
															}
															local786 = local106 + (local24.anInt3888 + 12) * local703;
															local898 = local723 * (local24.anInt3899 + 115) + local111;
															if (local24.anInt3876 == 0) {
																local1239.method1786(local2041, local898, local786, local24.anInt3879, local24.aBoolean145 ? 0 : -1);
															} else if (local24.anInt3876 == 1) {
																local1239.method1793(local2041, local898 + local24.anInt3878 / 2, local786, local24.anInt3879, local24.aBoolean145 ? 0 : -1);
															} else {
																local1239.method1800(local2041, local24.anInt3878 + local898 - 1, local786, local24.anInt3879, local24.aBoolean145 ? 0 : -1);
															}
														}
														local314++;
													}
												}
											}
											@Pc(2333) int local2333;
											if (local24.anInt3932 == 8 && Static16.aClass72_3 == local24 && Static79.anInt2366 == Static192.anInt4590) {
												local296 = 0;
												local314 = 0;
												@Pc(2180) Class2_Sub1_Sub7_Sub3_Sub1 local2180 = Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3;
												@Pc(2183) Class60 local2183 = local24.aClass60_1057;
												local2183 = Static30.method724(local2183, local24);
												@Pc(2205) Class60 local2205;
												while (local2183.method2673() > 0) {
													local903 = local2183.method2675(Static66.aClass60_500);
													if (local903 == -1) {
														local2205 = local2183;
														local2183 = Static101.aClass60_807;
													} else {
														local2205 = local2183.method2667(local903, 0);
														local2183 = local2183.method2672(local903 + 4);
													}
													local898 = local2180.method1789(local2205);
													local314 += local2180.anInt2252 + 1;
													if (local898 > local296) {
														local296 = local898;
													}
												}
												local296 += 6;
												local314 += 7;
												local898 = local24.anInt3871 + local106 + 5;
												local903 = local111 + local24.anInt3878 - local296 - 5;
												if (local111 + 5 > local903) {
													local903 = local111 + 5;
												}
												if (arg1 < local314 + local898) {
													local898 = arg1 - local314;
												}
												if (local903 + local296 > arg0) {
													local903 = arg0 - local296;
												}
												Static133.method2120(local903, local898, local296, local314, 16777120);
												Static133.method2111(local903, local898, local296, local314, 0);
												local786 = local2180.anInt2252 + local898 + 2;
												local2183 = local24.aClass60_1057;
												local2183 = Static30.method724(local2183, local24);
												while (local2183.method2673() > 0) {
													local2333 = local2183.method2675(Static66.aClass60_500);
													if (local2333 == -1) {
														local2205 = local2183;
														local2183 = Static101.aClass60_807;
													} else {
														local2205 = local2183.method2667(local2333, 0);
														local2183 = local2183.method2672(local2333 + 4);
													}
													local2180.method1786(local2205, local903 + 3, local786, 0, -1);
													local786 += local2180.anInt2252 + 1;
												}
											}
											if (local24.anInt3932 == 9) {
												if (local24.anInt3896 == 1) {
													Static133.method2117(local111, local106, local24.anInt3878 + local111, local24.anInt3871 + local106, local24.anInt3879);
												} else {
													local296 = local24.anInt3878 < 0 ? -local24.anInt3878 : local24.anInt3878;
													local703 = local296;
													local314 = local24.anInt3871 >= 0 ? local24.anInt3871 : -local24.anInt3871;
													if (local296 < local314) {
														local703 = local314;
													}
													if (local703 != 0) {
														local723 = (local24.anInt3878 << 16) / local703;
														local714 = (local24.anInt3871 << 16) / local703;
														if (local723 < local714) {
															local714 = -local714;
														} else {
															local723 = -local723;
														}
														local786 = local24.anInt3896 * local723 >> 17;
														@Pc(2472) int local2472 = local111 - arg2;
														local898 = local24.anInt3896 * local714 + 1 >> 17;
														local903 = local714 * local24.anInt3896 >> 17;
														local955 = local106 - arg8;
														local2333 = local24.anInt3896 * local723 + 1 >> 17;
														local953 = local903 + local2472;
														@Pc(2513) int local2513 = local2472 + local24.anInt3878 - local898;
														@Pc(2517) int local2517 = local786 + local955;
														@Pc(2525) int local2525 = local24.anInt3871 + local955 - local2333;
														@Pc(2533) int local2533 = local903 + local2472 + local24.anInt3878;
														@Pc(2537) int local2537 = local955 - local2333;
														@Pc(2544) int local2544 = local24.anInt3871 + local955 + local786;
														local979 = local2472 - local898;
														Static45.method1057(local953, local979, local2513);
														Static45.method1040(local2517, local2537, local2525, local953, local979, local2513, local24.anInt3879);
														Static45.method1057(local953, local2513, local2533);
														Static45.method1040(local2517, local2525, local2544, local953, local2513, local2533, local24.anInt3879);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
	public static void method1925() {
		Static7.aClass89_70.method3439();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
	public static void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass26_1 = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(JI)V")
	public static void method1927(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static81.anInt2399; local20++) {
			if (arg0 == Static118.aLongArray5[local20]) {
				Static81.anInt2399--;
				for (@Pc(38) int local38 = local20; local38 < Static81.anInt2399; local38++) {
					Static169.aClass60Array25[local38] = Static169.aClass60Array25[local38 + 1];
					Static93.anIntArray313[local38] = Static93.anIntArray313[local38 + 1];
					Static25.aClass60Array6[local38] = Static25.aClass60Array6[local38 + 1];
					Static118.aLongArray5[local38] = Static118.aLongArray5[local38 + 1];
					Static180.anIntArray373[local38] = Static180.anIntArray373[local38 + 1];
				}
				Static1.anInt4 = Static157.anInt3990;
				Static7.aClass2_Sub3_Sub1_43.method244(138);
				Static7.aClass2_Sub3_Sub1_43.method205(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
	public static void method1930() {
		Static103.aBoolean115 = false;
		Static46.anInt1433 = 0;
		Static7.aClass2_Sub3_Sub1_43.anInt273 = 0;
		Static168.anInt4121 = 0;
		Static156.anInt3973 = -1;
		Static96.anInt3098 = 0;
		Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
		Static197.anInt4656 = 0;
		Static166.anInt4104 = 0;
		Static54.anInt1755 = -1;
		Static175.anInt4268 = -1;
		Static169.anInt4148 = 0;
		Static62.anInt1922 = -1;
		for (@Pc(39) int local39 = 0; local39 < Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3.length; local39++) {
			if (Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local39] != null) {
				Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local39].anInt3291 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1.length; local57++) {
			if (Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local57] != null) {
				Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local57].anInt3291 = -1;
			}
		}
		Static168.method3123();
		Static139.method2831(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static127.aBooleanArray14[local84] = true;
		}
	}
}
