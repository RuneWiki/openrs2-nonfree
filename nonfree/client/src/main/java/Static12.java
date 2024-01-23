import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Lclient!gd;")
	public static Class2_Sub3_Sub8 aClass2_Sub3_Sub8_1;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Lclient!ui;")
	public static Class103 aClass103_4 = new Class103(8);

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_45 = Static199.method3560("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "[I")
	public static int[] anIntArray44 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
	public static int[] anIntArray45 = new int[2];

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray11 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZB)V")
	public static void method225(@OriginalArg(0) boolean arg0) {
		Static11.aBoolean8 = arg0;
		Static112.aBoolean106 = !Static48.method633();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([IIIIII)V")
	public static void method226(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class26 local13 = local7.aClass26_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt804;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class18 local58 = local7.aClass18_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt424;
		@Pc(67) int local67 = local58.anInt423;
		@Pc(70) int local70 = local58.anInt422;
		@Pc(73) int local73 = local58.anInt421;
		@Pc(77) int[] local77 = Static79.anIntArrayArray19[local23];
		@Pc(81) int[] local81 = Static207.anIntArrayArray43[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class26 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class26(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static226.aClass2_Sub12ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static226.aClass2_Sub12ArrayArrayArray3[local14][arg1][arg2] = new Class2_Sub12(local14, arg1, arg2);
				}
			}
			Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2].aClass26_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class26(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static226.aClass2_Sub12ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static226.aClass2_Sub12ArrayArrayArray3[local14][arg1][arg2] = new Class2_Sub12(local14, arg1, arg2);
				}
			}
			Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2].aClass26_1 = local12;
		} else {
			@Pc(134) Class18 local134 = new Class18(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static226.aClass2_Sub12ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static226.aClass2_Sub12ArrayArrayArray3[local14][arg1][arg2] = new Class2_Sub12(local14, arg1, arg2);
				}
			}
			Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2].aClass18_1 = local134;
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public static void method229() {
		Static161.aClass2_Sub23_Sub1_5.method2155(1);
		for (@Pc(20) Class2_Sub11 local20 = (Class2_Sub11) aClass103_4.method3668(); local20 != null; local20 = (Class2_Sub11) aClass103_4.method3666()) {
			if (local20.anInt729 == 0) {
				Static209.method3065(local20, true);
			}
		}
		if (Static119.aClass64_9 != null) {
			Static70.method2259(Static119.aClass64_9);
			Static119.aClass64_9 = null;
		}
	}
}
