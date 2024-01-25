import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static570 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!gda;")
	public static Class126 aClass126_258;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public static int anInt8952 = 0;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_237 = new Class381(73, 3);

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString102 = null;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 < arg6 + arg7 && arg0 + arg2 > arg6) {
			return arg5 + arg1 > arg4 && arg4 + arg3 > arg5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)[Lclient!mp;")
	public static Class242[] method7684() {
		return new Class242[] { Static387.aClass242_8, Static45.aClass242_1, Static161.aClass242_4, Static581.aClass242_10, Static478.aClass242_9, Static117.aClass242_2, Static157.aClass242_3 };
	}
}
