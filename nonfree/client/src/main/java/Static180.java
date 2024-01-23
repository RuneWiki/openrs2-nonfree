import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
	public static int anInt3781;

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "Lclient!qc;")
	public static Class135 aClass135_17 = new Class135(64);

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
	public static int anInt3782 = 7759444;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBIIIII)V")
	public static void method3032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static224.anInt4436 && Static68.anInt1451 >= arg2 && arg4 >= Static297.anInt5619 && arg1 <= Static49.anInt1129) {
			if (arg5 == 1) {
				Static287.method4345(arg4, arg1, arg2, arg3, arg0);
			} else {
				Static109.method2015(arg2, arg5, arg3, arg0, arg4, arg1);
			}
		} else if (arg5 == 1) {
			Static142.method2349(arg4, arg1, arg2, arg3, arg0);
		} else {
			Static245.method3809(arg2, arg4, arg1, arg5, arg0, arg3);
		}
	}
}
