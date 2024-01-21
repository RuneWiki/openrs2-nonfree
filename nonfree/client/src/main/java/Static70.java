import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1101 = Static107.method1838("::gc");

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
	public static int anInt1853 = 1;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static39.anIntArrayArrayArray5[arg0][local16][local20] == -Static140.anInt3211) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static90.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5;
			if (!Static88.method1581(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static88.method1581(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static88.method1581(local20, local156, local182)) {
				return false;
			} else if (Static88.method1581(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static110.method1878(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static88.method1581(local16 + 1, Static90.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5, local20 + 1) && Static88.method1581(local16 + 128 - 1, Static90.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static88.method1581(local16 + 128 - 1, Static90.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static88.method1581(local16 + 1, Static90.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	public static void method1297() {
		aClass28_1101 = null;
	}
}
