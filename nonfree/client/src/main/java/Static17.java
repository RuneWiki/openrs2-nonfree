import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
	public static int anInt2522;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1175 = Static32.method683("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1174 = aClass49_1175;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "[I")
	public static int[] anIntArray242 = new int[25];

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1176 = Static32.method683("<col=c0ff00>");

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "[Lclient!ob;")
	public static Class61[] aClass61Array2 = new Class61[6];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!bg;)V")
	public static void method2052(@OriginalArg(1) Class11 arg0) {
		Static14.aClass11_15 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Z")
	public static boolean method2055(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(III)J")
	public static long method2057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass7_1 == null ? 0L : local7.aClass7_1.aLong13;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)Lclient!fc;")
	public static Class2_Sub2_Sub6 method2064(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub6 local10 = (Class2_Sub2_Sub6) Static104.aClass74_64.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static14.aClass11_15.method2049(arg0, 5);
		local10 = new Class2_Sub2_Sub6();
		if (local20 != null) {
			local10.method899(new Class2_Sub13(local20));
		}
		Static104.aClass74_64.method2341((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method2067() {
		if (!Static77.aBoolean71) {
			return;
		}
		Static9.anIntArray12 = null;
		Static156.aClass2_Sub2_Sub2_Sub3Array10 = null;
		Static127.anIntArray263 = null;
		Static70.anIntArray170 = null;
		Static142.aClass2_Sub2_Sub2_Sub3_6 = null;
		Static157.aClass2_Sub2_Sub2_Sub2Array9 = null;
		Static102.anIntArray208 = null;
		Static150.anIntArray287 = null;
		Static76.aClass2_Sub2_Sub2_Sub2Array5 = null;
		Static71.aClass2_Sub2_Sub2_Sub3_3 = null;
		Static11.anIntArray14 = null;
		Static31.aClass2_Sub2_Sub2_Sub2_1 = null;
		Static108.aClass2_Sub2_Sub2_Sub2Array7 = null;
		Static185.aClass2_Sub2_Sub2_Sub2Array10 = null;
		Static154.aClass2_Sub2_Sub2_Sub2_4 = null;
		Static34.anIntArray80 = null;
		Static47.aClass2_Sub2_Sub2_Sub3_2 = null;
		Static140.aClass2_Sub2_Sub2_Sub2_3 = null;
		Static113.aClass2_Sub2_Sub2_Sub2_2 = null;
		Static167.anIntArray323 = null;
		Static77.aClass2_Sub2_Sub2_Sub2Array6 = null;
		Static88.aClass2_Sub2_Sub2_Sub3_4 = null;
		Static45.method832();
		Static37.method758(true);
		Static77.aBoolean71 = false;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method2074() {
		for (@Pc(10) Class2_Sub2_Sub3_Sub2 local10 = (Class2_Sub2_Sub3_Sub2) Static12.aClass81_1.method2682(); local10 != null; local10 = (Class2_Sub2_Sub3_Sub2) Static12.aClass81_1.method2686()) {
			if (Static66.anInt1396 != local10.anInt622 || local10.aBoolean22) {
				local10.method3007();
			} else if (local10.anInt619 <= Static127.anInt2757) {
				local10.method505(Static170.anInt3724);
				if (local10.aBoolean22) {
					local10.method3007();
				} else {
					Static86.method2730(local10.anInt622, local10.anInt624, local10.anInt625, local10.anInt629, 60, local10, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
	public static void method2077() {
		aClass49_1175 = null;
		aClass49_1174 = null;
		aClass49_1176 = null;
		anIntArray242 = null;
		aClass61Array2 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!bg;Lclient!lf;Lclient!bg;ZLclient!lf;)Lclient!db;")
	public static Class2_Sub2_Sub2_Sub1_Sub1 method2078(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(4) Class49 arg3) {
		@Pc(14) int local14 = arg0.method2053(arg3);
		@Pc(20) int local20 = arg0.method2056(arg1, local14);
		return Static82.method1417(local14, local20, arg0, arg2);
	}
}
