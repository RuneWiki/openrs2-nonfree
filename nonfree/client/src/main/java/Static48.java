import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
	public static int anInt1202;

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "Lclient!ve;")
	public static Class69 aClass69_12;

	@OriginalMember(owner = "client!eh", name = "bb", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array9;

	@OriginalMember(owner = "client!eh", name = "cb", descriptor = "[Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2[] aClass1_Sub2_Sub8_Sub2Array5;

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_302 = Static81.method1507("slide:");

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_297 = aClass24_302;

	@OriginalMember(owner = "client!eh", name = "R", descriptor = "Lclient!dj;")
	public static Class24 aClass24_298 = aClass24_302;

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
	public static int anInt1203 = 0;

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_299 = Static81.method1507("blinken3:");

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_300 = Static81.method1507("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "Lclient!dj;")
	public static Class24 aClass24_301 = aClass24_300;

	@OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
	public static int anInt1211 = 0;

	@OriginalMember(owner = "client!eh", name = "mb", descriptor = "[I")
	public static final int[] anIntArray102 = new int[50];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZII)Lclient!dj;")
	public static Class24 method880(@OriginalArg(2) int arg0) {
		return Static26.method520(arg0, true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZILclient!ue;IIIZIIII)V")
	public static void method881(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 && (Static43.aByteArrayArrayArray3[0][arg1][arg6] & 0x2) == 0) {
			if ((Static43.aByteArrayArrayArray3[arg8][arg1][arg6] & 0x10) != 0) {
				return;
			}
			if (Static208.method3521(arg1, arg8, arg6) != Static80.anInt1910) {
				return;
			}
		}
		if (Static80.anInt1917 > arg8) {
			Static80.anInt1917 = arg8;
		}
		@Pc(50) Class1_Sub2_Sub5 local50 = Static37.method702(arg4);
		@Pc(61) int local61;
		@Pc(64) int local64;
		if (arg7 == 1 || arg7 == 3) {
			local64 = local50.anInt976;
			local61 = local50.anInt958;
		} else {
			local61 = local50.anInt976;
			local64 = local50.anInt958;
		}
		@Pc(90) int local90;
		@Pc(84) int local84;
		if (arg1 + local61 <= 104) {
			local84 = arg1 + (local61 + 1 >> 1);
			local90 = (local61 >> 1) + arg1;
		} else {
			local90 = arg1;
			local84 = arg1 + 1;
		}
		@Pc(108) int local108;
		@Pc(106) int local106;
		if (arg6 + local64 > 104) {
			local106 = arg6 + 1;
			local108 = arg6;
		} else {
			local106 = arg6 + (local64 + 1 >> 1);
			local108 = arg6 + (local64 >> 1);
		}
		@Pc(128) int[][] local128 = Static186.anIntArrayArrayArray2[arg9];
		@Pc(155) int local155 = local128[local84][local106] + local128[local90][local108] + local128[local84][local108] + local128[local90][local106] >> 2;
		@Pc(163) int local163 = (arg1 << 7) + (local61 << 6);
		@Pc(171) int local171 = (arg6 << 7) + (local64 << 6);
		@Pc(188) long local188 = (long) ((arg7 | 0x400) << 20 | arg6 << 7 | arg1 | arg3 << 14);
		if (local50.anInt984 == 0) {
			local188 |= Long.MIN_VALUE;
		}
		if (local50.anInt974 == 1) {
			local188 |= 0x400000L;
		}
		local188 |= (long) arg4 << 32;
		@Pc(217) Object local217 = null;
		if (arg5 && local50.method685()) {
			Static25.method510(arg8, arg6, arg7, arg1, local50);
		}
		@Pc(274) Class5 local274;
		@Pc(286) Class1_Sub2_Sub11 local286;
		if (arg3 == 22) {
			if (!arg0 || local50.anInt984 != 0 || local50.anInt965 == 1 || local50.aBoolean46) {
				if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
					local286 = local50.method691(local128, local171, arg5, local155, arg7, local163, 22);
					local274 = local286.aClass5_3;
				} else {
					local274 = new Class5_Sub5(arg4, 22, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
				}
				Static184.method3196(arg8, arg1, arg6, local155, local274, local188, local50.aBoolean52);
				if (local50.anInt965 == 1 && arg2 != null) {
					arg2.method3273(arg6, arg1);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
				local286 = local50.method691(local128, local171, arg5, local155, arg7, local163, 10);
				local274 = local286.aClass5_3;
			} else {
				local274 = new Class5_Sub5(arg4, 10, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
			}
			if (local274 != null) {
				@Pc(376) boolean local376 = Static196.method3328(arg8, arg1, arg6, local155, local61, local64, local274, arg3 == 11 ? 256 : 0, local188);
				if (local50.aBoolean48 && local376 && arg5) {
					@Pc(385) int local385 = 15;
					if (local274 instanceof Class5_Sub1) {
						local385 = ((Class5_Sub1) local274).method164() / 4;
						if (local385 > 30) {
							local385 = 30;
						}
					}
					for (@Pc(401) int local401 = 0; local401 <= local61; local401++) {
						for (@Pc(404) int local404 = 0; local404 <= local64; local404++) {
							if (local385 > Static136.aByteArrayArrayArray7[arg8][arg1 + local401][local404 + arg6]) {
								Static136.aByteArrayArrayArray7[arg8][local401 + arg1][arg6 + local404] = (byte) local385;
							}
						}
					}
				}
			}
			if (local50.anInt965 != 0 && arg2 != null) {
				arg2.method3265(local64, local61, local50.aBoolean53, arg6, arg1);
			}
		} else if (arg3 >= 12) {
			if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
				local286 = local50.method691(local128, local171, arg5, local155, arg7, local163, arg3);
				local274 = local286.aClass5_3;
			} else {
				local274 = new Class5_Sub5(arg4, arg3, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
			}
			Static196.method3328(arg8, arg1, arg6, local155, 1, 1, local274, 0, local188);
			if (arg5 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg8 > 0) {
				Static191.anIntArrayArrayArray11[arg8][arg1][arg6] |= 0x924;
			}
			if (local50.anInt965 != 0 && arg2 != null) {
				arg2.method3265(local64, local61, local50.aBoolean53, arg6, arg1);
			}
		} else if (arg3 == 0) {
			if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
				local286 = local50.method691(local128, local171, arg5, local155, arg7, local163, 0);
				local274 = local286.aClass5_3;
			} else {
				local274 = new Class5_Sub5(arg4, 0, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
			}
			Static71.method1355(arg8, arg1, arg6, local155, local274, null, Static201.anIntArray399[arg7], 0, local188);
			if (arg5) {
				if (arg7 == 0) {
					if (local50.aBoolean48) {
						Static136.aByteArrayArrayArray7[arg8][arg1][arg6] = 50;
						Static136.aByteArrayArrayArray7[arg8][arg1][arg6 + 1] = 50;
					}
					if (local50.aBoolean55) {
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6] |= 0x249;
					}
				} else if (arg7 == 1) {
					if (local50.aBoolean48) {
						Static136.aByteArrayArrayArray7[arg8][arg1][arg6 + 1] = 50;
						Static136.aByteArrayArrayArray7[arg8][arg1 + 1][arg6 + 1] = 50;
					}
					if (local50.aBoolean55) {
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6 + 1] |= 0x492;
					}
				} else if (arg7 == 2) {
					if (local50.aBoolean48) {
						Static136.aByteArrayArrayArray7[arg8][arg1 + 1][arg6] = 50;
						Static136.aByteArrayArrayArray7[arg8][arg1 + 1][arg6 + 1] = 50;
					}
					if (local50.aBoolean55) {
						Static191.anIntArrayArrayArray11[arg8][arg1 + 1][arg6] |= 0x249;
					}
				} else if (arg7 == 3) {
					if (local50.aBoolean48) {
						Static136.aByteArrayArrayArray7[arg8][arg1][arg6] = 50;
						Static136.aByteArrayArrayArray7[arg8][arg1 + 1][arg6] = 50;
					}
					if (local50.aBoolean55) {
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6] |= 0x492;
					}
				}
			}
			if (local50.anInt965 != 0 && arg2 != null) {
				arg2.method3262(arg6, local50.aBoolean53, arg3, arg7, arg1);
			}
			if (local50.anInt978 != 16) {
				Static13.method307(arg8, arg1, arg6, local50.anInt978);
			}
		} else if (arg3 == 1) {
			if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
				local286 = local50.method691(local128, local171, arg5, local155, arg7, local163, 1);
				local274 = local286.aClass5_3;
			} else {
				local274 = new Class5_Sub5(arg4, 1, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
			}
			Static71.method1355(arg8, arg1, arg6, local155, local274, null, Static123.anIntArray214[arg7], 0, local188);
			if (local50.aBoolean48 && arg5) {
				if (arg7 == 0) {
					Static136.aByteArrayArrayArray7[arg8][arg1][arg6 + 1] = 50;
				} else if (arg7 == 1) {
					Static136.aByteArrayArrayArray7[arg8][arg1 + 1][arg6 + 1] = 50;
				} else if (arg7 == 2) {
					Static136.aByteArrayArrayArray7[arg8][arg1 + 1][arg6] = 50;
				} else if (arg7 == 3) {
					Static136.aByteArrayArrayArray7[arg8][arg1][arg6] = 50;
				}
			}
			if (local50.anInt965 != 0 && arg2 != null) {
				arg2.method3262(arg6, local50.aBoolean53, arg3, arg7, arg1);
			}
		} else {
			@Pc(987) int local987;
			if (arg3 == 2) {
				local987 = arg7 + 1 & 0x3;
				@Pc(1027) Class5 local1027;
				@Pc(1012) Class5 local1012;
				if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
					@Pc(1041) Class1_Sub2_Sub11 local1041 = local50.method691(local128, local171, arg5, local155, arg7 + 4, local163, 2);
					local1012 = local1041.aClass5_3;
					@Pc(1055) Class1_Sub2_Sub11 local1055 = local50.method691(local128, local171, arg5, local155, local987, local163, 2);
					local1027 = local1055.aClass5_3;
				} else {
					local1012 = new Class5_Sub5(arg4, 2, arg7 + 4, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
					local1027 = new Class5_Sub5(arg4, 2, local987, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
				}
				Static71.method1355(arg8, arg1, arg6, local155, local1012, local1027, Static201.anIntArray399[arg7], Static201.anIntArray399[local987], local188);
				if (local50.aBoolean55 && arg5) {
					if (arg7 == 0) {
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6] |= 0x249;
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6 + 1] |= 0x492;
					} else if (arg7 == 1) {
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6 + 1] |= 0x492;
						Static191.anIntArrayArrayArray11[arg8][arg1 + 1][arg6] |= 0x249;
					} else if (arg7 == 2) {
						Static191.anIntArrayArrayArray11[arg8][arg1 + 1][arg6] |= 0x249;
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6] |= 0x492;
					} else if (arg7 == 3) {
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6] |= 0x492;
						Static191.anIntArrayArrayArray11[arg8][arg1][arg6] |= 0x249;
					}
				}
				if (local50.anInt965 != 0 && arg2 != null) {
					arg2.method3262(arg6, local50.aBoolean53, arg3, arg7, arg1);
				}
				if (local50.anInt978 != 16) {
					Static13.method307(arg8, arg1, arg6, local50.anInt978);
				}
			} else if (arg3 == 3) {
				if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
					local286 = local50.method691(local128, local171, arg5, local155, arg7, local163, 3);
					local274 = local286.aClass5_3;
				} else {
					local274 = new Class5_Sub5(arg4, 3, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
				}
				Static71.method1355(arg8, arg1, arg6, local155, local274, null, Static123.anIntArray214[arg7], 0, local188);
				if (local50.aBoolean48 && arg5) {
					if (arg7 == 0) {
						Static136.aByteArrayArrayArray7[arg8][arg1][arg6 + 1] = 50;
					} else if (arg7 == 1) {
						Static136.aByteArrayArrayArray7[arg8][arg1 + 1][arg6 + 1] = 50;
					} else if (arg7 == 2) {
						Static136.aByteArrayArrayArray7[arg8][arg1 + 1][arg6] = 50;
					} else if (arg7 == 3) {
						Static136.aByteArrayArrayArray7[arg8][arg1][arg6] = 50;
					}
				}
				if (local50.anInt965 != 0 && arg2 != null) {
					arg2.method3262(arg6, local50.aBoolean53, arg3, arg7, arg1);
				}
			} else if (arg3 == 9) {
				if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
					local286 = local50.method691(local128, local171, arg5, local155, arg7, local163, arg3);
					local274 = local286.aClass5_3;
				} else {
					local274 = new Class5_Sub5(arg4, arg3, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
				}
				Static196.method3328(arg8, arg1, arg6, local155, 1, 1, local274, 0, local188);
				if (local50.anInt965 != 0 && arg2 != null) {
					arg2.method3265(local64, local61, local50.aBoolean53, arg6, arg1);
				}
				if (local50.anInt978 != 16) {
					Static13.method307(arg8, arg1, arg6, local50.anInt978);
				}
			} else if (arg3 == 4) {
				if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
					local286 = local50.method691(local128, local171, arg5, local155, arg7, local163, 4);
					local274 = local286.aClass5_3;
				} else {
					local274 = new Class5_Sub5(arg4, 4, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
				}
				Static62.method1200(arg8, arg1, arg6, local155, local274, null, Static201.anIntArray399[arg7], 0, 0, 0, local188, (Class74) local217);
			} else {
				@Pc(1551) long local1551;
				@Pc(1587) Class5 local1587;
				@Pc(1599) Class1_Sub2_Sub11 local1599;
				if (arg3 == 5) {
					local987 = 16;
					local1551 = Static195.method3315(arg8, arg1, arg6);
					if (local1551 != 0L) {
						local987 = Static37.method702(Integer.MAX_VALUE & (int) (local1551 >>> 32)).anInt978;
					}
					if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
						local1599 = local50.method691(local128, local171, arg5, local155, arg7, local163, 4);
						local1587 = local1599.aClass5_3;
					} else {
						local1587 = new Class5_Sub5(arg4, 4, arg7, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
					}
					Static62.method1200(arg8, arg1, arg6, local155, local1587, null, Static201.anIntArray399[arg7], 0, local987 * Static204.anIntArray402[arg7], Static4.anIntArray409[arg7] * local987, local188, (Class74) local217);
				} else if (arg3 == 6) {
					local1551 = Static195.method3315(arg8, arg1, arg6);
					local987 = 8;
					if (local1551 != 0L) {
						local987 = Static37.method702(Integer.MAX_VALUE & (int) (local1551 >>> 32)).anInt978 / 2;
					}
					if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
						local1599 = local50.method691(local128, local171, arg5, local155, arg7 + 4, local163, 4);
						local1587 = local1599.aClass5_3;
					} else {
						local1587 = new Class5_Sub5(arg4, 4, arg7 + 4, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
					}
					Static62.method1200(arg8, arg1, arg6, local155, local1587, null, 256, arg7, local987 * Static4.anIntArray408[arg7], local987 * Static87.anIntArray177[arg7], local188, (Class74) local217);
				} else if (arg3 == 7) {
					@Pc(1734) int local1734 = arg7 + 2 & 0x3;
					if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
						@Pc(1755) Class1_Sub2_Sub11 local1755 = local50.method691(local128, local171, arg5, local155, local1734 + 4, local163, 4);
						local274 = local1755.aClass5_3;
					} else {
						local274 = new Class5_Sub5(arg4, 4, local1734 + 4, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
					}
					Static62.method1200(arg8, arg1, arg6, local155, local274, null, 256, local1734, 0, 0, local188, (Class74) local217);
				} else if (arg3 == 8) {
					local987 = 8;
					local1551 = Static195.method3315(arg8, arg1, arg6);
					if (local1551 != 0L) {
						local987 = Static37.method702((int) (local1551 >>> 32) & Integer.MAX_VALUE).anInt978 / 2;
					}
					@Pc(1822) int local1822 = arg7 + 2 & 0x3;
					@Pc(1864) Class5 local1864;
					if (local50.anInt985 == -1 && local50.anIntArray85 == null) {
						@Pc(1878) Class1_Sub2_Sub11 local1878 = local50.method691(local128, local171, arg5, local155, arg7 + 4, local163, 4);
						local1587 = local1878.aClass5_3;
						@Pc(1894) Class1_Sub2_Sub11 local1894 = local50.method691(local128, local171, arg5, local155, local1822 + 4, local163, 4);
						local1864 = local1894.aClass5_3;
					} else {
						local1587 = new Class5_Sub5(arg4, 4, arg7 + 4, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
						local1864 = new Class5_Sub5(arg4, 4, local1822 + 4, arg9, arg1, arg6, local50.anInt985, local50.aBoolean49, null);
					}
					Static62.method1200(arg8, arg1, arg6, local155, local1587, local1864, 256, arg7, Static4.anIntArray408[arg7] * local987, local987 * Static87.anIntArray177[arg7], local188, (Class74) local217);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)Z")
	public static boolean method882(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V")
	public static void method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local13 << 1;
		@Pc(25) int local25 = arg2 << 1;
		@Pc(29) int local29 = local17 << 1;
		@Pc(38) int local38 = local17 - local21 * (local25 - 1);
		@Pc(47) int local47 = local29 + (1 - local25) * local13;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local29 * 3;
		@Pc(79) int local79 = local21 * ((arg2 << 1) - 3);
		@Pc(85) int local85 = local55;
		@Pc(107) int local107;
		@Pc(116) int local116;
		if (arg1 >= Static13.anInt308 && arg1 <= Static52.anInt1338) {
			local107 = Static177.method3022(Static63.anInt1608, arg3 + arg4, Static63.anInt1595);
			local116 = Static177.method3022(Static63.anInt1608, arg3 - arg4, Static63.anInt1595);
			Static39.method731(Static98.anIntArrayArray16[arg1], local116, local107, arg0);
		}
		@Pc(130) int local130 = local51 * (arg2 - 1);
		while (local9 > 0) {
			local9--;
			local107 = arg1 - local9;
			local116 = arg1 + local9;
			if (local47 < 0) {
				while (local47 < 0) {
					local7++;
					local47 += local63;
					local63 += local55;
					local38 += local85;
					local85 += local55;
				}
			}
			if (local38 < 0) {
				local38 += local85;
				local85 += local55;
				local7++;
				local47 += local63;
				local63 += local55;
			}
			local47 += -local130;
			if (local116 >= Static13.anInt308 && Static52.anInt1338 >= local107) {
				@Pc(210) int local210 = Static177.method3022(Static63.anInt1608, arg3 + local7, Static63.anInt1595);
				@Pc(219) int local219 = Static177.method3022(Static63.anInt1608, arg3 - local7, Static63.anInt1595);
				if (local107 >= Static13.anInt308) {
					Static39.method731(Static98.anIntArrayArray16[local107], local219, local210, arg0);
				}
				if (Static52.anInt1338 >= local116) {
					Static39.method731(Static98.anIntArrayArray16[local116], local219, local210, arg0);
				}
			}
			local130 -= local51;
			local38 += -local79;
			local79 -= local51;
		}
	}
}
