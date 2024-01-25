import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Z")
	public static boolean aBoolean20;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method450(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static456.anInt8316 = -1;
		Static86.anInt1765 = 1;
		Static430.method6614(false, arg0, arg1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Z")
	public static boolean method452(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}
}
