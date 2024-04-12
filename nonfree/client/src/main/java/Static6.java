import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!b", name = "W", descriptor = "I")
	public static int anInt221;

	@OriginalMember(owner = "client!b", name = "X", descriptor = "I")
	public static int anInt222;

	@OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
	public static int anInt223;

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "Lclient!ld;")
	public static Interface4 anInterface4_1;

	@OriginalMember(owner = "client!b", name = "db", descriptor = "I")
	public static int anInt224;

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
	public static int anInt225;

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
	public static int anInt226;

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
	public static int anInt227;

	@OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
	private static int anInt229;

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "[I")
	private static int[] anIntArray62;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I", line = 3)
	private static int method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (127 - arg1) * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()[I", line = 14)
	public static int[] method167() {
		return anIntArray62;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(D)V", line = 18)
	public static void method168(@OriginalArg(0) double arg0) {
		@Pc(7) double local7 = arg0 + Math.random() * 0.03D - 0.015D;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 512; local11++) {
			@Pc(21) double local21 = (double) (local11 >> 3) / 64.0D + 0.0078125D;
			@Pc(30) double local30 = (double) (local11 & 0x7) / 8.0D + 0.0625D;
			for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
				@Pc(38) double local38 = (double) local32 / 128.0D;
				@Pc(40) double local40 = local38;
				@Pc(42) double local42 = local38;
				@Pc(44) double local44 = local38;
				if (local30 != 0.0D) {
					@Pc(58) double local58;
					if (local38 < 0.5D) {
						local58 = local38 * (local30 + 1.0D);
					} else {
						local58 = local38 + local30 - local38 * local30;
					}
					@Pc(73) double local73 = local38 * 2.0D - local58;
					@Pc(77) double local77 = local21 + 0.3333333333333333D;
					if (local77 > 1.0D) {
						local77--;
					}
					@Pc(91) double local91 = local21 - 0.3333333333333333D;
					if (local91 < 0.0D) {
						local91++;
					}
					if (local77 * 6.0D < 1.0D) {
						local40 = local73 + (local58 - local73) * 6.0D * local77;
					} else if (local77 * 2.0D < 1.0D) {
						local40 = local58;
					} else if (local77 * 3.0D < 2.0D) {
						local40 = local73 + (local58 - local73) * (0.6666666666666666D - local77) * 6.0D;
					} else {
						local40 = local73;
					}
					if (local21 * 6.0D < 1.0D) {
						local42 = local73 + (local58 - local73) * 6.0D * local21;
					} else if (local21 * 2.0D < 1.0D) {
						local42 = local58;
					} else if (local21 * 3.0D < 2.0D) {
						local42 = local73 + (local58 - local73) * (0.6666666666666666D - local21) * 6.0D;
					} else {
						local42 = local73;
					}
					if (local91 * 6.0D < 1.0D) {
						local44 = local73 + (local58 - local73) * 6.0D * local91;
					} else if (local91 * 2.0D < 1.0D) {
						local44 = local58;
					} else if (local91 * 3.0D < 2.0D) {
						local44 = local73 + (local58 - local73) * (0.6666666666666666D - local91) * 6.0D;
					} else {
						local44 = local73;
					}
				}
				@Pc(245) int local245 = (int) (local40 * 256.0D);
				@Pc(250) int local250 = (int) (local42 * 256.0D);
				@Pc(255) int local255 = (int) (local44 * 256.0D);
				@Pc(265) int local265 = (local245 << 16) + (local250 << 8) + local255;
				local265 = method171(local265, local7);
				if (local265 == 0) {
					local265 = 1;
				}
				Class2_Sub2_Sub2_Sub1.anIntArray63[local9++] = local265;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII[I)[I", line = 127)
	private static int[] method169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		anInt222 = arg2 - arg0;
		anInt229 = arg3 - arg1;
		if (arg4 == null) {
			@Pc(11) int local11 = anInt229;
			if (local11 == 0) {
				local11++;
			}
			anIntArray62 = new int[local11];
			for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
				anIntArray62[local19] = (arg1 + local19) * Static25.anInt2440 + arg0;
			}
		} else {
			anIntArray62 = arg4;
		}
		method178();
		return anIntArray62;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V", line = 157)
	private static void method170(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg5 >= arg6) {
			return;
		}
		@Pc(13) int local13;
		@Pc(38) int local38;
		if (Class2_Sub2_Sub2_Sub1.aBoolean19) {
			local13 = (arg8 - arg7) / (arg6 - arg5);
			if (arg6 > anInt222) {
				arg6 = anInt222;
			}
			if (arg5 < 0) {
				arg7 -= arg5 * local13;
				arg5 = 0;
			}
			if (arg5 >= arg6) {
				return;
			}
			local38 = arg6 - arg5 >> 3;
			local13 <<= 0xC;
			arg7 <<= 0x9;
		} else {
			if (arg6 - arg5 > 7) {
				local38 = arg6 - arg5 >> 3;
				local13 = (arg8 - arg7) * Class2_Sub2_Sub2_Sub1.anIntArray60[local38] >> 6;
			} else {
				local38 = 0;
				local13 = 0;
			}
			arg7 <<= 0x9;
		}
		arg4 += arg5;
		@Pc(85) int local85;
		@Pc(87) int local87;
		@Pc(119) int local119;
		@Pc(91) int local91;
		@Pc(182) int local182;
		@Pc(188) int local188;
		@Pc(200) int local200;
		@Pc(206) int local206;
		@Pc(99) int local99;
		@Pc(107) int local107;
		@Pc(115) int local115;
		if (Class2_Sub2_Sub2_Sub1.aBoolean20) {
			local85 = 0;
			local87 = 0;
			local91 = arg5 - anInt225;
			local99 = arg9 + (arg12 >> 3) * local91;
			local107 = arg10 + (arg13 >> 3) * local91;
			local115 = arg11 + (arg14 >> 3) * local91;
			local119 = local115 >> 12;
			if (local119 != 0) {
				arg2 = local99 / local119;
				arg3 = local107 / local119;
				if (arg2 < 0) {
					arg2 = 0;
				} else if (arg2 > 4032) {
					arg2 = 4032;
				}
			}
			arg9 = local99 + arg12;
			arg10 = local107 + arg13;
			arg11 = local115 + arg14;
			local119 = arg11 >> 12;
			if (local119 != 0) {
				local85 = arg9 / local119;
				local87 = arg10 / local119;
				if (local85 < 7) {
					local85 = 7;
				} else if (local85 > 4032) {
					local85 = 4032;
				}
			}
			local182 = local85 - arg2 >> 3;
			local188 = local87 - arg3 >> 3;
			arg2 += arg7 >> 3 & 0xC0000;
			local200 = arg7 >> 23;
			if (Class2_Sub2_Sub2_Sub1.aBoolean21) {
				while (local38-- > 0) {
					local206 = arg4 + 1;
					arg0[arg4] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg0[local206++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
					arg4 = local206 + 1;
					arg0[local206] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 = local85;
					arg3 = local87;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					local119 = arg11 >> 12;
					if (local119 != 0) {
						local85 = arg9 / local119;
						local87 = arg10 / local119;
						if (local85 < 7) {
							local85 = 7;
						} else if (local85 > 4032) {
							local85 = 4032;
						}
					}
					local182 = local85 - arg2 >> 3;
					local188 = local87 - arg3 >> 3;
					arg7 += local13;
					arg2 += arg7 >> 3 & 0xC0000;
					local200 = arg7 >> 23;
				}
				local38 = arg6 - arg5 & 0x7;
				while (local38-- > 0) {
					arg0[arg4++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200;
					arg2 += local182;
					arg3 += local188;
				}
			} else {
				while (local38-- > 0) {
					@Pc(498) int local498;
					if ((local498 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[arg4] = local498;
					}
					local206 = arg4 + 1;
					arg2 += local182;
					arg3 += local188;
					@Pc(525) int local525;
					if ((local525 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local525;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(552) int local552;
					if ((local552 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local552;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(579) int local579;
					if ((local579 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local579;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(606) int local606;
					if ((local606 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local606;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(633) int local633;
					if ((local633 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local633;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(660) int local660;
					if ((local660 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local660;
					}
					local206++;
					arg2 += local182;
					arg3 += local188;
					@Pc(687) int local687;
					if ((local687 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[local206] = local687;
					}
					arg4 = local206 + 1;
					arg2 = local85;
					arg3 = local87;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					local119 = arg11 >> 12;
					if (local119 != 0) {
						local85 = arg9 / local119;
						local87 = arg10 / local119;
						if (local85 < 7) {
							local85 = 7;
						} else if (local85 > 4032) {
							local85 = 4032;
						}
					}
					local182 = local85 - arg2 >> 3;
					local188 = local87 - arg3 >> 3;
					arg7 += local13;
					arg2 += arg7 >> 3 & 0xC0000;
					local200 = arg7 >> 23;
				}
				local38 = arg6 - arg5 & 0x7;
				while (local38-- > 0) {
					@Pc(785) int local785;
					if ((local785 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local200) != 0) {
						arg0[arg4] = local785;
					}
					arg4++;
					arg2 += local182;
					arg3 += local188;
				}
			}
			return;
		}
		local85 = 0;
		local87 = 0;
		local91 = arg5 - anInt225;
		local99 = arg9 + (arg12 >> 3) * local91;
		local107 = arg10 + (arg13 >> 3) * local91;
		local115 = arg11 + (arg14 >> 3) * local91;
		local119 = local115 >> 14;
		if (local119 != 0) {
			arg2 = local99 / local119;
			arg3 = local107 / local119;
			if (arg2 < 0) {
				arg2 = 0;
			} else if (arg2 > 16256) {
				arg2 = 16256;
			}
		}
		arg9 = local99 + arg12;
		arg10 = local107 + arg13;
		arg11 = local115 + arg14;
		local119 = arg11 >> 14;
		if (local119 != 0) {
			local85 = arg9 / local119;
			local87 = arg10 / local119;
			if (local85 < 7) {
				local85 = 7;
			} else if (local85 > 16256) {
				local85 = 16256;
			}
		}
		local182 = local85 - arg2 >> 3;
		local188 = local87 - arg3 >> 3;
		arg2 += arg7 & 0x600000;
		local200 = arg7 >> 23;
		if (Class2_Sub2_Sub2_Sub1.aBoolean21) {
			while (local38-- > 0) {
				local206 = arg4 + 1;
				arg0[arg4] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(947) int local947 = local206 + 1;
				arg0[local206] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(970) int local970 = local947 + 1;
				arg0[local947] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(993) int local993 = local970 + 1;
				arg0[local970] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(1016) int local1016 = local993 + 1;
				arg0[local993] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(1039) int local1039 = local1016 + 1;
				arg0[local1016] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				@Pc(1062) int local1062 = local1039 + 1;
				arg0[local1039] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
				arg4 = local1062 + 1;
				arg0[local1062] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 = local85;
				arg3 = local87;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				local119 = arg11 >> 14;
				if (local119 != 0) {
					local85 = arg9 / local119;
					local87 = arg10 / local119;
					if (local85 < 7) {
						local85 = 7;
					} else if (local85 > 16256) {
						local85 = 16256;
					}
				}
				local182 = local85 - arg2 >> 3;
				local188 = local87 - arg3 >> 3;
				arg7 += local13;
				arg2 += arg7 & 0x600000;
				local200 = arg7 >> 23;
			}
			local38 = arg6 - arg5 & 0x7;
			while (local38-- > 0) {
				arg0[arg4++] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200;
				arg2 += local182;
				arg3 += local188;
			}
			return;
		}
		while (local38-- > 0) {
			@Pc(1214) int local1214;
			if ((local1214 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[arg4] = local1214;
			}
			local206 = arg4 + 1;
			arg2 += local182;
			arg3 += local188;
			@Pc(1241) int local1241;
			if ((local1241 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1241;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1268) int local1268;
			if ((local1268 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1268;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1295) int local1295;
			if ((local1295 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1295;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1322) int local1322;
			if ((local1322 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1322;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1349) int local1349;
			if ((local1349 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1349;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1376) int local1376;
			if ((local1376 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1376;
			}
			local206++;
			arg2 += local182;
			arg3 += local188;
			@Pc(1403) int local1403;
			if ((local1403 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[local206] = local1403;
			}
			arg4 = local206 + 1;
			arg2 = local85;
			arg3 = local87;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			local119 = arg11 >> 14;
			if (local119 != 0) {
				local85 = arg9 / local119;
				local87 = arg10 / local119;
				if (local85 < 7) {
					local85 = 7;
				} else if (local85 > 16256) {
					local85 = 16256;
				}
			}
			local182 = local85 - arg2 >> 3;
			local188 = local87 - arg3 >> 3;
			arg7 += local13;
			arg2 += arg7 & 0x600000;
			local200 = arg7 >> 23;
		}
		local38 = arg6 - arg5 & 0x7;
		while (local38-- > 0) {
			@Pc(1499) int local1499;
			if ((local1499 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local200) != 0) {
				arg0[arg4] = local1499;
			}
			arg4++;
			arg2 += local182;
			arg3 += local188;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ID)I", line = 642)
	public static int method171(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(6) double local6 = (double) (arg0 >> 16) / 256.0D;
		@Pc(15) double local15 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(22) double local22 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = Math.pow(local6, arg1);
		@Pc(30) double local30 = Math.pow(local15, arg1);
		@Pc(34) double local34 = Math.pow(local22, arg1);
		@Pc(39) int local39 = (int) (local26 * 256.0D);
		@Pc(44) int local44 = (int) (local30 * 256.0D);
		@Pc(49) int local49 = (int) (local34 * 256.0D);
		return (local39 << 16) + (local44 << 8) + local49;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIII)V", line = 660)
	public static void method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
			local3 = (arg7 - arg6 << 15) / (arg1 - arg0);
		}
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		if (arg2 != arg1) {
			local28 = (arg5 - arg4 << 16) / (arg2 - arg1);
			local30 = (arg8 - arg7 << 15) / (arg2 - arg1);
		}
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		if (arg2 != arg0) {
			local55 = (arg3 - arg5 << 16) / (arg0 - arg2);
			local57 = (arg6 - arg8 << 15) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt229) {
				if (arg1 > anInt229) {
					arg1 = anInt229;
				}
				if (arg2 > anInt229) {
					arg2 = anInt229;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					arg8 = arg6 <<= 0xF;
					if (arg0 < 0) {
						arg5 -= local55 * arg0;
						arg3 -= local1 * arg0;
						arg8 -= local57 * arg0;
						arg6 -= local3 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					arg7 <<= 0xF;
					if (arg1 < 0) {
						arg4 -= local28 * arg1;
						arg7 -= local30 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local55 < local1 || arg0 == arg1 && local55 > local28) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method179(Static25.anIntArray533, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
									arg5 += local55;
									arg4 += local28;
									arg8 += local57;
									arg7 += local30;
									arg0 += Static25.anInt2440;
								}
							}
							method179(Static25.anIntArray533, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
							arg5 += local55;
							arg3 += local1;
							arg8 += local57;
							arg6 += local3;
							arg0 += Static25.anInt2440;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method179(Static25.anIntArray533, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
									arg5 += local55;
									arg4 += local28;
									arg8 += local57;
									arg7 += local30;
									arg0 += Static25.anInt2440;
								}
							}
							method179(Static25.anIntArray533, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
							arg5 += local55;
							arg3 += local1;
							arg8 += local57;
							arg6 += local3;
							arg0 += Static25.anInt2440;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					arg7 = arg6 <<= 0xF;
					if (arg0 < 0) {
						arg4 -= local55 * arg0;
						arg3 -= local1 * arg0;
						arg7 -= local57 * arg0;
						arg6 -= local3 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0xF;
					if (arg2 < 0) {
						arg5 -= local28 * arg2;
						arg8 -= local30 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local55 < local1 || arg0 == arg2 && local28 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method179(Static25.anIntArray533, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg5 += local28;
									arg3 += local1;
									arg8 += local30;
									arg6 += local3;
									arg0 += Static25.anInt2440;
								}
							}
							method179(Static25.anIntArray533, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg4 += local55;
							arg3 += local1;
							arg7 += local57;
							arg6 += local3;
							arg0 += Static25.anInt2440;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method179(Static25.anIntArray533, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg5 += local28;
									arg3 += local1;
									arg8 += local30;
									arg6 += local3;
									arg0 += Static25.anInt2440;
								}
							}
							method179(Static25.anIntArray533, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg4 += local55;
							arg3 += local1;
							arg7 += local57;
							arg6 += local3;
							arg0 += Static25.anInt2440;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt229) {
				if (arg2 > anInt229) {
					arg2 = anInt229;
				}
				if (arg0 > anInt229) {
					arg0 = anInt229;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					arg6 = arg7 <<= 0xF;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local28 * arg1;
						arg6 -= local3 * arg1;
						arg7 -= local30 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0xF;
					if (arg2 < 0) {
						arg5 -= local55 * arg2;
						arg8 -= local57 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local28 || arg1 == arg2 && local1 > local55) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method179(Static25.anIntArray533, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg3 += local1;
									arg5 += local55;
									arg6 += local3;
									arg8 += local57;
									arg1 += Static25.anInt2440;
								}
							}
							method179(Static25.anIntArray533, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg3 += local1;
							arg4 += local28;
							arg6 += local3;
							arg7 += local30;
							arg1 += Static25.anInt2440;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method179(Static25.anIntArray533, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg3 += local1;
									arg5 += local55;
									arg6 += local3;
									arg8 += local57;
									arg1 += Static25.anInt2440;
								}
							}
							method179(Static25.anIntArray533, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg3 += local1;
							arg4 += local28;
							arg6 += local3;
							arg7 += local30;
							arg1 += Static25.anInt2440;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					arg8 = arg7 <<= 0xF;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local28 * arg1;
						arg8 -= local3 * arg1;
						arg7 -= local30 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					arg6 <<= 0xF;
					if (arg0 < 0) {
						arg3 -= local55 * arg0;
						arg6 -= local57 * arg0;
						arg0 = 0;
					}
					if (local1 < local28) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method179(Static25.anIntArray533, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
									arg3 += local55;
									arg4 += local28;
									arg6 += local57;
									arg7 += local30;
									arg1 += Static25.anInt2440;
								}
							}
							method179(Static25.anIntArray533, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
							arg5 += local1;
							arg4 += local28;
							arg8 += local3;
							arg7 += local30;
							arg1 += Static25.anInt2440;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method179(Static25.anIntArray533, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
									arg3 += local55;
									arg4 += local28;
									arg6 += local57;
									arg7 += local30;
									arg1 += Static25.anInt2440;
								}
							}
							method179(Static25.anIntArray533, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
							arg5 += local1;
							arg4 += local28;
							arg8 += local3;
							arg7 += local30;
							arg1 += Static25.anInt2440;
						}
					}
				}
			}
		} else if (arg2 < anInt229) {
			if (arg0 > anInt229) {
				arg0 = anInt229;
			}
			if (arg1 > anInt229) {
				arg1 = anInt229;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				arg7 = arg8 <<= 0xF;
				if (arg2 < 0) {
					arg4 -= local28 * arg2;
					arg5 -= local55 * arg2;
					arg7 -= local30 * arg2;
					arg8 -= local57 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				arg6 <<= 0xF;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg6 -= local3 * arg0;
					arg0 = 0;
				}
				if (local28 < local55) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method179(Static25.anIntArray533, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
								arg4 += local28;
								arg3 += local1;
								arg7 += local30;
								arg6 += local3;
								arg2 += Static25.anInt2440;
							}
						}
						method179(Static25.anIntArray533, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += local28;
						arg5 += local55;
						arg7 += local30;
						arg8 += local57;
						arg2 += Static25.anInt2440;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method179(Static25.anIntArray533, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
								arg4 += local28;
								arg3 += local1;
								arg7 += local30;
								arg6 += local3;
								arg2 += Static25.anInt2440;
							}
						}
						method179(Static25.anIntArray533, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += local28;
						arg5 += local55;
						arg7 += local30;
						arg8 += local57;
						arg2 += Static25.anInt2440;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg6 = arg8 <<= 0xF;
				if (arg2 < 0) {
					arg3 -= local28 * arg2;
					arg5 -= local55 * arg2;
					arg6 -= local30 * arg2;
					arg8 -= local57 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				arg7 <<= 0xF;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg7 -= local3 * arg1;
					arg1 = 0;
				}
				if (local28 < local55) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method179(Static25.anIntArray533, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
								arg4 += local1;
								arg5 += local55;
								arg7 += local3;
								arg8 += local57;
								arg2 += Static25.anInt2440;
							}
						}
						method179(Static25.anIntArray533, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += local28;
						arg5 += local55;
						arg6 += local30;
						arg8 += local57;
						arg2 += Static25.anInt2440;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method179(Static25.anIntArray533, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
								arg4 += local1;
								arg5 += local55;
								arg7 += local3;
								arg8 += local57;
								arg2 += Static25.anInt2440;
							}
						}
						method179(Static25.anIntArray533, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += local28;
						arg5 += local55;
						arg6 += local30;
						arg8 += local57;
						arg2 += Static25.anInt2440;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ld;)V", line = 1203)
	public static void method173(@OriginalArg(0) Interface4 arg0) {
		anInterface4_1 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII)V", line = 1215)
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt229) {
				if (arg1 > anInt229) {
					arg1 = anInt229;
				}
				if (arg2 > anInt229) {
					arg2 = anInt229;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local31 < local1 || arg0 == arg1 && local31 > local16) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method181(Static25.anIntArray533, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static25.anInt2440;
								}
							}
							method181(Static25.anIntArray533, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static25.anInt2440;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method181(Static25.anIntArray533, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static25.anInt2440;
								}
							}
							method181(Static25.anIntArray533, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static25.anInt2440;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local16 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local31 < local1 || arg0 == arg2 && local16 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method181(Static25.anIntArray533, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static25.anInt2440;
								}
							}
							method181(Static25.anIntArray533, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static25.anInt2440;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method181(Static25.anIntArray533, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static25.anInt2440;
								}
							}
							method181(Static25.anIntArray533, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static25.anInt2440;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt229) {
				if (arg2 > anInt229) {
					arg2 = anInt229;
				}
				if (arg0 > anInt229) {
					arg0 = anInt229;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local31 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method181(Static25.anIntArray533, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static25.anInt2440;
								}
							}
							method181(Static25.anIntArray533, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static25.anInt2440;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method181(Static25.anIntArray533, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static25.anInt2440;
								}
							}
							method181(Static25.anIntArray533, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static25.anInt2440;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local31 * arg0;
						arg0 = 0;
					}
					if (local1 < local16) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method181(Static25.anIntArray533, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static25.anInt2440;
								}
							}
							method181(Static25.anIntArray533, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static25.anInt2440;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method181(Static25.anIntArray533, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static25.anInt2440;
								}
							}
							method181(Static25.anIntArray533, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static25.anInt2440;
						}
					}
				}
			}
		} else if (arg2 < anInt229) {
			if (arg0 > anInt229) {
				arg0 = anInt229;
			}
			if (arg1 > anInt229) {
				arg1 = anInt229;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				if (local16 < local31) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method181(Static25.anIntArray533, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static25.anInt2440;
							}
						}
						method181(Static25.anIntArray533, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static25.anInt2440;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method181(Static25.anIntArray533, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static25.anInt2440;
							}
						}
						method181(Static25.anIntArray533, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static25.anInt2440;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				if (local16 < local31) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method181(Static25.anIntArray533, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static25.anInt2440;
							}
						}
						method181(Static25.anIntArray533, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static25.anInt2440;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method181(Static25.anIntArray533, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static25.anInt2440;
							}
						}
						method181(Static25.anIntArray533, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static25.anInt2440;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([I)[I", line = 1664)
	public static int[] method175(@OriginalArg(0) int[] arg0) {
		return method169(Class2_Sub2_Sub2.anInt2437, Class2_Sub2_Sub2.anInt2439, Class2_Sub2_Sub2.anInt2436, Class2_Sub2_Sub2.anInt2438, arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V", line = 1672)
	public static void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = anInterface4_1.method397(arg18);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = anInterface4_1.method396(arg18);
			method172(arg0, arg1, arg2, arg3, arg4, arg5, method166(local11, arg6), method166(local11, arg7), method166(local11, arg8));
			return;
		}
		Class2_Sub2_Sub2_Sub1.aBoolean20 = anInterface4_1.method394(arg18);
		Class2_Sub2_Sub2_Sub1.aBoolean21 = anInterface4_1.method395(arg18);
		@Pc(42) int local42 = arg9 - arg10;
		@Pc(46) int local46 = arg12 - arg13;
		@Pc(50) int local50 = arg15 - arg16;
		@Pc(54) int local54 = arg11 - arg9;
		@Pc(58) int local58 = arg14 - arg12;
		@Pc(62) int local62 = arg17 - arg15;
		local11 = local54 * arg12 - local58 * arg9 << 14;
		@Pc(82) int local82 = local58 * arg15 - local62 * arg12 << 8;
		@Pc(92) int local92 = local62 * arg9 - local54 * arg15 << 5;
		@Pc(102) int local102 = local42 * arg12 - local46 * arg9 << 14;
		@Pc(112) int local112 = local46 * arg15 - local50 * arg12 << 8;
		@Pc(122) int local122 = local50 * arg9 - local42 * arg15 << 5;
		@Pc(132) int local132 = local46 * local54 - local42 * local58 << 14;
		@Pc(142) int local142 = local50 * local58 - local46 * local62 << 8;
		@Pc(152) int local152 = local42 * local62 - local50 * local54 << 5;
		@Pc(154) int local154 = 0;
		@Pc(156) int local156 = 0;
		if (arg1 != arg0) {
			local154 = (arg4 - arg3 << 16) / (arg1 - arg0);
			local156 = (arg7 - arg6 << 16) / (arg1 - arg0);
		}
		@Pc(181) int local181 = 0;
		@Pc(183) int local183 = 0;
		if (arg2 != arg1) {
			local181 = (arg5 - arg4 << 16) / (arg2 - arg1);
			local183 = (arg8 - arg7 << 16) / (arg2 - arg1);
		}
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		if (arg2 != arg0) {
			local208 = (arg3 - arg5 << 16) / (arg0 - arg2);
			local210 = (arg6 - arg8 << 16) / (arg0 - arg2);
		}
		@Pc(324) int local324;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt229) {
				if (arg1 > anInt229) {
					arg1 = anInt229;
				}
				if (arg2 > anInt229) {
					arg2 = anInt229;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					arg8 = arg6 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local208 * arg0;
						arg3 -= local154 * arg0;
						arg8 -= local210 * arg0;
						arg6 -= local156 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					arg7 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local181 * arg1;
						arg7 -= local183 * arg1;
						arg1 = 0;
					}
					local324 = arg0 - anInt224;
					local11 += local92 * local324;
					local102 += local122 * local324;
					local132 += local152 * local324;
					if (arg0 != arg1 && local208 < local154 || arg0 == arg1 && local208 > local181) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method170(Static25.anIntArray533, local4, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
									arg5 += local208;
									arg4 += local181;
									arg8 += local210;
									arg7 += local183;
									arg0 += Static25.anInt2440;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method170(Static25.anIntArray533, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
							arg5 += local208;
							arg3 += local154;
							arg8 += local210;
							arg6 += local156;
							arg0 += Static25.anInt2440;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method170(Static25.anIntArray533, local4, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
									arg5 += local208;
									arg4 += local181;
									arg8 += local210;
									arg7 += local183;
									arg0 += Static25.anInt2440;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method170(Static25.anIntArray533, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
							arg5 += local208;
							arg3 += local154;
							arg8 += local210;
							arg6 += local156;
							arg0 += Static25.anInt2440;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					arg7 = arg6 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local208 * arg0;
						arg3 -= local154 * arg0;
						arg7 -= local210 * arg0;
						arg6 -= local156 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local181 * arg2;
						arg8 -= local183 * arg2;
						arg2 = 0;
					}
					local324 = arg0 - anInt224;
					local11 += local92 * local324;
					local102 += local122 * local324;
					local132 += local152 * local324;
					if (arg0 != arg2 && local208 < local154 || arg0 == arg2 && local181 > local154) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method170(Static25.anIntArray533, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
									arg5 += local181;
									arg3 += local154;
									arg8 += local183;
									arg6 += local156;
									arg0 += Static25.anInt2440;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method170(Static25.anIntArray533, local4, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
							arg4 += local208;
							arg3 += local154;
							arg7 += local210;
							arg6 += local156;
							arg0 += Static25.anInt2440;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray62[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method170(Static25.anIntArray533, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
									arg5 += local181;
									arg3 += local154;
									arg8 += local183;
									arg6 += local156;
									arg0 += Static25.anInt2440;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method170(Static25.anIntArray533, local4, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
							arg4 += local208;
							arg3 += local154;
							arg7 += local210;
							arg6 += local156;
							arg0 += Static25.anInt2440;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt229) {
				if (arg2 > anInt229) {
					arg2 = anInt229;
				}
				if (arg0 > anInt229) {
					arg0 = anInt229;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					arg6 = arg7 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local154 * arg1;
						arg4 -= local181 * arg1;
						arg6 -= local156 * arg1;
						arg7 -= local183 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local208 * arg2;
						arg8 -= local210 * arg2;
						arg2 = 0;
					}
					local324 = arg1 - anInt224;
					local11 += local92 * local324;
					local102 += local122 * local324;
					local132 += local152 * local324;
					if (arg1 != arg2 && local154 < local181 || arg1 == arg2 && local154 > local208) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method170(Static25.anIntArray533, local4, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
									arg3 += local154;
									arg5 += local208;
									arg6 += local156;
									arg8 += local210;
									arg1 += Static25.anInt2440;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method170(Static25.anIntArray533, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
							arg3 += local154;
							arg4 += local181;
							arg6 += local156;
							arg7 += local183;
							arg1 += Static25.anInt2440;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method170(Static25.anIntArray533, local4, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
									arg3 += local154;
									arg5 += local208;
									arg6 += local156;
									arg8 += local210;
									arg1 += Static25.anInt2440;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method170(Static25.anIntArray533, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
							arg3 += local154;
							arg4 += local181;
							arg6 += local156;
							arg7 += local183;
							arg1 += Static25.anInt2440;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					arg8 = arg7 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local154 * arg1;
						arg4 -= local181 * arg1;
						arg8 -= local156 * arg1;
						arg7 -= local183 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					arg6 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local208 * arg0;
						arg6 -= local210 * arg0;
						arg0 = 0;
					}
					local324 = arg1 - anInt224;
					local11 += local92 * local324;
					local102 += local122 * local324;
					local132 += local152 * local324;
					if (local154 < local181) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method170(Static25.anIntArray533, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
									arg3 += local208;
									arg4 += local181;
									arg6 += local210;
									arg7 += local183;
									arg1 += Static25.anInt2440;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method170(Static25.anIntArray533, local4, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
							arg5 += local154;
							arg4 += local181;
							arg8 += local156;
							arg7 += local183;
							arg1 += Static25.anInt2440;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray62[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method170(Static25.anIntArray533, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
									arg3 += local208;
									arg4 += local181;
									arg6 += local210;
									arg7 += local183;
									arg1 += Static25.anInt2440;
									local11 += local92;
									local102 += local122;
									local132 += local152;
								}
							}
							method170(Static25.anIntArray533, local4, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
							arg5 += local154;
							arg4 += local181;
							arg8 += local156;
							arg7 += local183;
							arg1 += Static25.anInt2440;
							local11 += local92;
							local102 += local122;
							local132 += local152;
						}
					}
				}
			}
		} else if (arg2 < anInt229) {
			if (arg0 > anInt229) {
				arg0 = anInt229;
			}
			if (arg1 > anInt229) {
				arg1 = anInt229;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				arg7 = arg8 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local181 * arg2;
					arg5 -= local208 * arg2;
					arg7 -= local183 * arg2;
					arg8 -= local210 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				arg6 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local154 * arg0;
					arg6 -= local156 * arg0;
					arg0 = 0;
				}
				local324 = arg2 - anInt224;
				local11 += local92 * local324;
				local102 += local122 * local324;
				local132 += local152 * local324;
				if (local181 < local208) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method170(Static25.anIntArray533, local4, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
								arg4 += local181;
								arg3 += local154;
								arg7 += local183;
								arg6 += local156;
								arg2 += Static25.anInt2440;
								local11 += local92;
								local102 += local122;
								local132 += local152;
							}
						}
						method170(Static25.anIntArray533, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
						arg4 += local181;
						arg5 += local208;
						arg7 += local183;
						arg8 += local210;
						arg2 += Static25.anInt2440;
						local11 += local92;
						local102 += local122;
						local132 += local152;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method170(Static25.anIntArray533, local4, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
								arg4 += local181;
								arg3 += local154;
								arg7 += local183;
								arg6 += local156;
								arg2 += Static25.anInt2440;
								local11 += local92;
								local102 += local122;
								local132 += local152;
							}
						}
						method170(Static25.anIntArray533, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
						arg4 += local181;
						arg5 += local208;
						arg7 += local183;
						arg8 += local210;
						arg2 += Static25.anInt2440;
						local11 += local92;
						local102 += local122;
						local132 += local152;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg6 = arg8 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local181 * arg2;
					arg5 -= local208 * arg2;
					arg6 -= local183 * arg2;
					arg8 -= local210 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				arg7 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local154 * arg1;
					arg7 -= local156 * arg1;
					arg1 = 0;
				}
				local324 = arg2 - anInt224;
				local11 += local92 * local324;
				local102 += local122 * local324;
				local132 += local152 * local324;
				if (local181 < local208) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method170(Static25.anIntArray533, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
								arg4 += local154;
								arg5 += local208;
								arg7 += local156;
								arg8 += local210;
								arg2 += Static25.anInt2440;
								local11 += local92;
								local102 += local122;
								local132 += local152;
							}
						}
						method170(Static25.anIntArray533, local4, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local11, local102, local132, local82, local112, local142);
						arg3 += local181;
						arg5 += local208;
						arg6 += local183;
						arg8 += local210;
						arg2 += Static25.anInt2440;
						local11 += local92;
						local102 += local122;
						local132 += local152;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray62[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method170(Static25.anIntArray533, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local11, local102, local132, local82, local112, local142);
								arg4 += local154;
								arg5 += local208;
								arg7 += local156;
								arg8 += local210;
								arg2 += Static25.anInt2440;
								local11 += local92;
								local102 += local122;
								local132 += local152;
							}
						}
						method170(Static25.anIntArray533, local4, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local11, local102, local132, local82, local112, local142);
						arg3 += local181;
						arg5 += local208;
						arg6 += local183;
						arg8 += local210;
						arg2 += Static25.anInt2440;
						local11 += local92;
						local102 += local122;
						local132 += local152;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V", line = 2356)
	public static void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anIntArray62[0];
		@Pc(7) int local7 = local3 / Static25.anInt2440;
		@Pc(13) int local13 = local3 - local7 * Static25.anInt2440;
		anInt225 = arg0 - local13;
		anInt224 = arg1 - local7;
		anInt221 = -anInt225;
		anInt223 = anInt222 - anInt225;
		anInt227 = -anInt224;
		anInt226 = anInt229 - anInt224;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()V", line = 2387)
	public static void method178() {
		anInt225 = anInt222 / 2;
		anInt224 = anInt229 / 2;
		anInt221 = -anInt225;
		anInt223 = anInt222 - anInt225;
		anInt227 = -anInt224;
		anInt226 = anInt229 - anInt224;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([IIIIIIII)V", line = 2396)
	private static void method179(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(16) int local16;
		@Pc(143) int local143;
		@Pc(147) int local147;
		@Pc(48) int local48;
		@Pc(91) int local91;
		if (Class2_Sub2_Sub2_Sub1.aBoolean18) {
			if (Class2_Sub2_Sub2_Sub1.aBoolean19) {
				if (arg3 - arg2 > 3) {
					local16 = (arg5 - arg4) / (arg3 - arg2);
				} else {
					local16 = 0;
				}
				if (arg3 > anInt222) {
					arg3 = anInt222;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local16;
					arg2 = 0;
				}
				if (arg2 >= arg3) {
					return;
				}
				arg1 += arg2;
				local48 = arg3 - arg2 >> 2;
				local16 <<= 0x2;
			} else if (arg2 < arg3) {
				arg1 += arg2;
				local48 = arg3 - arg2 >> 2;
				if (local48 > 0) {
					local16 = (arg5 - arg4) * Class2_Sub2_Sub2_Sub1.anIntArray60[local48] >> 15;
				} else {
					local16 = 0;
				}
			} else {
				return;
			}
			@Pc(98) int local98;
			if (Class2_Sub2_Sub2_Sub1.anInt228 == 0) {
				while (true) {
					local48--;
					if (local48 < 0) {
						local48 = arg3 - arg2 & 0x3;
						if (local48 > 0) {
							local91 = Class2_Sub2_Sub2_Sub1.anIntArray63[arg4 >> 8];
							do {
								arg0[arg1++] = local91;
								local48--;
							} while (local48 > 0);
							return;
						}
						break;
					}
					local91 = Class2_Sub2_Sub2_Sub1.anIntArray63[arg4 >> 8];
					arg4 += local16;
					local98 = arg1 + 1;
					arg0[arg1] = local91;
					@Pc(103) int local103 = local98 + 1;
					arg0[local98] = local91;
					@Pc(108) int local108 = local103 + 1;
					arg0[local103] = local91;
					arg1 = local108 + 1;
					arg0[local108] = local91;
				}
			} else {
				local143 = Class2_Sub2_Sub2_Sub1.anInt228;
				local147 = 256 - Class2_Sub2_Sub2_Sub1.anInt228;
				while (true) {
					local48--;
					if (local48 < 0) {
						local48 = arg3 - arg2 & 0x3;
						if (local48 > 0) {
							local91 = Class2_Sub2_Sub2_Sub1.anIntArray63[arg4 >> 8];
							local91 = ((local91 & 0xFF00FF) * local147 >> 8 & 0xFF00FF) + ((local91 & 0xFF00) * local147 >> 8 & 0xFF00);
							do {
								arg0[arg1++] = local91 + ((arg0[arg1] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local143 >> 8 & 0xFF00);
								local48--;
							} while (local48 > 0);
						}
						break;
					}
					local91 = Class2_Sub2_Sub2_Sub1.anIntArray63[arg4 >> 8];
					arg4 += local16;
					local91 = ((local91 & 0xFF00FF) * local147 >> 8 & 0xFF00FF) + ((local91 & 0xFF00) * local147 >> 8 & 0xFF00);
					local98 = arg1 + 1;
					arg0[arg1] = local91 + ((arg0[local98] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[local98] & 0xFF00) * local143 >> 8 & 0xFF00);
					arg0[local98++] = local91 + ((arg0[local98] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[local98] & 0xFF00) * local143 >> 8 & 0xFF00);
					arg0[local98++] = local91 + ((arg0[local98] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[local98] & 0xFF00) * local143 >> 8 & 0xFF00);
					arg1 = local98 + 1;
					arg0[local98] = local91 + ((arg0[arg1] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local143 >> 8 & 0xFF00);
				}
			}
		} else if (arg2 < arg3) {
			local16 = (arg5 - arg4) / (arg3 - arg2);
			if (Class2_Sub2_Sub2_Sub1.aBoolean19) {
				if (arg3 > anInt222) {
					arg3 = anInt222;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local16;
					arg2 = 0;
				}
				if (arg2 >= arg3) {
					return;
				}
			}
			@Pc(401) int local401 = arg1 + arg2;
			local48 = arg3 - arg2;
			if (Class2_Sub2_Sub2_Sub1.anInt228 == 0) {
				do {
					arg0[local401++] = Class2_Sub2_Sub2_Sub1.anIntArray63[arg4 >> 8];
					arg4 += local16;
					local48--;
				} while (local48 > 0);
			} else {
				local143 = Class2_Sub2_Sub2_Sub1.anInt228;
				local147 = 256 - Class2_Sub2_Sub2_Sub1.anInt228;
				do {
					local91 = Class2_Sub2_Sub2_Sub1.anIntArray63[arg4 >> 8];
					arg4 += local16;
					@Pc(460) int local460 = ((local91 & 0xFF00FF) * local147 >> 8 & 0xFF00FF) + ((local91 & 0xFF00) * local147 >> 8 & 0xFF00);
					arg0[local401++] = local460 + ((arg0[local401] & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg0[local401] & 0xFF00) * local143 >> 8 & 0xFF00);
					local48--;
				} while (local48 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()V", line = 2553)
	public static void method180() {
		anIntArray62 = null;
		Class2_Sub2_Sub2_Sub1.anIntArray63 = null;
		anInterface4_1 = null;
		Class2_Sub2_Sub2_Sub1.anIntArray60 = null;
		Class2_Sub2_Sub2_Sub1.anIntArray61 = null;
		Class2_Sub2_Sub2_Sub1.anIntArray59 = null;
		Class2_Sub2_Sub2_Sub1.anIntArray58 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([IIIIII)V", line = 2567)
	private static void method181(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Class2_Sub2_Sub2_Sub1.aBoolean19) {
			if (arg4 > anInt222) {
				arg4 = anInt222;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(24) int local24 = arg4 - arg3 >> 2;
		@Pc(30) int local30;
		if (Class2_Sub2_Sub2_Sub1.anInt228 == 0) {
			while (true) {
				local24--;
				if (local24 < 0) {
					local24 = arg4 - arg3 & 0x3;
					while (true) {
						local24--;
						if (local24 < 0) {
							return;
						}
						arg0[arg1++] = arg2;
					}
				}
				local30 = arg1 + 1;
				arg0[arg1] = arg2;
				arg0[local30++] = arg2;
				arg0[local30++] = arg2;
				arg1 = local30 + 1;
				arg0[local30] = arg2;
			}
			return;
		}
		@Pc(68) int local68 = Class2_Sub2_Sub2_Sub1.anInt228;
		@Pc(72) int local72 = 256 - Class2_Sub2_Sub2_Sub1.anInt228;
		@Pc(92) int local92 = ((arg2 & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * local72 >> 8 & 0xFF00);
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg4 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg1++] = local92 + ((arg0[arg1] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local68 >> 8 & 0xFF00);
				}
			}
			local30 = arg1 + 1;
			arg0[arg1] = local92 + ((arg0[local30] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[local30] & 0xFF00) * local68 >> 8 & 0xFF00);
			@Pc(125) int local125 = local30 + 1;
			arg0[local30] = local92 + ((arg0[local125] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[local125] & 0xFF00) * local68 >> 8 & 0xFF00);
			@Pc(154) int local154 = local125 + 1;
			arg0[local125] = local92 + ((arg0[local154] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[local154] & 0xFF00) * local68 >> 8 & 0xFF00);
			arg1 = local154 + 1;
			arg0[local154] = local92 + ((arg0[arg1] & 0xFF00FF) * local68 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local68 >> 8 & 0xFF00);
		}
	}
}
