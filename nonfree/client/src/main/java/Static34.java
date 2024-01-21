import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt895;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!qc;")
	private static Class60 aClass60_373 = Static121.method2047("Use");

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_372 = aClass60_373;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public static int anInt897 = 1;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	public static int anInt901 = -1;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
	public static int[] anIntArray67 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!sb;")
	public static Class66 aClass66_3 = new Class66(4096);

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_374 = Static121.method2047("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "Lclient!re;")
	public static Class4_Sub13 aClass4_Sub13_1 = new Class4_Sub13(8);

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "Lclient!qc;")
	private static Class60 aClass60_376 = Static121.method2047("Choose Option");

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_375 = aClass60_376;

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "Lclient!qc;")
	private static Class60 aClass60_378 = Static121.method2047("New User");

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Lclient!qc;")
	public static Class60 aClass60_377 = aClass60_378;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method623() {
		aClass60_373 = null;
		aClass60_378 = null;
		aClass60_377 = null;
		aClass60_372 = null;
		aClass4_Sub13_1 = null;
		aClass60_374 = null;
		aClass66_3 = null;
		anIntArray67 = null;
		aClass60_376 = null;
		aClass60_375 = null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method625() {
		Static39.anIntArray74 = new int[104];
		Static123.anIntArrayArrayArray7 = new int[4][105][105];
		Static72.anIntArray188 = new int[104];
		Static58.aByteArrayArrayArray3 = new byte[4][104][104];
		Static36.aByteArrayArrayArray2 = new byte[4][105][105];
		Static128.anInt2644 = 99;
		Static101.anIntArray278 = new int[104];
		Static122.aByteArrayArrayArray7 = new byte[4][104][104];
		Static10.aByteArrayArrayArray1 = new byte[4][104][104];
		Static71.anIntArray185 = new int[104];
		Static83.anIntArray199 = new int[104];
		Static89.anIntArrayArray19 = new int[105][105];
		Static84.aByteArrayArrayArray4 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!lc;BLclient!qc;Lclient!qc;)Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2 method628(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(8) int local8 = arg0.method1107(arg1);
		@Pc(19) int local19 = arg0.method1100(local8, arg2);
		return Static67.method1978(arg0, local8, local19);
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(IB)V")
	public static void method629(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static131.aBooleanArray18[arg0]) {
			return;
		}
		Static70.aClass40_52.method1113(arg0);
		if (Static82.aClass4_Sub17ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(33) boolean local33 = true;
		for (@Pc(35) int local35 = 0; local35 < Static82.aClass4_Sub17ArrayArray1[arg0].length; local35++) {
			if (Static82.aClass4_Sub17ArrayArray1[arg0][local35] != null) {
				if (Static82.aClass4_Sub17ArrayArray1[arg0][local35].anInt2231 == 2) {
					local33 = false;
				} else {
					Static82.aClass4_Sub17ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local33) {
			Static82.aClass4_Sub17ArrayArray1[arg0] = null;
		}
		Static131.aBooleanArray18[arg0] = false;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public static void method630() {
		Static115.anInt2762 = -1;
		Static56.aClass4_Sub13_Sub1_1.anInt1643 = 0;
		Static26.anInt725 = 0;
		Static99.anInt2423 = -1;
		Static7.anInt2988 = -1;
		Static77.anInt1906 = 0;
		Static81.anInt1951 = 0;
		Static83.anInt1979 = 0;
		Static78.anInt1911 = 0;
		Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
		Static25.anInt693 = 0;
		Static8.anInt130 = -1;
		Static93.aBoolean105 = false;
		for (@Pc(43) int local43 = 0; local43 < Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1.length; local43++) {
			if (Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local43] != null) {
				Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local43].anInt2625 = -1;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2.length; local65++) {
			if (Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local65] != null) {
				Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local65].anInt2625 = -1;
			}
		}
		Static67.method1980();
		Static4.method32(30);
		for (@Pc(92) int local92 = 0; local92 < 100; local92++) {
			Static69.aBooleanArray8[local92] = true;
		}
	}
}
