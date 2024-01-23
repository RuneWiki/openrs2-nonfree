import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public static int anInt4229;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_59;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1455 = Static64.method1101("loginscreen");

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1456 = Static64.method1101("Fps:");

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "[S")
	public static short[] aShortArray46 = new short[256];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
	public static boolean method3288(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
	public static void method3290() {
		Static225.aClass1_Sub16_Sub1_4.method3827();
		@Pc(13) int local13 = Static225.aClass1_Sub16_Sub1_4.method3824(8);
		if (Static58.anInt1372 > local13) {
			for (@Pc(18) int local18 = local13; local18 < Static58.anInt1372; local18++) {
				Static61.anIntArray91[Static37.anInt896++] = Static202.anIntArray326[local18];
			}
		}
		if (Static58.anInt1372 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static58.anInt1372 = 0;
		for (@Pc(58) int local58 = 0; local58 < local13; local58++) {
			@Pc(64) int local64 = Static202.anIntArray326[local58];
			@Pc(68) Class5_Sub1_Sub2 local68 = Static168.aClass5_Sub1_Sub2Array1[local64];
			@Pc(73) int local73 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
			if (local73 == 0) {
				Static202.anIntArray326[Static58.anInt1372++] = local64;
				local68.anInt3627 = Static109.anInt2430;
			} else {
				@Pc(93) int local93 = Static225.aClass1_Sub16_Sub1_4.method3824(2);
				if (local93 == 0) {
					Static202.anIntArray326[Static58.anInt1372++] = local64;
					local68.anInt3627 = Static109.anInt2430;
					Static145.anIntArray216[Static226.anInt4738++] = local64;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local93 == 1) {
						Static202.anIntArray326[Static58.anInt1372++] = local64;
						local68.anInt3627 = Static109.anInt2430;
						local140 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
						local68.method2795(local140, false);
						local150 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
						if (local150 == 1) {
							Static145.anIntArray216[Static226.anInt4738++] = local64;
						}
					} else if (local93 == 2) {
						Static202.anIntArray326[Static58.anInt1372++] = local64;
						local68.anInt3627 = Static109.anInt2430;
						local140 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
						local68.method2795(local140, true);
						local150 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
						local68.method2795(local150, true);
						@Pc(206) int local206 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
						if (local206 == 1) {
							Static145.anIntArray216[Static226.anInt4738++] = local64;
						}
					} else if (local93 == 3) {
						Static61.anIntArray91[Static37.anInt896++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!mb;)I")
	public static int method3292(@OriginalArg(1) Class70 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3519(Static191.anInt4121)) {
			local5++;
		}
		if (arg0.method3519(Static157.anInt3433)) {
			local5++;
		}
		if (arg0.method3519(Static180.anInt3925)) {
			local5++;
		}
		if (arg0.method3519(Static194.anInt4188)) {
			local5++;
		}
		if (arg0.method3519(Static127.anInt2863)) {
			local5++;
		}
		if (arg0.method3519(Static53.anInt1238)) {
			local5++;
		}
		if (arg0.method3519(Static103.anInt4829)) {
			local5++;
		}
		if (arg0.method3519(Static2.anInt71)) {
			local5++;
		}
		if (arg0.method3519(Static227.anInt4779)) {
			local5++;
		}
		if (arg0.method3519(Static141.anInt3048)) {
			local5++;
		}
		if (arg0.method3519(Static156.anInt3425)) {
			local5++;
		}
		if (arg0.method3519(Static124.anInt4548)) {
			local5++;
		}
		if (arg0.method3519(Static6.anInt159)) {
			local5++;
		}
		local5++;
		if (arg0.method3519(Static222.anInt4669)) {
			local5++;
		}
		if (arg0.method3519(Static33.anInt786)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
	public static void method3293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19;
		@Pc(49) int local49;
		if (Static54.anInt1264 == 0 && !Static82.aBoolean82) {
			@Pc(15) int local15 = Static161.anInt3476;
			@Pc(17) int local17 = Static53.anInt1240;
			local19 = Static192.anInt4156;
			@Pc(21) int local21 = Static220.anInt4645;
			@Pc(35) int local35 = local15 + (local17 - local15) * (arg3 - arg0) / arg1;
			local49 = local19 + (local21 - local19) * (arg4 - arg2) / arg5;
			Static151.method2611(Static81.aClass51_607, Static155.aClass51_1210, local35, local49, (short) 3, 0L);
		}
		@Pc(59) long local59 = -1L;
		for (local19 = 0; local19 < Static156.anInt3428; local19++) {
			@Pc(71) long local71 = Static103.aLongArray13[local19];
			@Pc(78) int local78 = (int) local71 >> 7 & 0x7F;
			local49 = (int) local71 & 0x7F;
			@Pc(90) int local90 = (int) local71 >> 29 & 0x3;
			@Pc(97) int local97 = Integer.MAX_VALUE & (int) (local71 >>> 32);
			if (local71 != local59) {
				local59 = local71;
				@Pc(184) int local184;
				if (local90 == 2 && Static145.method2497(Static197.anInt2422, local49, local78, local71)) {
					@Pc(116) Class82 local116 = Static9.method132(local97);
					if (local116.anIntArray221 != null) {
						local116 = local116.method2583();
					}
					if (local116 == null) {
						continue;
					}
					if (Static54.anInt1264 == 1) {
						Static151.method2611(Static150.method2574(new Class51[] { Static87.aClass51_640, Static168.aClass51_1281, local116.aClass51_1154 }), Static25.aClass51_198, local49, local78, (short) 12, local71);
					} else if (!Static82.aBoolean82) {
						@Pc(174) Class51[] local174 = local116.aClass51Array24;
						if (Static138.aBoolean138) {
							local174 = Static212.method3504(local174);
						}
						if (local174 != null) {
							for (local184 = 4; local184 >= 0; local184--) {
								if (local174[local184] != null) {
									@Pc(196) short local196 = 0;
									if (local184 == 0) {
										local196 = 28;
									}
									if (local184 == 1) {
										local196 = 30;
									}
									if (local184 == 2) {
										local196 = 47;
									}
									if (local184 == 3) {
										local196 = 7;
									}
									if (local184 == 4) {
										local196 = 1004;
									}
									Static151.method2611(Static150.method2574(new Class51[] { Static63.aClass51_459, local116.aClass51_1154 }), local174[local184], local49, local78, local196, local71);
								}
							}
						}
						Static151.method2611(Static150.method2574(new Class51[] { Static63.aClass51_459, local116.aClass51_1154 }), Static168.aClass51_1282, local49, local78, (short) 1007, (long) local116.anInt3296);
					} else if ((Static128.anInt4775 & 0x4) == 4) {
						Static151.method2611(Static150.method2574(new Class51[] { Static51.aClass51_374, Static168.aClass51_1281, local116.aClass51_1154 }), Static87.aClass51_641, local49, local78, (short) 20, local71);
					}
				}
				@Pc(332) int local332;
				@Pc(340) Class5_Sub1_Sub2 local340;
				@Pc(385) Class5_Sub1_Sub1 local385;
				if (local90 == 1) {
					@Pc(311) Class5_Sub1_Sub2 local311 = Static168.aClass5_Sub1_Sub2Array1[local97];
					if (local311.aClass27_1.anInt822 == 1 && (local311.anInt3624 & 0x7F) == 64 && (local311.anInt3598 & 0x7F) == 64) {
						for (local332 = 0; local332 < Static58.anInt1372; local332++) {
							local340 = Static168.aClass5_Sub1_Sub2Array1[Static202.anIntArray326[local332]];
							if (local340 != null && local340 != local311 && local340.aClass27_1.anInt822 == 1 && local340.anInt3624 == local311.anInt3624 && local340.anInt3598 == local311.anInt3598) {
								Static185.method3101(local78, local49, Static202.anIntArray326[local332], local340.aClass27_1);
							}
						}
						for (local184 = 0; local184 < Static118.anInt2542; local184++) {
							local385 = Static191.aClass5_Sub1_Sub1Array1[Static79.anIntArray111[local184]];
							if (local385 != null && local311.anInt3624 == local385.anInt3624 && local385.anInt3598 == local311.anInt3598) {
								Static125.method2779(local385, Static79.anIntArray111[local184], local78, local49);
							}
						}
					}
					Static185.method3101(local78, local49, local97, local311.aClass27_1);
				}
				if (local90 == 0) {
					@Pc(428) Class5_Sub1_Sub1 local428 = Static191.aClass5_Sub1_Sub1Array1[local97];
					if ((local428.anInt3624 & 0x7F) == 64 && (local428.anInt3598 & 0x7F) == 64) {
						for (local332 = 0; local332 < Static58.anInt1372; local332++) {
							local340 = Static168.aClass5_Sub1_Sub2Array1[Static202.anIntArray326[local332]];
							if (local340 != null && local340.aClass27_1.anInt822 == 1 && local340.anInt3624 == local428.anInt3624 && local428.anInt3598 == local340.anInt3598) {
								Static185.method3101(local78, local49, Static202.anIntArray326[local332], local340.aClass27_1);
							}
						}
						for (local184 = 0; local184 < Static118.anInt2542; local184++) {
							local385 = Static191.aClass5_Sub1_Sub1Array1[Static79.anIntArray111[local184]];
							if (local385 != null && local385 != local428 && local428.anInt3624 == local385.anInt3624 && local385.anInt3598 == local428.anInt3598) {
								Static125.method2779(local385, Static79.anIntArray111[local184], local78, local49);
							}
						}
					}
					Static125.method2779(local428, local97, local78, local49);
				}
				if (local90 == 3) {
					@Pc(556) Class105 local556 = Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local49][local78];
					if (local556 != null) {
						for (@Pc(563) Class1_Sub2_Sub2 local563 = (Class1_Sub2_Sub2) local556.method3112(); local563 != null; local563 = (Class1_Sub2_Sub2) local556.method3111()) {
							local184 = local563.aClass5_Sub4_1.anInt2768;
							@Pc(575) Class92 local575 = Static36.method637(local184);
							if (Static54.anInt1264 == 1) {
								Static151.method2611(Static150.method2574(new Class51[] { Static87.aClass51_640, Static204.aClass51_1484, local575.aClass51_1254 }), Static25.aClass51_198, local49, local78, (short) 16, (long) local184);
							} else if (!Static82.aBoolean82) {
								@Pc(652) Class51[] local652 = local575.aClass51Array25;
								if (Static138.aBoolean138) {
									local652 = Static212.method3504(local652);
								}
								for (@Pc(664) int local664 = 4; local664 >= 0; local664--) {
									if (local652 != null && local652[local664] != null) {
										@Pc(678) byte local678 = 0;
										if (local664 == 0) {
											local678 = 48;
										}
										if (local664 == 1) {
											local678 = 14;
										}
										if (local664 == 2) {
											local678 = 37;
										}
										if (local664 == 3) {
											local678 = 51;
										}
										if (local664 == 4) {
											local678 = 2;
										}
										Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local575.aClass51_1254 }), local652[local664], local49, local78, local678, (long) local184);
									} else if (local664 == 2) {
										Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local575.aClass51_1254 }), Static224.aClass51_1606, local49, local78, (short) 37, (long) local184);
									}
								}
								Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local575.aClass51_1254 }), Static168.aClass51_1282, local49, local78, (short) 1006, (long) local184);
							} else if ((Static128.anInt4775 & 0x1) == 1) {
								Static151.method2611(Static150.method2574(new Class51[] { Static51.aClass51_374, Static204.aClass51_1484, local575.aClass51_1254 }), Static87.aClass51_641, local49, local78, (short) 45, (long) local184);
							}
						}
					}
				}
			}
		}
	}
}
