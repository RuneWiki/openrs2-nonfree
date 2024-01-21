import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static165 {

	@OriginalMember(owner = "client!uf", name = "jb", descriptor = "Lclient!gd;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!uf", name = "lb", descriptor = "J")
	public static long aLong129;

	@OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
	public static int anInt4050 = -1;

	@OriginalMember(owner = "client!uf", name = "ab", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1544 = Static169.method2903("Loading config )2 ");

	@OriginalMember(owner = "client!uf", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1545 = Static169.method2903("Benutzername: ");

	@OriginalMember(owner = "client!uf", name = "fb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1546 = aClass23_1544;

	@OriginalMember(owner = "client!uf", name = "gb", descriptor = "I")
	public static int anInt4054 = 0;

	@OriginalMember(owner = "client!uf", name = "kb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1547 = Static169.method2903("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(III)I")
	public static int method2852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
	public static void method2853() {
		aClass31_1 = null;
		aClass23_1546 = null;
		aClass23_1544 = null;
		aClass23_1547 = null;
		aClass23_1545 = null;
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
	public static void method2854() {
		Static164.aClass79_26.method2659();
	}
}
