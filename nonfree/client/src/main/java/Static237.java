import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!ec;")
	public static Class46 aClass46_32 = new Class46(64);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!f;III)V")
	public static void method3913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class52 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) long local9 = 0L;
		if (arg4 == 0) {
			local9 = Static243.method3054(arg2, arg0, arg1);
		} else if (arg4 == 1) {
			local9 = Static103.method1930(arg2, arg0, arg1);
		} else if (arg4 == 2) {
			local9 = Static54.method1072(arg2, arg0, arg1);
		} else if (arg4 == 3) {
			local9 = Static219.method3696(arg2, arg0, arg1);
		}
		@Pc(62) int local62 = (int) local9 >> 20 & 0x3;
		@Pc(69) int local69 = (int) (local9 >>> 32) & Integer.MAX_VALUE;
		@Pc(73) Class143 local73 = Static218.method3692(local69);
		if (local73.method3649()) {
			Static43.method830(local73, arg0, arg2, arg1);
		}
		@Pc(96) int local96 = (int) local9 >> 14 & 0x1F;
		if (local9 == 0L) {
			return;
		}
		@Pc(104) Class36 local104 = null;
		@Pc(106) Class36 local106 = null;
		if (arg4 == 0) {
			@Pc(116) Class168 local116 = Static243.method3052(arg2, arg0, arg1);
			if (local116 != null) {
				local104 = local116.aClass36_10;
				local106 = local116.aClass36_9;
			}
			if (local73.anInt4526 != 0) {
				arg3.method1245(local62, arg1, arg0, local73.aBoolean369, local96, !local73.aBoolean375);
			}
		} else if (arg4 == 1) {
			@Pc(153) Class50 local153 = Static13.method295(arg2, arg0, arg1);
			if (local153 != null) {
				local106 = local153.aClass36_2;
				local104 = local153.aClass36_3;
			}
		} else if (arg4 == 2) {
			@Pc(171) Class34 local171 = Static174.method3011(arg2, arg0, arg1);
			if (local171 != null) {
				local104 = local171.aClass36_1;
			}
			if (local73.anInt4526 != 0 && arg0 + local73.anInt4496 < 104 && local73.anInt4496 + arg1 < 104 && arg0 + local73.anInt4494 < 104 && arg1 + local73.anInt4494 < 104) {
				arg3.method1248(!local73.aBoolean375, arg0, arg1, local62, local73.anInt4496, local73.anInt4494, local73.aBoolean369);
			}
		} else if (arg4 == 3) {
			@Pc(247) Class65 local247 = Static161.method2803(arg2, arg0, arg1);
			if (local247 != null) {
				local104 = local247.aClass36_5;
			}
			if (local73.anInt4526 == 1) {
				arg3.method1241(arg0, arg1);
			}
		}
		if (local73.anIntArray372 != null) {
			local73 = local73.method3641();
		}
		if (!Static60.aBoolean106 || local73 == null || !local73.aBoolean368) {
			return;
		}
		if (local96 == 2) {
			if (local104 instanceof Class36_Sub4) {
				((Class36_Sub4) local104).method3395();
			} else {
				Static100.method1914(arg0, 0, arg5, local96, local73, 0, local62 + 4, arg1);
			}
			if (local106 instanceof Class36_Sub4) {
				((Class36_Sub4) local106).method3395();
			} else {
				Static100.method1914(arg0, 0, arg5, local96, local73, 0, local62 + 1 & 0x3, arg1);
			}
		} else if (local96 == 5) {
			if (local104 instanceof Class36_Sub4) {
				((Class36_Sub4) local104).method3395();
			} else {
				Static100.method1914(arg0, Static215.anIntArray365[local62] * 8, arg5, 4, local73, Static114.anIntArray103[local62] * 8, local62, arg1);
			}
		} else if (local96 == 6) {
			if (local104 instanceof Class36_Sub4) {
				((Class36_Sub4) local104).method3395();
			} else {
				Static100.method1914(arg0, Static8.anIntArray11[local62] * 8, arg5, 4, local73, Static295.anIntArray525[local62] * 8, local62 + 4, arg1);
			}
		} else if (local96 == 7) {
			if (local104 instanceof Class36_Sub4) {
				((Class36_Sub4) local104).method3395();
			} else {
				Static100.method1914(arg0, 0, arg5, 4, local73, 0, (local62 + 2 & 0x3) + 4, arg1);
			}
		} else if (local96 == 8) {
			if (local104 instanceof Class36_Sub4) {
				((Class36_Sub4) local104).method3395();
			} else {
				Static100.method1914(arg0, Static8.anIntArray11[local62] * 8, arg5, 4, local73, Static295.anIntArray525[local62] * 8, local62 + 4, arg1);
			}
			if (local106 instanceof Class36_Sub4) {
				((Class36_Sub4) local106).method3395();
			} else {
				Static100.method1914(arg0, Static8.anIntArray11[local62] * 8, arg5, 4, local73, Static295.anIntArray525[local62] * 8, (local62 + 2 & 0x3) + 4, arg1);
			}
		} else if (local96 == 11) {
			if (local104 instanceof Class36_Sub4) {
				((Class36_Sub4) local104).method3395();
			} else {
				Static100.method1914(arg0, 0, arg5, 10, local73, 0, local62 + 4, arg1);
			}
		} else if (local104 instanceof Class36_Sub4) {
			((Class36_Sub4) local104).method3395();
		} else {
			Static100.method1914(arg0, 0, arg5, local96, local73, 0, local62, arg1);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!mn;)I")
	public static int method3914(@OriginalArg(1) int arg0, @OriginalArg(2) Class115 arg1) {
		if (arg1.anIntArrayArray29 == null || arg0 >= arg1.anIntArrayArray29.length) {
			return -2;
		}
		try {
			@Pc(32) int[] local32 = arg1.anIntArrayArray29[arg0];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(38) byte local38 = 0;
			while (true) {
				@Pc(43) int local43 = local32[local36++];
				@Pc(45) int local45 = 0;
				@Pc(47) byte local47 = 0;
				if (local43 == 0) {
					return local34;
				}
				if (local43 == 1) {
					local45 = Static152.anIntArray230[local32[local36++]];
				}
				if (local43 == 2) {
					local45 = Static203.anIntArray350[local32[local36++]];
				}
				if (local43 == 3) {
					local45 = Static176.anIntArray304[local32[local36++]];
				}
				@Pc(99) int local99;
				@Pc(110) Class115 local110;
				@Pc(115) int local115;
				@Pc(128) int local128;
				if (local43 == 4) {
					local99 = local32[local36++] << 16;
					@Pc(106) int local106 = local99 + local32[local36++];
					local110 = Static90.method1692(local106);
					local115 = local32[local36++];
					if (local115 != -1 && (!Static152.method2616(local115).aBoolean409 || Static243.aBoolean323)) {
						for (local128 = 0; local128 < local110.anIntArray271.length; local128++) {
							if (local110.anIntArray271[local128] == local115 + 1) {
								local45 += local110.anIntArray270[local128];
							}
						}
					}
				}
				if (local43 == 15) {
					local47 = 1;
				}
				if (local43 == 5) {
					local45 = Static249.anIntArray446[local32[local36++]];
				}
				if (local43 == 6) {
					local45 = Class78.anIntArray161[Static203.anIntArray350[local32[local36++]] - 1];
				}
				if (local43 == 16) {
					local47 = 2;
				}
				if (local43 == 7) {
					local45 = Static249.anIntArray446[local32[local36++]] * 100 / 46875;
				}
				if (local43 == 17) {
					local47 = 3;
				}
				if (local43 == 8) {
					local45 = Static111.aClass36_Sub3_Sub2_1.anInt5159;
				}
				if (local43 == 9) {
					for (local99 = 0; local99 < 25; local99++) {
						if (Static112.aBooleanArray11[local99]) {
							local45 += Static203.anIntArray350[local99];
						}
					}
				}
				if (local43 == 10) {
					local99 = local32[local36++] << 16;
					local99 += local32[local36++];
					local110 = Static90.method1692(local99);
					local115 = local32[local36++];
					if (local115 != -1 && (!Static152.method2616(local115).aBoolean409 || Static243.aBoolean323)) {
						for (local128 = 0; local128 < local110.anIntArray271.length; local128++) {
							if (local115 + 1 == local110.anIntArray271[local128]) {
								local45 = 999999999;
								break;
							}
						}
					}
				}
				if (local43 == 11) {
					local45 = Static42.anInt1046;
				}
				if (local43 == 12) {
					local45 = Static202.anInt4211;
				}
				if (local43 == 13) {
					local99 = Static249.anIntArray446[local32[local36++]];
					@Pc(337) int local337 = local32[local36++];
					local45 = (0x1 << local337 & local99) == 0 ? 0 : 1;
				}
				if (local43 == 14) {
					local99 = local32[local36++];
					local45 = Static152.method2620(local99);
				}
				if (local43 == 18) {
					local45 = Static125.anInt5772 + (Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7);
				}
				if (local43 == 19) {
					local45 = Static203.anInt4236 + (Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7);
				}
				if (local43 == 20) {
					local45 = local32[local36++];
				}
				if (local47 == 0) {
					if (local38 == 0) {
						local34 += local45;
					}
					if (local38 == 1) {
						local34 -= local45;
					}
					if (local38 == 2 && local45 != 0) {
						local34 /= local45;
					}
					if (local38 == 3) {
						local34 *= local45;
					}
					local38 = 0;
				} else {
					local38 = local47;
				}
			}
		} catch (@Pc(447) Exception local447) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	public static void method3915(@OriginalArg(1) int arg0) {
		Static112.anIntArray165 = new int[arg0];
		Static40.anIntArray60 = new int[arg0];
		Static162.anIntArray257 = new int[arg0];
		Static212.anIntArray362 = new int[arg0];
		Static170.anIntArray294 = new int[arg0];
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	public static void method3916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = arg4; local3 <= arg4 + arg1; local3++) {
			for (local10 = arg3; local10 <= arg3 + arg2; local10++) {
				if (local10 >= 0 && local10 < 104 && local3 >= 0 && local3 < 104) {
					Static170.aByteArrayArrayArray11[arg0][local10][local3] = 127;
				}
			}
		}
		for (local3 = arg4; local3 < arg1 + arg4; local3++) {
			for (local10 = arg3; local10 < arg2 + arg3; local10++) {
				if (local10 >= 0 && local10 < 104 && local3 >= 0 && local3 < 104) {
					Static141.anIntArrayArrayArray4[arg0][local10][local3] = arg0 <= 0 ? 0 : Static141.anIntArrayArrayArray4[arg0 - 1][local10][local3];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local3 = arg4 + 1; local3 < arg1 + arg4; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static141.anIntArrayArrayArray4[arg0][arg3][local3] = Static141.anIntArrayArrayArray4[arg0][arg3 - 1][local3];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local3 = arg3 + 1; local3 < arg2 + arg3; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static141.anIntArrayArrayArray4[arg0][local3][arg4] = Static141.anIntArrayArrayArray4[arg0][local3][arg4 - 1];
				}
			}
		}
		if (arg3 < 0 || arg4 < 0 || arg3 >= 104 || arg4 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && Static141.anIntArrayArrayArray4[arg0][arg3 - 1][arg4] != 0) {
				Static141.anIntArrayArrayArray4[arg0][arg3][arg4] = Static141.anIntArrayArrayArray4[arg0][arg3 - 1][arg4];
			} else if (arg4 > 0 && Static141.anIntArrayArrayArray4[arg0][arg3][arg4 - 1] != 0) {
				Static141.anIntArrayArrayArray4[arg0][arg3][arg4] = Static141.anIntArrayArrayArray4[arg0][arg3][arg4 - 1];
			} else if (arg3 > 0 && arg4 > 0 && Static141.anIntArrayArrayArray4[arg0][arg3 - 1][arg4 - 1] != 0) {
				Static141.anIntArrayArrayArray4[arg0][arg3][arg4] = Static141.anIntArrayArrayArray4[arg0][arg3 - 1][arg4 - 1];
			}
		} else if (arg3 > 0 && Static141.anIntArrayArrayArray4[arg0 - 1][arg3 - 1][arg4] != Static141.anIntArrayArrayArray4[arg0][arg3 - 1][arg4]) {
			Static141.anIntArrayArrayArray4[arg0][arg3][arg4] = Static141.anIntArrayArrayArray4[arg0][arg3 - 1][arg4];
		} else if (arg4 > 0 && Static141.anIntArrayArrayArray4[arg0 - 1][arg3][arg4 - 1] != Static141.anIntArrayArrayArray4[arg0][arg3][arg4 - 1]) {
			Static141.anIntArrayArrayArray4[arg0][arg3][arg4] = Static141.anIntArrayArrayArray4[arg0][arg3][arg4 - 1];
		} else if (arg3 > 0 && arg4 > 0 && Static141.anIntArrayArrayArray4[arg0 - 1][arg3 - 1][arg4 - 1] != Static141.anIntArrayArrayArray4[arg0][arg3 - 1][arg4 - 1]) {
			Static141.anIntArrayArrayArray4[arg0][arg3][arg4] = Static141.anIntArrayArrayArray4[arg0][arg3 - 1][arg4 - 1];
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
	public static void method3918(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static60.aBoolean106 && arg0) {
			local11 = 1;
			local13 = Static43.aByteArrayArray23;
		} else {
			local13 = Static75.aByteArrayArray34;
			local11 = 4;
		}
		for (@Pc(33) int local33 = 0; local33 < local11; local33++) {
			Static203.method3422();
			for (@Pc(44) int local44 = 0; local44 < 13; local44++) {
				for (@Pc(51) int local51 = 0; local51 < 13; local51++) {
					@Pc(62) int local62 = Static173.anIntArrayArrayArray8[local33][local44][local51];
					if (local62 != -1) {
						@Pc(73) int local73 = local62 >> 24 & 0x3;
						if (!arg0 || local73 == 0) {
							@Pc(84) int local84 = local62 >> 1 & 0x3;
							@Pc(90) int local90 = local62 >> 3 & 0x7FF;
							@Pc(96) int local96 = local62 >> 14 & 0x3FF;
							@Pc(106) int local106 = local90 / 8 + (local96 / 8 << 8);
							for (@Pc(108) int local108 = 0; local108 < Static63.anIntArray105.length; local108++) {
								if (local106 == Static63.anIntArray105[local108] && local13[local108] != null) {
									Static288.method4792(local44 * 8, local33, local51 * 8, arg0, (local96 & 0x7) * 8, local13[local108], Static98.aClass52Array1, local84, (local90 & 0x7) * 8, local73);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
