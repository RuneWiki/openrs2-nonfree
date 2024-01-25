import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public static int anInt7414;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_382 = new Class305(6, -2);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public static void method6632() {
		@Pc(8) int local8 = Static77.aByteArrayArray10.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static77.aByteArrayArray10[local10] != null) {
				@Pc(24) int local24 = -1;
				for (@Pc(26) int local26 = 0; local26 < Static528.anInt9348; local26++) {
					if (Static378.anIntArray656[local10] == Static200.anIntArray316[local26]) {
						local24 = local26;
						break;
					}
				}
				if (local24 == -1) {
					Static200.anIntArray316[Static528.anInt9348] = Static378.anIntArray656[local10];
					local24 = Static528.anInt9348++;
				}
				@Pc(69) Class1_Sub17 local69 = new Class1_Sub17(Static77.aByteArrayArray10[local10]);
				@Pc(71) int local71 = 0;
				while (local69.anInt4872 < Static77.aByteArrayArray10[local10].length && local71 < 511 && Static141.anInt2822 < 1023) {
					@Pc(88) int local88 = local71++ << 6 | local24;
					@Pc(92) int local92 = local69.method4494();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(119) int local119 = (Static378.anIntArray656[local10] >> 8) * 64 + local102 - Static538.anInt9485;
					@Pc(133) int local133 = (Static378.anIntArray656[local10] & 0xFF) * 64 + local106 - Static282.anInt5380;
					@Pc(140) Class283 local140 = Static358.aClass95_1.method2362(local69.method4494());
					@Pc(147) Class1_Sub41 local147 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local88);
					if (local147 == null && (local140.aByte91 & 0x1) > 0 && Static514.anInt9103 == local96 && local119 >= 0 && Static237.anInt4563 > local140.anInt8439 + local119 && local133 >= 0 && Static373.anInt6694 > local140.anInt8439 + local133) {
						@Pc(192) Class20_Sub1_Sub1_Sub2 local192 = new Class20_Sub1_Sub1_Sub2();
						local192.anInt8969 = local88;
						@Pc(200) Class1_Sub41 local200 = new Class1_Sub41(local192);
						Static362.aClass230_46.method6139((long) local88, local200);
						Static35.aClass1_Sub41Array1[Static342.anInt6322++] = local200;
						Static220.anIntArray339[Static141.anInt2822++] = local88;
						local192.anInt8985 = Static445.anInt7791;
						local192.method7826(local140);
						local192.method7810(local192.aClass283_1.anInt8439);
						local192.anInt9018 = local192.aClass283_1.anInt8419 << 3;
						local192.method7821(true, local192.aClass283_1.aByte95 + 4 << 11 & 0x38CA);
						local192.method7830(true, local192.method7808(), local119, local96, local133);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
	public static void method6635() {
		for (@Pc(6) Class1_Sub27 local6 = (Class1_Sub27) Static365.aClass295_39.method7543(); local6 != null; local6 = (Class1_Sub27) Static365.aClass295_39.method7540()) {
			if (Static263.aClass64ArrayArrayArray3 == null) {
				local6.method8239();
			} else {
				@Pc(28) int local28;
				@Pc(124) Class20_Sub5 local124;
				@Pc(137) Class20_Sub5_Sub1 local137;
				@Pc(167) Class20_Sub1 local167;
				@Pc(82) Class20_Sub4 local82;
				@Pc(41) Class20_Sub2 local41;
				@Pc(95) Class20_Sub4_Sub2 local95;
				@Pc(54) Class20_Sub2_Sub3 local54;
				if (local6.anInt4512 <= Static445.anInt7791) {
					local28 = Static250.anIntArray400[local6.anInt4515];
					if (local28 == 0) {
						local41 = Static47.method5108(local6.anInt4517, local6.anInt4518, local6.anInt4509);
						if (local41 instanceof Class20_Sub2_Sub3) {
							Static184.method3552(local6.anInt4517, local6.anInt4518, local6.anInt4509);
							local54 = (Class20_Sub2_Sub3) local41;
							if (local54.aClass20_Sub2_3 != null) {
								Static164.method2943(local6.anInt4517, local6.anInt4518, local6.anInt4509, local54.aClass20_Sub2_3, null);
							}
						}
					} else if (local28 == 1) {
						local82 = Static544.method6945(local6.anInt4517, local6.anInt4518, local6.anInt4509);
						if (local82 instanceof Class20_Sub4_Sub2) {
							Static39.method1124(local6.anInt4517, local6.anInt4518, local6.anInt4509);
							local95 = (Class20_Sub4_Sub2) local82;
							if (local95.aClass20_Sub4_3 != null) {
								Static390.method6233(local6.anInt4517, local6.anInt4518, local6.anInt4509, local95.aClass20_Sub4_3, null);
							}
						}
					} else if (local28 == 2) {
						local167 = Static100.method2041(local6.anInt4517, local6.anInt4518, local6.anInt4509, fp.class);
						if (local167 instanceof Class20_Sub1_Sub4) {
							Static334.method5662(local6.anInt4517, local6.anInt4518, local6.anInt4509, fp.class);
							@Pc(188) Class20_Sub1_Sub4 local188 = (Class20_Sub1_Sub4) local167;
							if (local188.aClass20_Sub1_1 != null) {
								Static391.method6237(local188.aClass20_Sub1_1, false);
							}
						}
					} else if (local28 == 3) {
						local124 = Static465.method7066(local6.anInt4517, local6.anInt4518, local6.anInt4509);
						if (local124 instanceof Class20_Sub5_Sub1) {
							Static292.method5118(local6.anInt4517, local6.anInt4518, local6.anInt4509);
							local137 = (Class20_Sub5_Sub1) local124;
							if (local137.aClass20_Sub5_2 != null) {
								Static165.method3097(local6.anInt4517, local6.anInt4518, local6.anInt4509, local137.aClass20_Sub5_2);
							}
						}
					}
					local6.method8239();
				} else if (Static445.anInt7791 == local6.anInt4507) {
					local28 = Static250.anIntArray400[local6.anInt4515];
					if (local28 == 0) {
						local41 = Static47.method5108(local6.anInt4517, local6.anInt4518, local6.anInt4509);
						if (local41 instanceof Class20_Sub2_Sub3) {
							local6.method8239();
						} else if (Static259.method4671(local6.anInt4517, local6.anInt4518, local6.anInt4509) == null) {
							local54 = new Class20_Sub2_Sub3(local6.anInt4515, local6.anInt4504, local6.anInt4508, local6.anInt4506, local6.anInt4502, local41);
							Static164.method2943(local6.anInt4517, local6.anInt4518, local6.anInt4509, local54, null);
						} else {
							local6.method8239();
						}
					} else if (local28 == 1) {
						local82 = Static544.method6945(local6.anInt4517, local6.anInt4518, local6.anInt4509);
						if (local82 instanceof Class20_Sub4_Sub2) {
							local6.method8239();
						} else if (Static152.method2808(local6.anInt4517, local6.anInt4518, local6.anInt4509) == null) {
							local95 = new Class20_Sub4_Sub2(local6.anInt4515, local6.anInt4504, local6.anInt4508, local6.anInt4506, local6.anInt4502, local82);
							Static390.method6233(local6.anInt4517, local6.anInt4518, local6.anInt4509, local95, null);
						} else {
							local6.method8239();
						}
					} else if (local28 == 2) {
						local167 = Static100.method2041(local6.anInt4517, local6.anInt4518, local6.anInt4509, fp.class);
						if (local167 instanceof Class20_Sub1_Sub4) {
							local6.method8239();
						} else {
							Static334.method5662(local6.anInt4517, local6.anInt4518, local6.anInt4509, fp.class);
							@Pc(381) Class51 local381 = Static398.aClass18_4.method609(local6.anInt4501);
							@Pc(392) int local392;
							@Pc(395) int local395;
							if (local6.anInt4504 == 1 || local6.anInt4504 == 3) {
								local395 = local381.anInt1636;
								local392 = local381.anInt1615;
							} else {
								local392 = local381.anInt1636;
								local395 = local381.anInt1615;
							}
							@Pc(438) Class20_Sub1_Sub4 local438 = new Class20_Sub1_Sub4(local6.anInt4515, local6.anInt4504, local6.anInt4517, local6.anInt4508, local6.anInt4506, local6.anInt4502, local6.anInt4518, local6.anInt4518 + local392 - 1, local6.anInt4509, local6.anInt4509 + local395 - 1, local167);
							Static391.method6237(local438, false);
						}
					} else if (local28 == 3) {
						local124 = Static465.method7066(local6.anInt4517, local6.anInt4518, local6.anInt4509);
						if (local124 instanceof Class20_Sub5_Sub1) {
							local6.method8239();
						} else {
							local137 = new Class20_Sub5_Sub1(local6.anInt4508, local6.anInt4506, local6.anInt4502, local124);
							Static165.method3097(local6.anInt4517, local6.anInt4518, local6.anInt4509, local137);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method6637(@OriginalArg(0) Class4 arg0) {
		if (Static242.aBoolean356) {
			Static528.method8082(arg0);
		} else {
			Static239.method6196(arg0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!lk;ZIIZI)V")
	public static void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (Static482.anInt8558 >= 50 || (arg1 == null || arg1.anIntArrayArray63 == null || arg1.anIntArrayArray63.length <= arg3 || arg1.anIntArrayArray63[arg3] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray63[arg3][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(59) int local59;
		if (arg1.anIntArrayArray63[arg3].length > 1) {
			local59 = (int) (Math.random() * (double) arg1.anIntArrayArray63[arg3].length);
			if (local59 > 0) {
				local36 = arg1.anIntArrayArray63[arg3][local59];
			}
		}
		@Pc(80) int local80 = local32 & 0x1F;
		if (local80 == 0) {
			if (arg4) {
				Static394.method6253(local36, 255, local42, 0);
			}
		} else if (Static286.aClass1_Sub15_Sub1_1.anInt7037 != 0) {
			local59 = arg5 - 64 >> 7;
			@Pc(107) int local107 = arg2 - 64 >> 7;
			Static314.aClass182Array1[Static482.anInt8558++] = new Class182((byte) 1, local36, local42, 0, 255, (local59 << 16) + (arg0 << 24) + (local107 << 8) + local80);
		}
	}
}
