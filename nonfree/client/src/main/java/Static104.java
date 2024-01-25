import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static104 {

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "[B")
	public static final byte[] aByteArray11 = new byte[2048];

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_34 = new Class146(35, -1);

	@OriginalMember(owner = "client!fb", name = "xb", descriptor = "[I")
	public static final int[] anIntArray148 = new int[13];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!pf;)V")
	public static void method1542(@OriginalArg(1) Class20_Sub7 arg0) {
		arg0.aClass8_Sub3_Sub1_1 = null;
		if (Static1.anInt6 < 20) {
			Static344.aClass248_7.method5585(arg0);
			Static1.anInt6++;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
	public static int method1546(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!vh;IIII)V")
	public static void method1549(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static371.method4765(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static81.anInt1606) {
			Static371.method4765(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static371.method4765(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static18.anInt297) {
			Static371.method4765(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static18.anInt297) {
			Static371.method4765(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static81.anInt1606 && arg4 <= Static18.anInt297) {
			Static371.method4765(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static371.method4765(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static81.anInt1606 && arg4 > 0) {
			Static371.method4765(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)I")
	public static int method1553(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
