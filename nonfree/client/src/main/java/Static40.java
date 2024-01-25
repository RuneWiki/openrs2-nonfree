import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public static int anInt1169;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "I")
	public static int anInt1172;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	public static int anInt1173 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZII)V")
	public static void method957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1012) {
			Static166.method2753(Static61.aClass198_2, arg2, arg0);
		} else if (arg1 == 1008) {
			Static166.method2753(Static127.aClass198_3, arg2, arg0);
		} else if (arg1 == 1001) {
			Static166.method2753(Static401.aClass198_7, arg2, arg0);
		} else if (arg1 == 1003) {
			Static166.method2753(Static26.aClass198_1, arg2, arg0);
		} else if (arg1 == 1006) {
			Static166.method2753(Static232.aClass198_4, arg2, arg0);
			return;
		}
	}
}
