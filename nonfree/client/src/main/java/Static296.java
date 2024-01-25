import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!os", name = "G", descriptor = "I")
	public static int anInt5181 = -1;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "I")
	public static int anInt5187 = 104;

	@OriginalMember(owner = "client!os", name = "P", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_137 = new Class12(56, 8);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZIIII)V")
	public static void method4064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static93.anInt1676 < arg3 || arg2 < Static289.anInt5053) {
			return;
		}
		@Pc(31) boolean local31;
		if (arg1 < Static427.anInt7214) {
			arg1 = Static427.anInt7214;
			local31 = false;
		} else if (arg1 <= Static434.anInt7302) {
			local31 = true;
		} else {
			local31 = false;
			arg1 = Static434.anInt7302;
		}
		@Pc(57) boolean local57;
		if (arg0 < Static427.anInt7214) {
			local57 = false;
			arg0 = Static427.anInt7214;
		} else if (arg0 <= Static434.anInt7302) {
			local57 = true;
		} else {
			local57 = false;
			arg0 = Static434.anInt7302;
		}
		if (arg3 < Static289.anInt5053) {
			arg3 = Static289.anInt5053;
		} else {
			Static2.method38(arg0, arg4, Static67.anIntArrayArray13[arg3++], arg1);
		}
		if (Static93.anInt1676 < arg2) {
			arg2 = Static93.anInt1676;
		} else {
			Static2.method38(arg0, arg4, Static67.anIntArrayArray13[arg2--], arg1);
		}
		@Pc(118) int local118;
		if (local31 && local57) {
			for (local118 = arg3; local118 <= arg2; local118++) {
				@Pc(158) int[] local158 = Static67.anIntArrayArray13[local118];
				local158[arg1] = local158[arg0] = arg4;
			}
		} else if (local31) {
			for (local118 = arg3; local118 <= arg2; local118++) {
				Static67.anIntArrayArray13[local118][arg1] = arg4;
			}
		} else if (local57) {
			for (local118 = arg3; local118 <= arg2; local118++) {
				Static67.anIntArrayArray13[local118][arg0] = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "(I)Lclient!sc;")
	public static Class60 method4065() {
		try {
			return (Class60) Class.forName("Class60_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static271.anIntArrayArrayArray15[arg0][local16][local20] == -Static172.anInt2813) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static215.anInt4460) + 1;
			@Pc(142) int local142 = (arg3 << Static215.anInt4460) + 2;
			@Pc(151) int local151 = Static94.aClass157Array1[arg0].ua(arg1, arg3) + arg5;
			if (!Static409.method5278(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static215.anInt4460) - 1;
			if (!Static409.method5278(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static215.anInt4460) - 1;
			if (!Static409.method5278(local20, local151, local177)) {
				return false;
			} else if (Static409.method5278(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static160.method2326(arg0, arg1, arg3)) {
			local16 = arg1 << Static215.anInt4460;
			local20 = arg3 << Static215.anInt4460;
			return Static409.method5278(local16 + 1, Static94.aClass157Array1[arg0].ua(arg1, arg3) + arg5, local20 + 1) && Static409.method5278(local16 + Static5.anInt78 - 1, Static94.aClass157Array1[arg0].ua(arg1 + 1, arg3) + arg5, local20 + 1) && Static409.method5278(local16 + Static5.anInt78 - 1, Static94.aClass157Array1[arg0].ua(arg1 + 1, arg3 + 1) + arg5, local20 + Static5.anInt78 - 1) && Static409.method5278(local16 + 1, Static94.aClass157Array1[arg0].ua(arg1, arg3 + 1) + arg5, local20 + Static5.anInt78 - 1);
		} else {
			return false;
		}
	}
}
