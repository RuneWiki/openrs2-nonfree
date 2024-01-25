import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	public static final int[] anIntArray63 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1029() {
		@Pc(14) boolean local14 = Static232.anInt2218 == 1 && Static307.anInt2887 > 200 || Static232.anInt2218 == 0 && Static307.anInt2887 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static307.anInt2887; local16++) {
			@Pc(23) Class10_Sub3_Sub3_Sub2 local23 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local16]];
			if (local23.method5376()) {
				local23.method5347();
				if (local23.aShort83 >= 0 && local23.aShort82 >= 0 && local23.aShort80 < Static195.anInt3965 && local23.aShort81 < Static298.anInt5716) {
					local23.aBoolean418 = local23.aBoolean414 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean413) {
						local62++;
					}
					if (local23.anInt5949 > Static153.anInt3257) {
						local62 += 2;
					}
					local62 += 5 - local23.method5353() << 2;
					if (Static189.anInt6153 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt5950 = local62 + 1;
				} else {
					local23.anInt5950 = -1;
				}
			} else {
				local23.anInt5950 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static315.anInt6456; local98++) {
			@Pc(105) Class10_Sub3_Sub3_Sub1 local105 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local98]];
			if (local105.method4960() && local105.aClass192_1.method5277()) {
				local105.method5347();
				if (local105.aShort83 >= 0 && local105.aShort82 >= 0 && local105.aShort80 < Static195.anInt3965 && local105.aShort81 < Static298.anInt5716) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean413) {
						local141++;
					}
					if (local105.anInt5949 > Static153.anInt3257) {
						local141 += 2;
					}
					local141 += 5 - local105.method5353() << 2;
					if (Static189.anInt6153 == 0) {
						if (local105.aClass192_1.aBoolean405) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static189.anInt6153 == 1) {
						if (local105.aClass192_1.aBoolean405) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass192_1.aBoolean407) {
						local141 += 512;
					} else if (!local105.aClass192_1.aBoolean406) {
						local141 += 256;
					}
					local105.anInt5950 = local141 + 1;
				} else {
					local105.anInt5950 = -1;
				}
			} else {
				local105.anInt5950 = -1;
			}
		}
		for (local62 = 0; local62 < Static27.aClass113Array1.length; local62++) {
			@Pc(207) Class113 local207 = Static27.aClass113Array1[local62];
			if (local207 != null) {
				if (local207.anInt3406 == 1) {
					@Pc(218) Class10_Sub3_Sub3_Sub1 local218 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local207.anInt3403];
					if (local218 != null && local218.anInt5950 >= 0) {
						local218.anInt5950 += 1024;
					}
				} else if (local207.anInt3406 == 10) {
					@Pc(239) Class10_Sub3_Sub3_Sub2 local239 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local207.anInt3403];
					if (local239 != null && local239.anInt5950 >= 0) {
						local239.anInt5950 += 1024;
					}
				}
			}
		}
		Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5950 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1031() {
		Static282.anInt5372 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static315.anInt6456; local3++) {
			@Pc(10) Class10_Sub3_Sub3_Sub1 local10 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local3]];
			if (local10.aBoolean413 && local10.method5358() != -1) {
				@Pc(28) int local28 = (local10.method5353() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5910 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5908 - local28 >> 7;
				@Pc(48) Class10_Sub3_Sub3 local48 = Static224.method4009(Static219.anInt4400, local35, local42);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt5954;
					if (local48 instanceof Class10_Sub3_Sub3_Sub1) {
						local53 += 2048;
					}
					if (local48.anInt5923 == 0 && local48.method5358() != -1) {
						Static285.anIntArray493[Static282.anInt5372] = local53;
						Static179.anIntArray318[Static282.anInt5372] = local53;
						Static282.anInt5372++;
						local48.anInt5923++;
					}
					Static285.anIntArray493[Static282.anInt5372] = local53;
					Static179.anIntArray318[Static282.anInt5372] = local10.anInt5954 + 2048;
					Static282.anInt5372++;
					local48.anInt5923++;
				}
			}
		}
		Static148.method2976(Static282.anInt5372 - 1, Static179.anIntArray318, Static285.anIntArray493, 0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1032() {
		@Pc(7) int local7 = Static265.aBoolean336 ? Static307.anInt2887 : Static307.anInt2887 + Static315.anInt6456;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class10_Sub3_Sub3 local14;
			if (local9 < 0) {
				local14 = Static173.aClass10_Sub3_Sub3_Sub2_1;
			} else if (local9 < Static307.anInt2887) {
				local14 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local9]];
			} else {
				local14 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local9 - Static307.anInt2887]];
			}
			local14.anInt5923 = 0;
			if (local14.anInt5950 < 0) {
				local14.aBoolean413 = false;
			} else {
				@Pc(47) int local47 = local14.method5353();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt5910 & 0x7F) != 0 || (local14.anInt5908 & 0x7F) != 0) {
						local14.aBoolean413 = false;
						continue;
					}
				} else if ((local14.anInt5910 & 0x7F) != 64 || (local14.anInt5908 & 0x7F) != 64) {
					local14.aBoolean413 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt5910 >> 7;
					local94 = local14.anInt5908 >> 7;
					if (local14.anInt5950 != Static134.anIntArrayArray45[local89][local94]) {
						local14.aBoolean413 = true;
						continue;
					}
					if (Static353.anIntArrayArray97[local89][local94] > 1) {
						local119 = Static353.anIntArrayArray97[local89][local94]--;
						local14.aBoolean413 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt5910 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt5908 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt5910 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt5908 + local89 >> 7;
					if (!Static185.method3546(local148, local162, local14.anInt5950, local155, local94)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt5950 == Static134.anIntArrayArray45[local173][local176]) {
									local119 = Static353.anIntArrayArray97[local173][local176]--;
								}
							}
						}
						local14.aBoolean413 = true;
						continue;
					}
				}
				if (local14 instanceof Class10_Sub3_Sub3_Sub2 && local14.anInterface7_3 != null && Static153.anInt3257 >= local14.anInt5985 && Static153.anInt3257 < local14.anInt5980) {
					((Class10_Sub3_Sub3_Sub2) local14).aBoolean418 = false;
				}
				local14.aBoolean413 = false;
				local14.anInt5907 = Static279.method4730(Static219.anInt4400, local14.anInt5910, local14.anInt5908);
				Static194.method3667(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1034() {
		for (@Pc(1) int local1 = 0; local1 < Static195.anInt3965; local1++) {
			@Pc(6) int[] local6 = Static134.anIntArrayArray45[local1];
			for (@Pc(8) int local8 = 0; local8 < Static298.anInt5716; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method1036() {
		@Pc(7) int local7 = Static265.aBoolean336 ? Static307.anInt2887 : Static307.anInt2887 + Static315.anInt6456;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class10_Sub3_Sub3 local14;
			if (local9 < 0) {
				local14 = Static173.aClass10_Sub3_Sub3_Sub2_1;
			} else if (local9 < Static307.anInt2887) {
				local14 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local9]];
			} else {
				local14 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local9 - Static307.anInt2887]];
			}
			if (local14.anInt5950 >= 0) {
				@Pc(40) int local40 = local14.method5353();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt5910 & 0x7F) == 0 && (local14.anInt5908 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt5910 & 0x7F) == 64 && (local14.anInt5908 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class10_Sub3_Sub3_Sub2 && local14.anInterface7_3 != null && Static153.anInt3257 >= local14.anInt5985 && Static153.anInt3257 < local14.anInt5980) {
					((Class10_Sub3_Sub3_Sub2) local14).aBoolean418 = false;
				}
				local14.anInt5907 = Static279.method4730(Static219.anInt4400, local14.anInt5910, local14.anInt5908);
				Static194.method3667(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ne;)Z")
	public static boolean method1037(@OriginalArg(0) Class146 arg0) {
		if (Static195.aBoolean248) {
			if (method1040(arg0).anInt2702 != 0) {
				return false;
			}
			if (arg0.anInt4135 == 0) {
				return false;
			}
		}
		return arg0.aBoolean268;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!ne;I)V")
	public static void method1039(@OriginalArg(0) int arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte42 == 0) {
			arg1.anInt4161 = arg1.anInt4148;
		} else if (arg1.aByte42 == 1) {
			arg1.anInt4161 = arg1.anInt4148 + (arg0 - arg1.anInt4133) / 2;
		} else if (arg1.aByte42 == 2) {
			arg1.anInt4161 = arg0 - arg1.anInt4133 - arg1.anInt4148;
		} else if (arg1.aByte42 == 3) {
			arg1.anInt4161 = arg0 * arg1.anInt4148 >> 14;
		} else if (arg1.aByte42 == 4) {
			arg1.anInt4161 = (arg0 - arg1.anInt4133) / 2 + (arg1.anInt4148 * arg0 >> 14);
		} else {
			arg1.anInt4161 = arg0 - arg1.anInt4133 - (arg1.anInt4148 * arg0 >> 14);
		}
		if (arg1.aByte41 == 0) {
			arg1.anInt4140 = arg1.anInt4196;
		} else if (arg1.aByte41 == 1) {
			arg1.anInt4140 = arg1.anInt4196 + (arg2 - arg1.anInt4199) / 2;
		} else if (arg1.aByte41 == 2) {
			arg1.anInt4140 = arg2 - arg1.anInt4199 - arg1.anInt4196;
		} else if (arg1.aByte41 == 3) {
			arg1.anInt4140 = arg2 * arg1.anInt4196 >> 14;
		} else if (arg1.aByte41 == 4) {
			arg1.anInt4140 = (arg1.anInt4196 * arg2 >> 14) + (arg2 - arg1.anInt4199) / 2;
		} else {
			arg1.anInt4140 = arg2 - arg1.anInt4199 - (arg1.anInt4196 * arg2 >> 14);
		}
		if (!Static195.aBoolean248 || method1040(arg1).anInt2702 == 0 && arg1.anInt4135 != 0) {
			return;
		}
		if (arg1.anInt4161 < 0) {
			arg1.anInt4161 = 0;
		} else if (arg1.anInt4133 + arg1.anInt4161 > arg0) {
			arg1.anInt4161 = arg0 - arg1.anInt4133;
		}
		if (arg1.anInt4140 < 0) {
			arg1.anInt4140 = 0;
		} else if (arg1.anInt4140 + arg1.anInt4199 > arg2) {
			arg1.anInt4140 = arg2 - arg1.anInt4199;
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ne;)Lclient!hk;")
	public static Class14_Sub17 method1040(@OriginalArg(0) Class146 arg0) {
		@Pc(13) Class14_Sub17 local13 = (Class14_Sub17) Static235.aClass25_23.method691(((long) arg0.anInt4214 << 32) + (long) arg0.anInt4126);
		return local13 == null ? arg0.aClass14_Sub17_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method1042() {
		for (@Pc(1) int local1 = -1; local1 < Static307.anInt2887 + Static315.anInt6456; local1++) {
			@Pc(6) Class10_Sub3_Sub3 local6;
			if (local1 < 0) {
				local6 = Static173.aClass10_Sub3_Sub3_Sub2_1;
			} else if (local1 < Static307.anInt2887) {
				local6 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local1]];
			} else {
				local6 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local1 - Static307.anInt2887]];
			}
			if (local6.anInt5950 >= 0) {
				@Pc(32) int local32 = local6.method5353();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt5910 & 0x7F) != 0 || (local6.anInt5908 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt5910 & 0x7F) != 64 || (local6.anInt5908 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt5910 >> 7;
					local73 = local6.anInt5908 >> 7;
					if (local6.anInt5950 > Static134.anIntArrayArray45[local68][local73]) {
						Static134.anIntArrayArray45[local68][local73] = local6.anInt5950;
						Static353.anIntArrayArray97[local68][local73] = 1;
					} else if (local6.anInt5950 == Static134.anIntArrayArray45[local68][local73]) {
						local109 = Static353.anIntArrayArray97[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt5910 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt5908 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt5910 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt5908 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt5950 > Static134.anIntArrayArray45[local151][local154]) {
								Static134.anIntArrayArray45[local151][local154] = local6.anInt5950;
								Static353.anIntArrayArray97[local151][local154] = 1;
							} else if (local6.anInt5950 == Static134.anIntArrayArray45[local151][local154]) {
								local109 = Static353.anIntArrayArray97[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ne;IIIIIIIII)V")
	public static void method1043(@OriginalArg(0) Class146[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class146 local6 = arg0[local1];
			if (local6 != null && local6.anInt4146 == arg1) {
				@Pc(17) int local17 = local6.anInt4161 + arg6;
				@Pc(22) int local22 = local6.anInt4140 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4135 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4133;
					@Pc(45) int local45 = local22 + local6.anInt4199;
					if (local6.anInt4135 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean260 || local6.anInt4135 == 0 || local6.aBoolean273 || method1040(local6).anInt2702 != 0 || local6 == Static30.aClass146_8 || local6.anInt4198 == 1338) {
					if (!local6.aBoolean260 || !method1037(local6)) {
						if (local6 == Static94.aClass146_21) {
							Static61.aBoolean93 = true;
							Static49.anInt1234 = local17;
							Static120.anInt2681 = local22;
						}
						if (!local6.aBoolean260 || local6.aBoolean274 || local28 < local32 && local30 < local34) {
							if (local6.anInt4135 == 0) {
								if (!local6.aBoolean260 && method1037(local6) && Static86.aClass146_19 != local6) {
									continue;
								}
								if (local6.aBoolean261 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
									for (@Pc(175) Class14_Sub15 local175 = (Class14_Sub15) Static307.aClass18_11.method459(); local175 != null; local175 = (Class14_Sub15) Static307.aClass18_11.method453()) {
										if (local175.aBoolean158) {
											local175.method5986();
											local175.aClass146_22.aBoolean269 = false;
										}
									}
									if (Static130.anInt2810 == 0) {
										Static94.aClass146_21 = null;
										Static30.aClass146_8 = null;
									}
									Static86.anInt2091 = 0;
									Static151.aBoolean210 = false;
									Static278.aBoolean349 = false;
									if (!Static302.aBoolean409) {
										Static188.method3593();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static63.anInt1529 >= local28 && Static328.anInt6333 >= local30 && Static63.anInt1529 < local32 && Static328.anInt6333 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static302.aBoolean409 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static53.method1256(arg8 - local17, arg9 - local22, local6);
							}
							if (local6.aBoolean260) {
								@Pc(254) boolean local254 = false;
								if (Static199.anInt4021 == 1 && local223) {
									local254 = true;
								}
								@Pc(263) boolean local263 = false;
								if (Static68.anInt1636 == 1 && Static272.anInt5167 >= local28 && Static321.anInt6195 >= local30 && Static272.anInt5167 < local32 && Static321.anInt6195 < local34) {
									local263 = true;
								}
								@Pc(285) int local285;
								@Pc(374) int local374;
								if (local6.aByteArray119 != null) {
									for (local285 = 0; local285 < local6.aByteArray119.length; local285++) {
										if (Static345.aBooleanArray30[local6.aByteArray119[local285]]) {
											if (local6.anIntArray373 == null || Static153.anInt3257 >= local6.anIntArray373[local285]) {
												@Pc(316) byte local316 = local6.aByteArray120[local285];
												if (local316 == 0 || ((local316 & 0x8) == 0 || !Static345.aBooleanArray30[86] && !Static345.aBooleanArray30[82] && !Static345.aBooleanArray30[81]) && ((local316 & 0x2) == 0 || Static345.aBooleanArray30[86]) && ((local316 & 0x1) == 0 || Static345.aBooleanArray30[82]) && ((local316 & 0x4) == 0 || Static345.aBooleanArray30[81])) {
													Static174.method3390("", local6.anInt4214, local285 + 1, -1);
													local374 = local6.anIntArray367[local285];
													if (local6.anIntArray373 == null) {
														local6.anIntArray373 = new int[local6.aByteArray119.length];
													}
													if (local374 == 0) {
														local6.anIntArray373[local285] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray373[local285] = Static153.anInt3257 + local374;
													}
												}
											}
										} else if (local6.anIntArray373 != null) {
											local6.anIntArray373[local285] = 0;
										}
									}
								}
								if (local263) {
									Static215.method3863(Static321.anInt6195 - local22, Static272.anInt5167 - local17, local6);
								}
								if (Static94.aClass146_21 != null && Static94.aClass146_21 != local6 && local223 && method1040(local6).method2575()) {
									Static281.aClass146_52 = local6;
								}
								if (local6 == Static30.aClass146_8) {
									Static111.aBoolean173 = true;
									Static105.anInt2334 = local17;
									Static164.anInt3457 = local22;
								}
								if (local6.aBoolean273 || local6.anInt4198 != 0) {
									@Pc(455) Class14_Sub15 local455;
									if (local223 && Static5.anInt4507 != 0 && local6.anObjectArray22 != null) {
										local455 = new Class14_Sub15();
										local455.aBoolean158 = true;
										local455.aClass146_22 = local6;
										local455.anInt2252 = Static5.anInt4507;
										local455.anObjectArray3 = local6.anObjectArray22;
										Static307.aClass18_11.method451(local455);
									}
									if (Static94.aClass146_21 != null || Static176.aClass146_40 != null || Static302.aBoolean409 || local6.anInt4198 != 1400 && Static86.anInt2091 > 0) {
										local263 = false;
										local254 = false;
										local223 = false;
									}
									@Pc(612) int local612;
									if (local6.anInt4198 != 0) {
										if (local6.anInt4198 == 1337 || local6.anInt4198 == 1403) {
											Static103.aClass146_24 = local6;
											if (Static253.aClass208_2 != null) {
												Static253.aClass208_2.method5819(local6.anInt4199, Static218.aClass46_5);
											}
											if (local6.anInt4198 == 1337) {
												if (!Static302.aBoolean409 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
													Static102.method2258(Static218.aClass46_5, arg8, arg9);
													for (@Pc(540) Class1_Sub6 local540 = (Class1_Sub6) Static98.aClass126_3.method3389(); local540 != null; local540 = (Class1_Sub6) Static98.aClass126_3.method3394()) {
														if (arg8 >= local540.anInt4106 && arg8 < local540.anInt4109 && arg9 >= local540.anInt4114 && arg9 < local540.anInt4110) {
															Static188.method3593();
															Static291.method4987(local540.aClass10_Sub3_Sub3_1);
														}
													}
												}
												Static14.method336(local17, local22, local6);
												continue;
											}
										}
										@Pc(651) int local651;
										if (local6.anInt4198 == 1338) {
											if (local6.method3798(Static218.aClass46_5) == null || Static7.anInt191 != 0 && Static7.anInt191 != 3 || Static302.aBoolean409 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
												continue;
											}
											local285 = arg8 - local17;
											local612 = arg9 - local22;
											local374 = local6.anIntArray358[local612];
											if (local285 < local374 || local285 > local374 + local6.anIntArray359[local612]) {
												continue;
											}
											local285 -= local6.anInt4133 / 2;
											local612 -= local6.anInt4199 / 2;
											if (Static205.anInt4115 == 4) {
												local651 = (int) Static94.aFloat42 & 0x3FFF;
											} else {
												local651 = (int) Static94.aFloat42 + Static8.anInt205 & 0x3FFF;
											}
											@Pc(663) int local663 = Class14_Sub3_Sub34.anIntArray547[local651];
											@Pc(667) int local667 = Class14_Sub3_Sub34.anIntArray546[local651];
											if (Static205.anInt4115 != 4) {
												local663 = local663 * (Static309.anInt5886 + 256) >> 8;
												local667 = local667 * (Static309.anInt5886 + 256) >> 8;
											}
											@Pc(696) int local696 = local612 * local663 + local285 * local667 >> 15;
											@Pc(706) int local706 = local612 * local667 - local285 * local663 >> 15;
											@Pc(717) int local717;
											@Pc(725) int local725;
											if (Static205.anInt4115 == 4) {
												local717 = (Static41.anInt982 >> 7) + (local696 >> 2);
												local725 = (Static141.anInt2992 >> 7) - (local706 >> 2);
											} else {
												@Pc(734) int local734 = (Static173.aClass10_Sub3_Sub3_Sub2_1.method5353() - 1) * 64;
												local717 = (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 - local734 >> 7) + (local696 >> 2);
												local725 = (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 - local734 >> 7) - (local706 >> 2);
											}
											if (Static184.aBoolean241 && (Static103.anInt2305 & 0x40) != 0) {
												@Pc(767) Class146 local767 = Static70.method1717(Static88.anInt2109, Static188.anInt3867);
												if (local767 == null) {
													Static164.method3270();
												} else {
													Static223.method5291(1L, Static324.aString230, local717, Static5.anInt4503, 42, local725, " ->");
												}
												continue;
											}
											if (Static45.anInt1136 == 1) {
												Static223.method5291(1L, Static197.aString139, local717, -1, 21, local725, "");
											}
											Static223.method5291(1L, Static45.aString44, local717, -1, 34, local725, "");
											continue;
										}
										if (local6.anInt4198 == 1400) {
											Static206.aClass146_60 = local6;
											if (local223) {
												Static151.aBoolean210 = true;
											}
											if (local263) {
												local285 = (int) ((double) (Static272.anInt5167 - local17 - local6.anInt4133 / 2) * 2.0D / (double) Static241.aFloat108);
												local612 = (int) -((double) (Static321.anInt6195 - local22 - local6.anInt4199 / 2) * 2.0D / (double) Static241.aFloat108);
												local374 = Static297.anInt5698 + local285 + Static241.anInt5683;
												local651 = Static41.anInt983 + local612 + Static241.anInt5684;
												@Pc(864) Class14_Sub2_Sub14 local864 = Static15.method5424();
												if (local864 == null) {
													continue;
												}
												@Pc(869) int[] local869 = new int[3];
												local864.method3988(local374, local869, local651);
												if (local869 != null) {
													if (Static345.aBooleanArray30[82] && Static40.anInt979 > 0) {
														Static319.method5485(local869[0], local869[1], local869[2]);
														continue;
													}
													Static278.aBoolean349 = true;
													Static315.anInt6453 = local869[0];
													Static165.anInt5077 = local869[1];
													Static330.anInt6365 = local869[2];
												}
												Static86.anInt2091 = 1;
												Static181.aBoolean237 = false;
												Static282.anInt5380 = Static63.anInt1529;
												Static200.anInt4041 = Static328.anInt6333;
												continue;
											}
											if (local254 && Static86.anInt2091 > 0) {
												if (Static86.anInt2091 == 1 && (Static282.anInt5380 != Static63.anInt1529 || Static200.anInt4041 != Static328.anInt6333)) {
													Static318.anInt6132 = Static297.anInt5698;
													Static103.anInt2306 = Static41.anInt983;
													Static86.anInt2091 = 2;
												}
												if (Static86.anInt2091 == 2) {
													Static181.aBoolean237 = true;
													Static322.method5550(Static318.anInt6132 + (int) ((double) (Static282.anInt5380 - Static63.anInt1529) * 2.0D / (double) Static241.aFloat107));
													Static70.method1722(Static103.anInt2306 - (int) ((double) (Static200.anInt4041 - Static328.anInt6333) * 2.0D / (double) Static241.aFloat107));
												}
												continue;
											}
											if (Static86.anInt2091 > 0 && !Static181.aBoolean237) {
												if ((Static327.anInt6303 == 1 || Static66.method1649()) && Static41.anInt980 > 2) {
													Static240.method5763(2);
												} else if (Static291.method4988()) {
													Static240.method5763(1);
												}
											}
											Static86.anInt2091 = 0;
											continue;
										}
										if (local6.anInt4198 == 1401) {
											if (local254) {
												Static234.method4102(Static63.anInt1529 - local17, local6.anInt4133, Static328.anInt6333 - local22, local6.anInt4199);
											}
											continue;
										}
										if (local6.anInt4198 == 1406) {
											Static138.method2792(local6, local22, local17);
											continue;
										}
									}
									if (!local6.aBoolean270 && local263) {
										local6.aBoolean270 = true;
										if (local6.anObjectArray35 != null) {
											local455 = new Class14_Sub15();
											local455.aBoolean158 = true;
											local455.aClass146_22 = local6;
											local455.anInt2254 = Static272.anInt5167 - local17;
											local455.anInt2252 = Static321.anInt6195 - local22;
											local455.anObjectArray3 = local6.anObjectArray35;
											Static307.aClass18_11.method451(local455);
										}
									}
									if (local6.aBoolean270 && local254 && local6.anObjectArray17 != null) {
										local455 = new Class14_Sub15();
										local455.aBoolean158 = true;
										local455.aClass146_22 = local6;
										local455.anInt2254 = Static63.anInt1529 - local17;
										local455.anInt2252 = Static328.anInt6333 - local22;
										local455.anObjectArray3 = local6.anObjectArray17;
										Static307.aClass18_11.method451(local455);
									}
									if (local6.aBoolean270 && !local254) {
										local6.aBoolean270 = false;
										if (local6.anObjectArray24 != null) {
											local455 = new Class14_Sub15();
											local455.aBoolean158 = true;
											local455.aClass146_22 = local6;
											local455.anInt2254 = Static63.anInt1529 - local17;
											local455.anInt2252 = Static328.anInt6333 - local22;
											local455.anObjectArray3 = local6.anObjectArray24;
											Static336.aClass18_46.method451(local455);
										}
									}
									if (local254 && local6.anObjectArray19 != null) {
										local455 = new Class14_Sub15();
										local455.aBoolean158 = true;
										local455.aClass146_22 = local6;
										local455.anInt2254 = Static63.anInt1529 - local17;
										local455.anInt2252 = Static328.anInt6333 - local22;
										local455.anObjectArray3 = local6.anObjectArray19;
										Static307.aClass18_11.method451(local455);
									}
									if (!local6.aBoolean269 && local223) {
										local6.aBoolean269 = true;
										if (local6.anObjectArray23 != null) {
											local455 = new Class14_Sub15();
											local455.aBoolean158 = true;
											local455.aClass146_22 = local6;
											local455.anInt2254 = Static63.anInt1529 - local17;
											local455.anInt2252 = Static328.anInt6333 - local22;
											local455.anObjectArray3 = local6.anObjectArray23;
											Static307.aClass18_11.method451(local455);
										}
									}
									if (local6.aBoolean269 && local223 && local6.anObjectArray10 != null) {
										local455 = new Class14_Sub15();
										local455.aBoolean158 = true;
										local455.aClass146_22 = local6;
										local455.anInt2254 = Static63.anInt1529 - local17;
										local455.anInt2252 = Static328.anInt6333 - local22;
										local455.anObjectArray3 = local6.anObjectArray10;
										Static307.aClass18_11.method451(local455);
									}
									if (local6.aBoolean269 && !local223) {
										local6.aBoolean269 = false;
										if (local6.anObjectArray34 != null) {
											local455 = new Class14_Sub15();
											local455.aBoolean158 = true;
											local455.aClass146_22 = local6;
											local455.anInt2254 = Static63.anInt1529 - local17;
											local455.anInt2252 = Static328.anInt6333 - local22;
											local455.anObjectArray3 = local6.anObjectArray34;
											Static336.aClass18_46.method451(local455);
										}
									}
									if (local6.anObjectArray13 != null) {
										local455 = new Class14_Sub15();
										local455.aClass146_22 = local6;
										local455.anObjectArray3 = local6.anObjectArray13;
										Static142.aClass18_14.method451(local455);
									}
									@Pc(1361) Class14_Sub15 local1361;
									if (local6.anObjectArray32 != null && Static165.anInt5089 > local6.anInt4136) {
										if (local6.anIntArray366 == null || Static165.anInt5089 - local6.anInt4136 > 32) {
											local455 = new Class14_Sub15();
											local455.aClass146_22 = local6;
											local455.anObjectArray3 = local6.anObjectArray32;
											Static307.aClass18_11.method451(local455);
										} else {
											label692: for (local285 = local6.anInt4136; local285 < Static165.anInt5089; local285++) {
												local612 = Static90.anIntArray195[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray366.length; local374++) {
													if (local6.anIntArray366[local374] == local612) {
														local1361 = new Class14_Sub15();
														local1361.aClass146_22 = local6;
														local1361.anObjectArray3 = local6.anObjectArray32;
														Static307.aClass18_11.method451(local1361);
														break label692;
													}
												}
											}
										}
										local6.anInt4136 = Static165.anInt5089;
									}
									if (local6.anObjectArray9 != null && Static252.anInt4851 > local6.anInt4131) {
										if (local6.anIntArray375 == null || Static252.anInt4851 - local6.anInt4131 > 32) {
											local455 = new Class14_Sub15();
											local455.aClass146_22 = local6;
											local455.anObjectArray3 = local6.anObjectArray9;
											Static307.aClass18_11.method451(local455);
										} else {
											label672: for (local285 = local6.anInt4131; local285 < Static252.anInt4851; local285++) {
												local612 = Static340.anIntArray624[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray375.length; local374++) {
													if (local6.anIntArray375[local374] == local612) {
														local1361 = new Class14_Sub15();
														local1361.aClass146_22 = local6;
														local1361.anObjectArray3 = local6.anObjectArray9;
														Static307.aClass18_11.method451(local1361);
														break label672;
													}
												}
											}
										}
										local6.anInt4131 = Static252.anInt4851;
									}
									if (local6.anObjectArray31 != null && Static319.anInt6144 > local6.anInt4209) {
										if (local6.anIntArray370 == null || Static319.anInt6144 - local6.anInt4209 > 32) {
											local455 = new Class14_Sub15();
											local455.aClass146_22 = local6;
											local455.anObjectArray3 = local6.anObjectArray31;
											Static307.aClass18_11.method451(local455);
										} else {
											label652: for (local285 = local6.anInt4209; local285 < Static319.anInt6144; local285++) {
												local612 = Static300.anIntArray610[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray370.length; local374++) {
													if (local6.anIntArray370[local374] == local612) {
														local1361 = new Class14_Sub15();
														local1361.aClass146_22 = local6;
														local1361.anObjectArray3 = local6.anObjectArray31;
														Static307.aClass18_11.method451(local1361);
														break label652;
													}
												}
											}
										}
										local6.anInt4209 = Static319.anInt6144;
									}
									if (local6.anObjectArray21 != null && Static319.anInt6141 > local6.anInt4194) {
										if (local6.anIntArray368 == null || Static319.anInt6141 - local6.anInt4194 > 32) {
											local455 = new Class14_Sub15();
											local455.aClass146_22 = local6;
											local455.anObjectArray3 = local6.anObjectArray21;
											Static307.aClass18_11.method451(local455);
										} else {
											label632: for (local285 = local6.anInt4194; local285 < Static319.anInt6141; local285++) {
												local612 = Static23.anIntArray39[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray368.length; local374++) {
													if (local6.anIntArray368[local374] == local612) {
														local1361 = new Class14_Sub15();
														local1361.aClass146_22 = local6;
														local1361.anObjectArray3 = local6.anObjectArray21;
														Static307.aClass18_11.method451(local1361);
														break label632;
													}
												}
											}
										}
										local6.anInt4194 = Static319.anInt6141;
									}
									if (local6.anObjectArray29 != null && Static169.anInt3515 > local6.anInt4215) {
										if (local6.anIntArray364 == null || Static169.anInt3515 - local6.anInt4215 > 32) {
											local455 = new Class14_Sub15();
											local455.aClass146_22 = local6;
											local455.anObjectArray3 = local6.anObjectArray29;
											Static307.aClass18_11.method451(local455);
										} else {
											label612: for (local285 = local6.anInt4215; local285 < Static169.anInt3515; local285++) {
												local612 = Static115.anIntArray224[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray364.length; local374++) {
													if (local6.anIntArray364[local374] == local612) {
														local1361 = new Class14_Sub15();
														local1361.aClass146_22 = local6;
														local1361.anObjectArray3 = local6.anObjectArray29;
														Static307.aClass18_11.method451(local1361);
														break label612;
													}
												}
											}
										}
										local6.anInt4215 = Static169.anInt3515;
									}
									if (Static192.anInt3924 > local6.anInt4159 && local6.anObjectArray11 != null) {
										local455 = new Class14_Sub15();
										local455.aClass146_22 = local6;
										local455.anObjectArray3 = local6.anObjectArray11;
										Static307.aClass18_11.method451(local455);
									}
									if (Static342.anInt6538 > local6.anInt4159 && local6.anObjectArray15 != null) {
										local455 = new Class14_Sub15();
										local455.aClass146_22 = local6;
										local455.anObjectArray3 = local6.anObjectArray15;
										Static307.aClass18_11.method451(local455);
									}
									if (Static121.anInt2699 > local6.anInt4159 && local6.anObjectArray27 != null) {
										local455 = new Class14_Sub15();
										local455.aClass146_22 = local6;
										local455.anObjectArray3 = local6.anObjectArray27;
										Static307.aClass18_11.method451(local455);
									}
									if (Static288.anInt5565 > local6.anInt4159 && local6.anObjectArray8 != null) {
										local455 = new Class14_Sub15();
										local455.aClass146_22 = local6;
										local455.anObjectArray3 = local6.anObjectArray8;
										Static307.aClass18_11.method451(local455);
									}
									if (Static149.anInt3221 > local6.anInt4159 && local6.anObjectArray12 != null) {
										local455 = new Class14_Sub15();
										local455.aClass146_22 = local6;
										local455.anObjectArray3 = local6.anObjectArray12;
										Static307.aClass18_11.method451(local455);
									}
									local6.anInt4159 = Static348.anInt5338;
									if (local6.anObjectArray30 != null) {
										for (local285 = 0; local285 < Static38.anInt907; local285++) {
											@Pc(1829) Class14_Sub15 local1829 = new Class14_Sub15();
											local1829.aClass146_22 = local6;
											local1829.anInt2249 = Static347.anIntArray640[local285];
											local1829.anInt2247 = Static331.anIntArray609[local285];
											local1829.anObjectArray3 = local6.anObjectArray30;
											Static307.aClass18_11.method451(local1829);
										}
									}
									if (Static104.aBoolean163 && local6.anObjectArray26 != null) {
										local455 = new Class14_Sub15();
										local455.aClass146_22 = local6;
										local455.anObjectArray3 = local6.anObjectArray26;
										Static307.aClass18_11.method451(local455);
									}
								}
								if (local6.anInt4135 == 5 && local6.anInt4142 != -1) {
									local6.method3802().method5819(local6.anInt4199, Static218.aClass46_5);
								}
							}
							if (!local6.aBoolean260 && Static94.aClass146_21 == null && Static176.aClass146_40 == null && !Static302.aBoolean409) {
								if ((local6.anInt4162 >= 0 || local6.anInt4134 != 0) && Static63.anInt1529 >= local28 && Static328.anInt6333 >= local30 && Static63.anInt1529 < local32 && Static328.anInt6333 < local34) {
									if (local6.anInt4162 >= 0) {
										Static86.aClass146_19 = arg0[local6.anInt4162];
									} else {
										Static86.aClass146_19 = local6;
									}
								}
								if (local6.anInt4135 == 8 && Static63.anInt1529 >= local28 && Static328.anInt6333 >= local30 && Static63.anInt1529 < local32 && Static328.anInt6333 < local34) {
									Static2.aClass146_1 = local6;
								}
								if (local6.anInt4197 > local6.anInt4199) {
									Static189.method5488(local17 + local6.anInt4133, Static63.anInt1529, local6.anInt4199, local22, Static328.anInt6333, local6.anInt4197, local6);
								}
							}
							Static254.method4387(arg2, arg3, arg4, local17, local6, arg5, local22);
							if (local6.anInt4135 == 0) {
								method1043(arg0, local6.anInt4214, local28, local30, local32, local34, local17 - local6.anInt4176, local22 - local6.anInt4128, arg8, arg9);
								if (local6.aClass146Array2 != null) {
									method1043(local6.aClass146Array2, local6.anInt4214, local28, local30, local32, local34, local17 - local6.anInt4176, local22 - local6.anInt4128, arg8, arg9);
								}
								@Pc(2026) Class14_Sub27 local2026 = (Class14_Sub27) Static198.aClass25_20.method691((long) local6.anInt4214);
								if (local2026 != null) {
									if (local2026.anInt5192 == 0 && !Static302.aBoolean409 && local223 && !Static195.aBoolean248) {
										Static188.method3593();
									}
									Static69.method1704(local22, local28, local2026.anInt5186, arg9, local34, local30, local32, arg8, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static254.method4387(arg2, arg3, arg4, local17, local6, arg5, local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ne;)Lclient!ne;")
	public static Class146 method1045(@OriginalArg(0) Class146 arg0) {
		@Pc(4) int local4 = method1040(arg0).method2574();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static273.method4632(arg0.anInt4146);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
