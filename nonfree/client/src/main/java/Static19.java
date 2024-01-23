import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!nc;")
	public static Class118 aClass118_3;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "S")
	public static short aShort1 = 32767;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!rf;IB)V")
	public static void method327(@OriginalArg(0) Class6_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt4515 > Static261.anInt5259) {
			Static245.method1011(arg0);
		} else if (arg0.anInt4559 >= Static261.anInt5259) {
			Static288.method4409(arg0);
		} else {
			Static38.method710(arg0);
		}
		if (arg0.anInt4562 < 128 || arg0.anInt4569 < 128 || arg0.anInt4562 >= 13184 || arg0.anInt4569 >= 13184) {
			arg0.anInt4572 = -1;
			arg0.anInt4580 = -1;
			arg0.anInt4515 = 0;
			arg0.anInt4559 = 0;
			arg0.anInt4562 = arg0.anIntArray519[0] * 128 + arg0.method3509() * 64;
			arg0.anInt4569 = arg0.anIntArray516[0] * 128 + arg0.method3509() * 64;
			arg0.method3506();
		}
		if (arg0 == Static28.aClass6_Sub6_Sub2_1 && (arg0.anInt4562 < 1536 || arg0.anInt4569 < 1536 || arg0.anInt4562 >= 11776 || arg0.anInt4569 >= 11776)) {
			arg0.anInt4580 = -1;
			arg0.anInt4515 = 0;
			arg0.anInt4559 = 0;
			arg0.anInt4572 = -1;
			arg0.anInt4562 = arg0.anIntArray519[0] * 128 + arg0.method3509() * 64;
			arg0.anInt4569 = arg0.anIntArray516[0] * 128 + arg0.method3509() * 64;
			arg0.method3506();
		}
		Static145.method2277(arg0);
		Static8.method184(arg0);
	}
}
