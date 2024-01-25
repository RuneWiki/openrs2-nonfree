import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
	public static int anInt2526;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString65 = null;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString66 = null;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method2409() {
		if (Static319.anInt5968 <= 0) {
			Static118.aString57 = "";
			return;
		}
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static277.aStringArray27.length; local10++) {
			if (Static277.aStringArray27[local10].startsWith("--> ")) {
				local8++;
				if (local8 == Static319.anInt5968) {
					Static118.aString57 = Static277.aStringArray27[local10].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIZIII)V")
	public static void method2411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static7.anInt8119 && arg1 <= Static34.anInt603 && Static328.anInt6154 <= arg4 && arg5 <= Static394.anInt7462) {
			Static24.method581(arg2, arg3, arg5, arg4, arg1, arg0, arg6);
		} else {
			Static64.method1169(arg0, arg3, arg4, arg6, arg1, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public static void method2412() {
		if (Static482.anInt8574 != 3 && Static534.aClass163_7.anInt4593 != -1) {
			Static528.method7626(Static534.aClass163_7.anInt4593, Static534.aClass163_7.aString104);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)I")
	public static int method2413(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(15) int local15 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
