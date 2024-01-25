import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
	public static void method6649() {
		Static100.aClass136_22.method3476();
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)V")
	public static void method6651(@OriginalArg(0) int arg0) {
		if (Static287.anInt5401 == arg0) {
			return;
		}
		Static473.anInt8075 = Static165.anInt6749 = Static552.anIntArray695[arg0];
		Static417.method5980();
		Static181.anIntArrayArray23 = new int[Static473.anInt8075][Static165.anInt6749];
		Static86.anIntArrayArray14 = new int[Static473.anInt8075][Static165.anInt6749];
		Static553.anIntArrayArrayArray20 = new int[4][Static473.anInt8075 >> 3][Static165.anInt6749 >> 3];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static579.aClass189Array4[local46] = Static385.method5691(Static473.anInt8075, Static165.anInt6749);
		}
		Static273.aByteArrayArrayArray19 = new byte[4][Static473.anInt8075][Static165.anInt6749];
		Static302.method4795(Static165.anInt6749, Static473.anInt8075);
		Static484.method6660(Static473.anInt8075 >> 3, Static240.aClass14_7, Static165.anInt6749 >> 3);
		Static287.anInt5401 = arg0;
	}
}
