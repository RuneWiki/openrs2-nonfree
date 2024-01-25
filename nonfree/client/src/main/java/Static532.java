import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	public static int anInt8558;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!nd;III)Lclient!lga;")
	public static Class212 method7368(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5567(0, arg1);
		return local9 == null ? null : new Class212(local9);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!ha;)Z")
	public static boolean method7369(@OriginalArg(0) int arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(11) int local11 = (Static456.anInt7428 - 104) / 2;
		@Pc(17) int local17 = (Static5.anInt112 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static168.method2928(local29, local21, local25, arg0)) {
						local40 = local29;
						if (Static481.method6813(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static456.method6483(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(92) int[] local92 = new int[262144];
		for (local29 = 0; local29 < local92.length; local29++) {
			local92[local29] = -16777216;
		}
		Static196.aClass31_9 = arg1.method8088(512, 512, local92, 512);
		Static577.method8014();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 228 | 0xFF000000;
		@Pc(160) int local160 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(188) int local188 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(200) boolean[][] local200 = new boolean[Static512.anInt10123 + 2 + 1][Static512.anInt10123 + 1 + 2];
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(212) int local212;
		@Pc(214) int local214;
		@Pc(220) int local220;
		@Pc(227) int local227;
		@Pc(235) int local235;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(318) int local318;
		@Pc(324) int local324;
		@Pc(329) int local329;
		@Pc(350) int local350;
		for (@Pc(202) int local202 = local11; local202 < local11 + 104; local202 += Static512.anInt10123) {
			for (local206 = local17; local206 < local17 + 104; local206 += Static512.anInt10123) {
				local210 = 0;
				local212 = 0;
				local214 = local202;
				if (local202 > 0) {
					local210 += 4;
					local214 = local202 - 1;
				}
				local220 = local206;
				if (local206 > 0) {
					local220 = local206 - 1;
				}
				local227 = Static512.anInt10123 + local202;
				if (local227 < 104) {
					local227++;
				}
				local235 = Static512.anInt10123 + local206;
				if (local235 < 104) {
					local235++;
					local212 += 4;
				}
				arg1.KA(0, 0, local210 + Static512.anInt10123 * 4, Static512.anInt10123 * 4 + local212);
				arg1.GA(-16777216);
				@Pc(268) int local268;
				for (local260 = arg0; local260 <= 3; local260++) {
					for (local264 = 0; local264 <= Static512.anInt10123; local264++) {
						for (local268 = 0; local268 <= Static512.anInt10123; local268++) {
							local200[local264][local268] = Static168.method2928(local260, local214 + local264, local268 + local220, arg0);
						}
					}
					Static124.aClass91Array1[local260].method7456(local214, local220, local227, local235, local200);
					if (!Static644.aBoolean756) {
						for (local268 = -4; local268 < Static512.anInt10123; local268++) {
							for (local318 = -4; local318 < Static512.anInt10123; local318++) {
								local324 = local268 + local202;
								local329 = local206 + local318;
								if (local324 >= local11 && local17 <= local329 && Static168.method2928(local260, local324, local329, arg0)) {
									local350 = local260;
									if (Static481.method6813(local329, local324)) {
										local350 = local260 - 1;
									}
									if (local350 >= 0) {
										Static562.method7872(local350, local40, local160, local329, local324, arg1, local212 + (Static512.anInt10123 - local318) * 4 - 4, local268 * 4 + local210);
									}
								}
							}
						}
					}
				}
				if (Static644.aBoolean756) {
					@Pc(402) Class175 local402 = Static520.aClass175Array1[arg0];
					for (local268 = 0; local268 < Static512.anInt10123; local268++) {
						for (local318 = 0; local318 < Static512.anInt10123; local318++) {
							local324 = local268 + local202;
							local329 = local318 + local206;
							local350 = local402.anIntArrayArray48[local324 - local402.anInt4875][local329 - local402.anInt4866];
							if ((local350 & 0x40240000) != 0) {
								arg1.method8164(-1713569622, 4, local210 + local268 * 4, 4, (Static512.anInt10123 - local318) * 4 + local212 - 4);
							} else if ((local350 & 0x800000) != 0) {
								arg1.method8091(local212 + (Static512.anInt10123 - local318) * 4 - 4, local210 - -(local268 * 4), 4, -1713569622);
							} else if ((local350 & 0x2000000) != 0) {
								arg1.method8092(4, local210 + local268 * 4 + 3, -1713569622, local212 + (Static512.anInt10123 - local318) * 4 - 4);
							} else if ((local350 & 0x8000000) != 0) {
								arg1.method8091((Static512.anInt10123 - local318) * 4 + local212 - 1, local210 - -(local268 * 4), 4, -1713569622);
							} else if ((local350 & 0x20000000) != 0) {
								arg1.method8092(4, local268 * 4 + local210, -1713569622, local212 + (Static512.anInt10123 - local318) * 4 - 4);
							}
						}
					}
				}
				arg1.aa(local210, local212, Static512.anInt10123 * 4, Static512.anInt10123 * 4, local188, 2);
				Static196.aClass31_9.method8802((local202 - local11) * 4 + 48, -(Static512.anInt10123 * 4) + -((local206 + -local17) * 4) + 464, Static512.anInt10123 * 4, Static512.anInt10123 * 4, local210, local212);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static569.method7932();
		Static641.anInt10385 = 0;
		Static200.aClass114_21.method2768();
		if (!Static644.aBoolean756) {
			for (local206 = local11; local206 < local11 + 104; local206++) {
				for (local210 = local17; local210 < local17 + 104; local210++) {
					for (local212 = arg0; arg0 + 1 >= local212 && local212 <= 3; local212++) {
						if (Static168.method2928(local212, local206, local210, arg0)) {
							@Pc(692) Interface25 local692 = (Interface25) Static366.method5446(local212, local206, local210);
							if (local692 == null) {
								local692 = (Interface25) Static22.method567(local212, local206, local210, rca.class);
							}
							if (local692 == null) {
								local692 = (Interface25) Static587.method8331(local212, local206, local210);
							}
							if (local692 == null) {
								local692 = (Interface25) Static212.method3540(local212, local206, local210);
							}
							if (local692 != null) {
								@Pc(733) Class5 local733 = Static79.aClass304_2.method6956(local692.method6207());
								if (!local733.aBoolean12 || Static158.aBoolean257) {
									local227 = local733.anInt78;
									if (local733.anIntArray9 != null) {
										for (local235 = 0; local235 < local733.anIntArray9.length; local235++) {
											if (local733.anIntArray9[local235] != -1) {
												@Pc(762) Class5 local762 = Static79.aClass304_2.method6956(local733.anIntArray9[local235]);
												if (local762.anInt78 >= 0) {
													local227 = local762.anInt78;
												}
											}
										}
									}
									if (local227 >= 0) {
										@Pc(785) boolean local785 = false;
										if (local227 >= 0) {
											@Pc(792) Class353 local792 = Static240.aClass336_5.method7855(local227);
											if (local792 != null && local792.aBoolean711) {
												local785 = true;
											}
										}
										local260 = local206;
										local264 = local210;
										if (local785) {
											@Pc(810) int[][] local810 = Static520.aClass175Array1[local212].anIntArrayArray48;
											local318 = Static520.aClass175Array1[local212].anInt4875;
											local324 = Static520.aClass175Array1[local212].anInt4866;
											for (local329 = 0; local329 < 10; local329++) {
												local350 = (int) (Math.random() * 4.0D);
												if (local350 == 0 && local260 > local11 && local206 - 3 < local260 && (local810[local260 - local318 - 1][local264 - local324] & 0x2C0108) == 0) {
													local260--;
												}
												if (local350 == 1 && local260 < local11 + 104 - 1 && local260 < local206 + 3 && (local810[local260 + 1 - local318][local264 - local324] & 0x2C0180) == 0) {
													local260++;
												}
												if (local350 == 2 && local264 > local17 && local264 > local210 - 3 && (local810[local260 - local318][local264 - local324 - 1] & 0x2C0102) == 0) {
													local264--;
												}
												if (local350 == 3 && local17 + 104 - 1 > local264 && local210 + 3 > local264 && (local810[local260 - local318][local264 + 1 - local324] & 0x2C0120) == 0) {
													local264++;
												}
											}
										}
										Static169.anIntArray224[Static641.anInt10385] = local733.anInt106;
										Static585.anIntArray686[Static641.anInt10385] = local260;
										Static559.anIntArray664[Static641.anInt10385] = local264;
										Static641.anInt10385++;
									}
								}
							}
						}
					}
				}
			}
			if (Static223.aClass129_3 != null) {
				Static215.aClass238_103.anInt6471 = 1;
				Static240.aClass336_5.method7850(64, 1024);
				for (local210 = 0; local210 < Static223.aClass129_3.anInt3588; local210++) {
					local212 = Static223.aClass129_3.anIntArray232[local210];
					if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 == local212 >> 28) {
						local214 = (local212 >> 14 & 0x3FFF) - Static406.anInt6899;
						local220 = (local212 & 0x3FFF) - Static338.anInt5885;
						if (local214 >= 0 && local214 < Static456.anInt7428 && local220 >= 0 && local220 < Static5.anInt112) {
							Static200.aClass114_21.method2771(new Class2_Sub41(local210));
						} else {
							@Pc(1096) Class353 local1096 = Static240.aClass336_5.method7855(Static223.aClass129_3.anIntArray233[local210]);
							if (local1096.anIntArray691 != null && local214 + local1096.anInt9824 >= 0 && local1096.anInt9790 + local214 < Static456.anInt7428 && local1096.anInt9793 + local220 >= 0 && Static5.anInt112 > local220 + local1096.anInt9806) {
								Static200.aClass114_21.method2771(new Class2_Sub41(local210));
							}
						}
					}
				}
				Static240.aClass336_5.method7850(64, 128);
				Static215.aClass238_103.anInt6471 = 2;
				Static215.aClass238_103.method5577();
			}
		}
		return true;
	}
}
