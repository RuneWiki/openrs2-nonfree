import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static515 {

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
	public static int anInt8986;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "[I")
	public static int[] anIntArray467 = new int[2];

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZZ)V")
	public static void method7371(@OriginalArg(0) boolean arg0) {
		if (Static91.aString16.length() == 0) {
			return;
		}
		Static552.method7749("--> " + Static91.aString16);
		Static131.method2668(Static91.aString16, arg0, false);
		Static91.aString16 = "";
		Static266.anInt5702 = 0;
		Static364.anInt7027 = 0;
	}
}
