import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public static int anInt2608 = 0;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "Z")
	public static boolean aBoolean178 = true;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
	public static int anInt2628 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V")
	public static void method2185() {
		Static329.anInt6323 = 1;
		Static240.anInt4833 = 2;
		Static177.aClass144_46 = null;
		Static178.anInt3536 = 0;
		Static190.anInt3890 = -1;
		Static226.aBoolean305 = false;
		Static281.anInt5587 = -1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIZ[[[Lclient!jd;I)Z")
	public static boolean method2186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class106[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static347.anInt6633 & 0xFF);
		if (Static247.aByteArrayArrayArray9[Static322.anInt6250][arg4][arg0] == local14) {
			return false;
		} else if ((Static1.aByteArrayArrayArray1[Static322.anInt6250][arg4][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			Static350.anIntArray547[0] = arg4;
			@Pc(48) int local48 = local39 + 1;
			Class170.lb[0] = arg0;
			Static247.aByteArrayArrayArray9[Static322.anInt6250][arg4][arg0] = local14;
			while (local48 != local41) {
				@Pc(66) int local66 = Static350.anIntArray547[local41] & 0xFFFF;
				@Pc(74) int local74 = Static350.anIntArray547[local41] >> 16 & 0xFF;
				@Pc(82) int local82 = Static350.anIntArray547[local41] >> 24 & 0xFF;
				@Pc(88) int local88 = Class170.lb[local41] & 0xFFFF;
				@Pc(96) int local96 = Class170.lb[local41] >> 16 & 0xFF;
				local41 = local41 + 1 & 0xFFF;
				@Pc(104) boolean local104 = false;
				if ((Static1.aByteArrayArrayArray1[Static322.anInt6250][local66][local88] & 0x4) == 0) {
					local104 = true;
				}
				@Pc(121) boolean local121 = false;
				@Pc(163) int local163;
				@Pc(202) int local202;
				label231: for (@Pc(125) int local125 = Static322.anInt6250 + 1; local125 <= 3; local125++) {
					if ((Static1.aByteArrayArrayArray1[local125][local66][local88] & 0x8) == 0) {
						@Pc(305) Class67_Sub3 local305;
						@Pc(315) int local315;
						@Pc(294) Class106 local294;
						@Pc(300) Class64 local300;
						if (local104 && arg3[local125][local66][local88] != null) {
							if (arg3[local125][local66][local88].aClass67_Sub2_1 != null) {
								local163 = Static200.method3616(local74);
								if (arg3[local125][local66][local88].aClass67_Sub2_1.anInt4509 == local163 || arg3[local125][local66][local88].aClass67_Sub2_2 != null && arg3[local125][local66][local88].aClass67_Sub2_2.anInt4509 == local163) {
									continue;
								}
								if (local82 != 0) {
									local202 = Static200.method3616(local82);
									if (arg3[local125][local66][local88].aClass67_Sub2_1.anInt4509 == local202 || arg3[local125][local66][local88].aClass67_Sub2_2 != null && arg3[local125][local66][local88].aClass67_Sub2_2.anInt4509 == local202) {
										continue;
									}
								}
								if (local96 != 0) {
									local202 = Static200.method3616(local96);
									if (local202 == arg3[local125][local66][local88].aClass67_Sub2_1.anInt4509 || arg3[local125][local66][local88].aClass67_Sub2_2 != null && arg3[local125][local66][local88].aClass67_Sub2_2.anInt4509 == local202) {
										continue;
									}
								}
							}
							local294 = arg3[local125][local66][local88];
							if (local294.aClass64_4 != null) {
								for (local300 = local294.aClass64_4; local300 != null; local300 = local300.aClass64_2) {
									local305 = local300.aClass67_Sub3_1;
									if (local305 instanceof Interface7) {
										@Pc(311) Interface7 local311 = (Interface7) local305;
										local315 = local311.method5414();
										@Pc(319) int local319 = local311.method5413();
										if (local315 == 21) {
											local315 = 19;
										}
										@Pc(332) int local332 = local315 | local319 << 6;
										if (local332 == local74 || local82 != 0 && local332 == local82 || local96 != 0 && local96 == local332) {
											continue label231;
										}
									}
								}
							}
						}
						local294 = arg3[local125][local66][local88];
						if (local294 != null && local294.aClass64_4 != null) {
							for (local300 = local294.aClass64_4; local300 != null; local300 = local300.aClass64_2) {
								local305 = local300.aClass67_Sub3_1;
								if (local305.aShort93 != local305.aShort91 || local305.aShort90 != local305.aShort92) {
									for (@Pc(397) int local397 = local305.aShort91; local397 <= local305.aShort93; local397++) {
										for (local315 = local305.aShort90; local315 <= local305.aShort92; local315++) {
											Static247.aByteArrayArrayArray9[local125][local397][local315] = local14;
										}
									}
								}
							}
						}
						Static247.aByteArrayArrayArray9[local125][local66][local88] = local14;
						local121 = true;
					}
				}
				if (local121) {
					local163 = Static108.aClass77Array2[Static322.anInt6250 + 1].method4122(local66, local88);
					if (local163 > Static78.anIntArray99[arg1]) {
						Static78.anIntArray99[arg1] = local163;
					}
					local202 = local66 << 7;
					@Pc(475) int local475 = local88 << 7;
					if (Static34.anIntArray49[arg1] > local202) {
						Static34.anIntArray49[arg1] = local202;
					} else if (Static189.anIntArray45[arg1] < local202) {
						Static189.anIntArray45[arg1] = local202;
					}
					if (local475 < Static341.anIntArray540[arg1]) {
						Static341.anIntArray540[arg1] = local475;
					} else if (Static30.anIntArray34[arg1] < local475) {
						Static30.anIntArray34[arg1] = local475;
					}
				}
				if (!local104) {
					if (local66 >= 1 && Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 - 1][local88] != local14) {
						Static350.anIntArray547[local48] = 0xD3000000 | 0x120000 | local66 - 1;
						Class170.lb[local48] = local88 | 0x130000;
						Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 - 1][local88] = local14;
						local48 = local48 + 1 & 0xFFF;
					}
					local88++;
					if (local88 < Static240.anInt4832) {
						if (local66 - 1 >= 0 && local14 != Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 - 1][local88] && (Static1.aByteArrayArrayArray1[Static322.anInt6250][local66][local88] & 0x4) == 0 && (Static1.aByteArrayArrayArray1[Static322.anInt6250][local66 - 1][local88 - 1] & 0x4) == 0) {
							Static350.anIntArray547[local48] = local66 - 1 | 0x120000 | 0x52000000;
							Class170.lb[local48] = local88 | 0x130000;
							local48 = local48 + 1 & 0xFFF;
							Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 - 1][local88] = local14;
						}
						if (local14 != Static247.aByteArrayArrayArray9[Static322.anInt6250][local66][local88]) {
							Static350.anIntArray547[local48] = local66 | 0x520000 | 0x13000000;
							Class170.lb[local48] = local88 | 0x530000;
							Static247.aByteArrayArrayArray9[Static322.anInt6250][local66][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (local66 + 1 < Static24.anInt454 && Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 + 1][local88] != local14 && (Static1.aByteArrayArrayArray1[Static322.anInt6250][local66][local88] & 0x4) == 0 && (Static1.aByteArrayArrayArray1[Static322.anInt6250][local66 + 1][local88 - 1] & 0x4) == 0) {
							Static350.anIntArray547[local48] = local66 + 1 | 0x520000 | 0x92000000;
							Class170.lb[local48] = local88 | 0x530000;
							local48 = local48 + 1 & 0xFFF;
							Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 + 1][local88] = local14;
						}
					}
					local88--;
					if (local66 + 1 < Static24.anInt454 && local14 != Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 + 1][local88]) {
						Static350.anIntArray547[local48] = local66 + 1 | 0x53000000 | 0x920000;
						Class170.lb[local48] = local88 | 0x930000;
						local48 = local48 + 1 & 0xFFF;
						Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 + 1][local88] = local14;
					}
					local88--;
					if (local88 >= 0) {
						if (local66 - 1 >= 0 && Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 - 1][local88] != local14 && (Static1.aByteArrayArrayArray1[Static322.anInt6250][local66][local88] & 0x4) == 0 && (Static1.aByteArrayArrayArray1[Static322.anInt6250][local66 - 1][local88 + 1] & 0x4) == 0) {
							Static350.anIntArray547[local48] = local66 - 1 | 0xD20000 | 0x12000000;
							Class170.lb[local48] = local88 | 0xD30000;
							Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 - 1][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static247.aByteArrayArrayArray9[Static322.anInt6250][local66][local88] != local14) {
							Static350.anIntArray547[local48] = 0x93000000 | 0xD20000 | local66;
							Class170.lb[local48] = local88 | 0xD30000;
							Static247.aByteArrayArrayArray9[Static322.anInt6250][local66][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (local66 + 1 < Static24.anInt454 && local14 != Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 + 1][local88] && (Static1.aByteArrayArrayArray1[Static322.anInt6250][local66][local88] & 0x4) == 0 && (Static1.aByteArrayArrayArray1[Static322.anInt6250][local66 + 1][local88 + 1] & 0x4) == 0) {
							Static350.anIntArray547[local48] = local66 + 1 | 0x920000 | 0xD2000000;
							Class170.lb[local48] = local88 | 0x930000;
							local48 = local48 + 1 & 0xFFF;
							Static247.aByteArrayArrayArray9[Static322.anInt6250][local66 + 1][local88] = local14;
						}
					}
				}
			}
			if (Static78.anIntArray99[arg1] != -1000000) {
				Static78.anIntArray99[arg1] += 10;
				Static34.anIntArray49[arg1] -= 50;
				Static189.anIntArray45[arg1] += 50;
				Static30.anIntArray34[arg1] += 50;
				Static341.anIntArray540[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public static void method2187() {
		@Pc(5) Class26 local5 = Static253.aClass26_45;
		synchronized (Static253.aClass26_45) {
			Static253.aClass26_45.method329(5);
		}
		local5 = Static11.aClass26_1;
		synchronized (Static11.aClass26_1) {
			Static11.aClass26_1.method329(5);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method2188(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static329.anInt6331 : Static6.anInt4016) + local19;
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(35) Class11_Sub4_Sub16 local35 = Static117.method1777(local29);
			if (local35.aBoolean353 && local35.method4593().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static112.anInt2070 = -1;
					Static333.aShortArray112 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(70) short[] local70 = new short[local11.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local13; local72++) {
						local70[local72] = local11[local72];
					}
					local11 = local70;
				}
				local11[local13++] = (short) local29;
			}
		}
		Static34.anInt640 = 0;
		Static112.anInt2070 = local13;
		Static333.aShortArray112 = local11;
		@Pc(105) String[] local105 = new String[Static112.anInt2070];
		for (@Pc(107) int local107 = 0; local107 < Static112.anInt2070; local107++) {
			local105[local107] = Static117.method1777(local11[local107]).method4593();
		}
		Static315.method5282(Static333.aShortArray112, local105);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)V")
	public static void method2190(@OriginalArg(1) int arg0) {
		Static30.anIntArray34 = new int[arg0];
		Static341.anIntArray540 = new int[arg0];
		Static78.anIntArray99 = new int[arg0];
		Static34.anIntArray49 = new int[arg0];
		Static189.anIntArray45 = new int[arg0];
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIZILclient!uo;Lclient!uo;ZLclient!nj;Lclient!ai;)Lclient!sg;")
	public static Class97 method2191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class129 arg6, @OriginalArg(8) Class129 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class140 arg9, @OriginalArg(11) Class9 arg10) {
		@Pc(15) Class97 local15 = Static182.method3090(arg7, arg3, arg0, arg9, arg1, arg5, arg2);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class170 local23 = Static283.method4717(arg2);
		@Pc(33) int local33;
		if (arg1 > 1 && local23.anIntArray405 != null) {
			@Pc(31) int local31 = -1;
			for (local33 = 0; local33 < 10; local33++) {
				if (local23.anIntArray404[local33] <= arg1 && local23.anIntArray404[local33] != 0) {
					local31 = local23.anIntArray405[local33];
				}
			}
			if (local31 != -1) {
				local23 = Static283.method4717(local31);
			}
		}
		@Pc(73) Class31 local73 = Static119.method1790(Static306.aClass144_98, local23.anInt5328);
		if (local73 == null) {
			return null;
		}
		if (local23.aShortArray96 != null) {
			for (local33 = 0; local33 < local23.aShortArray96.length; local33++) {
				if (local23.aByteArray88 == null || local23.aByteArray88.length <= local33) {
					local73.method443(local23.aShortArray96[local33], local23.aShortArray95[local33]);
				} else {
					local73.method443(local23.aShortArray96[local33], Static324.aShortArray113[local23.aByteArray88[local33] & 0xFF]);
				}
			}
		}
		if (local23.aShortArray98 != null) {
			for (local33 = 0; local33 < local23.aShortArray98.length; local33++) {
				local73.method434(local23.aShortArray98[local33], local23.aShortArray97[local33]);
			}
		}
		if (arg9 != null) {
			for (local33 = 0; local33 < 5; local33++) {
				if (arg9.anIntArray328[local33] < Static229.aShortArrayArray12[local33].length) {
					local73.method443(Static307.aShortArray92[local33], Static229.aShortArrayArray12[local33][arg9.anIntArray328[local33]]);
				}
				if (Static169.aShortArrayArray16[local33].length > arg9.anIntArray328[local33]) {
					local73.method443(Static45.aShortArray38[local33], Static169.aShortArrayArray16[local33][arg9.anIntArray328[local33]]);
				}
			}
		}
		@Pc(222) short local222 = 1024;
		@Pc(224) boolean local224 = false;
		if (local23.anInt5306 != 128 || local23.anInt5292 != 128 || local23.anInt5323 != 128) {
			local222 = 1031;
			local224 = true;
		}
		@Pc(260) Class126 local260 = arg6.method4929(local73, local222, 0, local23.anInt5319 + 64, local23.anInt5289 + 768);
		if (!local260.method3161()) {
			return null;
		}
		if (local224) {
			local260.method3134(local23.anInt5306, local23.anInt5292, local23.anInt5323);
		}
		@Pc(277) Class97 local277 = null;
		if (local23.anInt5337 != -1) {
			local277 = method2191(0, 10, local23.anInt5335, 1, true, 0, arg6, arg7, true, arg9, arg10);
			if (local277 == null) {
				return null;
			}
		} else if (local23.anInt5304 != -1) {
			local277 = method2191(0, arg1, local23.anInt5318, arg3, false, arg5, arg6, arg7, true, arg9, arg10);
			if (local277 == null) {
				return null;
			}
		}
		@Pc(327) int local327 = local23.anInt5338;
		if (arg4) {
			local327 = (int) ((double) local327 * 1.5D);
		} else if (arg3 == 2) {
			local327 = (int) ((double) local327 * 1.04D);
		}
		arg6.method4996(16, 16, 512, 512);
		@Pc(357) Class61 local357 = arg6.method4983();
		local357.method3663();
		arg6.method4971(local357);
		arg6.method4937(1.0F);
		arg6.method4925(16777215, 1.0F, (float) 1, -50.0F, -10.0F, -50.0F);
		@Pc(377) Class61 local377 = arg6.method4979();
		local377.method3659(-local23.anInt5320 << 3);
		local377.method3657(local23.anInt5334 << 3);
		local377.method3665(local23.anInt5313, (local327 * Class140.anIntArray330[local23.anInt5331 << 3] >> 15) + local23.anInt5302 - (local260.method3155() / 2), local23.anInt5302 + (Class140.anIntArray329[local23.anInt5331 << 3] * local327 >> 15));
		local377.method3664(local23.anInt5331 << 3);
		@Pc(436) int local436 = arg6.method4976();
		@Pc(439) int local439 = arg6.method5016();
		arg6.method5012(50, Integer.MAX_VALUE);
		arg6.method4944();
		arg6.method4966();
		arg6.method4945(0, 0, 36, 32, 0, 0);
		local260.method3139(local377, null, 1);
		arg6.method5012(local436, local439);
		@Pc(471) int[] local471 = arg6.method5001();
		if (arg3 >= 1) {
			local471 = Static275.method4657(local471, -16777215);
			if (arg3 >= 2) {
				local471 = Static275.method4657(local471, -1);
			}
		}
		if (arg5 != 0) {
			Static226.method4029(local471, arg5);
		}
		arg6.method4958(local471, 36, 36, 32).method5555(0, 0);
		if (local23.anInt5337 != -1) {
			local277.method5555(0, 0);
		} else if (local23.anInt5304 != -1) {
			local277.method5555(0, 0);
		}
		if (arg0 == 1 || arg0 == 2 && (local23.anInt5333 == 1 || arg1 != 1) && arg1 != -1) {
			arg10.method3573(-16777215, 9, Static70.method1055(arg1), 0, -256);
		}
		local471 = arg6.method5001();
		for (@Pc(562) int local562 = 0; local562 < local471.length; local562++) {
			if ((local471[local562] & 0xFFFFFF) == 0) {
				local471[local562] = 0;
			} else {
				local471[local562] |= 0xFF000000;
			}
		}
		@Pc(606) Class97 local606;
		if (arg8) {
			local606 = arg6.method4958(local471, 36, 36, 32);
		} else {
			local606 = arg7.method4958(local471, 36, 36, 32);
		}
		if (!arg8) {
			@Pc(622) Class165 local622 = new Class165();
			local622.anInt5181 = arg5;
			local622.anInt5178 = arg0;
			local622.aBoolean337 = arg9 != null;
			local622.anInt5175 = arg3;
			local622.anInt5176 = arg1;
			local622.anInt5179 = arg2;
			local622.anInt5174 = arg7.anInt5876;
			Static72.aClass54_1.method930(local606, local622);
		}
		return local606;
	}
}
