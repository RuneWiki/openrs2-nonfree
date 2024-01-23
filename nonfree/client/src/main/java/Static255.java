import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public static int anInt4618;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Lclient!nk;")
	public static Class121 aClass121_113;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "[Lclient!kg;")
	public static Class91[] aClass91Array2;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	public static volatile int anInt4623 = 0;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
	public static int anInt4630 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public static void method4047() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static197.aBooleanArray15[local3] = false;
		}
		Static201.anInt3866 = -1;
		Static71.anInt1521 = 0;
		Static167.anInt3292 = 1;
		Static155.anInt3076 = 0;
		Static143.anInt2865 = -1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4048(@OriginalArg(0) boolean arg0) {
		@Pc(5) boolean local5 = Static177.method2959();
		if (local5 == arg0) {
			return true;
		}
		if (!arg0) {
			Static177.method2953();
		} else if (!Static177.method2955() || !Static177.method2960() || !Static177.method2961()) {
			arg0 = false;
		}
		Static36.aBoolean28 = arg0;
		Static286.method4396(Static26.aClass154_1);
		if (local5 == arg0) {
			return false;
		} else {
			((Class30_Sub1) Static215.anInterface5_1).method797();
			return true;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)V")
	public static void method4050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "::tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local40);
		Static40.method4536(local40);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	public static void method4051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static218.aBoolean71 = true;
		Static187.anInt3573 = arg0;
		Static229.anInt4204 = arg1;
		Static75.anInt1563 = arg2;
		Static66.anInt4309 = -1;
		Static183.anInt3499 = -1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lclient!ia;")
	public static Class71 method4052(@OriginalArg(1) int arg0) {
		@Pc(10) Class71 local10 = (Class71) Static179.aClass187_92.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static130.aClass121_61.method3115(Static8.method119(arg0), Static166.method2834(arg0));
		local10 = new Class71();
		local10.anInt2388 = arg0;
		if (local26 != null) {
			local10.method2041(new Class1_Sub14(local26));
		}
		local10.method2025();
		if (!Static104.aBoolean115 && local10.aBoolean139) {
			local10.aStringArray19 = null;
		}
		if (local10.aBoolean140) {
			local10.aBoolean152 = false;
			local10.anInt2393 = 0;
		}
		Static179.aClass187_92.method4524((long) arg0, local10);
		return local10;
	}
}
