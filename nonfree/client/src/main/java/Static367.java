import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
	public static int anInt6997;

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "Lclient!wn;")
	public static Class209 aClass209_5;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBII[FFIIII)V")
	public static void method5657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg8 - arg2;
		@Pc(9) int local9 = arg6 - arg5;
		@Pc(13) int local13 = arg7 - arg0;
		@Pc(38) float local38 = (float) local9 * arg3[0] + (float) local13 * arg3[1] + arg3[2] * (float) local5;
		@Pc(64) float local64 = arg3[5] * (float) local5 + arg3[3] * (float) local9 + arg3[4] * (float) local13;
		@Pc(85) float local85 = arg3[8] * (float) local5 + (float) local13 * arg3[7] + arg3[6] * (float) local9;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local38 * local38 + local64 * local64 + local85 * local85));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg4 + (float) Math.asin((double) (local64 / local100)) / 3.1415927F + 0.5F;
		@Pc(129) float local129;
		if (arg1 == 1) {
			local129 = local111;
			local111 = -local124;
			local124 = local129;
		} else if (arg1 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg1 == 3) {
			local129 = local111;
			local111 = local124;
			local124 = -local129;
		}
		Static513.aFloat230 = local111;
		Static357.aFloat178 = local124;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V")
	public static void method5659() {
		Static133.aClass306_1 = new Class306(8);
		Static574.anInt9496 = 0;
		for (@Pc(17) Class11_Sub9 local17 = (Class11_Sub9) Static485.aClass196_8.method4024(); local17 != null; local17 = (Class11_Sub9) Static485.aClass196_8.method4028()) {
			local17.method5347();
		}
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V")
	public static void method5660() {
		Static511.method7150();
		Static432.aClass78_112 = null;
		aClass209_5 = null;
		Static366.aClass130ArrayArray1 = null;
		Static14.aClass209_1 = null;
		Static504.aClass209_6 = null;
	}
}
