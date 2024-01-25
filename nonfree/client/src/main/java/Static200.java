import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public static int anInt3623 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)Lclient!rn;")
	public static Class48 method3027() {
		try {
			return (Class48) Class.forName("Class48_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
