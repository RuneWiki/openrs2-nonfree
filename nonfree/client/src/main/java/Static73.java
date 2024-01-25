import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cga", name = "ob", descriptor = "I")
	public static int anInt1175;

	@OriginalMember(owner = "client!cga", name = "sb", descriptor = "Lclient!pd;")
	public static final Class270 aClass270_1 = new Class270();

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg6 - arg4;
		@Pc(19) int local19 = arg5 - arg4;
		@Pc(23) int local23 = arg6 * arg6;
		@Pc(27) int local27 = arg5 * arg5;
		@Pc(31) int local31 = local15 * local15;
		@Pc(35) int local35 = local19 * local19;
		@Pc(39) int local39 = local27 << 1;
		@Pc(43) int local43 = local23 << 1;
		@Pc(47) int local47 = local35 << 1;
		@Pc(51) int local51 = local31 << 1;
		@Pc(55) int local55 = arg5 << 1;
		@Pc(59) int local59 = local19 << 1;
		@Pc(67) int local67 = local39 + (1 - local55) * local23;
		@Pc(76) int local76 = local27 - (local55 - 1) * local43;
		@Pc(85) int local85 = local47 + local31 * (1 - local59);
		@Pc(94) int local94 = local35 - local51 * (local59 - 1);
		@Pc(98) int local98 = local23 << 2;
		@Pc(102) int local102 = local27 << 2;
		@Pc(106) int local106 = local31 << 2;
		@Pc(122) int local122 = local35 << 2;
		@Pc(126) int local126 = local39 * 3;
		@Pc(132) int local132 = local43 * (local55 - 3);
		@Pc(136) int local136 = local47 * 3;
		@Pc(142) int local142 = (local59 - 3) * local51;
		@Pc(144) int local144 = local102;
		@Pc(150) int local150 = (arg5 - 1) * local98;
		@Pc(152) int local152 = local122;
		@Pc(158) int local158 = local106 * (local19 - 1);
		@Pc(162) int[] local162 = Static286.anIntArrayArray42[arg3];
		Static343.method5202(arg2 - arg6, local162, arg1, arg2 - local15);
		Static343.method5202(arg2 - local15, local162, arg0, local15 + arg2);
		Static343.method5202(arg2 + local15, local162, arg1, arg6 + arg2);
		while (local9 > 0) {
			@Pc(203) boolean local203 = local19 >= local9;
			if (local203) {
				if (local85 < 0) {
					while (local85 < 0) {
						local85 += local136;
						local94 += local152;
						local11++;
						local136 += local122;
						local152 += local122;
					}
				}
				if (local94 < 0) {
					local94 += local152;
					local85 += local136;
					local11++;
					local152 += local122;
					local136 += local122;
				}
				local85 += -local158;
				local94 += -local142;
				local158 -= local106;
				local142 -= local106;
			}
			if (local67 < 0) {
				while (local67 < 0) {
					local67 += local126;
					local76 += local144;
					local144 += local102;
					local7++;
					local126 += local102;
				}
			}
			if (local76 < 0) {
				local76 += local144;
				local67 += local126;
				local7++;
				local144 += local102;
				local126 += local102;
			}
			local67 += -local150;
			local76 += -local132;
			local132 -= local98;
			local9--;
			local150 -= local98;
			@Pc(336) int local336 = arg3 - local9;
			@Pc(341) int local341 = arg3 + local9;
			@Pc(345) int local345 = local7 + arg2;
			@Pc(350) int local350 = arg2 - local7;
			if (local203) {
				@Pc(356) int local356 = local11 + arg2;
				@Pc(361) int local361 = arg2 - local11;
				Static343.method5202(local350, Static286.anIntArrayArray42[local336], arg1, local361);
				Static343.method5202(local361, Static286.anIntArrayArray42[local336], arg0, local356);
				Static343.method5202(local356, Static286.anIntArrayArray42[local336], arg1, local345);
				Static343.method5202(local350, Static286.anIntArrayArray42[local341], arg1, local361);
				Static343.method5202(local361, Static286.anIntArrayArray42[local341], arg0, local356);
				Static343.method5202(local356, Static286.anIntArrayArray42[local341], arg1, local345);
			} else {
				Static343.method5202(local350, Static286.anIntArrayArray42[local336], arg1, local345);
				Static343.method5202(local350, Static286.anIntArrayArray42[local341], arg1, local345);
			}
		}
	}
}
