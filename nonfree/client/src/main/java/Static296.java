import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[100];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg3;
		@Pc(20) int local20 = arg2 - arg3;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg2 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(77) int local77 = local28 - local44 * (local56 - 1);
		@Pc(85) int local85 = local48 + local32 * (1 - local60);
		@Pc(93) int local93 = local36 - local52 * (local60 - 1);
		@Pc(97) int local97 = local24 << 2;
		@Pc(101) int local101 = local28 << 2;
		@Pc(105) int local105 = local32 << 2;
		@Pc(114) int local114 = local36 << 2;
		@Pc(118) int local118 = local40 * 3;
		@Pc(124) int local124 = local44 * (local56 - 3);
		@Pc(128) int local128 = local48 * 3;
		@Pc(134) int local134 = (local60 - 3) * local52;
		@Pc(136) int local136 = local101;
		@Pc(142) int local142 = local97 * (arg2 - 1);
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = (local20 - 1) * local105;
		@Pc(154) int[] local154 = Static46.anIntArrayArray24[arg1];
		Static215.method3035(arg6 - arg0, arg6 - local16, local154, arg5);
		Static215.method3035(arg6 - local16, local16 + arg6, local154, arg4);
		Static215.method3035(local16 + arg6, arg0 + arg6, local154, arg5);
		while (local9 > 0) {
			@Pc(195) boolean local195 = local9 <= local20;
			if (local195) {
				if (local85 < 0) {
					while (local85 < 0) {
						local93 += local144;
						local85 += local128;
						local11++;
						local128 += local114;
						local144 += local114;
					}
				}
				if (local93 < 0) {
					local93 += local144;
					local85 += local128;
					local128 += local114;
					local11++;
					local144 += local114;
				}
				local93 += -local134;
				local85 += -local150;
				local134 -= local105;
				local150 -= local105;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local118;
					local77 += local136;
					local7++;
					local136 += local101;
					local118 += local101;
				}
			}
			if (local77 < 0) {
				local69 += local118;
				local77 += local136;
				local118 += local101;
				local7++;
				local136 += local101;
			}
			local77 += -local124;
			local69 += -local142;
			local142 -= local97;
			local9--;
			local124 -= local97;
			@Pc(332) int local332 = arg1 - local9;
			@Pc(336) int local336 = local9 + arg1;
			@Pc(340) int local340 = local7 + arg6;
			@Pc(344) int local344 = arg6 - local7;
			if (local195) {
				@Pc(369) int local369 = arg6 + local11;
				@Pc(374) int local374 = arg6 - local11;
				Static215.method3035(local344, local374, Static46.anIntArrayArray24[local332], arg5);
				Static215.method3035(local374, local369, Static46.anIntArrayArray24[local332], arg4);
				Static215.method3035(local369, local340, Static46.anIntArrayArray24[local332], arg5);
				Static215.method3035(local344, local374, Static46.anIntArrayArray24[local336], arg5);
				Static215.method3035(local374, local369, Static46.anIntArrayArray24[local336], arg4);
				Static215.method3035(local369, local340, Static46.anIntArrayArray24[local336], arg5);
			} else {
				Static215.method3035(local344, local340, Static46.anIntArrayArray24[local332], arg5);
				Static215.method3035(local344, local340, Static46.anIntArrayArray24[local336], arg5);
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z")
	public static boolean method4225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static139.method2169(arg1, arg0)) {
			return (arg1 & 0xB000) != 0 | Static298.method4273(arg0, arg1) | Static213.method3021(arg1, arg0) ? true : (Static140.method2190(arg0, arg1) | Static2.method31(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
