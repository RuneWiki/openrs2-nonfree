import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method2330(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static249.method6960(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(37) int local37;
			do {
				local37 = arg0.nextInt();
			} while (local37 >= local34);
			return Static48.method1201(local37, arg1);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ws;Z)V")
	public static void method2331(@OriginalArg(0) Class364 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (Static185.aClass364_11 == arg0) {
			local12 = Static455.aClass3_Sub26_Sub1_2.method6819();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static92.anIntArray78[local16];
			local28 = Static455.aClass3_Sub26_Sub1_2.method6777();
			local36 = (local28 >> 4 & 0x7) + Static13.anInt122;
			local42 = Static246.anInt4843 + (local28 & 0x7);
			if (Static65.method1622(Static47.anInt1279) || local36 >= 0 && local42 >= 0 && local36 < Static345.anInt6228 && local42 < Static535.anInt9341) {
				Static161.method2941(local24, local16, -1, local36, Static371.anInt6488, local20, local42);
			}
			return;
		}
		@Pc(139) int local139;
		@Pc(145) int local145;
		@Pc(147) int local147;
		if (Static451.aClass364_18 == arg0) {
			local12 = Static455.aClass3_Sub26_Sub1_2.method6814();
			local16 = (local12 >> 4 & 0x7) + Static13.anInt122;
			local20 = (local12 & 0x7) + Static246.anInt4843;
			local24 = Static455.aClass3_Sub26_Sub1_2.method6811();
			local28 = Static455.aClass3_Sub26_Sub1_2.method6814();
			local36 = Static455.aClass3_Sub26_Sub1_2.method6811();
			local42 = Static455.aClass3_Sub26_Sub1_2.method6814();
			if (local16 >= 0 && local20 >= 0 && Static345.anInt6228 > local16 && local20 < Static535.anInt9341) {
				local139 = local16 * 512 + 256;
				local145 = local20 * 512 + 256;
				local147 = Static371.anInt6488;
				if (local147 < 3 && Static269.method4098(local16, local20)) {
					local147++;
				}
				@Pc(180) Class25_Sub2_Sub2_Sub2 local180 = new Class25_Sub2_Sub2_Sub2(local24, local36, Static397.anInt6998, Static371.anInt6488, local147, local139, Static78.method3298(local139, Static371.anInt6488, local145) - local28, local145, local16, local16, local20, local20, local42);
				Static410.aClass244_55.method5570(new Class3_Sub7_Sub2(local180));
			}
		} else if (Static286.aClass364_15 == arg0) {
			local12 = Static455.aClass3_Sub26_Sub1_2.method6822();
			local16 = Static455.aClass3_Sub26_Sub1_2.method6811();
			local20 = Static455.aClass3_Sub26_Sub1_2.method6811();
			local24 = Static455.aClass3_Sub26_Sub1_2.method6821();
			local28 = (local24 & 0x7) + Static246.anInt4843;
			local36 = local28 + Static137.anInt3293;
			local42 = (local24 >> 4 & 0x7) + Static13.anInt122;
			local139 = Static321.anInt5874 + local42;
			if (Static147.anInt3433 != local16) {
				@Pc(256) boolean local256 = local42 >= 0 && local28 >= 0 && Static345.anInt6228 > local42 && local28 < Static535.anInt9341;
				if (local256 || Static65.method1622(Static47.anInt1279)) {
					Static72.method1746(new Class3_Sub31(local20, local12), local36, Static371.anInt6488, local139);
					if (local256) {
						Static499.method4576(Static371.anInt6488, local42, local28);
					}
				}
			}
		} else {
			@Pc(347) int local347;
			@Pc(355) int local355;
			@Pc(359) int local359;
			@Pc(351) int local351;
			@Pc(463) Class25_Sub2_Sub2_Sub1 local463;
			if (Static217.aClass364_13 == arg0) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6814();
				@Pc(295) boolean local295 = (local12 & 0x80) != 0;
				local20 = Static13.anInt122 + (local12 >> 3 & 0x7);
				local24 = Static246.anInt4843 + (local12 & 0x7);
				local28 = local20 + Static455.aClass3_Sub26_Sub1_2.method6825();
				local36 = Static455.aClass3_Sub26_Sub1_2.method6825() + local24;
				local42 = Static455.aClass3_Sub26_Sub1_2.method6789();
				local139 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local145 = Static455.aClass3_Sub26_Sub1_2.method6814() * 4;
				local147 = Static455.aClass3_Sub26_Sub1_2.method6814() * 4;
				local347 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local351 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local355 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local359 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (local355 == 255) {
					local355 = -1;
				}
				if (local20 >= 0 && local24 >= 0 && local20 < Static345.anInt6228 && local24 < Static535.anInt9341 && local28 >= 0 && local36 >= 0 && Static345.anInt6228 > local28 && Static535.anInt9341 > local36 && local139 != 65535) {
					local147 <<= 0x2;
					local24 = local24 * 512 + 256;
					local359 <<= 0x2;
					local36 = local36 * 512 + 256;
					local28 = local28 * 512 + 256;
					local145 <<= 0x2;
					local20 = local20 * 512 + 256;
					local463 = new Class25_Sub2_Sub2_Sub1(local139, Static371.anInt6488, Static371.anInt6488, local20, local24, local145, local347 + Static397.anInt6998, local351 + Static397.anInt6998, local355, local359, local42, local147, local295);
					local463.method477(local347 + Static397.anInt6998, -local147 + Static78.method3298(local28, Static371.anInt6488, local36), local28, local36);
					Static110.aClass244_20.method5570(new Class3_Sub7_Sub12(local463));
				}
			} else if (arg0 == Static188.aClass364_12) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6783();
				local16 = Static455.aClass3_Sub26_Sub1_2.method6777();
				local20 = (local16 & 0x7) + Static246.anInt4843;
				local24 = local20 + Static137.anInt3293;
				local28 = Static13.anInt122 + (local16 >> 4 & 0x7);
				local36 = Static321.anInt5874 + local28;
				local42 = Static455.aClass3_Sub26_Sub1_2.method6783();
				@Pc(547) boolean local547 = local28 >= 0 && local20 >= 0 && Static345.anInt6228 > local28 && local20 < Static535.anInt9341;
				if (local547 || Static65.method1622(Static47.anInt1279)) {
					Static72.method1746(new Class3_Sub31(local12, local42), local24, Static371.anInt6488, local36);
					if (local547) {
						Static499.method4576(Static371.anInt6488, local28, local20);
					}
				}
			} else if (Static495.aClass364_19 == arg0) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6812();
				local16 = Static455.aClass3_Sub26_Sub1_2.method6821();
				local20 = local16 >> 2;
				local24 = local16 & 0x3;
				local28 = Static92.anIntArray78[local20];
				local36 = Static455.aClass3_Sub26_Sub1_2.method6777();
				local42 = Static13.anInt122 + (local36 >> 4 & 0x7);
				local139 = (local36 & 0x7) + Static246.anInt4843;
				if (Static65.method1622(Static47.anInt1279) || local42 >= 0 && local139 >= 0 && local42 < Static345.anInt6228 && Static535.anInt9341 > local139) {
					Static161.method2941(local28, local20, local12, local42, Static371.anInt6488, local24, local139);
				}
			} else if (Static65.aClass364_6 == arg0) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local16 = Static13.anInt122 + (local12 >> 4 & 0x7);
				local20 = Static246.anInt4843 + (local12 & 0x7);
				local24 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (local24 == 65535) {
					local24 = -1;
				}
				local28 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local36 = local28 >> 4 & 0xF;
				local42 = local28 & 0x7;
				local139 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local145 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local147 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (local16 >= 0 && local20 >= 0 && local16 < Static345.anInt6228 && local20 < Static535.anInt9341) {
					local347 = local36 + 1;
					if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0] >= local16 - local347 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0] <= local16 + local347 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0] >= local20 - local347 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0] <= local20 + local347) {
						Static95.method1999(local139, local42, local36 + (local16 << 16) + (Static371.anInt6488 << 24) + (local20 << 8), local147, local24, local145);
					}
				}
			} else if (arg0 == Static173.aClass364_10) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local16 = (local12 >> 4 & 0xF) + Static13.anInt122 * 2;
				local20 = Static246.anInt4843 * 2 + (local12 & 0xF);
				@Pc(826) boolean local826 = Static455.aClass3_Sub26_Sub1_2.method6814() != 0;
				local28 = Static455.aClass3_Sub26_Sub1_2.method6825() + local16;
				local36 = local20 + Static455.aClass3_Sub26_Sub1_2.method6825();
				local42 = Static455.aClass3_Sub26_Sub1_2.method6789();
				local139 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local145 = Static455.aClass3_Sub26_Sub1_2.method6814() * 4;
				local147 = Static455.aClass3_Sub26_Sub1_2.method6814() * 4;
				local347 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local351 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local355 = Static455.aClass3_Sub26_Sub1_2.method6814();
				if (local355 == 255) {
					local355 = -1;
				}
				local359 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (local16 >= 0 && local20 >= 0 && local16 < Static345.anInt6228 * 2 && Static345.anInt6228 * 2 > local20 && local28 >= 0 && local36 >= 0 && Static535.anInt9341 * 2 > local28 && local36 < Static535.anInt9341 * 2 && local139 != 65535) {
					local147 <<= 0x2;
					local36 = local36 * 256;
					local359 <<= 0x2;
					local28 = local28 * 256;
					local145 <<= 0x2;
					local20 *= 256;
					local16 = local16 * 256;
					local463 = new Class25_Sub2_Sub2_Sub1(local139, Static371.anInt6488, Static371.anInt6488, local16, local20, local145, local347 + Static397.anInt6998, local351 - -Static397.anInt6998, local355, local359, local42, local147, local826);
					local463.method477(Static397.anInt6998 + local347, Static78.method3298(local28, Static371.anInt6488, local36) + -local147, local28, local36);
					Static110.aClass244_20.method5570(new Class3_Sub7_Sub12(local463));
				}
			} else if (Static549.aClass364_20 == arg0) {
				Static455.aClass3_Sub26_Sub1_2.method6814();
				local12 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local16 = Static13.anInt122 + (local12 >> 4 & 0x7);
				local20 = Static246.anInt4843 + (local12 & 0x7);
				local24 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local28 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local36 = Static455.aClass3_Sub26_Sub1_2.method6830();
				@Pc(1053) String local1053 = Static455.aClass3_Sub26_Sub1_2.method6786();
				Static538.method7362(Static371.anInt6488, local20, local36, local16, local1053, local24, local28);
			} else if (Static557.aClass364_17 == arg0) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local16 = Static455.aClass3_Sub26_Sub1_2.method6821();
				local20 = Static246.anInt4843 + (local16 & 0x7);
				local24 = Static137.anInt3293 + local20;
				local28 = Static13.anInt122 + (local16 >> 4 & 0x7);
				local36 = Static321.anInt5874 + local28;
				@Pc(1111) Class3_Sub4 local1111 = (Class3_Sub4) Static537.aClass297_34.method6531((long) (local36 | local24 << 14 | Static371.anInt6488 << 28));
				if (local1111 != null) {
					for (@Pc(1119) Class3_Sub31 local1119 = (Class3_Sub31) local1111.aClass244_1.method5572(); local1119 != null; local1119 = (Class3_Sub31) local1111.aClass244_1.method5576()) {
						if ((local12 & 0x7FFF) == local1119.anInt5292) {
							local1119.method8128();
							break;
						}
					}
					if (local1111.aClass244_1.method5571()) {
						local1111.method8128();
					}
					if (local28 >= 0 && local20 >= 0 && local28 < Static345.anInt6228 && local20 < Static535.anInt9341) {
						Static499.method4576(Static371.anInt6488, local28, local20);
					}
				}
			} else if (Static242.aClass364_14 == arg0) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local16 = (local12 >> 4 & 0x7) + Static13.anInt122;
				local20 = Static246.anInt4843 + (local12 & 0x7);
				local24 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (local24 == 65535) {
					local24 = -1;
				}
				local28 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local36 = local28 >> 4 & 0xF;
				local42 = local28 & 0x7;
				local139 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local145 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local147 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (local16 >= 0 && local20 >= 0 && local16 < Static345.anInt6228 && local20 < Static535.anInt9341) {
					local347 = local36 + 1;
					if (local16 - local347 <= Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0] && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0] <= local347 + local16 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0] >= local20 - local347 && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0] <= local20 + local347) {
						Static145.method2770(local24, local36 + (Static371.anInt6488 << 24) + (local16 << 16) + (local20 << 8), local42, local139, local147, local145);
					}
				}
			} else if (arg0 == Static86.aClass364_8) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6822();
				if (local12 == 65535) {
					local12 = -1;
				}
				local16 = Static455.aClass3_Sub26_Sub1_2.method6777();
				local20 = local16 >> 2;
				local24 = local16 & 0x3;
				local28 = Static92.anIntArray78[local20];
				local36 = Static455.aClass3_Sub26_Sub1_2.method6777();
				local42 = (local36 >> 4 & 0x7) + Static13.anInt122;
				local139 = Static246.anInt4843 + (local36 & 0x7);
				Static80.method1849(local42, local20, local12, local139, local28, Static371.anInt6488, local24);
			} else if (Static151.aClass364_9 == arg0) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local16 = (local12 & 0x7) + Static246.anInt4843;
				local20 = local16 + Static137.anInt3293;
				local24 = (local12 >> 4 & 0x7) + Static13.anInt122;
				local28 = Static321.anInt5874 + local24;
				local36 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local42 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local139 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (Static537.aClass297_34 != null) {
					@Pc(1436) Class3_Sub4 local1436 = (Class3_Sub4) Static537.aClass297_34.method6531((long) (Static371.anInt6488 << 28 | local20 << 14 | local28));
					if (local1436 != null) {
						for (@Pc(1444) Class3_Sub31 local1444 = (Class3_Sub31) local1436.aClass244_1.method5572(); local1444 != null; local1444 = (Class3_Sub31) local1436.aClass244_1.method5576()) {
							if (local1444.anInt5292 == (local36 & 0x7FFF) && local42 == local1444.anInt5291) {
								local1444.method8128();
								local1444.anInt5291 = local139;
								Static72.method1746(local1444, local20, Static371.anInt6488, local28);
								break;
							}
						}
						if (local24 >= 0 && local16 >= 0 && local24 < Static345.anInt6228 && Static535.anInt9341 > local16) {
							Static499.method4576(Static371.anInt6488, local24, local16);
						}
					}
				}
			} else if (arg0 == Static570.aClass364_21) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6814();
				local16 = (local12 >> 4 & 0xF) + Static13.anInt122 * 2;
				local20 = (local12 & 0xF) + Static246.anInt4843 * 2;
				local24 = Static455.aClass3_Sub26_Sub1_2.method6814();
				@Pc(1545) boolean local1545 = (local24 & 0x1) != 0;
				local36 = local24 >> 1;
				local42 = local16 + Static455.aClass3_Sub26_Sub1_2.method6825();
				local139 = local20 + Static455.aClass3_Sub26_Sub1_2.method6825();
				local145 = Static455.aClass3_Sub26_Sub1_2.method6789();
				local147 = Static455.aClass3_Sub26_Sub1_2.method6789();
				local347 = Static455.aClass3_Sub26_Sub1_2.method6811();
				@Pc(1577) byte local1577 = Static455.aClass3_Sub26_Sub1_2.method6825();
				local355 = Static455.aClass3_Sub26_Sub1_2.method6814() * 4;
				local359 = Static455.aClass3_Sub26_Sub1_2.method6811();
				@Pc(1591) int local1591 = Static455.aClass3_Sub26_Sub1_2.method6811();
				@Pc(1595) int local1595 = Static455.aClass3_Sub26_Sub1_2.method6814();
				@Pc(1599) int local1599 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (local1595 == 255) {
					local1595 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && Static345.anInt6228 * 2 > local16 && local20 < Static345.anInt6228 * 2 && local42 >= 0 && local139 >= 0 && local42 < Static535.anInt9341 * 2 && local139 < Static535.anInt9341 * 2 && local347 != 65535) {
					local42 *= 256;
					local1599 <<= 0x2;
					local20 = local20 * 256;
					local139 *= 256;
					local16 = local16 * 256;
					local355 <<= 0x2;
					local351 = local1577 << 2;
					if (local145 != 0) {
						@Pc(1681) Class25_Sub2_Sub2_Sub5 local1681 = null;
						@Pc(1688) int local1688;
						if (local145 < 0) {
							local1688 = -local145 - 1;
							if (local1688 == Static147.anInt3433) {
								local1681 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1;
							} else {
								local1681 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local1688];
							}
						} else {
							local1688 = local145 - 1;
							@Pc(1710) Class3_Sub39 local1710 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local1688);
							if (local1710 != null) {
								local1681 = local1710.aClass25_Sub2_Sub2_Sub5_Sub2_2;
							}
						}
						if (local1681 != null) {
							@Pc(1721) Class122 local1721 = local1681.method6683();
							if (local1721.anIntArrayArray35 != null && local1721.anIntArrayArray35[local36] != null) {
								@Pc(1736) int local1736 = local1721.anIntArrayArray35[local36][0];
								@Pc(1743) int local1743 = local1721.anIntArrayArray35[local36][2];
								@Pc(1748) int local1748 = local1681.aClass252_7.method5714();
								@Pc(1752) int local1752 = Class3_Sub28.anIntArray232[local1748];
								@Pc(1756) int local1756 = Class3_Sub28.anIntArray231[local1748];
								@Pc(1767) int local1767 = local1743 * local1752 + local1736 * local1756 >> 14;
								@Pc(1778) int local1778 = local1756 * local1743 - local1736 * local1752 >> 14;
								local16 += local1767;
								local20 += local1778;
								local351 -= local1721.anIntArrayArray35[local36][1];
							}
						}
					}
					@Pc(1819) Class25_Sub2_Sub2_Sub1 local1819 = new Class25_Sub2_Sub2_Sub1(local347, Static371.anInt6488, Static371.anInt6488, local16, local20, local351, Static397.anInt6998 + local359, local1591 - -Static397.anInt6998, local1595, local1599, local147, local355, local1545);
					local1819.method477(local359 + Static397.anInt6998, Static78.method3298(local42, Static371.anInt6488, local139) + -local355, local42, local139);
					Static110.aClass244_20.method5570(new Class3_Sub7_Sub12(local1819));
				}
			} else if (arg0 == Static67.aClass364_7) {
				local12 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local16 = Static455.aClass3_Sub26_Sub1_2.method6814();
				Static536.aClass146_4.method3721(local12).method4708(local16);
			} else {
				Static332.method1390(null, "T3 - " + arg0);
				Static218.method6807(false);
			}
		}
	}
}
