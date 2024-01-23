import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1266 = Static186.method3527("lila:");

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1267 = Static186.method3527("Schlie-8en");

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1270 = Static186.method3527("Type");

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1268 = aClass50_1270;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "[I")
	public static int[] anIntArray445 = new int[5];

	@OriginalMember(owner = "client!si", name = "j", descriptor = "[S")
	public static short[] aShortArray60 = new short[256];

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1269 = Static186.method3527(":duelstake:");

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	public static int anInt3947 = 0;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
	public static int[] anIntArray446 = new int[4096];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public static void method3143() {
		Static49.aClass84_19.method2585();
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
	public static void method3145() {
		Static4.aClass84_7.method2576();
		Static203.aClass84_14.method2576();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)I")
	public static int method3146(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
	public static void method3147(@OriginalArg(0) int arg0) {
		if (Static1.method31(arg0)) {
			Static147.method2484(Static54.aClass93ArrayArray1[arg0], -1);
		}
	}
}
