import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!th;")
	public static Class2_Sub4_Sub3_Sub2_Sub1 aClass2_Sub4_Sub3_Sub2_Sub1_4;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_107;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
	public static boolean aBoolean154;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2055 = Static107.method1838("Lade Texturen )2 ");

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2056 = Static107.method1838("titlebutton");

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2060 = Static107.method1838("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2057 = aClass28_2060;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "[I")
	public static int[] anIntArray326 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2058 = Static107.method1838(")1");

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2059 = Static107.method1838(" )2>");

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
	public static int[] anIntArray327 = new int[2048];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lclient!sb;")
	public static Class2_Sub4_Sub16 method2418(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub4_Sub16 local10 = (Class2_Sub4_Sub16) Static171.aClass14_192.method603((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static146.aClass40_33.method1771(5, arg0);
		local10 = new Class2_Sub4_Sub16();
		if (local28 != null) {
			local10.method2323(new Class2_Sub2(local28));
		}
		Static171.aClass14_192.method607((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method2419() {
		aClass28_2058 = null;
		aByteArrayArray8 = null;
		aClass40_Sub1_107 = null;
		aClass28_2060 = null;
		anIntArray327 = null;
		anIntArray326 = null;
		aClass28_2057 = null;
		aByteArrayArrayArray8 = null;
		aClass28_2059 = null;
		aClass28_2055 = null;
		aClass2_Sub4_Sub3_Sub2_Sub1_4 = null;
		aClass28_2056 = null;
	}
}
