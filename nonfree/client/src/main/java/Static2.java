import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!fh;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static int anInt3 = 0;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	public static int[] anIntArray1 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	public static int[] anIntArray2 = new int[2500];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIZIIII)V")
	public static void method2(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg2 && Static177.anInt3360 == arg1 && Static3.anInt5 == arg5 && (Static60.anInt1216 == arg6 || Static29.method456())) {
			return;
		}
		Static3.anInt5 = arg5;
		Static60.anInt1216 = arg6;
		Static177.anInt3360 = arg1;
		if (Static29.method456()) {
			Static60.anInt1216 = 0;
		}
		if (arg0) {
			Static15.method233(28);
		} else {
			Static15.method233(25);
		}
		Static306.method4753(Static156.aString187, true);
		@Pc(57) int local57 = Static220.anInt3983;
		@Pc(59) int local59 = Static295.anInt5480;
		Static220.anInt3983 = arg1 * 8 - 48;
		Static295.anInt5480 = arg5 * 8 - 48;
		Static56.aClass4_Sub3_Sub22_1 = Static121.method2401(Static177.anInt3360 * 8, Static3.anInt5 * 8);
		Static294.aClass141_14 = null;
		@Pc(90) int local90 = Static295.anInt5480 - local59;
		@Pc(95) int local95 = Static220.anInt3983 - local57;
		@Pc(103) int local103;
		@Pc(112) Class53_Sub1_Sub2 local112;
		@Pc(117) int local117;
		if (arg0) {
			Static236.anInt4452 = 0;
			for (local103 = 0; local103 < 32768; local103++) {
				local112 = Static110.aClass53_Sub1_Sub2Array1[local103];
				if (local112 != null) {
					local112.anInt4002 -= local90 * 128;
					local112.anInt3974 -= local95 * 128;
					if (local112.anInt3974 >= 0 && local112.anInt3974 <= 13184 && local112.anInt4002 >= 0 && local112.anInt4002 <= 13184) {
						for (local117 = 0; local117 < 10; local117++) {
							local112.anIntArray422[local117] -= local95;
							local112.anIntArray426[local117] -= local90;
						}
						Static278.anIntArray595[Static236.anInt4452++] = local103;
					} else {
						Static110.aClass53_Sub1_Sub2Array1[local103].method3330(null);
						Static110.aClass53_Sub1_Sub2Array1[local103] = null;
					}
				}
			}
		} else {
			for (local103 = 0; local103 < 32768; local103++) {
				local112 = Static110.aClass53_Sub1_Sub2Array1[local103];
				if (local112 != null) {
					for (local117 = 0; local117 < 10; local117++) {
						local112.anIntArray422[local117] -= local95;
						local112.anIntArray426[local117] -= local90;
					}
					local112.anInt3974 -= local95 * 128;
					local112.anInt4002 -= local90 * 128;
				}
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(272) Class53_Sub1_Sub1 local272 = Static182.aClass53_Sub1_Sub1Array1[local103];
			if (local272 != null) {
				for (local117 = 0; local117 < 10; local117++) {
					local272.anIntArray422[local117] -= local95;
					local272.anIntArray426[local117] -= local90;
				}
				local272.anInt4002 -= local90 * 128;
				local272.anInt3974 -= local95 * 128;
			}
		}
		@Pc(320) byte local320 = 0;
		@Pc(322) byte local322 = 1;
		@Pc(324) byte local324 = 104;
		if (local95 < 0) {
			local322 = -1;
			local324 = -1;
			local320 = 103;
		}
		@Pc(337) byte local337 = 0;
		Static281.anInt5335 = arg6;
		@Pc(341) byte local341 = 104;
		Static154.aClass53_Sub1_Sub1_2.method1174(arg3, false, arg4);
		@Pc(349) byte local349 = 1;
		if (local90 < 0) {
			local341 = -1;
			local349 = -1;
			local337 = 103;
		}
		for (@Pc(362) int local362 = local320; local362 != local324; local362 += local322) {
			for (@Pc(367) int local367 = local337; local367 != local341; local367 += local349) {
				@Pc(374) int local374 = local95 + local362;
				@Pc(379) int local379 = local367 + local90;
				for (@Pc(381) int local381 = 0; local381 < 4; local381++) {
					if (local374 >= 0 && local379 >= 0 && local374 < 104 && local379 < 104) {
						Static139.aClass114ArrayArrayArray1[local381][local362][local367] = Static139.aClass114ArrayArrayArray1[local381][local374][local379];
					} else {
						Static139.aClass114ArrayArrayArray1[local381][local362][local367] = null;
					}
				}
			}
		}
		for (@Pc(443) Class4_Sub25 local443 = (Class4_Sub25) Static57.aClass114_7.method2623(); local443 != null; local443 = (Class4_Sub25) Static57.aClass114_7.method2629()) {
			local443.anInt4442 -= local90;
			local443.anInt4446 -= local95;
			if (local443.anInt4446 < 0 || local443.anInt4442 < 0 || local443.anInt4446 >= 104 || local443.anInt4442 >= 104) {
				local443.method4854();
			}
		}
		if (Static239.anInt4507 != 0) {
			Static102.anInt2140 -= local90;
			Static239.anInt4507 -= local95;
		}
		if (arg0) {
			Static302.anInt5682 -= local90 * 128;
			Static151.anInt2977 -= local95;
			Static127.anInt2497 -= local90;
			Static169.anInt3302 -= local95;
			Static212.anInt4165 -= local90;
			Static129.anInt2519 -= local95 * 128;
		} else {
			Static41.anInt772 = 1;
		}
		Static237.anInt4458 = 0;
		if (Static94.aBoolean138 && arg0 && (Math.abs(local95) > 104 || Math.abs(local90) > 104)) {
			Static99.method1655();
		}
		Static245.method3163();
		Static73.aClass114_8.method2619();
		Static10.aClass114_1.method2619();
		Static184.method2976();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method3() {
		Static254.anInterface2Array1 = null;
		Static119.method1859();
	}
}
