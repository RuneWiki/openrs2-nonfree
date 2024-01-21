import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2106 = Static193.method3027("Sep");

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2107 = Static193.method3027("Apr");

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2108 = Static193.method3027("Jan");

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2109 = Static193.method3027("Jul");

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2114 = Static193.method3027("Feb");

	@OriginalMember(owner = "client!eg", name = "T", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2118 = Static193.method3027("Mar");

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2113 = Static193.method3027("May");

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2111 = Static193.method3027("Jun");

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2119 = Static193.method3027("Aug");

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2116 = Static193.method3027("Oct");

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2115 = Static193.method3027("Nov");

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2110 = Static193.method3027("Dec");

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array78 = new Class70[] { aClass70_2108, aClass70_2114, aClass70_2118, aClass70_2107, aClass70_2113, aClass70_2111, aClass70_2109, aClass70_2119, aClass70_2106, aClass70_2116, aClass70_2115, aClass70_2110 };

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2117 = Static193.method3027("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2112 = aClass70_2117;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "Lclient!ih;")
	public static final Class3_Sub4_Sub1 aClass3_Sub4_Sub1_43 = new Class3_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2120 = Static193.method3027("welle2:");

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2121 = Static193.method3027("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
	public static void method3327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static104.method3092(arg0, arg1, arg2 + arg0, arg1 + arg3);
		Static177.method2768();
		Static104.method3079(arg0, arg1, arg2, arg3, 0);
		if (Static114.anInt2300 < 100) {
			return;
		}
		Static181.method2817(Static50.anInt1046, Static65.anInt1364, 0, arg0 + arg2, arg3 + arg1, 0, arg1, arg0);
		@Pc(55) int local55 = Static15.anInt342 * arg2 / Static65.anInt1364 + arg0;
		@Pc(63) int local63 = arg1 + arg3 * Static136.anInt2772 / Static50.anInt1046;
		@Pc(69) int local69 = Static199.anInt4051 * arg2 / Static65.anInt1364;
		@Pc(75) int local75 = arg3 * Static85.anInt1691 / Static50.anInt1046;
		Static104.method3087(local55, local63, local69, local75, 16711680, 128);
		Static104.method3097(local55, local63, local69, local75, 16711680);
		if (Static90.anInt1789 <= 0 || Static90.anInt1789 % 10 >= 5) {
			return;
		}
		for (@Pc(103) Class3_Sub9 local103 = (Class3_Sub9) Static186.aClass10_111.method267(); local103 != null; local103 = (Class3_Sub9) Static186.aClass10_111.method268()) {
			if (Static98.anInt2025 == local103.anInt1405) {
				@Pc(119) int local119 = arg1 + arg3 * local103.anInt1403 / Static50.anInt1046;
				@Pc(128) int local128 = arg0 + arg2 * local103.anInt1406 / Static65.anInt1364;
				Static104.method3079(local128 - 2, local119 + -2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public static void method3330() {
		if (Static29.aClass56_2 != null) {
			Static29.aClass56_2.method2457();
		}
		if (Static18.aClass56_1 != null) {
			Static18.aClass56_1.method2457();
		}
	}
}
