import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!am", name = "g", descriptor = "Lclient!pq;")
	public static Class251 aClass251_139;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "[S")
	public static short[] aShortArray136 = new short[256];

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public static int anInt8428 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIIBIIIII)V")
	public static void method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static285.aClass60Array8 == null) {
			return;
		}
		@Pc(12) Class29_Sub2_Sub1 local12 = null;
		@Pc(21) int local21;
		if (arg10 >= 0) {
			local21 = arg10 - 1;
			@Pc(28) Class6_Sub28 local28 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local21);
			if (local28 != null) {
				local12 = local28.aClass29_Sub2_Sub1_Sub1_2;
			}
		} else {
			local21 = -arg10 - 1;
			if (Static44.anInt711 == local21) {
				local12 = Static426.aClass29_Sub2_Sub1_Sub2_2;
			} else {
				local12 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local21];
			}
		}
		if (local12 == null) {
			return;
		}
		@Pc(61) Class313 local61 = Static260.aClass100_1.method2008(arg1);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (arg11 == 1 || arg11 == 3) {
			local75 = local61.anInt8478;
			local72 = local61.anInt8463;
		} else {
			local72 = local61.anInt8478;
			local75 = local61.anInt8463;
		}
		@Pc(89) int local89 = arg3 + (local72 >> 1);
		@Pc(98) int local98 = arg3 + (local72 + 1 >> 1);
		@Pc(105) int local105 = arg12 + (local75 >> 1);
		@Pc(113) int local113 = (local75 + 1 >> 1) + arg12;
		@Pc(117) Class60 local117 = Static285.aClass60Array8[arg4];
		@Pc(142) int local142 = local117.JA(local89, local105) + local117.JA(local98, local105) + local117.JA(local89, local113) + local117.JA(local98, local113) >> 2;
		@Pc(146) Class6_Sub4 local146 = new Class6_Sub4();
		local146.anInt527 = arg3;
		local146.anInt513 = local12.aByte103;
		local146.anInt511 = arg1;
		local146.anInt522 = arg12;
		@Pc(168) int local168;
		if (arg2 > arg5) {
			local168 = arg2;
			arg2 = arg5;
			arg5 = local168;
		}
		local146.anInt521 = arg0 + Static358.anInt6263;
		local146.anInt519 = Static358.anInt6263 + arg7;
		local146.anInt526 = arg11;
		local146.anInt515 = arg8;
		local146.anInt525 = arg3 + arg5;
		if (arg9 < arg6) {
			local168 = arg6;
			arg6 = arg9;
			arg9 = local168;
		}
		local146.anInt520 = arg2 + arg3;
		local146.anInt512 = arg9 + arg12;
		local146.anInt516 = (local146.anInt527 << 9) + (local72 << 8);
		local146.anInt517 = local142;
		local146.anInt523 = arg6 + arg12;
		local146.anInt518 = (local146.anInt522 << 9) + (local75 << 8);
		Static466.aClass275_168.method6370(local146);
		local12.aClass6_Sub4_3 = local146;
	}
}
