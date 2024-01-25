import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	public static int anInt4535 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3945(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static279.aBoolean733) {
			return false;
		} else if (Static328.anInt5532 < 100) {
			return false;
		} else if (Static238.method3671(arg0, arg1, arg2)) {
			@Pc(31) int local31 = arg0 << Static315.anInt5369;
			@Pc(35) int local35 = arg2 << Static315.anInt5369;
			if (Static136.method2670(arg3, local35, Static467.anInt7776, Static467.anInt7776, Static68.aClass34Array1[arg1].method6525(arg2, arg0), local31)) {
				Static299.anInt5092++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
