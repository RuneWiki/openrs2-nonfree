import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!qf", name = "kb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_945 = Static181.method2795("yellow:");

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "Lclient!qe;")
	public static Class83 aClass83_940 = aClass83_945;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "Lclient!s;")
	public static final Class86 aClass86_45 = new Class86(64);

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
	public static int anInt3192 = 0;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_941 = aClass83_945;

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
	public static int anInt3205 = 1;

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_943 = Static181.method2795("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_944 = Static181.method2795("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!qf", name = "nb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_946 = Static181.method2795("<)4col>");

	@OriginalMember(owner = "client!qf", name = "sb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_947 = aClass83_943;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZII)I")
	public static int method2441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub22 local12 = (Class2_Sub22) Static135.aClass63_10.method2110((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local12.anIntArray306.length; local26++) {
				if (arg1 == local12.anIntArray307[local26]) {
					local24 += local12.anIntArray306[local26];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZ[B)Z")
	public static boolean method2443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg2);
		@Pc(12) int local12 = -1;
		@Pc(14) boolean local14 = true;
		label68: while (true) {
			@Pc(18) int local18 = local10.method230();
			if (local18 == 0) {
				return local14;
			}
			local12 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(61) int local61;
				@Pc(86) Class2_Sub2_Sub20 local86;
				do {
					@Pc(65) int local65;
					@Pc(70) int local70;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local10.method232();
										if (local37 == 0) {
											continue label68;
										}
										local10.method260();
									}
									local37 = local10.method232();
									if (local37 == 0) {
										continue label68;
									}
									local29 += local37 - 1;
									@Pc(49) int local49 = local29 & 0x3F;
									@Pc(55) int local55 = local29 >> 6 & 0x3F;
									local61 = local10.method260() >> 2;
									local65 = arg1 + local55;
									local70 = local49 + arg0;
								} while (local65 <= 0);
							} while (local70 <= 0);
						} while (local65 >= 103);
					} while (local70 >= 103);
					local86 = Static99.method1689(local12);
				} while (local61 == 22 && aBoolean148 && local86.anInt2658 == 0 && local86.anInt2671 != 1 && !local86.aBoolean131);
				local31 = true;
				if (!local86.method2046()) {
					local14 = false;
					Static82.anInt1838++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	public static void method2446(@OriginalArg(1) int arg0) {
		Static62.anInt1512 = arg0;
		Static121.anInt2748 = -1;
		Static121.anInt2748 = -1;
		Static140.method2273();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lclient!ej;")
	public static Class2_Sub2_Sub8 method2448(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub8 local15 = (Class2_Sub2_Sub8) Static104.aClass86_30.method2643((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static132.aClass28_135.method852(Static30.method645(arg0), Static114.method2018(arg0));
		local15 = new Class2_Sub2_Sub8();
		local15.anInt1238 = arg0;
		if (local29 != null) {
			local15.method954(new Class2_Sub3(local29));
		}
		Static104.aClass86_30.method2647(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method2453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class81 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class81(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static203.aClass2_Sub23ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static203.aClass2_Sub23ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub23(local14, arg1, arg2);
				}
			}
			Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass81_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class81(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static203.aClass2_Sub23ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static203.aClass2_Sub23ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub23(local14, arg1, arg2);
				}
			}
			Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass81_1 = local12;
		} else {
			@Pc(134) Class36 local134 = new Class36(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static203.aClass2_Sub23ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static203.aClass2_Sub23ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub23(local14, arg1, arg2);
				}
			}
			Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass36_1 = local134;
		}
	}
}
