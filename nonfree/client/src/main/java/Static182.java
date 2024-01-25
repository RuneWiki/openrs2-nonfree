import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "I")
	public static int anInt3941;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "I")
	public static int anInt3942;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "[I")
	public static final int[] anIntArray380 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIFI[FIIIBF)V")
	public static void method3056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) float arg9) {
		@Pc(3) int local3 = arg0 - arg4;
		@Pc(7) int local7 = arg7 - arg2;
		@Pc(11) int local11 = arg6 - arg1;
		@Pc(36) float local36 = (float) local7 * arg5[2] + arg5[0] * (float) local11 + arg5[1] * (float) local3;
		@Pc(57) float local57 = (float) local7 * arg5[5] + (float) local3 * arg5[4] + arg5[3] * (float) local11;
		@Pc(78) float local78 = (float) local7 * arg5[8] + arg5[7] * (float) local3 + (float) local11 * arg5[6];
		@Pc(89) float local89 = (float) Math.atan2((double) local36, (double) local78) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local89 *= arg3;
		}
		@Pc(108) float local108 = arg9 + local57 + 0.5F;
		@Pc(121) float local121;
		if (arg8 == 1) {
			local121 = local89;
			local89 = -local108;
			local108 = local121;
		} else if (arg8 == 2) {
			local89 = -local89;
			local108 = -local108;
		} else if (arg8 == 3) {
			local121 = local89;
			local89 = local108;
			local108 = -local121;
		}
		Static145.aFloat26 = local89;
		Static426.aFloat10 = local108;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
	public static void method3057() {
		if (Static170.anInt3494 == 8) {
			Static118.method2017(4);
		} else if (Static170.anInt3494 == 4 || Static170.anInt3494 == 5) {
			Static118.method2017(2);
		} else if (Static170.anInt3494 == 11) {
			Static118.method2017(2);
		}
	}
}
