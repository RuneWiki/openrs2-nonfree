import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_102 = new Class306("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIII)I")
	public static int method6043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg3;
			arg3 = local8;
		}
		@Pc(25) int local25 = arg5 & 0x3;
		if (local25 == 0) {
			return arg4;
		} else if (local25 == 1) {
			return arg1;
		} else if (local25 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return 8 - arg1 - arg3;
		}
	}
}
