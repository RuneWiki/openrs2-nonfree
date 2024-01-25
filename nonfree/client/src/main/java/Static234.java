import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static234 {

	@OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
	public static int anInt4181;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_27 = new Class102(4);

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	public static int anInt4174 = 0;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
	public static int anInt4178 = 1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
	public static void method3370(@OriginalArg(0) boolean arg0) {
		if (Static335.aString64.length() == 0) {
			return;
		}
		Static324.method4374("--> " + Static335.aString64);
		Static200.method2833(arg0, Static335.aString64, false);
		Static38.anInt681 = 0;
		Static335.aString64 = "";
		Static373.anInt6278 = 0;
	}
}
