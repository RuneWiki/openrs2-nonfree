import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "Lclient!dn;")
	public static Class69 aClass69_31;

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "Lclient!ug;")
	public static final Class294 aClass294_5 = new Class294();

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
	public static int anInt2846 = -1;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
	public static int anInt2848 = 0;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIBII)V")
	public static void method2648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg1) {
			Static414.method6533(arg3, arg4, arg2, arg0);
		} else if (Static325.anInt6148 <= arg3 - arg4 && Static119.anInt2469 >= arg4 + arg3 && arg0 - arg1 >= Static94.anInt2057 && arg0 + arg1 <= Static187.anInt3872) {
			Static472.method7364(arg4, arg0, arg2, arg1, arg3);
		} else {
			Static235.method4193(arg4, arg3, arg2, arg0, arg1);
		}
	}
}
