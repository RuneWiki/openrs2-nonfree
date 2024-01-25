import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "[I")
	public static final int[] anIntArray63 = new int[4];

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_24 = new Class67(79, 19);

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString5 = null;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
	public static final int[] anIntArray64 = new int[1];

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
	public static int anInt421 = -1;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FI)F")
	public static float method407(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIFIII[F)V")
	public static void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(13) int local13 = arg6 - arg3;
		@Pc(17) int local17 = arg2 - arg7;
		@Pc(38) float local38 = (float) local17 * arg8[2] + (float) local9 * arg8[1] + (float) local13 * arg8[0];
		@Pc(59) float local59 = arg8[5] * (float) local17 + arg8[3] * (float) local13 + (float) local9 * arg8[4];
		@Pc(80) float local80 = arg8[8] * (float) local17 + (float) local9 * arg8[7] + arg8[6] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg5 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(138) float local138;
		if (arg4 == 1) {
			local138 = local106;
			local106 = -local119;
			local119 = local138;
		} else if (arg4 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg4 == 3) {
			local138 = local106;
			local106 = local119;
			local119 = -local138;
		}
		Static9.aFloat2 = local119;
		Static161.aFloat28 = local106;
	}
}
