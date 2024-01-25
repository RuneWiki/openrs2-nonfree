import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "J")
	public static long aLong243;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
	public static int anInt5137 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4050(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static455.anInt7589++;
		Static346.anInt6124 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static405.anInt7034; local7 < Static180.anInt3181; local7++) {
			@Pc(12) Class36[][] local12 = Static175.aClass36ArrayArrayArray1[local7];
			for (local14 = Static152.anInt2787; local14 < Static352.anInt6218; local14++) {
				for (@Pc(17) int local17 = Static371.anInt6494; local17 < Static450.anInt7752; local17++) {
					@Pc(24) Class36 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static409.aBooleanArrayArray5[local14 + Static30.anInt535 - Static308.anInt5540][local17 + Static30.anInt535 - Static109.anInt1838] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean31 = true;
							local24.aBoolean32 = true;
							if (local24.aClass195_1 == null) {
								local24.aBoolean33 = false;
							} else {
								local24.aBoolean33 = true;
							}
							Static346.anInt6124++;
						} else {
							local24.aBoolean31 = false;
							local24.aBoolean32 = false;
							local24.aByte3 = 0;
							if (local14 >= Static308.anInt5540 - 16 && local14 <= Static308.anInt5540 + 16 && local17 >= Static109.anInt1838 - 16 && local17 <= Static109.anInt1838 + 16 && (local24.aClass11_Sub1_2 != null || local24.aClass11_Sub1_3 != null || local24.aClass11_Sub2_1 != null || local24.aClass11_Sub2_2 != null || local24.aClass11_Sub3_1 != null || local24.aClass195_1 != null)) {
								Static45.aClass20_1.method5681(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static46.aClass22Array1 == Static241.aClass22Array3;
		for (local14 = Static405.anInt7034; local14 < Static180.anInt3181; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static29.aClass75_4.method6002() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static409.aBooleanArrayArray5.length;
				if (Static152.anInt2787 + Static409.aBooleanArrayArray5.length > Static212.anInt3636) {
					local172 -= Static152.anInt2787 + Static409.aBooleanArrayArray5.length - Static212.anInt3636;
				}
				@Pc(192) int local192 = Static409.aBooleanArrayArray5[0].length;
				if (Static371.anInt6494 + Static409.aBooleanArrayArray5[0].length > Static104.anInt1675) {
					local192 -= Static371.anInt6494 + Static409.aBooleanArrayArray5[0].length - Static104.anInt1675;
				}
				@Pc(213) int local213 = Static381.anInt6602;
				while (true) {
					if (local213 >= local172) {
						Static45.aClass20_1.method5675(local161, Static241.aClass22Array3[local14], local14, true);
						break;
					}
					@Pc(220) int local220 = local213 + Static152.anInt2787 - Static381.anInt6602;
					for (@Pc(222) int local222 = Static186.anInt3293; local222 < local192; local222++) {
						Static150.aBooleanArrayArray20[local213][local222] = false;
						if (Static409.aBooleanArrayArray5[local213][local222]) {
							@Pc(241) int local241 = local222 + Static371.anInt6494 - Static186.anInt3293;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static175.aClass36ArrayArrayArray1[local243][local220][local241] != null && Static175.aClass36ArrayArrayArray1[local243][local220][local241].aByte2 == local14) {
									Static150.aBooleanArrayArray20[local213][local222] = Static175.aClass36ArrayArrayArray1[local243][local220][local241].aBoolean31;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static45.aClass20_1.method5675(local161, Static241.aClass22Array3[local14], local14, false);
			}
			Static45.aClass20_1.method5682();
		}
		if (!Static122.method1961(true)) {
			Static122.method1961(false);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
	public static int method4051(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
