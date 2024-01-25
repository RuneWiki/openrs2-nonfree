import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array20;

	@OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
	public static int anInt9329;

	@OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
	public static int anInt9331 = 0;

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_107 = new Class208(29, -1);

	@OriginalMember(owner = "client!tw", name = "A", descriptor = "Z")
	public static boolean aBoolean696 = true;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)Z")
	public static boolean method7607() {
		if (Static144.aBoolean206) {
			try {
				Static597.method645(Static433.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}
}
