import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!og", name = "m", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public static final int anInt4821 = 1337;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "[I")
	public static final int[] anIntArray432 = new int[32];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B[FIIIIFIII)V")
	public static void method4276(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg1 - arg6;
		@Pc(9) int local9 = arg4 - arg2;
		@Pc(31) int local31 = arg8 - arg3;
		@Pc(52) float local52 = arg0[2] * (float) local31 + (float) local5 * arg0[1] + arg0[0] * (float) local9;
		@Pc(73) float local73 = (float) local31 * arg0[5] + arg0[4] * (float) local5 + arg0[3] * (float) local9;
		@Pc(94) float local94 = arg0[6] * (float) local9 + (float) local5 * arg0[7] + (float) local31 * arg0[8];
		@Pc(109) float local109 = (float) Math.sqrt((double) (local94 * local94 + local52 * local52 + local73 * local73));
		@Pc(120) float local120 = (float) Math.atan2((double) local52, (double) local94) / 6.2831855F + 0.5F;
		@Pc(133) float local133 = arg5 + (float) Math.asin((double) (local73 / local109)) / 3.1415927F + 0.5F;
		@Pc(146) float local146;
		if (arg7 == 1) {
			local146 = local120;
			local120 = -local133;
			local133 = local146;
		} else if (arg7 == 2) {
			local133 = -local133;
			local120 = -local120;
		} else if (arg7 == 3) {
			local146 = local120;
			local120 = local133;
			local133 = -local146;
		}
		Static261.aFloat83 = local120;
		Static312.aFloat89 = local133;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public static void method4277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static193.aClass44_3 == Static323.aClass44_4) {
			if (Static367.method5800(1, false, 1, -2, arg1, arg0, 0, 0)) {
				return;
			}
			Static367.method5800(1, false, 1, -3, arg1, arg0, 0, 0);
		} else if (Static367.method5800(1, false, 1, -3, arg1, arg0, 0, 0)) {
			return;
		} else {
			Static367.method5800(1, false, 1, -2, arg1, arg0, 0, 0);
		}
	}
}
