import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Lclient!ki;")
	public static Class183 aClass183_27 = new Class183();

	@OriginalMember(owner = "client!io", name = "u", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_50 = new Class230(21, 3);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIFF[FII)V")
	public static void method3872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg0 - arg1;
		@Pc(13) int local13 = arg2 - arg8;
		@Pc(17) int local17 = arg4 - arg9;
		@Pc(38) float local38 = (float) local5 * arg7[2] + (float) local17 * arg7[1] + arg7[0] * (float) local13;
		@Pc(59) float local59 = (float) local5 * arg7[5] + arg7[3] * (float) local13 + (float) local17 * arg7[4];
		@Pc(80) float local80 = (float) local5 * arg7[8] + arg7[7] * (float) local17 + arg7[6] * (float) local13;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local91 *= arg5;
		}
		@Pc(105) float local105 = local59 + arg6 + 0.5F;
		@Pc(134) float local134;
		if (arg3 == 1) {
			local134 = local91;
			local91 = -local105;
			local105 = local134;
		} else if (arg3 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg3 == 3) {
			local134 = local91;
			local91 = local105;
			local105 = -local134;
		}
		Static198.aFloat58 = local105;
		Static24.aFloat11 = local91;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIJ)V")
	public static void method3875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg2 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static85.method1895(0, local10, true, arg0, arg1, 0, 0, local22);
			return;
		}
		@Pc(59) Class292 local59 = Static253.aClass146_2.method3356(local29);
		@Pc(70) int local70;
		@Pc(67) int local67;
		if (local22 == 0 || local22 == 2) {
			local67 = local59.anInt8775;
			local70 = local59.anInt8734;
		} else {
			local67 = local59.anInt8734;
			local70 = local59.anInt8775;
		}
		@Pc(80) int local80 = local59.lb;
		if (local22 != 0) {
			local80 = (local80 << local22 & 0xF) + (local80 >> 4 - local22);
		}
		Static85.method1895(local80, 0, true, arg0, arg1, local70, local67, 0);
	}
}
