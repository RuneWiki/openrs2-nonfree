import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[100];

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString53 = "";

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static252.method3355(arg3)) {
			return;
		}
		if (Static216.aClass95ArrayArray2[arg3] == null) {
			Static52.method732(Static294.aClass95ArrayArray3[arg3], -1, arg5, arg0, arg4, arg6, arg1, arg7, arg8, arg2);
		} else {
			Static52.method732(Static216.aClass95ArrayArray2[arg3], -1, arg5, arg0, arg4, arg6, arg1, arg7, arg8, arg2);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V")
	public static void method4070(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class156 local9 = Static259.aClass156ArrayArray1[arg1][arg2];
		Static325.method4302(local9 == null ? Static283.aClass156_2 : local9, arg0);
	}
}
