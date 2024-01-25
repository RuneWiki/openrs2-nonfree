import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "Lclient!it;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public static int anInt4357 = -1;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
	public static int anInt4360 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!cg;III)V")
	public static void method3601(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static61.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5265 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub31Array3[arg0.anInt5265++] = Static124.aClass243Array5[local21 - 1].aClass1_Sub31_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt5265; local21 < 4; local21++) {
			arg0.aClass1_Sub31Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static254.anIntArrayArrayArray13[arg0][local16][local20] == -Static22.anInt541) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static31.anInt665) + 1;
			@Pc(142) int local142 = (arg3 << Static31.anInt665) + 2;
			@Pc(151) int local151 = Static105.aClass149Array1[arg0].l(arg1, arg3) + arg5;
			if (!Static316.method4482(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static31.anInt665) - 1;
			if (!Static316.method4482(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static31.anInt665) - 1;
			if (!Static316.method4482(local20, local151, local177)) {
				return false;
			} else if (Static316.method4482(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static255.method3829(arg0, arg1, arg3)) {
			local16 = arg1 << Static31.anInt665;
			local20 = arg3 << Static31.anInt665;
			return Static316.method4482(local16 + 1, Static105.aClass149Array1[arg0].l(arg1, arg3) + arg5, local20 + 1) && Static316.method4482(local16 + Static186.anInt3374 - 1, Static105.aClass149Array1[arg0].l(arg1 + 1, arg3) + arg5, local20 + 1) && Static316.method4482(local16 + Static186.anInt3374 - 1, Static105.aClass149Array1[arg0].l(arg1 + 1, arg3 + 1) + arg5, local20 + Static186.anInt3374 - 1) && Static316.method4482(local16 + 1, Static105.aClass149Array1[arg0].l(arg1, arg3 + 1) + arg5, local20 + Static186.anInt3374 - 1);
		} else {
			return false;
		}
	}
}
