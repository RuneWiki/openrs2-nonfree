import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
	public static int anInt1063;

	@OriginalMember(owner = "client!cea", name = "N", descriptor = "[[Lclient!wq;")
	public static Class394[][] aClass394ArrayArray1;

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "I")
	public static int anInt1053 = -1;

	@OriginalMember(owner = "client!cea", name = "J", descriptor = "[Lclient!ra;")
	public static final Class295[] aClass295Array1 = new Class295[100];

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IF[FIIIIZI[FI)V")
	public static void method985(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg3 - arg6;
		@Pc(13) int local13 = arg7 - arg0;
		@Pc(17) int local17 = arg5 - arg4;
		@Pc(38) float local38 = (float) local17 * arg8[2] + arg8[1] * (float) local13 + (float) local9 * arg8[0];
		@Pc(59) float local59 = (float) local13 * arg8[4] + (float) local9 * arg8[3] + (float) local17 * arg8[5];
		@Pc(85) float local85 = (float) local17 * arg8[8] + arg8[7] * (float) local13 + (float) local9 * arg8[6];
		@Pc(100) float local100 = (float) Math.sqrt((double) (local85 * local85 + local59 * local59 + local38 * local38));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg1 + (float) Math.asin((double) (local59 / local100)) / 3.1415927F + 0.5F;
		@Pc(137) float local137;
		if (arg9 == 1) {
			local137 = local111;
			local111 = -local124;
			local124 = local137;
		} else if (arg9 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg9 == 3) {
			local137 = local111;
			local111 = local124;
			local124 = -local137;
		}
		arg2[1] = local124;
		arg2[0] = local111;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BII)Z")
	public static boolean method991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static348.method6676(arg0, arg1) | Static105.method1742(arg1, arg0) | Static389.method576(arg0, arg1)) & Static138.method2060(arg0, arg1);
	}
}
