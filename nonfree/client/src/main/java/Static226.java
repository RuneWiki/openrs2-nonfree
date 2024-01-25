import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hfa", name = "v", descriptor = "F")
	public static float aFloat202;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIII)I")
	public static int method8108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(21) int local21 = 128 - arg0;
		@Pc(35) int local35 = arg0 * (arg1 & 0x7F) + (arg2 & 0x7F) * local21 >> 7;
		@Pc(50) int local50 = local21 * (arg2 & 0x380) + (arg1 & 0x380) * arg0 >> 7;
		@Pc(64) int local64 = arg0 * (arg1 & 0xFC00) + (arg2 & 0xFC00) * local21 >> 7;
		return local35 & 0x7F | local50 & 0x380 | local64 & 0xFC00;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!ha;ZI)Z")
	public static boolean method8110(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static201.anInt3834 - 104) / 2;
		@Pc(17) int local17 = (Static626.anInt10238 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static658.method8808(arg1, local25, local21, local29)) {
						local40 = local29;
						if (Static599.method8200(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static4.method49(local40, local25, local21);
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
		Static359.aClass50_26 = arg0.method6952(512, 512, local86, 512);
		Static593.method8133();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10 | 0xFF000000;
		@Pc(154) int local154 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x3D12FF00) << 16;
		@Pc(178) int local178 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(188) boolean[][] local188 = new boolean[Static524.anInt8704 + 2 + 1][Static524.anInt8704 + 3];
		@Pc(194) int local194;
		@Pc(198) int local198;
		@Pc(200) int local200;
		@Pc(202) int local202;
		@Pc(208) int local208;
		@Pc(218) int local218;
		@Pc(228) int local228;
		@Pc(252) int local252;
		@Pc(256) int local256;
		@Pc(305) int local305;
		@Pc(311) int local311;
		@Pc(315) int local315;
		@Pc(334) int local334;
		for (@Pc(190) int local190 = local11; local190 < local11 + 104; local190 += Static524.anInt8704) {
			for (local194 = local17; local194 < local17 + 104; local194 += Static524.anInt8704) {
				local198 = 0;
				local200 = 0;
				local202 = local190;
				if (local190 > 0) {
					local202 = local190 - 1;
					local198 += 4;
				}
				local208 = local194;
				if (local194 > 0) {
					local208 = local194 - 1;
				}
				local218 = Static524.anInt8704 + local190;
				if (local218 < 104) {
					local218++;
				}
				local228 = local194 + Static524.anInt8704;
				if (local228 < 104) {
					local228++;
					local200 += 4;
				}
				arg0.KA(0, 0, Static524.anInt8704 * 4 + local198, local200 + Static524.anInt8704 * 4);
				arg0.GA(-16777216);
				@Pc(260) int local260;
				for (local252 = arg1; local252 <= 3; local252++) {
					for (local256 = 0; local256 <= Static524.anInt8704; local256++) {
						for (local260 = 0; local260 <= Static524.anInt8704; local260++) {
							local188[local256][local260] = Static658.method8808(arg1, local260 + local208, local256 + local202, local252);
						}
					}
					Static605.aClass109Array5[local252].method7700(local202, local208, local218, local228, local188);
					if (!Static536.aBoolean753) {
						for (local260 = -4; local260 < Static524.anInt8704; local260++) {
							for (local305 = -4; local305 < Static524.anInt8704; local305++) {
								local311 = local260 + local190;
								local315 = local305 + local194;
								if (local11 <= local311 && local315 >= local17 && Static658.method8808(arg1, local315, local311, local252)) {
									local334 = local252;
									if (Static599.method8200(local315, local311)) {
										local334 = local252 - 1;
									}
									if (local334 >= 0) {
										Static406.method5969(local154, local40, local311, local198 + local260 * 4, arg0, (Static524.anInt8704 - local305) * 4 + local200 - 4, local334, local315);
									}
								}
							}
						}
					}
				}
				if (Static536.aBoolean753) {
					@Pc(389) Class106 local389 = Static275.aClass106Array1[arg1];
					for (local260 = 0; local260 < Static524.anInt8704; local260++) {
						for (local305 = 0; local305 < Static524.anInt8704; local305++) {
							local311 = local260 + local190;
							local315 = local194 + local305;
							local334 = local389.anIntArrayArray8[local311 - local389.anInt3007][local315 - local389.anInt3006];
							if ((local334 & 0x40240000) != 0) {
								arg0.method6900(local260 * 4 + local198, (-local305 + Static524.anInt8704) * 4 + -4 + local200, 4, -1713569622, 4);
							} else if ((local334 & 0x800000) != 0) {
								arg0.method6948(4, local260 * 4 + local198, -1713569622, local200 + (Static524.anInt8704 - local305) * 4 - 4);
							} else if ((local334 & 0x2000000) != 0) {
								arg0.method6879((Static524.anInt8704 - local305) * 4 + local200 - 4, -1713569622, 4, local198 + local260 * 4 + 3);
							} else if ((local334 & 0x8000000) != 0) {
								arg0.method6948(4, local260 * 4 + local198, -1713569622, local200 + (Static524.anInt8704 - local305) * 4 + 3 - 4);
							} else if ((local334 & 0x20000000) != 0) {
								arg0.method6879((Static524.anInt8704 - local305) * 4 + local200 - 4, -1713569622, 4, local198 + local260 * 4);
							}
						}
					}
				}
				arg0.aa(local198, local200, Static524.anInt8704 * 4, Static524.anInt8704 * 4, local178, 2);
				Static359.aClass50_26.method5998((local190 - local11) * 4 + 48, -((-local17 + local194) * 4) + (464 - Static524.anInt8704 * 4), Static524.anInt8704 * 4, Static524.anInt8704 * 4, local198, local200);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static283.method4543();
		Static345.anInt6329 = 0;
		Static285.aClass114_38.method2808();
		if (!Static536.aBoolean753) {
			for (local194 = local11; local194 < local11 + 104; local194++) {
				for (local198 = local17; local198 < local17 + 104; local198++) {
					for (local200 = arg1; arg1 + 1 >= local200 && local200 <= 3; local200++) {
						if (Static658.method8808(arg1, local198, local194, local200)) {
							@Pc(670) Interface1 local670 = (Interface1) Static570.method7867(local200, local194, local198);
							if (local670 == null) {
								local670 = (Interface1) Static241.method3771(local200, local194, local198, aia.class);
							}
							if (local670 == null) {
								local670 = (Interface1) Static506.method7239(local200, local194, local198);
							}
							if (local670 == null) {
								local670 = (Interface1) Static9.method8812(local200, local194, local198);
							}
							if (local670 != null) {
								@Pc(711) Class164 local711 = Static568.aClass315_5.method7511(local670.method8986());
								if (!local711.aBoolean387 || Static530.aBoolean743) {
									local218 = local711.anInt4620;
									if (local711.anIntArray247 != null) {
										for (local228 = 0; local228 < local711.anIntArray247.length; local228++) {
											if (local711.anIntArray247[local228] != -1) {
												@Pc(740) Class164 local740 = Static568.aClass315_5.method7511(local711.anIntArray247[local228]);
												if (local740.anInt4620 >= 0) {
													local218 = local740.anInt4620;
												}
											}
										}
									}
									if (local218 >= 0) {
										@Pc(763) boolean local763 = false;
										if (local218 >= 0) {
											@Pc(770) Class103 local770 = Static49.aClass93_1.method2280(local218);
											if (local770 != null && local770.aBoolean237) {
												local763 = true;
											}
										}
										local252 = local194;
										local256 = local198;
										if (local763) {
											@Pc(788) int[][] local788 = Static275.aClass106Array1[local200].anIntArrayArray8;
											local305 = Static275.aClass106Array1[local200].anInt3007;
											local311 = Static275.aClass106Array1[local200].anInt3006;
											for (local315 = 0; local315 < 10; local315++) {
												local334 = (int) (Math.random() * 4.0D);
												if (local334 == 0 && local11 < local252 && local194 - 3 < local252 && (local788[local252 - local305 - 1][local256 - local311] & 0x2C0108) == 0) {
													local252--;
												}
												if (local334 == 1 && local11 + 104 - 1 > local252 && local252 < local194 + 3 && (local788[local252 + 1 - local305][local256 - local311] & 0x2C0180) == 0) {
													local252++;
												}
												if (local334 == 2 && local256 > local17 && local198 - 3 < local256 && (local788[local252 - local305][local256 - local311 - 1] & 0x2C0102) == 0) {
													local256--;
												}
												if (local334 == 3 && local256 < local17 + 104 - 1 && local198 + 3 > local256 && (local788[local252 - local305][local256 + 1 - local311] & 0x2C0120) == 0) {
													local256++;
												}
											}
										}
										Static278.anIntArray296[Static345.anInt6329] = local711.anInt4670;
										Static265.anIntArray262[Static345.anInt6329] = local252;
										Static297.anIntArray321[Static345.anInt6329] = local256;
										Static345.anInt6329++;
									}
								}
							}
						}
					}
				}
			}
			if (Static404.aClass116_3 != null) {
				Static111.aClass390_79.anInt10731 = 1;
				Static49.aClass93_1.method2279(1024, 64);
				for (local198 = 0; local198 < Static404.aClass116_3.anInt3317; local198++) {
					local200 = Static404.aClass116_3.anIntArray154[local198];
					if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 == local200 >> 28) {
						local202 = (local200 >> 14 & 0x3FFF) - Static153.anInt3147;
						local208 = (local200 & 0x3FFF) - Static201.anInt3839;
						if (local202 >= 0 && local202 < Static201.anInt3834 && local208 >= 0 && local208 < Static626.anInt10238) {
							Static285.aClass114_38.method2807(new Class5_Sub47(local198));
						} else {
							@Pc(1080) Class103 local1080 = Static49.aClass93_1.method2280(Static404.aClass116_3.anIntArray153[local198]);
							if (local1080.anIntArray105 != null && local1080.anInt2791 + local202 >= 0 && Static201.anInt3834 > local1080.anInt2794 + local202 && local208 + local1080.anInt2795 >= 0 && Static626.anInt10238 > local208 + local1080.anInt2799) {
								Static285.aClass114_38.method2807(new Class5_Sub47(local198));
							}
						}
					}
				}
				Static49.aClass93_1.method2279(128, 64);
				Static111.aClass390_79.anInt10731 = 2;
				Static111.aClass390_79.method8930();
			}
		}
		return true;
	}
}
