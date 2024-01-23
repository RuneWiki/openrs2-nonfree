import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString83 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIZ)I")
	public static int method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public static void method1380() {
		Static259.aClass46_34.method1068(5);
		Static148.aClass46_26.method1068(5);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V")
	public static void method1381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static133.method2321(arg3 + arg1, arg1 + -arg3, Static274.anIntArrayArray50[arg2], arg0);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg4;
		@Pc(26) int local26 = arg3 * arg3;
		@Pc(30) int local30 = arg4 * arg4;
		@Pc(34) int local34 = local30 << 1;
		@Pc(38) int local38 = local26 << 1;
		@Pc(42) int local42 = arg4 << 1;
		@Pc(46) int local46 = local26 << 2;
		@Pc(54) int local54 = local34 + local26 * (1 - local42);
		@Pc(62) int local62 = local30 - (local42 - 1) * local38;
		@Pc(66) int local66 = local30 << 2;
		@Pc(83) int local83 = local34 * 3;
		@Pc(91) int local91 = ((arg4 << 1) - 3) * local38;
		@Pc(97) int local97 = local66;
		@Pc(103) int local103 = local46 * (arg4 - 1);
		while (local22 > 0) {
			local22--;
			if (local54 < 0) {
				while (local54 < 0) {
					local54 += local83;
					local83 += local66;
					local62 += local97;
					local20++;
					local97 += local66;
				}
			}
			if (local62 < 0) {
				local20++;
				local54 += local83;
				local83 += local66;
				local62 += local97;
				local97 += local66;
			}
			local54 += -local103;
			local62 += -local91;
			@Pc(168) int local168 = arg2 + local22;
			@Pc(172) int local172 = arg2 - local22;
			@Pc(176) int local176 = arg1 + local20;
			local103 -= local46;
			local91 -= local46;
			@Pc(189) int local189 = arg1 - local20;
			Static133.method2321(local176, local189, Static274.anIntArrayArray50[local172], arg0);
			Static133.method2321(local176, local189, Static274.anIntArrayArray50[local168], arg0);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBIII)V")
	public static void method1382(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = arg0;
		Static133.method2321(arg0 + arg2, -arg0 + arg2, Static274.anIntArrayArray50[arg1], arg3);
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = -arg0;
		@Pc(33) int local33 = -1;
		while (local11 > local28) {
			local28++;
			local33 += 2;
			local31 += local33;
			if (local31 >= 0) {
				@Pc(53) int local53 = arg2 + local28;
				local11--;
				@Pc(61) int[] local61 = Static274.anIntArrayArray50[arg1 - local11];
				local31 -= local11 << 1;
				@Pc(73) int[] local73 = Static274.anIntArrayArray50[local11 + arg1];
				@Pc(78) int local78 = arg2 - local28;
				Static133.method2321(local53, local78, local73, arg3);
				Static133.method2321(local53, local78, local61, arg3);
			}
			@Pc(96) int local96 = local11 + arg2;
			@Pc(101) int local101 = arg2 - local11;
			@Pc(107) int[] local107 = Static274.anIntArrayArray50[arg1 + local28];
			@Pc(114) int[] local114 = Static274.anIntArrayArray50[arg1 - local28];
			Static133.method2321(local96, local101, local107, arg3);
			Static133.method2321(local96, local101, local114, arg3);
		}
	}
}
