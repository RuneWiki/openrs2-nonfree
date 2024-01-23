import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public static int anInt4065;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt4066 = 0;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(CB)B")
	public static byte method3272(@OriginalArg(0) char arg0) {
		@Pc(39) byte local39;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local39 = (byte) arg0;
		} else if (arg0 == '€') {
			local39 = -128;
		} else if (arg0 == '‚') {
			local39 = -126;
		} else if (arg0 == 'ƒ') {
			local39 = -125;
		} else if (arg0 == '„') {
			local39 = -124;
		} else if (arg0 == '…') {
			local39 = -123;
		} else if (arg0 == '†') {
			local39 = -122;
		} else if (arg0 == '‡') {
			local39 = -121;
		} else if (arg0 == 'ˆ') {
			local39 = -120;
		} else if (arg0 == '‰') {
			local39 = -119;
		} else if (arg0 == 'Š') {
			local39 = -118;
		} else if (arg0 == '‹') {
			local39 = -117;
		} else if (arg0 == 'Œ') {
			local39 = -116;
		} else if (arg0 == 'Ž') {
			local39 = -114;
		} else if (arg0 == '‘') {
			local39 = -111;
		} else if (arg0 == '’') {
			local39 = -110;
		} else if (arg0 == '“') {
			local39 = -109;
		} else if (arg0 == '”') {
			local39 = -108;
		} else if (arg0 == '•') {
			local39 = -107;
		} else if (arg0 == '–') {
			local39 = -106;
		} else if (arg0 == '—') {
			local39 = -105;
		} else if (arg0 == '˜') {
			local39 = -104;
		} else if (arg0 == '™') {
			local39 = -103;
		} else if (arg0 == 'š') {
			local39 = -102;
		} else if (arg0 == '›') {
			local39 = -101;
		} else if (arg0 == 'œ') {
			local39 = -100;
		} else if (arg0 == 'ž') {
			local39 = -98;
		} else if (arg0 == 'Ÿ') {
			local39 = -97;
		} else {
			local39 = 63;
		}
		return local39;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!gj;I)V")
	public static void method3273(@OriginalArg(0) Class22_Sub3 arg0) {
		if (arg0.anInt4611 == 0) {
			return;
		}
		@Pc(16) Class78 local16 = arg0.method3659();
		@Pc(39) int local39;
		@Pc(46) int local46;
		if (arg0.anInt4638 != -1 && arg0.anInt4638 < 32768) {
			@Pc(29) Class22_Sub3_Sub1 local29 = Static265.aClass22_Sub3_Sub1Array1[arg0.anInt4638];
			if (local29 != null) {
				local39 = arg0.anInt4601 - local29.anInt4601;
				local46 = arg0.anInt4623 - local29.anInt4623;
				if (local39 != 0 || local46 != 0) {
					arg0.anInt4561 = (int) (Math.atan2((double) local39, (double) local46) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(103) int local103;
		@Pc(77) int local77;
		if (arg0.anInt4638 >= 32768) {
			local77 = arg0.anInt4638 - 32768;
			if (local77 == Static117.anInt2308) {
				local77 = 2047;
			}
			@Pc(87) Class22_Sub3_Sub2 local87 = Static195.aClass22_Sub3_Sub2Array1[local77];
			if (local87 != null) {
				local46 = arg0.anInt4601 - local87.anInt4601;
				local103 = arg0.anInt4623 - local87.anInt4623;
				if (local46 != 0 || local103 != 0) {
					arg0.anInt4561 = (int) (Math.atan2((double) local46, (double) local103) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt4617 != 0 || arg0.anInt4624 != 0) && (arg0.anInt4580 == 0 || arg0.anInt4618 > 0)) {
			local77 = arg0.anInt4601 - (arg0.anInt4617 - Static290.anInt5497 - Static290.anInt5497) * 64;
			local39 = arg0.anInt4623 - (arg0.anInt4624 - Static118.anInt2409 - Static118.anInt2409) * 64;
			if (local77 != 0 || local39 != 0) {
				arg0.anInt4561 = (int) (Math.atan2((double) local77, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt4624 = 0;
			arg0.anInt4617 = 0;
		}
		local77 = arg0.anInt4561 - arg0.anInt4649 & 0x7FF;
		if (local77 == 0) {
			arg0.anInt4650 = 0;
			arg0.anInt4598 = 0;
		} else if (local16.anInt2167 == 0) {
			arg0.anInt4650++;
			@Pc(232) boolean local232;
			if (local77 > 1024) {
				local232 = true;
				arg0.anInt4649 -= arg0.anInt4611;
				if (arg0.anInt4611 > local77 || 2048 - arg0.anInt4611 < local77) {
					local232 = false;
					arg0.anInt4649 = arg0.anInt4561;
				}
				if (arg0.anInt4650 > 25 || local232) {
					arg0.anInt4566 = local16.anInt2140;
					if (arg0.anInt4580 > 0) {
						if (arg0.aByteArray54[arg0.anInt4580 - 1] == 2) {
							if (local16.anInt2153 != -1) {
								arg0.anInt4566 = local16.anInt2153;
							} else if (local16.anInt2143 != -1) {
								arg0.anInt4566 = local16.anInt2143;
							}
						} else if (arg0.aByteArray54[arg0.anInt4580 - 1] == 0) {
							if (local16.anInt2146 != -1) {
								arg0.anInt4566 = local16.anInt2146;
							} else if (local16.anInt2151 != -1) {
								arg0.anInt4566 = local16.anInt2151;
							}
						} else if (local16.anInt2145 != -1) {
							arg0.anInt4566 = local16.anInt2145;
						}
					} else if (local16.anInt2137 != -1) {
						arg0.anInt4566 = local16.anInt2137;
					}
				}
			} else {
				arg0.anInt4649 += arg0.anInt4611;
				local232 = true;
				if (local77 < arg0.anInt4611 || 2048 - arg0.anInt4611 < local77) {
					local232 = false;
					arg0.anInt4649 = arg0.anInt4561;
				}
				if (arg0.anInt4650 > 25 || local232) {
					arg0.anInt4566 = local16.anInt2140;
					if (arg0.anInt4580 <= 0) {
						if (local16.anInt2158 != -1) {
							arg0.anInt4566 = local16.anInt2158;
						}
					} else if (arg0.aByteArray54[arg0.anInt4580 - 1] == 2) {
						if (local16.anInt2159 != -1) {
							arg0.anInt4566 = local16.anInt2159;
						} else if (local16.anInt2143 != -1) {
							arg0.anInt4566 = local16.anInt2143;
						}
					} else if (arg0.aByteArray54[arg0.anInt4580 - 1] == 0) {
						if (local16.anInt2133 != -1) {
							arg0.anInt4566 = local16.anInt2133;
						} else if (local16.anInt2151 != -1) {
							arg0.anInt4566 = local16.anInt2151;
						}
					} else if (local16.anInt2154 != -1) {
						arg0.anInt4566 = local16.anInt2154;
					}
				}
			}
			arg0.anInt4649 &= 0x7FF;
		} else {
			arg0.anInt4566 = -1;
			local39 = arg0.anInt4561 << 5;
			if (arg0.anInt4637 != local39) {
				arg0.anInt4637 = local39;
				arg0.anInt4603 = 0;
				local46 = local39 - arg0.anInt4604 & 0xFFFF;
				local103 = arg0.anInt4598 * arg0.anInt4598 / (local16.anInt2167 * 2);
				@Pc(583) int local583;
				if (arg0.anInt4598 > 0 && local46 >= local103 && local46 - local103 < 32768) {
					arg0.aBoolean328 = true;
					arg0.anInt4591 = local46 / 2;
					local583 = local16.anInt2135 * local16.anInt2135 / (local16.anInt2167 * 2);
					if (local583 > 32767) {
						local583 = 32767;
					}
					if (arg0.anInt4591 > local583) {
						arg0.anInt4591 = local46 - local583;
					}
				} else if (arg0.anInt4598 < 0 && local103 <= 65536 - local46 && 65536 - local103 - local46 < 32768) {
					arg0.aBoolean328 = true;
					local583 = local16.anInt2135 * local16.anInt2135 / (local16.anInt2167 * 2);
					arg0.anInt4591 = (65536 - local46) / 2;
					if (local583 > 32767) {
						local583 = 32767;
					}
					if (local583 < arg0.anInt4591) {
						arg0.anInt4591 = 65536 - local583 - local46;
					}
				} else {
					arg0.aBoolean328 = false;
				}
			}
			if (arg0.anInt4598 == 0) {
				local46 = arg0.anInt4637 - arg0.anInt4604 & 0xFFFF;
				if (local46 < local16.anInt2167) {
					arg0.anInt4604 = arg0.anInt4637;
				} else {
					arg0.aBoolean328 = true;
					arg0.anInt4603 = 0;
					local103 = local16.anInt2135 * local16.anInt2135 / (local16.anInt2167 * 2);
					if (local103 > 32767) {
						local103 = 32767;
					}
					if (local46 >= 32768) {
						arg0.anInt4598 = -local16.anInt2167;
						arg0.anInt4591 = (65536 - local46) / 2;
						if (arg0.anInt4591 > local103) {
							arg0.anInt4591 = 65536 - local103 - local46;
						}
					} else {
						arg0.anInt4591 = local46 / 2;
						if (arg0.anInt4591 > local103) {
							arg0.anInt4591 = local46 - local103;
						}
						arg0.anInt4598 = local16.anInt2167;
					}
				}
			} else if (arg0.anInt4598 <= 0) {
				if (arg0.anInt4591 <= arg0.anInt4603) {
					arg0.aBoolean328 = false;
				}
				if (!arg0.aBoolean328) {
					arg0.anInt4598 += local16.anInt2167;
					if (arg0.anInt4598 > 0) {
						arg0.anInt4598 = 0;
					}
				} else if (arg0.anInt4598 > -local16.anInt2135) {
					arg0.anInt4598 -= local16.anInt2167;
				}
			} else {
				if (arg0.anInt4603 >= arg0.anInt4591) {
					arg0.aBoolean328 = false;
				}
				if (!arg0.aBoolean328) {
					arg0.anInt4598 -= local16.anInt2167;
					if (arg0.anInt4598 < 0) {
						arg0.anInt4598 = 0;
					}
				} else if (local16.anInt2135 > arg0.anInt4598) {
					arg0.anInt4598 += local16.anInt2167;
				}
			}
			if (arg0.anInt4598 <= 0) {
				arg0.anInt4603 -= arg0.anInt4598;
			} else {
				arg0.anInt4603 += arg0.anInt4598;
			}
			arg0.anInt4604 += arg0.anInt4598;
			arg0.anInt4604 &= 0xFFFF;
			arg0.anInt4649 = arg0.anInt4604 >> 5;
			if (arg0.anInt4598 >= 0) {
				if (arg0.anInt4580 > 0) {
					if (arg0.aByteArray54[arg0.anInt4580 - 1] == 2) {
						if (local16.anInt2159 != -1) {
							arg0.anInt4566 = local16.anInt2159;
						} else if (local16.anInt2143 != -1) {
							arg0.anInt4566 = local16.anInt2143;
						}
					} else if (arg0.aByteArray54[arg0.anInt4580 - 1] == 0) {
						if (local16.anInt2133 != -1) {
							arg0.anInt4566 = local16.anInt2133;
						} else if (local16.anInt2151 != -1) {
							arg0.anInt4566 = local16.anInt2151;
						}
					}
				}
				if (arg0.anInt4566 == -1) {
					if (local16.anInt2154 != -1) {
						arg0.anInt4566 = local16.anInt2154;
					} else if (local16.anInt2158 != -1) {
						arg0.anInt4566 = local16.anInt2158;
					}
				}
			} else {
				if (arg0.anInt4580 > 0) {
					if (arg0.aByteArray54[arg0.anInt4580 - 1] == 2) {
						if (local16.anInt2153 != -1) {
							arg0.anInt4566 = local16.anInt2153;
						} else if (local16.anInt2143 != -1) {
							arg0.anInt4566 = local16.anInt2143;
						}
					} else if (arg0.aByteArray54[arg0.anInt4580 - 1] == 0) {
						if (local16.anInt2146 != -1) {
							arg0.anInt4566 = local16.anInt2146;
						} else if (local16.anInt2151 != -1) {
							arg0.anInt4566 = local16.anInt2151;
						}
					}
				}
				if (arg0.anInt4566 == -1) {
					if (local16.anInt2145 != -1) {
						arg0.anInt4566 = local16.anInt2145;
					} else if (local16.anInt2137 != -1) {
						arg0.anInt4566 = local16.anInt2137;
					}
				}
			}
			if (arg0.anInt4566 == -1) {
				arg0.anInt4566 = local16.anInt2140;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!ph;BI)Lclient!wi;")
	public static Class103_Sub2 method3274(@OriginalArg(1) Class138 arg0, @OriginalArg(3) int arg1) {
		return Static27.method486(arg1, 0, arg0) ? Static276.method2810() : null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[ILclient!kf;I[[F[[I[[FILclient!tm;Z[[F)V")
	public static void method3275(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class170 arg8, @OriginalArg(10) float[][] arg9) {
		@Pc(11) int[] local11 = new int[arg1.length / 2];
		for (@Pc(17) int local17 = 0; local17 < local11.length; local17++) {
			@Pc(27) int local27 = arg1[local17 + local17];
			@Pc(35) int local35 = arg1[local17 + local17 + 1];
			@Pc(42) int local42;
			if (arg3 == 1) {
				local42 = local27;
				local27 = local35;
				local35 = 128 - local42;
			} else if (arg3 == 2) {
				local27 = 128 - local27;
				local35 = 128 - local35;
			} else if (arg3 == 3) {
				local42 = local27;
				local27 = 128 - local35;
				local35 = local42;
			}
			@Pc(109) float local109;
			@Pc(119) float local119;
			@Pc(129) float local129;
			if (local27 == 0 && local35 == 0) {
				local129 = arg4[arg0][arg7];
				local109 = arg9[arg0][arg7];
				local119 = arg6[arg0][arg7];
			} else if (local27 == 128 && local35 == 0) {
				local119 = arg6[arg0 + 1][arg7];
				local129 = arg4[arg0 + 1][arg7];
				local109 = arg9[arg0 + 1][arg7];
			} else if (local27 == 128 && local35 == 128) {
				local109 = arg9[arg0 + 1][arg7 + 1];
				local119 = arg6[arg0 + 1][arg7 + 1];
				local129 = arg4[arg0 + 1][arg7 + 1];
			} else if (local27 == 0 && local35 == 128) {
				local129 = arg4[arg0][arg7 + 1];
				local119 = arg6[arg0][arg7 + 1];
				local109 = arg9[arg0][arg7 + 1];
			} else {
				local129 = arg4[arg0][arg7];
				local109 = arg9[arg0][arg7];
				@Pc(156) float local156 = (float) local27 / 128.0F;
				@Pc(170) float local170 = local109 + (arg9[arg0 + 1][arg7] - local109) * local156;
				@Pc(185) float local185 = local129 + local156 * (arg4[arg0 + 1][arg7] - local129);
				local119 = arg6[arg0][arg7];
				@Pc(206) float local206 = local119 + local156 * (arg6[arg0 + 1][arg7] - local119);
				@Pc(214) float local214 = arg9[arg0][arg7 + 1];
				@Pc(230) float local230 = local214 + local156 * (arg9[arg0 + 1][arg7 + 1] - local214);
				@Pc(235) float local235 = (float) local35 / 128.0F;
				@Pc(243) float local243 = arg6[arg0][arg7 + 1];
				@Pc(260) float local260 = local243 + (arg6[arg0 + 1][arg7 + 1] - local243) * local156;
				@Pc(268) float local268 = arg4[arg0][arg7 + 1];
				local119 = local206 + (local260 - local206) * local235;
				@Pc(294) float local294 = local268 + local156 * (arg4[arg0 + 1][arg7 + 1] - local268);
				local109 = local170 + local235 * (local230 - local170);
				local129 = local185 + local235 * (local294 - local185);
			}
			@Pc(390) int local390 = (arg0 << 7) + local27;
			@Pc(398) int local398 = Static10.method150(arg7, local27, local35, arg0, arg5);
			@Pc(404) int local404 = (arg7 << 7) + local35;
			local11[local17] = arg2.method2238(arg8, local390, local398, local404, local129, local109, local119);
		}
		arg2.method2237(local11);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
	public static void method3276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = arg0 * Static311.anInt5846 >> 8;
		if (local5 != 0 && arg1 != -1) {
			Static251.method3840(arg1, local5, Static136.aClass138_43);
			Static113.aBoolean168 = true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!sb;)V")
	public static void method3278(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(13) int local13 = Static58.anInt2562 >> 1;
		@Pc(19) int local19 = Static58.anInt2558 >> 2 << 10;
		@Pc(23) byte[][] local23 = new byte[Static58.anInt2561][Static58.anInt2563];
		@Pc(33) int local33;
		@Pc(118) int local118;
		@Pc(131) int local131;
		while (arg0.anInt3290 < arg0.aByteArray34.length) {
			@Pc(31) boolean local31 = false;
			local33 = 0;
			@Pc(35) int local35 = 0;
			if (arg0.method2595() == 1) {
				local33 = arg0.method2595();
				local31 = true;
				local35 = arg0.method2595();
			}
			@Pc(58) int local58 = arg0.method2595();
			@Pc(62) int local62 = arg0.method2595();
			@Pc(69) int local69 = local58 * 64 - Static58.anInt2560;
			@Pc(79) int local79 = Static58.anInt2559 + Static58.anInt2563 - local62 * 64 - 1;
			if (local69 >= 0 && local79 - 63 >= 0 && Static58.anInt2561 > local69 + 63 && local79 < Static58.anInt2563) {
				for (local118 = 0; local118 < 64; local118++) {
					@Pc(129) byte[] local129 = local23[local118 + local69];
					for (local131 = 0; local131 < 64; local131++) {
						if (!local31 || local33 * 8 <= local118 && local118 < local33 * 8 + 8 && local35 * 8 <= local131 && local35 * 8 + 8 > local131) {
							local129[local79 - local131] = arg0.method2598();
						}
					}
				}
			} else if (local31) {
				arg0.anInt3290 += 64;
			} else {
				arg0.anInt3290 += 4096;
			}
		}
		@Pc(189) int local189 = Static58.anInt2561;
		local33 = Static58.anInt2563;
		@Pc(194) int[] local194 = new int[local33];
		@Pc(197) int[] local197 = new int[local33];
		@Pc(200) int[] local200 = new int[local33];
		@Pc(203) int[] local203 = new int[local33];
		@Pc(206) int[] local206 = new int[local33];
		for (local118 = -5; local118 < local189; local118++) {
			if ((local118 & 0x1FF) == 0) {
				Static289.method4287(true);
			}
			@Pc(243) int local243;
			@Pc(306) int local306;
			for (@Pc(221) int local221 = 0; local221 < local33; local221++) {
				local131 = local118 + 5;
				@Pc(288) int local288;
				if (local131 < local189) {
					local243 = local23[local131][local221] & 0xFF;
					if (local243 > 0) {
						@Pc(252) Class54 local252 = Static300.method4497(local243 - 1);
						local203[local221] += local252.anInt1440;
						local200[local221] += local252.anInt1428;
						local194[local221] += local252.anInt1442;
						local197[local221] += local252.anInt1431;
						local288 = local206[local221]++;
					}
				}
				local243 = local118 - 5;
				if (local243 >= 0) {
					local306 = local23[local243][local221] & 0xFF;
					if (local306 > 0) {
						@Pc(316) Class54 local316 = Static300.method4497(local306 - 1);
						local203[local221] -= local316.anInt1440;
						local200[local221] -= local316.anInt1428;
						local194[local221] -= local316.anInt1442;
						local197[local221] -= local316.anInt1431;
						local288 = local206[local221]--;
					}
				}
			}
			if (local118 >= 0) {
				@Pc(366) int[][] local366 = Static58.anIntArrayArrayArray8[local118 >> 6];
				local131 = 0;
				local243 = 0;
				local306 = 0;
				@Pc(374) int local374 = 0;
				@Pc(376) int local376 = 0;
				for (@Pc(378) int local378 = -5; local378 < local33; local378++) {
					@Pc(385) int local385 = local378 + 5;
					if (local385 < local33) {
						local131 += local203[local385];
						local306 += local194[local385];
						local243 += local200[local385];
						local374 += local206[local385];
						local376 += local197[local385];
					}
					@Pc(427) int local427 = local378 - 5;
					if (local427 >= 0) {
						local376 -= local197[local427];
						local306 -= local194[local427];
						local131 -= local203[local427];
						local243 -= local200[local427];
						local374 -= local206[local427];
					}
					if (local378 >= 0 && local374 > 0) {
						@Pc(476) int[] local476 = local366[local378 >> 6];
						@Pc(494) int local494 = local376 == 0 ? 0 : Static5.method57(local306 / local374, local131 * 256 / local376, local243 / local374);
						if (local23[local118][local378] != 0) {
							if (local476 == null) {
								local476 = local366[local378 >> 6] = new int[4096];
							}
							@Pc(520) int local520 = (local494 & 0x7F) + local13;
							if (local520 < 0) {
								local520 = 0;
							} else if (local520 > 127) {
								local520 = 127;
							}
							@Pc(548) int local548 = (local19 + local494 & 0xFC00) + ((local494 & 0x380) + local520);
							local476[(local118 & 0x3F) + ((local378 & 0x3F) << 6)] = Static18.anIntArray26[Static276.method2806(96, local548)];
						} else if (local476 != null) {
							local476[(local118 & 0x3F) + ((local378 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}
}
