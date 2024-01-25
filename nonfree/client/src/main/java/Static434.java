import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!oja", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!oja", name = "j", descriptor = "I")
	public static int anInt6851;

	@OriginalMember(owner = "client!oja", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)Z")
	public static boolean method6035() {
		if (Static278.aBoolean340) {
			try {
				Static684.method6376("showVideoAd", Static649.anApplet2);
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}
}
