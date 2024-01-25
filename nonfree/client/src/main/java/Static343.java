import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!fe;")
	public static Class77 aClass77_4;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public static int anInt5596;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4359(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static214.anInt7431++;
		Static309.anInt5156 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static337.anInt1766; local7 < Static97.anInt1709; local7++) {
			@Pc(12) Class82[][] local12 = Static159.aClass82ArrayArrayArray2[local7];
			for (local14 = Static330.anInt5396; local14 < Static275.anInt4346; local14++) {
				for (@Pc(17) int local17 = Static402.anInt6522; local17 < Static401.anInt3622; local17++) {
					@Pc(24) Class82 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static269.aBooleanArrayArray7[local14 + Static317.anInt5269 - Static85.anInt4657][local17 + Static317.anInt5269 - Static179.anInt2929] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean150 = true;
							local24.aBoolean149 = true;
							if (local24.aClass146_1 == null) {
								local24.aBoolean148 = false;
							} else {
								local24.aBoolean148 = true;
							}
							Static309.anInt5156++;
						} else {
							local24.aBoolean150 = false;
							local24.aBoolean149 = false;
							local24.aByte18 = 0;
							if (local14 >= Static85.anInt4657 - 16 && local14 <= Static85.anInt4657 + 16 && local17 >= Static179.anInt2929 - 16 && local17 <= Static179.anInt2929 + 16 && (local24.aClass20_Sub1_2 != null || local24.aClass20_Sub1_3 != null || local24.aClass20_Sub4_1 != null || local24.aClass20_Sub4_2 != null || local24.aClass20_Sub2_1 != null || local24.aClass146_1 != null)) {
								Static63.aClass2_1.method2555(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static164.aClass163Array1 == Static202.aClass163Array2;
		for (local14 = Static337.anInt1766; local14 < Static97.anInt1709; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static257.aClass128_36.method3569() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static269.aBooleanArrayArray7.length;
				if (Static330.anInt5396 + Static269.aBooleanArrayArray7.length > Static362.anInt6113) {
					local172 -= Static330.anInt5396 + Static269.aBooleanArrayArray7.length - Static362.anInt6113;
				}
				@Pc(192) int local192 = Static269.aBooleanArrayArray7[0].length;
				if (Static402.anInt6522 + Static269.aBooleanArrayArray7[0].length > Static195.anInt3127) {
					local192 -= Static402.anInt6522 + Static269.aBooleanArrayArray7[0].length - Static195.anInt3127;
				}
				@Pc(213) int local213 = Static442.anInt7352;
				while (true) {
					if (local213 >= local172) {
						Static63.aClass2_1.method2554(local161, Static202.aClass163Array2[local14], local14, true);
						break;
					}
					@Pc(220) int local220 = local213 + Static330.anInt5396 - Static442.anInt7352;
					for (@Pc(222) int local222 = Static122.anInt2129; local222 < local192; local222++) {
						Static82.aBooleanArrayArray1[local213][local222] = false;
						if (Static269.aBooleanArrayArray7[local213][local222]) {
							@Pc(241) int local241 = local222 + Static402.anInt6522 - Static122.anInt2129;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static159.aClass82ArrayArrayArray2[local243][local220][local241] != null && Static159.aClass82ArrayArrayArray2[local243][local220][local241].aByte17 == local14) {
									Static82.aBooleanArrayArray1[local213][local222] = Static159.aClass82ArrayArrayArray2[local243][local220][local241].aBoolean150;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static63.aClass2_1.method2554(local161, Static202.aClass163Array2[local14], local14, false);
			}
			Static63.aClass2_1.method2561();
		}
		if (!Static354.method4556(true)) {
			Static354.method4556(false);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZI)V")
	public static void method4361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (Static434.anInt4326 != arg0) {
			Static280.anIntArray238 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static280.anIntArray238[local17] = (local17 << 12) / arg0;
			}
			Static429.anInt7144 = arg0 - 1;
			Static434.anInt4326 = arg0;
			Static406.anInt6568 = arg0 * 32;
		}
		if (Static452.anInt7412 == arg1) {
			return;
		}
		if (Static434.anInt4326 == arg1) {
			Static221.anIntArray194 = Static280.anIntArray238;
		} else {
			Static221.anIntArray194 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static221.anIntArray194[local17] = (local17 << 12) / arg1;
			}
		}
		Static249.anInt4068 = arg1 - 1;
		Static452.anInt7412 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
	public static void method4362() {
		for (@Pc(1) int local1 = 0; local1 < Static253.anInt4090; local1++) {
			@Pc(6) Class20_Sub3 local6 = Static183.aClass20_Sub3Array5[local1];
			Static178.method2382(local6);
			Static183.aClass20_Sub3Array5[local1] = null;
		}
		Static253.anInt4090 = 0;
	}
}
