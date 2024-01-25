import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "[I")
	public static int[] anIntArray447;

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
	public static int anInt5212;

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "Z")
	public static boolean aBoolean384;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "Lclient!co;")
	public static final Class41 aClass41_60 = new Class41(64);

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "[I")
	public static final int[] anIntArray448 = new int[13];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ab;)V")
	public static void method4651(@OriginalArg(1) Class3 arg0) {
		if (arg0.anInt91 == 5 && arg0.anInt56 != -1) {
			Static215.method3851(Static383.aClass48_9, arg0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method4656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(26) Class1_Sub2_Sub1 local26;
		@Pc(15) int local15;
		if (arg1 < 0) {
			local15 = -arg1 - 1;
			if (Static93.anInt1976 == local15) {
				local26 = Static182.aClass1_Sub2_Sub1_Sub1_1;
			} else {
				local26 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local15];
			}
		} else {
			local15 = arg1 - 1;
			local26 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local15];
		}
		if (local26 == null) {
			return;
		}
		@Pc(52) Class47 local52 = Static230.aClass96_4.method2303(arg5);
		@Pc(63) int local63;
		@Pc(66) int local66;
		if (arg7 == 1 || arg7 == 3) {
			local63 = local52.anInt1241;
			local66 = local52.anInt1247;
		} else {
			local66 = local52.anInt1241;
			local63 = local52.anInt1247;
		}
		@Pc(80) int local80 = arg10 + (local63 >> 1);
		@Pc(89) int local89 = arg10 + (local63 + 1 >> 1);
		@Pc(95) int local95 = arg9 + (local66 >> 1);
		@Pc(103) int local103 = (local66 + 1 >> 1) + arg9;
		@Pc(107) Class149 local107 = Static128.aClass149Array1[arg6];
		@Pc(131) int local131 = local107.method5837(local80, local95) + local107.method5837(local89, local95) + local107.method5837(local80, local103) + local107.method5837(local89, local103) >> 2;
		@Pc(135) Class2_Sub25 local135 = new Class2_Sub25();
		local135.anInt3731 = arg10;
		local135.anInt3734 = Static339.anInt6265 + arg11;
		local135.anInt3746 = arg8 + Static339.anInt6265;
		local135.anInt3745 = arg9;
		local135.anInt3729 = arg5;
		local135.anInt3732 = arg4;
		local135.anInt3730 = arg7;
		local135.anInt3744 = local26.aByte73;
		@Pc(169) int local169;
		if (arg12 > arg0) {
			local169 = arg12;
			arg12 = arg0;
			arg0 = local169;
		}
		local135.anInt3741 = arg10 + arg12;
		local135.anInt3736 = arg0 + arg10;
		if (arg3 < arg2) {
			local169 = arg2;
			arg2 = arg3;
			arg3 = local169;
		}
		local135.anInt3747 = local63 * 64 + local135.anInt3731 * 128;
		local135.anInt3735 = arg9 + arg3;
		local135.anInt3728 = local131;
		local135.anInt3740 = local135.anInt3745 * 128 + local66 * 64;
		local135.anInt3743 = arg2 + arg9;
		Static209.aClass238_19.method5796(local135);
		local26.aClass2_Sub25_3 = local135;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
	public static void method4661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(13, arg1);
		local8.method1198();
		local8.anInt1465 = arg0;
	}
}
