import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "[Lclient!fv;")
	public static final Class89[] aClass89Array1 = new Class89[2048];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FII[FIIIIII)V")
	public static void method2144(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg2 - arg6;
		@Pc(13) int local13 = arg5 - arg1;
		@Pc(17) int local17 = arg8 - arg4;
		@Pc(38) float local38 = arg3[1] * (float) local9 + (float) local17 * arg3[0] + arg3[2] * (float) local13;
		@Pc(59) float local59 = arg3[5] * (float) local13 + arg3[4] * (float) local9 + (float) local17 * arg3[3];
		@Pc(80) float local80 = (float) local13 * arg3[8] + (float) local9 * arg3[7] + (float) local17 * arg3[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg0 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(131) float local131;
		if (arg7 == 1) {
			local131 = local111;
			local111 = -local124;
			local124 = local131;
		} else if (arg7 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg7 == 3) {
			local131 = local111;
			local111 = local124;
			local124 = -local131;
		}
		Static20.aFloat55 = local124;
		Static332.aFloat158 = local111;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
	public static void method2147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static57.anInt967; local7++) {
			@Pc(13) Rectangle local13 = Class7_Sub4_Sub2_Sub1.aRectangleArray1[local7];
			if (local13.width + local13.x > arg3 && local13.x < arg2 + arg3 && local13.height + local13.y > arg1 && local13.y < arg1 + arg0) {
				Static69.aBooleanArray2[local7] = true;
			}
		}
	}
}
