import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!qu", name = "t", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array19;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "Lclient!m;")
	public static final Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "Lclient!dga;")
	public static final Class68 aClass68_4 = new Class68();

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIII)V")
	public static void method6213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= Static13.anInt7634 && Static461.anInt7899 >= arg5 && Static583.anInt9478 <= arg4 && arg0 <= Static415.anInt9494) {
			if (arg3 == 1) {
				Static494.method6742(arg2, arg0, arg5, arg4, arg1);
			} else {
				Static194.method3521(arg1, arg3, arg2, arg4, arg5, arg0);
			}
		} else if (arg3 == 1) {
			Static448.method6346(arg4, arg2, arg1, arg5, arg0);
		} else {
			Static307.method4851(arg5, arg4, arg1, arg3, arg2, arg0);
		}
	}
}
