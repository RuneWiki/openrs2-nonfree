import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
	public static int anInt4466;

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
	public static int anInt4467;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)V")
	public static void method3940(@OriginalArg(0) boolean arg0) {
		if (Static141.aString19.length() == 0) {
			return;
		}
		Static410.method6501("--> " + Static141.aString19);
		Static601.method8395(arg0, Static141.aString19, false);
		Static577.anInt9502 = 0;
		Static141.aString19 = "";
		Static394.anInt7317 = 0;
	}
}
