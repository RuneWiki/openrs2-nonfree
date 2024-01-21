import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array9;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "I")
	public static int anInt3196;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!eb;")
	public static Class17 aClass17_52 = new Class17(64);

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static int anInt3185 = -1;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "[Lclient!lc;")
	public static Class41[] aClass41Array1 = new Class41[16];

	@OriginalMember(owner = "client!td", name = "C", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1330 = Static59.method1195("Accept trade");

	@OriginalMember(owner = "client!td", name = "F", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1332 = Static59.method1195("Hide");

	@OriginalMember(owner = "client!td", name = "E", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1331 = aClass60_1332;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	public static int anInt3197 = 0;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1333 = aClass60_1330;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!mf;IBLclient!mf;)Lclient!mf;")
	public static Class3_Sub15 method2098(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub15 arg3) {
		@Pc(23) Class3_Sub15 local23 = Static74.method1549(arg3.anInt2270, arg3.anInt2304, arg1, arg2, 0, arg0, arg3.anInt2241, arg3.anInt2286, arg3.anInt2273, Static120.aClass3_Sub15ArrayArray1[arg3.anInt2286 >> 16], 0);
		if (local23 == null) {
			if (arg3.aClass3_Sub15Array2 != null) {
				local23 = Static74.method1549(arg3.anInt2270, arg3.anInt2304, arg1, arg2, 0, arg0, arg3.anInt2241, arg3.anInt2286, arg3.anInt2273, arg3.aClass3_Sub15Array2, 0);
			}
			return local23;
		} else {
			return local23;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method2110() {
		aClass3_Sub1_Sub2_Sub3Array9 = null;
		aClass41Array1 = null;
		aClass60_1333 = null;
		aClass60_1331 = null;
		aClass17_52 = null;
		anIntArray338 = null;
		aClass60_1330 = null;
		aClass60_1332 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!md;II)V")
	public static void method2111(@OriginalArg(0) Class3_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		Static71.method1017(arg0.anInt1524, arg1, arg0.anInt1494);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public static void method2112() {
		if (Static101.anInt2962 != 0) {
			return;
		}
		Static22.anInt872 = 1;
		Static68.aClass60Array12[0] = Static130.aClass60_1446;
		Static2.anIntArray22[0] = 1001;
		if (anInt3185 != -1) {
			Static70.anInt2194 = -1;
			Static113.anInt3149 = -1;
			Static26.method651(0, anInt3185, 0, 0, Static12.anInt374, 765, Static122.anInt720, 503);
			Static73.anInt2367 = Static70.anInt2194;
			Static97.anInt2778 = Static113.anInt3149;
			return;
		}
		@Pc(45) boolean local45 = false;
		Static74.method1547();
		Static70.anInt2194 = -1;
		Static113.anInt3149 = -1;
		if (Static122.anInt720 > 4 && Static12.anInt374 > 4 && Static122.anInt720 < 516 && Static12.anInt374 < 338) {
			if (Static79.anInt2467 == -1) {
				Static61.method1244();
			} else {
				Static26.method651(4, Static79.anInt2467, 0, 4, Static12.anInt374, 516, Static122.anInt720, 338);
			}
		}
		Static97.anInt2778 = Static113.anInt3149;
		Static73.anInt2367 = Static70.anInt2194;
		Static70.anInt2194 = -1;
		Static113.anInt3149 = -1;
		if (Static122.anInt720 > 553 && Static12.anInt374 > 205 && Static122.anInt720 < 743 && Static12.anInt374 < 466) {
			if (Static119.anInt3242 != -1) {
				Static26.method651(553, Static119.anInt3242, 1, 205, Static12.anInt374, 743, Static122.anInt720, 466);
			} else if (Static22.anIntArray87[Static51.anInt1340] != -1) {
				Static26.method651(553, Static22.anIntArray87[Static51.anInt1340], 1, 205, Static12.anInt374, 743, Static122.anInt720, 466);
			}
		}
		if (Static38.anInt1281 != Static70.anInt2194) {
			Static118.aBoolean115 = true;
			Static38.anInt1281 = Static70.anInt2194;
		}
		if (Static113.anInt3149 != Static73.anInt2370) {
			Static73.anInt2370 = Static113.anInt3149;
			Static118.aBoolean115 = true;
		}
		Static113.anInt3149 = -1;
		Static70.anInt2194 = -1;
		if (Static122.anInt720 > 17 && Static12.anInt374 > 357 && Static122.anInt720 < 496 && Static12.anInt374 < 453) {
			if (Static78.anInt2429 != -1) {
				Static26.method651(17, Static78.anInt2429, 2, 357, Static12.anInt374, 496, Static122.anInt720, 453);
			} else if (Static129.anInt3460 != -1) {
				Static26.method651(17, Static129.anInt3460, 3, 357, Static12.anInt374, 496, Static122.anInt720, 453);
			} else if (Static12.anInt374 < 434 && Static122.anInt720 < 426) {
				Static78.method1575(Static12.anInt374 - 357, Static122.anInt720 + -17);
			}
		}
		if ((Static78.anInt2429 != -1 || Static129.anInt3460 != -1) && Static59.anInt1874 != Static70.anInt2194) {
			Static71.aBoolean49 = true;
			Static59.anInt1874 = Static70.anInt2194;
		}
		if ((Static78.anInt2429 != -1 || Static129.anInt3460 != -1) && Static113.anInt3149 != Static89.anInt2619) {
			Static71.aBoolean49 = true;
			Static89.anInt2619 = Static113.anInt3149;
		}
		while (!local45) {
			local45 = true;
			for (@Pc(264) int local264 = 0; local264 < Static22.anInt872 - 1; local264++) {
				if (Static2.anIntArray22[local264] < 1000 && Static2.anIntArray22[local264 + 1] > 1000) {
					local45 = false;
					@Pc(288) Class60 local288 = Static68.aClass60Array12[local264];
					Static68.aClass60Array12[local264] = Static68.aClass60Array12[local264 + 1];
					Static68.aClass60Array12[local264 + 1] = local288;
					@Pc(306) int local306 = Static2.anIntArray22[local264];
					Static2.anIntArray22[local264] = Static2.anIntArray22[local264 + 1];
					Static2.anIntArray22[local264 + 1] = local306;
					@Pc(324) int local324 = Static89.anIntArray279[local264];
					Static89.anIntArray279[local264] = Static89.anIntArray279[local264 + 1];
					Static89.anIntArray279[local264 + 1] = local324;
					@Pc(342) int local342 = Static115.anIntArray339[local264];
					Static115.anIntArray339[local264] = Static115.anIntArray339[local264 + 1];
					Static115.anIntArray339[local264 + 1] = local342;
					@Pc(360) int local360 = Static49.anIntArray188[local264];
					Static49.anIntArray188[local264] = Static49.anIntArray188[local264 + 1];
					Static49.anIntArray188[local264 + 1] = local360;
				}
			}
		}
	}
}
