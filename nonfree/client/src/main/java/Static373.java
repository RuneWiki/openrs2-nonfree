import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[Lclient!cba;")
	public static final Interface2[] anInterface2Array1 = new Interface2[128];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method5873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 < 512 || arg0 < 512 || arg1 > (Static118.anInt2527 - 2) * 512 || (Static549.anInt9482 - 2) * 512 < arg0) {
			Static447.anIntArray695[0] = Static447.anIntArray695[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static58.method1166(arg0, arg1, arg6) - arg4;
		Static181.aClass205_5.G(arg5, 0, 0);
		Static121.aClass5_7.method7469(Static181.aClass205_5);
		Static121.aClass5_7.na(arg1, local51, arg0, Static447.anIntArray695);
		Static181.aClass205_5.G(-arg5, 0, 0);
		Static121.aClass5_7.method7469(Static181.aClass205_5);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static40.anIntArrayArrayArray3[arg0][local16][local20] == -Static457.anInt8266) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static33.anInt880) + 1;
			@Pc(142) int local142 = (arg3 << Static33.anInt880) + 2;
			@Pc(151) int local151 = Static511.aClass52Array3[arg0].JA(arg1, arg3) + arg5;
			if (!Static434.method6594(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static33.anInt880) - 1;
			if (!Static434.method6594(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static33.anInt880) - 1;
			if (!Static434.method6594(local20, local151, local177)) {
				return false;
			} else if (Static434.method6594(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static363.method5711(arg0, arg1, arg3)) {
			local16 = arg1 << Static33.anInt880;
			local20 = arg3 << Static33.anInt880;
			return Static434.method6594(local16 + 1, Static511.aClass52Array3[arg0].JA(arg1, arg3) + arg5, local20 + 1) && Static434.method6594(local16 + Static219.anInt4777 - 1, Static511.aClass52Array3[arg0].JA(arg1 + 1, arg3) + arg5, local20 + 1) && Static434.method6594(local16 + Static219.anInt4777 - 1, Static511.aClass52Array3[arg0].JA(arg1 + 1, arg3 + 1) + arg5, local20 + Static219.anInt4777 - 1) && Static434.method6594(local16 + 1, Static511.aClass52Array3[arg0].JA(arg1, arg3 + 1) + arg5, local20 + Static219.anInt4777 - 1);
		} else {
			return false;
		}
	}
}
