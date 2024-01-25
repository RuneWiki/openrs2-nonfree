import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "[[[Lclient!rb;")
	public static Class216[][][] aClass216ArrayArrayArray2;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "[Lclient!mh;")
	public static final Class1_Sub3_Sub14[] aClass1_Sub3_Sub14Array5 = new Class1_Sub3_Sub14[14];

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_6 = new Class165(7, 0, 1, 1);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(FIIF[FIIIIII)V")
	public static void method2161(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg7 - arg8;
		@Pc(13) int local13 = arg2 - arg5;
		@Pc(17) int local17 = arg9 - arg6;
		@Pc(38) float local38 = (float) local17 * arg4[0] + (float) local9 * arg4[1] + arg4[2] * (float) local13;
		@Pc(59) float local59 = arg4[4] * (float) local9 + (float) local17 * arg4[3] + arg4[5] * (float) local13;
		@Pc(80) float local80 = (float) local9 * arg4[7] + arg4[6] * (float) local17 + (float) local13 * arg4[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local91 *= arg0;
		}
		@Pc(105) float local105 = arg3 + local59 + 0.5F;
		@Pc(126) float local126;
		if (arg1 == 1) {
			local126 = local91;
			local91 = -local105;
			local105 = local126;
		} else if (arg1 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg1 == 3) {
			local126 = local91;
			local91 = local105;
			local105 = -local126;
		}
		Static87.aFloat8 = local105;
		Static315.aFloat71 = local91;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!ih;IIIZZI[B)Lclient!wh;")
	public static Class23_Sub3_Sub1 method2163(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(7) byte[] arg3) {
		if (arg0.aBoolean312 || Static375.method4864(arg1) && Static375.method4864(arg2)) {
			return new Class23_Sub3_Sub1(arg0, 3553, 6406, arg1, arg2, false, arg3, 6406);
		} else if (arg0.aBoolean309) {
			return new Class23_Sub3_Sub1(arg0, 34037, 6406, arg1, arg2, false, arg3, 6406);
		} else {
			return new Class23_Sub3_Sub1(arg0, 6406, arg1, arg2, Static191.method2764(arg1), Static191.method2764(arg2), arg3, 6406);
		}
	}
}
