import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_159 = new Class211(82, 4);

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
	public static final int[] anIntArray637 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	public static int anInt7195 = 0;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public static int anInt7196 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Z")
	public static boolean method5658() {
		if (Static359.aBoolean442) {
			try {
				if ((Boolean) Static469.method4194("showingVideoAd", Static79.aClass183_2.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}
}
