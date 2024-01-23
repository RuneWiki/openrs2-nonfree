import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	public static int anInt3453 = 0;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
	public static int anInt3454 = 0;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1223 = Static64.method1101("");

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)V")
	public static void method2697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].anInt1126 = arg3;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([[II)V")
	public static void method2698(@OriginalArg(0) int[][] arg0) {
		Static113.anIntArrayArray10 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
	public static void method2699() {
		Static135.aClass53_21.method1496(5);
		Static68.aClass53_13.method1496(5);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public static void method2700() {
		Static39.aClass24_1.method1678();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static14.aLongArray1[local10] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static125.aLongArray10[local27] = 0L;
		}
		Static201.anInt4262 = 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(DI)V")
	public static void method2701(@OriginalArg(0) double arg0) {
		if (arg0 == Static63.aDouble2) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static193.anIntArray314[local7] = local19 <= 255 ? local19 : 255;
		}
		Static63.aDouble2 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIIII)V")
	public static void method2702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static187.aClass41Array8[0].method969(arg4, arg3);
		Static187.aClass41Array8[1].method969(arg4, arg3 + arg2 - 16);
		@Pc(28) int local28 = (arg2 - 32) * arg2 / arg0;
		if (local28 < 8) {
			local28 = 8;
		}
		@Pc(52) int local52 = arg1 * (arg2 - local28 - 32) / (arg0 - arg2);
		Static96.method1623(arg4, arg3 + 16, 16, arg2 - 32, Static41.anInt978);
		Static96.method1623(arg4, arg3 + local52 + 16, 16, local28, Static36.anInt854);
		Static96.method1627(arg4, local52 + arg3 + 16, local28, Static31.anInt704);
		Static96.method1627(arg4 + 1, arg3 + 16 - -local52, local28, Static31.anInt704);
		Static96.method1622(arg4, arg3 + local52 + 16, 16, Static31.anInt704);
		Static96.method1622(arg4, local52 + arg3 + 17, 16, Static31.anInt704);
		Static96.method1627(arg4 + 15, local52 + arg3 - -16, local28, Static103.anInt4834);
		Static96.method1627(arg4 + 14, local52 + 17 + arg3, local28 - 1, Static103.anInt4834);
		Static96.method1622(arg4, local28 + arg3 + local52 + 15, 16, Static103.anInt4834);
		Static96.method1622(arg4 + 1, local52 + arg3 + 14 + local28, 15, Static103.anInt4834);
	}
}
