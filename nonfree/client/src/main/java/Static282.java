import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)V")
	public static void method3507() {
		Static373.aClass126_52.method3135();
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Z")
	public static boolean method3508() {
		return Static410.anInt6753 == 0 ? Static452.aClass3_Sub5_Sub4_3.method5151() : true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg3;
		@Pc(20) int local20 = arg4 - arg3;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg4 * arg4;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg4 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(70) int local70 = local24 * (1 - local56) + local40;
		@Pc(79) int local79 = local28 - local44 * (local56 - 1);
		@Pc(88) int local88 = (1 - local60) * local32 + local48;
		@Pc(96) int local96 = local36 - local52 * (local60 - 1);
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(122) int local122 = local44 * (local56 - 3);
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = (local60 - 3) * local52;
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = (arg4 - 1) * local100;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = (local20 - 1) * local108;
		@Pc(152) int[] local152 = Static262.anIntArrayArray31[arg6];
		Static412.method5293(local152, arg1, arg2 - arg0, arg2 - local16);
		Static412.method5293(local152, arg5, arg2 - local16, arg2 + local16);
		Static412.method5293(local152, arg1, arg2 + local16, arg2 + arg0);
		while (local9 > 0) {
			@Pc(198) boolean local198 = local20 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local134;
					local70 += local116;
					local116 += local104;
					local134 += local104;
					local7++;
				}
			}
			if (local198) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local126;
						local96 += local142;
						local142 += local112;
						local11++;
						local126 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local142;
					local88 += local126;
					local142 += local112;
					local126 += local112;
					local11++;
				}
				local96 += -local132;
				local88 += -local148;
				local132 -= local108;
				local148 -= local108;
			}
			if (local79 < 0) {
				local79 += local134;
				local70 += local116;
				local116 += local104;
				local7++;
				local134 += local104;
			}
			local70 += -local140;
			local79 += -local122;
			local140 -= local100;
			local122 -= local100;
			local9--;
			@Pc(335) int local335 = arg6 - local9;
			@Pc(339) int local339 = local9 + arg6;
			@Pc(344) int local344 = arg2 + local7;
			@Pc(349) int local349 = arg2 - local7;
			if (local198) {
				@Pc(355) int local355 = local11 + arg2;
				@Pc(360) int local360 = arg2 - local11;
				Static412.method5293(Static262.anIntArrayArray31[local335], arg1, local349, local360);
				Static412.method5293(Static262.anIntArrayArray31[local335], arg5, local360, local355);
				Static412.method5293(Static262.anIntArrayArray31[local335], arg1, local355, local344);
				Static412.method5293(Static262.anIntArrayArray31[local339], arg1, local349, local360);
				Static412.method5293(Static262.anIntArrayArray31[local339], arg5, local360, local355);
				Static412.method5293(Static262.anIntArrayArray31[local339], arg1, local355, local344);
			} else {
				Static412.method5293(Static262.anIntArrayArray31[local335], arg1, local349, local344);
				Static412.method5293(Static262.anIntArrayArray31[local339], arg1, local349, local344);
			}
		}
	}
}
