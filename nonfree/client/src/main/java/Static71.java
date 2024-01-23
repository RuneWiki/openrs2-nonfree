import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eo", name = "J", descriptor = "[Lclient!re;")
	public static Class150[] aClass150Array1;

	@OriginalMember(owner = "client!eo", name = "W", descriptor = "I")
	public static int anInt1813;

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
	public static int anInt1808 = -1;

	@OriginalMember(owner = "client!eo", name = "T", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!eo", name = "U", descriptor = "I")
	public static int anInt1811 = 0;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "(I)V")
	public static void method1385() {
		@Pc(7) int local7 = Static68.anInt1739;
		@Pc(9) int local9 = Static274.anInt5436;
		@Pc(11) int local11 = Static39.anInt982;
		@Pc(23) int local23 = Static275.anInt5450 - 3;
		if (Static26.aClass2_Sub8_Sub1_10 == null || Static50.aClass2_Sub8_Sub1_5 == null) {
			if (Static121.aClass42_32.method1253(Static299.anInt5733) && Static121.aClass42_32.method1253(Static173.anInt3813)) {
				Static26.aClass2_Sub8_Sub1_10 = Static219.method3633(Static121.aClass42_32, Static299.anInt5733);
				Static50.aClass2_Sub8_Sub1_5 = Static219.method3633(Static121.aClass42_32, Static173.anInt3813);
				if (Static116.aBoolean184) {
					if (Static26.aClass2_Sub8_Sub1_10 instanceof Class2_Sub8_Sub1_Sub1_Sub1) {
						Static26.aClass2_Sub8_Sub1_10 = new Class2_Sub8_Sub1_Sub2_Sub1((Class2_Sub8_Sub1_Sub1) Static26.aClass2_Sub8_Sub1_10);
					} else {
						Static26.aClass2_Sub8_Sub1_10 = new Class2_Sub8_Sub1_Sub2((Class2_Sub8_Sub1_Sub1) Static26.aClass2_Sub8_Sub1_10);
					}
					if (Static50.aClass2_Sub8_Sub1_5 instanceof Class2_Sub8_Sub1_Sub1_Sub1) {
						Static50.aClass2_Sub8_Sub1_5 = new Class2_Sub8_Sub1_Sub2_Sub1((Class2_Sub8_Sub1_Sub1) Static50.aClass2_Sub8_Sub1_5);
					} else {
						Static50.aClass2_Sub8_Sub1_5 = new Class2_Sub8_Sub1_Sub2((Class2_Sub8_Sub1_Sub1) Static50.aClass2_Sub8_Sub1_5);
					}
				}
			} else if (Static116.aBoolean184) {
				Static111.method1890(local7, local11, local9, 20, Static57.anInt1440, 256 - Static79.anInt1903);
			} else {
				Static77.method1443(local7, local11, local9, 20, Static57.anInt1440, 256 - Static79.anInt1903);
			}
		}
		@Pc(132) int local132;
		@Pc(134) int local134;
		if (Static26.aClass2_Sub8_Sub1_10 != null && Static50.aClass2_Sub8_Sub1_5 != null) {
			local132 = (local9 - Static50.aClass2_Sub8_Sub1_5.anInt5514 * 2) / Static26.aClass2_Sub8_Sub1_10.anInt5514;
			for (local134 = 0; local134 < local132; local134++) {
				Static26.aClass2_Sub8_Sub1_10.method4364(Static50.aClass2_Sub8_Sub1_5.anInt5514 + local7 + local134 * Static26.aClass2_Sub8_Sub1_10.anInt5514, local11);
			}
			Static50.aClass2_Sub8_Sub1_5.method4364(local7, local11);
			Static50.aClass2_Sub8_Sub1_5.method4371(local9 + local7 - Static50.aClass2_Sub8_Sub1_5.anInt5514, local11);
		}
		Static237.aClass2_Sub8_Sub5_5.method1220(Static204.aString145, local7 + 3, local11 + 14, Static96.anInt2300, -1);
		if (Static116.aBoolean184) {
			Static111.method1890(local7, local11 + 20, local9, local23 - 20, Static57.anInt1440, 256 - Static79.anInt1903);
		} else {
			Static77.method1443(local7, local11 + 20, local9, local23 - 20, Static57.anInt1440, 256 - Static79.anInt1903);
		}
		local132 = Static131.anInt3016;
		local134 = Static281.anInt5551;
		@Pc(221) int local221;
		@Pc(238) int local238;
		for (local221 = 0; local221 < Static68.anInt1741; local221++) {
			local238 = local11 + (Static68.anInt1741 + -1 - local221) * 15 + 20 + 13;
			if (local132 > local7 && local132 < local9 + local7 && local238 - 13 < local134 && local238 + 3 > local134) {
				if (Static116.aBoolean184) {
					Static111.method1890(local7, local238 - 12, local9, 15, Static297.anInt5761, 256 - Static32.anInt871);
				} else {
					Static77.method1443(local7, local238 - 12, local9, 15, Static297.anInt5761, 256 - Static32.anInt871);
				}
			}
		}
		if ((Static30.aClass2_Sub8_Sub1_4 == null || Static255.aClass2_Sub8_Sub1_12 == null || Static155.aClass2_Sub8_Sub1_8 == null) && Static121.aClass42_32.method1253(Static105.anInt1098) && Static121.aClass42_32.method1253(Static73.anInt1819) && Static121.aClass42_32.method1253(Static50.anInt1262)) {
			Static30.aClass2_Sub8_Sub1_4 = Static219.method3633(Static121.aClass42_32, Static105.anInt1098);
			Static255.aClass2_Sub8_Sub1_12 = Static219.method3633(Static121.aClass42_32, Static73.anInt1819);
			Static155.aClass2_Sub8_Sub1_8 = Static219.method3633(Static121.aClass42_32, Static50.anInt1262);
			if (Static116.aBoolean184) {
				if (Static30.aClass2_Sub8_Sub1_4 instanceof Class2_Sub8_Sub1_Sub1_Sub1) {
					Static30.aClass2_Sub8_Sub1_4 = new Class2_Sub8_Sub1_Sub2_Sub1((Class2_Sub8_Sub1_Sub1) Static30.aClass2_Sub8_Sub1_4);
				} else {
					Static30.aClass2_Sub8_Sub1_4 = new Class2_Sub8_Sub1_Sub2((Class2_Sub8_Sub1_Sub1) Static30.aClass2_Sub8_Sub1_4);
				}
				if (Static255.aClass2_Sub8_Sub1_12 instanceof Class2_Sub8_Sub1_Sub1_Sub1) {
					Static255.aClass2_Sub8_Sub1_12 = new Class2_Sub8_Sub1_Sub2_Sub1((Class2_Sub8_Sub1_Sub1) Static255.aClass2_Sub8_Sub1_12);
				} else {
					Static255.aClass2_Sub8_Sub1_12 = new Class2_Sub8_Sub1_Sub2((Class2_Sub8_Sub1_Sub1) Static255.aClass2_Sub8_Sub1_12);
				}
				if (Static155.aClass2_Sub8_Sub1_8 instanceof Class2_Sub8_Sub1_Sub1_Sub1) {
					Static155.aClass2_Sub8_Sub1_8 = new Class2_Sub8_Sub1_Sub2_Sub1((Class2_Sub8_Sub1_Sub1) Static155.aClass2_Sub8_Sub1_8);
				} else {
					Static155.aClass2_Sub8_Sub1_8 = new Class2_Sub8_Sub1_Sub2((Class2_Sub8_Sub1_Sub1) Static155.aClass2_Sub8_Sub1_8);
				}
			}
		}
		@Pc(449) int local449;
		if (Static30.aClass2_Sub8_Sub1_4 != null && Static255.aClass2_Sub8_Sub1_12 != null && Static155.aClass2_Sub8_Sub1_8 != null) {
			local221 = (local9 - Static155.aClass2_Sub8_Sub1_8.anInt5514 * 2) / Static30.aClass2_Sub8_Sub1_4.anInt5514;
			for (local238 = 0; local238 < local221; local238++) {
				Static30.aClass2_Sub8_Sub1_4.method4364(Static30.aClass2_Sub8_Sub1_4.anInt5514 * local238 + Static155.aClass2_Sub8_Sub1_8.anInt5514 + local7, -Static30.aClass2_Sub8_Sub1_4.anInt5517 + local11 - -local23);
			}
			local238 = (local23 - Static155.aClass2_Sub8_Sub1_8.anInt5517 - 20) / Static255.aClass2_Sub8_Sub1_12.anInt5517;
			for (local449 = 0; local449 < local238; local449++) {
				Static255.aClass2_Sub8_Sub1_12.method4364(local7, Static255.aClass2_Sub8_Sub1_12.anInt5517 * local449 + local11 + 20);
				Static255.aClass2_Sub8_Sub1_12.method4371(local7 + local9 - Static255.aClass2_Sub8_Sub1_12.anInt5514, Static255.aClass2_Sub8_Sub1_12.anInt5517 * local449 + (local11 - -20));
			}
			Static155.aClass2_Sub8_Sub1_8.method4364(local7, local23 + local11 - Static155.aClass2_Sub8_Sub1_8.anInt5517);
			Static155.aClass2_Sub8_Sub1_8.method4371(local9 + local7 - Static155.aClass2_Sub8_Sub1_8.anInt5514, -Static155.aClass2_Sub8_Sub1_8.anInt5517 + local23 + local11);
		}
		for (local221 = 0; local221 < Static68.anInt1741; local221++) {
			local238 = (Static68.anInt1741 - local221 - 1) * 15 + local11 + 13 + 20;
			local449 = Static96.anInt2300;
			if (local132 > local7 && local132 < local7 + local9 && local238 - 13 < local134 && local238 + 3 > local134) {
				local449 = Static52.anInt1302;
			}
			Static237.aClass2_Sub8_Sub5_5.method1220(Static143.method2543(local221), local7 + 3, local238, local449, 0);
		}
		Static301.method4577(Static68.anInt1739, Static275.anInt5450, Static39.anInt982, Static274.anInt5436);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLclient!oe;)Lclient!ng;")
	public static Class2_Sub1 method1386(@OriginalArg(1) Class2_Sub16 arg0) {
		arg0.method2146();
		@Pc(9) int local9 = arg0.method2146();
		@Pc(13) Class2_Sub1 local13 = Static60.method1164(local9);
		local13.anInt5828 = arg0.method2146();
		@Pc(26) int local26 = arg0.method2146();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) int local35 = arg0.method2146();
			local13.method4594(arg0, local35);
		}
		local13.method4595();
		return local13;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!l;Lclient!oi;)Lclient!wl;")
	public static Class2_Sub32 method1387(@OriginalArg(1) Class101 arg0, @OriginalArg(2) Class127 arg1) {
		@Pc(35) long local35 = (long) (arg1.anInt4270 + (arg1.anInt4280 + 1 << 16)) + ((long) arg1.anInt4271 << 56) + ((long) arg1.anInt4282 << 32);
		@Pc(41) Class2_Sub32 local41 = (Class2_Sub32) arg0.method2867(local35);
		if (local41 == null) {
			local41 = new Class2_Sub32(arg1.anInt4280, (float) arg1.anInt4270, true, false, arg1.anInt4282);
			arg0.method2860(local41, local35);
		}
		return local41;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
	public static void method1388() {
		Static141.aClass157_25.method4033();
		Static6.aClass157_4.method4033();
		Static93.aClass157_22.method4033();
	}
}
