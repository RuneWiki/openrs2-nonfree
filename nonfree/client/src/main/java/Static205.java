import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "Lclient!aca;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
	public static int anInt3674 = 0;

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "Lclient!ua;")
	public static final Class358 aClass358_7 = new Class358(1);

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	public static void method3369() {
		Static18.aBoolean13 = false;
		Static352.method5188(-88);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IBIIII)V")
	public static void method3370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(31) int local31 = arg3 * arg3;
		@Pc(35) int local35 = arg1 * arg1;
		@Pc(39) int local39 = local35 << 1;
		@Pc(43) int local43 = local31 << 1;
		@Pc(47) int local47 = arg1 << 1;
		@Pc(55) int local55 = local39 + (1 - local47) * local31;
		@Pc(63) int local63 = local35 - (local47 - 1) * local43;
		@Pc(67) int local67 = local31 << 2;
		@Pc(71) int local71 = local35 << 2;
		@Pc(79) int local79 = local39 * 3;
		@Pc(87) int local87 = local43 * ((arg1 << 1) - 3);
		@Pc(93) int local93 = local71;
		Static161.method2977(arg0 - arg3, arg2, arg0 + arg3, Static120.anIntArrayArray18[arg4], -124);
		@Pc(111) int local111 = local67 * (arg1 - 1);
		while (local9 > 0) {
			if (local55 < 0) {
				while (local55 < 0) {
					local63 += local93;
					local55 += local79;
					local7++;
					local93 += local71;
					local79 += local71;
				}
			}
			if (local63 < 0) {
				local63 += local93;
				local55 += local79;
				local7++;
				local79 += local71;
				local93 += local71;
			}
			local55 += -local111;
			local63 += -local87;
			local9--;
			local87 -= local67;
			local111 -= local67;
			@Pc(187) int local187 = arg4 - local9;
			@Pc(191) int local191 = local9 + arg4;
			@Pc(195) int local195 = arg0 + local7;
			@Pc(199) int local199 = arg0 - local7;
			Static161.method2977(local199, arg2, local195, Static120.anIntArrayArray18[local187], -106);
			Static161.method2977(local199, arg2, local195, Static120.anIntArrayArray18[local191], -128);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII[FI[FFIFIZ)V")
	public static void method3371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) int arg10) {
		@Pc(9) int local9 = arg8 - arg5;
		@Pc(13) int local13 = arg0 - arg2;
		@Pc(17) int local17 = arg3 - arg10;
		@Pc(38) float local38 = (float) local9 * arg4[1] + (float) local13 * arg4[0] + arg4[2] * (float) local17;
		@Pc(59) float local59 = (float) local17 * arg4[5] + arg4[3] * (float) local13 + arg4[4] * (float) local9;
		@Pc(80) float local80 = (float) local17 * arg4[8] + (float) local13 * arg4[6] + arg4[7] * (float) local9;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local91 *= arg7;
		}
		@Pc(105) float local105 = arg9 + local59 + 0.5F;
		@Pc(150) float local150;
		if (arg1 == 1) {
			local150 = local91;
			local91 = -local105;
			local105 = local150;
		} else if (arg1 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg1 == 3) {
			local150 = local91;
			local91 = local105;
			local105 = -local150;
		}
		arg6[0] = local91;
		arg6[1] = local105;
	}
}
