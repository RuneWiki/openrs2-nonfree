import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "Lclient!js;")
	public static final Class156 aClass156_8 = new Class156(9, 0, 4, 1);

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
	public static int anInt5928 = 0;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	public static void method5381() {
		@Pc(9) int local9 = Static352.aClass1_Sub17_Sub2_2.method4472();
		@Pc(13) int local13 = Static352.aClass1_Sub17_Sub2_2.method4494();
		@Pc(17) int local17 = Static352.aClass1_Sub17_Sub2_2.method4449();
		Static61.anInt1489 = Static352.aClass1_Sub17_Sub2_2.method4449();
		@Pc(36) boolean local36 = Static352.aClass1_Sub17_Sub2_2.method4487() == 1;
		Static349.method5782();
		Static42.method1217(local17);
		Static352.aClass1_Sub17_Sub2_2.method4510();
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(61) int local61;
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			for (local50 = 0; local50 < Static237.anInt4563 >> 3; local50++) {
				for (local54 = 0; local54 < Static373.anInt6694 >> 3; local54++) {
					local61 = Static352.aClass1_Sub17_Sub2_2.method4517(1);
					if (local61 == 1) {
						Static329.anIntArrayArrayArray18[local46][local50][local54] = Static352.aClass1_Sub17_Sub2_2.method4517(26);
					} else {
						Static329.anIntArrayArrayArray18[local46][local50][local54] = -1;
					}
				}
			}
		}
		Static352.aClass1_Sub17_Sub2_2.method4518();
		local50 = (Static494.anInt8660 - Static352.aClass1_Sub17_Sub2_2.anInt4872) / 16;
		Static16.anIntArrayArray125 = new int[local50][4];
		for (local54 = 0; local54 < local50; local54++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static16.anIntArrayArray125[local54][local61] = Static352.aClass1_Sub17_Sub2_2.method4481();
			}
		}
		Static214.anIntArray337 = new int[local50];
		Static473.aByteArrayArray25 = new byte[local50][];
		Static464.aByteArrayArray24 = new byte[local50][];
		Static373.aByteArrayArray19 = new byte[local50][];
		Static487.anIntArray754 = new int[local50];
		Static395.anIntArray676 = new int[local50];
		Static268.aByteArrayArray15 = new byte[local50][];
		Static144.anIntArray245 = null;
		Static378.anIntArray656 = new int[local50];
		Static77.aByteArrayArray10 = null;
		Static46.anIntArray85 = new int[local50];
		local50 = 0;
		for (local61 = 0; local61 < 4; local61++) {
			for (@Pc(199) int local199 = 0; local199 < Static237.anInt4563 >> 3; local199++) {
				for (@Pc(203) int local203 = 0; local203 < Static373.anInt6694 >> 3; local203++) {
					@Pc(213) int local213 = Static329.anIntArrayArrayArray18[local61][local199][local203];
					if (local213 != -1) {
						@Pc(222) int local222 = local213 >> 14 & 0x3FF;
						@Pc(228) int local228 = local213 >> 3 & 0x7FF;
						@Pc(238) int local238 = local228 / 8 + (local222 / 8 << 8);
						for (@Pc(240) int local240 = 0; local240 < local50; local240++) {
							if (Static378.anIntArray656[local240] == local238) {
								local238 = -1;
								break;
							}
						}
						if (local238 != -1) {
							Static378.anIntArray656[local50] = local238;
							@Pc(272) int local272 = local238 >> 8 & 0xFF;
							@Pc(276) int local276 = local238 & 0xFF;
							Static46.anIntArray85[local50] = Static10.aClass69_4.method1909("m" + local272 + "_" + local276);
							Static487.anIntArray754[local50] = Static10.aClass69_4.method1909("l" + local272 + "_" + local276);
							Static214.anIntArray337[local50] = Static10.aClass69_4.method1909("um" + local272 + "_" + local276);
							Static395.anIntArray676[local50] = Static10.aClass69_4.method1909("ul" + local272 + "_" + local276);
							local50++;
						}
					}
				}
			}
		}
		Static164.method2938(local9, local13, 10, local36);
	}
}
