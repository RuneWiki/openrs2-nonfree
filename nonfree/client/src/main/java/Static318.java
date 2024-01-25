import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static318 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	public static int anInt5992;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	public static int anInt5993 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4986(@OriginalArg(0) String arg0) {
		if (Class383.aString119.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class383.aString119.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class383.aString119.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
