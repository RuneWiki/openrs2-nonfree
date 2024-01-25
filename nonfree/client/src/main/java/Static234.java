import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "J")
	public static long aLong129;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Lclient!ef;")
	public static Class86 aClass86_2;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt4897 = 100;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "[I")
	public static final int[] anIntArray349 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
	public static int anInt4900 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[FIFFIIIIII)V")
	public static void method4142(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg0 - arg5;
		@Pc(13) int local13 = arg6 - arg8;
		@Pc(17) int local17 = arg2 - arg7;
		@Pc(42) float local42 = (float) local17 * arg1[1] + arg1[0] * (float) local13 + arg1[2] * (float) local9;
		@Pc(63) float local63 = (float) local13 * arg1[3] + arg1[4] * (float) local17 + arg1[5] * (float) local9;
		@Pc(84) float local84 = (float) local9 * arg1[8] + arg1[6] * (float) local13 + arg1[7] * (float) local17;
		@Pc(95) float local95 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local95 *= arg3;
		}
		@Pc(109) float local109 = arg4 + local63 + 0.5F;
		@Pc(114) float local114;
		if (arg9 == 1) {
			local114 = local95;
			local95 = -local109;
			local109 = local114;
		} else if (arg9 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg9 == 3) {
			local114 = local95;
			local95 = local109;
			local109 = -local114;
		}
		Static541.aFloat197 = local109;
		Static330.aFloat128 = local95;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public static void method4143() {
		Static423.aClass125_3.method3440();
	}
}
