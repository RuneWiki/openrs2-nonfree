import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fj", name = "Q", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!fj", name = "S", descriptor = "Z")
	private static boolean aBoolean81;

	@OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
	private static int anInt1384;

	@OriginalMember(owner = "client!fj", name = "U", descriptor = "Z")
	private static boolean aBoolean82;

	@OriginalMember(owner = "client!fj", name = "V", descriptor = "Z")
	private static boolean aBoolean83;

	@OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
	private static int anInt1385;

	@OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
	private static int anInt1386;

	@OriginalMember(owner = "client!fj", name = "Y", descriptor = "Z")
	private static boolean aBoolean84;

	@OriginalMember(owner = "client!fj", name = "Z", descriptor = "Z")
	private static boolean aBoolean85;

	@OriginalMember(owner = "client!fj", name = "L", descriptor = "[Lclient!i;")
	public static final Class137[] aClass137Array2 = new Class137[16];

	@OriginalMember(owner = "client!fj", name = "M", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_31 = new Class150(39, -2);

	@OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
	public static int anInt1382 = 0;

	@OriginalMember(owner = "client!fj", name = "O", descriptor = "S")
	public static short aShort38 = 32767;

	@OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
	public static int anInt1383 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V")
	public static void method1260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static245.aFloat312 < Static245.aFloat313) {
			Static245.aFloat312 = (float) ((double) Static245.aFloat312 + (double) Static245.aFloat312 / 30.0D);
			if (Static245.aFloat313 < Static245.aFloat312) {
				Static245.aFloat312 = Static245.aFloat313;
			}
			Static117.method2269();
			Static245.anInt7306 = (int) Static245.aFloat312 >> 1;
			Static245.aByteArrayArrayArray15 = Static370.method6433(Static245.anInt7306);
		} else if (Static245.aFloat312 > Static245.aFloat313) {
			Static245.aFloat312 = (float) ((double) Static245.aFloat312 - (double) Static245.aFloat312 / 30.0D);
			if (Static245.aFloat313 > Static245.aFloat312) {
				Static245.aFloat312 = Static245.aFloat313;
			}
			Static117.method2269();
			Static245.anInt7306 = (int) Static245.aFloat312 >> 1;
			Static245.aByteArrayArrayArray15 = Static370.method6433(Static245.anInt7306);
		}
		if (Static201.anInt3833 != -1 && Static107.anInt2341 != -1) {
			@Pc(85) int local85 = Static201.anInt3833 - Static435.anInt7668;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(99) int local99 = Static107.anInt2341 - Static489.anInt8411;
			Static435.anInt7668 += local85;
			if (local99 < 2 || local99 > 2) {
				local99 /= 8;
			}
			if (local85 == 0 && local99 == 0) {
				Static201.anInt3833 = -1;
				Static107.anInt2341 = -1;
			}
			Static489.anInt8411 += local99;
			Static117.method2269();
		}
		if (Static224.anInt4176 > 0) {
			Static183.anInt4083--;
			if (Static183.anInt4083 == 0) {
				Static183.anInt4083 = 100;
				Static224.anInt4176--;
			}
		} else {
			Static263.anInt5182 = -1;
			Static134.anInt2779 = -1;
		}
		if (!Static535.aBoolean654 || Static357.aClass99_56 == null) {
			return;
		}
		for (@Pc(166) Class5_Sub36 local166 = (Class5_Sub36) Static357.aClass99_56.method2526(); local166 != null; local166 = (Class5_Sub36) Static357.aClass99_56.method2519()) {
			@Pc(175) Class101 local175 = Static245.aClass246_4.method5847(local166.aClass5_Sub18_1.anInt3138);
			if (local166.method5597(arg0, arg1)) {
				if (local175.aStringArray17 != null) {
					if (local175.aStringArray17[4] != null) {
						Static371.method5606(-1, 0, 1002, -1, true, (long) local166.aClass5_Sub18_1.anInt3138, local175.anInt2886, local175.aStringArray17[4], false, local175.aString33);
					}
					if (local175.aStringArray17[3] != null) {
						Static371.method5606(-1, 0, 1008, -1, true, (long) local166.aClass5_Sub18_1.anInt3138, local175.anInt2886, local175.aStringArray17[3], false, local175.aString33);
					}
					if (local175.aStringArray17[2] != null) {
						Static371.method5606(-1, 0, 1009, -1, true, (long) local166.aClass5_Sub18_1.anInt3138, local175.anInt2886, local175.aStringArray17[2], false, local175.aString33);
					}
					if (local175.aStringArray17[1] != null) {
						Static371.method5606(-1, 0, 1011, -1, true, (long) local166.aClass5_Sub18_1.anInt3138, local175.anInt2886, local175.aStringArray17[1], false, local175.aString33);
					}
					if (local175.aStringArray17[0] != null) {
						Static371.method5606(-1, 0, 1001, -1, true, (long) local166.aClass5_Sub18_1.anInt3138, local175.anInt2886, local175.aStringArray17[0], false, local175.aString33);
					}
				}
				if (!local166.aClass5_Sub18_1.aBoolean207) {
					local166.aClass5_Sub18_1.aBoolean207 = true;
					Static266.method4409(Static230.aClass142_11, local166.aClass5_Sub18_1.anInt3138, local175.anInt2886);
				}
				if (local166.aClass5_Sub18_1.aBoolean207) {
					Static266.method4409(Static74.aClass142_4, local166.aClass5_Sub18_1.anInt3138, local175.anInt2886);
				}
			} else if (local166.aClass5_Sub18_1.aBoolean207) {
				local166.aClass5_Sub18_1.aBoolean207 = false;
				Static266.method4409(Static120.aClass142_5, local166.aClass5_Sub18_1.anInt3138, local175.anInt2886);
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIB)Ljava/lang/String;")
	public static String method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 - arg1;
		if (local15 < -9) {
			return "<col=ff0000>";
		} else if (local15 < -6) {
			return "<col=ff3000>";
		} else if (local15 < -3) {
			return "<col=ff7000>";
		} else if (local15 < 0) {
			return "<col=ffb000>";
		} else if (local15 > 9) {
			return "<col=00ff00>";
		} else if (local15 > 6) {
			return "<col=40ff00>";
		} else if (local15 > 3) {
			return "<col=80ff00>";
		} else if (local15 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!fj", name = "providesignlink", descriptor = "(Lclient!ae;)V")
	private static void method1268(@OriginalArg(0) Class9 arg0) {
		Static159.aClass9_10 = arg0;
		Static390.aClass9_20 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V")
	public static void method1269() {
		Static56.aClass288_5.method6744();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIZI[[[Lclient!br;I)Z")
	public static boolean method1273(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class37[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static314.anInt4188 & 0xFF);
		if (Static203.aByteArrayArrayArray7[Static367.anInt6860][arg1][arg2] == local14) {
			return false;
		} else if ((Static429.aByteArrayArrayArray17[Static367.anInt6860][arg1][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			Static219.anIntArray286[0] = arg1;
			@Pc(53) int local53 = 0;
			@Pc(56) int local56 = local42 + 1;
			Static280.anIntArray392[0] = arg2;
			Static203.aByteArrayArrayArray7[Static367.anInt6860][arg1][arg2] = local14;
			while (local56 != local53) {
				@Pc(74) int local74 = Static219.anIntArray286[local53] & 0xFFFF;
				@Pc(82) int local82 = Static219.anIntArray286[local53] >> 16 & 0xFF;
				@Pc(90) int local90 = Static219.anIntArray286[local53] >> 24 & 0xFF;
				@Pc(96) int local96 = Static280.anIntArray392[local53] & 0xFFFF;
				@Pc(104) int local104 = Static280.anIntArray392[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static429.aByteArrayArrayArray17[Static367.anInt6860][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(165) int local165;
				@Pc(215) int local215;
				label231: for (@Pc(130) int local130 = Static367.anInt6860 + 1; local130 <= 3; local130++) {
					if ((Static429.aByteArrayArrayArray17[local130][local74][local96] & 0x8) == 0) {
						@Pc(322) Class15_Sub2 local322;
						@Pc(332) int local332;
						@Pc(311) Class37 local311;
						@Pc(317) Class108 local317;
						if (local112 && arg3[local130][local74][local96] != null) {
							if (arg3[local130][local74][local96].aClass15_Sub3_3 != null) {
								local165 = Static197.method3278(local82);
								if (arg3[local130][local74][local96].aClass15_Sub3_3.anInt6141 == local165 || arg3[local130][local74][local96].aClass15_Sub3_2 != null && local165 == arg3[local130][local74][local96].aClass15_Sub3_2.anInt6141) {
									continue;
								}
								if (local90 != 0) {
									local215 = Static197.method3278(local90);
									if (local215 == arg3[local130][local74][local96].aClass15_Sub3_3.anInt6141 || arg3[local130][local74][local96].aClass15_Sub3_2 != null && local215 == arg3[local130][local74][local96].aClass15_Sub3_2.anInt6141) {
										continue;
									}
								}
								if (local104 != 0) {
									local215 = Static197.method3278(local104);
									if (local215 == arg3[local130][local74][local96].aClass15_Sub3_3.anInt6141 || arg3[local130][local74][local96].aClass15_Sub3_2 != null && local215 == arg3[local130][local74][local96].aClass15_Sub3_2.anInt6141) {
										continue;
									}
								}
							}
							local311 = arg3[local130][local74][local96];
							if (local311.aClass108_1 != null) {
								for (local317 = local311.aClass108_1; local317 != null; local317 = local317.aClass108_3) {
									local322 = local317.aClass15_Sub2_1;
									if (local322 instanceof Interface10) {
										@Pc(328) Interface10 local328 = (Interface10) local322;
										local332 = local328.method6867();
										if (local332 == 21) {
											local332 = 19;
										}
										@Pc(343) int local343 = local328.method6866();
										@Pc(349) int local349 = local332 | local343 << 6;
										if (local82 == local349 || local90 != 0 && local349 == local90 || local104 != 0 && local104 == local349) {
											continue label231;
										}
									}
								}
							}
						}
						local311 = arg3[local130][local74][local96];
						if (local311 != null && local311.aClass108_1 != null) {
							for (local317 = local311.aClass108_1; local317 != null; local317 = local317.aClass108_3) {
								local322 = local317.aClass15_Sub2_1;
								if (local322.aShort111 != local322.aShort110 || local322.aShort109 != local322.aShort108) {
									for (@Pc(418) int local418 = local322.aShort110; local418 <= local322.aShort111; local418++) {
										for (local332 = local322.aShort109; local332 <= local322.aShort108; local332++) {
											Static203.aByteArrayArrayArray7[local130][local418][local332] = local14;
										}
									}
								}
							}
						}
						local126 = true;
						Static203.aByteArrayArrayArray7[local130][local74][local96] = local14;
					}
				}
				if (local126) {
					local165 = Static248.aClass131Array4[Static367.anInt6860 + 1].ba(local74, local96);
					if (Static253.anIntArray659[arg4] < local165) {
						Static253.anIntArray659[arg4] = local165;
					}
					local215 = local74 << 7;
					if (Static30.anIntArray47[arg4] > local215) {
						Static30.anIntArray47[arg4] = local215;
					} else if (local215 > Static223.anIntArray287[arg4]) {
						Static223.anIntArray287[arg4] = local215;
					}
					@Pc(522) int local522 = local96 << 7;
					if (local522 < Static254.anIntArray687[arg4]) {
						Static254.anIntArray687[arg4] = local522;
					} else if (local522 > Static53.anIntArray154[arg4]) {
						Static53.anIntArray154[arg4] = local522;
					}
				}
				if (!local112) {
					if (local74 >= 1 && local14 != Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 - 1][local96]) {
						Static219.anIntArray286[local56] = local74 - 1 | 0x120000 | 0xD3000000;
						Static280.anIntArray392[local56] = local96 | 0x130000;
						local56 = local56 + 1 & 0xFFF;
						Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 - 1][local96] = local14;
					}
					local96++;
					if (Static235.anInt4493 > local96) {
						if (local74 - 1 >= 0 && Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 - 1][local96] != local14 && (Static429.aByteArrayArrayArray17[Static367.anInt6860][local74][local96] & 0x4) == 0 && (Static429.aByteArrayArrayArray17[Static367.anInt6860][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static219.anIntArray286[local56] = 0x52000000 | 0x120000 | local74 - 1;
							Static280.anIntArray392[local56] = local96 | 0x130000;
							local56 = local56 + 1 & 0xFFF;
							Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 - 1][local96] = local14;
						}
						if (local14 != Static203.aByteArrayArrayArray7[Static367.anInt6860][local74][local96]) {
							Static219.anIntArray286[local56] = local74 | 0x520000 | 0x13000000;
							Static280.anIntArray392[local56] = local96 | 0x530000;
							Static203.aByteArrayArrayArray7[Static367.anInt6860][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static460.anInt7894 && local14 != Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 + 1][local96] && (Static429.aByteArrayArrayArray17[Static367.anInt6860][local74][local96] & 0x4) == 0 && (Static429.aByteArrayArrayArray17[Static367.anInt6860][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static219.anIntArray286[local56] = 0x92000000 | 0x520000 | local74 + 1;
							Static280.anIntArray392[local56] = local96 | 0x530000;
							local56 = local56 + 1 & 0xFFF;
							Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 + 1][local96] = local14;
						}
					}
					local96--;
					if (local74 + 1 < Static460.anInt7894 && local14 != Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 + 1][local96]) {
						Static219.anIntArray286[local56] = local74 + 1 | 0x53000000 | 0x920000;
						Static280.anIntArray392[local56] = local96 | 0x930000;
						local56 = local56 + 1 & 0xFFF;
						Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 + 1][local96] = local14;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && local14 != Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 - 1][local96] && (Static429.aByteArrayArrayArray17[Static367.anInt6860][local74][local96] & 0x4) == 0 && (Static429.aByteArrayArrayArray17[Static367.anInt6860][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static219.anIntArray286[local56] = local74 - 1 | 0xD20000 | 0x12000000;
							Static280.anIntArray392[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 - 1][local96] = local14;
						}
						if (local14 != Static203.aByteArrayArrayArray7[Static367.anInt6860][local74][local96]) {
							Static219.anIntArray286[local56] = 0x93000000 | 0xD20000 | local74;
							Static280.anIntArray392[local56] = local96 | 0xD30000;
							Static203.aByteArrayArrayArray7[Static367.anInt6860][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Static460.anInt7894 > local74 + 1 && local14 != Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 + 1][local96] && (Static429.aByteArrayArrayArray17[Static367.anInt6860][local74][local96] & 0x4) == 0 && (Static429.aByteArrayArrayArray17[Static367.anInt6860][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static219.anIntArray286[local56] = local74 + 1 | 0x920000 | 0xD2000000;
							Static280.anIntArray392[local56] = local96 | 0x930000;
							Static203.aByteArrayArrayArray7[Static367.anInt6860][local74 + 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static253.anIntArray659[arg4] != -1000000) {
				Static253.anIntArray659[arg4] += 10;
				Static30.anIntArray47[arg4] -= 50;
				Static223.anIntArray287[arg4] += 50;
				Static53.anIntArray154[arg4] += 50;
				Static254.anIntArray687[arg4] -= 50;
			}
			return true;
		}
	}
}
