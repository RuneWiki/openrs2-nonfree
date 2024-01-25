import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_3 = new Class156(100, 3);

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_2 = new Class168(4);

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(III)Z")
	public static boolean method151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method156(@OriginalArg(0) String arg0) {
		if (Class186.aString53.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class186.aString53.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class186.aString53.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
