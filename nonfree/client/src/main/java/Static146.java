import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[Lclient!s;")
	public static Class42[] aClass42Array3;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public static int anInt2668 = -1;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public static final int anInt2670 = 2;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[Lclient!em;")
	public static final Class97[] aClass97Array1 = new Class97[100];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method2548() {
		for (@Pc(7) int local7 = 0; local7 < Static655.anInt10336; local7++) {
			@Pc(13) Class129 local13 = Static665.aClass129Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(149) int local149;
			if (local13.aClass4_Sub3_Sub3_1 == null) {
				local13.anInt3085--;
				if (local13.anInt3085 >= (local13.method2873() ? -1500 : -10)) {
					if (local13.aByte33 == 1 && local13.aClass341_1 == null) {
						local13.aClass341_1 = Static687.method7487(Static42.aClass34_6, local13.anInt3083, 0);
						if (local13.aClass341_1 == null) {
							continue;
						}
						local13.anInt3085 += local13.aClass341_1.method7488();
					} else if (local13.method2873() && (local13.aClass4_Sub16_1 == null || local13.aClass4_Sub4_Sub1_1 == null)) {
						if (local13.aClass4_Sub16_1 == null) {
							local13.aClass4_Sub16_1 = Static113.method2135(Static400.aClass34_84, local13.anInt3083);
						}
						if (local13.aClass4_Sub16_1 == null) {
							continue;
						}
						if (local13.aClass4_Sub4_Sub1_1 == null) {
							local13.aClass4_Sub4_Sub1_1 = local13.aClass4_Sub16_1.method2131(new int[] { 22050 });
							if (local13.aClass4_Sub4_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local13.anInt3085 < 0) {
						@Pc(123) int local123 = 8192;
						if (local13.anInt3080 == 0) {
							local149 = local13.anInt3087 * (local13.aByte33 == 3 ? Static124.aClass4_Sub20_4.aClass8_Sub22_1.method7414() : Static124.aClass4_Sub20_4.aClass8_Sub22_4.method7414()) >> 2;
						} else {
							@Pc(158) int local158 = local13.anInt3080 >> 24 & 0x3;
							if (local158 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141) {
								@Pc(169) int local169 = (local13.anInt3080 & 0xFF) << 9;
								@Pc(175) int local175 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() << 8;
								@Pc(182) int local182 = local13.anInt3080 >> 16 & 0xFF;
								@Pc(194) int local194 = (local182 << 9) - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 - (-local175 - 256);
								@Pc(201) int local201 = local13.anInt3080 >> 8 & 0xFF;
								@Pc(213) int local213 = (local201 << 9) + local175 + 256 - Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917;
								@Pc(222) int local222 = Math.abs(local194) + Math.abs(local213) - 512;
								if (local169 < local222) {
									local13.anInt3085 = -99999;
									continue;
								}
								if (local222 < 0) {
									local222 = 0;
								}
								local149 = Static124.aClass4_Sub20_4.aClass8_Sub22_3.method7414() * (local169 - local222) * local13.anInt3087 / local169 >> 2;
								if (local13.aClass3_Sub1_10 != null && local13.aClass3_Sub1_10 instanceof Class3_Sub1_Sub2) {
									@Pc(264) Class3_Sub1_Sub2 local264 = (Class3_Sub1_Sub2) local13.aClass3_Sub1_10;
									@Pc(267) short local267 = local264.aShort125;
									@Pc(270) short local270 = local264.aShort124;
								}
								if (local194 != 0 || local213 != 0) {
									@Pc(294) int local294 = -Static226.anInt3586 - (int) (Math.atan2((double) local194, (double) local213) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local294 > 8192) {
										local294 = 16384 - local294;
									}
									@Pc(307) int local307;
									if (local222 <= 0) {
										local307 = 8192;
									} else if (local222 >= 4096) {
										local307 = 16384;
									} else {
										local307 = (8192 - local222) / 4096 + 8192;
									}
									local123 = local294 * local307 / 8192 + (16384 - local307 >> 1);
								}
							} else {
								local149 = 0;
							}
						}
						if (local149 > 0) {
							@Pc(348) Class4_Sub4_Sub1 local348 = null;
							if (local13.aByte33 == 1) {
								local348 = local13.aClass341_1.method7490().method240(Static228.aClass391_1);
							} else if (local13.method2873()) {
								local348 = local13.aClass4_Sub4_Sub1_1;
							}
							@Pc(376) Class4_Sub3_Sub3 local376 = local13.aClass4_Sub3_Sub3_1 = Static683.method5994(local348, local13.anInt3084, local149, local123);
							local376.method6015(local13.anInt3081 - 1);
							Static162.aClass4_Sub3_Sub5_3.method7724(local376);
						}
					}
				} else {
					local15 = true;
				}
			} else if (!local13.aClass4_Sub3_Sub3_1.method9002()) {
				local15 = true;
			}
			if (local15) {
				Static655.anInt10336--;
				for (local149 = local7; local149 < Static655.anInt10336; local149++) {
					Static665.aClass129Array1[local149] = Static665.aClass129Array1[local149 + 1];
				}
				local7--;
			}
		}
		if (Static299.aBoolean350 && !Static242.method3573()) {
			if (Static124.aClass4_Sub20_4.aClass8_Sub22_5.method7414() != 0 && Static573.anInt8886 != -1) {
				if (Static399.aClass4_Sub3_Sub4_2 == null) {
					Static64.method1419(Static611.aClass34_120, Static124.aClass4_Sub20_4.aClass8_Sub22_5.method7414(), Static573.anInt8886);
				} else {
					Static99.method1989(Static124.aClass4_Sub20_4.aClass8_Sub22_5.method7414(), Static573.anInt8886, Static611.aClass34_120, Static399.aClass4_Sub3_Sub4_2);
				}
			}
			Static299.aBoolean350 = false;
			Static399.aClass4_Sub3_Sub4_2 = null;
		} else if (Static124.aClass4_Sub20_4.aClass8_Sub22_5.method7414() != 0 && Static573.anInt8886 != -1 && !Static242.method3573()) {
			@Pc(495) Class4_Sub48 local495 = Static335.method4615(Static127.aClass216_45, Static669.aClass196_2);
			local495.aClass4_Sub11_Sub1_2.method8860(Static573.anInt8886);
			Static410.method5170(local495);
			Static573.anInt8886 = -1;
		}
	}
}
