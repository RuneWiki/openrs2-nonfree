import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "Lclient!ek;")
	public static Class42 aClass42_103;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "[Lclient!tk;")
	public static Class170[] aClass170Array2;

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
	public static int anInt5646;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	public static int anInt5635 = 0;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString199 = " from your ignore list first.";

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
	public static void method4448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = Static287.anInt5651 * arg1 >> 8;
		if (local5 != 0 && arg2 != -1) {
			Static237.method3831(arg2, local5, Static277.aClass42_96);
			Static297.aBoolean384 = true;
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method4452(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 >= 10000000) {
			return "<col=00ff80>" + arg0 / 1000000 + Static226.aString208 + "</col>";
		} else {
			return "<col=ffffff>" + arg0 / 1000 + Static190.aString135 + "</col>";
		}
	}
}
