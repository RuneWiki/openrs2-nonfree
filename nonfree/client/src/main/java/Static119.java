import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!jc;")
	public static Class34 aClass34_5;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!q;")
	public static Class62 aClass62_32;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1414 = Static108.method1915("Please try again)3");

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1415 = Static108.method1915("Too many connections from your address)3");

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean234 = true;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
	public static int[] anIntArray462 = new int[5];

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1416 = Static108.method1915("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1417 = aClass39_1414;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1418 = Static108.method1915("<br>");

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1419 = aClass39_1415;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
	public static boolean method2050(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = Static66.anIntArray246[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 49;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!r;IIII)V")
	public static void method2052(@OriginalArg(0) Class1_Sub1_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 == Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1 || Static110.anInt2795 >= 400) {
			return;
		}
		@Pc(48) Class39 local48;
		if (arg0.anInt2540 == 0) {
			local48 = Static30.method601(new Class39[] { arg0.aClass39_1234, Static64.method1142(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2546, arg0.anInt2546), Static33.aClass39_487, Static91.aClass39_1078, Static69.method1226(arg0.anInt2546), Static54.aClass39_731 });
		} else {
			local48 = Static30.method601(new Class39[] { arg0.aClass39_1234, Static33.aClass39_487, Static32.aClass39_340, Static69.method1226(arg0.anInt2540), Static54.aClass39_731 });
		}
		@Pc(97) int local97;
		if (Static89.anInt2107 == 1) {
			Static71.method1242(Static30.method601(new Class39[] { Static4.aClass39_66, Static49.aClass39_655, local48 }), 28, Static77.aClass39_953, arg3, arg1, arg2);
		} else if (!Static46.aBoolean222) {
			for (local97 = 4; local97 >= 0; local97--) {
				if (Static11.aClass39Array6[local97] != null) {
					@Pc(109) int local109 = 0;
					@Pc(111) short local111 = 0;
					if (Static11.aClass39Array6[local97].method1158(Static46.aClass39_1335)) {
						if (arg0.anInt2546 > Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2546) {
							local111 = 2000;
						}
						if (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2552 != 0 && arg0.anInt2552 != 0) {
							if (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2552 == arg0.anInt2552) {
								local111 = 2000;
							} else {
								local111 = 0;
							}
						}
					} else if (Static101.aBooleanArray13[local97]) {
						local111 = 2000;
					}
					if (local97 == 0) {
						local109 = local111 + 55;
					}
					if (local97 == 1) {
						local109 = local111 + 13;
					}
					if (local97 == 2) {
						local109 = local111 + 45;
					}
					if (local97 == 3) {
						local109 = local111 + 3;
					}
					if (local97 == 4) {
						local109 = local111 + 36;
					}
					Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local48 }), local109, Static11.aClass39Array6[local97], arg3, arg1, arg2);
				}
			}
		} else if ((Static82.anInt1996 & 0x8) == 8) {
			Static71.method1242(Static30.method601(new Class39[] { Static103.aClass39_1273, Static49.aClass39_655, local48 }), 54, Static52.aClass39_695, arg3, arg1, arg2);
		}
		for (local97 = 0; local97 < Static110.anInt2795; local97++) {
			if (Static66.anIntArray246[local97] == 48) {
				Static50.aClass39Array13[local97] = Static30.method601(new Class39[] { Static118.aClass39_1408, Static116.aClass39_1382, Static20.aClass39_352, local48 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!q;B)Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 method2053(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return Static96.method1615(arg1, arg0) ? Static104.method1860() : null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILclient!q;)Z")
	public static boolean method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(9) byte[] local9 = arg2.method2008(arg1, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static116.method1989(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!ua;Lclient!pe;)V")
	public static void method2056(@OriginalArg(1) int arg0, @OriginalArg(2) Class62_Sub1 arg1, @OriginalArg(3) Class61 arg2) {
		@Pc(7) Class1_Sub3 local7 = new Class1_Sub3();
		local7.aLong98 = arg0;
		local7.aClass62_Sub1_6 = arg1;
		local7.aClass61_1 = arg2;
		local7.anInt151 = 1;
		@Pc(26) Class31 local26 = Static1.aClass31_4;
		synchronized (Static1.aClass31_4) {
			Static1.aClass31_4.method1005(local7);
		}
		Static64.method1141();
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	public static void method2057() {
		aClass62_32 = null;
		aClass34_5 = null;
		aClass39_1418 = null;
		aClass39_1414 = null;
		aClass39_1416 = null;
		aClass39_1415 = null;
		anIntArray462 = null;
		aClass39_1417 = null;
		aClass39_1419 = null;
	}
}
