import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "[I")
	public static int[] anIntArray12;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString10 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIII)V")
	public static void method254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1007) {
			Static122.method1971(10, arg2, arg1);
		} else if (arg0 == 1010) {
			Static122.method1971(11, arg2, arg1);
		} else if (arg0 == 1002) {
			Static122.method1971(12, arg2, arg1);
		} else if (arg0 == 1012) {
			Static122.method1971(13, arg2, arg1);
			return;
		} else if (arg0 == 1001) {
			Static122.method1971(14, arg2, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class59 local13 = local7.aClass59_2; local13 != null; local13 = local13.aClass59_1) {
			@Pc(17) Class10_Sub1 local17 = local13.aClass10_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort94 == arg1 && local17.aShort91 == arg2) {
				Static269.method4851(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method256(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static77.anInt1573++;
		Static49.anInt5286 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static275.anInt5621; local7 < Static132.anInt6773; local7++) {
			@Pc(12) Class83[][] local12 = Static347.aClass83ArrayArrayArray3[local7];
			for (local14 = Static226.anInt5592; local14 < Static254.anInt5237; local14++) {
				for (@Pc(17) int local17 = Static285.anInt5730; local17 < Static296.anInt5981; local17++) {
					@Pc(24) Class83 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static50.aBooleanArrayArray1[local14 + Static131.anInt2605 - Static97.anInt1886][local17 + Static131.anInt2605 - Static349.anInt6708] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean157 = true;
							local24.aBoolean158 = true;
							if (local24.aClass59_2 == null) {
								local24.aBoolean159 = false;
							} else {
								local24.aBoolean159 = true;
							}
							Static49.anInt5286++;
						} else {
							local24.aBoolean157 = false;
							local24.aBoolean158 = false;
							local24.aByte28 = 0;
							if (local14 >= Static97.anInt1886 - 16 && local14 <= Static97.anInt1886 + 16 && local17 >= Static349.anInt6708 - 16 && local17 <= Static349.anInt6708 + 16 && (local24.aClass10_Sub2_1 != null || local24.aClass10_Sub2_2 != null || local24.aClass10_Sub4_2 != null || local24.aClass10_Sub4_1 != null || local24.aClass10_Sub3_1 != null || local24.aClass59_2 != null)) {
								Static71.aClass135_1.method5044(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static81.aClass12Array1 == Static263.aClass12Array2;
		for (local14 = Static275.anInt5621; local14 < Static132.anInt6773; local14++) {
			@Pc(161) float local161 = local145 ? 202.0F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static176.aClass105_10.method4259() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static50.aBooleanArrayArray1.length;
				if (Static226.anInt5592 + Static50.aBooleanArrayArray1.length > Static97.anInt1852) {
					local172 -= Static226.anInt5592 + Static50.aBooleanArrayArray1.length - Static97.anInt1852;
				}
				@Pc(192) int local192 = Static50.aBooleanArrayArray1[0].length;
				if (Static285.anInt5730 + Static50.aBooleanArrayArray1[0].length > Static3.anInt38) {
					local192 -= Static285.anInt5730 + Static50.aBooleanArrayArray1[0].length - Static3.anInt38;
				}
				@Pc(213) int local213 = Static141.anInt2713;
				while (true) {
					if (local213 >= local172) {
						Static71.aClass135_1.method5042(local161, local14, true, Static263.aClass12Array2[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static226.anInt5592 - Static141.anInt2713;
					for (@Pc(222) int local222 = Static101.anInt1942; local222 < local192; local222++) {
						Static296.aBooleanArrayArray8[local213][local222] = false;
						if (Static50.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static285.anInt5730 - Static101.anInt1942;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static347.aClass83ArrayArrayArray3[local243][local220][local241] != null && Static347.aClass83ArrayArrayArray3[local243][local220][local241].aByte27 == local14) {
									Static296.aBooleanArrayArray8[local213][local222] = Static347.aClass83ArrayArrayArray3[local243][local220][local241].aBoolean157;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static71.aClass135_1.method5042(local161, local14, false, Static263.aClass12Array2[local14]);
			}
			Static71.aClass135_1.method5043();
		}
		if (!Static317.method5430(true)) {
			Static317.method5430(false);
		}
	}
}
