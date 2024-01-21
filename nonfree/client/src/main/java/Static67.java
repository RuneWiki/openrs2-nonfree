import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lclient!sg;")
	public static Class77 aClass77_743 = Static146.method2172("leuchten3:");

	@OriginalMember(owner = "client!ic", name = "ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_744 = Static146.method2172("b12_full");

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
	public static void method1343() {
		aClass77_744 = null;
		aClass77_743 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
	public static boolean method1344(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
