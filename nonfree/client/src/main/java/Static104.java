import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public static int anInt2338;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "[Lclient!em;")
	public static Class46[] aClass46Array2;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString135 = "Select";

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class163 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class163(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static7.aClass1_Sub2ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static7.aClass1_Sub2ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub2(local14, arg1, arg2);
				}
			}
			Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass163_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class163(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static7.aClass1_Sub2ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static7.aClass1_Sub2ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub2(local14, arg1, arg2);
				}
			}
			Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass163_1 = local12;
		} else {
			@Pc(134) Class73 local134 = new Class73(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static7.aClass1_Sub2ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static7.aClass1_Sub2ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub2(local14, arg1, arg2);
				}
			}
			Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass73_1 = local134;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static37.anInt930 + arg0 * Static58.anInt1267 >> 16;
		@Pc(19) int local19 = arg3 * Static58.anInt1267 - arg0 * Static37.anInt930 >> 16;
		@Pc(29) int local29 = arg1 * Static79.anInt1828 + local19 * Static282.anInt5661 >> 16;
		@Pc(39) int local39 = arg1 * Static282.anInt5661 - local19 * Static79.anInt1828 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static79.anInt1828 + local19 * Static282.anInt5661 >> 16;
		@Pc(76) int local76 = arg2 * Static282.anInt5661 - local19 * Static79.anInt1828 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static57.anInt6308 && local87 < Static57.anInt6308) {
			return false;
		} else if (local50 > Static221.anInt4698 && local87 > Static221.anInt4698) {
			return false;
		} else if (local56 < Static280.anInt5623 && local93 < Static280.anInt5623) {
			return false;
		} else {
			return local56 <= Static221.anInt4693 || local93 <= Static221.anInt4693;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!qm;I)Lclient!co;")
	public static Class31_Sub1 method1729(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class31_Sub1(arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2215(), arg0.method2215(), arg0.method2199());
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public static void method1733() {
		Static151.aClass89_19.method2265();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BC)C")
	public static char method1734(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1735(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < local4; local18++) {
			local10 = arg0.charAt(local18) + (local10 << 5) - local10;
		}
		return local10;
	}
}
