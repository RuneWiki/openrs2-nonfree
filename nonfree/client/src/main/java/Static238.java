import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static238 {

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_59 = new Class71(28, 10);

	@OriginalMember(owner = "client!it", name = "n", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_60 = new Class71(5, -2);

	@OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZB)V")
	public static void method4376(@OriginalArg(0) boolean arg0) {
		if (Static378.aString72.length() == 0) {
			return;
		}
		Static481.method7139("--> " + Static378.aString72);
		Static120.method2685(false, arg0, Static378.aString72);
		Static378.aString72 = "";
		Static112.anInt2926 = 0;
		Static419.anInt7930 = 0;
	}
}
