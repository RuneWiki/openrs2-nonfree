import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fm", name = "T", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!fm", name = "bb", descriptor = "I")
	public static int anInt1617;

	@OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
	public static int anInt1612 = 0;

	@OriginalMember(owner = "client!fm", name = "Y", descriptor = "I")
	public static int anInt1616 = 0;

	@OriginalMember(owner = "client!fm", name = "Z", descriptor = "Lclient!qd;")
	public static Class136 aClass136_1 = Static170.method2568();

	@OriginalMember(owner = "client!fm", name = "ab", descriptor = "[I")
	public static int[] anIntArray188 = new int[32];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static58.anIntArrayArrayArray7[arg0][local16][local20] == -Static123.anInt2372) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static163.anIntArrayArrayArray16[arg0][arg1][arg3] + arg5;
			if (!Static191.method2911(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static191.method2911(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static191.method2911(local16, local156, local182)) {
				return false;
			} else if (Static191.method2911(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static266.method4099(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static191.method2911(local16 + 1, Static163.anIntArrayArrayArray16[arg0][arg1][arg3] + arg5, local20 + 1) && Static191.method2911(local16 + 128 - 1, Static163.anIntArrayArrayArray16[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static191.method2911(local16 + 128 - 1, Static163.anIntArrayArrayArray16[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static191.method2911(local16 + 1, Static163.anIntArrayArrayArray16[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)I")
	public static int method1389(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static5.method121(arg0);
	}

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "(I)V")
	public static void method1390() {
		Static247.aClass30_1.method4521();
		@Pc(8) int local8;
		for (local8 = 0; local8 < 32; local8++) {
			Static218.aLongArray3[local8] = 0L;
		}
		for (local8 = 0; local8 < 32; local8++) {
			Static229.aLongArray10[local8] = 0L;
		}
		Static75.anInt1505 = 0;
	}
}
