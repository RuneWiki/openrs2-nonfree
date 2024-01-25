import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
	public static int anInt2658 = 0;

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!hn", name = "T", descriptor = "[I")
	public static final int[] anIntArray547 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)I")
	public static int method2558(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII)V")
	public static void method2559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static243.anInt4326 && arg4 <= Static235.anInt4193 && arg5 >= Static138.anInt932 && arg2 <= Static40.anInt818) {
			if (arg0 == 1) {
				Static93.method1865(arg1, arg4, arg2, arg3, arg5);
			} else {
				Static358.method2052(arg4, arg3, arg2, arg5, arg0, arg1);
			}
		} else if (arg0 == 1) {
			Static259.method4013(arg1, arg4, arg2, arg3, arg5);
		} else {
			Static342.method5005(arg2, arg0, arg4, arg5, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
	public static void method2561(@OriginalArg(0) int arg0) {
		if (arg0 == Static389.anInt6614) {
			return;
		}
		Static246.anInt4374 = Static185.anInt3485 = Static374.anIntArray1314[arg0];
		Static111.aClass63_3.method2047(50, (int) ((double) Static246.anInt4374 * 34.46D));
		Static199.anIntArrayArray30 = new int[Static246.anInt4374][Static185.anInt3485];
		Static59.anIntArrayArray10 = new int[Static246.anInt4374][Static185.anInt3485];
		Static309.anIntArrayArrayArray13 = new int[4][Static246.anInt4374 >> 3][Static185.anInt3485 >> 3];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static58.aClass188Array1[local46] = Static372.method5458(Static246.anInt4374, Static185.anInt3485);
		}
		Static68.aByteArrayArrayArray1 = new byte[4][Static246.anInt4374][Static185.anInt3485];
		Static293.method5578(Static185.anInt3485, Static246.anInt4374);
		Static141.method2665(Static185.anInt3485 >> 3, Static246.anInt4374 >> 3, Static111.aClass63_3);
		Static389.anInt6614 = arg0;
	}
}
