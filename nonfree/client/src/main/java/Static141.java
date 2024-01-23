import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
	public static int anInt5830;

	@OriginalMember(owner = "client!jo", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray54;

	@OriginalMember(owner = "client!jo", name = "Q", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "[J")
	public static long[] aLongArray56 = new long[500];

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "Z")
	public static boolean aBoolean399 = true;

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "[I")
	public static int[] anIntArray653 = new int[4096];

	@OriginalMember(owner = "client!jo", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString353 = "yellow:";

	@OriginalMember(owner = "client!jo", name = "O", descriptor = "[I")
	public static int[] anIntArray654 = new int[14];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!pm;IBLclient!fd;)V")
	public static void method4726(@OriginalArg(0) Class139 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub10 arg2) {
		@Pc(9) Class4_Sub29 local9 = new Class4_Sub29();
		local9.anInt4858 = arg2.method4666();
		local9.anInt4859 = arg2.method4632();
		local9.anIntArray527 = new int[local9.anInt4858];
		local9.aByteArrayArrayArray19 = new byte[local9.anInt4858][][];
		local9.aClass185Array1 = new Class185[local9.anInt4858];
		local9.aClass185Array2 = new Class185[local9.anInt4858];
		local9.anIntArray529 = new int[local9.anInt4858];
		local9.anIntArray526 = new int[local9.anInt4858];
		for (@Pc(57) int local57 = 0; local57 < local9.anInt4858; local57++) {
			try {
				@Pc(69) int local69 = arg2.method4666();
				@Pc(88) String local88;
				@Pc(94) String local94;
				@Pc(90) int local90;
				if (local69 == 0 || local69 == 1 || local69 == 2) {
					local88 = arg2.method4630();
					local90 = 0;
					local94 = arg2.method4630();
					if (local69 == 1) {
						local90 = arg2.method4632();
					}
					local9.anIntArray527[local57] = local69;
					local9.anIntArray526[local57] = local90;
					local9.aClass185Array1[local57] = arg0.method3491(local94, Static266.method4193(local88));
				} else if (local69 == 3 || local69 == 4) {
					local88 = arg2.method4630();
					local94 = arg2.method4630();
					local90 = arg2.method4666();
					@Pc(148) String[] local148 = new String[local90];
					for (@Pc(150) int local150 = 0; local150 < local90; local150++) {
						local148[local150] = arg2.method4630();
					}
					@Pc(169) byte[][] local169 = new byte[local90][];
					@Pc(185) int local185;
					if (local69 == 3) {
						for (@Pc(174) int local174 = 0; local174 < local90; local174++) {
							local185 = arg2.method4632();
							local169[local174] = new byte[local185];
							arg2.method4649(local185, local169[local174]);
						}
					}
					@Pc(204) Class[] local204 = new Class[local90];
					local9.anIntArray527[local57] = local69;
					for (local185 = 0; local185 < local90; local185++) {
						local204[local185] = Static266.method4193(local148[local185]);
					}
					local9.aClass185Array2[local57] = arg0.method3502(local94, Static266.method4193(local88), local204);
					local9.aByteArrayArrayArray19[local57] = local169;
				}
			} catch (@Pc(244) ClassNotFoundException local244) {
				local9.anIntArray529[local57] = -1;
			} catch (@Pc(251) SecurityException local251) {
				local9.anIntArray529[local57] = -2;
			} catch (@Pc(258) NullPointerException local258) {
				local9.anIntArray529[local57] = -3;
			} catch (@Pc(265) Exception local265) {
				local9.anIntArray529[local57] = -4;
			} catch (@Pc(272) Throwable local272) {
				local9.anIntArray529[local57] = -5;
			}
		}
		Static243.aClass114_28.method2625(local9);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!vh;III)V")
	public static void method4727(@OriginalArg(0) int arg0, @OriginalArg(1) Class184 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class4_Sub11 local15 = (Class4_Sub11) Static11.aClass114_2.method2623(); local15 != null; local15 = (Class4_Sub11) Static11.aClass114_2.method2629()) {
			if (local15.anInt2126 == arg2 && local15.anInt2124 == arg3 * 128 && local15.anInt2113 == arg0 * 128 && arg1.anInt5554 == local15.aClass184_1.anInt5554) {
				if (local15.aClass4_Sub6_Sub4_3 != null) {
					Static211.aClass4_Sub6_Sub3_2.method2683(local15.aClass4_Sub6_Sub4_3);
					local15.aClass4_Sub6_Sub4_3 = null;
				}
				if (local15.aClass4_Sub6_Sub4_2 != null) {
					Static211.aClass4_Sub6_Sub3_2.method2683(local15.aClass4_Sub6_Sub4_2);
					local15.aClass4_Sub6_Sub4_2 = null;
				}
				local15.method4854();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	public static void method4729() {
		for (@Pc(8) Class4_Sub25 local8 = (Class4_Sub25) Static57.aClass114_7.method2623(); local8 != null; local8 = (Class4_Sub25) Static57.aClass114_7.method2629()) {
			if (local8.anInt4437 > 0) {
				local8.anInt4437--;
			}
			if (local8.anInt4437 != 0) {
				if (local8.anInt4447 > 0) {
					local8.anInt4447--;
				}
				if (local8.anInt4447 == 0 && local8.anInt4446 >= 1 && local8.anInt4442 >= 1 && local8.anInt4446 <= 102 && local8.anInt4442 <= 102 && (local8.anInt4436 < 0 || Static273.method1547(local8.anInt4436, local8.anInt4443))) {
					Static47.method736(local8.anInt4439, local8.anInt4434, local8.anInt4442, local8.anInt4438, local8.anInt4436, local8.anInt4446, local8.anInt4443);
					local8.anInt4447 = -1;
					if (local8.anInt4436 == local8.anInt4440 && local8.anInt4440 == -1) {
						local8.method4854();
					} else if (local8.anInt4436 == local8.anInt4440 && local8.anInt4434 == local8.anInt4445 && local8.anInt4443 == local8.anInt4444) {
						local8.method4854();
					}
				}
			} else if (local8.anInt4440 < 0 || Static273.method1547(local8.anInt4440, local8.anInt4444)) {
				Static47.method736(local8.anInt4439, local8.anInt4445, local8.anInt4442, local8.anInt4438, local8.anInt4440, local8.anInt4446, local8.anInt4444);
				local8.method4854();
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static48.anInt902 <= arg8 && arg8 <= Static131.anInt2553 && Static48.anInt902 <= arg0 && Static131.anInt2553 >= arg0 && Static48.anInt902 <= arg3 && Static131.anInt2553 >= arg3 && Static48.anInt902 <= arg4 && arg4 <= Static131.anInt2553 && arg5 >= Static156.anInt3086 && arg5 <= Static218.anInt4231 && arg1 >= Static156.anInt3086 && Static218.anInt4231 >= arg1 && arg7 >= Static156.anInt3086 && Static218.anInt4231 >= arg7 && Static156.anInt3086 <= arg6 && Static218.anInt4231 >= arg6) {
			Static20.method283(arg6, arg7, arg5, arg2, arg0, arg3, arg4, arg1, arg8);
		} else {
			Static238.method3699(arg8, arg7, arg4, arg0, arg1, arg5, arg6, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class145 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class145(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static6.aClass4_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static6.aClass4_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub19(local14, arg1, arg2);
				}
			}
			Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass145_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class145(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static6.aClass4_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static6.aClass4_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub19(local14, arg1, arg2);
				}
			}
			Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass145_1 = local12;
		} else {
			@Pc(134) Class169 local134 = new Class169(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static6.aClass4_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static6.aClass4_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub19(local14, arg1, arg2);
				}
			}
			Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass169_1 = local134;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IIIIII)V")
	public static void method4738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static3.method9(Static156.anInt3086, arg2, Static218.anInt4231);
		@Pc(17) int local17 = Static3.method9(Static156.anInt3086, arg4, Static218.anInt4231);
		@Pc(23) int local23 = Static3.method9(Static48.anInt902, arg0, Static131.anInt2553);
		@Pc(29) int local29 = Static3.method9(Static48.anInt902, arg1, Static131.anInt2553);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static99.method1656(Static220.anIntArrayArray36[local31], arg3, local23, local29);
		}
	}
}
