import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V", line = 70)
	public static void method1473() {
		Class127.anInt3419 = 0;
		Class244.anInt7041 = 0;
		Class12.anInt6223 = 0;
		Class2_Sub3_Sub35.anInt6431 = 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLclient!wm;I)Z", line = 85)
	public static boolean method1474(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Class241.anInt7020 - 104) / 2;
		@Pc(17) int local17 = (OutputStream_Sub1.anInt4442 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static133.method2663(local25, arg1, local29, local21)) {
						local40 = local29;
						if (Static302.method5546(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static218.method3341(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(89) int[] local89 = new int[262144];
		for (local29 = 0; local29 < local89.length; local29++) {
			local89[local29] = -16777216;
		}
		Static269.aClass13_15 = arg0.method2886(local89, 512, 512, 512);
		Static92.method2148();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(189) int local189 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(193) boolean[][] local193 = new boolean[Class191.anInt5356][Class191.anInt5356];
		@Pc(199) int local199;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(277) int local277;
		@Pc(284) int local284;
		@Pc(288) int local288;
		@Pc(303) int local303;
		for (@Pc(195) int local195 = local11; local195 < local11 + 104; local195 += Class191.anInt5356) {
			for (local199 = local17; local199 < local17 + 104; local199 += Class191.anInt5356) {
				arg0.method2897(0, 0, Class191.anInt5356 * 4, Class191.anInt5356 * 4);
				arg0.method2869(-16777216);
				for (local216 = arg1; local216 <= 3; local216++) {
					for (local220 = 0; local220 < Class191.anInt5356; local220++) {
						for (local224 = 0; local224 < Class191.anInt5356; local224++) {
							local193[local220][local224] = Static133.method2663(local224 + local199, arg1, local216, local195 + local220);
						}
					}
					Static307.aClass6Array3[local216].method5723(local195, local199, local195 + Class191.anInt5356, Class191.anInt5356 + local199, local193);
					if (!Class36.aBoolean100) {
						for (local224 = -4; local224 < Class191.anInt5356; local224++) {
							for (local277 = -4; local277 < Class191.anInt5356; local277++) {
								local284 = local195 + local224;
								local288 = local277 + local199;
								if (local11 <= local284 && local17 <= local288 && Static133.method2663(local288, arg1, local216, local284)) {
									local303 = local216;
									if (Static302.method5546(local288, local284)) {
										local303 = local216 - 1;
									}
									if (local303 >= 0) {
										Static259.method4875(local162, local40, local224 * 4, arg0, local284, (Class191.anInt5356 - local277) * 4 - 4, local303, local288);
									}
								}
							}
						}
					}
				}
				if (Class36.aBoolean100) {
					@Pc(358) Class46 local358 = Class2_Sub3_Sub18.aClass46Array1[arg1];
					for (local224 = 0; local224 < Class191.anInt5356; local224++) {
						for (local277 = 0; local277 < Class191.anInt5356; local277++) {
							local284 = local224 + local195;
							local288 = local199 + local277;
							local303 = local358.anIntArrayArray14[local284 - local358.anInt1466][local288 - local358.anInt1482];
							if ((local303 & 0x40240000) != 0) {
								arg0.method2870(4, local224 * 4, (Class191.anInt5356 - local277) * 4 - 4, -1713569622, 4);
							} else if ((local303 & 0x800000) != 0) {
								arg0.method2892(local224 * 4, 4, (Class191.anInt5356 - local277) * 4 - 4, -1713569622);
							} else if ((local303 & 0x2000000) != 0) {
								arg0.method2812(-1713569622, local224 * 4 + 3, (Class191.anInt5356 + -local277) * 4 - 4, 4);
							} else if ((local303 & 0x8000000) != 0) {
								arg0.method2892(local224 * 4, 4, (Class191.anInt5356 - local277) * 4 + 3 - 4, -1713569622);
							} else if ((local303 & 0x20000000) != 0) {
								arg0.method2812(-1713569622, local224 * 4, (Class191.anInt5356 - local277) * 4 - 4, 4);
							}
						}
					}
				}
				arg0.method2903(0, 0, Class191.anInt5356 * 4, Class191.anInt5356 * 4, local189, 2);
				Static269.aClass13_15.method6391((local195 - local11) * 4 + 48, 464 - (-local17 + local199) * 4 - Class191.anInt5356 * 4, Class191.anInt5356 * 4, Class191.anInt5356 * 4);
			}
		}
		arg0.method2900();
		arg0.method2869(-16777215);
		Static91.method2109();
		Class19.anInt2828 = 0;
		Class43.aClass135_13.method3545();
		if (!Class36.aBoolean100) {
			for (local199 = local11; local199 < local11 + 104; local199++) {
				for (local216 = local17; local216 < local17 + 104; local216++) {
					for (local220 = arg1; local220 <= arg1 + 1 && local220 <= 3; local220++) {
						if (Static133.method2663(local216, arg1, local220, local199)) {
							@Pc(621) Interface6 local621 = (Interface6) Static25.method865(local220, local199, local216);
							if (local621 == null) {
								local621 = (Interface6) Static98.method2209(local220, local199, local216, id.class);
							}
							if (local621 == null) {
								local621 = (Interface6) Static12.method283(local220, local199, local216);
							}
							if (local621 == null) {
								local621 = (Interface6) Static27.method893(local220, local199, local216);
							}
							if (local621 != null) {
								@Pc(662) Class41 local662 = Static334.aClass202_4.method5164(local621.method6086());
								if (!local662.aBoolean111 || Class144.aBoolean241) {
									local284 = local662.anInt1305;
									if (local662.anIntArray94 != null) {
										for (local288 = 0; local288 < local662.anIntArray94.length; local288++) {
											if (local662.anIntArray94[local288] != -1) {
												@Pc(691) Class41 local691 = Static334.aClass202_4.method5164(local662.anIntArray94[local288]);
												if (local691.anInt1305 >= 0) {
													local284 = local691.anInt1305;
												}
											}
										}
									}
									if (local284 >= 0) {
										@Pc(713) boolean local713 = false;
										if (local284 >= 0) {
											@Pc(720) Class164 local720 = Static219.aClass125_1.method3380(local284);
											if (local720 != null && local720.aBoolean303) {
												local713 = true;
											}
										}
										local303 = local199;
										@Pc(731) int local731 = local216;
										if (local713) {
											@Pc(738) int[][] local738 = Class2_Sub3_Sub18.aClass46Array1[local220].anIntArrayArray14;
											@Pc(743) int local743 = Class2_Sub3_Sub18.aClass46Array1[local220].anInt1466;
											@Pc(748) int local748 = Class2_Sub3_Sub18.aClass46Array1[local220].anInt1482;
											for (@Pc(750) int local750 = 0; local750 < 10; local750++) {
												@Pc(757) int local757 = (int) (Math.random() * 4.0D);
												if (local757 == 0 && local303 > local11 && local303 > local199 - 3 && (local738[local303 - local743 - 1][local731 - local748] & 0x2C0108) == 0) {
													local303--;
												}
												if (local757 == 1 && local11 + 104 - 1 > local303 && local199 + 3 > local303 && (local738[local303 + 1 - local743][local731 - local748] & 0x2C0180) == 0) {
													local303++;
												}
												if (local757 == 2 && local17 < local731 && local731 > local216 - 3 && (local738[local303 - local743][local731 - local748 - 1] & 0x2C0102) == 0) {
													local731--;
												}
												if (local757 == 3 && local17 + 104 - 1 > local731 && local216 + 3 > local731 && (local738[local303 - local743][local731 + 1 - local748] & 0x2C0120) == 0) {
													local731++;
												}
											}
										}
										Class12_Sub4.anIntArray265[Class19.anInt2828] = local662.anInt1349;
										Class248.anIntArray494[Class19.anInt2828] = local303;
										Class3.anIntArray2[Class19.anInt2828] = local731;
										Class19.anInt2828++;
									}
								}
							}
						}
					}
				}
			}
			if (Static33.aClass103_3 != null) {
				Static266.aClass197_71.anInt5546 = 1;
				Static219.aClass125_1.method3378(64, 1024);
				for (local216 = 0; local216 < Static33.aClass103_3.anInt2699; local216++) {
					local220 = Static33.aClass103_3.anIntArray170[local216];
					if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local220 >> 28) {
						local224 = (local220 >> 14 & 0x3FFF) - Static154.anInt3136;
						local277 = (local220 & 0x3FFF) - Static139.anInt2716;
						if (local224 >= 0 && local224 < Class241.anInt7020 && local277 >= 0 && OutputStream_Sub1.anInt4442 > local277) {
							Class43.aClass135_13.method3541(new Class2_Sub39(local216));
						} else {
							@Pc(1018) Class164 local1018 = Static219.aClass125_1.method3380(Static33.aClass103_3.anIntArray171[local216]);
							if (local1018.anIntArray290 != null && local224 + local1018.anInt4412 >= 0 && local224 + local1018.anInt4427 < Class241.anInt7020 && local1018.anInt4421 + local277 >= 0 && OutputStream_Sub1.anInt4442 > local277 + local1018.anInt4425) {
								Class43.aClass135_13.method3541(new Class2_Sub39(local216));
							}
						}
					}
				}
				Static219.aClass125_1.method3378(64, 128);
				Static266.aClass197_71.anInt5546 = 2;
				Static266.aClass197_71.method5069();
			}
		}
		return true;
	}
}
