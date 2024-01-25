import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public static int anInt9376;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public static int anInt9380;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lclient!ms;")
	public static Class213 method7844() {
		try {
			return (Class213) Class.forName("Class213_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
