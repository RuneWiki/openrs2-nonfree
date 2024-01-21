import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "Lclient!wa;")
	public static Class23 aClass23_7;

	@OriginalMember(owner = "client!b", name = "R", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array1;

	@OriginalMember(owner = "client!b", name = "K", descriptor = "Lclient!vf;")
	public static final Class5_Sub6_Sub1 aClass5_Sub6_Sub1_1 = new Class5_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!b", name = "N", descriptor = "Lclient!dc;")
	public static Class20 aClass20_115 = null;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)V")
	public static void method208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static137.anInt2871; local8++) {
			if (Static52.anIntArray104[local8] + Static49.anIntArray99[local8] > arg0 && Static52.anIntArray104[local8] < arg0 + arg1 && Static106.anIntArray237[local8] + Static55.anIntArray109[local8] > arg3 && Static55.anIntArray109[local8] < arg2 + arg3) {
				Static75.aBooleanArray17[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg6 && arg8 == arg5 && arg7 == arg3 && arg0 == arg1) {
			Static73.method1191(arg6, arg0, arg2, arg5, arg7);
			return;
		}
		@Pc(41) int local41 = arg5;
		@Pc(43) int local43 = arg6;
		@Pc(47) int local47 = arg6 * 3;
		@Pc(51) int local51 = arg5 * 3;
		@Pc(55) int local55 = arg4 * 3;
		@Pc(59) int local59 = arg3 * 3;
		@Pc(68) int local68 = local55 + arg7 - local59 - arg6;
		@Pc(72) int local72 = arg8 * 3;
		@Pc(76) int local76 = arg1 * 3;
		@Pc(86) int local86 = local59 + local47 - local55 - local55;
		@Pc(96) int local96 = local76 + local51 - local72 - local72;
		@Pc(107) int local107 = arg0 + local72 - arg5 - local76;
		@Pc(112) int local112 = local55 - local47;
		@Pc(117) int local117 = local72 - local51;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(127) int local127 = local119 * local119 >> 12;
			@Pc(133) int local133 = local127 * local119 >> 12;
			@Pc(137) int local137 = local133 * local68;
			@Pc(141) int local141 = local127 * local86;
			@Pc(145) int local145 = local96 * local127;
			@Pc(149) int local149 = local119 * local112;
			@Pc(153) int local153 = local107 * local133;
			@Pc(157) int local157 = local117 * local119;
			@Pc(169) int local169 = arg6 + (local137 + local141 + local149 >> 12);
			@Pc(179) int local179 = arg5 + (local145 + local153 + local157 >> 12);
			Static73.method1191(local43, local179, arg2, local41, local169);
			local41 = local179;
			local43 = local169;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IIIII)V")
	public static void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static43.anInt990 == 1) {
			Static22.aClass5_Sub2_Sub10Array9[Static101.anInt2161 / 100].method2403(Static141.anInt2945 - 8, Static114.anInt648 + -8);
		}
		if (Static43.anInt990 == 2) {
			Static22.aClass5_Sub2_Sub10Array9[Static101.anInt2161 / 100 + 4].method2403(Static141.anInt2945 - 8, Static114.anInt648 + -8);
		}
		Static130.method2024();
		if (!Static159.aBoolean141) {
			return;
		}
		@Pc(50) int local50 = arg3 + 512 - 5;
		@Pc(54) int local54 = arg1 + 20;
		Static165.aClass5_Sub2_Sub8_5.method1352(Static70.method1166(new Class20[] { Static192.aClass20_1410, Static132.method2805(Static2.anInt21) }), local50, local54, 16776960, -1);
		@Pc(76) Runtime local76 = Runtime.getRuntime();
		@Pc(85) int local85 = (int) ((local76.totalMemory() - local76.freeMemory()) / 1024L);
		@Pc(86) int local86 = local54 + 15;
		@Pc(88) int local88 = 16776960;
		if (local85 > 32768 && Static14.aBoolean14) {
			local88 = 16711680;
		}
		if (local85 > 65536 && !Static14.aBoolean14) {
			local88 = 16711680;
		}
		Static165.aClass5_Sub2_Sub8_5.method1352(Static70.method1166(new Class20[] { Static135.aClass20_1028, Static132.method2805(local85), Static106.aClass20_817 }), local50, local86, local88, -1);
		local54 = local86 + 15;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg0 - arg5;
		@Pc(19) int local19 = (arg7 - arg2 << 16) / local10;
		@Pc(36) int local36 = arg3 - arg4;
		@Pc(44) int local44 = (arg6 - arg1 << 16) / local36;
		@Pc(55) boolean local55;
		if (Static11.anInt258 > 0 && Static11.anInt258 % 10 < 5) {
			local55 = true;
		} else {
			local55 = false;
		}
		@Pc(71) int local71;
		@Pc(81) int local81;
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(160) int local160;
		@Pc(166) int local166;
		for (@Pc(61) int local61 = 0; local61 < local36; local61++) {
			local71 = (local61 + 1) * local44 >> 16;
			@Pc(77) int local77 = local61 * local44 >> 16;
			local81 = local71 - local77;
			if (local81 > 0) {
				local77 += arg1;
				@Pc(95) int[][] local95 = Static93.anIntArrayArrayArray9[arg4 + local61 >> 6];
				for (local101 = 0; local101 < local10; local101++) {
					local109 = local101 * local19 >> 16;
					local117 = local19 * (local101 + 1) >> 16;
					@Pc(122) int local122 = local117 - local109;
					if (local122 > 0) {
						local109 += arg2;
						@Pc(141) int local141 = local101 + arg5 >> 6;
						if (local95[local141] != null) {
							local160 = (local61 + arg4 & 0x3F) + ((arg5 + local101 & 0x3F) << 6);
							local166 = local95[local141][local160];
							if (local166 != 0) {
								@Pc(174) Class5_Sub2_Sub7 local174 = Static63.method1046(local166 - 1);
								if (local55 && local174.anInt516 == Static186.anInt3737) {
									@Pc(184) Class5_Sub12 local184 = new Class5_Sub12();
									local184.anInt1157 = local174.anInt516;
									local184.anInt1161 = local77;
									local184.anInt1160 = local109;
									Static86.aClass91_10.method2686(local184);
								}
								Static47.aClass5_Sub2_Sub10_Sub1Array103[local174.anInt516].method2403(local77 - 7, local109 + -7);
							}
						}
					}
				}
			}
		}
		if (Static29.aDouble1 == Static216.aDouble11) {
			for (@Pc(226) Class5_Sub21 local226 = (Class5_Sub21) Static35.aClass91_5.method2684(); local226 != null; local226 = (Class5_Sub21) Static35.aClass91_5.method2678()) {
				local71 = local226.anInt2620;
				local81 = local226.anInt2623;
				local81 = Static165.anInt2257 + Static59.anInt1331 - local81;
				local71 -= Static207.anInt4070;
				@Pc(262) int local262 = (arg6 - arg1) * (local71 - arg4) / (arg3 - arg4) + arg1;
				local101 = (local81 - arg5) * (arg7 - arg2) / (arg0 - arg5) + arg2;
				local117 = 16777215;
				local109 = local226.anInt2616;
				@Pc(286) Class87 local286 = null;
				if (local109 == 0) {
					if (Static216.aDouble11 == 3.0D) {
						local286 = Static188.aClass87_32;
					}
					if (Static216.aDouble11 == 4.0D) {
						local286 = Static117.aClass87_17;
					}
					if (Static216.aDouble11 == 6.0D) {
						local286 = Static67.aClass87_36;
					}
					if (Static216.aDouble11 == 8.0D) {
						local286 = Static168.aClass87_25;
					}
				}
				if (local109 == 1) {
					if (Static216.aDouble11 == 3.0D) {
						local286 = Static67.aClass87_36;
					}
					if (Static216.aDouble11 == 4.0D) {
						local286 = Static168.aClass87_25;
					}
					if (Static216.aDouble11 == 6.0D) {
						local286 = Static3.aClass87_1;
					}
					if (Static216.aDouble11 == 8.0D) {
						local286 = Static218.aClass87_37;
					}
				}
				if (local109 == 2) {
					if (Static216.aDouble11 == 3.0D) {
						local286 = Static3.aClass87_1;
					}
					local117 = 16755200;
					if (Static216.aDouble11 == 4.0D) {
						local286 = Static218.aClass87_37;
					}
					if (Static216.aDouble11 == 6.0D) {
						local286 = Static176.aClass87_28;
					}
					if (Static216.aDouble11 == 8.0D) {
						local286 = Static44.aClass87_10;
					}
				}
				if (local286 != null) {
					@Pc(380) Class20[] local380 = local226.aClass20Array22;
					local160 = local380.length;
					local101 -= local286.method2471() * (local160 - 1) / 2;
					local101 += local286.method2473() / 2;
					for (local166 = 0; local166 < local160; local166++) {
						local286.method2475(local380[local166], local262, local101, local117);
						local101 += local286.method2471();
					}
				}
			}
		}
		for (@Pc(439) Class5_Sub12 local439 = (Class5_Sub12) Static86.aClass91_10.method2684(); local439 != null; local439 = (Class5_Sub12) Static86.aClass91_10.method2678()) {
			Static47.aClass5_Sub2_Sub10_Sub1Array103[local439.anInt1157].method2403(local439.anInt1161 - 7, local439.anInt1160 - 7);
			Static42.method803(local439.anInt1161, local439.anInt1160, 15, 16776960, 128);
			Static42.method803(local439.anInt1161, local439.anInt1160, 7, 16777215, 256);
		}
		Static86.aClass91_10.method2682();
	}
}
