import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_49 = new Class94(32, 4);

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_50 = new Class94(75, 3);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Z")
	public static boolean method4511() {
		try {
			@Pc(7) Class247 local7 = new Class247();
			@Pc(12) byte[] local12 = local7.method6564(Static96.aByteArray33);
			Static551.method2897(local12);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)I")
	public static int method4513(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIBI)Lclient!wm;")
	public static Class2_Sub52 method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class2_Sub52 local5 = null;
		if (arg2 == 0) {
			local5 = Static130.method3019(Static456.aClass94_63, Static361.aClass183_1);
		}
		if (arg2 == 1) {
			local5 = Static130.method3019(Static64.aClass94_19, Static361.aClass183_1);
		}
		local5.aClass2_Sub11_Sub2_7.method8349(arg0 + Static32.anInt723);
		local5.aClass2_Sub11_Sub2_7.method8391(Static449.aClass90_1.method8781(82) ? 1 : 0);
		local5.aClass2_Sub11_Sub2_7.method8331(Static84.anInt2565 + arg1);
		Static542.anInt9759 = arg1;
		Static339.anInt6841 = arg0;
		Static236.aBoolean376 = false;
		Static451.method7098();
		return local5;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ha;Z)Z")
	public static boolean method4515(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(11) int local11 = (Static47.anInt1794 - 104) / 2;
		@Pc(17) int local17 = (Static209.anInt4742 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static267.method4913(local25, local21, arg0, local29)) {
						local40 = local29;
						if (Static30.method735(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static318.method5533(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(81) int[] local81 = new int[262144];
		for (local29 = 0; local29 < local81.length; local29++) {
			local81[local29] = -16777216;
		}
		Static354.aClass46_22 = arg1.method7265(512, local81, 512, 512);
		Static140.method3122();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228 | 0xFF000000;
		@Pc(153) int local153 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(172) int local172 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(182) boolean[][] local182 = new boolean[Static291.anInt6175 + 3][Static291.anInt6175 + 1 + 2];
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(194) int local194;
		@Pc(196) int local196;
		@Pc(205) int local205;
		@Pc(212) int local212;
		@Pc(223) int local223;
		@Pc(249) int local249;
		@Pc(253) int local253;
		@Pc(306) int local306;
		@Pc(312) int local312;
		@Pc(316) int local316;
		@Pc(335) int local335;
		for (@Pc(184) int local184 = local11; local184 < local11 + 104; local184 += Static291.anInt6175) {
			for (local188 = local17; local188 < local17 + 104; local188 += Static291.anInt6175) {
				local192 = 0;
				local194 = 0;
				local196 = local184;
				if (local184 > 0) {
					local196 = local184 - 1;
					local192 += 4;
				}
				local205 = local188;
				if (local188 > 0) {
					local205 = local188 - 1;
				}
				local212 = Static291.anInt6175 + local184;
				if (local212 < 104) {
					local212++;
				}
				local223 = local188 + Static291.anInt6175;
				if (local223 < 104) {
					local223++;
					local194 += 4;
				}
				arg1.KA(0, 0, Static291.anInt6175 * 4 + local192, Static291.anInt6175 * 4 + local194);
				arg1.GA(-16777216);
				@Pc(257) int local257;
				for (local249 = arg0; local249 <= 3; local249++) {
					for (local253 = 0; local253 <= Static291.anInt6175; local253++) {
						for (local257 = 0; local257 <= Static291.anInt6175; local257++) {
							local182[local253][local257] = Static267.method4913(local205 + local257, local196 + local253, arg0, local249);
						}
					}
					Static40.aClass65Array2[local249].method8000(local196, local205, local212, local223, local182);
					if (!Static179.aBoolean321) {
						for (local257 = -4; local257 < Static291.anInt6175; local257++) {
							for (local306 = -4; local306 < Static291.anInt6175; local306++) {
								local312 = local184 + local257;
								local316 = local306 + local188;
								if (local312 >= local11 && local17 <= local316 && Static267.method4913(local316, local312, arg0, local249)) {
									local335 = local249;
									if (Static30.method735(local316, local312)) {
										local335 = local249 - 1;
									}
									if (local335 >= 0) {
										Static562.method8439(local153, (Static291.anInt6175 - local306) * 4 + local194 - 4, local335, local316, local312, arg1, local257 * 4 + local192, local40);
									}
								}
							}
						}
					}
				}
				if (Static179.aBoolean321) {
					@Pc(387) Class104 local387 = Static55.aClass104Array3[arg0];
					for (local257 = 0; local257 < Static291.anInt6175; local257++) {
						for (local306 = 0; local306 < Static291.anInt6175; local306++) {
							local312 = local184 + local257;
							local316 = local306 + local188;
							local335 = local387.anIntArrayArray17[local312 - local387.anInt3585][local316 - local387.anInt3573];
							if ((local335 & 0x40240000) != 0) {
								arg1.method7278(4, local257 * 4 + local192, (Static291.anInt6175 + -local306) * 4 + -4 + local194, 4, -1713569622);
							} else if ((local335 & 0x800000) != 0) {
								arg1.method7252(4, local194 + (-local306 + Static291.anInt6175) * 4 - 4, -1713569622, local257 * 4 + local192);
							} else if ((local335 & 0x2000000) != 0) {
								arg1.method7263(local192 + local257 * 4 + 3, -1713569622, 4, (Static291.anInt6175 - local306) * 4 + local194 - 4);
							} else if ((local335 & 0x8000000) != 0) {
								arg1.method7252(4, local194 + (Static291.anInt6175 - local306) * 4 + 3 - 4, -1713569622, local192 + local257 * 4);
							} else if ((local335 & 0x20000000) != 0) {
								arg1.method7263(local192 + local257 * 4, -1713569622, 4, (Static291.anInt6175 - local306) * 4 + local194 - 4);
							}
						}
					}
				}
				arg1.aa(local192, local194, Static291.anInt6175 * 4, Static291.anInt6175 * 4, local172, 2);
				Static354.aClass46_22.method6218((local184 - local11) * 4 + 48, -((local188 - local17) * 4) + 464 + -(Static291.anInt6175 * 4), Static291.anInt6175 * 4, Static291.anInt6175 * 4, local192, local194);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static132.method3031();
		Static155.anInt3956 = 0;
		Static79.aClass341_26.method8525();
		if (!Static179.aBoolean321) {
			for (local188 = local11; local188 < local11 + 104; local188++) {
				for (local192 = local17; local192 < local17 + 104; local192++) {
					for (local194 = arg0; local194 <= arg0 + 1 && local194 <= 3; local194++) {
						if (Static267.method4913(local192, local188, arg0, local194)) {
							@Pc(678) Interface21 local678 = (Interface21) Static336.method5820(local194, local188, local192);
							if (local678 == null) {
								local678 = (Interface21) Static440.method6961(local194, local188, local192, se.class);
							}
							if (local678 == null) {
								local678 = (Interface21) Static563.method8458(local194, local188, local192);
							}
							if (local678 == null) {
								local678 = (Interface21) Static629.method9130(local194, local188, local192);
							}
							if (local678 != null) {
								@Pc(719) Class161 local719 = Static27.aClass342_3.method8534(local678.method8625());
								if (!local719.aBoolean409 || Static378.aBoolean238) {
									local212 = local719.anInt5387;
									if (local719.anIntArray288 != null) {
										for (local223 = 0; local223 < local719.anIntArray288.length; local223++) {
											if (local719.anIntArray288[local223] != -1) {
												@Pc(748) Class161 local748 = Static27.aClass342_3.method8534(local719.anIntArray288[local223]);
												if (local748.anInt5387 >= 0) {
													local212 = local748.anInt5387;
												}
											}
										}
									}
									if (local212 >= 0) {
										@Pc(768) boolean local768 = false;
										if (local212 >= 0) {
											@Pc(775) Class153 local775 = Static361.aClass248_4.method6584(local212);
											if (local775 != null && local775.aBoolean386) {
												local768 = true;
											}
										}
										local249 = local188;
										local253 = local192;
										if (local768) {
											@Pc(793) int[][] local793 = Static55.aClass104Array3[local194].anIntArrayArray17;
											local306 = Static55.aClass104Array3[local194].anInt3585;
											local312 = Static55.aClass104Array3[local194].anInt3573;
											for (local316 = 0; local316 < 10; local316++) {
												local335 = (int) (Math.random() * 4.0D);
												if (local335 == 0 && local11 < local249 && local188 - 3 < local249 && (local793[local249 - local306 - 1][local253 - local312] & 0x2C0108) == 0) {
													local249--;
												}
												if (local335 == 1 && local11 + 104 - 1 > local249 && local188 + 3 > local249 && (local793[local249 + 1 - local306][local253 - local312] & 0x2C0180) == 0) {
													local249++;
												}
												if (local335 == 2 && local253 > local17 && local253 > local192 - 3 && (local793[local249 - local306][local253 - local312 - 1] & 0x2C0102) == 0) {
													local253--;
												}
												if (local335 == 3 && local253 < local17 + 104 - 1 && local192 + 3 > local253 && (local793[local249 - local306][local253 + 1 - local312] & 0x2C0120) == 0) {
													local253++;
												}
											}
										}
										Static572.anIntArray661[Static155.anInt3956] = local719.anInt5398;
										Static245.anIntArray278[Static155.anInt3956] = local249;
										Static146.anIntArray179[Static155.anInt3956] = local253;
										Static155.anInt3956++;
									}
								}
							}
						}
					}
				}
			}
			if (Static563.aClass333_3 != null) {
				Static337.aClass157_172.anInt5303 = 1;
				Static361.aClass248_4.method6579(64, 1024);
				for (local192 = 0; local192 < Static563.aClass333_3.anInt9955; local192++) {
					local194 = Static563.aClass333_3.anIntArray646[local192];
					if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 == local194 >> 28) {
						local196 = (local194 >> 14 & 0x3FFF) - Static84.anInt2565;
						local205 = (local194 & 0x3FFF) - Static32.anInt723;
						if (local196 >= 0 && local196 < Static47.anInt1794 && local205 >= 0 && local205 < Static209.anInt4742) {
							Static79.aClass341_26.method8528(new Class2_Sub43(local192));
						} else {
							@Pc(1072) Class153 local1072 = Static361.aClass248_4.method6584(Static563.aClass333_3.anIntArray647[local192]);
							if (local1072.anIntArray273 != null && local196 + local1072.anInt5238 >= 0 && local1072.anInt5244 + local196 < Static47.anInt1794 && local205 + local1072.anInt5219 >= 0 && Static209.anInt4742 > local205 + local1072.anInt5248) {
								Static79.aClass341_26.method8528(new Class2_Sub43(local192));
							}
						}
					}
				}
				Static361.aClass248_4.method6579(64, 128);
				Static337.aClass157_172.anInt5303 = 2;
				Static337.aClass157_172.method4566();
			}
		}
		return true;
	}
}
