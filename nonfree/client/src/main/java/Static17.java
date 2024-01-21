import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_159 = Static121.method2047("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!qc;")
	private static Class60 aClass60_161 = Static121.method2047("Select a world");

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_160 = aClass60_161;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
	public static int[] anIntArray29 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Lclient!qc;")
	private static Class60 aClass60_163 = Static121.method2047("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_162 = aClass60_163;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
	public static int anInt452 = 0;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	public static int anInt453 = 0;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Lclient!qc;")
	public static Class60 aClass60_164 = Static121.method2047("Ausw-=hlen");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([BII)I")
	public static int method288(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static103.method1233(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBII)I")
	public static int method290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return 7 - arg0;
		} else if (local8 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public static void method293() {
		aClass60_163 = null;
		aClass60_164 = null;
		aByteArrayArray3 = null;
		aClass60_162 = null;
		aClass60_159 = null;
		aClass60_161 = null;
		anIntArray29 = null;
		aClass60_160 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)V")
	public static void method294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static63.anInt1695 == 2) {
			Static19.method340(Static43.anInt1110 + (Static20.anInt578 - Static99.anInt2424 << 7), Static41.anInt1039 + (Static41.anInt1032 - Static106.anInt2518 << 7), Static46.anInt1198 * 2);
			if (Static105.anInt2510 > -1 && Static81.anInt1944 % 20 < 10) {
				Static70.aClass4_Sub4_Sub3_Sub2Array5[0].method912(arg1 + Static105.anInt2510 - 12, arg0 + -28 + Static29.anInt824);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!lc;ILclient!lc;)I")
	public static int method295(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1118(Static33.aClass60_365, Static13.aClass60_147)) {
			local5++;
		}
		if (arg0.method1118(Static33.aClass60_365, Static128.aClass60_1061)) {
			local5++;
		}
		if (arg0.method1118(Static33.aClass60_365, Static129.aClass60_1205)) {
			local5++;
		}
		if (arg0.method1118(Static33.aClass60_365, Static33.aClass60_370)) {
			local5++;
		}
		if (arg0.method1118(Static33.aClass60_365, Static13.aClass60_148)) {
			local5++;
		}
		if (arg0.method1118(Static33.aClass60_365, Static27.aClass60_307)) {
			local5++;
		}
		arg0.method1118(Static33.aClass60_365, Static59.aClass60_552);
		arg0.method1118(Static33.aClass60_365, Static87.aClass60_837);
		arg0.method1118(Static33.aClass60_365, Static7.aClass60_1201);
		arg0.method1118(Static33.aClass60_365, Static108.aClass60_1042);
		arg0.method1118(Static33.aClass60_365, Static55.aClass60_537);
		return local5;
	}
}
