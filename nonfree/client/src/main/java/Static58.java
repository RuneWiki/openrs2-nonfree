import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	public static int anInt10722;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "F")
	public static float aFloat211;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!oea;")
	public static Class239 aClass239_18;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
	public static final int[] anIntArray688 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Z")
	public static boolean aBoolean730 = false;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII[FIFIIF[F)V")
	public static void method8948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float[] arg10) {
		@Pc(5) int local5 = arg5 - arg7;
		@Pc(9) int local9 = arg1 - arg0;
		@Pc(17) int local17 = arg3 - arg8;
		@Pc(38) float local38 = arg10[2] * (float) local9 + arg10[1] * (float) local5 + (float) local17 * arg10[0];
		@Pc(59) float local59 = arg10[5] * (float) local9 + arg10[3] * (float) local17 + (float) local5 * arg10[4];
		@Pc(80) float local80 = (float) local17 * arg10[6] + arg10[7] * (float) local5 + (float) local9 * arg10[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg9 != 1.0F) {
			local91 *= arg9;
		}
		@Pc(105) float local105 = local59 + arg6 + 0.5F;
		@Pc(110) float local110;
		if (arg2 == 1) {
			local110 = local91;
			local91 = -local105;
			local105 = local110;
		} else if (arg2 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg2 == 3) {
			local110 = local91;
			local91 = local105;
			local105 = -local110;
		}
		arg4[1] = local105;
		arg4[0] = local91;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Z")
	public static boolean method8950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static209.method4124(arg1, arg0) | (arg1 & 0x70000) != 0 || Static573.method8544(arg1, arg0);
	}
}
