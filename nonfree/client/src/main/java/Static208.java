import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static208 {

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public static int anInt4072;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
	public static boolean aBoolean248 = true;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)I")
	public static int method3283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg1 >> 2 << 10) + (arg0 >> 1));
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V")
	public static void method3284(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static47.method938();
		} else if (arg0 == 2) {
			Static8.method119();
		} else if (arg0 == 3) {
			Static121.method2007();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method3285(@OriginalArg(1) Class22 arg0) {
		Static261.aClass22_88 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method3287() {
		Static282.aClass172_45.method4350();
		Static144.aClass172_24.method4350();
	}
}
