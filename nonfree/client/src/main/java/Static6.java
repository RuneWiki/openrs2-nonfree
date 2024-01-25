import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!ht;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
	public static final int[] anIntArray12 = new int[1000];

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public static int anInt98 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[FIIIIIIFI)V")
	public static void method214(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8) {
		@Pc(9) int local9 = arg7 - arg3;
		@Pc(13) int local13 = arg6 - arg5;
		@Pc(17) int local17 = arg2 - arg4;
		@Pc(38) float local38 = (float) local9 * arg1[2] + arg1[1] * (float) local17 + (float) local13 * arg1[0];
		@Pc(59) float local59 = arg1[5] * (float) local9 + (float) local13 * arg1[3] + (float) local17 * arg1[4];
		@Pc(80) float local80 = arg1[8] * (float) local9 + arg1[7] * (float) local17 + (float) local13 * arg1[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg8 + 0.5F;
		@Pc(138) float local138;
		if (arg0 == 1) {
			local138 = local106;
			local106 = -local119;
			local119 = local138;
		} else if (arg0 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg0 == 3) {
			local138 = local106;
			local106 = local119;
			local119 = -local138;
		}
		Static46.aFloat56 = local119;
		Static216.aFloat93 = local106;
	}
}
