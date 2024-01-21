import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1389 = Static59.method1195("Loading fonts )2 ");

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1390 = Static59.method1195("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "Lclient!ad;")
	public static Class5 aClass5_22 = new Class5();

	@OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
	public static int anInt3336 = 0;

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1391 = Static59.method1195("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1392 = aClass60_1389;

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "B")
	public static byte aByte13 = 0;

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1393 = Static59.method1195("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1394 = Static59.method1195("flash3:");

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1395 = aClass60_1394;

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1396 = aClass60_1394;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V")
	public static void method2221() {
		aClass5_22 = null;
		aClass60_1392 = null;
		aClass60_1395 = null;
		aClass60_1390 = null;
		aClass60_1394 = null;
		aClass60_1396 = null;
		aClass60_1391 = null;
		aClass60_1393 = null;
		aClass60_1389 = null;
		aByteArrayArray16 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!md;)V")
	public static void method2222(@OriginalArg(1) Class3_Sub1_Sub1_Sub3 arg0) {
		if (Static34.anInt1183 == arg0.anInt1506 || arg0.anInt1538 == -1 || arg0.anInt1521 != 0 || arg0.anInt1537 + 1 > Static109.method2054(arg0.anInt1538).anIntArray247[arg0.anInt1489]) {
			@Pc(36) int local36 = arg0.anInt1532 * 64 + arg0.anInt1526 * 128;
			@Pc(46) int local46 = arg0.anInt1532 * 64 + arg0.anInt1528 * 128;
			@Pc(53) int local53 = arg0.anInt1506 - arg0.anInt1535;
			@Pc(64) int local64 = arg0.anInt1515 * 128 + arg0.anInt1532 * 64;
			@Pc(70) int local70 = Static34.anInt1183 - arg0.anInt1535;
			arg0.anInt1524 = (local64 * local70 + (local53 - local70) * local46) / local53;
			@Pc(94) int local94 = arg0.anInt1532 * 64 + arg0.anInt1529 * 128;
			arg0.anInt1494 = (local70 * local94 + local36 * (local53 - local70)) / local53;
		}
		if (arg0.anInt1541 == 0) {
			arg0.anInt1501 = 1024;
		}
		if (arg0.anInt1541 == 1) {
			arg0.anInt1501 = 1536;
		}
		if (arg0.anInt1541 == 2) {
			arg0.anInt1501 = 0;
		}
		arg0.anInt1498 = 0;
		if (arg0.anInt1541 == 3) {
			arg0.anInt1501 = 512;
		}
		arg0.anInt1525 = arg0.anInt1501;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Lclient!qf;)[Lclient!qf;")
	public static Class60[] method2224(@OriginalArg(1) Class60[] arg0) {
		@Pc(4) Class60[] local4 = new Class60[5];
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			local4[local6] = Static60.method1211(new Class60[] { Static65.method1341(local6), Static8.aClass60_134 });
			if (arg0 != null && arg0[local6] != null) {
				local4[local6] = Static60.method1211(new Class60[] { local4[local6], arg0[local6] });
			}
		}
		return local4;
	}
}
