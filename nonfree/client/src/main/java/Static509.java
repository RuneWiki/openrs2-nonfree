import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!saa", name = "z", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!saa", name = "C", descriptor = "Lclient!uu;")
	public static Class343 aClass343_220;

	@OriginalMember(owner = "client!saa", name = "q", descriptor = "Lclient!st;")
	public static final Class314 aClass314_116 = new Class314(18, -1);

	@OriginalMember(owner = "client!saa", name = "B", descriptor = "F")
	public static float aFloat152 = 1024.0F;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "(B)Lclient!is;")
	public static Class166 method6929() {
		try {
			return (Class166) Class.forName("Class166_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class166_Sub2();
		}
	}
}
