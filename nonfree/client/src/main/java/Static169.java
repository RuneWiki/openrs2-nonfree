import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ud", name = "Ab", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1386 = Static177.method3050("Members object");

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1378 = aClass46_1386;

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1379 = Static177.method3050("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ud", name = "tb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1385 = Static177.method3050("Welcome to RuneScape");

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1380 = aClass46_1385;

	@OriginalMember(owner = "client!ud", name = "sb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1384 = Static177.method3050("flash2:");

	@OriginalMember(owner = "client!ud", name = "lb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1381 = aClass46_1384;

	@OriginalMember(owner = "client!ud", name = "mb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1382 = aClass46_1384;

	@OriginalMember(owner = "client!ud", name = "ob", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1383 = Static177.method3050("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!ud", name = "yb", descriptor = "I")
	public static int anInt3778 = 0;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lclient!jd;I)V")
	public static void method2882(@OriginalArg(0) Class46 arg0) {
		if (Static126.aClass76_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(21) Class46 local21 = Static126.aClass46_1099.method1682(Static126.aClass76_4.anApplet1);
			@Pc(27) Class46 local27 = Static149.aClass46_1258.method1682(Static126.aClass76_4.anApplet1);
			@Pc(52) Class46 local52 = Static69.method1482(new Class46[] { local21, Static53.aClass46_512, arg0, Static42.aClass46_365, local27 });
			if (arg0.method1677() == 0) {
				local52 = Static69.method1482(new Class46[] { local52, Static30.aClass46_249 });
			} else {
				local52 = Static69.method1482(new Class46[] { local52, Static163.aClass46_1377, Static166.method2759(Static149.method2559() + 94608000000L), Static72.aClass46_718, Static101.method1952(94608000L) });
			}
			Static69.method1482(new Class46[] { Static76.aClass46_1434, local52, Static152.aClass46_1284 }).method1665(Static126.aClass76_4.anApplet1);
		} catch (@Pc(125) Throwable local125) {
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIZ)Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 method2885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(23) long local23 = ((long) arg2 << 40) + ((long) arg1 << 38) + ((long) arg3 << 16) + (long) arg0;
		@Pc(31) Class4_Sub1_Sub7_Sub2 local31;
		if (!arg4) {
			local31 = (Class4_Sub1_Sub7_Sub2) Static58.aClass66_26.method2225(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class4_Sub1_Sub12 local39 = Static83.method1663(arg0);
		if (arg3 > 1 && local39.anIntArray231 != null) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (arg3 >= local39.anIntArray232[local49] && local39.anIntArray232[local49] != 0) {
					local47 = local39.anIntArray231[local49];
				}
			}
			if (local47 != -1) {
				local39 = Static83.method1663(local47);
			}
		}
		@Pc(93) Class4_Sub1_Sub1_Sub4_Sub1 local93 = local39.method1887();
		if (local93 == null) {
			return null;
		}
		@Pc(99) Class4_Sub1_Sub7_Sub2 local99 = null;
		if (local39.anInt2478 != -1) {
			local99 = method2885(local39.anInt2479, 1, 0, 10, true);
			if (local99 == null) {
				return null;
			}
		}
		@Pc(119) int local119 = Static145.anInt3841;
		@Pc(121) int local121 = Static145.anInt3838;
		@Pc(124) int[] local124 = new int[4];
		@Pc(131) int[] local131 = Static145.anIntArray411;
		Static145.method2938(local124);
		local31 = new Class4_Sub1_Sub7_Sub2(36, 32);
		Static145.method2936(local31.anIntArray323, 36, 32);
		Static145.method2939();
		Static171.method2952();
		Static171.method2961(16, 16);
		Static171.aBoolean158 = false;
		@Pc(154) int local154 = local39.anInt2499;
		if (arg4) {
			local154 = (int) ((double) local154 * 1.5D);
		} else if (arg1 == 2) {
			local154 = (int) ((double) local154 * 1.04D);
		}
		@Pc(182) int local182 = local154 * Class4_Sub1_Sub7_Sub4.anIntArray416[local39.anInt2493] >> 16;
		@Pc(191) int local191 = Class4_Sub1_Sub7_Sub4.anIntArray412[local39.anInt2493] * local154 >> 16;
		local93.method2824();
		local93.method2840(local39.anInt2491, local39.anInt2474, local39.anInt2493, local39.anInt2504, local191 + local39.anInt2485 - local93.aShort29 / 2, local182 + local39.anInt2485);
		if (arg1 >= 1) {
			local31.method2547(1);
		}
		if (arg1 >= 2) {
			local31.method2547(16777215);
		}
		if (arg2 != 0) {
			local31.method2528(arg2);
		}
		Static145.method2936(local31.anIntArray323, 36, 32);
		if (local39.anInt2478 != -1) {
			local99.method2538(0, 0);
		}
		if (!arg4 && (local39.anInt2481 == 1 || arg3 != 1) && arg3 != -1) {
			Static21.aClass4_Sub1_Sub7_Sub1_Sub1_2.method890(Static31.method523(arg3), 0, 9, 16776960, 1);
		}
		if (!arg4) {
			Static58.aClass66_26.method2222(local31, local23);
		}
		Static145.method2936(local131, local119, local121);
		Static145.method2933(local124);
		Static171.method2952();
		Static171.aBoolean158 = true;
		return local31;
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(II)V")
	public static void method2887(@OriginalArg(1) int arg0) {
		Static102.anInt2590 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BILclient!jd;)V")
	public static void method2889(@OriginalArg(1) int arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(7) Class46 local7 = arg1.method1651().method1654();
		@Pc(9) boolean local9 = false;
		for (@Pc(19) int local19 = 0; local19 < Static126.anInt3006; local19++) {
			@Pc(27) Class4_Sub1_Sub1_Sub1_Sub1 local27 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[Static167.anIntArray369[local19]];
			if (local27 != null && local27.aClass46_796 != null && local27.aClass46_796.method1683(local7)) {
				Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local27.anIntArray262[0], 1, false, 1, 0, 0, local27.anIntArray259[0], 2);
				local9 = true;
				if (arg0 == 1) {
					Static90.aClass4_Sub11_Sub1_1.method1285(134);
					Static90.aClass4_Sub11_Sub1_1.method1268(Static167.anIntArray369[local19]);
				} else if (arg0 == 4) {
					Static90.aClass4_Sub11_Sub1_1.method1285(87);
					Static90.aClass4_Sub11_Sub1_1.method1260(Static167.anIntArray369[local19]);
				} else if (arg0 == 6) {
					Static90.aClass4_Sub11_Sub1_1.method1285(66);
					Static90.aClass4_Sub11_Sub1_1.method1260(Static167.anIntArray369[local19]);
				} else if (arg0 == 7) {
					Static90.aClass4_Sub11_Sub1_1.method1285(236);
					Static90.aClass4_Sub11_Sub1_1.method1260(Static167.anIntArray369[local19]);
				}
				break;
			}
		}
		if (!local9) {
			Static105.method1982(Static3.aClass46_44, 0, Static69.method1482(new Class46[] { Static175.aClass46_1431, local7 }));
		}
	}
}
