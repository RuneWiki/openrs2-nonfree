import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!vc", name = "bc", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_6;

	@OriginalMember(owner = "client!vc", name = "ec", descriptor = "Lclient!ce;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!vc", name = "hc", descriptor = "Lclient!mb;")
	public static Class42 aClass42_73;

	@OriginalMember(owner = "client!vc", name = "Xb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1249 = Static45.method753("Weiter");

	@OriginalMember(owner = "client!vc", name = "jc", descriptor = "Lclient!v;")
	public static Class62 aClass62_1250 = Static45.method753("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!vc", name = "kc", descriptor = "Lclient!v;")
	public static Class62 aClass62_1251 = Static45.method753("(U3");

	@OriginalMember(owner = "client!vc", name = "lc", descriptor = "Lclient!ec;")
	public static Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!vc", name = "nc", descriptor = "I")
	public static int anInt2765 = 0;

	@OriginalMember(owner = "client!vc", name = "pc", descriptor = "[Lclient!ja;")
	public static Class3_Sub1_Sub3_Sub1_Sub1[] aClass3_Sub1_Sub3_Sub1_Sub1Array1 = new Class3_Sub1_Sub3_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!vc", name = "sc", descriptor = "[I")
	public static int[] anIntArray307 = new int[25];

	@OriginalMember(owner = "client!vc", name = "xc", descriptor = "Lclient!v;")
	private static Class62 aClass62_1255 = Static45.method753("Malformed login packet)3");

	@OriginalMember(owner = "client!vc", name = "tc", descriptor = "Lclient!v;")
	public static Class62 aClass62_1252 = aClass62_1255;

	@OriginalMember(owner = "client!vc", name = "uc", descriptor = "Lclient!v;")
	private static Class62 aClass62_1253 = Static45.method753("Loaded sprites");

	@OriginalMember(owner = "client!vc", name = "vc", descriptor = "I")
	public static int anInt2769 = 0;

	@OriginalMember(owner = "client!vc", name = "wc", descriptor = "Lclient!v;")
	public static Class62 aClass62_1254 = aClass62_1253;

	@OriginalMember(owner = "client!vc", name = "zc", descriptor = "Lclient!v;")
	private static Class62 aClass62_1257 = Static45.method753("Enter name:");

	@OriginalMember(owner = "client!vc", name = "yc", descriptor = "Lclient!v;")
	public static Class62 aClass62_1256 = aClass62_1257;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(BI)Lclient!ea;")
	public static Class3_Sub1_Sub5 method1815(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub5 local10 = (Class3_Sub1_Sub5) Static69.aClass34_25.method764((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static7.aClass42_8.method1504(16, arg0);
		local10 = new Class3_Sub1_Sub5();
		if (local25 != null) {
			local10.method490(new Class3_Sub8(local25));
		}
		Static69.aClass34_25.method765((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "(I)V")
	public static void method1817() {
		aClass62_1253 = null;
		aClass42_73 = null;
		aClass62_1257 = null;
		aClass3_Sub1_Sub1_Sub4_6 = null;
		aClass3_Sub1_Sub3_Sub1_Sub1Array1 = null;
		aClass62_1256 = null;
		anIntArray307 = null;
		aClass62_1249 = null;
		aClass18_1 = null;
		aClass12_1 = null;
		aClass62_1252 = null;
		aClass62_1251 = null;
		aClass62_1250 = null;
		aClass62_1254 = null;
		aClass62_1255 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method1819(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
