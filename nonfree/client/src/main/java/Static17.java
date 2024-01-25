import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "Lclient!sb;")
	public static Class301 aClass301_2;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
	public static int anInt866;

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
	public static int anInt869;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)Lclient!vg;")
	public static Class52 method804() {
		try {
			return (Class52) Class.forName("Class52_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILclient!ha;)Z")
	public static boolean method805(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(16) int local16 = (Static372.anInt7082 - 104) / 2;
		@Pc(22) int local22 = (Static218.anInt5023 - 104) / 2;
		@Pc(24) boolean local24 = true;
		@Pc(34) int local34;
		@Pc(47) int local47;
		for (@Pc(26) int local26 = local16; local26 < local16 + 104; local26++) {
			for (@Pc(30) int local30 = local22; local30 < local22 + 104; local30++) {
				for (local34 = arg0; local34 <= 3; local34++) {
					if (Static116.method2609(arg0, local34, local26, local30)) {
						local47 = local34;
						if (Static61.method1675(local30, local26)) {
							local47 = local34 - 1;
						}
						if (local47 >= 0) {
							local24 &= Static456.method6910(local47, local26, local30);
						}
					}
				}
			}
		}
		if (!local24) {
			return false;
		}
		@Pc(93) int[] local93 = new int[262144];
		for (local34 = 0; local34 < local93.length; local34++) {
			local93[local34] = -16777216;
		}
		Static405.aClass21_27 = arg1.method6132(512, local93, 512, 512);
		Static424.method6607();
		local47 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) - 10 + 238 << 16) + 238 - 10 | 0xFF000000;
		@Pc(169) int local169 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(188) int local188 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(200) boolean[][] local200 = new boolean[Static523.anInt9087 + 1 + 2][Static523.anInt9087 + 1 + 2];
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(212) int local212;
		@Pc(214) int local214;
		@Pc(223) int local223;
		@Pc(230) int local230;
		@Pc(240) int local240;
		@Pc(266) int local266;
		@Pc(270) int local270;
		@Pc(323) int local323;
		@Pc(329) int local329;
		@Pc(333) int local333;
		@Pc(352) int local352;
		for (@Pc(202) int local202 = local16; local202 < local16 + 104; local202 += Static523.anInt9087) {
			for (local206 = local22; local206 < local22 + 104; local206 += Static523.anInt9087) {
				local210 = 0;
				local212 = 0;
				local214 = local202;
				if (local202 > 0) {
					local214 = local202 - 1;
					local210 += 4;
				}
				local223 = local206;
				if (local206 > 0) {
					local223 = local206 - 1;
				}
				local230 = local202 + Static523.anInt9087;
				if (local230 < 104) {
					local230++;
				}
				local240 = local206 + Static523.anInt9087;
				if (local240 < 104) {
					local212 += 4;
					local240++;
				}
				arg1.KA(0, 0, Static523.anInt9087 * 4 + local210, Static523.anInt9087 * 4 + local212);
				arg1.GA(-16777216);
				@Pc(274) int local274;
				for (local266 = arg0; local266 <= 3; local266++) {
					for (local270 = 0; local270 <= Static523.anInt9087; local270++) {
						for (local274 = 0; local274 <= Static523.anInt9087; local274++) {
							local200[local270][local274] = Static116.method2609(arg0, local266, local270 + local214, local274 + local223);
						}
					}
					Static86.aClass86Array2[local266].method8079(local214, local223, local230, local240, local200);
					if (!Static195.aBoolean332) {
						for (local274 = -4; local274 < Static523.anInt9087; local274++) {
							for (local323 = -4; local323 < Static523.anInt9087; local323++) {
								local329 = local202 + local274;
								local333 = local323 + local206;
								if (local16 <= local329 && local22 <= local333 && Static116.method2609(arg0, local266, local329, local333)) {
									local352 = local266;
									if (Static61.method1675(local333, local329)) {
										local352 = local266 - 1;
									}
									if (local352 >= 0) {
										Static374.method4084((Static523.anInt9087 - local323) * 4 + local212 - 4, local210 + local274 * 4, local329, local169, local333, local352, arg1, local47);
									}
								}
							}
						}
					}
				}
				if (Static195.aBoolean332) {
					@Pc(412) Class48 local412 = Static204.aClass48Array1[arg0];
					for (local274 = 0; local274 < Static523.anInt9087; local274++) {
						for (local323 = 0; local323 < Static523.anInt9087; local323++) {
							local329 = local202 + local274;
							local333 = local323 + local206;
							local352 = local412.anIntArrayArray3[local329 - local412.anInt1884][local333 - local412.anInt1886];
							if ((local352 & 0x40240000) != 0) {
								arg1.method6114(-1713569622, local210 + local274 * 4, 4, local212 + (Static523.anInt9087 + -local323) * 4 - 4, 4);
							} else if ((local352 & 0x800000) != 0) {
								arg1.method6089(4, local274 * 4 + local210, local212 + ((-local323 + Static523.anInt9087) * 4 - 4), -1713569622);
							} else if ((local352 & 0x2000000) != 0) {
								arg1.method6116(local210 + local274 * 4 + 3, local212 + (Static523.anInt9087 + -local323) * 4 + -4, -1713569622, 4);
							} else if ((local352 & 0x8000000) != 0) {
								arg1.method6089(4, local210 + local274 * 4, (Static523.anInt9087 + -local323) * 4 + -4 + local212 + 3, -1713569622);
							} else if ((local352 & 0x20000000) != 0) {
								arg1.method6116(local274 * 4 + local210, (-local323 + Static523.anInt9087) * 4 + local212 + -4, -1713569622, 4);
							}
						}
					}
				}
				arg1.aa(local210, local212, Static523.anInt9087 * 4, Static523.anInt9087 * 4, local188, 2);
				Static405.aClass21_27.method5798((local202 - local16) * 4 + 48, -(Static523.anInt9087 * 4) + 464 + -((local206 + -local22) * 4), Static523.anInt9087 * 4, Static523.anInt9087 * 4, local210, local212);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static121.method2707();
		Static518.anInt9044 = 0;
		Static444.aClass43_52.method1431();
		if (!Static195.aBoolean332) {
			for (local206 = local16; local206 < local16 + 104; local206++) {
				for (local210 = local22; local210 < local22 + 104; local210++) {
					for (local212 = arg0; arg0 + 1 >= local212 && local212 <= 3; local212++) {
						if (Static116.method2609(arg0, local212, local206, local210)) {
							@Pc(704) Interface27 local704 = (Interface27) Static484.method7154(local212, local206, local210);
							if (local704 == null) {
								local704 = (Interface27) Static575.method7984(local212, local206, local210, wha.class);
							}
							if (local704 == null) {
								local704 = (Interface27) Static418.method6567(local212, local206, local210);
							}
							if (local704 == null) {
								local704 = (Interface27) Static408.method6467(local212, local206, local210);
							}
							if (local704 != null) {
								@Pc(745) Class352 local745 = Static437.aClass199_3.method5342(local704.method8342());
								if (!local745.aBoolean714 || Static565.aBoolean307) {
									local230 = local745.anInt10101;
									if (local745.anIntArray591 != null) {
										for (local240 = 0; local240 < local745.anIntArray591.length; local240++) {
											if (local745.anIntArray591[local240] != -1) {
												@Pc(775) Class352 local775 = Static437.aClass199_3.method5342(local745.anIntArray591[local240]);
												if (local775.anInt10101 >= 0) {
													local230 = local775.anInt10101;
												}
											}
										}
									}
									if (local230 >= 0) {
										@Pc(797) boolean local797 = false;
										if (local230 >= 0) {
											@Pc(804) Class17 local804 = Static612.aClass12_4.method136(local230);
											if (local804 != null && local804.aBoolean74) {
												local797 = true;
											}
										}
										local266 = local206;
										local270 = local210;
										if (local797) {
											@Pc(822) int[][] local822 = Static204.aClass48Array1[local212].anIntArrayArray3;
											local323 = Static204.aClass48Array1[local212].anInt1884;
											local329 = Static204.aClass48Array1[local212].anInt1886;
											for (local333 = 0; local333 < 10; local333++) {
												local352 = (int) (Math.random() * 4.0D);
												if (local352 == 0 && local266 > local16 && local206 - 3 < local266 && (local822[local266 - local323 - 1][local270 - local329] & 0x2C0108) == 0) {
													local266--;
												}
												if (local352 == 1 && local16 + 104 - 1 > local266 && local206 + 3 > local266 && (local822[local266 + 1 - local323][local270 - local329] & 0x2C0180) == 0) {
													local266++;
												}
												if (local352 == 2 && local270 > local22 && local270 > local210 - 3 && (local822[local266 - local323][local270 - local329 - 1] & 0x2C0102) == 0) {
													local270--;
												}
												if (local352 == 3 && local270 < local22 + 104 - 1 && local210 + 3 > local270 && (local822[local266 - local323][local270 + 1 - local329] & 0x2C0120) == 0) {
													local270++;
												}
											}
										}
										Static499.anIntArray493[Static518.anInt9044] = local745.anInt10077;
										Static340.anIntArray376[Static518.anInt9044] = local266;
										Static125.anIntArray372[Static518.anInt9044] = local270;
										Static518.anInt9044++;
									}
								}
							}
						}
					}
				}
			}
			if (Static246.aClass14_2 != null) {
				Static205.aClass237_57.anInt7642 = 1;
				Static612.aClass12_4.method138(64, 1024);
				for (local210 = 0; local210 < Static246.aClass14_2.anInt161; local210++) {
					local212 = Static246.aClass14_2.anIntArray12[local210];
					if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 == local212 >> 28) {
						local214 = (local212 >> 14 & 0x3FFF) - Static628.anInt10493;
						local223 = (local212 & 0x3FFF) - Static594.anInt10160;
						if (local214 >= 0 && Static372.anInt7082 > local214 && local223 >= 0 && local223 < Static218.anInt5023) {
							Static444.aClass43_52.method1424(new Class8_Sub17(local210));
						} else {
							@Pc(1125) Class17 local1125 = Static612.aClass12_4.method136(Static246.aClass14_2.anIntArray11[local210]);
							if (local1125.anIntArray17 != null && local1125.anInt784 + local214 >= 0 && Static372.anInt7082 > local214 + local1125.anInt786 && local1125.anInt793 + local223 >= 0 && local1125.anInt813 + local223 < Static218.anInt5023) {
								Static444.aClass43_52.method1424(new Class8_Sub17(local210));
							}
						}
					}
				}
				Static612.aClass12_4.method138(64, 128);
				Static205.aClass237_57.anInt7642 = 2;
				Static205.aClass237_57.method6325();
			}
		}
		return true;
	}
}
