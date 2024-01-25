import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
	public static int anInt2458;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "[Lclient!ab;")
	public static final Class3[] aClass3Array1 = new Class3[128];

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Lclient!os;")
	public static final Class182 aClass182_94 = new Class182("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Lclient!s;")
	public static final Class217 aClass217_54 = new Class217(51, 2);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BII)I")
	public static int method2092(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(37) int local37 = Integer.MAX_VALUE & local15 * (local15 * local15 * 15731 + 789221) + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static332.aClass154Array3 == null) {
			return;
		}
		@Pc(8) Class24_Sub3_Sub2 local8 = null;
		@Pc(20) int local20;
		if (arg1 < 0) {
			local20 = -arg1 - 1;
			if (local20 == Static245.anInt4435) {
				local8 = Static263.aClass24_Sub3_Sub2_Sub2_4;
			} else {
				local8 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local20];
			}
		} else {
			local20 = arg1 - 1;
			@Pc(48) Class10_Sub26 local48 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local20);
			if (local48 != null) {
				local8 = local48.aClass24_Sub3_Sub2_Sub1_2;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(61) Class126 local61 = Static342.aClass237_4.method5212(arg7);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (arg11 == 1 || arg11 == 3) {
			local72 = local61.anInt3782;
			local75 = local61.anInt3785;
		} else {
			local75 = local61.anInt3782;
			local72 = local61.anInt3785;
		}
		@Pc(89) int local89 = (local72 >> 1) + arg6;
		@Pc(98) int local98 = arg6 + (local72 + 1 >> 1);
		@Pc(105) int local105 = arg3 + (local75 >> 1);
		@Pc(114) int local114 = arg3 + (local75 + 1 >> 1);
		@Pc(118) Class154 local118 = Static332.aClass154Array3[arg2];
		@Pc(143) int local143 = local118.ua(local89, local105) + local118.ua(local98, local105) + local118.ua(local89, local114) + local118.ua(local98, local114) >> 2;
		@Pc(147) Class10_Sub34 local147 = new Class10_Sub34();
		local147.anInt5325 = arg7;
		local147.anInt5327 = arg3;
		local147.anInt5326 = Static400.anInt6752 + arg9;
		local147.anInt5317 = local8.aByte98;
		local147.anInt5320 = arg6;
		@Pc(174) int local174;
		if (arg12 > arg8) {
			local174 = arg12;
			arg12 = arg8;
			arg8 = local174;
		}
		local147.anInt5321 = arg11;
		local147.anInt5319 = Static400.anInt6752 + arg5;
		local147.anInt5328 = arg10;
		local147.anInt5330 = arg12 + arg6;
		if (arg4 < arg0) {
			local174 = arg0;
			arg0 = arg4;
			arg4 = local174;
		}
		local147.anInt5316 = arg8 + arg6;
		local147.anInt5318 = (local75 << 6) + (local147.anInt5327 << 7);
		local147.anInt5331 = (local72 << 6) + (local147.anInt5320 << 7);
		local147.anInt5329 = arg0 + arg3;
		local147.anInt5322 = local143;
		local147.anInt5324 = arg3 + arg4;
		Static99.aClass163_18.method3613(local147);
		local8.aClass10_Sub34_3 = local147;
	}
}
