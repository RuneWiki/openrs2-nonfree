import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "[I")
	public static final int[] anIntArray127 = new int[4];

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4 - arg0;
		@Pc(20) int local20 = arg3 - arg0;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + (1 - local56) * local24;
		@Pc(78) int local78 = local28 - local44 * (local56 - 1);
		@Pc(87) int local87 = local48 + (1 - local60) * local32;
		@Pc(96) int local96 = local36 - local52 * (local60 - 1);
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(122) int local122 = local44 * (local56 - 3);
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = local52 * (local60 - 3);
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = local100 * (arg3 - 1);
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (local20 - 1);
		@Pc(152) int[] local152 = Static118.anIntArrayArray7[arg2];
		Static202.method3077(local152, arg1 - arg4, arg5, arg1 - local15);
		Static202.method3077(local152, arg1 - local15, arg6, arg1 + local15);
		Static202.method3077(local152, arg1 + local15, arg5, arg1 + arg4);
		while (local9 > 0) {
			@Pc(198) boolean local198 = local20 >= local9;
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local134;
					local69 += local116;
					local134 += local104;
					local7++;
					local116 += local104;
				}
			}
			if (local198) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local142;
						local87 += local126;
						local126 += local112;
						local11++;
						local142 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local142;
					local87 += local126;
					local11++;
					local142 += local112;
					local126 += local112;
				}
				local96 += -local132;
				local87 += -local148;
				local132 -= local108;
				local148 -= local108;
			}
			if (local78 < 0) {
				local69 += local116;
				local78 += local134;
				local7++;
				local134 += local104;
				local116 += local104;
			}
			local69 += -local140;
			local78 += -local122;
			local122 -= local100;
			local140 -= local100;
			local9--;
			@Pc(351) int local351 = arg2 - local9;
			@Pc(355) int local355 = local9 + arg2;
			@Pc(359) int local359 = local7 + arg1;
			@Pc(364) int local364 = arg1 - local7;
			if (local198) {
				@Pc(390) int local390 = arg1 + local11;
				@Pc(395) int local395 = arg1 - local11;
				Static202.method3077(Static118.anIntArrayArray7[local351], local364, arg5, local395);
				Static202.method3077(Static118.anIntArrayArray7[local351], local395, arg6, local390);
				Static202.method3077(Static118.anIntArrayArray7[local351], local390, arg5, local359);
				Static202.method3077(Static118.anIntArrayArray7[local355], local364, arg5, local395);
				Static202.method3077(Static118.anIntArrayArray7[local355], local395, arg6, local390);
				Static202.method3077(Static118.anIntArrayArray7[local355], local390, arg5, local359);
			} else {
				Static202.method3077(Static118.anIntArrayArray7[local351], local364, arg5, local359);
				Static202.method3077(Static118.anIntArrayArray7[local355], local364, arg5, local359);
			}
		}
	}
}
