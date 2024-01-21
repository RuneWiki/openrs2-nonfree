import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!sd;")
	public static Class60 aClass60_14;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public static int anInt1604 = 0;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_971 = Static118.method2249(" ");

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "[I")
	public static final int[] anIntArray156 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!oc;")
	public static Class65 aClass65_972 = aClass65_971;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_973 = Static118.method2249("mapfunction");

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_974 = Static118.method2249("blinken3:");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!oc;B)V")
	public static void method1098(@OriginalArg(0) Class65 arg0) {
		if (Static153.aClass14_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(17) Class65 local17 = Static59.aClass65_955.method2448(Static153.aClass14_3.anApplet1);
			@Pc(23) Class65 local23 = Static135.aClass65_1869.method2448(Static153.aClass14_3.anApplet1);
			@Pc(48) Class65 local48 = Static109.method2004(new Class65[] { local17, Static181.aClass65_2430, arg0, Static191.aClass65_2472, local23 });
			if (arg0.method2482() == 0) {
				local48 = Static109.method2004(new Class65[] { local48, Static141.aClass65_1974 });
			} else {
				local48 = Static109.method2004(new Class65[] { local48, Static41.aClass65_682, Static39.method688(Static190.method3141() + 94608000000L), Static112.aClass65_1587, Static134.method2560(94608000L) });
			}
			Static109.method2004(new Class65[] { Static43.aClass65_701, local48, Static30.aClass65_614 }).method2478(Static153.aClass14_3.anApplet1);
		} catch (@Pc(124) Throwable local124) {
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	public static void method1102() {
		Static25.aClass87_14.method3061();
		Static92.aClass87_38.method3061();
	}
}
