import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4664(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static230.anInt4157++;
		Static248.anInt4540 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static514.anInt8971; local7 < Static323.anInt6015; local7++) {
			@Pc(12) Class262[][] local12 = Static399.aClass262ArrayArrayArray2[local7];
			for (local14 = Static75.anInt1567; local14 < Static466.anInt8396; local14++) {
				for (@Pc(17) int local17 = Static469.anInt8451; local17 < Static392.anInt7448; local17++) {
					@Pc(24) Class262 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static533.aBooleanArrayArray6[local14 + Static207.anInt3723 - Static364.anInt6864][local17 + Static207.anInt3723 - Static113.anInt2306] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean590 = true;
							local24.aBoolean592 = true;
							if (local24.aClass187_3 == null) {
								local24.aBoolean591 = false;
							} else {
								local24.aBoolean591 = true;
							}
							Static248.anInt4540++;
						} else {
							local24.aBoolean590 = false;
							local24.aBoolean592 = false;
							local24.aByte95 = 0;
							if (local14 >= Static364.anInt6864 - 16 && local14 <= Static364.anInt6864 + 16 && local17 >= Static113.anInt2306 - 16 && local17 <= Static113.anInt2306 + 16 && (local24.aClass1_Sub2_3 != null || local24.aClass1_Sub2_2 != null || local24.aClass1_Sub3_2 != null || local24.aClass1_Sub3_3 != null || local24.aClass1_Sub4_1 != null || local24.aClass187_3 != null)) {
								Static41.aClass137_1.method6554(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static427.aClass75Array2 == Static532.aClass75Array3;
		for (local14 = Static514.anInt8971; local14 < Static323.anInt6015; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static452.aClass39_10.method6036() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static533.aBooleanArrayArray6.length;
				if (Static75.anInt1567 + Static533.aBooleanArrayArray6.length > Static515.anInt3809) {
					local172 -= Static75.anInt1567 + Static533.aBooleanArrayArray6.length - Static515.anInt3809;
				}
				@Pc(192) int local192 = Static533.aBooleanArrayArray6[0].length;
				if (Static469.anInt8451 + Static533.aBooleanArrayArray6[0].length > Static315.anInt5693) {
					local192 -= Static469.anInt8451 + Static533.aBooleanArrayArray6[0].length - Static315.anInt5693;
				}
				@Pc(213) int local213 = Static448.anInt8164;
				while (true) {
					if (local213 >= local172) {
						Static41.aClass137_1.method6545(local161, local14, true, Static532.aClass75Array3[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static75.anInt1567 - Static448.anInt8164;
					for (@Pc(222) int local222 = Static244.anInt4329; local222 < local192; local222++) {
						Static138.aBooleanArrayArray1[local213][local222] = false;
						if (Static533.aBooleanArrayArray6[local213][local222]) {
							@Pc(241) int local241 = local222 + Static469.anInt8451 - Static244.anInt4329;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static399.aClass262ArrayArrayArray2[local243][local220][local241] != null && Static399.aClass262ArrayArrayArray2[local243][local220][local241].aByte96 == local14) {
									Static138.aBooleanArrayArray1[local213][local222] = Static399.aClass262ArrayArrayArray2[local243][local220][local241].aBoolean590;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static41.aClass137_1.method6545(local161, local14, false, Static532.aClass75Array3[local14]);
			}
			Static41.aClass137_1.method6552();
		}
		if (!Static112.method2188(true)) {
			Static112.method2188(false);
		}
	}
}
