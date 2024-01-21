import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "Lclient!fb;")
	public static Class3_Sub1_Sub5 aClass3_Sub1_Sub5_1;

	@OriginalMember(owner = "client!vb", name = "pb", descriptor = "[Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array7;

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1276 = Static56.method972("Hidden");

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
	public static int anInt2843 = 0;

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1279 = Static56.method972("Your account has been disabled)3");

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1277 = aClass5_1279;

	@OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
	public static int anInt2845 = -1;

	@OriginalMember(owner = "client!vb", name = "hb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1278 = Static56.method972("leuchten2:");

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
	public static int anInt2849 = 0;

	@OriginalMember(owner = "client!vb", name = "lb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1280 = Static56.method972("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!vb", name = "mb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1281 = Static56.method972(":tradereq:");

	@OriginalMember(owner = "client!vb", name = "ob", descriptor = "[I")
	public static int[] anIntArray370 = new int[50];

	@OriginalMember(owner = "client!vb", name = "vb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1282 = aClass5_1276;

	@OriginalMember(owner = "client!vb", name = "Bb", descriptor = "I")
	public static volatile int anInt2860 = 0;

	@OriginalMember(owner = "client!vb", name = "Cb", descriptor = "I")
	public static int anInt2861 = 0;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)Lclient!ib;")
	public static Class3_Sub1_Sub7 method1889(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub7 local10 = (Class3_Sub1_Sub7) Static2.aClass9_1.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static65.aClass11_61.method1882(3, arg0);
		local10 = new Class3_Sub1_Sub7();
		if (local27 != null) {
			local10.method840(new Class3_Sub6(local27));
		}
		Static2.aClass9_1.method284(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	public static void method1891() {
		Static17.aClass51_4 = new Class51();
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
	public static void method1893() {
		aClass5_1282 = null;
		aClass5_1277 = null;
		aClass5_1276 = null;
		aClass5_1281 = null;
		aClass3_Sub1_Sub2_Sub4Array7 = null;
		aClass5_1280 = null;
		aClass5_1279 = null;
		aClass5_1278 = null;
		anIntArray370 = null;
		aClass3_Sub1_Sub5_1 = null;
	}
}
