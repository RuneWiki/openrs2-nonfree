import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public static int anInt3766;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public static int anInt3775;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Lclient!wd;")
	public static Class160 method3561() {
		try {
			return (Class160) Class.forName("Class160_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
