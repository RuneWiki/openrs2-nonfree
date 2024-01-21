import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "[Lclient!ca;")
	public static final Class16[] aClass16Array1 = new Class16[5000];

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_262 = Static187.method3089("Error loading your profile)3");

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_263 = Static187.method3089("(U2");

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_1 = new Class20();

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!vd;")
	public static Class92 aClass92_264 = aClass92_262;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_266 = Static187.method3089("Loading )2 please wait)3");

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!vd;")
	public static Class92 aClass92_265 = aClass92_266;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_267 = Static187.method3089("titlebutton");

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_268 = Static187.method3089("");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIILclient!vd;I)V")
	public static void method480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class11 local8 = Static173.method2744(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray25 != null) {
			@Pc(18) Class1_Sub24 local18 = new Class1_Sub24();
			local18.aClass11_18 = local8;
			local18.aClass92_1700 = arg2;
			local18.anObjectArray28 = local8.anObjectArray25;
			local18.anInt3514 = arg0;
			Static45.method810(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt315 > 0) {
			local36 = Static62.method1003(local8);
		}
		if (!local36 || !Static14.method255(arg0 - 1, Static195.method3194(local8))) {
			return;
		}
		if (arg0 == 1) {
			Static38.aClass1_Sub14_Sub1_3.method3067(148);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 2) {
			Static38.aClass1_Sub14_Sub1_3.method3067(45);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 3) {
			Static38.aClass1_Sub14_Sub1_3.method3067(189);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 4) {
			Static38.aClass1_Sub14_Sub1_3.method3067(149);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 5) {
			Static38.aClass1_Sub14_Sub1_3.method3067(191);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 6) {
			Static38.aClass1_Sub14_Sub1_3.method3067(64);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 7) {
			Static38.aClass1_Sub14_Sub1_3.method3067(228);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 8) {
			Static38.aClass1_Sub14_Sub1_3.method3067(151);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 9) {
			Static38.aClass1_Sub14_Sub1_3.method3067(216);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
		if (arg0 == 10) {
			Static38.aClass1_Sub14_Sub1_3.method3067(138);
			Static38.aClass1_Sub14_Sub1_3.method3032(arg3);
			Static38.aClass1_Sub14_Sub1_3.method3020(arg1);
		}
	}
}
