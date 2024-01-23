import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!r", name = "f", descriptor = "I")
	public static int anInt4492;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray107;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!rn;")
	public static Class155 aClass155_94;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!rn;")
	public static Class155 aClass155_95;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
	public static int[] anIntArray499 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	public static int anInt4489 = 0;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public static int anInt4490 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public static void method3782(@OriginalArg(0) int arg0) {
		Static226.method3660(Static226.anInt4374, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static226.method3655(-50.0F, -60.0F, -50.0F);
		Static226.method3658(Static226.anInt4371, 0, false);
		Static226.method3654();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method3783() {
		@Pc(15) int local15;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(41) int local41;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(297) Class10_Sub7 local297;
		if (Static255.anInt5252 == 67) {
			local15 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local26 = Static135.anInt2605 * 2 + (local15 >> 4 & 0xF);
			local35 = Static13.anInt242 * 2 + (local15 & 0xF);
			local41 = Static249.aClass3_Sub26_Sub1_3.method3920() + local26;
			local47 = local35 + Static249.aClass3_Sub26_Sub1_3.method3920();
			local51 = Static249.aClass3_Sub26_Sub1_3.method3930();
			local55 = Static249.aClass3_Sub26_Sub1_3.method3930();
			local59 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local63 = Static249.aClass3_Sub26_Sub1_3.method3920();
			local69 = Static249.aClass3_Sub26_Sub1_3.method3915() * 4;
			local73 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local77 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local81 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local85 = Static249.aClass3_Sub26_Sub1_3.method3915();
			if (local81 == 255) {
				local81 = -1;
			}
			if (local26 >= 0 && local35 >= 0 && local26 < 208 && local35 < 208 && local41 >= 0 && local47 >= 0 && local41 < 208 && local47 < 208 && local59 != 65535) {
				local26 = local26 * 64;
				local35 = local35 * 64;
				local41 = local41 * 64;
				if (local51 != 0) {
					@Pc(166) int local166;
					@Pc(156) Class10_Sub5 local156;
					@Pc(141) int local141;
					@Pc(145) int local145;
					if (local51 < 0) {
						local141 = -local51 - 1;
						local145 = local141 & 0x7FF;
						if (local145 == Static273.anInt5556) {
							local156 = Static136.aClass10_Sub5_Sub1_1;
						} else {
							local156 = Static52.aClass10_Sub5_Sub1Array1[local145];
						}
						local166 = local141 >> 11 & 0xF;
					} else {
						local141 = local51 - 1;
						local166 = local141 >> 11 & 0xF;
						local145 = local141 & 0x7FF;
						local156 = Static110.aClass10_Sub5_Sub2Array1[local145];
					}
					if (local156 != null) {
						@Pc(192) Class31 local192 = local156.method4191();
						if (local192.anIntArrayArray10 != null && local192.anIntArrayArray10[local166] != null) {
							local63 -= local192.anIntArrayArray10[local166][1];
							local145 = local192.anIntArrayArray10[local166][0];
							@Pc(225) int local225 = local192.anIntArrayArray10[local166][2];
							@Pc(230) int local230 = Class11.anIntArray26[local156.anInt5043];
							@Pc(235) int local235 = Class11.anIntArray27[local156.anInt5043];
							@Pc(245) int local245 = local230 * local225 + local235 * local145 >> 16;
							@Pc(256) int local256 = local225 * local235 - local230 * local145 >> 16;
							local35 += local256;
							local26 += local245;
						}
					}
				}
				local47 = local47 * 64;
				local297 = new Class10_Sub7(local59, Static99.anInt1826, local26, local35, Static122.method2036(local35, local26, Static99.anInt1826) - local63, local73 - -Static124.anInt2371, Static124.anInt2371 + local77, local81, local85, local55, local69);
				local297.method4987(local73 + Static124.anInt2371, local41, local47, Static122.method2036(local47, local41, Static99.anInt1826) - local69);
				Static291.aClass56_27.method1282(new Class3_Sub4_Sub16(local297));
			}
		} else if (Static255.anInt5252 == 49) {
			local15 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local26 = Static249.aClass3_Sub26_Sub1_3.method3915();
			Static175.method2874(local15).method1110(local26);
		} else if (Static255.anInt5252 == 146) {
			local15 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local26 = (local15 >> 4 & 0x7) + Static135.anInt2605;
			local35 = Static13.anInt242 + (local15 & 0x7);
			local41 = Static249.aClass3_Sub26_Sub1_3.method3920() + local26;
			local47 = local35 + Static249.aClass3_Sub26_Sub1_3.method3920();
			local51 = Static249.aClass3_Sub26_Sub1_3.method3930();
			local55 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local59 = Static249.aClass3_Sub26_Sub1_3.method3915() * 4;
			local63 = Static249.aClass3_Sub26_Sub1_3.method3915() * 4;
			local69 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local73 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local77 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local81 = Static249.aClass3_Sub26_Sub1_3.method3915();
			if (local77 == 255) {
				local77 = -1;
			}
			if (local26 >= 0 && local35 >= 0 && local26 < 104 && local35 < 104 && local41 >= 0 && local47 >= 0 && local41 < 104 && local47 < 104 && local55 != 65535) {
				local35 = local35 * 128 + 64;
				local26 = local26 * 128 + 64;
				local41 = local41 * 128 + 64;
				local47 = local47 * 128 + 64;
				@Pc(506) Class10_Sub7 local506 = new Class10_Sub7(local55, Static99.anInt1826, local26, local35, Static122.method2036(local35, local26, Static99.anInt1826) - local59, Static124.anInt2371 + local69, local73 + Static124.anInt2371, local77, local81, local51, local63);
				local506.method4987(Static124.anInt2371 + local69, local41, local47, Static122.method2036(local47, local41, Static99.anInt1826) - local63);
				Static291.aClass56_27.method1282(new Class3_Sub4_Sub16(local506));
			}
		} else if (Static255.anInt5252 == 17) {
			local15 = Static249.aClass3_Sub26_Sub1_3.method3909();
			local26 = Static249.aClass3_Sub26_Sub1_3.method3939();
			local35 = local26 >> 2;
			local41 = local26 & 0x3;
			local47 = Static254.anIntArray550[local35];
			local51 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local59 = Static13.anInt242 + (local51 & 0x7);
			local55 = (local51 >> 4 & 0x7) + Static135.anInt2605;
			if (local55 >= 0 && local59 >= 0 && local55 < 104 && local59 < 104) {
				Static37.method552(local55, local47, -1, Static99.anInt1826, 0, local35, local41, local15, local59);
			}
		} else if (Static255.anInt5252 == 81) {
			local15 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local26 = (local15 >> 4 & 0x7) + Static135.anInt2605;
			local35 = (local15 & 0x7) + Static13.anInt242;
			local41 = Static249.aClass3_Sub26_Sub1_3.method3941();
			local47 = local41 >> 2;
			local51 = local41 & 0x3;
			local55 = Static254.anIntArray550[local47];
			local59 = Static249.aClass3_Sub26_Sub1_3.method3909();
			if (local59 == 65535) {
				local59 = -1;
			}
			Static65.method1020(local59, local51, local47, local26, Static99.anInt1826, local35, local55);
		} else if (Static255.anInt5252 == 50) {
			local15 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local26 = (local15 >> 4 & 0x7) + Static135.anInt2605;
			local35 = Static13.anInt242 + (local15 & 0x7);
			local41 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local47 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local51 = Static249.aClass3_Sub26_Sub1_3.method3948();
			if (local26 >= 0 && local35 >= 0 && local26 < 104 && local35 < 104) {
				local35 = local35 * 128 + 64;
				local26 = local26 * 128 + 64;
				@Pc(740) Class10_Sub1 local740 = new Class10_Sub1(local41, Static99.anInt1826, local26, local35, Static122.method2036(local35, local26, Static99.anInt1826) - local47, local51, Static124.anInt2371);
				Static259.aClass56_25.method1282(new Class3_Sub4_Sub20(local740));
			}
		} else if (Static255.anInt5252 == 200) {
			local26 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local35 = (local26 >> 4 & 0x7) + Static135.anInt2605;
			local41 = (local26 & 0x7) + Static13.anInt242;
			local47 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local51 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local55 = Static249.aClass3_Sub26_Sub1_3.method3948();
			if (local35 >= 0 && local41 >= 0 && local35 < 104 && local41 < 104) {
				@Pc(820) Class56 local820 = Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local35][local41];
				if (local820 != null) {
					for (@Pc(827) Class3_Sub4_Sub13 local827 = (Class3_Sub4_Sub13) local820.method1281(); local827 != null; local827 = (Class3_Sub4_Sub13) local820.method1278()) {
						@Pc(832) Class10_Sub2 local832 = local827.aClass10_Sub2_1;
						if ((local47 & 0x7FFF) == local832.anInt365 && local51 == local832.anInt369) {
							local832.anInt369 = local55;
							break;
						}
					}
					Static244.method4141(local41, local35);
				}
			}
		} else {
			if (Static255.anInt5252 == 173) {
				local26 = Static249.aClass3_Sub26_Sub1_3.method3921();
				local41 = local26 & 0x3;
				local35 = local26 >> 2;
				@Pc(886) byte local886 = Static249.aClass3_Sub26_Sub1_3.method3920();
				@Pc(890) byte local890 = Static249.aClass3_Sub26_Sub1_3.method3926();
				local55 = Static249.aClass3_Sub26_Sub1_3.method3939();
				local59 = (local55 >> 4 & 0x7) + Static135.anInt2605;
				local63 = Static13.anInt242 + (local55 & 0x7);
				local69 = Static249.aClass3_Sub26_Sub1_3.method3895();
				local73 = Static249.aClass3_Sub26_Sub1_3.method3898();
				local77 = Static249.aClass3_Sub26_Sub1_3.method3948();
				@Pc(924) byte local924 = Static249.aClass3_Sub26_Sub1_3.method3926();
				local85 = Static249.aClass3_Sub26_Sub1_3.method3895();
				@Pc(932) byte local932 = Static249.aClass3_Sub26_Sub1_3.method3920();
				if (!Static283.aBoolean393) {
					Static107.method1713(local69, local41, local932, local63, local35, local886, local85, local77, local890, local924, local59, local73);
				}
			}
			if (Static255.anInt5252 == 90) {
				local26 = Static249.aClass3_Sub26_Sub1_3.method3941();
				local41 = local26 & 0x3;
				local35 = local26 >> 2;
				local47 = Static254.anIntArray550[local35];
				local51 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local55 = (local51 >> 4 & 0x7) + Static135.anInt2605;
				local59 = Static13.anInt242 + (local51 & 0x7);
				if (local55 >= 0 && local59 >= 0 && local55 < 104 && local59 < 104) {
					Static37.method552(local55, local47, -1, Static99.anInt1826, 0, local35, local41, -1, local59);
				}
			} else if (Static255.anInt5252 == 113) {
				local26 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local35 = (local26 >> 4 & 0xF) + Static135.anInt2605 * 2;
				local41 = (local26 & 0xF) + Static13.anInt242 * 2;
				local47 = Static249.aClass3_Sub26_Sub1_3.method3920() + local35;
				local51 = Static249.aClass3_Sub26_Sub1_3.method3920() + local41;
				local55 = Static249.aClass3_Sub26_Sub1_3.method3930();
				local59 = Static249.aClass3_Sub26_Sub1_3.method3948();
				local63 = Static249.aClass3_Sub26_Sub1_3.method3915() * 4;
				local69 = Static249.aClass3_Sub26_Sub1_3.method3915() * 4;
				local73 = Static249.aClass3_Sub26_Sub1_3.method3948();
				local77 = Static249.aClass3_Sub26_Sub1_3.method3948();
				local81 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local85 = Static249.aClass3_Sub26_Sub1_3.method3915();
				if (local81 == 255) {
					local81 = -1;
				}
				if (local35 >= 0 && local41 >= 0 && local35 < 208 && local41 < 208 && local47 >= 0 && local51 >= 0 && local47 < 208 && local51 < 208 && local59 != 65535) {
					local41 *= 64;
					local35 *= 64;
					local297 = new Class10_Sub7(local59, Static99.anInt1826, local35, local41, Static122.method2036(local41, local35, Static99.anInt1826) - local63, Static124.anInt2371 + local73, local77 + Static124.anInt2371, local81, local85, local55, local69);
					local51 *= 64;
					local47 = local47 * 64;
					local297.method4987(local73 + Static124.anInt2371, local47, local51, Static122.method2036(local51, local47, Static99.anInt1826) - local69);
					Static291.aClass56_27.method1282(new Class3_Sub4_Sub16(local297));
				}
			} else if (Static255.anInt5252 == 21) {
				local26 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local41 = (local26 & 0x7) + Static13.anInt242;
				local35 = (local26 >> 4 & 0x7) + Static135.anInt2605;
				local47 = Static249.aClass3_Sub26_Sub1_3.method3948();
				local51 = Static249.aClass3_Sub26_Sub1_3.method3909();
				if (local35 >= 0 && local41 >= 0 && local35 < 104 && local41 < 104) {
					@Pc(1233) Class10_Sub2 local1233 = new Class10_Sub2();
					local1233.anInt365 = local51;
					local1233.anInt369 = local47;
					if (Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local35][local41] == null) {
						Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local35][local41] = new Class56();
					}
					Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local35][local41].method1282(new Class3_Sub4_Sub13(local1233));
					Static244.method4141(local41, local35);
				}
			} else if (Static255.anInt5252 == 130) {
				local26 = Static249.aClass3_Sub26_Sub1_3.method3939();
				local41 = (local26 & 0x7) + Static13.anInt242;
				local35 = (local26 >> 4 & 0x7) + Static135.anInt2605;
				local47 = Static249.aClass3_Sub26_Sub1_3.method3895();
				if (local35 >= 0 && local41 >= 0 && local35 < 104 && local41 < 104) {
					@Pc(1326) Class56 local1326 = Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local35][local41];
					if (local1326 != null) {
						for (@Pc(1333) Class3_Sub4_Sub13 local1333 = (Class3_Sub4_Sub13) local1326.method1281(); local1333 != null; local1333 = (Class3_Sub4_Sub13) local1326.method1278()) {
							if ((local47 & 0x7FFF) == local1333.aClass10_Sub2_1.anInt365) {
								local1333.method5013();
								break;
							}
						}
						if (local1326.method1281() == null) {
							Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local35][local41] = null;
						}
						Static244.method4141(local41, local35);
					}
				}
			} else if (Static255.anInt5252 == 134) {
				local26 = Static249.aClass3_Sub26_Sub1_3.method3909();
				local35 = Static249.aClass3_Sub26_Sub1_3.method3908();
				local41 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local47 = Static135.anInt2605 + (local41 >> 4 & 0x7);
				local51 = (local41 & 0x7) + Static13.anInt242;
				local55 = Static249.aClass3_Sub26_Sub1_3.method3909();
				if (local47 >= 0 && local51 >= 0 && local47 < 104 && local51 < 104 && local35 != Static273.anInt5556) {
					@Pc(1438) Class10_Sub2 local1438 = new Class10_Sub2();
					local1438.anInt365 = local26;
					local1438.anInt369 = local55;
					if (Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local47][local51] == null) {
						Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local47][local51] = new Class56();
					}
					Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local47][local51].method1282(new Class3_Sub4_Sub13(local1438));
					Static244.method4141(local51, local47);
				}
			} else if (Static255.anInt5252 == 179) {
				local26 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local41 = (local26 & 0x7) + Static13.anInt242;
				local35 = (local26 >> 4 & 0x7) + Static135.anInt2605;
				local47 = Static249.aClass3_Sub26_Sub1_3.method3948();
				if (local47 == 65535) {
					local47 = -1;
				}
				local51 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local59 = local51 & 0x7;
				local55 = local51 >> 4 & 0xF;
				local63 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local69 = Static249.aClass3_Sub26_Sub1_3.method3915();
				if (local35 >= 0 && local41 >= 0 && local35 < 104 && local41 < 104) {
					local73 = local55 + 1;
					if (Static136.aClass10_Sub5_Sub1_1.anIntArray537[0] >= local35 - local73 && local73 + local35 >= Static136.aClass10_Sub5_Sub1_1.anIntArray537[0] && local41 - local73 <= Static136.aClass10_Sub5_Sub1_1.anIntArray535[0] && Static136.aClass10_Sub5_Sub1_1.anIntArray535[0] <= local73 + local41 && Static305.anInt6006 != 0 && local59 > 0 && Static62.anInt1162 < 50 && local47 != -1) {
						Static136.anIntArray306[Static62.anInt1162] = local47;
						Static289.anIntArray598[Static62.anInt1162] = local59;
						Static277.anIntArray570[Static62.anInt1162] = local63;
						Static151.aClass45Array1[Static62.anInt1162] = null;
						Static131.anIntArray296[Static62.anInt1162] = (local35 << 16) + (local41 << 8) + local55;
						Static175.anIntArray399[Static62.anInt1162] = local69;
						Static62.anInt1162++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z[[I)V")
	public static void method3786(@OriginalArg(1) int[][] arg0) {
		Static129.anIntArrayArray40 = arg0;
	}
}
