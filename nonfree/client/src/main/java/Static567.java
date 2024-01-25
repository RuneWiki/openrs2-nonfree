import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static567 {

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!ik;")
	public static Class182 aClass182_109;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
	public static void method7365(@OriginalArg(0) boolean arg0) {
		if (Static689.aString129.length() == 0) {
			return;
		}
		Static369.method5071("--> " + Static689.aString129);
		Static382.method1852(arg0, Static689.aString129, false);
		Static77.anInt1736 = 0;
		if (!arg0) {
			Static689.aString129 = "";
			Static685.anInt6069 = 0;
		}
	}
}
