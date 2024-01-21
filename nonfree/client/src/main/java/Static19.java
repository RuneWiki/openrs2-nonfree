import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_10;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array9;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!c;")
	public static Class10 aClass10_2 = new Class10();

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	public static final int anInt1159 = 20;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_493 = Static134.method2017("Sprites geladen)3");

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!v;")
	private static Class76 aClass76_494 = Static134.method2017("To play on this world move to a free area first");

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_495 = aClass76_494;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_496 = Static134.method2017("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method786() {
		aCalendar2 = null;
		aClass17_Sub1_10 = null;
		aClass10_2 = null;
		aClass76Array9 = null;
		aClass76_495 = null;
		aClass76_494 = null;
		aClass76_496 = null;
		anIntArray132 = null;
		aClass76_493 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBII)V")
	public static void method787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static115.aClass4_Sub4_Sub5_Sub4Array12[0].method1836(arg3, arg2);
		Static115.aClass4_Sub4_Sub5_Sub4Array12[1].method1836(arg3, arg2 + arg4 - 16);
		@Pc(24) int local24 = (arg4 - 32) * arg4 / arg1;
		if (local24 < 8) {
			local24 = 8;
		}
		Static46.method1823(arg3, arg2 + 16, 16, arg4 - 32, Static13.anInt227);
		@Pc(61) int local61 = arg0 * (arg4 - local24 - 32) / (arg1 - arg4);
		Static46.method1823(arg3, arg2 + local61 + 16, 16, local24, Static105.anInt2345);
		Static46.method1827(arg3, local61 + arg2 + 16, local24, Static102.anInt2311);
		Static46.method1827(arg3 + 1, arg2 + 16 + local61, local24, Static102.anInt2311);
		Static46.method1833(arg3, arg2 + local61 + 16, 16, Static102.anInt2311);
		Static46.method1833(arg3, local61 + arg2 + 17, 16, Static102.anInt2311);
		Static46.method1827(arg3 + 15, local61 + arg2 + 16, local24, Static65.anInt421);
		Static46.method1827(arg3 + 14, local61 + 17 + arg2, local24 - 1, Static65.anInt421);
		Static46.method1833(arg3, local24 + local61 + arg2 + 15, 16, Static65.anInt421);
		Static46.method1833(arg3 + 1, local24 + local61 + 14 + arg2, 15, Static65.anInt421);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)Z")
	public static boolean method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static54.aClass81_10.method1982(Static124.anInt2712, arg0, arg2, arg1);
		@Pc(18) int local18 = arg1 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(29) int local29 = local12 >> 6 & 0x3;
		@Pc(33) int local33 = local12 & 0x1F;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(74) Class4_Sub4_Sub8 local74 = Static104.method1600(local18);
			@Pc(87) int local87;
			@Pc(90) int local90;
			if (local29 == 0 || local29 == 2) {
				local90 = local74.anInt1505;
				local87 = local74.anInt1498;
			} else {
				local87 = local74.anInt1505;
				local90 = local74.anInt1498;
			}
			@Pc(101) int local101 = local74.anInt1506;
			if (local29 != 0) {
				local101 = (local101 << local29 & 0xF) + (local101 >> 4 - local29);
			}
			Static68.method1136(0, local101, arg0, 0, local87, true, arg2, local90, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
		} else {
			Static68.method1136(local29, 0, arg0, local33 + 1, 0, true, arg2, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
		}
		Static118.anInt2555 = 2;
		Static60.anInt1572 = Static20.anInt427;
		Static60.anInt1573 = 0;
		Static10.anInt204 = Static75.anInt1928;
		return true;
	}
}
