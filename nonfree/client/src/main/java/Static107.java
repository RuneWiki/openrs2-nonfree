import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!nb", name = "db", descriptor = "Lclient!sc;")
	public static Class72 aClass72_34 = new Class72();

	@OriginalMember(owner = "client!nb", name = "pb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1428 = Static122.method531("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!nb", name = "fb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1426 = aClass73_1428;

	@OriginalMember(owner = "client!nb", name = "jb", descriptor = "I")
	public static final int anInt2462 = 7759444;

	@OriginalMember(owner = "client!nb", name = "nb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1427 = Static122.method531("rect_debug=");

	@OriginalMember(owner = "client!nb", name = "sb", descriptor = "I")
	public static int anInt2468 = 0;

	@OriginalMember(owner = "client!nb", name = "tb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1429 = Static122.method531("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	public static void method1919() {
		aClass73_1427 = null;
		aClass73_1426 = null;
		aClass73_1429 = null;
		aClass73_1428 = null;
		aClass72_34 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILclient!ud;)V")
	public static void method1920(@OriginalArg(1) Class3_Sub1_Sub4_Sub7 arg0) {
		if (arg0.anInt3171 == 0) {
			return;
		}
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (arg0.anInt3145 != -1 && arg0.anInt3145 < 32768) {
			@Pc(25) Class3_Sub1_Sub4_Sub7_Sub2 local25 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[arg0.anInt3145];
			if (local25 != null) {
				local34 = arg0.anInt3169 - local25.anInt3169;
				local41 = arg0.anInt3159 - local25.anInt3159;
				if (local34 != 0 || local41 != 0) {
					arg0.anInt3139 = (int) (Math.atan2((double) local34, (double) local41) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(66) int local66;
		if (arg0.anInt3145 >= 32768) {
			local66 = arg0.anInt3145 - 32768;
			if (Static61.anInt1455 == local66) {
				local66 = 2047;
			}
			@Pc(75) Class3_Sub1_Sub4_Sub7_Sub1 local75 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local66];
			if (local75 != null) {
				local41 = arg0.anInt3169 - local75.anInt3169;
				@Pc(91) int local91 = arg0.anInt3159 - local75.anInt3159;
				if (local41 != 0 || local91 != 0) {
					arg0.anInt3139 = (int) (Math.atan2((double) local41, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3148 != 0 || arg0.anInt3136 != 0) && (arg0.anInt3160 == 0 || arg0.anInt3181 > 0)) {
			local66 = arg0.anInt3169 - (arg0.anInt3148 - Static151.anInt3389 - Static151.anInt3389) * 64;
			local34 = arg0.anInt3159 - (arg0.anInt3136 - Static134.anInt3066 - Static134.anInt3066) * 64;
			if (local66 != 0 || local34 != 0) {
				arg0.anInt3139 = (int) (Math.atan2((double) local66, (double) local34) * 325.949D) & 0x7FF;
			}
			arg0.anInt3148 = 0;
			arg0.anInt3136 = 0;
		}
		local66 = arg0.anInt3139 - arg0.anInt3138 & 0x7FF;
		if (local66 == 0) {
			arg0.anInt3152 = 0;
			return;
		}
		arg0.anInt3152++;
		@Pc(221) boolean local221;
		if (local66 > 1024) {
			arg0.anInt3138 -= arg0.anInt3171;
			local221 = true;
			if (local66 < arg0.anInt3171 || local66 > 2048 - arg0.anInt3171) {
				arg0.anInt3138 = arg0.anInt3139;
				local221 = false;
			}
			if (arg0.anInt3154 == arg0.anInt3141 && (arg0.anInt3152 > 25 || local221)) {
				if (arg0.anInt3168 == -1) {
					arg0.anInt3141 = arg0.anInt3155;
				} else {
					arg0.anInt3141 = arg0.anInt3168;
				}
			}
		} else {
			arg0.anInt3138 += arg0.anInt3171;
			local221 = true;
			if (local66 < arg0.anInt3171 || 2048 - arg0.anInt3171 < local66) {
				local221 = false;
				arg0.anInt3138 = arg0.anInt3139;
			}
			if (arg0.anInt3154 == arg0.anInt3141 && (arg0.anInt3152 > 25 || local221)) {
				if (arg0.anInt3142 == -1) {
					arg0.anInt3141 = arg0.anInt3155;
				} else {
					arg0.anInt3141 = arg0.anInt3142;
				}
			}
		}
		arg0.anInt3138 &= 0x7FF;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Lclient!sd;")
	public static Class73 method1921(@OriginalArg(0) int arg0) {
		@Pc(9) Class73 local9 = Static154.method2485(arg0);
		for (@Pc(20) int local20 = local9.method2435() - 3; local20 > 0; local20 -= 3) {
			local9 = Static19.method372(new Class73[] { local9.method2413(local20, 0), Static82.aClass73_974, local9.method2447(local20) });
		}
		if (local9.method2435() > 9) {
			return Static19.method372(new Class73[] { Static178.aClass73_2075, local9.method2413(local9.method2435() - 8, 0), Static126.aClass73_1650, Static45.aClass73_615, local9, Static74.aClass73_909 });
		} else if (local9.method2435() > 6) {
			return Static19.method372(new Class73[] { Static4.aClass73_55, local9.method2413(local9.method2435() - 4, 0), Static88.aClass73_1076, Static45.aClass73_615, local9, Static74.aClass73_909 });
		} else {
			return Static19.method372(new Class73[] { Static160.aClass73_1897, local9, Static93.aClass73_1182 });
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIZ)I")
	public static int method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(29) int local29 = arg2;
		if (arg2 < 3 && (Static110.aByteArrayArrayArray5[1][local11][local7] & 0x2) == 2) {
			local29 = arg2 + 1;
		}
		@Pc(55) int local55 = arg1 & 0x7F;
		@Pc(59) int local59 = arg0 & 0x7F;
		@Pc(86) int local86 = Static65.anIntArrayArrayArray5[local29][local11 + 1][local7] * local59 + (128 - local59) * Static65.anIntArrayArrayArray5[local29][local11][local7] >> 7;
		@Pc(116) int local116 = local59 * Static65.anIntArrayArrayArray5[local29][local11 + 1][local7 + 1] + Static65.anIntArrayArrayArray5[local29][local11][local7 + 1] * (128 - local59) >> 7;
		return local86 * (128 - local55) + local55 * local116 >> 7;
	}
}
