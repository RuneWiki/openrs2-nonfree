import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!mv", name = "D", descriptor = "Lclient!ml;")
	public static Class156 aClass156_4;

	@OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
	public static int anInt4686;

	@OriginalMember(owner = "client!mv", name = "E", descriptor = "Lclient!bu;")
	public static final Class30 aClass30_8 = new Class30("WTRC", 1);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZZIII)V")
	public static void method3687(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static359.aClass169ArrayArrayArray5 == null) {
			Static185.aClass34_7.method5729(arg3, arg2, arg4, -16777216, arg0);
		} else if (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >= 0 && Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 < Static296.anInt5187 * 128 && Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >= 0 && Static206.anInt3607 * 128 > Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514) {
			Static49.anInt840++;
			if (Static447.aClass25_Sub5_Sub1_Sub2_4 != null && Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 - (Static447.aClass25_Sub5_Sub1_Sub2_4.method3427() - 1) * 64 >> 7 == Static11.anInt185 && Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 - (Static447.aClass25_Sub5_Sub1_Sub2_4.method3427() - 1) * 64 >> 7 == Static232.anInt4096) {
				Static232.anInt4096 = -1;
				Static11.anInt185 = -1;
				Static102.method1561();
			}
			Static297.method4605();
			if (!arg1) {
				Static423.method5063();
			}
			Static119.method1899();
			Static148.method2216(arg4, true, arg3, arg2, arg0);
			@Pc(118) int local118 = Static293.anInt5132;
			@Pc(120) int local120 = Static348.anInt5969;
			@Pc(122) int local122 = Static321.anInt5490;
			@Pc(124) int local124 = Static312.anInt5417;
			@Pc(130) int local130;
			@Pc(167) int local167;
			if (Static333.anInt5693 == 1) {
				local130 = (int) Static262.aFloat62;
				if (Static330.anInt5626 >> 8 > local130) {
					local130 = Static330.anInt5626 >> 8;
				}
				if (Static34.aBooleanArray2[4] && local130 < Static244.anIntArray292[4] + 128) {
					local130 = Static244.anIntArray292[4] + 128;
				}
				local167 = (int) Static98.aFloat20 + Static368.anInt6211 & 0x3FFF;
				Static80.method1317(local130, Static140.anInt2485, Static335.method4499(Static265.anInt4807, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514) - 50, local167, local124, Static52.anInt896, (local130 >> 3) * 3 + 600 << 0);
			} else if (Static333.anInt5693 == 4) {
				local130 = (int) Static262.aFloat62;
				if (Static330.anInt5626 >> 8 > local130) {
					local130 = Static330.anInt5626 >> 8;
				}
				if (Static34.aBooleanArray2[4] && Static244.anIntArray292[4] + 128 > local130) {
					local130 = Static244.anIntArray292[4] + 128;
				}
				local167 = (int) Static98.aFloat20 & 0x3FFF;
				Static80.method1317(local130, Static140.anInt2485, Static335.method4499(Static265.anInt4807, Static436.anInt7317, Static378.anInt2804) - 50, local167, local124, Static52.anInt896, (local130 >> 3) * 3 + 600 << 0);
			} else if (Static333.anInt5693 == 5) {
				Static413.method5324(local124);
			}
			local130 = Static213.anInt258;
			local167 = Static391.anInt6529;
			@Pc(279) int local279 = Static360.anInt6145;
			@Pc(281) int local281 = Static340.anInt5790;
			@Pc(283) int local283 = Static106.anInt2033;
			@Pc(326) int local326;
			for (@Pc(285) int local285 = 0; local285 < 5; local285++) {
				if (Static34.aBooleanArray2[local285]) {
					local326 = (int) (Math.random() * (double) (Static344.anIntArray403[local285] * 2 + 1) - (double) Static344.anIntArray403[local285] + Math.sin((double) Static3.anIntArray399[local285] * ((double) Static323.anIntArray373[local285] / 100.0D)) * (double) Static244.anIntArray292[local285]);
					if (local285 == 4) {
						Static340.anInt5790 += local326;
						if (Static340.anInt5790 < 1024) {
							Static340.anInt5790 = 1024;
						} else if (Static340.anInt5790 > 3072) {
							Static340.anInt5790 = 3072;
						}
					}
					if (local285 == 0) {
						Static213.anInt258 += local326;
					}
					if (local285 == 1) {
						Static391.anInt6529 += local326;
					}
					if (local285 == 3) {
						Static106.anInt2033 = Static106.anInt2033 + local326 & 0x3FFF;
					}
					if (local285 == 2) {
						Static360.anInt6145 += local326;
					}
				}
			}
			if (Static213.anInt258 < 0) {
				Static213.anInt258 = 0;
			}
			if (Static213.anInt258 > (Static37.anInt666 << 7) - 1) {
				Static213.anInt258 = (Static37.anInt666 << 7) - 1;
			}
			if (Static360.anInt6145 < 0) {
				Static360.anInt6145 = 0;
			}
			if (Static360.anInt6145 > (Static408.anInt6716 << 7) - 1) {
				Static360.anInt6145 = (Static408.anInt6716 << 7) - 1;
			}
			Static182.method2650();
			Static1.method9();
			Static185.aClass34_7.ba(local120, local122, local118 + local120, local124 + local122);
			Static185.aClass34_7.method5788();
			local326 = Static459.anInt7336;
			if (Static187.aClass5_1 == null) {
				Static185.aClass34_7.t(local326);
			} else {
				Static187.aClass5_1.method56(local122, Static340.anInt5790, Static360.anInt6139 << 3, Static106.anInt2033, Static185.aClass34_7, local118, local124, local326, local120);
			}
			Static111.method1777();
			Static148.aClass32_6.YA(Static213.anInt258, Static391.anInt6529, Static360.anInt6145, -Static340.anInt5790 & 0x3FFF, -Static106.anInt2033 & 0x3FFF, -Static73.anInt1361 & 0x3FFF);
			Static185.aClass34_7.SA(Static148.aClass32_6);
			Static185.aClass34_7.GA(local120 + local118 / 2, local124 / 2 + local122, Static200.anInt3486 << 1, Static200.anInt3486 << 1);
			Static239.method4558(local118 / 2 + local120, Static200.anInt3486 << 1, local124 / 2 + local122, Static200.anInt3486 << 1);
			Static427.method5659(Static360.anInt6145, Static213.anInt258, Static391.anInt6529, -Static73.anInt1361 & 0x3FFF, -Static340.anInt5790 & 0x3FFF, -Static106.anInt2033 & 0x3FFF);
			@Pc(553) byte local553 = Static453.aClass136_Sub1_1.method3520(Static14.anInt293) == 2 ? (byte) Static49.anInt840 : 1;
			Static153.method2253(Static185.aClass34_7, Static236.anInt4213, Static126.anInt2335, Static148.aClass32_6, Static213.anInt258, Static391.anInt6529, Static360.anInt6145, Static41.aByteArrayArrayArray4, Static416.anIntArray463, Static318.anIntArray225, Static338.anIntArray396, Static437.anIntArray494, Static447.anIntArray280, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 + 1, local553, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7, !Static453.aClass136_Sub1_1.aBoolean500);
			Static111.method1777();
			if (Static312.anInt5414 == 9) {
				Static243.method3504(local118, local124, local122, local120);
				Static45.method4309(local122, local124, local120, local118);
				Static43.method594(local124, local118, local122, local120);
				Static89.method1425(local120, local124, local122, local118);
			}
			Static348.method4711();
			Static106.anInt2033 = local283;
			Static340.anInt5790 = local281;
			Static213.anInt258 = local130;
			Static391.anInt6529 = local167;
			Static360.anInt6145 = local279;
			if (Static400.aBoolean732 && Static32.aClass224_1.method4926() == 0) {
				Static400.aBoolean732 = false;
			}
			if (Static400.aBoolean732) {
				Static185.aClass34_7.method5729(local118, local120, local124, -16777216, local122);
				Static163.method4683(false, Static437.aClass76_4, Static277.aClass119_130.method2673(Static394.anInt6582));
			}
		} else {
			Static185.aClass34_7.method5729(arg3, arg2, arg4, -16777216, arg0);
		}
	}
}
