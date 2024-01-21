import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1402 = Static49.method1293("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1397 = aClass70_1402;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1398 = Static49.method1293("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1399 = aClass70_1398;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1400 = Static49.method1293("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1403 = Static49.method1293("Your account has been disabled)3");

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1401 = aClass70_1403;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	public static volatile int anInt4159 = 0;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1404 = aClass70_1398;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1405 = Static49.method1293(" weitere Optionen");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
	public static int method3180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) ((arg1 << 16) + arg0);
		return Static139.aClass1_Sub1_Sub5_1 != null && Static139.aClass1_Sub1_Sub5_1.aLong147 == local15 ? Static173.aClass1_Sub9_3.anInt1592 * 99 / (Static173.aClass1_Sub9_3.aByteArray25.length - Static139.aClass1_Sub1_Sub5_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method3181() {
		Static161.anInt4212 = 0;
		Static67.anInt2096 = 0;
		Static163.method3265();
		Static110.method2282();
		Static118.method2405();
		Static28.method634();
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < Static67.anInt2096; local28++) {
			local34 = Static151.anIntArray380[local28];
			if (Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34].anInt2026 != Static47.anInt1654) {
				Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34] = null;
			}
		}
		if (Static69.anInt2127 != Static98.aClass1_Sub9_Sub1_2.anInt1592) {
			throw new RuntimeException("gpp1 pos:" + Static98.aClass1_Sub9_Sub1_2.anInt1592 + " psize:" + Static69.anInt2127);
		}
		for (local34 = 0; local34 < Static104.anInt2960; local34++) {
			if (Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[Static26.anIntArray46[local34]] == null) {
				throw new RuntimeException("gpp2 pos:" + local34 + " size:" + Static104.anInt2960);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method3182() {
		aClass70_1397 = null;
		aClass70_1404 = null;
		aClass70_1402 = null;
		aClass70_1399 = null;
		aClass70_1405 = null;
		aClass70_1403 = null;
		aClass70_1398 = null;
		aClass70_1400 = null;
		aClass70_1401 = null;
	}
}
