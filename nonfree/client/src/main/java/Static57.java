import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
	public static int anInt1261;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "[I")
	public static int[] anIntArray84 = new int[100];

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[200];

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19 = new String[500];

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public static int anInt1262 = 20;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([Lclient!mf;Z[[[II)V")
	public static void method904(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(9) byte local9;
		if (arg1) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(17) int local17;
		@Pc(24) int local24;
		if (!arg1) {
			for (local17 = 0; local17 < 4; local17++) {
				for (local24 = 0; local24 < 104; local24++) {
					for (@Pc(31) int local31 = 0; local31 < 104; local31++) {
						if ((Static170.aByteArrayArrayArray9[local17][local24][local31] & 0x1) == 1) {
							@Pc(51) int local51 = local17;
							if ((Static170.aByteArrayArrayArray9[1][local24][local31] & 0x2) == 2) {
								local51 = local17 - 1;
							}
							if (local51 >= 0) {
								arg0[local51].method2541(local24, local31);
							}
						}
					}
				}
			}
			Static206.anInt4271 += (int) (Math.random() * 5.0D) - 2;
			Static218.anInt4484 += (int) (Math.random() * 5.0D) - 2;
			if (Static218.anInt4484 < -8) {
				Static218.anInt4484 = -8;
			}
			if (Static218.anInt4484 > 8) {
				Static218.anInt4484 = 8;
			}
			if (Static206.anInt4271 < -16) {
				Static206.anInt4271 = -16;
			}
			if (Static206.anInt4271 > 16) {
				Static206.anInt4271 = 16;
			}
		}
		local17 = Static218.anInt4484 >> 2 << 10;
		local24 = Static206.anInt4271 >> 1;
		@Pc(145) int[][] local145 = new int[104][104];
		@Pc(149) int[][] local149 = new int[104][104];
		@Pc(151) int local151;
		@Pc(168) int local168;
		@Pc(174) int local174;
		@Pc(176) int local176;
		@Pc(183) int local183;
		@Pc(324) int local324;
		@Pc(209) int local209;
		@Pc(230) int local230;
		@Pc(243) int local243;
		@Pc(249) int local249;
		@Pc(259) int local259;
		@Pc(255) int local255;
		for (local151 = 0; local151 < local9; local151++) {
			@Pc(162) byte[][] local162 = Static40.aByteArrayArrayArray1[local151];
			@Pc(308) int local308;
			@Pc(457) int local457;
			@Pc(463) int local463;
			@Pc(512) int local512;
			if (!Static116.aBoolean188) {
				local168 = (int) Math.sqrt(5100.0D);
				local174 = local168 * 768 >> 8;
				for (local176 = 1; local176 < 103; local176++) {
					for (local183 = 1; local183 < 103; local183++) {
						local209 = Static195.anIntArrayArrayArray7[local151][local183 + 1][local176] - Static195.anIntArrayArrayArray7[local151][local183 - 1][local176];
						local230 = Static195.anIntArrayArrayArray7[local151][local183][local176 + 1] - Static195.anIntArrayArrayArray7[local151][local183][local176 - 1];
						local243 = (int) Math.sqrt((double) (local230 * local230 + local209 * local209 + 65536));
						local249 = (local209 << 8) / local243;
						local255 = (local230 << 8) / local243;
						local259 = -65536 / local243;
						local308 = (local162[local183][local176] >> 1) + ((local162[local183][local176 - 1] >> 2) + (local162[local183 + 1][local176] >> 3) + (local162[local183 + -1][local176] >> 2) + (local162[local183][local176 + 1] >> 3));
						local324 = (local255 * -50 + local249 * -50 + local259 * -10) / local174 + 74;
						local149[local183][local176] = local324 - local308;
					}
				}
			} else if (Static76.aBoolean117) {
				for (local168 = 1; local168 < 103; local168++) {
					for (local174 = 1; local174 < 103; local174++) {
						local183 = (local162[local174][local168] >> 1) + (local162[local174][local168 + 1] >> 3) + (local162[local174 - 1][local168] >> 2) + (local162[local174 + 1][local168] >> 3) + (local162[local174][local168 - 1] >> 2);
						local149[local174][local168] = 74 - local183;
					}
				}
			} else {
				local168 = (int) Static233.aFloatArray20[0];
				local174 = (int) Static233.aFloatArray20[1];
				local176 = (int) Static233.aFloatArray20[2];
				local183 = (int) Math.sqrt((double) (local176 * local176 + local174 * local174 + local168 * local168));
				local324 = local183 * 1024 >> 8;
				for (local209 = 1; local209 < 103; local209++) {
					for (local230 = 1; local230 < 103; local230++) {
						local249 = Static195.anIntArrayArrayArray7[local151][local230 + 1][local209] - Static195.anIntArrayArrayArray7[local151][local230 - 1][local209];
						local259 = Static195.anIntArrayArrayArray7[local151][local230][local209 + 1] - Static195.anIntArrayArrayArray7[local151][local230][local209 - 1];
						local255 = (int) Math.sqrt((double) (local249 * local249 + local259 * local259 + 65536));
						local308 = (local249 << 8) / local255;
						local457 = -65536 / local255;
						local463 = (local259 << 8) / local255;
						local512 = (local162[local230 - 1][local209] >> 2) + (local162[local230 + 1][local209] >> 3) + (local162[local230][local209 + -1] >> 2) + (local162[local230][local209 + 1] >> 3) + (local162[local230][local209] >> 1);
						local243 = (local457 * local174 + local168 * local308 + local176 * local463) / local324 + 96;
						local149[local230][local209] = local243 - (int) ((float) local512 * 1.7F);
					}
				}
			}
			for (local168 = 0; local168 < 104; local168++) {
				Static183.anIntArray269[local168] = 0;
				Static21.anIntArray42[local168] = 0;
				Static42.anIntArray63[local168] = 0;
				Static153.anIntArray246[local168] = 0;
				Static4.anIntArray6[local168] = 0;
			}
			for (local168 = -5; local168 < 104; local168++) {
				for (local174 = 0; local174 < 104; local174++) {
					local176 = local168 + 5;
					@Pc(729) int local729;
					if (local176 < 104) {
						local183 = Static75.aByteArrayArrayArray4[local151][local176][local174] & 0xFF;
						if (local183 > 0) {
							@Pc(693) Class97 local693 = Static200.method3092(local183 - 1);
							Static183.anIntArray269[local174] += local693.anInt2802;
							Static21.anIntArray42[local174] += local693.anInt2803;
							Static42.anIntArray63[local174] += local693.anInt2806;
							Static153.anIntArray246[local174] += local693.anInt2804;
							local729 = Static4.anIntArray6[local174]++;
						}
					}
					local183 = local168 - 5;
					if (local183 >= 0) {
						local324 = Static75.aByteArrayArrayArray4[local151][local183][local174] & 0xFF;
						if (local324 > 0) {
							@Pc(757) Class97 local757 = Static200.method3092(local324 - 1);
							Static183.anIntArray269[local174] -= local757.anInt2802;
							Static21.anIntArray42[local174] -= local757.anInt2803;
							Static42.anIntArray63[local174] -= local757.anInt2806;
							Static153.anIntArray246[local174] -= local757.anInt2804;
							local729 = Static4.anIntArray6[local174]--;
						}
					}
				}
				if (local168 >= 0) {
					local174 = 0;
					local183 = 0;
					local324 = 0;
					local209 = 0;
					local176 = 0;
					for (local230 = -5; local230 < 104; local230++) {
						local243 = local230 + 5;
						local249 = local230 - 5;
						if (local243 < 104) {
							local183 += Static42.anIntArray63[local243];
							local176 += Static21.anIntArray42[local243];
							local174 += Static183.anIntArray269[local243];
							local324 += Static153.anIntArray246[local243];
							local209 += Static4.anIntArray6[local243];
						}
						if (local249 >= 0) {
							local176 -= Static21.anIntArray42[local249];
							local183 -= Static42.anIntArray63[local249];
							local174 -= Static183.anIntArray269[local249];
							local209 -= Static4.anIntArray6[local249];
							local324 -= Static153.anIntArray246[local249];
						}
						if (local230 >= 0 && local209 > 0) {
							local145[local168][local230] = Static17.method320(local176 / local209, local174 * 256 / local324, local183 / local209);
						}
					}
				}
			}
			for (local168 = 1; local168 < 103; local168++) {
				label762: for (local174 = 1; local174 < 103; local174++) {
					if (arg1 || Static158.method2553() || (Static170.aByteArrayArrayArray9[0][local168][local174] & 0x2) != 0 || (Static170.aByteArrayArrayArray9[local151][local168][local174] & 0x10) == 0 && Static137.method1331(local151, local174, local168) == Static253.anInt4999) {
						if (Static241.anInt4830 > local151) {
							Static241.anInt4830 = local151;
						}
						local176 = Static75.aByteArrayArrayArray4[local151][local168][local174] & 0xFF;
						local183 = Static147.aByteArrayArrayArray8[local151][local168][local174] & 0xFF;
						if (local176 > 0 || local183 > 0) {
							local324 = Static195.anIntArrayArrayArray7[local151][local168][local174];
							local209 = Static195.anIntArrayArrayArray7[local151][local168 + 1][local174];
							local230 = Static195.anIntArrayArrayArray7[local151][local168 + 1][local174 + 1];
							local243 = Static195.anIntArrayArrayArray7[local151][local168][local174 + 1];
							if (local151 > 0) {
								@Pc(1057) boolean local1057 = true;
								if (local176 == 0 && Static254.aByteArrayArrayArray15[local151][local168][local174] != 0) {
									local1057 = false;
								}
								if (local183 > 0 && !Static272.method4047(local183 - 1).aBoolean371) {
									local1057 = false;
								}
								if (local1057 && local324 == local209 && local230 == local324 && local243 == local324) {
									Static74.anIntArrayArrayArray3[local151][local168][local174] |= 0x4;
								}
							}
							if (local176 > 0) {
								local249 = local145[local168][local174];
								local255 = (local249 & 0x7F) + local24;
								if (local255 < 0) {
									local255 = 0;
								} else if (local255 > 127) {
									local255 = 127;
								}
								local308 = (local249 & 0x380) + (local249 + local17 & 0xFC00) + local255;
								local259 = Static96.anIntArray135[Static181.method2780(local308, 96)];
							} else {
								local249 = -1;
								local259 = 0;
							}
							local255 = local149[local168][local174];
							local463 = local149[local168][local174 + 1];
							local308 = local149[local168 + 1][local174];
							local457 = local149[local168 + 1][local174 + 1];
							if (local183 == 0) {
								Static246.method3669(local151, local168, local174, 0, 0, -1, local324, local209, local230, local243, Static181.method2780(local249, local255), Static181.method2780(local249, local308), Static181.method2780(local249, local457), Static181.method2780(local249, local463), 0, 0, 0, 0, local259, 0);
								if (Static116.aBoolean188 && local151 > 0 && local249 != -1 && Static200.method3092(local176 - 1).aBoolean232) {
									Static6.method49(0, 0, true, false, local168, local174, local324 - Static195.anIntArrayArrayArray7[0][local168][local174], -Static195.anIntArrayArrayArray7[0][local168 + 1][local174] + local209, local230 - Static195.anIntArrayArrayArray7[0][local168 + 1][local174 + 1], local243 + -Static195.anIntArrayArrayArray7[0][local168][local174 + 1]);
								}
								if (Static116.aBoolean188 && !arg1 && Static176.anIntArrayArray18 != null && local151 == 0) {
									for (local512 = local168 - 1; local512 <= local168 + 1; local512++) {
										for (@Pc(1344) int local1344 = local174 - 1; local1344 <= local174 + 1; local1344++) {
											if ((local512 != local168 || local1344 != local174) && local512 >= 0 && local512 < 104 && local1344 >= 0 && local1344 < 104) {
												@Pc(1378) int local1378 = Static147.aByteArrayArrayArray8[local151][local512][local1344] & 0xFF;
												if (local1378 != 0) {
													@Pc(1391) Class140 local1391 = Static272.method4047(local1378 - 1);
													if (local1391.anInt4598 != -1 && Static69.method1133(Static96.anInterface4_1.method1265(local1391.anInt4598))) {
														Static176.anIntArrayArray18[local168][local174] = local1391.anInt4595 + (local1391.anInt4603 << 24);
														continue label762;
													}
												}
											}
										}
									}
								}
							} else {
								local512 = Static254.aByteArrayArrayArray15[local151][local168][local174] + 1;
								@Pc(1444) byte local1444 = Static132.aByteArrayArrayArray6[local151][local168][local174];
								@Pc(1450) Class140 local1450 = Static272.method4047(local183 - 1);
								@Pc(1493) int local1493;
								@Pc(1502) int local1502;
								@Pc(1541) int local1541;
								if (Static116.aBoolean188 && !arg1 && Static176.anIntArrayArray18 != null && local151 == 0) {
									if (local1450.anInt4598 != -1 && Static69.method1133(Static96.anInterface4_1.method1265(local1450.anInt4598))) {
										Static176.anIntArrayArray18[local168][local174] = local1450.anInt4595 + (local1450.anInt4603 << 24);
									} else {
										label743: for (local1493 = local168 - 1; local1493 <= local168 + 1; local1493++) {
											for (local1502 = local174 - 1; local1502 <= local174 + 1; local1502++) {
												if ((local168 != local1493 || local1502 != local174) && local1493 >= 0 && local1493 < 104 && local1502 >= 0 && local1502 < 104) {
													local1541 = Static147.aByteArrayArrayArray8[local151][local1493][local1502] & 0xFF;
													if (local1541 != 0) {
														@Pc(1549) Class140 local1549 = Static272.method4047(local1541 - 1);
														if (local1549.anInt4598 != -1 && Static69.method1133(Static96.anInterface4_1.method1265(local1549.anInt4598))) {
															Static176.anIntArrayArray18[local168][local174] = (local1549.anInt4603 << 24) + local1549.anInt4595;
															break label743;
														}
													}
												}
											}
										}
									}
								}
								local1493 = local1450.anInt4598;
								if (local1493 >= 0 && !Static96.anInterface4_1.method1271(local1493)) {
									local1493 = -1;
								}
								@Pc(1665) int local1665;
								@Pc(1637) int local1637;
								if (local1493 >= 0) {
									local1502 = -1;
									local1541 = Static96.anIntArray135[Static264.method4229(Static96.anInterface4_1.method1259(local1493), 96)];
								} else if (local1450.anInt4601 == -1) {
									local1502 = -2;
									local1541 = 0;
								} else {
									local1502 = local1450.anInt4601;
									local1637 = (local1502 & 0x7F) + local24;
									if (local1637 < 0) {
										local1637 = 0;
									} else if (local1637 > 127) {
										local1637 = 127;
									}
									local1665 = (local17 + local1502 & 0xFC00) + (local1502 & 0x380) + local1637;
									local1541 = Static96.anIntArray135[Static264.method4229(local1665, 96)];
								}
								if (local1450.anInt4597 >= 0) {
									local1637 = local1450.anInt4597;
									local1665 = (local1637 & 0x7F) + local24;
									if (local1665 < 0) {
										local1665 = 0;
									} else if (local1665 > 127) {
										local1665 = 127;
									}
									@Pc(1712) int local1712 = local1665 + (local1637 & 0x380) + (local17 + local1637 & 0xFC00);
									local1541 = Static96.anIntArray135[Static264.method4229(local1712, 96)];
								}
								Static246.method3669(local151, local168, local174, local512, local1444, local1493, local324, local209, local230, local243, Static181.method2780(local249, local255), Static181.method2780(local249, local308), Static181.method2780(local249, local457), Static181.method2780(local249, local463), Static264.method4229(local1502, local255), Static264.method4229(local1502, local308), Static264.method4229(local1502, local457), Static264.method4229(local1502, local463), local259, local1541);
								if (Static116.aBoolean188 && local151 > 0) {
									Static6.method49(local512, local1444, local1502 == -2 || !local1450.aBoolean369, local249 == -1 || !Static200.method3092(local176 - 1).aBoolean232, local168, local174, local324 - Static195.anIntArrayArrayArray7[0][local168][local174], local209 + -Static195.anIntArrayArrayArray7[0][local168 + 1][local174], local230 - Static195.anIntArrayArrayArray7[0][local168 + 1][local174 + 1], local243 - Static195.anIntArrayArrayArray7[0][local168][local174 - -1]);
								}
							}
						}
					}
				}
			}
			if (Static116.aBoolean188) {
				@Pc(1859) float[][] local1859 = new float[105][105];
				@Pc(1863) float[][] local1863 = new float[105][105];
				@Pc(1867) float[][] local1867 = new float[105][105];
				@Pc(1871) int[][] local1871 = Static195.anIntArrayArrayArray7[local151];
				local324 = 1;
				while (true) {
					if (local324 > 103) {
						@Pc(1993) Class8_Sub29[] local1993;
						if (arg1) {
							local1993 = Static97.method1543(local151, Static75.aByteArrayArrayArray4[local151], local149, Static170.aByteArrayArrayArray9, arg2, local145, Static254.aByteArrayArrayArray15[local151], local1867, Static87.anIntArrayArrayArray5[0], Static195.anIntArrayArrayArray7[local151], Static176.anIntArrayArray18, Static147.aByteArrayArrayArray8[local151], local1863, local1859, Static132.aByteArrayArrayArray6[local151]);
							Static34.method538(local151, local1993);
							break;
						}
						local1993 = Static97.method1543(local151, Static75.aByteArrayArrayArray4[local151], local149, Static170.aByteArrayArrayArray9, arg2, local145, Static254.aByteArrayArrayArray15[local151], local1867, null, Static195.anIntArrayArrayArray7[local151], null, Static147.aByteArrayArrayArray8[local151], local1863, local1859, Static132.aByteArrayArrayArray6[local151]);
						@Pc(2051) Class8_Sub29[] local2051 = Static54.method867(Static147.aByteArrayArrayArray8[local151], Static254.aByteArrayArrayArray15[local151], Static170.aByteArrayArrayArray9, Static132.aByteArrayArrayArray6[local151], local1859, local149, local1867, Static75.aByteArrayArrayArray4[local151], local1863, local151, Static195.anIntArrayArrayArray7[local151]);
						@Pc(2058) Class8_Sub29[] local2058 = new Class8_Sub29[local1993.length + local2051.length];
						for (local243 = 0; local243 < local1993.length; local243++) {
							local2058[local243] = local1993[local243];
						}
						for (local243 = 0; local243 < local2051.length; local243++) {
							local2058[local243 + local1993.length] = local2051[local243];
						}
						Static34.method538(local151, local2058);
						method905(local1863, Static186.anInt3748, Static75.aByteArrayArrayArray4[local151], Static147.aByteArrayArrayArray8[local151], local1867, Static132.aByteArrayArrayArray6[local151], Static254.aByteArrayArrayArray15[local151], Static186.aClass28Array1, Static195.anIntArrayArrayArray7[local151], local151, local1859);
						break;
					}
					for (local209 = 1; local209 <= 103; local209++) {
						local243 = local1871[local209][local324 + 1] - local1871[local209][local324 - 1];
						local230 = local1871[local209 + 1][local324] - local1871[local209 - 1][local324];
						@Pc(1929) float local1929 = (float) Math.sqrt((double) (local230 * local230 + local243 * local243 + 65536));
						local1859[local209][local324] = (float) local230 / local1929;
						local1863[local209][local324] = -256.0F / local1929;
						local1867[local209][local324] = (float) local243 / local1929;
					}
					local324++;
				}
			}
			Static75.aByteArrayArrayArray4[local151] = null;
			Static147.aByteArrayArrayArray8[local151] = null;
			Static254.aByteArrayArrayArray15[local151] = null;
			Static132.aByteArrayArrayArray6[local151] = null;
			Static40.aByteArrayArrayArray1[local151] = null;
		}
		Static135.method2190();
		if (arg1) {
			return;
		}
		@Pc(2164) int local2164;
		for (local151 = 0; local151 < 104; local151++) {
			for (local2164 = 0; local2164 < 104; local2164++) {
				if ((Static170.aByteArrayArrayArray9[1][local151][local2164] & 0x2) == 2) {
					Static193.method3021(local151, local2164);
				}
			}
		}
		for (local151 = 0; local151 < 4; local151++) {
			for (local2164 = 0; local2164 <= 104; local2164++) {
				for (local168 = 0; local168 <= 104; local168++) {
					if ((Static74.anIntArrayArrayArray3[local151][local168][local2164] & 0x1) != 0) {
						local174 = local2164;
						local183 = local151;
						local176 = local2164;
						while (local174 > 0 && (Static74.anIntArrayArrayArray3[local151][local168][local174 - 1] & 0x1) != 0) {
							local174--;
						}
						local324 = local151;
						while (local176 < 104 && (Static74.anIntArrayArrayArray3[local151][local168][local176 + 1] & 0x1) != 0) {
							local176++;
						}
						label444: while (local183 > 0) {
							for (local209 = local174; local209 <= local176; local209++) {
								if ((Static74.anIntArrayArrayArray3[local183 - 1][local168][local209] & 0x1) == 0) {
									break label444;
								}
							}
							local183--;
						}
						label433: while (local324 < 3) {
							for (local209 = local174; local209 <= local176; local209++) {
								if ((Static74.anIntArrayArrayArray3[local324 + 1][local168][local209] & 0x1) == 0) {
									break label433;
								}
							}
							local324++;
						}
						local209 = (local176 + 1 - local174) * (local324 - (local183 + -1));
						if (local209 >= 8) {
							local243 = Static195.anIntArrayArrayArray7[local324][local168][local174] - 240;
							local249 = Static195.anIntArrayArrayArray7[local183][local168][local174];
							Static58.method1732(1, local168 * 128, local168 * 128, local174 * 128, local176 * 128 + 128, local243, local249);
							for (local259 = local183; local259 <= local324; local259++) {
								for (local255 = local174; local255 <= local176; local255++) {
									Static74.anIntArrayArrayArray3[local259][local168][local255] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static74.anIntArrayArrayArray3[local151][local168][local2164] & 0x2) != 0) {
						local176 = local168;
						local174 = local168;
						while (local176 < 104 && (Static74.anIntArrayArrayArray3[local151][local176 + 1][local2164] & 0x2) != 0) {
							local176++;
						}
						local324 = local151;
						while (local174 > 0 && (Static74.anIntArrayArrayArray3[local151][local174 - 1][local2164] & 0x2) != 0) {
							local174--;
						}
						label498: for (local183 = local151; local183 > 0; local183--) {
							for (local209 = local174; local209 <= local176; local209++) {
								if ((Static74.anIntArrayArrayArray3[local183 - 1][local209][local2164] & 0x2) == 0) {
									break label498;
								}
							}
						}
						label487: while (local324 < 3) {
							for (local209 = local174; local209 <= local176; local209++) {
								if ((Static74.anIntArrayArrayArray3[local324 + 1][local209][local2164] & 0x2) == 0) {
									break label487;
								}
							}
							local324++;
						}
						local209 = (local176 + 1 - local174) * (-local183 + local324 + 1);
						if (local209 >= 8) {
							local243 = Static195.anIntArrayArrayArray7[local324][local174][local2164] - 240;
							local249 = Static195.anIntArrayArrayArray7[local183][local174][local2164];
							Static58.method1732(2, local174 * 128, local176 * 128 + 128, local2164 * 128, local2164 * 128, local243, local249);
							for (local259 = local183; local259 <= local324; local259++) {
								for (local255 = local174; local255 <= local176; local255++) {
									Static74.anIntArrayArrayArray3[local259][local255][local2164] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static74.anIntArrayArrayArray3[local151][local168][local2164] & 0x4) != 0) {
						local174 = local168;
						local176 = local168;
						for (local183 = local2164; local183 > 0 && (Static74.anIntArrayArrayArray3[local151][local168][local183 - 1] & 0x4) != 0; local183--) {
						}
						for (local324 = local2164; local324 < 104 && (Static74.anIntArrayArrayArray3[local151][local168][local324 + 1] & 0x4) != 0; local324++) {
						}
						label553: while (local174 > 0) {
							for (local209 = local183; local209 <= local324; local209++) {
								if ((Static74.anIntArrayArrayArray3[local151][local174 - 1][local209] & 0x4) == 0) {
									break label553;
								}
							}
							local174--;
						}
						label542: while (local176 < 104) {
							for (local209 = local183; local209 <= local324; local209++) {
								if ((Static74.anIntArrayArrayArray3[local151][local176 + 1][local209] & 0x4) == 0) {
									break label542;
								}
							}
							local176++;
						}
						if ((local324 + 1 - local183) * (local176 + -local174 + 1) >= 4) {
							local209 = Static195.anIntArrayArrayArray7[local151][local174][local183];
							Static58.method1732(4, local174 * 128, local176 * 128 + 128, local183 * 128, local324 * 128 + 128, local209, local209);
							for (local230 = local174; local230 <= local176; local230++) {
								for (local243 = local183; local243 <= local324; local243++) {
									Static74.anIntArrayArrayArray3[local151][local230][local243] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([[FI[[B[[B[[F[[B[[B[Lclient!ck;[[IIZ[[F)V")
	private static void method905(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) Class28[] arg7, @OriginalArg(8) int[][] arg8, @OriginalArg(9) int arg9, @OriginalArg(11) float[][] arg10) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			@Pc(14) Class28 local14 = arg7[local7];
			if (arg9 == local14.anInt870) {
				@Pc(23) Class80 local23 = new Class80();
				@Pc(32) int local32 = (local14.anInt863 >> 7) - local14.anInt876;
				@Pc(41) int local41 = (local14.anInt877 >> 7) - local14.anInt876;
				@Pc(49) int local49 = local14.anInt876 + (local14.anInt877 >> 7);
				if (local49 > 103) {
					local49 = 103;
				}
				@Pc(59) int local59 = 0;
				if (local41 < 0) {
					local59 = -local41;
					local41 = 0;
				}
				@Pc(69) int local69;
				@Pc(77) short local77;
				@Pc(83) int local83;
				@Pc(92) int local92;
				@Pc(108) int local108;
				@Pc(123) int local123;
				@Pc(308) boolean local308;
				@Pc(349) int local349;
				for (local69 = local41; local69 <= local49; local69++) {
					local77 = local14.aShortArray6[local59];
					local83 = (local77 >> 8) + local32;
					local92 = local83 + (local77 & 0xFF) - 1;
					if (local92 > 103) {
						local92 = 103;
					}
					if (local83 < 0) {
						local83 = 0;
					}
					for (local108 = local83; local108 <= local92; local108++) {
						local123 = arg3[local108][local69] & 0xFF;
						@Pc(125) boolean local125 = false;
						@Pc(133) int local133 = arg2[local108][local69] & 0xFF;
						@Pc(147) Class140 local147;
						@Pc(182) int[] local182;
						@Pc(235) int[] local235;
						if (local133 == 0) {
							if (local123 == 0) {
								continue;
							}
							local147 = Static272.method4047(local123 - 1);
							if (local147.anInt4601 == -1) {
								continue;
							}
							if (arg6[local108][local69] != 0) {
								local235 = Static136.anIntArrayArray13[arg6[local108][local69]];
								local23.anInt2290 += ((local235.length >> 1) - 2) * 3;
								local23.anInt2289 += local235.length >> 1;
								continue;
							}
						} else if (local123 != 0) {
							local147 = Static272.method4047(local123 - 1);
							@Pc(157) byte local157;
							if (local147.anInt4601 == -1) {
								local157 = arg6[local108][local69];
								if (local157 != 0) {
									local182 = Static97.anIntArrayArray10[local157];
									local23.anInt2290 += ((local182.length >> 1) - 2) * 3;
									local23.anInt2289 += local182.length >> 1;
								}
								continue;
							}
							local157 = arg6[local108][local69];
							if (local157 != 0) {
								local125 = true;
							}
						}
						@Pc(264) Class170 local264 = Static234.method3559(arg9, local108, local69);
						if (local264 != null) {
							@Pc(275) int local275 = (int) (local264.aLong196 >> 14) & 0x3F;
							if (local275 == 9) {
								@Pc(289) int local289 = (int) (local264.aLong196 >> 20) & 0x3;
								local182 = null;
								@Pc(321) boolean local321;
								@Pc(336) short local336;
								@Pc(342) int local342;
								if ((local289 & 0x1) == 0) {
									local308 = local108 + 1 <= local92;
									local321 = local108 - 1 >= local83;
									if (!local321 && local49 >= local69 + 1) {
										local336 = local14.aShortArray6[local59 + 1];
										local342 = local32 + (local336 >> 8);
										local349 = local342 + (local336 & 0xFF);
										local321 = local342 < local108 && local349 > local108;
									}
									if (!local308 && local41 <= local69 - 1) {
										local336 = local14.aShortArray6[local59 - 1];
										local342 = (local336 >> 8) + local32;
										local349 = (local336 & 0xFF) + local342;
										local308 = local108 > local342 && local349 > local108;
									}
									if (local321 && local308) {
										local182 = Static136.anIntArrayArray13[0];
									} else if (local321) {
										local182 = Static136.anIntArrayArray13[1];
									} else if (local308) {
										local182 = Static136.anIntArrayArray13[1];
									}
								} else {
									local321 = local83 <= local108 - 1;
									local308 = local108 + 1 <= local92;
									if (!local321 && local69 - 1 >= local41) {
										local336 = local14.aShortArray6[local59 - 1];
										local342 = local32 + (local336 >> 8);
										local349 = local342 + (local336 & 0xFF);
										local321 = local108 > local342 && local349 > local108;
									}
									if (!local308 && local69 + 1 <= local49) {
										local336 = local14.aShortArray6[local59 + 1];
										local342 = (local336 >> 8) + local32;
										local349 = local342 + (local336 & 0xFF);
										local308 = local108 > local342 && local108 < local349;
									}
									if (local321 && local308) {
										local182 = Static136.anIntArrayArray13[0];
									} else if (local321) {
										local182 = Static136.anIntArrayArray13[1];
									} else if (local308) {
										local182 = Static136.anIntArrayArray13[1];
									}
								}
								if (local182 != null) {
									local23.anInt2290 += ((local182.length >> 1) - 2) * 3;
									local23.anInt2289 += local182.length >> 1;
								}
								continue;
							}
						}
						if (local125) {
							local235 = Static136.anIntArrayArray13[arg6[local108][local69]];
							local182 = Static97.anIntArrayArray10[arg6[local108][local69]];
							local23.anInt2290 += (local235.length >> 1) * 3 - 6;
							local23.anInt2290 += ((local182.length >> 1) - 2) * 3;
							local23.anInt2289 += local235.length >> 1;
							local23.anInt2289 += local182.length >> 1;
						} else {
							local235 = Static136.anIntArrayArray13[0];
							local23.anInt2290 += ((local235.length >> 1) - 2) * 3;
							local23.anInt2289 += local235.length >> 1;
						}
					}
					local59++;
				}
				local23.method1824();
				local59 = 0;
				if ((local14.anInt877 >> 7) - local14.anInt876 < 0) {
					local59 = local14.anInt876 - (local14.anInt877 >> 7);
				}
				for (local69 = local41; local69 <= local49; local69++) {
					local77 = local14.aShortArray6[local59];
					local83 = local32 + (local77 >> 8);
					local92 = (local77 & 0xFF) + local83 - 1;
					if (local92 > 103) {
						local92 = 103;
					}
					if (local83 < 0) {
						local83 = 0;
					}
					for (local108 = local83; local108 <= local92; local108++) {
						local123 = arg2[local108][local69] & 0xFF;
						@Pc(769) byte local769 = arg5[local108][local69];
						@Pc(777) int local777 = arg3[local108][local69] & 0xFF;
						@Pc(779) boolean local779 = false;
						@Pc(793) Class140 local793;
						if (local123 == 0) {
							if (local777 == 0) {
								continue;
							}
							local793 = Static272.method4047(local777 - 1);
							if (local793.anInt4601 == -1) {
								continue;
							}
							if (arg6[local108][local69] != 0) {
								Static87.method1415(Static136.anIntArrayArray13[arg6[local108][local69]], local14, local108, arg5[local108][local69], arg0, local69, local23, arg4, arg10, arg8);
								continue;
							}
						} else if (local777 != 0) {
							local793 = Static272.method4047(local777 - 1);
							if (local793.anInt4601 == -1) {
								Static87.method1415(Static97.anIntArrayArray10[arg6[local108][local69]], local14, local108, arg5[local108][local69], arg0, local69, local23, arg4, arg10, arg8);
								continue;
							}
							@Pc(855) byte local855 = arg6[local108][local69];
							if (local855 != 0) {
								local779 = true;
							}
						}
						@Pc(891) Class170 local891 = Static234.method3559(arg9, local108, local69);
						if (local891 != null) {
							@Pc(901) int local901 = (int) (local891.aLong196 >> 14) & 0x3F;
							if (local901 == 9) {
								@Pc(908) int[] local908 = null;
								@Pc(916) int local916 = (int) (local891.aLong196 >> 20) & 0x3;
								@Pc(973) int local973;
								@Pc(930) boolean local930;
								@Pc(961) short local961;
								if ((local916 & 0x1) == 0) {
									local930 = local92 >= local108 + 1;
									local308 = local83 <= local108 - 1;
									if (!local308 && local69 + 1 <= local49) {
										local961 = local14.aShortArray6[local59 + 1];
										local349 = (local961 >> 8) + local32;
										local973 = local349 + (local961 & 0xFF);
										local308 = local349 < local108 && local108 < local973;
									}
									if (!local930 && local41 <= local69 - 1) {
										local961 = local14.aShortArray6[local59 - 1];
										local349 = (local961 >> 8) + local32;
										local973 = (local961 & 0xFF) + local349;
										local930 = local349 < local108 && local108 < local973;
									}
									if (local308 && local930) {
										local908 = Static136.anIntArrayArray13[0];
									} else if (local308) {
										local769 = 1;
										local908 = Static136.anIntArrayArray13[1];
									} else if (local930) {
										local908 = Static136.anIntArrayArray13[1];
										local769 = 3;
									}
								} else {
									local930 = local108 + 1 <= local92;
									local308 = local108 - 1 >= local83;
									if (!local308 && local41 <= local69 - 1) {
										local961 = local14.aShortArray6[local59 - 1];
										local349 = (local961 >> 8) + local32;
										local973 = local349 + (local961 & 0xFF);
										local308 = local349 < local108 && local973 > local108;
									}
									if (!local930 && local49 >= local69 + 1) {
										local961 = local14.aShortArray6[local59 + 1];
										local349 = local32 + (local961 >> 8);
										local973 = (local961 & 0xFF) + local349;
										local930 = local349 < local108 && local973 > local108;
									}
									if (local308 && local930) {
										local908 = Static136.anIntArrayArray13[0];
									} else if (local308) {
										local908 = Static136.anIntArrayArray13[1];
										local769 = 0;
									} else if (local930) {
										local769 = 2;
										local908 = Static136.anIntArrayArray13[1];
									}
								}
								if (local908 != null) {
									Static87.method1415(local908, local14, local108, local769, arg0, local69, local23, arg4, arg10, arg8);
								}
								continue;
							}
						}
						if (local779) {
							Static87.method1415(Static97.anIntArrayArray10[arg6[local108][local69]], local14, local108, arg5[local108][local69], arg0, local69, local23, arg4, arg10, arg8);
							Static87.method1415(Static136.anIntArrayArray13[arg6[local108][local69]], local14, local108, arg5[local108][local69], arg0, local69, local23, arg4, arg10, arg8);
						} else {
							Static87.method1415(Static136.anIntArrayArray13[0], local14, local108, local769, arg0, local69, local23, arg4, arg10, arg8);
						}
					}
					local59++;
				}
				if (local23.anInt2291 > 0 && local23.anInt2288 > 0) {
					local23.method1826();
					local14.aClass80_1 = local23;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method906() {
		Static28.aClass61_4.method1379();
		Static187.aClass61_32.method1379();
		Static240.aClass61_46.method1379();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)[F")
	public static float[] method908(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static233.method3549() + Static233.method3552();
		@Pc(9) int local9 = Static233.method3555();
		Static35.aFloatArray2[3] = 1.0F;
		@Pc(22) float local22 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(31) float local31 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(38) float local38 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(40) float local40 = 0.58823526F;
		Static35.aFloatArray2[2] = local7 * local40 * (float) (arg0 & 0xFF) / 255.0F * local38;
		Static35.aFloatArray2[1] = local7 * local40 * local31 * ((float) (arg0 >> 8 & 0xFF) / 255.0F);
		Static35.aFloatArray2[0] = local7 * local40 * local22 * ((float) (arg0 >> 16 & 0xFF) / 255.0F);
		return Static35.aFloatArray2;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	public static void method909() {
		Static222.aClass61_41.method1378();
	}
}
