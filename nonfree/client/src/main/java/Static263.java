import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
	public static int anInt5239;

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_45 = new Class208(51, 3);

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "Z")
	private static boolean aBoolean358 = true;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
	public static void method4676(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static258.anInt5160;
		@Pc(7) int local7 = Static640.anInt10662;
		if (arg0 && Static591.aBoolean675) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static162.aClass100_7.f(local7, local5);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)Z")
	public static boolean method4677() throws IOException {
		if (Static97.aClass29_1 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static5.aClass268_3 == null) {
			if (aBoolean358) {
				if (!Static97.aClass29_1.method4608(1)) {
					return false;
				}
				Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 0);
				Static376.anInt6901 = 0;
				Static131.anInt2518++;
				aBoolean358 = false;
			}
			Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
			if (Static456.aClass6_Sub40_Sub2_2.method8627()) {
				if (!Static97.aClass29_1.method4608(1)) {
					return false;
				}
				Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 1);
				Static376.anInt6901 = 0;
				Static131.anInt2518++;
			}
			aBoolean358 = true;
			@Pc(71) Class268[] local71 = Static365.method5783();
			local75 = Static456.aClass6_Sub40_Sub2_2.method8620();
			if (local75 < 0 || local71.length <= local75) {
				throw new IOException("invo:" + local75 + " ip:" + Static456.aClass6_Sub40_Sub2_2.anInt10169);
			}
			Static5.aClass268_3 = local71[local75];
			Static501.anInt8676 = Static5.aClass268_3.anInt8121;
		}
		if (Static501.anInt8676 == -1) {
			if (!Static97.aClass29_1.method4608(1)) {
				return false;
			}
			Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 0);
			Static131.anInt2518++;
			Static376.anInt6901 = 0;
			Static501.anInt8676 = Static456.aClass6_Sub40_Sub2_2.aByteArray113[0] & 0xFF;
		}
		if (Static501.anInt8676 == -2) {
			if (!Static97.aClass29_1.method4608(2)) {
				return false;
			}
			Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 2, 0);
			Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
			Static501.anInt8676 = Static456.aClass6_Sub40_Sub2_2.method8571();
			Static376.anInt6901 = 0;
			Static131.anInt2518 += 2;
		}
		if (Static501.anInt8676 > 0) {
			if (!Static97.aClass29_1.method4608(Static501.anInt8676)) {
				return false;
			}
			Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
			Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, Static501.anInt8676, 0);
			Static376.anInt6901 = 0;
			Static131.anInt2518 += Static501.anInt8676;
		}
		Static441.aClass268_143 = Static112.aClass268_38;
		Static112.aClass268_38 = Static457.aClass268_147;
		Static457.aClass268_147 = Static5.aClass268_3;
		if (Static5.aClass268_3 == Static56.aClass268_22) {
			Static213.aClass314_1 = Static279.method4876(Static456.aClass6_Sub40_Sub2_2.method8604());
			Static5.aClass268_3 = null;
			return true;
		} else if (Static57.aClass268_24 == Static5.aClass268_3) {
			Static126.method2048(Static376.aBoolean460);
			Static5.aClass268_3 = null;
			return false;
		} else {
			@Pc(237) String local237;
			@Pc(245) String local245;
			if (Static427.aClass268_140 == Static5.aClass268_3) {
				local237 = Static456.aClass6_Sub40_Sub2_2.method8611();
				local245 = Static257.method4611(Static9.method187(Static456.aClass6_Sub40_Sub2_2));
				Static145.method2337(0, local237, local245, 6, local237, local237);
				Static5.aClass268_3 = null;
				return true;
			}
			@Pc(282) int local282;
			@Pc(264) int local264;
			@Pc(278) int local278;
			@Pc(274) int local274;
			if (Static272.aClass268_116 == Static5.aClass268_3) {
				local264 = Static456.aClass6_Sub40_Sub2_2.method8560();
				local75 = Static456.aClass6_Sub40_Sub2_2.method8560();
				local274 = Static456.aClass6_Sub40_Sub2_2.method8552();
				local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local282 = Static456.aClass6_Sub40_Sub2_2.method8576();
				Static526.method7819();
				Static303.aBooleanArray32[local282] = true;
				Static485.anIntArray526[local282] = local264;
				Static113.anIntArray157[local282] = local278;
				Static255.anIntArray293[local282] = local75;
				Static186.anIntArray229[local282] = local274;
				Static5.aClass268_3 = null;
				return true;
			} else if (Static404.aClass268_134 == Static5.aClass268_3) {
				local264 = Static456.aClass6_Sub40_Sub2_2.method8604();
				local75 = local264 >> 5;
				local274 = local264 & 0x1F;
				if (local274 == 0) {
					Static325.aClass19Array1[local75] = null;
					Static5.aClass268_3 = null;
					return true;
				}
				@Pc(341) Class19 local341 = new Class19();
				local341.anInt332 = local274;
				local341.anInt334 = Static456.aClass6_Sub40_Sub2_2.method8604();
				if (local341.anInt334 >= 0 && local341.anInt334 < Static30.aClass32Array11.length) {
					if (local341.anInt332 == 1 || local341.anInt332 == 10) {
						local341.anInt331 = Static456.aClass6_Sub40_Sub2_2.method8571();
						Static456.aClass6_Sub40_Sub2_2.anInt10169 += 6;
					} else if (local341.anInt332 >= 2 && local341.anInt332 <= 6) {
						if (local341.anInt332 == 2) {
							local341.anInt333 = 256;
							local341.anInt339 = 256;
						}
						if (local341.anInt332 == 3) {
							local341.anInt333 = 0;
							local341.anInt339 = 256;
						}
						if (local341.anInt332 == 4) {
							local341.anInt339 = 256;
							local341.anInt333 = 512;
						}
						if (local341.anInt332 == 5) {
							local341.anInt333 = 256;
							local341.anInt339 = 0;
						}
						if (local341.anInt332 == 6) {
							local341.anInt339 = 512;
							local341.anInt333 = 256;
						}
						local341.anInt332 = 2;
						local341.anInt336 = Static456.aClass6_Sub40_Sub2_2.method8604();
						local341.anInt333 += Static456.aClass6_Sub40_Sub2_2.method8571() - Static606.anInt8651 << 9;
						local341.anInt339 += Static456.aClass6_Sub40_Sub2_2.method8571() - Static195.anInt3961 << 9;
						local341.anInt335 = Static456.aClass6_Sub40_Sub2_2.method8604() << 2;
						local341.anInt340 = Static456.aClass6_Sub40_Sub2_2.method8571();
					}
					local341.anInt337 = Static456.aClass6_Sub40_Sub2_2.method8571();
					if (local341.anInt337 == 65535) {
						local341.anInt337 = -1;
					}
					Static325.aClass19Array1[local75] = local341;
				}
				Static5.aClass268_3 = null;
				return true;
			} else {
				@Pc(528) String local528;
				@Pc(539) long local539;
				@Pc(544) long local544;
				@Pc(522) boolean local522;
				@Pc(548) int local548;
				@Pc(552) int local552;
				@Pc(560) boolean local560;
				@Pc(562) int local562;
				if (Static5.aClass268_3 == Static630.aClass268_183) {
					local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
					local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
					local528 = local245;
					if (local522) {
						local528 = Static456.aClass6_Sub40_Sub2_2.method8611();
					}
					local539 = (long) Static456.aClass6_Sub40_Sub2_2.method8571();
					local544 = (long) Static456.aClass6_Sub40_Sub2_2.method8606();
					local548 = Static456.aClass6_Sub40_Sub2_2.method8604();
					local552 = Static456.aClass6_Sub40_Sub2_2.method8571();
					@Pc(558) long local558 = (local539 << 32) + local544;
					local560 = false;
					local562 = 0;
					while (true) {
						if (local562 >= 100) {
							if (local548 <= 1 && Static407.method5571(local528)) {
								local560 = true;
							}
							break;
						}
						if (local558 == Static194.aLongArray3[local562]) {
							local560 = true;
							break;
						}
						local562++;
					}
					if (!local560 && Static495.anInt8598 == 0) {
						Static194.aLongArray3[Static628.anInt10315] = local558;
						Static628.anInt10315 = (Static628.anInt10315 + 1) % 100;
						@Pc(620) String local620 = Static337.aClass327_2.method7979(local552).method5399(Static456.aClass6_Sub40_Sub2_2);
						if (local548 == 2) {
							Static121.method1987((String) null, 18, "<img=1>" + local528, local245, local552, local620, "<img=1>" + local245, 0);
						} else if (local548 == 1) {
							Static121.method1987((String) null, 18, "<img=0>" + local528, local245, local552, local620, "<img=0>" + local245, 0);
						} else {
							Static121.method1987((String) null, 18, local528, local245, local552, local620, local245, 0);
						}
					}
					Static5.aClass268_3 = null;
					return true;
				} else if (Static5.aClass268_3 == Static323.aClass268_110) {
					local264 = Static456.aClass6_Sub40_Sub2_2.method8579();
					local75 = Static456.aClass6_Sub40_Sub2_2.method8614();
					Static526.method7819();
					Static88.method1512(local75, local264);
					Static5.aClass268_3 = null;
					return true;
				} else {
					@Pc(749) int local749;
					@Pc(780) int local780;
					@Pc(787) int local787;
					@Pc(984) int local984;
					@Pc(745) boolean local745;
					@Pc(898) boolean local898;
					@Pc(811) int local811;
					@Pc(819) int local819;
					if (Static5.aClass268_3 == Static108.aClass268_36) {
						local264 = Static456.aClass6_Sub40_Sub2_2.method8614();
						local75 = Static456.aClass6_Sub40_Sub2_2.method8552();
						local274 = Static456.aClass6_Sub40_Sub2_2.method8585();
						local278 = Static456.aClass6_Sub40_Sub2_2.method8568();
						local282 = Static456.aClass6_Sub40_Sub2_2.method8604();
						local745 = (local282 & 0x80) != 0;
						local749 = local282 & 0x7;
						local548 = local282 >> 3 & 0xF;
						if (local548 == 15) {
							local548 = -1;
						}
						if (local278 >> 30 == 0) {
							@Pc(950) Class21 local950;
							@Pc(944) Class21 local944;
							@Pc(930) Class93 local930;
							if (local278 >> 29 != 0) {
								local552 = local278 & 0xFFFF;
								@Pc(1186) Class6_Sub46 local1186 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local552);
								if (local1186 != null) {
									@Pc(1191) Class20_Sub2_Sub2_Sub1_Sub2 local1191 = local1186.aClass20_Sub2_Sub2_Sub1_Sub2_1;
									if (local264 == 65535) {
										local264 = -1;
									}
									local560 = true;
									local562 = local745 ? local1191.anInt5558 : local1191.anInt5519;
									if (local264 != -1 && local562 != -1) {
										if (local562 == local264) {
											local930 = Static436.aClass292_2.method7401(local264);
											if (local930.aBoolean189 && local930.anInt2750 != -1) {
												local944 = Static294.aClass373_2.method8738(local930.anInt2750);
												@Pc(1290) int local1290 = local944.anInt351;
												if (local1290 == 0 || local1290 == 2) {
													local560 = false;
												} else if (local1290 == 1) {
													local560 = true;
												}
											}
										} else {
											local930 = Static436.aClass292_2.method7401(local264);
											@Pc(1232) Class93 local1232 = Static436.aClass292_2.method7401(local562);
											if (local930.anInt2750 != -1 && local1232.anInt2750 != -1) {
												local950 = Static294.aClass373_2.method8738(local930.anInt2750);
												@Pc(1253) Class21 local1253 = Static294.aClass373_2.method8738(local1232.anInt2750);
												if (local950.anInt355 < local1253.anInt355) {
													local560 = false;
												}
											}
										}
									}
									if (local560) {
										if (local745) {
											local1191.anInt5570 = local749;
											local1191.anInt5540 = 1;
											local1191.anInt5494 = 0;
											local1191.anInt5558 = local264;
											local1191.anInt5543 = 0;
											local1191.anInt5495 = local548;
											local1191.anInt5568 = local274;
											local1191.anInt5489 = local75 + Static113.anInt2243;
											if (Static113.anInt2243 < local1191.anInt5489) {
												local1191.anInt5543 = -1;
											}
											if (local1191.anInt5558 != -1 && Static113.anInt2243 == local1191.anInt5489) {
												local819 = Static436.aClass292_2.method7401(local1191.anInt5558).anInt2750;
												if (local819 != -1) {
													local944 = Static294.aClass373_2.method8738(local819);
													if (local944 != null && local944.anIntArray15 != null && !local1191.aBoolean377) {
														Static558.method8052(0, local1191, local944);
													}
												}
											}
										} else {
											local1191.anInt5505 = local548;
											local1191.anInt5527 = local274;
											local1191.anInt5509 = 1;
											local1191.anInt5519 = local264;
											local1191.lb = 0;
											local1191.anInt5555 = Static113.anInt2243 + local75;
											local1191.anInt5491 = local749;
											local1191.anInt5515 = 0;
											if (local1191.anInt5555 > Static113.anInt2243) {
												local1191.lb = -1;
											}
											if (local1191.anInt5519 != -1 && Static113.anInt2243 == local1191.anInt5555) {
												local819 = Static436.aClass292_2.method7401(local1191.anInt5519).anInt2750;
												if (local819 != -1) {
													local944 = Static294.aClass373_2.method8738(local819);
													if (local944 != null && local944.anIntArray15 != null && !local1191.aBoolean377) {
														Static558.method8052(0, local1191, local944);
													}
												}
											}
										}
									}
								}
							} else if (local278 >> 28 != 0) {
								local552 = local278 & 0xFFFF;
								@Pc(883) Class20_Sub2_Sub2_Sub1_Sub1 local883;
								if (Static229.anInt4561 == local552) {
									local883 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1;
								} else {
									local883 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local552];
								}
								if (local883 != null) {
									if (local264 == 65535) {
										local264 = -1;
									}
									local898 = true;
									local811 = local745 ? local883.anInt5558 : local883.anInt5519;
									@Pc(981) Class21 local981;
									if (local264 != -1 && local811 != -1) {
										@Pc(925) Class93 local925;
										if (local811 == local264) {
											local925 = Static436.aClass292_2.method7401(local264);
											if (local925.aBoolean189 && local925.anInt2750 != -1) {
												local981 = Static294.aClass373_2.method8738(local925.anInt2750);
												local984 = local981.anInt351;
												if (local984 == 0 || local984 == 2) {
													local898 = false;
												} else if (local984 == 1) {
													local898 = true;
												}
											}
										} else {
											local925 = Static436.aClass292_2.method7401(local264);
											local930 = Static436.aClass292_2.method7401(local811);
											if (local925.anInt2750 != -1 && local930.anInt2750 != -1) {
												local944 = Static294.aClass373_2.method8738(local925.anInt2750);
												local950 = Static294.aClass373_2.method8738(local930.anInt2750);
												if (local944.anInt355 < local950.anInt355) {
													local898 = false;
												}
											}
										}
									}
									if (local898) {
										if (local745) {
											local883.anInt5558 = local264;
											local883.anInt5570 = local749;
											local883.anInt5489 = Static113.anInt2243 + local75;
											local883.anInt5543 = 0;
											local883.anInt5568 = local274;
											local883.anInt5494 = 0;
											local883.anInt5495 = local548;
											local883.anInt5540 = 1;
											if (local883.anInt5558 == 65535) {
												local883.anInt5558 = -1;
											}
											if (local883.anInt5489 > Static113.anInt2243) {
												local883.anInt5543 = -1;
											}
											if (local883.anInt5558 != -1 && Static113.anInt2243 == local883.anInt5489) {
												local562 = Static436.aClass292_2.method7401(local883.anInt5558).anInt2750;
												if (local562 != -1) {
													local981 = Static294.aClass373_2.method8738(local562);
													if (local981 != null && local981.anIntArray15 != null && !local883.aBoolean377) {
														Static558.method8052(0, local883, local981);
													}
												}
											}
										} else {
											local883.anInt5555 = Static113.anInt2243 + local75;
											local883.anInt5491 = local749;
											local883.lb = 0;
											local883.anInt5505 = local548;
											local883.anInt5515 = 0;
											local883.anInt5509 = 1;
											local883.anInt5519 = local264;
											local883.anInt5527 = local274;
											if (local883.anInt5555 > Static113.anInt2243) {
												local883.lb = -1;
											}
											if (local883.anInt5519 == 65535) {
												local883.anInt5519 = -1;
											}
											if (local883.anInt5519 != -1 && local883.anInt5555 == Static113.anInt2243) {
												local562 = Static436.aClass292_2.method7401(local883.anInt5519).anInt2750;
												if (local562 != -1) {
													local981 = Static294.aClass373_2.method8738(local562);
													if (local981 != null && local981.anIntArray15 != null && !local883.aBoolean377) {
														Static558.method8052(0, local883, local981);
													}
												}
											}
										}
									}
								}
							}
						} else {
							local552 = local278 >> 28 & 0x3;
							local780 = (local278 >> 14 & 0x3FFF) - Static606.anInt8651;
							local787 = (local278 & 0x3FFF) - Static195.anInt3961;
							if (local780 >= 0 && local787 >= 0 && local780 < Static442.anInt7975 && local787 < Static284.anInt7916) {
								local811 = local780 * 512 + 256;
								local562 = local787 * 512 + 256;
								local819 = local552;
								if (local552 < 3 && Static492.method7384(local780, local787)) {
									local819 = local552 + 1;
								}
								@Pc(852) Class20_Sub2_Sub2_Sub3 local852 = new Class20_Sub2_Sub2_Sub3(local264, local75, Static113.anInt2243, local552, local819, local811, Static138.method2248(local811, local552, local562) - local274, local562, local780, local780, local787, local787, local749);
								Static576.aClass8_29.method157(new Class6_Sub2_Sub13(local852));
							}
						}
						Static5.aClass268_3 = null;
						return true;
					}
					@Pc(1477) byte local1477;
					if (Static40.aClass268_17 == Static5.aClass268_3) {
						local1477 = Static456.aClass6_Sub40_Sub2_2.method8583();
						local75 = Static456.aClass6_Sub40_Sub2_2.method8576();
						Static526.method7819();
						Static578.method5703(local1477, local75);
						Static5.aClass268_3 = null;
						return true;
					}
					@Pc(1528) int local1528;
					if (Static5.aClass268_3 == Static208.aClass268_68) {
						local264 = Static456.aClass6_Sub40_Sub2_2.method8610();
						local75 = local264 >> 28 & 0x3;
						local274 = local264 >> 14 & 0x3FFF;
						local278 = local264 & 0x3FFF;
						local282 = Static456.aClass6_Sub40_Sub2_2.method8571();
						if (local282 == 65535) {
							local282 = -1;
						}
						local1528 = Static456.aClass6_Sub40_Sub2_2.method8573();
						local749 = local1528 >> 2;
						local548 = local1528 & 0x3;
						local278 -= Static195.anInt3961;
						local274 -= Static606.anInt8651;
						local552 = Static622.anIntArray622[local749];
						Static381.method5937(local75, local278, local548, local552, local282, local749, local274);
						Static5.aClass268_3 = null;
						return true;
					} else if (Static253.aClass268_84 == Static5.aClass268_3) {
						Static463.anInt8194 = Static456.aClass6_Sub40_Sub2_2.method8604();
						for (local264 = 0; local264 < Static463.anInt8194; local264++) {
							Static530.aStringArray60[local264] = Static456.aClass6_Sub40_Sub2_2.method8611();
							Static234.aStringArray36[local264] = Static456.aClass6_Sub40_Sub2_2.method8611();
							if (Static234.aStringArray36[local264].equals("")) {
								Static234.aStringArray36[local264] = Static530.aStringArray60[local264];
							}
							Static622.aStringArray74[local264] = Static456.aClass6_Sub40_Sub2_2.method8611();
							Static321.aStringArray47[local264] = Static456.aClass6_Sub40_Sub2_2.method8611();
							if (Static321.aStringArray47[local264].equals("")) {
								Static321.aStringArray47[local264] = Static622.aStringArray74[local264];
							}
							Static124.aBooleanArray16[local264] = false;
						}
						Static5.aClass268_3 = null;
						Static533.anInt9234 = Static320.anInt6118;
						return true;
					} else {
						@Pc(1818) boolean local1818;
						@Pc(1839) Class17 local1839;
						if (Static352.aClass268_117 == Static5.aClass268_3) {
							Static328.anInt6239 = Static320.anInt6118;
							if (Static501.anInt8676 == 0) {
								Static594.aString110 = null;
								Static301.anInt5871 = 0;
								Static64.aString116 = null;
								Static5.aClass268_3 = null;
								Static635.aClass17Array3 = null;
								return true;
							}
							Static64.aString116 = Static456.aClass6_Sub40_Sub2_2.method8611();
							local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
							if (local522) {
								Static456.aClass6_Sub40_Sub2_2.method8611();
							}
							@Pc(1689) long local1689 = Static456.aClass6_Sub40_Sub2_2.method8603();
							Static594.aString110 = Static340.method5776(local1689);
							Static165.aByte53 = Static456.aClass6_Sub40_Sub2_2.method8602();
							local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
							if (local278 == 255) {
								Static5.aClass268_3 = null;
								return true;
							}
							Static301.anInt5871 = local278;
							@Pc(1713) Class17[] local1713 = new Class17[100];
							for (local1528 = 0; local1528 < Static301.anInt5871; local1528++) {
								local1713[local1528] = new Class17();
								local1713[local1528].aString5 = Static456.aClass6_Sub40_Sub2_2.method8611();
								local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
								if (local522) {
									local1713[local1528].aString4 = Static456.aClass6_Sub40_Sub2_2.method8611();
								} else {
									local1713[local1528].aString4 = local1713[local1528].aString5;
								}
								local1713[local1528].aString6 = Static344.method5576(local1713[local1528].aString4);
								local1713[local1528].anInt327 = Static456.aClass6_Sub40_Sub2_2.method8571();
								local1713[local1528].aByte1 = Static456.aClass6_Sub40_Sub2_2.method8602();
								local1713[local1528].aString3 = Static456.aClass6_Sub40_Sub2_2.method8611();
								if (local1713[local1528].aString4.equals(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12)) {
									Static642.aByte128 = local1713[local1528].aByte1;
								}
							}
							local552 = Static301.anInt5871;
							while (local552 > 0) {
								local1818 = true;
								local552--;
								for (local780 = 0; local780 < local552; local780++) {
									if (local1713[local780].aString6.compareTo(local1713[local780 + 1].aString6) > 0) {
										local1839 = local1713[local780];
										local1713[local780] = local1713[local780 + 1];
										local1818 = false;
										local1713[local780 + 1] = local1839;
									}
								}
								if (local1818) {
									break;
								}
							}
							Static635.aClass17Array3 = local1713;
							Static5.aClass268_3 = null;
							return true;
						} else if (Static221.aClass268_73 == Static5.aClass268_3) {
							local264 = Static456.aClass6_Sub40_Sub2_2.method8552();
							if (local264 == 65535) {
								local264 = -1;
							}
							local75 = Static456.aClass6_Sub40_Sub2_2.method8581();
							Static526.method7819();
							Static573.method8160(local75, 2, local264, -1);
							Static5.aClass268_3 = null;
							return true;
						} else {
							@Pc(1928) String local1928;
							@Pc(1955) String local1955;
							@Pc(1926) String local1926;
							if (Static5.aClass268_3 == Static454.aClass268_145) {
								local264 = Static456.aClass6_Sub40_Sub2_2.method8587();
								local75 = Static456.aClass6_Sub40_Sub2_2.method8579();
								local274 = Static456.aClass6_Sub40_Sub2_2.method8604();
								local1926 = "";
								local1928 = local1926;
								if ((local274 & 0x1) != 0) {
									local1926 = Static456.aClass6_Sub40_Sub2_2.method8611();
									if ((local274 & 0x2) == 0) {
										local1928 = local1926;
									} else {
										local1928 = Static456.aClass6_Sub40_Sub2_2.method8611();
									}
								}
								local1955 = Static456.aClass6_Sub40_Sub2_2.method8611();
								if (local264 == 99) {
									Static97.method1576(local1955);
								} else if (local1928.equals("") || !Static407.method5571(local1928)) {
									Static145.method2337(local75, local1926, local1955, local264, local1926, local1928);
								} else {
									Static5.aClass268_3 = null;
									return true;
								}
								Static5.aClass268_3 = null;
								return true;
							} else if (Static381.aClass268_123 == Static5.aClass268_3) {
								local264 = Static456.aClass6_Sub40_Sub2_2.method8552();
								if (local264 == 65535) {
									local264 = -1;
								}
								local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
								local274 = Static456.aClass6_Sub40_Sub2_2.method8573();
								local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
								if (local278 >= 1 && local278 <= 8) {
									if (local245.equalsIgnoreCase("null")) {
										local245 = null;
									}
									Static637.aStringArray75[local278 - 1] = local245;
									Static496.anIntArray531[local278 - 1] = local264;
									Static493.aBooleanArray45[local278 - 1] = local274 == 0;
								}
								Static5.aClass268_3 = null;
								return true;
							} else if (Static555.aClass268_167 == Static5.aClass268_3) {
								local264 = Static456.aClass6_Sub40_Sub2_2.method8585();
								local75 = Static456.aClass6_Sub40_Sub2_2.method8581();
								Static279.aClass294_1.method7419(local75, local264);
								Static5.aClass268_3 = null;
								return true;
							} else if (Static210.aClass268_69 == Static5.aClass268_3) {
								Static29.method524(Static240.aClass244_9);
								Static5.aClass268_3 = null;
								return true;
							} else if (Static5.aClass268_3 == Static245.aClass268_113) {
								local264 = Static456.aClass6_Sub40_Sub2_2.method8552();
								Static526.method7819();
								Static258.method4616(local264);
								Static5.aClass268_3 = null;
								return true;
							} else if (Static5.aClass268_3 == Static1.aClass268_151) {
								local264 = Static456.aClass6_Sub40_Sub2_2.method8604();
								Static526.method7819();
								Static101.anInt1980 = local264;
								Static5.aClass268_3 = null;
								return true;
							} else if (Static296.aClass268_102 == Static5.aClass268_3) {
								Static29.method524(Static369.aClass244_16);
								Static5.aClass268_3 = null;
								return true;
							} else if (Static5.aClass268_3 == Static143.aClass268_53) {
								Static221.anInt4349 = Static456.aClass6_Sub40_Sub2_2.method8560();
								Static231.anInt4574 = Static456.aClass6_Sub40_Sub2_2.method8573();
								Static5.aClass268_3 = null;
								return true;
							} else if (Static117.aClass268_39 == Static5.aClass268_3) {
								Static240.method4164();
								Static5.aClass268_3 = null;
								return true;
							} else if (Static5.aClass268_3 == Static613.aClass268_180) {
								local264 = Static456.aClass6_Sub40_Sub2_2.method8573();
								local75 = Static456.aClass6_Sub40_Sub2_2.method8585();
								Static279.aClass294_1.method7417(local75, local264);
								Static5.aClass268_3 = null;
								return true;
							} else if (Static267.aClass268_89 == Static5.aClass268_3) {
								Static39.method753(Static456.aClass6_Sub40_Sub2_2.method8611());
								Static5.aClass268_3 = null;
								return true;
							} else if (Static636.aClass268_186 == Static5.aClass268_3) {
								Static5.aClass268_3 = null;
								Static579.anInt9657 = 1;
								Static533.anInt9234 = Static320.anInt6118;
								return true;
							} else if (Static424.aClass268_138 == Static5.aClass268_3) {
								Static29.method524(Static1.aClass244_19);
								Static5.aClass268_3 = null;
								return true;
							} else {
								@Pc(2285) Class6_Sub47 local2285;
								@Pc(2269) Class6_Sub47 local2269;
								if (Static44.aClass268_20 == Static5.aClass268_3) {
									local264 = Static456.aClass6_Sub40_Sub2_2.method8571();
									if (local264 == 65535) {
										local264 = -1;
									}
									local75 = Static456.aClass6_Sub40_Sub2_2.method8579();
									local274 = Static456.aClass6_Sub40_Sub2_2.method8552();
									if (local274 == 65535) {
										local274 = -1;
									}
									local278 = Static456.aClass6_Sub40_Sub2_2.method8581();
									Static526.method7819();
									for (local282 = local264; local282 <= local274; local282++) {
										local544 = ((long) local278 << 32) + ((long) local282);
										local2269 = (Class6_Sub47) Static284.aClass128_35.method3560(local544);
										if (local2269 != null) {
											local2285 = new Class6_Sub47(local75, local2269.anInt9598);
											local2269.method9043();
										} else if (local282 == -1) {
											local2285 = new Class6_Sub47(local75, Static386.method4914(local278).aClass6_Sub47_2.anInt9598);
										} else {
											local2285 = new Class6_Sub47(local75, -1);
										}
										Static284.aClass128_35.method3551(local544, local2285);
									}
									Static5.aClass268_3 = null;
									return true;
								} else if (Static5.aClass268_3 == Static119.aClass268_40) {
									Static619.anInt10219 = Static456.aClass6_Sub40_Sub2_2.method8602() << 3;
									Static482.anInt8366 = Static456.aClass6_Sub40_Sub2_2.method8560();
									Static245.anInt6442 = Static456.aClass6_Sub40_Sub2_2.method8590() << 3;
									Static5.aClass268_3 = null;
									return true;
								} else if (Static68.aClass268_27 == Static5.aClass268_3) {
									Static273.anInt5414 = Static456.aClass6_Sub40_Sub2_2.method8604();
									Static5.aClass268_3 = null;
									return true;
								} else if (Static5.aClass268_3 == Static383.aClass268_127) {
									local264 = Static456.aClass6_Sub40_Sub2_2.method8568();
									local75 = Static456.aClass6_Sub40_Sub2_2.method8585();
									Static526.method7819();
									Static458.method7036(local264, local75);
									Static5.aClass268_3 = null;
									return true;
								} else if (Static5.aClass268_3 == Static375.aClass268_122) {
									local264 = Static456.aClass6_Sub40_Sub2_2.method8581();
									local75 = Static456.aClass6_Sub40_Sub2_2.method8614();
									Static526.method7819();
									Static151.method2374(local264, local75);
									Static5.aClass268_3 = null;
									return true;
								} else {
									@Pc(2434) boolean local2434;
									if (Static5.aClass268_3 == Static581.aClass268_142) {
										local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
										local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
										local528 = local245;
										if (local522) {
											local528 = Static456.aClass6_Sub40_Sub2_2.method8611();
										}
										local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
										local2434 = false;
										if (local278 <= 1) {
											if (Static461.aBoolean555 && !Static279.aBoolean370 || Static441.aBoolean530) {
												local2434 = true;
											} else if (local278 <= 1 && Static407.method5571(local528)) {
												local2434 = true;
											}
										}
										if (!local2434 && Static495.anInt8598 == 0) {
											local1955 = Static257.method4611(Static9.method187(Static456.aClass6_Sub40_Sub2_2));
											if (local278 == 2) {
												Static121.method1987((String) null, 24, "<img=1>" + local528, local245, -1, local1955, "<img=1>" + local245, 0);
											} else if (local278 == 1) {
												Static121.method1987((String) null, 24, "<img=0>" + local528, local245, -1, local1955, "<img=0>" + local245, 0);
											} else {
												Static121.method1987((String) null, 24, local528, local245, -1, local1955, local245, 0);
											}
										}
										Static5.aClass268_3 = null;
										return true;
									} else if (Static5.aClass268_3 == Static214.aClass268_70) {
										Static510.method7561();
										Static5.aClass268_3 = null;
										return false;
									} else if (Static5.aClass268_3 == Static537.aClass268_164) {
										Static456.aClass6_Sub40_Sub2_2.anInt10169 += 28;
										if (Static456.aClass6_Sub40_Sub2_2.method8569()) {
											Static475.method7157(Static456.aClass6_Sub40_Sub2_2, Static456.aClass6_Sub40_Sub2_2.anInt10169 - 28);
										}
										Static5.aClass268_3 = null;
										return true;
									} else if (Static322.aClass268_109 == Static5.aClass268_3) {
										if (Static554.anInt1822 != -1) {
											Static104.method1720(Static554.anInt1822, 0);
										}
										Static5.aClass268_3 = null;
										return true;
									} else {
										@Pc(2632) long local2632;
										if (Static5.aClass268_3 == Static363.aClass268_119) {
											local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
											local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
											local528 = local245;
											if (local522) {
												local528 = Static456.aClass6_Sub40_Sub2_2.method8611();
											}
											local539 = Static456.aClass6_Sub40_Sub2_2.method8603();
											local544 = (long) Static456.aClass6_Sub40_Sub2_2.method8571();
											local2632 = (long) Static456.aClass6_Sub40_Sub2_2.method8606();
											local780 = Static456.aClass6_Sub40_Sub2_2.method8604();
											@Pc(2642) long local2642 = local2632 + (local544 << 32);
											@Pc(2644) boolean local2644 = false;
											local819 = 0;
											while (true) {
												if (local819 >= 100) {
													if (local780 <= 1) {
														if (Static461.aBoolean555 && !Static279.aBoolean370 || Static441.aBoolean530) {
															local2644 = true;
														} else if (Static407.method5571(local528)) {
															local2644 = true;
														}
													}
													break;
												}
												if (local2642 == Static194.aLongArray3[local819]) {
													local2644 = true;
													break;
												}
												local819++;
											}
											if (!local2644 && Static495.anInt8598 == 0) {
												Static194.aLongArray3[Static628.anInt10315] = local2642;
												Static628.anInt10315 = (Static628.anInt10315 + 1) % 100;
												@Pc(2712) String local2712 = Static257.method4611(Static9.method187(Static456.aClass6_Sub40_Sub2_2));
												if (local780 == 2 || local780 == 3) {
													Static121.method1987(Static86.method1738(local539), 9, "<img=1>" + local528, local245, -1, local2712, "<img=1>" + local245, 0);
												} else if (local780 == 1) {
													Static121.method1987(Static86.method1738(local539), 9, "<img=0>" + local528, local245, -1, local2712, "<img=0>" + local245, 0);
												} else {
													Static121.method1987(Static86.method1738(local539), 9, local528, local245, -1, local2712, local245, 0);
												}
											}
											Static5.aClass268_3 = null;
											return true;
										} else if (Static123.aClass268_45 == Static5.aClass268_3) {
											Static149.method2364();
											Static5.aClass268_3 = null;
											return true;
										} else if (Static5.aClass268_3 == Static390.aClass268_137) {
											local264 = Static456.aClass6_Sub40_Sub2_2.method8568();
											Static526.method7819();
											@Pc(2819) Class6_Sub29 local2819 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local264);
											if (local2819 != null) {
												Static221.method3774(false, local2819, true);
											}
											if (Static523.aClass302_53 != null) {
												Static603.method8464(Static523.aClass302_53);
												Static523.aClass302_53 = null;
											}
											Static5.aClass268_3 = null;
											return true;
										} else {
											@Pc(2935) String local2935;
											if (Static485.aClass268_152 == Static5.aClass268_3) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8571();
												@Pc(2855) Class20_Sub2_Sub2_Sub1_Sub1 local2855;
												if (Static229.anInt4561 == local264) {
													local2855 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1;
												} else {
													local2855 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local264];
												}
												if (local2855 == null) {
													Static5.aClass268_3 = null;
													return true;
												}
												local274 = Static456.aClass6_Sub40_Sub2_2.method8571();
												local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
												local2434 = (local274 & 0x8000) != 0;
												if (local2855.aString12 != null && local2855.aClass12_1 != null) {
													local745 = false;
													if (local278 <= 1) {
														if (!local2434 && (Static461.aBoolean555 && !Static279.aBoolean370 || Static441.aBoolean530)) {
															local745 = true;
														} else if (Static407.method5571(local2855.aString12)) {
															local745 = true;
														}
													}
													if (!local745 && Static495.anInt8598 == 0) {
														local548 = -1;
														if (local2434) {
															local274 &= 0x7FFF;
															@Pc(2947) Class358 local2947 = Static20.method336(Static456.aClass6_Sub40_Sub2_2);
															local548 = local2947.anInt10061;
															local2935 = local2947.aClass6_Sub2_Sub14_1.method5399(Static456.aClass6_Sub40_Sub2_2);
														} else {
															local2935 = Static257.method4611(Static9.method187(Static456.aClass6_Sub40_Sub2_2));
														}
														local2855.aString61 = local2935.trim();
														local2855.anInt5510 = local274 & 0xFF;
														local2855.anInt5506 = local274 >> 8;
														local2855.anInt5552 = 150;
														if (local278 == 1 || local278 == 2) {
															local552 = local2434 ? 17 : 1;
														} else {
															local552 = local2434 ? 17 : 2;
														}
														if (local278 == 2) {
															Static121.method1987((String) null, local552, "<img=1>" + local2855.method1025(), local2855.aString13, local548, local2935, "<img=1>" + local2855.method1026(), 0);
														} else if (local278 == 1) {
															Static121.method1987((String) null, local552, "<img=0>" + local2855.method1025(), local2855.aString13, local548, local2935, "<img=0>" + local2855.method1026(), 0);
														} else {
															Static121.method1987((String) null, local552, local2855.method1025(), local2855.aString13, local548, local2935, local2855.method1026(), 0);
														}
													}
												}
												Static5.aClass268_3 = null;
												return true;
											} else if (Static249.aClass268_79 == Static5.aClass268_3) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8560();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8579();
												local274 = Static456.aClass6_Sub40_Sub2_2.method8604();
												Static451.anIntArray512[local274] = local75;
												Static242.anIntArray277[local274] = local264;
												Static287.anIntArray534[local274] = 1;
												local278 = Static137.anIntArray170[local274] - 1;
												for (local282 = 0; local282 < local278; local282++) {
													if (local75 >= Class116.anIntArray226[local282]) {
														Static287.anIntArray534[local274] = local282 + 2;
													}
												}
												Static524.anIntArray560[Static207.anInt4101++ & 0x1F] = local274;
												Static5.aClass268_3 = null;
												return true;
											} else if (Static216.aClass268_71 == Static5.aClass268_3) {
												Static29.method524(Static275.aClass244_12);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static264.aClass268_88 == Static5.aClass268_3) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8576();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8614() << 2;
												local274 = Static456.aClass6_Sub40_Sub2_2.method8576();
												local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
												local282 = Static456.aClass6_Sub40_Sub2_2.method8560();
												Static526.method7819();
												Static461.method7050(local278, local282, local274, local75, local264);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static5.aClass268_3 == Static124.aClass268_46) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8610();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8571();
												Static526.method7819();
												Static388.method6214(local264, local75);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static321.aClass268_108 == Static5.aClass268_3) {
												local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
												local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
												local528 = local245;
												if (local522) {
													local528 = Static456.aClass6_Sub40_Sub2_2.method8611();
												}
												local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
												local282 = Static456.aClass6_Sub40_Sub2_2.method8571();
												local745 = false;
												if (local278 <= 1 && Static407.method5571(local528)) {
													local745 = true;
												}
												if (!local745 && Static495.anInt8598 == 0) {
													local2935 = Static337.aClass327_2.method7979(local282).method5399(Static456.aClass6_Sub40_Sub2_2);
													if (local278 == 2) {
														Static121.method1987((String) null, 25, "<img=1>" + local528, local245, local282, local2935, "<img=1>" + local245, 0);
													} else if (local278 == 1) {
														Static121.method1987((String) null, 25, "<img=0>" + local528, local245, local282, local2935, "<img=0>" + local245, 0);
													} else {
														Static121.method1987((String) null, 25, local528, local245, local282, local2935, local245, 0);
													}
												}
												Static5.aClass268_3 = null;
												return true;
											} else if (Static5.aClass268_3 == Static585.aClass268_175) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8579();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8585();
												local274 = Static456.aClass6_Sub40_Sub2_2.method8568();
												Static526.method7819();
												Static573.method8160(local274, 5, local75, local264);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static643.aClass268_189 == Static5.aClass268_3) {
												Static482.anInt8366 = Static456.aClass6_Sub40_Sub2_2.method8604();
												Static245.anInt6442 = Static456.aClass6_Sub40_Sub2_2.method8570() << 3;
												Static619.anInt10219 = Static456.aClass6_Sub40_Sub2_2.method8570() << 3;
												for (@Pc(3422) Class6_Sub41 local3422 = (Class6_Sub41) Static333.aClass128_46.method3556(); local3422 != null; local3422 = (Class6_Sub41) Static333.aClass128_46.method3555()) {
													local75 = (int) (local3422.aLong278 >> 28 & 0x3L);
													local274 = (int) (local3422.aLong278 & 0x3FFFL);
													local278 = local274 - Static606.anInt8651;
													local282 = (int) (local3422.aLong278 >> 14 & 0x3FFFL);
													local1528 = local282 - Static195.anInt3961;
													if (Static482.anInt8366 == local75 && Static619.anInt10219 <= local278 && Static619.anInt10219 + 8 > local278 && Static245.anInt6442 <= local1528 && local1528 < Static245.anInt6442 + 8) {
														local3422.method9043();
														if (local278 >= 0 && local1528 >= 0 && local278 < Static442.anInt7975 && local1528 < Static284.anInt7916) {
															Static596.method8371(Static482.anInt8366, local278, local1528);
														}
													}
												}
												@Pc(3520) Class6_Sub6 local3520;
												for (local3520 = (Class6_Sub6) Static26.aClass8_7.method149(); local3520 != null; local3520 = (Class6_Sub6) Static26.aClass8_7.method155()) {
													if (local3520.anInt1247 >= Static619.anInt10219 && Static619.anInt10219 + 8 > local3520.anInt1247 && Static245.anInt6442 <= local3520.anInt1250 && Static245.anInt6442 + 8 > local3520.anInt1250 && local3520.anInt1248 == Static482.anInt8366) {
														local3520.aBoolean78 = true;
													}
												}
												for (local3520 = (Class6_Sub6) Static69.aClass8_9.method149(); local3520 != null; local3520 = (Class6_Sub6) Static69.aClass8_9.method155()) {
													if (local3520.anInt1247 >= Static619.anInt10219 && Static619.anInt10219 + 8 > local3520.anInt1247 && Static245.anInt6442 <= local3520.anInt1250 && local3520.anInt1250 < Static245.anInt6442 + 8 && local3520.anInt1248 == Static482.anInt8366) {
														local3520.aBoolean78 = true;
													}
												}
												Static5.aClass268_3 = null;
												return true;
											} else if (Static5.aClass268_3 == Static646.aClass268_126) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8608();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8579();
												Static526.method7819();
												Static229.method3933(local264, local75);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static5.aClass268_3 == Static381.aClass268_124) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8585();
												Static526.method7819();
												Static366.method5801(local264);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static5.aClass268_3 == Static132.aClass268_48) {
												Static29.method524(Static105.aClass244_4);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static5.aClass268_3 == Static644.aClass268_190) {
												local1477 = Static456.aClass6_Sub40_Sub2_2.method8570();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8585();
												Static526.method7819();
												Static332.method7837(local75, local1477);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static5.aClass268_3 == Static33.aClass268_15) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8571();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8571();
												local274 = Static456.aClass6_Sub40_Sub2_2.method8571();
												Static526.method7819();
												if (Static605.aClass302ArrayArray4[local264] != null) {
													for (local278 = local75; local278 < local274; local278++) {
														local282 = Static456.aClass6_Sub40_Sub2_2.method8606();
														if (local278 < Static605.aClass302ArrayArray4[local264].length && Static605.aClass302ArrayArray4[local264][local278] != null) {
															Static605.aClass302ArrayArray4[local264][local278].anInt8797 = local282;
														}
													}
												}
												Static5.aClass268_3 = null;
												return true;
											} else if (Static558.aClass268_169 == Static5.aClass268_3) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8579();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8560();
												Static526.method7819();
												Static391.method6237(local75, local264);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static411.aClass268_112 == Static5.aClass268_3) {
												Static29.method524(Static237.aClass244_8);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static57.aClass268_23 == Static5.aClass268_3) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8552();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8581();
												Static526.method7819();
												Static332.method7837(local264, local75);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static500.aClass268_156 == Static5.aClass268_3) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8610();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8585();
												if (local75 == 65535) {
													local75 = -1;
												}
												Static526.method7819();
												Static573.method8160(local264, 1, local75, -1);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static186.aClass268_63 == Static5.aClass268_3) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8604();
												@Pc(3858) boolean local3858 = (local264 & 0x1) == 1;
												local528 = Static456.aClass6_Sub40_Sub2_2.method8611();
												local1926 = Static456.aClass6_Sub40_Sub2_2.method8611();
												if (local1926.equals("")) {
													local1926 = local528;
												}
												local1928 = Static456.aClass6_Sub40_Sub2_2.method8611();
												local1955 = Static456.aClass6_Sub40_Sub2_2.method8611();
												if (local1955.equals("")) {
													local1955 = local1928;
												}
												if (local3858) {
													for (local749 = 0; local749 < Static463.anInt8194; local749++) {
														if (Static234.aStringArray36[local749].equals(local1955)) {
															Static530.aStringArray60[local749] = local528;
															Static234.aStringArray36[local749] = local1926;
															Static622.aStringArray74[local749] = local1928;
															Static321.aStringArray47[local749] = local1955;
															break;
														}
													}
												} else {
													Static530.aStringArray60[Static463.anInt8194] = local528;
													Static234.aStringArray36[Static463.anInt8194] = local1926;
													Static622.aStringArray74[Static463.anInt8194] = local1928;
													Static321.aStringArray47[Static463.anInt8194] = local1955;
													Static124.aBooleanArray16[Static463.anInt8194] = (local264 & 0x2) == 2;
													Static463.anInt8194++;
												}
												Static5.aClass268_3 = null;
												Static533.anInt9234 = Static320.anInt6118;
												return true;
											} else if (Static412.aClass268_82 == Static5.aClass268_3) {
												Static29.method524(Static108.aClass244_5);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static592.aClass268_176 == Static5.aClass268_3) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8571();
												if (local264 == 65535) {
													local264 = -1;
												}
												local75 = Static456.aClass6_Sub40_Sub2_2.method8604();
												local274 = Static456.aClass6_Sub40_Sub2_2.method8571();
												local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
												Static4.method7049(256, true, local274, local264, local278, local75);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static606.aClass268_158 == Static5.aClass268_3) {
												Static126.method2048(false);
												Static5.aClass268_3 = null;
												return false;
											} else if (Static5.aClass268_3 == Static287.aClass268_159) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8573();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8604();
												local274 = Static456.aClass6_Sub40_Sub2_2.method8552();
												if (local274 == 65535) {
													local274 = -1;
												}
												Static333.method8039(local75, local274, local264);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static5.aClass268_3 == Static463.aClass268_150) {
												local264 = Static456.aClass6_Sub40_Sub2_2.method8552();
												if (local264 == 65535) {
													local264 = -1;
												}
												local75 = Static456.aClass6_Sub40_Sub2_2.method8604();
												local274 = Static456.aClass6_Sub40_Sub2_2.method8606();
												Static146.method4832(local274, local75, local264);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static600.aClass268_177 == Static5.aClass268_3) {
												Static286.method4986(Static501.anInt8676, Static456.aClass6_Sub40_Sub2_2, Static529.aClass112_6);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static603.aClass268_178 == Static5.aClass268_3) {
												local237 = Static456.aClass6_Sub40_Sub2_2.method8611();
												local75 = Static456.aClass6_Sub40_Sub2_2.method8585();
												Static526.method7819();
												Static611.method8512(local75, local237);
												Static5.aClass268_3 = null;
												return true;
											} else if (Static642.aClass268_188 == Static5.aClass268_3) {
												Static223.anInt4363 = Static456.aClass6_Sub40_Sub2_2.method8604();
												Static30.anInt4467 = Static320.anInt6118;
												Static5.aClass268_3 = null;
												return true;
											} else {
												@Pc(4165) Class6_Sub29 local4165;
												if (Static5.aClass268_3 == Static561.aClass268_171) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8604();
													local75 = Static456.aClass6_Sub40_Sub2_2.method8581();
													local274 = Static456.aClass6_Sub40_Sub2_2.method8552();
													Static526.method7819();
													local4165 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local75);
													if (local4165 != null) {
														Static221.method3774(false, local4165, local274 != local4165.anInt6361);
													}
													Static134.method2183(local264, false, local75, local274);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static5.aClass268_3 == Static152.aClass268_85) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8579();
													local75 = Static456.aClass6_Sub40_Sub2_2.method8552();
													local274 = Static456.aClass6_Sub40_Sub2_2.method8552();
													if (local274 == 65535) {
														local274 = -1;
													}
													local278 = Static456.aClass6_Sub40_Sub2_2.method8552();
													Static526.method7819();
													if (local278 == 65535) {
														local278 = -1;
													}
													for (local282 = local278; local282 <= local274; local282++) {
														local544 = (long) local282 + ((long) local264 << 32);
														local2269 = (Class6_Sub47) Static284.aClass128_35.method3560(local544);
														if (local2269 != null) {
															local2285 = new Class6_Sub47(local2269.anInt9595, local75);
															local2269.method9043();
														} else if (local282 == -1) {
															local2285 = new Class6_Sub47(Static386.method4914(local264).aClass6_Sub47_2.anInt9595, local75);
														} else {
															local2285 = new Class6_Sub47(0, local75);
														}
														Static284.aClass128_35.method3551(local544, local2285);
													}
													Static5.aClass268_3 = null;
													return true;
												} else if (Static58.aClass268_25 == Static5.aClass268_3) {
													Static526.method7819();
													Static272.method5664();
													Static5.aClass268_3 = null;
													return true;
												} else if (Static5.aClass268_3 == Static632.aClass268_185) {
													if (Static578.method5704(Static554.anInt1821)) {
														Static328.anInt6241 = (int) ((float) Static456.aClass6_Sub40_Sub2_2.method8571() * 2.5F);
													} else {
														Static328.anInt6241 = Static456.aClass6_Sub40_Sub2_2.method8571() * 30;
													}
													Static30.anInt4467 = Static320.anInt6118;
													Static5.aClass268_3 = null;
													return true;
												} else if (Static5.aClass268_3 == Static559.aClass268_170) {
													Static613.anInt10091 = Static456.aClass6_Sub40_Sub2_2.method8577();
													Static461.aBoolean555 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
													Static5.aClass268_3 = null;
													return true;
												} else if (Static105.aClass268_35 == Static5.aClass268_3) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8573();
													local75 = Static456.aClass6_Sub40_Sub2_2.method8571();
													Static526.method7819();
													Static559.method8058(local264, true, local75);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static5.aClass268_3 == Static604.aClass268_179) {
													Static29.method524(Static245.aClass244_14);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static122.aClass268_42 == Static5.aClass268_3) {
													@Pc(4397) int[] local4397 = new int[4];
													for (local75 = 0; local75 < 4; local75++) {
														local4397[local75] = Static456.aClass6_Sub40_Sub2_2.method8552();
													}
													local274 = Static456.aClass6_Sub40_Sub2_2.method8571();
													local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
													@Pc(4428) Class6_Sub46 local4428 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local274);
													if (local4428 != null) {
														Static268.method4784(local4428.aClass20_Sub2_Sub2_Sub1_Sub2_1, local4397, local278);
													}
													Static5.aClass268_3 = null;
													return true;
												} else if (Static5.aClass268_3 == Static501.aClass268_160) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8610();
													Static526.method7819();
													Static5.aClass268_3 = null;
													if (local264 == -1) {
														Static160.anInt3352 = -1;
														Static624.anInt10280 = -1;
													} else {
														local75 = local264 >> 14 & 0x3FFF;
														local274 = local264 & 0x3FFF;
														local75 -= Static606.anInt8651;
														if (local75 < 0) {
															local75 = 0;
														} else if (local75 >= Static442.anInt7975) {
															local75 = Static442.anInt7975;
														}
														local274 -= Static195.anInt3961;
														Static160.anInt3352 = (local75 << 9) + 256;
														if (local274 < 0) {
															local274 = 0;
														} else if (Static284.anInt7916 <= local274) {
															local274 = Static284.anInt7916;
														}
														Static624.anInt10280 = (local274 << 9) + 256;
													}
													return true;
												} else if (Static51.aClass268_21 == Static5.aClass268_3) {
													Static29.method524(Static420.aClass244_17);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static134.aClass268_50 == Static5.aClass268_3) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8571();
													if (local264 == 65535) {
														local264 = -1;
													}
													local75 = Static456.aClass6_Sub40_Sub2_2.method8604();
													local274 = Static456.aClass6_Sub40_Sub2_2.method8571();
													local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
													local282 = Static456.aClass6_Sub40_Sub2_2.method8571();
													Static513.method7613(local282, local278, local264, local75, local274);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static270.aClass268_90 == Static5.aClass268_3) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8610();
													local75 = Static456.aClass6_Sub40_Sub2_2.method8581();
													Static526.method7819();
													@Pc(4599) Class6_Sub29 local4599 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local75);
													local4165 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local264);
													if (local4165 != null) {
														Static221.method3774(false, local4165, local4599 == null || local4599.anInt6361 != local4165.anInt6361);
													}
													if (local4599 != null) {
														local4599.method9043();
														Static507.aClass128_42.method3551((long) local264, local4599);
													}
													@Pc(4641) Class302 local4641 = Static386.method4914(local75);
													if (local4641 != null) {
														Static603.method8464(local4641);
													}
													local4641 = Static386.method4914(local264);
													if (local4641 != null) {
														Static603.method8464(local4641);
														Static409.method6504(local4641, true);
													}
													if (Static554.anInt1822 != -1) {
														Static104.method1720(Static554.anInt1822, 1);
													}
													Static5.aClass268_3 = null;
													return true;
												} else if (Static500.aClass268_155 == Static5.aClass268_3) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8604();
													if (Static456.aClass6_Sub40_Sub2_2.method8604() == 0) {
														Static114.aClass255Array1[local264] = new Class255();
													} else {
														Static456.aClass6_Sub40_Sub2_2.anInt10169--;
														Static114.aClass255Array1[local264] = new Class255(Static456.aClass6_Sub40_Sub2_2);
													}
													Static431.anInt7824 = Static320.anInt6118;
													Static5.aClass268_3 = null;
													return true;
												} else if (Static276.aClass268_94 == Static5.aClass268_3) {
													Static29.method524(Static245.aClass244_13);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static228.aClass268_75 == Static5.aClass268_3) {
													for (local264 = 0; local264 < Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1.length; local264++) {
														if (Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local264] != null) {
															Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local264].anIntArray327 = null;
															Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local264].anInt5549 = -1;
														}
													}
													for (local75 = 0; local75 < Static273.anInt5420; local75++) {
														Static1.aClass6_Sub46Array5[local75].aClass20_Sub2_Sub2_Sub1_Sub2_1.anIntArray327 = null;
														Static1.aClass6_Sub46Array5[local75].aClass20_Sub2_Sub2_Sub1_Sub2_1.anInt5549 = -1;
													}
													Static5.aClass268_3 = null;
													return true;
												} else if (Static35.aClass268_16 == Static5.aClass268_3) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8568();
													local75 = Static456.aClass6_Sub40_Sub2_2.method8552();
													local274 = Static456.aClass6_Sub40_Sub2_2.method8614();
													local278 = Static456.aClass6_Sub40_Sub2_2.method8552();
													Static526.method7819();
													Static210.method3605(local278, local274, local75, local264);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static198.aClass268_65 == Static5.aClass268_3) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8614();
													@Pc(4822) byte local4822 = Static456.aClass6_Sub40_Sub2_2.method8583();
													Static279.aClass294_1.method7419(local4822, local264);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static534.aClass268_163 == Static5.aClass268_3) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8573();
													local75 = Static456.aClass6_Sub40_Sub2_2.method8576();
													if (local75 == 255) {
														local264 = -1;
														local75 = -1;
													}
													Static454.method7000(local264, local75);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static121.aClass268_41 == Static5.aClass268_3) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8568();
													local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
													Static526.method7819();
													Static124.method2045(local245, local264);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static5.aClass268_3 == Static4.aClass268_149) {
													local264 = Static456.aClass6_Sub40_Sub2_2.method8585();
													local75 = Static456.aClass6_Sub40_Sub2_2.method8610();
													Static279.aClass294_1.method7417(local264, local75);
													Static5.aClass268_3 = null;
													return true;
												} else if (Static15.aClass268_103 == Static5.aClass268_3) {
													local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
													local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
													local528 = local245;
													if (local522) {
														local528 = Static456.aClass6_Sub40_Sub2_2.method8611();
													}
													local539 = (long) Static456.aClass6_Sub40_Sub2_2.method8571();
													local544 = (long) Static456.aClass6_Sub40_Sub2_2.method8606();
													local548 = Static456.aClass6_Sub40_Sub2_2.method8604();
													@Pc(4952) long local4952 = (local539 << 32) + local544;
													local898 = false;
													local811 = 0;
													while (true) {
														if (local811 >= 100) {
															if (local548 <= 1) {
																if (Static461.aBoolean555 && !Static279.aBoolean370 || Static441.aBoolean530) {
																	local898 = true;
																} else if (Static407.method5571(local528)) {
																	local898 = true;
																}
															}
															break;
														}
														if (Static194.aLongArray3[local811] == local4952) {
															local898 = true;
															break;
														}
														local811++;
													}
													if (!local898 && Static495.anInt8598 == 0) {
														Static194.aLongArray3[Static628.anInt10315] = local4952;
														Static628.anInt10315 = (Static628.anInt10315 + 1) % 100;
														@Pc(5013) String local5013 = Static257.method4611(Static9.method187(Static456.aClass6_Sub40_Sub2_2));
														if (local548 == 2) {
															Static121.method1987((String) null, 7, "<img=1>" + local528, local245, -1, local5013, "<img=1>" + local245, 0);
														} else if (local548 == 1) {
															Static121.method1987((String) null, 7, "<img=0>" + local528, local245, -1, local5013, "<img=0>" + local245, 0);
														} else {
															Static121.method1987((String) null, 3, local528, local245, -1, local5013, local245, 0);
														}
													}
													Static5.aClass268_3 = null;
													return true;
												} else if (Static5.aClass268_3 == Static83.aClass268_28) {
													Static526.method7819();
													Static427.method6695();
													Static5.aClass268_3 = null;
													return true;
												} else {
													@Pc(5115) boolean local5115;
													if (Static5.aClass268_3 == Static646.aClass268_125) {
														local237 = Static456.aClass6_Sub40_Sub2_2.method8611();
														local5115 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
														if (local5115) {
															local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
														} else {
															local245 = local237;
														}
														local278 = Static456.aClass6_Sub40_Sub2_2.method8571();
														@Pc(5133) byte local5133 = Static456.aClass6_Sub40_Sub2_2.method8602();
														local745 = false;
														if (local5133 == -128) {
															local745 = true;
														}
														if (local745) {
															if (Static301.anInt5871 == 0) {
																Static5.aClass268_3 = null;
																return true;
															}
															for (local749 = 0; local749 < Static301.anInt5871 && (!Static635.aClass17Array3[local749].aString4.equals(local245) || Static635.aClass17Array3[local749].anInt327 != local278); local749++) {
															}
															if (Static301.anInt5871 > local749) {
																while (Static301.anInt5871 - 1 > local749) {
																	Static635.aClass17Array3[local749] = Static635.aClass17Array3[local749 + 1];
																	local749++;
																}
																Static301.anInt5871--;
																Static635.aClass17Array3[Static301.anInt5871] = null;
															}
														} else {
															local2935 = Static456.aClass6_Sub40_Sub2_2.method8611();
															local1839 = new Class17();
															local1839.aString5 = local237;
															local1839.aString4 = local245;
															local1839.aString6 = Static344.method5576(local1839.aString4);
															local1839.aByte1 = local5133;
															local1839.anInt327 = local278;
															local1839.aString3 = local2935;
															for (local552 = Static301.anInt5871 - 1; local552 >= 0; local552--) {
																local780 = Static635.aClass17Array3[local552].aString6.compareTo(local1839.aString6);
																if (local780 == 0) {
																	Static635.aClass17Array3[local552].anInt327 = local278;
																	Static635.aClass17Array3[local552].aByte1 = local5133;
																	Static635.aClass17Array3[local552].aString3 = local2935;
																	if (local245.equals(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12)) {
																		Static642.aByte128 = local5133;
																	}
																	Static5.aClass268_3 = null;
																	Static328.anInt6239 = Static320.anInt6118;
																	return true;
																}
																if (local780 < 0) {
																	break;
																}
															}
															if (Static635.aClass17Array3.length <= Static301.anInt5871) {
																Static5.aClass268_3 = null;
																return true;
															}
															for (local780 = Static301.anInt5871 - 1; local780 > local552; local780--) {
																Static635.aClass17Array3[local780 + 1] = Static635.aClass17Array3[local780];
															}
															if (Static301.anInt5871 == 0) {
																Static635.aClass17Array3 = new Class17[100];
															}
															Static635.aClass17Array3[local552 + 1] = local1839;
															Static301.anInt5871++;
															if (local245.equals(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12)) {
																Static642.aByte128 = local5133;
															}
														}
														Static5.aClass268_3 = null;
														Static328.anInt6239 = Static320.anInt6118;
														return true;
													} else if (Static5.aClass268_3 == Static556.aClass268_168) {
														Static29.method524(Static437.aClass244_18);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static132.aClass268_49) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8573();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8585();
														Static526.method7819();
														if (local264 == 2) {
															Static608.method8497();
														}
														Static554.anInt1822 = local75;
														Static191.method3395(local75);
														Static71.method1267(false);
														Static244.method4205(Static554.anInt1822);
														for (local274 = 0; local274 < 100; local274++) {
															Static501.aBooleanArray46[local274] = true;
														}
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static385.aClass268_129) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8579();
														Static528.aClass328_7 = Static529.aClass112_6.method3229(local264);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static142.aClass268_52 == Static5.aClass268_3) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8610();
														Static526.method7819();
														Static573.method8160(local264, 5, Static229.anInt4561, 0);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static573.aClass268_173 == Static5.aClass268_3) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8573();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8571() << 2;
														local274 = Static456.aClass6_Sub40_Sub2_2.method8560();
														local278 = Static456.aClass6_Sub40_Sub2_2.method8573();
														local282 = Static456.aClass6_Sub40_Sub2_2.method8560();
														Static526.method7819();
														Static632.method8764(local274, local278, local75, local264, true, local282);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static307.aClass268_105) {
														@Pc(5590) boolean local5590;
														while (Static501.anInt8676 > Static456.aClass6_Sub40_Sub2_2.anInt10169) {
															local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
															local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
															local528 = Static456.aClass6_Sub40_Sub2_2.method8611();
															local278 = Static456.aClass6_Sub40_Sub2_2.method8571();
															local282 = Static456.aClass6_Sub40_Sub2_2.method8604();
															local1955 = "";
															local1818 = false;
															if (local278 > 0) {
																local1955 = Static456.aClass6_Sub40_Sub2_2.method8611();
																local1818 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
															}
															for (local548 = 0; local548 < Static60.anInt1289; local548++) {
																if (local522) {
																	if (local528.equals(Static123.aStringArray27[local548])) {
																		Static123.aStringArray27[local548] = local245;
																		Static447.aStringArray56[local548] = local528;
																		local245 = null;
																		break;
																	}
																} else if (local245.equals(Static123.aStringArray27[local548])) {
																	if (local278 != Static253.anIntArray289[local548]) {
																		local5590 = true;
																		for (@Pc(5595) Class20_Sub6_Sub2 local5595 = (Class20_Sub6_Sub2) Static131.aClass81_3.method2118(); local5595 != null; local5595 = (Class20_Sub6_Sub2) Static131.aClass81_3.method2128()) {
																			if (local5595.aString79.equals(local245)) {
																				if (local278 != 0 && local5595.aShort69 == 0) {
																					local5595.method9004();
																					local5590 = false;
																				} else if (local278 == 0 && local5595.aShort69 != 0) {
																					local5590 = false;
																					local5595.method9004();
																				}
																			}
																		}
																		if (local5590) {
																			Static131.aClass81_3.method2119(new Class20_Sub6_Sub2(local245, local278));
																		}
																		Static253.anIntArray289[local548] = local278;
																	}
																	Static447.aStringArray56[local548] = local528;
																	Static333.aStringArray67[local548] = local1955;
																	Static208.anIntArray243[local548] = local282;
																	Static592.aBooleanArray54[local548] = local1818;
																	local245 = null;
																	break;
																}
															}
															if (local245 != null && Static60.anInt1289 < 200) {
																Static123.aStringArray27[Static60.anInt1289] = local245;
																Static447.aStringArray56[Static60.anInt1289] = local528;
																Static253.anIntArray289[Static60.anInt1289] = local278;
																Static333.aStringArray67[Static60.anInt1289] = local1955;
																Static208.anIntArray243[Static60.anInt1289] = local282;
																Static592.aBooleanArray54[Static60.anInt1289] = local1818;
																Static60.anInt1289++;
															}
														}
														Static579.anInt9657 = 2;
														Static533.anInt9234 = Static320.anInt6118;
														local75 = Static60.anInt1289;
														while (local75 > 0) {
															local522 = true;
															local75--;
															for (local274 = 0; local274 < local75; local274++) {
																if (Static315.aClass56_4.anInt1712 != Static253.anIntArray289[local274] && Static315.aClass56_4.anInt1712 == Static253.anIntArray289[local274 + 1] || Static253.anIntArray289[local274] == 0 && Static253.anIntArray289[local274 + 1] != 0) {
																	local278 = Static253.anIntArray289[local274];
																	Static253.anIntArray289[local274] = Static253.anIntArray289[local274 + 1];
																	Static253.anIntArray289[local274 + 1] = local278;
																	local1928 = Static333.aStringArray67[local274];
																	Static333.aStringArray67[local274] = Static333.aStringArray67[local274 + 1];
																	Static333.aStringArray67[local274 + 1] = local1928;
																	local1955 = Static123.aStringArray27[local274];
																	Static123.aStringArray27[local274] = Static123.aStringArray27[local274 + 1];
																	Static123.aStringArray27[local274 + 1] = local1955;
																	local2935 = Static447.aStringArray56[local274];
																	Static447.aStringArray56[local274] = Static447.aStringArray56[local274 + 1];
																	Static447.aStringArray56[local274 + 1] = local2935;
																	local548 = Static208.anIntArray243[local274];
																	Static208.anIntArray243[local274] = Static208.anIntArray243[local274 + 1];
																	Static208.anIntArray243[local274 + 1] = local548;
																	local5590 = Static592.aBooleanArray54[local274];
																	Static592.aBooleanArray54[local274] = Static592.aBooleanArray54[local274 + 1];
																	Static592.aBooleanArray54[local274 + 1] = local5590;
																	local522 = false;
																}
															}
															if (local522) {
																break;
															}
														}
														Static5.aClass268_3 = null;
														return true;
													} else if (Static281.aClass268_95 == Static5.aClass268_3) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8571();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8604();
														local5115 = (local75 & 0x1) == 1;
														while (Static501.anInt8676 > Static456.aClass6_Sub40_Sub2_2.anInt10169) {
															local278 = Static456.aClass6_Sub40_Sub2_2.method8587();
															local282 = Static456.aClass6_Sub40_Sub2_2.method8571();
															local1528 = 0;
															if (local282 != 0) {
																local1528 = Static456.aClass6_Sub40_Sub2_2.method8604();
																if (local1528 == 255) {
																	local1528 = Static456.aClass6_Sub40_Sub2_2.method8579();
																}
															}
															Static331.method5477(local278, local1528, local5115, local264, local282 - 1);
														}
														Static637.anIntArray643[Static145.anInt2727++ & 0x1F] = local264;
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static364.aClass268_120) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8610();
														Static526.method7819();
														Static573.method8160(local264, 3, -1, -1);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static387.aClass268_130) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8614();
														local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
														Static526.method7819();
														Static611.method8512(local264, local245);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static252.aClass268_83) {
														Static279.aClass294_1.method7418();
														Static5.aClass268_3 = null;
														Static267.anInt5319 += 32;
														return true;
													} else if (Static32.aClass268_14 == Static5.aClass268_3) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8568();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8614();
														local274 = Static456.aClass6_Sub40_Sub2_2.method8571();
														Static526.method7819();
														Static132.method2136(local75 + (local274 << 16), local264);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static258.aClass268_86 == Static5.aClass268_3) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8571();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8604();
														local5115 = (local75 & 0x1) == 1;
														Static551.method7996(local5115, local264);
														local278 = Static456.aClass6_Sub40_Sub2_2.method8571();
														for (local282 = 0; local282 < local278; local282++) {
															local1528 = Static456.aClass6_Sub40_Sub2_2.method8614();
															local749 = Static456.aClass6_Sub40_Sub2_2.method8560();
															if (local749 == 255) {
																local749 = Static456.aClass6_Sub40_Sub2_2.method8579();
															}
															Static331.method5477(local282, local749, local5115, local264, local1528 - 1);
														}
														Static637.anIntArray643[Static145.anInt2727++ & 0x1F] = local264;
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static29.aClass268_10) {
														local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
														@Pc(6174) byte[] local6174 = new byte[Static501.anInt8676 - 1];
														Static456.aClass6_Sub40_Sub2_2.method8595(local6174, Static501.anInt8676 - 1, 0);
														Static475.method7155(local6174, local522);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static199.aClass268_66 == Static5.aClass268_3) {
														Static412.aString55 = Static501.anInt8676 > 2 ? Static456.aClass6_Sub40_Sub2_2.method8611() : Static317.aClass192_26.method5299(Static307.anInt5931);
														Static36.anInt716 = Static501.anInt8676 > 0 ? Static456.aClass6_Sub40_Sub2_2.method8571() : -1;
														Static5.aClass268_3 = null;
														if (Static36.anInt716 == 65535) {
															Static36.anInt716 = -1;
														}
														return true;
													} else if (Static5.aClass268_3 == Static351.aClass268_115) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8579();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8581();
														local274 = Static456.aClass6_Sub40_Sub2_2.method8552();
														Static526.method7819();
														if (local274 == 65535) {
															local274 = -1;
														}
														Static328.method5431(local264, local75, local274);
														@Pc(6262) Class347 local6262 = Static266.aClass138_1.method3730(local274);
														Static210.method3605(local6262.anInt9758, local6262.anInt9729, local6262.anInt9768, local75);
														Static430.method6728(local75, local6262.anInt9737, local6262.anInt9731, local6262.anInt9739);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static19.aClass268_9) {
														Static29.method524(Static647.aClass244_21);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static174.aClass268_61 == Static5.aClass268_3) {
														local237 = Static456.aClass6_Sub40_Sub2_2.method8611();
														@Pc(6307) Object[] local6307 = new Object[local237.length() + 1];
														for (local274 = local237.length() - 1; local274 >= 0; local274--) {
															if (local237.charAt(local274) == 's') {
																local6307[local274 + 1] = Static456.aClass6_Sub40_Sub2_2.method8611();
															} else {
																local6307[local274 + 1] = Integer.valueOf(Static456.aClass6_Sub40_Sub2_2.method8579());
															}
														}
														local6307[0] = Integer.valueOf(Static456.aClass6_Sub40_Sub2_2.method8579());
														Static526.method7819();
														@Pc(6366) Class6_Sub10 local6366 = new Class6_Sub10();
														local6366.anObjectArray1 = local6307;
														Static244.method4193(local6366);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static30.aClass268_74) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8608();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8568();
														local274 = Static456.aClass6_Sub40_Sub2_2.method8553();
														Static526.method7819();
														Static254.method4559(local264, local274, local75);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static351.aClass268_114) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8610();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8614();
														local274 = Static456.aClass6_Sub40_Sub2_2.method8552();
														local278 = Static456.aClass6_Sub40_Sub2_2.method8571();
														Static526.method7819();
														Static573.method8160(local264, 7, local75 | local278 << 16, local274);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static9.aClass268_6) {
														local522 = Static456.aClass6_Sub40_Sub2_2.method8576() == 1;
														Static526.method7819();
														Static135.aBoolean184 = local522;
														Static5.aClass268_3 = null;
														return true;
													} else if (Static546.aClass268_165 == Static5.aClass268_3) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8571();
														if (local264 == 65535) {
															local264 = -1;
														}
														local75 = Static456.aClass6_Sub40_Sub2_2.method8604();
														local274 = Static456.aClass6_Sub40_Sub2_2.method8571();
														local278 = Static456.aClass6_Sub40_Sub2_2.method8604();
														local282 = Static456.aClass6_Sub40_Sub2_2.method8571();
														Static4.method7049(local282, false, local274, local264, local278, local75);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static639.aClass268_187) {
														if (Static476.aFrame6 != null) {
															Static381.method5938(false, -1, Static348.aClass6_Sub22_19.aClass15_Sub17_1.method5501(), -1);
														}
														@Pc(6520) byte[] local6520 = new byte[Static501.anInt8676];
														Static456.aClass6_Sub40_Sub2_2.method8621(local6520, Static501.anInt8676);
														local245 = Static510.method7547(Static501.anInt8676, 0, local6520);
														Static205.method3578(Static529.aClass112_6, true, Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 1, local245);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static567.aClass268_172 == Static5.aClass268_3) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8614();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8571();
														Static526.method7819();
														Static117.method1944(local75, local264);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static457.aClass268_146 == Static5.aClass268_3) {
														Static29.method524(Static39.aClass244_3);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static582.aClass268_174 == Static5.aClass268_3) {
														Static507.method7515();
														Static5.aClass268_3 = null;
														return false;
													} else if (Static606.aClass268_157 == Static5.aClass268_3) {
														Static587.anInt9803 = Static456.aClass6_Sub40_Sub2_2.method8615();
														Static5.aClass268_3 = null;
														Static30.anInt4467 = Static320.anInt6118;
														return true;
													} else if (Static249.aClass268_80 == Static5.aClass268_3) {
														Static29.method524(Static21.aClass244_2);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static614.aClass268_181) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8614();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8573();
														local5115 = (local75 & 0x1) == 1;
														Static219.method3738(local5115, local264);
														Static637.anIntArray643[Static145.anInt2727++ & 0x1F] = local264;
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static59.aClass268_26) {
														Static5.aClass268_3 = null;
														return false;
													} else if (Static5.aClass268_3 == Static408.aClass268_135) {
														local264 = Static456.aClass6_Sub40_Sub2_2.method8579();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8571();
														if (local75 == 65535) {
															local75 = -1;
														}
														Static526.method7819();
														Static17.method309(local264, local75);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static5.aClass268_3 == Static153.aClass268_55) {
														local237 = Static456.aClass6_Sub40_Sub2_2.method8611();
														local75 = Static456.aClass6_Sub40_Sub2_2.method8571();
														local528 = Static337.aClass327_2.method7979(local75).method5399(Static456.aClass6_Sub40_Sub2_2);
														Static121.method1987((String) null, 19, local237, local237, local75, local528, local237, 0);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static142.aClass268_51 == Static5.aClass268_3) {
														Static26.method466(Static501.anInt8676, Static456.aClass6_Sub40_Sub2_2);
														Static5.aClass268_3 = null;
														return true;
													} else if (Static627.aClass268_184 == Static5.aClass268_3) {
														local522 = Static456.aClass6_Sub40_Sub2_2.method8604() == 1;
														local245 = Static456.aClass6_Sub40_Sub2_2.method8611();
														local528 = local245;
														if (local522) {
															local528 = Static456.aClass6_Sub40_Sub2_2.method8611();
														}
														local539 = Static456.aClass6_Sub40_Sub2_2.method8603();
														local544 = (long) Static456.aClass6_Sub40_Sub2_2.method8571();
														local2632 = (long) Static456.aClass6_Sub40_Sub2_2.method8606();
														local780 = Static456.aClass6_Sub40_Sub2_2.method8604();
														local787 = Static456.aClass6_Sub40_Sub2_2.method8571();
														@Pc(6797) long local6797 = local2632 + (local544 << 32);
														@Pc(6799) boolean local6799 = false;
														local984 = 0;
														while (true) {
															if (local984 >= 100) {
																if (local780 <= 1 && Static407.method5571(local528)) {
																	local6799 = true;
																}
																break;
															}
															if (local6797 == Static194.aLongArray3[local984]) {
																local6799 = true;
																break;
															}
															local984++;
														}
														if (!local6799 && Static495.anInt8598 == 0) {
															Static194.aLongArray3[Static628.anInt10315] = local6797;
															Static628.anInt10315 = (Static628.anInt10315 + 1) % 100;
															@Pc(6854) String local6854 = Static337.aClass327_2.method7979(local787).method5399(Static456.aClass6_Sub40_Sub2_2);
															if (local780 == 2) {
																Static121.method1987(Static86.method1738(local539), 20, "<img=1>" + local528, local245, local787, local6854, "<img=1>" + local245, 0);
															} else if (local780 == 1) {
																Static121.method1987(Static86.method1738(local539), 20, "<img=0>" + local528, local245, local787, local6854, "<img=0>" + local245, 0);
															} else {
																Static121.method1987(Static86.method1738(local539), 20, local528, local245, local787, local6854, local245, 0);
															}
														}
														Static5.aClass268_3 = null;
														return true;
													} else if (Static190.aClass268_64 == Static5.aClass268_3) {
														Static245.anInt6442 = Static456.aClass6_Sub40_Sub2_2.method8602() << 3;
														Static482.anInt8366 = Static456.aClass6_Sub40_Sub2_2.method8576();
														Static619.anInt10219 = Static456.aClass6_Sub40_Sub2_2.method8602() << 3;
														while (Static501.anInt8676 > Static456.aClass6_Sub40_Sub2_2.anInt10169) {
															@Pc(6960) Class244 local6960 = Static198.method3516()[Static456.aClass6_Sub40_Sub2_2.method8604()];
															Static29.method524(local6960);
														}
														Static5.aClass268_3 = null;
														return true;
													} else if (Static368.aClass268_121 == Static5.aClass268_3) {
														Static29.method524(Static477.aClass244_20);
														Static5.aClass268_3 = null;
														return true;
													} else {
														Static619.method8645((Throwable) null, "T1 - " + (Static5.aClass268_3 == null ? -1 : Static5.aClass268_3.method7011()) + "," + (Static112.aClass268_38 == null ? -1 : Static112.aClass268_38.method7011()) + "," + (Static441.aClass268_143 == null ? -1 : Static441.aClass268_143.method7011()) + " - " + Static501.anInt8676);
														Static126.method2048(false);
														return true;
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

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!cq;)V")
	public static void method4681(@OriginalArg(1) Class6_Sub9 arg0) {
		Static324.aClass8_31.method157(arg0);
		arg0.anInt1708 = arg0.aClass6_Sub40_Sub2_1.anInt10169;
		Static299.anInt5830 += arg0.anInt1708;
		arg0.aClass6_Sub40_Sub2_1.anInt10169 = 0;
	}
}
