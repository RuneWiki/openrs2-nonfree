import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	public static int anInt5985;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
	public static int anInt5986;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "[I")
	public static final int[] anIntArray386 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_150 = new Class81(107, -1);

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "[I")
	public static final int[] anIntArray387 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "J")
	public static long aLong166 = 0L;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public static void method4781() {
		for (@Pc(3) int local3 = 0; local3 < Static18.anInt404; local3++) {
			@Pc(9) Class9 local9 = Static148.aClass9Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(144) int local144;
			if (local9.aClass2_Sub18_Sub1_1 == null) {
				local9.anInt306--;
				if (local9.anInt306 < (local9.aByte1 == 2 ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte1 == 1 && local9.aClass267_1 == null) {
						local9.aClass267_1 = Static462.method6066(Static310.aClass188_83, local9.anInt303, 0);
						if (local9.aClass267_1 == null) {
							continue;
						}
						local9.anInt306 += local9.aClass267_1.method6068();
					} else if (local9.aByte1 == 2 && (local9.aClass2_Sub13_1 == null || local9.aClass2_Sub41_Sub1_1 == null)) {
						if (local9.aClass2_Sub13_1 == null) {
							local9.aClass2_Sub13_1 = Static73.method1321(Static10.aClass188_6, local9.anInt303);
						}
						if (local9.aClass2_Sub13_1 == null) {
							continue;
						}
						if (local9.aClass2_Sub41_Sub1_1 == null) {
							local9.aClass2_Sub41_Sub1_1 = local9.aClass2_Sub13_1.method1322(new int[] { 22050 });
							if (local9.aClass2_Sub41_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local9.anInt306 < 0) {
						if (local9.anInt307 == 0) {
							local144 = local9.anInt310 * Static399.aClass167_Sub1_1.anInt5565 >> 8;
						} else {
							@Pc(138) int local138 = local9.anInt307 >> 24 & 0x3;
							if (local138 == Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92) {
								@Pc(153) int local153 = (local9.anInt307 & 0xFF) << 7;
								@Pc(160) int local160 = local9.anInt307 >> 16 & 0xFF;
								@Pc(170) int local170 = (local160 << 7) + 64 - Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117;
								if (local170 < 0) {
									local170 = -local170;
								}
								@Pc(185) int local185 = local9.anInt307 >> 8 & 0xFF;
								@Pc(195) int local195 = (local185 << 7) + 64 - Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111;
								if (local195 < 0) {
									local195 = -local195;
								}
								@Pc(206) int local206 = local195 + local170 - 128;
								if (local153 < local206) {
									local9.anInt306 = -99999;
									continue;
								}
								if (local206 < 0) {
									local206 = 0;
								}
								local144 = local9.anInt310 * (local153 - local206) * Static399.aClass167_Sub1_1.anInt5567 / local153 >> 8;
							} else {
								local144 = 0;
							}
						}
						if (local144 > 0) {
							@Pc(257) Class2_Sub41_Sub1 local257 = null;
							if (local9.aByte1 == 1) {
								local257 = local9.aClass267_1.method6067().method5546(Static20.aClass195_1);
							} else if (local9.aByte1 == 2) {
								local257 = local9.aClass2_Sub41_Sub1_1;
							}
							@Pc(285) Class2_Sub18_Sub1 local285 = local9.aClass2_Sub18_Sub1_1 = Static458.method2694(local257, local144);
							local285.method2698(local9.anInt308 - 1);
							Static360.aClass2_Sub18_Sub4_2.method4455(local285);
						}
					}
				}
			} else if (!local9.aClass2_Sub18_Sub1_1.method6074()) {
				local11 = true;
			}
			if (local11) {
				Static18.anInt404--;
				for (local144 = local3; local144 < Static18.anInt404; local144++) {
					Static148.aClass9Array1[local144] = Static148.aClass9Array1[local144 + 1];
				}
				local3--;
			}
		}
		if (Static256.aBoolean398 && !Static204.method3164()) {
			if (Static399.aClass167_Sub1_1.anInt5568 != 0 && Static378.anInt6716 != -1) {
				Static408.method5525(Static378.anInt6716, Static329.aClass188_90, Static399.aClass167_Sub1_1.anInt5568);
			}
			Static256.aBoolean398 = false;
		} else if (Static399.aClass167_Sub1_1.anInt5568 != 0 && Static378.anInt6716 != -1 && !Static204.method3164()) {
			Static448.method6059(Static164.aClass44_43);
			Static98.aClass2_Sub20_Sub1_1.method3713(Static378.anInt6716);
			Static378.anInt6716 = -1;
		}
	}
}
