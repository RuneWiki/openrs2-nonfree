import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] aClass6_Sub2_Sub2_Sub2Array10;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "Lclient!fc;")
	public static Class21 aClass21_13;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "Z")
	public static boolean aBoolean79;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static volatile int anInt1735 = 0;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!le;")
	public static Class36 aClass36_22 = new Class36(100);

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public static int anInt1741 = 0;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_677 = Static34.method846("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!b;")
	public static Class6_Sub1 aClass6_Sub1_2 = new Class6_Sub1(new byte[5000]);

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
	public static int anInt1746 = 0;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "J")
	public static volatile long aLong64 = 0L;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!rc;")
	public static Class55 aClass55_678 = Static34.method846("@cya@");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1190() {
		aClass6_Sub1_2 = null;
		aClass55_677 = null;
		aClass55_678 = null;
		aClass36_22 = null;
		aClass6_Sub2_Sub2_Sub2Array10 = null;
		aClass21_13 = null;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1191() {
		for (@Pc(6) Class6_Sub9 local6 = (Class6_Sub9) Static89.aClass3_5.method31(); local6 != null; local6 = (Class6_Sub9) Static89.aClass3_5.method26()) {
			if (local6.aClass6_Sub3_Sub1_2 != null) {
				Static26.aClass6_Sub3_Sub2_3.method1980(local6.aClass6_Sub3_Sub1_2);
				local6.aClass6_Sub3_Sub1_2 = null;
			}
			if (local6.aClass6_Sub3_Sub1_1 != null) {
				Static26.aClass6_Sub3_Sub2_3.method1980(local6.aClass6_Sub3_Sub1_1);
				local6.aClass6_Sub3_Sub1_1 = null;
			}
		}
		Static89.aClass3_5.method24();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V")
	public static void method1193(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static87.method1676(arg0 - 1L);
			Static87.method1676(1L);
		} else {
			Static87.method1676(arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lclient!sa;")
	public static Class6_Sub2_Sub10 method1194(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub2_Sub10 local11 = (Class6_Sub2_Sub10) Static17.aClass36_10.method1154((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static97.aClass40_36.method1243(arg0, 3);
		local11 = new Class6_Sub2_Sub10();
		if (local25 != null) {
			local11.method1717(new Class6_Sub1(local25));
		}
		Static17.aClass36_10.method1161((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Lclient!f;")
	public static Class6_Sub2_Sub5 method1195(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2_Sub5 local10 = (Class6_Sub2_Sub5) Static22.aClass36_11.method1154((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static92.aClass40_33.method1243(arg0, 10);
		local10 = new Class6_Sub2_Sub5();
		local10.anInt1102 = arg0;
		if (local20 != null) {
			local10.method698(new Class6_Sub1(local20));
		}
		local10.method702();
		if (local10.anInt1091 != -1) {
			local10.method703(method1195(local10.anInt1091), method1195(local10.anInt1082));
		}
		if (!Static61.aBoolean88 && local10.aBoolean46) {
			local10.aClass55Array6 = null;
			local10.aClass55Array7 = null;
			local10.aClass55_392 = Static28.aClass55_423;
			local10.anInt1103 = 0;
		}
		Static22.aClass36_11.method1161((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)Lclient!rc;")
	public static Class55 method1196(@OriginalArg(0) int arg0) {
		return Static66.method1358(arg0, false);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Z")
	public static boolean method1197() {
		return Static57.aClass5_1 != null;
	}
}
