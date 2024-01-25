import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static115 {

	@OriginalMember(owner = "client!hi", name = "N", descriptor = "[[Lclient!af;")
	public static Class6[][] aClass6ArrayArray1;

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
	public static int anInt2459 = 0;

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!hi", name = "R", descriptor = "[I")
	public static final int[] anIntArray150 = new int[32];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!jf;I)Ljava/lang/String;")
	public static String method2280(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1) {
		if (!Static43.method975(arg1).method1144(arg0) && arg1.anObjectArray22 == null) {
			return null;
		} else if (arg1.aStringArray19 == null || arg1.aStringArray19.length <= arg0 || arg1.aStringArray19[arg0] == null || arg1.aStringArray19[arg0].trim().length() == 0) {
			return Static213.aBoolean311 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray19[arg0];
		}
	}
}
