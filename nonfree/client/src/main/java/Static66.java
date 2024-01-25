import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_54 = new Class175("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static142.anInt3212 <= arg1 && arg3 <= Static450.anInt7594 && Static161.anInt3448 <= arg0 && arg4 <= Static163.anInt3488) {
			Static238.method3731(arg3, arg1, arg0, arg5, arg6, arg4, arg2);
		} else {
			Static144.method2563(arg0, arg6, arg3, arg4, arg1, arg2, arg5);
		}
	}
}
