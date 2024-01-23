import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!td", name = "F", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array8;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1299 = Static186.method3527("Apr");

	@OriginalMember(owner = "client!td", name = "D", descriptor = "D")
	public static double aDouble3 = -1.0D;

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1300 = Static186.method3527("Jul");

	@OriginalMember(owner = "client!td", name = "P", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1301 = Static186.method3527("Jan");

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1302 = Static186.method3527("Aug");

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1308 = Static186.method3527("Feb");

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1306 = Static186.method3527("Mar");

	@OriginalMember(owner = "client!td", name = "db", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1307 = Static186.method3527("May");

	@OriginalMember(owner = "client!td", name = "W", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1305 = Static186.method3527("Jun");

	@OriginalMember(owner = "client!td", name = "gb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1309 = Static186.method3527("Sep");

	@OriginalMember(owner = "client!td", name = "U", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1304 = Static186.method3527("Oct");

	@OriginalMember(owner = "client!td", name = "T", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1303 = Static186.method3527("Nov");

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1310 = Static186.method3527("Dec");

	@OriginalMember(owner = "client!td", name = "R", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array77 = new Class50[] { aClass50_1301, aClass50_1308, aClass50_1306, aClass50_1299, aClass50_1307, aClass50_1305, aClass50_1300, aClass50_1302, aClass50_1309, aClass50_1304, aClass50_1303, aClass50_1310 };

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lclient!tc;")
	public static Class110 method3204(@OriginalArg(0) int arg0) {
		@Pc(15) Class110 local15 = (Class110) Static27.aClass84_11.method2579((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static61.aClass86_21.method3325(Static93.method1461(arg0), Static227.method3436(arg0));
		local15 = new Class110();
		if (local29 != null) {
			local15.method3184(new Class1_Sub17(local29));
		}
		local15.method3189();
		Static27.aClass84_11.method2582(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZIIILclient!pa;)V")
	public static void method3205(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class86 arg2) {
		Static67.anInt1302 = arg1;
		Static63.anInt1254 = arg0;
		Static19.anInt400 = 1;
		Static92.aBoolean83 = false;
		Static85.anInt1755 = 0;
		Static109.anInt2171 = 10000;
		Static218.aClass86_68 = arg2;
	}
}
