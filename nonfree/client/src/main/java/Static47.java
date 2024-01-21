import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!j", name = "Xb", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_10;

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_589 = Static2.method66("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!j", name = "Db", descriptor = "Lclient!qd;")
	public static Class54 aClass54_12 = new Class54(50);

	@OriginalMember(owner = "client!j", name = "Pb", descriptor = "I")
	public static int anInt1323 = -1;

	@OriginalMember(owner = "client!j", name = "Qb", descriptor = "I")
	public static int anInt1324 = 0;

	@OriginalMember(owner = "client!j", name = "Rb", descriptor = "I")
	public static int anInt1325 = 0;

	@OriginalMember(owner = "client!j", name = "Sb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_590 = Static2.method66("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!j", name = "Ub", descriptor = "Lclient!ke;")
	private static Class39 aClass39_591 = Static2.method66("Add friend");

	@OriginalMember(owner = "client!j", name = "hc", descriptor = "Lclient!ke;")
	private static Class39 aClass39_601 = Static2.method66("Hide");

	@OriginalMember(owner = "client!j", name = "Wb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_592 = aClass39_601;

	@OriginalMember(owner = "client!j", name = "cc", descriptor = "Lclient!ke;")
	private static Class39 aClass39_597 = Static2.method66("You have only just left another world)3");

	@OriginalMember(owner = "client!j", name = "Yb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_593 = aClass39_597;

	@OriginalMember(owner = "client!j", name = "Zb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_594 = aClass39_591;

	@OriginalMember(owner = "client!j", name = "ac", descriptor = "Lclient!ke;")
	public static Class39 aClass39_595 = Static2.method66("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!j", name = "dc", descriptor = "Lclient!ke;")
	private static Class39 aClass39_598 = Static2.method66("flash3:");

	@OriginalMember(owner = "client!j", name = "bc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_596 = aClass39_598;

	@OriginalMember(owner = "client!j", name = "gc", descriptor = "Lclient!ke;")
	private static Class39 aClass39_600 = Static2.method66("shake:");

	@OriginalMember(owner = "client!j", name = "fc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_599 = aClass39_600;

	@OriginalMember(owner = "client!j", name = "ic", descriptor = "I")
	public static int anInt1329 = 0;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	public static void method897() {
		aClass39_589 = null;
		aClass39_593 = null;
		aClass39_601 = null;
		aClass39_599 = null;
		aClass54_12 = null;
		aClass39_591 = null;
		aClass39_596 = null;
		aClass39_595 = null;
		aClass39_594 = null;
		aClass36_Sub1_10 = null;
		aClass39_597 = null;
		aClass39_600 = null;
		aClass39_590 = null;
		aClass39_598 = null;
		aClass39_592 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II[Lclient!ne;Lclient!le;[BI)V")
	public static void method900(@OriginalArg(0) int arg0, @OriginalArg(2) Class47[] arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub5 local10 = new Class2_Sub5(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method1258();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method1258();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(67) int local67 = local10.method1281();
				@Pc(71) int local71 = local67 >> 2;
				@Pc(75) int local75 = local67 & 0x3;
				@Pc(79) int local79 = local57 + arg4;
				@Pc(84) int local84 = local51 + arg0;
				if (local79 > 0 && local84 > 0 && local79 < 103 && local84 < 103) {
					@Pc(101) Class47 local101 = null;
					@Pc(103) int local103 = local61;
					if ((Static96.aByteArrayArrayArray8[1][local79][local84] & 0x2) == 2) {
						local103 = local61 - 1;
					}
					if (local103 >= 0) {
						local101 = arg1[local103];
					}
					Static51.method1780(local84, local61, local71, local79, arg2, local75, local12, local101);
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!jd;II)Lclient!c;")
	public static Class2_Sub1_Sub4_Sub1 method902(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(3) int arg2) {
		return Static84.method2047(arg2, arg1, arg0) ? Static18.method421() : null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIILclient!ec;II)V")
	public static void method906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub6 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static60.aBoolean87) {
			Static9.anInt197 = 32;
		} else {
			Static9.anInt197 = 0;
		}
		Static60.aBoolean87 = false;
		if (arg1 >= arg7 && arg1 < arg7 + 16 && arg0 <= arg4 && arg0 + 16 > arg4) {
			if (arg3 == 1) {
				Static97.aBoolean120 = true;
			}
			if (arg3 == 2 || arg3 == 3) {
				Static31.aBoolean91 = true;
			}
			arg5.anInt727 -= Static24.anInt664 * 4;
		} else if (arg7 <= arg1 && arg1 < arg7 + 16 && arg4 >= arg2 + arg0 - 16 && arg4 < arg0 + arg2) {
			arg5.anInt727 += Static24.anInt664 * 4;
			if (arg3 == 2 || arg3 == 3) {
				Static31.aBoolean91 = true;
			}
			if (arg3 == 1) {
				Static97.aBoolean120 = true;
				return;
			}
		} else if (arg1 >= arg7 - Static9.anInt197 && Static9.anInt197 + arg7 + 16 > arg1 && arg4 >= arg0 + 16 && arg2 + arg0 - 16 > arg4 && Static24.anInt664 > 0) {
			if (arg3 == 1) {
				Static97.aBoolean120 = true;
			}
			@Pc(154) int local154 = (arg2 - 32) * arg2 / arg6;
			if (arg3 == 2 || arg3 == 3) {
				Static31.aBoolean91 = true;
			}
			Static60.aBoolean87 = true;
			if (local154 < 8) {
				local154 = 8;
			}
			@Pc(182) int local182 = arg2 - local154 - 32;
			@Pc(192) int local192 = arg4 - arg0 - local154 / 2 - 16;
			arg5.anInt727 = local192 * (arg6 - arg2) / local182;
		} else {
			return;
		}
	}
}
