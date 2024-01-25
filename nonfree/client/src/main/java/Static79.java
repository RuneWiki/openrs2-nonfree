import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!h;")
	public static final Class114 aClass114_45 = new Class114("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
	public static int anInt2106 = 13156520;

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "Z")
	public static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
	public static int anInt2108 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!qa;BI)Z")
	public static boolean method2001(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = (Static542.anInt9387 - 104) / 2;
		@Pc(15) int local15 = (Static36.anInt1324 - 104) / 2;
		@Pc(17) boolean local17 = true;
		@Pc(25) int local25;
		@Pc(35) int local35;
		for (@Pc(19) int local19 = local9; local19 < local9 + 104; local19++) {
			for (@Pc(22) int local22 = local15; local22 < local15 + 104; local22++) {
				for (local25 = arg1; local25 <= 3; local25++) {
					if (Static94.method2176(arg1, local22, local19, local25)) {
						local35 = local25;
						if (Static180.method3467(local19, local22)) {
							local35 = local25 - 1;
						}
						if (local35 >= 0) {
							local17 &= Static254.method4287(local22, local35, local19);
						}
					}
				}
			}
		}
		if (!local17) {
			return false;
		}
		@Pc(83) int[] local83 = new int[262144];
		for (local25 = 0; local25 < local83.length; local25++) {
			local83[local25] = -16777216;
		}
		Static352.aClass12_8 = arg0.method7641(local83, 512, 512, 512);
		Static516.method7362();
		local35 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10 | 0xFF000000;
		@Pc(146) int local146 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(170) int local170 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(178) boolean[][] local178 = new boolean[Static529.anInt8971 + 1][Static529.anInt8971 + 1];
		@Pc(183) int local183;
		@Pc(186) int local186;
		@Pc(188) int local188;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(206) int local206;
		@Pc(214) int local214;
		@Pc(240) int local240;
		@Pc(243) int local243;
		@Pc(297) int local297;
		@Pc(302) int local302;
		@Pc(306) int local306;
		@Pc(323) int local323;
		for (@Pc(180) int local180 = local9; local180 < local9 + 104; local180 += Static529.anInt8971) {
			for (local183 = local15; local183 < local15 + 104; local183 += Static529.anInt8971) {
				local186 = 0;
				local188 = 0;
				local190 = local180;
				if (local180 > 0) {
					local190 = local180 - 1;
					local186 += 4;
				}
				local196 = local183;
				if (local183 > 0) {
					local196 = local183 - 1;
				}
				local206 = local180 + Static529.anInt8971;
				if (local206 < 104) {
					local206++;
				}
				local214 = local183 + Static529.anInt8971;
				if (local214 < 104) {
					local214++;
					local188 += 4;
				}
				arg0.N(0, 0, local186 + Static529.anInt8971 * 4, local188 + Static529.anInt8971 * 4);
				arg0.Z(-16777216);
				@Pc(246) int local246;
				for (local240 = arg1; local240 <= 3; local240++) {
					for (local243 = 0; local243 <= Static529.anInt8971; local243++) {
						for (local246 = 0; local246 <= Static529.anInt8971; local246++) {
							local178[local243][local246] = Static94.method2176(arg1, local246 + local196, local243 + local190, local240);
						}
					}
					Static53.aClass10Array3[local240].method6337(local190, local196, local206, local214, local178);
					if (!Static22.aBoolean61) {
						for (local246 = -4; local246 < Static529.anInt8971; local246++) {
							for (local297 = -4; local297 < Static529.anInt8971; local297++) {
								local302 = local246 + local180;
								local306 = local297 + local183;
								if (local302 >= local9 && local306 >= local15 && Static94.method2176(arg1, local306, local302, local240)) {
									local323 = local240;
									if (Static180.method3467(local302, local306)) {
										local323 = local240 - 1;
									}
									if (local323 >= 0) {
										Static201.method3744(local323, arg0, local35, local188 + (Static529.anInt8971 - local297) * 4 - 4, local306, local186 + local246 * 4, local302, local146);
									}
								}
							}
						}
					}
				}
				if (Static22.aBoolean61) {
					@Pc(380) Class299 local380 = Static70.aClass299Array1[arg1];
					for (local246 = 0; local246 < Static529.anInt8971; local246++) {
						for (local297 = 0; local297 < Static529.anInt8971; local297++) {
							local302 = local180 + local246;
							local306 = local183 + local297;
							local323 = local380.anIntArrayArray84[local302 - local380.anInt8548][local306 - local380.anInt8569];
							if ((local323 & 0x40240000) != 0) {
								arg0.method7632(local186 + local246 * 4, -1713569622, 4, 4, local188 + (Static529.anInt8971 - local297) * 4 - 4);
							} else if ((local323 & 0x800000) != 0) {
								arg0.method7581(local186 + local246 * 4, 4, -1713569622, local188 + (Static529.anInt8971 - local297) * 4 - 4);
							} else if ((local323 & 0x2000000) != 0) {
								arg0.method7621(-1713569622, local246 * 4 + local186 + 3, 4, local188 + (Static529.anInt8971 - local297) * 4 - 4);
							} else if ((local323 & 0x8000000) != 0) {
								arg0.method7581(local186 + local246 * 4, 4, -1713569622, local188 + (Static529.anInt8971 - local297) * 4 + 3 - 4);
							} else if ((local323 & 0x20000000) != 0) {
								arg0.method7621(-1713569622, local246 * 4 + local186, 4, local188 + (Static529.anInt8971 - local297) * 4 - 4);
							}
						}
					}
				}
				arg0.f(local186, local188, Static529.anInt8971 * 4, Static529.anInt8971 * 4, local170, 2);
				Static352.aClass12_8.P((local180 - local9) * 4 + 48, -(Static529.anInt8971 * 4) + -((-local15 + local183) * 4) + 464, Static529.anInt8971 * 4, Static529.anInt8971 * 4, local186, local188);
			}
		}
		arg0.n();
		arg0.Z(-16777215);
		Static278.method4744();
		Static516.anInt8709 = 0;
		Static245.aClass38_37.method1417();
		if (!Static22.aBoolean61) {
			for (local183 = local9; local183 < local9 + 104; local183++) {
				for (local186 = local15; local186 < local15 + 104; local186++) {
					for (local188 = arg1; arg1 + 1 >= local188 && local188 <= 3; local188++) {
						if (Static94.method2176(arg1, local186, local183, local188)) {
							@Pc(660) Interface17 local660 = (Interface17) Static167.method3276(local188, local183, local186);
							if (local660 == null) {
								local660 = (Interface17) Static52.method1507(local188, local183, local186, Class1_Sub3.B == null ? (Class1_Sub3.B = Class1_Sub3.a("up")) : Class1_Sub3.B);
							}
							if (local660 == null) {
								local660 = (Interface17) Static503.method7224(local188, local183, local186);
							}
							if (local660 == null) {
								local660 = (Interface17) Static313.method5162(local188, local183, local186);
							}
							if (local660 != null) {
								@Pc(701) Class288 local701 = Static365.aClass194_6.method5084(local660.method7172());
								if (!local701.aBoolean572 || Static163.aBoolean222) {
									local206 = local701.anInt8346;
									if (local701.anIntArray650 != null) {
										for (local214 = 0; local214 < local701.anIntArray650.length; local214++) {
											if (local701.anIntArray650[local214] != -1) {
												@Pc(729) Class288 local729 = Static365.aClass194_6.method5084(local701.anIntArray650[local214]);
												if (local729.anInt8346 >= 0) {
													local206 = local729.anInt8346;
												}
											}
										}
									}
									if (local206 >= 0) {
										@Pc(749) boolean local749 = false;
										if (local206 >= 0) {
											@Pc(756) Class24 local756 = Static167.aClass250_4.method6143(local206);
											if (local756 != null && local756.aBoolean101) {
												local749 = true;
											}
										}
										local240 = local183;
										local243 = local186;
										if (local749) {
											@Pc(774) int[][] local774 = Static70.aClass299Array1[local188].anIntArrayArray84;
											local297 = Static70.aClass299Array1[local188].anInt8548;
											local302 = Static70.aClass299Array1[local188].anInt8569;
											for (local306 = 0; local306 < 10; local306++) {
												local323 = (int) (Math.random() * 4.0D);
												if (local323 == 0 && local240 > local9 && local240 > local183 - 3 && (local774[local240 - local297 - 1][local243 - local302] & 0x2C0108) == 0) {
													local240--;
												}
												if (local323 == 1 && local240 < local9 + 104 - 1 && local240 < local183 + 3 && (local774[local240 + 1 - local297][local243 - local302] & 0x2C0180) == 0) {
													local240++;
												}
												if (local323 == 2 && local243 > local15 && local243 > local186 - 3 && (local774[local240 - local297][local243 - local302 - 1] & 0x2C0102) == 0) {
													local243--;
												}
												if (local323 == 3 && local243 < local15 + 103 && local243 < local186 + 3 && (local774[local240 - local297][local243 + 1 - local302] & 0x2C0120) == 0) {
													local243++;
												}
											}
										}
										Static365.anIntArray769[Static516.anInt8709] = local701.anInt8333;
										Static59.anIntArray156[Static516.anInt8709] = local240;
										Static200.anIntArray323[Static516.anInt8709] = local243;
										Static516.anInt8709++;
									}
								}
							}
						}
					}
				}
			}
			if (Static161.aClass179_3 != null) {
				Static68.aClass160_17.anInt4800 = 1;
				Static167.aClass250_4.method6147(64, 1024);
				for (local186 = 0; local186 < Static161.aClass179_3.anInt5505; local186++) {
					local188 = Static161.aClass179_3.anIntArray392[local186];
					if (Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 == local188 >> 28) {
						local190 = (local188 >> 14 & 0x3FFF) - Static324.anInt6132;
						local196 = (local188 & 0x3FFF) - Static517.anInt8716;
						if (local190 >= 0 && local190 < Static542.anInt9387 && local196 >= 0 && local196 < Static36.anInt1324) {
							Static245.aClass38_37.method1426(new Class1_Sub33(local186));
						} else {
							@Pc(1046) Class24 local1046 = Static167.aClass250_4.method6143(Static161.aClass179_3.anIntArray393[local186]);
							if (local1046.anIntArray117 != null && local190 + local1046.anInt1174 >= 0 && local190 + local1046.anInt1161 < Static542.anInt9387 && local1046.anInt1156 + local196 >= 0 && local196 + local1046.anInt1162 < Static36.anInt1324) {
								Static245.aClass38_37.method1426(new Class1_Sub33(local186));
							}
						}
					}
				}
				Static167.aClass250_4.method6147(64, 128);
				Static68.aClass160_17.anInt4800 = 2;
				Static68.aClass160_17.method4201();
			}
		}
		return true;
	}
}
