import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static35 {

	@OriginalMember(owner = "client!be", name = "C", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "Lclient!ro;")
	public static Class306 aClass306_7 = new Class306();

	@OriginalMember(owner = "client!be", name = "G", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!kk;Lclient!wu;B)V")
	public static void method655(@OriginalArg(0) Class192 arg0, @OriginalArg(1) Class384 arg1) {
		Static18.aString4 = "";
		Static241.aClass192_2 = arg0;
		Static457.aClass384_108 = arg1;
		if (Class80.aString23.startsWith("win")) {
			Static18.aString4 = Static18.aString4 + "windows/";
		} else if (Class80.aString23.startsWith("linux")) {
			Static18.aString4 = Static18.aString4 + "linux/";
		} else if (Class80.aString23.startsWith("mac")) {
			Static18.aString4 = Static18.aString4 + "macos/";
		}
		if (Static241.aClass192_2.aBoolean390) {
			Static18.aString4 = Static18.aString4 + "msjava/";
		} else if (Class80.aString24.startsWith("amd64") || Class80.aString24.startsWith("x86_64")) {
			Static18.aString4 = Static18.aString4 + "x86_64/";
		} else if (Class80.aString24.startsWith("i386") || Class80.aString24.startsWith("i486") || Class80.aString24.startsWith("i586") || Class80.aString24.startsWith("x86")) {
			Static18.aString4 = Static18.aString4 + "x86/";
		} else if (Class80.aString24.startsWith("ppc")) {
			Static18.aString4 = Static18.aString4 + "ppc/";
		} else {
			Static18.aString4 = Static18.aString4 + "universal/";
		}
	}
}
