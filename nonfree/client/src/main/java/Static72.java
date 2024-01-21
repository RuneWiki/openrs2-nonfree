import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public static int anInt2240;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt2244;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!ad;")
	public static Class4 aClass4_8 = new Class4();

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	public static int anInt2243 = 0;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_713 = Static49.method1293("event_opbase");

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	public static int anInt2246 = 0;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!rf;")
	private static Class70 aClass70_715 = Static49.method1293("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_714 = aClass70_715;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!rf;")
	public static Class70 aClass70_716 = Static49.method1293("<col=40ff00>");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Lclient!rf;")
	public static Class70 method1656(@OriginalArg(1) int arg0) {
		@Pc(9) Class70 local9 = Static34.method873(arg0);
		for (@Pc(20) int local20 = local9.method2896() - 3; local20 > 0; local20 -= 3) {
			local9 = Static160.method3210(new Class70[] { local9.method2903(local20, 0), Static48.aClass70_523, local9.method2906(local20) });
		}
		if (local9.method2896() > 9) {
			return Static160.method3210(new Class70[] { Static152.aClass70_690, local9.method2903(local9.method2896() - 8, 0), Static100.aClass70_927, Static139.aClass70_1241, local9, Static185.aClass70_1602 });
		} else if (local9.method2896() > 6) {
			return Static160.method3210(new Class70[] { Static112.aClass70_1469, local9.method2903(local9.method2896() - 4, 0), Static30.aClass70_325, Static139.aClass70_1241, local9, Static185.aClass70_1602 });
		} else {
			return Static160.method3210(new Class70[] { Static168.aClass70_720, local9, Static34.aClass70_368 });
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!rf;I)Z")
	public static boolean method1658(@OriginalArg(0) Class70 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static25.anInt695; local16++) {
			if (arg0.method2905(Static51.aClass70Array8[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1659() {
		aClass70_716 = null;
		aClass70_714 = null;
		aClass4_8 = null;
		aClass70_713 = null;
		aClass70_715 = null;
	}
}
