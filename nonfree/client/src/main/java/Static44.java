import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	public static int anInt1331;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
	public static int anInt1332;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "Lclient!i;")
	private static Class41 aClass41_379 = Static184.method2923("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public static int anInt1329 = 0;

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "Lclient!i;")
	private static Class41 aClass41_386 = Static184.method2923("Malformed login packet)3");

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Lclient!i;")
	public static Class41 aClass41_380 = aClass41_386;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Lclient!i;")
	private static Class41 aClass41_381 = Static184.method2923("No reply from loginserver)3");

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	public static int anInt1330 = 0;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "Lclient!i;")
	private static Class41 aClass41_382 = Static184.method2923("OFF");

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "Lclient!i;")
	public static Class41 aClass41_383 = aClass41_382;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Lclient!i;")
	public static Class41 aClass41_384 = aClass41_379;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "[I")
	public static int[] anIntArray127 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_385 = aClass41_381;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method928() {
		@Pc(12) Class29 local12 = Static149.aClass29_1;
		synchronized (Static149.aClass29_1) {
			Static100.anInt2446++;
			Static179.anInt4147 = anInt1330;
			@Pc(27) int local27;
			if (Static29.anInt700 < 0) {
				for (local27 = 0; local27 < 112; local27++) {
					Static219.aBooleanArray25[local27] = false;
				}
				Static29.anInt700 = Static133.anInt3056;
			} else {
				while (Static133.anInt3056 != Static29.anInt700) {
					local27 = Static100.anIntArray245[Static133.anInt3056];
					Static133.anInt3056 = Static133.anInt3056 + 1 & 0x7F;
					if (local27 >= 0) {
						Static219.aBooleanArray25[local27] = true;
					} else {
						Static219.aBooleanArray25[~local27] = false;
					}
				}
			}
			anInt1330 = Static169.anInt3966;
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public static void method929() {
		for (@Pc(3) int local3 = 0; local3 < Static156.anInt3673; local3++) {
			@Pc(9) int local9 = Static7.anIntArray14[local3]--;
			if (Static7.anIntArray14[local3] >= -10) {
				@Pc(76) Class24 local76 = Static210.aClass24Array1[local3];
				if (local76 == null) {
					local76 = Static223.method686(Static11.aClass15_Sub1_12, Static23.anIntArray46[local3], 0);
					if (local76 == null) {
						continue;
					}
					Static7.anIntArray14[local3] += local76.method685();
					Static210.aClass24Array1[local3] = local76;
				}
				if (Static7.anIntArray14[local3] < 0) {
					@Pc(114) int local114;
					if (Static130.anIntArray409[local3] == 0) {
						local114 = Static105.anInt2543;
					} else {
						@Pc(124) int local124 = (Static130.anIntArray409[local3] & 0xFF) * 128;
						@Pc(132) int local132 = Static130.anIntArray409[local3] >> 16 & 0xFF;
						@Pc(141) int local141 = local132 * 128 + 64 - Static213.aClass12_Sub3_Sub1_1.anInt3961;
						if (local141 < 0) {
							local141 = -local141;
						}
						@Pc(154) int local154 = Static130.anIntArray409[local3] >> 8 & 0xFF;
						@Pc(164) int local164 = local154 * 128 + 64 - Static213.aClass12_Sub3_Sub1_1.anInt3949;
						if (local164 < 0) {
							local164 = -local164;
						}
						@Pc(178) int local178 = local164 + local141 - 128;
						if (local124 < local178) {
							Static7.anIntArray14[local3] = -100;
							continue;
						}
						if (local178 < 0) {
							local178 = 0;
						}
						local114 = (local124 - local178) * Static198.anInt4450 / local124;
					}
					if (local114 > 0) {
						@Pc(214) Class2_Sub9_Sub1 local214 = local76.method687().method3006(Static103.aClass82_1);
						@Pc(219) Class2_Sub6_Sub2 local219 = Static226.method2307(local214, local114);
						local219.method2302(Static96.anIntArray238[local3] - 1);
						Static200.aClass2_Sub6_Sub4_2.method3094(local219);
					}
					Static7.anIntArray14[local3] = -100;
				}
			} else {
				Static156.anInt3673--;
				for (@Pc(23) int local23 = local3; local23 < Static156.anInt3673; local23++) {
					Static23.anIntArray46[local23] = Static23.anIntArray46[local23 + 1];
					Static210.aClass24Array1[local23] = Static210.aClass24Array1[local23 + 1];
					Static96.anIntArray238[local23] = Static96.anIntArray238[local23 + 1];
					Static7.anIntArray14[local23] = Static7.anIntArray14[local23 + 1];
					Static130.anIntArray409[local23] = Static130.anIntArray409[local23 + 1];
				}
				local3--;
			}
		}
		if (Static96.aBoolean127 && !Static89.method1562()) {
			if (Static58.anInt1633 != 0 && Static2.anInt70 != -1) {
				Static48.method960(Static86.aClass15_Sub1_57, Static2.anInt70, Static58.anInt1633);
			}
			Static96.aBoolean127 = false;
		} else if (Static58.anInt1633 != 0 && Static2.anInt70 != -1 && !Static89.method1562()) {
			Static131.aClass2_Sub3_Sub1_2.method221(133);
			Static131.aClass2_Sub3_Sub1_2.method200(Static2.anInt70);
			Static2.anInt70 = -1;
		}
	}
}
