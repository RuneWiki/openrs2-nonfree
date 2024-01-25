import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "Lclient!rq;")
	public static Class295 aClass295_1;

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
	public static int anInt3735;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_55 = new Class173(15, -1);

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
	public static int anInt3736 = 0;

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_25 = new Class244();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIZII)V")
	public static void method3334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 ? Static214.aClass4_Sub19_Sub1_1.anInt3077 : Static214.aClass4_Sub19_Sub1_1.anInt3064) != 0 && arg5 != 0 && Static459.anInt8551 < 50 && arg2 != -1) {
			Static104.aClass281Array1[Static459.anInt8551++] = new Class281((byte) (arg3 ? 3 : 2), arg2, arg5, arg1, arg0, 0, arg4, null);
		}
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)V")
	public static void method3335() {
		for (@Pc(3) int local3 = 0; local3 < Static180.anInt3623; local3++) {
			Static485.aClass314Array4[local3] = null;
		}
		Static180.anInt3623 = 0;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static345.anInt6662; local21++) {
			for (@Pc(25) int local25 = 0; local25 < Static182.anInt3633; local25++) {
				for (local29 = 0; local29 < Static253.anInt4651; local29++) {
					@Pc(39) Class53 local39 = Static60.aClass53ArrayArrayArray1[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort16 > 0) {
							local39.aShort16 = (short) (local39.aShort16 * -1);
						}
						if (local39.aShort14 > 0) {
							local39.aShort14 = (short) (local39.aShort14 * -1);
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < Static345.anInt6662; local29++) {
			for (@Pc(98) int local98 = 0; local98 < Static182.anInt3633; local98++) {
				for (@Pc(102) int local102 = 0; local102 < Static253.anInt4651; local102++) {
					@Pc(112) Class53 local112 = Static60.aClass53ArrayArrayArray1[local29][local102][local98];
					if (local112 != null) {
						@Pc(135) boolean local135 = Static60.aClass53ArrayArrayArray1[0][local102][local98] != null && Static60.aClass53ArrayArrayArray1[0][local102][local98].aClass53_1 != null;
						@Pc(143) int local143;
						@Pc(145) int local145;
						@Pc(147) int local147;
						@Pc(149) int local149;
						@Pc(159) Class53 local159;
						@Pc(167) int local167;
						@Pc(321) int local321;
						@Pc(458) int local458;
						@Pc(466) int local466;
						@Pc(482) int local482;
						@Pc(489) int local489;
						@Pc(493) int local493;
						@Pc(497) int local497;
						@Pc(503) int local503;
						@Pc(542) int local542;
						@Pc(546) int local546;
						if (local112.aShort16 < 0) {
							local143 = local98;
							local145 = local98;
							local147 = local29;
							local149 = local29;
							local159 = Static60.aClass53ArrayArrayArray1[local29][local102][local98 - 1];
							local167 = Static444.aClass83Array7[local29].method7217(local98, local102);
							while (local143 > 0 && local159 != null && local159.aShort16 < 0 && local112.aShort16 == local159.aShort16 && local112.aShort13 == local159.aShort13 && Static444.aClass83Array7[local29].method7217(local143 - 1, local102) == local167 && (local143 - 1 <= 0 || Static444.aClass83Array7[local29].method7217(local143 - 2, local102) == local167)) {
								local143--;
								local159 = Static60.aClass53ArrayArrayArray1[local29][local102][local143 - 1];
							}
							for (local159 = Static60.aClass53ArrayArrayArray1[local29][local102][local98 + 1]; Static253.anInt4651 > local145 && local159 != null && local159.aShort16 < 0 && local159.aShort16 == local112.aShort16 && local159.aShort13 == local112.aShort13 && local167 == Static444.aClass83Array7[local29].method7217(local145 + 1, local102) && (Static253.anInt4651 <= local145 + 1 || Static444.aClass83Array7[local29].method7217(local145 + 2, local102) == local167); local159 = Static60.aClass53ArrayArrayArray1[local29][local102][local145 + 1]) {
								local145++;
							}
							label289: while (local147 > 0) {
								for (local321 = local143; local321 <= local145; local321++) {
									if (Static60.aClass53ArrayArrayArray1[local147 - 1][local102][local321] == null || local112.aShort16 != Static60.aClass53ArrayArrayArray1[local147 - 1][local102][local321].aShort16 || Static60.aClass53ArrayArrayArray1[local147 - 1][local102][local321].aShort13 != local112.aShort13) {
										break label289;
									}
								}
								local147--;
							}
							label306: while (Static345.anInt6662 - 1 > local149) {
								for (local321 = local143; local321 <= local145; local321++) {
									if (Static60.aClass53ArrayArrayArray1[local149 + 1][local102][local321] == null || Static60.aClass53ArrayArrayArray1[local149 + 1][local102][local321].aShort16 != local112.aShort16 || Static60.aClass53ArrayArrayArray1[local149 + 1][local102][local321].aShort13 != local112.aShort13) {
										break label306;
									}
								}
								local149++;
							}
							local321 = local149 + 1 - local147;
							local458 = Static444.aClass83Array7[local135 ? local147 + 1 : local147].method7217(local143, local102);
							local466 = local458 + local112.aShort16 * local321;
							local482 = Static444.aClass83Array7[local135 ? local147 + 1 : local147].method7217(local145 + 1, local102);
							local489 = local112.aShort16 * local321 + local482;
							local493 = local102 << Static145.anInt3093;
							local497 = local143 << Static145.anInt3093;
							local503 = Static279.anInt5708 + (local145 << Static145.anInt3093);
							Static485.aClass314Array4[Static180.anInt3623++] = new Class314(1, local149, local493 + local112.aShort13, local493 + local112.aShort13, local493 + local112.aShort13, local493 + local112.aShort13, local458, local482, local489, local466, local497, local503, local503, local497);
							for (local542 = local147; local542 <= local149; local542++) {
								for (local546 = local143; local546 <= local145; local546++) {
									Static60.aClass53ArrayArrayArray1[local542][local102][local546].aShort16 = (short) (Static60.aClass53ArrayArrayArray1[local542][local102][local546].aShort16 * -1);
								}
							}
						}
						if (local112.aShort14 < 0) {
							local143 = local102;
							local145 = local102;
							local147 = local29;
							local149 = local29;
							local159 = Static60.aClass53ArrayArrayArray1[local29][local102 - 1][local98];
							local167 = Static444.aClass83Array7[local29].method7217(local98, local102);
							while (local143 > 0 && local159 != null && local159.aShort14 < 0 && local159.aShort14 == local112.aShort14 && local112.aShort15 == local159.aShort15 && local167 == Static444.aClass83Array7[local29].method7217(local98, local143 - 1) && (local143 - 1 <= 0 || Static444.aClass83Array7[local29].method7217(local98, local143 - 2) == local167)) {
								local143--;
								local159 = Static60.aClass53ArrayArrayArray1[local29][local143 - 1][local98];
							}
							for (local159 = Static60.aClass53ArrayArrayArray1[local29][local102 + 1][local98]; local145 < Static182.anInt3633 && local159 != null && local159.aShort14 < 0 && local112.aShort14 == local159.aShort14 && local112.aShort15 == local159.aShort15 && local167 == Static444.aClass83Array7[local29].method7217(local98, local145 + 1) && (local145 + 1 >= Static182.anInt3633 || Static444.aClass83Array7[local29].method7217(local98, local145 + 2) == local167); local159 = Static60.aClass53ArrayArrayArray1[local29][local145 + 1][local98]) {
								local145++;
							}
							label205: while (local147 > 0) {
								for (local321 = local143; local321 <= local145; local321++) {
									if (Static60.aClass53ArrayArrayArray1[local147 - 1][local321][local98] == null || Static60.aClass53ArrayArrayArray1[local147 - 1][local321][local98].aShort14 != local112.aShort14 || local112.aShort15 != Static60.aClass53ArrayArrayArray1[local147 - 1][local321][local98].aShort15) {
										break label205;
									}
								}
								local147--;
							}
							label190: while (Static345.anInt6662 - 1 > local149) {
								for (local321 = local143; local321 <= local145; local321++) {
									if (Static60.aClass53ArrayArrayArray1[local149 + 1][local321][local98] == null || Static60.aClass53ArrayArrayArray1[local149 + 1][local321][local98].aShort14 != local112.aShort14 || local112.aShort15 != Static60.aClass53ArrayArrayArray1[local149 + 1][local321][local98].aShort15) {
										break label190;
									}
								}
								local149++;
							}
							local321 = local149 + 1 - local147;
							local458 = Static444.aClass83Array7[local135 ? local147 + 1 : local147].method7217(local98, local143);
							local466 = local112.aShort14 * local321 + local458;
							local482 = Static444.aClass83Array7[local135 ? local147 + 1 : local147].method7217(local98, local145 + 1);
							local489 = local112.aShort14 * local321 + local482;
							local493 = local143 << Static145.anInt3093;
							local497 = Static279.anInt5708 + (local145 << Static145.anInt3093);
							local503 = local98 << Static145.anInt3093;
							Static485.aClass314Array4[Static180.anInt3623++] = new Class314(2, local149, local493, local497, local497, local493, local458, local482, local489, local466, local503 + local112.aShort15, local112.aShort15 + local503, local112.aShort15 + local503, local112.aShort15 + local503);
							for (local542 = local147; local542 <= local149; local542++) {
								for (local546 = local143; local546 <= local145; local546++) {
									Static60.aClass53ArrayArrayArray1[local542][local546][local98].aShort14 = (short) (Static60.aClass53ArrayArrayArray1[local542][local546][local98].aShort14 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static402.aBoolean525 = true;
	}
}
