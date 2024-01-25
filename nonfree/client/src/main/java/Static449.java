import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
	public static int anInt7009;

	@OriginalMember(owner = "client!pa", name = "tb", descriptor = "Lclient!ha;")
	public static Class33 aClass33_11;

	@OriginalMember(owner = "client!pa", name = "mb", descriptor = "[I")
	public static final int[] anIntArray487 = new int[4096];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!kq;II)V")
	public static void method6177(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte77 == 0) {
			arg1.anInt5028 = arg1.anInt5026;
		} else if (arg1.aByte77 == 1) {
			arg1.anInt5028 = arg1.anInt5026 + (arg2 - arg1.anInt4994) / 2;
		} else if (arg1.aByte77 == 2) {
			arg1.anInt5028 = arg2 - arg1.anInt4994 - arg1.anInt5026;
		} else if (arg1.aByte77 == 3) {
			arg1.anInt5028 = arg2 * arg1.anInt5026 >> 14;
		} else if (arg1.aByte77 == 4) {
			arg1.anInt5028 = (arg1.anInt5026 * arg2 >> 14) + (arg2 - arg1.anInt4994) / 2;
		} else {
			arg1.anInt5028 = arg2 - (arg2 * arg1.anInt5026 >> 14) - arg1.anInt4994;
		}
		if (arg1.aByte78 == 0) {
			arg1.anInt4973 = arg1.anInt4968;
		} else if (arg1.aByte78 == 1) {
			arg1.anInt4973 = (arg0 - arg1.anInt5035) / 2 + arg1.anInt4968;
		} else if (arg1.aByte78 == 2) {
			arg1.anInt4973 = arg0 - arg1.anInt4968 - arg1.anInt5035;
		} else if (arg1.aByte78 == 3) {
			arg1.anInt4973 = arg0 * arg1.anInt4968 >> 14;
		} else if (arg1.aByte78 == 4) {
			arg1.anInt4973 = (arg1.anInt4968 * arg0 >> 14) + (arg0 - arg1.anInt5035) / 2;
		} else {
			arg1.anInt4973 = arg0 - arg1.anInt5035 - (arg1.anInt4968 * arg0 >> 14);
		}
		if (!Static110.aBoolean147 || Static75.method1604(arg1).anInt890 == 0 && arg1.anInt4966 != 0) {
			return;
		}
		if (arg1.anInt4973 < 0) {
			arg1.anInt4973 = 0;
		} else if (arg1.anInt4973 + arg1.anInt5035 > arg0) {
			arg1.anInt4973 = arg0 - arg1.anInt5035;
		}
		if (arg1.anInt5028 < 0) {
			arg1.anInt5028 = 0;
		} else if (arg2 < arg1.anInt5028 + arg1.anInt4994) {
			arg1.anInt5028 = arg2 - arg1.anInt4994;
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
	public static void method6179() {
		Static419.aClass223_4 = Static419.aClass223_3;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V")
	public static void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static472.anInt7503 && arg0 <= Static257.anInt4172) {
			@Pc(28) int local28 = Static385.method4989(Static73.anInt1542, arg2, Static527.anInt8177);
			@Pc(34) int local34 = Static385.method4989(Static73.anInt1542, arg1, Static527.anInt8177);
			Static145.method2541(local34, arg0, local28, arg3);
		}
	}
}
