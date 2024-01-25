import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_204 = new Class214(75, -2);

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "[S")
	public static final short[] aShortArray67 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
	public static int anInt5626 = 0;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "(I)Z")
	public static boolean method4379() {
		if (Static290.aBoolean384) {
			try {
				if ((Boolean) Static460.method3422("showingVideoAd", Static41.aClass124_2.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
