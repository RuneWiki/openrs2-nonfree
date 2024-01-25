import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!aw", name = "L", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
	public static int anInt637 = 1;

	@OriginalMember(owner = "client!aw", name = "I", descriptor = "Lclient!tf;")
	public static final Class334 aClass334_1 = new Class334();

	@OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
	public static int anInt643 = -1;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(B)I")
	public static int method502() {
		@Pc(5) Class32 local5 = Static256.aClass32_44;
		synchronized (Static256.aClass32_44) {
			return Static256.aClass32_44.method641();
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(Z)V")
	public static void method503() {
		for (@Pc(8) int local8 = 0; local8 < Static270.anInt4355; local8++) {
			@Pc(14) Class105 local14 = Static81.aClass105Array1[local8];
			@Pc(16) boolean local16 = false;
			@Pc(141) int local141;
			if (local14.aClass2_Sub13_Sub2_1 == null) {
				local14.anInt2688--;
				if (local14.anInt2688 >= (local14.method2242() ? -1500 : -10)) {
					if (local14.aByte34 == 1 && local14.aClass88_1 == null) {
						local14.aClass88_1 = Static647.method1810(Static319.aClass380_76, local14.anInt2686, 0);
						if (local14.aClass88_1 == null) {
							continue;
						}
						local14.anInt2688 += local14.aClass88_1.method1812();
					} else if (local14.method2242() && (local14.aClass2_Sub39_1 == null || local14.aClass2_Sub1_Sub1_1 == null)) {
						if (local14.aClass2_Sub39_1 == null) {
							local14.aClass2_Sub39_1 = Static477.method6426(Static404.aClass380_98, local14.anInt2686);
						}
						if (local14.aClass2_Sub39_1 == null) {
							continue;
						}
						if (local14.aClass2_Sub1_Sub1_1 == null) {
							local14.aClass2_Sub1_Sub1_1 = local14.aClass2_Sub39_1.method6420(new int[] { 22050 });
							if (local14.aClass2_Sub1_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local14.anInt2688 < 0) {
						@Pc(117) int local117 = 8192;
						if (local14.anInt2692 == 0) {
							local141 = local14.anInt2685 * (local14.aByte34 == 3 ? Static234.aClass2_Sub5_48.aClass6_Sub22_4.method7291() : Static234.aClass2_Sub5_48.aClass6_Sub22_5.method7291()) >> 2;
						} else {
							@Pc(150) int local150 = local14.anInt2692 >> 24 & 0x3;
							if (local150 == Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127) {
								@Pc(169) int local169 = (local14.anInt2692 & 0xFF) << 9;
								@Pc(175) int local175 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() << 8;
								@Pc(182) int local182 = local14.anInt2692 >> 16 & 0xFF;
								@Pc(194) int local194 = local175 + (local182 << 9) + 256 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090;
								@Pc(201) int local201 = local14.anInt2692 >> 8 & 0xFF;
								@Pc(213) int local213 = (local201 << 9) + local175 + 256 - Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089;
								@Pc(221) int local221 = Math.abs(local194) + Math.abs(local213) - 512;
								if (local221 > local169) {
									local14.anInt2688 = -99999;
									continue;
								}
								if (local221 < 0) {
									local221 = 0;
								}
								local141 = Static234.aClass2_Sub5_48.aClass6_Sub22_2.method7291() * (local169 - local221) * local14.anInt2685 / local169 >> 2;
								if (local14.aClass13_Sub1_1 != null && local14.aClass13_Sub1_1 instanceof Class13_Sub1_Sub1) {
									@Pc(264) Class13_Sub1_Sub1 local264 = (Class13_Sub1_Sub1) local14.aClass13_Sub1_1;
									@Pc(267) short local267 = local264.aShort119;
									@Pc(270) short local270 = local264.aShort117;
								}
								if (local194 != 0 || local213 != 0) {
									@Pc(293) int local293 = -Static338.anInt5355 - (int) (Math.atan2((double) local194, (double) local213) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local293 > 8192) {
										local293 = 16384 - local293;
									}
									@Pc(307) int local307;
									if (local221 <= 0) {
										local307 = 8192;
									} else if (local221 >= 4096) {
										local307 = 16384;
									} else {
										local307 = (8192 - local221) / 4096 + 8192;
									}
									local117 = local293 * local307 / 8192 + (16384 - local307 >> 1);
								}
							} else {
								local141 = 0;
							}
						}
						if (local141 > 0) {
							@Pc(342) Class2_Sub1_Sub1 local342 = null;
							if (local14.aByte34 == 1) {
								local342 = local14.aClass88_1.method1813().method32(Static115.aClass217_1);
							} else if (local14.method2242()) {
								local342 = local14.aClass2_Sub1_Sub1_1;
							}
							@Pc(370) Class2_Sub13_Sub2 local370 = local14.aClass2_Sub13_Sub2_1 = Static652.method4446(local342, local14.anInt2687, local141, local117);
							local370.method4453(local14.anInt2690 - 1);
							Static586.aClass2_Sub13_Sub4_2.method7225(local370);
						}
					}
				} else {
					local16 = true;
				}
			} else if (!local14.aClass2_Sub13_Sub2_1.method8652()) {
				local16 = true;
			}
			if (local16) {
				Static270.anInt4355--;
				for (local141 = local8; local141 < Static270.anInt4355; local141++) {
					Static81.aClass105Array1[local141] = Static81.aClass105Array1[local141 + 1];
				}
				local8--;
			}
		}
		if (Static446.aBoolean675 && !Static334.method4507()) {
			if (Static234.aClass2_Sub5_48.aClass6_Sub22_3.method7291() != 0 && Static489.anInt1781 != -1) {
				if (Static78.aClass2_Sub13_Sub3_1 == null) {
					Static565.method7740(Static489.anInt1781, Static539.aClass380_121, Static234.aClass2_Sub5_48.aClass6_Sub22_3.method7291());
				} else {
					Static415.method5566(Static489.anInt1781, Static234.aClass2_Sub5_48.aClass6_Sub22_3.method7291(), Static539.aClass380_121, Static78.aClass2_Sub13_Sub3_1);
				}
			}
			Static78.aClass2_Sub13_Sub3_1 = null;
			Static446.aBoolean675 = false;
		} else if (Static234.aClass2_Sub5_48.aClass6_Sub22_3.method7291() != 0 && Static489.anInt1781 != -1 && !Static334.method4507()) {
			@Pc(496) Class2_Sub40 local496 = Static464.method6285(Static251.aClass131_1, Static569.aClass179_120);
			local496.aClass2_Sub22_Sub2_2.method8552(Static489.anInt1781);
			Static528.method7295(local496);
			Static489.anInt1781 = -1;
		}
	}
}
