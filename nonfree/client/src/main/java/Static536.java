import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!td;")
	public static Class3_Sub5_Sub18 aClass3_Sub5_Sub18_8;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Z")
	public static boolean method7453() {
		if (Static158.aBoolean218) {
			try {
				if ((Boolean) Static680.method795(Static339.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(25) Throwable local25) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method7459() {
		Static565.aClass295_59.method6464();
	}
}
