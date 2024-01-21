import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "Lclient!ke;")
	public static Class2_Sub13_Sub1 aClass2_Sub13_Sub1_2 = new Class2_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!ib", name = "fb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_485 = Static38.method685("Cancel");

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_486 = aClass6_485;

	@OriginalMember(owner = "client!ib", name = "ib", descriptor = "Lclient!ai;")
	private static Class6 aClass6_488 = Static38.method685("Please enter your username)3");

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_487 = aClass6_488;

	@OriginalMember(owner = "client!ib", name = "jb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_489 = Static38.method685("");

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public static void method1058() {
		aClass6_485 = null;
		aClass6_487 = null;
		aClass6_488 = null;
		aClass6_489 = null;
		aClass6_486 = null;
		aClass2_Sub13_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Z")
	public static boolean method1059() {
		return Static65.anInt1613 == 0 ? Static89.aClass2_Sub10_Sub3_1.method2001() : true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)I")
	public static int method1061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}
}
