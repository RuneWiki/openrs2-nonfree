import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static506 {

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
	public static int anInt8446;

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString97 = null;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_156 = new Class322(78, 8);

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)Z")
	public static boolean method7372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static139.method2712(arg0)) {
			return true;
		} else {
			return !Static139.method2712(arg1);
		}
	}
}
