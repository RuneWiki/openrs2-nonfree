import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIILclient!qa;[[[BIIBIIII)V")
	public static void method2053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class172 arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg1 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg6 = 1;
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg6 == 10) {
			arg0 = arg0 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg0 = arg0 + 3 & 0x3;
			arg6 = 8;
		}
		arg4.aa(arg2, arg10, arg11, arg9, arg8, arg3, arg5[arg6 - 1][arg0], arg1, arg7);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public static void method2054() {
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			Static384.aBooleanArray20[local9] = false;
		}
		Static166.anInt3384 = -1;
		Static161.anInt3316 = 5;
		Static119.anInt2572 = Static298.anInt5734;
		Static342.anInt5806 = Static439.anInt7400;
		Static20.anInt684 = 0;
		Static24.anInt847 = Static265.anInt5008;
		Static318.anInt6962 = Static276.anInt5105;
		Static194.anInt3884 = 0;
		Static362.anInt6125 = -1;
		Static313.anInt5549 = Static445.anInt7532;
		Static215.anInt4112 = Static253.anInt4787;
	}
}
