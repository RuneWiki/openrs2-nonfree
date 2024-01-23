import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!uo", name = "N", descriptor = "Lclient!th;")
	public static Class168 aClass168_197;

	@OriginalMember(owner = "client!uo", name = "db", descriptor = "I")
	public static int anInt5790;

	@OriginalMember(owner = "client!uo", name = "W", descriptor = "Lclient!il;")
	public static Class1_Sub13 aClass1_Sub13_1 = new Class1_Sub13(0, 0);

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)V")
	public static void method4418() {
		Static240.aClass89_37.method2266();
		Static263.aClass89_42.method2266();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg4 && arg8 == arg5 && arg7 == arg1 && arg3 == arg2) {
			Static202.method3233(arg4, arg8, arg1, arg2, arg6);
			return;
		}
		@Pc(23) int local23 = arg8;
		@Pc(25) int local25 = arg4;
		@Pc(29) int local29 = arg4 * 3;
		@Pc(33) int local33 = arg8 * 3;
		@Pc(37) int local37 = arg0 * 3;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(59) int local59 = arg1 + local37 - arg4 - local45;
		@Pc(69) int local69 = local41 + arg2 - arg8 - local49;
		@Pc(79) int local79 = local29 + local45 - local37 - local37;
		@Pc(88) int local88 = local33 + local49 - local41 - local41;
		@Pc(92) int local92 = local37 - local29;
		@Pc(97) int local97 = local41 - local33;
		for (@Pc(99) int local99 = 128; local99 <= 4096; local99 += 128) {
			@Pc(110) int local110 = local99 * local99 >> 12;
			@Pc(116) int local116 = local99 * local110 >> 12;
			@Pc(120) int local120 = local59 * local116;
			@Pc(124) int local124 = local116 * local69;
			@Pc(128) int local128 = local79 * local110;
			@Pc(132) int local132 = local88 * local110;
			@Pc(136) int local136 = local92 * local99;
			@Pc(146) int local146 = (local136 + local128 + local120 >> 12) + arg4;
			@Pc(150) int local150 = local97 * local99;
			@Pc(160) int local160 = arg8 + (local150 + local132 + local124 >> 12);
			Static202.method3233(local25, local23, local146, local160, arg6);
			local25 = local146;
			local23 = local160;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([[F[[B[[I[[B[[F[[FB[[BI[[B[Lclient!fn;I)V")
	public static void method4420(@OriginalArg(0) float[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) Class59[] arg9, @OriginalArg(11) int arg10) {
		for (@Pc(3) int local3 = 0; local3 < arg10; local3++) {
			@Pc(28) Class59 local28 = arg9[local3];
			if (local28.anInt1851 == arg7) {
				@Pc(37) Class189 local37 = new Class189();
				@Pc(45) int local45 = (local28.anInt1852 >> 7) - local28.anInt1842;
				@Pc(47) int local47 = 0;
				@Pc(55) int local55 = (local28.anInt1847 >> 7) + local28.anInt1842;
				@Pc(64) int local64 = (local28.anInt1847 >> 7) - local28.anInt1842;
				if (local64 < 0) {
					local47 = -local64;
					local64 = 0;
				}
				if (local55 > 103) {
					local55 = 103;
				}
				@Pc(85) int local85;
				@Pc(97) short local97;
				@Pc(104) int local104;
				@Pc(112) int local112;
				@Pc(125) int local125;
				@Pc(148) int local148;
				@Pc(326) boolean local326;
				@Pc(363) int local363;
				for (local85 = local64; local85 <= local55; local85++) {
					local97 = local28.aShortArray59[local47];
					local104 = local45 + (local97 >> 8);
					local112 = local104 + (local97 & 0xFF) - 1;
					if (local112 > 103) {
						local112 = 103;
					}
					if (local104 < 0) {
						local104 = 0;
					}
					for (local125 = local104; local125 <= local112; local125++) {
						@Pc(140) int local140 = arg3[local125][local85] & 0xFF;
						local148 = arg1[local125][local85] & 0xFF;
						@Pc(150) boolean local150 = false;
						@Pc(165) Class62 local165;
						@Pc(187) int[] local187;
						@Pc(243) int[] local243;
						if (local140 == 0) {
							if (local148 == 0) {
								continue;
							}
							local165 = Static148.method2407(local148 - 1);
							if (local165.anInt1980 == -1) {
								continue;
							}
							if (arg8[local125][local85] != 0) {
								local187 = Static162.anIntArrayArray41[arg8[local125][local85]];
								local37.anInt6053 += ((local187.length >> 1) - 2) * 3;
								local37.anInt6052 += local187.length >> 1;
								continue;
							}
						} else if (local148 != 0) {
							local165 = Static148.method2407(local148 - 1);
							@Pc(236) byte local236;
							if (local165.anInt1980 == -1) {
								local236 = arg8[local125][local85];
								if (local236 != 0) {
									local243 = Static216.anIntArrayArray59[local236];
									local37.anInt6053 += (local243.length >> 1) * 3 - 6;
									local37.anInt6052 += local243.length >> 1;
								}
								continue;
							}
							local236 = arg8[local125][local85];
							if (local236 != 0) {
								local150 = true;
							}
						}
						@Pc(285) Class7 local285 = Static121.method1968(arg7, local125, local85);
						if (local285 != null) {
							@Pc(295) int local295 = (int) (local285.aLong7 >> 14) & 0x3F;
							if (local295 == 9) {
								@Pc(307) int local307 = (int) (local285.aLong7 >> 20) & 0x3;
								local243 = null;
								@Pc(335) boolean local335;
								@Pc(350) short local350;
								@Pc(357) int local357;
								if ((local307 & 0x1) == 0) {
									local326 = local125 + 1 <= local112;
									local335 = local104 <= local125 - 1;
									if (!local335 && local55 >= local85 + 1) {
										local350 = local28.aShortArray59[local47 + 1];
										local357 = local45 + (local350 >> 8);
										local363 = (local350 & 0xFF) + local357;
										local335 = local357 < local125 && local125 < local363;
									}
									if (!local326 && local85 - 1 >= local64) {
										local350 = local28.aShortArray59[local47 - 1];
										local357 = local45 + (local350 >> 8);
										local363 = local357 + (local350 & 0xFF);
										local326 = local357 < local125 && local125 < local363;
									}
									if (local335 && local326) {
										local243 = Static162.anIntArrayArray41[0];
									} else if (local335) {
										local243 = Static162.anIntArrayArray41[1];
									} else if (local326) {
										local243 = Static162.anIntArrayArray41[1];
									}
								} else {
									local335 = local125 - 1 >= local104;
									if (!local335 && local64 <= local85 - 1) {
										local350 = local28.aShortArray59[local47 - 1];
										local357 = local45 + (local350 >> 8);
										local363 = (local350 & 0xFF) + local357;
										local335 = local357 < local125 && local363 > local125;
									}
									local326 = local112 >= local125 + 1;
									if (!local326 && local85 + 1 <= local55) {
										local350 = local28.aShortArray59[local47 + 1];
										local357 = local45 + (local350 >> 8);
										local363 = local357 + (local350 & 0xFF);
										local326 = local357 < local125 && local125 < local363;
									}
									if (local335 && local326) {
										local243 = Static162.anIntArrayArray41[0];
									} else if (local335) {
										local243 = Static162.anIntArrayArray41[1];
									} else if (local326) {
										local243 = Static162.anIntArrayArray41[1];
									}
								}
								if (local243 != null) {
									local37.anInt6053 += (local243.length >> 1) * 3 - 6;
									local37.anInt6052 += local243.length >> 1;
								}
								continue;
							}
						}
						if (local150) {
							local187 = Static162.anIntArrayArray41[arg8[local125][local85]];
							local243 = Static216.anIntArrayArray59[arg8[local125][local85]];
							local37.anInt6053 += (local187.length >> 1) * 3 - 6;
							local37.anInt6053 += ((local243.length >> 1) - 2) * 3;
							local37.anInt6052 += local187.length >> 1;
							local37.anInt6052 += local243.length >> 1;
						} else {
							local187 = Static162.anIntArrayArray41[0];
							local37.anInt6053 += ((local187.length >> 1) - 2) * 3;
							local37.anInt6052 += local187.length >> 1;
						}
					}
					local47++;
				}
				local37.method4642();
				local47 = 0;
				if ((local28.anInt1847 >> 7) - local28.anInt1842 < 0) {
					local47 = local28.anInt1842 - (local28.anInt1847 >> 7);
				}
				for (local85 = local64; local85 <= local55; local85++) {
					local97 = local28.aShortArray59[local47];
					local104 = local45 + (local97 >> 8);
					local112 = (local97 & 0xFF) + local104 - 1;
					if (local112 > 103) {
						local112 = 103;
					}
					if (local104 < 0) {
						local104 = 0;
					}
					for (local125 = local104; local125 <= local112; local125++) {
						local148 = arg3[local125][local85] & 0xFF;
						@Pc(788) int local788 = arg1[local125][local85] & 0xFF;
						@Pc(794) byte local794 = arg6[local125][local85];
						@Pc(796) boolean local796 = false;
						@Pc(813) Class62 local813;
						if (local148 == 0) {
							if (local788 == 0) {
								continue;
							}
							local813 = Static148.method2407(local788 - 1);
							if (local813.anInt1980 == -1) {
								continue;
							}
							if (arg8[local125][local85] != 0) {
								Static309.method4687(arg4, arg6[local125][local85], local28, arg2, local85, arg0, Static162.anIntArrayArray41[arg8[local125][local85]], local125, arg5, local37);
								continue;
							}
						} else if (local788 != 0) {
							local813 = Static148.method2407(local788 - 1);
							if (local813.anInt1980 == -1) {
								Static309.method4687(arg4, arg6[local125][local85], local28, arg2, local85, arg0, Static216.anIntArrayArray59[arg8[local125][local85]], local125, arg5, local37);
								continue;
							}
							@Pc(823) byte local823 = arg8[local125][local85];
							if (local823 != 0) {
								local796 = true;
							}
						}
						@Pc(909) Class7 local909 = Static121.method1968(arg7, local125, local85);
						if (local909 != null) {
							@Pc(919) int local919 = (int) (local909.aLong7 >> 14) & 0x3F;
							if (local919 == 9) {
								@Pc(931) int local931 = (int) (local909.aLong7 >> 20) & 0x3;
								@Pc(933) int[] local933 = null;
								@Pc(976) int local976;
								@Pc(1007) boolean local1007;
								@Pc(964) short local964;
								if ((local931 & 0x1) == 0) {
									local326 = local104 <= local125 - 1;
									if (!local326 && local55 >= local85 + 1) {
										local964 = local28.aShortArray59[local47 + 1];
										local363 = local45 + (local964 >> 8);
										local976 = local363 + (local964 & 0xFF);
										local326 = local363 < local125 && local125 < local976;
									}
									local1007 = local112 >= local125 + 1;
									if (!local1007 && local85 - 1 >= local64) {
										local964 = local28.aShortArray59[local47 - 1];
										local363 = local45 + (local964 >> 8);
										local976 = local363 + (local964 & 0xFF);
										local1007 = local125 > local363 && local976 > local125;
									}
									if (local326 && local1007) {
										local933 = Static162.anIntArrayArray41[0];
									} else if (local326) {
										local933 = Static162.anIntArrayArray41[1];
										local794 = 1;
									} else if (local1007) {
										local794 = 3;
										local933 = Static162.anIntArrayArray41[1];
									}
								} else {
									local326 = local125 - 1 >= local104;
									if (!local326 && local64 <= local85 - 1) {
										local964 = local28.aShortArray59[local47 - 1];
										local363 = (local964 >> 8) + local45;
										local976 = local363 + (local964 & 0xFF);
										local326 = local363 < local125 && local125 < local976;
									}
									local1007 = local112 >= local125 + 1;
									if (!local1007 && local85 + 1 <= local55) {
										local964 = local28.aShortArray59[local47 + 1];
										local363 = (local964 >> 8) + local45;
										local976 = local363 + (local964 & 0xFF);
										local1007 = local125 > local363 && local125 < local976;
									}
									if (local326 && local1007) {
										local933 = Static162.anIntArrayArray41[0];
									} else if (local326) {
										local933 = Static162.anIntArrayArray41[1];
										local794 = 0;
									} else if (local1007) {
										local794 = 2;
										local933 = Static162.anIntArrayArray41[1];
									}
								}
								if (local933 != null) {
									Static309.method4687(arg4, local794, local28, arg2, local85, arg0, local933, local125, arg5, local37);
								}
								continue;
							}
						}
						if (local796) {
							Static309.method4687(arg4, arg6[local125][local85], local28, arg2, local85, arg0, Static216.anIntArrayArray59[arg8[local125][local85]], local125, arg5, local37);
							Static309.method4687(arg4, arg6[local125][local85], local28, arg2, local85, arg0, Static162.anIntArrayArray41[arg8[local125][local85]], local125, arg5, local37);
						} else {
							Static309.method4687(arg4, local794, local28, arg2, local85, arg0, Static162.anIntArrayArray41[0], local125, arg5, local37);
						}
					}
					local47++;
				}
				if (local37.anInt6050 > 0 && local37.anInt6051 > 0) {
					local37.method4640();
					local28.aClass189_1 = local37;
				}
			}
		}
	}
}
