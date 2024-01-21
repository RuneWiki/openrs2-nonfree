import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int anInt427;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!oc;")
	public static Class34 aClass34_12;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!ba;")
	public static Class5 aClass5_13 = new Class5(64);

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_254 = Static15.method178("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!gd;")
	private static Class23 aClass23_255 = Static15.method178("Loaded interfaces");

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_256 = aClass23_255;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_257 = Static15.method178("mapdots");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	public static int anInt428 = 0;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_258 = aClass23_254;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	public static int anInt429 = 0;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_259 = Static15.method178("null");

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_260 = Static15.method178("null");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method231(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static7.aClass14_2.method343((long) arg0);
		if (local10 != null) {
			local10.method1913();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[Lclient!gd;)Lclient!gd;")
	public static Class23 method233(@OriginalArg(1) Class23[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static109.method1861(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method234() {
		aClass34_12 = null;
		client.anIntArray63 = null;
		aClass5_13 = null;
		aClass23_259 = null;
		aClass23_256 = null;
		aClass23_255 = null;
		aClass23_260 = null;
		aClass23_254 = null;
		aClass23_258 = null;
		aClass23_257 = null;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method236() {
		if (Static61.anInt1884 == 0) {
			return;
		}
		@Pc(10) Class1_Sub1_Sub6_Sub2 local10 = Static112.aClass1_Sub1_Sub6_Sub2_14;
		@Pc(12) int local12 = 0;
		if (Static66.anInt1971 != 0) {
			local12 = 1;
		}
		for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
			if (Static26.aClass23Array8[local18] != null) {
				@Pc(28) int local28 = Static43.anIntArray172[local18];
				@Pc(30) byte local30 = 0;
				@Pc(34) Class23 local34 = Static7.aClass23Array3[local18];
				if (local34 != null && local34.method546(Static8.aClass23_159)) {
					local30 = 1;
					local34 = local34.method510(5);
				}
				if (local34 != null && local34.method546(Static46.aClass23_850)) {
					local34 = local34.method510(5);
					local30 = 2;
				}
				@Pc(98) int local98;
				if ((local28 == 3 || local28 == 7) && (local28 == 7 || Static77.anInt2097 == 0 || Static77.anInt2097 == 1 && Static57.method1100(local34))) {
					local98 = 329 - local12 * 13;
					local10.method836(Static83.aClass23_1304, 4, local98, 0);
					local12++;
					local10.method836(Static83.aClass23_1304, 4, local98 - 1, 65535);
					@Pc(119) int local119 = local10.method850(Static83.aClass23_1304) + 4;
					local119 += local10.method833(32);
					if (local30 == 1) {
						Static45.aClass1_Sub1_Sub6_Sub3Array5[0].method1194(local119, local98 - 12);
						local119 += 14;
					}
					if (local30 == 2) {
						Static45.aClass1_Sub1_Sub6_Sub3Array5[1].method1194(local119, local98 - 12);
						local119 += 14;
					}
					local10.method836(method233(new Class23[] { local34, Static7.aClass23_143, Static26.aClass23Array8[local18] }), local119, local98, 0);
					local10.method836(method233(new Class23[] { local34, Static7.aClass23_143, Static26.aClass23Array8[local18] }), local119, local98 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
				if (local28 == 5 && Static77.anInt2097 < 2) {
					local98 = 329 - local12 * 13;
					local10.method836(Static26.aClass23Array8[local18], 4, local98, 0);
					local10.method836(Static26.aClass23Array8[local18], 4, local98 - 1, 65535);
					local12++;
					if (local12 >= 5) {
						return;
					}
				}
				if (local28 == 6 && Static77.anInt2097 < 2) {
					local98 = 329 - local12 * 13;
					local12++;
					local10.method836(method233(new Class23[] { Static92.aClass23_1708, Static10.aClass23_172, local34, Static7.aClass23_143, Static26.aClass23Array8[local18] }), 4, local98, 0);
					local10.method836(method233(new Class23[] { Static92.aClass23_1708, Static10.aClass23_172, local34, Static7.aClass23_143, Static26.aClass23Array8[local18] }), 4, local98 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
			}
		}
	}
}
