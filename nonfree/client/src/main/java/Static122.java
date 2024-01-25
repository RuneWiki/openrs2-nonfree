import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
	public static int anInt1355 = -1;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
	public static int anInt1360 = 100;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	public static void method1327() {
		if (Static268.aString50.length() == 0) {
			return;
		}
		Static160.method3015("--> " + Static268.aString50);
		Static268.method4842(false, Static268.aString50);
		Static260.anInt5193 = 0;
		Static188.anInt3801 = 0;
		Static268.aString50 = "";
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!fc;II)V")
	public static void method1328(@OriginalArg(0) Class54 arg0, @OriginalArg(2) int arg1) {
		if (Static275.aBoolean416) {
			arg1 = 0;
			Static275.aBoolean416 = false;
		}
		if (Static364.aClass54_2 != null && Static364.aClass54_2.method1782(arg0)) {
			return;
		}
		Static364.aClass54_2 = arg0;
		Static187.aLong137 = Static183.method3462();
		anInt1355 = arg1;
		Static148.anInt3115 = arg1;
		if (Static148.anInt3115 == 0) {
			Static53.method1330();
			return;
		}
		Static85.aClass13_2 = Static188.aClass13_3;
		Static133.anInt2878 = Static288.anInt5584;
		Static97.aFloat18 = Static338.aFloat63;
		Static118.aFloat21 = Static110.aFloat19;
		Static202.aFloat50 = Static16.aFloat8;
		Static162.anInt3333 = Static56.anInt1435;
		Static48.anInt2956 = Static215.anInt4291;
		Static73.aFloat10 = Static73.aFloat11;
		Static113.aFloat20 = Static243.aFloat53;
		Static265.aFloat57 = Static265.aFloat56;
	}
}
