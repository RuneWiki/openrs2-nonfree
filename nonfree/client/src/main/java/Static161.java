import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "[I")
	public static final int[] anIntArray209 = new int[1000];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILclient!md;)Ljava/lang/String;")
	public static String method2565(@OriginalArg(2) Class2_Sub20 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3698();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt4608 += Static260.aClass248_1.method5549(local15, 0, local7, arg0.aByteArray136, arg0.anInt4608);
			return Static142.method2021(local7, 0, local15);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static162.anIntArrayArrayArray5[arg0][local16][local20] == -Static243.anInt4537) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static250.anInt4056) + 1;
			@Pc(142) int local142 = (arg3 << Static250.anInt4056) + 2;
			@Pc(151) int local151 = Static372.aClass106Array11[arg0].I(arg1, arg3) + arg5;
			if (!Static379.method5283(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static250.anInt4056) - 1;
			if (!Static379.method5283(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static250.anInt4056) - 1;
			if (!Static379.method5283(local20, local151, local177)) {
				return false;
			} else if (Static379.method5283(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static233.method3560(arg0, arg1, arg3)) {
			local16 = arg1 << Static250.anInt4056;
			local20 = arg3 << Static250.anInt4056;
			return Static379.method5283(local16 + 1, Static372.aClass106Array11[arg0].I(arg1, arg3) + arg5, local20 + 1) && Static379.method5283(local16 + Static284.anInt5177 - 1, Static372.aClass106Array11[arg0].I(arg1 + 1, arg3) + arg5, local20 + 1) && Static379.method5283(local16 + Static284.anInt5177 - 1, Static372.aClass106Array11[arg0].I(arg1 + 1, arg3 + 1) + arg5, local20 + Static284.anInt5177 - 1) && Static379.method5283(local16 + 1, Static372.aClass106Array11[arg0].I(arg1, arg3 + 1) + arg5, local20 + Static284.anInt5177 - 1);
		} else {
			return false;
		}
	}
}
