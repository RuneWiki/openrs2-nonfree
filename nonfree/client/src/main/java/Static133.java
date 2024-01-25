import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!rn;")
	public static final Class48 aClass48_1 = Static200.method3027();

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "J")
	public static volatile long aLong71 = 0L;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
	public static boolean method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!ht;BIIII)Lclient!cq;")
	public static Class13_Sub1_Sub1 method1909(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean172 || Static304.method4356(arg2) && Static304.method4356(arg3)) {
			return new Class13_Sub1_Sub1(arg0, 3553, arg1, arg4, arg2, arg3, true);
		} else if (arg0.aBoolean156) {
			return new Class13_Sub1_Sub1(arg0, 34037, arg1, arg4, arg2, arg3, true);
		} else {
			return new Class13_Sub1_Sub1(arg0, arg1, arg4, arg2, arg3, Static100.method1552(arg2), Static100.method1552(arg3), true);
		}
	}

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
	public static void method1912() {
		Static106.aBoolean110 = false;
		Static251.aClipboard1 = null;
		Static353.method4882();
	}
}
