import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jf", name = "I", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_157 = new Class22(90, 12);

	@OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
	public static int anInt3532 = 0;

	@OriginalMember(owner = "client!jf", name = "K", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!ya;II)V")
	public static void method2920(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static422.anInt6948 == 0 || Static238.anInt4508 == 0) {
			return;
		}
		arg0.H(Static189.anInt3569, Static71.anInt6919, Static422.anInt6948, Static238.anInt4508);
		arg0.OA(Static290.anInt6409, Static260.anInt4896, Static422.anInt6948, Static238.anInt4508);
		@Pc(43) Class31 local43 = arg0.method4274();
		local43.s(Static43.anInt7321, Static210.anInt3926, Static95.anInt1909, Static185.anInt3534, Static27.anInt460, Static259.anInt4881);
		arg0.ea(local43);
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(101) int local101;
		@Pc(116) int[] local116;
		@Pc(147) int local147;
		@Pc(156) int local156;
		if (Static67.aClass65Array1 != null) {
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			@Pc(63) int local63 = arg0.a();
			local72 = local63 * (arg1 - Static189.anInt3569) / Static422.anInt6948;
			local81 = local63 * (arg2 - Static71.anInt6919) / Static238.anInt4508;
			local84 = arg0.YA();
			local93 = local84 * (arg1 - Static189.anInt3569) / Static422.anInt6948;
			local101 = local84 * (arg2 - Static71.anInt6919) / Static238.anInt4508;
			local116 = new int[] { local72, local81, local63 };
			local43.m(local116);
			@Pc(134) int[] local134 = new int[] { local93, local101, local84 };
			local43.m(local134);
			@Pc(139) float local139 = 0.0F;
			local147 = local134[0] - local116[0];
			local156 = local134[1] - local116[1];
			@Pc(165) int local165 = local134[2] - local116[2];
			while (local139 < 1.0F) {
				@Pc(178) int local178 = (int) ((float) local116[0] + local139 * (float) local147);
				@Pc(182) int local182 = local178 >> 7;
				@Pc(193) int local193 = (int) (local139 * (float) local165 + (float) local116[2]);
				@Pc(197) int local197 = local193 >> 7;
				if (local182 > 0 && local197 > 0 && Static326.anInt5666 > local182 && Static283.anInt5187 > local197) {
					@Pc(221) int local221 = Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82;
					if (local221 < 3 && (Static79.aByteArrayArrayArray2[1][local182][local197] & 0x2) != 0) {
						local221++;
					}
					if ((float) Static67.aClass65Array1[local221].a(local178, local193) < local139 * (float) local156 + (float) local116[1]) {
						local58 = (Static1.aClass16_Sub1_Sub5_Sub1_1.method4751() - 1 << 6) + local178 >> 7;
						local60 = (Static1.aClass16_Sub1_Sub5_Sub1_1.method4751() - 1 << 6) + local193 >> 7;
						break;
					}
				}
				local139 = (float) ((double) local139 + 0.01D);
			}
			if (local58 != -1 && local60 != -1) {
				if (Static341.aBoolean599 && (Static434.anInt7378 & 0x40) != 0) {
					@Pc(348) Class247 local348 = Static378.method3230(Static408.anInt6726, Static23.anInt350);
					if (local348 == null) {
						Static336.method5139();
					} else {
						Static380.method5017(19, false, 0L, local58, " ->", true, Static388.aString62, local60, -1, Static273.anInt5120);
					}
				} else {
					if (Static393.aClass121_3 == Static317.aClass121_2) {
						Static380.method5017(59, false, 0L, local58, "", true, Static218.aClass83_83.method2267(Static178.anInt3423), local60, -1, -1);
					}
					Static380.method5017(44, false, 0L, local58, "", true, Static167.aString35, local60, -1, Static220.anInt4097);
				}
			}
		}
		@Pc(368) Class84 local368 = Static18.aClass84_2;
		for (@Pc(373) Class3_Sub3 local373 = (Class3_Sub3) local368.method2312(); local373 != null; local373 = (Class3_Sub3) local368.method2309()) {
			if (local373.anInt2381 == Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 && local373.method2024(arg1, arg2, arg0)) {
				@Pc(503) int local503;
				if (local373.aClass16_1 instanceof Class16_Sub1_Sub5_Sub1) {
					@Pc(399) Class16_Sub1_Sub5_Sub1 local399 = (Class16_Sub1_Sub5_Sub1) local373.aClass16_1;
					local72 = local399.method4751();
					if ((local72 & 0x1) == 0 && (local399.anInt6893 & 0x7F) == 0 && (local399.anInt6892 & 0x7F) == 0 || (local72 & 0x1) == 1 && (local399.anInt6893 & 0x7F) == 64 && (local399.anInt6892 & 0x7F) == 64) {
						local81 = local399.anInt6893 - (local399.method4751() - 1 << 6);
						local84 = local399.anInt6892 - (local399.method4751() - 1 << 6);
						@Pc(515) int local515;
						for (local93 = 0; local93 < Static12.anInt163; local93++) {
							@Pc(480) Class16_Sub1_Sub5_Sub2 local480 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local93]];
							if (local480 != null && Static24.anInt5323 != local480.anInt6048 && local480.aBoolean561) {
								local503 = local480.anInt6893 - (local480.aClass264_1.anInt7201 - 1 << 6);
								local515 = local480.anInt6892 - (local480.aClass264_1.anInt7201 - 1 << 6);
								if (local503 >= local81 && local480.aClass264_1.anInt7201 <= local399.method4751() - (local503 - local81 >> 7) && local515 >= local84 && local480.aClass264_1.anInt7201 <= local399.method4751() - (local515 - local84 >> 7)) {
									Static325.method4396(local373.anInt2381 != Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, local480);
									local480.anInt6048 = Static24.anInt5323;
								}
							}
						}
						local101 = Static33.anInt606;
						local116 = Static99.anIntArray157;
						for (local515 = 0; local515 < local101; local515++) {
							@Pc(587) Class16_Sub1_Sub5_Sub1 local587 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local116[local515]];
							if (local587 != null && Static24.anInt5323 != local587.anInt6048 && local587 != local399 && local587.aBoolean561) {
								local147 = local587.anInt6893 - (local587.method4751() - 1 << 6);
								local156 = local587.anInt6892 - (local587.method4751() - 1 << 6);
								if (local147 >= local81 && local587.method4751() <= local399.method4751() - (local147 - local81 >> 7) && local84 <= local156 && local587.method4751() <= local399.method4751() - (local156 - local84 >> 7)) {
									Static377.method4026(local373.anInt2381 != Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, local587);
									local587.anInt6048 = Static24.anInt5323;
								}
							}
						}
					}
					if (Static24.anInt5323 == local399.anInt6048) {
						continue;
					}
					Static377.method4026(local373.anInt2381 != Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, local399);
					local399.anInt6048 = Static24.anInt5323;
				}
				if (local373.aClass16_1 instanceof Class16_Sub1_Sub5_Sub2) {
					@Pc(721) Class16_Sub1_Sub5_Sub2 local721 = (Class16_Sub1_Sub5_Sub2) local373.aClass16_1;
					if (local721.aClass264_1 != null) {
						if ((local721.aClass264_1.anInt7201 & 0x1) == 0 && (local721.anInt6893 & 0x7F) == 0 && (local721.anInt6892 & 0x7F) == 0 || (local721.aClass264_1.anInt7201 & 0x1) == 1 && (local721.anInt6893 & 0x7F) == 64 && (local721.anInt6892 & 0x7F) == 64) {
							local72 = local721.anInt6893 - (local721.aClass264_1.anInt7201 - 1 << 6);
							local81 = local721.anInt6892 - (local721.aClass264_1.anInt7201 - 1 << 6);
							for (local84 = 0; local84 < Static12.anInt163; local84++) {
								@Pc(798) Class16_Sub1_Sub5_Sub2 local798 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local84]];
								if (local798 != null && Static24.anInt5323 != local798.anInt6048 && local798 != local721 && local798.aBoolean561) {
									local101 = local798.anInt6893 - (local798.aClass264_1.anInt7201 - 1 << 6);
									local503 = local798.anInt6892 - (local798.aClass264_1.anInt7201 - 1 << 6);
									if (local101 >= local72 && local798.aClass264_1.anInt7201 <= local721.aClass264_1.anInt7201 - (local101 - local72 >> 7) && local81 <= local503 && local798.aClass264_1.anInt7201 <= local721.aClass264_1.anInt7201 - (local503 - local81 >> 7)) {
										Static325.method4396(Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 != local373.anInt2381, local798);
										local798.anInt6048 = Static24.anInt5323;
									}
								}
							}
							local93 = Static33.anInt606;
							@Pc(914) int[] local914 = Static99.anIntArray157;
							for (local503 = 0; local503 < local93; local503++) {
								@Pc(924) Class16_Sub1_Sub5_Sub1 local924 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local914[local503]];
								if (local924 != null && local924.anInt6048 != Static24.anInt5323 && local924.aBoolean561) {
									@Pc(946) int local946 = local924.anInt6893 - (local924.method4751() - 1 << 6);
									local147 = local924.anInt6892 - (local924.method4751() - 1 << 6);
									if (local946 >= local72 && local924.method4751() <= local721.aClass264_1.anInt7201 - (local946 - local72 >> 7) && local81 <= local147 && local924.method4751() <= local721.aClass264_1.anInt7201 - (local147 - local81 >> 7)) {
										Static377.method4026(local373.anInt2381 != Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, local924);
										local924.anInt6048 = Static24.anInt5323;
									}
								}
							}
						}
						if (local721.anInt6048 == Static24.anInt5323) {
							continue;
						}
						Static325.method4396(local373.anInt2381 != Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, local721);
						local721.anInt6048 = Static24.anInt5323;
					}
				}
				if (local373.aClass16_1 instanceof Class16_Sub3_Sub1) {
					@Pc(1063) Class4_Sub18 local1063 = (Class4_Sub18) Static440.aClass102_40.method2700((long) (local373.anInt2384 | local373.anInt2381 << 28 | local373.anInt2383 << 14));
					if (local1063 != null) {
						for (@Pc(1071) Class4_Sub45 local1071 = (Class4_Sub45) local1063.aClass183_14.method4139(); local1071 != null; local1071 = (Class4_Sub45) local1063.aClass183_14.method4145()) {
							@Pc(1081) Class211 local1081 = Static444.aClass206_3.method4703(local1071.anInt7355);
							if (!Static341.aBoolean599) {
								if (Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 == local373.anInt2381) {
									@Pc(1153) String[] local1153 = local1081.aStringArray34;
									for (local93 = 4; local93 >= 0; local93--) {
										if (local1153 != null && local1153[local93] != null) {
											@Pc(1165) byte local1165 = 0;
											local503 = Static207.anInt5453;
											if (local93 == 0) {
												local1165 = 49;
											}
											if (local93 == 1) {
												local1165 = 51;
											}
											if (local93 == 2) {
												local1165 = 16;
											}
											if (local93 == 3) {
												local1165 = 4;
											}
											if (local1081.anInt6124 == local93) {
												local503 = local1081.anInt6155;
											}
											if (local93 == 4) {
												local1165 = 2;
											}
											if (local1081.anInt6153 == local93) {
												local503 = local1081.anInt6127;
											}
											Static380.method5017(local1165, false, (long) local1071.anInt7355, local373.anInt2384, "<col=ff9040>" + local1081.aString61, true, local1153[local93], local373.anInt2383, -1, local503);
										}
									}
								}
								Static380.method5017(1009, Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 != local373.anInt2381, (long) local1071.anInt7355, local373.anInt2384, "<col=ff9040>" + local1081.aString61, true, Static21.aClass83_12.method2267(Static178.anInt3423), local373.anInt2383, -1, Static103.anInt2066);
							} else if (Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 == local373.anInt2381) {
								@Pc(1098) Class133 local1098 = Static7.anInt5460 == -1 ? null : Static153.aClass180_1.method4121(Static7.anInt5460);
								if ((Static434.anInt7378 & 0x1) != 0 && (local1098 == null || local1081.method4781(Static7.anInt5460, local1098.anInt4123) != local1098.anInt4123)) {
									Static380.method5017(6, false, (long) local1071.anInt7355, local373.anInt2384, Static49.aString28 + " -> <col=ff9040>" + local1081.aString61, true, Static388.aString62, local373.anInt2383, -1, Static273.anInt5120);
								}
							}
						}
					}
				}
				if (local373.aClass16_1 instanceof Interface6) {
					@Pc(1297) Interface6 local1297 = (Interface6) local373.aClass16_1;
					@Pc(1304) Class202 local1304 = Static267.aClass262_2.method5560(local1297.method5350());
					if (local1304.anIntArray407 != null) {
						local1304 = local1304.method4584(Static257.aClass114_1);
					}
					if (local1304 != null) {
						if (!Static341.aBoolean599) {
							if (local373.anInt2381 == Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82) {
								@Pc(1328) String[] local1328 = local1304.aStringArray28;
								if (local1328 != null) {
									for (local84 = 4; local84 >= 0; local84--) {
										if (local1328[local84] != null) {
											@Pc(1340) short local1340 = 0;
											local101 = Static207.anInt5453;
											if (local84 == 0) {
												local1340 = 18;
											}
											if (local84 == 1) {
												local1340 = 45;
											}
											if (local84 == 2) {
												local1340 = 23;
											}
											if (local84 == 3) {
												local1340 = 25;
											}
											if (local84 == 4) {
												local1340 = 1007;
											}
											if (local1304.anInt5820 == local84) {
												local101 = local1304.anInt5824;
											}
											if (local84 == local1304.anInt5837) {
												local101 = local1304.anInt5842;
											}
											Static380.method5017(local1340, false, Static346.method4675(local373.anInt2384, local1297, local373.anInt2383), local373.anInt2384, "<col=00ffff>" + local1304.aString59, true, local1328[local84], local373.anInt2383, -1, local101);
										}
									}
								}
							}
							Static380.method5017(1010, local373.anInt2381 != Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, (long) local1304.anInt5823, local373.anInt2384, "<col=00ffff>" + local1304.aString59, true, Static21.aClass83_12.method2267(Static178.anInt3423), local373.anInt2383, -1, Static103.anInt2066);
						} else if (Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 == local373.anInt2381) {
							@Pc(1485) Class133 local1485 = Static7.anInt5460 == -1 ? null : Static153.aClass180_1.method4121(Static7.anInt5460);
							if ((Static434.anInt7378 & 0x4) != 0 && (local1485 == null || local1304.method4585(Static7.anInt5460, local1485.anInt4123) != local1485.anInt4123)) {
								Static380.method5017(30, false, Static346.method4675(local373.anInt2384, local1297, local373.anInt2383), local373.anInt2384, Static49.aString28 + " -> <col=00ffff>" + local1304.aString59, true, Static388.aString62, local373.anInt2383, -1, Static273.anInt5120);
							}
						}
					}
				}
			}
		}
	}
}
