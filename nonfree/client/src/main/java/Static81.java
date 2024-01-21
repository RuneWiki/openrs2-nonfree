import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!oa", name = "sb", descriptor = "Z")
	public static boolean aBoolean114;

	@OriginalMember(owner = "client!oa", name = "vb", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_13;

	@OriginalMember(owner = "client!oa", name = "wb", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_20;

	@OriginalMember(owner = "client!oa", name = "ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1174 = Static80.method1463("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!oa", name = "bb", descriptor = "Lclient!a;")
	public static Class1 aClass1_4 = new Class1();

	@OriginalMember(owner = "client!oa", name = "lb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1176 = Static80.method1463("green:");

	@OriginalMember(owner = "client!oa", name = "cb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1175 = aClass63_1176;

	@OriginalMember(owner = "client!oa", name = "db", descriptor = "[I")
	public static int[] anIntArray249 = new int[5];

	@OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
	public static final int anInt2212 = 0;

	@OriginalMember(owner = "client!oa", name = "tb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1177 = aClass63_1176;

	@OriginalMember(owner = "client!oa", name = "ub", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1178 = Static80.method1463("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!oa", name = "yb", descriptor = "I")
	public static int anInt2220 = -1;

	@OriginalMember(owner = "client!oa", name = "zb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1179 = aClass63_1178;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public static void method1483() {
		Static88.aClass6_Sub4_Sub1_5.method1344();
		@Pc(13) int local13 = Static88.aClass6_Sub4_Sub1_5.method1349(8);
		@Pc(18) int local18;
		if (Static22.anInt689 > local13) {
			for (local18 = local13; local18 < Static22.anInt689; local18++) {
				Static89.anIntArray282[Static69.anInt2002++] = Static80.anIntArray247[local18];
			}
		}
		if (Static22.anInt689 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static22.anInt689 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(64) int local64 = Static80.anIntArray247[local18];
			@Pc(68) Class6_Sub3_Sub1_Sub2_Sub1 local68 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local64];
			@Pc(73) int local73 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
			if (local73 == 0) {
				Static80.anIntArray247[Static22.anInt689++] = local64;
				local68.anInt2324 = Static73.anInt2064;
			} else {
				@Pc(93) int local93 = Static88.aClass6_Sub4_Sub1_5.method1349(2);
				if (local93 == 0) {
					Static80.anIntArray247[Static22.anInt689++] = local64;
					local68.anInt2324 = Static73.anInt2064;
					Static112.anIntArray355[Static43.anInt129++] = local64;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local93 == 1) {
						Static80.anIntArray247[Static22.anInt689++] = local64;
						local68.anInt2324 = Static73.anInt2064;
						local135 = Static88.aClass6_Sub4_Sub1_5.method1349(3);
						local68.method1548(local135, false);
						local145 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
						if (local145 == 1) {
							Static112.anIntArray355[Static43.anInt129++] = local64;
						}
					} else if (local93 == 2) {
						Static80.anIntArray247[Static22.anInt689++] = local64;
						local68.anInt2324 = Static73.anInt2064;
						local135 = Static88.aClass6_Sub4_Sub1_5.method1349(3);
						local68.method1548(local135, true);
						local145 = Static88.aClass6_Sub4_Sub1_5.method1349(3);
						local68.method1548(local145, true);
						@Pc(199) int local199 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
						if (local199 == 1) {
							Static112.anIntArray355[Static43.anInt129++] = local64;
						}
					} else if (local93 == 3) {
						Static89.anIntArray282[Static69.anInt2002++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
	public static void method1486() {
		aClass1_4 = null;
		anIntArray249 = null;
		aClass63_1174 = null;
		aClass63_1178 = null;
		aClass63_1177 = null;
		aClass7_Sub1_13 = null;
		aClass6_Sub3_Sub3_Sub3_20 = null;
		aClass63_1175 = null;
		aClass63_1176 = null;
		aClass63_1179 = null;
	}
}
