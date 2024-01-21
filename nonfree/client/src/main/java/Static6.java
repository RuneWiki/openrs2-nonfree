import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public static int anInt1427;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_7;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	public static int anInt1431;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_396 = Static38.method685("Neuer Benutzer");

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_397 = Static38.method685("mapdots");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method927() {
		aClass6_396 = null;
		aClass6_397 = null;
		aClass10_Sub1_7 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)I")
	public static int method928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 2 << 10) + (arg1 >> 5 << 7) + (arg0 >> 1);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method930(@OriginalArg(0) Class10 arg0) {
		Static41.aClass10_45 = arg0;
		Static5.anInt88 = Static41.aClass10_45.method1588(16);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!ai;BLclient!ai;)V")
	public static void method932(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(3) Class6 arg2) {
		Static177.method2771(null, arg2, arg1, arg0);
	}
}
