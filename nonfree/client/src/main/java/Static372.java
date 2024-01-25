import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "Lclient!cs;")
	public static Class66 aClass66_7;

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "Lclient!eq;")
	public static Class99 aClass99_51 = new Class99(8);

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
	public static int anInt7351 = 0;

	@OriginalMember(owner = "client!nha", name = "r", descriptor = "I")
	public static int anInt7359 = 0;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method6248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static62.aBoolean167 || !Static219.aBoolean366) {
			return false;
		} else if (Static513.anInt9411 < 100) {
			return false;
		} else if (Static331.method5702(arg2, arg3, arg0)) {
			@Pc(26) int local26 = arg3 << Static151.anInt3896;
			@Pc(30) int local30 = arg0 << Static151.anInt3896;
			if (Static369.method6238(arg1, Static582.anInt10356, local30, local26, Static9.aClass65Array1[arg2].method7995(arg0, arg3), Static582.anInt10356)) {
				Static216.anInt4874++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIII)V")
	public static void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg0; local3++) {
			Static280.method5108(arg1, Static208.anIntArrayArray20[local3], arg2, arg4);
		}
	}
}
