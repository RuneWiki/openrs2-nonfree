import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "Lclient!rg;")
	public static Class293 aClass293_9;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public static void method7328() {
		@Pc(16) Class3_Sub26 local16;
		for (local16 = (Class3_Sub26) Static588.aClass216_70.method5457(); local16 != null; local16 = (Class3_Sub26) Static588.aClass216_70.method5458()) {
			Static280.method4572(local16, false);
		}
		for (local16 = (Class3_Sub26) Static48.aClass216_69.method5457(); local16 != null; local16 = (Class3_Sub26) Static48.aClass216_69.method5458()) {
			Static280.method4572(local16, true);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)[Lclient!bk;")
	public static Class34[] method7330() {
		return new Class34[] { Static237.aClass34_1, Static562.aClass34_4, Static536.aClass34_3 };
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZBI)Lclient!wda;")
	public static Class3_Sub52 method7331(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class3_Sub52) Static247.aClass25_23.method426(local17);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILclient!ha;)Z")
	public static boolean method7332(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(11) int local11 = (Static399.anInt7121 - 104) / 2;
		@Pc(17) int local17 = (Static24.anInt345 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static168.method2814(local25, local29, arg0, local21)) {
						local40 = local29;
						if (Static97.method1657(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static184.method3028(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(92) int[] local92 = new int[262144];
		for (local29 = 0; local29 < local92.length; local29++) {
			local92[local29] = -16777216;
		}
		Static294.aClass103_32 = arg1.method6112(512, local92, 512, 512);
		Static519.method7551();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(166) int local166 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x6AA9FF00) << 16;
		@Pc(190) int local190 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(202) boolean[][] local202 = new boolean[Static141.anInt2884 + 1 + 2][Static141.anInt2884 + 2 + 1];
		@Pc(208) int local208;
		@Pc(212) int local212;
		@Pc(214) int local214;
		@Pc(216) int local216;
		@Pc(225) int local225;
		@Pc(232) int local232;
		@Pc(242) int local242;
		@Pc(266) int local266;
		@Pc(270) int local270;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(329) int local329;
		@Pc(344) int local344;
		for (@Pc(204) int local204 = local11; local204 < local11 + 104; local204 += Static141.anInt2884) {
			for (local208 = local17; local208 < local17 + 104; local208 += Static141.anInt2884) {
				local212 = 0;
				local214 = 0;
				local216 = local204;
				if (local204 > 0) {
					local216 = local204 - 1;
					local212 += 4;
				}
				local225 = local208;
				if (local208 > 0) {
					local225 = local208 - 1;
				}
				local232 = local204 + Static141.anInt2884;
				if (local232 < 104) {
					local232++;
				}
				local242 = Static141.anInt2884 + local208;
				if (local242 < 104) {
					local214 += 4;
					local242++;
				}
				arg1.KA(0, 0, Static141.anInt2884 * 4 + local212, Static141.anInt2884 * 4 + local214);
				arg1.GA(-16777216);
				@Pc(274) int local274;
				for (local266 = arg0; local266 <= 3; local266++) {
					for (local270 = 0; local270 <= Static141.anInt2884; local270++) {
						for (local274 = 0; local274 <= Static141.anInt2884; local274++) {
							local202[local270][local274] = Static168.method2814(local274 + local225, local266, arg0, local216 + local270);
						}
					}
					Static518.aClass91Array2[local266].method7721(local216, local225, local232, local242, local202);
					if (!Static630.aBoolean760) {
						for (local274 = -4; local274 < Static141.anInt2884; local274++) {
							for (local319 = -4; local319 < Static141.anInt2884; local319++) {
								local325 = local274 + local204;
								local329 = local208 + local319;
								if (local325 >= local11 && local17 <= local329 && Static168.method2814(local329, local266, arg0, local325)) {
									local344 = local266;
									if (Static97.method1657(local329, local325)) {
										local344 = local266 - 1;
									}
									if (local344 >= 0) {
										Static440.method6629(arg1, local344, local166, local274 * 4 + local212, local40, local214 + (-local319 + Static141.anInt2884) * 4 - 4, local325, local329);
									}
								}
							}
						}
					}
				}
				if (Static630.aBoolean760) {
					@Pc(407) Class237 local407 = Static174.aClass237Array1[arg0];
					for (local274 = 0; local274 < Static141.anInt2884; local274++) {
						for (local319 = 0; local319 < Static141.anInt2884; local319++) {
							local325 = local274 + local204;
							local329 = local208 + local319;
							local344 = local407.anIntArrayArray33[local325 - local407.anInt6799][local329 - local407.anInt6790];
							if ((local344 & 0x40240000) != 0) {
								arg1.method6134(local274 * 4 + local212, 4, 4, -1713569622, (Static141.anInt2884 - local319) * 4 + local214 - 4);
							} else if ((local344 & 0x800000) != 0) {
								arg1.method6108(local212 + local274 * 4, (-local319 + Static141.anInt2884) * 4 + local214 + -4, -1713569622, 4);
							} else if ((local344 & 0x2000000) != 0) {
								arg1.method6154(4, -1713569622, local214 + (Static141.anInt2884 - local319) * 4 - 4, local274 * 4 + (local212 - -3));
							} else if ((local344 & 0x8000000) != 0) {
								arg1.method6108(local212 + local274 * 4, (Static141.anInt2884 + -local319) * 4 + 3 + (local214 - 4), -1713569622, 4);
							} else if ((local344 & 0x20000000) != 0) {
								arg1.method6154(4, -1713569622, local214 + (Static141.anInt2884 - local319) * 4 - 4, local212 + local274 * 4);
							}
						}
					}
				}
				arg1.aa(local212, local214, Static141.anInt2884 * 4, Static141.anInt2884 * 4, local190, 2);
				Static294.aClass103_32.method7443((local204 - local11) * 4 + 48, -(Static141.anInt2884 * 4) + 464 - (local208 + -local17) * 4, Static141.anInt2884 * 4, Static141.anInt2884 * 4, local212, local214);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static647.method8677();
		Static415.anInt7299 = 0;
		Static559.aClass216_67.method5454();
		if (!Static630.aBoolean760) {
			for (local208 = local11; local208 < local11 + 104; local208++) {
				for (local212 = local17; local212 < local17 + 104; local212++) {
					for (local214 = arg0; arg0 + 1 >= local214 && local214 <= 3; local214++) {
						if (Static168.method2814(local212, local214, arg0, local208)) {
							@Pc(684) Interface2 local684 = (Interface2) Static279.method4563(local214, local208, local212);
							if (local684 == null) {
								local684 = (Interface2) Static137.method2371(local214, local208, local212, bda.class);
							}
							if (local684 == null) {
								local684 = (Interface2) Static380.method5991(local214, local208, local212);
							}
							if (local684 == null) {
								local684 = (Interface2) Static483.method7129(local214, local208, local212);
							}
							if (local684 != null) {
								@Pc(725) Class330 local725 = Static370.aClass284_3.method6915(local684.method7500());
								if (!local725.aBoolean682 || Static166.aBoolean243) {
									local232 = local725.anInt9202;
									if (local725.anIntArray581 != null) {
										for (local242 = 0; local242 < local725.anIntArray581.length; local242++) {
											if (local725.anIntArray581[local242] != -1) {
												@Pc(754) Class330 local754 = Static370.aClass284_3.method6915(local725.anIntArray581[local242]);
												if (local754.anInt9202 >= 0) {
													local232 = local754.anInt9202;
												}
											}
										}
									}
									if (local232 >= 0) {
										@Pc(780) boolean local780 = false;
										if (local232 >= 0) {
											@Pc(787) Class179 local787 = Static167.aClass154_3.method3947(local232);
											if (local787 != null && local787.aBoolean388) {
												local780 = true;
											}
										}
										local266 = local208;
										local270 = local212;
										if (local780) {
											@Pc(805) int[][] local805 = Static174.aClass237Array1[local214].anIntArrayArray33;
											local319 = Static174.aClass237Array1[local214].anInt6799;
											local325 = Static174.aClass237Array1[local214].anInt6790;
											for (local329 = 0; local329 < 10; local329++) {
												local344 = (int) (Math.random() * 4.0D);
												if (local344 == 0 && local266 > local11 && local208 - 3 < local266 && (local805[local266 - local319 - 1][local270 - local325] & 0x2C0108) == 0) {
													local266--;
												}
												if (local344 == 1 && local266 < local11 + 104 - 1 && local208 + 3 > local266 && (local805[local266 + 1 - local319][local270 - local325] & 0x2C0180) == 0) {
													local266++;
												}
												if (local344 == 2 && local17 < local270 && local270 > local212 - 3 && (local805[local266 - local319][local270 - local325 - 1] & 0x2C0102) == 0) {
													local270--;
												}
												if (local344 == 3 && local17 + 104 - 1 > local270 && local270 < local212 + 3 && (local805[local266 - local319][local270 + 1 - local325] & 0x2C0120) == 0) {
													local270++;
												}
											}
										}
										Static584.anIntArray594[Static415.anInt7299] = local725.anInt9240;
										Static578.anIntArray593[Static415.anInt7299] = local266;
										Static402.anIntArray426[Static415.anInt7299] = local270;
										Static415.anInt7299++;
									}
								}
							}
						}
					}
				}
			}
			if (Static177.aClass76_3 != null) {
				Static605.aClass343_260.anInt9505 = 1;
				Static167.aClass154_3.method3941(64, 1024);
				for (local212 = 0; local212 < Static177.aClass76_3.anInt2176; local212++) {
					local214 = Static177.aClass76_3.anIntArray144[local212];
					if (local214 >> 28 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) {
						local216 = (local214 >> 14 & 0x3FFF) - Static427.anInt7462;
						local225 = (local214 & 0x3FFF) - Static22.anInt329;
						if (local216 >= 0 && local216 < Static399.anInt7121 && local225 >= 0 && Static24.anInt345 > local225) {
							Static559.aClass216_67.method5449(new Class3_Sub51(local212));
						} else {
							@Pc(1083) Class179 local1083 = Static167.aClass154_3.method3947(Static177.aClass76_3.anIntArray143[local212]);
							if (local1083.anIntArray294 != null && local216 + local1083.anInt5333 >= 0 && Static399.anInt7121 > local1083.anInt5338 + local216 && local225 + local1083.anInt5345 >= 0 && local225 + local1083.anInt5337 < Static24.anInt345) {
								Static559.aClass216_67.method5449(new Class3_Sub51(local212));
							}
						}
					}
				}
				Static167.aClass154_3.method3941(64, 128);
				Static605.aClass343_260.anInt9505 = 2;
				Static605.aClass343_260.method8154();
			}
		}
		return true;
	}
}
