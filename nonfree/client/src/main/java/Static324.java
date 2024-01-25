import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!li", name = "z", descriptor = "I")
	public static int anInt5595 = 0;

	@OriginalMember(owner = "client!li", name = "A", descriptor = "[J")
	public static final long[] aLongArray12 = new long[32];

	@OriginalMember(owner = "client!li", name = "C", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "[I")
	public static final int[] anIntArray409 = new int[1];

	@OriginalMember(owner = "client!li", name = "K", descriptor = "[I")
	public static final int[] anIntArray410 = new int[5];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II[FIFIIIII[F)V")
	public static void method5026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(5) int local5 = arg1 - arg4;
		@Pc(13) int local13 = arg6 - arg7;
		@Pc(17) int local17 = arg5 - arg8;
		@Pc(38) float local38 = arg9[1] * (float) local5 + (float) local13 * arg9[0] + (float) local17 * arg9[2];
		@Pc(59) float local59 = (float) local17 * arg9[5] + arg9[4] * (float) local5 + (float) local13 * arg9[3];
		@Pc(80) float local80 = arg9[7] * (float) local5 + (float) local13 * arg9[6] + arg9[8] * (float) local17;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg3 + 0.5F;
		@Pc(132) float local132;
		if (arg0 == 1) {
			local132 = local106;
			local106 = -local119;
			local119 = local132;
		} else if (arg0 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg0 == 3) {
			local132 = local106;
			local106 = local119;
			local119 = -local132;
		}
		arg2[1] = local119;
		arg2[0] = local106;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method5028(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static170.method2647(arg1);
		@Pc(10) int local10 = Static222.aCalendar1.get(5);
		@Pc(16) int local16 = Static222.aCalendar1.get(2) + 1;
		@Pc(35) int local35 = Static222.aCalendar1.get(1);
		@Pc(39) int local39 = Static222.aCalendar1.get(11);
		@Pc(43) int local43 = Static222.aCalendar1.get(12);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local16 / 10 + local16 % 10 + "/" + local35 % 100 / 10 + local35 % 10 + " " + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10;
	}
}
