import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	public static int anInt3143;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II[FIIFIIII)V")
	public static void method2536(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg2 - arg3;
		@Pc(9) int local9 = arg6 - arg7;
		@Pc(13) int local13 = arg5 - arg8;
		@Pc(38) float local38 = (float) local5 * arg1[0] + arg1[1] * (float) local9 + (float) local13 * arg1[2];
		@Pc(59) float local59 = (float) local9 * arg1[4] + (float) local5 * arg1[3] + (float) local13 * arg1[5];
		@Pc(80) float local80 = (float) local13 * arg1[8] + (float) local5 * arg1[6] + (float) local9 * arg1[7];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg4 + 0.5F;
		@Pc(132) float local132;
		if (arg0 == 1) {
			local132 = local106;
			local106 = -local119;
			local119 = local132;
		} else if (arg0 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg0 == 3) {
			local132 = local106;
			local106 = local119;
			local119 = -local132;
		}
		Static270.aFloat71 = local119;
		Static196.aFloat60 = local106;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!mg;III)Lclient!kq;")
	public static Class146 method2537(@OriginalArg(0) Class160 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method3696(0, arg1);
		return local14 == null ? null : new Class146(local14);
	}
}
