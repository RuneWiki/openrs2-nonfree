import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "wc", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_1;

	@OriginalMember(owner = "client!bd", name = "xc", descriptor = "Lclient!kb;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!bd", name = "xb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_278 = Static69.method1153("(U3");

	@OriginalMember(owner = "client!bd", name = "Eb", descriptor = "I")
	public static int anInt397 = 0;

	@OriginalMember(owner = "client!bd", name = "Qb", descriptor = "Lclient!pc;")
	public static Class58 aClass58_1 = new Class58(512);

	@OriginalMember(owner = "client!bd", name = "Vb", descriptor = "I")
	public static int anInt406 = 0;

	@OriginalMember(owner = "client!bd", name = "jc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_280 = Static69.method1153(" seconds)3");

	@OriginalMember(owner = "client!bd", name = "kc", descriptor = "I")
	public static int anInt417 = 0;

	@OriginalMember(owner = "client!bd", name = "sc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_285 = Static69.method1153("This computers address has been blocked");

	@OriginalMember(owner = "client!bd", name = "lc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_281 = aClass64_285;

	@OriginalMember(owner = "client!bd", name = "mc", descriptor = "[B")
	public static byte[] aByteArray3 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!bd", name = "oc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_283 = Static69.method1153("Off");

	@OriginalMember(owner = "client!bd", name = "nc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_282 = aClass64_283;

	@OriginalMember(owner = "client!bd", name = "pc", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!bd", name = "qc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_284 = aClass64_280;

	@OriginalMember(owner = "client!bd", name = "uc", descriptor = "Lclient!dd;")
	public static Class19 aClass19_18 = new Class19(20);

	@OriginalMember(owner = "client!bd", name = "vc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_286 = Static69.method1153("titlebutton");

	@OriginalMember(owner = "client!bd", name = "yc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_287 = Static69.method1153("Registrierter Benutzer");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLclient!id;)Lclient!rd;")
	public static Class64 method245(@OriginalArg(2) Class1_Sub6 arg0) {
		try {
			@Pc(12) Class64 local12 = new Class64();
			local12.anInt2086 = arg0.method1844();
			if (local12.anInt2086 > 32767) {
				local12.anInt2086 = 32767;
			}
			local12.aByteArray24 = new byte[local12.anInt2086];
			arg0.anInt2574 += aClass39_1.method977(arg0.anInt2574, arg0.aByteArray27, 0, local12.aByteArray24, local12.anInt2086);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static55.aClass64_1814;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Lclient!rd;")
	public static Class64 method249(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static12.method1395(arg0) : Static66.aClass64_950;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V")
	public static void method251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static46.anInt1086 == 0 || arg0 == 0 || Static70.anInt1591 >= 50) {
			return;
		}
		Static60.anIntArray210[Static70.anInt1591] = arg2;
		Static119.anIntArray452[Static70.anInt1591] = arg0;
		Static7.anIntArray48[Static70.anInt1591] = arg1;
		Static25.aClass34Array5[Static70.anInt1591] = null;
		Static37.anIntArray136[Static70.anInt1591] = 0;
		Static70.anInt1591++;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)Lclient!e;")
	public static Class1_Sub1_Sub4 method254(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub4 local10 = (Class1_Sub1_Sub4) Static71.aClass19_59.method410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static55.aClass41_77.method1062(12, arg0);
		local10 = new Class1_Sub1_Sub4();
		if (local31 != null) {
			local10.method458(new Class1_Sub6(local31));
		}
		local10.method452();
		Static71.aClass19_59.method409(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)V")
	public static void method258(@OriginalArg(1) int arg0) {
		if (arg0 == Static64.anInt1487) {
			return;
		}
		if (Static64.anInt1487 == 0) {
			Static51.method919();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static121.anInt2878 = 0;
			Static69.anInt1562 = 0;
			Static99.anInt2205 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static95.aClass27_4 != null) {
			Static95.aClass27_4.method562();
			Static95.aClass27_4 = null;
		}
		if (Static64.anInt1487 == 25 || Static64.anInt1487 == 40) {
			Static49.method891();
			Static47.method1948();
		}
		if (Static64.anInt1487 == 25) {
			Static18.anInt585 = 0;
			Static117.anInt2814 = 0;
			Static45.anInt1074 = 1;
			Static43.anInt961 = 0;
			Static20.anInt629 = 1;
		}
		if (arg0 == 35) {
			Static50.method912();
			Static54.method1463();
			if (Static119.aClass37_39 == null) {
				Static119.aClass37_39 = Static55.method2074(765, 503, Static93.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static119.aClass37_39 = null;
			Static50.method912();
			Static13.method285(Static106.aClass41_Sub1_19, Static93.aCanvas1, Static85.aClass41_Sub1_22);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static119.aClass37_39 = null;
			Static54.method1463();
			Static22.method433(Static93.aCanvas1, Static85.aClass41_Sub1_22);
		}
		Static27.aBoolean59 = true;
		Static64.anInt1487 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	public static int method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIBIII)V")
	public static void method260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static1.method35(arg0)) {
			Static18.method357(arg1, -1, 0, arg2, arg5, Static65.aClass1_Sub1_Sub11ArrayArray1[arg0], 0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
	public static void method261() {
		aClass64_280 = null;
		aClass58_1 = null;
		aClass64_284 = null;
		aClass64_278 = null;
		aClass64_283 = null;
		aClass64_287 = null;
		aClass64_286 = null;
		aClass19_18 = null;
		aClass64_285 = null;
		aClass41_Sub1_1 = null;
		aClass64_281 = null;
		aByteArray3 = null;
		aClass64_282 = null;
		aClass39_1 = null;
	}
}
