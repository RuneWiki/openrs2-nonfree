import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int anInt2943;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString107;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString106 = "purple:";

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "[I")
	public static int[] anIntArray337 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!df;")
	public static Class33 aClass33_7 = new Class33(64);

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "S")
	public static short aShort33 = 32767;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "S")
	public static short aShort34 = 320;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "[I")
	public static int[] anIntArray338 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "[I")
	public static int[] anIntArray339 = new int[8];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	public static void method2612() {
		@Pc(8) Class69 local8 = Static254.aClass69_1;
		synchronized (Static254.aClass69_1) {
			Static88.anInt1661 = Static238.anInt4830;
			Static215.anInt4218++;
			@Pc(37) int local37;
			if (Static206.anInt4081 >= 0) {
				while (Static206.anInt4081 != Static41.anInt683) {
					local37 = Static163.anIntArray354[Static41.anInt683];
					Static41.anInt683 = Static41.anInt683 + 1 & 0x7F;
					if (local37 >= 0) {
						Static95.aBooleanArray39[local37] = true;
					} else {
						Static95.aBooleanArray39[~local37] = false;
					}
				}
			} else {
				for (local37 = 0; local37 < 112; local37++) {
					Static95.aBooleanArray39[local37] = false;
				}
				Static206.anInt4081 = Static41.anInt683;
			}
			Static238.anInt4830 = Static267.anInt5441;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Z")
	public static boolean method2614() {
		@Pc(12) Class69 local12 = Static254.aClass69_1;
		synchronized (Static254.aClass69_1) {
			if (Static238.anInt4830 == Static88.anInt1661) {
				return false;
			} else {
				Static245.anInt6028 = Static136.anIntArray308[Static88.anInt1661];
				Static75.aChar4 = Static114.aCharArray41[Static88.anInt1661];
				Static88.anInt1661 = Static88.anInt1661 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	public static void method2615() {
		if (!Static206.aBoolean289 && Static252.anInt5207 != 2) {
			try {
				Static325.method4166(Static110.aClient1, "tbrefresh");
			} catch (@Pc(21) Throwable local21) {
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[B)Lclient!qk;")
	public static Class3_Sub4_Sub2_Sub2 method2616(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(26) Class3_Sub4_Sub2_Sub2 local26 = new Class3_Sub4_Sub2_Sub2(arg0, Static93.anIntArray162, Static35.anIntArray54, Static101.anIntArray185, Static306.anIntArray618, Static314.aByteArrayArray130);
			Static6.method108();
			return local26;
		}
	}
}
