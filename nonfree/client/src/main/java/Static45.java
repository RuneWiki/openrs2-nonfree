import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static45 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "F")
	public static float aFloat217;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!uh;")
	public static Class243 aClass243_4;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_185 = new Class81(3, 3);

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
	public static boolean aBoolean626 = true;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5674(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
	public static boolean method5679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static397.method5451(arg0, arg1) | (arg1 & 0x70000) != 0 || Static266.method3986(arg1, arg0);
	}
}
