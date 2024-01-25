import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Z")
	public static boolean aBoolean461;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	public static int anInt6265 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Lclient!dia;")
	public static Class70 method5406() {
		try {
			return (Class70) Class.forName("Class70_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}
}
