import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!tm", name = "A", descriptor = "[I")
	public static int[] anIntArray570;

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
	public static int anInt5212;

	@OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
	public static int anInt5215 = 0;

	@OriginalMember(owner = "client!tm", name = "O", descriptor = "[I")
	public static int[] anIntArray571 = new int[1000];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method4284(@OriginalArg(1) Class53_Sub1 arg0) {
		if (arg0.anInt4009 == 0) {
			return;
		}
		@Pc(16) Class34 local16 = arg0.method3327();
		@Pc(42) int local42;
		@Pc(49) int local49;
		if (arg0.anInt3985 != -1 && arg0.anInt3985 < 32768) {
			@Pc(31) Class53_Sub1_Sub2 local31 = Static110.aClass53_Sub1_Sub2Array1[arg0.anInt3985];
			if (local31 != null) {
				local42 = arg0.anInt3974 - local31.anInt3974;
				local49 = arg0.anInt4002 - local31.anInt4002;
				if (local42 != 0 || local49 != 0) {
					arg0.anInt4017 = (int) (Math.atan2((double) local42, (double) local49) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(119) int local119;
		@Pc(87) int local87;
		if (arg0.anInt3985 >= 32768) {
			local87 = arg0.anInt3985 - 32768;
			if (local87 == Static273.anInt2022) {
				local87 = 2047;
			}
			@Pc(101) Class53_Sub1_Sub1 local101 = Static182.aClass53_Sub1_Sub1Array1[local87];
			if (local101 != null) {
				local49 = arg0.anInt3974 - local101.anInt3974;
				local119 = arg0.anInt4002 - local101.anInt4002;
				if (local49 != 0 || local119 != 0) {
					arg0.anInt4017 = (int) (Math.atan2((double) local49, (double) local119) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4014 != 0 || arg0.anInt4003 != 0) && (arg0.anInt3965 == 0 || arg0.anInt4037 > 0)) {
			local42 = arg0.anInt4002 - (arg0.anInt4003 - Static295.anInt5480 - Static295.anInt5480) * 64;
			local87 = arg0.anInt3974 - (arg0.anInt4014 - Static220.anInt3983 - Static220.anInt3983) * 64;
			if (local87 != 0 || local42 != 0) {
				arg0.anInt4017 = (int) (Math.atan2((double) local87, (double) local42) * 325.949D) & 0x7FF;
			}
			arg0.anInt4014 = 0;
			arg0.anInt4003 = 0;
		}
		local87 = arg0.anInt4017 - arg0.anInt4031 & 0x7FF;
		if (local87 == 0) {
			arg0.anInt4020 = 0;
			arg0.anInt4015 = 0;
		} else if (local16.anInt830 == 0) {
			arg0.anInt4015++;
			@Pc(874) boolean local874;
			if (local87 <= 1024) {
				arg0.anInt4031 += arg0.anInt4009;
				local874 = true;
				if (arg0.anInt4009 > local87 || local87 > 2048 - arg0.anInt4009) {
					local874 = false;
					arg0.anInt4031 = arg0.anInt4017;
				}
				if (arg0.anInt4015 > 25 || local874) {
					arg0.anInt4005 = local16.anInt846;
					if (arg0.anInt3965 > 0) {
						if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
							if (local16.anInt853 != -1) {
								arg0.anInt4005 = local16.anInt853;
							} else if (local16.anInt831 != -1) {
								arg0.anInt4005 = local16.anInt831;
							}
						} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
							if (local16.anInt839 != -1) {
								arg0.anInt4005 = local16.anInt839;
							} else if (local16.anInt854 != -1) {
								arg0.anInt4005 = local16.anInt854;
							}
						} else if (local16.anInt865 != -1) {
							arg0.anInt4005 = local16.anInt865;
						}
					} else if (local16.anInt832 != -1) {
						arg0.anInt4005 = local16.anInt832;
					}
				}
			} else {
				arg0.anInt4031 -= arg0.anInt4009;
				local874 = true;
				if (local87 < arg0.anInt4009 || 2048 - arg0.anInt4009 < local87) {
					local874 = false;
					arg0.anInt4031 = arg0.anInt4017;
				}
				if (arg0.anInt4015 > 25 || local874) {
					arg0.anInt4005 = local16.anInt846;
					if (arg0.anInt3965 <= 0) {
						if (local16.anInt834 != -1) {
							arg0.anInt4005 = local16.anInt834;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt835 != -1) {
							arg0.anInt4005 = local16.anInt835;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt843 != -1) {
							arg0.anInt4005 = local16.anInt843;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					} else if (local16.anInt842 != -1) {
						arg0.anInt4005 = local16.anInt842;
					}
				}
			}
			arg0.anInt4031 &= 0x7FF;
		} else {
			arg0.anInt4005 = -1;
			local42 = arg0.anInt4017 << 5;
			if (arg0.anInt3987 != local42) {
				arg0.anInt4029 = 0;
				arg0.anInt3987 = local42;
				local49 = local42 - arg0.anInt3992 & 0xFFFF;
				local119 = arg0.anInt4020 * arg0.anInt4020 / (local16.anInt830 * 2);
				@Pc(334) int local334;
				if (arg0.anInt4020 > 0 && local119 <= local49 && local49 - local119 < 32768) {
					arg0.aBoolean283 = true;
					arg0.anInt3994 = local49 / 2;
					local334 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local334 > 32767) {
						local334 = 32767;
					}
					if (arg0.anInt3994 > local334) {
						arg0.anInt3994 = local49 - local334;
					}
				} else if (arg0.anInt4020 < 0 && local119 <= 65536 - local49 && 65536 - local49 - local119 < 32768) {
					arg0.anInt3994 = (65536 - local49) / 2;
					arg0.aBoolean283 = true;
					local334 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local334 > 32767) {
						local334 = 32767;
					}
					if (arg0.anInt3994 > local334) {
						arg0.anInt3994 = 65536 - local334 - local49;
					}
				} else {
					arg0.aBoolean283 = false;
				}
			}
			if (arg0.anInt4020 == 0) {
				local49 = arg0.anInt3987 - arg0.anInt3992 & 0xFFFF;
				if (local49 < local16.anInt830) {
					arg0.anInt3992 = arg0.anInt3987;
				} else {
					arg0.anInt4029 = 0;
					arg0.aBoolean283 = true;
					local119 = local16.anInt862 * local16.anInt862 / (local16.anInt830 * 2);
					if (local119 > 32767) {
						local119 = 32767;
					}
					if (local49 >= 32768) {
						arg0.anInt3994 = (65536 - local49) / 2;
						if (local119 < arg0.anInt3994) {
							arg0.anInt3994 = 65536 - local49 - local119;
						}
						arg0.anInt4020 = -local16.anInt830;
					} else {
						arg0.anInt3994 = local49 / 2;
						arg0.anInt4020 = local16.anInt830;
						if (arg0.anInt3994 > local119) {
							arg0.anInt3994 = local49 - local119;
						}
					}
				}
			} else if (arg0.anInt4020 > 0) {
				if (arg0.anInt4029 >= arg0.anInt3994) {
					arg0.aBoolean283 = false;
				}
				if (!arg0.aBoolean283) {
					arg0.anInt4020 -= local16.anInt830;
					if (arg0.anInt4020 < 0) {
						arg0.anInt4020 = 0;
					}
				} else if (arg0.anInt4020 < local16.anInt862) {
					arg0.anInt4020 += local16.anInt830;
				}
			} else {
				if (arg0.anInt4029 >= arg0.anInt3994) {
					arg0.aBoolean283 = false;
				}
				if (!arg0.aBoolean283) {
					arg0.anInt4020 += local16.anInt830;
					if (arg0.anInt4020 > 0) {
						arg0.anInt4020 = 0;
					}
				} else if (-local16.anInt862 < arg0.anInt4020) {
					arg0.anInt4020 -= local16.anInt830;
				}
			}
			arg0.anInt3992 += arg0.anInt4020;
			arg0.anInt3992 &= 0xFFFF;
			arg0.anInt4031 = arg0.anInt3992 >> 5;
			if (arg0.anInt4020 <= 0) {
				arg0.anInt4029 -= arg0.anInt4020;
			} else {
				arg0.anInt4029 += arg0.anInt4020;
			}
			if (arg0.anInt4020 < 0) {
				if (arg0.anInt3965 > 0) {
					if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt835 != -1) {
							arg0.anInt4005 = local16.anInt835;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt843 != -1) {
							arg0.anInt4005 = local16.anInt843;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					}
				}
				if (arg0.anInt4005 == -1) {
					if (local16.anInt842 != -1) {
						arg0.anInt4005 = local16.anInt842;
					} else if (local16.anInt834 != -1) {
						arg0.anInt4005 = local16.anInt834;
					}
				}
			} else {
				if (arg0.anInt3965 > 0) {
					if (arg0.aByteArray51[arg0.anInt3965 - 1] == 2) {
						if (local16.anInt853 != -1) {
							arg0.anInt4005 = local16.anInt853;
						} else if (local16.anInt831 != -1) {
							arg0.anInt4005 = local16.anInt831;
						}
					} else if (arg0.aByteArray51[arg0.anInt3965 - 1] == 0) {
						if (local16.anInt839 != -1) {
							arg0.anInt4005 = local16.anInt839;
						} else if (local16.anInt854 != -1) {
							arg0.anInt4005 = local16.anInt854;
						}
					}
				}
				if (arg0.anInt4005 == -1) {
					if (local16.anInt865 != -1) {
						arg0.anInt4005 = local16.anInt865;
					} else if (local16.anInt832 != -1) {
						arg0.anInt4005 = local16.anInt832;
					}
				}
			}
			if (arg0.anInt4005 == -1) {
				arg0.anInt4005 = local16.anInt846;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[Lclient!ch;IIIII[B)[I")
	public static int[] method4285(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class30[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) byte local9;
		if (arg0) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(25) int local25;
		@Pc(32) int local32;
		if (!arg0) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					for (local32 = 0; local32 < 64; local32++) {
						if (arg4 + local25 > 0 && local25 + arg4 < 103 && arg3 + local32 > 0 && local32 + arg3 < 103) {
							arg1[local18].anIntArrayArray6[local25 + arg4][arg3 + local32] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		local25 = arg5 + arg4;
		@Pc(108) Class4_Sub10 local108 = new Class4_Sub10(arg6);
		local32 = arg2 + arg3;
		@Pc(134) int local134;
		for (@Pc(114) int local114 = 0; local114 < local9; local114++) {
			for (@Pc(129) int local129 = 0; local129 < 64; local129++) {
				for (local134 = 0; local134 < 64; local134++) {
					Static12.method195(local108, false, arg0, local114, local25 + local129, local134 + local32, local134 + arg3, 0, 0, 0, arg4 + local129);
				}
			}
		}
		@Pc(171) boolean local171 = false;
		@Pc(173) boolean local173 = false;
		@Pc(201) int local201;
		@Pc(231) int local231;
		@Pc(216) int local216;
		@Pc(233) int local233;
		@Pc(252) int local252;
		while (local108.aByteArray71.length > local108.anInt5713) {
			local134 = local108.method4666();
			if (local134 == 128) {
				local171 = true;
				Static229.anIntArray465[0] = local108.method4653();
				Static229.anIntArray465[1] = local108.method4613();
				Static229.anIntArray465[2] = local108.method4613();
				Static229.anIntArray465[3] = local108.method4613();
				Static229.anIntArray465[4] = local108.method4653();
			} else {
				if (local134 != 129) {
					local108.anInt5713--;
					break;
				}
				for (local201 = 0; local201 < 4; local201++) {
					@Pc(210) byte local210 = local108.method4674();
					if (local210 == 0) {
						local216 = arg4 + 64;
						if (local216 < 0) {
							local216 = 0;
						} else if (local216 >= 104) {
							local216 = 104;
						}
						local231 = arg4;
						local233 = arg3;
						if (arg3 < 0) {
							local233 = 0;
						} else if (arg3 >= 104) {
							local233 = 104;
						}
						local252 = arg3 + 64;
						if (arg4 < 0) {
							local231 = 0;
						} else if (arg4 >= 104) {
							local231 = 104;
						}
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						while (local216 > local231) {
							while (local233 < local252) {
								Static174.aByteArrayArrayArray16[local201][local231][local233] = 0;
								local233++;
							}
							local231++;
						}
					} else if (local210 == 1) {
						for (local231 = 0; local231 < 64; local231 += 4) {
							for (local216 = 0; local216 < 64; local216 += 4) {
								@Pc(321) byte local321 = local108.method4674();
								for (local252 = local231 + arg4; local252 < local231 + arg4 + 4; local252++) {
									for (@Pc(337) int local337 = arg3 + local216; local337 < local216 + arg3 + 4; local337++) {
										if (local252 >= 0 && local252 < 104 && local337 >= 0 && local337 < 104) {
											Static174.aByteArrayArrayArray16[local201][local252][local337] = local321;
										}
									}
								}
							}
						}
					} else if (local210 == 2 && local201 > 0) {
						local216 = arg4 + 64;
						if (local216 < 0) {
							local216 = 0;
						} else if (local216 >= 104) {
							local216 = 104;
						}
						local233 = arg3;
						if (arg3 < 0) {
							local233 = 0;
						} else if (arg3 >= 104) {
							local233 = 104;
						}
						local231 = arg4;
						local252 = arg3 + 64;
						if (arg4 < 0) {
							local231 = 0;
						} else if (arg4 >= 104) {
							local231 = 104;
						}
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						while (local216 > local231) {
							while (local252 > local233) {
								Static174.aByteArrayArrayArray16[local201][local231][local233] = Static174.aByteArrayArrayArray16[local201 - 1][local231][local233];
								local233++;
							}
							local231++;
						}
					}
				}
				local173 = true;
			}
		}
		@Pc(585) int local585;
		if (Static94.aBoolean138 && !arg0) {
			@Pc(539) Class191 local539 = null;
			while (true) {
				while (local108.anInt5713 < local108.aByteArray71.length) {
					local201 = local108.method4666();
					if (local201 == 0) {
						local539 = new Class191(local108);
					} else if (local201 == 1) {
						local585 = local108.method4666();
						if (local585 > 0) {
							for (local231 = 0; local231 < local585; local231++) {
								@Pc(598) Class50 local598 = new Class50(local108);
								if (local598.anInt1323 == 31) {
									@Pc(608) Class181 local608 = Static30.method494(local108.method4653());
									local598.method1073(local608.anInt5485, local608.anInt5481, local608.anInt5483, local608.anInt5482);
								}
								local598.anInt1338 += arg4 << 7;
								local598.anInt1320 += arg3 << 7;
								local233 = local598.anInt1338 >> 7;
								local252 = local598.anInt1320 >> 7;
								if (local233 >= 0 && local252 >= 0 && local233 < 104 && local252 < 104) {
									local598.aBoolean80 = (Static174.aByteArrayArrayArray17[1][local233][local252] & 0x2) != 0;
									local598.anInt1322 = Static243.anIntArrayArrayArray13[local598.anInt1326][local233][local252] - local598.anInt1322;
									Static196.method3126(local598);
								}
							}
						}
					} else if (local201 == 2) {
						if (local539 == null) {
							local539 = new Class191();
						}
						local539.method4823(local108);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local539 == null) {
					local539 = new Class191();
				}
				for (local201 = 0; local201 < 8; local201++) {
					for (local585 = 0; local585 < 8; local585++) {
						local231 = (arg4 >> 3) + local201;
						local216 = (arg3 >> 3) + local585;
						if (local231 >= 0 && local231 < 13 && local216 >= 0 && local216 < 13) {
							Static218.aClass191ArrayArray1[local231][local216] = local539;
						}
					}
				}
				break;
			}
		}
		if (!local173) {
			for (local134 = 0; local134 < 4; local134++) {
				for (local201 = 0; local201 < 16; local201++) {
					for (local585 = 0; local585 < 16; local585++) {
						local216 = (arg3 >> 2) + local585;
						local231 = (arg4 >> 2) + local201;
						if (local231 >= 0 && local231 < 26 && local216 >= 0 && local216 < 26) {
							Static174.aByteArrayArrayArray16[local134][local231][local216] = 0;
						}
					}
				}
			}
		}
		return local171 ? Static229.anIntArray465 : null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg3 < 0 || arg1 >= 103 || arg3 >= 103) {
			return;
		}
		@Pc(32) int local32;
		if (arg4 == 0) {
			@Pc(22) Class182 local22 = Static162.method2624(arg2, arg1, arg3);
			if (local22 != null) {
				local32 = (int) (local22.aLong193 >>> 32) & Integer.MAX_VALUE;
				if (arg6 == 2) {
					local22.aClass53_5 = new Class53_Sub7(local32, 2, arg5 + 4, arg2, arg1, arg3, arg0, false, local22.aClass53_5);
					local22.aClass53_4 = new Class53_Sub7(local32, 2, arg5 + 1 & 0x3, arg2, arg1, arg3, arg0, false, local22.aClass53_4);
				} else {
					local22.aClass53_5 = new Class53_Sub7(local32, arg6, arg5, arg2, arg1, arg3, arg0, false, local22.aClass53_5);
				}
			}
		}
		if (arg4 == 1) {
			@Pc(98) Class186 local98 = Static265.method4163(arg2, arg1, arg3);
			if (local98 != null) {
				local32 = Integer.MAX_VALUE & (int) (local98.aLong199 >>> 32);
				if (arg6 == 4 || arg6 == 5) {
					local98.aClass53_10 = new Class53_Sub7(local32, 4, arg5, arg2, arg1, arg3, arg0, false, local98.aClass53_10);
				} else if (arg6 == 6) {
					local98.aClass53_10 = new Class53_Sub7(local32, 4, arg5 + 4, arg2, arg1, arg3, arg0, false, local98.aClass53_10);
				} else if (arg6 == 7) {
					local98.aClass53_10 = new Class53_Sub7(local32, 4, (arg5 + 2 & 0x3) + 4, arg2, arg1, arg3, arg0, false, local98.aClass53_10);
				} else if (arg6 == 8) {
					local98.aClass53_10 = new Class53_Sub7(local32, 4, arg5 + 4, arg2, arg1, arg3, arg0, false, local98.aClass53_10);
					local98.aClass53_9 = new Class53_Sub7(local32, 4, (arg5 + 2 & 0x3) + 4, arg2, arg1, arg3, arg0, false, local98.aClass53_9);
				}
			}
		}
		if (arg4 == 2) {
			if (arg6 == 11) {
				arg6 = 10;
			}
			@Pc(246) Class33 local246 = Static193.method3075(arg2, arg1, arg3);
			if (local246 != null) {
				local246.aClass53_1 = new Class53_Sub7((int) (local246.aLong38 >>> 32) & Integer.MAX_VALUE, arg6, arg5, arg2, arg1, arg3, arg0, false, local246.aClass53_1);
			}
		}
		if (arg4 == 3) {
			@Pc(280) Class42 local280 = Static34.method527(arg2, arg1, arg3);
			if (local280 != null) {
				local280.aClass53_2 = new Class53_Sub7(Integer.MAX_VALUE & (int) (local280.aLong45 >>> 32), 22, arg5, arg2, arg1, arg3, arg0, false, local280.aClass53_2);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZLclient!wf;)V")
	public static void method4288(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class189 arg1) {
		@Pc(8) int local8 = arg1.anInt5889 == 0 ? arg1.anInt5897 : arg1.anInt5889;
		@Pc(20) int local20 = arg1.anInt5891 == 0 ? arg1.anInt5953 : arg1.anInt5891;
		Static238.method3697(Static188.aClass189ArrayArray115[arg1.anInt5918 >> 16], arg0, local8, arg1.anInt5918, local20);
		if (arg1.aClass189Array4 != null) {
			Static238.method3697(arg1.aClass189Array4, arg0, local8, arg1.anInt5918, local20);
		}
		@Pc(61) Class4_Sub27 local61 = (Class4_Sub27) Static148.aClass85_13.method1845((long) arg1.anInt5918);
		if (local61 != null) {
			Static137.method2051(arg0, local8, local61.anInt4621, local20);
		}
	}
}
