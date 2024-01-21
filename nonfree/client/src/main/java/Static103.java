import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 aClass3_Sub1_Sub4_Sub2_43;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1393 = Static75.method1216("Prepared visibility map");

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	public static int anInt2530 = 0;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1394 = Static75.method1216("World");

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1395 = Static75.method1216("Please reload this page)3");

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1396 = aClass4_1395;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public static int anInt2532 = 0;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean216 = true;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1397 = aClass4_1394;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	public static int anInt2538 = -1;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1398 = Static75.method1216("Fertigkeit)2");

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1399 = aClass4_1393;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	public static int anInt2539 = 0;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1400 = Static75.method1216("backright1");

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1401 = Static75.method1216("leuchten2:");

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	public static int anInt2540 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rd;Lclient!rd;IIZ)Lclient!qb;")
	public static Class3_Sub1_Sub12 method1690(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int[] local14 = arg1.method1615(arg2);
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(31) byte[] local31 = arg1.method1620(arg2, local14[local21]);
			if (local31 == null) {
				local7 = false;
			} else {
				@Pc(51) int local51 = local31[1] & 0xFF | (local31[0] & 0xFF) << 8;
				@Pc(59) byte[] local59 = arg0.method1620(local51, 0);
				if (local59 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub12(arg1, arg0, arg2, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BIII)Z")
	public static boolean method1691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg0 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static38.aClass61_30.method1319(Static49.anInt1203, arg2, arg1, arg0);
		if (local18 == -1) {
			return false;
		}
		@Pc(27) int local27 = local18 & 0x1F;
		@Pc(33) int local33 = local18 >> 6 & 0x3;
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(48) Class3_Sub1_Sub5 local48 = Static38.method1911(local11);
			@Pc(51) int local51 = local48.anInt1542;
			if (local33 != 0) {
				local51 = (local51 << local33 & 0xF) + (local51 >> 4 - local33);
			}
			@Pc(78) int local78;
			@Pc(75) int local75;
			if (local33 == 0 || local33 == 2) {
				local75 = local48.anInt1543;
				local78 = local48.anInt1548;
			} else {
				local78 = local48.anInt1543;
				local75 = local48.anInt1548;
			}
			Static107.method1822(arg1, 2, true, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], local51, 0, 0, arg2, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], local75, local78);
		} else {
			Static107.method1822(arg1, 2, true, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, local27 + 1, local33, arg2, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
		}
		Static49.anInt1217 = Static91.anInt2055;
		Static19.anInt476 = 2;
		Static55.anInt1393 = Static4.anInt194;
		Static60.anInt1491 = 0;
		return true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method1692() {
		aClass4_1399 = null;
		aClass4_1401 = null;
		aClass4_1398 = null;
		aClass4_1397 = null;
		aClass4_1393 = null;
		aClass4_1396 = null;
		aClass4_1395 = null;
		aClass4_1394 = null;
		aClass3_Sub1_Sub4_Sub2_43 = null;
		aClass4_1400 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)I")
	public static int method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg5;
			arg5 = local12;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return 7 + 1 - arg1 - arg4;
		} else if (local20 == 2) {
			return 7 + 1 - arg3 - arg5;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method1694() {
		for (@Pc(6) Class3_Sub1_Sub1_Sub3 local6 = (Class3_Sub1_Sub1_Sub3) Static20.aClass20_2.method308(); local6 != null; local6 = (Class3_Sub1_Sub1_Sub3) Static20.aClass20_2.method309()) {
			if (Static49.anInt1203 != local6.anInt912 || local6.aBoolean57) {
				local6.method1930();
			} else if (Static60.anInt1489 >= local6.anInt919) {
				local6.method617(Static85.anInt1995);
				if (local6.aBoolean57) {
					local6.method1930();
				} else {
					Static38.aClass61_30.method1318(local6.anInt912, local6.anInt915, local6.anInt921, local6.anInt918, 60, local6, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method1695(@OriginalArg(0) Class3_Sub12 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (arg0.anInt2774 == 0) {
			local7 = Static38.aClass61_30.method1339(arg0.anInt2770, arg0.anInt2776, arg0.anInt2767);
		}
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		if (arg0.anInt2774 == 1) {
			local7 = Static38.aClass61_30.method1304(arg0.anInt2770, arg0.anInt2776, arg0.anInt2767);
		}
		if (arg0.anInt2774 == 2) {
			local7 = Static38.aClass61_30.method1343(arg0.anInt2770, arg0.anInt2776, arg0.anInt2767);
		}
		if (arg0.anInt2774 == 3) {
			local7 = Static38.aClass61_30.method1335(arg0.anInt2770, arg0.anInt2776, arg0.anInt2767);
		}
		if (local7 != 0) {
			local5 = local7 >> 14 & 0x7FFF;
			@Pc(95) int local95 = Static38.aClass61_30.method1319(arg0.anInt2770, arg0.anInt2776, arg0.anInt2767, local7);
			local26 = local95 >> 6 & 0x3;
			local24 = local95 & 0x1F;
		}
		arg0.anInt2771 = local5;
		arg0.anInt2768 = local24;
		arg0.anInt2765 = local26;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ad;BLclient!ad;Lclient!ad;)V")
	public static void method1696(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class4 arg2) {
		Static95.aClass4_1255 = arg0;
		Static95.aClass4_1257 = arg2;
		Static95.aClass4_1252 = arg1;
	}
}
