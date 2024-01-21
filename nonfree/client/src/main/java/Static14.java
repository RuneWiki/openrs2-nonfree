import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Lclient!ff;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] aClass1_Sub1_Sub5_Sub2Array1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!id;")
	public static Class1_Sub6 aClass1_Sub6_1 = new Class1_Sub6(new byte[5000]);

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!rd;")
	private static Class64 aClass64_310 = Static69.method1153("Offline");

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!rd;")
	public static Class64 aClass64_309 = aClass64_310;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array6 = new Class64[1000];

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_311 = Static69.method1153("redstone1");

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_312 = Static69.method1153(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method290() {
		Static102.aClass19_88.method416();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method291() {
		aClass27_1 = null;
		aClass64_309 = null;
		aLongArray1 = null;
		aClass64_310 = null;
		aClass64Array6 = null;
		aClass1_Sub6_1 = null;
		aClass64_312 = null;
		aClass1_Sub1_Sub5_Sub2Array1 = null;
		aClass64_311 = null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public static void method292() {
		for (@Pc(7) int local7 = -1; local7 < Static6.anInt319; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static90.anIntArray69[local7];
			}
			@Pc(25) Class1_Sub1_Sub2_Sub1_Sub2 local25 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local17];
			if (local25 != null) {
				Static86.method1417(1, local25);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	public static void method293() {
		if (aClass27_1 != null) {
			aClass27_1.method562();
			aClass27_1 = null;
		}
		Static106.method1743();
		Static82.aClass68_1.method1768();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static74.aClass52Array1[local18].method1199();
		}
		System.gc();
		Static65.method1107();
		Static68.anInt1536 = 0;
		Static6.anInt317 = -1;
		Static90.method340();
		Static10.method258(10);
	}
}
