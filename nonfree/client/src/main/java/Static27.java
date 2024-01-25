import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!at", name = "q", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_10 = new Class130(53, -1);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IZIIIIIIII)V")
	public static void method1047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg1 && arg4 == arg2 && arg6 == arg8 && arg0 == arg3) {
			Static439.method6843(arg2, arg8, arg3, arg7, arg1);
			return;
		}
		@Pc(27) int local27 = arg1;
		@Pc(29) int local29 = arg2;
		@Pc(33) int local33 = arg1 * 3;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(49) int local49 = arg6 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(62) int local62 = local41 + arg8 - arg1 - local49;
		@Pc(72) int local72 = arg3 + local45 - arg2 - local53;
		@Pc(82) int local82 = local33 + local49 - local41 - local41;
		@Pc(91) int local91 = local37 + local53 - local45 - local45;
		@Pc(96) int local96 = local41 - local33;
		@Pc(100) int local100 = local45 - local37;
		for (@Pc(102) int local102 = 128; local102 <= 4096; local102 += 128) {
			@Pc(110) int local110 = local102 * local102 >> 12;
			@Pc(116) int local116 = local110 * local102 >> 12;
			@Pc(120) int local120 = local62 * local116;
			@Pc(124) int local124 = local116 * local72;
			@Pc(128) int local128 = local110 * local82;
			@Pc(132) int local132 = local91 * local110;
			@Pc(136) int local136 = local96 * local102;
			@Pc(140) int local140 = local100 * local102;
			@Pc(150) int local150 = (local136 + local128 + local120 >> 12) + arg1;
			@Pc(161) int local161 = (local140 + local124 + local132 >> 12) + arg2;
			Static439.method6843(local29, local150, local161, arg7, local27);
			local27 = local150;
			local29 = local161;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!ha;I)Z")
	public static boolean method1048(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(11) int local11 = (Static634.anInt10129 - 104) / 2;
		@Pc(17) int local17 = (Static638.anInt10172 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static24.method994(arg0, local29, local25, local21)) {
						local40 = local29;
						if (Static486.method7232(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static474.method7126(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(88) int[] local88 = new int[262144];
		for (local29 = 0; local29 < local88.length; local29++) {
			local88[local29] = -16777216;
		}
		Static499.aClass24_29 = arg1.method7536(local88, 512, 512, 512);
		Static553.method7994();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(159) int local159 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(183) int local183 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(193) boolean[][] local193 = new boolean[Static36.anInt1182 + 2 + 1][Static36.anInt1182 + 3];
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(205) int local205;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(223) int local223;
		@Pc(231) int local231;
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(311) int local311;
		@Pc(317) int local317;
		@Pc(322) int local322;
		@Pc(341) int local341;
		for (@Pc(195) int local195 = local11; local195 < local11 + 104; local195 += Static36.anInt1182) {
			for (local199 = local17; local199 < local17 + 104; local199 += Static36.anInt1182) {
				local203 = 0;
				local205 = 0;
				local207 = local195;
				if (local195 > 0) {
					local203 += 4;
					local207 = local195 - 1;
				}
				local216 = local199;
				if (local199 > 0) {
					local216 = local199 - 1;
				}
				local223 = Static36.anInt1182 + local195;
				if (local223 < 104) {
					local223++;
				}
				local231 = Static36.anInt1182 + local199;
				if (local231 < 104) {
					local231++;
					local205 += 4;
				}
				arg1.KA(0, 0, Static36.anInt1182 * 4 + local203, local205 - -(Static36.anInt1182 * 4));
				arg1.GA(-16777216);
				@Pc(266) int local266;
				for (local258 = arg0; local258 <= 3; local258++) {
					for (local262 = 0; local262 <= Static36.anInt1182; local262++) {
						for (local266 = 0; local266 <= Static36.anInt1182; local266++) {
							local193[local262][local266] = Static24.method994(arg0, local258, local266 + local216, local262 + local207);
						}
					}
					Static559.aClass51Array4[local258].method7840(local207, local216, local223, local231, local193);
					if (!Static509.aBoolean627) {
						for (local266 = -4; local266 < Static36.anInt1182; local266++) {
							for (local311 = -4; local311 < Static36.anInt1182; local311++) {
								local317 = local266 + local195;
								local322 = local199 + local311;
								if (local317 >= local11 && local322 >= local17 && Static24.method994(arg0, local258, local322, local317)) {
									local341 = local258;
									if (Static486.method7232(local322, local317)) {
										local341 = local258 - 1;
									}
									if (local341 >= 0) {
										Static170.method2975(local322, local40, local159, local317, arg1, local341, local205 + (Static36.anInt1182 - local311) * 4 - 4, local266 * 4 + local203);
									}
								}
							}
						}
					}
				}
				if (Static509.aBoolean627) {
					@Pc(397) Class105 local397 = Static271.aClass105Array1[arg0];
					for (local266 = 0; local266 < Static36.anInt1182; local266++) {
						for (local311 = 0; local311 < Static36.anInt1182; local311++) {
							local317 = local195 + local266;
							local322 = local311 + local199;
							local341 = local397.anIntArrayArray19[local317 - local397.anInt2957][local322 - local397.anInt2972];
							if ((local341 & 0x40240000) != 0) {
								arg1.method7528(local203 + local266 * 4, 4, 4, local205 + (Static36.anInt1182 - local311) * 4 - 4, -1713569622);
							} else if ((local341 & 0x800000) != 0) {
								arg1.method7508(local205 + (Static36.anInt1182 - local311) * 4 - 4, 4, local203 + local266 * 4, -1713569622);
							} else if ((local341 & 0x2000000) != 0) {
								arg1.method7484(-1713569622, local205 + (Static36.anInt1182 - local311) * 4 - 4, 4, local266 * 4 + local203 + 3);
							} else if ((local341 & 0x8000000) != 0) {
								arg1.method7508((Static36.anInt1182 - local311) * 4 + local205 - 1, 4, local266 * 4 + local203, -1713569622);
							} else if ((local341 & 0x20000000) != 0) {
								arg1.method7484(-1713569622, local205 + (Static36.anInt1182 - local311) * 4 - 4, 4, local203 + local266 * 4);
							}
						}
					}
				}
				arg1.aa(local203, local205, Static36.anInt1182 * 4, Static36.anInt1182 * 4, local183, 2);
				Static499.aClass24_29.method8565((local195 - local11) * 4 + 48, -(Static36.anInt1182 * 4) + 464 + -((local199 - local17) * 4), Static36.anInt1182 * 4, Static36.anInt1182 * 4, local203, local205);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static40.method1343();
		Static639.anInt10179 = 0;
		Static568.aClass223_61.method5862();
		if (!Static509.aBoolean627) {
			for (local199 = local11; local199 < local11 + 104; local199++) {
				for (local203 = local17; local203 < local17 + 104; local203++) {
					for (local205 = arg0; arg0 + 1 >= local205 && local205 <= 3; local205++) {
						if (Static24.method994(arg0, local205, local203, local199)) {
							@Pc(688) Interface2 local688 = (Interface2) Static625.method8735(local205, local199, local203);
							if (local688 == null) {
								local688 = (Interface2) Static572.method8142(local205, local199, local203, as.class);
							}
							if (local688 == null) {
								local688 = (Interface2) Static126.method2496(local205, local199, local203);
							}
							if (local688 == null) {
								local688 = (Interface2) Static610.method8465(local205, local199, local203);
							}
							if (local688 != null) {
								@Pc(729) Class299 local729 = Static105.aClass302_1.method7466(local688.method7381());
								if (!local729.aBoolean607 || Static475.aBoolean582) {
									local223 = local729.anInt8681;
									if (local729.anIntArray533 != null) {
										for (local231 = 0; local231 < local729.anIntArray533.length; local231++) {
											if (local729.anIntArray533[local231] != -1) {
												@Pc(759) Class299 local759 = Static105.aClass302_1.method7466(local729.anIntArray533[local231]);
												if (local759.anInt8681 >= 0) {
													local223 = local759.anInt8681;
												}
											}
										}
									}
									if (local223 >= 0) {
										@Pc(782) boolean local782 = false;
										if (local223 >= 0) {
											@Pc(789) Class36 local789 = Static68.aClass335_2.method8125(local223);
											if (local789 != null && local789.aBoolean87) {
												local782 = true;
											}
										}
										local258 = local199;
										local262 = local203;
										if (local782) {
											@Pc(807) int[][] local807 = Static271.aClass105Array1[local205].anIntArrayArray19;
											local311 = Static271.aClass105Array1[local205].anInt2957;
											local317 = Static271.aClass105Array1[local205].anInt2972;
											for (local322 = 0; local322 < 10; local322++) {
												local341 = (int) (Math.random() * 4.0D);
												if (local341 == 0 && local11 < local258 && local199 - 3 < local258 && (local807[local258 - local311 - 1][local262 - local317] & 0x2C0108) == 0) {
													local258--;
												}
												if (local341 == 1 && local11 + 103 > local258 && local258 < local199 + 3 && (local807[local258 + 1 - local311][local262 - local317] & 0x2C0180) == 0) {
													local258++;
												}
												if (local341 == 2 && local262 > local17 && local203 - 3 < local262 && (local807[local258 - local311][local262 - local317 - 1] & 0x2C0102) == 0) {
													local262--;
												}
												if (local341 == 3 && local17 + 104 - 1 > local262 && local262 < local203 + 3 && (local807[local258 - local311][local262 + 1 - local317] & 0x2C0120) == 0) {
													local262++;
												}
											}
										}
										Static39.anIntArray35[Static639.anInt10179] = local729.anInt8677;
										Static349.anIntArray404[Static639.anInt10179] = local258;
										Static378.anIntArray421[Static639.anInt10179] = local262;
										Static639.anInt10179++;
									}
								}
							}
						}
					}
				}
			}
			if (Static531.aClass156_8 != null) {
				Static351.aClass196_69.anInt5854 = 1;
				Static68.aClass335_2.method8128(1024, 64);
				for (local203 = 0; local203 < Static531.aClass156_8.anInt4465; local203++) {
					local205 = Static531.aClass156_8.anIntArray237[local203];
					if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 == local205 >> 28) {
						local207 = (local205 >> 14 & 0x3FFF) - Static299.anInt5307;
						local216 = (local205 & 0x3FFF) - Static171.anInt3340;
						if (local207 >= 0 && local207 < Static634.anInt10129 && local216 >= 0 && local216 < Static638.anInt10172) {
							Static568.aClass223_61.method5868(new Class3_Sub19(local203));
						} else {
							@Pc(1090) Class36 local1090 = Static68.aClass335_2.method8125(Static531.aClass156_8.anIntArray236[local203]);
							if (local1090.anIntArray40 != null && local207 + local1090.anInt1331 >= 0 && Static634.anInt10129 > local1090.anInt1345 + local207 && local1090.anInt1361 + local216 >= 0 && local216 + local1090.anInt1341 < Static638.anInt10172) {
								Static568.aClass223_61.method5868(new Class3_Sub19(local203));
							}
						}
					}
				}
				Static68.aClass335_2.method8128(128, 64);
				Static351.aClass196_69.anInt5854 = 2;
				Static351.aClass196_69.method5091();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public static void method1049() {
		for (@Pc(7) int local7 = 0; local7 < Static94.anInt2209; local7++) {
			@Pc(13) int local13 = Static520.anIntArray594[local7];
			@Pc(20) Class3_Sub28 local20 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local13);
			if (local20 != null) {
				@Pc(25) Class4_Sub1_Sub2_Sub1_Sub1 local25 = local20.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				Static561.method8090(local25.aClass109_1.anInt3032, local25);
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIBIII)V")
	public static void method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static596.anInt9759 = arg2;
		Static176.anInt3420 = arg1;
		Static39.anInt1251 = arg3;
		Static490.anInt8498 = arg4;
		Static337.anInt6315 = arg0;
		if (Static490.anInt8498 >= 100) {
			@Pc(22) int local22 = Static39.anInt1251 * 512 + 256;
			@Pc(28) int local28 = Static337.anInt6315 * 512 + 256;
			@Pc(37) int local37 = Static192.method3263(local28, local22, Static549.anInt9262) - Static596.anInt9759;
			@Pc(42) int local42 = local22 - Static611.anInt9892;
			@Pc(47) int local47 = local37 - Static557.anInt9304;
			@Pc(51) int local51 = local28 - Static20.anInt824;
			@Pc(63) int local63 = (int) Math.sqrt((double) (local42 * local42 + local51 * local51));
			Static393.anInt7268 = (int) (Math.atan2((double) local47, (double) local63) * 2607.5945876176133D) & 0x3FFF;
			Static185.anInt5215 = (int) (Math.atan2((double) local42, (double) local51) * -2607.5945876176133D) & 0x3FFF;
			if (Static393.anInt7268 < 1024) {
				Static393.anInt7268 = 1024;
			}
			Static72.anInt1723 = 0;
			if (Static393.anInt7268 > 3072) {
				Static393.anInt7268 = 3072;
			}
		}
		Static331.anInt6175 = -1;
		Static530.anInt9071 = -1;
		Static305.anInt5422 = 2;
	}
}
