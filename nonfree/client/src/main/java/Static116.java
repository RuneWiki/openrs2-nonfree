import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!jf;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt2236 = 0;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
	public static final int[] anIntArray154 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Z")
	public static boolean method2146() {
		if (Static278.aBoolean340) {
			try {
				if ((Boolean) Static684.method6376("showingVideoAd", Static649.anApplet2)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}
}
