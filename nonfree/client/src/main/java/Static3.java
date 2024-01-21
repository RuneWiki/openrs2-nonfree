import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "lc", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "[I")
	public static int[] anIntArray288 = new int[4000];

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1295 = Static75.method1216("backvmid3");

	@OriginalMember(owner = "client!ab", name = "Wb", descriptor = "I")
	public static int anInt2308 = 0;

	@OriginalMember(owner = "client!ab", name = "Yb", descriptor = "I")
	public static int anInt2310 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ab", name = "ic", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[5];

	@OriginalMember(owner = "client!ab", name = "tc", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1296 = Static75.method1216("flash3:");

	@OriginalMember(owner = "client!ab", name = "vc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1297 = Static75.method1216("Titelbild geladen)3");

	@OriginalMember(owner = "client!ab", name = "Nc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1298 = aClass4_1296;

	@OriginalMember(owner = "client!ab", name = "Oc", descriptor = "Z")
	public static boolean aBoolean193 = false;

	@OriginalMember(owner = "client!ab", name = "Rc", descriptor = "I")
	public static int anInt2346 = 0;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
	public static void method1548() {
		aClass4_1295 = null;
		anIntArray288 = null;
		aClass4_1298 = null;
		aBooleanArray14 = null;
		aClass4_1296 = null;
		aClass4_1297 = null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(BI)Lclient!eb;")
	public static Class3_Sub1_Sub2 method1550(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub2 local10 = (Class3_Sub1_Sub2) Static45.aClass8_15.method195((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static12.aClass64_13.method1625(10, arg0);
		local10 = new Class3_Sub1_Sub2();
		local10.anInt720 = arg0;
		if (local20 != null) {
			local10.method491(new Class3_Sub4(local20));
		}
		local10.method490();
		if (local10.anInt732 != -1) {
			local10.method500(method1550(local10.anInt743), method1550(local10.anInt732));
		}
		if (!Static38.aBoolean250 && local10.aBoolean47) {
			local10.anInt757 = 0;
			local10.aClass4_347 = Static27.aClass4_388;
			local10.aClass4Array3 = null;
			local10.aClass4Array4 = null;
		}
		Static45.aClass8_15.method199((long) arg0, local10);
		return local10;
	}
}
