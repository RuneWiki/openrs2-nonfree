import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_136 = new Class263(93, 8);

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lclient!hs;")
	public static final Class111_Sub1[] aClass111_Sub1Array2 = new Class111_Sub1[30];

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
	public static int anInt5721 = 500;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "[S")
	public static final short[] aShortArray99 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4394(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static291.anInt7494++;
		Static62.anInt1642 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static307.anInt5772; local7 < Static220.anInt4418; local7++) {
			@Pc(12) Class252[][] local12 = Static67.aClass252ArrayArrayArray2[local7];
			for (local14 = Static329.anInt6070; local14 < Static182.anInt3942; local14++) {
				for (@Pc(17) int local17 = Static272.anInt5271; local17 < Static418.anInt7456; local17++) {
					@Pc(24) Class252 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static335.aBooleanArrayArray4[local14 + Static235.anInt4661 - Static166.anInt3464][local17 + Static235.anInt4661 - Static31.anInt2066] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean480 = true;
							local24.aBoolean478 = true;
							if (local24.aClass208_3 == null) {
								local24.aBoolean479 = false;
							} else {
								local24.aBoolean479 = true;
							}
							Static62.anInt1642++;
						} else {
							local24.aBoolean480 = false;
							local24.aBoolean478 = false;
							local24.aByte99 = 0;
							if (local14 >= Static166.anInt3464 - 16 && local14 <= Static166.anInt3464 + 16 && local17 >= Static31.anInt2066 - 16 && local17 <= Static31.anInt2066 + 16 && (local24.aClass30_Sub3_3 != null || local24.aClass30_Sub3_2 != null || local24.aClass30_Sub2_2 != null || local24.aClass30_Sub2_3 != null || local24.aClass30_Sub4_2 != null || local24.aClass208_3 != null)) {
								Static47.aClass9_3.method6068(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static221.aClass96Array4 == Static396.aClass96Array5;
		for (local14 = Static307.anInt5772; local14 < Static220.anInt4418; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static227.aClass106_8.method5975() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static335.aBooleanArrayArray4.length;
				if (Static329.anInt6070 + Static335.aBooleanArrayArray4.length > Static216.anInt4346) {
					local172 -= Static329.anInt6070 + Static335.aBooleanArrayArray4.length - Static216.anInt4346;
				}
				@Pc(192) int local192 = Static335.aBooleanArrayArray4[0].length;
				if (Static272.anInt5271 + Static335.aBooleanArrayArray4[0].length > Static198.anInt7949) {
					local192 -= Static272.anInt5271 + Static335.aBooleanArrayArray4[0].length - Static198.anInt7949;
				}
				@Pc(213) int local213 = Static249.anInt4822;
				while (true) {
					if (local213 >= local172) {
						Static47.aClass9_3.method6065(Static396.aClass96Array5[local14], local14, true, local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static329.anInt6070 - Static249.anInt4822;
					for (@Pc(222) int local222 = Static38.anInt1008; local222 < local192; local222++) {
						Static166.aBooleanArrayArray2[local213][local222] = false;
						if (Static335.aBooleanArrayArray4[local213][local222]) {
							@Pc(241) int local241 = local222 + Static272.anInt5271 - Static38.anInt1008;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static67.aClass252ArrayArrayArray2[local243][local220][local241] != null && Static67.aClass252ArrayArrayArray2[local243][local220][local241].aByte100 == local14) {
									Static166.aBooleanArrayArray2[local213][local222] = Static67.aClass252ArrayArrayArray2[local243][local220][local241].aBoolean480;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static47.aClass9_3.method6065(Static396.aClass96Array5[local14], local14, false, local161);
			}
			Static47.aClass9_3.method6063();
		}
		if (!Static248.method3706(true)) {
			Static248.method3706(false);
		}
	}
}
