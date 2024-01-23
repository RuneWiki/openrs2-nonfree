import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static295 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!kb;")
	public static Class83 aClass83_101;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	public static int anInt3204;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "J")
	public static long aLong114;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString89 = "glow3:";

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString90 = "flash2:";

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(BI)Z")
	public static boolean method2506(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && Static88.aBooleanArray10.length > arg0 ? Static88.aBooleanArray10[arg0] : false;
	}
}
