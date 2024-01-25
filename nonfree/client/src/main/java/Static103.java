import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "Lclient!ps;")
	public static final Class262 aClass262_3 = new Class262(1, 2);

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_16 = new Class112();

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!r;ZII)Lclient!la;")
	public static Class54 method1875(@OriginalArg(0) Class45 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class66 local9 = Static229.method3567(arg0, arg2, arg1);
		return local9 == null ? null : local9.aClass54_5;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBIIIII)Z")
	public static boolean method1876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static279.aBoolean733) {
			return false;
		} else if (Static328.anInt5532 < 100) {
			return false;
		} else {
			@Pc(42) int local42;
			@Pc(46) int local46;
			if (arg5 != arg3 || arg1 != arg0) {
				for (local42 = arg5; local42 <= arg3; local42++) {
					for (local46 = arg0; local46 <= arg1; local46++) {
						if (Static555.anIntArrayArrayArray20[arg2][local42][local46] == -Static414.anInt7057) {
							return false;
						}
					}
				}
				local46 = (arg5 << Static315.anInt5369) + 1;
				@Pc(120) int local120 = (arg0 << Static315.anInt5369) + 2;
				if (Static136.method2670(arg4, local120, (arg3 + 1 - arg5) * Static467.anInt7776, (arg1 + 1 - arg0) * Static467.anInt7776, Static68.aClass34Array1[arg2].method6525(arg0, arg5), local46)) {
					Static299.anInt5092++;
					return true;
				} else {
					return false;
				}
			} else if (Static238.method3671(arg5, arg2, arg0)) {
				local42 = arg5 << Static315.anInt5369;
				local46 = arg0 << Static315.anInt5369;
				if (Static136.method2670(arg4, local46, Static467.anInt7776, Static467.anInt7776, Static68.aClass34Array1[arg2].method6525(arg0, arg5), local42)) {
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
}
