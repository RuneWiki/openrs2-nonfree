import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "[I")
	public static final int[] anIntArray381 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "J")
	public static long aLong166 = 0L;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "S")
	public static short aShort69 = 256;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
	public static int anInt4782 = -1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
	public static void method4375(@OriginalArg(0) int arg0) {
		if (Static326.anInt6155 == arg0) {
			return;
		}
		Static311.anInt5653 = Static189.anInt3820 = Static232.anIntArray380[arg0];
		Static9.aClass63_1.method4582(50, (int) ((double) Static311.anInt5653 * 34.46D));
		Static281.anIntArrayArray60 = new int[Static311.anInt5653][Static189.anInt3820];
		Static344.anIntArrayArray50 = new int[Static311.anInt5653][Static189.anInt3820];
		Static1.anIntArrayArrayArray4 = new int[4][Static311.anInt5653 >> 3][Static189.anInt3820 >> 3];
		for (@Pc(58) int local58 = 0; local58 < 4; local58++) {
			Static11.aClass196Array2[local58] = Static148.method2878(Static189.anInt3820, Static311.anInt5653);
		}
		Static341.aByteArrayArrayArray10 = new byte[4][Static311.anInt5653][Static189.anInt3820];
		Static320.method4043(Static311.anInt5653, Static189.anInt3820);
		Static129.method2665(Static189.anInt3820 >> 3, Static311.anInt5653 >> 3, Static9.aClass63_1);
		Static326.anInt6155 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)I")
	public static int method4379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg4;
			arg4 = local12;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 1 + 7 - arg3 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg5 - arg4;
		} else {
			return arg1;
		}
	}
}
