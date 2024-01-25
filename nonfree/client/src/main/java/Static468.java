import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	public static int anInt2402;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "([FIIFIIZIFII)V")
	public static void method2156(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg8 - arg2;
		@Pc(24) int local24 = arg5 - arg4;
		@Pc(28) int local28 = arg1 - arg9;
		@Pc(53) float local53 = arg0[2] * (float) local28 + (float) local24 * arg0[0] + (float) local5 * arg0[1];
		@Pc(74) float local74 = arg0[4] * (float) local5 + (float) local24 * arg0[3] + (float) local28 * arg0[5];
		@Pc(95) float local95 = arg0[8] * (float) local28 + (float) local24 * arg0[6] + (float) local5 * arg0[7];
		@Pc(106) float local106 = (float) Math.atan2((double) local53, (double) local95) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local106 *= arg7;
		}
		@Pc(120) float local120 = arg3 + local74 + 0.5F;
		@Pc(127) float local127;
		if (arg6 == 1) {
			local127 = local106;
			local106 = -local120;
			local120 = local127;
		} else if (arg6 == 2) {
			local106 = -local106;
			local120 = -local120;
		} else if (arg6 == 3) {
			local127 = local106;
			local106 = local120;
			local120 = -local127;
		}
		Static455.aFloat155 = local106;
		Static393.aFloat201 = local120;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!sg;I)V")
	public static void method2157(@OriginalArg(0) Class26_Sub8 arg0) {
		arg0.aClass10_Sub1_Sub2_1 = null;
		if (Static163.anInt3567 < 20) {
			Static12.aClass8_1.method109(arg0);
			Static163.anInt3567++;
		}
	}
}
