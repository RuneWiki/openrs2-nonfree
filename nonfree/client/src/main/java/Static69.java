import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
	public static int anInt3210;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array7;

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
	public static int anInt3214 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIBIIIII)V")
	public static void method2477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static278.aClass41Array3 == null) {
			return;
		}
		@Pc(21) Class8_Sub3_Sub1 local21;
		@Pc(17) int local17;
		if (arg11 >= 0) {
			local17 = arg11 - 1;
			local21 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local17];
		} else {
			local17 = -arg11 - 1;
			if (local17 == Static12.anInt187) {
				local21 = Static401.aClass8_Sub3_Sub1_Sub1_2;
			} else {
				local21 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local17];
			}
		}
		if (local21 == null) {
			return;
		}
		@Pc(47) Class114 local47 = Static51.aClass151_1.method2917(arg9);
		@Pc(56) int local56;
		@Pc(59) int local59;
		if (arg8 == 1 || arg8 == 3) {
			local56 = local47.anInt2857;
			local59 = local47.anInt2851;
		} else {
			local59 = local47.anInt2857;
			local56 = local47.anInt2851;
		}
		@Pc(74) int local74 = arg0 + (local56 >> 1);
		@Pc(82) int local82 = (local56 + 1 >> 1) + arg0;
		@Pc(88) int local88 = arg4 + (local59 >> 1);
		@Pc(97) int local97 = arg4 + (local59 + 1 >> 1);
		@Pc(101) Class41 local101 = Static278.aClass41Array3[arg1];
		@Pc(125) int local125 = local101.l(local74, local88) + local101.l(local82, local88) + local101.l(local74, local97) + local101.l(local82, local97) >> 2;
		@Pc(129) Class4_Sub3 local129 = new Class4_Sub3();
		local129.anInt150 = arg4;
		local129.anInt157 = Static265.anInt4371 + arg2;
		local129.anInt149 = arg0;
		local129.anInt158 = arg9;
		local129.anInt146 = arg8;
		@Pc(155) int local155;
		if (arg6 > arg3) {
			local155 = arg6;
			arg6 = arg3;
			arg3 = local155;
		}
		local129.anInt155 = local21.aByte99;
		local129.anInt156 = arg7 + Static265.anInt4371;
		local129.anInt147 = arg12;
		local129.anInt154 = arg6 + arg0;
		local129.anInt161 = arg3 + arg0;
		if (arg5 > arg10) {
			local155 = arg5;
			arg5 = arg10;
			arg10 = local155;
		}
		local129.anInt152 = (local59 << 6) + (local129.anInt150 << 7);
		local129.anInt153 = (local56 << 6) + (local129.anInt149 << 7);
		local129.anInt159 = arg5 + arg4;
		local129.anInt148 = local125;
		local129.anInt164 = arg4 + arg10;
		Static297.aClass244_26.method5273(local129);
		local21.aClass4_Sub3_3 = local129;
	}
}
