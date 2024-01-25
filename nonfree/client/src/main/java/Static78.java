import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static78 {

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Lclient!nf;")
	public static Class169 aClass169_1;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_19 = new Class212(42, 4);

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_20 = new Class212(57, 8);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIBII)V")
	public static void method1654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg2) {
			Static48.method1079(arg3, arg1, arg0, arg4);
		} else if (Static176.anInt3462 <= arg0 - arg4 && arg0 + arg4 <= Static418.anInt3023 && Static162.anInt1715 <= arg3 - arg2 && arg2 + arg3 <= Static55.anInt1319) {
			Static158.method2225(arg0, arg1, arg3, arg2, arg4);
		} else {
			Static225.method3838(arg1, arg3, arg0, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)Z")
	public static boolean method1655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
