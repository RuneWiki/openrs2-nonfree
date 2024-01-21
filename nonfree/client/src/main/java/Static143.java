import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1351 = Static193.method3027("skill)2");

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
	public static int anInt2933 = 1;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1352 = Static193.method3027("Login limit exceeded)3");

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1353 = Static193.method3027("cookiehost");

	@OriginalMember(owner = "client!od", name = "jb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1354 = aClass70_1351;

	@OriginalMember(owner = "client!od", name = "lb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1355 = aClass70_1352;

	@OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
	public static int anInt2941 = 0;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIII)V")
	public static void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static119.anInt2428 && Static200.anInt4074 >= arg3) {
			@Pc(15) int local15 = Static130.method1827(Static52.anInt1117, arg0, Static26.anInt554);
			@Pc(21) int local21 = Static130.method1827(Static52.anInt1117, arg2, Static26.anInt554);
			Static62.method946(arg3, local15, local21, arg1);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)I")
	public static int method2083(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)Lclient!oc;")
	public static Class70 method2084(@OriginalArg(1) int arg0) {
		@Pc(3) Class70 local3 = Static107.method2404(arg0);
		for (@Pc(20) int local20 = local3.method2045() - 3; local20 > 0; local20 -= 3) {
			local3 = Static207.method3296(new Class70[] { local3.method2023(local20, 0), Static136.aClass70_1286, local3.method2019(local20) });
		}
		if (local3.method2045() > 9) {
			return Static207.method3296(new Class70[] { Static163.aClass70_1595, local3.method2023(local3.method2045() - 8, 0), Static209.aClass70_2086, Static186.aClass70_1840, local3, Static109.aClass70_1088 });
		} else if (local3.method2045() > 6) {
			return Static207.method3296(new Class70[] { Static58.aClass70_583, local3.method2023(local3.method2045() - 4, 0), Static121.aClass70_1175, Static186.aClass70_1840, local3, Static109.aClass70_1088 });
		} else {
			return Static207.method3296(new Class70[] { Static169.aClass70_1634, local3, Static17.aClass70_167 });
		}
	}
}
