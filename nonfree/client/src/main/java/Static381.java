import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static381 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!hh;")
	public static Class109 aClass109_12;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_28 = new Class12(106, 8);

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	public static int anInt436 = 0;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Z")
	public static boolean aBoolean28 = true;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_29 = new Class12(68, 8);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
	public static int method363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZI)V")
	public static void method368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static111.method1740(arg1)) {
			Static215.method3223(arg0, arg2, arg3, -1, Static276.aClass229ArrayArray1[arg1]);
		}
	}
}
