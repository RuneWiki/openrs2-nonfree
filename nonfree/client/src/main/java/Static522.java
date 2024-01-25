import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "Lclient!qb;")
	public static Class282 aClass282_2;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "Lclient!wq;")
	public static Class394 aClass394_9 = null;

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "I")
	public static int anInt8721 = -1;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)Z")
	public static boolean method7358() {
		if (Static394.aBoolean491) {
			try {
				if ((Boolean) Static680.method2300("showingVideoAd", Static285.anApplet5)) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}
}
