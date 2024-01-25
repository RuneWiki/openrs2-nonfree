import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!uaa", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray75 = new int[6][];

	@OriginalMember(owner = "client!uaa", name = "F", descriptor = "F")
	public static float aFloat182 = 1.0F;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)Z")
	public static boolean method7054() {
		if (Static71.aBoolean84) {
			try {
				if ((Boolean) Static594.method6348("showingVideoAd", Static198.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(25) Throwable local25) {
			}
		}
		return true;
	}
}
