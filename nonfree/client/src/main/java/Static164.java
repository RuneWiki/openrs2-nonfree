import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
	public static int anInt2535;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)Z")
	public static boolean method2177(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
