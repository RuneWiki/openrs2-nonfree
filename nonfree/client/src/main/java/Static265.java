import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString40 = "";

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!sga;Z)I")
	public static int method4406(@OriginalArg(0) Class306 arg0) {
		if (arg0 == Static438.aClass306_3) {
			return 9216;
		} else if (arg0 == Static637.aClass306_5) {
			return 34065;
		} else if (Static258.aClass306_1 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
