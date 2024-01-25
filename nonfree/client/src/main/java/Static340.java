import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!nba", name = "C", descriptor = "Lclient!em;")
	public static final Class83 aClass83_131 = new Class83(67, 4);

	@OriginalMember(owner = "client!nba", name = "ab", descriptor = "[S")
	public static short[] aShortArray60 = new short[256];

	@OriginalMember(owner = "client!nba", name = "cb", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	public static void method5066() {
		Static54.aClass1_Sub6_Sub2_2.method3527();
		Static148.aClass308_59 = null;
		Static2.anInt71 = 1;
		Static144.aClass1_Sub6_Sub2_4 = null;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	public static void method5075() {
		@Pc(16) boolean local16 = Static158.aClass1_Sub3_Sub1_2.method7931() == 1;
		@Pc(20) int local20 = Static158.aClass1_Sub3_Sub1_2.method7967();
		@Pc(26) int local26 = Static158.aClass1_Sub3_Sub1_2.method7967();
		@Pc(30) int local30 = Static158.aClass1_Sub3_Sub1_2.method7938();
		Static339.anInt6245 = Static158.aClass1_Sub3_Sub1_2.method7931();
		Static206.method3170();
		Static131.method2303(local30);
		Static158.aClass1_Sub3_Sub1_2.method4996();
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(61) int local61;
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			for (local50 = 0; local50 < Static458.anInt9736 >> 3; local50++) {
				for (local54 = 0; local54 < Static378.anInt6747 >> 3; local54++) {
					local61 = Static158.aClass1_Sub3_Sub1_2.method4994(1);
					if (local61 == 1) {
						Static593.anIntArrayArrayArray20[local46][local50][local54] = Static158.aClass1_Sub3_Sub1_2.method4994(26);
					} else {
						Static593.anIntArrayArrayArray20[local46][local50][local54] = -1;
					}
				}
			}
		}
		Static158.aClass1_Sub3_Sub1_2.method4997();
		local50 = (Static464.anInt8696 - Static158.aClass1_Sub3_Sub1_2.anInt9802) / 16;
		Static526.anIntArrayArray53 = new int[local50][4];
		for (local54 = 0; local54 < local50; local54++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static526.anIntArrayArray53[local54][local61] = Static158.aClass1_Sub3_Sub1_2.method7940();
			}
		}
		Static578.aByteArrayArray27 = new byte[local50][];
		Static91.anIntArray519 = new int[local50];
		Static505.anIntArray528 = new int[local50];
		Static506.anIntArray529 = new int[local50];
		Static145.aByteArrayArray5 = new byte[local50][];
		Static342.anIntArray376 = new int[local50];
		Static380.aByteArrayArray18 = null;
		Static344.aByteArrayArray17 = new byte[local50][];
		Static526.anIntArray550 = null;
		Static393.aByteArrayArray21 = new byte[local50][];
		Static408.anIntArray434 = new int[local50];
		local50 = 0;
		for (local61 = 0; local61 < 4; local61++) {
			for (@Pc(192) int local192 = 0; local192 < Static458.anInt9736 >> 3; local192++) {
				for (@Pc(196) int local196 = 0; local196 < Static378.anInt6747 >> 3; local196++) {
					@Pc(206) int local206 = Static593.anIntArrayArrayArray20[local61][local192][local196];
					if (local206 != -1) {
						@Pc(216) int local216 = local206 >> 14 & 0x3FF;
						@Pc(222) int local222 = local206 >> 3 & 0x7FF;
						@Pc(232) int local232 = local222 / 8 + (local216 / 8 << 8);
						for (@Pc(234) int local234 = 0; local234 < local50; local234++) {
							if (Static91.anIntArray519[local234] == local232) {
								local232 = -1;
								break;
							}
						}
						if (local232 != -1) {
							Static91.anIntArray519[local50] = local232;
							@Pc(266) int local266 = local232 >> 8 & 0xFF;
							@Pc(270) int local270 = local232 & 0xFF;
							Static506.anIntArray529[local50] = Static141.aClass308_56.method6558("m" + local266 + "_" + local270);
							Static505.anIntArray528[local50] = Static141.aClass308_56.method6558("l" + local266 + "_" + local270);
							Static342.anIntArray376[local50] = Static141.aClass308_56.method6558("um" + local266 + "_" + local270);
							Static408.anIntArray434[local50] = Static141.aClass308_56.method6558("ul" + local266 + "_" + local270);
							local50++;
						}
					}
				}
			}
		}
		Static549.method7484(local20, local26, local16, 11);
	}
}
