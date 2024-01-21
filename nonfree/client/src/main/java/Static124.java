import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Z")
	public static boolean aBoolean237;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public static int anInt2878 = -1;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	public static final int anInt2886 = 50;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
	public static int[] anIntArray336 = new int[anInt2886];

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
	public static int[] anIntArray337 = new int[anInt2886];

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_1558 = Static69.method1231("Versteckt");

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "[I")
	public static int[] anIntArray338 = new int[anInt2886];

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public static int anInt2881 = 0;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array22 = new Class40[anInt2886];

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!je;")
	public static Class40 aClass40_1559 = Static69.method1231("headicons_prayer");

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "[I")
	public static int[] anIntArray339 = new int[anInt2886];

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_1560 = Static69.method1231("null");

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_1561 = Static69.method1231("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	public static int anInt2887 = 0;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
	public static int[] anIntArray340 = new int[anInt2886];

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "[I")
	public static int[] anIntArray341 = new int[anInt2886];

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "[I")
	public static int[] anIntArray342 = new int[anInt2886];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method2070() {
		Static114.anInt2625 = 0;
		Static58.anInt1521 = 0;
		Static111.method1870();
		Static41.method727();
		Static15.method241();
		Static88.method1590();
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < Static114.anInt2625; local19++) {
			local27 = Static104.anIntArray286[local19];
			if (Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local27].anInt1808 != Static28.anInt704) {
				Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local27] = null;
			}
		}
		if (Static130.anInt3009 != Static7.aClass2_Sub9_Sub1_1.anInt976) {
			throw new RuntimeException("gpp1 pos:" + Static7.aClass2_Sub9_Sub1_1.anInt976 + " psize:" + Static130.anInt3009);
		}
		for (local27 = 0; local27 < Static130.anInt3007; local27++) {
			if (Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[Static126.anIntArray347[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static130.anInt3007);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZI)I")
	public static int method2071() {
		return Static79.anInt2064 + Static47.anInt1280;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2072() {
		anIntArray341 = null;
		aClass40_1561 = null;
		anIntArray340 = null;
		anIntArray337 = null;
		anIntArray338 = null;
		anIntArray339 = null;
		anIntArray336 = null;
		aClass40_1558 = null;
		aClass40Array22 = null;
		aClass40_1559 = null;
		anIntArray342 = null;
		aClass40_1560 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!fd;II)[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] method2073(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(3) int arg2) {
		return Static125.method2076(arg1, arg0, arg2) ? Static100.method1791() : null;
	}
}
