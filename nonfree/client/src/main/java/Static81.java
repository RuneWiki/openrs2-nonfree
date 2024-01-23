import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
	public static int anInt2193;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString133 = "Loaded fonts";

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Lclient!lc;")
	public static Class79 aClass79_10 = new Class79(50);

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public static int anInt2186 = 0;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "[I")
	public static int[] anIntArray169 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZIII)V")
	public static void method1635(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static156.method2772(arg0)) {
			Static198.method3473(arg2, -1, Static80.aClass122ArrayArray1[arg0], arg3, arg1);
		}
	}
}
