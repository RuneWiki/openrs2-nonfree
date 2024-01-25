import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_196 = new Class189("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
	public static int anInt6085 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static74.anIntArrayArrayArray3[arg0][local16][local20] == -Static361.anInt6112) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static336.anInt5747) + 1;
			@Pc(142) int local142 = (arg3 << Static336.anInt5747) + 2;
			@Pc(151) int local151 = Static444.aClass159Array3[arg0].I(arg1, arg3) + arg5;
			if (!Static328.method4427(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static336.anInt5747) - 1;
			if (!Static328.method4427(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static336.anInt5747) - 1;
			if (!Static328.method4427(local20, local151, local177)) {
				return false;
			} else if (Static328.method4427(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static420.method5370(arg0, arg1, arg3)) {
			local16 = arg1 << Static336.anInt5747;
			local20 = arg3 << Static336.anInt5747;
			return Static328.method4427(local16 + 1, Static444.aClass159Array3[arg0].I(arg1, arg3) + arg5, local20 + 1) && Static328.method4427(local16 + Static205.anInt3992 - 1, Static444.aClass159Array3[arg0].I(arg1 + 1, arg3) + arg5, local20 + 1) && Static328.method4427(local16 + Static205.anInt3992 - 1, Static444.aClass159Array3[arg0].I(arg1 + 1, arg3 + 1) + arg5, local20 + Static205.anInt3992 - 1) && Static328.method4427(local16 + 1, Static444.aClass159Array3[arg0].I(arg1, arg3 + 1) + arg5, local20 + Static205.anInt3992 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public static void method4750() {
		Static367.aClass126_51.method3135();
		Static225.aClass126_26.method3135();
		Static306.aClass126_43.method3135();
		Static348.aClass126_48.method3135();
		Static406.aClass126_57.method3135();
	}
}
