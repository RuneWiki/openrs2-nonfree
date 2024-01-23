import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public static int anInt4453 = 0;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!qe;")
	private static Class78 aClass78_760 = Static199.method3560("Members object");

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_759 = aClass78_760;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "I")
	public static int anInt4455 = -1;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!oe;Lclient!oe;)V")
	public static void method3534(@OriginalArg(1) Class72 arg0, @OriginalArg(2) Class72 arg1) {
		Static156.aClass72_215 = arg1;
		Static67.aClass72_60 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)Z")
	public static boolean method3535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static209.method3067(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static201.method3570(local10 + 1, Static144.anIntArrayArrayArray7[arg0][arg1][arg2] + arg3, local14 + 1) && Static201.method3570(local10 + 128 - 1, Static144.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static201.method3570(local10 + 128 - 1, Static144.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static201.method3570(local10 + 1, Static144.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BIIII)V")
	public static void method3536(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static101.anInt2213 = arg1;
		Static6.anInt187 = 0;
		Static73.anInt1576 = 0;
		Static137.anInt3137 = arg0;
	}
}
