import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static80 {

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
	public static int anInt1542;

	@OriginalMember(owner = "client!fj", name = "y", descriptor = "Lclient!lc;")
	public static Class98 aClass98_49;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "[I")
	public static int[] anIntArray167 = new int[128];

	@OriginalMember(owner = "client!fj", name = "z", descriptor = "[B")
	public static byte[] aByteArray24 = new byte[520];

	@OriginalMember(owner = "client!fj", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString42 = "Loading config - ";

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "[I")
	public static int[] anIntArray170 = new int[14];

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
	public static void method1245() {
		aClass98_49 = null;
		aByteArray24 = null;
		anIntArray167 = null;
		aStringArray10 = null;
		aString42 = null;
		anIntArray170 = null;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!lc;ILclient!lc;I)Lclient!wh;")
	public static Class4_Sub2_Sub12 method1247(@OriginalArg(1) Class98 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class98 arg2) {
		return Static292.method4344(arg1, 0, arg2) ? Static14.method1603(arg0.method2396(0, arg1)) : null;
	}
}
