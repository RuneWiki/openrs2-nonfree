import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!lc;")
	public static Class40 aClass40_21;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_276 = Static121.method2047(")1j");

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!qc;")
	private static Class60 aClass60_277 = Static121.method2047("Walk here");

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_278 = Static121.method2047("Hidden)2use");

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_279 = Static121.method2047(" <col=ffffff>");

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!qc;")
	public static Class60 aClass60_280 = Static121.method2047("Schlie-8en");

	@OriginalMember(owner = "client!df", name = "i", descriptor = "J")
	public static volatile long aLong20 = 0L;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_281 = Static121.method2047("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_282 = Static121.method2047("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_283 = aClass60_277;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	public static int anInt686 = 0;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "I")
	public static int anInt688 = 0;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Lclient!qc;")
	public static Class60 aClass60_284 = Static121.method2047("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] method468() {
		@Pc(13) Class4_Sub4_Sub3_Sub2[] local13 = new Class4_Sub4_Sub3_Sub2[Static37.anInt929];
		for (@Pc(15) int local15 = 0; local15 < Static37.anInt929; local15++) {
			@Pc(25) Class4_Sub4_Sub3_Sub2 local25 = local13[local15] = new Class4_Sub4_Sub3_Sub2();
			local25.anInt1267 = Static31.anInt850;
			local25.anInt1269 = Static46.anInt1202;
			local25.anInt1268 = Static61.anIntArray166[local15];
			local25.anInt1271 = Static113.anIntArray299[local15];
			local25.anInt1270 = Static102.anIntArray279[local15];
			local25.anInt1272 = Static76.anIntArray193[local15];
			@Pc(57) int local57 = local25.anInt1272 * local25.anInt1270;
			@Pc(61) byte[] local61 = Static105.aByteArrayArray8[local15];
			local25.anIntArray121 = new int[local57];
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				local25.anIntArray121[local67] = Static56.anIntArray146[local61[local67] & 0xFF];
			}
		}
		Static131.method2144();
		return local13;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
	public static void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 2048 - arg0 & 0x7FF;
		@Pc(21) int local21 = 2048 - arg5 & 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg3;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(51) int local51;
		if (local21 != 0) {
			local36 = Class4_Sub4_Sub3_Sub3.anIntArray214[local21];
			local40 = Class4_Sub4_Sub3_Sub3.anIntArray217[local21];
			local51 = local40 * 0 - local36 * arg3 >> 16;
			local27 = arg3 * local40 + local36 * 0 >> 16;
			local23 = local51;
		}
		if (local15 != 0) {
			local40 = Class4_Sub4_Sub3_Sub3.anIntArray217[local15];
			local36 = Class4_Sub4_Sub3_Sub3.anIntArray214[local15];
			local51 = local40 * 0 + local27 * local36 >> 16;
			local27 = local27 * local40 - local36 * 0 >> 16;
			local25 = local51;
		}
		Static75.anInt1872 = arg0;
		Static23.anInt663 = arg1 - local23;
		Static88.anInt2065 = arg4 - local25;
		Static120.anInt1940 = arg5;
		Static74.anInt1856 = arg2 - local27;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	public static void method470() {
		for (@Pc(8) int local8 = 0; local8 < Static130.anInt3022; local8++) {
			@Pc(14) int local14 = Static85.anIntArray204[local8]--;
			if (Static85.anIntArray204[local8] >= -10) {
				@Pc(87) Class73 local87 = Static20.aClass73Array1[local8];
				if (local87 == null) {
					local87 = Static137.method2006(Static2.aClass40_Sub1_9, Static131.anIntArray339[local8], 0);
					if (local87 == null) {
						continue;
					}
					Static85.anIntArray204[local8] += local87.method2004();
					Static20.aClass73Array1[local8] = local87;
				}
				if (Static85.anIntArray204[local8] < 0) {
					@Pc(124) int local124;
					if (Static87.anIntArray207[local8] == 0) {
						local124 = Static35.anInt913;
					} else {
						@Pc(134) int local134 = (Static87.anIntArray207[local8] & 0xFF) * 128;
						@Pc(142) int local142 = Static87.anIntArray207[local8] >> 16 & 0xFF;
						@Pc(150) int local150 = Static87.anIntArray207[local8] >> 8 & 0xFF;
						@Pc(160) int local160 = local142 * 128 + 64 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620;
						if (local160 < 0) {
							local160 = -local160;
						}
						@Pc(177) int local177 = local150 * 128 + 64 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601;
						if (local177 < 0) {
							local177 = -local177;
						}
						@Pc(188) int local188 = local160 + local177 - 128;
						if (local188 > local134) {
							Static85.anIntArray204[local8] = -100;
							continue;
						}
						if (local188 < 0) {
							local188 = 0;
						}
						local124 = Static107.anInt2537 * (local134 - local188) / local134;
					}
					if (local124 > 0) {
						@Pc(217) Class4_Sub1_Sub1 local217 = local87.method2005().method707(Static37.aClass77_1);
						@Pc(222) Class4_Sub2_Sub1 local222 = Static132.method106(local217, local124);
						local222.method86(Static87.anIntArray206[local8] - 1);
						Static119.aClass4_Sub2_Sub3_2.method749(local222);
					}
					Static85.anIntArray204[local8] = -100;
				}
			} else {
				Static130.anInt3022--;
				for (@Pc(30) int local30 = local8; local30 < Static130.anInt3022; local30++) {
					Static131.anIntArray339[local30] = Static131.anIntArray339[local30 + 1];
					Static20.aClass73Array1[local30] = Static20.aClass73Array1[local30 + 1];
					Static87.anIntArray206[local30] = Static87.anIntArray206[local30 + 1];
					Static85.anIntArray204[local30] = Static85.anIntArray204[local30 + 1];
					Static87.anIntArray207[local30] = Static87.anIntArray207[local30 + 1];
				}
				local8--;
			}
		}
		if (Static103.aBoolean61 && !Static6.method40()) {
			if (Static64.anInt1714 != 0 && Static108.anInt2556 != -1) {
				Static105.method1824(0, Static5.aClass40_Sub1_3, Static108.anInt2556, Static64.anInt1714);
			}
			Static103.aBoolean61 = false;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Lclient!ba;")
	public static Class8 method471() {
		try {
			return (Class8) Class.forName("Class8_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class8_Sub2();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method472() {
		aClass60_283 = null;
		aClass60_281 = null;
		aClass60_279 = null;
		aClass60_280 = null;
		aClass60_276 = null;
		aClass60_278 = null;
		aClass60_282 = null;
		aClass60_277 = null;
		aClass60_284 = null;
		aClass40_21 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([I[Lclient!na;[IIIB)V")
	public static void method473(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class49[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= arg3) {
			return;
		}
		@Pc(12) int local12 = arg3 + 1;
		@Pc(16) int local16 = arg4 - 1;
		@Pc(22) int local22 = (arg4 + arg3) / 2;
		@Pc(26) Class49 local26 = arg1[local22];
		arg1[local22] = arg1[arg4];
		arg1[arg4] = local26;
		while (local12 > local16) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(62) int local62;
			@Pc(77) int local77;
			do {
				local12--;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg2[local43] == 2) {
						local77 = local26.anInt1876;
						local62 = arg1[local12].anInt1876;
					} else if (arg2[local43] == 1) {
						local62 = arg1[local12].anInt1871;
						if (local62 == -1 && arg0[local43] == 1) {
							local62 = 2001;
						}
						local77 = local26.anInt1871;
						if (local77 == -1 && arg0[local43] == 1) {
							local77 = 2001;
						}
					} else if (arg2[local43] == 3) {
						local77 = local26.aBoolean74 ? 1 : 0;
						local62 = arg1[local12].aBoolean74 ? 1 : 0;
					} else {
						local77 = local26.anInt1875;
						local62 = arg1[local12].anInt1875;
					}
					if (local77 != local62) {
						if ((arg0[local43] != 1 || local77 >= local62) && (arg0[local43] != 0 || local62 >= local77)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local16++;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg2[local43] == 2) {
						local77 = local26.anInt1876;
						local62 = arg1[local16].anInt1876;
					} else if (arg2[local43] == 1) {
						local62 = arg1[local16].anInt1871;
						if (local62 == -1 && arg0[local43] == 1) {
							local62 = 2001;
						}
						local77 = local26.anInt1871;
						if (local77 == -1 && arg0[local43] == 1) {
							local77 = 2001;
						}
					} else if (arg2[local43] == 3) {
						local77 = local26.aBoolean74 ? 1 : 0;
						local62 = arg1[local16].aBoolean74 ? 1 : 0;
					} else {
						local62 = arg1[local16].anInt1875;
						local77 = local26.anInt1875;
					}
					if (local77 != local62) {
						if ((arg0[local43] != 1 || local77 <= local62) && (arg0[local43] != 0 || local77 >= local62)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local16 < local12) {
				@Pc(325) Class49 local325 = arg1[local16];
				arg1[local16] = arg1[local12];
				arg1[local12] = local325;
			}
		}
		method473(arg0, arg1, arg2, local12, arg4);
		method473(arg0, arg1, arg2, arg3, local12 + 1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BIIII[Lclient!q;IIII)V")
	public static void method474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub17[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static80.method1712(arg1, arg3, arg8, arg2);
		Static91.method1594();
		for (@Pc(20) int local20 = 0; local20 < arg4.length; local20++) {
			@Pc(26) Class4_Sub17 local26 = arg4[local20];
			if (local26 != null && (arg0 == local26.anInt2192 || arg0 == -1412584499 && Static60.aClass4_Sub17_12 == local26)) {
				@Pc(50) int local50;
				if (arg5 == -1) {
					Static60.anIntArray235[Static92.anInt2256] = local26.anInt2234 + arg6;
					Static125.anIntArray330[Static92.anInt2256] = local26.anInt2204 + arg7;
					Static109.anIntArray290[Static92.anInt2256] = local26.anInt2184;
					Static101.anIntArray276[Static92.anInt2256] = local26.anInt2186;
					local50 = Static92.anInt2256++;
				} else {
					local50 = arg5;
				}
				local26.anInt2255 = local50;
				local26.anInt2236 = Static81.anInt1944;
				if (!local26.aBoolean103 || !Static13.method277(local26)) {
					if (local26.anInt2227 > 0) {
						Static99.method1759(local26);
					}
					@Pc(106) int local106 = arg6 + local26.anInt2234;
					@Pc(109) int local109 = local26.anInt2247;
					@Pc(115) int local115 = local26.anInt2204 + arg7;
					@Pc(145) int local145;
					@Pc(156) int local156;
					if (local26 == Static60.aClass4_Sub17_12) {
						if (arg0 != -1412584499 && !local26.aBoolean102) {
							Static128.aClass4_Sub17Array4 = arg4;
							Static83.anInt1978 = arg7;
							Static58.anInt1443 = arg6;
							continue;
						}
						if (!local26.aBoolean102) {
							local109 = 128;
						}
						if (Static71.aBoolean69 && Static11.aBoolean9) {
							local145 = Static82.anInt1962;
							local145 -= Static9.anInt156;
							if (local145 < Static22.anInt649) {
								local145 = Static22.anInt649;
							}
							local156 = Static17.anInt452;
							if (Static114.aClass4_Sub17_15.anInt2184 + Static22.anInt649 < local26.anInt2184 + local145) {
								local145 = Static114.aClass4_Sub17_15.anInt2184 + Static22.anInt649 - local26.anInt2184;
							}
							local106 = local145;
							local156 -= Static103.anInt1662;
							if (Static56.anInt1425 > local156) {
								local156 = Static56.anInt1425;
							}
							if (local26.anInt2186 + local156 > Static56.anInt1425 + Static114.aClass4_Sub17_15.anInt2186) {
								local156 = Static56.anInt1425 + Static114.aClass4_Sub17_15.anInt2186 - local26.anInt2186;
							}
							local115 = local156;
						}
					}
					@Pc(220) int local220;
					@Pc(216) int local216;
					@Pc(232) int local232;
					@Pc(234) int local234;
					@Pc(239) int local239;
					@Pc(244) int local244;
					if (local26.anInt2231 == 2) {
						local216 = arg2;
						local156 = arg3;
						local220 = arg8;
						local145 = arg1;
					} else if (local26.anInt2231 == 9) {
						local232 = local106;
						local234 = local115;
						local239 = local26.anInt2184 + local106;
						local244 = local26.anInt2186 + local115;
						if (local239 < local106) {
							local232 = local239;
							local239 = local106;
						}
						local145 = arg1 < local232 ? local232 : arg1;
						local239++;
						local220 = arg8 <= local239 ? arg8 : local239;
						if (local115 > local244) {
							local234 = local244;
							local244 = local115;
						}
						local156 = arg3 >= local234 ? arg3 : local234;
						local244++;
						local216 = arg2 > local244 ? local244 : arg2;
					} else {
						local145 = local106 > arg1 ? local106 : arg1;
						local156 = arg3 < local115 ? local115 : arg3;
						local232 = local106 + local26.anInt2184;
						local234 = local26.anInt2186 + local115;
						local220 = local232 >= arg8 ? arg8 : local232;
						local216 = local234 < arg2 ? local234 : arg2;
					}
					if (!local26.aBoolean103 || local145 < local220 && local156 < local216) {
						if (local26.anInt2227 != 0) {
							if (local26.anInt2227 == 1337) {
								Static130.anInt3018 = local106;
								Static74.anInt1858 = local115;
								Static25.method480(local115, local26.anInt2186, local106, local26.anInt2184);
								Static80.method1712(arg1, arg3, arg8, arg2);
								continue;
							}
							if (local26.anInt2227 == 1338) {
								Static65.method1289(local50, local115, local106);
								Static80.method1712(arg1, arg3, arg8, arg2);
								continue;
							}
						}
						local232 = Static82.anInt1962;
						local234 = Static17.anInt452;
						if (!Static93.aBoolean105 && local145 <= local232 && local156 <= local234 && local232 < local220 && local234 < local216) {
							Static98.method1755(local234 - local115, local26, local232 - local106);
						}
						if (local26.anInt2231 == 0) {
							if (!local26.aBoolean103 && Static13.method277(local26) && Static119.aClass4_Sub17_16 != local26) {
								continue;
							}
							if (!local26.aBoolean103) {
								if (local26.anInt2196 - local26.anInt2186 < local26.anInt2215) {
									local26.anInt2215 = local26.anInt2196 - local26.anInt2186;
								}
								if (local26.anInt2215 < 0) {
									local26.anInt2215 = 0;
								}
							}
							method474(local26.anInt2203, local145, local216, local156, arg4, local50, local106 - local26.anInt2224, -local26.anInt2215 + local115, local220);
							if (local26.aClass4_Sub17Array3 != null) {
								method474(local26.anInt2203, local145, local216, local156, local26.aClass4_Sub17Array3, local50, local106 - local26.anInt2224, -local26.anInt2215 + local115, local220);
							}
							@Pc(562) Class4_Sub18 local562 = (Class4_Sub18) Static111.aClass66_12.method1834((long) local26.anInt2203);
							if (local562 != null) {
								if (local562.anInt2399 == 0 && local145 <= Static82.anInt1962 && local156 <= Static17.anInt452 && Static82.anInt1962 < local220 && local216 > Static17.anInt452 && !Static93.aBoolean105 && !Static128.aBoolean113) {
									Static36.anIntArray71[0] = 1003;
									Static112.aClass60Array24[0] = Static83.aClass60_817;
									Static25.anInt693 = 1;
									Static9.aClass60Array2[0] = Static22.aClass60_241;
								}
								Static43.method721(local562.anInt2402, local115, local145, local50, local216, local156, local220, local106);
							}
							Static80.method1712(arg1, arg3, arg8, arg2);
							Static91.method1594();
						}
						if (Static41.aBooleanArray6[local50] || Static31.anInt847 > 1) {
							if (local26.anInt2231 == 0 && !local26.aBoolean103 && local26.anInt2196 > local26.anInt2186) {
								Static15.method2096(local115, local26.anInt2186, local26.anInt2196, local26.anInt2215, local26.anInt2184 + local106);
							}
							if (local26.anInt2231 != 1) {
								@Pc(684) int local684;
								@Pc(705) int local705;
								@Pc(878) int local878;
								@Pc(768) int local768;
								@Pc(949) int local949;
								@Pc(695) int local695;
								@Pc(892) int local892;
								if (local26.anInt2231 == 2) {
									local239 = 0;
									for (local244 = 0; local244 < local26.anInt2186; local244++) {
										for (local684 = 0; local684 < local26.anInt2184; local684++) {
											local695 = (local26.anInt2240 + 32) * local244 + local115;
											local705 = local106 + (local26.anInt2229 + 32) * local684;
											if (local239 < 20) {
												local695 += local26.anIntArray219[local239];
												local705 += local26.anIntArray223[local239];
											}
											if (local26.anIntArray224[local239] > 0) {
												local768 = local26.anIntArray224[local239] - 1;
												if (arg1 < local705 + 32 && local705 < arg8 && arg3 < local695 + 32 && local695 < arg2 || Static113.aClass4_Sub17_14 == local26 && Static95.anInt2331 == local239) {
													@Pc(821) Class4_Sub4_Sub3_Sub2 local821;
													if (Static26.anInt724 == 1 && local239 == Static117.anInt2792 && Static87.anInt2046 == local26.anInt2203) {
														local821 = Static71.method1374(2, false, local26.anIntArray225[local239], 0, local768);
													} else {
														local821 = Static71.method1374(1, false, local26.anIntArray225[local239], 3153952, local768);
													}
													if (local821 == null) {
														Static130.method2133(local26);
													} else if (local26 == Static113.aClass4_Sub17_14 && local239 == Static95.anInt2331) {
														local878 = Static17.anInt452 - Static117.anInt2794;
														if (local878 < 5 && local878 > -5) {
															local878 = 0;
														}
														local892 = Static82.anInt1962 - Static78.anInt1908;
														if (local892 < 5 && local892 > -5) {
															local892 = 0;
														}
														if (Static2.anInt1353 < 5) {
															local892 = 0;
															local878 = 0;
														}
														local821.method910(local892 + local705, local695 + local878, 128);
														if (arg0 != -1) {
															@Pc(927) Class4_Sub17 local927 = arg4[arg0 & 0xFFFF];
															if (local878 + local695 < Static80.anInt2373 && local927.anInt2215 > 0) {
																local949 = Static15.anInt2962 * (Static80.anInt2373 - local695 - local878) / 3;
																if (local949 > Static15.anInt2962 * 10) {
																	local949 = Static15.anInt2962 * 10;
																}
																if (local927.anInt2215 < local949) {
																	local949 = local927.anInt2215;
																}
																Static117.anInt2794 += local949;
																local927.anInt2215 -= local949;
																Static130.method2133(local927);
															}
															if (Static80.anInt2375 < local878 + local695 + 32 && local927.anInt2215 < local927.anInt2196 - local927.anInt2186) {
																local949 = Static15.anInt2962 * (local695 + local878 + 32 - Static80.anInt2375) / 3;
																if (Static15.anInt2962 * 10 < local949) {
																	local949 = Static15.anInt2962 * 10;
																}
																if (local927.anInt2196 - local927.anInt2215 - local927.anInt2186 < local949) {
																	local949 = local927.anInt2196 - local927.anInt2215 - local927.anInt2186;
																}
																local927.anInt2215 += local949;
																Static117.anInt2794 -= local949;
																Static130.method2133(local927);
															}
														}
													} else if (Static32.aClass4_Sub17_4 == local26 && local239 == Static90.anInt2139) {
														local821.method910(local705, local695, 128);
													} else {
														local821.method912(local705, local695);
													}
												}
											} else if (local26.anIntArray227 != null && local239 < 20) {
												@Pc(742) Class4_Sub4_Sub3_Sub2 local742 = local26.method1623(local239);
												if (local742 != null) {
													local742.method912(local705, local695);
												} else if (Static31.aBoolean24) {
													Static130.method2133(local26);
												}
											}
											local239++;
										}
									}
								} else if (local26.anInt2231 == 3) {
									if (Static121.method2040(local26)) {
										local239 = local26.anInt2197;
										if (Static119.aClass4_Sub17_16 == local26 && local26.anInt2239 != 0) {
											local239 = local26.anInt2239;
										}
									} else {
										local239 = local26.anInt2244;
										if (local26 == Static119.aClass4_Sub17_16 && local26.anInt2219 != 0) {
											local239 = local26.anInt2219;
										}
									}
									if (local109 == 0) {
										if (local26.aBoolean93) {
											Static80.method1705(local106, local115, local26.anInt2184, local26.anInt2186, local239);
										} else {
											Static80.method1718(local106, local115, local26.anInt2184, local26.anInt2186, local239);
										}
									} else if (local26.aBoolean93) {
										Static80.method1714(local106, local115, local26.anInt2184, local26.anInt2186, local239, 256 - (local109 & 0xFF));
									} else {
										Static80.method1707(local106, local115, local26.anInt2184, local26.anInt2186, local239, 256 - (local109 & 0xFF));
									}
								} else {
									@Pc(1184) Class4_Sub4_Sub3_Sub4 local1184;
									if (local26.anInt2231 == 4) {
										local1184 = local26.method1611();
										if (local1184 != null) {
											@Pc(1196) Class60 local1196 = local26.aClass60_896;
											if (Static121.method2040(local26)) {
												local244 = local26.anInt2197;
												if (Static119.aClass4_Sub17_16 == local26 && local26.anInt2239 != 0) {
													local244 = local26.anInt2239;
												}
												if (local26.aClass60_899.method1644() > 0) {
													local1196 = local26.aClass60_899;
												}
											} else {
												local244 = local26.anInt2244;
												if (local26 == Static119.aClass4_Sub17_16 && local26.anInt2219 != 0) {
													local244 = local26.anInt2219;
												}
											}
											if (local26.aBoolean103 && local26.anInt2213 != -1) {
												@Pc(1250) Class4_Sub4_Sub13 local1250 = method475(local26.anInt2213);
												local1196 = local1250.aClass60_870;
												if (local1196 == null) {
													local1196 = Static47.aClass60_484;
												}
												if ((local1250.anInt2130 == 1 || local26.anInt2181 != 1) && local26.anInt2181 != -1) {
													local1196 = Static125.method2072(new Class60[] { Static125.aClass60_1173, local1196, Static123.aClass60_1167, Static115.method1949(local26.anInt2181) });
												}
											}
											if (local26 == Static11.aClass4_Sub17_1) {
												local1196 = Static108.aClass60_1034;
												local244 = local26.anInt2244;
											}
											if (!local26.aBoolean103) {
												local1196 = Static106.method1827(local26, local1196);
											}
											local1184.method1730(local1196, local106, local115, local26.anInt2184, local26.anInt2186, local244, local26.aBoolean94 ? 0 : -1, local26.anInt2193, local26.anInt2237, local26.anInt2191);
										} else if (Static31.aBoolean24) {
											Static130.method2133(local26);
										}
									} else if (local26.anInt2231 == 5) {
										@Pc(1354) Class4_Sub4_Sub3_Sub2 local1354;
										if (local26.aBoolean103) {
											if (local26.anInt2213 == -1) {
												local1354 = local26.method1620(false);
											} else {
												local1354 = Static71.method1374(local26.anInt2254, false, local26.anInt2181, local26.anInt2211, local26.anInt2213);
											}
											if (local1354 != null) {
												local244 = local1354.anInt1269;
												local684 = local1354.anInt1267;
												if (local26.aBoolean104) {
													Static80.method1722(local106, local115, local106 + local26.anInt2184, local115 + local26.anInt2186);
													local705 = (local244 + local26.anInt2184 - 1) / local244;
													local695 = (local26.anInt2186 + local684 - 1) / local684;
													for (local892 = 0; local892 < local705; local892++) {
														for (local878 = 0; local878 < local695; local878++) {
															if (local26.anInt2182 != 0) {
																local1354.method917(local244 / 2 + local244 * local892 + local106, local115 + local684 * local878 - -(local684 / 2), local26.anInt2182, 4096);
															} else if (local109 == 0) {
																local1354.method912(local892 * local244 + local106, local115 - -(local878 * local684));
															} else {
																local1354.method910(local106 + local892 * local244, local878 * local684 + local115, 256 - (local109 & 0xFF));
															}
														}
													}
													Static80.method1712(arg1, arg3, arg8, arg2);
												} else {
													local705 = local26.anInt2184 * 4096 / local244;
													if (local26.anInt2182 != 0) {
														local1354.method917(local26.anInt2184 / 2 + local106, local115 - -(local26.anInt2186 / 2), local26.anInt2182, local705);
													} else if (local109 != 0) {
														local1354.method893(local106, local115, local26.anInt2184, local26.anInt2186, 256 - (local109 & 0xFF));
													} else if (local26.anInt2184 == local244 && local26.anInt2186 == local684) {
														local1354.method912(local106, local115);
													} else {
														local1354.method894(local106, local115, local26.anInt2184, local26.anInt2186);
													}
												}
											} else if (Static31.aBoolean24) {
												Static130.method2133(local26);
											}
										} else {
											local1354 = local26.method1620(Static121.method2040(local26));
											if (local1354 != null) {
												local1354.method912(local106, local115);
											} else if (Static31.aBoolean24) {
												Static130.method2133(local26);
											}
										}
									} else {
										@Pc(1707) Class4_Sub4_Sub13 local1707;
										if (local26.anInt2231 == 6) {
											@Pc(1619) boolean local1619 = Static121.method2040(local26);
											local705 = 0;
											@Pc(1623) Class4_Sub4_Sub1_Sub6 local1623 = null;
											if (local1619) {
												local244 = local26.anInt2253;
											} else {
												local244 = local26.anInt2198;
											}
											if (local26.anInt2213 != -1) {
												local1707 = method475(local26.anInt2213);
												if (local1707 != null) {
													local1707 = local1707.method1543(local26.anInt2181);
													local1623 = local1707.method1545(1);
													if (local1623 == null) {
														Static130.method2133(local26);
													} else {
														local1623.method1799();
														local705 = local1623.anInt2816 / 2;
													}
												}
											} else if (local26.anInt2208 == 5) {
												if (local26.anInt2228 == 0) {
													local1623 = Static112.aClass36_2.method1036(-1, null, -1, null);
												} else {
													local1623 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.method1976();
												}
											} else if (local244 == -1) {
												local1623 = local26.method1618(-1, null, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass36_1, local1619);
												if (local1623 == null && Static31.aBoolean24) {
													Static130.method2133(local26);
												}
											} else {
												@Pc(1650) Class4_Sub4_Sub14 local1650 = Static127.method2102(local244);
												local1623 = local26.method1618(local26.anInt2251, local1650, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass36_1, local1619);
												if (local1623 == null && Static31.aBoolean24) {
													Static130.method2133(local26);
												}
											}
											Static91.method1587(local106 + local26.anInt2184 / 2, local26.anInt2186 / 2 + local115);
											local695 = Class4_Sub4_Sub3_Sub3.anIntArray214[local26.anInt2226] * local26.anInt2245 >> 16;
											local892 = local26.anInt2245 * Class4_Sub4_Sub3_Sub3.anIntArray217[local26.anInt2226] >> 16;
											if (local1623 != null) {
												if (local26.aBoolean103) {
													local1623.method1799();
													if (local26.aBoolean98) {
														local1623.method1797(local26.anInt2232, local26.anInt2209, local26.anInt2226, local26.anInt2230, local26.anInt2179 + local705 + local695, local26.anInt2179 + local892, local26.anInt2245);
													} else {
														local1623.method1790(local26.anInt2232, local26.anInt2209, local26.anInt2226, local26.anInt2230, local695 + local705 + local26.anInt2179, local26.anInt2179 + local892);
													}
												} else {
													local1623.method1790(local26.anInt2232, 0, local26.anInt2226, 0, local695, local892);
												}
											}
											Static91.method1591();
										} else {
											if (local26.anInt2231 == 7) {
												local1184 = local26.method1611();
												if (local1184 == null) {
													if (Static31.aBoolean24) {
														Static130.method2133(local26);
													}
													continue;
												}
												local244 = 0;
												for (local684 = 0; local684 < local26.anInt2186; local684++) {
													for (local705 = 0; local705 < local26.anInt2184; local705++) {
														if (local26.anIntArray224[local244] > 0) {
															local1707 = method475(local26.anIntArray224[local244] - 1);
															@Pc(1888) Class60 local1888 = local1707.aClass60_870;
															if (local1888 == null) {
																local1888 = Static47.aClass60_484;
															}
															if (local1707.anInt2130 == 1 || local26.anIntArray225[local244] != 1) {
																local1888 = Static125.method2072(new Class60[] { Static125.aClass60_1173, local1888, Static123.aClass60_1167, Static115.method1949(local26.anIntArray225[local244]) });
															}
															local768 = local115 + local684 * (local26.anInt2240 + 12);
															local878 = (local26.anInt2229 + 115) * local705 + local106;
															if (local26.anInt2193 == 0) {
																local1184.method1745(local1888, local878, local768, local26.anInt2244, local26.aBoolean94 ? 0 : -1);
															} else if (local26.anInt2193 == 1) {
																local1184.method1729(local1888, local26.anInt2184 / 2 + local878, local768, local26.anInt2244, local26.aBoolean94 ? 0 : -1);
															} else {
																local1184.method1732(local1888, local26.anInt2184 + local878 - 1, local768, local26.anInt2244, local26.aBoolean94 ? 0 : -1);
															}
														}
														local244++;
													}
												}
											}
											@Pc(2206) int local2206;
											if (local26.anInt2231 == 8 && local26 == Static88.aClass4_Sub17_10 && Static121.anInt2897 == Static14.anInt3006) {
												local239 = 0;
												@Pc(2047) Class4_Sub4_Sub3_Sub4 local2047 = Static2.aClass4_Sub4_Sub3_Sub4_3;
												local244 = 0;
												@Pc(2052) Class60 local2052 = local26.aClass60_896;
												local2052 = Static106.method1827(local26, local2052);
												@Pc(2069) Class60 local2069;
												while (local2052.method1644() > 0) {
													local892 = local2052.method1649(Static126.aClass60_1180);
													if (local892 == -1) {
														local2069 = local2052;
														local2052 = Static22.aClass60_241;
													} else {
														local2069 = local2052.method1657(local892, 0);
														local2052 = local2052.method1662(local892 + 4);
													}
													local878 = local2047.method1743(local2069);
													if (local239 < local878) {
														local239 = local878;
													}
													local244 += local2047.anInt2387 + 1;
												}
												local244 += 7;
												local239 += 6;
												local878 = local115 + local26.anInt2186 + 5;
												local892 = local26.anInt2184 + local106 - local239 - 5;
												if (local878 + local244 > arg2) {
													local878 = arg2 - local244;
												}
												if (local892 < local106 + 5) {
													local892 = local106 + 5;
												}
												if (local892 + local239 > arg8) {
													local892 = arg8 - local239;
												}
												Static80.method1705(local892, local878, local239, local244, 16777120);
												Static80.method1718(local892, local878, local239, local244, 0);
												local768 = local2047.anInt2387 + local878 + 2;
												local2052 = local26.aClass60_896;
												local2052 = Static106.method1827(local26, local2052);
												while (local2052.method1644() > 0) {
													local2206 = local2052.method1649(Static126.aClass60_1180);
													if (local2206 == -1) {
														local2069 = local2052;
														local2052 = Static22.aClass60_241;
													} else {
														local2069 = local2052.method1657(local2206, 0);
														local2052 = local2052.method1662(local2206 + 4);
													}
													local2047.method1745(local2069, local892 + 3, local768, 0, -1);
													local768 += local2047.anInt2387 + 1;
												}
											}
											if (local26.anInt2231 == 9) {
												if (local26.anInt2200 == 1) {
													Static80.method1719(local106, local115, local106 + local26.anInt2184, local115 + local26.anInt2186, local26.anInt2244);
												} else {
													local239 = local26.anInt2184 >= 0 ? local26.anInt2184 : -local26.anInt2184;
													local244 = local26.anInt2186 >= 0 ? local26.anInt2186 : -local26.anInt2186;
													local684 = local239;
													if (local244 > local239) {
														local684 = local244;
													}
													if (local684 != 0) {
														local705 = (local26.anInt2184 << 16) / local684;
														local695 = (local26.anInt2186 << 16) / local684;
														if (local705 >= local695) {
															local705 = -local705;
														} else {
															local695 = -local695;
														}
														local892 = local26.anInt2200 * local695 >> 17;
														local878 = local26.anInt2200 * local695 + 1 >> 17;
														local768 = local26.anInt2200 * local705 >> 17;
														@Pc(2351) int local2351 = local106 + local892;
														local2206 = local26.anInt2200 * local705 + 1 >> 17;
														@Pc(2367) int local2367 = local26.anInt2184 + local106 - local878;
														@Pc(2371) int local2371 = local768 + local115;
														local949 = local106 - local878;
														@Pc(2384) int local2384 = local106 + local26.anInt2184 + local892;
														@Pc(2392) int local2392 = local26.anInt2186 + local115 - local2206;
														@Pc(2397) int local2397 = local115 - local2206;
														@Pc(2405) int local2405 = local115 + local26.anInt2186 + local768;
														Static91.method1590(local2351, local949, local2367);
														Static91.method1593(local2371, local2397, local2392, local2351, local949, local2367, local26.anInt2244);
														Static91.method1590(local2351, local2367, local2384);
														Static91.method1593(local2371, local2392, local2405, local2351, local2367, local2384, local26.anInt2244);
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

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)Lclient!pe;")
	public static Class4_Sub4_Sub13 method475(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub4_Sub13 local11 = (Class4_Sub4_Sub13) Static7.aClass48_67.method1390((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static104.aClass40_76.method1110(arg0, 10);
		local11 = new Class4_Sub4_Sub13();
		local11.anInt2128 = arg0;
		if (local25 != null) {
			local11.method1551(new Class4_Sub13(local25));
		}
		local11.method1552();
		if (local11.anInt2112 != -1) {
			local11.method1549(method475(local11.anInt2109), method475(local11.anInt2112));
		}
		if (!Static60.aBoolean107 && local11.aBoolean87) {
			local11.anInt2096 = 0;
			local11.aClass60Array17 = null;
			local11.aClass60_870 = Static102.aClass60_999;
			local11.aClass60Array18 = null;
		}
		Static7.aClass48_67.method1392(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public static void method476() {
		Static69.aClass48_39.method1393();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Lclient!gf;")
	public static Class4_Sub4_Sub5 method477(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub5 local10 = (Class4_Sub4_Sub5) Static70.aClass48_41.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static55.aClass40_43.method1110(arg0, 6);
		local10 = new Class4_Sub4_Sub5();
		local10.anInt1083 = arg0;
		if (local20 != null) {
			local10.method734(new Class4_Sub13(local20));
		}
		local10.method735();
		if (local10.aBoolean34) {
			local10.aBoolean38 = false;
			local10.anInt1080 = 0;
		}
		Static70.aClass48_41.method1392(local10, (long) arg0);
		return local10;
	}
}
