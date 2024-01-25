import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	public static int anInt9883;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!bs;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString93 = "";

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII[FFIIII)V")
	public static void method7865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) int local5 = arg3 - arg7;
		@Pc(9) int local9 = arg8 - arg2;
		@Pc(17) int local17 = arg1 - arg0;
		@Pc(38) float local38 = arg4[2] * (float) local9 + (float) local5 * arg4[1] + (float) local17 * arg4[0];
		@Pc(59) float local59 = (float) local9 * arg4[5] + arg4[4] * (float) local5 + arg4[3] * (float) local17;
		@Pc(80) float local80 = arg4[7] * (float) local5 + (float) local17 * arg4[6] + arg4[8] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg5 + 0.5F;
		@Pc(144) float local144;
		if (arg6 == 1) {
			local144 = local106;
			local106 = -local119;
			local119 = local144;
		} else if (arg6 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg6 == 3) {
			local144 = local106;
			local106 = local119;
			local119 = -local144;
		}
		Static4.aFloat5 = local106;
		Static166.aFloat118 = local119;
	}
}
