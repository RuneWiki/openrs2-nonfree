import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4032(@OriginalArg(1) String arg0) {
		if (Class80.aString23.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class80.aString23.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class80.aString23.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
