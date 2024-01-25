import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!we", name = "C", descriptor = "I")
	public static int anInt8265 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BII)Z")
	public static boolean method7092(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static66.method1533(arg1, arg0) || Static244.method4141(arg1, arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method7097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static79.aBoolean178 || !Static294.aBoolean394) {
			return false;
		} else if (Static111.anInt2390 < 100) {
			return false;
		} else if (Static213.method3543(arg1, arg2, arg0)) {
			@Pc(28) int local28 = arg2 << Static326.anInt5713;
			@Pc(32) int local32 = arg0 << Static326.anInt5713;
			if (Static149.method2635(Static511.aClass91Array3[arg1].method7447(arg0, arg2), local32, local28, Static519.anInt8387, arg3, Static519.anInt8387)) {
				Static89.anInt6960++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
