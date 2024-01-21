import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_406 = Static8.method128("<col=40ff00>");

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "Lclient!ea;")
	private static Class18 aClass18_408 = Static8.method128("Username: ");

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_407 = aClass18_408;

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_410 = Static8.method128("shake:");

	@OriginalMember(owner = "client!ga", name = "kb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_409 = aClass18_410;

	@OriginalMember(owner = "client!ga", name = "lb", descriptor = "I")
	public static int anInt1671 = 0;

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_411 = aClass18_410;

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_412 = Static8.method128("<col=c0ff00>");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!dd;)Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 method1100(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1) {
		return Static179.method3197(arg1, arg0) ? Static74.method1570() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1102(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)V")
	public static void method1103() {
		aClass18_407 = null;
		aClass18_409 = null;
		aClass18_411 = null;
		aClass18_412 = null;
		aClass18_406 = null;
		aClass18_408 = null;
		aClass18_410 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method1104(@OriginalArg(0) Class1_Sub1_Sub5_Sub1 arg0) {
		arg0.aBoolean155 = false;
		@Pc(18) Class1_Sub1_Sub12 local18;
		if (arg0.anInt3562 != -1) {
			local18 = Static121.method2378(arg0.anInt3562);
			if (local18 == null || local18.anIntArray307 == null) {
				arg0.anInt3562 = -1;
			} else {
				arg0.anInt3564++;
				if (local18.anIntArray307.length > arg0.anInt3554 && arg0.anInt3564 > local18.anIntArray309[arg0.anInt3554]) {
					arg0.anInt3564 = 1;
					arg0.anInt3554++;
					Static127.method2492(arg0.anInt3554, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1 == arg0, local18, arg0.anInt3579, arg0.anInt3558);
				}
				if (local18.anIntArray307.length <= arg0.anInt3554) {
					arg0.anInt3554 = 0;
					arg0.anInt3564 = 0;
					Static127.method2492(arg0.anInt3554, arg0 == Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1, local18, arg0.anInt3579, arg0.anInt3558);
				}
			}
		}
		if (arg0.anInt3552 != -1 && arg0.anInt3565 <= Static41.anInt1322) {
			if (arg0.anInt3567 < 0) {
				arg0.anInt3567 = 0;
			}
			@Pc(132) int local132 = Static155.method2902(arg0.anInt3552).anInt4678;
			if (local132 == -1) {
				arg0.anInt3552 = -1;
			} else {
				@Pc(142) Class1_Sub1_Sub12 local142 = Static121.method2378(local132);
				if (local142 == null || local142.anIntArray307 == null) {
					arg0.anInt3552 = -1;
				} else {
					arg0.anInt3577++;
					if (local142.anIntArray307.length > arg0.anInt3567 && arg0.anInt3577 > local142.anIntArray309[arg0.anInt3567]) {
						arg0.anInt3567++;
						arg0.anInt3577 = 1;
						Static127.method2492(arg0.anInt3567, arg0 == Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1, local142, arg0.anInt3579, arg0.anInt3558);
					}
					if (arg0.anInt3567 >= local142.anIntArray307.length && (arg0.anInt3567 < 0 || arg0.anInt3567 >= local142.anIntArray307.length)) {
						arg0.anInt3552 = -1;
					}
				}
			}
		}
		if (arg0.anInt3568 != -1 && arg0.anInt3597 <= 1) {
			local18 = Static121.method2378(arg0.anInt3568);
			if (local18.anInt3455 == 1 && arg0.anInt3556 > 0 && Static41.anInt1322 >= arg0.anInt3563 && Static41.anInt1322 > arg0.anInt3580) {
				arg0.anInt3597 = 1;
				return;
			}
		}
		if (arg0.anInt3568 != -1 && arg0.anInt3597 == 0) {
			local18 = Static121.method2378(arg0.anInt3568);
			if (local18 == null || local18.anIntArray307 == null) {
				arg0.anInt3568 = -1;
			} else {
				arg0.anInt3589++;
				if (arg0.anInt3586 < local18.anIntArray307.length && arg0.anInt3589 > local18.anIntArray309[arg0.anInt3586]) {
					arg0.anInt3589 = 1;
					arg0.anInt3586++;
					Static127.method2492(arg0.anInt3586, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1 == arg0, local18, arg0.anInt3579, arg0.anInt3558);
				}
				if (arg0.anInt3586 >= local18.anIntArray307.length) {
					arg0.anInt3572++;
					arg0.anInt3586 -= local18.anInt3462;
					if (local18.anInt3461 <= arg0.anInt3572) {
						arg0.anInt3568 = -1;
					} else if (arg0.anInt3586 >= 0 && arg0.anInt3586 < local18.anIntArray307.length) {
						Static127.method2492(arg0.anInt3586, arg0 == Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1, local18, arg0.anInt3579, arg0.anInt3558);
					} else {
						arg0.anInt3568 = -1;
					}
				}
				arg0.aBoolean155 = local18.aBoolean151;
			}
		}
		if (arg0.anInt3597 > 0) {
			arg0.anInt3597--;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!m;Lclient!m;B)V")
	public static void method1105(@OriginalArg(0) Class1_Sub1_Sub8_Sub2_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub8_Sub2_Sub1 arg1) {
		if (Static124.aBoolean154) {
			Static114.method2305(arg1, arg0);
			return;
		}
		if (Static73.anInt1886 == 0 || Static73.anInt1886 == 5) {
			arg1.method2015(Static91.aClass18_688, 382, 225, 16777215, -1);
			Static63.method2007(230, 233, 304, 34, 9179409);
			Static63.method2007(231, 234, 302, 32, 0);
			Static63.method1990(232, 235, Static144.anInt3993 * 3, 30, 9179409);
			Static63.method1990(Static144.anInt3993 * 3 + 232, 235, 300 - Static144.anInt3993 * 3, 30, 0);
			arg1.method2015(Static163.aClass18_1151, 382, 256, 16777215, -1);
		}
		@Pc(95) short local95;
		@Pc(117) int local117;
		if (Static73.anInt1886 == 20) {
			local95 = 211;
			Static95.aClass1_Sub1_Sub8_Sub1_3.method919(382 - Static95.aClass1_Sub1_Sub8_Sub1_3.anInt1435 / 2, 271 - Static95.aClass1_Sub1_Sub8_Sub1_3.anInt1432 / 2);
			arg1.method2015(Static163.aClass18_1149, 382, 211, 16776960, 0);
			local117 = local95 + 15;
			arg1.method2015(Static163.aClass18_1150, 382, 226, 16776960, 0);
			@Pc(125) int local125 = local117 + 15;
			arg1.method2015(Static163.aClass18_1155, 382, 241, 16776960, 0);
			@Pc(133) int local133 = local125 + 15;
			@Pc(134) int local134 = local133 + 10;
			arg1.method2016(Static144.method2735(new Class18[] { aClass18_407, Static67.method2014(Static163.aClass18_1154) }), 272, 266, 16777215, 0);
			@Pc(154) int local154 = local134 + 15;
			arg1.method2016(Static144.method2735(new Class18[] { Static122.aClass18_877, Static163.aClass18_1153.method738() }), 274, 281, 16777215, 0);
			@Pc(175) int local175 = local154 + 15;
		}
		if (Static73.anInt1886 == 10) {
			Static95.aClass1_Sub1_Sub8_Sub1_3.method919(202, 171);
			if (Static39.anInt1204 == 0) {
				local95 = 251;
				arg1.method2015(Static141.aClass18_519, 382, 251, 16776960, 0);
				local117 = local95 + 30;
				Static101.aClass1_Sub1_Sub8_Sub1_4.method919(229, 271);
				arg1.method2028(Static169.aClass18_1191, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static101.aClass1_Sub1_Sub8_Sub1_4.method919(389, 271);
				arg1.method2028(Static173.aClass18_1212, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static39.anInt1204 == 2) {
				local95 = 211;
				arg1.method2015(Static163.aClass18_1149, 382, 211, 16776960, 0);
				local117 = local95 + 15;
				arg1.method2015(Static163.aClass18_1150, 382, 226, 16776960, 0);
				local117 += 15;
				arg1.method2015(Static163.aClass18_1155, 382, 241, 16776960, 0);
				@Pc(364) boolean local364;
				if (Static156.anInt4309 == 0 && Static41.anInt1322 % 40 < 20 && Static160.aBoolean195) {
					local364 = true;
				} else {
					local364 = false;
				}
				local117 += 15;
				local117 += 10;
				arg1.method2016(Static144.method2735(new Class18[] { aClass18_407, Static67.method2014(Static163.aClass18_1154), local364 ? Static57.aClass18_446 : Static163.aClass18_1152 }), 272, 266, 16777215, 0);
				local117 += 15;
				if (Static156.anInt4309 == 1 && Static41.anInt1322 % 40 < 20 && Static160.aBoolean195) {
					local364 = true;
				} else {
					local364 = false;
				}
				arg1.method2016(Static144.method2735(new Class18[] { Static122.aClass18_877, Static163.aClass18_1153.method738(), local364 ? Static57.aClass18_446 : Static163.aClass18_1152 }), 274, 281, 16777215, 0);
				Static101.aClass1_Sub1_Sub8_Sub1_4.method919(229, 301);
				arg1.method2015(Static137.aClass18_974, 302, 326, 16777215, 0);
				local117 += 15;
				Static101.aClass1_Sub1_Sub8_Sub1_4.method919(389, 301);
				arg1.method2015(Static129.aClass18_928, 462, 326, 16777215, 0);
			} else if (Static39.anInt1204 == 3) {
				arg1.method2015(Static85.aClass18_626, 382, 211, 16776960, 0);
				local95 = 236;
				arg1.method2015(Static84.aClass18_611, 382, 236, 16777215, 0);
				local117 = local95 + 15;
				arg1.method2015(Static149.aClass18_1052, 382, 251, 16777215, 0);
				local117 += 15;
				arg1.method2015(Static179.aClass18_1235, 382, 266, 16777215, 0);
				local117 += 15;
				arg1.method2015(Static19.aClass18_176, 382, 281, 16777215, 0);
				Static101.aClass1_Sub1_Sub8_Sub1_4.method919(309, 301);
				arg1.method2015(Static129.aClass18_928, 382, 326, 16777215, 0);
				local117 += 15;
			}
		}
		if (Static169.anInt4600 != 1) {
			if (Static164.anInt4505 > 0) {
				Static137.method2609(Static164.anInt4505);
				Static164.anInt4505 = 0;
			}
			Static108.method2226();
		}
		Static154.aClass1_Sub1_Sub8_Sub1Array9[Static113.aBoolean194 ? 1 : 0].method919(725, 463);
		if (Static73.anInt1886 <= 5 || Static22.anInt614 == 2 || Static139.anInt3912 != 0) {
			return;
		}
		if (Static29.aClass1_Sub1_Sub8_Sub1_1 == null) {
			Static29.aClass1_Sub1_Sub8_Sub1_1 = Static66.method1305(Static163.aClass18_1152, Static71.aClass18_529, Static127.aClass16_Sub1_41);
			return;
		}
		Static29.aClass1_Sub1_Sub8_Sub1_1.method919(5, 463);
		arg1.method2015(Static144.method2735(new Class18[] { Static12.aClass18_1206, Static153.aClass18_1078, Static132.method2564(Static108.anInt3191) }), 55, 478, 16777215, 0);
		if (Static46.aClass24_38 == null) {
			arg0.method2015(Static124.aClass18_889, 55, 492, 16777215, 0);
		} else {
			arg0.method2015(Static19.aClass18_177, 55, 492, 16777215, 0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ea;Lclient!dd;Lclient!ea;BLclient!dd;)Lclient!m;")
	public static Class1_Sub1_Sub8_Sub2_Sub1 method1106(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(4) Class16 arg3) {
		@Pc(8) int local8 = arg3.method2246(arg0);
		@Pc(24) int local24 = arg3.method2251(arg2, local8);
		return Static15.method268(arg3, local24, arg1, local8);
	}
}
