import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!gk", name = "F", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!gk", name = "G", descriptor = "Lclient!kr;")
	public static Class46 aClass46_9;

	@OriginalMember(owner = "client!gk", name = "H", descriptor = "Lclient!iq;")
	public static Class104 aClass104_72;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_81 = new Class221(35, 2);

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	public static void method2164() {
		Static258.aClass107_37.method3015();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public static void method2165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(16, arg0);
		local8.method1801();
		local8.anInt1723 = arg1;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)I")
	public static int method2168(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)Lclient!tj;")
	public static Class2_Sub9_Sub20 method2169(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub9_Sub20 local10 = (Class2_Sub9_Sub20) Static198.aClass144_7.method4186((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static17.aClass104_12.method2756(19, arg0);
		local10 = new Class2_Sub9_Sub20();
		if (local28 != null) {
			local10.method5211(new Class2_Sub12(local28));
		}
		Static198.aClass144_7.method4188((long) arg0, local10);
		return local10;
	}
}
