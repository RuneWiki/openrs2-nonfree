import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "[I")
	public static int[] anIntArray473;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_84 = new Class387(25, 7);

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "([FII[FIIBFIII)V")
	public static void method6791(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4 - arg5;
		@Pc(9) int local9 = arg7 - arg2;
		@Pc(13) int local13 = arg9 - arg1;
		@Pc(38) float local38 = (float) local5 * arg0[2] + (float) local13 * arg0[0] + (float) local9 * arg0[1];
		@Pc(59) float local59 = arg0[5] * (float) local5 + arg0[4] * (float) local9 + (float) local13 * arg0[3];
		@Pc(80) float local80 = arg0[8] * (float) local5 + arg0[7] * (float) local9 + (float) local13 * arg0[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(113) float local113 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(126) float local126 = arg6 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(141) float local141;
		if (arg8 == 1) {
			local141 = local113;
			local113 = -local126;
			local126 = local141;
		} else if (arg8 == 2) {
			local113 = -local113;
			local126 = -local126;
		} else if (arg8 == 3) {
			local141 = local113;
			local113 = local126;
			local126 = -local141;
		}
		arg3[0] = local113;
		arg3[1] = local126;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method6792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 - arg0;
		if (local14 < -9) {
			return "<col=ff0000>";
		} else if (local14 < -6) {
			return "<col=ff3000>";
		} else if (local14 < -3) {
			return "<col=ff7000>";
		} else if (local14 < 0) {
			return "<col=ffb000>";
		} else if (local14 > 9) {
			return "<col=00ff00>";
		} else if (local14 > 6) {
			return "<col=40ff00>";
		} else if (local14 > 3) {
			return "<col=80ff00>";
		} else if (local14 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
