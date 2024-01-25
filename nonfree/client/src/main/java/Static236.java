import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
	public static int anInt4635;

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "[Lclient!sm;")
	public static Class41[] aClass41Array4;

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "Lclient!qj;")
	public static Class165 aClass165_72;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
	public static int anInt4638 = 1;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
	public static int anInt4639 = 0;

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString184 = "glow1:";

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "J")
	public static long aLong160 = 0L;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4242(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static271.anInt4840++;
		Static200.anInt4070 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static33.anInt805; local7 < Static56.anInt1240; local7++) {
			@Pc(12) Class204[][] local12 = Static138.aClass204ArrayArrayArray1[local7];
			for (local14 = Static285.anInt5515; local14 < Static132.anInt2570; local14++) {
				for (@Pc(17) int local17 = Static129.anInt2513; local17 < Static70.anInt1449; local17++) {
					@Pc(24) Class204 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static57.aBooleanArrayArray7[local14 + Static346.anInt6451 - Static199.anInt4061][local17 + Static346.anInt6451 - Static268.anInt5167] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean537 = true;
							local24.aBoolean536 = true;
							if (local24.aClass17_3 == null) {
								local24.aBoolean538 = false;
							} else {
								local24.aBoolean538 = true;
							}
							Static200.anInt4070++;
						} else {
							local24.aBoolean537 = false;
							local24.aBoolean536 = false;
							local24.aByte59 = 0;
							if (local14 >= Static199.anInt4061 - 16 && local14 <= Static199.anInt4061 + 16 && local17 >= Static268.anInt5167 - 16 && local17 <= Static268.anInt5167 + 16 && (local24.aClass5_Sub1_1 != null || local24.aClass5_Sub1_2 != null || local24.aClass5_Sub4_2 != null || local24.aClass5_Sub4_1 != null || local24.aClass5_Sub5_1 != null || local24.aClass17_3 != null)) {
								Static202.aClass28_1.method3471(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = aClass41Array4 == Static7.aClass41Array1;
		for (local14 = Static33.anInt805; local14 < Static56.anInt1240; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static271.aClass2_12.method3305() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static57.aBooleanArrayArray7.length;
				if (Static285.anInt5515 + Static57.aBooleanArrayArray7.length > Static222.anInt4391) {
					local172 -= Static285.anInt5515 + Static57.aBooleanArrayArray7.length - Static222.anInt4391;
				}
				@Pc(192) int local192 = Static57.aBooleanArrayArray7[0].length;
				if (Static129.anInt2513 + Static57.aBooleanArrayArray7[0].length > Static74.anInt3404) {
					local192 -= Static129.anInt2513 + Static57.aBooleanArrayArray7[0].length - Static74.anInt3404;
				}
				@Pc(213) int local213 = Static186.anInt3868;
				while (true) {
					if (local213 >= local172) {
						Static202.aClass28_1.method3468(Static7.aClass41Array1[local14], true, local14, local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static285.anInt5515 - Static186.anInt3868;
					for (@Pc(222) int local222 = Static112.anInt4018; local222 < local192; local222++) {
						Static134.aBooleanArrayArray13[local213][local222] = false;
						if (Static57.aBooleanArrayArray7[local213][local222]) {
							@Pc(241) int local241 = local222 + Static129.anInt2513 - Static112.anInt4018;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static138.aClass204ArrayArrayArray1[local243][local220][local241] != null && Static138.aClass204ArrayArrayArray1[local243][local220][local241].aByte64 == local14) {
									Static134.aBooleanArrayArray13[local213][local222] = Static138.aClass204ArrayArrayArray1[local243][local220][local241].aBoolean537;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static202.aClass28_1.method3468(Static7.aClass41Array1[local14], false, local14, local161);
			}
			Static202.aClass28_1.method3464();
		}
		if (!Static201.method3758(true)) {
			Static201.method3758(false);
		}
	}
}
