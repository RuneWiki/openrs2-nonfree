import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static79 {

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
	public static int anInt1713;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
	public static int anInt1714;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_58 = new Class92(40, 6);

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBIIIIIII)Z")
	public static boolean method1399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg2 + arg0 && arg0 < arg5 + arg4) {
			return arg1 + arg3 > arg7 && arg1 < arg6 + arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
	public static boolean method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(II)I")
	public static int method1407(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
