import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "F")
	public static float aFloat214;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	public static int anInt7201 = -1;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public static final int anInt7203 = 205;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIIIIIIBI)V")
	public static void method5566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12) {
		if (Static244.aClass165Array8 == null) {
			return;
		}
		@Pc(18) Class26_Sub2_Sub4 local18;
		@Pc(14) int local14;
		if (arg12 >= 0) {
			local14 = arg12 - 1;
			local18 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local14];
		} else {
			local14 = -arg12 - 1;
			if (local14 == Static296.anInt4920) {
				local18 = Static104.aClass26_Sub2_Sub4_Sub2_2;
			} else {
				local18 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local14];
			}
		}
		if (local18 == null) {
			return;
		}
		@Pc(53) Class189 local53 = Static411.aClass142_4.method3148(arg4);
		@Pc(66) int local66;
		@Pc(69) int local69;
		if (arg3 == 1 || arg3 == 3) {
			local69 = local53.anInt5073;
			local66 = local53.anInt5110;
		} else {
			local66 = local53.anInt5073;
			local69 = local53.anInt5110;
		}
		@Pc(83) int local83 = (local66 >> 1) + arg11;
		@Pc(91) int local91 = arg11 + (local66 + 1 >> 1);
		@Pc(97) int local97 = (local69 >> 1) + arg0;
		@Pc(106) int local106 = arg0 + (local69 + 1 >> 1);
		@Pc(110) Class165 local110 = Static244.aClass165Array8[arg5];
		@Pc(134) int local134 = local110.l(local83, local97) + local110.l(local91, local97) + local110.l(local83, local106) + local110.l(local91, local106) >> 2;
		@Pc(138) Class7_Sub42 local138 = new Class7_Sub42();
		local138.anInt6168 = arg10;
		local138.anInt6173 = arg4;
		@Pc(149) int local149;
		if (arg6 < arg2) {
			local149 = arg2;
			arg2 = arg6;
			arg6 = local149;
		}
		local138.anInt6163 = arg11;
		local138.anInt6165 = Static274.anInt4617 + arg7;
		local138.anInt6171 = Static274.anInt4617 + arg8;
		local138.anInt6167 = arg0;
		local138.anInt6162 = arg3;
		local138.anInt6161 = local18.aByte102;
		local138.anInt6170 = arg11 + arg2;
		local138.anInt6166 = arg6 + arg11;
		if (arg9 < arg1) {
			local149 = arg1;
			arg1 = arg9;
			arg9 = local149;
		}
		local138.anInt6169 = local134;
		local138.anInt6177 = arg1 + arg0;
		local138.anInt6176 = (local69 << 6) + (local138.anInt6167 << 7);
		local138.anInt6172 = arg9 + arg0;
		local138.anInt6164 = (local66 << 6) + (local138.anInt6163 << 7);
		Static320.aClass85_35.method2011(local138);
		local18.aClass7_Sub42_3 = local138;
	}
}
