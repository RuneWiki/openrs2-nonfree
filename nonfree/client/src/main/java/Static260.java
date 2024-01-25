import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!mu", name = "V", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_9;

	@OriginalMember(owner = "client!mu", name = "Q", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_72 = new Class177(18, 8);

	@OriginalMember(owner = "client!mu", name = "S", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!mu", name = "T", descriptor = "I")
	public static int anInt5044 = 0;

	@OriginalMember(owner = "client!mu", name = "U", descriptor = "[I")
	public static final int[] anIntArray477 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILclient!za;)Z")
	public static boolean method3873(@OriginalArg(0) int arg0, @OriginalArg(2) Class106 arg1) {
		@Pc(11) int local11 = (Static209.anInt4283 - 104) / 2;
		@Pc(17) int local17 = (Static211.anInt4295 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static318.method4536(local29, local21, arg0, local25)) {
						local40 = local29;
						if (Static457.method6172(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static308.method4428(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(82) int[] local82 = new int[262144];
		for (local29 = 0; local29 < local82.length; local29++) {
			local82[local29] = -16777216;
		}
		Static25.aClass137_1 = arg1.method5969(local82, 512, 512, 512);
		Static31.method1543();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + (228 - -((int) (Math.random() * 20.0D)) << 16) + 228 | 0xFF000000;
		@Pc(151) int local151 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(170) int local170 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(174) boolean[][] local174 = new boolean[Static334.anInt6138][Static334.anInt6138];
		@Pc(180) int local180;
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(205) int local205;
		@Pc(264) int local264;
		@Pc(270) int local270;
		@Pc(275) int local275;
		@Pc(296) int local296;
		for (@Pc(176) int local176 = local11; local176 < local11 + 104; local176 += Static334.anInt6138) {
			for (local180 = local17; local180 < local17 + 104; local180 += Static334.anInt6138) {
				arg1.ba(0, 0, Static334.anInt6138 * 4, Static334.anInt6138 * 4);
				arg1.t(-16777216);
				for (local197 = arg0; local197 <= 3; local197++) {
					for (local201 = 0; local201 < Static334.anInt6138; local201++) {
						for (local205 = 0; local205 < Static334.anInt6138; local205++) {
							local174[local201][local205] = Static318.method4536(local197, local176 + local201, arg0, local205 + local180);
						}
					}
					Static262.aClass96Array3[local197].method4431(local176, local180, local176 + Static334.anInt6138, Static334.anInt6138 + local180, local174);
					if (!Static195.aBoolean248) {
						for (local205 = -4; local205 < Static334.anInt6138; local205++) {
							for (local264 = -4; local264 < Static334.anInt6138; local264++) {
								local270 = local205 + local176;
								local275 = local180 + local264;
								if (local270 >= local11 && local275 >= local17 && Static318.method4536(local197, local270, arg0, local275)) {
									local296 = local197;
									if (Static457.method6172(local275, local270)) {
										local296 = local197 - 1;
									}
									if (local296 >= 0) {
										Static342.method4809(local40, local205 * 4, arg1, local275, local270, local151, (Static334.anInt6138 - local264) * 4 - 4, local296);
									}
								}
							}
						}
					}
				}
				if (Static195.aBoolean248) {
					@Pc(350) Class120 local350 = Static19.aClass120Array1[arg0];
					for (local205 = 0; local205 < Static334.anInt6138; local205++) {
						for (local264 = 0; local264 < Static334.anInt6138; local264++) {
							local270 = local176 + local205;
							local275 = local264 + local180;
							local296 = local350.anIntArrayArray35[local270 - local350.anInt3918][local275 - local350.anInt3915];
							if ((local296 & 0x40240000) != 0) {
								arg1.method5941((Static334.anInt6138 - local264) * 4 - 4, 4, local205 * 4, 4, -1713569622);
							} else if ((local296 & 0x800000) != 0) {
								arg1.method5951(-1713569622, 4, local205 * 4, (Static334.anInt6138 - local264) * 4 - 4);
							} else if ((local296 & 0x2000000) != 0) {
								arg1.method5936((Static334.anInt6138 - local264) * 4 - 4, local205 * 4 - -3, 4, -1713569622);
							} else if ((local296 & 0x8000000) != 0) {
								arg1.method5951(-1713569622, 4, local205 * 4, (Static334.anInt6138 - local264) * 4 + 3 - 4);
							} else if ((local296 & 0x20000000) != 0) {
								arg1.method5936((Static334.anInt6138 - local264) * 4 - 4, local205 * 4, 4, -1713569622);
							}
						}
					}
				}
				arg1.P(0, 0, Static334.anInt6138 * 4, Static334.anInt6138 * 4, local170, 2);
				Static25.aClass137_1.XA((local176 - local11) * 4 + 48, -((local180 + -local17) * 4) + 464 + -(Static334.anInt6138 * 4), Static334.anInt6138 * 4, Static334.anInt6138 * 4, 0, 0);
			}
		}
		arg1.va();
		arg1.t(-16777215);
		Static179.method3014();
		Static60.anInt1602 = 0;
		Static381.aClass203_50.method4553();
		if (!Static195.aBoolean248) {
			for (local180 = local11; local180 < local11 + 104; local180++) {
				for (local197 = local17; local197 < local17 + 104; local197++) {
					for (local201 = arg0; local201 <= arg0 + 1 && local201 <= 3; local201++) {
						if (Static318.method4536(local201, local180, arg0, local197)) {
							@Pc(624) Interface5 local624 = (Interface5) Static454.method6163(local201, local180, local197);
							if (local624 == null) {
								local624 = (Interface5) Static461.method5974(local201, local180, local197, jg.class);
							}
							if (local624 == null) {
								local624 = (Interface5) Static232.method3536(local201, local180, local197);
							}
							if (local624 == null) {
								local624 = (Interface5) Static392.method5433(local201, local180, local197);
							}
							if (local624 != null) {
								@Pc(665) Class192 local665 = Static455.aClass161_4.method3628(local624.method5730());
								if (!local665.aBoolean354 || Static94.aBoolean149) {
									local270 = local665.anInt5687;
									if (local665.anIntArray532 != null) {
										for (local275 = 0; local275 < local665.anIntArray532.length; local275++) {
											if (local665.anIntArray532[local275] != -1) {
												@Pc(694) Class192 local694 = Static455.aClass161_4.method3628(local665.anIntArray532[local275]);
												if (local694.anInt5687 >= 0) {
													local270 = local694.anInt5687;
												}
											}
										}
									}
									if (local270 >= 0) {
										@Pc(710) boolean local710 = false;
										if (local270 >= 0) {
											@Pc(720) Class47 local720 = Static163.aClass170_2.method3739(local270);
											if (local720 != null && local720.aBoolean100) {
												local710 = true;
											}
										}
										local296 = local180;
										@Pc(731) int local731 = local197;
										if (local710) {
											@Pc(738) int[][] local738 = Static19.aClass120Array1[local201].anIntArrayArray35;
											@Pc(743) int local743 = Static19.aClass120Array1[local201].anInt3918;
											@Pc(748) int local748 = Static19.aClass120Array1[local201].anInt3915;
											for (@Pc(750) int local750 = 0; local750 < 10; local750++) {
												@Pc(757) int local757 = (int) (Math.random() * 4.0D);
												if (local757 == 0 && local296 > local11 && local296 > local180 - 3 && (local738[local296 - local743 - 1][local731 - local748] & 0x2C0108) == 0) {
													local296--;
												}
												if (local757 == 1 && local296 < local11 + 104 - 1 && local180 + 3 > local296 && (local738[local296 + 1 - local743][local731 - local748] & 0x2C0180) == 0) {
													local296++;
												}
												if (local757 == 2 && local17 < local731 && local731 > local197 - 3 && (local738[local296 - local743][local731 - local748 - 1] & 0x2C0102) == 0) {
													local731--;
												}
												if (local757 == 3 && local17 + 104 - 1 > local731 && local197 + 3 > local731 && (local738[local296 - local743][local731 + 1 - local748] & 0x2C0120) == 0) {
													local731++;
												}
											}
										}
										Static61.anIntArray145[Static60.anInt1602] = local665.anInt5642;
										Static372.anIntArray628[Static60.anInt1602] = local296;
										Static388.anIntArray675[Static60.anInt1602] = local731;
										Static60.anInt1602++;
									}
								}
							}
						}
					}
				}
			}
			if (Static90.aClass121_1 != null) {
				Static37.aClass211_13.anInt6207 = 1;
				Static163.aClass170_2.method3743(1024, 64);
				for (local197 = 0; local197 < Static90.aClass121_1.anInt3940; local197++) {
					local201 = Static90.aClass121_1.anIntArray378[local197];
					if (Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 == local201 >> 28) {
						local205 = (local201 >> 14 & 0x3FFF) - Static278.anInt5374;
						local264 = (local201 & 0x3FFF) - Static380.anInt6896;
						if (local205 >= 0 && Static209.anInt4283 > local205 && local264 >= 0 && local264 < Static211.anInt4295) {
							Static381.aClass203_50.method4551(new Class1_Sub33(local197));
						} else {
							@Pc(1019) Class47 local1019 = Static163.aClass170_2.method3739(Static90.aClass121_1.anIntArray379[local197]);
							if (local1019.anIntArray135 != null && local1019.anInt1542 + local205 >= 0 && Static209.anInt4283 > local1019.anInt1541 + local205 && local1019.anInt1553 + local264 >= 0 && local1019.anInt1559 + local264 < Static211.anInt4295) {
								Static381.aClass203_50.method4551(new Class1_Sub33(local197));
							}
						}
					}
				}
				Static163.aClass170_2.method3743(128, 64);
				Static37.aClass211_13.anInt6207 = 2;
				Static37.aClass211_13.method4764();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)V")
	public static void method3875() {
		if (Static366.aClass248_8 != Static314.aClass248_7) {
			try {
				Static466.method4995("tbrefresh", Static271.aClient1);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}
}
