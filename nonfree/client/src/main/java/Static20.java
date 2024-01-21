import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_8;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Lclient!ja;")
	public static Class33 aClass33_7;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "[I")
	public static int[] anIntArray52;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "Lclient!mc;")
	private static Class42 aClass42_362 = Static23.method501("Loading title screen )2 ");

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!mc;")
	public static Class42 aClass42_355 = aClass42_362;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!mc;")
	private static Class42 aClass42_358 = Static23.method501("Your profile will be transferred in:");

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_356 = aClass42_358;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_357 = Static23.method501("@gr2@");

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_359 = Static23.method501("Versteckt");

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public static int anInt644 = 0;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public static int anInt646 = 0;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public static int anInt648 = 0;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "Lclient!mc;")
	public static Class42 aClass42_360 = Static23.method501("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!eb", name = "cb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_367 = Static23.method501("wave:");

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "Lclient!mc;")
	public static Class42 aClass42_361 = aClass42_367;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "[I")
	public static int[] anIntArray51 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "Lclient!mc;")
	public static Class42 aClass42_363 = Static23.method501("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
	public static int anInt655 = 255;

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "Lclient!mc;")
	public static Class42 aClass42_364 = Static23.method501("Untersuchen");

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "Lclient!mc;")
	public static Class42 aClass42_365 = Static23.method501("Maximale Anmelde)2Versuche -Uberschritten)3");

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "Lclient!mc;")
	public static Class42 aClass42_366 = Static23.method501("Mem:");

	@OriginalMember(owner = "client!eb", name = "fb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_368 = Static23.method501("Einloggen");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method444() {
		aClass42_359 = null;
		aClass42_362 = null;
		aClass42_357 = null;
		aClass42_360 = null;
		aClass42_355 = null;
		anIntArray51 = null;
		aByteArrayArrayArray2 = null;
		aClass42_358 = null;
		aClass42_364 = null;
		aClass42_366 = null;
		aClass42_361 = null;
		aClass33_7 = null;
		aClass42_367 = null;
		aClass42_356 = null;
		aClass42_368 = null;
		aClass42_363 = null;
		aClass42_365 = null;
		aClass1_Sub1_Sub1_Sub4_8 = null;
		anIntArray52 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(JI)V")
	public static void method445(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static1.anInt1 >= 100) {
			Static24.method509(Static11.aClass42_195, 0, Static56.aClass42_765);
			return;
		}
		@Pc(29) Class42 local29 = Static64.method1096(arg0).method1058();
		for (@Pc(31) int local31 = 0; local31 < Static1.anInt1; local31++) {
			if (arg0 == Static37.aLongArray2[local31]) {
				Static24.method509(Static11.aClass42_195, 0, Static57.method1822(new Class42[] { local29, Static99.aClass42_1352 }));
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static8.anInt239; local64++) {
			if (Static87.aLongArray5[local64] == arg0) {
				Static24.method509(Static11.aClass42_195, 0, Static57.method1822(new Class42[] { Static81.aClass42_1145, local29, Static38.aClass42_514 }));
				return;
			}
		}
		if (!local29.method1041(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.aClass42_1396)) {
			Static37.aLongArray2[Static1.anInt1++] = arg0;
			Static89.aBoolean132 = true;
			Static98.aClass1_Sub8_Sub1_3.method1236(218);
			Static98.aClass1_Sub8_Sub1_3.method1193(arg0);
		}
	}
}
