import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!eh", name = "Ub", descriptor = "[Lclient!hd;")
	public static Class31[] aClass31Array3;

	@OriginalMember(owner = "client!eh", name = "zc", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_49;

	@OriginalMember(owner = "client!eh", name = "Sc", descriptor = "[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] aClass2_Sub4_Sub3_Sub4Array6;

	@OriginalMember(owner = "client!eh", name = "Fb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_946 = Static107.method1838("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!eh", name = "Lb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_947 = Static107.method1838("swe");

	@OriginalMember(owner = "client!eh", name = "Pb", descriptor = "I")
	public static int anInt1604 = 0;

	@OriginalMember(owner = "client!eh", name = "bc", descriptor = "Lclient!gg;")
	public static Class28 aClass28_948 = Static107.method1838("Freie Welt");

	@OriginalMember(owner = "client!eh", name = "oc", descriptor = "Lclient!gg;")
	private static Class28 aClass28_950 = Static107.method1838("Click to switch");

	@OriginalMember(owner = "client!eh", name = "ic", descriptor = "Lclient!gg;")
	public static Class28 aClass28_949 = aClass28_950;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V")
	public static void method1095() {
		aClass28_946 = null;
		aClass28_950 = null;
		aClass2_Sub4_Sub3_Sub4Array6 = null;
		aClass28_949 = null;
		aClass40_Sub1_49 = null;
		aClass31Array3 = null;
		aClass28_948 = null;
		aClass28_947 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class69 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class69(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static133.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static133.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub14(local14, arg1, arg2);
				}
			}
			Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass69_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class69(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static133.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static133.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub14(local14, arg1, arg2);
				}
			}
			Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass69_1 = local12;
		} else {
			@Pc(134) Class73 local134 = new Class73(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static133.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static133.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub14(local14, arg1, arg2);
				}
			}
			Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass73_1 = local134;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!jc;)Z")
	public static boolean method1098(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(12) byte[] local12 = arg1.method1784(arg0);
		if (local12 == null) {
			return false;
		} else {
			Static45.method876(local12);
			return true;
		}
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
	public static void method1099() {
		Static74.aClass14_101.method596();
		Static118.aClass14_204.method596();
		Static181.aClass14_208.method596();
	}
}
