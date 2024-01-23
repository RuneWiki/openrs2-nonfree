import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	public static int anInt2092;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "Lclient!cg;")
	public static Class22 aClass22_34;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
	public static int anInt2103 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method1785(@OriginalArg(0) Class13_Sub5 arg0) {
		if (arg0.anInt5290 == 0) {
			return;
		}
		@Pc(18) Class33 local18 = arg0.method4212();
		@Pc(44) int local44;
		@Pc(50) int local50;
		if (arg0.anInt5256 != -1 && arg0.anInt5256 < 32768) {
			@Pc(33) Class13_Sub5_Sub2 local33 = Static260.aClass13_Sub5_Sub2Array114[arg0.anInt5256];
			if (local33 != null) {
				local44 = arg0.anInt5334 - local33.anInt5334;
				local50 = arg0.anInt5294 - local33.anInt5294;
				if (local44 != 0 || local50 != 0) {
					arg0.anInt5266 = (int) (Math.atan2((double) local44, (double) local50) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(103) int local103;
		@Pc(77) int local77;
		if (arg0.anInt5256 >= 32768) {
			local77 = arg0.anInt5256 - 32768;
			if (Static169.anInt3387 == local77) {
				local77 = 2047;
			}
			@Pc(87) Class13_Sub5_Sub1 local87 = Static100.aClass13_Sub5_Sub1Array1[local77];
			if (local87 != null) {
				local50 = arg0.anInt5334 - local87.anInt5334;
				local103 = arg0.anInt5294 - local87.anInt5294;
				if (local50 != 0 || local103 != 0) {
					arg0.anInt5266 = (int) (Math.atan2((double) local50, (double) local103) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt5299 != 0 || arg0.anInt5320 != 0) && (arg0.anInt5271 == 0 || arg0.anInt5322 > 0)) {
			local44 = arg0.anInt5294 - (arg0.anInt5320 - Static105.anInt2105 - Static105.anInt2105) * 64;
			local77 = arg0.anInt5334 - (arg0.anInt5299 - Static269.anInt5357 - Static269.anInt5357) * 64;
			if (local77 != 0 || local44 != 0) {
				arg0.anInt5266 = (int) (Math.atan2((double) local77, (double) local44) * 325.949D) & 0x7FF;
			}
			arg0.anInt5299 = 0;
			arg0.anInt5320 = 0;
		}
		local77 = arg0.anInt5266 - arg0.anInt5261 & 0x7FF;
		if (local77 == 0) {
			arg0.anInt5262 = 0;
			arg0.anInt5324 = 0;
		} else if (local18.anInt1148 == 0) {
			arg0.anInt5324++;
			@Pc(872) boolean local872;
			if (local77 <= 1024) {
				arg0.anInt5261 += arg0.anInt5290;
				local872 = true;
				if (arg0.anInt5290 > local77 || local77 > 2048 - arg0.anInt5290) {
					local872 = false;
					arg0.anInt5261 = arg0.anInt5266;
				}
				if (arg0.anInt5324 > 25 || local872) {
					arg0.anInt5307 = local18.anInt1128;
					if (arg0.anInt5271 <= 0) {
						if (local18.anInt1134 != -1) {
							arg0.anInt5307 = local18.anInt1134;
						}
					} else if (arg0.aByteArray61[arg0.anInt5271 - 1] == 2) {
						if (local18.anInt1129 != -1) {
							arg0.anInt5307 = local18.anInt1129;
						} else if (local18.anInt1139 != -1) {
							arg0.anInt5307 = local18.anInt1139;
						}
					} else if (arg0.aByteArray61[arg0.anInt5271 - 1] == 0) {
						if (local18.anInt1138 != -1) {
							arg0.anInt5307 = local18.anInt1138;
						} else if (local18.anInt1157 != -1) {
							arg0.anInt5307 = local18.anInt1157;
						}
					} else if (local18.anInt1125 != -1) {
						arg0.anInt5307 = local18.anInt1125;
					}
				}
			} else {
				arg0.anInt5261 -= arg0.anInt5290;
				local872 = true;
				if (local77 < arg0.anInt5290 || local77 > 2048 - arg0.anInt5290) {
					arg0.anInt5261 = arg0.anInt5266;
					local872 = false;
				}
				if (arg0.anInt5324 > 25 || local872) {
					arg0.anInt5307 = local18.anInt1128;
					if (arg0.anInt5271 > 0) {
						if (arg0.aByteArray61[arg0.anInt5271 - 1] == 2) {
							if (local18.anInt1122 != -1) {
								arg0.anInt5307 = local18.anInt1122;
							} else if (local18.anInt1139 != -1) {
								arg0.anInt5307 = local18.anInt1139;
							}
						} else if (arg0.aByteArray61[arg0.anInt5271 - 1] == 0) {
							if (local18.anInt1147 != -1) {
								arg0.anInt5307 = local18.anInt1147;
							} else if (local18.anInt1157 != -1) {
								arg0.anInt5307 = local18.anInt1157;
							}
						} else if (local18.anInt1159 != -1) {
							arg0.anInt5307 = local18.anInt1159;
						}
					} else if (local18.anInt1152 != -1) {
						arg0.anInt5307 = local18.anInt1152;
					}
				}
			}
			arg0.anInt5261 &= 0x7FF;
		} else {
			arg0.anInt5307 = -1;
			local44 = arg0.anInt5266 << 5;
			if (arg0.anInt5254 != local44) {
				arg0.anInt5258 = 0;
				arg0.anInt5254 = local44;
				local50 = local44 - arg0.anInt5267 & 0xFFFF;
				local103 = arg0.anInt5262 * arg0.anInt5262 / (local18.anInt1148 * 2);
				@Pc(330) int local330;
				if (arg0.anInt5262 > 0 && local50 >= local103 && local50 - local103 < 32768) {
					arg0.aBoolean349 = true;
					local330 = local18.anInt1137 * local18.anInt1137 / (local18.anInt1148 * 2);
					arg0.anInt5319 = local50 / 2;
					if (local330 > 32767) {
						local330 = 32767;
					}
					if (local330 < arg0.anInt5319) {
						arg0.anInt5319 = local50 - local330;
					}
				} else if (arg0.anInt5262 < 0 && local103 <= 65536 - local50 && 65536 - local103 - local50 < 32768) {
					arg0.anInt5319 = (65536 - local50) / 2;
					arg0.aBoolean349 = true;
					local330 = local18.anInt1137 * local18.anInt1137 / (local18.anInt1148 * 2);
					if (local330 > 32767) {
						local330 = 32767;
					}
					if (arg0.anInt5319 > local330) {
						arg0.anInt5319 = 65536 - local330 - local50;
					}
				} else {
					arg0.aBoolean349 = false;
				}
			}
			if (arg0.anInt5262 == 0) {
				local50 = arg0.anInt5254 - arg0.anInt5267 & 0xFFFF;
				if (local18.anInt1148 > local50) {
					arg0.anInt5267 = arg0.anInt5254;
				} else {
					arg0.aBoolean349 = true;
					arg0.anInt5258 = 0;
					local103 = local18.anInt1137 * local18.anInt1137 / (local18.anInt1148 * 2);
					if (local103 > 32767) {
						local103 = 32767;
					}
					if (local50 >= 32768) {
						arg0.anInt5262 = -local18.anInt1148;
						arg0.anInt5319 = (65536 - local50) / 2;
						if (local103 < arg0.anInt5319) {
							arg0.anInt5319 = 65536 - local50 - local103;
						}
					} else {
						arg0.anInt5262 = local18.anInt1148;
						arg0.anInt5319 = local50 / 2;
						if (local103 < arg0.anInt5319) {
							arg0.anInt5319 = local50 - local103;
						}
					}
				}
			} else if (arg0.anInt5262 > 0) {
				if (arg0.anInt5258 >= arg0.anInt5319) {
					arg0.aBoolean349 = false;
				}
				if (!arg0.aBoolean349) {
					arg0.anInt5262 -= local18.anInt1148;
					if (arg0.anInt5262 < 0) {
						arg0.anInt5262 = 0;
					}
				} else if (arg0.anInt5262 < local18.anInt1137) {
					arg0.anInt5262 += local18.anInt1148;
				}
			} else {
				if (arg0.anInt5319 <= arg0.anInt5258) {
					arg0.aBoolean349 = false;
				}
				if (!arg0.aBoolean349) {
					arg0.anInt5262 += local18.anInt1148;
					if (arg0.anInt5262 > 0) {
						arg0.anInt5262 = 0;
					}
				} else if (-local18.anInt1137 < arg0.anInt5262) {
					arg0.anInt5262 -= local18.anInt1148;
				}
			}
			if (arg0.anInt5262 <= 0) {
				arg0.anInt5258 -= arg0.anInt5262;
			} else {
				arg0.anInt5258 += arg0.anInt5262;
			}
			arg0.anInt5267 += arg0.anInt5262;
			arg0.anInt5267 &= 0xFFFF;
			arg0.anInt5261 = arg0.anInt5267 >> 5;
			if (arg0.anInt5262 >= 0) {
				if (arg0.anInt5271 > 0) {
					if (arg0.aByteArray61[arg0.anInt5271 - 1] == 2) {
						if (local18.anInt1129 != -1) {
							arg0.anInt5307 = local18.anInt1129;
						} else if (local18.anInt1139 != -1) {
							arg0.anInt5307 = local18.anInt1139;
						}
					} else if (arg0.aByteArray61[arg0.anInt5271 - 1] == 0) {
						if (local18.anInt1138 != -1) {
							arg0.anInt5307 = local18.anInt1138;
						} else if (local18.anInt1157 != -1) {
							arg0.anInt5307 = local18.anInt1157;
						}
					}
				}
				if (arg0.anInt5307 == -1) {
					if (local18.anInt1125 != -1) {
						arg0.anInt5307 = local18.anInt1125;
					} else if (local18.anInt1134 != -1) {
						arg0.anInt5307 = local18.anInt1134;
					}
				}
			} else {
				if (arg0.anInt5271 > 0) {
					if (arg0.aByteArray61[arg0.anInt5271 - 1] == 2) {
						if (local18.anInt1122 != -1) {
							arg0.anInt5307 = local18.anInt1122;
						} else if (local18.anInt1139 != -1) {
							arg0.anInt5307 = local18.anInt1139;
						}
					} else if (arg0.aByteArray61[arg0.anInt5271 - 1] == 0) {
						if (local18.anInt1147 != -1) {
							arg0.anInt5307 = local18.anInt1147;
						} else if (local18.anInt1157 != -1) {
							arg0.anInt5307 = local18.anInt1157;
						}
					}
				}
				if (arg0.anInt5307 == -1) {
					if (local18.anInt1159 != -1) {
						arg0.anInt5307 = local18.anInt1159;
					} else if (local18.anInt1152 != -1) {
						arg0.anInt5307 = local18.anInt1152;
					}
				}
			}
			if (arg0.anInt5307 == -1) {
				arg0.anInt5307 = local18.anInt1128;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!jl;)V")
	public static void method1787(@OriginalArg(1) Class4_Sub20 arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(14) int local14 = 0;
		if (arg0.anInt2628 == 0) {
			local12 = Static108.method1836(arg0.anInt2631, arg0.anInt2629, arg0.anInt2619);
		}
		if (arg0.anInt2628 == 1) {
			local12 = Static307.method4707(arg0.anInt2631, arg0.anInt2629, arg0.anInt2619);
		}
		@Pc(43) int local43 = -1;
		@Pc(45) int local45 = 0;
		if (arg0.anInt2628 == 2) {
			local12 = Static4.method65(arg0.anInt2631, arg0.anInt2629, arg0.anInt2619);
		}
		if (arg0.anInt2628 == 3) {
			local12 = Static32.method638(arg0.anInt2631, arg0.anInt2629, arg0.anInt2619);
		}
		if (local12 != 0L) {
			local43 = Integer.MAX_VALUE & (int) (local12 >>> 32);
			local45 = (int) local12 >> 20 & 0x3;
			local14 = (int) local12 >> 14 & 0x1F;
		}
		arg0.anInt2622 = local45;
		arg0.anInt2634 = local14;
		arg0.anInt2623 = local43;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Lclient!qh;")
	public static Class4_Sub2_Sub18 method1789(@OriginalArg(1) int arg0) {
		return (Class4_Sub2_Sub18) Static154.aClass163_23.method4188((long) arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIIIBIZ)V")
	public static void method1790(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg1 && Static218.anInt4196 == arg4 && Static50.anInt1120 == arg2 && (Static60.anInt1347 == arg5 || Static162.method2605())) {
			return;
		}
		Static50.anInt1120 = arg2;
		Static218.anInt4196 = arg4;
		Static60.anInt1347 = arg5;
		if (Static162.method2605()) {
			Static60.anInt1347 = 0;
		}
		if (arg6) {
			Static123.method2035(28);
		} else {
			Static123.method2035(25);
		}
		Static250.method3846(Static174.aString124, true);
		@Pc(60) int local60 = Static105.anInt2105;
		Static105.anInt2105 = arg2 * 8 - 48;
		@Pc(68) int local68 = Static269.anInt5357;
		Static269.anInt5357 = arg4 * 8 - 48;
		Static240.aClass4_Sub2_Sub18_3 = Static146.method2321(Static50.anInt1120 * 8, Static218.anInt4196 * 8);
		@Pc(88) int local88 = Static269.anInt5357 - local68;
		@Pc(93) int local93 = Static105.anInt2105 - local60;
		Static68.aClass100_2 = null;
		@Pc(103) int local103;
		@Pc(110) Class13_Sub5_Sub2 local110;
		@Pc(115) int local115;
		if (arg6) {
			Static99.anInt1950 = 0;
			for (local103 = 0; local103 < 32768; local103++) {
				local110 = Static260.aClass13_Sub5_Sub2Array114[local103];
				if (local110 != null) {
					local110.anInt5294 -= local93 * 128;
					local110.anInt5334 -= local88 * 128;
					if (local110.anInt5334 >= 0 && local110.anInt5334 <= 13184 && local110.anInt5294 >= 0 && local110.anInt5294 <= 13184) {
						for (local115 = 0; local115 < 10; local115++) {
							local110.anIntArray411[local115] -= local88;
							local110.anIntArray418[local115] -= local93;
						}
						Static123.anIntArray214[Static99.anInt1950++] = local103;
					} else {
						Static260.aClass13_Sub5_Sub2Array114[local103].method4230(null);
						Static260.aClass13_Sub5_Sub2Array114[local103] = null;
					}
				}
			}
		} else {
			for (local103 = 0; local103 < 32768; local103++) {
				local110 = Static260.aClass13_Sub5_Sub2Array114[local103];
				if (local110 != null) {
					for (local115 = 0; local115 < 10; local115++) {
						local110.anIntArray411[local115] -= local88;
						local110.anIntArray418[local115] -= local93;
					}
					local110.anInt5334 -= local88 * 128;
					local110.anInt5294 -= local93 * 128;
				}
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(269) Class13_Sub5_Sub1 local269 = Static100.aClass13_Sub5_Sub1Array1[local103];
			if (local269 != null) {
				for (local115 = 0; local115 < 10; local115++) {
					local269.anIntArray411[local115] -= local88;
					local269.anIntArray418[local115] -= local93;
				}
				local269.anInt5294 -= local93 * 128;
				local269.anInt5334 -= local88 * 128;
			}
		}
		@Pc(316) byte local316 = 0;
		Static222.anInt4467 = arg5;
		Static72.aClass13_Sub5_Sub1_1.method3496(arg0, false, arg3);
		@Pc(326) byte local326 = 0;
		@Pc(328) byte local328 = 104;
		@Pc(330) byte local330 = 1;
		if (local88 < 0) {
			local316 = 103;
			local330 = -1;
			local328 = -1;
		}
		@Pc(344) byte local344 = 1;
		@Pc(346) byte local346 = 104;
		if (local93 < 0) {
			local326 = 103;
			local344 = -1;
			local346 = -1;
		}
		for (@Pc(357) int local357 = local316; local357 != local328; local357 += local330) {
			for (@Pc(366) int local366 = local326; local366 != local346; local366 += local344) {
				@Pc(377) int local377 = local88 + local357;
				@Pc(381) int local381 = local93 + local366;
				for (@Pc(383) int local383 = 0; local383 < 4; local383++) {
					if (local377 >= 0 && local381 >= 0 && local377 < 104 && local381 < 104) {
						Static216.aClass17ArrayArrayArray1[local383][local357][local366] = Static216.aClass17ArrayArrayArray1[local383][local377][local381];
					} else {
						Static216.aClass17ArrayArrayArray1[local383][local357][local366] = null;
					}
				}
			}
		}
		for (@Pc(446) Class4_Sub20 local446 = (Class4_Sub20) Static46.aClass17_5.method613(); local446 != null; local446 = (Class4_Sub20) Static46.aClass17_5.method607()) {
			local446.anInt2629 -= local88;
			local446.anInt2619 -= local93;
			if (local446.anInt2629 < 0 || local446.anInt2619 < 0 || local446.anInt2629 >= 104 || local446.anInt2619 >= 104) {
				local446.method4690();
			}
		}
		if (Static11.anInt279 != 0) {
			Static11.anInt279 -= local88;
			Static274.anInt5438 -= local93;
		}
		Static111.anInt2210 = 0;
		if (arg6) {
			Static89.anInt1797 -= local88;
			Static183.anInt3660 -= local93;
			Static248.anInt4865 -= local93 * 128;
			Static308.anInt5870 -= local88;
			Static65.anInt5705 -= local93;
			Static71.anInt1457 -= local88 * 128;
		} else {
			Static99.anInt1946 = 1;
		}
		if (Static251.aBoolean330 && arg6 && (Math.abs(local88) > 104 || Math.abs(local93) > 104)) {
			Static197.method3207();
		}
		Static16.anInt364 = -1;
		Static91.aClass17_12.method618();
		Static180.aClass17_18.method618();
		Static117.method1980();
	}
}
