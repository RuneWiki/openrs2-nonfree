import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array12;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
	public static int[] anIntArray623 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "[I")
	public static int[] anIntArray624 = new int[100];

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "[I")
	public static int[] anIntArray625 = new int[1000];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
	public static void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static118.method1920(arg3);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg3 - arg5;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(28) int local28 = -arg3;
		@Pc(30) int local30 = arg3;
		@Pc(33) int local33 = -local17;
		@Pc(35) int local35 = local17;
		@Pc(46) int local46 = -1;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(93) int local93;
		if (Static245.anInt6027 <= arg4 && arg4 <= Static111.anInt2039) {
			@Pc(56) int[] local56 = Static129.anIntArrayArray40[arg4];
			local65 = Static167.method2786(arg0 - arg3, Static204.anInt4020, Static175.anInt3267);
			local74 = Static167.method2786(arg0 + arg3, Static204.anInt4020, Static175.anInt3267);
			local83 = Static167.method2786(arg0 - local17, Static204.anInt4020, Static175.anInt3267);
			local93 = Static167.method2786(arg0 + local17, Static204.anInt4020, Static175.anInt3267);
			Static235.method3988(arg1, local56, local83, local65);
			Static235.method3988(arg2, local56, local93, local83);
			Static235.method3988(arg1, local56, local74, local93);
		}
		@Pc(113) int local113 = -1;
		while (local12 < local30) {
			local113 += 2;
			local46 += 2;
			local33 += local113;
			local28 += local46;
			if (local33 >= 0 && local35 >= 1) {
				local35--;
				local33 -= local35 << 1;
				Static156.anIntArray335[local35] = local12;
			}
			local12++;
			@Pc(265) int local265;
			@Pc(274) int local274;
			@Pc(286) int[] local286;
			@Pc(169) int local169;
			if (local28 >= 0) {
				local30--;
				local28 -= local30 << 1;
				local169 = arg4 - local30;
				local65 = arg4 + local30;
				if (local65 >= Static245.anInt6027 && local169 <= Static111.anInt2039) {
					if (local17 <= local30) {
						local74 = Static167.method2786(arg0 + local12, Static204.anInt4020, Static175.anInt3267);
						local83 = Static167.method2786(arg0 - local12, Static204.anInt4020, Static175.anInt3267);
						if (Static111.anInt2039 >= local65) {
							Static235.method3988(arg1, Static129.anIntArrayArray40[local65], local74, local83);
						}
						if (Static245.anInt6027 <= local169) {
							Static235.method3988(arg1, Static129.anIntArrayArray40[local169], local74, local83);
						}
					} else {
						local74 = Static156.anIntArray335[local30];
						local83 = Static167.method2786(arg0 + local12, Static204.anInt4020, Static175.anInt3267);
						local93 = Static167.method2786(arg0 - local12, Static204.anInt4020, Static175.anInt3267);
						local265 = Static167.method2786(arg0 + local74, Static204.anInt4020, Static175.anInt3267);
						local274 = Static167.method2786(arg0 - local74, Static204.anInt4020, Static175.anInt3267);
						if (local65 <= Static111.anInt2039) {
							local286 = Static129.anIntArrayArray40[local65];
							Static235.method3988(arg1, local286, local274, local93);
							Static235.method3988(arg2, local286, local265, local274);
							Static235.method3988(arg1, local286, local83, local265);
						}
						if (Static245.anInt6027 <= local169) {
							local286 = Static129.anIntArrayArray40[local169];
							Static235.method3988(arg1, local286, local274, local93);
							Static235.method3988(arg2, local286, local265, local274);
							Static235.method3988(arg1, local286, local83, local265);
						}
					}
				}
			}
			local169 = arg4 - local12;
			local65 = arg4 + local12;
			if (Static245.anInt6027 <= local65 && local169 <= Static111.anInt2039) {
				local74 = arg0 + local30;
				local83 = arg0 - local30;
				if (Static175.anInt3267 <= local74 && local83 <= Static204.anInt4020) {
					local74 = Static167.method2786(local74, Static204.anInt4020, Static175.anInt3267);
					local83 = Static167.method2786(local83, Static204.anInt4020, Static175.anInt3267);
					if (local17 <= local12) {
						if (local65 <= Static111.anInt2039) {
							Static235.method3988(arg1, Static129.anIntArrayArray40[local65], local74, local83);
						}
						if (local169 >= Static245.anInt6027) {
							Static235.method3988(arg1, Static129.anIntArrayArray40[local169], local74, local83);
						}
					} else {
						local93 = local35 >= local12 ? local35 : Static156.anIntArray335[local12];
						local265 = Static167.method2786(local93 + arg0, Static204.anInt4020, Static175.anInt3267);
						local274 = Static167.method2786(arg0 - local93, Static204.anInt4020, Static175.anInt3267);
						if (Static111.anInt2039 >= local65) {
							local286 = Static129.anIntArrayArray40[local65];
							Static235.method3988(arg1, local286, local274, local83);
							Static235.method3988(arg2, local286, local265, local274);
							Static235.method3988(arg1, local286, local74, local265);
						}
						if (local169 >= Static245.anInt6027) {
							local286 = Static129.anIntArrayArray40[local169];
							Static235.method3988(arg1, local286, local274, local83);
							Static235.method3988(arg2, local286, local265, local274);
							Static235.method3988(arg1, local286, local74, local265);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V")
	public static void method4936(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub4_Sub7 local12 = Static34.method528(arg0, 2);
		local12.method970();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!fk;IBI)V")
	public static void method4937(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static204.aClass56_18.method1270();
		if (Static96.aBoolean144) {
			return;
		}
		for (@Pc(22) Class3_Sub4_Sub23 local22 = (Class3_Sub4_Sub23) arg0.method1281(); local22 != null; local22 = (Class3_Sub4_Sub23) arg0.method1278()) {
			@Pc(29) Class40 local29 = Static96.method1438(local22.anInt5971);
			if (Static153.method2576(local29)) {
				Static270.method4463(arg1, arg2, local22, local29);
				if (local22.aBoolean423) {
					Static304.method4910(local29, local22);
				}
			}
		}
	}
}
