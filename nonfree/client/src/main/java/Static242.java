import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
	public static int anInt4628;

	@OriginalMember(owner = "client!lu", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString45 = "";

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_167 = new Class184(8, 7);

	@OriginalMember(owner = "client!lu", name = "S", descriptor = "Z")
	public static boolean aBoolean351 = false;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(FI[FIIFBIIII)V")
	public static void method3774(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4 - arg6;
		@Pc(9) int local9 = arg9 - arg8;
		@Pc(17) int local17 = arg3 - arg7;
		@Pc(38) float local38 = arg2[2] * (float) local17 + arg2[0] * (float) local9 + (float) local5 * arg2[1];
		@Pc(59) float local59 = (float) local17 * arg2[5] + arg2[4] * (float) local5 + (float) local9 * arg2[3];
		@Pc(80) float local80 = (float) local17 * arg2[8] + arg2[6] * (float) local9 + (float) local5 * arg2[7];
		@Pc(99) float local99 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local99 *= arg0;
		}
		@Pc(113) float local113 = arg5 + local59 + 0.5F;
		@Pc(118) float local118;
		if (arg1 == 1) {
			local118 = local99;
			local99 = -local113;
			local113 = local118;
		} else if (arg1 == 2) {
			local113 = -local113;
			local99 = -local99;
		} else if (arg1 == 3) {
			local118 = local99;
			local99 = local113;
			local113 = -local118;
		}
		Static240.aFloat61 = local113;
		Static266.aFloat66 = local99;
	}
}
