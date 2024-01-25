import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!f;")
	public static Class3 aClass3_11;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public static int anInt3969 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static346.aClass146Array2 == null) {
			return;
		}
		@Pc(18) Class6_Sub2_Sub1 local18;
		@Pc(14) int local14;
		if (arg0 >= 0) {
			local14 = arg0 - 1;
			local18 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local14];
		} else {
			local14 = -arg0 - 1;
			if (Static373.anInt6574 == local14) {
				local18 = Static375.aClass6_Sub2_Sub1_Sub1_3;
			} else {
				local18 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local14];
			}
		}
		if (local18 == null) {
			return;
		}
		@Pc(48) Class71 local48 = Static2.aClass74_13.method1683(arg5);
		@Pc(62) int local62;
		@Pc(59) int local59;
		if (arg6 == 1 || arg6 == 3) {
			local59 = local48.anInt2169;
			local62 = local48.anInt2198;
		} else {
			local62 = local48.anInt2169;
			local59 = local48.anInt2198;
		}
		@Pc(76) int local76 = (local62 >> 1) + arg2;
		@Pc(85) int local85 = arg2 + (local62 + 1 >> 1);
		@Pc(91) int local91 = (local59 >> 1) + arg12;
		@Pc(99) int local99 = (local59 + 1 >> 1) + arg12;
		@Pc(103) Class146 local103 = Static346.aClass146Array2[arg3];
		@Pc(127) int local127 = local103.I(local76, local91) + local103.I(local85, local91) + local103.I(local76, local99) + local103.I(local85, local99) >> 2;
		@Pc(131) Class4_Sub13 local131 = new Class4_Sub13();
		local131.anInt2503 = arg5;
		local131.anInt2496 = arg4 + Static175.anInt3261;
		local131.anInt2502 = arg1;
		local131.anInt2489 = arg6;
		local131.anInt2495 = arg2;
		local131.anInt2499 = local18.aByte86;
		local131.anInt2492 = arg12;
		local131.anInt2487 = Static175.anInt3261 + arg8;
		@Pc(170) int local170;
		if (arg9 < arg10) {
			local170 = arg10;
			arg10 = arg9;
			arg9 = local170;
		}
		local131.anInt2500 = arg9 + arg2;
		local131.anInt2493 = arg2 + arg10;
		if (arg11 < arg7) {
			local170 = arg7;
			arg7 = arg11;
			arg11 = local170;
		}
		local131.anInt2505 = local127;
		local131.anInt2501 = arg12 + arg7;
		local131.anInt2498 = (local62 << 6) + (local131.anInt2495 << 7);
		local131.anInt2497 = arg12 + arg11;
		local131.anInt2491 = (local59 << 6) + (local131.anInt2492 << 7);
		Static214.aClass258_32.method5526(local131);
		local18.aClass4_Sub13_3 = local131;
	}
}
