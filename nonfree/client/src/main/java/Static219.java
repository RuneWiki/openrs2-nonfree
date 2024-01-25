import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "[Lclient!vn;")
	public static Class242[] aClass242Array2;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
	public static int anInt4061;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method3701(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static284.anInt5039++;
		Static295.anInt5285 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static201.anInt4804; local7 < Static32.anInt6037; local7++) {
			@Pc(12) Class227[][] local12 = Static297.aClass227ArrayArrayArray7[local7];
			for (local14 = Static218.anInt4049; local14 < Static263.anInt4660; local14++) {
				for (@Pc(17) int local17 = Static276.anInt4907; local17 < Static376.anInt6609; local17++) {
					@Pc(24) Class227 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static227.aBooleanArrayArray5[local14 + Static273.anInt4882 - Static33.anInt702][local17 + Static273.anInt4882 - Static345.anInt6083] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean463 = true;
							local24.aBoolean465 = true;
							if (local24.aClass164_25 == null) {
								local24.aBoolean464 = false;
							} else {
								local24.aBoolean464 = true;
							}
							Static295.anInt5285++;
						} else {
							local24.aBoolean463 = false;
							local24.aBoolean465 = false;
							local24.aByte66 = 0;
							if (local14 >= Static33.anInt702 - 16 && local14 <= Static33.anInt702 + 16 && local17 >= Static345.anInt6083 - 16 && local17 <= Static345.anInt6083 + 16 && (local24.aClass12_Sub2_2 != null || local24.aClass12_Sub2_3 != null || local24.aClass12_Sub4_3 != null || local24.aClass12_Sub4_2 != null || local24.aClass12_Sub5_2 != null || local24.aClass164_25 != null)) {
								Static42.aClass51_1.method2514(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static345.aClass33Array3 == Static17.aClass33Array1;
		for (local14 = Static201.anInt4804; local14 < Static32.anInt6037; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static315.aClass82_7.method4543() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static227.aBooleanArrayArray5.length;
				if (Static218.anInt4049 + Static227.aBooleanArrayArray5.length > Static166.anInt2967) {
					local172 -= Static218.anInt4049 + Static227.aBooleanArrayArray5.length - Static166.anInt2967;
				}
				@Pc(192) int local192 = Static227.aBooleanArrayArray5[0].length;
				if (Static276.anInt4907 + Static227.aBooleanArrayArray5[0].length > Static244.anInt1024) {
					local192 -= Static276.anInt4907 + Static227.aBooleanArrayArray5[0].length - Static244.anInt1024;
				}
				@Pc(213) int local213 = Static166.anInt2978;
				while (true) {
					if (local213 >= local172) {
						Static42.aClass51_1.method2512(local14, local161, Static17.aClass33Array1[local14], true);
						break;
					}
					@Pc(220) int local220 = local213 + Static218.anInt4049 - Static166.anInt2978;
					for (@Pc(222) int local222 = Static276.anInt4912; local222 < local192; local222++) {
						Static15.aBooleanArrayArray1[local213][local222] = false;
						if (Static227.aBooleanArrayArray5[local213][local222]) {
							@Pc(241) int local241 = local222 + Static276.anInt4907 - Static276.anInt4912;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static297.aClass227ArrayArrayArray7[local243][local220][local241] != null && Static297.aClass227ArrayArrayArray7[local243][local220][local241].aByte68 == local14) {
									Static15.aBooleanArrayArray1[local213][local222] = Static297.aClass227ArrayArrayArray7[local243][local220][local241].aBoolean463;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static42.aClass51_1.method2512(local14, local161, Static17.aClass33Array1[local14], false);
			}
			Static42.aClass51_1.method2510();
		}
		if (!Static62.method1133(true)) {
			Static62.method1133(false);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
	public static void method3703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg2 >= Static332.anInt5823 && arg1 + arg2 <= Static202.anInt3722 && arg3 - arg2 >= Static313.anInt5542 && Static345.anInt6084 >= arg2 + arg3) {
			Static16.method488(arg1, arg0, arg2, arg3);
		} else {
			Static329.method5057(arg3, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lclient!ji;")
	public static Class2_Sub20 method3707() {
		if (Static302.aClass210_4 == null || Static252.aClass150_1 == null) {
			return null;
		}
		for (@Pc(21) Class2_Sub20 local21 = (Class2_Sub20) Static252.aClass150_1.method3698(); local21 != null; local21 = (Class2_Sub20) Static252.aClass150_1.method3698()) {
			@Pc(29) Class80 local29 = Static302.aClass211_2.method5049(local21.anInt3000);
			if (local29 != null && local29.aBoolean156 && local29.method1849(Static302.anInterface2_2)) {
				return local21;
			}
		}
		return null;
	}
}
