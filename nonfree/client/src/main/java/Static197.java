import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!oh;")
	public static Class67 aClass67_10;

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	public static int anInt4258;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array13;

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Ljava/lang/Object;")
	public static final Object anObject4 = new Object();

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2537 = Static118.method2249("Players");

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2535 = aClass65_2537;

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2536 = Static118.method2249("Einloggen");

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "[J")
	public static final long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
	public static void method3215() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static100.anInt2522; local1++) {
			for (local4 = 0; local4 < Static201.anInt3978; local4++) {
				for (local7 = 0; local7 < Static198.anInt4264; local7++) {
					Static83.aClass1_Sub7ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static145.anInt3433; local4++) {
			for (local7 = 0; local7 < Static145.anIntArray395[local4]; local7++) {
				Static145.aClass73ArrayArray1[local4][local7] = null;
			}
			Static145.anIntArray395[local4] = 0;
		}
		for (local7 = 0; local7 < Static41.anInt1103; local7++) {
			Static192.aClass54Array3[local7] = null;
		}
		Static41.anInt1103 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static2.aClass54Array1.length; local69++) {
			Static2.aClass54Array1[local69] = null;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([BI)V")
	public static void method3217(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = 0;
		while (true) {
			while (local11 < arg0.length) {
				@Pc(25) int local25 = (arg0[local11++] & 0xFF) * 64 - Static57.anInt1532;
				@Pc(36) int local36 = (arg0[local11++] & 0xFF) * 64 - Static33.anInt974;
				@Pc(87) byte local87;
				@Pc(65) int local65;
				if (local25 > 0 && local36 > 0 && local25 + 64 < Static190.anInt4160 && Static25.anInt737 > local36 + 64) {
					local65 = local25 >> 6;
					@Pc(74) int local74 = Static25.anInt737 - local36 - 1 >> 6;
					for (@Pc(76) int local76 = 0; local76 < 64; local76++) {
						for (@Pc(80) int local80 = -64; local80 < 0; local80++) {
							local87 = arg0[local11++];
							if (local87 != 0) {
								if (Static139.aByteArrayArrayArray89[local65][local74] == null) {
									Static139.aByteArrayArrayArray89[local65][local74] = new byte[4096];
								}
								Static139.aByteArrayArrayArray89[local65][local74][local76 + (-(local80 + 1) << 6)] = local87;
								@Pc(122) byte local122 = arg0[local11++];
								if (Static131.aByteArrayArrayArray84[local65][local74] == null) {
									Static131.aByteArrayArrayArray84[local65][local74] = new byte[4096];
								}
								Static131.aByteArrayArrayArray84[local65][local74][local76 + (-(local80 + 1) << 6)] = local122;
							}
						}
					}
				} else {
					for (local65 = -4096; local65 < 0; local65++) {
						local87 = arg0[local11++];
						if (local87 != 0) {
							local11++;
						}
					}
				}
			}
			return;
		}
	}
}
