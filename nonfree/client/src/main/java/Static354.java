import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
	public static int[] anIntArray555;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "[B")
	public static byte[] aByteArray97;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	public static int anInt6503 = 0;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
	public static final int[] anIntArray556 = new int[5];

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public static int anInt6509 = 2;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5611(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static301.anInt5604++;
		Static132.anInt2870 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static4.anInt135; local7 < Static73.anInt1624; local7++) {
			@Pc(12) Class188[][] local12 = Static45.aClass188ArrayArrayArray5[local7];
			for (local14 = Static94.anInt2021; local14 < Static310.anInt5683; local14++) {
				for (@Pc(17) int local17 = Static287.anInt5307; local17 < Static286.anInt5279; local17++) {
					@Pc(24) Class188 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static133.aBooleanArrayArray3[local14 + Static113.anInt5764 - Static284.anInt5626][local17 + Static113.anInt5764 - Static373.anInt6861] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean378 = true;
							local24.aBoolean380 = true;
							if (local24.aClass168_2 == null) {
								local24.aBoolean379 = false;
							} else {
								local24.aBoolean379 = true;
							}
							Static132.anInt2870++;
						} else {
							local24.aBoolean378 = false;
							local24.aBoolean380 = false;
							local24.aByte42 = 0;
							if (local14 >= Static284.anInt5626 - 16 && local14 <= Static284.anInt5626 + 16 && local17 >= Static373.anInt6861 - 16 && local17 <= Static373.anInt6861 + 16 && (local24.aClass1_Sub5_2 != null || local24.aClass1_Sub5_1 != null || local24.aClass1_Sub3_3 != null || local24.aClass1_Sub3_2 != null || local24.aClass1_Sub1_2 != null || local24.aClass168_2 != null)) {
								Static185.aClass19_1.method5299(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static248.aClass149Array3 == Static128.aClass149Array1;
		for (local14 = Static4.anInt135; local14 < Static73.anInt1624; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static59.aClass48_2.method2453() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static133.aBooleanArrayArray3.length;
				if (Static94.anInt2021 + Static133.aBooleanArrayArray3.length > Static176.anInt3742) {
					local172 -= Static94.anInt2021 + Static133.aBooleanArrayArray3.length - Static176.anInt3742;
				}
				@Pc(192) int local192 = Static133.aBooleanArrayArray3[0].length;
				if (Static287.anInt5307 + Static133.aBooleanArrayArray3[0].length > Static285.anInt5263) {
					local192 -= Static287.anInt5307 + Static133.aBooleanArrayArray3[0].length - Static285.anInt5263;
				}
				@Pc(213) int local213 = Static121.anInt6767;
				while (true) {
					if (local213 >= local172) {
						Static185.aClass19_1.method5304(local14, true, Static128.aClass149Array1[local14], local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static94.anInt2021 - Static121.anInt6767;
					for (@Pc(222) int local222 = Static18.anInt314; local222 < local192; local222++) {
						Static66.aBooleanArrayArray1[local213][local222] = false;
						if (Static133.aBooleanArrayArray3[local213][local222]) {
							@Pc(241) int local241 = local222 + Static287.anInt5307 - Static18.anInt314;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static45.aClass188ArrayArrayArray5[local243][local220][local241] != null && Static45.aClass188ArrayArrayArray5[local243][local220][local241].aByte43 == local14) {
									Static66.aBooleanArrayArray1[local213][local222] = Static45.aClass188ArrayArrayArray5[local243][local220][local241].aBoolean378;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static185.aClass19_1.method5304(local14, false, Static128.aClass149Array1[local14], local161);
			}
			Static185.aClass19_1.method5298();
		}
		if (!Static38.method533(true)) {
			Static38.method533(false);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)I")
	public static int method5612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static57.anIntArray90[arg1 & 0x3] : Static58.anIntArray91[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public static void method5613() {
		Static389.aStringArray45 = new String[500];
		Static159.anInt3285 = Static121.aClass24_10.anInt424 + Static121.aClass24_10.anInt418 + 2;
		Static255.anInt4901 = Static209.aClass24_6.anInt424 + Static209.aClass24_6.anInt418 + 2;
		for (@Pc(33) int local33 = 0; local33 < Static389.aStringArray45.length; local33++) {
			Static389.aStringArray45[local33] = "";
		}
	}
}
