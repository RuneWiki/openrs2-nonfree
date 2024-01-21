import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!cb", name = "ub", descriptor = "I")
	public static int anInt513;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "Lclient!ff;")
	public static Class3_Sub12 aClass3_Sub12_3 = new Class3_Sub12(8);

	@OriginalMember(owner = "client!cb", name = "tb", descriptor = "I")
	public static int anInt512 = 500;

	@OriginalMember(owner = "client!cb", name = "vb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_287 = Static122.method531("Loaded update list");

	@OriginalMember(owner = "client!cb", name = "wb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_288 = aClass73_287;

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "[I")
	public static int[] anIntArray47 = new int[100];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lclient!sd;I)Lclient!sd;")
	public static Class73 method372(@OriginalArg(0) Class73[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static61.method1114(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
	public static void method377() {
		Static33.method609();
		Static66.method1183();
		Static10.method180();
		Static135.method2233();
		Static34.method616();
		Static72.method1262();
		Static33.method612();
		Static29.method568();
		Static51.method946();
		Static82.method1414();
		Static163.method2271();
		Static58.method1013();
		((Class53) Static36.anInterface1_2).method1727();
		Static109.aClass7_18.method190();
		Static150.aClass13_Sub1_19.method363();
		Static153.aClass13_Sub1_18.method363();
		Static57.aClass13_Sub1_6.method363();
		Static129.aClass13_Sub1_16.method363();
		Static125.aClass13_Sub1_15.method363();
		Static11.aClass13_Sub1_4.method363();
		Static86.aClass13_Sub1_10.method363();
		Static3.aClass13_Sub1_1.method363();
		Static58.aClass13_Sub1_7.method363();
		Static16.aClass13_Sub1_5.method363();
		Static117.aClass13_Sub1_13.method363();
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V")
	public static void method379() {
		aShortArrayArray2 = null;
		aClass73_288 = null;
		aClass73_287 = null;
		anIntArray47 = null;
		aClass3_Sub12_3 = null;
	}
}
