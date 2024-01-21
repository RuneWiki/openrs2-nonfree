import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!tb;")
	public static Class44 aClass44_36;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	public static int anInt1610;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Lclient!md;")
	public static Class30 aClass30_10;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	public static int anInt1615;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public static int anInt1618;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Lclient!gb;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
	public static int anInt1619;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int anInt1596 = -1;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "[I")
	public static int[] anIntArray119 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Lclient!oa;")
	private static Class56 aClass56_891 = Static33.method650("Use");

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_890 = aClass56_891;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public static int anInt1605 = 2;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	public static int anInt1607 = -1;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public static int anInt1609 = -1;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	public static int anInt1612 = 0;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public static int anInt1617 = 0;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Lclient!oa;")
	public static Class56 aClass56_892 = Static33.method650(")1p");

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Lclient!oa;")
	public static Class56 aClass56_893 = Static33.method650("backhmid2");

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	public static int anInt1621 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1074(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg2 < 1 || arg0 > 102 || arg2 > 102) {
			return;
		}
		if (Static77.aBoolean169 && Static94.anInt2470 != arg1) {
			return;
		}
		@Pc(35) int local35 = 0;
		if (arg5 == 0) {
			local35 = Static116.aClass14_1.method436(arg1, arg0, arg2);
		}
		if (arg5 == 1) {
			local35 = Static116.aClass14_1.method411(arg1, arg0, arg2);
		}
		if (arg5 == 2) {
			local35 = Static116.aClass14_1.method446(arg1, arg0, arg2);
		}
		if (arg5 == 3) {
			local35 = Static116.aClass14_1.method419(arg1, arg0, arg2);
		}
		@Pc(87) int local87;
		if (local35 != 0) {
			local87 = Static116.aClass14_1.method429(arg1, arg0, arg2, local35);
			@Pc(91) int local91 = local87 & 0x1F;
			@Pc(97) int local97 = local35 >> 14 & 0x7FFF;
			@Pc(103) int local103 = local87 >> 6 & 0x3;
			@Pc(114) Class3_Sub1_Sub15 local114;
			if (arg5 == 0) {
				Static116.aClass14_1.method418(arg1, arg0, arg2);
				local114 = Static122.method1962(local97);
				if (local114.anInt2717 != 0) {
					Static115.aClass81Array1[arg1].method1999(local91, local103, local114.aBoolean136, arg0, arg2);
				}
			}
			if (arg5 == 1) {
				Static116.aClass14_1.method440(arg1, arg0, arg2);
			}
			if (arg5 == 2) {
				Static116.aClass14_1.method443(arg1, arg0, arg2);
				local114 = Static122.method1962(local97);
				if (local114.anInt2745 + arg0 > 103 || local114.anInt2745 + arg2 > 103 || arg0 + local114.anInt2743 > 103 || arg2 + local114.anInt2743 > 103) {
					return;
				}
				if (local114.anInt2717 != 0) {
					Static115.aClass81Array1[arg1].method2004(local114.aBoolean136, arg0, local114.anInt2743, arg2, local114.anInt2745, local103);
				}
			}
			if (arg5 == 3) {
				Static116.aClass14_1.method416(arg1, arg0, arg2);
				local114 = Static122.method1962(local97);
				if (local114.anInt2717 == 1) {
					Static115.aClass81Array1[arg1].method2003(arg2, arg0);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		local87 = arg1;
		if (arg1 < 3 && (Static66.aByteArrayArrayArray3[1][arg0][arg2] & 0x2) == 2) {
			local87 = arg1 + 1;
		}
		Static104.method1740(Static115.aClass81Array1[arg1], arg4, arg6, local87, arg3, arg0, arg1, arg2, Static116.aClass14_1);
		return;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public static void method1075(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static7.aBoolean18) {
			Static44.method807();
		} else if (arg0 != -1 && arg0 != Static69.anInt1913 && Static24.anInt703 != 0 && !Static7.aBoolean18) {
			Static77.method2027(Static100.aClass44_Sub1_65, arg0, 0, Static24.anInt703);
		}
		Static69.anInt1913 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 method1079() {
		@Pc(7) Class3_Sub1_Sub1_Sub4 local7 = new Class3_Sub1_Sub1_Sub4();
		local7.anIntArray190 = Static69.anIntArray163;
		local7.anInt2251 = Static64.anInt1829;
		local7.anInt2249 = Static69.anIntArray161[0];
		local7.anInt2250 = Static51.anIntArray103[0];
		local7.anInt2247 = Static47.anIntArray96[0];
		local7.aByteArray30 = Static116.aByteArrayArray10[0];
		local7.anInt2252 = Static76.anIntArray179[0];
		local7.anInt2248 = Static84.anInt2277;
		Static127.method2040();
		return local7;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)Z")
	public static boolean method1081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class3_Sub1_Sub15 local3 = Static122.method1962(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local3.method1827(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZ)I")
	public static int method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public static void method1085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static111.aClass3_Sub2_Sub1_4.method325(216);
		Static111.aClass3_Sub2_Sub1_4.method297(arg1);
		Static111.aClass3_Sub2_Sub1_4.method285(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method1088() {
		anIntArray120 = null;
		aClass56_892 = null;
		aClass44_36 = null;
		aClass3_Sub1_Sub1_Sub1_3 = null;
		aClass30_10 = null;
		aClass56_891 = null;
		aClass56_893 = null;
		aShortArrayArray1 = null;
		anIntArray119 = null;
		aClass56_890 = null;
	}
}
