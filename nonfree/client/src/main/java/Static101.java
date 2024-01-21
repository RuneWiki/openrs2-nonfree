import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
	public static int anInt2612;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "Z")
	public static boolean aBoolean232;

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "Lclient!nf;")
	public static Class4_Sub1_Sub2_Sub4_Sub1 aClass4_Sub1_Sub2_Sub4_Sub1_4;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "Lclient!ec;")
	public static Class22 aClass22_767 = Static60.method1113("Versteckt");

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "[I")
	public static int[] anIntArray290 = new int[500];

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "Lclient!ec;")
	public static Class22 aClass22_768 = Static60.method1113("rot:");

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "[I")
	public static int[] anIntArray291 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIBI)V")
	public static void method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == Static51.anInt1473 && arg2 == Static119.anInt2900 && (Static96.anInt2497 == arg0 || !Static130.aBoolean279)) {
			return;
		}
		Static96.anInt2497 = arg0;
		if (!Static130.aBoolean279) {
			Static96.anInt2497 = 0;
		}
		Static51.anInt1473 = arg3;
		Static119.anInt2900 = arg2;
		Static46.method888(25);
		Static12.method165(Static42.aClass22_252, true);
		@Pc(36) int local36 = Static59.anInt1769;
		Static59.anInt1769 = arg3 * 8 - 48;
		@Pc(44) int local44 = Static98.anInt2584;
		Static98.anInt2584 = (arg2 - 6) * 8;
		@Pc(55) int local55 = Static59.anInt1769 - local36;
		@Pc(62) int local62 = Static98.anInt2584 - local44;
		for (@Pc(66) int local66 = 0; local66 < 32768; local66++) {
			@Pc(72) Class4_Sub1_Sub3_Sub2_Sub2 local72 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local66];
			if (local72 != null) {
				for (@Pc(76) int local76 = 0; local76 < 10; local76++) {
					local72.anIntArray280[local76] -= local55;
					local72.anIntArray277[local76] -= local62;
				}
				local72.anInt2500 -= local55 * 128;
				local72.anInt2462 -= local62 * 128;
			}
		}
		for (@Pc(124) int local124 = 0; local124 < 2048; local124++) {
			@Pc(130) Class4_Sub1_Sub3_Sub2_Sub1 local130 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local124];
			if (local130 != null) {
				for (@Pc(134) int local134 = 0; local134 < 10; local134++) {
					local130.anIntArray280[local134] -= local55;
					local130.anIntArray277[local134] -= local62;
				}
				local130.anInt2500 -= local55 * 128;
				local130.anInt2462 -= local62 * 128;
			}
		}
		Static37.anInt895 = arg0;
		Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.method1610(arg1, false, arg4);
		@Pc(190) byte local190 = 0;
		@Pc(192) byte local192 = 104;
		@Pc(194) byte local194 = 1;
		@Pc(196) byte local196 = 0;
		if (local55 < 0) {
			local190 = 103;
			local194 = -1;
			local192 = -1;
		}
		@Pc(209) byte local209 = 1;
		@Pc(211) byte local211 = 104;
		if (local62 < 0) {
			local196 = 103;
			local211 = -1;
			local209 = -1;
		}
		for (@Pc(231) int local231 = local190; local231 != local192; local231 += local194) {
			for (@Pc(235) int local235 = local196; local235 != local211; local235 += local209) {
				@Pc(241) int local241 = local62 + local235;
				@Pc(245) int local245 = local55 + local231;
				for (@Pc(247) int local247 = 0; local247 < 4; local247++) {
					if (local245 >= 0 && local241 >= 0 && local245 < 104 && local241 < 104) {
						Static19.aClass82ArrayArrayArray1[local247][local231][local235] = Static19.aClass82ArrayArrayArray1[local247][local245][local241];
					} else {
						Static19.aClass82ArrayArrayArray1[local247][local231][local235] = null;
					}
				}
			}
		}
		for (@Pc(319) Class4_Sub5 local319 = (Class4_Sub5) Static39.aClass82_4.method2025(); local319 != null; local319 = (Class4_Sub5) Static39.aClass82_4.method2023()) {
			local319.anInt531 -= local55;
			local319.anInt542 -= local62;
			if (local319.anInt531 < 0 || local319.anInt542 < 0 || local319.anInt531 >= 104 || local319.anInt542 >= 104) {
				local319.method1999();
			}
		}
		if (Static39.anInt971 != 0) {
			Static39.anInt971 -= local55;
			Static27.anInt620 -= local62;
		}
		Static19.aBoolean53 = false;
		Static120.anInt2929 = 0;
		Static5.anInt85 = -1;
		Static132.aClass82_14.method2018();
		Static73.aClass82_7.method2018();
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	public static void method1700() {
		@Pc(3) Class44 local3 = Static33.aClass44_1;
		synchronized (Static33.aClass44_1) {
			Static1.anInt2 = Static34.anInt856;
			@Pc(19) int local19;
			if (Static12.anInt215 < 0) {
				for (local19 = 0; local19 < 112; local19++) {
					Static89.aBooleanArray18[local19] = false;
				}
				Static12.anInt215 = Static95.anInt1935;
			} else {
				while (Static95.anInt1935 != Static12.anInt215) {
					local19 = Static4.anIntArray4[Static95.anInt1935];
					Static95.anInt1935 = Static95.anInt1935 + 1 & 0x7F;
					if (local19 >= 0) {
						Static89.aBooleanArray18[local19] = true;
					} else {
						Static89.aBooleanArray18[~local19] = false;
					}
				}
			}
			Static34.anInt856 = Static51.anInt1453;
		}
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	public static void method1701() {
		anIntArray290 = null;
		aClass22_768 = null;
		anIntArray291 = null;
		aClass22_767 = null;
		aClass4_Sub1_Sub2_Sub4_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I")
	public static int method1703(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0x33333333) + (local13 & 0x33333333);
		@Pc(32) int local32 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
