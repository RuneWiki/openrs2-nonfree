import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array2;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I")
	public static int method2196(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZILclient!tq;)Z")
	public static boolean method2197(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		@Pc(11) int local11 = (Static92.anInt1675 - 104) / 2;
		@Pc(17) int local17 = (Static262.anInt6340 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static96.method1396(arg0, local21, local25, local29)) {
						local40 = local29;
						if (Static180.method2598(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static67.method1127(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(79) int[] local79 = new int[262144];
		for (local29 = 0; local29 < local79.length; local29++) {
			local79[local29] = -16777216;
		}
		Static273.aClass51_13 = arg1.method5349(local79, 512, 512, 512);
		Static163.method2416();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(153) int local153 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(172) int local172 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(176) boolean[][] local176 = new boolean[Static371.anInt2757][Static371.anInt2757];
		@Pc(182) int local182;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(261) int local261;
		@Pc(268) int local268;
		@Pc(273) int local273;
		@Pc(292) int local292;
		for (@Pc(178) int local178 = local11; local178 < local11 + 104; local178 += Static371.anInt2757) {
			for (local182 = local17; local182 < local17 + 104; local182 += Static371.anInt2757) {
				arg1.method5313(0, 0, Static371.anInt2757 * 4, Static371.anInt2757 * 4);
				arg1.method5402(-16777216);
				for (local199 = arg0; local199 <= 3; local199++) {
					for (local203 = 0; local203 < Static371.anInt2757; local203++) {
						for (local207 = 0; local207 < Static371.anInt2757; local207++) {
							local176[local203][local207] = Static96.method1396(arg0, local178 + local203, local182 + local207, local199);
						}
					}
					Static239.aClass42Array4[local199].method3051(local178, local182, local178 + Static371.anInt2757, local182 - -Static371.anInt2757, local176);
					if (!Static297.aBoolean482) {
						for (local207 = -4; local207 < Static371.anInt2757; local207++) {
							for (local261 = -4; local261 < Static371.anInt2757; local261++) {
								local268 = local178 + local207;
								local273 = local182 + local261;
								if (local268 >= local11 && local17 <= local273 && Static96.method1396(arg0, local268, local273, local199)) {
									local292 = local199;
									if (Static180.method2598(local273, local268)) {
										local292 = local199 - 1;
									}
									if (local292 >= 0) {
										Static31.method493(local273, arg1, (Static371.anInt2757 - local261) * 4 - 4, local207 * 4, local153, local268, local292, local40);
									}
								}
							}
						}
					}
				}
				if (Static297.aBoolean482) {
					@Pc(347) Class222 local347 = Static257.aClass222Array1[arg0];
					for (local207 = 0; local207 < Static371.anInt2757; local207++) {
						for (local261 = 0; local261 < Static371.anInt2757; local261++) {
							local268 = local207 + local178;
							local273 = local182 + local261;
							local292 = local347.anIntArrayArray59[local268 - local347.anInt5619][local273 - local347.anInt5625];
							if ((local292 & 0x40240000) != 0) {
								arg1.method5343(4, -1713569622, (Static371.anInt2757 - local261) * 4 - 4, local207 * 4, 4);
							} else if ((local292 & 0x800000) != 0) {
								arg1.method5395((Static371.anInt2757 - local261) * 4 - 4, 4, -1713569622, local207 * 4);
							} else if ((local292 & 0x2000000) != 0) {
								arg1.method5362(-1713569622, 4, (Static371.anInt2757 - local261) * 4 - 4, local207 * 4 + 3);
							} else if ((local292 & 0x8000000) != 0) {
								arg1.method5395((Static371.anInt2757 - local261) * 4 - 1, 4, -1713569622, local207 * 4);
							} else if ((local292 & 0x20000000) != 0) {
								arg1.method5362(-1713569622, 4, (Static371.anInt2757 - local261) * 4 - 4, local207 * 4);
							}
						}
					}
				}
				arg1.method5321(0, 0, Static371.anInt2757 * 4, Static371.anInt2757 * 4, local172, 2);
				Static273.aClass51_13.method4670((local178 - local11) * 4 + 48, -((-local17 + local182) * 4) + 464 + -(Static371.anInt2757 * 4), Static371.anInt2757 * 4, Static371.anInt2757 * 4);
			}
		}
		arg1.method5306();
		arg1.method5402(-16777215);
		Static262.method5507();
		Static247.anInt4143 = 0;
		Static144.aClass17_27.method205();
		if (!Static297.aBoolean482) {
			for (local182 = local11; local182 < local11 + 104; local182++) {
				for (local199 = local17; local199 < local17 + 104; local199++) {
					for (local203 = arg0; local203 <= arg0 + 1 && local203 <= 3; local203++) {
						if (Static96.method1396(arg0, local182, local199, local203)) {
							@Pc(619) Interface6 local619 = (Interface6) Static91.method1355(local203, local182, local199);
							if (local619 == null) {
								local619 = (Interface6) Static67.method1123(local203, local182, local199, ki.class);
							}
							if (local619 == null) {
								local619 = (Interface6) Static186.method2676(local203, local182, local199);
							}
							if (local619 == null) {
								local619 = (Interface6) Static153.method2323(local203, local182, local199);
							}
							if (local619 != null) {
								@Pc(660) Class236 local660 = Static54.aClass153_1.method3081(local619.method5250());
								if (!local660.aBoolean551 || Static104.aBoolean157) {
									local268 = local660.anInt5909;
									if (local660.anIntArray706 != null) {
										for (local273 = 0; local273 < local660.anIntArray706.length; local273++) {
											if (local660.anIntArray706[local273] != -1) {
												@Pc(689) Class236 local689 = Static54.aClass153_1.method3081(local660.anIntArray706[local273]);
												if (local689.anInt5909 >= 0) {
													local268 = local689.anInt5909;
												}
											}
										}
									}
									if (local268 >= 0) {
										@Pc(708) boolean local708 = false;
										if (local268 >= 0) {
											@Pc(715) Class97 local715 = Static16.aClass249_1.method5522(local268);
											if (local715 != null && local715.aBoolean183) {
												local708 = true;
											}
										}
										local292 = local182;
										@Pc(726) int local726 = local199;
										if (local708) {
											@Pc(733) int[][] local733 = Static257.aClass222Array1[local203].anIntArrayArray59;
											@Pc(738) int local738 = Static257.aClass222Array1[local203].anInt5619;
											@Pc(743) int local743 = Static257.aClass222Array1[local203].anInt5625;
											for (@Pc(745) int local745 = 0; local745 < 10; local745++) {
												@Pc(752) int local752 = (int) (Math.random() * 4.0D);
												if (local752 == 0 && local292 > local11 && local182 - 3 < local292 && (local733[local292 - local738 - 1][local726 - local743] & 0x2C0108) == 0) {
													local292--;
												}
												if (local752 == 1 && local11 + 104 - 1 > local292 && local292 < local182 + 3 && (local733[local292 + 1 - local738][local726 - local743] & 0x2C0180) == 0) {
													local292++;
												}
												if (local752 == 2 && local726 > local17 && local726 > local199 - 3 && (local733[local292 - local738][local726 - local743 - 1] & 0x2C0102) == 0) {
													local726--;
												}
												if (local752 == 3 && local17 + 103 > local726 && local199 + 3 > local726 && (local733[local292 - local738][local726 + 1 - local743] & 0x2C0120) == 0) {
													local726++;
												}
											}
										}
										Static205.anIntArray436[Static247.anInt4143] = local660.anInt5911;
										Static344.anIntArray646[Static247.anInt4143] = local292;
										Static269.anIntArray136[Static247.anInt4143] = local726;
										Static247.anInt4143++;
									}
								}
							}
						}
					}
				}
			}
			if (Static208.aClass93_3 != null) {
				Static307.aClass230_79.anInt5779 = 1;
				Static16.aClass249_1.method5523(1024, 64);
				for (local199 = 0; local199 < Static208.aClass93_3.anInt2185; local199++) {
					local203 = Static208.aClass93_3.anIntArray275[local199];
					if (Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 == local203 >> 28) {
						local207 = (local203 >> 14 & 0x3FFF) - Static256.anInt4410;
						local261 = (local203 & 0x3FFF) - Static293.anInt5053;
						if (local207 >= 0 && local207 < Static92.anInt1675 && local261 >= 0 && local261 < Static262.anInt6340) {
							Static144.aClass17_27.method199(new Class1_Sub30(local199));
						} else {
							@Pc(1021) Class97 local1021 = Static16.aClass249_1.method5522(Static208.aClass93_3.anIntArray276[local199]);
							if (local1021.anIntArray289 != null && local1021.anInt2293 + local207 >= 0 && local207 + local1021.anInt2295 < Static92.anInt1675 && local1021.anInt2298 + local261 >= 0 && local1021.anInt2281 + local261 < Static262.anInt6340) {
								Static144.aClass17_27.method199(new Class1_Sub30(local199));
							}
						}
					}
				}
				Static16.aClass249_1.method5523(128, 64);
				Static307.aClass230_79.anInt5779 = 2;
				Static307.aClass230_79.method4968();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public static void method2198() {
		Static347.aBoolean568 = true;
	}
}
