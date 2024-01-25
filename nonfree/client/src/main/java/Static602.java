import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "Lclient!ok;")
	public static Class25 aClass25_4;

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "[Lclient!fm;")
	public static Class112[] aClass112Array1;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_346 = new Class179(74, -2);

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_16 = new Class159(7, 7);

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray63 = new String[100];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method8296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg4 + arg5;
		@Pc(18) int local18 = arg0 + arg2;
		@Pc(23) int local23 = arg3 + arg1;
		if (!Static641.method8755(arg3, arg4, arg4, local18, local13, local18, local18, local23, local23)) {
			return false;
		} else if (Static641.method8755(arg3, arg4, local13, local18, local13, local18, local18, local23, arg3)) {
			if (arg4 >= Static136.anInt2381) {
				if (!Static641.method8755(local23, local13, local13, arg0, local13, local18, local18, local23, arg3)) {
					return false;
				}
				if (!Static641.method8755(local23, local13, local13, arg0, local13, arg0, local18, arg3, arg3)) {
					return false;
				}
			} else if (!Static641.method8755(local23, arg4, arg4, arg0, arg4, local18, local18, local23, arg3)) {
				return false;
			} else if (!Static641.method8755(local23, arg4, arg4, arg0, arg4, arg0, local18, arg3, arg3)) {
				return false;
			}
			if (arg3 >= Static375.anInt6326) {
				if (!Static641.method8755(local23, arg4, arg4, arg0, local13, local18, local18, local23, local23)) {
					return false;
				}
				if (!Static641.method8755(local23, arg4, local13, arg0, local13, arg0, local18, local23, local23)) {
					return false;
				}
			} else if (!Static641.method8755(arg3, arg4, arg4, arg0, local13, local18, local18, arg3, arg3)) {
				return false;
			} else if (!Static641.method8755(arg3, arg4, local13, arg0, local13, arg0, local18, arg3, arg3)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
