import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static480 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!ufa;")
	public static Class326 aClass326_3;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt8971;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "I")
	public static int anInt8972;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
	public static int method7346(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
	public static boolean method7350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static89.method2060(arg1, arg0) & (Static196.method3327(arg1, arg0) | (arg0 & 0x2000) != 0 | Static265.method4659(arg1, arg0));
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Z")
	public static boolean method7351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
