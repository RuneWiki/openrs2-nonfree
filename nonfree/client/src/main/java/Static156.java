import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt2884;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "Lclient!dp;")
	public static Class3_Sub12_Sub1 aClass3_Sub12_Sub1_1;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public static int anInt2887 = 1;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
	public static int anInt2889 = 0;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
	public static int anInt2892 = 0;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
	public static final int anInt2893 = 1405;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg6 - arg1;
		@Pc(20) int local20 = arg3 - arg1;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local24 * (1 - local56) + local40;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = (1 - local60) * local32 + local48;
		@Pc(95) int local95 = local36 - local52 * (local60 - 1);
		@Pc(107) int local107 = local24 << 2;
		@Pc(111) int local111 = local28 << 2;
		@Pc(115) int local115 = local32 << 2;
		@Pc(119) int local119 = local36 << 2;
		@Pc(123) int local123 = local40 * 3;
		@Pc(129) int local129 = (local56 - 3) * local44;
		@Pc(133) int local133 = local48 * 3;
		@Pc(139) int local139 = (local60 - 3) * local52;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (arg3 - 1) * local107;
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = local115 * (local20 - 1);
		@Pc(159) int[] local159 = Static276.anIntArrayArray32[arg4];
		Static578.method7640(arg0, arg5 - arg6, arg5 + -local15, local159);
		Static578.method7640(arg2, arg5 - local15, local15 + arg5, local159);
		Static578.method7640(arg0, local15 + arg5, arg6 + arg5, local159);
		while (local9 > 0) {
			@Pc(204) boolean local204 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local123;
					local78 += local141;
					local123 += local111;
					local7++;
					local141 += local111;
				}
			}
			if (local204) {
				if (local86 < 0) {
					while (local86 < 0) {
						local95 += local149;
						local86 += local133;
						local133 += local119;
						local149 += local119;
						local11++;
					}
				}
				if (local95 < 0) {
					local86 += local133;
					local95 += local149;
					local149 += local119;
					local11++;
					local133 += local119;
				}
				local86 += -local155;
				local95 += -local139;
				local155 -= local115;
				local139 -= local115;
			}
			if (local78 < 0) {
				local69 += local123;
				local78 += local141;
				local141 += local111;
				local7++;
				local123 += local111;
			}
			local78 += -local129;
			local69 += -local147;
			local147 -= local107;
			local129 -= local107;
			local9--;
			@Pc(332) int local332 = arg4 - local9;
			@Pc(336) int local336 = local9 + arg4;
			@Pc(341) int local341 = arg5 + local7;
			@Pc(346) int local346 = arg5 - local7;
			if (local204) {
				@Pc(370) int local370 = local11 + arg5;
				@Pc(374) int local374 = arg5 - local11;
				Static578.method7640(arg0, local346, local374, Static276.anIntArrayArray32[local332]);
				Static578.method7640(arg2, local374, local370, Static276.anIntArrayArray32[local332]);
				Static578.method7640(arg0, local370, local341, Static276.anIntArrayArray32[local332]);
				Static578.method7640(arg0, local346, local374, Static276.anIntArrayArray32[local336]);
				Static578.method7640(arg2, local374, local370, Static276.anIntArrayArray32[local336]);
				Static578.method7640(arg0, local370, local341, Static276.anIntArrayArray32[local336]);
			} else {
				Static578.method7640(arg0, local346, local341, Static276.anIntArrayArray32[local332]);
				Static578.method7640(arg0, local346, local341, Static276.anIntArrayArray32[local336]);
			}
		}
	}
}
