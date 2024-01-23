import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!mb;")
	public static Class70 aClass70_23;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt2193;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!mb;")
	public static Class70 aClass70_24;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "[Lclient!te;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array10;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
	public static int anInt2197;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!ia;")
	private static Class51 aClass51_739 = Static64.method1101("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_737 = aClass51_739;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!ie;")
	public static Class53 aClass53_17 = new Class53(64);

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public static int anInt2194 = 0;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_738 = Static64.method1101("<col=80ff00>");

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "Lclient!ia;")
	private static Class51 aClass51_741 = Static64.method1101("Loaded fonts");

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_740 = aClass51_741;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static160.anInt3454 <= arg0 && arg2 <= Static149.anInt3252 && Static225.anInt4729 <= arg5 && arg4 <= Static122.anInt2710) {
			Static134.method2402(arg5, arg4, arg6, arg2, arg1, arg0, arg3);
		} else {
			Static60.method1061(arg3, arg2, arg4, arg6, arg0, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIB)I")
	public static int method1681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}
}
