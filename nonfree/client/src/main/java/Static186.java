import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "[Lclient!ml;")
	public static Class53_Sub3[] aClass53_Sub3Array3 = new Class53_Sub3[4];

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString331 = "purple:";

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "[I")
	public static int[] anIntArray615 = new int[8];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[Lclient!ch;[BIIIIIIZI)[I")
	private static int[] method4392(@OriginalArg(0) int arg0, @OriginalArg(1) Class30[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = (arg9 & 0x7) * 8;
		@Pc(13) int local13 = (arg4 & 0x7) * 8;
		@Pc(23) int local23;
		@Pc(38) int local38;
		if (!arg8) {
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				for (local23 = 0; local23 < 8; local23++) {
					local38 = Static286.method4375(local23 & 0x7, arg6, local18 & 0x7) + arg3;
					@Pc(50) int local50 = arg5 + Static162.method2627(arg6, local18 & 0x7, local23 & 0x7);
					if (local38 > 0 && local38 < 103 && local50 > 0 && local50 < 103) {
						arg1[arg7].anIntArrayArray6[local38][local50] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(101) Class4_Sub10 local101 = new Class4_Sub10(arg2);
		@Pc(109) byte local109;
		if (arg8) {
			local109 = 1;
		} else {
			local109 = 4;
		}
		local23 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(121) byte local121 = 0;
		local38 = (arg9 & 0xFFFFFFF8) << 3;
		@Pc(129) byte local129 = 0;
		if (arg6 == 1) {
			local129 = 1;
		} else if (arg6 == 2) {
			local121 = 1;
			local129 = 1;
		} else if (arg6 == 3) {
			local121 = 1;
		}
		@Pc(171) int local171;
		@Pc(229) int local229;
		@Pc(241) int local241;
		@Pc(272) int local272;
		@Pc(281) int local281;
		@Pc(300) int local300;
		@Pc(293) int local293;
		for (@Pc(157) int local157 = 0; local157 < local109; local157++) {
			for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
				for (local171 = 0; local171 < 64; local171++) {
					if (local157 != arg0 || local166 < local13 || local13 + 8 < local166 || local171 < local7 || local171 > local7 + 8) {
						Static12.method195(local101, false, arg8, 0, 0, 0, -1, 0, 0, 0, -1);
					} else if (local13 + 8 == local166 || local7 + 8 == local171) {
						if (arg6 == 0) {
							local229 = local166 + arg3 - local13;
							local241 = arg5 + local171 - local7;
						} else if (arg6 == 1) {
							local241 = local13 + arg5 + 8 - local166;
							local229 = arg3 + local171 - local7;
						} else if (arg6 == 2) {
							local229 = arg3 + local13 + 8 - local166;
							local241 = arg5 + local7 + 8 - local171;
						} else {
							local229 = local7 + arg3 + 8 - local171;
							local241 = arg5 + local166 - local13;
						}
						Static12.method195(local101, true, arg8, arg7, local23 + local166, local38 + local171, local241, 0, 0, 0, local229);
					} else {
						local229 = Static286.method4375(local171 & 0x7, arg6, local166 & 0x7) + arg3;
						local241 = Static162.method2627(arg6, local166 & 0x7, local171 & 0x7) + arg5;
						Static12.method195(local101, false, arg8, arg7, local23 + local166, local171 + local38, local241, arg6, local129, local121, local229);
						if (local166 == 63 || local171 == 63) {
							local272 = local166 == 63 ? 64 : local166;
							local281 = local171 == 63 ? 64 : local171;
							if (arg6 == 0) {
								local293 = arg5 + local281 - local7;
								local300 = arg3 + local272 - local13;
							} else if (arg6 == 1) {
								local300 = local281 + arg3 - local7;
								local293 = arg5 + local13 + 8 - local272;
							} else if (arg6 == 2) {
								local300 = arg3 + local13 + 8 - local272;
								local293 = arg5 + local7 + 8 - local281;
							} else {
								local293 = arg5 + local272 - local13;
								local300 = arg3 + local7 + 8 - local281;
							}
							if (local300 >= 0 && local300 < 104 && local293 >= 0 && local293 < 104) {
								Static243.anIntArrayArrayArray13[arg7][local300][local293] = Static243.anIntArrayArrayArray13[arg7][local229 + local121][local241 + local129];
							}
						}
					}
				}
			}
		}
		@Pc(526) boolean local526 = false;
		@Pc(729) int local729;
		@Pc(766) int local766;
		while (local101.aByteArray71.length > local101.anInt5713) {
			local171 = local101.method4666();
			if (local171 == 128) {
				local526 = true;
				Static229.anIntArray465[0] = local101.method4653();
				Static229.anIntArray465[1] = local101.method4613();
				Static229.anIntArray465[2] = local101.method4613();
				Static229.anIntArray465[3] = local101.method4613();
				Static229.anIntArray465[4] = local101.method4653();
			} else {
				if (local171 != 129) {
					local101.anInt5713--;
					break;
				}
				for (local229 = 0; local229 < 4; local229++) {
					@Pc(587) byte local587 = local101.method4674();
					if (local587 == 0) {
						if (local229 <= arg0) {
							local281 = arg3 + 7;
							local272 = arg3;
							if (arg3 < 0) {
								local272 = 0;
							} else if (arg3 >= 104) {
								local272 = 104;
							}
							local300 = arg5;
							if (arg5 < 0) {
								local300 = 0;
							} else if (arg5 >= 104) {
								local300 = 104;
							}
							local293 = arg5 + 7;
							if (local293 < 0) {
								local293 = 0;
							} else if (local293 >= 104) {
								local293 = 104;
							}
							if (local281 < 0) {
								local281 = 0;
							} else if (local281 >= 104) {
								local281 = 104;
							}
							while (local281 > local272) {
								while (local300 < local293) {
									Static174.aByteArrayArrayArray16[arg7][local272][local300] = 0;
									local300++;
								}
								local272++;
							}
						}
					} else if (local587 == 1) {
						for (local272 = 0; local272 < 64; local272 += 4) {
							for (local281 = 0; local281 < 64; local281 += 4) {
								@Pc(713) byte local713 = local101.method4674();
								if (local229 <= arg0) {
									for (local293 = local272; local293 < local272 + 4; local293++) {
										for (local729 = local281; local729 < local281 + 4; local729++) {
											if (local293 >= local13 && local13 + 8 > local293 && local7 <= local729 && local7 < local7 + 8) {
												local766 = arg3 + Static286.method4375(local729 & 0x7, arg6, local293 & 0x7);
												@Pc(778) int local778 = Static162.method2627(arg6, local293 & 0x7, local729 & 0x7) + arg5;
												if (local766 >= 0 && local766 < 104 && local778 >= 0 && local778 < 104) {
													Static174.aByteArrayArrayArray16[arg7][local766][local778] = local713;
												}
											}
										}
									}
								}
							}
						}
					} else if (local587 == 2) {
					}
				}
			}
		}
		if (Static94.aBoolean138 && !arg8) {
			@Pc(840) Class191 local840 = null;
			while (true) {
				while (local101.aByteArray71.length > local101.anInt5713) {
					local229 = local101.method4666();
					if (local229 == 0) {
						local840 = new Class191(local101);
					} else if (local229 == 1) {
						local241 = local101.method4666();
						if (local241 > 0) {
							for (local272 = 0; local272 < local241; local272++) {
								@Pc(905) Class50 local905 = new Class50(local101);
								if (local905.anInt1323 == 31) {
									@Pc(916) Class181 local916 = Static30.method494(local101.method4653());
									local905.method1073(local916.anInt5485, local916.anInt5481, local916.anInt5483, local916.anInt5482);
								}
								local300 = local905.anInt1338 >> 7;
								local293 = local905.anInt1320 >> 7;
								if (local905.anInt1326 == arg0 && local300 >= local13 && local13 + 8 > local300 && local7 <= local293 && local7 + 8 > local293) {
									local729 = (arg3 << 7) + Static246.method3839(local905.anInt1338 & 0x3FF, arg6, local905.anInt1320 & 0x3FF);
									local766 = (arg5 << 7) + Static142.method2189(local905.anInt1320 & 0x3FF, local905.anInt1338 & 0x3FF, arg6);
									local905.anInt1338 = local729;
									local905.anInt1320 = local766;
									local293 = local905.anInt1320 >> 7;
									local300 = local905.anInt1338 >> 7;
									if (local300 >= 0 && local293 >= 0 && local300 < 104 && local293 < 104) {
										local905.aBoolean80 = (Static174.aByteArrayArrayArray17[1][local300][local293] & 0x2) != 0;
										local905.anInt1322 = Static243.anIntArrayArrayArray13[local905.anInt1326][local300][local293] - local905.anInt1322;
										Static196.method3126(local905);
									}
								}
							}
						}
					} else if (local229 == 2) {
						if (local840 == null) {
							local840 = new Class191();
						}
						local840.method4823(local101);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local840 == null) {
					local840 = new Class191();
				}
				Static218.aClass191ArrayArray1[arg3 >> 3][arg5 >> 3] = local840;
				break;
			}
		}
		local229 = arg5 + 7;
		local171 = arg3 + 7;
		for (local241 = arg3; local241 < local171; local241++) {
			for (local272 = arg5; local272 < local229; local272++) {
				Static174.aByteArrayArrayArray16[arg7][local241][local272] = 0;
			}
		}
		return local526 ? Static229.anIntArray465 : null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)I")
	public static int method4393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg1;
			arg1 = local8;
		}
		@Pc(20) int local20 = arg3 & 0x3;
		if (local20 == 0) {
			return arg4;
		} else if (local20 == 1) {
			return 1 + 7 - arg2 - arg0;
		} else if (local20 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
	public static void method4394(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static181.method2940(arg0, -1, null, arg1, arg2);
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)[Lclient!fe;")
	public static Class56_Sub1[] method4395() {
		@Pc(4) Class56_Sub1[] local4 = new Class56_Sub1[Static143.anInt2748];
		for (@Pc(12) int local12 = 0; local12 < Static143.anInt2748; local12++) {
			local4[local12] = new Class56_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local12], Static187.anIntArray391[local12], Static110.anIntArray185[local12], Static301.anIntArray643[local12], Static230.aByteArrayArray36[local12], Static58.anIntArray85);
		}
		Static304.method4707();
		return local4;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZ)V")
	public static void method4396(@OriginalArg(0) boolean arg0) {
		@Pc(10) int[] local10 = null;
		@Pc(16) byte local16;
		@Pc(18) byte[][] local18;
		if (Static94.aBoolean138 && arg0) {
			local16 = 1;
			local18 = Static278.aByteArrayArray49;
		} else {
			local16 = 4;
			local18 = Static24.aByteArrayArray4;
		}
		for (@Pc(26) int local26 = 0; local26 < local16; local26++) {
			Static16.method763();
			for (@Pc(37) int local37 = 0; local37 < 13; local37++) {
				for (@Pc(42) int local42 = 0; local42 < 13; local42++) {
					@Pc(49) boolean local49 = false;
					@Pc(57) int local57 = Static278.anIntArrayArrayArray15[local26][local37][local42];
					if (local57 != -1) {
						@Pc(69) int local69 = local57 >> 24 & 0x3;
						if (!arg0 || local69 == 0) {
							@Pc(83) int local83 = local57 >> 1 & 0x3;
							@Pc(89) int local89 = local57 >> 14 & 0x3FF;
							@Pc(95) int local95 = local57 >> 3 & 0x7FF;
							@Pc(105) int local105 = local95 / 8 + (local89 / 8 << 8);
							for (@Pc(107) int local107 = 0; local107 < Static278.anIntArray597.length; local107++) {
								if (Static278.anIntArray597[local107] == local105 && local18[local107] != null) {
									local49 = true;
									@Pc(151) int[] local151 = method4392(local69, Static296.aClass30Array1, local18[local107], local37 * 8, local89, local42 * 8, local83, local26, arg0, local95);
									if (local10 == null && local151 != null) {
										local10 = local151;
									}
									break;
								}
							}
						}
					}
					if (!local49) {
						Static221.method3573(local37 * 8, local26, 8, local42 * 8, 8);
					}
				}
			}
		}
		if (local10 == null) {
			Static256.anInt4864 = -1;
			return;
		}
		Static223.anInt4304 = local10[3];
		Static256.anInt4864 = local10[0];
		Static29.anInt466 = local10[2];
		Static210.anInt3774 = local10[4];
		Static141.anInt5830 = local10[1];
	}
}
