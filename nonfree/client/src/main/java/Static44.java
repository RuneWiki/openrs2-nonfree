import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "Lclient!in;")
	public static final Class169 aClass169_34 = new Class169(109, 7);

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIIII)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static457.anInt8209 <= arg5 && arg4 <= Static407.anInt7583 && Static427.anInt7845 <= arg3 && Static631.anInt10922 >= arg1) {
			if (arg2 == 1) {
				Static332.method5481(arg0, arg4, arg3, arg5, arg1);
			} else {
				Static410.method6768(arg1, arg4, arg0, arg3, arg5, arg2);
			}
		} else if (arg2 == 1) {
			Static322.method5335(arg3, arg4, arg5, arg0, arg1);
		} else {
			Static379.method6429(arg1, arg2, arg4, arg3, arg0, arg5);
		}
	}
}
