import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!on", name = "G", descriptor = "I")
	public static int anInt1039;

	@OriginalMember(owner = "client!on", name = "I", descriptor = "Lclient!vk;")
	public static Class237 aClass237_2;

	@OriginalMember(owner = "client!on", name = "O", descriptor = "Z")
	private static boolean aBoolean53;

	@OriginalMember(owner = "client!on", name = "P", descriptor = "Z")
	private static boolean aBoolean54;

	@OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
	private static int anInt1045;

	@OriginalMember(owner = "client!on", name = "R", descriptor = "Z")
	private static boolean aBoolean55;

	@OriginalMember(owner = "client!on", name = "K", descriptor = "I")
	public static int anInt1042 = -1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[J[I)V")
	public static void method887(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static180.method2820(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
	public static void method888(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(5, arg0);
		local8.method3217();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILclient!np;)Z")
	public static boolean method894(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(11) int local11 = (Static12.anInt161 - 104) / 2;
		@Pc(17) int local17 = (Static44.anInt787 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static11.method5237(arg0, local25, local29, local21)) {
						local40 = local29;
						if (Static25.method318(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static45.method704(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static346.aClass110_17 = arg1.method4871(local86, 512, 512, 512);
		Static79.method1316();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10 | 0xFF000000;
		@Pc(156) int local156 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(175) int local175 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(179) boolean[][] local179 = new boolean[Static175.anInt3063][Static175.anInt3063];
		@Pc(185) int local185;
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(264) int local264;
		@Pc(270) int local270;
		@Pc(274) int local274;
		@Pc(293) int local293;
		for (@Pc(181) int local181 = local11; local181 < local11 + 104; local181 += Static175.anInt3063) {
			for (local185 = local17; local185 < local17 + 104; local185 += Static175.anInt3063) {
				arg1.method4867(0, 0, Static175.anInt3063 * 4, Static175.anInt3063 * 4);
				arg1.method4921(-16777216);
				for (local202 = arg0; local202 <= 3; local202++) {
					for (local206 = 0; local206 < Static175.anInt3063; local206++) {
						for (local210 = 0; local210 < Static175.anInt3063; local210++) {
							local179[local206][local210] = Static11.method5237(arg0, local185 + local210, local202, local181 + local206);
						}
					}
					Static89.aClass7Array4[local202].method5650(local181, local185, Static175.anInt3063 + local181, Static175.anInt3063 + local185, local179);
					if (!Static180.aBoolean239) {
						for (local210 = -4; local210 < Static175.anInt3063; local210++) {
							for (local264 = -4; local264 < Static175.anInt3063; local264++) {
								local270 = local210 + local181;
								local274 = local185 + local264;
								if (local270 >= local11 && local17 <= local274 && Static11.method5237(arg0, local274, local202, local270)) {
									local293 = local202;
									if (Static25.method318(local270, local274)) {
										local293 = local202 - 1;
									}
									if (local293 >= 0) {
										Static373.method5568(local210 * 4, local40, local274, local293, local156, local270, (Static175.anInt3063 - local264) * 4 - 4, arg1);
									}
								}
							}
						}
					}
				}
				if (Static180.aBoolean239) {
					@Pc(353) Class67 local353 = Static160.aClass67Array3[arg0];
					for (local210 = 0; local210 < Static175.anInt3063; local210++) {
						for (local264 = 0; local264 < Static175.anInt3063; local264++) {
							local270 = local181 + local210;
							local274 = local185 + local264;
							local293 = local353.anIntArrayArray19[local270 - local353.anInt1637][local274 - local353.anInt1639];
							if ((local293 & 0x40240000) != 0) {
								arg1.method4954(4, (Static175.anInt3063 - local264) * 4 - 4, 4, local210 * 4, -1713569622);
							} else if ((local293 & 0x800000) != 0) {
								arg1.method4879(-1713569622, 4, (Static175.anInt3063 - local264) * 4 - 4, local210 * 4);
							} else if ((local293 & 0x2000000) != 0) {
								arg1.method4925(4, (Static175.anInt3063 - local264) * 4 - 4, local210 * 4 + 3, -1713569622);
							} else if ((local293 & 0x8000000) != 0) {
								arg1.method4879(-1713569622, 4, (Static175.anInt3063 - local264) * 4 - 1, local210 * 4);
							} else if ((local293 & 0x20000000) != 0) {
								arg1.method4925(4, (Static175.anInt3063 - local264) * 4 - 4, local210 * 4, -1713569622);
							}
						}
					}
				}
				arg1.method4896(0, 0, Static175.anInt3063 * 4, Static175.anInt3063 * 4, local175, 2);
				Static346.aClass110_17.method5098((local181 - local11) * 4 + 48, -((local185 + -local17) * 4) + 464 - Static175.anInt3063 * 4, Static175.anInt3063 * 4, Static175.anInt3063 * 4);
			}
		}
		arg1.method4902();
		arg1.method4921(-16777215);
		Static71.method1197();
		Static205.anInt327 = 0;
		Static286.aClass138_45.method3046();
		if (!Static180.aBoolean239) {
			for (local185 = local11; local185 < local11 + 104; local185++) {
				for (local202 = local17; local202 < local17 + 104; local202++) {
					for (local206 = arg0; local206 <= arg0 + 1 && local206 <= 3; local206++) {
						if (Static11.method5237(arg0, local202, local206, local185)) {
							@Pc(622) Interface3 local622 = (Interface3) Static277.method4347(local206, local185, local202);
							if (local622 == null) {
								local622 = (Interface3) Static30.method472(local206, local185, local202, gg.class);
							}
							if (local622 == null) {
								local622 = (Interface3) Static343.method5200(local206, local185, local202);
							}
							if (local622 == null) {
								local622 = (Interface3) Static202.method3148(local206, local185, local202);
							}
							if (local622 != null) {
								@Pc(665) Class60 local665 = Static97.aClass217_4.method5007(local622.method5420());
								if (!local665.aBoolean91 || Static241.aBoolean330) {
									local270 = local665.anInt1426;
									if (local665.anIntArray134 != null) {
										for (local274 = 0; local274 < local665.anIntArray134.length; local274++) {
											if (local665.anIntArray134[local274] != -1) {
												@Pc(697) Class60 local697 = Static97.aClass217_4.method5007(local665.anIntArray134[local274]);
												if (local697.anInt1426 >= 0) {
													local270 = local697.anInt1426;
												}
											}
										}
									}
									if (local270 >= 0) {
										@Pc(716) boolean local716 = false;
										if (local270 >= 0) {
											@Pc(723) Class196 local723 = Static326.aClass195_4.method4500(local270);
											if (local723 != null && local723.aBoolean395) {
												local716 = true;
											}
										}
										local293 = local185;
										@Pc(734) int local734 = local202;
										if (local716) {
											@Pc(741) int[][] local741 = Static160.aClass67Array3[local206].anIntArrayArray19;
											@Pc(746) int local746 = Static160.aClass67Array3[local206].anInt1637;
											@Pc(751) int local751 = Static160.aClass67Array3[local206].anInt1639;
											for (@Pc(753) int local753 = 0; local753 < 10; local753++) {
												@Pc(760) int local760 = (int) (Math.random() * 4.0D);
												if (local760 == 0 && local293 > local11 && local293 > local185 - 3 && (local741[local293 - local746 - 1][local734 - local751] & 0x2C0108) == 0) {
													local293--;
												}
												if (local760 == 1 && local293 < local11 + 103 && local185 + 3 > local293 && (local741[local293 + 1 - local746][local734 - local751] & 0x2C0180) == 0) {
													local293++;
												}
												if (local760 == 2 && local17 < local734 && local202 - 3 < local734 && (local741[local293 - local746][local734 - local751 - 1] & 0x2C0102) == 0) {
													local734--;
												}
												if (local760 == 3 && local734 < local17 + 103 && local202 + 3 > local734 && (local741[local293 - local746][local734 + 1 - local751] & 0x2C0120) == 0) {
													local734++;
												}
											}
										}
										Static331.anIntArray609[Static205.anInt327] = local665.anInt1402;
										Static323.anIntArray602[Static205.anInt327] = local293;
										Static282.anIntArray545[Static205.anInt327] = local734;
										Static205.anInt327++;
									}
								}
							}
						}
					}
				}
			}
			if (Static384.aClass169_3 != null) {
				Static32.aClass20_14.anInt223 = 1;
				Static326.aClass195_4.method4497(1024, 64);
				for (local202 = 0; local202 < Static384.aClass169_3.anInt4240; local202++) {
					local206 = Static384.aClass169_3.anIntArray480[local202];
					if (local206 >> 28 == Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73) {
						local210 = (local206 >> 14 & 0x3FFF) - Static21.anInt265;
						local264 = (local206 & 0x3FFF) - Static103.anInt2044;
						if (local210 >= 0 && local210 < Static12.anInt161 && local264 >= 0 && local264 < Static44.anInt787) {
							Static286.aClass138_45.method3053(new Class3_Sub28(local202));
						} else {
							@Pc(1031) Class196 local1031 = Static326.aClass195_4.method4500(Static384.aClass169_3.anIntArray481[local202]);
							if (local1031.anIntArray558 != null && local210 + local1031.anInt5022 >= 0 && Static12.anInt161 > local1031.anInt5005 + local210 && local1031.anInt5004 + local264 >= 0 && Static44.anInt787 > local264 + local1031.anInt5021) {
								Static286.aClass138_45.method3053(new Class3_Sub28(local202));
							}
						}
					}
				}
				Static326.aClass195_4.method4497(128, 64);
				Static32.aClass20_14.anInt223 = 2;
				Static32.aClass20_14.method227();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!on", name = "providesignlink", descriptor = "(Lclient!mj;)V")
	private static void method902(@OriginalArg(0) Class156 arg0) {
		Static61.aClass156_1 = arg0;
		Static275.aClass156_4 = arg0;
	}
}
