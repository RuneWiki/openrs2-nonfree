import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Lclient!ag;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Lclient!sba;")
	public static Class25 method7825() {
		try {
			return (Class25) Class.forName("Class25_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
