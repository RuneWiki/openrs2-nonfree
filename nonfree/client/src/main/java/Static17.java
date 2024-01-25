import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static17 {

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "J")
	public static long aLong19;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
	public static int anInt360 = 0;

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
	public static int anInt362 = 0;

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "Lclient!eb;")
	public static Class58 aClass58_1 = new Class58(8);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
	public static void method351() {
		Static164.aClass154_59.method4212();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)I")
	public static int method353(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBZ)Ljava/lang/String;")
	public static String method355(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static87.method1558(arg0);
	}
}
