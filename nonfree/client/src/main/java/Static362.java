import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static362 {

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "J")
	public static long aLong210;

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public static void method5503() {
		Static266.aClass359_37.method8507();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5504(@OriginalArg(1) String arg0) {
		if (Class278.aString85.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class278.aString85.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class278.aString85.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
