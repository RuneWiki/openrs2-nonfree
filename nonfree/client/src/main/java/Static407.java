import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
	public static int anInt6566;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "[I")
	public static final int[] anIntArray601 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_89 = new Class179(70, 3);

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
	public static int anInt6564 = -1;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
	public static int anInt6565 = 0;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
	public static int anInt6567 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static105.aClass149Array1 == null) {
			return;
		}
		@Pc(29) Class31_Sub2_Sub1 local29;
		@Pc(25) int local25;
		if (arg10 >= 0) {
			local25 = arg10 - 1;
			local29 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local25];
		} else {
			local25 = -arg10 - 1;
			if (local25 == Static102.anInt2165) {
				local29 = Static452.aClass31_Sub2_Sub1_Sub1_2;
			} else {
				local29 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local25];
			}
		}
		if (local29 == null) {
			return;
		}
		@Pc(55) Class129 local55 = Static349.aClass115_4.method2766(arg8);
		@Pc(69) int local69;
		@Pc(66) int local66;
		if (arg1 == 1 || arg1 == 3) {
			local66 = local55.anInt3517;
			local69 = local55.anInt3507;
		} else {
			local66 = local55.anInt3507;
			local69 = local55.anInt3517;
		}
		@Pc(84) int local84 = arg0 + (local69 >> 1);
		@Pc(92) int local92 = (local69 + 1 >> 1) + arg0;
		@Pc(98) int local98 = (local66 >> 1) + arg2;
		@Pc(107) int local107 = arg2 + (local66 + 1 >> 1);
		@Pc(111) Class149 local111 = Static105.aClass149Array1[arg5];
		@Pc(134) int local134 = local111.l(local84, local98) + local111.l(local92, local98) + local111.l(local84, local107) + local111.l(local92, local107) >> 2;
		@Pc(138) Class1_Sub28 local138 = new Class1_Sub28();
		local138.anInt4382 = arg0;
		local138.anInt4383 = Static378.anInt4244 + arg12;
		local138.anInt4397 = arg11 + Static378.anInt4244;
		local138.anInt4384 = arg2;
		local138.anInt4391 = arg8;
		local138.anInt4396 = local29.aByte100;
		@Pc(166) int local166;
		if (arg9 < arg7) {
			local166 = arg7;
			arg7 = arg9;
			arg9 = local166;
		}
		local138.anInt4381 = arg3;
		local138.anInt4390 = arg1;
		local138.anInt4387 = arg9 + arg0;
		if (arg4 > arg6) {
			local166 = arg4;
			arg4 = arg6;
			arg6 = local166;
		}
		local138.anInt4395 = arg7 + arg0;
		local138.anInt4389 = arg6 + arg2;
		local138.anInt4386 = local134;
		local138.anInt4392 = (local138.anInt4382 << 7) + (local69 << 6);
		local138.anInt4393 = (local66 << 6) + (local138.anInt4384 << 7);
		local138.anInt4394 = arg4 + arg2;
		Static401.aClass181_58.method4102(local138);
		local29.aClass1_Sub28_3 = local138;
	}
}
