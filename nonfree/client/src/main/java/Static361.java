import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static361 {

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	public static int anInt6118;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "Lclient!rba;")
	public static Class292 aClass292_4;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Lclient!lr;")
	public static final Class2_Sub7_Sub2 aClass2_Sub7_Sub2_1 = new Class2_Sub7_Sub2(7500);

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_40 = new Class70();

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIBII)V")
	public static void method5126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg1) {
			Static214.method2617(arg1, arg3, arg4, arg2);
		} else if (Static130.anInt2131 <= arg3 - arg1 && Static89.anInt1576 >= arg1 + arg3 && arg2 - arg0 >= Static275.anInt4756 && arg2 + arg0 <= Static48.anInt898) {
			Static402.method5501(arg2, arg3, arg4, arg0, arg1);
		} else {
			Static341.method4957(arg4, arg2, arg0, arg3, arg1);
		}
	}
}
