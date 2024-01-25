import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!er", name = "L", descriptor = "Lclient!vv;")
	public static Class263 aClass263_58;

	@OriginalMember(owner = "client!er", name = "O", descriptor = "I")
	public static int anInt2412 = 0;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(I)V")
	public static void method1748() {
		Static128.aClass38_12.method774();
		Static55.aClass38_4.method774();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[FIIZIIFI)V")
	public static void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg4 - arg6;
		@Pc(7) int local7 = arg5 - arg1;
		@Pc(11) int local11 = arg0 - arg8;
		@Pc(36) float local36 = arg2[1] * (float) local11 + (float) local3 * arg2[0] + (float) local7 * arg2[2];
		@Pc(57) float local57 = (float) local7 * arg2[5] + (float) local3 * arg2[3] + arg2[4] * (float) local11;
		@Pc(83) float local83 = (float) local7 * arg2[8] + (float) local3 * arg2[6] + arg2[7] * (float) local11;
		@Pc(98) float local98 = (float) Math.sqrt((double) (local36 * local36 + local57 * local57 + local83 * local83));
		@Pc(109) float local109 = (float) Math.atan2((double) local36, (double) local83) / 6.2831855F + 0.5F;
		@Pc(122) float local122 = (float) Math.asin((double) (local57 / local98)) / 3.1415927F + arg7 + 0.5F;
		@Pc(133) float local133;
		if (arg3 == 1) {
			local133 = local109;
			local109 = -local122;
			local122 = local133;
		} else if (arg3 == 2) {
			local109 = -local109;
			local122 = -local122;
		} else if (arg3 == 3) {
			local133 = local109;
			local109 = local122;
			local122 = -local133;
		}
		Static15.aFloat2 = local109;
		Static156.aFloat32 = local122;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method1750(@OriginalArg(1) String arg0) {
		return Static59.method1106(arg0, 16);
	}
}
