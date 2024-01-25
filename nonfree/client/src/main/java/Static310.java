import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "Lclient!bj;")
	public static Class26 aClass26_55 = new Class26(64);

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray73 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "Z")
	public static boolean aBoolean406 = true;

	@OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
	public static int anInt6150 = 1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBZI)V")
	public static void method5247(@OriginalArg(2) boolean arg0) {
		Static178.aBoolean224 = arg0;
		Static352.anInt6698 = 22050;
		Static345.anInt6605 = 2;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!uo;BI)Z")
	public static boolean method5248(@OriginalArg(0) Class129 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static24.anInt454 - 104) / 2;
		@Pc(17) int local17 = (Static240.anInt4832 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static14.method210(arg1, local25, local29, local21)) {
						local40 = local29;
						if (Static223.method3983(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static328.method5392(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(83) int[] local83 = new int[262144];
		for (local29 = 0; local29 < local83.length; local29++) {
			local83[local29] = -16777216;
		}
		Static42.aClass97_6 = arg0.method4958(local83, 512, 512, 512);
		Static250.method4393();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (-10 + (238 - -((int) (Math.random() * 20.0D))) << 8) + 238 - 10 | 0xFF000000;
		@Pc(165) int local165 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(184) int local184 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(188) boolean[][] local188 = new boolean[Static143.anInt2606][Static143.anInt2606];
		@Pc(194) int local194;
		@Pc(211) int local211;
		@Pc(215) int local215;
		@Pc(219) int local219;
		@Pc(269) int local269;
		@Pc(275) int local275;
		@Pc(279) int local279;
		@Pc(298) int local298;
		for (@Pc(190) int local190 = local11; local190 < local11 + 104; local190 += Static143.anInt2606) {
			for (local194 = local17; local194 < local17 + 104; local194 += Static143.anInt2606) {
				arg0.method4952(0, 0, Static143.anInt2606 * 4, Static143.anInt2606 * 4);
				arg0.method4930(-16777216);
				for (local211 = arg1; local211 <= 3; local211++) {
					for (local215 = 0; local215 < Static143.anInt2606; local215++) {
						for (local219 = 0; local219 < Static143.anInt2606; local219++) {
							local188[local215][local219] = Static14.method210(arg1, local194 + local219, local211, local215 + local190);
						}
					}
					Static129.aClass77Array3[local211].method4125(local190, local194, Static143.anInt2606 + local190, Static143.anInt2606 + local194, local188);
					if (!Static239.aBoolean320) {
						for (local219 = -4; local219 < Static143.anInt2606; local219++) {
							for (local269 = -4; local269 < Static143.anInt2606; local269++) {
								local275 = local190 + local219;
								local279 = local269 + local194;
								if (local275 >= local11 && local17 <= local279 && Static14.method210(arg1, local279, local211, local275)) {
									local298 = local211;
									if (Static223.method3983(local279, local275)) {
										local298 = local211 - 1;
									}
									if (local298 >= 0) {
										Static15.method4637(local275, arg0, local219 * 4, local165, local298, (Static143.anInt2606 - local269) * 4 - 4, local40, local279);
									}
								}
							}
						}
					}
				}
				if (Static239.aBoolean320) {
					@Pc(346) Class92 local346 = Static211.aClass92Array1[arg1];
					for (local219 = 0; local219 < Static143.anInt2606; local219++) {
						for (local269 = 0; local269 < Static143.anInt2606; local269++) {
							local275 = local190 + local219;
							local279 = local269 + local194;
							local298 = local346.anIntArrayArray18[local275 - local346.anInt2163][local279 - local346.anInt2177];
							if ((local298 & 0x40240000) != 0) {
								arg0.method4941(local219 * 4, (Static143.anInt2606 - local269) * 4 - 4, 4, -1713569622, 4);
							} else if ((local298 & 0x800000) != 0) {
								arg0.method4998(4, (Static143.anInt2606 - local269) * 4 - 4, -1713569622, local219 * 4);
							} else if ((local298 & 0x2000000) != 0) {
								arg0.method4940(4, -1713569622, (Static143.anInt2606 - local269) * 4 - 4, local219 * 4 + 3);
							} else if ((local298 & 0x8000000) != 0) {
								arg0.method4998(4, (Static143.anInt2606 - local269) * 4 + 3 - 4, -1713569622, local219 * 4);
							} else if ((local298 & 0x20000000) != 0) {
								arg0.method4940(4, -1713569622, (Static143.anInt2606 - local269) * 4 - 4, local219 * 4);
							}
						}
					}
				}
				arg0.method4945(0, 0, Static143.anInt2606 * 4, Static143.anInt2606 * 4, local184, 2);
				Static42.aClass97_6.method5551((local190 - local11) * 4 + 48, -(Static143.anInt2606 * 4) + -((local194 + -local17) * 4) + 464, Static143.anInt2606 * 4, Static143.anInt2606 * 4);
			}
		}
		arg0.method4966();
		arg0.method4930(-16777215);
		Static239.method4236();
		Static2.anInt14 = 0;
		Static129.aClass16_24.method191();
		if (!Static239.aBoolean320) {
			for (local194 = local11; local194 < local11 + 104; local194++) {
				for (local211 = local17; local211 < local17 + 104; local211++) {
					for (local215 = arg1; arg1 + 1 >= local215 && local215 <= 3; local215++) {
						if (Static14.method210(arg1, local211, local215, local194)) {
							@Pc(611) Interface7 local611 = (Interface7) Static136.method5506(local215, local194, local211);
							if (local611 == null) {
								local611 = (Interface7) Static284.method4725(local215, local194, local211, sc.class);
							}
							if (local611 == null) {
								local611 = (Interface7) Static3.method15(local215, local194, local211);
							}
							if (local611 == null) {
								local611 = (Interface7) Static74.method1139(local215, local194, local211);
							}
							if (local611 != null) {
								@Pc(651) Class84 local651 = Static108.method1650(local611.method5410());
								if (!local651.aBoolean125 || Static220.aBoolean298) {
									local275 = local651.anInt2002;
									if (local651.anIntArray142 != null) {
										for (local279 = 0; local279 < local651.anIntArray142.length; local279++) {
											if (local651.anIntArray142[local279] != -1) {
												@Pc(680) Class84 local680 = Static108.method1650(local651.anIntArray142[local279]);
												if (local680.anInt2002 >= 0) {
													local275 = local680.anInt2002;
												}
											}
										}
									}
									if (local275 >= 0) {
										@Pc(702) boolean local702 = false;
										if (local275 >= 0) {
											@Pc(708) Class23 local708 = Static212.method3827(local275);
											if (local708 != null && local708.aBoolean17) {
												local702 = true;
											}
										}
										local298 = local194;
										@Pc(719) int local719 = local211;
										if (local702) {
											@Pc(726) int[][] local726 = Static211.aClass92Array1[local215].anIntArrayArray18;
											@Pc(731) int local731 = Static211.aClass92Array1[local215].anInt2163;
											@Pc(736) int local736 = Static211.aClass92Array1[local215].anInt2177;
											for (@Pc(738) int local738 = 0; local738 < 10; local738++) {
												@Pc(745) int local745 = (int) (Math.random() * 4.0D);
												if (local745 == 0 && local11 < local298 && local194 - 3 < local298 && (local726[local298 - local731 - 1][local719 - local736] & 0x2C0108) == 0) {
													local298--;
												}
												if (local745 == 1 && local298 < local11 + 104 - 1 && local298 < local194 + 3 && (local726[local298 + 1 - local731][local719 - local736] & 0x2C0180) == 0) {
													local298++;
												}
												if (local745 == 2 && local719 > local17 && local719 > local211 - 3 && (local726[local298 - local731][local719 - local736 - 1] & 0x2C0102) == 0) {
													local719--;
												}
												if (local745 == 3 && local719 < local17 + 103 && local719 < local211 + 3 && (local726[local298 - local731][local719 + 1 - local736] & 0x2C0120) == 0) {
													local719++;
												}
											}
										}
										Static107.anIntArray138[Static2.anInt14] = local651.anInt2012;
										Static200.anIntArray314[Static2.anInt14] = local298;
										Static166.anIntArray218[Static2.anInt14] = local719;
										Static2.anInt14++;
									}
								}
							}
						}
					}
				}
			}
			if (Static22.aClass199_1 != null) {
				Static68.aClass144_25.anInt4430 = 1;
				Static85.method1232(64, 1024);
				for (local211 = 0; local211 < Static22.aClass199_1.anInt6201; local211++) {
					local215 = Static22.aClass199_1.anIntArray513[local211];
					if (Static322.anInt6250 == local215 >> 28) {
						local219 = (local215 >> 14 & 0x3FFF) - Static182.anInt3662;
						local269 = (local215 & 0x3FFF) - Static169.anInt6312;
						if (local219 >= 0 && Static24.anInt454 > local219 && local269 >= 0 && Static240.anInt4832 > local269) {
							Static129.aClass16_24.method190(new Class11_Sub33(local211));
						} else {
							@Pc(1005) Class23 local1005 = Static212.method3827(Static22.aClass199_1.anIntArray512[local211]);
							if (local1005.anIntArray19 != null && local219 + local1005.anInt312 >= 0 && Static24.anInt454 > local219 + local1005.anInt298 && local269 + local1005.anInt308 >= 0 && local269 + local1005.anInt317 < Static240.anInt4832) {
								Static129.aClass16_24.method190(new Class11_Sub33(local211));
							}
						}
					}
				}
				Static85.method1232(64, 128);
				Static68.aClass144_25.anInt4430 = 2;
				Static68.aClass144_25.method3918();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([I[JB)V")
	public static void method5249(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static44.method665(arg1, arg1.length - 1, arg0, 0);
	}
}
