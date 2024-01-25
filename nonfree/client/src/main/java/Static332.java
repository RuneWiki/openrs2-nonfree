import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static332 {

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_14 = new Class98(14, 0, 4, 1);

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_269 = new Class22(49, 4);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII)I")
	public static int method4519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg1) {
			return arg2;
		} else if (arg0 >= arg1) {
			return arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
	public static void method4520() {
		Static182.aClass68_19.method1791();
	}
}
