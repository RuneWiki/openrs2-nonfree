import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	public static int anInt9304;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "I")
	public static int anInt9301 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!bs;I)V")
	public static void method7915(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub1 arg0) {
		@Pc(11) Class6_Sub49 local11 = (Class6_Sub49) Static554.aClass128_8.method3560((long) arg0.anInt5567);
		if (local11 == null) {
			return;
		}
		if (local11.aClass6_Sub3_Sub3_4 != null) {
			Static196.aClass6_Sub3_Sub1_1.method270(local11.aClass6_Sub3_Sub3_4);
			local11.aClass6_Sub3_Sub3_4 = null;
		}
		local11.method9043();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(FIFIIIFI)[F")
	public static float[] method7916(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[1] = 0.0F;
		local6[8] = local17;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg6 / 32767.0F;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(98) float local98 = 1.0F - local83;
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg1 * arg1 + arg4 * arg4));
		if (local110 == 0.0F && local83 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local76 = (float) -arg4 / local110;
				local78 = (float) arg1 / local110;
			}
			local74[7] = local93 * -local76;
			local74[2] = local98 * local76 * local78;
			local74[8] = local98 * local78 * local78 + local83;
			local74[3] = local93 * -local78;
			local74[5] = local76 * local93;
			local74[0] = local83 + local76 * local76 * local98;
			local74[6] = local78 * local76 * local98;
			local74[1] = local93 * local78;
			local74[4] = local83;
			local9[0] = local74[6] * local6[2] + local6[0] * local74[0] + local74[3] * local6[1];
			local9[1] = local6[2] * local74[7] + local6[1] * local74[4] + local6[0] * local74[1];
			local9[3] = local6[5] * local74[6] + local6[3] * local74[0] + local6[4] * local74[3];
			local9[2] = local6[2] * local74[8] + local6[1] * local74[5] + local6[0] * local74[2];
			local9[4] = local74[1] * local6[3] + local74[4] * local6[4] + local6[5] * local74[7];
			local9[6] = local74[6] * local6[8] + local74[0] * local6[6] + local6[7] * local74[3];
			local9[5] = local6[4] * local74[5] + local6[3] * local74[2] + local6[5] * local74[8];
			local9[7] = local74[4] * local6[7] + local74[1] * local6[6] + local6[8] * local74[7];
			local9[8] = local6[8] * local74[8] + local6[6] * local74[2] + local74[5] * local6[7];
		}
		local9[6] *= arg0;
		local9[8] *= arg0;
		local9[1] *= arg5;
		local9[4] *= arg2;
		local9[0] *= arg5;
		local9[5] *= arg2;
		local9[2] *= arg5;
		local9[3] *= arg2;
		local9[7] *= arg0;
		return local9;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIBII)V")
	public static void method7919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = Static641.aShort121 + local7 * (Static509.aShort110 - Static641.aShort121) / 100;
		Static419.anInt7660 = local30 * Static419.anInt7658 >> 8;
		@Pc(42) int local42 = arg6 * local30 >> 8;
		@Pc(49) int local49 = 16384 - arg1 & 0x3FFF;
		@Pc(56) int local56 = 16384 - arg0 & 0x3FFF;
		@Pc(58) int local58 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = local42;
		if (local49 != 0) {
			local65 = Class100_Sub1.anIntArray428[local49] * -local42 >> 14;
			local67 = Class100_Sub1.anIntArray429[local49] * local42 >> 14;
		}
		if (local56 != 0) {
			local58 = local67 * Class100_Sub1.anIntArray428[local56] >> 14;
			local67 = local67 * Class100_Sub1.anIntArray429[local56] >> 14;
		}
		Static263.anInt5239 = arg1;
		Static580.anInt9662 = arg3 - local58;
		Static524.anInt9123 = arg4 - local67;
		Static470.anInt8261 = arg0;
		Static428.anInt7788 = arg2 - local65;
		Static9.anInt193 = 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIZ[Lclient!sca;II)V")
	public static void method7921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class302[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
		for (@Pc(26) int local26 = 0; local26 < arg7.length; local26++) {
			@Pc(32) Class302 local32 = arg7[local26];
			if (local32 != null && (local32.anInt8806 == arg3 || arg3 == -1412584499 && local32 == Static478.aClass302_56)) {
				@Pc(58) int local58 = local32.anInt8866 + arg8;
				@Pc(63) int local63 = local32.anInt8854 + arg4;
				@Pc(71) int local71 = local58 + local32.anInt8801 + 1;
				@Pc(78) int local78 = local32.anInt8814 + local63 + 1;
				@Pc(84) int local84;
				if (arg1 == -1) {
					Class6.aRectangleArray148[Static595.anInt9912].setBounds(local32.anInt8866 + arg8, arg4 + local32.anInt8854, local32.anInt8801, local32.anInt8814);
					local84 = Static595.anInt9912++;
				} else {
					local84 = arg1;
				}
				local32.anInt8811 = Static113.anInt2243;
				local32.anInt8810 = local84;
				if (!Static78.method1367(local32)) {
					if (local32.anInt8784 != 0) {
						Static81.method1416(local32);
					}
					@Pc(128) int local128 = arg8 + local32.anInt8866;
					@Pc(133) int local133 = arg4 + local32.anInt8854;
					@Pc(135) int local135 = 0;
					@Pc(137) int local137 = 0;
					if (Static389.aBoolean497) {
						local135 = Static240.method4161();
						local137 = Static452.method6945();
					}
					@Pc(148) int local148 = local32.anInt8858;
					if (Static321.aBoolean412 && (Static78.method1364(local32).anInt9595 != 0 || local32.anInt8816 == 0) && local148 > 127) {
						local148 = 127;
					}
					@Pc(200) int local200;
					@Pc(208) int local208;
					if (Static478.aClass302_56 == local32) {
						if (arg3 != -1412584499 && (Static538.anInt9298 == local32.anInt8803 || Static56.anInt1199 == local32.anInt8803)) {
							Static326.anInt6219 = arg4;
							Static88.anInt1823 = arg8;
							Static335.aClass302Array1 = arg7;
							continue;
						}
						if (Static243.aBoolean342 && Static66.aBoolean91) {
							local200 = Static429.aClass71_1.method7701() + local135;
							local208 = local137 + Static429.aClass71_1.method7702();
							local208 -= Static393.anInt7353;
							local200 -= Static262.anInt5205;
							if (local200 < Static618.anInt10218) {
								local200 = Static618.anInt10218;
							}
							if (local200 + local32.anInt8801 > Static228.aClass302_30.anInt8801 + Static618.anInt10218) {
								local200 = Static228.aClass302_30.anInt8801 + Static618.anInt10218 - local32.anInt8801;
							}
							if (Static112.anInt2201 > local208) {
								local208 = Static112.anInt2201;
							}
							local128 = local200;
							if (Static228.aClass302_30.anInt8814 + Static112.anInt2201 < local32.anInt8814 + local208) {
								local208 = Static112.anInt2201 + Static228.aClass302_30.anInt8814 - local32.anInt8814;
							}
							local133 = local208;
						}
						if (local32.anInt8803 == Static56.anInt1199) {
							local148 = 128;
						}
					}
					@Pc(322) int local322;
					@Pc(329) int local329;
					@Pc(290) int local290;
					@Pc(295) int local295;
					if (local32.anInt8816 == 2) {
						local322 = arg5;
						local329 = arg0;
						local208 = arg2;
						local200 = arg9;
					} else {
						local290 = local32.anInt8801 + local128;
						local295 = local32.anInt8814 + local133;
						local200 = arg9 >= local128 ? arg9 : local128;
						local208 = local133 <= arg2 ? arg2 : local133;
						if (local32.anInt8816 == 9) {
							local290++;
							local295++;
						}
						local322 = local290 < arg5 ? local290 : arg5;
						local329 = arg0 <= local295 ? arg0 : local295;
					}
					if (local322 > local200 && local208 < local329) {
						@Pc(599) int local599;
						@Pc(648) int local648;
						@Pc(741) int local741;
						@Pc(743) int local743;
						@Pc(633) int local633;
						@Pc(635) int local635;
						if (local32.anInt8784 != 0) {
							if (local32.anInt8784 == Static185.anInt3788 || local32.anInt8784 == Static283.anInt6253) {
								Static165.method3050(local128, local32, local133);
								if (!Static389.aBoolean497) {
									Static152.method4570(local133, local32.anInt8784 == Static283.anInt6253, local32.anInt8814, local128, local32.anInt8801);
									Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
								}
								Static501.aBooleanArray46[local84] = true;
								continue;
							}
							if (Static217.anInt4255 == local32.anInt8784) {
								if (local32.method7554(Static162.aClass100_7) != null) {
									Static54.method911();
									Static248.method4289(Static162.aClass100_7, local133, local32, local128);
									Static623.aBooleanArray57[local84] = true;
									Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
									if (Static389.aBoolean497) {
										if (arg6) {
											Static347.method5621(local78, local71, local63, local58);
										} else {
											Static168.method3100(local58, local78, local63, local71);
										}
									}
								}
								continue;
							}
							if (Static416.anInt7574 == local32.anInt8784) {
								if (local32.method7554(Static162.aClass100_7) != null) {
									Static385.method6198(local32, local128, local133);
									Static623.aBooleanArray57[local84] = true;
									Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
									if (Static389.aBoolean497) {
										if (arg6) {
											Static347.method5621(local78, local71, local63, local58);
										} else {
											Static168.method3100(local58, local78, local63, local71);
										}
									}
								}
								continue;
							}
							if (local32.anInt8784 == Static233.anInt4693) {
								Static51.method883(local32.anInt8814, local32.anInt8801, local133, local128, Static535.anInterface4_10, Static162.aClass100_7);
								Static501.aBooleanArray46[local84] = true;
								Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
								continue;
							}
							if (Static98.anInt1920 == local32.anInt8784) {
								Static296.method5099(local32.anInt8801, local133, local32.anInt8814, local128, Static162.aClass100_7);
								Static501.aBooleanArray46[local84] = true;
								Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
								continue;
							}
							if (Static200.anInt4042 == local32.anInt8784) {
								if (!Static403.aBoolean505 && !Static386.aBoolean376) {
									continue;
								}
								local290 = local32.anInt8801 + local128;
								local295 = local133 + 15;
								if (Static389.aBoolean497) {
									if (arg6) {
										Static347.method5621(local78, local71, local63, local58);
									} else {
										Static168.method3100(local58, local78, local63, local71);
									}
								}
								if (Static403.aBoolean505) {
									local599 = -256;
									if (Static340.anInt6735 < 20) {
										local599 = -65536;
									}
									Static43.aClass50_2.method5735(local290, "Fps:" + Static340.anInt6735, -1, local599, local295);
									local295 += 15;
									@Pc(623) Runtime local623 = Runtime.getRuntime();
									local633 = (int) ((local623.totalMemory() - local623.freeMemory()) / 1024L);
									local635 = -256;
									if (local633 > 98304) {
										local635 = -65536;
										if (Static248.aBoolean348) {
											Static624.method8684();
											for (local648 = 0; local648 < 10; local648++) {
												System.gc();
											}
											local633 = (int) ((local623.totalMemory() - local623.freeMemory()) / 1024L);
											if (local633 > 65536) {
												Static342.method5551("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static43.aClass50_2.method5735(local290, "Mem:" + local633 + "k", -1, local635, local295);
									local295 += 15;
									Static43.aClass50_2.method5735(local290, "In:" + Static492.anInt8564 + "B/s Out:" + Static88.anInt1826 + "B/s", -1, -256, local295);
									local295 += 15;
									local648 = Static162.aClass100_7.E() / 1024;
									Static43.aClass50_2.method5735(local290, "Offheap:" + local648 + "k", -1, ~local648 >= -65537 ? -256 : -65536, local295);
									local295 += 15;
									local741 = 0;
									local743 = 0;
									@Pc(745) int local745 = 0;
									for (@Pc(747) int local747 = 0; local747 < 37; local747++) {
										if (Static241.aClass217_Sub1Array7[local747] != null) {
											local741 += Static241.aClass217_Sub1Array7[local747].method5796();
											local743 += Static241.aClass217_Sub1Array7[local747].method5798();
											local745 += Static241.aClass217_Sub1Array7[local747].method5800();
										}
									}
									@Pc(789) int local789 = local745 * 100 / local741;
									@Pc(795) int local795 = local743 * 10000 / local741;
									@Pc(815) String local815 = "Cache:" + Static579.method8181((long) local795, 2, 0, true) + "% (" + local789 + "%)";
									Static631.aClass50_12.method5735(local290, local815, -1, -256, local295);
									local295 += 12;
								}
								if (Static373.anInt6851 > 0) {
									Static631.aClass50_12.method5735(local290, "Particles: " + Static410.anInt7537 + " / " + Static373.anInt6851, -1, -256, local295);
								}
								local295 += 12;
								if (Static386.aBoolean376) {
									Static631.aClass50_12.method5735(local290, "Polys: " + Static162.aClass100_7.I() + " Models: " + Static162.aClass100_7.M(), -1, -256, local295);
									local295 += 12;
									Static631.aClass50_12.method5735(local290, "Ls: " + Static190.anInt3819 + " La: " + Static341.anInt6420 + " NPC: " + Static335.anInt6362 + " Pl: " + Static501.anInt8669, -1, -256, local295);
									local295 += 12;
									Static251.method4489();
								}
								Static501.aBooleanArray46[local84] = true;
								continue;
							}
						}
						@Pc(977) Class6_Sub29 local977;
						if (local32.anInt8816 == 0) {
							if (local32.anInt8784 == Static393.anInt7366 && Static162.aClass100_7.method8784()) {
								Static162.aClass100_7.method8771(local128, local133, local32.anInt8801, local32.anInt8814);
							}
							method7921(local329, local84, local208, local32.anInt8838, local133 - local32.anInt8804, local322, arg6, arg7, local128 - local32.anInt8787, local200);
							if (local32.aClass302Array2 != null) {
								method7921(local329, local84, local208, local32.anInt8838, local133 - local32.anInt8804, local322, arg6, local32.aClass302Array2, local128 - local32.anInt8787, local200);
							}
							local977 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local32.anInt8838);
							if (local977 != null) {
								Static200.method3540(local322, local128, local329, local208, local84, local133, local200, local977.anInt6361);
							}
							if (Static393.anInt7366 == local32.anInt8784 && Static162.aClass100_7.method8784()) {
								Static162.aClass100_7.method8852();
							}
							Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
						}
						if (Static567.aBooleanArray53[local84] || Static205.anInt4087 > 1) {
							if (local32.anInt8816 == 3) {
								if (local148 == 0) {
									if (local32.aBoolean589) {
										Static162.aClass100_7.aa(local128, local133, local32.anInt8801, local32.anInt8814, local32.anInt8827, 0);
									} else {
										Static162.aClass100_7.method8845(local128, local133, local32.anInt8801, local32.anInt8814, local32.anInt8827, 0);
									}
								} else if (local32.aBoolean589) {
									Static162.aClass100_7.aa(local128, local133, local32.anInt8801, local32.anInt8814, 255 - (local148 & 0xFF) << 24 | local32.anInt8827 & 0xFFFFFF, 1);
								} else {
									Static162.aClass100_7.method8845(local128, local133, local32.anInt8801, local32.anInt8814, local32.anInt8827 & 0xFFFFFF | 255 - (local148 & 0xFF) << 24, 1);
								}
								if (Static389.aBoolean497) {
									if (arg6) {
										Static347.method5621(local78, local71, local63, local58);
									} else {
										Static168.method3100(local58, local78, local63, local71);
									}
								}
							} else {
								@Pc(1154) Class347 local1154;
								if (local32.anInt8816 == 4) {
									@Pc(1129) Class50 local1129 = local32.method7560(Static162.aClass100_7);
									if (local1129 != null) {
										local295 = local32.anInt8827;
										@Pc(1144) String local1144 = local32.aString105;
										if (local32.anInt8877 != -1) {
											local1154 = Static266.aClass138_1.method3730(local32.anInt8877);
											local1144 = local1154.aString109;
											if (local1144 == null) {
												local1144 = "null";
											}
											if ((local1154.anInt9717 == 1 || local32.anInt8808 != 1) && local32.anInt8808 != -1) {
												local1144 = "<col=ff9040>" + local1144 + "</col> x" + Static576.method3994(local32.anInt8808);
											}
										}
										if (local32.anInt8783 != -1) {
											local1144 = Static432.method6742(local32.anInt8783);
											if (local1144 == null) {
												local1144 = "";
											}
										}
										if (Static523.aClass302_53 == local32) {
											local1144 = Static317.aClass192_31.method5299(Static307.anInt5931);
											local295 = local32.anInt8827;
										}
										if (Static462.aBoolean556) {
											Static162.aClass100_7.T(local128, local133, local32.anInt8801 + local128, local32.anInt8814 + local133);
										}
										local1129.method5731(local32.anInt8814, Static553.aClass32Array19, (Class1) null, local133, local32.anInt8839, local32.anInt8821, local32.anInt8800, 0, local32.anInt8857, 0, 255 - (local148 & 0xFF) << 24 | local295, (int[]) null, local128, local32.aBoolean597 ? 255 - (local148 & 0xFF) << 24 : -1, local32.anInt8801, local1144);
										if (Static462.aBoolean556) {
											Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
										}
										if (local1144.trim().length() > 0) {
											if (!Static462.aBoolean556) {
												@Pc(1298) Class133 local1298 = Static193.method3449(Static162.aClass100_7, local32.anInt8867);
												local633 = local1298.method3639(local32.anInt8801, Static553.aClass32Array19, local1144);
												local635 = local1298.method3646(Static553.aClass32Array19, local1144, local32.anInt8801, local32.anInt8839);
												if (Static389.aBoolean497) {
													if (arg6) {
														Static347.method5621(local635 + local133, local128 + local633, local133, local128);
													} else {
														Static168.method3100(local128, local635 + local133, local133, local128 + local633);
													}
												}
											} else if (Static389.aBoolean497) {
												if (arg6) {
													Static347.method5621(local78, local71, local63, local58);
												} else {
													Static168.method3100(local58, local78, local63, local71);
												}
											}
										}
									} else if (Static482.aBoolean567) {
										Static603.method8464(local32);
									}
								} else {
									@Pc(1489) int local1489;
									if (local32.anInt8816 == 5) {
										if (local32.anInt8807 >= 0) {
											local32.method7555(Static22.aClass354_1, Static25.aClass355_1).method6925(local32.anInt8817 << 3, local133, 0, local32.anInt8801, Static162.aClass100_7, local128, local32.anInt8869 << 3, local32.anInt8814, 0);
										} else {
											@Pc(1419) Class32 local1419;
											if (local32.anInt8877 != -1) {
												@Pc(1437) Class12 local1437 = local32.aBoolean587 ? Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 : null;
												local1419 = Static266.aClass138_1.method3736(Static162.aClass100_7, local32.anInt8874, local32.anInt8877, local32.anInt8794, local32.anInt8844 | 0xFF000000, local32.anInt8808, local1437);
											} else if (local32.anInt8783 == -1) {
												local1419 = local32.method7556(Static162.aClass100_7);
											} else {
												local1419 = Static399.method6446(Static162.aClass100_7, local32.anInt8783);
											}
											if (local1419 != null) {
												local295 = local1419.method5080();
												local599 = local1419.method5079();
												local1489 = 255 - (local148 & 0xFF) << 24 | (local32.anInt8827 == 0 ? 16777215 : local32.anInt8827 & 0xFFFFFF);
												if (local32.aBoolean596) {
													Static162.aClass100_7.T(local128, local133, local32.anInt8801 + local128, local133 - -local32.anInt8814);
													if (local32.anInt8824 != 0) {
														local633 = (local32.anInt8801 + local295 - 1) / local295;
														local635 = (local599 + local32.anInt8814 - 1) / local599;
														for (local648 = 0; local648 < local633; local648++) {
															for (local741 = 0; local741 < local635; local741++) {
																if (local32.anInt8827 == 0) {
																	local1419.method5087((float) (local648 * local295 + local128) + (float) local295 / 2.0F, (float) (local599 * local741 + local133) + (float) local599 / 2.0F, 4096, local32.anInt8824);
																} else {
																	local1419.method5070((float) local295 / 2.0F + (float) (local128 + local295 * local648), (float) (local599 * local741 + local133) + (float) local599 / 2.0F, 4096, local32.anInt8824, local1489);
																}
															}
														}
													} else if (local32.anInt8827 == 0 && local148 == 0) {
														local1419.method5092(local128, local133, local32.anInt8801, local32.anInt8814);
													} else {
														local1419.method5083(local128, local133, local32.anInt8801, local32.anInt8814, 0, local1489, 1);
													}
													Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
												} else if (local32.anInt8827 == 0 && local148 == 0) {
													if (local32.anInt8824 != 0) {
														local1419.method5087((float) local32.anInt8801 / 2.0F + (float) local128, (float) local32.anInt8814 / 2.0F + (float) local133, local32.anInt8801 * 4096 / local295, local32.anInt8824);
													} else if (local32.anInt8801 == local295 && local599 == local32.anInt8814) {
														local1419.method5071(local128, local133);
													} else {
														local1419.method5090(local128, local133, local32.anInt8801, local32.anInt8814);
													}
												} else if (local32.anInt8824 != 0) {
													local1419.method5070((float) local128 + (float) local32.anInt8801 / 2.0F, (float) local133 + (float) local32.anInt8814 / 2.0F, local32.anInt8801 * 4096 / local295, local32.anInt8824, local1489);
												} else if (local295 == local32.anInt8801 && local32.anInt8814 == local599) {
													local1419.method5088(local128, local133, 0, local1489, 1);
												} else {
													local1419.method5076(local128, local133, local32.anInt8801, local32.anInt8814, 0, local1489, 1);
												}
											} else if (Static482.aBoolean567) {
												Static603.method8464(local32);
											}
										}
										if (Static389.aBoolean497) {
											if (arg6) {
												Static347.method5621(local78, local71, local63, local58);
											} else {
												Static168.method3100(local58, local78, local63, local71);
											}
										}
									} else if (local32.anInt8816 == 6) {
										Static189.method3368();
										local977 = null;
										@Pc(1818) Class24 local1818 = null;
										local599 = 0;
										@Pc(1852) Class21 local1852;
										@Pc(1860) Class12 local1860;
										if (local32.anInt8877 != -1) {
											local1154 = Static266.aClass138_1.method3730(local32.anInt8877);
											if (local1154 != null) {
												local1154 = local1154.method8236(local32.anInt8808);
												local1852 = local32.anInt8798 == -1 ? null : Static294.aClass373_2.method8738(local32.anInt8798);
												local1860 = local32.aBoolean587 ? Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 : null;
												local1818 = local1154.method8253(local32.anInt8836, 1, local32.anInt8785, local1860, 2048, Static162.aClass100_7, local1852, local32.anInt8841);
												if (local1818 == null) {
													Static603.method8464(local32);
												} else {
													local599 = -local1818.fa() >> 1;
												}
											}
										} else if (local32.anInt8823 == 5) {
											local1489 = local32.anInt8871;
											if (local1489 >= 0 && local1489 < 2048) {
												@Pc(1907) Class20_Sub2_Sub2_Sub1_Sub1 local1907 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local1489];
												@Pc(1920) Class21 local1920 = local32.anInt8798 == -1 ? null : Static294.aClass373_2.method8738(local32.anInt8798);
												if (local1907 != null && (Static229.anInt4561 == local1489 || Static236.method4095(local1907.aString12) == local32.anInt8789)) {
													local1818 = local1907.aClass12_1.method273((Class21) null, (Class113[]) null, Static162.aClass100_7, Static195.aClass58_1, 0, local32.anInt8841, Static294.aClass373_2, local32.anInt8836, Static511.aClass34_1, 0, -1, 0, Static266.aClass138_1, local1920, (int[]) null, Static563.aClass346_2, 2048, local32.anInt8785, Static279.aClass294_1);
												}
											}
										} else if (local32.anInt8823 == 8 || local32.anInt8823 == 9) {
											@Pc(1981) Class6_Sub16 local1981 = Static148.method2357(false, local32.anInt8871);
											local1852 = local32.anInt8798 == -1 ? null : Static294.aClass373_2.method8738(local32.anInt8798);
											if (local1981 != null) {
												local1860 = local32.aBoolean587 ? Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 : null;
												local1818 = local1981.method2252(local1860, Static162.aClass100_7, local32.anInt8836, local1852, local32.anInt8785, local32.anInt8841, local32.anInt8823 == 9, local32.anInt8789);
											}
										} else if (local32.anInt8798 == -1) {
											local1818 = local32.method7546(Static511.aClass34_1, Static266.aClass138_1, (Class21) null, Static279.aClass294_1, -1, Static563.aClass346_2, Static162.aClass100_7, Static195.aClass58_1, Static294.aClass373_2, 0, local977, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1, -1, 2048);
											if (local1818 == null && Static482.aBoolean567) {
												Static603.method8464(local32);
											}
										} else {
											@Pc(2066) Class21 local2066 = Static294.aClass373_2.method8738(local32.anInt8798);
											local1818 = local32.method7546(Static511.aClass34_1, Static266.aClass138_1, local2066, Static279.aClass294_1, local32.anInt8785, Static563.aClass346_2, Static162.aClass100_7, Static195.aClass58_1, Static294.aClass373_2, local32.anInt8836, local977, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1, local32.anInt8841, 2048);
											if (local1818 == null && Static482.aBoolean567) {
												Static603.method8464(local32);
											}
										}
										if (local1818 != null) {
											if (local32.anInt8863 <= 0) {
												local1489 = 512;
											} else {
												local1489 = (local32.anInt8801 << 9) / local32.anInt8863;
											}
											if (local32.anInt8790 > 0) {
												local633 = (local32.anInt8814 << 9) / local32.anInt8790;
											} else {
												local633 = 512;
											}
											local635 = local32.anInt8801 / 2 + local128;
											local648 = local32.anInt8814 / 2 + local133;
											if (!local32.aBoolean590) {
												local635 += local32.anInt8828 * local1489 >> 9;
												local648 += local32.anInt8830 * local633 >> 9;
											}
											Static187.aClass154_3.method6564();
											Static162.aClass100_7.method8850(Static187.aClass154_3);
											Static162.aClass100_7.DA(local635, local648, local1489, local633);
											Static162.aClass100_7.ya();
											if (local32.aBoolean588) {
												Static162.aClass100_7.C(false);
											}
											if (local32.aBoolean590) {
												Static562.aClass154_9.method6558(local32.anInt8845);
												Static562.aClass154_9.method6566(local32.anInt8786);
												Static562.aClass154_9.method6572(local32.anInt8788);
												Static562.aClass154_9.method6570(local32.anInt8828, local32.anInt8830, local32.anInt8851);
											} else {
												local741 = Class100_Sub1.anIntArray428[local32.anInt8845 << 3] * (local32.anInt8876 << 2) >> 14;
												local743 = Class100_Sub1.anIntArray429[local32.anInt8845 << 3] * (local32.anInt8876 << 2) >> 14;
												Static562.aClass154_9.method6565(-local32.anInt8788 << 3);
												Static562.aClass154_9.method6566(local32.anInt8786 << 3);
												Static562.aClass154_9.method6570(local32.anInt8872 << 2, (local32.anInt8842 << 2) + local741 + local599, (local32.anInt8842 << 2) + local743);
												Static562.aClass154_9.method6557(local32.anInt8845 << 3);
											}
											local32.method7562(Static162.aClass100_7, Static562.aClass154_9, local1818, Static113.anInt2243);
											if (Static462.aBoolean556) {
												Static162.aClass100_7.T(local128, local133, local32.anInt8801 + local128, local32.anInt8814 + local133);
											}
											if (local32.aBoolean590) {
												if (local32.aBoolean599) {
													local1818.method6845(Static562.aClass154_9, (Class20_Sub4) null, local32.anInt8876, 1);
												} else {
													local1818.method6862(Static562.aClass154_9, (Class20_Sub4) null, 1);
													if (local32.aClass20_Sub8_7 != null) {
														Static162.aClass100_7.method8844(local32.aClass20_Sub8_7.method6642());
													}
												}
											} else if (local32.aBoolean599) {
												local1818.method6845(Static562.aClass154_9, (Class20_Sub4) null, local32.anInt8876 << 2, 1);
											} else {
												local1818.method6862(Static562.aClass154_9, (Class20_Sub4) null, 1);
												if (local32.aClass20_Sub8_7 != null) {
													Static162.aClass100_7.method8844(local32.aClass20_Sub8_7.method6642());
												}
											}
											if (Static462.aBoolean556) {
												Static162.aClass100_7.KA(arg9, arg2, arg5, arg0);
											}
											if (local32.aBoolean588) {
												Static162.aClass100_7.C(true);
											}
										}
										if (Static389.aBoolean497) {
											if (arg6) {
												Static347.method5621(local78, local71, local63, local58);
											} else {
												Static168.method3100(local58, local78, local63, local71);
											}
										}
									} else if (local32.anInt8816 == 9) {
										if (local32.aBoolean600) {
											local295 = local133 + local32.anInt8814;
											local1489 = local133;
											local599 = local32.anInt8801 + local128;
										} else {
											local295 = local133;
											local599 = local32.anInt8801 + local128;
											local1489 = local133 + local32.anInt8814;
										}
										if (local32.anInt8781 == 1) {
											Static162.aClass100_7.method8781(local128, local295, local599, local1489, local32.anInt8827, 0);
										} else {
											Static162.aClass100_7.method8835(local128, local295, local599, local1489, local32.anInt8827, local32.anInt8781);
										}
										if (Static389.aBoolean497) {
											if (arg6) {
												Static347.method5621(local78, local71, local63, local58);
											} else {
												Static168.method3100(local58, local78, local63, local71);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!gda;BLclient!gda;)V")
	public static void method7922(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		if (arg1.aClass20_68 != null) {
			arg1.method9004();
		}
		arg1.aClass20_67 = arg0;
		arg1.aClass20_68 = arg0.aClass20_68;
		arg1.aClass20_68.aClass20_67 = arg1;
		arg1.aClass20_67.aClass20_68 = arg1;
	}
}
