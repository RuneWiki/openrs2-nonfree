import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
	public static final int anInt4315 = 1406;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZZ)V")
	public static void method3723(@OriginalArg(1) boolean arg0) {
		if (Static132.aString19.length() == 0) {
			return;
		}
		Static328.method4873("--> " + Static132.aString19);
		Static222.method3822(Static132.aString19, false, arg0);
		Static132.aString19 = "";
		Static20.anInt7224 = 0;
		Static18.anInt358 = 0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lclient!qn;")
	public static Class204 method3724() {
		try {
			return (Class204) Class.forName("Class204_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}
}
