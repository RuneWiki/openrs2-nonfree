import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_71 = Static129.method2060("Die Verbindung konnte");

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public static int anInt181 = 0;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!r;")
	private static Class61 aClass61_72 = Static129.method2060("Error connecting to server)3");

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Lclient!r;")
	private static Class61 aClass61_73 = Static129.method2060("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_74 = aClass61_73;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	public static int anInt188 = 0;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
	public static int anInt190 = 0;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!r;")
	public static Class61 aClass61_75 = aClass61_72;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
	public static int anInt194 = 0;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!r;")
	public static Class61 aClass61_76 = Static129.method2060("(Y");

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "Lclient!r;")
	public static Class61 aClass61_77 = Static129.method2060("titlebox");

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
	public static int anInt198 = 0;

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "[I")
	public static int[] anIntArray49 = new int[128];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
	public static int method163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 0;
		while (arg1 > 0) {
			local13 = local13 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lclient!sa;")
	public static Class5_Sub2_Sub13 method165(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub13 local10 = (Class5_Sub2_Sub13) Static1.aClass29_1.method766((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static74.aClass26_15.method1038(3, arg0);
		local10 = new Class5_Sub2_Sub13();
		if (local20 != null) {
			local10.method1791(new Class5_Sub14(local20));
		}
		Static1.aClass29_1.method762(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)V")
	public static void method169(@OriginalArg(0) int arg0) {
		Static62.anInt1536 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!ff;I)Z")
	public static boolean method174(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) byte[] local17 = arg1.method1038(arg0, arg2);
		if (local17 == null) {
			return false;
		} else {
			Static129.method2066(local17);
			return true;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
	public static void method175() {
		aClass61_74 = null;
		aClass61_72 = null;
		anIntArray49 = null;
		aClass61_75 = null;
		aClass61_73 = null;
		aClass61_77 = null;
		aClass61_76 = null;
		aClass61_71 = null;
	}
}
