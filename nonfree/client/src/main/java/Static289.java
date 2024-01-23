import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
	public static int anInt5738;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
	public static int anInt5741;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
	public static volatile int anInt5736 = 0;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
	public static int anInt5737 = 0;

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString187 = "Discard";

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[[I)V")
	public static void method4433(@OriginalArg(1) int[][] arg0) {
		Static151.anIntArrayArray26 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V")
	public static void method4434() {
		if (Static18.aClass163_1 != null) {
			@Pc(8) Class163 local8 = Static18.aClass163_1;
			synchronized (Static18.aClass163_1) {
				Static18.aClass163_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
	public static void method4435() {
		Static210.aClass31_32.method855();
		Static296.aClass31_46.method855();
		Static98.aClass31_15.method855();
	}

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "(I)V")
	public static void method4436() {
		Static221.method3523();
		Static98.method1608();
		Static23.method4493();
		Static105.method1663();
		Static30.method508();
		Static89.method1464();
		Static270.method4149();
		Static65.method1081();
		Static149.method2338();
		Static130.method2054();
		Static155.method2394();
		Static17.method315();
		Static296.method4529();
		Static177.method2673();
		Static263.method4064();
		Static116.method1820();
		Static113.method1762();
		Static180.method2692();
		Static276.method4250();
		Static155.method2391();
		Static198.aClass31_29.method856(5);
		Static250.aClass31_37.method856(5);
	}
}
