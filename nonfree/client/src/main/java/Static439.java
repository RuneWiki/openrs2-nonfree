import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!ul;")
	public static final Class243 aClass243_3 = new Class243(128);

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Lclient!tj;")
	public static Class154 method356() {
		try {
			return (Class154) Class.forName("Class154_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
