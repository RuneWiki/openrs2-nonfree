import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_153 = new Class337(58, 4);

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray25 = new byte[1000][];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg2;
		@Pc(21) int local21 = arg3 - arg2;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(61) int local61 = local33 << 1;
		@Pc(65) int local65 = arg3 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(79) int local79 = local25 * (1 - local65) + local41;
		@Pc(88) int local88 = local29 - (local65 - 1) * local45;
		@Pc(98) int local98 = local33 * (1 - local69) + local49;
		@Pc(106) int local106 = local37 - (local69 - 1) * local61;
		@Pc(110) int local110 = local25 << 2;
		@Pc(114) int local114 = local29 << 2;
		@Pc(118) int local118 = local33 << 2;
		@Pc(122) int local122 = local37 << 2;
		@Pc(126) int local126 = local41 * 3;
		@Pc(132) int local132 = local45 * (local65 - 3);
		@Pc(136) int local136 = local49 * 3;
		@Pc(142) int local142 = (local69 - 3) * local61;
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = (arg3 - 1) * local110;
		@Pc(152) int local152 = local122;
		@Pc(158) int local158 = local118 * (local21 - 1);
		@Pc(162) int[] local162 = Static249.anIntArrayArray23[arg0];
		Static491.method7219(local162, arg6 - arg5, arg4, arg6 - local16);
		Static491.method7219(local162, arg6 - local16, arg1, local16 + arg6);
		Static491.method7219(local162, local16 + arg6, arg4, arg6 + arg5);
		while (local9 > 0) {
			@Pc(209) boolean local209 = local9 <= local21;
			if (local209) {
				if (local98 < 0) {
					while (local98 < 0) {
						local98 += local136;
						local106 += local152;
						local136 += local122;
						local152 += local122;
						local11++;
					}
				}
				if (local106 < 0) {
					local98 += local136;
					local106 += local152;
					local11++;
					local136 += local122;
					local152 += local122;
				}
				local106 += -local142;
				local98 += -local158;
				local142 -= local118;
				local158 -= local118;
			}
			if (local79 < 0) {
				while (local79 < 0) {
					local88 += local144;
					local79 += local126;
					local144 += local114;
					local7++;
					local126 += local114;
				}
			}
			if (local88 < 0) {
				local88 += local144;
				local79 += local126;
				local7++;
				local144 += local114;
				local126 += local114;
			}
			local88 += -local132;
			local79 += -local150;
			local9--;
			local150 -= local110;
			local132 -= local110;
			@Pc(346) int local346 = arg0 - local9;
			@Pc(350) int local350 = local9 + arg0;
			@Pc(354) int local354 = arg6 + local7;
			@Pc(359) int local359 = arg6 - local7;
			if (local209) {
				@Pc(365) int local365 = local11 + arg6;
				@Pc(370) int local370 = arg6 - local11;
				Static491.method7219(Static249.anIntArrayArray23[local346], local359, arg4, local370);
				Static491.method7219(Static249.anIntArrayArray23[local346], local370, arg1, local365);
				Static491.method7219(Static249.anIntArrayArray23[local346], local365, arg4, local354);
				Static491.method7219(Static249.anIntArrayArray23[local350], local359, arg4, local370);
				Static491.method7219(Static249.anIntArrayArray23[local350], local370, arg1, local365);
				Static491.method7219(Static249.anIntArrayArray23[local350], local365, arg4, local354);
			} else {
				Static491.method7219(Static249.anIntArrayArray23[local346], local359, arg4, local354);
				Static491.method7219(Static249.anIntArrayArray23[local350], local359, arg4, local354);
			}
		}
	}
}
