import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
	public static int anInt8450 = 0;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	public static int anInt8452 = -1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Lclient!la;")
	public static Class73 method7267() {
		try {
			return (Class73) Class.forName("Class73_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
