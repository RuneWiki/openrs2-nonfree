import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	public static int anInt6717;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
	public static int anInt6719;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_107 = new Class67("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5617(@OriginalArg(0) String arg0) {
		if (Static472.aString75.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static472.aString75.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static472.aString75.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B[BI)I")
	public static int method5618(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static41.method950(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Z")
	public static boolean method5619(@OriginalArg(0) int arg0) {
		if (arg0 == 22 || arg0 == 5 || arg0 == 6 || arg0 == 10 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1008;
		}
	}
}
