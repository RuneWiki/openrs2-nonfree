import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_101 = new Class160(71, 18);

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_166 = new Class40(4, -1);

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_14 = new Class188(6, 0, 4, 2);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0 - arg6;
		@Pc(20) int local20 = arg1 - arg6;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg1 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(78) int local78 = local28 - local44 * (local56 - 1);
		@Pc(87) int local87 = local32 * (1 - local60) + local48;
		@Pc(95) int local95 = local36 - (local60 - 1) * local52;
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = local44 * (local56 - 3);
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = (local60 - 3) * local52;
		@Pc(141) int local141 = local103;
		@Pc(147) int local147 = (arg1 - 1) * local99;
		@Pc(149) int local149 = local111;
		@Pc(155) int local155 = local107 * (local20 - 1);
		@Pc(159) int[] local159 = Static503.anIntArrayArray12[arg3];
		Static455.method6536(arg2 - local15, arg2 + -arg0, arg4, local159);
		Static455.method6536(arg2 + local15, arg2 + -local15, arg5, local159);
		Static455.method6536(arg0 + arg2, arg2 - -local15, arg4, local159);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local9 <= local20;
			if (local202) {
				if (local87 < 0) {
					while (local87 < 0) {
						local95 += local149;
						local87 += local125;
						local11++;
						local125 += local111;
						local149 += local111;
					}
				}
				if (local95 < 0) {
					local87 += local125;
					local95 += local149;
					local11++;
					local125 += local111;
					local149 += local111;
				}
				local87 += -local155;
				local95 += -local131;
				local131 -= local107;
				local155 -= local107;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local115;
					local78 += local141;
					local115 += local103;
					local7++;
					local141 += local103;
				}
			}
			if (local78 < 0) {
				local69 += local115;
				local78 += local141;
				local141 += local103;
				local115 += local103;
				local7++;
			}
			local78 += -local121;
			local69 += -local147;
			local147 -= local99;
			local9--;
			local121 -= local99;
			@Pc(342) int local342 = arg3 - local9;
			@Pc(346) int local346 = arg3 + local9;
			@Pc(350) int local350 = local7 + arg2;
			@Pc(355) int local355 = arg2 - local7;
			if (local202) {
				@Pc(362) int local362 = arg2 + local11;
				@Pc(367) int local367 = arg2 - local11;
				Static455.method6536(local367, local355, arg4, Static503.anIntArrayArray12[local342]);
				Static455.method6536(local362, local367, arg5, Static503.anIntArrayArray12[local342]);
				Static455.method6536(local350, local362, arg4, Static503.anIntArrayArray12[local342]);
				Static455.method6536(local367, local355, arg4, Static503.anIntArrayArray12[local346]);
				Static455.method6536(local362, local367, arg5, Static503.anIntArrayArray12[local346]);
				Static455.method6536(local350, local362, arg4, Static503.anIntArrayArray12[local346]);
			} else {
				Static455.method6536(local350, local355, arg4, Static503.anIntArrayArray12[local342]);
				Static455.method6536(local350, local355, arg4, Static503.anIntArrayArray12[local346]);
			}
		}
	}
}
