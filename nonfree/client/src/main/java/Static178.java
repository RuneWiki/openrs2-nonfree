import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static178 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!dj;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_29 = new Class305(16, 8);

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[200];

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString23 = "";

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIB)V")
	public static void method2991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static409.aClass98_3 == Static218.aClass98_2) {
			if (Static274.method4253(arg1, 0, arg0, 1, -2, 0, 1, false)) {
				return;
			}
			Static274.method4253(arg1, 0, arg0, 1, -3, 0, 1, false);
		} else if (Static274.method4253(arg1, 0, arg0, 1, -3, 0, 1, false)) {
			return;
		} else {
			Static274.method4253(arg1, 0, arg0, 1, -2, 0, 1, false);
		}
	}
}
