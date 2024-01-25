import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "Lclient!pga;")
	public static Class32 aClass32_7;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
	public static int anInt3399;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)Lclient!on;")
	public static Class155 method3037() {
		try {
			return (Class155) Class.forName("Class155_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}
}
