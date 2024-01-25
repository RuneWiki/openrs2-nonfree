import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt7380 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method5719() {
		if (Static151.anInt2579 == 10 || Static151.anInt2579 == 28) {
			Static125.method1863(5000, Static402.anInt6941 >> 10, Static306.anInt5497 >> 10);
		} else {
			@Pc(14) int local14 = Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray590[0] >> 3;
			@Pc(21) int local21 = Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray589[0] >> 3;
			if (local14 >= 0 && local14 < Static135.anInt2314 >> 3 && local21 >= 0 && local21 < Static352.anInt6022 >> 3) {
				Static125.method1863(5000, local21, local14);
			} else {
				Static125.method1863(0, Static352.anInt6022 >> 4, Static135.anInt2314 >> 4);
			}
		}
		Static373.method5115();
		Static211.method3225();
		Static238.method3536();
		Static131.method5613();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5720(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static48.anInt907++;
		Static331.anInt5788 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static201.anInt3737; local7 < Static107.anInt1964; local7++) {
			@Pc(12) Class211[][] local12 = Static268.aClass211ArrayArrayArray4[local7];
			for (local14 = Static1.anInt149; local14 < Static160.anInt2750; local14++) {
				for (@Pc(17) int local17 = Static179.anInt3236; local17 < Static333.anInt5793; local17++) {
					@Pc(24) Class211 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static250.aBooleanArrayArray3[local14 + Static11.anInt315 - Static384.anInt6665][local17 + Static11.anInt315 - Static379.anInt6498] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean397 = true;
							local24.aBoolean398 = true;
							if (local24.aClass125_3 == null) {
								local24.aBoolean399 = false;
							} else {
								local24.aBoolean399 = true;
							}
							Static331.anInt5788++;
						} else {
							local24.aBoolean397 = false;
							local24.aBoolean398 = false;
							local24.aByte76 = 0;
							if (local14 >= Static384.anInt6665 - 16 && local14 <= Static384.anInt6665 + 16 && local17 >= Static379.anInt6498 - 16 && local17 <= Static379.anInt6498 + 16 && (local24.aClass26_Sub1_2 != null || local24.aClass26_Sub1_3 != null || local24.aClass26_Sub3_3 != null || local24.aClass26_Sub3_2 != null || local24.aClass26_Sub4_2 != null || local24.aClass125_3 != null)) {
								Static66.aClass54_1.method4347(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static160.aClass136Array2 == Static92.aClass136Array1;
		for (local14 = Static201.anInt3737; local14 < Static107.anInt1964; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static233.aClass109_7.method4703() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static250.aBooleanArrayArray3.length;
				if (Static1.anInt149 + Static250.aBooleanArrayArray3.length > Static377.anInt6467) {
					local172 -= Static1.anInt149 + Static250.aBooleanArrayArray3.length - Static377.anInt6467;
				}
				@Pc(192) int local192 = Static250.aBooleanArrayArray3[0].length;
				if (Static179.anInt3236 + Static250.aBooleanArrayArray3[0].length > Static378.anInt6480) {
					local192 -= Static179.anInt3236 + Static250.aBooleanArrayArray3[0].length - Static378.anInt6480;
				}
				@Pc(213) int local213 = Static145.anInt2469;
				while (true) {
					if (local213 >= local172) {
						Static66.aClass54_1.method4351(true, Static92.aClass136Array1[local14], local161, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static1.anInt149 - Static145.anInt2469;
					for (@Pc(222) int local222 = Static58.anInt1250; local222 < local192; local222++) {
						Static420.aBooleanArrayArray6[local213][local222] = false;
						if (Static250.aBooleanArrayArray3[local213][local222]) {
							@Pc(241) int local241 = local222 + Static179.anInt3236 - Static58.anInt1250;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static268.aClass211ArrayArrayArray4[local243][local220][local241] != null && Static268.aClass211ArrayArrayArray4[local243][local220][local241].aByte78 == local14) {
									Static420.aBooleanArrayArray6[local213][local222] = Static268.aClass211ArrayArrayArray4[local243][local220][local241].aBoolean397;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static66.aClass54_1.method4351(false, Static92.aClass136Array1[local14], local161, local14);
			}
			Static66.aClass54_1.method4337();
		}
		if (!Static335.method1048(true)) {
			Static335.method1048(false);
		}
	}
}
