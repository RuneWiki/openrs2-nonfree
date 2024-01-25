import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static208 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_189 = new Class305(109, 4);

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_190 = new Class305(105, 12);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZLclient!di;)Z")
	public static boolean method3828(@OriginalArg(1) Class65 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean157) {
			return false;
		} else if (!arg0.method1818(Static335.anInterface19_2)) {
			return false;
		} else if (Static344.aClass230_36.method6144((long) arg0.anInt1916) == null) {
			return Static169.aClass230_21.method6144((long) arg0.anInt1915) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public static void method3831() {
		Static446.anImage2 = null;
		Static164.aFont1 = null;
	}
}
