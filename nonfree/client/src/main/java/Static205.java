import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "[[S")
	public static short[][] aShortArrayArray45;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
	public static void method3459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static115.anInt2578 != arg0) {
			Static45.anIntArray97 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static45.anIntArray97[local13] = (local13 << 12) / arg0;
			}
			Static48.anInt1202 = arg0 - 1;
			Static115.anInt2578 = arg0;
			Static59.anInt1436 = arg0 == 64 ? 2048 : 4096;
		}
		if (Static31.anInt857 == arg1) {
			return;
		}
		if (arg1 == Static115.anInt2578) {
			Static187.anIntArray362 = Static45.anIntArray97;
		} else {
			Static187.anIntArray362 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static187.anIntArray362[local13] = (local13 << 12) / arg1;
			}
		}
		Static31.anInt857 = arg1;
		Static91.anInt2110 = arg1 - 1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static63.anInt1608 <= arg4 && arg5 <= Static63.anInt1595 && arg1 >= Static13.anInt308 && arg2 <= Static52.anInt1338) {
			Static19.method433(arg5, arg1, arg6, arg2, arg0, arg4, arg3);
		} else {
			Static5.method110(arg2, arg3, arg1, arg6, arg4, arg5, arg0);
		}
	}
}
