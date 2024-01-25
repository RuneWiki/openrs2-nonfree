import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	public static int anInt975;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	public static int anInt977;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_36 = new Class288(115, 8);

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
	public static int anInt970 = 0;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
	public static void method751() {
		@Pc(13) Class2_Sub2_Sub4 local13 = Static566.method7763(0, 15);
		local13.method669();
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V")
	public static void method752() {
		for (@Pc(3) int local3 = 0; local3 < Static238.anInt3898; local3++) {
			Static144.aClass327Array1[local3] = null;
		}
		Static238.anInt3898 = 0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static10.anInt139; local21++) {
			for (local25 = 0; local25 < Static322.anInt5120; local25++) {
				for (local29 = 0; local29 < Class13_Sub1_Sub4_Sub1.lb; local29++) {
					@Pc(39) Class53 local39 = Static28.aClass53ArrayArrayArray1[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort22 > 0) {
							local39.aShort22 = (short) (local39.aShort22 * -1);
						}
						if (local39.aShort24 > 0) {
							local39.aShort24 = (short) (local39.aShort24 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static10.anInt139; local25++) {
			for (local29 = 0; local29 < Static322.anInt5120; local29++) {
				for (@Pc(95) int local95 = 0; local95 < Class13_Sub1_Sub4_Sub1.lb; local95++) {
					@Pc(105) Class53 local105 = Static28.aClass53ArrayArrayArray1[local25][local95][local29];
					if (local105 != null) {
						@Pc(128) boolean local128 = Static28.aClass53ArrayArrayArray1[0][local95][local29] != null && Static28.aClass53ArrayArrayArray1[0][local95][local29].aClass53_1 != null;
						@Pc(133) int local133;
						@Pc(135) int local135;
						@Pc(149) Class53 local149;
						@Pc(157) int local157;
						@Pc(314) int local314;
						@Pc(328) int local328;
						@Pc(336) int local336;
						@Pc(352) int local352;
						@Pc(359) int local359;
						@Pc(363) int local363;
						@Pc(367) int local367;
						@Pc(373) int local373;
						@Pc(414) int local414;
						@Pc(418) int local418;
						if (local105.aShort24 < 0) {
							local133 = local29;
							local135 = local29;
							local149 = Static28.aClass53ArrayArrayArray1[local25][local95][local29 - 1];
							local157 = Static462.aClass76Array3[local25].method7396(local29, local95);
							while (local133 > 0 && local149 != null && local149.aShort24 < 0 && local149.aShort24 == local105.aShort24 && local105.aShort21 == local149.aShort21 && Static462.aClass76Array3[local25].method7396(local133 - 1, local95) == local157 && (local133 - 1 <= 0 || Static462.aClass76Array3[local25].method7396(local133 - 2, local95) == local157)) {
								local133--;
								local149 = Static28.aClass53ArrayArrayArray1[local25][local95][local133 - 1];
							}
							for (local149 = Static28.aClass53ArrayArrayArray1[local25][local95][local29 + 1]; Class13_Sub1_Sub4_Sub1.lb > local135 && local149 != null && local149.aShort24 < 0 && local105.aShort24 == local149.aShort24 && local149.aShort21 == local105.aShort21 && Static462.aClass76Array3[local25].method7396(local135 + 1, local95) == local157 && (Class13_Sub1_Sub4_Sub1.lb <= local135 + 1 || Static462.aClass76Array3[local25].method7396(local135 + 2, local95) == local157); local149 = Static28.aClass53ArrayArrayArray1[local25][local95][local135 + 1]) {
								local135++;
							}
							local314 = local25 + 1 - local25;
							local328 = Static462.aClass76Array3[local128 ? local25 + 1 : local25].method7396(local133, local95);
							local336 = local328 + local105.aShort24 * local314;
							local352 = Static462.aClass76Array3[local128 ? local25 + 1 : local25].method7396(local135 + 1, local95);
							local359 = local352 + local314 * local105.aShort24;
							local363 = local95 << Static609.anInt9827;
							local367 = local133 << Static609.anInt9827;
							local373 = (local135 << Static609.anInt9827) + Static192.anInt3298;
							Static144.aClass327Array1[Static238.anInt3898++] = new Class327(1, local25, local363 + local105.aShort21, local363 - -local105.aShort21, local105.aShort21 + local363, local363 - -local105.aShort21, local328, local352, local359, local336, local367, local373, local373, local367);
							for (local414 = local25; local414 <= local25; local414++) {
								for (local418 = local133; local418 <= local135; local418++) {
									Static28.aClass53ArrayArrayArray1[local414][local95][local418].aShort24 = (short) (Static28.aClass53ArrayArrayArray1[local414][local95][local418].aShort24 * -1);
								}
							}
						}
						if (local105.aShort22 < 0) {
							local133 = local95;
							local135 = local95;
							local149 = Static28.aClass53ArrayArrayArray1[local25][local95 - 1][local29];
							local157 = Static462.aClass76Array3[local25].method7396(local29, local95);
							while (local133 > 0 && local149 != null && local149.aShort22 < 0 && local149.aShort22 == local105.aShort22 && local105.aShort23 == local149.aShort23 && Static462.aClass76Array3[local25].method7396(local29, local133 - 1) == local157 && (local133 - 1 <= 0 || Static462.aClass76Array3[local25].method7396(local29, local133 - 2) == local157)) {
								local133--;
								local149 = Static28.aClass53ArrayArrayArray1[local25][local133 - 1][local29];
							}
							for (local149 = Static28.aClass53ArrayArrayArray1[local25][local95 + 1][local29]; local135 < Static322.anInt5120 && local149 != null && local149.aShort22 < 0 && local105.aShort22 == local149.aShort22 && local149.aShort23 == local105.aShort23 && Static462.aClass76Array3[local25].method7396(local29, local135 + 1) == local157 && (local135 + 1 >= Static322.anInt5120 || Static462.aClass76Array3[local25].method7396(local29, local135 + 2) == local157); local149 = Static28.aClass53ArrayArrayArray1[local25][local135 + 1][local29]) {
								local135++;
							}
							local314 = local25 + 1 - local25;
							local328 = Static462.aClass76Array3[local128 ? local25 + 1 : local25].method7396(local29, local133);
							local336 = local105.aShort22 * local314 + local328;
							local352 = Static462.aClass76Array3[local128 ? local25 + 1 : local25].method7396(local29, local135 + 1);
							local359 = local314 * local105.aShort22 + local352;
							local363 = local133 << Static609.anInt9827;
							local367 = Static192.anInt3298 + (local135 << Static609.anInt9827);
							local373 = local29 << Static609.anInt9827;
							Static144.aClass327Array1[Static238.anInt3898++] = new Class327(2, local25, local363, local367, local367, local363, local328, local352, local359, local336, local105.aShort23 + local373, local105.aShort23 + local373, local105.aShort23 + local373, local105.aShort23 + local373);
							for (local414 = local25; local414 <= local25; local414++) {
								for (local418 = local133; local418 <= local135; local418++) {
									Static28.aClass53ArrayArrayArray1[local414][local418][local29].aShort22 = (short) (Static28.aClass53ArrayArrayArray1[local414][local418][local29].aShort22 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static82.aBoolean120 = true;
	}
}
