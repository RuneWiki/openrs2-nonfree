import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BILclient!ic;)Lclient!je;")
	public static Class122 method4824(@OriginalArg(1) int arg0, @OriginalArg(2) Class113 arg1) {
		@Pc(13) byte[] local13 = arg1.method2273(arg0);
		return local13 == null ? null : new Class122(local13);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg1;
		@Pc(20) int local20 = arg6 - arg1;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg6 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + (1 - local56) * local24;
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(85) int local85 = local32 * (1 - local60) + local48;
		@Pc(94) int local94 = local36 - (local60 - 1) * local52;
		@Pc(98) int local98 = local24 << 2;
		@Pc(102) int local102 = local28 << 2;
		@Pc(106) int local106 = local32 << 2;
		@Pc(110) int local110 = local36 << 2;
		@Pc(114) int local114 = local40 * 3;
		@Pc(120) int local120 = (local56 - 3) * local44;
		@Pc(124) int local124 = local48 * 3;
		@Pc(130) int local130 = local52 * (local60 - 3);
		@Pc(132) int local132 = local102;
		@Pc(138) int local138 = local98 * (arg6 - 1);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (local20 - 1);
		@Pc(150) int[] local150 = Static106.anIntArrayArray46[arg3];
		Static298.method3891(arg0 - local16, arg0 + -arg2, local150, arg4);
		Static298.method3891(arg0 + local16, arg0 + -local16, local150, arg5);
		Static298.method3891(arg2 + arg0, arg0 + local16, local150, arg4);
		while (local9 > 0) {
			@Pc(195) boolean local195 = local9 <= local20;
			if (local195) {
				if (local85 < 0) {
					while (local85 < 0) {
						local85 += local124;
						local94 += local140;
						local124 += local110;
						local11++;
						local140 += local110;
					}
				}
				if (local94 < 0) {
					local85 += local124;
					local94 += local140;
					local140 += local110;
					local11++;
					local124 += local110;
				}
				local85 += -local146;
				local94 += -local130;
				local146 -= local106;
				local130 -= local106;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local77 += local132;
					local69 += local114;
					local132 += local102;
					local114 += local102;
					local7++;
				}
			}
			if (local77 < 0) {
				local77 += local132;
				local69 += local114;
				local132 += local102;
				local7++;
				local114 += local102;
			}
			local69 += -local138;
			local77 += -local120;
			local138 -= local98;
			local120 -= local98;
			local9--;
			@Pc(332) int local332 = arg3 - local9;
			@Pc(337) int local337 = arg3 + local9;
			@Pc(341) int local341 = local7 + arg0;
			@Pc(346) int local346 = arg0 - local7;
			if (local195) {
				@Pc(373) int local373 = arg0 + local11;
				@Pc(377) int local377 = arg0 - local11;
				Static298.method3891(local377, local346, Static106.anIntArrayArray46[local332], arg4);
				Static298.method3891(local373, local377, Static106.anIntArrayArray46[local332], arg5);
				Static298.method3891(local341, local373, Static106.anIntArrayArray46[local332], arg4);
				Static298.method3891(local377, local346, Static106.anIntArrayArray46[local337], arg4);
				Static298.method3891(local373, local377, Static106.anIntArrayArray46[local337], arg5);
				Static298.method3891(local341, local373, Static106.anIntArrayArray46[local337], arg4);
			} else {
				Static298.method3891(local341, local346, Static106.anIntArrayArray46[local332], arg4);
				Static298.method3891(local341, local346, Static106.anIntArrayArray46[local337], arg4);
			}
		}
	}
}
