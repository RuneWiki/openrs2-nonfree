import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "[Lclient!uq;")
	public static Class9_Sub2[] aClass9_Sub2Array6;

	@OriginalMember(owner = "client!qha", name = "k", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_13 = new Class178(6, 0, 4, 2);

	@OriginalMember(owner = "client!qha", name = "n", descriptor = "Lclient!st;")
	public static final Class314 aClass314_113 = new Class314(67, 8);

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Lclient!sw;")
	public static Class50 method6847() {
		try {
			return (Class50) Class.forName("Class50_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
