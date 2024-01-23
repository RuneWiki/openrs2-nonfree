import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Z")
	public static boolean aBoolean297;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
	public static int anInt3880 = -1;

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "[I")
	public static int[] anIntArray454 = new int[4096];

	@OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
	public static int anInt3910 = 0;

	@OriginalMember(owner = "client!jj", name = "eb", descriptor = "[Z")
	private static boolean[] aBooleanArray18 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!jj", name = "hb", descriptor = "I")
	public static int anInt3918 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!og;IB)I")
	public static int method3069(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray30 == null || arg0.anIntArrayArray30.length <= arg1) {
			return -2;
		}
		try {
			@Pc(26) int[] local26 = arg0.anIntArrayArray30[arg1];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(32) byte local32 = 0;
			while (true) {
				@Pc(37) int local37 = local26[local28++];
				@Pc(39) int local39 = 0;
				@Pc(41) byte local41 = 0;
				if (local37 == 0) {
					return local30;
				}
				if (local37 == 1) {
					local39 = Static211.anIntArray127[local26[local28++]];
				}
				if (local37 == 15) {
					local41 = 1;
				}
				if (local37 == 2) {
					local39 = Static90.anIntArray533[local26[local28++]];
				}
				if (local37 == 3) {
					local39 = Static278.anIntArray657[local26[local28++]];
				}
				if (local37 == 16) {
					local41 = 2;
				}
				@Pc(111) int local111;
				@Pc(122) Class127 local122;
				@Pc(127) int local127;
				@Pc(141) int local141;
				if (local37 == 4) {
					local111 = local26[local28++] << 16;
					@Pc(118) int local118 = local111 + local26[local28++];
					local122 = Static75.method1287(local118);
					local127 = local26[local28++];
					if (local127 != -1 && (!Static183.method4458(local127).aBoolean246 || Static77.aBoolean118)) {
						for (local141 = 0; local141 < local122.anIntArray415.length; local141++) {
							if (local122.anIntArray415[local141] == local127 + 1) {
								local39 += local122.anIntArray422[local141];
							}
						}
					}
				}
				if (local37 == 5) {
					local39 = Static224.anIntArray535[local26[local28++]];
				}
				if (local37 == 6) {
					local39 = Class1_Sub1.anIntArray682[Static90.anIntArray533[local26[local28++]] - 1];
				}
				if (local37 == 7) {
					local39 = Static224.anIntArray535[local26[local28++]] * 100 / 46875;
				}
				if (local37 == 17) {
					local41 = 3;
				}
				if (local37 == 8) {
					local39 = Static28.aClass6_Sub6_Sub2_1.anInt4593;
				}
				if (local37 == 9) {
					for (local111 = 0; local111 < 25; local111++) {
						if (aBooleanArray18[local111]) {
							local39 += Static90.anIntArray533[local111];
						}
					}
				}
				if (local37 == 10) {
					local111 = local26[local28++] << 16;
					local111 += local26[local28++];
					local122 = Static75.method1287(local111);
					local127 = local26[local28++];
					if (local127 != -1 && (!Static183.method4458(local127).aBoolean246 || Static77.aBoolean118)) {
						for (local141 = 0; local141 < local122.anIntArray415.length; local141++) {
							if (local127 + 1 == local122.anIntArray415[local141]) {
								local39 = 999999999;
								break;
							}
						}
					}
				}
				if (local37 == 11) {
					local39 = Static228.anInt4543;
				}
				if (local37 == 12) {
					local39 = Static236.anInt4922;
				}
				if (local37 == 13) {
					local111 = Static224.anIntArray535[local26[local28++]];
					@Pc(342) int local342 = local26[local28++];
					local39 = (0x1 << local342 & local111) == 0 ? 0 : 1;
				}
				if (local37 == 14) {
					local111 = local26[local28++];
					local39 = Static267.method4108(local111);
				}
				if (local37 == 18) {
					local39 = Static224.anInt4695 + (Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7);
				}
				if (local37 == 19) {
					local39 = Static158.anInt2961 + (Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7);
				}
				if (local37 == 20) {
					local39 = local26[local28++];
				}
				if (local41 == 0) {
					if (local32 == 0) {
						local30 += local39;
					}
					if (local32 == 1) {
						local30 -= local39;
					}
					if (local32 == 2 && local39 != 0) {
						local30 /= local39;
					}
					if (local32 == 3) {
						local30 *= local39;
					}
					local32 = 0;
				} else {
					local32 = local41;
				}
			}
		} catch (@Pc(450) Exception local450) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIII)V")
	public static void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = arg4 + 1;
		Static288.method4405(arg0, arg1, arg3, Static151.anIntArrayArray26[arg4]);
		@Pc(23) int local23 = arg2 - 1;
		Static288.method4405(arg0, arg1, arg3, Static151.anIntArrayArray26[arg2]);
		for (@Pc(27) int local27 = local12; local27 <= local23; local27++) {
			@Pc(34) int[] local34 = Static151.anIntArrayArray26[local27];
			local34[arg3] = local34[arg1] = arg0;
		}
	}
}
