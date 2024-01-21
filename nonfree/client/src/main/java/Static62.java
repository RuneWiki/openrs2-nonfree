import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Lclient!rh;")
	public static Class77 aClass77_9;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "[I")
	public static int[] anIntArray126 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_520 = Static120.method2057("gelb:");

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_521 = Static120.method2057("Versteckt");

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public static void method1107() {
		@Pc(7) int local7 = Static48.anInt3638;
		@Pc(9) int local9 = Static110.anInt2512;
		@Pc(11) int local11 = Static100.anInt2176;
		@Pc(13) int local13 = Static61.anInt1539;
		Static4.method2572(local7, local11, local9, local13, 6116423);
		Static4.method2572(local7 + 1, local11 + 1, local9 - 2, 16, 0);
		Static4.method2563(local7 + 1, local11 - -18, local9 - 2, local13 - 19, 0);
		Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1949(Static132.aClass81_1036, local7 + 3, local11 + 14, 6116423, -1);
		@Pc(60) int local60 = Static36.anInt973;
		@Pc(62) int local62 = Static172.anInt3997;
		for (@Pc(68) int local68 = 0; local68 < Static118.anInt2616; local68++) {
			@Pc(82) int local82 = (Static118.anInt2616 - local68 - 1) * 15 + local11 + 31;
			@Pc(84) int local84 = 16777215;
			if (local60 > local7 && local60 < local7 + local9 && local82 - 13 < local62 && local82 + 3 > local62) {
				local84 = 16776960;
			}
			Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1949(Static185.method2991(local68), local7 + 3, local82, local84, 0);
		}
		Static24.method527(Static110.anInt2512, Static61.anInt1539, Static48.anInt3638, Static100.anInt2176);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	public static void method1108() {
		aClass77_9 = null;
		anIntArray126 = null;
		aClass81_521 = null;
		anIntArray127 = null;
		aClass81_520 = null;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public static void method1109() {
		@Pc(8) int[] local8 = new int[Static12.anInt4130];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static12.anInt4130; local12++) {
			@Pc(20) Class1_Sub2_Sub12 local20 = Static54.method969(local12);
			if (local20.anInt2416 >= 0 || local20.anInt2380 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static176.anIntArray424 = new int[local10];
		for (@Pc(47) int local47 = 0; local47 < local10; local47++) {
			Static176.anIntArray424[local47] = local8[local47];
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
	public static void method1110() {
		Static50.aBoolean45 = false;
		Static33.aBoolean30 = false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZZZ)I")
	public static int method1111() {
		return Static66.anInt1658 + Static6.anInt149;
	}
}
