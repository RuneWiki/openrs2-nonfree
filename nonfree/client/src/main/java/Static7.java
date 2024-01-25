import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!oo;")
	public static Class149 aClass149_1;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString7 = "Loading...";

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V")
	public static void method235(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static115.aBooleanArray17[arg0]) {
			return;
		}
		Static108.aClass11_48.method275(arg0);
		if (Static158.aClass72ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static158.aClass72ArrayArray1[arg0].length; local28++) {
			if (Static158.aClass72ArrayArray1[arg0][local28] != null) {
				if (Static158.aClass72ArrayArray1[arg0][local28].anInt1825 == 2) {
					local26 = false;
				} else {
					Static158.aClass72ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static158.aClass72ArrayArray1[arg0] = null;
		}
		Static115.aBooleanArray17[arg0] = false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method236(@OriginalArg(1) String arg0) {
		return Static68.method1266(arg0, 16);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method238() {
		Static275.aClass154_84.method4219();
	}
}
