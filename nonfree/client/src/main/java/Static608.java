import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!uj", name = "Mb", descriptor = "[I")
	public static int[] anIntArray846;

	@OriginalMember(owner = "client!uj", name = "Kb", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_197 = new Class180(85, -2);

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "(B)Lclient!ip;")
	public static Class132 method8651() {
		try {
			return (Class132) Class.forName("Class132_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
