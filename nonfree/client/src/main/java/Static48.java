import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "Lclient!f;")
	public static Class76 aClass76_5;

	@OriginalMember(owner = "client!ce", name = "I", descriptor = "Lclient!pc;")
	public static Class188 aClass188_23;

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "Lclient!gn;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_11 = new Class265();

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_3 = new Class180(9, 7);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public static void method940(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static275.anInt7554 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Z")
	public static boolean method941(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZIIIIII)Z")
	public static boolean method944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg2 + arg3 && arg6 + arg5 > arg3) {
			return arg7 < arg1 + arg4 && arg0 + arg7 > arg4;
		} else {
			return false;
		}
	}
}
