import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public static int anInt1937 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	public static void method1873(@OriginalArg(0) int arg0) {
		if (Static241.anInt4622 == arg0) {
			return;
		}
		Static380.anInt6689 = Static542.anInt9214 = Static420.anIntArray367[arg0];
		Static365.method5498();
		Static47.anIntArrayArray8 = new int[Static380.anInt6689][Static542.anInt9214];
		Static646.anIntArrayArrayArray20 = new int[4][Static380.anInt6689 >> 3][Static542.anInt9214 >> 3];
		Static544.anIntArrayArray57 = new int[Static380.anInt6689][Static542.anInt9214];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static40.aClass289Array1[local42] = Static269.method8946(Static542.anInt9214, Static380.anInt6689);
		}
		Static436.aByteArrayArrayArray11 = new byte[4][Static380.anInt6689][Static542.anInt9214];
		Static146.method2170(Static542.anInt9214, Static380.anInt6689);
		Static226.method5054(Static380.anInt6689 >> 3, Static542.anInt9214 >> 3, Static103.aClass144_3);
		Static241.anInt4622 = arg0;
	}
}
