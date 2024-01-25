import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "D")
	public static double aDouble14;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_97 = new Class71(59, -2);

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_98 = new Class71(82, 5);

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lclient!nr;")
	public static Class109 method6348() {
		try {
			return new Class109_Sub1();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class109) Class.forName("Class109_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class109_Sub2();
			}
		}
	}
}
