import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
	public static int anInt5542 = 100;

	@OriginalMember(owner = "client!kda", name = "q", descriptor = "Lclient!saa;")
	public static final Class327 aClass327_2 = new Class327();

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V")
	public static void method5022() {
		for (@Pc(3) int local3 = 0; local3 < Static398.anInt7403; local3++) {
			Static201.aClass348Array2[local3] = null;
		}
		Static398.anInt7403 = 0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static60.anInt1169; local21++) {
			for (local25 = 0; local25 < Static585.anInt10170; local25++) {
				for (local29 = 0; local29 < Static202.anInt4238; local29++) {
					@Pc(39) Class291 local39 = Static193.aClass291ArrayArrayArray2[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort82 > 0) {
							local39.aShort82 = (short) (local39.aShort82 * -1);
						}
						if (local39.aShort81 > 0) {
							local39.aShort81 = (short) (local39.aShort81 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static60.anInt1169; local25++) {
			for (local29 = 0; local29 < Static585.anInt10170; local29++) {
				for (@Pc(93) int local93 = 0; local93 < Static202.anInt4238; local93++) {
					@Pc(103) Class291 local103 = Static193.aClass291ArrayArrayArray2[local25][local93][local29];
					if (local103 != null) {
						@Pc(126) boolean local126 = Static193.aClass291ArrayArrayArray2[0][local93][local29] != null && Static193.aClass291ArrayArrayArray2[0][local93][local29].aClass291_1 != null;
						@Pc(134) int local134;
						@Pc(136) int local136;
						@Pc(150) Class291 local150;
						@Pc(158) int local158;
						@Pc(323) int local323;
						@Pc(337) int local337;
						@Pc(344) int local344;
						@Pc(360) int local360;
						@Pc(368) int local368;
						@Pc(372) int local372;
						@Pc(376) int local376;
						@Pc(382) int local382;
						@Pc(421) int local421;
						@Pc(425) int local425;
						if (local103.aShort81 < 0) {
							local134 = local29;
							local136 = local29;
							local150 = Static193.aClass291ArrayArrayArray2[local25][local93][local29 - 1];
							local158 = Static549.aClass18Array30[local25].method8537(local29, local93);
							while (local134 > 0 && local150 != null && local150.aShort81 < 0 && local103.aShort81 == local150.aShort81 && local103.aShort83 == local150.aShort83 && Static549.aClass18Array30[local25].method8537(local134 - 1, local93) == local158 && (local134 - 1 <= 0 || local158 == Static549.aClass18Array30[local25].method8537(local134 - 2, local93))) {
								local134--;
								local150 = Static193.aClass291ArrayArrayArray2[local25][local93][local134 - 1];
							}
							for (local150 = Static193.aClass291ArrayArrayArray2[local25][local93][local29 + 1]; local136 < Static202.anInt4238 && local150 != null && local150.aShort81 < 0 && local150.aShort81 == local103.aShort81 && local103.aShort83 == local150.aShort83 && Static549.aClass18Array30[local25].method8537(local136 + 1, local93) == local158 && (local136 + 1 >= Static202.anInt4238 || local158 == Static549.aClass18Array30[local25].method8537(local136 + 2, local93)); local150 = Static193.aClass291ArrayArrayArray2[local25][local93][local136 + 1]) {
								local136++;
							}
							local323 = local25 + 1 - local25;
							local337 = Static549.aClass18Array30[local126 ? local25 + 1 : local25].method8537(local134, local93);
							local344 = local323 * local103.aShort81 + local337;
							local360 = Static549.aClass18Array30[local126 ? local25 + 1 : local25].method8537(local136 + 1, local93);
							local368 = local360 + local323 * local103.aShort81;
							local372 = local93 << Static170.anInt3602;
							local376 = local134 << Static170.anInt3602;
							local382 = Static536.anInt4502 + (local136 << Static170.anInt3602);
							Static201.aClass348Array2[Static398.anInt7403++] = new Class348(1, local25, local372 + local103.aShort83, local372 + local103.aShort83, local103.aShort83 + local372, local372 - -local103.aShort83, local337, local360, local368, local344, local376, local382, local382, local376);
							for (local421 = local25; local421 <= local25; local421++) {
								for (local425 = local134; local425 <= local136; local425++) {
									Static193.aClass291ArrayArrayArray2[local421][local93][local425].aShort81 = (short) (Static193.aClass291ArrayArrayArray2[local421][local93][local425].aShort81 * -1);
								}
							}
						}
						if (local103.aShort82 < 0) {
							local134 = local93;
							local136 = local93;
							local150 = Static193.aClass291ArrayArrayArray2[local25][local93 - 1][local29];
							local158 = Static549.aClass18Array30[local25].method8537(local29, local93);
							while (local134 > 0 && local150 != null && local150.aShort82 < 0 && local103.aShort82 == local150.aShort82 && local103.aShort80 == local150.aShort80 && Static549.aClass18Array30[local25].method8537(local29, local134 - 1) == local158 && (local134 - 1 <= 0 || local158 == Static549.aClass18Array30[local25].method8537(local29, local134 - 2))) {
								local134--;
								local150 = Static193.aClass291ArrayArrayArray2[local25][local134 - 1][local29];
							}
							for (local150 = Static193.aClass291ArrayArrayArray2[local25][local93 + 1][local29]; Static585.anInt10170 > local136 && local150 != null && local150.aShort82 < 0 && local150.aShort82 == local103.aShort82 && local150.aShort80 == local103.aShort80 && Static549.aClass18Array30[local25].method8537(local29, local136 + 1) == local158 && (Static585.anInt10170 <= local136 + 1 || Static549.aClass18Array30[local25].method8537(local29, local136 + 2) == local158); local150 = Static193.aClass291ArrayArrayArray2[local25][local136 + 1][local29]) {
								local136++;
							}
							local323 = local25 + 1 - local25;
							local337 = Static549.aClass18Array30[local126 ? local25 + 1 : local25].method8537(local29, local134);
							local344 = local323 * local103.aShort82 + local337;
							local360 = Static549.aClass18Array30[local126 ? local25 + 1 : local25].method8537(local29, local136 + 1);
							local368 = local360 + local103.aShort82 * local323;
							local372 = local134 << Static170.anInt3602;
							local376 = (local136 << Static170.anInt3602) + Static536.anInt4502;
							local382 = local29 << Static170.anInt3602;
							Static201.aClass348Array2[Static398.anInt7403++] = new Class348(2, local25, local372, local376, local376, local372, local337, local360, local368, local344, local103.aShort80 + local382, local382 - -local103.aShort80, local103.aShort80 + local382, local382 + local103.aShort80);
							for (local421 = local25; local421 <= local25; local421++) {
								for (local425 = local134; local425 <= local136; local425++) {
									Static193.aClass291ArrayArrayArray2[local421][local425][local29].aShort82 = (short) (Static193.aClass291ArrayArrayArray2[local421][local425][local29].aShort82 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static533.aBoolean679 = true;
	}
}
