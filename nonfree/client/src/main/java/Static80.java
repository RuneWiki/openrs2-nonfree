import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
	public static int anInt2113 = 0;

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_27 = new Class6(23, 3);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!te;IZ[BIZII)Lclient!rp;")
	public static Class20_Sub3_Sub1 method2002(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) int arg3) {
		if (arg0.aBoolean513 || Static183.method3500(arg1) && Static183.method3500(arg3)) {
			return new Class20_Sub3_Sub1(arg0, 3553, 6406, arg1, arg3, false, arg2, 6406);
		} else if (arg0.aBoolean515) {
			return new Class20_Sub3_Sub1(arg0, 34037, 6406, arg1, arg3, false, arg2, 6406);
		} else {
			return new Class20_Sub3_Sub1(arg0, 6406, arg1, arg3, Static117.method2662(arg1), Static117.method2662(arg3), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IFIBIF[FIIIIIF)V")
	public static void method2003(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(17) int local17 = arg0 - arg2;
		@Pc(21) int local21 = arg6 - arg3;
		@Pc(25) int local25 = arg7 - arg8;
		@Pc(46) float local46 = arg5[0] * (float) local21 + (float) local17 * arg5[1] + arg5[2] * (float) local25;
		@Pc(67) float local67 = (float) local21 * arg5[3] + (float) local17 * arg5[4] + (float) local25 * arg5[5];
		@Pc(88) float local88 = (float) local25 * arg5[8] + (float) local21 * arg5[6] + (float) local17 * arg5[7];
		@Pc(99) float local99;
		@Pc(106) float local106;
		if (arg10 == 0) {
			local99 = local46 + arg1 + 0.5F;
			local106 = arg4 + 0.5F - local88;
		} else if (arg10 == 1) {
			local106 = local88 + arg4 + 0.5F;
			local99 = local46 + arg1 + 0.5F;
		} else if (arg10 == 2) {
			local99 = arg1 + 0.5F - local46;
			local106 = arg11 + 0.5F - local67;
		} else if (arg10 == 3) {
			local99 = arg1 + local46 + 0.5F;
			local106 = arg11 + 0.5F - local67;
		} else if (arg10 == 4) {
			local106 = arg11 + 0.5F - local67;
			local99 = arg4 + local88 + 0.5F;
		} else {
			local106 = arg11 + 0.5F - local67;
			local99 = arg4 + 0.5F - local88;
		}
		@Pc(205) float local205;
		if (arg9 == 1) {
			local205 = local99;
			local99 = -local106;
			local106 = local205;
		} else if (arg9 == 2) {
			local106 = -local106;
			local99 = -local99;
		} else if (arg9 == 3) {
			local205 = local99;
			local99 = local106;
			local106 = -local205;
		}
		Static87.aFloat121 = local99;
		Static280.aFloat108 = local106;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(FI)F")
	public static float method2004(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)Lclient!vp;")
	public static Class309 method2005(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static352.aClass309ArrayArray2[local7] == null || Static352.aClass309ArrayArray2[local7][local11] == null) {
			@Pc(25) boolean local25 = Static43.method1389(local7);
			if (!local25) {
				return null;
			}
		}
		return Static352.aClass309ArrayArray2[local7][local11];
	}
}
