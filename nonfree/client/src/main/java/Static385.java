import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!dn;")
	public static Class56 aClass56_78;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
	public static int anInt6686;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_18 = new Class119(9, 0, 4, 1);

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_223 = new Class92(22, 7);

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_247 = new Class184(94, -1);

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_248 = new Class184(57, 12);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Z")
	public static boolean method5259() {
		if (Static260.aBoolean490) {
			try {
				if ((Boolean) Static462.method4867(Static295.aClass103_5.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
