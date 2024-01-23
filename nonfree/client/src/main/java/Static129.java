import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString91 = "Loaded wordpack";

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII[BZ[Lclient!o;)[I")
	public static int[] method2026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class122[] arg6) {
		@Pc(21) int local21;
		@Pc(26) int local26;
		if (!arg5) {
			for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
				for (local21 = 0; local21 < 64; local21++) {
					for (local26 = 0; local26 < 64; local26++) {
						if (local21 + arg3 > 0 && arg3 + local21 < 103 && local26 + arg0 > 0 && arg0 + local26 < 103) {
							arg6[local16].anIntArrayArray28[local21 + arg3][local26 + arg0] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		local21 = arg3 + arg1;
		@Pc(102) byte local102;
		if (arg5) {
			local102 = 1;
		} else {
			local102 = 4;
		}
		@Pc(111) Class1_Sub14 local111 = new Class1_Sub14(arg4);
		local26 = arg0 + arg2;
		@Pc(133) int local133;
		for (@Pc(117) int local117 = 0; local117 < local102; local117++) {
			for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
				for (local133 = 0; local133 < 64; local133++) {
					Static300.method4498(false, local133 + arg0, local111, local117, 0, arg5, 0, arg3 + local126, 0, local26 + local133, local21 + local126);
				}
			}
		}
		@Pc(170) boolean local170 = false;
		@Pc(172) boolean local172 = false;
		@Pc(236) int local236;
		@Pc(247) int local247;
		@Pc(267) int local267;
		@Pc(302) int local302;
		@Pc(249) int local249;
		while (local111.aByteArray34.length > local111.anInt3290) {
			local133 = local111.method2595();
			if (local133 == 128) {
				Static195.anIntArray320[0] = local111.method2593();
				local170 = true;
				Static195.anIntArray320[1] = local111.method2623();
				Static195.anIntArray320[2] = local111.method2623();
				Static195.anIntArray320[3] = local111.method2623();
				Static195.anIntArray320[4] = local111.method2593();
			} else {
				if (local133 != 129) {
					local111.anInt3290--;
					break;
				}
				local172 = true;
				for (local236 = 0; local236 < 4; local236++) {
					@Pc(243) byte local243 = local111.method2598();
					if (local243 == 0) {
						local247 = arg3;
						local249 = arg0;
						if (arg0 < 0) {
							local249 = 0;
						} else if (arg0 >= 104) {
							local249 = 104;
						}
						local267 = arg3 + 64;
						if (local267 < 0) {
							local267 = 0;
						} else if (local267 >= 104) {
							local267 = 104;
						}
						if (arg3 < 0) {
							local247 = 0;
						} else if (arg3 >= 104) {
							local247 = 104;
						}
						local302 = arg0 + 64;
						if (local302 < 0) {
							local302 = 0;
						} else if (local302 >= 104) {
							local302 = 104;
						}
						while (local247 < local267) {
							while (local302 > local249) {
								Static159.aByteArrayArrayArray17[local236][local247][local249] = 0;
								local249++;
							}
							local247++;
						}
					} else if (local243 == 1) {
						for (local247 = 0; local247 < 64; local247 += 4) {
							for (local267 = 0; local267 < 64; local267 += 4) {
								@Pc(470) byte local470 = local111.method2598();
								for (local302 = arg3 + local247; local302 < arg3 + local247 + 4; local302++) {
									for (@Pc(489) int local489 = local267 + arg0; local489 < arg0 + local267 + 4; local489++) {
										if (local302 >= 0 && local302 < 104 && local489 >= 0 && local489 < 104) {
											Static159.aByteArrayArrayArray17[local236][local302][local489] = local470;
										}
									}
								}
							}
						}
					} else if (local243 == 2 && local236 > 0) {
						local247 = arg3;
						if (arg3 < 0) {
							local247 = 0;
						} else if (arg3 >= 104) {
							local247 = 104;
						}
						local267 = arg3 + 64;
						local249 = arg0;
						if (arg0 < 0) {
							local249 = 0;
						} else if (arg0 >= 104) {
							local249 = 104;
						}
						if (local267 < 0) {
							local267 = 0;
						} else if (local267 >= 104) {
							local267 = 104;
						}
						local302 = arg0 + 64;
						if (local302 < 0) {
							local302 = 0;
						} else if (local302 >= 104) {
							local302 = 104;
						}
						while (local267 > local247) {
							while (local302 > local249) {
								Static159.aByteArrayArrayArray17[local236][local247][local249] = Static159.aByteArrayArrayArray17[local236 - 1][local247][local249];
								local249++;
							}
							local247++;
						}
					}
				}
			}
		}
		@Pc(570) int local570;
		if (Static291.aBoolean404 && !arg5) {
			@Pc(542) Class135 local542 = null;
			while (true) {
				while (local111.anInt3290 < local111.aByteArray34.length) {
					local236 = local111.method2595();
					if (local236 == 0) {
						local542 = new Class135(local111);
					} else if (local236 == 1) {
						local570 = local111.method2595();
						if (local570 > 0) {
							for (local247 = 0; local247 < local570; local247++) {
								@Pc(585) Class170 local585 = new Class170(local111);
								if (local585.anInt5260 == 31) {
									@Pc(597) Class195 local597 = Static251.method3843(local111.method2593());
									local585.method4115(local597.anInt5922, local597.anInt5915, local597.anInt5916, local597.anInt5924);
								}
								local585.anInt5278 += arg3 << 7;
								local585.anInt5266 += arg0 << 7;
								local302 = local585.anInt5266 >> 7;
								local249 = local585.anInt5278 >> 7;
								if (local249 >= 0 && local302 >= 0 && local249 < 104 && local302 < 104) {
									local585.aBoolean377 = (Static94.aByteArrayArrayArray9[1][local249][local302] & 0x2) != 0;
									local585.anInt5279 = Static208.anIntArrayArrayArray11[local585.anInt5272][local249][local302] - local585.anInt5279;
									Static294.method4352(local585);
								}
							}
						}
					} else if (local236 == 2) {
						if (local542 == null) {
							local542 = new Class135();
						}
						local542.method3281(local111);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local542 == null) {
					local542 = new Class135();
				}
				for (local236 = 0; local236 < 8; local236++) {
					for (local570 = 0; local570 < 8; local570++) {
						local247 = local236 + (arg3 >> 3);
						local267 = local570 + (arg0 >> 3);
						if (local247 >= 0 && local247 < 13 && local267 >= 0 && local267 < 13) {
							Static20.aClass135ArrayArray1[local247][local267] = local542;
						}
					}
				}
				break;
			}
		}
		if (!local172) {
			for (local133 = 0; local133 < 4; local133++) {
				for (local236 = 0; local236 < 16; local236++) {
					for (local570 = 0; local570 < 16; local570++) {
						local267 = local570 + (arg0 >> 2);
						local247 = local236 + (arg3 >> 2);
						if (local247 >= 0 && local247 < 26 && local267 >= 0 && local267 < 26) {
							Static159.aByteArrayArrayArray17[local133][local247][local267] = 0;
						}
					}
				}
			}
		}
		return local170 ? Static195.anIntArray320 : null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!qm;[I[IZ[I)V")
	public static void method2027(@OriginalArg(0) Class22_Sub3_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(18) int local18 = 0; local18 < arg3.length; local18++) {
			@Pc(26) int local26 = arg3[local18];
			@Pc(30) int local30 = arg2[local18];
			@Pc(34) int local34 = arg1[local18];
			@Pc(36) int local36 = 0;
			while (local34 != 0 && arg0.aClass53Array3.length > local36) {
				if ((local34 & 0x1) != 0) {
					if (local26 == -1) {
						arg0.aClass53Array3[local36] = null;
					} else {
						@Pc(61) Class167 local61 = Static313.method4648(local26);
						@Pc(64) int local64 = local61.anInt5131;
						@Pc(69) Class53 local69 = arg0.aClass53Array3[local36];
						if (local69 != null) {
							if (local69.anInt1420 == local26) {
								if (local64 == 0) {
									local69 = arg0.aClass53Array3[local36] = null;
								} else if (local64 == 1) {
									local69.anInt1424 = 0;
									local69.anInt1422 = 0;
									local69.anInt1423 = 0;
									local69.anInt1421 = 1;
									local69.anInt1425 = local30;
									Static212.method3338(arg0.anInt4601, arg0 == Static229.aClass22_Sub3_Sub2_2, 0, local61, arg0.anInt4623);
								} else if (local64 == 2) {
									local69.anInt1423 = 0;
								}
							} else if (local61.anInt5114 >= Static313.method4648(local69.anInt1420).anInt5114) {
								local69 = arg0.aClass53Array3[local36] = null;
							}
						}
						if (local69 == null) {
							local69 = arg0.aClass53Array3[local36] = new Class53();
							local69.anInt1422 = 0;
							local69.anInt1425 = local30;
							local69.anInt1421 = 1;
							local69.anInt1420 = local26;
							local69.anInt1423 = 0;
							local69.anInt1424 = 0;
							Static212.method3338(arg0.anInt4601, arg0 == Static229.aClass22_Sub3_Sub2_2, 0, local61, arg0.anInt4623);
						}
					}
				}
				local36++;
				local34 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIZ)V")
	public static void method2028(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static6.anInt118 = 104;
		Static178.anInt3591 = 104;
		Static59.anInt1196 = arg0;
		Static310.aClass1_Sub17ArrayArrayArray2 = new Class1_Sub17[4][Static6.anInt118][Static178.anInt3591];
		Static89.anIntArrayArrayArray6 = new int[4][Static6.anInt118 + 1][Static178.anInt3591 + 1];
		if (Static291.aBoolean404) {
			Static232.aClass1_Sub20ArrayArray4 = new Class1_Sub20[4][];
		}
		if (arg1) {
			Static141.aClass1_Sub17ArrayArrayArray4 = new Class1_Sub17[1][Static6.anInt118][Static178.anInt3591];
			Static300.anIntArrayArray47 = new int[Static6.anInt118][Static178.anInt3591];
			Static61.anIntArrayArrayArray5 = new int[1][Static6.anInt118 + 1][Static178.anInt3591 + 1];
			if (Static291.aBoolean404) {
				Static273.aClass1_Sub20ArrayArray5 = new Class1_Sub20[1][];
			}
		} else {
			Static141.aClass1_Sub17ArrayArrayArray4 = null;
			Static300.anIntArrayArray47 = null;
			Static61.anIntArrayArrayArray5 = null;
			Static273.aClass1_Sub20ArrayArray5 = null;
		}
		Static313.method4647(false);
		Static198.aClass47Array6 = new Class47[500];
		Static208.anInt4105 = 0;
		Static64.aClass47Array5 = new Class47[500];
		Static239.anInt4831 = 0;
		Static290.anIntArrayArrayArray16 = new int[4][Static6.anInt118 + 1][Static178.anInt3591 + 1];
		Static203.aClass60Array4 = new Class60[5000];
		Static128.anInt2548 = 0;
		Static9.aClass60Array2 = new Class60[100];
		Static48.aBooleanArrayArray1 = new boolean[Static59.anInt1196 + Static59.anInt1196 + 1][Static59.anInt1196 + Static59.anInt1196 + 1];
		Static171.aBooleanArrayArray3 = new boolean[Static59.anInt1196 + Static59.anInt1196 + 2][Static59.anInt1196 + Static59.anInt1196 + 2];
		Static159.aByteArrayArrayArray17 = new byte[4][Static6.anInt118][Static178.anInt3591];
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ph;I)V")
	public static void method2030(@OriginalArg(0) Class138 arg0) {
		Static220.anInt5831 = arg0.method3331("titlebg");
		Static24.anInt474 = arg0.method3331("logo");
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(17) int local17 = arg4 + arg3;
		@Pc(22) int local22 = arg6 - arg4;
		@Pc(26) int local26 = arg4 + arg1;
		@Pc(28) int local28;
		for (local28 = arg3; local28 < local17; local28++) {
			Static109.method1795(arg1, Static51.anIntArrayArray1[local28], arg2, arg0);
		}
		for (local28 = arg6; local28 > local22; local28--) {
			Static109.method1795(arg1, Static51.anIntArrayArray1[local28], arg2, arg0);
		}
		@Pc(67) int local67 = arg2 - arg4;
		for (local28 = local17; local28 <= local22; local28++) {
			@Pc(76) int[] local76 = Static51.anIntArrayArray1[local28];
			Static109.method1795(arg1, local76, local26, arg0);
			Static109.method1795(local26, local76, local67, arg5);
			Static109.method1795(local67, local76, arg2, arg0);
		}
	}
}
