import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "[I")
	public static int[] anIntArray420;

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "F")
	public static float aFloat133;

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_104 = new Class253(35, -1);

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "[B")
	public static final byte[] aByteArray71 = new byte[520];

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "[Lclient!lc;")
	public static final Class139[] aClass139Array1 = new Class139[14];

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!go;IB)V")
	public static void method3667(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aByte26 == 0) {
			arg1.anInt2601 = arg1.anInt2675;
		} else if (arg1.aByte26 == 1) {
			arg1.anInt2601 = arg1.anInt2675 + (arg2 - arg1.anInt2595) / 2;
		} else if (arg1.aByte26 == 2) {
			arg1.anInt2601 = arg2 - arg1.anInt2675 - arg1.anInt2595;
		} else if (arg1.aByte26 == 3) {
			arg1.anInt2601 = arg2 * arg1.anInt2675 >> 14;
		} else if (arg1.aByte26 == 4) {
			arg1.anInt2601 = (arg1.anInt2675 * arg2 >> 14) + (arg2 - arg1.anInt2595) / 2;
		} else {
			arg1.anInt2601 = arg2 - (arg2 * arg1.anInt2675 >> 14) - arg1.anInt2595;
		}
		if (arg1.aByte25 == 0) {
			arg1.anInt2584 = arg1.anInt2586;
		} else if (arg1.aByte25 == 1) {
			arg1.anInt2584 = arg1.anInt2586 + (arg0 - arg1.anInt2638) / 2;
		} else if (arg1.aByte25 == 2) {
			arg1.anInt2584 = arg0 - arg1.anInt2586 - arg1.anInt2638;
		} else if (arg1.aByte25 == 3) {
			arg1.anInt2584 = arg1.anInt2586 * arg0 >> 14;
		} else if (arg1.aByte25 == 4) {
			arg1.anInt2584 = (arg0 - arg1.anInt2638) / 2 + (arg0 * arg1.anInt2586 >> 14);
		} else {
			arg1.anInt2584 = arg0 - arg1.anInt2638 - (arg0 * arg1.anInt2586 >> 14);
		}
		if (!Static283.aBoolean297 || Static52.method725(arg1).anInt2235 == 0 && arg1.anInt2616 != 0) {
			return;
		}
		if (arg1.anInt2584 < 0) {
			arg1.anInt2584 = 0;
		} else if (arg1.anInt2638 + arg1.anInt2584 > arg0) {
			arg1.anInt2584 = arg0 - arg1.anInt2638;
		}
		if (arg1.anInt2601 < 0) {
			arg1.anInt2601 = 0;
		} else if (arg1.anInt2595 + arg1.anInt2601 > arg2) {
			arg1.anInt2601 = arg2 - arg1.anInt2595;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method3670(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static226.anInt3951++;
		Static69.anInt1360 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static352.anInt5643; local7 < Static315.anInt5183; local7++) {
			@Pc(12) Class223[][] local12 = Static19.aClass223ArrayArrayArray1[local7];
			for (local14 = Static16.anInt6421; local14 < Static269.anInt4577; local14++) {
				for (@Pc(17) int local17 = Static98.anInt1989; local17 < Static226.anInt3936; local17++) {
					@Pc(24) Class223 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static262.aBooleanArrayArray20[local14 + Static133.anInt2523 - Static408.anInt6461][local17 + Static133.anInt2523 - Static72.anInt1379] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean384 = true;
							local24.aBoolean383 = true;
							if (local24.aClass270_1 == null) {
								local24.aBoolean382 = false;
							} else {
								local24.aBoolean382 = true;
							}
							Static69.anInt1360++;
						} else {
							local24.aBoolean384 = false;
							local24.aBoolean383 = false;
							local24.aByte67 = 0;
							if (local14 >= Static408.anInt6461 - 16 && local14 <= Static408.anInt6461 + 16 && local17 >= Static72.anInt1379 - 16 && local17 <= Static72.anInt1379 + 16 && (local24.aClass26_Sub3_2 != null || local24.aClass26_Sub3_1 != null || local24.aClass26_Sub1_2 != null || local24.aClass26_Sub1_1 != null || local24.aClass26_Sub4_2 != null || local24.aClass270_1 != null)) {
								Static223.aClass92_1.method3221(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static28.aClass165Array1 == Static244.aClass165Array8;
		for (local14 = Static352.anInt5643; local14 < Static315.anInt5183; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static268.aClass51_8.method5316() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static262.aBooleanArrayArray20.length;
				if (Static16.anInt6421 + Static262.aBooleanArrayArray20.length > Static264.anInt4480) {
					local172 -= Static16.anInt6421 + Static262.aBooleanArrayArray20.length - Static264.anInt4480;
				}
				@Pc(192) int local192 = Static262.aBooleanArrayArray20[0].length;
				if (Static98.anInt1989 + Static262.aBooleanArrayArray20[0].length > Static295.anInt4910) {
					local192 -= Static98.anInt1989 + Static262.aBooleanArrayArray20[0].length - Static295.anInt4910;
				}
				@Pc(213) int local213 = Static228.anInt3964;
				while (true) {
					if (local213 >= local172) {
						Static223.aClass92_1.method3213(true, local161, Static244.aClass165Array8[local14], local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static16.anInt6421 - Static228.anInt3964;
					for (@Pc(222) int local222 = Static39.anInt678; local222 < local192; local222++) {
						Static454.aBooleanArrayArray22[local213][local222] = false;
						if (Static262.aBooleanArrayArray20[local213][local222]) {
							@Pc(241) int local241 = local222 + Static98.anInt1989 - Static39.anInt678;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static19.aClass223ArrayArrayArray1[local243][local220][local241] != null && Static19.aClass223ArrayArrayArray1[local243][local220][local241].aByte68 == local14) {
									Static454.aBooleanArrayArray22[local213][local222] = Static19.aClass223ArrayArrayArray1[local243][local220][local241].aBoolean384;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static223.aClass92_1.method3213(false, local161, Static244.aClass165Array8[local14], local14);
			}
			Static223.aClass92_1.method3216();
		}
		if (!Static373.method4780(true)) {
			Static373.method4780(false);
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	public static void method3672() {
		if (!Static87.method1510()) {
			return;
		}
		if (Static231.aStringArray52 == null) {
			Static309.method4074();
		}
		Static94.aBoolean106 = true;
		Static55.anInt939 = 0;
		try {
			Static403.aClipboard2 = Static129.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(21) Exception local21) {
		}
	}
}
