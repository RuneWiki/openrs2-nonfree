import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!ar;")
	public static final Class15 aClass15_9 = new Class15(64);

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
	public static int anInt6794 = 0;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString252 = "Starting 3d Library";

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
	public static int method5638() {
		return Static93.anInt2052;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5639(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static189.anInt4086++;
		Static40.anInt915 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static297.anInt6000; local7 < Static112.anInt2455; local7++) {
			@Pc(12) Class57[][] local12 = Static18.aClass57ArrayArrayArray1[local7];
			for (local14 = Static151.anInt3337; local14 < Static118.anInt2543; local14++) {
				for (@Pc(17) int local17 = Static349.anInt6795; local17 < Static259.anInt5346; local17++) {
					@Pc(24) Class57 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static248.aBooleanArrayArray4[local14 + Static226.anInt4752 - Static307.anInt3770][local17 + Static226.anInt4752 - Static178.anInt6542] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean117 = true;
							local24.aBoolean118 = true;
							if (local24.aClass95_2 == null) {
								local24.aBoolean116 = false;
							} else {
								local24.aBoolean116 = true;
							}
							Static40.anInt915++;
						} else {
							local24.aBoolean117 = false;
							local24.aBoolean118 = false;
							local24.aByte27 = 0;
							if (local14 >= Static307.anInt3770 - 16 && local14 <= Static307.anInt3770 + 16 && local17 >= Static178.anInt6542 - 16 && local17 <= Static178.anInt6542 + 16 && (local24.aClass2_Sub4_1 != null || local24.aClass2_Sub4_2 != null || local24.aClass2_Sub1_1 != null || local24.aClass2_Sub1_2 != null || local24.aClass2_Sub5_1 != null || local24.aClass95_2 != null)) {
								Static54.aClass80_1.method5704(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static5.aClass26Array1 == Static307.aClass26Array3;
		for (local14 = Static297.anInt6000; local14 < Static112.anInt2455; local14++) {
			@Pc(161) float local161 = local145 ? 202.0F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static84.aClass92_1.method4463() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static248.aBooleanArrayArray4.length;
				if (Static151.anInt3337 + Static248.aBooleanArrayArray4.length > Static151.anInt3338) {
					local172 -= Static151.anInt3337 + Static248.aBooleanArrayArray4.length - Static151.anInt3338;
				}
				@Pc(192) int local192 = Static248.aBooleanArrayArray4[0].length;
				if (Static349.anInt6795 + Static248.aBooleanArrayArray4[0].length > Static220.anInt4569) {
					local192 -= Static349.anInt6795 + Static248.aBooleanArrayArray4[0].length - Static220.anInt4569;
				}
				@Pc(213) int local213 = Static139.anInt3136;
				while (true) {
					if (local213 >= local172) {
						Static54.aClass80_1.method5708(Static307.aClass26Array3[local14], local14, local161, true);
						break;
					}
					@Pc(220) int local220 = local213 + Static151.anInt3337 - Static139.anInt3136;
					for (@Pc(222) int local222 = Static28.anInt5939; local222 < local192; local222++) {
						Static47.aBooleanArrayArray2[local213][local222] = false;
						if (Static248.aBooleanArrayArray4[local213][local222]) {
							@Pc(241) int local241 = local222 + Static349.anInt6795 - Static28.anInt5939;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static18.aClass57ArrayArrayArray1[local243][local220][local241] != null && Static18.aClass57ArrayArrayArray1[local243][local220][local241].aByte31 == local14) {
									Static47.aBooleanArrayArray2[local213][local222] = Static18.aClass57ArrayArrayArray1[local243][local220][local241].aBoolean117;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static54.aClass80_1.method5708(Static307.aClass26Array3[local14], local14, local161, false);
			}
			Static54.aClass80_1.method5703();
		}
		if (!Static219.method3770(true)) {
			Static219.method3770(false);
		}
	}
}
