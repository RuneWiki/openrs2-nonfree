import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static416 {

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
	public static int anInt5990;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_104 = new Class216(47, 8);

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_105 = new Class216(90, 15);

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Lclient!bk;")
	public static final Class4_Sub10 aClass4_Sub10_2 = new Class4_Sub10(0, -1);

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_106 = new Class216(5, 3);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V")
	public static void method5242(@OriginalArg(1) int arg0) {
		Static141.anInt2583 = arg0;
		Static306.anInt4811 = 2;
		Static395.method2777(Static1.aString83, Static1.aString83.equals(""), true, "");
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)Z")
	public static boolean method5244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static162.method2596(arg0)) {
			return true;
		} else {
			return !Static162.method2596(arg1);
		}
	}
}
