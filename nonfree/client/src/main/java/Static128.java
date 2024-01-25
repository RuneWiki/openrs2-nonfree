import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	public static int anInt1970;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	public static int anInt1965 = -60;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_85 = new Class67(28, 10);

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
	public static int anInt1969 = 0;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIII)V")
	public static void method1582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static142.anInt2163 && arg3 <= Static182.anInt3402) {
			@Pc(27) int local27 = Static241.method3467(arg0, Static281.anInt4757, Static457.anInt7264);
			@Pc(33) int local33 = Static241.method3467(arg1, Static281.anInt4757, Static457.anInt7264);
			Static446.method5650(local33, arg2, local27, arg3);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static148.anIntArrayArrayArray2[arg0][local16][local20] == -Static248.anInt4433) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static41.anInt612) + 1;
			@Pc(142) int local142 = (arg3 << Static41.anInt612) + 2;
			@Pc(151) int local151 = Static452.aClass139Array3[arg0].ua(arg1, arg3) + arg5;
			if (!Static207.method3007(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static41.anInt612) - 1;
			if (!Static207.method3007(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static41.anInt612) - 1;
			if (!Static207.method3007(local20, local151, local177)) {
				return false;
			} else if (Static207.method3007(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static292.method3894(arg0, arg1, arg3)) {
			local16 = arg1 << Static41.anInt612;
			local20 = arg3 << Static41.anInt612;
			return Static207.method3007(local16 + 1, Static452.aClass139Array3[arg0].ua(arg1, arg3) + arg5, local20 + 1) && Static207.method3007(local16 + Static383.anInt6136 - 1, Static452.aClass139Array3[arg0].ua(arg1 + 1, arg3) + arg5, local20 + 1) && Static207.method3007(local16 + Static383.anInt6136 - 1, Static452.aClass139Array3[arg0].ua(arg1 + 1, arg3 + 1) + arg5, local20 + Static383.anInt6136 - 1) && Static207.method3007(local16 + 1, Static452.aClass139Array3[arg0].ua(arg1, arg3 + 1) + arg5, local20 + Static383.anInt6136 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZI)I")
	public static int method1584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static156.anIntArray198[arg0 & 0x3] : 256;
	}
}
