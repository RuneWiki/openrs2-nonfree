import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static420 {

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
	public static int anInt7405;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method6469(@OriginalArg(1) String arg0) {
		return Static442.aHashtable7.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!da;)V")
	public static void method6470(@OriginalArg(0) Class63 arg0) {
		Static303.aClass63_13 = arg0;
	}
}
