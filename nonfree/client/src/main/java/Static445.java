import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!qv", name = "L", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_9 = new Class307(1, 2);

	@OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
	public static int anInt3933 = -1;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3382(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(3, arg1);
		local8.method491();
		local8.aString11 = arg0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!r;I)Z")
	public static boolean method3383(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1) {
		@Pc(11) int local11 = (Static500.anInt6888 - 104) / 2;
		@Pc(17) int local17 = (Static573.anInt9325 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static484.method6767(arg0, local25, local29, local21)) {
						local40 = local29;
						if (Static70.method1506(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static389.method5574(local25, local40, local21);
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
		Static243.aClass10_15 = arg1.method6429(local86, 512, 512, 512);
		Static170.method2601();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (-10 + (int) (Math.random() * 20.0D) + 238 << 8) + 238 - 10 | 0xFF000000;
		@Pc(157) int local157 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(181) int local181 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(189) boolean[][] local189 = new boolean[Static369.anInt6529 + 1][Static369.anInt6529 + 1];
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(226) int local226;
		@Pc(250) int local250;
		@Pc(254) int local254;
		@Pc(311) int local311;
		@Pc(318) int local318;
		@Pc(322) int local322;
		@Pc(341) int local341;
		for (@Pc(191) int local191 = local11; local191 < local11 + 104; local191 += Static369.anInt6529) {
			for (local195 = local17; local195 < local17 + 104; local195 += Static369.anInt6529) {
				local199 = 0;
				local201 = 0;
				local203 = local191;
				if (local191 > 0) {
					local203 = local191 - 1;
					local199 += 4;
				}
				local209 = local195;
				if (local195 > 0) {
					local209 = local195 - 1;
				}
				local216 = Static369.anInt6529 + local191;
				if (local216 < 104) {
					local216++;
				}
				local226 = Static369.anInt6529 + local195;
				if (local226 < 104) {
					local226++;
					local201 += 4;
				}
				arg1.da(0, 0, Static369.anInt6529 * 4 + local199, local201 + Static369.anInt6529 * 4);
				arg1.ja(-16777216);
				@Pc(258) int local258;
				for (local250 = arg0; local250 <= 3; local250++) {
					for (local254 = 0; local254 <= Static369.anInt6529; local254++) {
						for (local258 = 0; local258 <= Static369.anInt6529; local258++) {
							local189[local254][local258] = Static484.method6767(arg0, local258 + local209, local250, local254 + local203);
						}
					}
					Static158.aClass17Array2[local250].method6645(local203, local209, local216, local226, local189);
					if (!Static494.aBoolean599) {
						for (local258 = -4; local258 < Static369.anInt6529; local258++) {
							for (local311 = -4; local311 < Static369.anInt6529; local311++) {
								local318 = local191 + local258;
								local322 = local195 + local311;
								if (local11 <= local318 && local17 <= local322 && Static484.method6767(arg0, local322, local250, local318)) {
									local341 = local250;
									if (Static70.method1506(local322, local318)) {
										local341 = local250 - 1;
									}
									if (local341 >= 0) {
										Static501.method6971(local318, local40, local322, arg1, local341, local199 + local258 * 4, local201 + (Static369.anInt6529 - local311) * 4 + -4, local157);
									}
								}
							}
						}
					}
				}
				if (Static494.aBoolean599) {
					@Pc(393) Class94 local393 = Static28.aClass94Array2[arg0];
					for (local258 = 0; local258 < Static369.anInt6529; local258++) {
						for (local311 = 0; local311 < Static369.anInt6529; local311++) {
							local318 = local258 + local191;
							local322 = local311 + local195;
							local341 = local393.anIntArrayArray20[local318 - local393.anInt2619][local322 - local393.anInt2626];
							if ((local341 & 0x40240000) != 0) {
								arg1.method6418(4, local258 * 4 + local199, (-local311 + Static369.anInt6529) * 4 + -4 + local201, 4, -1713569622);
							} else if ((local341 & 0x800000) != 0) {
								arg1.method6443(local199 + local258 * 4, (Static369.anInt6529 - local311) * 4 + local201 - 4, -1713569622, 4);
							} else if ((local341 & 0x2000000) != 0) {
								arg1.method6447(4, -1713569622, local199 + local258 * 4 + 3, local201 - (-((Static369.anInt6529 - local311) * 4) - -4));
							} else if ((local341 & 0x8000000) != 0) {
								arg1.method6443(local258 * 4 + local199, 3 + -4 + local201 + (-local311 + Static369.anInt6529) * 4, -1713569622, 4);
							} else if ((local341 & 0x20000000) != 0) {
								arg1.method6447(4, -1713569622, local199 + local258 * 4, (-local311 + Static369.anInt6529) * 4 + (local201 - 4));
							}
						}
					}
				}
				arg1.J(local199, local201, Static369.anInt6529 * 4, Static369.anInt6529 * 4, local181, 2);
				Static243.aClass10_15.da((local191 - local11) * 4 + 48, -((-local17 + local195) * 4) + 464 + -(Static369.anInt6529 * 4), Static369.anInt6529 * 4, Static369.anInt6529 * 4, local199, local201);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static388.method5569();
		Static568.anInt9276 = 0;
		Static590.aClass361_102.method7860();
		if (!Static494.aBoolean599) {
			for (local195 = local11; local195 < local11 + 104; local195++) {
				for (local199 = local17; local199 < local17 + 104; local199++) {
					for (local201 = arg0; local201 <= arg0 + 1 && local201 <= 3; local201++) {
						if (Static484.method6767(arg0, local199, local201, local195)) {
							@Pc(670) Interface7 local670 = (Interface7) Static17.method507(local201, local195, local199);
							if (local670 == null) {
								local670 = (Interface7) Static18.method537(local201, local195, local199, ge.class);
							}
							if (local670 == null) {
								local670 = (Interface7) Static387.method5565(local201, local195, local199);
							}
							if (local670 == null) {
								local670 = (Interface7) Static89.method1752(local201, local195, local199);
							}
							if (local670 != null) {
								@Pc(711) Class306 local711 = Static146.aClass214_1.method4897(local670.method7276());
								if (!local711.aBoolean612 || Static33.aBoolean76) {
									local216 = local711.anInt8409;
									if (local711.anIntArray570 != null) {
										for (local226 = 0; local226 < local711.anIntArray570.length; local226++) {
											if (local711.anIntArray570[local226] != -1) {
												@Pc(740) Class306 local740 = Static146.aClass214_1.method4897(local711.anIntArray570[local226]);
												if (local740.anInt8409 >= 0) {
													local216 = local740.anInt8409;
												}
											}
										}
									}
									if (local216 >= 0) {
										@Pc(762) boolean local762 = false;
										if (local216 >= 0) {
											@Pc(769) Class196 local769 = Static299.aClass46_4.method1408(local216);
											if (local769 != null && local769.aBoolean394) {
												local762 = true;
											}
										}
										local250 = local195;
										local254 = local199;
										if (local762) {
											@Pc(787) int[][] local787 = Static28.aClass94Array2[local201].anIntArrayArray20;
											local311 = Static28.aClass94Array2[local201].anInt2619;
											local318 = Static28.aClass94Array2[local201].anInt2626;
											for (local322 = 0; local322 < 10; local322++) {
												local341 = (int) (Math.random() * 4.0D);
												if (local341 == 0 && local250 > local11 && local195 - 3 < local250 && (local787[local250 - local311 - 1][local254 - local318] & 0x2C0108) == 0) {
													local250--;
												}
												if (local341 == 1 && local11 + 104 - 1 > local250 && local195 + 3 > local250 && (local787[local250 + 1 - local311][local254 - local318] & 0x2C0180) == 0) {
													local250++;
												}
												if (local341 == 2 && local17 < local254 && local199 - 3 < local254 && (local787[local250 - local311][local254 - local318 - 1] & 0x2C0102) == 0) {
													local254--;
												}
												if (local341 == 3 && local17 + 103 > local254 && local199 + 3 > local254 && (local787[local250 - local311][local254 + 1 - local318] & 0x2C0120) == 0) {
													local254++;
												}
											}
										}
										Static1.anIntArray1[Static568.anInt9276] = local711.anInt8416;
										Static354.anIntArray415[Static568.anInt9276] = local250;
										Static439.anIntArray507[Static568.anInt9276] = local254;
										Static568.anInt9276++;
									}
								}
							}
						}
					}
				}
			}
			if (Static53.aClass236_1 != null) {
				Static333.aClass111_77.anInt2898 = 1;
				Static299.aClass46_4.method1405(64, 1024);
				for (local199 = 0; local199 < Static53.aClass236_1.anInt6600; local199++) {
					local201 = Static53.aClass236_1.anIntArray441[local199];
					if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 == local201 >> 28) {
						local203 = (local201 >> 14 & 0x3FFF) - Static376.anInt6631;
						local209 = (local201 & 0x3FFF) - Static24.anInt674;
						if (local203 >= 0 && Static500.anInt6888 > local203 && local209 >= 0 && local209 < Static573.anInt9325) {
							Static590.aClass361_102.method7855(new Class1_Sub32(local199));
						} else {
							@Pc(1062) Class196 local1062 = Static299.aClass46_4.method1408(Static53.aClass236_1.anIntArray443[local199]);
							if (local1062.anIntArray314 != null && local203 + local1062.anInt5156 >= 0 && Static500.anInt6888 > local203 + local1062.anInt5160 && local1062.anInt5162 + local209 >= 0 && local1062.anInt5152 + local209 < Static573.anInt9325) {
								Static590.aClass361_102.method7855(new Class1_Sub32(local199));
							}
						}
					}
				}
				Static299.aClass46_4.method1405(64, 128);
				Static333.aClass111_77.anInt2898 = 2;
				Static333.aClass111_77.method2454();
			}
		}
		return true;
	}
}
