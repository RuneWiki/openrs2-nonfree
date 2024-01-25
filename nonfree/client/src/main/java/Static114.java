import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_1 = new Class208(14, 1);

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_2 = new Class208(15, 4);

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_3 = new Class208(16, -2);

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_4 = new Class208(17, 0);

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_5 = new Class208(18, -2);

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_6 = new Class208(19, -2);

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_7 = new Class208(20, 6);

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_8 = new Class208(21, 9);

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_9 = new Class208(22, -2);

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_10 = new Class208(23, 4);

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_11 = new Class208(24, -1);

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "Lclient!ri;")
	public static final Class208 aClass208_12 = new Class208(25, -2);

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_75 = new Class107(13, 0);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	public static void method2107() {
		Static408.method5469(Static455.aClass251_14);
		Static290.anInt5067++;
		if (Static16.aBoolean13 && Static281.aBoolean419) {
			@Pc(28) int local28 = Static125.aClass114_1.method2701();
			@Pc(32) int local32 = Static125.aClass114_1.method2698();
			local32 -= Static296.anInt5168;
			local28 -= Static369.anInt6061;
			if (local28 < Static131.anInt2627) {
				local28 = Static131.anInt2627;
			}
			if (Static131.anInt2627 + Static377.aClass251_10.anInt6687 < local28 - -Static455.aClass251_14.anInt6687) {
				local28 = Static377.aClass251_10.anInt6687 + Static131.anInt2627 - Static455.aClass251_14.anInt6687;
			}
			if (Static401.anInt6424 > local32) {
				local32 = Static401.anInt6424;
			}
			if (local32 + Static455.aClass251_14.anInt6677 > Static401.anInt6424 + Static377.aClass251_10.anInt6677) {
				local32 = Static401.anInt6424 + Static377.aClass251_10.anInt6677 - Static455.aClass251_14.anInt6677;
			}
			@Pc(103) int local103 = local28 + Static377.aClass251_10.anInt6678 - Static131.anInt2627;
			@Pc(111) int local111 = local32 + Static377.aClass251_10.anInt6741 - Static401.anInt6424;
			@Pc(126) Class1_Sub24 local126;
			if (Static125.aClass114_1.method2707()) {
				if (Static455.aClass251_14.anInt6708 < Static290.anInt5067) {
					@Pc(201) int local201 = local28 - Static242.anInt4461;
					@Pc(206) int local206 = local32 - Static85.anInt1840;
					if (Static455.aClass251_14.anInt6684 < local201 || local201 < -Static455.aClass251_14.anInt6684 || local206 > Static455.aClass251_14.anInt6684 || local206 < -Static455.aClass251_14.anInt6684) {
						Static237.aBoolean415 = true;
					}
				}
				if (Static455.aClass251_14.anObjectArray30 != null && Static237.aBoolean415) {
					local126 = new Class1_Sub24();
					local126.anInt3097 = local103;
					local126.anObjectArray3 = Static455.aClass251_14.anObjectArray30;
					local126.anInt3105 = local111;
					local126.aClass251_5 = Static455.aClass251_14;
					Static13.method366(local126);
				}
			} else {
				if (Static237.aBoolean415) {
					Static61.method1293();
					if (Static455.aClass251_14.anObjectArray33 != null) {
						local126 = new Class1_Sub24();
						local126.aClass251_5 = Static455.aClass251_14;
						local126.anInt3105 = local111;
						local126.anObjectArray3 = Static455.aClass251_14.anObjectArray33;
						local126.anInt3097 = local103;
						local126.aClass251_4 = Static312.aClass251_8;
						Static13.method366(local126);
					}
					if (Static312.aClass251_8 != null && Static57.method1245(Static455.aClass251_14) != null) {
						Static421.method1799(Static312.aClass251_8, Static455.aClass251_14);
					}
				} else if ((Static357.anInt5884 == 1 || Static352.method4870()) && Static217.anInt4004 > 2) {
					Static126.method2238(Static369.anInt6061 + Static242.anInt4461, Static296.anInt5168 - -Static85.anInt1840);
				} else if (Static51.method6019()) {
					Static126.method2238(Static369.anInt6061 + Static242.anInt4461, Static85.anInt1840 + Static296.anInt5168);
				}
				Static455.aClass251_14 = null;
			}
		} else if (Static290.anInt5067 > 1) {
			Static455.aClass251_14 = null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ql;I)Z")
	public static boolean method2108(@OriginalArg(0) Class202 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean398) {
			return false;
		} else if (!arg0.method4655(Static168.anInterface8_2)) {
			return false;
		} else if (Static28.aClass96_7.method2335((long) arg0.anInt5581) == null) {
			return Static146.aClass96_18.method2335((long) arg0.anInt5561) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
	public static int method2109(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local18 * local33 >> 12;
	}
}
