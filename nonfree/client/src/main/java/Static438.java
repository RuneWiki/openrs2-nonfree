import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_135 = new Class36(30, 4);

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "J")
	public static long aLong215 = 0L;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Z")
	public static boolean method5655() {
		if (Static197.aBoolean435) {
			try {
				Static459.method3567(Static89.aClass114_3.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}
}
