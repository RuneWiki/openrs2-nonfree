import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public static int anInt3578;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	public static int anInt3579;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public static int anInt3580;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1258 = Static151.method2243("Login limit exceeded)3");

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1259 = Static151.method2243("titlebox");

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
	public static final int[] anIntArray308 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1260 = Static151.method2243("<img=1>");

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1264 = Static151.method2243("Use");

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1261 = aClass62_1264;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1262 = aClass62_1258;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1263 = Static151.method2243("Cancel");

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "[Lclient!kd;")
	public static final Class2_Sub11[] aClass2_Sub11Array1 = new Class2_Sub11[2048];

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1265 = aClass62_1263;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method2456() {
		Static138.anIntArray256 = null;
		Static25.anIntArray57 = null;
		Static19.anIntArray38 = null;
		Static8.aByteArrayArray1 = null;
		Static86.anIntArray298 = null;
		Static108.anIntArray222 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method2457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 >= Static122.anInt2718 && arg2 <= Static153.anInt3279 && Static154.anInt3307 <= arg0 && Static15.anInt353 >= arg6) {
			Static13.method232(arg2, arg3, arg4, arg5, arg6, arg0, arg1);
		} else {
			Static99.method1599(arg0, arg1, arg5, arg2, arg3, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method2458() {
		if (Static13.aClass47_3 != null || Static13.aClass47_2 != null) {
			return;
		}
		@Pc(17) int local17 = Static44.anInt998;
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (Static180.aBoolean167) {
			@Pc(176) int local176;
			if (local17 != 1) {
				local176 = Static163.anInt3446;
				local84 = Static32.anInt773;
				if (Static46.anInt1034 - 10 > local176 || Static46.anInt1034 + Static157.anInt3335 + 10 < local176 || Static21.anInt505 - 10 > local84 || local84 > Static21.anInt505 + Static145.anInt3129 + 10) {
					Static180.aBoolean167 = false;
					Static135.method2042(Static145.anInt3129, Static21.anInt505, Static46.anInt1034, Static157.anInt3335);
				}
			}
			if (local17 != 1) {
				return;
			}
			local176 = Static46.anInt1034;
			local84 = Static21.anInt505;
			@Pc(235) int local235 = Static43.anInt985;
			@Pc(237) int local237 = -1;
			@Pc(239) int local239 = Static170.anInt3634;
			local90 = Static157.anInt3335;
			for (@Pc(243) int local243 = 0; local243 < Static51.anInt1111; local243++) {
				@Pc(258) int local258 = (Static51.anInt1111 - local243 - 1) * 15 + local84 + 31;
				if (local176 < local235 && local235 < local90 + local176 && local258 - 13 < local239 && local239 < local258 + 3) {
					local237 = local243;
				}
			}
			if (local237 != -1) {
				Static22.method398(local237);
			}
			Static180.aBoolean167 = false;
			Static135.method2042(Static145.anInt3129, Static21.anInt505, Static46.anInt1034, Static157.anInt3335);
			return;
		}
		if (local17 == 1 && Static51.anInt1111 > 0) {
			@Pc(30) short local30 = Static26.aShortArray134[Static51.anInt1111 - 1];
			if (local30 == 57 || local30 == 4 || local30 == 9 || local30 == 35 || local30 == 25 || local30 == 19 || local30 == 6 || local30 == 1 || local30 == 5 || local30 == 34 || local30 == 42 || local30 == 1001) {
				local84 = Static147.anIntArray281[Static51.anInt1111 - 1];
				local90 = Static102.anIntArray215[Static51.anInt1111 - 1];
				@Pc(94) Class47 local94 = Static143.method2159(local90);
				if (Static80.method1134(Static155.method2304(local94)) || Static7.method1723(Static155.method2304(local94))) {
					Static63.aBoolean56 = false;
					Static157.anInt3330 = 0;
					if (Static13.aClass47_3 != null) {
						Static165.method2410(Static13.aClass47_3);
					}
					Static13.aClass47_3 = Static143.method2159(local90);
					Static3.anInt136 = Static170.anInt3634;
					Static112.anInt2449 = Static43.anInt985;
					Static139.anInt2941 = local84;
					Static165.method2410(Static13.aClass47_3);
					return;
				}
			}
		}
		if (local17 == 1 && (Static13.anInt329 == 1 && Static51.anInt1111 > 2 || Static92.method1393(Static51.anInt1111 - 1))) {
			local17 = 2;
		}
		if (local17 == 1 && Static51.anInt1111 > 0) {
			Static22.method398(Static51.anInt1111 - 1);
		}
		if (local17 == 2 && Static51.anInt1111 > 0) {
			Static104.method1631();
			return;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method2459() {
		Static108.aClass2_Sub11_Sub1_3.method1586();
		@Pc(11) int local11 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static108.aClass2_Sub11_Sub1_3.method1584(2);
		if (local19 == 0) {
			Static187.anIntArray355[Static196.anInt4032++] = 2047;
			return;
		}
		@Pc(50) int local50;
		@Pc(62) int local62;
		if (local19 == 1) {
			local50 = Static108.aClass2_Sub11_Sub1_3.method1584(3);
			Static186.aClass7_Sub2_Sub2_1.method2174(false, local50);
			local62 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
			if (local62 == 1) {
				Static187.anIntArray355[Static196.anInt4032++] = 2047;
			}
			return;
		}
		@Pc(104) int local104;
		if (local19 == 2) {
			local50 = Static108.aClass2_Sub11_Sub1_3.method1584(3);
			Static186.aClass7_Sub2_Sub2_1.method2174(true, local50);
			local62 = Static108.aClass2_Sub11_Sub1_3.method1584(3);
			Static186.aClass7_Sub2_Sub2_1.method2174(true, local62);
			local104 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
			if (local104 == 1) {
				Static187.anIntArray355[Static196.anInt4032++] = 2047;
			}
		} else if (local19 == 3) {
			local50 = Static108.aClass2_Sub11_Sub1_3.method1584(7);
			local62 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
			if (local62 == 1) {
				Static187.anIntArray355[Static196.anInt4032++] = 2047;
			}
			local104 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
			Static126.anInt2806 = Static108.aClass2_Sub11_Sub1_3.method1584(2);
			@Pc(161) int local161 = Static108.aClass2_Sub11_Sub1_3.method1584(7);
			Static186.aClass7_Sub2_Sub2_1.method2176(local161, local50, local104 == 1);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lclient!mb;I)Lclient!mb;")
	public static Class62 method2460(@OriginalArg(0) Class62[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static64.method888(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class84 local3 = new Class84();
		local3.anInt3478 = arg2 / 128;
		local3.anInt3489 = arg3 / 128;
		local3.anInt3475 = arg4 / 128;
		local3.anInt3477 = arg5 / 128;
		local3.anInt3473 = arg1;
		local3.anInt3484 = arg2;
		local3.anInt3474 = arg3;
		local3.anInt3482 = arg4;
		local3.anInt3470 = arg5;
		local3.anInt3483 = arg6;
		local3.anInt3479 = arg7;
		Static123.aClass84ArrayArray11[arg0][Static123.anIntArray402[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJ)V")
	public static void method2463(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}
}
