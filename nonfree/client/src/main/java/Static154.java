import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!t", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray91;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1451 = Static169.method2903("<col=00ff00>");

	@OriginalMember(owner = "client!t", name = "w", descriptor = "[Lclient!ic;")
	public static Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!t", name = "x", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1452 = Static169.method2903("headicons_prayer");

	@OriginalMember(owner = "client!t", name = "z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1453 = Static169.method2903("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!t", name = "A", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1454 = Static169.method2903(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!t", name = "E", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1455 = Static169.method2903(" has logged in)3");

	@OriginalMember(owner = "client!t", name = "F", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1456 = Static169.method2903("gelb:");

	@OriginalMember(owner = "client!t", name = "H", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1457 = aClass23_1455;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	public static void method2626() {
		aClass23_1454 = null;
		aClass23_1452 = null;
		aByteArrayArrayArray91 = null;
		aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
		aClass23_1451 = null;
		aClass23_1456 = null;
		aClass23_1457 = null;
		aClass23_1453 = null;
		aClass23_1455 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Lclient!ed;")
	public static Class23 method2627(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static27.method498(arg0) : Static111.aClass23_1081;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JI)V")
	public static void method2628(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static65.anInt3673 >= 100) {
			Static73.method1339(Static156.aClass23_1467, Static101.aClass23_1001, 0);
			return;
		}
		@Pc(27) Class23 local27 = Static8.method183(arg0).method667();
		for (@Pc(29) int local29 = 0; local29 < Static65.anInt3673; local29++) {
			if (arg0 == Static70.aLongArray4[local29]) {
				Static73.method1339(Static149.method2571(new Class23[] { local27, Static128.aClass23_1263 }), Static101.aClass23_1001, 0);
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static37.anInt996; local64++) {
			if (Static106.aLongArray5[local64] == arg0) {
				Static73.method1339(Static149.method2571(new Class23[] { Static65.aClass23_1388, local27, Static86.aClass23_855 }), Static101.aClass23_1001, 0);
				return;
			}
		}
		if (local27.method651(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass23_68)) {
			Static73.method1339(Static142.aClass23_1366, Static101.aClass23_1001, 0);
			return;
		}
		Static70.aLongArray4[Static65.anInt3673] = arg0;
		Static163.aClass23Array22[Static65.anInt3673++] = Static8.method183(arg0);
		Static23.anInt698 = Static176.anInt4191;
		Static25.aClass1_Sub8_Sub1_1.method919(200);
		Static25.aClass1_Sub8_Sub1_1.method873(arg0);
	}
}
