import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!eu", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass12;

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method2565(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static271.anInt4910 - 104) / 2;
		@Pc(17) int local17 = (Static613.anInt9909 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(31) int local31;
		@Pc(44) int local44;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(27) int local27 = local17; local27 < local17 + 104; local27++) {
				for (local31 = arg1; local31 <= 3; local31++) {
					if (Static62.method1063(local31, arg1, local27, local21)) {
						local44 = local31;
						if (Static389.method1741(local27, local21)) {
							local44 = local31 - 1;
						}
						if (local44 >= 0) {
							local19 &= Static183.method3160(local44, local21, local27);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(107) int[] local107 = new int[262144];
		for (local31 = 0; local31 < local107.length; local31++) {
			local107[local31] = -16777216;
		}
		Static352.aClass155_16 = arg0.method8645(512, 512, local107, 512);
		Static674.method9144();
		local44 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(191) int local191 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(210) int local210 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(220) boolean[][] local220 = new boolean[Static603.anInt9708 + 2 + 1][Static603.anInt9708 + 3];
		@Pc(230) int local230;
		@Pc(236) int local236;
		@Pc(238) int local238;
		@Pc(240) int local240;
		@Pc(251) int local251;
		@Pc(263) int local263;
		@Pc(274) int local274;
		@Pc(300) int local300;
		@Pc(306) int local306;
		@Pc(371) int local371;
		@Pc(377) int local377;
		@Pc(381) int local381;
		@Pc(404) int local404;
		for (@Pc(222) int local222 = local11; local222 < local11 + 104; local222 += Static603.anInt9708) {
			for (local230 = local17; local230 < local17 + 104; local230 += Static603.anInt9708) {
				local236 = 0;
				local238 = 0;
				local240 = local222;
				if (local222 > 0) {
					local240 = local222 - 1;
					local236 += 4;
				}
				local251 = local230;
				if (local230 > 0) {
					local251 = local230 - 1;
				}
				local263 = local222 + Static603.anInt9708;
				if (local263 < 104) {
					local263++;
				}
				local274 = local230 + Static603.anInt9708;
				if (local274 < 104) {
					local274++;
					local238 += 4;
				}
				arg0.KA(0, 0, Static603.anInt9708 * 4 + local236, local238 + Static603.anInt9708 * 4);
				arg0.GA(-16777216);
				@Pc(312) int local312;
				for (local300 = arg1; local300 <= 3; local300++) {
					for (local306 = 0; local306 <= Static603.anInt9708; local306++) {
						for (local312 = 0; local312 <= Static603.anInt9708; local312++) {
							local220[local306][local312] = Static62.method1063(local300, arg1, local312 + local251, local240 + local306);
						}
					}
					Static668.aClass84Array4[local300].method7624(local240, local251, local263, local274, local220);
					if (!Static449.aBoolean497) {
						for (local312 = -4; local312 < Static603.anInt9708; local312++) {
							for (local371 = -4; local371 < Static603.anInt9708; local371++) {
								local377 = local312 + local222;
								local381 = local371 + local230;
								if (local11 <= local377 && local381 >= local17 && Static62.method1063(local300, arg1, local381, local377)) {
									local404 = local300;
									if (Static389.method1741(local381, local377)) {
										local404 = local300 - 1;
									}
									if (local404 >= 0) {
										Static313.method4819(local312 * 4 + local236, local377, local381, arg0, local404, (Static603.anInt9708 - local371) * 4 + local238 - 4, local191, local44);
									}
								}
							}
						}
					}
				}
				if (Static449.aBoolean497) {
					@Pc(474) Class169 local474 = Static553.aClass169Array1[arg1];
					for (local312 = 0; local312 < Static603.anInt9708; local312++) {
						for (local371 = 0; local371 < Static603.anInt9708; local371++) {
							local377 = local312 + local222;
							local381 = local371 + local230;
							local404 = local474.anIntArrayArray34[local377 - local474.anInt4219][local381 - local474.anInt4229];
							if ((local404 & 0x40240000) != 0) {
								arg0.method8644((Static603.anInt9708 - local371) * 4 + local238 - 4, -1713569622, 4, local236 + local312 * 4, 4);
							} else if ((local404 & 0x800000) != 0) {
								arg0.method8615(4, local236 + local312 * 4, local238 + (-local371 + Static603.anInt9708) * 4 - 4, -1713569622);
							} else if ((local404 & 0x2000000) != 0) {
								arg0.method8621(-1713569622, 4, local236 + local312 * 4 + 3, local238 - -((-local371 + Static603.anInt9708) * 4) - 4);
							} else if ((local404 & 0x8000000) != 0) {
								arg0.method8615(4, local312 * 4 + local236, (-local371 + Static603.anInt9708) * 4 + local238 - 1, -1713569622);
							} else if ((local404 & 0x20000000) != 0) {
								arg0.method8621(-1713569622, 4, local312 * 4 + local236, local238 - (-((Static603.anInt9708 + -local371) * 4) - -4));
							}
						}
					}
				}
				arg0.aa(local236, local238, Static603.anInt9708 * 4, Static603.anInt9708 * 4, local210, 2);
				Static352.aClass155_16.method7214((local222 - local11) * 4 + 48, 464 - ((local230 - local17) * 4 + Static603.anInt9708 * 4), Static603.anInt9708 * 4, Static603.anInt9708 * 4, local236, local238);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static352.method5188(-110);
		Static220.anInt3840 = 0;
		Static594.aClass20_62.method374();
		if (!Static449.aBoolean497) {
			for (local230 = local11; local230 < local11 + 104; local230++) {
				for (local236 = local17; local236 < local17 + 104; local236++) {
					for (local238 = arg1; local238 <= arg1 + 1 && local238 <= 3; local238++) {
						if (Static62.method1063(local238, arg1, local236, local230)) {
							@Pc(792) Interface9 local792 = (Interface9) Static254.method4181(local238, local230, local236);
							if (local792 == null) {
								local792 = (Interface9) Static367.method5340(local238, local230, local236, aClass12 == null ? (aClass12 = Class102.a("dp")) : aClass12);
							}
							if (local792 == null) {
								local792 = (Interface9) Static142.method6599(local238, local230, local236);
							}
							if (local792 == null) {
								local792 = (Interface9) Static427.method6188(local238, local230, local236);
							}
							if (local792 != null) {
								@Pc(838) Class354 local838 = Static528.aClass243_3.method5556(local792.method8364());
								if (!local838.aBoolean648 || Static504.aBoolean543) {
									local263 = local838.anInt9396;
									if (local838.anIntArray526 != null) {
										for (local274 = 0; local274 < local838.anIntArray526.length; local274++) {
											if (local838.anIntArray526[local274] != -1) {
												@Pc(872) Class354 local872 = Static528.aClass243_3.method5556(local838.anIntArray526[local274]);
												if (local872.anInt9396 >= 0) {
													local263 = local872.anInt9396;
												}
											}
										}
									}
									if (local263 >= 0) {
										@Pc(893) boolean local893 = false;
										if (local263 >= 0) {
											@Pc(905) Class313 local905 = Static583.aClass327_4.method7413(local263);
											if (local905 != null && local905.aBoolean549) {
												local893 = true;
											}
										}
										local300 = local230;
										local306 = local236;
										if (local893) {
											@Pc(925) int[][] local925 = Static553.aClass169Array1[local238].anIntArrayArray34;
											local371 = Static553.aClass169Array1[local238].anInt4219;
											local377 = Static553.aClass169Array1[local238].anInt4229;
											for (local381 = 0; local381 < 10; local381++) {
												local404 = (int) (Math.random() * 4.0D);
												if (local404 == 0 && local11 < local300 && local300 > local230 - 3 && (local925[local300 - local371 - 1][local306 - local377] & 0x2C0108) == 0) {
													local300--;
												}
												if (local404 == 1 && local300 < local11 + 104 - 1 && local300 < local230 + 3 && (local925[local300 + 1 - local371][local306 - local377] & 0x2C0180) == 0) {
													local300++;
												}
												if (local404 == 2 && local17 < local306 && local306 > local236 - 3 && (local925[local300 - local371][local306 - local377 - 1] & 0x2C0102) == 0) {
													local306--;
												}
												if (local404 == 3 && local306 < local17 + 104 - 1 && local306 < local236 + 3 && (local925[local300 - local371][local306 + 1 - local377] & 0x2C0120) == 0) {
													local306++;
												}
											}
										}
										Static363.anIntArray344[Static220.anInt3840] = local838.anInt9392;
										Static526.anIntArray479[Static220.anInt3840] = local300;
										Static88.anIntArray76[Static220.anInt3840] = local306;
										Static220.anInt3840++;
									}
								}
							}
						}
					}
				}
			}
			if (Static311.aClass396_3 != null) {
				Static455.aClass126_208.anInt3317 = 1;
				Static583.aClass327_4.method7415(64, 1024);
				for (local236 = 0; local236 < Static311.aClass396_3.anInt10843; local236++) {
					local238 = Static311.aClass396_3.anIntArray622[local236];
					if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 == local238 >> 28) {
						local240 = (local238 >> 14 & 0x3FFF) - Static315.anInt5380;
						local251 = (local238 & 0x3FFF) - Static290.anInt5128;
						if (local240 >= 0 && Static271.anInt4910 > local240 && local251 >= 0 && local251 < Static613.anInt9909) {
							Static594.aClass20_62.method370(new Class5_Sub43(local236));
						} else {
							@Pc(1270) Class313 local1270 = Static583.aClass327_4.method7413(Static311.aClass396_3.anIntArray621[local236]);
							if (local1270.anIntArray472 != null && local1270.anInt8200 + local240 >= 0 && Static271.anInt4910 > local1270.anInt8201 + local240 && local251 + local1270.anInt8197 >= 0 && local251 + local1270.anInt8171 < Static613.anInt9909) {
								Static594.aClass20_62.method370(new Class5_Sub43(local236));
							}
						}
					}
				}
				Static583.aClass327_4.method7415(64, 128);
				Static455.aClass126_208.anInt3317 = 2;
				Static455.aClass126_208.method3090();
			}
		}
		return true;
	}
}
