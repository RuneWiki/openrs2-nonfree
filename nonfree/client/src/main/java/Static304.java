import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "Lclient!jo;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
	public static int anInt6006 = 0;

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean414 = true;

	@OriginalMember(owner = "client!mda", name = "u", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V")
	public static void method4996() {
		for (@Pc(11) Class5_Sub32 local11 = (Class5_Sub32) Static433.aClass99_65.method2526(); local11 != null; local11 = (Class5_Sub32) Static433.aClass99_65.method2519()) {
			if (Static152.aClass37ArrayArrayArray1 == null) {
				local11.method7425();
			} else {
				@Pc(29) int local29;
				@Pc(42) Class15_Sub3 local42;
				@Pc(55) Class15_Sub3_Sub1 local55;
				@Pc(172) Class15_Sub5 local172;
				@Pc(130) Class15_Sub2 local130;
				@Pc(83) Class15_Sub1 local83;
				@Pc(185) Class15_Sub5_Sub3 local185;
				@Pc(96) Class15_Sub1_Sub1 local96;
				if (local11.anInt6217 <= Static481.anInt8318) {
					local29 = Static114.anIntArray215[local11.anInt6226];
					if (local29 == 0) {
						local42 = Static490.method6780(local11.anInt6227, local11.anInt6216, local11.anInt6219);
						if (local42 instanceof Class15_Sub3_Sub1) {
							Static335.method5242(local11.anInt6227, local11.anInt6216, local11.anInt6219);
							local55 = (Class15_Sub3_Sub1) local42;
							if (local55.aClass15_Sub3_1 != null) {
								Static241.method4094(local11.anInt6227, local11.anInt6216, local11.anInt6219, local55.aClass15_Sub3_1, null);
							}
						}
					} else if (local29 == 1) {
						local83 = Static475.method6634(local11.anInt6227, local11.anInt6216, local11.anInt6219);
						if (local83 instanceof Class15_Sub1_Sub1) {
							Static471.method6593(local11.anInt6227, local11.anInt6216, local11.anInt6219);
							local96 = (Class15_Sub1_Sub1) local83;
							if (local96.aClass15_Sub1_1 != null) {
								Static285.method4818(local11.anInt6227, local11.anInt6216, local11.anInt6219, local96.aClass15_Sub1_1, null);
							}
						}
					} else if (local29 == 2) {
						local130 = Static188.method3173(local11.anInt6227, local11.anInt6216, local11.anInt6219, p.class);
						if (local130 instanceof Class15_Sub2_Sub4) {
							Static4.method5497(local11.anInt6227, local11.anInt6216, local11.anInt6219, p.class);
							@Pc(151) Class15_Sub2_Sub4 local151 = (Class15_Sub2_Sub4) local130;
							if (local151.aClass15_Sub2_2 != null) {
								Static68.method1297(local151.aClass15_Sub2_2, false);
							}
						}
					} else if (local29 == 3) {
						local172 = Static469.method6581(local11.anInt6227, local11.anInt6216, local11.anInt6219);
						if (local172 instanceof Class15_Sub5_Sub3) {
							Static521.method7147(local11.anInt6227, local11.anInt6216, local11.anInt6219);
							local185 = (Class15_Sub5_Sub3) local172;
							if (local185.aClass15_Sub5_2 != null) {
								Static167.method2949(local11.anInt6227, local11.anInt6216, local11.anInt6219, local185.aClass15_Sub5_2);
							}
						}
					}
					local11.method7425();
				} else if (local11.anInt6221 == Static481.anInt8318) {
					local29 = Static114.anIntArray215[local11.anInt6226];
					if (local29 == 0) {
						local42 = Static490.method6780(local11.anInt6227, local11.anInt6216, local11.anInt6219);
						if (local42 instanceof Class15_Sub3_Sub1) {
							local11.method7425();
						} else if (Static523.method7170(local11.anInt6227, local11.anInt6216, local11.anInt6219) == null) {
							local55 = new Class15_Sub3_Sub1(local11.anInt6226, local11.anInt6214, local11.anInt6220, local11.anInt6222, local11.anInt6225, local42);
							Static241.method4094(local11.anInt6227, local11.anInt6216, local11.anInt6219, local55, null);
						} else {
							local11.method7425();
						}
					} else if (local29 == 1) {
						local83 = Static475.method6634(local11.anInt6227, local11.anInt6216, local11.anInt6219);
						if (local83 instanceof Class15_Sub1_Sub1) {
							local11.method7425();
						} else if (Static46.method1038(local11.anInt6227, local11.anInt6216, local11.anInt6219) == null) {
							local96 = new Class15_Sub1_Sub1(local11.anInt6226, local11.anInt6214, local11.anInt6220, local11.anInt6222, local11.anInt6225, local83);
							Static285.method4818(local11.anInt6227, local11.anInt6216, local11.anInt6219, local96, null);
						} else {
							local11.method7425();
						}
					} else if (local29 == 2) {
						local130 = Static188.method3173(local11.anInt6227, local11.anInt6216, local11.anInt6219, p.class);
						if (local130 instanceof Class15_Sub2_Sub4) {
							local11.method7425();
						} else {
							Static4.method5497(local11.anInt6227, local11.anInt6216, local11.anInt6219, p.class);
							@Pc(266) Class283 local266 = Static453.aClass88_3.method2294(local11.anInt6229);
							@Pc(282) int local282;
							@Pc(279) int local279;
							if (local11.anInt6214 == 1 || local11.anInt6214 == 3) {
								local279 = local266.anInt8184;
								local282 = local266.anInt8153;
							} else {
								local279 = local266.anInt8153;
								local282 = local266.anInt8184;
							}
							@Pc(323) Class15_Sub2_Sub4 local323 = new Class15_Sub2_Sub4(local11.anInt6226, local11.anInt6214, local11.anInt6227, local11.anInt6220, local11.anInt6222, local11.anInt6225, local11.anInt6216, local11.anInt6216 + local282 - 1, local11.anInt6219, local279 + local11.anInt6219 - 1, local130);
							Static68.method1297(local323, false);
						}
					} else if (local29 == 3) {
						local172 = Static469.method6581(local11.anInt6227, local11.anInt6216, local11.anInt6219);
						if (local172 instanceof Class15_Sub5_Sub3) {
							local11.method7425();
						} else {
							local185 = new Class15_Sub5_Sub3(local11.anInt6220, local11.anInt6222, local11.anInt6225, local172);
							Static167.method2949(local11.anInt6227, local11.anInt6216, local11.anInt6219, local185);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
	public static void method4997() {
		@Pc(9) int local9 = (int) ((double) Static460.anInt7894 * 34.46D);
		local9 <<= 0x0;
		if (Static110.aClass62_15.method7007()) {
			local9 += 128;
		}
		Static110.aClass62_15.ta(50, local9);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
	public static void method4998() {
		Static139.aClass220ArrayArray1 = new Class220[Static182.aClass117_100.method2972()][];
		Static424.aClass220ArrayArray2 = new Class220[Static182.aClass117_100.method2972()][];
		Static463.aBooleanArray33 = new boolean[Static182.aClass117_100.method2972()];
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!aj;I)V")
	public static void method4999(@OriginalArg(1) Class5_Sub3_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = arg0.method524(1) == 1;
		if (local22) {
			Static400.anIntArray557[Static457.anInt7876++] = arg1;
		}
		@Pc(37) int local37 = arg0.method524(2);
		@Pc(41) Class15_Sub2_Sub1_Sub1 local41 = Static10.aClass15_Sub2_Sub1_Sub1Array1[arg1];
		if (local37 != 0) {
			@Pc(153) int local153;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local37 == 1) {
				local153 = arg0.method524(3);
				local158 = local41.anIntArray306[0];
				local163 = local41.anIntArray307[0];
				if (local153 == 0) {
					local163--;
					local158--;
				} else if (local153 == 1) {
					local163--;
				} else if (local153 == 2) {
					local163--;
					local158++;
				} else if (local153 == 3) {
					local158--;
				} else if (local153 == 4) {
					local158++;
				} else if (local153 == 5) {
					local158--;
					local163++;
				} else if (local153 == 6) {
					local163++;
				} else if (local153 == 7) {
					local163++;
					local158++;
				}
				if (local22) {
					local41.aBoolean31 = true;
					local41.anInt840 = local163;
					local41.anInt846 = local158;
				} else {
					local41.method798(Static444.aByteArray110[arg1], local158, local163);
				}
			} else if (local37 == 2) {
				local153 = arg0.method524(4);
				local158 = local41.anIntArray306[0];
				local163 = local41.anIntArray307[0];
				if (local153 == 0) {
					local158 -= 2;
					local163 -= 2;
				} else if (local153 == 1) {
					local163 -= 2;
					local158--;
				} else if (local153 == 2) {
					local163 -= 2;
				} else if (local153 == 3) {
					local163 -= 2;
					local158++;
				} else if (local153 == 4) {
					local163 -= 2;
					local158 += 2;
				} else if (local153 == 5) {
					local163--;
					local158 -= 2;
				} else if (local153 == 6) {
					local163--;
					local158 += 2;
				} else if (local153 == 7) {
					local158 -= 2;
				} else if (local153 == 8) {
					local158 += 2;
				} else if (local153 == 9) {
					local158 -= 2;
					local163++;
				} else if (local153 == 10) {
					local163++;
					local158 += 2;
				} else if (local153 == 11) {
					local158 -= 2;
					local163 += 2;
				} else if (local153 == 12) {
					local163 += 2;
					local158--;
				} else if (local153 == 13) {
					local163 += 2;
				} else if (local153 == 14) {
					local163 += 2;
					local158++;
				} else if (local153 == 15) {
					local158 += 2;
					local163 += 2;
				}
				if (local22) {
					local41.aBoolean31 = true;
					local41.anInt846 = local158;
					local41.anInt840 = local163;
				} else {
					local41.method798(Static444.aByteArray110[arg1], local158, local163);
				}
			} else {
				local153 = arg0.method524(1);
				@Pc(435) int local435;
				@Pc(443) int local443;
				@Pc(454) int local454;
				@Pc(461) int local461;
				if (local153 == 0) {
					local158 = arg0.method524(12);
					local163 = local158 >> 10;
					local435 = local158 >> 5 & 0x1F;
					if (local435 > 15) {
						local435 -= 32;
					}
					local443 = local158 & 0x1F;
					if (local443 > 15) {
						local443 -= 32;
					}
					local454 = local435 + local41.anIntArray306[0];
					local461 = local443 + local41.anIntArray307[0];
					if (local22) {
						local41.aBoolean31 = true;
						local41.anInt840 = local461;
						local41.anInt846 = local454;
					} else {
						local41.method798(Static444.aByteArray110[arg1], local454, local461);
					}
					local41.aByte91 = (byte) (local163 + local41.aByte91 & 0x3);
					if (Static510.anInt8653 == arg1) {
						Static367.anInt6860 = local41.aByte91;
					}
				} else {
					local158 = arg0.method524(30);
					local163 = local158 >> 28;
					local435 = local158 >> 14 & 0x3FFF;
					local443 = local158 & 0x3FFF;
					local454 = (local435 + local41.anIntArray306[0] + Static515.anInt3214 & 0x3FFF) - Static515.anInt3214;
					local461 = (local41.anIntArray307[0] + Static338.anInt6353 + local443 & 0x3FFF) - Static338.anInt6353;
					if (local22) {
						local41.anInt846 = local454;
						local41.aBoolean31 = true;
						local41.anInt840 = local461;
					} else {
						local41.method798(Static444.aByteArray110[arg1], local454, local461);
					}
					local41.aByte91 = (byte) (local163 + local41.aByte91 & 0x3);
					if (Static510.anInt8653 == arg1) {
						Static367.anInt6860 = local41.aByte91;
					}
				}
			}
		} else if (local22) {
			local41.aBoolean31 = false;
		} else if (Static510.anInt8653 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(68) Class205 local68 = Static543.aClass205Array2[arg1] = new Class205();
			local68.anInt6255 = (Static338.anInt6353 + local41.anIntArray307[0] >> 6) + ((local41.aByte91 << 28) + (local41.anIntArray306[0] + Static515.anInt3214 >> 6 << 14));
			if (local41.anInt861 == -1) {
				local68.anInt6253 = local41.aClass257_7.method6126();
			} else {
				local68.anInt6253 = local41.anInt861;
			}
			local68.aBoolean427 = local41.aBoolean33;
			local68.anInt6254 = local41.anInt4720;
			if (local41.anInt855 > 0) {
				Static236.method4044(local41);
			}
			Static10.aClass15_Sub2_Sub1_Sub1Array1[arg1] = null;
			if (arg0.method524(1) != 0) {
				Static317.method5106(arg0, arg1);
			}
		}
	}
}
