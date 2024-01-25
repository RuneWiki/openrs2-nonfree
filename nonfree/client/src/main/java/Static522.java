import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
	public static final int anInt9606 = 4;

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V")
	public static void method7399() {
		Static136.aBoolean226 = false;
		Static533.method7519();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([FIIFIIIBII)V")
	public static void method7400(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg8 - arg5;
		@Pc(9) int local9 = arg4 - arg7;
		@Pc(13) int local13 = arg6 - arg2;
		@Pc(38) float local38 = (float) local5 * arg0[2] + (float) local9 * arg0[1] + (float) local13 * arg0[0];
		@Pc(59) float local59 = arg0[5] * (float) local5 + arg0[4] * (float) local9 + (float) local13 * arg0[3];
		@Pc(80) float local80 = arg0[8] * (float) local5 + arg0[7] * (float) local9 + arg0[6] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg3 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(130) float local130;
		if (arg1 == 1) {
			local130 = local106;
			local106 = -local123;
			local123 = local130;
		} else if (arg1 == 2) {
			local123 = -local123;
			local106 = -local106;
		} else if (arg1 == 3) {
			local130 = local106;
			local106 = local123;
			local123 = -local130;
		}
		Static155.aFloat74 = local106;
		Static361.aFloat160 = local123;
	}
}
