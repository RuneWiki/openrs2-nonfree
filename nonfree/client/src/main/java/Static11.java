import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static11 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array1;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!qc;")
	private static Class60 aClass60_102 = Static121.method2047("Welcome to RuneScape");

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt248 = 0;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_103 = aClass60_102;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_1 = null;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!qc;")
	private static Class60 aClass60_104 = Static121.method2047("Loading sprites )2 ");

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt250 = 0;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_105 = aClass60_104;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_106 = Static121.method2047(" loggt sich ein)3");

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_107 = Static121.method2047("(U0a )2 in: ");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLclient!lc;Lclient!lc;Lclient!lc;)V")
	public static void method205(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		Static70.aClass40_52 = arg1;
		Static127.aClass40_89 = arg0;
		Static92.aClass40_66 = arg2;
		Static82.aClass4_Sub17ArrayArray1 = new Class4_Sub17[Static70.aClass40_52.method1101()][];
		Static131.aBooleanArray18 = new boolean[Static70.aClass40_52.method1101()];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method206() {
		aClass60_103 = null;
		aClass60_105 = null;
		aClass60_104 = null;
		aClass60_106 = null;
		aByteArrayArray2 = null;
		aClass60_107 = null;
		aClass4_Sub4_Sub3_Sub2Array1 = null;
		aClass60_102 = null;
		aClass4_Sub17_1 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)V")
	public static void method207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static27.method520(arg0)) {
			Static4.method31(Static82.aClass4_Sub17ArrayArray1[arg0], arg1);
		}
	}
}
