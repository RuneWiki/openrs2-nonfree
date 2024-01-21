import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[[Lclient!q;")
	public static Class4_Sub17[][] aClass4_Sub17ArrayArray1;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 aClass4_Sub4_Sub3_Sub1_4;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
	public static int anInt1968;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Lclient!lc;")
	public static Class40 aClass40_59;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_802 = Static121.method2047("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static int anInt1959 = 1;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!qc;")
	private static Class60 aClass60_806 = Static121.method2047("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_803 = aClass60_806;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_804 = Static121.method2047("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!qc;")
	private static Class60 aClass60_807 = Static121.method2047("The server is being updated)3");

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_805 = aClass60_807;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
	public static int anInt1962 = 0;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_808 = Static121.method2047("Spieler");

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_809 = Static121.method2047("<col=ffb000>");

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
	public static final int anInt1964 = 0;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!qc;")
	public static Class60 aClass60_810 = Static121.method2047(" loggt sich aus)3");

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
	public static int anInt1971 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public static void method1458() {
		Static56.aClass4_Sub13_Sub1_1.method1265(66);
		Static56.aClass4_Sub13_Sub1_1.method1242(0L);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIILclient!lc;)[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class40 arg2) {
		return Static13.method279(arg1, arg2, arg0) ? Static84.method1490() : null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1460() {
		aClass60_805 = null;
		aClass4_Sub17ArrayArray1 = null;
		aClass40_59 = null;
		aClass4_Sub4_Sub3_Sub1_4 = null;
		aClass60_803 = null;
		aClass60_809 = null;
		aClass60_808 = null;
		aClass60_802 = null;
		aClass60_807 = null;
		aClass60_810 = null;
		aClass60_804 = null;
		aClass60_806 = null;
	}
}
