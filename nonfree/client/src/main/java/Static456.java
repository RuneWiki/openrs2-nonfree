import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
	public static int anInt7596;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
	public static int anInt7598;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "[I")
	public static final int[] anIntArray625 = new int[1];

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
	public static int anInt7597 = -2;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "Lclient!of;")
	public static final Class188 aClass188_59 = new Class188(200);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIIIBI)V")
	public static void method6188(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static175.aClass36ArrayArrayArray1 == null) {
			Static257.aClass75_8.method5996(arg4, arg2, -16777216, arg1, arg3);
		} else if (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >= 0 && Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 < Static234.anInt3949 * 128 && Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >= 0 && Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 < Static371.anInt6492 * 128) {
			Static383.anInt6623++;
			if (Static127.aClass11_Sub5_Sub2_Sub1_2 != null && Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 + 64 - Static127.aClass11_Sub5_Sub2_Sub1_2.method6215() * 64 >> 7 == Static249.anInt4279 && Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 - (Static127.aClass11_Sub5_Sub2_Sub1_2.method6215() - 1) * 64 >> 7 == Static331.anInt5943) {
				Static331.anInt5943 = -1;
				Static249.anInt4279 = -1;
				Static303.method3585();
			}
			Static131.method2101();
			if (!arg0) {
				Static380.method5243();
			}
			Static344.method4854();
			Static268.method3719(arg4, true, arg2, arg3, arg1);
			@Pc(112) int local112 = Static189.anInt3336;
			@Pc(114) int local114 = Static6.anInt109;
			@Pc(116) int local116 = Static85.anInt1428;
			@Pc(118) int local118 = Static311.anInt5618;
			@Pc(124) int local124;
			@Pc(165) int local165;
			if (Static25.anInt7273 == 1) {
				local124 = (int) Static234.aFloat30;
				if (local124 < Static415.anInt7125 >> 8) {
					local124 = Static415.anInt7125 >> 8;
				}
				if (Static333.aBooleanArray21[4] && Static386.anIntArray584[4] + 128 > local124) {
					local124 = Static386.anIntArray584[4] + 128;
				}
				local165 = Static289.anInt5181 + (int) Static37.aFloat9 & 0x3FFF;
				Static172.method2527(Static365.method3535(Static204.anInt3498, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622) - 50, Static184.anInt3246, Static82.anInt3899, (local124 >> 3) * 3 + 600 << 0, local124, local112, local165);
			} else if (Static25.anInt7273 == 4) {
				local124 = (int) Static234.aFloat30;
				if (Static415.anInt7125 >> 8 > local124) {
					local124 = Static415.anInt7125 >> 8;
				}
				if (Static333.aBooleanArray21[4] && Static386.anIntArray584[4] + 128 > local124) {
					local124 = Static386.anIntArray584[4] + 128;
				}
				local165 = (int) Static37.aFloat9 & 0x3FFF;
				Static172.method2527(Static365.method3535(Static204.anInt3498, Static188.anInt6693, Static235.anInt3979) - 50, Static184.anInt3246, Static82.anInt3899, (local124 >> 3) * 3 + 600 << 0, local124, local112, local165);
			} else if (Static25.anInt7273 == 5) {
				Static327.method4672(local112);
			}
			local124 = Static263.anInt4619;
			local165 = Static260.anInt4601;
			@Pc(281) int local281 = Static120.anInt2052;
			@Pc(283) int local283 = Static213.anInt3662;
			@Pc(285) int local285 = Static144.anInt2665;
			@Pc(328) int local328;
			for (@Pc(287) int local287 = 0; local287 < 5; local287++) {
				if (Static333.aBooleanArray21[local287]) {
					local328 = (int) ((double) (Static50.anIntArray64[local287] * 2 + 1) * Math.random() - (double) Static50.anIntArray64[local287] + Math.sin((double) Static304.anIntArray466[local287] / 100.0D * (double) Static257.anIntArray393[local287]) * (double) Static386.anIntArray584[local287]);
					if (local287 == 2) {
						Static120.anInt2052 += local328;
					}
					if (local287 == 4) {
						Static213.anInt3662 += local328;
						if (Static213.anInt3662 < 1024) {
							Static213.anInt3662 = 1024;
						} else if (Static213.anInt3662 > 3072) {
							Static213.anInt3662 = 3072;
						}
					}
					if (local287 == 0) {
						Static263.anInt4619 += local328;
					}
					if (local287 == 3) {
						Static144.anInt2665 = local328 + Static144.anInt2665 & 0x3FFF;
					}
					if (local287 == 1) {
						Static260.anInt4601 += local328;
					}
				}
			}
			if (Static263.anInt4619 < 0) {
				Static263.anInt4619 = 0;
			}
			if (Static120.anInt2052 < 0) {
				Static120.anInt2052 = 0;
			}
			if (Static263.anInt4619 > (Static212.anInt3636 << 7) - 1) {
				Static263.anInt4619 = (Static212.anInt3636 << 7) - 1;
			}
			if (Static120.anInt2052 > (Static104.anInt1675 << 7) - 1) {
				Static120.anInt2052 = (Static104.anInt1675 << 7) - 1;
			}
			Static351.method4944();
			Static104.method1545();
			Static257.aClass75_8.ba(local116, local118, local116 + local114, local118 + local112);
			Static257.aClass75_8.method5963();
			local328 = Static79.anInt1288;
			if (Static454.aClass247_1 == null) {
				Static257.aClass75_8.t(local328);
			} else {
				Static454.aClass247_1.method5668(Static213.anInt3662, Static144.anInt2665, local112, local114, local328, Static149.anInt7394 << 3, local118, Static257.aClass75_8, local116);
			}
			Static230.method3117();
			Static186.aClass6_2.YA(Static263.anInt4619, Static260.anInt4601, Static120.anInt2052, -Static213.anInt3662 & 0x3FFF, -Static144.anInt2665 & 0x3FFF, -Static68.anInt1160 & 0x3FFF);
			Static257.aClass75_8.SA(Static186.aClass6_2);
			Static257.aClass75_8.GA(local114 / 2 + local116, local118 - -(local112 / 2), Static284.anInt5115 << 1, Static284.anInt5115 << 1);
			Static138.method2164(Static284.anInt5115 << 1, Static284.anInt5115 << 1, local118 + local112 / 2, local116 - -(local114 / 2));
			Static318.method4520(Static263.anInt4619, -Static68.anInt1160 & 0x3FFF, -Static213.anInt3662 & 0x3FFF, -Static144.anInt2665 & 0x3FFF, Static260.anInt4601, Static120.anInt2052);
			@Pc(565) byte local565 = Static434.aClass165_Sub1_1.method3398(Static404.anInt2752) == 2 ? (byte) Static383.anInt6623 : 1;
			Static234.method3191(Static257.aClass75_8, Static277.anInt5022, Static7.anInt112, Static186.aClass6_2, Static263.anInt4619, Static260.anInt4601, Static120.anInt2052, Static419.aByteArrayArrayArray17, Static202.anIntArray290, Static197.anIntArray283, Static318.anIntArray479, Static102.anIntArray109, Static285.anIntArray428, Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 + 1, local565, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7, !Static434.aClass165_Sub1_1.aBoolean292);
			Static230.method3117();
			if (Static433.anInt7309 == 9) {
				Static180.method2619(local116, local118, local114, local112);
				Static219.method3060(local112, local114, local116, local118);
				Static143.method2208(local118, local116, local112, local114);
				Static215.method3032(local114, local112, local118, local116);
			}
			Static322.method4569();
			Static263.anInt4619 = local124;
			Static260.anInt4601 = local165;
			Static144.anInt2665 = local285;
			Static120.anInt2052 = local281;
			Static213.anInt3662 = local283;
			if (Static39.aBoolean28 && Static29.aClass249_1.method5702() == 0) {
				Static39.aBoolean28 = false;
			}
			if (Static39.aBoolean28) {
				Static257.aClass75_8.method5996(local112, local118, -16777216, local116, local114);
				Static1.method26(false, Static420.aClass231_118.method5261(Static80.anInt6195), Static11.aClass14_1);
			}
		} else {
			Static257.aClass75_8.method5996(arg4, arg2, -16777216, arg1, arg3);
		}
	}
}
