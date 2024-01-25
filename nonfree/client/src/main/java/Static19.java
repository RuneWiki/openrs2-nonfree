import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!wl;")
	public static final Class389 aClass389_1 = new Class389();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)V")
	public static void method476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg1;
		@Pc(21) int local21 = arg5 - arg1;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = (1 - local57) * local25 + local41;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = (local57 - 3) * local45;
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = local53 * (local61 - 3);
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = local101 * (arg5 - 1);
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = local109 * (local21 - 1);
		@Pc(153) int[] local153 = Static173.anIntArrayArray15[arg6];
		Static270.method3998(arg3, arg0 - arg2, arg0 + -local16, local153);
		Static270.method3998(arg4, arg0 - local16, arg0 + local16, local153);
		Static270.method3998(arg3, arg0 + local16, arg2 + arg0, local153);
		while (local9 > 0) {
			@Pc(199) boolean local199 = local21 >= local9;
			if (local199) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local127;
						local97 += local143;
						local127 += local113;
						local11++;
						local143 += local113;
					}
				}
				if (local97 < 0) {
					local88 += local127;
					local97 += local143;
					local127 += local113;
					local11++;
					local143 += local113;
				}
				local97 += -local133;
				local88 += -local149;
				local133 -= local109;
				local149 -= local109;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local135;
					local70 += local117;
					local135 += local105;
					local7++;
					local117 += local105;
				}
			}
			if (local79 < 0) {
				local70 += local117;
				local79 += local135;
				local135 += local105;
				local117 += local105;
				local7++;
			}
			local79 += -local123;
			local70 += -local141;
			local123 -= local101;
			local9--;
			local141 -= local101;
			@Pc(332) int local332 = arg6 - local9;
			@Pc(336) int local336 = local9 + arg6;
			@Pc(340) int local340 = local7 + arg0;
			@Pc(345) int local345 = arg0 - local7;
			if (local199) {
				@Pc(351) int local351 = arg0 + local11;
				@Pc(356) int local356 = arg0 - local11;
				Static270.method3998(arg3, local345, local356, Static173.anIntArrayArray15[local332]);
				Static270.method3998(arg4, local356, local351, Static173.anIntArrayArray15[local332]);
				Static270.method3998(arg3, local351, local340, Static173.anIntArrayArray15[local332]);
				Static270.method3998(arg3, local345, local356, Static173.anIntArrayArray15[local336]);
				Static270.method3998(arg4, local356, local351, Static173.anIntArrayArray15[local336]);
				Static270.method3998(arg3, local351, local340, Static173.anIntArrayArray15[local336]);
			} else {
				Static270.method3998(arg3, local345, local340, Static173.anIntArrayArray15[local332]);
				Static270.method3998(arg3, local345, local340, Static173.anIntArrayArray15[local336]);
			}
		}
	}
}
