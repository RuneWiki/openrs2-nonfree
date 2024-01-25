import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static235 {

	@OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
	public static final int anInt4240 = 1406;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3656(@OriginalArg(0) String arg0) {
		if (Class6_Sub15_Sub4.aString94.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class6_Sub15_Sub4.aString94.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class6_Sub15_Sub4.aString94.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
