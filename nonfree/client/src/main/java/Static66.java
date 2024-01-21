import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public static int anInt1691;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!wd;")
	public static Class97 aClass97_7 = null;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
	public static int method1144(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}
}
