import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "[I")
	public static int[] anIntArray313;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_76 = new Class66(64);

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "Lclient!qc;")
	public static Class164 aClass164_1 = new Class164(8);

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "S")
	public static short aShort54 = 32767;

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
	public static int anInt4411 = 0;

	@OriginalMember(owner = "client!of", name = "db", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString257 = "Loaded config";

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(JI)V")
	public static void method3883(@OriginalArg(0) long arg0) {
		Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
		Static335.aClass5_Sub1_Sub1_3.method1886(21);
		Static335.aClass5_Sub1_Sub1_3.method1871(arg0);
		Static64.anInt1550 = 0;
		Static45.anInt1178 = -3;
		Static88.anInt1583 = 1;
		Static111.anInt2410 = 0;
	}

	@OriginalMember(owner = "client!of", name = "h", descriptor = "(I)V")
	public static void method3885() {
		if (Static247.anInt3874 == 10 || Static247.anInt3874 == 28) {
			Static25.method612(Static347.anInt6471 >> 10, Static347.anInt6472 >> 10);
		} else {
			Static25.method612(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] >> 3, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] >> 3);
		}
		Static289.method4918();
		Static261.method4493();
		Static342.method5673();
		Static47.method1059();
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	public static void method3886() {
		Static348.aClass96ArrayArray1 = new Class96[Static327.aClass170_117.method4581()][];
		Static225.aBooleanArray17 = new boolean[Static327.aClass170_117.method4581()];
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILclient!ka;)V")
	public static void method3887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub4 arg3) {
		if (Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static168.method3164(arg0, arg1, arg2);
		}
		Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2].aClass25_Sub4_1 = arg3;
	}
}
