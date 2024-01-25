import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!nd;")
	public static final Class214 aClass214_1 = new Class214();

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1031() {
		for (@Pc(1) int local1 = 0; local1 < Static18.anInt5706; local1++) {
			@Pc(6) int[] local6 = Static291.anIntArrayArray45[local1];
			for (@Pc(8) int local8 = 0; local8 < Static80.anInt1367; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1032(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static333.anInt6355;
		@Pc(3) int[] local3 = Static354.anIntArray461;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static429.anInt7650; local5++) {
			@Pc(15) Class15_Sub2_Sub4 local15;
			if (local5 < local1) {
				local15 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local5 - local1])).aClass15_Sub2_Sub4_Sub1_2;
			}
			if (local15.aByte98 == arg0 && local15.anInt8945 >= 0) {
				@Pc(39) int local39 = local15.method7135();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8911 & 0x1FF) != 0 || (local15.anInt8913 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8911 & 0x1FF) != 256 || (local15.anInt8913 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8911 >> 9;
					local80 = local15.anInt8913 >> 9;
					if (local15.anInt8945 > Static291.anIntArrayArray45[local75][local80]) {
						Static291.anIntArrayArray45[local75][local80] = local15.anInt8945;
						Static129.anIntArrayArray17[local75][local80] = 1;
					} else if (local15.anInt8945 == Static291.anIntArrayArray45[local75][local80]) {
						local116 = Static129.anIntArrayArray17[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8911 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8913 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8911 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8913 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8945 > Static291.anIntArrayArray45[local158][local161]) {
								Static291.anIntArrayArray45[local158][local161] = local15.anInt8945;
								Static129.anIntArrayArray17[local158][local161] = 1;
							} else if (local15.anInt8945 == Static291.anIntArrayArray45[local158][local161]) {
								local116 = Static129.anIntArrayArray17[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[IIIIII)V")
	public static void method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 > 0 && !Static331.method5078(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static331.method5078(arg1)) {
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg4 < arg1 ? arg4 : arg1;
			@Pc(57) int local57 = arg4 >> 1;
			@Pc(61) int local61 = arg1 >> 1;
			@Pc(68) int[] local68 = arg2;
			@Pc(73) int[] local73 = new int[local61 * local57];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local42, arg5, arg4, arg1, 0, 32993, arg0, local68, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(97) int local97 = arg4;
				@Pc(99) int[] local99 = local73;
				for (@Pc(101) int local101 = 0; local101 < local61; local101++) {
					for (@Pc(105) int local105 = 0; local105 < local57; local105++) {
						@Pc(112) int local112 = local68[local93++];
						@Pc(117) int local117 = local68[local97++];
						@Pc(122) int local122 = local68[local93++];
						@Pc(128) int local128 = local112 >> 24 & 0xFF;
						@Pc(134) int local134 = local112 >> 8 & 0xFF;
						@Pc(138) int local138 = local112 & 0xFF;
						@Pc(144) int local144 = local112 >> 16 & 0xFF;
						@Pc(149) int local149 = local68[local97++];
						@Pc(157) int local157 = local128 + (local122 >> 24 & 0xFF);
						@Pc(163) int local163 = local138 + (local122 & 0xFF);
						@Pc(171) int local171 = local134 + (local122 >> 8 & 0xFF);
						@Pc(179) int local179 = local144 + (local122 >> 16 & 0xFF);
						@Pc(187) int local187 = local157 + (local117 >> 24 & 0xFF);
						@Pc(195) int local195 = local171 + (local117 >> 8 & 0xFF);
						@Pc(203) int local203 = local179 + (local117 >> 16 & 0xFF);
						@Pc(209) int local209 = local163 + (local117 & 0xFF);
						@Pc(217) int local217 = local195 + (local149 >> 8 & 0xFF);
						@Pc(225) int local225 = local187 + (local149 >> 24 & 0xFF);
						@Pc(233) int local233 = local203 + (local149 >> 16 & 0xFF);
						@Pc(239) int local239 = local209 + (local149 & 0xFF);
						local73[local91++] = (local225 & 0x3FC) << 22 | (local233 & 0x3FC) << 14 | (local217 & 0x3FC) << 6 | local239 >> 2 & 0xFF;
					}
					local93 += arg4;
					local97 += arg4;
				}
				local73 = local68;
				local68 = local99;
				arg1 = local61;
				arg4 = local57;
				local53 >>= 0x1;
				local42++;
				local61 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1036() {
		Static413.anInt7396 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static429.anInt7650; local3++) {
			@Pc(14) Class15_Sub2_Sub4_Sub1 local14 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local3])).aClass15_Sub2_Sub4_Sub1_2;
			if (local14.aBoolean581 && local14.method7137() != -1) {
				@Pc(32) int local32 = (local14.method7135() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8911 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8913 - local32 >> 9;
				@Pc(53) Class15_Sub2_Sub4 local53 = Static337.method5187(local46, local14.aByte98, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8924;
					if (local53 instanceof Class15_Sub2_Sub4_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt8933 == 0 && local53.method7137() != -1) {
						Static161.anIntArray289[Static413.anInt7396] = local58;
						Static443.anIntArray561[Static413.anInt7396] = local58;
						Static413.anInt7396++;
						local53.anInt8933++;
					}
					Static161.anIntArray289[Static413.anInt7396] = local58;
					Static443.anIntArray561[Static413.anInt7396] = local14.anInt8924 + 2048;
					Static413.anInt7396++;
					local53.anInt8933++;
				}
			}
		}
		Static371.method6428(0, Static413.anInt7396 - 1, Static161.anIntArray289, Static443.anIntArray561);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!faa;)Lclient!faa;")
	public static Class97 method1038(@OriginalArg(0) Class97 arg0) {
		@Pc(4) int local4 = method1044(arg0).method5829();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static495.method7281(arg0.anInt2655);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1039(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static333.anInt6355;
		@Pc(3) int[] local3 = Static354.anIntArray461;
		@Pc(11) int local11 = Static228.aBoolean315 ? local1 : local1 + Static429.anInt7650;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class15_Sub2_Sub4 local23;
			if (local13 < local1) {
				local23 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local13 - local1])).aClass15_Sub2_Sub4_Sub1_2;
			}
			if (local23.aByte98 == arg0) {
				local23.anInt8933 = 0;
				if (local23.anInt8945 < 0) {
					local23.aBoolean581 = false;
				} else {
					@Pc(54) int local54 = local23.method7135();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8911 & 0x1FF) != 0 || (local23.anInt8913 & 0x1FF) != 0) {
							local23.aBoolean581 = false;
							continue;
						}
					} else if ((local23.anInt8911 & 0x1FF) != 256 || (local23.anInt8913 & 0x1FF) != 256) {
						local23.aBoolean581 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8911 >> 9;
						local101 = local23.anInt8913 >> 9;
						if (local23.anInt8945 != Static291.anIntArrayArray45[local96][local101]) {
							local23.aBoolean581 = true;
							continue;
						}
						if (Static129.anIntArrayArray17[local96][local101] > 1) {
							local126 = Static129.anIntArrayArray17[local96][local101]--;
							local23.aBoolean581 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8911 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8913 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8911 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8913 + local96 >> 9;
						if (!Static92.method1388(local23.anInt8945, local162, local101, local155, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8945 == Static291.anIntArrayArray45[local180][local183]) {
										local126 = Static129.anIntArrayArray17[local180][local183]--;
									}
								}
							}
							local23.aBoolean581 = true;
							continue;
						}
					}
					if (local23 instanceof Class15_Sub2_Sub4_Sub2 && local23.aClass6_Sub42_3 != null && Static363.anInt6671 >= local23.aClass6_Sub42_3.anInt8154 && Static363.anInt6671 < local23.aClass6_Sub42_3.anInt8165) {
						((Class15_Sub2_Sub4_Sub2) local23).aBoolean585 = false;
					}
					local23.aBoolean581 = false;
					local23.anInt8915 = Static37.method631(local23.anInt8913, local23.anInt8911, local23.aByte98);
					Static176.method7614(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1043() {
		@Pc(1) int local1 = Static333.anInt6355;
		@Pc(3) int[] local3 = Static354.anIntArray461;
		@Pc(20) boolean local20 = Static58.aClass6_Sub17_Sub1_1.anInt9277 == 1 && local1 > 200 || Static58.aClass6_Sub17_Sub1_1.anInt9277 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class15_Sub2_Sub4_Sub2 local29 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local3[local22]];
			if (local29.method7153()) {
				local29.method7122();
				if (local29.aShort116 >= 0 && local29.aShort114 >= 0 && local29.aShort115 < Static18.anInt5706 && local29.aShort117 < Static80.anInt1367) {
					local29.aBoolean585 = local29.aBoolean579 ? local20 : false;
					if (local29 == Static461.aClass15_Sub2_Sub4_Sub2_2) {
						local29.anInt8945 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean581) {
							local75++;
						}
						if (local29.anInt8987 > Static363.anInt6671) {
							local75 += 2;
						}
						local75 += 5 - local29.method7135() << 2;
						if (local29.aBoolean586) {
							local75 += 512;
						} else {
							if (Static460.anInt8096 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt8945 = local75 + 1;
					}
				} else {
					local29.anInt8945 = -1;
				}
			} else {
				local29.anInt8945 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static429.anInt7650; local116++) {
			@Pc(127) Class15_Sub2_Sub4_Sub1 local127 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local116])).aClass15_Sub2_Sub4_Sub1_2;
			if (local127.method4293() && local127.aClass88_1.method1946(Static65.aClass51_1)) {
				local127.method7122();
				if (local127.aShort116 >= 0 && local127.aShort114 >= 0 && local127.aShort115 < Static18.anInt5706 && local127.aShort117 < Static80.anInt1367) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean581) {
						local164++;
					}
					if (local127.anInt8987 > Static363.anInt6671) {
						local164 += 2;
					}
					local164 += 5 - local127.method7135() << 2;
					if (Static460.anInt8096 == 0) {
						if (local127.aClass88_1.aBoolean143) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static460.anInt8096 == 1) {
						if (local127.aClass88_1.aBoolean143) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass88_1.aBoolean140) {
						local164 += 1024;
					} else if (!local127.aClass88_1.aBoolean144) {
						local164 += 256;
					}
					local127.anInt8945 = local164 + 1;
				} else {
					local127.anInt8945 = -1;
				}
			} else {
				local127.anInt8945 = -1;
			}
		}
		for (local75 = 0; local75 < Static168.aClass279Array1.length; local75++) {
			@Pc(230) Class279 local230 = Static168.aClass279Array1[local75];
			if (local230 != null) {
				if (local230.anInt7966 == 1) {
					@Pc(244) Class6_Sub49 local244 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local230.anInt7964);
					if (local244 != null) {
						@Pc(249) Class15_Sub2_Sub4_Sub1 local249 = local244.aClass15_Sub2_Sub4_Sub1_2;
						if (local249.anInt8945 >= 0) {
							local249.anInt8945 += 2048;
						}
					}
				} else if (local230.anInt7966 == 10) {
					@Pc(268) Class15_Sub2_Sub4_Sub2 local268 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local230.anInt7964];
					if (local268 != null && local268 != Static461.aClass15_Sub2_Sub4_Sub2_2 && local268.anInt8945 >= 0) {
						local268.anInt8945 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!faa;)Lclient!po;")
	public static Class6_Sub39 method1044(@OriginalArg(0) Class97 arg0) {
		@Pc(13) Class6_Sub39 local13 = (Class6_Sub39) Static474.aClass234_40.method5464(((long) arg0.anInt2678 << 32) + (long) arg0.anInt2675);
		return local13 == null ? arg0.aClass6_Sub39_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!faa;IIIIIIIII)V")
	public static void method1045(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class97 local6 = arg0[local1];
			if (local6 != null && local6.anInt2655 == arg1) {
				@Pc(17) int local17 = local6.anInt2642 + arg6;
				@Pc(22) int local22 = local6.anInt2641 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2637 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2690;
					@Pc(45) int local45 = local22 + local6.anInt2670;
					if (local6.anInt2637 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2637 == 0 || local6.aBoolean195 || method1044(local6).anInt7305 != 0 || local6 == Static580.aClass97_26 || local6.anInt2625 == Static563.anInt9781) {
					if (!method1046(local6)) {
						if (local6 == Static165.aClass97_8 && Static479.method6668(Static165.aClass97_8) != null) {
							Static307.aBoolean405 = true;
							Static470.anInt8299 = local17;
							Static166.anInt4489 = local22;
						}
						if (local6.aBoolean208 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean202 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class6_Sub1 local152 = (Class6_Sub1) Static534.aClass298_190.method6809(); local152 != null; local152 = (Class6_Sub1) Static534.aClass298_190.method6821()) {
									if (local152.aBoolean4) {
										local152.method7948();
										local152.aClass97_2.aBoolean198 = false;
									}
								}
								if (Static237.anInt4306 == 0) {
									Static165.aClass97_8 = null;
									Static580.aClass97_26 = null;
								}
								Static437.anInt7773 = 0;
								Static40.aBoolean587 = false;
								Static295.aBoolean375 = false;
								if (!Static266.aBoolean351) {
									Static187.method3214();
								}
							}
							@Pc(208) boolean local208;
							if (Static9.aClass29_1.method2946() >= local28 && Static9.aClass29_1.method2942() >= local30 && Static9.aClass29_1.method2946() < local32 && Static9.aClass29_1.method2942() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static540.aBoolean580 && local208) {
								if (local6.anInt2663 >= 0) {
									Static427.anInt7590 = local6.anInt2663;
								} else if (local6.aBoolean202) {
									Static427.anInt7590 = -1;
								}
							}
							if (!Static266.aBoolean351 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static419.method6380(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(252) boolean local252 = false;
							if (Static9.aClass29_1.method2941() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class6_Sub41 local267 = (Class6_Sub41) Static43.aClass298_22.method6809();
							if (local267 != null && local267.method6484() == 0 && local267.method6487() >= local28 && local267.method6480() >= local30 && local267.method6487() < local32 && local267.method6480() < local34) {
								local262 = true;
							}
							@Pc(303) int local303;
							@Pc(437) int local437;
							if (local6.aByteArray39 != null && !Static234.method3603()) {
								for (local303 = 0; local303 < local6.aByteArray39.length; local303++) {
									if (Static184.aClass262_1.method6381(local6.aByteArray39[local303])) {
										if (local6.anIntArray271 == null || Static363.anInt6671 >= local6.anIntArray271[local303]) {
											@Pc(335) byte local335 = local6.aByteArray40[local303];
											if (local335 == 0 || ((local335 & 0x8) == 0 || !Static184.aClass262_1.method6381(86) && !Static184.aClass262_1.method6381(82) && !Static184.aClass262_1.method6381(81)) && ((local335 & 0x2) == 0 || Static184.aClass262_1.method6381(86)) && ((local335 & 0x1) == 0 || Static184.aClass262_1.method6381(82)) && ((local335 & 0x4) == 0 || Static184.aClass262_1.method6381(81))) {
												if (local303 < 10) {
													Static268.method4015("", local303 + 1, -1, local6.anInt2678);
												} else if (local303 == 10) {
													Static269.method4026();
													@Pc(406) Class6_Sub39 local406 = method1044(local6);
													Static249.method3893(local406.anInt7309, local406.method5834(), local6);
													Static195.aString36 = Static484.method6806(local6);
													if (Static195.aString36 == null) {
														Static195.aString36 = "Null";
													}
													Static185.aString34 = local6.aString20 + "<col=ffffff>";
												}
												local437 = local6.anIntArray276[local303];
												if (local6.anIntArray271 == null) {
													local6.anIntArray271 = new int[local6.aByteArray39.length];
												}
												if (local437 == 0) {
													local6.anIntArray271[local303] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray271[local303] = Static363.anInt6671 + local437;
												}
											}
										}
									} else if (local6.anIntArray271 != null) {
										local6.anIntArray271[local303] = 0;
									}
								}
							}
							if (local262) {
								Static151.method2390(local6, local267.method6487() - local17, local267.method6480() - local22);
							}
							if (Static165.aClass97_8 != null && Static165.aClass97_8 != local6 && local208 && method1044(local6).method5830()) {
								Static3.aClass97_17 = local6;
							}
							if (local6 == Static580.aClass97_26) {
								Static471.aBoolean538 = true;
								Static232.anInt9855 = local17;
								Static86.anInt9999 = local22;
							}
							if (local6.aBoolean195 || local6.anInt2625 != 0) {
								@Pc(522) Class6_Sub1 local522;
								if (local208 && Static502.anInt8744 != 0 && local6.anObjectArray5 != null) {
									local522 = new Class6_Sub1();
									local522.aBoolean4 = true;
									local522.aClass97_2 = local6;
									local522.anInt89 = Static502.anInt8744;
									local522.anObjectArray1 = local6.anObjectArray5;
									Static534.aClass298_190.method6812(local522);
								}
								if (Static165.aClass97_8 != null || Static266.aBoolean351 || local6.anInt2625 != Static171.anInt9042 && Static437.anInt7773 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(677) int local677;
								if (local6.anInt2625 != 0) {
									if (local6.anInt2625 == Static44.anInt827 || local6.anInt2625 == Static216.anInt1263) {
										Static264.aClass97_13 = local6;
										if (Static145.aClass141_1 != null) {
											Static145.aClass141_1.method3489(Static554.aClass90_12, local6.anInt2670);
										}
										if (local6.anInt2625 == Static44.anInt827) {
											if (!Static266.aBoolean351 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static306.method4600(arg8, arg9, Static554.aClass90_12);
												for (@Pc(605) Class60_Sub3 local605 = (Class60_Sub3) Static359.aClass349_16.method7890(); local605 != null; local605 = (Class60_Sub3) Static359.aClass349_16.method7896()) {
													if (arg8 >= local605.anInt3154 && arg8 < local605.anInt3153 && arg9 >= local605.anInt3152 && arg9 < local605.anInt3155) {
														Static187.method3214();
														Static538.method7330(local605.aClass15_Sub2_Sub4_1);
													}
												}
											}
											Static51.method778(local17, local6, local22);
											continue;
										}
									}
									@Pc(716) int local716;
									if (local6.anInt2625 == Static563.anInt9781) {
										if (local6.method2294(Static554.aClass90_12) == null || Static154.anInt2875 != 0 && Static154.anInt2875 != 3 || Static266.aBoolean351 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local303 = arg8 - local17;
										local677 = arg9 - local22;
										local437 = local6.anIntArray275[local677];
										if (local303 < local437 || local303 > local437 + local6.anIntArray277[local677]) {
											continue;
										}
										local303 -= local6.anInt2690 / 2;
										local677 -= local6.anInt2670 / 2;
										if (Static60.anInt1008 == 4) {
											local716 = (int) Static562.aFloat14 & 0x3FFF;
										} else {
											local716 = (int) Static562.aFloat14 + Static63.anInt1086 & 0x3FFF;
										}
										@Pc(728) int local728 = Class22.anIntArray20[local716];
										@Pc(732) int local732 = Class22.anIntArray19[local716];
										if (Static60.anInt1008 != 4) {
											local728 = local728 * (Static213.anInt4015 + 256) >> 8;
											local732 = local732 * (Static213.anInt4015 + 256) >> 8;
										}
										@Pc(761) int local761 = local677 * local728 + local303 * local732 >> 14;
										@Pc(771) int local771 = local677 * local732 - local303 * local728 >> 14;
										@Pc(782) int local782;
										@Pc(790) int local790;
										if (Static60.anInt1008 == 4) {
											local782 = (Static173.anInt3141 >> 9) + (local761 >> 2);
											local790 = (Static450.anInt7952 >> 9) - (local771 >> 2);
										} else {
											@Pc(799) int local799 = (Static461.aClass15_Sub2_Sub4_Sub2_2.method7135() - 1) * 256;
											local782 = (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 - local799 >> 9) + (local761 >> 2);
											local790 = (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 - local799 >> 9) - (local771 >> 2);
										}
										if (Static540.aBoolean580 && (Static243.anInt4471 & 0x40) != 0) {
											@Pc(832) Class97 local832 = Static76.method1088(Static152.anInt1934, Static96.anInt7891);
											if (local832 == null) {
												Static269.method4026();
											} else {
												Static133.method2173(" ->", local782, 58, local6.anInt2607, local790, 1L, Static291.anInt5333, true, Static195.aString36, false);
											}
											continue;
										}
										if (Static172.aClass68_4 == Static14.aClass68_6) {
											Static133.method2173("", local782, 6, -1, local790, 1L, -1, true, Static146.aClass103_74.method2355(Static188.anInt28), false);
										}
										Static133.method2173("", local782, 21, -1, local790, 1L, Static568.anInt9829, true, Static263.aString38, false);
										continue;
									}
									if (local6.anInt2625 == Static171.anInt9042) {
										Static496.aClass97_24 = local6;
										if (local208) {
											Static40.aBoolean587 = true;
										}
										if (local262) {
											local303 = (int) ((double) (local267.method6487() - local17 - local6.anInt2690 / 2) * 2.0D / (double) Static490.aFloat34);
											local677 = (int) -((double) (local267.method6480() - local22 - local6.anInt2670 / 2) * 2.0D / (double) Static490.aFloat34);
											local437 = Static441.anInt3925 + local303 + Static490.anInt1918;
											local716 = Static30.anInt535 + local677 + Static490.anInt1917;
											@Pc(946) Class6_Sub5_Sub2 local946 = Static529.method7816();
											if (local946 == null) {
												continue;
											}
											@Pc(951) int[] local951 = new int[3];
											local946.method1836(local437, local716, local951);
											if (local951 != null) {
												if (Static184.aClass262_1.method6381(82) && Static113.anInt1927 > 0) {
													Static103.method1603(local951[0], local951[2], local951[1]);
													continue;
												}
												Static295.aBoolean375 = true;
												Static33.anInt607 = local951[0];
												Static82.anInt1380 = local951[1];
												Static133.anInt2534 = local951[2];
											}
											Static437.anInt7773 = 1;
											Static41.aBoolean52 = false;
											Static403.anInt7295 = Static9.aClass29_1.method2946();
											Static63.anInt1087 = Static9.aClass29_1.method2942();
											continue;
										}
										if (local252 && Static437.anInt7773 > 0) {
											if (Static437.anInt7773 == 1 && (Static403.anInt7295 != Static9.aClass29_1.method2946() || Static63.anInt1087 != Static9.aClass29_1.method2942())) {
												Static14.anInt7435 = Static441.anInt3925;
												Static130.anInt2298 = Static30.anInt535;
												Static437.anInt7773 = 2;
											}
											if (Static437.anInt7773 == 2) {
												Static41.aBoolean52 = true;
												Static557.method7740(Static14.anInt7435 + (int) ((double) (Static403.anInt7295 - Static9.aClass29_1.method2946()) * 2.0D / (double) Static490.aFloat33));
												Static538.method7331(Static130.anInt2298 - (int) ((double) (Static63.anInt1087 - Static9.aClass29_1.method2942()) * 2.0D / (double) Static490.aFloat33));
											}
											continue;
										}
										if (Static437.anInt7773 > 0 && !Static41.aBoolean52) {
											if ((Static451.anInt7957 == 1 || Static76.method1089()) && Static384.anInt7048 > 2) {
												Static108.method1674(Static63.anInt1087, Static403.anInt7295);
											} else if (Static53.method7124()) {
												Static108.method1674(Static63.anInt1087, Static403.anInt7295);
											}
										}
										Static437.anInt7773 = 0;
										continue;
									}
									if (local6.anInt2625 == Static528.anInt9121) {
										if (local252) {
											Static402.method5812(local6.anInt2690, Static9.aClass29_1.method2942() - local22, Static9.aClass29_1.method2946() - local17, local6.anInt2670);
										}
										continue;
									}
									if (local6.anInt2625 == Static235.anInt4240) {
										Static138.method2967(local17, local22, local6);
										continue;
									}
								}
								if (!local6.aBoolean204 && local262) {
									local6.aBoolean204 = true;
									if (local6.anObjectArray28 != null) {
										local522 = new Class6_Sub1();
										local522.aBoolean4 = true;
										local522.aClass97_2 = local6;
										local522.anInt92 = local267.method6487() - local17;
										local522.anInt89 = local267.method6480() - local22;
										local522.anObjectArray1 = local6.anObjectArray28;
										Static534.aClass298_190.method6812(local522);
									}
								}
								if (local6.aBoolean204 && local252 && local6.anObjectArray21 != null) {
									local522 = new Class6_Sub1();
									local522.aBoolean4 = true;
									local522.aClass97_2 = local6;
									local522.anInt92 = Static9.aClass29_1.method2946() - local17;
									local522.anInt89 = Static9.aClass29_1.method2942() - local22;
									local522.anObjectArray1 = local6.anObjectArray21;
									Static534.aClass298_190.method6812(local522);
								}
								if (local6.aBoolean204 && !local252) {
									local6.aBoolean204 = false;
									if (local6.anObjectArray13 != null) {
										local522 = new Class6_Sub1();
										local522.aBoolean4 = true;
										local522.aClass97_2 = local6;
										local522.anInt92 = Static9.aClass29_1.method2946() - local17;
										local522.anInt89 = Static9.aClass29_1.method2942() - local22;
										local522.anObjectArray1 = local6.anObjectArray13;
										Static346.aClass298_129.method6812(local522);
									}
								}
								if (local252 && local6.anObjectArray19 != null) {
									local522 = new Class6_Sub1();
									local522.aBoolean4 = true;
									local522.aClass97_2 = local6;
									local522.anInt92 = Static9.aClass29_1.method2946() - local17;
									local522.anInt89 = Static9.aClass29_1.method2942() - local22;
									local522.anObjectArray1 = local6.anObjectArray19;
									Static534.aClass298_190.method6812(local522);
								}
								if (!local6.aBoolean198 && local208) {
									local6.aBoolean198 = true;
									if (local6.anObjectArray7 != null) {
										local522 = new Class6_Sub1();
										local522.aBoolean4 = true;
										local522.aClass97_2 = local6;
										local522.anInt92 = Static9.aClass29_1.method2946() - local17;
										local522.anInt89 = Static9.aClass29_1.method2942() - local22;
										local522.anObjectArray1 = local6.anObjectArray7;
										Static534.aClass298_190.method6812(local522);
									}
								}
								if (local6.aBoolean198 && local208 && local6.anObjectArray31 != null) {
									local522 = new Class6_Sub1();
									local522.aBoolean4 = true;
									local522.aClass97_2 = local6;
									local522.anInt92 = Static9.aClass29_1.method2946() - local17;
									local522.anInt89 = Static9.aClass29_1.method2942() - local22;
									local522.anObjectArray1 = local6.anObjectArray31;
									Static534.aClass298_190.method6812(local522);
								}
								if (local6.aBoolean198 && !local208) {
									local6.aBoolean198 = false;
									if (local6.anObjectArray25 != null) {
										local522 = new Class6_Sub1();
										local522.aBoolean4 = true;
										local522.aClass97_2 = local6;
										local522.anInt92 = Static9.aClass29_1.method2946() - local17;
										local522.anInt89 = Static9.aClass29_1.method2942() - local22;
										local522.anObjectArray1 = local6.anObjectArray25;
										Static346.aClass298_129.method6812(local522);
									}
								}
								if (local6.anObjectArray32 != null) {
									local522 = new Class6_Sub1();
									local522.aClass97_2 = local6;
									local522.anObjectArray1 = local6.anObjectArray32;
									Static161.aClass298_66.method6812(local522);
								}
								@Pc(1490) Class6_Sub1 local1490;
								if (local6.anObjectArray15 != null && Static73.anInt1194 > local6.anInt2608) {
									if (local6.anIntArray273 == null || Static73.anInt1194 - local6.anInt2608 > 32) {
										local522 = new Class6_Sub1();
										local522.aClass97_2 = local6;
										local522.anObjectArray1 = local6.anObjectArray15;
										Static534.aClass298_190.method6812(local522);
									} else {
										label681: for (local303 = local6.anInt2608; local303 < Static73.anInt1194; local303++) {
											local677 = Static219.anIntArray345[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray273.length; local437++) {
												if (local6.anIntArray273[local437] == local677) {
													local1490 = new Class6_Sub1();
													local1490.aClass97_2 = local6;
													local1490.anObjectArray1 = local6.anObjectArray15;
													Static534.aClass298_190.method6812(local1490);
													break label681;
												}
											}
										}
									}
									local6.anInt2608 = Static73.anInt1194;
								}
								if (local6.anObjectArray23 != null && Static551.anInt9633 > local6.anInt2643) {
									if (local6.anIntArray270 == null || Static551.anInt9633 - local6.anInt2643 > 32) {
										local522 = new Class6_Sub1();
										local522.aClass97_2 = local6;
										local522.anObjectArray1 = local6.anObjectArray23;
										Static534.aClass298_190.method6812(local522);
									} else {
										label657: for (local303 = local6.anInt2643; local303 < Static551.anInt9633; local303++) {
											local677 = Static525.anIntArray641[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray270.length; local437++) {
												if (local6.anIntArray270[local437] == local677) {
													local1490 = new Class6_Sub1();
													local1490.aClass97_2 = local6;
													local1490.anObjectArray1 = local6.anObjectArray23;
													Static534.aClass298_190.method6812(local1490);
													break label657;
												}
											}
										}
									}
									local6.anInt2643 = Static551.anInt9633;
								}
								if (local6.anObjectArray14 != null && Static383.anInt7015 > local6.anInt2657) {
									if (local6.anIntArray278 == null || Static383.anInt7015 - local6.anInt2657 > 32) {
										local522 = new Class6_Sub1();
										local522.aClass97_2 = local6;
										local522.anObjectArray1 = local6.anObjectArray14;
										Static534.aClass298_190.method6812(local522);
									} else {
										label633: for (local303 = local6.anInt2657; local303 < Static383.anInt7015; local303++) {
											local677 = Static354.anIntArray462[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray278.length; local437++) {
												if (local6.anIntArray278[local437] == local677) {
													local1490 = new Class6_Sub1();
													local1490.aClass97_2 = local6;
													local1490.anObjectArray1 = local6.anObjectArray14;
													Static534.aClass298_190.method6812(local1490);
													break label633;
												}
											}
										}
									}
									local6.anInt2657 = Static383.anInt7015;
								}
								if (local6.anObjectArray18 != null && Static350.anInt6572 > local6.anInt2688) {
									if (local6.anIntArray269 == null || Static350.anInt6572 - local6.anInt2688 > 32) {
										local522 = new Class6_Sub1();
										local522.aClass97_2 = local6;
										local522.anObjectArray1 = local6.anObjectArray18;
										Static534.aClass298_190.method6812(local522);
									} else {
										label609: for (local303 = local6.anInt2688; local303 < Static350.anInt6572; local303++) {
											local677 = Static205.anIntArray339[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray269.length; local437++) {
												if (local6.anIntArray269[local437] == local677) {
													local1490 = new Class6_Sub1();
													local1490.aClass97_2 = local6;
													local1490.anObjectArray1 = local6.anObjectArray18;
													Static534.aClass298_190.method6812(local1490);
													break label609;
												}
											}
										}
									}
									local6.anInt2688 = Static350.anInt6572;
								}
								if (local6.anObjectArray22 != null && Static569.anInt9839 > local6.anInt2629) {
									if (local6.anIntArray274 == null || Static569.anInt9839 - local6.anInt2629 > 32) {
										local522 = new Class6_Sub1();
										local522.aClass97_2 = local6;
										local522.anObjectArray1 = local6.anObjectArray22;
										Static534.aClass298_190.method6812(local522);
									} else {
										label585: for (local303 = local6.anInt2629; local303 < Static569.anInt9839; local303++) {
											local677 = Static377.anIntArray486[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray274.length; local437++) {
												if (local6.anIntArray274[local437] == local677) {
													local1490 = new Class6_Sub1();
													local1490.aClass97_2 = local6;
													local1490.anObjectArray1 = local6.anObjectArray22;
													Static534.aClass298_190.method6812(local1490);
													break label585;
												}
											}
										}
									}
									local6.anInt2629 = Static569.anInt9839;
								}
								if (Static336.anInt6407 > local6.anInt2613 && local6.anObjectArray20 != null) {
									local522 = new Class6_Sub1();
									local522.aClass97_2 = local6;
									local522.anObjectArray1 = local6.anObjectArray20;
									Static534.aClass298_190.method6812(local522);
								}
								if (Static83.anInt1400 > local6.anInt2613 && local6.anObjectArray26 != null) {
									local522 = new Class6_Sub1();
									local522.aClass97_2 = local6;
									local522.anObjectArray1 = local6.anObjectArray26;
									Static534.aClass298_190.method6812(local522);
								}
								if (Static451.anInt7959 > local6.anInt2613 && local6.anObjectArray4 != null) {
									local522 = new Class6_Sub1();
									local522.aClass97_2 = local6;
									local522.anObjectArray1 = local6.anObjectArray4;
									Static534.aClass298_190.method6812(local522);
								}
								if (Static237.anInt4305 > local6.anInt2613 && local6.anObjectArray27 != null) {
									local522 = new Class6_Sub1();
									local522.aClass97_2 = local6;
									local522.anObjectArray1 = local6.anObjectArray27;
									Static534.aClass298_190.method6812(local522);
								}
								if (Static390.anInt7115 > local6.anInt2613 && local6.anObjectArray3 != null) {
									local522 = new Class6_Sub1();
									local522.aClass97_2 = local6;
									local522.anObjectArray1 = local6.anObjectArray3;
									Static534.aClass298_190.method6812(local522);
								}
								local6.anInt2613 = Static124.anInt2133;
								if (local6.anObjectArray16 != null) {
									for (local303 = 0; local303 < Static459.anInt8079; local303++) {
										@Pc(1958) Class6_Sub1 local1958 = new Class6_Sub1();
										local1958.aClass97_2 = local6;
										local1958.anInt91 = Static80.anInterface5Array1[local303].method6889();
										local1958.anInt86 = Static80.anInterface5Array1[local303].method6890();
										local1958.anObjectArray1 = local6.anObjectArray16;
										Static534.aClass298_190.method6812(local1958);
									}
								}
								if (Static551.aBoolean656 && local6.anObjectArray30 != null) {
									local522 = new Class6_Sub1();
									local522.aClass97_2 = local6;
									local522.anObjectArray1 = local6.anObjectArray30;
									Static534.aClass298_190.method6812(local522);
								}
							}
							if (local6.anInt2637 == 5 && local6.anInt2654 != -1) {
								local6.method2281(Static376.aClass116_1, Static57.aClass14_1).method3489(Static554.aClass90_12, local6.anInt2670);
							}
							Static276.method4137(local6);
							if (local6.anInt2637 == 0) {
								method1045(arg0, local6.anInt2678, local28, local30, local32, local34, local17 - local6.anInt2691, local22 - local6.anInt2665, arg8, arg9);
								if (local6.aClass97Array2 != null) {
									method1045(local6.aClass97Array2, local6.anInt2678, local28, local30, local32, local34, local17 - local6.anInt2691, local22 - local6.anInt2665, arg8, arg9);
								}
								@Pc(2080) Class6_Sub43 local2080 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local6.anInt2678);
								if (local2080 != null) {
									if (Static172.aClass68_4 == Static126.aClass68_3 && local2080.anInt8194 == 0 && !Static266.aBoolean351 && local208 && !Static37.aBoolean48) {
										Static187.method3214();
									}
									Static93.method1390(local30, local22, local28, local17, local2080.anInt8192, local34, arg9, local32, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static276.method4137(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!faa;)Z")
	public static boolean method1046(@OriginalArg(0) Class97 arg0) {
		if (Static37.aBoolean48) {
			if (method1044(arg0).anInt7305 != 0) {
				return false;
			}
			if (arg0.anInt2637 == 0) {
				return false;
			}
		}
		return arg0.aBoolean200;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1048() {
		@Pc(1) int local1 = Static333.anInt6355;
		@Pc(3) int[] local3 = Static354.anIntArray461;
		@Pc(11) int local11 = Static228.aBoolean315 ? local1 : local1 + Static429.anInt7650;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class15_Sub2_Sub4 local23;
			if (local13 < local1) {
				local23 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local13 - local1])).aClass15_Sub2_Sub4_Sub1_2;
			}
			if (local23.anInt8945 >= 0) {
				@Pc(43) int local43 = local23.method7135();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8911 & 0x1FF) == 0 && (local23.anInt8913 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8911 & 0x1FF) == 256 && (local23.anInt8913 & 0x1FF) == 256) {
					continue;
				}
				if (local23 instanceof Class15_Sub2_Sub4_Sub2 && local23.aClass6_Sub42_3 != null && Static363.anInt6671 >= local23.aClass6_Sub42_3.anInt8154 && Static363.anInt6671 < local23.aClass6_Sub42_3.anInt8165) {
					((Class15_Sub2_Sub4_Sub2) local23).aBoolean585 = false;
				}
				local23.anInt8915 = Static37.method631(local23.anInt8913, local23.anInt8911, local23.aByte98);
				Static176.method7614(local23, true);
			}
		}
	}
}
