import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	public static int anInt2640 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
	public static void method2423(@OriginalArg(0) int arg0) {
		if (arg0 == Static130.anInt2325) {
			return;
		}
		Static84.anInt1632 = Static261.anInt4480 = Static273.anIntArray408[arg0];
		Static268.method4098();
		Static91.anIntArrayArray20 = new int[Static84.anInt1632][Static261.anInt4480];
		Static265.anIntArrayArray38 = new int[Static84.anInt1632][Static261.anInt4480];
		Static1.anIntArrayArrayArray1 = new int[4][Static84.anInt1632 >> 3][Static261.anInt4480 >> 3];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static254.aClass61Array2[local36] = Static253.method3906(Static84.anInt1632, Static261.anInt4480);
		}
		Static193.aByteArrayArrayArray4 = new byte[4][Static84.anInt1632][Static261.anInt4480];
		Static175.method2755(Static84.anInt1632, Static261.anInt4480);
		Static328.method4699(Static84.anInt1632 >> 3, Static261.anInt4480 >> 3, Static44.aClass28_14);
		Static130.anInt2325 = arg0;
	}
}
