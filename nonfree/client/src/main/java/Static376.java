import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_90 = new Class208(17, -1);

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_160 = new Class25(26, 2);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)Z")
	public static boolean method5235() {
		if (Static303.aBoolean325) {
			try {
				Static471.method4356(Static138.aClass194_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}
}
