import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBZ)V")
	public static void method7980(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static541.method8073(arg3, true, arg0, arg2, arg1, -1);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Z")
	public static boolean method7983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[FIIIBIIFF[FI)V")
	public static void method7984(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg6 - arg2;
		@Pc(9) int local9 = arg4 - arg10;
		@Pc(17) int local17 = arg5 - arg3;
		@Pc(38) float local38 = (float) local9 * arg9[0] + (float) local5 * arg9[1] + arg9[2] * (float) local17;
		@Pc(59) float local59 = arg9[5] * (float) local17 + arg9[3] * (float) local9 + arg9[4] * (float) local5;
		@Pc(80) float local80 = arg9[8] * (float) local17 + arg9[7] * (float) local5 + (float) local9 * arg9[6];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local91 *= arg8;
		}
		@Pc(105) float local105 = arg7 + local59 + 0.5F;
		@Pc(122) float local122;
		if (arg0 == 1) {
			local122 = local91;
			local91 = -local105;
			local105 = local122;
		} else if (arg0 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg0 == 3) {
			local122 = local91;
			local91 = local105;
			local105 = -local122;
		}
		arg1[0] = local91;
		arg1[1] = local105;
	}
}
