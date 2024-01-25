import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "[Lclient!ae;")
	public static Class9_Sub1_Sub1_Sub1[] aClass9_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lclient!kw;")
	public static Class6_Sub5_Sub19 method5721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub5_Sub19 local15 = (Class6_Sub5_Sub19) Static237.aClass380_17.method8747((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class6_Sub5_Sub19(arg1, arg0);
			Static237.aClass380_17.method8753(local15, local15.aLong278);
		}
		return local15;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	public static void method5722() {
		if (Static96.anInt2770 > 1) {
			Static440.anInt7977 = Static51.anInt1750;
			Static96.anInt2770--;
		}
		if (Static450.aBoolean650) {
			Static450.aBoolean650 = false;
			Static49.method1563();
			return;
		}
		if (!Static199.aBoolean358) {
			Static95.method2327();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static395.method6253(); local29++) {
		}
		if (Static333.anInt6626 != 10) {
			return;
		}
		@Pc(55) Class6_Sub17 local55;
		@Pc(66) int local66;
		while (Static165.method3161()) {
			local55 = Static330.method7824(Static108.aClass185_27, Static569.aClass134_2);
			local55.aClass6_Sub8_Sub1_2.method8211(0);
			local66 = local55.aClass6_Sub8_Sub1_2.anInt10061;
			Static615.method8461(local55.aClass6_Sub8_Sub1_2);
			local55.aClass6_Sub8_Sub1_2.method8228(local55.aClass6_Sub8_Sub1_2.anInt10061 - local66);
			Static452.method6867(local55);
		}
		if (Static500.aClass6_Sub7_8 == null) {
			if (Static582.method8056() >= Static23.aLong13) {
				Static500.aClass6_Sub7_8 = Static126.aClass279_1.method6967(Static184.aClass358_1.aString107);
			}
		} else if (Static500.aClass6_Sub7_8.anInt1412 != -1) {
			local55 = Static330.method7824(Static380.aClass185_76, Static569.aClass134_2);
			local55.aClass6_Sub8_Sub1_2.method8241(Static500.aClass6_Sub7_8.anInt1412);
			Static452.method6867(local55);
			Static500.aClass6_Sub7_8 = null;
			Static23.aLong13 = Static582.method8056() + 30000L;
		}
		@Pc(139) Class6_Sub22 local139 = (Class6_Sub22) Static313.aClass163_35.method4966();
		@Pc(152) int local152;
		@Pc(176) int local176;
		@Pc(192) int local192;
		@Pc(242) int local242;
		@Pc(249) int local249;
		@Pc(260) int local260;
		@Pc(150) Class6_Sub17 local150;
		if (local139 != null || Static582.method8056() - 2000L > Static208.aLong129) {
			local150 = null;
			local152 = 0;
			for (@Pc(157) Class6_Sub22 local157 = (Class6_Sub22) Static494.aClass163_52.method4966(); local157 != null && (local150 == null || local150.aClass6_Sub8_Sub1_2.anInt10061 - local152 < 240); local157 = (Class6_Sub22) Static494.aClass163_52.method4965()) {
				local157.method8792();
				local176 = local157.method3458();
				if (local176 < -1) {
					local176 = -1;
				} else if (local176 > 65534) {
					local176 = 65534;
				}
				local192 = local157.method3462();
				if (local192 < -1) {
					local192 = -1;
				} else if (local192 > 65534) {
					local192 = 65534;
				}
				if (local192 != Static218.anInt4660 || Static213.anInt4577 != local176) {
					if (local150 == null) {
						local150 = Static330.method7824(Static580.aClass185_109, Static569.aClass134_2);
						local150.aClass6_Sub8_Sub1_2.method8211(0);
						local152 = local150.aClass6_Sub8_Sub1_2.anInt10061;
					}
					local242 = local192 - Static218.anInt4660;
					Static218.anInt4660 = local192;
					local249 = local176 - Static213.anInt4577;
					Static213.anInt4577 = local176;
					local260 = (int) ((local157.method3461() - Static208.aLong129) / 20L);
					if (local260 < 8 && local242 >= -32 && local242 <= 31 && local249 >= -32 && local249 <= 31) {
						local242 += 32;
						local249 += 32;
						local150.aClass6_Sub8_Sub1_2.method8241(local249 + (local260 << 12) + (local242 << 6));
					} else if (local260 < 32 && local242 >= -128 && local242 <= 127 && local249 >= -128 && local249 <= 127) {
						local242 += 128;
						local150.aClass6_Sub8_Sub1_2.method8211(local260 + 128);
						local249 += 128;
						local150.aClass6_Sub8_Sub1_2.method8241(local249 + (local242 << 8));
					} else if (local260 >= 32) {
						local150.aClass6_Sub8_Sub1_2.method8241(local260 + 57344);
						if (local192 == 1 || local176 == -1) {
							local150.aClass6_Sub8_Sub1_2.method8202(Integer.MIN_VALUE);
						} else {
							local150.aClass6_Sub8_Sub1_2.method8202(local192 | local176 << 16);
						}
					} else {
						local150.aClass6_Sub8_Sub1_2.method8211(local260 + 192);
						if (local192 == 1 || local176 == -1) {
							local150.aClass6_Sub8_Sub1_2.method8202(Integer.MIN_VALUE);
						} else {
							local150.aClass6_Sub8_Sub1_2.method8202(local192 | local176 << 16);
						}
					}
					Static208.aLong129 = local157.method3461();
				}
			}
			if (local150 != null) {
				local150.aClass6_Sub8_Sub1_2.method8228(local150.aClass6_Sub8_Sub1_2.anInt10061 - local152);
				Static452.method6867(local150);
			}
		}
		@Pc(457) int local457;
		if (local139 != null) {
			@Pc(443) long local443 = (local139.method3461() - Static440.aLong214) / 50L;
			Static440.aLong214 = local139.method3461();
			if (local443 > 32767L) {
				local443 = 32767L;
			}
			local457 = local139.method3458();
			if (local457 < 0) {
				local457 = 0;
			} else if (local457 > 65535) {
				local457 = 65535;
			}
			local176 = local139.method3462();
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 65535) {
				local176 = 65535;
			}
			@Pc(490) byte local490 = 0;
			if (local139.method3463() == 2) {
				local490 = 1;
			}
			local242 = (int) local443;
			@Pc(509) Class6_Sub17 local509 = Static330.method7824(Static381.aClass185_77, Static569.aClass134_2);
			local509.aClass6_Sub8_Sub1_2.method8241(local490 << 15 | local242);
			local509.aClass6_Sub8_Sub1_2.method8202(local176 | local457 << 16);
			Static452.method6867(local509);
		}
		if (Static26.anInt772 > 0) {
			local150 = Static330.method7824(Static367.aClass185_103, Static569.aClass134_2);
			local150.aClass6_Sub8_Sub1_2.method8211(Static26.anInt772 * 3);
			for (local152 = 0; local152 < Static26.anInt772; local152++) {
				@Pc(563) Interface8 local563 = Static577.anInterface8Array3[local152];
				@Pc(571) long local571 = (local563.method2086() - Static510.aLong238) / 50L;
				Static510.aLong238 = local563.method2086();
				if (local571 > 65535L) {
					local571 = 65535L;
				}
				local150.aClass6_Sub8_Sub1_2.method8211(local563.method2085());
				local150.aClass6_Sub8_Sub1_2.method8241((int) local571);
			}
			Static452.method6867(local150);
		}
		if (Static231.anInt5131 > 0) {
			Static231.anInt5131--;
		}
		if (Static94.aBoolean215 && Static231.anInt5131 <= 0) {
			Static94.aBoolean215 = false;
			Static231.anInt5131 = 20;
			local150 = Static330.method7824(Static344.aClass185_68, Static569.aClass134_2);
			local150.aClass6_Sub8_Sub1_2.method8212((int) Static532.aFloat179 >> 3);
			local150.aClass6_Sub8_Sub1_2.method8241((int) Static595.aFloat184 >> 3);
			Static452.method6867(local150);
		}
		if (Static8.aBoolean55 != Static181.aBoolean323) {
			Static181.aBoolean323 = Static8.aBoolean55;
			local150 = Static330.method7824(Static409.aClass185_84, Static569.aClass134_2);
			local150.aClass6_Sub8_Sub1_2.method8211(Static8.aBoolean55 ? 1 : 0);
			Static452.method6867(local150);
		}
		if (!Static406.aBoolean589) {
			local150 = Static330.method7824(Static33.aClass185_12, Static569.aClass134_2);
			local150.aClass6_Sub8_Sub1_2.method8211(0);
			local152 = local150.aClass6_Sub8_Sub1_2.anInt10061;
			@Pc(719) Class6_Sub8 local719 = Static87.aClass6_Sub33_6.method4999();
			local150.aClass6_Sub8_Sub1_2.method8234(local719.aByteArray102, local719.anInt10061, 0);
			local150.aClass6_Sub8_Sub1_2.method8228(local150.aClass6_Sub8_Sub1_2.anInt10061 - local152);
			Static452.method6867(local150);
			Static406.aBoolean589 = true;
		}
		if (Static26.aClass186ArrayArrayArray1 != null) {
			if (Static554.anInt9497 == 2) {
				Static55.method1671();
			} else if (Static554.anInt9497 == 3) {
				Static345.method5703();
			}
		}
		if (Static8.aBoolean54) {
			Static8.aBoolean54 = false;
		} else {
			Static338.aFloat133 /= 2.0F;
		}
		if (Static533.aBoolean740) {
			Static533.aBoolean740 = false;
		} else {
			Static529.aFloat136 /= 2.0F;
		}
		Static273.method4861();
		if (Static333.anInt6626 != 10) {
			return;
		}
		Static564.method7935();
		Static473.method7032();
		Static232.method4369();
		Static85.anInt2620++;
		if (Static85.anInt2620 > 750) {
			Static49.method1563();
			return;
		}
		Static103.method2429();
		Static385.method6057();
		Static601.method8314();
		for (local66 = Static140.aClass157_1.method4857(true); local66 != -1; local66 = Static140.aClass157_1.method4857(false)) {
			Static598.method8286(local66);
			Static176.anIntArray184[Static423.anInt7806++ & 0x1F] = local66;
		}
		@Pc(901) Class302 local901;
		for (@Pc(850) Class6_Sub5_Sub19 local850 = Static621.method8511(); local850 != null; local850 = Static621.method8511()) {
			local457 = local850.method5178();
			local176 = local850.method5176();
			if (local457 == 1) {
				Static267.anIntArray256[local176] = local850.anInt6198;
				Static128.aBoolean242 |= Static272.aBooleanArray10[local176];
				Static548.anIntArray502[Static547.anInt512++ & 0x1F] = local176;
			} else if (local457 == 2) {
				Static19.aStringArray1[local176] = local850.aString68;
				Static286.anIntArray266[Static171.anInt3809++ & 0x1F] = local176;
			} else if (local457 == 3) {
				local901 = Static299.method5103(local176);
				if (!local850.aString68.equals(local901.aString90)) {
					local901.aString90 = local850.aString68;
					Static580.method8049(local901);
				}
			} else if (local457 == 4) {
				local901 = Static299.method5103(local176);
				local242 = local850.anInt6198;
				local249 = local850.anInt6195;
				local260 = local850.anInt6197;
				if (local901.anInt8856 != local242 || local249 != local901.anInt8927 || local260 != local901.anInt8845) {
					local901.anInt8856 = local242;
					local901.anInt8927 = local249;
					local901.anInt8845 = local260;
					Static580.method8049(local901);
				}
			} else if (local457 == 5) {
				local901 = Static299.method5103(local176);
				if (local901.anInt8844 != local850.anInt6198 || local850.anInt6198 == -1) {
					local901.anInt8844 = local850.anInt6198;
					local901.anInt8900 = 0;
					local901.anInt8910 = 0;
					local901.anInt8889 = 1;
					@Pc(1396) Class113 local1396 = local901.anInt8844 == -1 ? null : Static528.aClass198_2.method5706(local901.anInt8844);
					if (local1396 != null) {
						Static493.method7164(local901.anInt8900, local1396);
					}
					Static580.method8049(local901);
				}
			} else if (local457 == 6) {
				local192 = local850.anInt6198;
				local242 = local192 >> 10 & 0x1F;
				local249 = local192 >> 5 & 0x1F;
				local260 = local192 & 0x1F;
				@Pc(1334) int local1334 = (local249 << 11) + (local242 << 19) + (local260 << 3);
				@Pc(1338) Class302 local1338 = Static299.method5103(local176);
				if (local1334 != local1338.anInt8859) {
					local1338.anInt8859 = local1334;
					Static580.method8049(local1338);
				}
			} else if (local457 == 7) {
				local901 = Static299.method5103(local176);
				@Pc(1281) boolean local1281 = local850.anInt6198 == 1;
				if (local901.aBoolean721 != local1281) {
					local901.aBoolean721 = local1281;
					Static580.method8049(local901);
				}
			} else if (local457 == 8) {
				local901 = Static299.method5103(local176);
				if (local850.anInt6198 != local901.anInt8907 || local901.anInt8849 != local850.anInt6195 || local850.anInt6197 != local901.anInt8869) {
					local901.anInt8907 = local850.anInt6198;
					local901.anInt8869 = local850.anInt6197;
					local901.anInt8849 = local850.anInt6195;
					if (local901.anInt8899 != -1) {
						if (local901.anInt8855 > 0) {
							local901.anInt8869 = local901.anInt8869 * 32 / local901.anInt8855;
						} else if (local901.anInt8858 > 0) {
							local901.anInt8869 = local901.anInt8869 * 32 / local901.anInt8858;
						}
					}
					Static580.method8049(local901);
				}
			} else if (local457 == 9) {
				local901 = Static299.method5103(local176);
				if (local850.anInt6198 != local901.anInt8899 || local901.anInt8931 != local850.anInt6195) {
					local901.anInt8931 = local850.anInt6195;
					local901.anInt8899 = local850.anInt6198;
					Static580.method8049(local901);
				}
			} else if (local457 == 10) {
				local901 = Static299.method5103(local176);
				if (local850.anInt6198 != local901.anInt8878 || local901.anInt8880 != local850.anInt6195 || local901.anInt8929 != local850.anInt6197) {
					local901.anInt8929 = local850.anInt6197;
					local901.anInt8878 = local850.anInt6198;
					local901.anInt8880 = local850.anInt6195;
					Static580.method8049(local901);
				}
			} else if (local457 == 11) {
				local901 = Static299.method5103(local176);
				local901.aByte112 = 0;
				local901.aByte110 = 0;
				local901.anInt8930 = local901.anInt8885 = local850.anInt6198;
				local901.anInt8897 = local901.anInt8854 = local850.anInt6195;
				Static580.method8049(local901);
			} else if (local457 == 12) {
				local901 = Static299.method5103(local176);
				local242 = local850.anInt6198;
				if (local901 != null && local901.anInt8936 == 0) {
					if (local901.anInt8853 - local901.anInt8872 < local242) {
						local242 = local901.anInt8853 - local901.anInt8872;
					}
					if (local242 < 0) {
						local242 = 0;
					}
					if (local242 != local901.anInt8847) {
						local901.anInt8847 = local242;
						Static580.method8049(local901);
					}
				}
			} else if (local457 == 14) {
				local901 = Static299.method5103(local176);
				local901.anInt8860 = local850.anInt6198;
			} else if (local457 == 15) {
				Static473.anInt8390 = local850.anInt6198;
				Static445.anInt8080 = local850.anInt6195;
				Static622.aBoolean830 = true;
			} else if (local457 == 16) {
				local901 = Static299.method5103(local176);
				local901.anInt8877 = local850.anInt6198;
			} else if (local457 == 17) {
				local901 = Static299.method5103(local176);
				local901.anInt8846 = local850.anInt6198;
			}
		}
		Static492.anInt8597++;
		if (Static109.anInt2941 != 0) {
			Static516.anInt9014 += 20;
			if (Static516.anInt9014 >= 400) {
				Static109.anInt2941 = 0;
			}
		}
		if (Static146.aClass302_10 != null) {
			Static428.anInt7856++;
			if (Static428.anInt7856 >= 15) {
				Static580.method8049(Static146.aClass302_10);
				Static146.aClass302_10 = null;
			}
		}
		Static302.aClass302_8 = null;
		Static423.aBoolean623 = false;
		Static23.aClass302_1 = null;
		Static308.aBoolean477 = false;
		Static13.method524(-1, -1, (Class302) null);
		Static527.method7491(-1, (Class302) null, -1);
		if (!Static141.aBoolean262) {
			Static329.anInt6606 = -1;
		}
		Static7.method448();
		Static51.anInt1750++;
		if (Static185.aBoolean330) {
			@Pc(1530) Class6_Sub17 local1530 = Static330.method7824(Static496.aClass185_97, Static569.aClass134_2);
			local1530.aClass6_Sub8_Sub1_2.method8249(Static640.anInt10720 | Static233.anInt5198 << 14 | Static571.anInt9786 << 28);
			Static452.method6867(local1530);
			Static185.aBoolean330 = false;
		}
		while (true) {
			@Pc(1555) Class6_Sub29 local1555;
			@Pc(1560) Class302 local1560;
			do {
				local1555 = (Class6_Sub29) Static341.aClass163_38.method4969();
				if (local1555 == null) {
					while (true) {
						do {
							local1555 = (Class6_Sub29) Static184.aClass163_22.method4969();
							if (local1555 == null) {
								while (true) {
									do {
										local1555 = (Class6_Sub29) Static138.aClass163_17.method4969();
										if (local1555 == null) {
											if (Static23.aClass302_1 == null) {
												Static517.anInt9024 = 0;
											}
											if (Static448.aClass302_13 != null) {
												Static401.method6299();
											}
											if (Static497.anInt8643 > 0 && Static391.aClass91_1.method6224(82) && Static391.aClass91_1.method6224(81) && Static551.anInt9470 != 0) {
												local457 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 - Static551.anInt9470;
												if (local457 < 0) {
													local457 = 0;
												} else if (local457 > 3) {
													local457 = 3;
												}
												Static602.method8316(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0] + Static227.anInt5049, Static477.anInt8412 + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0], local457);
											}
											Static372.method5918();
											for (local457 = 0; local457 < 5; local457++) {
												@Pc(1760) int local1760 = Static382.anIntArray344[local457]++;
											}
											if (Static128.aBoolean242 && Static135.aLong82 < Static582.method8056() - 60000L) {
												Static48.method1562();
											}
											for (@Pc(1787) Class9_Sub1_Sub2 local1787 = (Class9_Sub1_Sub2) Static220.aClass234_13.method6092(); local1787 != null; local1787 = (Class9_Sub1_Sub2) Static220.aClass234_13.method6098()) {
												if (Static582.method8056() / 1000L - 5L > (long) local1787.anInt5336) {
													if (local1787.aShort48 > 0) {
														Static548.method7725(5, local1787.aString50 + Static536.aClass316_21.method7577(Static638.anInt10709), 0, "", "", "");
													}
													if (local1787.aShort48 == 0) {
														Static548.method7725(5, local1787.aString50 + Static536.aClass316_22.method7577(Static638.anInt10709), 0, "", "", "");
													}
													local1787.method8408();
												}
											}
											Static362.anInt6998++;
											if (Static362.anInt6998 > 500) {
												Static362.anInt6998 = 0;
												local192 = (int) (Math.random() * 8.0D);
												if ((local192 & 0x1) == 1) {
													Static527.anInt9189 += Static361.anInt6978;
												}
												if ((local192 & 0x2) == 2) {
													Static211.anInt4068 += Static243.anInt4638;
												}
												if ((local192 & 0x4) == 4) {
													Static141.anInt3352 += Static70.anInt2371;
												}
											}
											if (Static527.anInt9189 < -50) {
												Static361.anInt6978 = 2;
											}
											if (Static527.anInt9189 > 50) {
												Static361.anInt6978 = -2;
											}
											if (Static211.anInt4068 < -55) {
												Static243.anInt4638 = 2;
											}
											if (Static141.anInt3352 < -40) {
												Static70.anInt2371 = 1;
											}
											if (Static211.anInt4068 > 55) {
												Static243.anInt4638 = -2;
											}
											Static420.anInt7795++;
											if (Static141.anInt3352 > 40) {
												Static70.anInt2371 = -1;
											}
											if (Static420.anInt7795 > 500) {
												Static420.anInt7795 = 0;
												local192 = (int) (Math.random() * 8.0D);
												if ((local192 & 0x2) == 2) {
													Static289.anInt10738 += Static450.anInt8127;
												}
												if ((local192 & 0x1) == 1) {
													Static372.anInt7080 += Static315.anInt6314;
												}
											}
											if (Static372.anInt7080 < -60) {
												Static315.anInt6314 = 2;
											}
											if (Static289.anInt10738 < -20) {
												Static450.anInt8127 = 1;
											}
											if (Static372.anInt7080 > 60) {
												Static315.anInt6314 = -2;
											}
											Static360.anInt6970++;
											if (Static289.anInt10738 > 10) {
												Static450.anInt8127 = -1;
											}
											if (Static360.anInt6970 > 50) {
												@Pc(2010) Class6_Sub17 local2010 = Static330.method7824(Static457.aClass185_92, Static569.aClass134_2);
												Static452.method6867(local2010);
											}
											if (Static309.aBoolean481) {
												Static383.method6044();
												Static309.aBoolean481 = false;
											}
											try {
												Static169.method3193();
												return;
											} catch (@Pc(2025) IOException local2025) {
												Static49.method1563();
												return;
											}
										}
										local1560 = local1555.aClass302_7;
										if (local1560.anInt8898 < 0) {
											break;
										}
										local901 = Static299.method5103(local1560.anInt8857);
									} while (local901 == null || local901.aClass302Array2 == null || local901.aClass302Array2.length <= local1560.anInt8898 || local1560 != local901.aClass302Array2[local1560.anInt8898]);
									Static435.method6669(local1555);
								}
							}
							local1560 = local1555.aClass302_7;
							if (local1560.anInt8898 < 0) {
								break;
							}
							local901 = Static299.method5103(local1560.anInt8857);
						} while (local901 == null || local901.aClass302Array2 == null || local1560.anInt8898 >= local901.aClass302Array2.length || local901.aClass302Array2[local1560.anInt8898] != local1560);
						Static435.method6669(local1555);
					}
				}
				local1560 = local1555.aClass302_7;
				if (local1560.anInt8898 < 0) {
					break;
				}
				local901 = Static299.method5103(local1560.anInt8857);
			} while (local901 == null || local901.aClass302Array2 == null || local1560.anInt8898 >= local901.aClass302Array2.length || local901.aClass302Array2[local1560.anInt8898] != local1560);
			Static435.method6669(local1555);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
	public static void method5723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class40 local13 = Static144.aClass40ArrayArray12[arg1][arg0];
		Static593.method8179(arg2, local13 == null ? Static164.aClass40_2 : local13);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	public static void method5724(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub5_Sub19 local8 = method5721(arg0, 10);
		local8.method5174();
	}
}
