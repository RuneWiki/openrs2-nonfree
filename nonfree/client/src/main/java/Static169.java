import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
	public static void method4393(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(8, arg0);
		local8.method517();
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
	public static void method4394(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static277.anInt2834 - Static69.anInt1698;
		if (local8 >= 100) {
			Static275.anInt5173 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static43.aFloat26;
		if (Static349.anInt6186 >> 8 > local17) {
			local17 = Static349.anInt6186 >> 8;
		}
		if (Static287.aBooleanArray109[4] && local17 < Static186.anIntArray294[4] + 128) {
			local17 = Static186.anIntArray294[4] + 128;
		}
		@Pc(54) int local54 = (int) Static322.aFloat82 + Static270.anInt5902 & 0x3FFF;
		Static186.method3389(Static233.anInt4616, Static53.anInt4623, Static21.method356(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514, Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515, Static59.anInt1472) - 50, arg0, local17, local54, (local17 >> 3) * 3 + 600 << 0);
		@Pc(98) float local98 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static439.anInt7477 = (int) ((float) Static447.anInt7665 + local98 * (float) (Static439.anInt7477 - Static447.anInt7665));
		Static235.anInt4645 = (int) (local98 * (float) (Static235.anInt4645 - Static67.anInt1638) + (float) Static67.anInt1638);
		Static108.anInt2350 = (int) ((float) Static340.anInt6019 + local98 * (float) (Static108.anInt2350 - Static340.anInt6019));
		Static405.anInt7103 = (int) ((float) Static56.anInt1345 + local98 * (float) (Static405.anInt7103 - Static56.anInt1345));
		@Pc(150) int local150 = Static200.anInt3936 - Static401.anInt7078;
		if (local150 > 8192) {
			local150 -= 16384;
		} else if (local150 < -8192) {
			local150 += 16384;
		}
		Static200.anInt3936 = (int) ((float) Static401.anInt7078 + local98 * (float) local150);
		Static200.anInt3936 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public static void method4395() {
		Static210.aClass91_27 = new Class91();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!uc;I)V")
	public static void method4396(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		arg0.anInt6481 = 0;
		@Pc(21) Class130 local21;
		if (arg0.anInt6484 != -1) {
			local21 = Static143.aClass85_1.method2406(arg0.anInt6484);
			if (local21 == null || local21.anIntArray306 == null) {
				arg0.aBoolean475 = false;
				arg0.anInt6484 = -1;
			} else {
				label394: {
					arg0.anInt6472++;
					if (arg0.anInt6491 < local21.anIntArray306.length && local21.anIntArray308[arg0.anInt6491] < arg0.anInt6472) {
						arg0.anInt6540++;
						arg0.anInt6472 = 1;
						arg0.anInt6491++;
						Static125.method2339(arg0.anInt7514, arg0.anInt6491, arg0.anInt7515, arg0 == Static52.aClass11_Sub5_Sub2_Sub1_2, local21, arg0.aByte100);
					}
					if (local21.anIntArray306.length <= arg0.anInt6491) {
						arg0.anInt6491 = 0;
						arg0.anInt6472 = 0;
						if (arg0.aBoolean475) {
							arg0.anInt6484 = arg0.method5306().method5240();
							if (arg0.anInt6484 == -1) {
								arg0.aBoolean475 = false;
								break label394;
							}
							local21 = Static143.aClass85_1.method2406(arg0.anInt6484);
						}
						Static125.method2339(arg0.anInt7514, arg0.anInt6491, arg0.anInt7515, arg0 == Static52.aClass11_Sub5_Sub2_Sub1_2, local21, arg0.aByte100);
					}
					arg0.anInt6540 = arg0.anInt6491 + 1;
					if (local21.anIntArray306.length <= arg0.anInt6540) {
						arg0.anInt6540 = 0;
					}
				}
			}
		}
		@Pc(181) int local181;
		@Pc(190) Class130 local190;
		@Pc(178) Class149 local178;
		if (arg0.anInt6515 != -1 && Static277.anInt2834 >= arg0.anInt6517) {
			local178 = Static193.aClass186_1.method4462(arg0.anInt6515);
			local181 = local178.anInt4573;
			if (local181 == -1) {
				arg0.anInt6515 = -1;
			} else {
				label396: {
					local190 = Static143.aClass85_1.method2406(local181);
					if (local178.aBoolean297) {
						if (local190.anInt3948 == 3) {
							if (arg0.anInt6550 > 0 && Static277.anInt2834 >= arg0.anInt6533 && Static277.anInt2834 > arg0.anInt6538) {
								arg0.anInt6515 = -1;
								break label396;
							}
						} else if (local190.anInt3948 == 1 && arg0.anInt6550 > 0 && Static277.anInt2834 >= arg0.anInt6533 && arg0.anInt6538 < Static277.anInt2834) {
							arg0.anInt6517 = Static277.anInt2834 + 1;
							break label396;
						}
					}
					if (local190 == null || local190.anIntArray306 == null) {
						arg0.anInt6515 = -1;
					} else {
						if (arg0.anInt6512 < 0) {
							arg0.anInt6512 = 0;
							Static125.method2339(arg0.anInt7514, 0, arg0.anInt7515, arg0 == Static52.aClass11_Sub5_Sub2_Sub1_2, local190, arg0.aByte100);
						}
						arg0.anInt6490++;
						if (local190.anIntArray306.length > arg0.anInt6512 && arg0.anInt6490 > local190.anIntArray308[arg0.anInt6512]) {
							arg0.anInt6512++;
							arg0.anInt6490 = 1;
							Static125.method2339(arg0.anInt7514, arg0.anInt6512, arg0.anInt7515, arg0 == Static52.aClass11_Sub5_Sub2_Sub1_2, local190, arg0.aByte100);
						}
						if (arg0.anInt6512 >= local190.anIntArray306.length) {
							if (local178.aBoolean297) {
								arg0.anInt6488++;
								arg0.anInt6512 -= local190.anInt3940;
								if (local190.anInt3952 <= arg0.anInt6488) {
									arg0.anInt6515 = -1;
								} else if (arg0.anInt6512 >= 0 && arg0.anInt6512 < local190.anIntArray306.length) {
									Static125.method2339(arg0.anInt7514, arg0.anInt6512, arg0.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == arg0, local190, arg0.aByte100);
								} else {
									arg0.anInt6515 = -1;
								}
							} else {
								arg0.anInt6515 = -1;
							}
						}
						arg0.anInt6521 = arg0.anInt6512 + 1;
						if (local190.anIntArray306.length <= arg0.anInt6521) {
							if (local178.aBoolean297) {
								arg0.anInt6521 -= local190.anInt3940;
								if (arg0.anInt6488 + 1 >= local190.anInt3952) {
									arg0.anInt6521 = -1;
								} else if (arg0.anInt6521 < 0 || local190.anIntArray306.length <= arg0.anInt6521) {
									arg0.anInt6521 = -1;
								}
							} else {
								arg0.anInt6521 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6486 != -1 && Static277.anInt2834 >= arg0.anInt6536) {
			local178 = Static193.aClass186_1.method4462(arg0.anInt6486);
			local181 = local178.anInt4573;
			if (local181 == -1) {
				arg0.anInt6486 = -1;
			} else {
				label399: {
					local190 = Static143.aClass85_1.method2406(local181);
					if (local178.aBoolean297) {
						if (local190.anInt3948 == 3) {
							if (arg0.anInt6550 > 0 && arg0.anInt6533 <= Static277.anInt2834 && Static277.anInt2834 > arg0.anInt6538) {
								arg0.anInt6486 = -1;
								break label399;
							}
						} else if (local190.anInt3948 == 1 && arg0.anInt6550 > 0 && Static277.anInt2834 >= arg0.anInt6533 && Static277.anInt2834 > arg0.anInt6538) {
							arg0.anInt6536 = Static277.anInt2834 + 1;
							break label399;
						}
					}
					if (local190 == null || local190.anIntArray306 == null) {
						arg0.anInt6486 = -1;
					} else {
						if (arg0.anInt6494 < 0) {
							arg0.anInt6494 = 0;
							Static125.method2339(arg0.anInt7514, 0, arg0.anInt7515, arg0 == Static52.aClass11_Sub5_Sub2_Sub1_2, local190, arg0.aByte100);
						}
						arg0.anInt6534++;
						if (arg0.anInt6494 < local190.anIntArray306.length && arg0.anInt6534 > local190.anIntArray308[arg0.anInt6494]) {
							arg0.anInt6534 = 1;
							arg0.anInt6494++;
							Static125.method2339(arg0.anInt7514, arg0.anInt6494, arg0.anInt7515, arg0 == Static52.aClass11_Sub5_Sub2_Sub1_2, local190, arg0.aByte100);
						}
						if (local190.anIntArray306.length <= arg0.anInt6494) {
							if (local178.aBoolean297) {
								arg0.anInt6513++;
								arg0.anInt6494 -= local190.anInt3940;
								if (local190.anInt3952 <= arg0.anInt6513) {
									arg0.anInt6486 = -1;
								} else if (arg0.anInt6494 >= 0 && arg0.anInt6494 < local190.anIntArray306.length) {
									Static125.method2339(arg0.anInt7514, arg0.anInt6494, arg0.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == arg0, local190, arg0.aByte100);
								} else {
									arg0.anInt6486 = -1;
								}
							} else {
								arg0.anInt6486 = -1;
							}
						}
						arg0.anInt6497 = arg0.anInt6494 + 1;
						if (arg0.anInt6497 >= local190.anIntArray306.length) {
							if (local178.aBoolean297) {
								arg0.anInt6497 -= local190.anInt3940;
								if (arg0.anInt6513 + 1 >= local190.anInt3952) {
									arg0.anInt6497 = -1;
								} else if (arg0.anInt6497 < 0 || local190.anIntArray306.length <= arg0.anInt6497) {
									arg0.anInt6497 = -1;
								}
							} else {
								arg0.anInt6497 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6505 != -1 && arg0.anInt6496 <= 1) {
			local21 = Static143.aClass85_1.method2406(arg0.anInt6505);
			if (local21.anInt3948 == 3) {
				if (arg0.anInt6550 > 0 && arg0.anInt6533 <= Static277.anInt2834 && arg0.anInt6538 < Static277.anInt2834) {
					arg0.anInt6505 = -1;
				}
			} else if (local21.anInt3948 == 1 && arg0.anInt6550 > 0 && arg0.anInt6533 <= Static277.anInt2834 && arg0.anInt6538 < Static277.anInt2834) {
				arg0.anInt6496 = 2;
			}
		}
		if (arg0.anInt6505 != -1 && arg0.anInt6496 == 0) {
			local21 = Static143.aClass85_1.method2406(arg0.anInt6505);
			if (local21 == null || local21.anIntArray306 == null) {
				arg0.anInt6505 = -1;
			} else {
				arg0.anInt6479++;
				if (local21.anIntArray306.length > arg0.anInt6543 && arg0.anInt6479 > local21.anIntArray308[arg0.anInt6543]) {
					arg0.anInt6543++;
					arg0.anInt6479 = 1;
					Static125.method2339(arg0.anInt7514, arg0.anInt6543, arg0.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == arg0, local21, arg0.aByte100);
				}
				if (arg0.anInt6543 >= local21.anIntArray306.length) {
					arg0.anInt6502++;
					arg0.anInt6543 -= local21.anInt3940;
					if (arg0.anInt6502 >= local21.anInt3952) {
						arg0.anInt6505 = -1;
					} else if (arg0.anInt6543 >= 0 && local21.anIntArray306.length > arg0.anInt6543) {
						Static125.method2339(arg0.anInt7514, arg0.anInt6543, arg0.anInt7515, arg0 == Static52.aClass11_Sub5_Sub2_Sub1_2, local21, arg0.aByte100);
					} else {
						arg0.anInt6505 = -1;
					}
				}
				arg0.anInt6487 = arg0.anInt6543 + 1;
				if (local21.anIntArray306.length <= arg0.anInt6487) {
					arg0.anInt6487 -= local21.anInt3940;
					if (local21.anInt3952 <= arg0.anInt6502 + 1) {
						arg0.anInt6487 = -1;
					} else if (arg0.anInt6487 < 0 || arg0.anInt6487 >= local21.anIntArray306.length) {
						arg0.anInt6487 = -1;
					}
				}
				arg0.anInt6481 = local21.anInt3947;
			}
		}
		if (arg0.anInt6496 > 0) {
			arg0.anInt6496--;
		}
		for (@Pc(1071) int local1071 = 0; local1071 < arg0.aClass15Array3.length; local1071++) {
			@Pc(1078) Class15 local1078 = arg0.aClass15Array3[local1071];
			if (local1078 != null) {
				if (local1078.anInt300 > 0) {
					local1078.anInt300--;
				} else {
					local190 = Static143.aClass85_1.method2406(local1078.anInt301);
					if (local190 == null || local190.anIntArray306 == null) {
						arg0.aClass15Array3[local1071] = null;
					} else {
						local1078.anInt302++;
						if (local1078.anInt297 < local190.anIntArray306.length && local190.anIntArray308[local1078.anInt297] < local1078.anInt302) {
							local1078.anInt297++;
							local1078.anInt302 = 1;
							Static125.method2339(arg0.anInt7514, local1078.anInt297, arg0.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == arg0, local190, arg0.aByte100);
						}
						if (local1078.anInt297 >= local190.anIntArray306.length) {
							local1078.anInt299++;
							local1078.anInt297 -= local190.anInt3940;
							if (local1078.anInt299 >= local190.anInt3952) {
								arg0.aClass15Array3[local1071] = null;
							} else if (local1078.anInt297 >= 0 && local1078.anInt297 < local190.anIntArray306.length) {
								Static125.method2339(arg0.anInt7514, local1078.anInt297, arg0.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == arg0, local190, arg0.aByte100);
							} else {
								arg0.aClass15Array3[local1071] = null;
							}
						}
						local1078.anInt298 = local1078.anInt297 + 1;
						if (local190.anIntArray306.length <= local1078.anInt298) {
							local1078.anInt298 -= local190.anInt3940;
							if (local1078.anInt299 + 1 >= local190.anInt3952) {
								local1078.anInt298 = -1;
							} else if (local1078.anInt298 < 0 || local1078.anInt298 >= local190.anIntArray306.length) {
								local1078.anInt298 = -1;
							}
						}
					}
				}
			}
		}
	}
}
