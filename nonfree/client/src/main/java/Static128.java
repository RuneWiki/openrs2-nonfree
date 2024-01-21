import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!wa", name = "Sb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!wa", name = "rc", descriptor = "[Lclient!q;")
	public static Class4_Sub17[] aClass4_Sub17Array4;

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1058 = Static121.method2047(" weitere Optionen");

	@OriginalMember(owner = "client!wa", name = "Wb", descriptor = "I")
	public static int anInt2631 = 0;

	@OriginalMember(owner = "client!wa", name = "dc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1060 = Static121.method2047(" <col=ffff00>");

	@OriginalMember(owner = "client!wa", name = "mc", descriptor = "I")
	public static int anInt2644 = 99;

	@OriginalMember(owner = "client!wa", name = "qc", descriptor = "Lclient!nd;")
	public static Class51 aClass51_3 = new Class51();

	@OriginalMember(owner = "client!wa", name = "sc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1061 = Static121.method2047("logo");

	@OriginalMember(owner = "client!wa", name = "tc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1062 = Static121.method2047("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!wa", name = "vc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1063 = Static121.method2047("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!wa", name = "wc", descriptor = "I")
	public static int anInt2648 = 0;

	@OriginalMember(owner = "client!wa", name = "xc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1064 = Static121.method2047("_");

	@OriginalMember(owner = "client!wa", name = "yc", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!wa", name = "zc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1065 = Static121.method2047("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIZI)I")
	public static int method1876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class4_Sub4_Sub3_Sub3.anIntArray217[arg0 * 1024 / arg2] >> 1;
		return ((65536 - local16) * arg1 >> 16) + (local16 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(B)V")
	public static void method1878() {
		aClass80_3 = null;
		aClass60_1061 = null;
		aClass60_1060 = null;
		aClass60_1064 = null;
		aClass60_1063 = null;
		aClass4_Sub17Array4 = null;
		aClass60_1065 = null;
		aClass60_1058 = null;
		aClass60_1062 = null;
		Class4_Sub4_Sub1_Sub2.anIntArray289 = null;
		aClass51_3 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BILclient!wa;)V")
	public static void method1879(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub4_Sub1_Sub2 arg1) {
		Static19.method340(arg1.anInt2601, arg1.anInt2620, arg0);
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(B)V")
	public static void method1882() {
		Static104.aClass48_58.method1393();
	}
}
