import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!st;")
	public static final Class314 aClass314_48 = new Class314(44, 0);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ef;I)I")
	public static int method2578(@OriginalArg(0) Class88 arg0) {
		if (Static443.aClass88_3 == arg0) {
			return 7681;
		} else if (Static131.aClass88_1 == arg0) {
			return 8448;
		} else if (arg0 == Static603.aClass88_5) {
			return 34165;
		} else if (arg0 == Static418.aClass88_2) {
			return 260;
		} else if (arg0 == Static457.aClass88_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
