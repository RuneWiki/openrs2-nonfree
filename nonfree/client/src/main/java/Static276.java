import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static276 {

	@OriginalMember(owner = "client!nu", name = "P", descriptor = "Lclient!dn;")
	public static Class56 aClass56_67;

	@OriginalMember(owner = "client!nu", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString52 = null;

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(III)Z")
	public static boolean method4120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZII)Z")
	public static boolean method4121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static414.method5561(arg1, arg0) | (arg1 & 0x40000) != 0 || Static64.method1273(arg0, arg1);
	}
}
