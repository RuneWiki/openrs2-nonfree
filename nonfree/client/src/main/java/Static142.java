import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
	public static int anInt3764;

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1283 = Static49.method1293("(U0a )2 via: ");

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1285 = Static49.method1293("Please remove ");

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1284 = aClass70_1285;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "Lclient!fc;")
	public static Class25 aClass25_21 = new Class25(200);

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1286 = aClass70_1285;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8 = new int[4][105][105];

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1287 = Static49.method1293(")4lang)4de");

	@OriginalMember(owner = "client!qf", name = "fb", descriptor = "[I")
	public static int[] anIntArray357 = new int[2000];

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
	public static int anInt3765 = 0;

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1288 = Static49.method1293("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	public static void method2798() {
		aClass70_1288 = null;
		aClass70_1287 = null;
		aClass70_1283 = null;
		aClass70_1285 = null;
		aClass25_21 = null;
		anIntArrayArrayArray8 = null;
		anIntArray357 = null;
		aClass70_1286 = null;
		aClass70_1284 = null;
		anImage3 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!be;[BB)V")
	public static void method2800(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
		local7.anInt2284 = 0;
		local7.aClass9_1 = arg1;
		local7.aByteArray33 = arg2;
		local7.aLong147 = arg0;
		@Pc(26) Class4 local26 = Static89.aClass4_9;
		synchronized (Static89.aClass4_9) {
			Static89.aClass4_9.method179(local7);
		}
		Static21.method466();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)I")
	public static int method2803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
