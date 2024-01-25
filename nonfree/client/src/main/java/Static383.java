import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "J")
	public static long aLong10;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_3 = new Class349(55, -1);

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
	public static int anInt88 = 0;

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "Lclient!os;")
	public static final Class281 aClass281_2 = new Class281(9, 19);

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)Z")
	public static boolean method110() {
		if (Static396.aBoolean553) {
			try {
				if ((Boolean) Static736.method7134(Static214.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(27) Throwable local27) {
			}
		}
		return true;
	}
}
