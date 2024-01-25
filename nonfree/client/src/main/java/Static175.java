import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public static int anInt3790;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public static int anInt3793;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public static int anInt3788 = -1;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_111 = new Class34("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public static int anInt3789 = 0;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
	public static boolean aBoolean350 = true;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public static int anInt3794 = 0;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public static int anInt3795 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static154.anIntArrayArrayArray10[arg0][local16][local20] == -Static146.anInt3198) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static298.aClass53Array3[arg0].method2785(arg1, arg3) + arg5;
			if (!Static71.method3162(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static71.method3162(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static71.method3162(local20, local151, local177)) {
				return false;
			} else if (Static71.method3162(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static23.method662(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static71.method3162(local16 + 1, Static298.aClass53Array3[arg0].method2785(arg1, arg3) + arg5, local20 + 1) && Static71.method3162(local16 + 128 - 1, Static298.aClass53Array3[arg0].method2785(arg1 + 1, arg3) + arg5, local20 + 1) && Static71.method3162(local16 + 128 - 1, Static298.aClass53Array3[arg0].method2785(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static71.method3162(local16 + 1, Static298.aClass53Array3[arg0].method2785(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static268.anInt5477 <= arg4 && Static342.anInt3000 >= arg1 && arg0 >= Static197.anInt4211 && Static326.anInt2469 >= arg3) {
			Static254.method4598(arg2, arg0, arg1, arg3, arg4);
		} else {
			Static298.method4992(arg3, arg4, arg2, arg1, arg0);
		}
	}
}
