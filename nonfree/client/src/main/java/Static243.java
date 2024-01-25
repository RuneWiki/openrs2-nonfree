import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!po", name = "m", descriptor = "I")
	public static int anInt4826;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "Lclient!os;")
	public static Class120 aClass120_6;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "[I")
	public static final int[] anIntArray392 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_46 = new Class198(128);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4152(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(14) int local14 = 0; local14 < Static170.anInt6275; local14++) {
			@Pc(22) Class5_Sub4_Sub4_Sub1 local22 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local14]];
			if (local22 != null && local22.aString126 != null && local22.aString126.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static291.aClass3_Sub4_Sub2_3.method3682(138);
					Static291.aClass3_Sub4_Sub2_3.method3663(Static235.anIntArray377[local14]);
					Static291.aClass3_Sub4_Sub2_3.method3637(0);
				} else if (arg1 == 4) {
					Static291.aClass3_Sub4_Sub2_3.method3682(77);
					Static291.aClass3_Sub4_Sub2_3.method3664(Static235.anIntArray377[local14]);
					Static291.aClass3_Sub4_Sub2_3.method3637(0);
				} else if (arg1 == 5) {
					Static291.aClass3_Sub4_Sub2_3.method3682(128);
					Static291.aClass3_Sub4_Sub2_3.method3635(Static235.anIntArray377[local14]);
					Static291.aClass3_Sub4_Sub2_3.method3637(0);
				} else if (arg1 == 6) {
					Static291.aClass3_Sub4_Sub2_3.method3682(132);
					Static291.aClass3_Sub4_Sub2_3.method3614(0);
					Static291.aClass3_Sub4_Sub2_3.method3660(Static235.anIntArray377[local14]);
				} else if (arg1 == 7) {
					Static291.aClass3_Sub4_Sub2_3.method3682(213);
					Static291.aClass3_Sub4_Sub2_3.method3663(Static235.anIntArray377[local14]);
					Static291.aClass3_Sub4_Sub2_3.method3637(0);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static164.method5307(Static117.aString86 + arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	public static void method4153(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static247.anInt4917 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([[B[[II[[BLclient!da;ZLclient!da;I[[B[[BILclient!tj;I)V")
	public static void method4154(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class22 arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class122 arg10, @OriginalArg(12) int arg11) {
		for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
			for (@Pc(11) int local11 = 0; local11 < arg11; local11++) {
				if (Static75.method1142() || Static109.method1871(local11, arg9, local7, Static353.anInt6829)) {
					@Pc(31) byte local31 = arg3[local7][local11];
					@Pc(37) byte local37 = arg8[local7][local11];
					@Pc(45) int local45 = arg7[local7][local11] & 0xFF;
					@Pc(53) int local53 = arg0[local7][local11] & 0xFF;
					@Pc(68) Class1 local68 = local45 == 0 ? null : Static216.method3748(local45 - 1);
					@Pc(81) Class155 local81 = local53 == 0 ? null : Static106.method1817(local53 - 1);
					@Pc(83) int local83 = 0;
					@Pc(85) int local85 = 0;
					if (local31 != 0) {
						local83 = local81 == null ? 0 : Static245.anIntArray398[local31];
						local85 = local68 == null ? 0 : Static257.anIntArray415[local31];
					} else if (local68 != null) {
						local85 = Static257.anIntArray415[local31];
					} else if (local81 != null) {
						local83 = Static257.anIntArray415[local31];
					}
					@Pc(126) int local126 = local85 + local83;
					@Pc(128) int local128 = 0;
					if (local126 != 0) {
						@Pc(136) int[] local136 = new int[local126];
						@Pc(139) int[] local139 = new int[local126];
						@Pc(142) int[] local142 = new int[local126];
						@Pc(145) int[] local145 = new int[local126];
						@Pc(147) boolean local147 = false;
						@Pc(171) int local171;
						@Pc(177) int local177;
						if (local68 == null || local68.anInt11 == -1 && local68.anInt14 == -1 && local68.anInt15 == -1) {
							for (local171 = 0; local171 < local85; local171++) {
								local136[local128] = -1;
								local128++;
							}
						} else {
							local171 = arg10.method4747() ? local68.anInt15 : local68.anInt13;
							if (!Static5.aBoolean13) {
								local171 = -1;
							}
							for (local177 = 0; local177 < local85; local177++) {
								local142[local128] = local171;
								local145[local128] = local68.anInt3;
								if (local68.anInt11 == -1) {
									local136[local128] = -1;
								} else {
									local136[local128] = local68.anInt11;
								}
								if (local68.anInt14 == -1) {
									local139[local128] = -1;
								} else {
									local147 = true;
									local139[local128] = local68.anInt14;
								}
								local128++;
							}
							if (!arg5 && arg9 == 0) {
								Static166.method2681(local7, local11, local68.anInt1, local68.anInt4 * 8);
							}
						}
						if (!local147) {
							local139 = null;
						}
						if (local81 == null) {
							for (local171 = 0; local171 < local83; local171++) {
								local136[local128] = -1;
								local128++;
							}
						} else {
							local171 = local81.anInt4702;
							if (!Static5.aBoolean13) {
								local171 = -1;
							}
							for (local177 = 0; local177 < local83; local177++) {
								local142[local128] = local171;
								local145[local128] = local81.anInt4709;
								local136[local128] = arg1[local7][local11];
								if (local139 != null) {
									local139[local128] = -1;
								}
								local128++;
							}
						}
						local171 = Static137.anIntArray153.length;
						@Pc(340) int[] local340 = arg5 ? new int[local171] : null;
						@Pc(343) int[] local343 = new int[local171];
						@Pc(346) int[] local346 = new int[local171];
						@Pc(354) int local354;
						@Pc(358) int local358;
						@Pc(447) int local447;
						@Pc(455) int local455;
						for (@Pc(348) int local348 = 0; local348 < local171; local348++) {
							local354 = Static137.anIntArray153[local348];
							local358 = Static273.anIntArray436[local348];
							if (local37 == 0) {
								local343[local348] = local354;
								local346[local348] = local358;
							} else if (local37 == 1) {
								local343[local348] = local358;
								local346[local348] = 128 - local354;
							} else if (local37 == 2) {
								local343[local348] = 128 - local354;
								local346[local348] = 128 - local358;
							} else if (local37 == 3) {
								local343[local348] = 128 - local358;
								local346[local348] = local354;
							}
							if (arg5 && Static260.aBooleanArrayArray13[local31][local348]) {
								local447 = (local7 << 7) + local343[local348];
								local455 = local346[local348] + (local11 << 7);
								local340[local348] = arg6.method4678(local447, local455) - arg4.method4678(local447, local455);
							}
						}
						local354 = arg4.method4672(local7, local11);
						local358 = arg4.method4672(local7 + 1, local11);
						local447 = arg4.method4672(local7 + 1, local11 + 1);
						local455 = arg4.method4672(local7, local11 + 1);
						if (arg9 > 0) {
							@Pc(503) boolean local503 = true;
							if (local53 == 0 && local31 != 0) {
								local503 = false;
							}
							if (local45 > 0 && local68 != null && !local68.aBoolean1) {
								local503 = false;
							}
							if (local503 && local358 == local354 && local447 == local354 && local354 == local455) {
								Static310.aByteArrayArrayArray14[arg9][local7][local11] = (byte) (Static310.aByteArrayArrayArray14[arg9][local7][local11] | 0x4);
							}
						}
						@Pc(561) int local561 = 0;
						@Pc(563) int local563 = 0;
						if (arg5) {
							local561 = Static3.method28(local7, local11);
							local563 = Static120.method2119(local7, local11);
						}
						arg4.method4667(local7, local11, local343, local340, local346, Static245.anIntArrayArray45[local31], Static125.anIntArrayArray16[local31], Static26.anIntArrayArray4[local31], local136, local139, local142, local145, local561, local563);
						Static128.method2212(arg9, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZIZIIIII)V")
	public static void method4157(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!arg2 && arg5 == Static16.anInt512 && Static130.anInt2745 == arg4 && (Static353.anInt6829 == arg3 || Static75.method1142())) {
			return;
		}
		Static353.anInt6829 = arg3;
		Static16.anInt512 = arg5;
		Static130.anInt2745 = arg4;
		if (Static75.method1142()) {
			Static353.anInt6829 = 0;
		}
		if (arg0) {
			Static353.method5714(28);
		} else {
			Static353.method5714(25);
		}
		Static300.method5080(Static168.aString130, true, Static83.aClass120_1);
		@Pc(56) int local56 = Static186.anInt3094;
		Static186.anInt3094 = (Static16.anInt512 - (Static162.anInt2152 >> 4)) * 8;
		@Pc(67) int local67 = Static296.anInt5889;
		Static296.anInt5889 = (Static130.anInt2745 - (Static122.anInt2632 >> 4)) * 8;
		Static154.aClass3_Sub7_Sub13_6 = Static193.method1911(Static16.anInt512 * 8, Static130.anInt2745 * 8);
		Static247.aClass146_5 = null;
		@Pc(90) int local90 = Static186.anInt3094 - local56;
		@Pc(95) int local95 = Static296.anInt5889 - local67;
		@Pc(105) int local105;
		@Pc(113) int local113;
		if (arg0) {
			Static42.anInt897 = 0;
			local105 = Static162.anInt2152 * 128 - 128;
			@Pc(111) int local111 = Static122.anInt2632 * 128 - 128;
			for (local113 = 0; local113 < 32768; local113++) {
				@Pc(119) Class5_Sub4_Sub4_Sub2 local119 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local113];
				if (local119 != null) {
					local119.anInt5905 -= local95 * 128;
					local119.anInt5901 -= local90 * 128;
					if (local119.anInt5901 >= 0 && local105 >= local119.anInt5901 && local119.anInt5905 >= 0 && local119.anInt5905 <= local111) {
						@Pc(173) boolean local173 = true;
						for (@Pc(175) int local175 = 0; local175 < 10; local175++) {
							local119.anIntArray405[local175] -= local90;
							local119.anIntArray404[local175] -= local95;
							if (local119.anIntArray405[local175] < 0 || local119.anIntArray405[local175] >= Static162.anInt2152 || local119.anIntArray404[local175] < 0 || local119.anIntArray404[local175] >= Static122.anInt2632) {
								local173 = false;
							}
						}
						if (local173) {
							Static130.anIntArray180[Static42.anInt897++] = local113;
						} else {
							Static244.aClass5_Sub4_Sub4_Sub2Array1[local113].method4223(null);
							Static244.aClass5_Sub4_Sub4_Sub2Array1[local113] = null;
						}
					} else {
						Static244.aClass5_Sub4_Sub4_Sub2Array1[local113].method4223(null);
						Static244.aClass5_Sub4_Sub4_Sub2Array1[local113] = null;
					}
				}
			}
		} else {
			for (local105 = 0; local105 < 32768; local105++) {
				@Pc(260) Class5_Sub4_Sub4_Sub2 local260 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local105];
				if (local260 != null) {
					for (local113 = 0; local113 < 10; local113++) {
						local260.anIntArray405[local113] -= local90;
						local260.anIntArray404[local113] -= local95;
					}
					local260.anInt5905 -= local95 * 128;
					local260.anInt5901 -= local90 * 128;
				}
			}
		}
		for (local105 = 0; local105 < 2048; local105++) {
			@Pc(314) Class5_Sub4_Sub4_Sub1 local314 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local105];
			if (local314 != null) {
				for (local113 = 0; local113 < 10; local113++) {
					local314.anIntArray405[local113] -= local90;
					local314.anIntArray404[local113] -= local95;
				}
				local314.anInt5901 -= local90 * 128;
				local314.anInt5905 -= local95 * 128;
			}
		}
		Static163.anInt3184 = arg3;
		Static349.aClass5_Sub4_Sub4_Sub1_2.method2675(arg6, arg1, Static163.anInt3184, false);
		Static164.method5315(local90, local95);
		for (@Pc(385) Class3_Sub42 local385 = (Class3_Sub42) Static83.aClass127_3.method3402(); local385 != null; local385 = (Class3_Sub42) Static83.aClass127_3.method3400()) {
			local385.anInt6546 -= local95;
			local385.anInt6544 -= local90;
			if (local385.anInt6544 < 0 || local385.anInt6546 < 0 || Static162.anInt2152 <= local385.anInt6544 || Static122.anInt2632 <= local385.anInt6546) {
				local385.method5717();
			}
		}
		if (Static154.anInt6365 != 0) {
			Static154.anInt6365 -= local90;
			Static355.anInt6865 -= local95;
		}
		Static186.anInt3102 = 0;
		if (arg0) {
			Static110.anInt2324 -= local90 * 128;
			Static210.anInt4317 -= local95 * 128;
			Static341.anInt6652 -= local90;
			Static156.anInt3023 -= local90;
			Static327.anInt6306 -= local95;
			Static158.anInt3055 -= local95;
			if (Math.abs(local90) > Static162.anInt2152 || Math.abs(local95) > Static122.anInt2632) {
				Static135.method2265();
			}
		} else if (Static261.anInt5200 == 4) {
			Static350.anInt6803 -= local95 * 128;
			Static189.anInt3967 -= local90 * 128;
			Static298.anInt5943 -= local90 * 128;
			Static56.anInt1230 -= local95 * 128;
		} else {
			Static261.anInt5200 = 1;
		}
		Static80.method1269();
		Static254.aClass127_27.method3401();
		Static165.aClass127_18.method3401();
		Static21.aClass65_2.method1456();
		Static268.method4551();
	}
}
