import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static324 {

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	public static int anInt5540;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_160 = new Class102(55, 2);

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!at;")
	public static Class16 aClass16_16 = null;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIBII)V")
	public static void method4383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg0) {
			Static208.method2799(arg1, arg2, arg4, arg3);
		} else if (Static317.anInt6670 <= arg4 - arg3 && Static215.anInt3546 >= arg3 + arg4 && arg1 - arg0 >= Static219.anInt6125 && arg0 + arg1 <= Static155.anInt2670) {
			Static48.method680(arg0, arg3, arg2, arg4, arg1);
		} else {
			Static18.method2730(arg1, arg0, arg3, arg4, arg2);
		}
	}
}
