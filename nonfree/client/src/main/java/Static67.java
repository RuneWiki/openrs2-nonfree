import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public static int anInt1238;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!rn;")
	public static Class155 aClass155_33;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public static int anInt1246 = -1;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	public static int anInt1247 = 0;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "Z")
	public static boolean aBoolean95 = true;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method1031() {
		Static259.aClass98_43.method2571();
		Static201.aClass98_32.method2571();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ia;Lclient!ia;I)V")
	public static void method1032(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0.aClass3_Sub4_74 != null) {
			arg0.method5022();
		}
		arg0.aClass3_Sub4_74 = arg1;
		arg0.aClass3_Sub4_75 = arg1.aClass3_Sub4_75;
		arg0.aClass3_Sub4_74.aClass3_Sub4_75 = arg0;
		arg0.aClass3_Sub4_75.aClass3_Sub4_74 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
	public static void method1034() {
		@Pc(7) int local7 = Static173.anInt3249;
		@Pc(9) int local9 = Static300.anInt5922;
		@Pc(11) int local11 = Static205.anInt4054;
		@Pc(13) int local13 = Static175.anInt3271;
		if (Static283.aBoolean393) {
			Static234.method3973(local7, local9, local13, local11, 6116423);
			Static234.method3973(local7 + 1, local9 - -1, local13 - 2, 16, 0);
			Static234.method3979(local7 + 1, local9 + 18, local13 - 2, local11 - 19, 0);
		} else {
			Static143.method2462(local7, local9, local13, local11, 6116423);
			Static143.method2462(local7 + 1, local9 + 1, local13 - 2, 16, 0);
			Static143.method2455(local7 + 1, local9 + 18, local13 - 2, local11 + -19, 0);
		}
		Static224.aClass3_Sub4_Sub2_14.method3685(Static267.aString196, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(96) int local96 = Static153.anInt2892;
		@Pc(102) int local102 = Static167.anInt3153;
		for (@Pc(104) int local104 = 0; local104 < Static152.anInt2876; local104++) {
			@Pc(109) int local109 = 16777215;
			@Pc(122) int local122 = local9 + (Static152.anInt2876 + -1 + -local104) * 15 + 31;
			if (local102 > local7 && local13 + local7 > local102 && local122 - 13 < local96 && local122 + 3 > local96) {
				local109 = 16776960;
			}
			Static224.aClass3_Sub4_Sub2_14.method3685(Static153.method2577(local104), local7 + 3, local122, local109, 0);
		}
		Static210.method3473(Static175.anInt3271, Static173.anInt3249, Static300.anInt5922, Static205.anInt4054);
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
	public static void method1035() {
		Static177.aClass98_28.method2571();
		Static21.aClass98_4.method2571();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIZII)V")
	public static void method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg1;
		@Pc(14) int local14 = arg6 - arg1;
		@Pc(18) int local18 = arg1 + arg4;
		@Pc(20) int local20;
		for (local20 = arg2; local20 < local9; local20++) {
			Static235.method3988(arg5, Static129.anIntArrayArray40[local20], arg3, arg4);
		}
		@Pc(48) int local48 = arg3 - arg1;
		for (local20 = arg6; local20 > local14; local20--) {
			Static235.method3988(arg5, Static129.anIntArrayArray40[local20], arg3, arg4);
		}
		for (local20 = local9; local20 <= local14; local20++) {
			@Pc(73) int[] local73 = Static129.anIntArrayArray40[local20];
			Static235.method3988(arg5, local73, local18, arg4);
			Static235.method3988(arg0, local73, local48, local18);
			Static235.method3988(arg5, local73, arg3, local48);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLclient!oj;ZIZIIIB)Lclient!ho;")
	public static Class3_Sub4_Sub12 method1037(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class21 local5 = Static133.method2309(arg3);
		if (arg5 > 1 && local5.anIntArray46 != null) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (local5.anIntArray47[local15] <= arg5 && local5.anIntArray47[local15] != 0) {
					local13 = local5.anIntArray46[local15];
				}
			}
			if (local13 != -1) {
				local5 = Static133.method2309(local13);
			}
		}
		@Pc(59) Class10_Sub4_Sub2 local59 = local5.method449(arg1);
		if (local59 == null) {
			return null;
		}
		@Pc(67) Class3_Sub4_Sub12_Sub2 local67 = null;
		if (local5.anInt529 != -1) {
			local67 = (Class3_Sub4_Sub12_Sub2) method1037(true, arg1, false, local5.anInt496, true, 10, 1, 0);
			if (local67 == null) {
				return null;
			}
		} else if (local5.anInt553 != -1) {
			local67 = (Class3_Sub4_Sub12_Sub2) method1037(false, arg1, false, local5.anInt517, true, arg5, arg6, arg7);
			if (local67 == null) {
				return null;
			}
		}
		@Pc(114) int[] local114 = Static143.anIntArray316;
		@Pc(116) int local116 = Static143.anInt2743;
		@Pc(118) int local118 = Static143.anInt2745;
		@Pc(121) int[] local121 = new int[4];
		Static143.method2439(local121);
		@Pc(144) Class3_Sub4_Sub12_Sub2 local144 = new Class3_Sub4_Sub12_Sub2(36, 32);
		Static143.method2446(local144.anIntArray596, 36, 32);
		Static16.method272();
		Static16.method269(16, 16);
		Static16.aBoolean29 = false;
		@Pc(158) int local158 = local5.anInt503;
		if (arg0) {
			local158 = (int) ((double) local158 * 1.5D);
		} else if (arg6 == 2) {
			local158 = (int) ((double) local158 * 1.04D);
		}
		@Pc(186) int local186 = Class11.anIntArray26[local5.anInt528] * local158 >> 16;
		@Pc(195) int local195 = local158 * Class11.anIntArray27[local5.anInt528] >> 16;
		local59.method1939(local5.anInt549, local5.anInt533, local5.anInt528, local5.anInt499, local186 + local5.anInt497 - local59.method4973() / 2, local195 + local5.anInt497, -1L);
		if (arg6 >= 1) {
			local144.method4722(1);
			if (arg6 >= 2) {
				local144.method4722(16777215);
			}
			Static143.method2446(local144.anIntArray596, 36, 32);
		}
		if (arg7 != 0) {
			local144.method4711(arg7);
		}
		if (local5.anInt529 != -1) {
			local67.method4697(0, 0);
		} else if (local5.anInt553 != -1) {
			Static143.method2446(local67.anIntArray596, 36, 32);
			local144.method4697(0, 0);
			local144 = local67;
		}
		if (arg2 && (local5.anInt501 == 1 || arg5 != 1) && arg5 != -1) {
			Static259.aClass3_Sub4_Sub2_Sub2_2.method3685(Static79.method1659(arg5), 0, 9, 16776960, 1);
		}
		Static143.method2446(local114, local118, local116);
		Static143.method2441(local121);
		Static16.method272();
		Static16.aBoolean29 = true;
		return Static283.aBoolean393 && !arg4 ? new Class3_Sub4_Sub12_Sub1(local144) : local144;
	}
}
