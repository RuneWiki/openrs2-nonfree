import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!sc;")
	private static Class107 aClass107_516 = Static231.method3737("Hidden");

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!vb;")
	public static Class120 aClass120_9 = new Class120();

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "Lclient!sc;")
	private static Class107 aClass107_517 = Static231.method3737("Players");

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_518 = aClass107_517;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_519 = aClass107_516;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
	public static int anInt1781 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public static void method1386() {
		Static61.aClass61_22.method1689();
		Static184.aClass61_71.method1689();
		Static122.aClass61_51.method1689();
		Static85.aClass61_29.method1689();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)I")
	public static int method1388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
