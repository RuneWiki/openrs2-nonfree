import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "Lclient!jd;")
	public static Class4_Sub11 aClass4_Sub11_5 = new Class4_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!se", name = "T", descriptor = "Lclient!ec;")
	private static Class22 aClass22_804 = Static60.method1113("purple:");

	@OriginalMember(owner = "client!se", name = "S", descriptor = "Lclient!ec;")
	public static Class22 aClass22_803 = aClass22_804;

	@OriginalMember(owner = "client!se", name = "V", descriptor = "Lclient!ec;")
	public static Class22 aClass22_805 = Static60.method1113("<col=ffffff>");

	@OriginalMember(owner = "client!se", name = "W", descriptor = "Lclient!ec;")
	public static Class22 aClass22_806 = Static60.method1113("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_807 = aClass22_804;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
	public static int anInt2723 = -1;

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_810 = Static60.method1113("as it was used to break our rules)3");

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_808 = aClass22_810;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
	public static int anInt2725 = 1;

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_809 = Static60.method1113("Ausw-=hlen");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIB)Lclient!f;")
	public static Class4_Sub7 method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class4_Sub7 local17 = Static106.method1749(arg1);
		if (arg0 == -1) {
			return local17;
		} else if (local17 == null || local17.aClass4_Sub7Array1 == null || local17.aClass4_Sub7Array1.length <= arg0) {
			return null;
		} else {
			return local17.aClass4_Sub7Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method1768() {
		aClass22_809 = null;
		aClass22_806 = null;
		aClass22_803 = null;
		aClass22_804 = null;
		aClass22_808 = null;
		aClass22_810 = null;
		aClass22_807 = null;
		aClass22_805 = null;
		aClass23_1 = null;
		aClass4_Sub11_5 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZLclient!tb;Lclient!ga;)V")
	public static void method1769(@OriginalArg(0) int arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class20_Sub1 arg2) {
		@Pc(7) Class4_Sub20 local7 = new Class4_Sub20();
		local7.aLong99 = arg0;
		local7.aClass20_Sub1_74 = arg2;
		local7.anInt2897 = 1;
		local7.aClass71_4 = arg1;
		@Pc(22) Class82 local22 = Static2.aClass82_1;
		synchronized (Static2.aClass82_1) {
			Static2.aClass82_1.method2028(local7);
		}
		Static92.method1617();
	}
}
