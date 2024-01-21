import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1290 = Static120.method1824("Aug");

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1291 = Static120.method1824("Oct");

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1292 = Static120.method1824("Dec");

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "[I")
	public static final int[] anIntArray427 = new int[100];

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1293 = Static120.method1824("Jun");

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1294 = Static120.method1824("Mar");

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1297 = Static120.method1824("Jan");

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1304 = Static120.method1824("Feb");

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1295 = Static120.method1824("Apr");

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1301 = Static120.method1824("May");

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1296 = Static120.method1824("Jul");

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1302 = Static120.method1824("Sep");

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1300 = Static120.method1824("Nov");

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array24 = new Class80[] { aClass80_1297, aClass80_1304, aClass80_1294, aClass80_1295, aClass80_1301, aClass80_1293, aClass80_1296, aClass80_1290, aClass80_1302, aClass80_1291, aClass80_1300, aClass80_1292 };

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1298 = Static120.method1824("Examine");

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
	public static int anInt3314 = 0;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1299 = Static120.method1824("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
	public static int anInt3315 = -1;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array25 = new Class80[500];

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1303 = aClass80_1298;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IB)V")
	public static void method2367(@OriginalArg(0) int arg0) {
		Static121.anInt2653 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lclient!ri;")
	public static Class3_Sub1_Sub15 method2368(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub15 local10 = (Class3_Sub1_Sub15) Static177.aClass5_58.method139((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static180.aClass1_32.method60(Static72.method2946(arg0), Static9.method168(arg0));
		local10 = new Class3_Sub1_Sub15();
		if (local24 != null) {
			local10.method2536(new Class3_Sub17(local24));
		}
		local10.method2542();
		Static177.aClass5_58.method145(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)I")
	public static int method2369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
		}
		return local7;
	}
}
