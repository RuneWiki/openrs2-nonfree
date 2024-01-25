import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_136 = new Class216(73, -1);

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	public static int anInt8609 = -1;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Z")
	public static boolean aBoolean671 = false;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!qq;B)V")
	public static void method7421(@OriginalArg(1) Class4_Sub3_Sub4 arg0) {
		Static638.aClass64_4.method2207(arg0);
		Static422.method5868(Static42.aClass34_6, arg0, Static638.aClass64_4, Static172.aClass34_44, Static400.aClass34_84);
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
	public static void method7423() {
		Static514.aClass199Array2 = null;
		if (Static423.aBoolean517 && Static324.method4462() != 1) {
			Static663.method8788(0, 0, Static391.method5050(), Static593.method7796(), Static656.anInt10356 == 3 || Static656.anInt10356 == 7);
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		if (Static423.aBoolean517) {
			local44 = Static383.method8455();
			local46 = Static286.method4120();
		}
		Static539.method7217(local44 + Static632.anInt9867, local46, local44, local44, -1, Static357.anInt5421 + local46, Static77.anInt1630, local46);
		if (Static514.aClass199Array2 != null) {
			Static470.method6502(Static389.aClass199_10.anInt5001, Static514.aClass199Array2, local44 + Static632.anInt9867, Static357.anInt5421 + local46, Static453.anInt7323, local44, -1412584499, true, local46, Static489.anInt7678);
			Static514.aClass199Array2 = null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[IBII)V")
	public static void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(7) int local7 = arg2 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg3) {
			@Pc(15) int local15 = arg3 + 1;
			arg1[local15] = arg0;
			@Pc(20) int local20 = local15 + 1;
			arg1[local20] = arg0;
			@Pc(25) int local25 = local20 + 1;
			arg1[local25] = arg0;
			@Pc(30) int local30 = local25 + 1;
			arg1[local30] = arg0;
			@Pc(35) int local35 = local30 + 1;
			arg1[local35] = arg0;
			@Pc(40) int local40 = local35 + 1;
			arg1[local40] = arg0;
			@Pc(45) int local45 = local40 + 1;
			arg1[local45] = arg0;
			arg3 = local45 + 1;
			arg1[arg3] = arg0;
		}
		while (arg3 < local7) {
			arg3++;
			arg1[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIIIIIII)V")
	public static void method7425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static385.method4989(Static73.anInt1542, arg5, Static527.anInt8177);
		@Pc(17) int local17 = Static385.method4989(Static73.anInt1542, arg3, Static527.anInt8177);
		@Pc(23) int local23 = Static385.method4989(Static472.anInt7503, arg1, Static257.anInt4172);
		@Pc(29) int local29 = Static385.method4989(Static472.anInt7503, arg2, Static257.anInt4172);
		@Pc(37) int local37 = Static385.method4989(Static73.anInt1542, arg5 + arg0, Static527.anInt8177);
		@Pc(45) int local45 = Static385.method4989(Static73.anInt1542, arg3 - arg0, Static527.anInt8177);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			method7424(arg4, Static172.anIntArrayArray17[local47], local29, local23);
		}
		for (@Pc(67) int local67 = local17; local67 > local45; local67--) {
			method7424(arg4, Static172.anIntArrayArray17[local67], local29, local23);
		}
		@Pc(93) int local93 = Static385.method4989(Static472.anInt7503, arg1 + arg0, Static257.anInt4172);
		@Pc(101) int local101 = Static385.method4989(Static472.anInt7503, arg2 - arg0, Static257.anInt4172);
		for (@Pc(107) int local107 = local37; local107 <= local45; local107++) {
			@Pc(113) int[] local113 = Static172.anIntArrayArray17[local107];
			method7424(arg4, local113, local93, local23);
			method7424(arg6, local113, local101, local93);
			method7424(arg4, local113, local29, local101);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!tf;ILclient!aa;BIILclient!kq;)V")
	public static void method7427(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class199 arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static259.anInt4200 == 4) {
			local14 = (int) Static642.aFloat230 & 0x3FFF;
		} else {
			local14 = Static354.anInt5391 + (int) Static642.aFloat230 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg6.anInt5035 / 2, arg6.anInt4994 / 2) + 10;
		@Pc(56) int local56 = arg2 * arg2 + arg0 * arg0;
		if (local56 > local35 * local35) {
			return;
		}
		@Pc(70) int local70 = Class4_Sub2_Sub26.anIntArray563[local14];
		@Pc(74) int local74 = Class4_Sub2_Sub26.anIntArray562[local14];
		if (Static259.anInt4200 != 4) {
			local74 = local74 * 256 / (Static338.anInt5228 + 256);
			local70 = local70 * 256 / (Static338.anInt5228 + 256);
		}
		@Pc(105) int local105 = arg2 * local74 + local70 * arg0 >> 14;
		@Pc(116) int local116 = arg0 * local74 - local70 * arg2 >> 14;
		arg1.method5264(local105 + arg5 + arg6.anInt5035 / 2 - arg1.method5256() / 2, -local116 + (arg4 - (-(arg6.anInt4994 / 2) - -(arg1.method5251() / 2))), arg3, arg5, arg4);
	}
}
