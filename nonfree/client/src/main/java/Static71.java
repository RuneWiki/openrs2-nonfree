import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public static volatile int anInt1723 = 0;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_592 = Static120.method2057("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "Lclient!ah;")
	public static Class5 aClass5_5 = new Class5(4096);

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "Lclient!tg;")
	private static Class81 aClass81_593 = Static120.method2057("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_594 = Static120.method2057("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "Lclient!tg;")
	public static Class81 aClass81_595 = aClass81_593;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "Lclient!tg;")
	private static Class81 aClass81_596 = Static120.method2057("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient!tg;")
	public static Class81 aClass81_597 = aClass81_596;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)Z")
	public static boolean method1253(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static49.aShortArray11[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1003;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lclient!qf;")
	public static Class1_Sub2_Sub14 method1254(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub14 local10 = (Class1_Sub2_Sub14) Static149.aClass59_22.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static128.aClass82_48.method2942(arg0, 1);
		local10 = new Class1_Sub2_Sub14();
		if (local25 != null) {
			local10.method2328(arg0, new Class1_Sub8(local25));
		}
		Static149.aClass59_22.method1973(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public static void method1256() {
		aClass81_592 = null;
		aClass81_594 = null;
		aClass81_595 = null;
		aClass81_597 = null;
		aClass81_593 = null;
		aClass5_5 = null;
		aClass81_596 = null;
		anIntArray150 = null;
	}
}
