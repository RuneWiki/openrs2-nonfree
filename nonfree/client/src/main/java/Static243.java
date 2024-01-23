import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt4497 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method3851(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(7) int local7 = Static249.anInt5576 >> 2 << 10;
		@Pc(15) int local15 = Static249.anInt5572 >> 1;
		@Pc(19) byte[][] local19 = new byte[Static249.anInt5575][Static249.anInt5574];
		@Pc(33) int local33;
		@Pc(103) int local103;
		@Pc(116) int local116;
		while (arg0.anInt2018 < arg0.aByteArray63.length) {
			@Pc(31) boolean local31 = false;
			local33 = 0;
			@Pc(35) int local35 = 0;
			if (arg0.method1853() == 1) {
				local31 = true;
				local33 = arg0.method1853();
				local35 = arg0.method1853();
			}
			@Pc(59) int local59 = arg0.method1853();
			@Pc(65) int local65 = arg0.method1853();
			@Pc(76) int local76 = Static249.anInt5574 + Static249.anInt5571 - local65 * 64 - 1;
			@Pc(83) int local83 = local59 * 64 - Static249.anInt5573;
			if (local83 >= 0 && local76 - 63 >= 0 && local83 + 63 < Static249.anInt5575 && local76 < Static249.anInt5574) {
				for (local103 = 0; local103 < 64; local103++) {
					@Pc(114) byte[] local114 = local19[local103 + local83];
					for (local116 = 0; local116 < 64; local116++) {
						if (!local31 || local33 * 8 <= local103 && local33 * 8 + 8 > local103 && local35 * 8 <= local116 && local35 * 8 + 8 > local116) {
							local114[local76 - local116] = arg0.method1829();
						}
					}
				}
			} else if (local31) {
				arg0.anInt2018 += 64;
			} else {
				arg0.anInt2018 += 4096;
			}
		}
		@Pc(192) int local192 = Static249.anInt5575;
		local33 = Static249.anInt5574;
		@Pc(197) int[] local197 = new int[local33];
		@Pc(200) int[] local200 = new int[local33];
		@Pc(203) int[] local203 = new int[local33];
		@Pc(218) int[] local218 = new int[local33];
		@Pc(221) int[] local221 = new int[local33];
		for (local103 = -5; local103 < local192; local103++) {
			if ((local103 & 0x1FF) == 0) {
				Static173.method2973(true);
			}
			@Pc(260) int local260;
			@Pc(324) int local324;
			for (@Pc(238) int local238 = 0; local238 < local33; local238++) {
				local116 = local103 + 5;
				@Pc(305) int local305;
				if (local116 < local192) {
					local260 = local19[local116][local238] & 0xFF;
					if (local260 > 0) {
						@Pc(269) Class65 local269 = Static233.method3753(local260 - 1);
						local197[local238] += local269.anInt1887;
						local200[local238] += local269.anInt1883;
						local203[local238] += local269.anInt1890;
						local218[local238] += local269.anInt1886;
						local305 = local221[local238]++;
					}
				}
				local260 = local103 - 5;
				if (local260 >= 0) {
					local324 = local19[local260][local238] & 0xFF;
					if (local324 > 0) {
						@Pc(335) Class65 local335 = Static233.method3753(local324 - 1);
						local197[local238] -= local335.anInt1887;
						local200[local238] -= local335.anInt1883;
						local203[local238] -= local335.anInt1890;
						local218[local238] -= local335.anInt1886;
						local305 = local221[local238]--;
					}
				}
			}
			if (local103 >= 0) {
				@Pc(387) int[][] local387 = Static249.anIntArrayArrayArray15[local103 >> 6];
				local116 = 0;
				local260 = 0;
				local324 = 0;
				@Pc(395) int local395 = 0;
				@Pc(397) int local397 = 0;
				for (@Pc(399) int local399 = -5; local399 < local33; local399++) {
					@Pc(410) int local410 = local399 + 5;
					@Pc(414) int local414 = local399 - 5;
					if (local33 > local410) {
						local397 += local221[local410];
						local395 += local218[local410];
						local260 += local200[local410];
						local116 += local197[local410];
						local324 += local203[local410];
					}
					if (local414 >= 0) {
						local395 -= local218[local414];
						local324 -= local203[local414];
						local260 -= local200[local414];
						local116 -= local197[local414];
						local397 -= local221[local414];
					}
					if (local399 >= 0 && local397 > 0) {
						@Pc(498) int[] local498 = local387[local399 >> 6];
						@Pc(517) int local517 = local395 == 0 ? 0 : Static217.method3521(local260 / local397, local324 / local397, local116 * 256 / local395);
						if (local19[local103][local399] != 0) {
							if (local498 == null) {
								local498 = local387[local399 >> 6] = new int[4096];
							}
							@Pc(542) int local542 = (local517 & 0x7F) + local15;
							if (local542 < 0) {
								local542 = 0;
							} else if (local542 > 127) {
								local542 = 127;
							}
							@Pc(568) int local568 = local542 + (local517 & 0x380) + (local7 + local517 & 0xFC00);
							local498[(local103 & 0x3F) + ((local399 & 0x3F) << 6)] = Static119.anIntArray174[Static63.method1129(local568, 96)];
						} else if (local498 != null) {
							local498[(local103 & 0x3F) + ((local399 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(14) int local14 = arg5 - arg2;
		@Pc(19) int local19 = arg3 - arg2;
		@Pc(23) int local23 = arg3 * arg3;
		@Pc(25) int local25 = arg5;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local19 * local19;
		@Pc(37) int local37 = local14 * local14;
		@Pc(41) int local41 = local23 << 1;
		@Pc(45) int local45 = local37 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(58) int local58 = local33 << 1;
		@Pc(62) int local62 = arg5 << 1;
		@Pc(70) int local70 = local29 - local41 * (local62 - 1);
		@Pc(74) int local74 = local14 << 1;
		@Pc(82) int local82 = local37 - (local74 - 1) * local58;
		@Pc(91) int local91 = local49 + (1 - local62) * local23;
		@Pc(101) int local101 = (1 - local74) * local33 + local45;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local37 << 2;
		@Pc(113) int local113 = local23 << 2;
		@Pc(117) int local117 = local33 << 2;
		@Pc(121) int local121 = local49 * 3;
		@Pc(127) int local127 = local41 * (local62 - 3);
		@Pc(133) int local133 = (local74 - 3) * local58;
		@Pc(137) int local137 = local45 * 3;
		@Pc(139) int local139 = local105;
		@Pc(145) int local145 = local113 * (arg5 - 1);
		@Pc(169) int local169;
		@Pc(177) int local177;
		@Pc(186) int local186;
		@Pc(194) int local194;
		if (Static231.anInt4333 <= arg1 && arg1 <= Static218.anInt4086) {
			@Pc(160) int[] local160 = Static40.anIntArrayArray6[arg1];
			local169 = Static306.method4566(arg4 - arg3, Static188.anInt3598, Static289.anInt5245);
			local177 = Static306.method4566(arg3 + arg4, Static188.anInt3598, Static289.anInt5245);
			local186 = Static306.method4566(arg4 - local19, Static188.anInt3598, Static289.anInt5245);
			local194 = Static306.method4566(local19 + arg4, Static188.anInt3598, Static289.anInt5245);
			Static103.method1978(arg0, local186, local169, local160);
			Static103.method1978(arg6, local194, local186, local160);
			Static103.method1978(arg0, local177, local194, local160);
		}
		@Pc(214) int local214 = local109;
		@Pc(220) int local220 = (local14 - 1) * local117;
		while (local25 > 0) {
			if (local91 < 0) {
				while (local91 < 0) {
					local70 += local139;
					local91 += local121;
					local7++;
					local121 += local105;
					local139 += local105;
				}
			}
			if (local70 < 0) {
				local7++;
				local70 += local139;
				local139 += local105;
				local91 += local121;
				local121 += local105;
			}
			local70 += -local127;
			local127 -= local113;
			@Pc(293) boolean local293 = local14 >= local25;
			local25--;
			if (local293) {
				if (local101 < 0) {
					while (local101 < 0) {
						local82 += local214;
						local101 += local137;
						local137 += local109;
						local9++;
						local214 += local109;
					}
				}
				if (local82 < 0) {
					local101 += local137;
					local137 += local109;
					local9++;
					local82 += local214;
					local214 += local109;
				}
				local101 += -local220;
				local220 -= local117;
				local82 += -local133;
				local133 -= local117;
			}
			local177 = local25 + arg1;
			local91 += -local145;
			local145 -= local113;
			local169 = arg1 - local25;
			if (Static231.anInt4333 <= local177 && Static218.anInt4086 >= local169) {
				local186 = Static306.method4566(local7 + arg4, Static188.anInt3598, Static289.anInt5245);
				local194 = Static306.method4566(arg4 - local7, Static188.anInt3598, Static289.anInt5245);
				if (local293) {
					@Pc(446) int local446 = Static306.method4566(local9 + arg4, Static188.anInt3598, Static289.anInt5245);
					@Pc(455) int local455 = Static306.method4566(arg4 - local9, Static188.anInt3598, Static289.anInt5245);
					@Pc(463) int[] local463;
					if (Static231.anInt4333 <= local169) {
						local463 = Static40.anIntArrayArray6[local169];
						Static103.method1978(arg0, local455, local194, local463);
						Static103.method1978(arg6, local446, local455, local463);
						Static103.method1978(arg0, local186, local446, local463);
					}
					if (local177 <= Static218.anInt4086) {
						local463 = Static40.anIntArrayArray6[local177];
						Static103.method1978(arg0, local455, local194, local463);
						Static103.method1978(arg6, local446, local455, local463);
						Static103.method1978(arg0, local186, local446, local463);
					}
				} else {
					if (Static231.anInt4333 <= local169) {
						Static103.method1978(arg0, local186, local194, Static40.anIntArrayArray6[local169]);
					}
					if (local177 <= Static218.anInt4086) {
						Static103.method1978(arg0, local186, local194, Static40.anIntArrayArray6[local177]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZII)V")
	public static void method3856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(11, arg1);
		local8.method4062();
		local8.anInt4863 = arg2;
		local8.anInt4862 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
	public static void method3858() {
		Static83.aClass175_10.method4287();
	}
}
