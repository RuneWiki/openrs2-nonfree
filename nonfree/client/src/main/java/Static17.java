import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!d", name = "X", descriptor = "Lclient!td;")
	public static Class54 aClass54_9;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!hb;")
	private static Class27 aClass27_215 = Static87.method1648("Create a free account");

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!hb;")
	private static Class27 aClass27_216 = Static87.method1648("wave:");

	@OriginalMember(owner = "client!d", name = "z", descriptor = "[I")
	public static int[] anIntArray59 = new int[25];

	@OriginalMember(owner = "client!d", name = "F", descriptor = "Lclient!hb;")
	private static Class27 aClass27_219 = Static87.method1648("Close");

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Lclient!hb;")
	public static Class27 aClass27_217 = aClass27_219;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "Lclient!hb;")
	public static Class27 aClass27_218 = Static87.method1648("mapmarker");

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Lclient!hb;")
	public static Class27 aClass27_220 = aClass27_215;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "Lclient!hb;")
	public static Class27 aClass27_221 = aClass27_216;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "Lclient!hb;")
	private static Class27 aClass27_223 = Static87.method1648("Choose Option");

	@OriginalMember(owner = "client!d", name = "N", descriptor = "Lclient!hb;")
	public static Class27 aClass27_222 = aClass27_223;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "Lclient!hb;")
	public static Class27 aClass27_224 = Static87.method1648("Wordpack geladen)3");

	@OriginalMember(owner = "client!d", name = "S", descriptor = "Lclient!hb;")
	private static Class27 aClass27_225 = Static87.method1648(" from your ignore list first");

	@OriginalMember(owner = "client!d", name = "U", descriptor = "I")
	public static int anInt414 = 2;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_226 = aClass27_225;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public static void method307() {
		Static79.anIntArray153 = new int[104];
		Static73.aByteArrayArrayArray6 = new byte[4][104][104];
		Static79.anIntArrayArray29 = new int[105][105];
		Static80.anInt2191 = 99;
		Static57.aByteArrayArrayArray4 = new byte[4][104][104];
		Static1.anIntArray1 = new int[104];
		Static66.anIntArray297 = new int[104];
		Static82.aByteArrayArrayArray7 = new byte[4][105][105];
		Static3.anIntArray13 = new int[104];
		Static48.aByteArrayArrayArray10 = new byte[4][104][104];
		Static12.anIntArray52 = new int[104];
		Static86.anIntArrayArrayArray5 = new int[4][105][105];
		Static69.aByteArrayArrayArray5 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!hb;")
	public static Class27 method308(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static97.method1616(arg0) : Static4.aClass27_1335;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	public static void method309() {
		if (Static91.aClass20_42 != null) {
			Static91.aClass20_42.method656();
			Static91.aClass20_42 = null;
		}
		Static106.method679();
		Static76.aClass18_1.method519();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static57.aClass49Array1[local22].method1529();
		}
		System.gc();
		Static1.method6();
		Static12.anInt283 = -1;
		Static98.anInt2576 = 0;
		Static35.method685();
		Static109.method1459(10);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
	public static int method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	public static void method311() {
		aClass27_217 = null;
		aClass27_225 = null;
		aClass27_222 = null;
		aClass27_226 = null;
		aClass27_223 = null;
		aClass27_218 = null;
		aClass54_9 = null;
		aClass27_220 = null;
		aClass27_221 = null;
		aClass27_224 = null;
		aClass27_216 = null;
		aClass27_215 = null;
		anIntArray59 = null;
		aClass27_219 = null;
	}
}
