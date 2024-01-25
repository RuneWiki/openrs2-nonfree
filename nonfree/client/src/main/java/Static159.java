import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!kl", name = "Mb", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!kl", name = "Nb", descriptor = "I")
	public static int anInt3527 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
	public static void method3230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= Static268.anInt5477 && arg1 <= Static342.anInt3000) {
			@Pc(28) int local28 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg0);
			@Pc(34) int local34 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg3);
			Static152.method4088(arg2, local28, local34, arg1);
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(IZ)Z")
	public static boolean method3232(@OriginalArg(1) boolean arg0) {
		@Pc(13) boolean local13 = Static208.aClass32_11.method2166();
		if (arg0 == local13) {
			return true;
		}
		if (!arg0) {
			Static208.aClass32_11.method2187();
		} else if (!Static208.aClass32_11.method2231()) {
			arg0 = false;
		}
		if (local13 == arg0) {
			return false;
		} else {
			Static278.aBoolean547 = arg0;
			Static348.method5579(Static15.aClass143_1);
			return true;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!uo;I)Z")
	public static boolean method3236(@OriginalArg(1) Class32 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static233.anInt5573 - 104) / 2;
		@Pc(17) int local17 = (Static134.anInt2971 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (@Pc(29) int local29 = arg1; local29 <= 3; local29++) {
					if (Static106.method2323(local25, local21, arg1, local29)) {
						local40 = local29;
						if (Static187.method3663(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static13.method380(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local40 = 0; local40 < local86.length; local40++) {
			local86[local40] = -16777216;
		}
		Static97.aClass5_25 = arg0.method2155(local86, 512, 512, 512);
		Static71.method3159();
		@Pc(151) int local151 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228 | 0xFF000000;
		@Pc(164) int local164 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(183) int local183 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(187) boolean[][] local187 = new boolean[Static305.anInt6015][Static305.anInt6015];
		@Pc(193) int local193;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(218) int local218;
		@Pc(276) int local276;
		@Pc(282) int local282;
		@Pc(287) int local287;
		@Pc(306) int local306;
		for (@Pc(189) int local189 = local11; local189 < local11 + 104; local189 += Static305.anInt6015) {
			for (local193 = local17; local193 < local17 + 104; local193 += Static305.anInt6015) {
				arg0.method2226(0, 0, Static305.anInt6015 * 4, Static305.anInt6015 * 4);
				arg0.method2180(-16777216);
				for (local210 = arg1; local210 <= 3; local210++) {
					for (local214 = 0; local214 < Static305.anInt6015; local214++) {
						for (local218 = 0; local218 < Static305.anInt6015; local218++) {
							local187[local214][local218] = Static106.method2323(local218 + local193, local189 - -local214, arg1, local210);
						}
					}
					Static190.aClass53Array1[local210].method2789(local189, local193, local189 + Static305.anInt6015, local193 + Static305.anInt6015, local187);
					if (!Static342.aBoolean288) {
						for (local218 = -4; local218 < Static305.anInt6015; local218++) {
							for (local276 = -4; local276 < Static305.anInt6015; local276++) {
								local282 = local218 + local189;
								local287 = local193 + local276;
								if (local11 <= local282 && local287 >= local17 && Static106.method2323(local287, local282, arg1, local210)) {
									local306 = local210;
									if (Static187.method3663(local282, local287)) {
										local306 = local210 - 1;
									}
									if (local306 >= 0) {
										Static276.method4842(local306, local164, local287, local151, local218 * 4, (Static305.anInt6015 - local276) * 4 - 4, arg0, local282);
									}
								}
							}
						}
					}
				}
				if (Static342.aBoolean288) {
					@Pc(352) Class71 local352 = Static29.aClass71Array1[arg1];
					for (local218 = 0; local218 < Static305.anInt6015; local218++) {
						for (local276 = 0; local276 < Static305.anInt6015; local276++) {
							local282 = local218 + local189;
							local287 = local276 + local193;
							local306 = local352.anIntArrayArray24[local282 - local352.anInt2230][local287 - local352.anInt2240];
							if ((local306 & 0x40240000) != 0) {
								arg0.method2191(-1713569622, local218 * 4, 4, (Static305.anInt6015 - local276) * 4 - 4, 4);
							} else if ((local306 & 0x800000) != 0) {
								arg0.method2157(4, (Static305.anInt6015 - local276) * 4 - 4, local218 * 4, -1713569622);
							} else if ((local306 & 0x2000000) != 0) {
								arg0.method2206(4, -1713569622, (Static305.anInt6015 - local276) * 4 - 4, local218 * 4 + 3);
							} else if ((local306 & 0x8000000) != 0) {
								arg0.method2157(4, (Static305.anInt6015 - local276) * 4 + 3 - 4, local218 * 4, -1713569622);
							} else if ((local306 & 0x20000000) != 0) {
								arg0.method2206(4, -1713569622, (Static305.anInt6015 - local276) * 4 - 4, local218 * 4);
							}
						}
					}
				}
				arg0.method2241(0, 0, Static305.anInt6015 * 4, Static305.anInt6015 * 4, local183, 2);
				Static97.aClass5_25.method3626((local189 - local11) * 4 + 48, -(Static305.anInt6015 * 4) + -((-local17 + local193) * 4) + 464, Static305.anInt6015 * 4, Static305.anInt6015 * 4);
			}
		}
		arg0.method2184();
		arg0.method2180(-16777215);
		Static45.method1050();
		Static322.anInt6182 = 0;
		Static192.aClass16_23.method421();
		if (!Static342.aBoolean288) {
			for (local193 = local11; local193 < local11 + 104; local193++) {
				for (local210 = local17; local210 < local17 + 104; local210++) {
					for (local214 = arg1; local214 <= arg1 + 1 && local214 <= 3; local214++) {
						if (Static106.method2323(local210, local193, arg1, local214)) {
							@Pc(613) Interface5 local613 = (Interface5) Static127.method2619(local214, local193, local210);
							if (local613 == null) {
								local613 = (Interface5) Static258.method4649(local214, local193, local210, ol.class);
							}
							if (local613 == null) {
								local613 = (Interface5) Static352.method5612(local214, local193, local210);
							}
							if (local613 == null) {
								local613 = (Interface5) Static223.method5335(local214, local193, local210);
							}
							if (local613 != null) {
								@Pc(653) Class141 local653 = Static119.method2548(local613.method4799());
								if (!local653.aBoolean400 || Static349.aBoolean659) {
									local282 = local653.anInt4277;
									if (local653.anIntArray391 != null) {
										for (local287 = 0; local287 < local653.anIntArray391.length; local287++) {
											if (local653.anIntArray391[local287] != -1) {
												@Pc(681) Class141 local681 = Static119.method2548(local653.anIntArray391[local287]);
												if (local681.anInt4277 >= 0) {
													local282 = local681.anInt4277;
												}
											}
										}
									}
									if (local282 >= 0) {
										@Pc(703) boolean local703 = false;
										if (local282 >= 0) {
											@Pc(709) Class139 local709 = Static255.method4606(local282);
											if (local709 != null && local709.aBoolean392) {
												local703 = true;
											}
										}
										local306 = local193;
										@Pc(720) int local720 = local210;
										if (local703) {
											@Pc(727) int[][] local727 = Static29.aClass71Array1[local214].anIntArrayArray24;
											@Pc(732) int local732 = Static29.aClass71Array1[local214].anInt2230;
											@Pc(737) int local737 = Static29.aClass71Array1[local214].anInt2240;
											for (@Pc(739) int local739 = 0; local739 < 10; local739++) {
												@Pc(746) int local746 = (int) (Math.random() * 4.0D);
												if (local746 == 0 && local306 > local11 && local193 - 3 < local306 && (local727[local306 - local732 - 1][local720 - local737] & 0x2C0108) == 0) {
													local306--;
												}
												if (local746 == 1 && local306 < local11 + 104 - 1 && local306 < local193 + 3 && (local727[local306 + 1 - local732][local720 - local737] & 0x2C0180) == 0) {
													local306++;
												}
												if (local746 == 2 && local17 < local720 && local210 - 3 < local720 && (local727[local306 - local732][local720 - local737 - 1] & 0x2C0102) == 0) {
													local720--;
												}
												if (local746 == 3 && local720 < local17 + 104 - 1 && local720 < local210 + 3 && (local727[local306 - local732][local720 + 1 - local737] & 0x2C0120) == 0) {
													local720++;
												}
											}
										}
										Static303.anIntArray218[Static322.anInt6182] = local653.anInt4281;
										Static234.anIntArray429[Static322.anInt6182] = local306;
										Static327.anIntArray509[Static322.anInt6182] = local720;
										Static322.anInt6182++;
									}
								}
							}
						}
					}
				}
			}
			if (Static224.aClass207_3 != null) {
				Static191.aClass216_62.anInt6797 = 1;
				Static136.method2777(1024, 64);
				for (local210 = 0; local210 < Static224.aClass207_3.anInt6318; local210++) {
					local214 = Static224.aClass207_3.anIntArray511[local210];
					if (Static242.anInt6745 == local214 >> 28) {
						local218 = (local214 >> 14 & 0x3FFF) - Static234.anInt4783;
						local276 = (local214 & 0x3FFF) - Static32.anInt2224;
						if (local218 >= 0 && local218 < Static233.anInt5573 && local276 >= 0 && Static134.anInt2971 > local276) {
							Static192.aClass16_23.method416(new Class1_Sub13(local210));
						} else {
							@Pc(1018) Class139 local1018 = Static255.method4606(Static224.aClass207_3.anIntArray510[local210]);
							if (local1018.anIntArray381 != null && local1018.anInt4232 + local218 >= 0 && Static233.anInt5573 > local1018.anInt4229 + local218 && local276 + local1018.anInt4230 >= 0 && local276 + local1018.anInt4243 < Static134.anInt2971) {
								Static192.aClass16_23.method416(new Class1_Sub13(local210));
							}
						}
					}
				}
				Static136.method2777(128, 64);
				Static191.aClass216_62.anInt6797 = 2;
				Static191.aClass216_62.method5656();
			}
		}
		return true;
	}
}
