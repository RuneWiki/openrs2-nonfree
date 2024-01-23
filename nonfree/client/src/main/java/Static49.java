import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ed", name = "fc", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ed", name = "lc", descriptor = "I")
	public static int anInt1274;

	@OriginalMember(owner = "client!ed", name = "Hc", descriptor = "Lclient!jb;")
	public static Class28 aClass28_22;

	@OriginalMember(owner = "client!ed", name = "Wb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_352 = Static231.method3737("level)2");

	@OriginalMember(owner = "client!ed", name = "ec", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!ed", name = "pc", descriptor = "Lclient!sc;")
	public static Class107 aClass107_353 = aClass107_352;

	@OriginalMember(owner = "client!ed", name = "qc", descriptor = "[I")
	public static int[] anIntArray123 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ed", name = "xc", descriptor = "I")
	public static int anInt1281 = 0;

	@OriginalMember(owner = "client!ed", name = "Ac", descriptor = "I")
	public static int anInt1284 = 1;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public static void method1015() {
		if (Static213.aClass87_1 != null) {
			@Pc(12) Class87 local12 = Static213.aClass87_1;
			synchronized (Static213.aClass87_1) {
				Static213.aClass87_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIZIII)V")
	public static void method1016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 < 128 || arg3 < 128 || arg1 > 13056 || arg3 > 13056) {
			Static99.anInt922 = -1;
			Static159.anInt3501 = -1;
			return;
		}
		@Pc(30) int local30 = Static130.method2174(Static191.anInt4237, arg3, arg1) - arg0;
		@Pc(34) int local34 = arg1 - Static22.anInt435;
		@Pc(38) int local38 = Class45.anIntArray159[Static6.anInt2981];
		@Pc(42) int local42 = Class45.anIntArray159[Static122.anInt2671];
		@Pc(46) int local46 = local30 - Static69.anInt1578;
		@Pc(50) int local50 = Class45.anIntArray156[Static6.anInt2981];
		@Pc(58) int local58 = Class45.anIntArray156[Static122.anInt2671];
		@Pc(62) int local62 = arg3 - Static29.anInt577;
		@Pc(73) int local73 = local42 * local62 + local34 * local58 >> 16;
		@Pc(84) int local84 = local62 * local58 - local34 * local42 >> 16;
		@Pc(86) int local86 = local73;
		@Pc(97) int local97 = local50 * local46 - local84 * local38 >> 16;
		@Pc(107) int local107 = local84 * local50 + local46 * local38 >> 16;
		if (local107 >= 50) {
			Static159.anInt3501 = arg2 + (local86 << 9) / local107;
			Static99.anInt922 = (local97 << 9) / local107 + arg4;
		} else {
			Static159.anInt3501 = -1;
			Static99.anInt922 = -1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([Lclient!o;ZIIII)V")
	public static void method1021(@OriginalArg(0) Class86[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class86 local14 = arg0[local8];
			if (local14 != null && arg2 == local14.anInt3225) {
				Static1.method51(arg4, arg1, local14, arg3);
				Static88.method1501(arg4, arg3, local14);
				if (local14.anInt3218 - local14.anInt3280 < local14.anInt3256) {
					local14.anInt3256 = local14.anInt3218 - local14.anInt3280;
				}
				if (local14.anInt3266 - local14.anInt3270 < local14.anInt3222) {
					local14.anInt3222 = local14.anInt3266 - local14.anInt3270;
				}
				if (local14.anInt3222 < 0) {
					local14.anInt3222 = 0;
				}
				if (local14.anInt3256 < 0) {
					local14.anInt3256 = 0;
				}
				if (local14.anInt3286 == 0) {
					Static160.method2582(local14, arg1);
				}
			}
		}
	}
}
