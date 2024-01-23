import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString149 = "Loading - please wait.";

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt2485 = 0;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	public static void method1848() {
		Static173.aClass89_24.method2273(5);
		Static135.aClass89_17.method2273(5);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
	public static void method1849(@OriginalArg(0) int arg0) {
		Static287.aFloatArray30[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static287.aFloatArray30[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static287.aFloatArray30[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static11.method305(3);
		Static11.method305(4);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)I")
	public static int method1850(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}
}
