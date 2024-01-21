import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1041 = Static170.method3101("::clientdrop");

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1042 = Static170.method3101("Login server offline)3");

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1043 = Static170.method3101(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1048 = Static170.method3101("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1044 = aClass28_1048;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	public static int anInt3186 = 0;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1045 = aClass28_1042;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1046 = Static170.method3101("gelb:");

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1047 = Static170.method3101("(U1");

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Z")
	public static boolean method2459() {
		try {
			if (Static8.anInt1209 == 2) {
				if (Static179.aClass3_Sub9_1 == null) {
					Static179.aClass3_Sub9_1 = Static186.method1410(Static75.aClass7_32, Static16.anInt492, Static2.anInt83);
					if (Static179.aClass3_Sub9_1 == null) {
						return false;
					}
				}
				if (Static24.aClass66_1 == null) {
					Static24.aClass66_1 = new Class66(Static121.aClass7_50, Static93.aClass7_43);
				}
				if (Static156.aClass3_Sub3_Sub2_2.method1924(Static65.aClass7_30, Static24.aClass66_1, Static179.aClass3_Sub9_1)) {
					Static156.aClass3_Sub3_Sub2_2.method1911();
					Static156.aClass3_Sub3_Sub2_2.method1898(Static164.anInt3981);
					Static156.aClass3_Sub3_Sub2_2.method1927(Static179.aClass3_Sub9_1, Static75.aBoolean117);
					Static8.anInt1209 = 0;
					Static179.aClass3_Sub9_1 = null;
					Static24.aClass66_1 = null;
					Static75.aClass7_32 = null;
					return true;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static156.aClass3_Sub3_Sub2_2.method1930();
			Static179.aClass3_Sub9_1 = null;
			Static8.anInt1209 = 0;
			Static24.aClass66_1 = null;
			Static75.aClass7_32 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public static void method2460() {
		aClass28_1046 = null;
		aClass28_1044 = null;
		aClass28_1043 = null;
		aClass28_1047 = null;
		RuntimeException_Sub1.anIntArray544 = null;
		aClass28_1048 = null;
		aClass28_1045 = null;
		aClass28_1041 = null;
		aClass28_1042 = null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II[Lclient!gf;)V")
	public static void method2461(@OriginalArg(1) int arg0, @OriginalArg(2) Class33[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) Class33 local6 = arg1[local1];
			if (local6 != null) {
				if (local6.anInt1522 == 0) {
					if (local6.aClass33Array2 != null) {
						method2461(arg0, local6.aClass33Array2);
					}
					@Pc(30) Class3_Sub7 local30 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local6.anInt1471);
					if (local30 != null) {
						Static65.method1570(local30.anInt1548, arg0);
					}
				}
				@Pc(46) Class3_Sub6 local46;
				if (arg0 == 0 && local6.anObjectArray8 != null) {
					local46 = new Class3_Sub6();
					local46.aClass33_3 = local6;
					local46.anObjectArray2 = local6.anObjectArray8;
					Static163.method3014(local46);
				}
				if (arg0 == 1 && local6.anObjectArray25 != null) {
					if (local6.anInt1496 >= 0) {
						@Pc(72) Class33 local72 = Static19.method576(local6.anInt1471);
						if (local72 == null || local72.aClass33Array2 == null || local72.aClass33Array2.length <= local6.anInt1496 || local72.aClass33Array2[local6.anInt1496] != local6) {
							continue;
						}
					}
					local46 = new Class3_Sub6();
					local46.aClass33_3 = local6;
					local46.anObjectArray2 = local6.anObjectArray25;
					Static163.method3014(local46);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ah;Lclient!eh;ILclient!ah;Lclient!eh;)Lclient!jh;")
	public static Class3_Sub2_Sub2_Sub1_Sub1 method2462(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) Class28 arg3) {
		@Pc(14) int local14 = arg0.method1029(arg3);
		@Pc(20) int local20 = arg0.method1031(arg1, local14);
		return Static137.method2688(local20, local14, arg2, arg0);
	}
}
