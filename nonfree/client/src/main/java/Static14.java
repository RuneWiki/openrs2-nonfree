import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "Lclient!vb;")
	public static Class82 aClass82_6;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
	public static int anInt299;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_3;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
	public static int anInt289 = 0;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
	public static int anInt291 = -1;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "Lclient!tg;")
	public static Class81 aClass81_126 = Static120.method2057("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "Lclient!tg;")
	public static Class81 aClass81_127 = null;

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "Lclient!nd;")
	public static Class59 aClass59_2 = new Class59(260);

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "Lclient!tg;")
	private static Class81 aClass81_128 = Static120.method2057("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "Lclient!tg;")
	public static Class81 aClass81_129 = aClass81_128;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public static int method219(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Lclient!fh;")
	public static Class1_Sub2_Sub8 method220(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub2_Sub8 local18 = (Class1_Sub2_Sub8) Static95.aClass59_16.method1970((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static18.aClass82_7.method2942(arg0, 6);
		local18 = new Class1_Sub2_Sub8();
		local18.anInt1255 = arg0;
		if (local28 != null) {
			local18.method934(new Class1_Sub8(local28));
		}
		local18.method932();
		if (local18.aBoolean49) {
			local18.aBoolean46 = false;
			local18.anInt1261 = 0;
		}
		Static95.aClass59_16.method1973(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method221() {
		aClass81_128 = null;
		aClass59_2 = null;
		aClass82_Sub1_3 = null;
		aClass81_127 = null;
		aClass81_129 = null;
		aClass81_126 = null;
		aClass82_6 = null;
	}
}
