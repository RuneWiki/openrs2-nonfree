import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt2698;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt2697 = 500;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1416 = Static23.method501("Fps:");

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1417 = Static23.method501("The server is being updated)3");

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1418 = Static23.method501("@or1@");

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	public static int[] anIntArray400 = new int[1000];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static final int anInt2699 = 50;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1419 = Static23.method501("title)3jpg");

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public static int anInt2701 = -1;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1420 = Static23.method501("(U2");

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "[I")
	public static int[] anIntArray401 = new int[128];

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1421 = Static23.method501("headicons_pk");

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1422 = aClass42_1417;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lclient!mc;B)Lclient!mc;")
	public static Class42 method1822(@OriginalArg(0) Class42[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static107.method1833(arg0.length, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1823() {
		Static52.aByteArrayArrayArray6 = null;
		Static69.aByteArrayArrayArray8 = null;
		Static20.aByteArrayArrayArray2 = null;
		Static21.anIntArray55 = null;
		Static12.anIntArray34 = null;
		Static51.anIntArray203 = null;
		Static43.anIntArray162 = null;
		Static52.anIntArrayArrayArray7 = null;
		Static6.aByteArrayArrayArray1 = null;
		Static89.anIntArrayArray27 = null;
		Static46.anIntArray184 = null;
		Static28.aByteArrayArrayArray4 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Lclient!ub;")
	public static Class1_Sub1_Sub16 method1824(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub16 local10 = (Class1_Sub1_Sub16) Static4.aClass37_3.method982((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static49.aClass33_14.method1305(arg0, 16);
		local10 = new Class1_Sub1_Sub16();
		if (local20 != null) {
			local10.method1732(new Class1_Sub8(local20));
		}
		Static4.aClass37_3.method981((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1827() {
		anIntArray400 = null;
		aClass42_1418 = null;
		aClass42_1416 = null;
		anIntArray401 = null;
		aClass42_1422 = null;
		aClass42_1421 = null;
		aClass42_1419 = null;
		aClass42_1417 = null;
		aClass42_1420 = null;
	}
}
