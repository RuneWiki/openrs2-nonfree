import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_4;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_13;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public static int anInt428;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_164 = Static2.method59("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!wd;")
	private static Class80 aClass80_166 = Static2.method59("System update in: ");

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_165 = aClass80_166;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	public static int anInt425 = 500;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
	public static int[] anIntArray66 = new int[2000];

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_167 = Static2.method59(" loggt sich aus)3");

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!wd;")
	private static Class80 aClass80_170 = Static2.method59("FULL");

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_168 = aClass80_170;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_169 = Static2.method59("blinken1:");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBII[Lclient!va;III)Z")
	public static boolean method248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub17[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static99.method1896(arg6, arg1, arg4, arg0);
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < arg5.length; local19++) {
			@Pc(25) Class2_Sub1_Sub17 local25 = arg5[local19];
			if (local25 != null && (local25.anInt3008 == arg8 || arg8 == -1412584499 && local25 == Static68.aClass2_Sub1_Sub17_5)) {
				if (local25.anInt3030 > 0) {
					Static50.method881(local25);
				}
				@Pc(57) int local57 = local25.anInt3012 + arg6 - arg3;
				@Pc(65) int local65 = arg1 + local25.anInt3037 - arg2;
				@Pc(68) int local68 = local25.anInt3049;
				@Pc(104) int local104;
				@Pc(106) int local106;
				@Pc(134) int[] local134;
				@Pc(248) int local248;
				@Pc(237) int local237;
				@Pc(265) int local265;
				@Pc(259) int local259;
				if (local25 == Static68.aClass2_Sub1_Sub17_5) {
					if (arg8 != -1412584499 && !local25.aBoolean228) {
						Static44.anInt1349 = arg2 - arg1;
						Static44.aClass2_Sub1_Sub17Array1 = arg5;
						Static44.anInt1342 = arg3 - arg6;
						continue;
					}
					@Pc(96) Class2_Sub1_Sub17 local96 = Static123.method1975(local25);
					if (local96 == null) {
						Static68.aClass2_Sub1_Sub17_5 = null;
					} else {
						local104 = Static93.anInt2398;
						local106 = Static95.anInt2430;
						if (Static114.anInt2939 == 0) {
							local106 -= 4;
							local104 -= 4;
						}
						if (Static114.anInt2939 == 1) {
							local104 -= 553;
							local106 -= 205;
						}
						if (Static114.anInt2939 == 2) {
							local106 -= 357;
							local104 -= 17;
						}
						local106 -= Static49.anInt1515;
						local104 -= Static80.anInt2030;
						local134 = Static74.method1178(local96);
						if (local106 < local134[1]) {
							local106 = local134[1];
						}
						if (local134[0] > local104) {
							local104 = local134[0];
						}
						if (local134[1] + local96.anInt3024 < local25.anInt3024 + local106) {
							local106 = local134[1] + local96.anInt3024 - local25.anInt3024;
						}
						@Pc(195) Class2_Sub1_Sub17 local195 = Static51.aClass2_Sub1_Sub17ArrayArray1[local25.anInt3022 >> 16][local25.anInt3008 & 0xFFFF];
						if (local134[0] + local96.anInt3020 < local25.anInt3020 + local104) {
							local104 = local134[0] + local96.anInt3020 - local25.anInt3020;
						}
						@Pc(227) int[] local227 = Static74.method1178(local195);
						local237 = local106 + local195.anInt3015 - local227[1];
						local248 = local104 + local195.anInt3055 - local227[0];
						if (!local25.aBoolean228) {
							local68 = 128;
						}
						local259 = local237 - local25.anInt3037;
						local265 = local248 - local25.anInt3012;
						if (local25.anInt3009 >= local265 && -local25.anInt3009 <= local265 && local25.anInt3009 >= local259 && -local25.anInt3009 <= local259 && !Static96.aBoolean181) {
							local265 = 0;
							local259 = 0;
						} else if (local25.anInt3072 >= Static48.anInt1506 && !Static96.aBoolean181) {
							local265 = 0;
							local259 = 0;
						}
						local65 += local259;
						local57 += local265;
					}
				}
				if ((!local25.aBoolean232 || Static99.anInt2979 >= local57 && local65 <= Static99.anInt2976 && Static99.anInt2977 <= local57 + local25.anInt3020 && local65 + local25.anInt3024 >= Static99.anInt2974) && (!local25.aBoolean232 || !Static68.method1116(local25))) {
					if (local25.anInt3038 == 0) {
						if (!local25.aBoolean232 && Static68.method1116(local25) && !Static33.method604(local19, arg7)) {
							continue;
						}
						if (!local25.aBoolean232) {
							if (local25.anInt3015 > local25.anInt3050 - local25.anInt3024) {
								local25.anInt3015 = local25.anInt3050 - local25.anInt3024;
							}
							if (local25.anInt3015 < 0) {
								local25.anInt3015 = 0;
							}
						}
						local17 &= method248(local25.anInt3024 + local65, local65, local25.anInt3015, local25.anInt3055, local25.anInt3020 + local57, arg5, local57, arg7, local25.anInt3022);
						if (local25.aClass2_Sub1_Sub17Array2 != null) {
							local17 &= method248(local25.anInt3024 + local65, local65, local25.anInt3015, local25.anInt3055, local25.anInt3020 + local57, local25.aClass2_Sub1_Sub17Array2, local57, arg7, local25.anInt3022);
						}
						Static99.method1896(arg6, arg1, arg4, arg0);
						if (local25.anInt3050 > local25.anInt3024 && !local25.aBoolean232) {
							Static25.method519(local25.anInt3024, local25.anInt3050, local25.anInt3020 + local57, local65, local25.anInt3015);
						}
					}
					if (local25.anInt3038 != 1) {
						@Pc(787) int local787;
						@Pc(496) int local496;
						@Pc(523) int local523;
						@Pc(514) int local514;
						@Pc(710) int local710;
						if (local25.anInt3038 == 2) {
							local496 = 0;
							for (local104 = 0; local104 < local25.anInt3024; local104++) {
								for (local106 = 0; local106 < local25.anInt3020; local106++) {
									local514 = local65 + (local25.anInt3045 + 32) * local104;
									local523 = local106 * (local25.anInt3065 + 32) + local57;
									if (local496 < 20) {
										local523 += local25.anIntArray400[local496];
										local514 += local25.anIntArray399[local496];
									}
									if (local25.anIntArray397[local496] > 0) {
										local237 = local25.anIntArray397[local496] - 1;
										if (Static99.anInt2977 - 32 < local523 && local523 < Static99.anInt2979 && local514 > Static99.anInt2974 - 32 && Static99.anInt2976 > local514 || Static95.anInt2434 != 0 && Static24.anInt977 == local496) {
											@Pc(637) Class2_Sub1_Sub9_Sub1 local637;
											if (Static107.anInt2862 == 1 && Static44.anInt1348 == local496 && local25.anInt3022 == Static39.anInt707) {
												local637 = Static84.method1255(false, local237, 0, 2, local25.anIntArray396[local496]);
											} else {
												local637 = Static84.method1255(false, local237, 3153952, 1, local25.anIntArray396[local496]);
											}
											if (local637 == null) {
												local17 = false;
											} else if (Static95.anInt2434 != 0 && Static24.anInt977 == local496 && local25.anInt3022 == Static31.anInt1090) {
												local710 = Static93.anInt2398 - Static51.anInt1544;
												local248 = Static95.anInt2430 - Static56.anInt1715;
												if (local710 < 5 && local710 > -5) {
													local710 = 0;
												}
												if (local248 < 5 && local248 > -5) {
													local248 = 0;
												}
												if (Static122.anInt3110 < 5) {
													local710 = 0;
													local248 = 0;
												}
												local637.method819(local710 + local523, local514 - -local248, 128);
												if (arg8 != -1) {
													@Pc(764) Class2_Sub1_Sub17 local764 = arg5[arg8 & 0xFFFF];
													if (local514 + local248 < Static99.anInt2974 && local764.anInt3015 > 0) {
														local787 = Static106.anInt2840 * (Static99.anInt2974 - local248 - local514) / 3;
														if (Static106.anInt2840 * 10 < local787) {
															local787 = Static106.anInt2840 * 10;
														}
														if (local787 > local764.anInt3015) {
															local787 = local764.anInt3015;
														}
														local764.anInt3015 -= local787;
														Static56.anInt1715 += local787;
													}
													if (local514 + local248 + 32 > Static99.anInt2976 && local764.anInt3050 - local764.anInt3024 > local764.anInt3015) {
														local787 = Static106.anInt2840 * (local514 + local248 + 32 - Static99.anInt2976) / 3;
														if (local787 > Static106.anInt2840 * 10) {
															local787 = Static106.anInt2840 * 10;
														}
														if (local764.anInt3050 - local764.anInt3024 - local764.anInt3015 < local787) {
															local787 = local764.anInt3050 - local764.anInt3024 - local764.anInt3015;
														}
														Static56.anInt1715 -= local787;
														local764.anInt3015 += local787;
													}
												}
											} else if (Static86.anInt2114 != 0 && local496 == Static86.anInt2112 && local25.anInt3022 == Static38.anInt1220) {
												local637.method819(local523, local514, 128);
											} else {
												local637.method825(local523, local514);
											}
										}
									} else if (local25.anIntArray398 != null && local496 < 20) {
										@Pc(560) Class2_Sub1_Sub9_Sub1 local560 = local25.method1951(local496);
										if (local560 != null) {
											local560.method825(local523, local514);
										} else if (Static45.aBoolean156) {
											local17 = false;
										}
									}
									local496++;
								}
							}
						} else if (local25.anInt3038 == 3) {
							if (Static100.method1602(local25)) {
								local496 = local25.anInt3054;
								if (Static33.method604(local19, arg7) && local25.anInt3017 != 0) {
									local496 = local25.anInt3017;
								}
							} else {
								local496 = local25.anInt3069;
								if (Static33.method604(local19, arg7) && local25.anInt3004 != 0) {
									local496 = local25.anInt3004;
								}
							}
							if (local68 == 0) {
								if (local25.aBoolean225) {
									Static99.method1894(local57, local65, local25.anInt3020, local25.anInt3024, local496);
								} else {
									Static99.method1888(local57, local65, local25.anInt3020, local25.anInt3024, local496);
								}
							} else if (local25.aBoolean225) {
								Static99.method1891(local57, local65, local25.anInt3020, local25.anInt3024, local496, 256 - (local68 & 0xFF));
							} else {
								Static99.method1904(local57, local65, local25.anInt3020, local25.anInt3024, local496, 256 - (local68 & 0xFF));
							}
						} else {
							@Pc(1027) Class2_Sub1_Sub9_Sub4 local1027;
							if (local25.anInt3038 == 4) {
								local1027 = local25.method1945();
								if (local1027 != null) {
									@Pc(1038) Class80 local1038 = local25.aClass80_1160;
									if (Static100.method1602(local25)) {
										local104 = local25.anInt3054;
										if (Static33.method604(local19, arg7) && local25.anInt3017 != 0) {
											local104 = local25.anInt3017;
										}
										if (local25.aClass80_1163.method1999() > 0) {
											local1038 = local25.aClass80_1163;
										}
									} else {
										local104 = local25.anInt3069;
										if (Static33.method604(local19, arg7) && local25.anInt3004 != 0) {
											local104 = local25.anInt3004;
										}
									}
									if (local25.aBoolean232 && local25.anInt3006 != -1) {
										@Pc(1100) Class2_Sub1_Sub5 local1100 = Static4.method95(local25.anInt3006);
										local1038 = local1100.aClass80_271;
										if (local1038 == null) {
											local1038 = Static44.aClass80_507;
										}
										if ((local1100.anInt792 == 1 || local25.anInt3035 != 1) && local25.anInt3035 != -1) {
											local1038 = Static93.method1444(new Class80[] { local1038, Static96.aClass80_966, Static105.method1429(local25.anInt3035) });
										}
									}
									if (local25.anInt3022 == Static124.anInt3134 && Static44.anInt1361 == local25.anInt3021) {
										local104 = local25.anInt3069;
										local1038 = Static121.aClass80_1177;
									}
									if (Static99.anInt2978 == 479) {
										if (local104 == 16776960) {
											local104 = 255;
										}
										if (local104 == 49152) {
											local104 = 16777215;
										}
									}
									local1038 = Static80.method1240(local25, local1038);
									local1027.method1912(local1038, local57, local65, local25.anInt3020, local25.anInt3024, local104, local25.aBoolean230, local25.anInt3033, local25.anInt3063, local25.anInt3029);
								} else if (Static45.aBoolean156) {
									local17 = false;
								}
							} else {
								@Pc(1327) int local1327;
								if (local25.anInt3038 == 5) {
									@Pc(1214) Class2_Sub1_Sub9_Sub1 local1214;
									if (local25.aBoolean232) {
										if (local25.anInt3006 == -1) {
											local1214 = local25.method1950(false);
										} else {
											local1214 = Static84.method1255(false, local25.anInt3006, local25.anInt3016, local25.anInt3058, local25.anInt3035);
										}
										if (local1214 != null) {
											local104 = local1214.anInt1447;
											local106 = local1214.anInt1446;
											if (local25.aBoolean224) {
												local710 = local65;
												local514 = local57;
												local134 = new int[4];
												Static99.method1895(local134);
												if (local57 < local134[0]) {
													local514 = local134[0];
												}
												local248 = local57 + local25.anInt3020;
												if (local65 < local134[1]) {
													local710 = local134[1];
												}
												if (local134[2] < local248) {
													local248 = local134[2];
												}
												local237 = local25.anInt3024 + local65;
												if (local134[3] < local237) {
													local237 = local134[3];
												}
												Static99.method1896(local514, local710, local248, local237);
												local265 = (local25.anInt3020 + local104 - 1) / local104;
												local259 = (local25.anInt3024 + local106 - 1) / local106;
												for (local787 = 0; local787 < local265; local787++) {
													for (local1327 = 0; local1327 < local259; local1327++) {
														if (local25.anInt3043 != 0) {
															local1214.method816(local104 / 2 + local787 * local104 + local57, local65 - -(local106 * local1327) - -(local106 / 2), local25.anInt3043, 4096);
														} else if (local68 == 0) {
															local1214.method825(local57 + local104 * local787, local1327 * local106 + local65);
														} else {
															local1214.method819(local57 + local787 * local104, local1327 * local106 + local65, 256 - (local68 & 0xFF));
														}
													}
												}
												Static99.method1890(local134);
											} else {
												local523 = local25.anInt3020 * 4096 / local104;
												if (local25.anInt3043 != 0) {
													local1214.method816(local25.anInt3020 / 2 + local57, local65 - -(local25.anInt3024 / 2), local25.anInt3043, local523);
												} else if (local68 != 0) {
													local1214.method828(local57, local65, local25.anInt3020, local25.anInt3024, 256 - (local68 & 0xFF));
												} else if (local104 == local25.anInt3020 && local106 == local25.anInt3024) {
													local1214.method825(local57, local65);
												} else {
													local1214.method823(local57, local65, local25.anInt3020, local25.anInt3024);
												}
											}
										} else if (Static45.aBoolean156) {
											local17 = false;
										}
									} else {
										local1214 = local25.method1950(Static100.method1602(local25));
										if (local1214 != null) {
											local1214.method825(local57, local65);
										} else if (Static45.aBoolean156) {
											local17 = false;
										}
									}
								} else {
									@Pc(1611) Class2_Sub1_Sub5 local1611;
									if (local25.anInt3038 == 6) {
										@Pc(1523) boolean local1523 = Static100.method1602(local25);
										@Pc(1525) Class2_Sub1_Sub1_Sub2 local1525 = null;
										local523 = 0;
										if (local1523) {
											local104 = local25.anInt3060;
										} else {
											local104 = local25.anInt3013;
										}
										if (local25.anInt3006 != -1) {
											local1611 = Static4.method95(local25.anInt3006);
											if (local1611 != null) {
												local1611 = local1611.method431(local25.anInt3035);
												local1525 = local1611.method438(1);
												if (local1525 == null) {
													local17 = false;
												} else {
													local1525.method221();
													local523 = local1525.anInt2306 / 2;
												}
											}
										} else if (local25.anInt3018 == 5) {
											if (local25.anInt3019 == 0) {
												local1525 = Static33.aClass79_1.method1981(null, -1, null, -1);
											} else {
												local1525 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.method1423();
											}
										} else if (local104 == -1) {
											local1525 = local25.method1941(-1, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass79_2, local1523, null);
											if (local1525 == null && Static45.aBoolean156) {
												local17 = false;
											}
										} else {
											@Pc(1573) Class2_Sub1_Sub8 local1573 = Static93.method1443(local104);
											local1525 = local25.method1941(local25.anInt3068, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass79_2, local1523, local1573);
											if (local1525 == null && Static45.aBoolean156) {
												local17 = false;
											}
										}
										Static52.method933(local25.anInt3020 / 2 + local57, local65 - -(local25.anInt3024 / 2));
										local514 = local25.anInt3014 * Class2_Sub1_Sub9_Sub2.anIntArray202[local25.anInt3046] >> 16;
										local710 = Class2_Sub1_Sub9_Sub2.anIntArray198[local25.anInt3046] * local25.anInt3014 >> 16;
										if (local1525 != null) {
											if (local25.aBoolean232) {
												local1525.method221();
												if (local25.aBoolean226) {
													local1525.method209(local25.anInt3062, local25.anInt3052, local25.anInt3046, local25.anInt3057, local25.anInt3023 + local514 + local523, local710 + local25.anInt3023, local25.anInt3014);
												} else {
													local1525.method203(local25.anInt3062, local25.anInt3052, local25.anInt3046, local25.anInt3057, local25.anInt3023 + local523 + local514, local25.anInt3023 + local710);
												}
											} else {
												local1525.method203(local25.anInt3062, 0, local25.anInt3046, 0, local514, local710);
											}
										}
										Static52.method935();
									} else {
										if (local25.anInt3038 == 7) {
											local1027 = local25.method1945();
											if (local1027 == null) {
												if (Static45.aBoolean156) {
													local17 = false;
												}
												continue;
											}
											local104 = 0;
											for (local106 = 0; local106 < local25.anInt3024; local106++) {
												for (local523 = 0; local523 < local25.anInt3020; local523++) {
													if (local25.anIntArray397[local104] > 0) {
														local1611 = Static4.method95(local25.anIntArray397[local104] - 1);
														@Pc(1788) Class80 local1788 = local1611.aClass80_271;
														if (local1788 == null) {
															local1788 = Static44.aClass80_507;
														}
														if (local1611.anInt792 == 1 || local25.anIntArray396[local104] != 1) {
															local1788 = Static93.method1444(new Class80[] { local1788, Static96.aClass80_966, Static105.method1429(local25.anIntArray396[local104]) });
														}
														local237 = local65 + (local25.anInt3045 + 12) * local106;
														local248 = (local25.anInt3065 + 115) * local523 + local57;
														if (local25.anInt3033 == 0) {
															local1027.method1919(local1788, local248, local237, local25.anInt3069, local25.aBoolean230);
														} else if (local25.anInt3033 == 1) {
															local1027.method1927(local1788, local25.anInt3020 / 2 + local248, local237, local25.anInt3069, local25.aBoolean230);
														} else {
															local1027.method1922(local1788, local248 + local25.anInt3020 - 1, local237, local25.anInt3069, local25.aBoolean230);
														}
													}
													local104++;
												}
											}
										}
										if (local25.anInt3038 == 8 && Static79.method1234(local19, arg7) && Static32.anInt1108 == Static95.anInt2451) {
											local496 = 0;
											local104 = 0;
											@Pc(1923) Class2_Sub1_Sub9_Sub4 local1923 = Static21.aClass2_Sub1_Sub9_Sub4_12;
											@Pc(1926) Class80 local1926 = local25.aClass80_1160;
											local1926 = Static80.method1240(local25, local1926);
											@Pc(1943) Class80 local1943;
											while (local1926.method1999() > 0) {
												local710 = local1926.method2025(Static108.aClass80_1077);
												if (local710 == -1) {
													local1943 = local1926;
													local1926 = Static40.aClass80_446;
												} else {
													local1943 = local1926.method2027(0, local710);
													local1926 = local1926.method2021(local710 + 2);
												}
												local248 = local1923.method1915(local1943);
												local104 += local1923.anInt2980 + 1;
												if (local496 < local248) {
													local496 = local248;
												}
											}
											local104 += 7;
											local496 += 6;
											local248 = local25.anInt3024 + local65 + 5;
											local710 = local57 + local25.anInt3020 - local496 - 5;
											if (local57 + 5 > local710) {
												local710 = local57 + 5;
											}
											if (local496 + local710 > arg4) {
												local710 = arg4 - local496;
											}
											if (local248 + local104 > arg0) {
												local248 = arg0 - local104;
											}
											Static99.method1894(local710, local248, local496, local104, 16777120);
											Static99.method1888(local710, local248, local496, local104, 0);
											local1926 = local25.aClass80_1160;
											local237 = local1923.anInt2980 + local248 + 2;
											local1926 = Static80.method1240(local25, local1926);
											while (local1926.method1999() > 0) {
												local265 = local1926.method2025(Static108.aClass80_1077);
												if (local265 == -1) {
													local1943 = local1926;
													local1926 = Static40.aClass80_446;
												} else {
													local1943 = local1926.method2027(0, local265);
													local1926 = local1926.method2021(local265 + 2);
												}
												local1923.method1919(local1943, local710 + 3, local237, 0, false);
												local237 += local1923.anInt2980 + 1;
											}
										}
										if (local25.anInt3038 == 9) {
											if (local25.anInt3044 == 1) {
												Static99.method1899(local57, local65, local25.anInt3020 + local57, local65 + local25.anInt3024, local25.anInt3069);
											} else {
												local496 = local25.anInt3020 >= 0 ? local25.anInt3020 : -local25.anInt3020;
												local106 = local496;
												local104 = local25.anInt3024 < 0 ? -local25.anInt3024 : local25.anInt3024;
												if (local496 < local104) {
													local106 = local104;
												}
												if (local106 != 0) {
													local514 = (local25.anInt3024 << 16) / local106;
													local523 = (local25.anInt3020 << 16) / local106;
													if (local514 > local523) {
														local514 = -local514;
													} else {
														local523 = -local523;
													}
													local710 = local514 * local25.anInt3044 >> 17;
													local248 = local25.anInt3044 * local514 + 1 >> 17;
													local265 = local523 * local25.anInt3044 + 1 >> 17;
													local237 = local523 * local25.anInt3044 >> 17;
													local259 = local57 + local710;
													local787 = local57 - local248;
													local1327 = local25.anInt3020 + local57 - local248;
													@Pc(2249) int local2249 = local710 + local25.anInt3020 + local57;
													@Pc(2253) int local2253 = local237 + local65;
													@Pc(2260) int local2260 = local25.anInt3024 + local65 - local265;
													@Pc(2267) int local2267 = local25.anInt3024 + local65 + local237;
													Static52.method934(local259, local787, local1327);
													@Pc(2275) int local2275 = local65 - local265;
													Static52.method941(local2253, local2275, local2260, local259, local787, local1327, local25.anInt3069);
													Static52.method934(local259, local1327, local2249);
													Static52.method941(local2253, local2260, local2267, local259, local1327, local2249, local25.anInt3069);
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
		return local17;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
	public static void method249(@OriginalArg(0) int arg0) {
		if (!Static122.method1969(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub1_Sub17[] local14 = Static51.aClass2_Sub1_Sub17ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class2_Sub1_Sub17 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt3068 = 0;
				local22.anInt3026 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method250() {
		aClass80_170 = null;
		aClass80_165 = null;
		aClass11_Sub1_4 = null;
		aClass80_169 = null;
		anIntArray66 = null;
		aClass80_167 = null;
		aClass80_168 = null;
		aClass80_164 = null;
		aClass80_166 = null;
		aClass2_Sub1_Sub9_Sub3_13 = null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method251() {
		Static44.aClass2_Sub2_Sub3_2.method1379();
		Static17.anInt650 = 1;
		Static5.aClass11_4 = null;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public static void method252() {
		Static104.aClass41_12 = new Class41(32);
	}
}
