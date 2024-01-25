import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!vh;")
	public static Class252 aClass252_1;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	public static final int anInt1748 = 1338;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public static int anInt1749 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Lclient!ik;")
	public static Class119 method1340() {
		try {
			return (Class119) Class.forName("Class119_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
