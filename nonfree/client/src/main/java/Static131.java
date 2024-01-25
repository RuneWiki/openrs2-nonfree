import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static131 {

	@OriginalMember(owner = "client!fea", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIZIIIII)V")
	public static void method2855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static43.method1389(arg3)) {
			return;
		}
		if (Static539.aClass309ArrayArray3[arg3] == null) {
			Static62.method1755(Static352.aClass309ArrayArray2[arg3], -1, arg0, arg4, arg2, arg1, arg6, arg7, arg5, arg8);
		} else {
			Static62.method1755(Static539.aClass309ArrayArray3[arg3], -1, arg0, arg4, arg2, arg1, arg6, arg7, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V")
	public static void method2856() {
		Static397.aClass9_6.E(Static55.anInt1551, Static89.aClass1_Sub28_Sub1_1.aBoolean320 ? Static246.anInt4758 + 256 << 0 : -1, 256);
	}
}
