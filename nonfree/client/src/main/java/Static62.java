import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Z")
	public static boolean aBoolean66;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt1534 = 0;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_664 = Static51.method932("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!cd;")
	private static Class10 aClass10_665 = Static51.method932("yellow:");

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!cd;")
	private static Class10 aClass10_671 = Static51.method932("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_666 = aClass10_671;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_667 = aClass10_665;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!cd;")
	public static Class10 aClass10_668 = Static51.method932("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_669 = Static51.method932("<img=1>");

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
	public static int[] anIntArray174 = new int[200];

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_670 = aClass10_665;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I")
	public static int method1104() {
		return 6;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method1105() {
		aClass10_666 = null;
		aClass10_664 = null;
		aClass10_670 = null;
		aClass10_668 = null;
		aClass10_667 = null;
		aClass10_665 = null;
		aClass10_669 = null;
		aClass10_671 = null;
		anIntArray174 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Lclient!lf;")
	public static Class2_Sub1_Sub10 method1106(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub10 local10 = (Class2_Sub1_Sub10) Static99.aClass72_18.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static81.aClass29_35.method1030(arg0, 6);
		local10 = new Class2_Sub1_Sub10();
		local10.anInt2219 = arg0;
		if (local20 != null) {
			local10.method1582(new Class2_Sub11(local20));
		}
		local10.method1575();
		if (local10.aBoolean100) {
			local10.anInt2220 = 0;
			local10.aBoolean94 = false;
		}
		Static99.aClass72_18.method2254(local10, (long) arg0);
		return local10;
	}
}
