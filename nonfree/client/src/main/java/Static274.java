import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
	public static int anInt5019;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "[[[Lclient!nt;")
	public static Class262[][][] aClass262ArrayArrayArray1;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	public static int anInt5026;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(CZ)Z")
	public static boolean method4205(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
