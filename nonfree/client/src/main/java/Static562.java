import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!vi", name = "U", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_17 = new Class187(10, 17);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!kj;I)V")
	public static void method7489(@OriginalArg(0) Class187 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (arg0 == Static373.aClass187_14) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static237.anIntArray361[local16];
			local28 = Static187.aClass3_Sub11_Sub1_1.method3120();
			local36 = (local28 >> 4 & 0x7) + Static566.anInt9120;
			local42 = (local28 & 0x7) + Static412.anInt6934;
			if (Static29.method541(Static282.anInt5183) || local36 >= 0 && local42 >= 0 && Static400.anInt6818 > local36 && Static271.anInt5050 > local42) {
				Static352.method4079(local42, local36, Static281.anInt5123, -1, local24, local16, local20);
			}
			return;
		}
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(142) int local142;
		if (Static83.aClass187_4 == arg0) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local16 = Static566.anInt9120 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static412.anInt6934;
			local24 = Static187.aClass3_Sub11_Sub1_1.method3109();
			local28 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local36 = Static187.aClass3_Sub11_Sub1_1.method3109();
			local42 = Static187.aClass3_Sub11_Sub1_1.method3118();
			if (local16 >= 0 && local20 >= 0 && local16 < Static400.anInt6818 && Static271.anInt5050 > local20) {
				local134 = local16 * 512 + 256;
				local140 = local20 * 512 + 256;
				local142 = Static281.anInt5123;
				if (local142 < 3 && Static425.method6053(local16, local20)) {
					local142++;
				}
				@Pc(175) Class9_Sub1_Sub1_Sub4 local175 = new Class9_Sub1_Sub1_Sub4(local24, local36, Static305.anInt5560, Static281.anInt5123, local142, local134, Static130.method2562(local140, Static281.anInt5123, local134) - local28, local140, local16, local16, local20, local20, local42);
				Static131.aClass130_11.method3548(new Class3_Sub3_Sub19(local175));
			}
		} else if (Static363.aClass187_13 == arg0) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3110();
			local16 = Static566.anInt9120 + (local12 >> 4 & 0x7);
			local20 = Static412.anInt6934 + (local12 & 0x7);
			local24 = Static187.aClass3_Sub11_Sub1_1.method3139();
			local28 = Static187.aClass3_Sub11_Sub1_1.method3110();
			local36 = local28 >> 2;
			local42 = local28 & 0x3;
			local134 = Static237.anIntArray361[local36];
			if (Static29.method541(Static282.anInt5183) || local16 >= 0 && local20 >= 0 && Static400.anInt6818 > local16 && Static271.anInt5050 > local20) {
				Static352.method4079(local20, local16, Static281.anInt5123, local24, local134, local36, local42);
			}
		} else if (Static35.aClass187_2 == arg0) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3115();
			local16 = Static187.aClass3_Sub11_Sub1_1.method3110();
			local20 = (local16 & 0x7) + Static412.anInt6934;
			local24 = local20 + Static463.anInt7588;
			local28 = Static566.anInt9120 + (local16 >> 4 & 0x7);
			local36 = Static529.anInt8344 + local28;
			@Pc(304) Class3_Sub46 local304 = (Class3_Sub46) Static508.aClass310_33.method6601((long) (local36 | local24 << 14 | Static281.anInt5123 << 28));
			if (local304 != null) {
				for (@Pc(312) Class3_Sub35 local312 = (Class3_Sub35) local304.aClass130_64.method3543(); local312 != null; local312 = (Class3_Sub35) local304.aClass130_64.method3551()) {
					if ((local12 & 0x7FFF) == local312.anInt6129) {
						local312.method7812();
						break;
					}
				}
				if (local304.aClass130_64.method3542()) {
					local304.method7812();
				}
				if (local28 >= 0 && local20 >= 0 && local28 < Static400.anInt6818 && Static271.anInt5050 > local20) {
					Static577.method3277(local20, local28, Static281.anInt5123);
				}
			}
		} else if (Static394.aClass187_16 == arg0) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local16 = (local12 >> 4 & 0x7) + Static566.anInt9120;
			local20 = Static412.anInt6934 + (local12 & 0x7);
			local24 = Static187.aClass3_Sub11_Sub1_1.method3109();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local36 = local28 >> 4 & 0xF;
			local42 = local28 & 0x7;
			local134 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local140 = Static187.aClass3_Sub11_Sub1_1.method3118();
			if (local16 >= 0 && local20 >= 0 && Static400.anInt6818 > local16 && Static271.anInt5050 > local20) {
				local142 = local36 + 1;
				if (local16 - local142 <= Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] && local142 + local16 >= Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] >= local20 - local142 && local20 + local142 >= Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0]) {
					Static546.method7306(local42, local140, local134, local24, (local20 << 8) + (Static281.anInt5123 << 24) + (local16 << 16) + local36);
				}
			}
		} else if (arg0 == Static343.aClass187_11) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3139();
			local16 = Static187.aClass3_Sub11_Sub1_1.method3120();
			local20 = Static412.anInt6934 + (local16 & 0x7);
			local24 = Static463.anInt7588 + local20;
			local28 = (local16 >> 4 & 0x7) + Static566.anInt9120;
			local36 = Static529.anInt8344 + local28;
			local42 = Static187.aClass3_Sub11_Sub1_1.method3117();
			@Pc(570) boolean local570 = local28 >= 0 && local20 >= 0 && local28 < Static400.anInt6818 && local20 < Static271.anInt5050;
			if (local570 || Static29.method541(Static282.anInt5183)) {
				Static101.method2173(local24, Static281.anInt5123, new Class3_Sub35(local42, local12), local36);
				if (local570) {
					Static577.method3277(local20, local28, Static281.anInt5123);
				}
			}
		} else if (arg0 == Static7.aClass187_1) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3115();
			local16 = Static187.aClass3_Sub11_Sub1_1.method3117();
			local20 = Static187.aClass3_Sub11_Sub1_1.method3109();
			local24 = Static187.aClass3_Sub11_Sub1_1.method3110();
			local28 = Static412.anInt6934 + (local24 & 0x7);
			local36 = Static463.anInt7588 + local28;
			local42 = Static566.anInt9120 + (local24 >> 4 & 0x7);
			local134 = local42 + Static529.anInt8344;
			if (local20 != Static502.anInt8011) {
				@Pc(662) boolean local662 = local42 >= 0 && local28 >= 0 && Static400.anInt6818 > local42 && local28 < Static271.anInt5050;
				if (local662 || Static29.method541(Static282.anInt5183)) {
					Static101.method2173(local36, Static281.anInt5123, new Class3_Sub35(local12, local16), local134);
					if (local662) {
						Static577.method3277(local28, local42, Static281.anInt5123);
					}
				}
			}
		} else if (arg0 == Static396.aClass187_15) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3109();
			local16 = Static187.aClass3_Sub11_Sub1_1.method3118();
			Static476.aClass69_5.method2181(local12).method586(local16);
		} else if (Static226.aClass187_7 == arg0) {
			local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local16 = Static412.anInt6934 + (local12 & 0x7);
			local20 = Static463.anInt7588 + local16;
			local24 = Static566.anInt9120 + (local12 >> 4 & 0x7);
			local28 = Static529.anInt8344 + local24;
			local36 = Static187.aClass3_Sub11_Sub1_1.method3109();
			local42 = Static187.aClass3_Sub11_Sub1_1.method3109();
			local134 = Static187.aClass3_Sub11_Sub1_1.method3109();
			if (Static508.aClass310_33 != null) {
				@Pc(769) Class3_Sub46 local769 = (Class3_Sub46) Static508.aClass310_33.method6601((long) (local20 << 14 | Static281.anInt5123 << 28 | local28));
				if (local769 != null) {
					for (@Pc(777) Class3_Sub35 local777 = (Class3_Sub35) local769.aClass130_64.method3543(); local777 != null; local777 = (Class3_Sub35) local769.aClass130_64.method3551()) {
						if ((local36 & 0x7FFF) == local777.anInt6129 && local42 == local777.anInt6127) {
							local777.method7812();
							local777.anInt6127 = local134;
							Static101.method2173(local20, Static281.anInt5123, local777, local28);
							break;
						}
					}
					if (local24 >= 0 && local16 >= 0 && local24 < Static400.anInt6818 && Static271.anInt5050 > local16) {
						Static577.method3277(local16, local24, Static281.anInt5123);
					}
				}
			}
		} else {
			@Pc(907) int local907;
			@Pc(1006) int local1006;
			@Pc(917) int local917;
			@Pc(921) int local921;
			if (Static83.aClass187_5 == arg0) {
				local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
				local16 = (local12 >> 4 & 0xF) + Static566.anInt9120 * 2;
				local20 = (local12 & 0xF) + Static412.anInt6934 * 2;
				local24 = Static187.aClass3_Sub11_Sub1_1.method3118();
				@Pc(878) boolean local878 = (local24 & 0x1) != 0;
				local36 = local24 >> 1;
				local42 = Static187.aClass3_Sub11_Sub1_1.method3096() + local16;
				local134 = local20 + Static187.aClass3_Sub11_Sub1_1.method3096();
				local140 = Static187.aClass3_Sub11_Sub1_1.method3107();
				local142 = Static187.aClass3_Sub11_Sub1_1.method3107();
				local907 = Static187.aClass3_Sub11_Sub1_1.method3109();
				@Pc(911) byte local911 = Static187.aClass3_Sub11_Sub1_1.method3096();
				local917 = Static187.aClass3_Sub11_Sub1_1.method3118() * 4;
				local921 = Static187.aClass3_Sub11_Sub1_1.method3109();
				@Pc(925) int local925 = Static187.aClass3_Sub11_Sub1_1.method3109();
				@Pc(929) int local929 = Static187.aClass3_Sub11_Sub1_1.method3118();
				if (local929 == 255) {
					local929 = -1;
				}
				@Pc(938) int local938 = Static187.aClass3_Sub11_Sub1_1.method3109();
				if (local16 >= 0 && local20 >= 0 && Static400.anInt6818 * 2 > local16 && Static400.anInt6818 * 2 > local20 && local42 >= 0 && local134 >= 0 && local42 < Static271.anInt5050 * 2 && local134 < Static271.anInt5050 * 2 && local907 != 65535) {
					local42 = local42 * 256;
					local20 = local20 * 256;
					local134 *= 256;
					local16 = local16 * 256;
					local938 <<= 0x2;
					local1006 = local911 << 2;
					local917 <<= 0x2;
					if (local140 != 0) {
						@Pc(1014) Class9_Sub1_Sub1_Sub2 local1014 = null;
						@Pc(1020) int local1020;
						if (local140 >= 0) {
							local1020 = local140 - 1;
							@Pc(1027) Class3_Sub39 local1027 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local1020);
							if (local1027 != null) {
								local1014 = local1027.aClass9_Sub1_Sub1_Sub2_Sub1_2;
							}
						} else {
							local1020 = -local140 - 1;
							if (local1020 == Static502.anInt8011) {
								local1014 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2;
							} else {
								local1014 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local1020];
							}
						}
						if (local1014 != null) {
							@Pc(1058) Class267 local1058 = local1014.method5573();
							if (local1058.anIntArrayArray53 != null && local1058.anIntArrayArray53[local36] != null) {
								@Pc(1073) int local1073 = local1058.anIntArrayArray53[local36][0];
								@Pc(1080) int local1080 = local1058.anIntArrayArray53[local36][2];
								@Pc(1085) int local1085 = local1014.aClass147_7.method3814();
								@Pc(1089) int local1089 = Class3_Sub17.anIntArray175[local1085];
								@Pc(1093) int local1093 = Class3_Sub17.anIntArray177[local1085];
								@Pc(1104) int local1104 = local1089 * local1080 + local1093 * local1073 >> 14;
								@Pc(1115) int local1115 = local1080 * local1093 - local1089 * local1073 >> 14;
								local1006 -= local1058.anIntArrayArray53[local36][1];
								local20 += local1115;
								local16 += local1104;
							}
						}
					}
					@Pc(1156) Class9_Sub1_Sub1_Sub3 local1156 = new Class9_Sub1_Sub1_Sub3(local907, Static281.anInt5123, Static281.anInt5123, local16, local20, local1006, Static305.anInt5560 + local921, local925 - -Static305.anInt5560, local929, local938, local142, local917, local878);
					local1156.method618(Static130.method2562(local134, Static281.anInt5123, local42) - local917, Static305.anInt5560 + local921, local42, local134);
					Static240.aClass130_25.method3548(new Class3_Sub3_Sub16(local1156));
				}
			} else {
				@Pc(1370) Class9_Sub1_Sub1_Sub3 local1370;
				if (aClass187_17 == arg0) {
					local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
					local16 = (local12 >> 4 & 0xF) + Static566.anInt9120 * 2;
					local20 = (local12 & 0xF) + Static412.anInt6934 * 2;
					@Pc(1216) boolean local1216 = Static187.aClass3_Sub11_Sub1_1.method3118() != 0;
					local28 = Static187.aClass3_Sub11_Sub1_1.method3096() + local16;
					local36 = local20 + Static187.aClass3_Sub11_Sub1_1.method3096();
					local42 = Static187.aClass3_Sub11_Sub1_1.method3107();
					local134 = Static187.aClass3_Sub11_Sub1_1.method3109();
					local140 = Static187.aClass3_Sub11_Sub1_1.method3118() * 4;
					local142 = Static187.aClass3_Sub11_Sub1_1.method3118() * 4;
					local907 = Static187.aClass3_Sub11_Sub1_1.method3109();
					local1006 = Static187.aClass3_Sub11_Sub1_1.method3109();
					local917 = Static187.aClass3_Sub11_Sub1_1.method3118();
					local921 = Static187.aClass3_Sub11_Sub1_1.method3109();
					if (local917 == 255) {
						local917 = -1;
					}
					if (local16 >= 0 && local20 >= 0 && local16 < Static400.anInt6818 * 2 && Static400.anInt6818 * 2 > local20 && local28 >= 0 && local36 >= 0 && Static271.anInt5050 * 2 > local28 && local36 < Static271.anInt5050 * 2 && local134 != 65535) {
						local921 <<= 0x2;
						local142 <<= 0x2;
						local140 <<= 0x2;
						local36 *= 256;
						local28 *= 256;
						local20 = local20 * 256;
						local16 *= 256;
						local1370 = new Class9_Sub1_Sub1_Sub3(local134, Static281.anInt5123, Static281.anInt5123, local16, local20, local140, local907 + Static305.anInt5560, local1006 + Static305.anInt5560, local917, local921, local42, local142, local1216);
						local1370.method618(Static130.method2562(local36, Static281.anInt5123, local28) - local142, Static305.anInt5560 + local907, local28, local36);
						Static240.aClass130_25.method3548(new Class3_Sub3_Sub16(local1370));
					}
				} else if (Static280.aClass187_10 == arg0) {
					local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
					@Pc(1408) boolean local1408 = (local12 & 0x80) != 0;
					local20 = Static566.anInt9120 + (local12 >> 3 & 0x7);
					local24 = Static412.anInt6934 + (local12 & 0x7);
					local28 = Static187.aClass3_Sub11_Sub1_1.method3096() + local20;
					local36 = Static187.aClass3_Sub11_Sub1_1.method3096() + local24;
					local42 = Static187.aClass3_Sub11_Sub1_1.method3107();
					local134 = Static187.aClass3_Sub11_Sub1_1.method3109();
					local140 = Static187.aClass3_Sub11_Sub1_1.method3118() * 4;
					local142 = Static187.aClass3_Sub11_Sub1_1.method3118() * 4;
					local907 = Static187.aClass3_Sub11_Sub1_1.method3109();
					local1006 = Static187.aClass3_Sub11_Sub1_1.method3109();
					local917 = Static187.aClass3_Sub11_Sub1_1.method3118();
					if (local917 == 255) {
						local917 = -1;
					}
					local921 = Static187.aClass3_Sub11_Sub1_1.method3109();
					if (local20 >= 0 && local24 >= 0 && local20 < Static400.anInt6818 && Static271.anInt5050 > local24 && local28 >= 0 && local36 >= 0 && Static400.anInt6818 > local28 && Static271.anInt5050 > local36 && local134 != 65535) {
						local24 = local24 * 512 + 256;
						local142 <<= 0x2;
						local36 = local36 * 512 + 256;
						local921 <<= 0x2;
						local20 = local20 * 512 + 256;
						local28 = local28 * 512 + 256;
						local140 <<= 0x2;
						local1370 = new Class9_Sub1_Sub1_Sub3(local134, Static281.anInt5123, Static281.anInt5123, local20, local24, local140, local907 + Static305.anInt5560, local1006 - -Static305.anInt5560, local917, local921, local42, local142, local1408);
						local1370.method618(Static130.method2562(local36, Static281.anInt5123, local28) - local142, local907 - -Static305.anInt5560, local28, local36);
						Static240.aClass130_25.method3548(new Class3_Sub3_Sub16(local1370));
					}
				} else if (Static349.aClass187_12 == arg0) {
					local12 = Static187.aClass3_Sub11_Sub1_1.method3115();
					if (local12 == 65535) {
						local12 = -1;
					}
					local16 = Static187.aClass3_Sub11_Sub1_1.method3110();
					local20 = local16 >> 2;
					local24 = local16 & 0x3;
					local28 = Static237.anIntArray361[local20];
					local36 = Static187.aClass3_Sub11_Sub1_1.method3110();
					local42 = Static566.anInt9120 + (local36 >> 4 & 0x7);
					local134 = Static412.anInt6934 + (local36 & 0x7);
					Static277.method4436(local28, local134, local12, local42, Static281.anInt5123, local20, local24);
				} else if (arg0 == Static100.aClass187_6) {
					local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
					local16 = Static566.anInt9120 + (local12 >> 4 & 0x7);
					local20 = Static412.anInt6934 + (local12 & 0x7);
					local24 = Static187.aClass3_Sub11_Sub1_1.method3109();
					if (local24 == 65535) {
						local24 = -1;
					}
					local28 = Static187.aClass3_Sub11_Sub1_1.method3118();
					local36 = local28 >> 4 & 0xF;
					local42 = local28 & 0x7;
					local134 = Static187.aClass3_Sub11_Sub1_1.method3118();
					local140 = Static187.aClass3_Sub11_Sub1_1.method3118();
					if (local16 >= 0 && local20 >= 0 && local16 < Static400.anInt6818 && local20 < Static271.anInt5050) {
						local142 = local36 + 1;
						if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] >= local16 - local142 && local16 + local142 >= Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] && local20 - local142 <= Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] <= local142 + local20) {
							Static581.method7696(local134, local24, local42, local140, local36 + (local20 << 8) + (Static281.anInt5123 << 24) + (local16 << 16));
						}
					}
				} else if (arg0 == Static81.aClass187_3) {
					Static187.aClass3_Sub11_Sub1_1.method3118();
					local12 = Static187.aClass3_Sub11_Sub1_1.method3118();
					local16 = Static566.anInt9120 + (local12 >> 4 & 0x7);
					local20 = Static412.anInt6934 + (local12 & 0x7);
					local24 = Static187.aClass3_Sub11_Sub1_1.method3109();
					local28 = Static187.aClass3_Sub11_Sub1_1.method3118();
					local36 = Static187.aClass3_Sub11_Sub1_1.method3126();
					@Pc(1835) String local1835 = Static187.aClass3_Sub11_Sub1_1.method3133();
					Static145.method2748(Static281.anInt5123, local24, local28, local20, local16, local36, local1835);
				} else {
					Static379.method5607("T3 - " + arg0, null);
					Static429.method6073(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
	public static int method7491(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
