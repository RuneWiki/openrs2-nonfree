import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Z")
	public static boolean aBoolean29;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
	public static final int[] anIntArray33 = new int[14];

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
	public static final int[] anIntArray34 = new int[8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIIIII)V")
	public static void method336(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static30.aClass189ArrayArrayArray2 == null) {
			Static44.aClass28_14.method3531(arg3, -16777216, arg2, arg1, arg4);
		} else if (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >= 0 && Static84.anInt1632 * 128 > Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 && Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >= 0 && Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 < Static261.anInt4480 * 128) {
			Static75.anInt1503++;
			if (Static134.aClass3_Sub3_Sub6_Sub1_1 != null && Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 - (Static134.aClass3_Sub3_Sub6_Sub1_1.method5512() - 1) * 64 >> 7 == Static278.anInt4731 && Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 + 64 - Static134.aClass3_Sub3_Sub6_Sub1_1.method5512() * 64 >> 7 == Static58.anInt1221) {
				Static278.anInt4731 = -1;
				Static58.anInt1221 = -1;
				Static190.method2937();
			}
			Static4.method26();
			if (!arg0) {
				Static238.method3715();
			}
			Static221.method3400();
			Static216.method3343(true, arg4, arg2, arg3, arg1);
			@Pc(128) int local128 = Static6.anInt86;
			@Pc(130) int local130 = Static19.anInt324;
			@Pc(132) int local132 = Static62.anInt1308;
			@Pc(134) int local134 = Static145.anInt2640;
			@Pc(142) int local142;
			@Pc(179) int local179;
			if (Static9.anInt164 == 1) {
				local142 = (int) Static367.aFloat104;
				if (Static249.anInt4245 >> 8 > local142) {
					local142 = Static249.anInt4245 >> 8;
				}
				if (Static186.aBooleanArray16[4] && local142 < Static428.anIntArray615[4] + 128) {
					local142 = Static428.anIntArray615[4] + 128;
				}
				local179 = (int) Static397.aFloat99 + Static59.anInt1235 & 0x3FFF;
				Static369.method5140(Static165.method2689(Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675, Static4.anInt30, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677) - 50, Static153.anInt2718, Static237.anInt4066, local179, local130, local142, (local142 >> 3) * 3 + 600 << 0);
			} else if (Static9.anInt164 == 4) {
				local142 = (int) Static367.aFloat104;
				if (Static249.anInt4245 >> 8 > local142) {
					local142 = Static249.anInt4245 >> 8;
				}
				if (Static186.aBooleanArray16[4] && Static428.anIntArray615[4] + 128 > local142) {
					local142 = Static428.anIntArray615[4] + 128;
				}
				local179 = (int) Static397.aFloat99 & 0x3FFF;
				Static369.method5140(Static165.method2689(Static375.anInt6234, Static4.anInt30, Static45.anInt923) - 50, Static153.anInt2718, Static237.anInt4066, local179, local130, local142, (local142 >> 3) * 3 + 600 << 0);
			} else if (Static9.anInt164 == 5) {
				Static451.method5218(local130);
			}
			local142 = Static32.anInt521;
			local179 = Static354.anInt5973;
			@Pc(287) int local287 = Static214.anInt3730;
			@Pc(289) int local289 = Static303.anInt4990;
			@Pc(291) int local291 = Static217.anInt3768;
			@Pc(334) int local334;
			for (@Pc(293) int local293 = 0; local293 < 5; local293++) {
				if (Static186.aBooleanArray16[local293]) {
					local334 = (int) (Math.random() * (double) (Static275.anIntArray412[local293] * 2 + 1) - (double) Static275.anIntArray412[local293] + Math.sin((double) Static260.anIntArray398[local293] * ((double) Static408.anIntArray589[local293] / 100.0D)) * (double) Static428.anIntArray615[local293]);
					if (local293 == 3) {
						Static217.anInt3768 = local334 + Static217.anInt3768 & 0x3FFF;
					}
					if (local293 == 1) {
						Static354.anInt5973 += local334;
					}
					if (local293 == 0) {
						Static32.anInt521 += local334;
					}
					if (local293 == 4) {
						Static303.anInt4990 += local334;
						if (Static303.anInt4990 < 1024) {
							Static303.anInt4990 = 1024;
						} else if (Static303.anInt4990 > 3072) {
							Static303.anInt4990 = 3072;
						}
					}
					if (local293 == 2) {
						Static214.anInt3730 += local334;
					}
				}
			}
			if (Static32.anInt521 < 0) {
				Static32.anInt521 = 0;
			}
			if (Static32.anInt521 > (Static401.anInt6621 << 7) - 1) {
				Static32.anInt521 = (Static401.anInt6621 << 7) - 1;
			}
			if (Static214.anInt3730 < 0) {
				Static214.anInt3730 = 0;
			}
			if ((Static364.anInt6134 << 7) - 1 < Static214.anInt3730) {
				Static214.anInt3730 = (Static364.anInt6134 << 7) - 1;
			}
			Static444.method5632();
			Static312.method4468();
			Static44.aClass28_14.method3570(local132, local128, local132 + local134, local128 + local130);
			Static44.aClass28_14.method3552();
			local334 = Static118.anInt2067;
			if (Static243.aClass46_1 == null) {
				Static44.aClass28_14.method3553(local334);
			} else {
				Static243.aClass46_1.method1239(Static217.anInt3768, local334, Static44.aClass28_14, local132, Static262.anInt4486 << 3, local128, local134, local130, Static303.anInt4990);
			}
			Static88.method1553();
			Static318.aClass132_3.method3981(Static32.anInt521, Static354.anInt5973, Static214.anInt3730, -Static303.anInt4990 & 0x3FFF, -Static217.anInt3768 & 0x3FFF, -Static189.anInt6581 & 0x3FFF);
			Static44.aClass28_14.method3509(Static318.aClass132_3);
			Static44.aClass28_14.method3519(local134 / 2 + local132, local128 + local130 / 2, Static261.anInt4479 << 1, Static261.anInt4479 << 1);
			Static420.method5695(local130 / 2 + local128, Static261.anInt4479 << 1, local134 / 2 + local132, Static261.anInt4479 << 1);
			Static213.method3303(Static354.anInt5973, -Static217.anInt3768 & 0x3FFF, Static32.anInt521, -Static189.anInt6581 & 0x3FFF, -Static303.anInt4990 & 0x3FFF, Static214.anInt3730);
			@Pc(567) byte local567 = Static8.aClass173_Sub1_1.method3974(Static155.anInt2774) == 2 ? (byte) Static75.anInt1503 : 1;
			Static355.method5003(Static44.aClass28_14, Static125.anInt2225, Static373.anInt1818, Static318.aClass132_3, Static32.anInt521, Static354.anInt5973, Static214.anInt3730, Static193.aByteArrayArrayArray4, Static23.anIntArray32, Static97.anIntArray189, Static10.anIntArray567, Static243.anIntArray371, Static375.anIntArray546, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 + 1, local567, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7, !Static8.aClass173_Sub1_1.aBoolean314);
			Static88.method1553();
			if (Static54.anInt1123 == 30) {
				Static114.method1872(local134, local128, local130, local132);
				Static345.method4850(local132, local128, local130, local134);
				Static219.method3378(local134, local128, local132, local130);
				Static429.method5845(local128, local134, local130, local132);
			}
			Static412.method5597();
			Static32.anInt521 = local142;
			Static217.anInt3768 = local291;
			Static214.anInt3730 = local287;
			Static303.anInt4990 = local289;
			Static354.anInt5973 = local179;
			if (Static153.aBoolean196 && Static376.aClass179_3.method4129() == 0) {
				Static153.aBoolean196 = false;
			}
			if (Static153.aBoolean196) {
				Static44.aClass28_14.method3531(local132, -16777216, local128, local130, local134);
				Static94.method1630(false, Static60.aClass92_2, Static306.aClass231_61.method5138(Static382.anInt6289));
			}
		} else {
			Static44.aClass28_14.method3531(arg3, -16777216, arg2, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public static void method338(@OriginalArg(1) int arg0) {
		Static179.anInt3119 = arg0;
		Static153.aClass220_18.method4999();
	}
}
