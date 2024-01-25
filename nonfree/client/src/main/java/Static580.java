import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!vo;")
	public static Class348 aClass348_84;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject103;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_36 = new Class167(32);

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_63 = new Class344(54, 7);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[FFIIIIIFIZF)V")
	public static void method5874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) int arg10, @OriginalArg(12) float arg11) {
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(13) int local13 = arg8 - arg7;
		@Pc(17) int local17 = arg6 - arg5;
		@Pc(38) float local38 = (float) local17 * arg2[2] + (float) local9 * arg2[0] + arg2[1] * (float) local13;
		@Pc(59) float local59 = arg2[5] * (float) local17 + (float) local9 * arg2[3] + arg2[4] * (float) local13;
		@Pc(80) float local80 = (float) local17 * arg2[8] + arg2[6] * (float) local9 + arg2[7] * (float) local13;
		@Pc(92) float local92;
		@Pc(99) float local99;
		if (arg4 == 0) {
			local92 = arg9 + local38 + 0.5F;
			local99 = arg3 + 0.5F - local80;
		} else if (arg4 == 1) {
			local99 = local80 + arg3 + 0.5F;
			local92 = arg9 + local38 + 0.5F;
		} else if (arg4 == 2) {
			local99 = arg11 + 0.5F - local59;
			local92 = arg9 + 0.5F - local38;
		} else if (arg4 == 3) {
			local92 = arg9 + local38 + 0.5F;
			local99 = arg11 + 0.5F - local59;
		} else if (arg4 == 4) {
			local99 = arg11 + 0.5F - local59;
			local92 = local80 + arg3 + 0.5F;
		} else {
			local92 = arg3 + 0.5F - local80;
			local99 = arg11 + 0.5F - local59;
		}
		@Pc(204) float local204;
		if (arg10 == 1) {
			local204 = local92;
			local92 = -local99;
			local99 = local204;
		} else if (arg10 == 2) {
			local92 = -local92;
			local99 = -local99;
		} else if (arg10 == 3) {
			local204 = local92;
			local92 = local99;
			local99 = -local204;
		}
		Static71.aFloat52 = local92;
		Static131.aFloat67 = local99;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(FF[BIBILclient!ba;IIFIFFI)V")
	public static void method5876(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class26 arg4, @OriginalArg(9) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7, @OriginalArg(13) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(52) int local52;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg4.method3280(arg1 * 127.0F, arg5 / (float) 128, arg8, 0, arg7 / (float) 16, local12, arg6 / (float) 128);
			local42 = arg3;
			arg5 *= 2.0F;
			arg7 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg2[local42] = (byte) ((float) arg2[local42] + local12[local52]);
				local42++;
			}
			arg1 *= arg0;
			arg6 *= 2.0F;
		}
		local42 = arg3;
		for (local52 = 0; local52 < 16384; local52++) {
			arg2[local42] -= -127;
			local42++;
		}
	}
}
