import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "Lclient!mf;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "Lclient!qa;")
	public static Class121 aClass121_3;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_41 = new Class151(64);

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_87 = new Class12(4, 14);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	public static void method1102() {
		Static175.aClass151_134.method3297(5);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method1105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static256.aClass70Array2 == null) {
			return;
		}
		@Pc(21) Class47_Sub1_Sub5 local21;
		@Pc(17) int local17;
		if (arg6 >= 0) {
			local17 = arg6 - 1;
			local21 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local17];
		} else {
			local17 = -arg6 - 1;
			if (Static179.anInt3373 == local17) {
				local21 = Static255.aClass47_Sub1_Sub5_Sub2_2;
			} else {
				local21 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local17];
			}
		}
		if (local21 == null) {
			return;
		}
		@Pc(52) Class29 local52 = Static251.aClass207_2.method4977(arg2);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg5 == 1 || arg5 == 3) {
			local61 = local52.anInt532;
			local64 = local52.anInt542;
		} else {
			local61 = local52.anInt542;
			local64 = local52.anInt532;
		}
		@Pc(78) int local78 = arg9 + (local64 >> 1);
		@Pc(86) int local86 = (local64 + 1 >> 1) + arg9;
		@Pc(92) int local92 = (local61 >> 1) + arg3;
		@Pc(101) int local101 = arg3 + (local61 + 1 >> 1);
		@Pc(105) Class70 local105 = Static256.aClass70Array2[arg10];
		@Pc(129) int local129 = local105.I(local78, local92) + local105.I(local86, local92) + local105.I(local78, local101) + local105.I(local86, local101) >> 2;
		@Pc(133) Class1_Sub36 local133 = new Class1_Sub36();
		@Pc(142) int local142;
		if (arg8 < arg1) {
			local142 = arg1;
			arg1 = arg8;
			arg8 = local142;
		}
		local133.anInt6204 = arg5;
		local133.anInt6197 = arg9;
		local133.anInt6205 = arg3;
		local133.anInt6201 = arg2;
		local133.anInt6195 = local21.aByte97;
		local133.anInt6209 = arg0;
		local133.anInt6202 = arg12 + Static123.anInt2333;
		local133.anInt6196 = arg7 + Static123.anInt2333;
		if (arg11 < arg4) {
			local142 = arg4;
			arg4 = arg11;
			arg11 = local142;
		}
		local133.anInt6208 = arg8 + arg9;
		local133.anInt6203 = arg9 + arg1;
		local133.anInt6199 = arg4 + arg3;
		local133.anInt6194 = local129;
		local133.anInt6210 = (local133.anInt6197 << 7) + (local64 << 6);
		local133.anInt6200 = (local133.anInt6205 << 7) + (local61 << 6);
		local133.anInt6206 = arg3 + arg11;
		Static260.aClass142_32.method3212(local133);
		local21.aClass1_Sub36_3 = local133;
	}
}
