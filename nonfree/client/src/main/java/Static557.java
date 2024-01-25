import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ep;IIII)Lclient!dd;")
	public static Class65_Sub1_Sub1 method7635(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean173 || Static485.method6790(arg3) && Static485.method6790(arg1)) {
			return new Class65_Sub1_Sub1(arg0, 3553, arg2, arg3, arg1);
		} else if (arg0.aBoolean176) {
			return new Class65_Sub1_Sub1(arg0, 34037, arg2, arg3, arg1);
		} else {
			return new Class65_Sub1_Sub1(arg0, arg2, arg3, arg1, Static350.method4699(arg3), Static350.method4699(arg1));
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public static void method7636() {
		@Pc(30) Class2_Sub40 local30 = Static464.method6285(Static251.aClass131_1, Static363.aClass179_75);
		local30.aClass2_Sub22_Sub2_2.method8537(Static626.method8388());
		local30.aClass2_Sub22_Sub2_2.method8500(Static511.anInt8548);
		local30.aClass2_Sub22_Sub2_2.method8500(Static153.anInt2747);
		local30.aClass2_Sub22_Sub2_2.method8537(Static234.aClass2_Sub5_48.aClass6_Sub11_2.method3433());
		Static528.method7295(local30);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IFI[FI[FFIIIIIIF)V")
	public static void method7637(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float arg12) {
		@Pc(5) int local5 = arg7 - arg8;
		@Pc(9) int local9 = arg10 - arg2;
		@Pc(17) int local17 = arg11 - arg4;
		@Pc(38) float local38 = arg5[1] * (float) local9 + (float) local17 * arg5[0] + (float) local5 * arg5[2];
		@Pc(59) float local59 = arg5[5] * (float) local5 + arg5[3] * (float) local17 + arg5[4] * (float) local9;
		@Pc(80) float local80 = (float) local5 * arg5[8] + (float) local9 * arg5[7] + (float) local17 * arg5[6];
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (arg0 == 0) {
			local91 = local38 + arg1 + 0.5F;
			local97 = arg6 + 0.5F - local80;
		} else if (arg0 == 1) {
			local91 = local38 + arg1 + 0.5F;
			local97 = arg6 + local80 + 0.5F;
		} else if (arg0 == 2) {
			local91 = arg1 + 0.5F - local38;
			local97 = arg12 + 0.5F - local59;
		} else if (arg0 == 3) {
			local91 = local38 + arg1 + 0.5F;
			local97 = arg12 + 0.5F - local59;
		} else if (arg0 == 4) {
			local97 = arg12 + 0.5F - local59;
			local91 = local80 + arg6 + 0.5F;
		} else {
			local91 = arg6 + 0.5F - local80;
			local97 = arg12 + 0.5F - local59;
		}
		@Pc(190) float local190;
		if (arg9 == 1) {
			local190 = local91;
			local91 = -local97;
			local97 = local190;
		} else if (arg9 == 2) {
			local97 = -local97;
			local91 = -local91;
		} else if (arg9 == 3) {
			local190 = local91;
			local91 = local97;
			local97 = -local190;
		}
		arg3[0] = local91;
		arg3[1] = local97;
	}
}
