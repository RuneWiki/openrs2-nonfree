import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public static int anInt2546;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt2545 = 0;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1223 = Static193.method3027("green:");

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1220 = aClass70_1223;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1221 = aClass70_1223;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
	public static boolean aBoolean128 = true;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1222 = Static193.method3027("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1224 = Static193.method3027("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIB)I")
	public static int method1827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return arg1 > arg0 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}
}
