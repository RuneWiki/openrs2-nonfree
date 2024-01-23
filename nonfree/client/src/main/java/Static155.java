import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "Lclient!i;")
	public static Class73 aClass73_3;

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array8;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "Z")
	public static boolean aBoolean216 = false;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	public static int anInt2868 = 0;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	public static volatile int anInt2871 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
	public static void method2388(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static39.aClass22_2.method633((long) arg0);
		if (local12 != null) {
			for (@Pc(18) int local18 = 0; local18 < local12.anIntArray235.length; local18++) {
				local12.anIntArray235[local18] = -1;
				local12.anIntArray234[local18] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BIIII)V")
	public static void method2389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			Static288.method4405(arg1, arg0, arg3, Static151.anIntArrayArray26[arg2]);
		} else {
			Static288.method4405(arg1, arg3, arg0, Static151.anIntArrayArray26[arg2]);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method2390(@OriginalArg(1) String arg0) {
		@Pc(11) String local11 = Static266.method4096(Static136.method2158(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(BI)V")
	public static void method2391() {
		Static204.aClass31_30.method856(5);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!og;I)V")
	public static void method2392(@OriginalArg(0) Class127 arg0) {
		if (Static51.anInt1077 == arg0.anInt3557) {
			Static267.aBooleanArray25[arg0.anInt3588] = true;
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
	public static void method2393() {
		if (!Static149.aBoolean196 && Static243.anInt5013 != 2) {
			try {
				Static301.method946("tbrefresh", Static95.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
	public static void method2394() {
		Static205.aClass31_31.method856(5);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V")
	public static void method2395() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static267.aBooleanArray25[local7] = true;
		}
	}
}
