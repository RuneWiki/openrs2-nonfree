import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!p;")
	public static Class45 aClass45_15;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!ud;")
	public static Class5 aClass5_10;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	public static int anInt724;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt725;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public static int anInt727;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_220 = Static13.method257("backhmid1");

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt721 = -1;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!o;")
	public static Class40 aClass40_221 = Static13.method257("K @whi@(X");

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_222 = Static13.method257("mod_icons");

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_223 = Static13.method257("invback");

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method584() {
		aClass45_15 = null;
		aClass2_Sub2_Sub2_Sub4Array5 = null;
		aClass5_10 = null;
		aByteArrayArray8 = null;
		aClass40_220 = null;
		aClass40_223 = null;
		aClass40_221 = null;
		aClass40_222 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!bb;ZB)Z")
	public static boolean method585(@OriginalArg(0) Class7 arg0, @OriginalArg(1) boolean arg1) {
		Static18.anInt432 = 20;
		try {
			Static106.aClass12_1 = (Class12) Class.forName("Class12_Sub1_Sub2").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(17) Interface3 local17 = arg0.method205();
			if (local17 != null) {
				Static106.aClass12_1 = new Class12_Sub1_Sub1(arg0, local17);
				return true;
			} else if (arg1) {
				Static106.aClass12_1 = new Class12_Sub2(arg0);
				return true;
			} else {
				return false;
			}
		}
	}
}
