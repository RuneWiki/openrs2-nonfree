import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	public static int anInt5635;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	public static int anInt5639;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
	public static int anInt5640;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
	public static int anInt5641;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
	public static int anInt5636 = 0;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	public static int anInt5637 = 0;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_134 = new Class140(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public static void method4756() {
		Static175.aClass41_18.method907();
		Static77.aClass129_2.method3580();
		Static148.aClass129_7.method3580();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static46.anIntArrayArrayArray3[arg0][local16][local20] == -Static2.anInt57) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static325.anInt6336) + 1;
			@Pc(142) int local142 = (arg3 << Static325.anInt6336) + 2;
			@Pc(151) int local151 = Static9.aClass105Array1[arg0].method4453(arg1, arg3) + arg5;
			if (!Static283.method4806(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static325.anInt6336) - 1;
			if (!Static283.method4806(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static325.anInt6336) - 1;
			if (!Static283.method4806(local20, local151, local177)) {
				return false;
			} else if (Static283.method4806(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static118.method2302(arg0, arg1, arg3)) {
			local16 = arg1 << Static325.anInt6336;
			local20 = arg3 << Static325.anInt6336;
			return Static283.method4806(local16 + 1, Static9.aClass105Array1[arg0].method4453(arg1, arg3) + arg5, local20 + 1) && Static283.method4806(local16 + Static6.anInt96 - 1, Static9.aClass105Array1[arg0].method4453(arg1 + 1, arg3) + arg5, local20 + 1) && Static283.method4806(local16 + Static6.anInt96 - 1, Static9.aClass105Array1[arg0].method4453(arg1 + 1, arg3 + 1) + arg5, local20 + Static6.anInt96 - 1) && Static283.method4806(local16 + 1, Static9.aClass105Array1[arg0].method4453(arg1, arg3 + 1) + arg5, local20 + Static6.anInt96 - 1);
		} else {
			return false;
		}
	}
}
