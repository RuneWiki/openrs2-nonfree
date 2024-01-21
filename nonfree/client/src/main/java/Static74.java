import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	public static int anInt1609;

	@OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
	public static int anInt1610;

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "B")
	public static byte aByte3;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIBI[B[Lclient!p;IIII)V")
	public static void method1214(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) Class76[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(17) int local17;
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			for (local17 = 0; local17 < 8; local17++) {
				if (arg5 + local13 > 0 && arg5 + local13 < 103 && arg6 + local17 > 0 && arg6 + local17 < 103) {
					arg4[arg1].anIntArrayArray30[arg5 + local13][local17 + arg6] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(95) Class5_Sub6 local95 = new Class5_Sub6(arg3);
		for (local17 = 0; local17 < 4; local17++) {
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
					if (local17 == arg7 && local101 >= arg0 && arg0 + 8 > local101 && local105 >= arg8 && local105 < arg8 + 8) {
						Static143.method2226(Static202.method3005(arg2, local105 & 0x7, local101 & 0x7) + arg6, local95, arg1, arg5 + Static106.method1720(local101 & 0x7, local105 & 0x7, arg2), 0, arg2, 0);
					} else {
						Static143.method2226(-1, local95, 0, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
	public static void method1215() {
		if (Static157.aClass39_3 != null) {
			Static157.aClass39_3.method1175();
			Static157.aClass39_3 = null;
		}
		Static98.method1641();
		Static4.method117();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static9.aClass76Array1[local22].method2223();
		}
		Static128.method1995();
		System.gc();
		Static79.method1391();
		Static210.aBoolean58 = false;
		Static160.anInt3233 = -1;
		Static83.method1435();
		Static208.method3109(10);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static186.anIntArrayArrayArray10[arg0][local16][local20] == -Static144.anInt2996) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static37.anIntArrayArrayArray5[arg0][arg1][arg3] + arg5;
			if (!Static191.method2853(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static191.method2853(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static191.method2853(local20, local156, local182)) {
				return false;
			} else if (Static191.method2853(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static40.method691(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static191.method2853(local16 + 1, Static37.anIntArrayArrayArray5[arg0][arg1][arg3] + arg5, local20 + 1) && Static191.method2853(local16 + 128 - 1, Static37.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static191.method2853(local16 + 128 - 1, Static37.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static191.method2853(local16 + 1, Static37.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
