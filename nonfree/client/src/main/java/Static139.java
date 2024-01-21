import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!og", name = "N", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_19;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "I")
	public static int anInt2898;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1090 = Static161.method2452("Free world");

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1091 = aClass20_1090;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "[I")
	public static final int[] anIntArray309 = new int[2000];

	@OriginalMember(owner = "client!og", name = "V", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[100];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BZ)V")
	public static void method2159(@OriginalArg(1) boolean arg0) {
		if (Static166.anInt3320 == Static210.aClass1_Sub2_Sub2_2.anInt2241 >> 7 && Static210.aClass1_Sub2_Sub2_2.anInt2234 >> 7 == Static169.anInt3386) {
			Static166.anInt3320 = 0;
		}
		@Pc(25) int local25 = Static66.anInt1444;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(43) int local43 = 0; local43 < local25; local43++) {
			@Pc(49) Class1_Sub2_Sub2 local49;
			@Pc(51) long local51;
			if (arg0) {
				local49 = Static210.aClass1_Sub2_Sub2_2;
				local51 = 8791798054912L;
			} else {
				local51 = (long) Static7.anIntArray13[local43] << 32;
				local49 = Static6.aClass1_Sub2_Sub2Array1[Static7.anIntArray13[local43]];
			}
			if (local49 != null && local49.method1741()) {
				@Pc(77) int local77 = local49.anInt2241 >> 7;
				@Pc(82) int local82 = local49.anInt2234 >> 7;
				local49.aBoolean97 = false;
				if ((Static14.aBoolean14 && Static66.anInt1444 > 50 || Static66.anInt1444 > 200) && !arg0 && local49.anInt2216 == local49.anInt2215) {
					local49.aBoolean97 = true;
				}
				if (local77 >= 0 && local77 < 104 && local82 >= 0 && local82 < 104) {
					if (local49.aClass1_Sub1_1 == null || Static177.anInt3533 < local49.anInt2272 || local49.anInt2293 <= Static177.anInt3533) {
						if ((local49.anInt2241 & 0x7F) == 64 && (local49.anInt2234 & 0x7F) == 64) {
							if (Static203.anInt3983 == Static57.anIntArrayArray13[local77][local82]) {
								continue;
							}
							Static57.anIntArrayArray13[local77][local82] = Static203.anInt3983;
						}
						local49.anInt2231 = Static128.method1999(Static111.anInt2327, local49.anInt2241, local49.anInt2234);
						Static77.method2443(Static111.anInt2327, local49.anInt2241, local49.anInt2234, local49.anInt2231, 60, local49, local49.anInt2244, local51, local49.aBoolean96);
					} else {
						local49.aBoolean97 = false;
						local49.anInt2231 = Static128.method1999(Static111.anInt2327, local49.anInt2241, local49.anInt2234);
						Static27.method408(Static111.anInt2327, local49.anInt2241, local49.anInt2234, local49.anInt2231, local49, local49.anInt2244, local51, local49.anInt2277, local49.anInt2280, local49.anInt2279, local49.anInt2283);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	public static void method2160() {
		Static10.aClass5_Sub6_Sub1_1.method3088();
		@Pc(13) int local13 = Static10.aClass5_Sub6_Sub1_1.method3090(8);
		@Pc(22) int local22;
		if (local13 < Static83.anInt1850) {
			for (local22 = local13; local22 < Static83.anInt1850; local22++) {
				Static105.anIntArray234[Static65.anInt1422++] = Static80.anIntArray175[local22];
			}
		}
		if (Static83.anInt1850 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static83.anInt1850 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(62) int local62 = Static80.anIntArray175[local22];
			@Pc(66) Class1_Sub2_Sub1 local66 = Static61.aClass1_Sub2_Sub1Array1[local62];
			@Pc(71) int local71 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
			if (local71 == 0) {
				Static80.anIntArray175[Static83.anInt1850++] = local62;
				local66.anInt2258 = Static177.anInt3533;
			} else {
				@Pc(91) int local91 = Static10.aClass5_Sub6_Sub1_1.method3090(2);
				if (local91 == 0) {
					Static80.anIntArray175[Static83.anInt1850++] = local62;
					local66.anInt2258 = Static177.anInt3533;
					Static188.anIntArray395[Static17.anInt347++] = local62;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local91 == 1) {
						Static80.anIntArray175[Static83.anInt1850++] = local62;
						local66.anInt2258 = Static177.anInt3533;
						local133 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
						local66.method1743(local133, false);
						local143 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
						if (local143 == 1) {
							Static188.anIntArray395[Static17.anInt347++] = local62;
						}
					} else if (local91 == 2) {
						Static80.anIntArray175[Static83.anInt1850++] = local62;
						local66.anInt2258 = Static177.anInt3533;
						local133 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
						local66.method1743(local133, true);
						local143 = Static10.aClass5_Sub6_Sub1_1.method3090(3);
						local66.method1743(local143, true);
						@Pc(195) int local195 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
						if (local195 == 1) {
							Static188.anIntArray395[Static17.anInt347++] = local62;
						}
					} else if (local91 == 3) {
						Static105.anIntArray234[Static65.anInt1422++] = local62;
					}
				}
			}
		}
	}
}
