import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "F")
	public static float aFloat159;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Z")
	public static boolean aBoolean353 = false;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_43 = new Class71();

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "[S")
	public static final short[] aShortArray97 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Z")
	public static boolean method4354() {
		if (aBoolean353) {
			try {
				if ((Boolean) Static562.method7815("showingVideoAd", Static370.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}
}
