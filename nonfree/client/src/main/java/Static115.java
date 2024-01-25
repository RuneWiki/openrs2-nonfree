import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eda", name = "L", descriptor = "I")
	public static int anInt2689;

	@OriginalMember(owner = "client!eda", name = "R", descriptor = "I")
	public static int anInt2695;

	@OriginalMember(owner = "client!eda", name = "I", descriptor = "[I")
	public static final int[] anIntArray251 = new int[13];

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(IIIIII)Z")
	public static boolean method2393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static327.anIntArrayArrayArray21[arg0][local16][local20] == -Static287.anInt5340) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static41.anInt810) + 1;
			@Pc(142) int local142 = (arg3 << Static41.anInt810) + 2;
			@Pc(151) int local151 = Static112.aClass16Array3[arg0].JA(arg1, arg3) + arg5;
			if (!Static452.method6398(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static41.anInt810) - 1;
			if (!Static452.method6398(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static41.anInt810) - 1;
			if (!Static452.method6398(local20, local151, local177)) {
				return false;
			} else if (Static452.method6398(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static246.method4173(arg0, arg1, arg3)) {
			local16 = arg1 << Static41.anInt810;
			local20 = arg3 << Static41.anInt810;
			return Static452.method6398(local16 + 1, Static112.aClass16Array3[arg0].JA(arg1, arg3) + arg5, local20 + 1) && Static452.method6398(local16 + Static514.anInt8839 - 1, Static112.aClass16Array3[arg0].JA(arg1 + 1, arg3) + arg5, local20 + 1) && Static452.method6398(local16 + Static514.anInt8839 - 1, Static112.aClass16Array3[arg0].JA(arg1 + 1, arg3 + 1) + arg5, local20 + Static514.anInt8839 - 1) && Static452.method6398(local16 + 1, Static112.aClass16Array3[arg0].JA(arg1, arg3 + 1) + arg5, local20 + Static514.anInt8839 - 1);
		} else {
			return false;
		}
	}
}
