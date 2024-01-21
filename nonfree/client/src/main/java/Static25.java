import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_252 = Static193.method3027("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public static int anInt535 = 0;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array10 = new Class70[100];

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public static int anInt537 = 0;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public static int anInt541 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Lclient!oc;")
	public static Class70 method461(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static107.method2404(arg0) : Static146.aClass70_1398;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!oc;)V")
	public static void method463(@OriginalArg(1) Class70 arg0) {
		Static71.aClass70_670 = arg0;
		Static182.method2847();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Z")
	public static boolean method465(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!oc;II)V")
	public static void method466(@OriginalArg(0) Class70 arg0, @OriginalArg(2) int arg1) {
		Static93.aClass3_Sub4_Sub1_18.method1298(210);
		Static93.aClass3_Sub4_Sub1_18.method1292(arg1);
		Static93.aClass3_Sub4_Sub1_18.method1287(arg0.method2018());
	}
}
