import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	public static int anInt4728;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!ab;")
	public static Class3 aClass3_1 = new Class3();

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)Z")
	public static boolean method4108() {
		if (Static129.aBoolean209) {
			try {
				Static367.method3947(Static197.aClass215_5.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}
}
