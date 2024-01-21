import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!tc;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!p;")
	public static Class63 aClass63_10 = new Class63(500);

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_686 = Static78.method1313("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_687 = Static78.method1313("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!ee;")
	public static Class1_Sub5_Sub1 aClass1_Sub5_Sub1_2 = new Class1_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_688 = Static78.method1313("backleft1");

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Lclient!fc;")
	private static Class25 aClass25_690 = Static78.method1313("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_689 = aClass25_690;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	public static int anInt1476 = 0;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Lclient!fc;")
	private static Class25 aClass25_693 = Static78.method1313("Enter message to send to ");

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_691 = aClass25_693;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_692 = Static78.method1313("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!fc;")
	public static Class25 aClass25_694 = Static78.method1313("Angreifen");

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	public static int anInt1477 = 0;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_695 = Static78.method1313("backvmid2");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1139() {
		aClass25_690 = null;
		aClass25_691 = null;
		aClass1_Sub5_Sub1_2 = null;
		aClass25_694 = null;
		aClass25_693 = null;
		aClass25_692 = null;
		aClass25_695 = null;
		aClass25_689 = null;
		aClass63_10 = null;
		aClass25_686 = null;
		aClass25_688 = null;
		aLongArray3 = null;
		aClass25_687 = null;
		aClass74_1 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1140() {
		Static80.aClass63_15.method1513();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!q;)V")
	public static void method1141(@OriginalArg(1) Class1_Sub2_Sub3_Sub4 arg0) {
		@Pc(14) int local14 = arg0.anInt2800 * 128 + arg0.anInt2834 * 64;
		arg0.anInt2798 = 0;
		if (arg0.anInt2837 == 0) {
			arg0.anInt2809 = 1024;
		}
		@Pc(36) int local36 = arg0.anInt2834 * 64 + arg0.anInt2789 * 128;
		@Pc(42) int local42 = arg0.anInt2822 - Static60.anInt1366;
		arg0.anInt2832 += (local14 - arg0.anInt2832) / local42;
		arg0.anInt2827 += (local36 - arg0.anInt2827) / local42;
		if (arg0.anInt2837 == 1) {
			arg0.anInt2809 = 1536;
		}
		if (arg0.anInt2837 == 2) {
			arg0.anInt2809 = 0;
		}
		if (arg0.anInt2837 == 3) {
			arg0.anInt2809 = 512;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class1_Sub2_Sub11 method1142(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub11 local10 = (Class1_Sub2_Sub11) Static69.aClass63_11.method1517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static95.aClass56_68.method1269(5, arg0);
		local10 = new Class1_Sub2_Sub11();
		if (local20 != null) {
			local10.method1089(new Class1_Sub5(local20));
		}
		Static69.aClass63_11.method1520(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1143() {
		Static59.anInt1356 = 0;
		Static25.anInt719 = 0;
		Static94.method1580();
		Static23.method555();
		Static114.method1833();
		for (@Pc(17) int local17 = 0; local17 < Static25.anInt719; local17++) {
			@Pc(23) int local23 = Static28.anIntArray151[local17];
			if (Static60.anInt1366 != Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local23].anInt2794) {
				Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local23].aClass1_Sub2_Sub13_1 = null;
				Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local23] = null;
			}
		}
		if (Static35.aClass1_Sub5_Sub1_1.anInt792 != Static110.anInt2558) {
			throw new RuntimeException("gnp1 pos:" + Static35.aClass1_Sub5_Sub1_1.anInt792 + " psize:" + Static110.anInt2558);
		}
		for (@Pc(80) int local80 = 0; local80 < Static13.anInt383; local80++) {
			if (Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[Static106.anIntArray423[local80]] == null) {
				throw new RuntimeException("gnp2 pos:" + local80 + " size:" + Static13.anInt383);
			}
		}
	}
}
