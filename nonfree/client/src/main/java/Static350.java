import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	public static int anInt3654;

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
	public static int anInt3659;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
	public static int anInt3652 = 0;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)Z")
	public static boolean method2923() {
		if (Static364.aBoolean534) {
			try {
				Static456.method852("showVideoAd", Static66.aClass143_2.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}
}
