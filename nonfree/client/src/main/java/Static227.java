import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!of", name = "Rc", descriptor = "I")
	public static int anInt4557;

	@OriginalMember(owner = "client!of", name = "gd", descriptor = "I")
	public static int anInt4569 = -1;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "(I)V")
	public static void method4122() {
		Static322.aClass109_8.method2858();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
	public static void method4123() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (Static297.anInt5810 == 19) {
			local14 = Static187.aClass5_Sub12_Sub2_4.method5086();
			local22 = (local14 >> 4 & 0x7) + Static339.anInt6582;
			local28 = (local14 & 0x7) + Static286.anInt5623;
			local32 = Static187.aClass5_Sub12_Sub2_4.method5075();
			local36 = Static187.aClass5_Sub12_Sub2_4.method5113();
			if (local22 >= 0 && local28 >= 0 && local22 < Static22.anInt481 && local28 < Static269.anInt5281) {
				Static110.method1953(local28, new Class5_Sub27(local36, local32), Static239.anInt4811, local22);
				Static109.method1938(local28, Static239.anInt4811, local22);
			}
			return;
		}
		@Pc(106) int local106;
		if (Static297.anInt5810 == 199) {
			local14 = Static187.aClass5_Sub12_Sub2_4.method5075();
			local22 = Static187.aClass5_Sub12_Sub2_4.method5100();
			local28 = Static187.aClass5_Sub12_Sub2_4.method5113();
			local32 = Static187.aClass5_Sub12_Sub2_4.method5101();
			local36 = Static339.anInt6582 + (local32 >> 4 & 0x7);
			local106 = Static286.anInt5623 + (local32 & 0x7);
			if (local36 >= 0 && local106 >= 0 && Static22.anInt481 > local36 && Static269.anInt5281 > local106 && local14 != Static166.anInt3304) {
				Static110.method1953(local106, new Class5_Sub27(local28, local22), Static239.anInt4811, local36);
				Static109.method1938(local106, Static239.anInt4811, local36);
			}
		} else if (Static297.anInt5810 == 109) {
			local14 = Static187.aClass5_Sub12_Sub2_4.method5086();
			local22 = (local14 >> 4 & 0x7) + Static339.anInt6582;
			local28 = Static286.anInt5623 + (local14 & 0x7);
			local32 = Static187.aClass5_Sub12_Sub2_4.method5100();
			if (local22 >= 0 && local28 >= 0 && Static22.anInt481 > local22 && local28 < Static269.anInt5281) {
				@Pc(199) Class5_Sub29 local199 = (Class5_Sub29) Static343.aClass190_33.method5466((long) (local28 << 14 | Static239.anInt4811 << 28 | local22));
				if (local199 != null) {
					for (@Pc(207) Class5_Sub27 local207 = (Class5_Sub27) local199.aClass103_113.method2756(); local207 != null; local207 = (Class5_Sub27) local199.aClass103_113.method2748()) {
						if ((local32 & 0x7FFF) == local207.anInt4335) {
							local207.method6005();
							break;
						}
					}
					if (local199.aClass103_113.method2750()) {
						local199.method6005();
					}
					Static109.method1938(local28, Static239.anInt4811, local22);
				}
			}
		} else if (Static297.anInt5810 == 37) {
			local14 = Static187.aClass5_Sub12_Sub2_4.method5106();
			local22 = Static187.aClass5_Sub12_Sub2_4.method5115();
			Static111.method1967(local14).method4224(local22);
		} else {
			@Pc(303) int local303;
			if (Static297.anInt5810 == 127) {
				local14 = Static187.aClass5_Sub12_Sub2_4.method5101();
				local22 = local14 >> 2;
				local28 = local14 & 0x3;
				local32 = Static34.anIntArray71[local22];
				local36 = Static187.aClass5_Sub12_Sub2_4.method5101();
				local106 = Static339.anInt6582 + (local36 >> 4 & 0x7);
				local303 = Static286.anInt5623 + (local36 & 0x7);
				if (local106 >= 0 && local303 >= 0 && Static22.anInt481 > local106 && local303 < Static269.anInt5281) {
					Static131.method2331(local303, local32, Static239.anInt4811, local106, -1, 0, local28, -1, local22);
				}
			} else {
				@Pc(400) int local400;
				@Pc(404) int local404;
				@Pc(408) int local408;
				@Pc(416) int local416;
				@Pc(390) int local390;
				@Pc(394) int local394;
				@Pc(412) int local412;
				if (Static297.anInt5810 == 150) {
					local14 = Static187.aClass5_Sub12_Sub2_4.method5115();
					local22 = (local14 >> 4 & 0xF) + Static339.anInt6582 * 2;
					local28 = Static286.anInt5623 * 2 + (local14 & 0xF);
					local32 = Static187.aClass5_Sub12_Sub2_4.method5098() + local22;
					local36 = Static187.aClass5_Sub12_Sub2_4.method5098() + local28;
					local106 = Static187.aClass5_Sub12_Sub2_4.method5066();
					local303 = Static187.aClass5_Sub12_Sub2_4.method5066();
					local390 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local394 = Static187.aClass5_Sub12_Sub2_4.method5098();
					local400 = Static187.aClass5_Sub12_Sub2_4.method5115() * 4;
					local404 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local408 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local412 = Static187.aClass5_Sub12_Sub2_4.method5115();
					local416 = Static187.aClass5_Sub12_Sub2_4.method5115();
					if (local412 == 255) {
						local412 = -1;
					}
					if (local22 >= 0 && local28 >= 0 && Static22.anInt481 * 2 > local22 && Static22.anInt481 * 2 > local28 && local32 >= 0 && local36 >= 0 && Static269.anInt5281 * 2 > local32 && Static269.anInt5281 * 2 > local36 && local390 != 65535) {
						local36 = local36 * 64;
						local28 *= 64;
						local22 *= 64;
						local32 *= 64;
						if (local106 != 0) {
							@Pc(504) int local504;
							@Pc(508) Class4_Sub5_Sub2 local508;
							@Pc(494) int local494;
							@Pc(498) int local498;
							if (local106 >= 0) {
								local494 = local106 - 1;
								local498 = local494 & 0x7FF;
								local504 = local494 >> 11 & 0xF;
								local508 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local498];
							} else {
								local494 = -local106 - 1;
								local504 = local494 >> 11 & 0xF;
								local498 = local494 & 0x7FF;
								if (Static166.anInt3304 == local498) {
									local508 = Static192.aClass4_Sub5_Sub2_Sub1_2;
								} else {
									local508 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local498];
								}
							}
							if (local508 != null) {
								@Pc(542) Class88 local542 = local508.method4805();
								if (local542.anIntArrayArray41 != null && local542.anIntArrayArray41[local504] != null) {
									local498 = local542.anIntArrayArray41[local504][0];
									@Pc(564) int local564 = local542.anIntArrayArray41[local504][2];
									@Pc(569) int local569 = local508.aClass207_7.method5877();
									@Pc(573) int local573 = Class187.anIntArray571[local569];
									@Pc(577) int local577 = Class187.anIntArray570[local569];
									@Pc(588) int local588 = local573 * local564 + local577 * local498 >> 15;
									@Pc(598) int local598 = local564 * local577 - local498 * local573 >> 15;
									local394 -= local542.anIntArrayArray41[local504][1];
									local22 += local588;
									local28 += local598;
								}
							}
						}
						@Pc(643) Class4_Sub5_Sub3 local643 = new Class4_Sub5_Sub3(local390, Static239.anInt4811, local22, local28, Static208.method3804(Static239.anInt4811, local22, local28) - local394, local404 + Static283.anInt5563, local408 + Static283.anInt5563, local412, local416, local303, local400);
						local643.method4705(local36, local32, Static208.method3804(Static239.anInt4811, local32, local36) - local400, local404 - -Static283.anInt5563);
						Static114.aClass103_56.method2745(new Class5_Sub1_Sub7(local643));
					}
				} else if (Static297.anInt5810 == 190) {
					local14 = Static187.aClass5_Sub12_Sub2_4.method5115();
					local22 = (local14 >> 4 & 0x7) + Static339.anInt6582;
					local28 = Static286.anInt5623 + (local14 & 0x7);
					local32 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local36 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local106 = Static187.aClass5_Sub12_Sub2_4.method5106();
					if (Static343.aClass190_33 != null && local22 >= 0 && local28 >= 0 && local22 < Static22.anInt481 && local28 < Static269.anInt5281) {
						@Pc(738) Class5_Sub29 local738 = (Class5_Sub29) Static343.aClass190_33.method5466((long) (Static239.anInt4811 << 28 | local28 << 14 | local22));
						if (local738 != null) {
							for (@Pc(746) Class5_Sub27 local746 = (Class5_Sub27) local738.aClass103_113.method2756(); local746 != null; local746 = (Class5_Sub27) local738.aClass103_113.method2748()) {
								if (local746.anInt4335 == (local32 & 0x7FFF) && local746.anInt4334 == local36) {
									local746.method6005();
									local746.anInt4334 = local106;
									Static110.method1953(local28, local746, Static239.anInt4811, local22);
									break;
								}
							}
							Static109.method1938(local28, Static239.anInt4811, local22);
						}
					}
				} else if (Static297.anInt5810 == 191) {
					local14 = Static187.aClass5_Sub12_Sub2_4.method5115();
					local22 = (local14 >> 4 & 0x7) + Static339.anInt6582;
					local28 = (local14 & 0x7) + Static286.anInt5623;
					local32 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local36 = Static187.aClass5_Sub12_Sub2_4.method5115();
					local106 = Static187.aClass5_Sub12_Sub2_4.method5106();
					if (local22 >= 0 && local28 >= 0 && Static22.anInt481 > local22 && Static269.anInt5281 > local28) {
						local303 = local22 * 128 + 64;
						local390 = local28 * 128 + 64;
						@Pc(878) Class4_Sub5_Sub1 local878 = new Class4_Sub5_Sub1(local32, local106, Static283.anInt5563, Static239.anInt4811, local303, Static208.method3804(Static239.anInt4811, local303, local390) - local36, local390, local22, local22, local28, local28);
						Static85.aClass103_38.method2745(new Class5_Sub1_Sub20(local878));
					}
				} else if (Static297.anInt5810 == 240) {
					Static187.aClass5_Sub12_Sub2_4.method5115();
					local14 = Static187.aClass5_Sub12_Sub2_4.method5115();
					local22 = (local14 >> 4 & 0x7) + Static339.anInt6582;
					local28 = Static286.anInt5623 + (local14 & 0x7);
					local32 = Static187.aClass5_Sub12_Sub2_4.method5106();
					local36 = Static187.aClass5_Sub12_Sub2_4.method5115();
					local106 = Static187.aClass5_Sub12_Sub2_4.method5072();
					@Pc(927) String local927 = Static187.aClass5_Sub12_Sub2_4.method5064();
					Static331.method5731(local22, local28, local106, local927, local36, local32);
				} else {
					@Pc(1098) Class4_Sub5_Sub3 local1098;
					if (Static297.anInt5810 == 234) {
						local14 = Static187.aClass5_Sub12_Sub2_4.method5115();
						local22 = Static339.anInt6582 + (local14 >> 4 & 0x7);
						local28 = Static286.anInt5623 + (local14 & 0x7);
						local32 = Static187.aClass5_Sub12_Sub2_4.method5098() + local22;
						local36 = local28 + Static187.aClass5_Sub12_Sub2_4.method5098();
						local106 = Static187.aClass5_Sub12_Sub2_4.method5066();
						local303 = Static187.aClass5_Sub12_Sub2_4.method5106();
						local390 = Static187.aClass5_Sub12_Sub2_4.method5115() * 4;
						local394 = Static187.aClass5_Sub12_Sub2_4.method5115() * 4;
						local400 = Static187.aClass5_Sub12_Sub2_4.method5106();
						local404 = Static187.aClass5_Sub12_Sub2_4.method5106();
						local408 = Static187.aClass5_Sub12_Sub2_4.method5115();
						if (local408 == 255) {
							local408 = -1;
						}
						local412 = Static187.aClass5_Sub12_Sub2_4.method5115();
						if (local22 >= 0 && local28 >= 0 && Static22.anInt481 > local22 && local28 < Static269.anInt5281 && local32 >= 0 && local36 >= 0 && local32 < Static22.anInt481 && Static269.anInt5281 > local36 && local303 != 65535) {
							local32 = local32 * 128 + 64;
							local22 = local22 * 128 + 64;
							local36 = local36 * 128 + 64;
							local28 = local28 * 128 + 64;
							local1098 = new Class4_Sub5_Sub3(local303, Static239.anInt4811, local22, local28, Static208.method3804(Static239.anInt4811, local22, local28) - local390, Static283.anInt5563 + local400, local404 + Static283.anInt5563, local408, local412, local106, local394);
							local1098.method4705(local36, local32, Static208.method3804(Static239.anInt4811, local32, local36) - local394, Static283.anInt5563 + local400);
							Static114.aClass103_56.method2745(new Class5_Sub1_Sub7(local1098));
						}
					} else if (Static297.anInt5810 == 193) {
						local14 = Static187.aClass5_Sub12_Sub2_4.method5100();
						if (local14 == 65535) {
							local14 = -1;
						}
						local22 = Static187.aClass5_Sub12_Sub2_4.method5101();
						local28 = local22 >> 2;
						local32 = local22 & 0x3;
						local36 = Static34.anIntArray71[local28];
						local106 = Static187.aClass5_Sub12_Sub2_4.method5115();
						local303 = Static339.anInt6582 + (local106 >> 4 & 0x7);
						local390 = (local106 & 0x7) + Static286.anInt5623;
						Static194.method3446(local14, local32, local303, local36, Static239.anInt4811, local390, local28);
					} else if (Static297.anInt5810 == 122) {
						local14 = Static187.aClass5_Sub12_Sub2_4.method5115();
						local22 = Static339.anInt6582 + (local14 >> 4 & 0x7);
						local28 = (local14 & 0x7) + Static286.anInt5623;
						local32 = Static187.aClass5_Sub12_Sub2_4.method5106();
						if (local32 == 65535) {
							local32 = -1;
						}
						local36 = Static187.aClass5_Sub12_Sub2_4.method5115();
						local106 = local36 >> 4 & 0xF;
						local303 = local36 & 0x7;
						local390 = Static187.aClass5_Sub12_Sub2_4.method5115();
						local394 = Static187.aClass5_Sub12_Sub2_4.method5115();
						if (local22 >= 0 && local28 >= 0 && Static22.anInt481 > local22 && local28 < Static269.anInt5281) {
							local400 = local106 + 1;
							if (local22 - local400 <= Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] && Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] <= local22 + local400 && local28 - local400 <= Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0] && Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0] <= local28 + local400 && Static263.anInt5208 != 0 && local303 > 0 && Static139.anInt2692 < 50 && local32 != -1) {
								Static9.anIntArray41[Static139.anInt2692] = local32;
								Static350.anIntArray636[Static139.anInt2692] = local303;
								Static190.anIntArray57[Static139.anInt2692] = local390;
								Static270.aClass50Array1[Static139.anInt2692] = null;
								Static127.anIntArray243[Static139.anInt2692] = (local28 << 8) + ((local22 << 16) + local106);
								Static316.anIntArray443[Static139.anInt2692] = local394;
								Static139.anInt2692++;
							}
						}
					} else if (Static297.anInt5810 == 59) {
						local14 = Static187.aClass5_Sub12_Sub2_4.method5115();
						local22 = Static339.anInt6582 * 2 + (local14 >> 4 & 0xF);
						local28 = (local14 & 0xF) + Static286.anInt5623 * 2;
						local32 = Static187.aClass5_Sub12_Sub2_4.method5098() + local22;
						local36 = local28 + Static187.aClass5_Sub12_Sub2_4.method5098();
						local106 = Static187.aClass5_Sub12_Sub2_4.method5066();
						local303 = Static187.aClass5_Sub12_Sub2_4.method5106();
						local390 = Static187.aClass5_Sub12_Sub2_4.method5115() * 4;
						local394 = Static187.aClass5_Sub12_Sub2_4.method5115() * 4;
						local400 = Static187.aClass5_Sub12_Sub2_4.method5106();
						local404 = Static187.aClass5_Sub12_Sub2_4.method5106();
						local408 = Static187.aClass5_Sub12_Sub2_4.method5115();
						if (local408 == 255) {
							local408 = -1;
						}
						local412 = Static187.aClass5_Sub12_Sub2_4.method5115();
						if (local22 >= 0 && local28 >= 0 && Static22.anInt481 * 2 > local22 && Static22.anInt481 * 2 > local28 && local32 >= 0 && local36 >= 0 && Static269.anInt5281 * 2 > local32 && Static269.anInt5281 * 2 > local36 && local303 != 65535) {
							local32 *= 64;
							local28 = local28 * 64;
							local36 *= 64;
							local22 = local22 * 64;
							local1098 = new Class4_Sub5_Sub3(local303, Static239.anInt4811, local22, local28, Static208.method3804(Static239.anInt4811, local22, local28) - local390, local400 + Static283.anInt5563, local404 + Static283.anInt5563, local408, local412, local106, local394);
							local1098.method4705(local36, local32, Static208.method3804(Static239.anInt4811, local32, local36) - local394, local400 + Static283.anInt5563);
							Static114.aClass103_56.method2745(new Class5_Sub1_Sub7(local1098));
						}
					} else {
						if (Static297.anInt5810 == 252) {
							local14 = Static187.aClass5_Sub12_Sub2_4.method5075();
							local22 = Static187.aClass5_Sub12_Sub2_4.method5113();
							local28 = Static187.aClass5_Sub12_Sub2_4.method5100();
							local32 = Static187.aClass5_Sub12_Sub2_4.method5086();
							local36 = Static339.anInt6582 + (local32 >> 4 & 0x7);
							local106 = Static286.anInt5623 + (local32 & 0x7);
							@Pc(1590) byte local1590 = Static187.aClass5_Sub12_Sub2_4.method5104();
							@Pc(1594) byte local1594 = Static187.aClass5_Sub12_Sub2_4.method5055();
							@Pc(1598) byte local1598 = Static187.aClass5_Sub12_Sub2_4.method5061();
							local400 = Static187.aClass5_Sub12_Sub2_4.method5068();
							local404 = local400 >> 2;
							local408 = local400 & 0x3;
							@Pc(1614) byte local1614 = Static187.aClass5_Sub12_Sub2_4.method5061();
							local416 = Static187.aClass5_Sub12_Sub2_4.method5073();
							if (!Static236.aClass55_9.method5177()) {
								Static89.method1616(local36, local106, local1614, local28, local14, local22, local404, local1594, local1590, local416, local408, local1598);
							}
						}
						if (Static297.anInt5810 == 100) {
							local14 = Static187.aClass5_Sub12_Sub2_4.method5086();
							local22 = (local14 >> 4 & 0x7) + Static339.anInt6582;
							local28 = (local14 & 0x7) + Static286.anInt5623;
							local32 = Static187.aClass5_Sub12_Sub2_4.method5075();
							local36 = Static187.aClass5_Sub12_Sub2_4.method5068();
							local106 = local36 >> 2;
							local303 = local36 & 0x3;
							local390 = Static34.anIntArray71[local106];
							if (local22 >= 0 && local28 >= 0 && Static22.anInt481 > local22 && local28 < Static269.anInt5281) {
								Static131.method2331(local28, local390, Static239.anInt4811, local22, -1, 0, local303, local32, local106);
							}
						}
					}
				}
			}
		}
	}
}
