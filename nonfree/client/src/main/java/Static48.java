import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!n;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public static int anInt1023;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!hh;")
	public static Class50 aClass50_375 = Static186.method3527("cross");

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "[I")
	public static int[] anIntArray84 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_376 = Static186.method3527("leuchten2:");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	public static int method758() {
		if (Static150.aBoolean132) {
			return 0;
		} else if (Static79.method2552()) {
			return Static34.aBoolean18 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	public static int method759(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method760() {
		Static10.aClass84_9.method2585();
	}
}
