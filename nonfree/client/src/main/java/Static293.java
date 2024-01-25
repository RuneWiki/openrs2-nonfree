import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIB)[B")
	public static byte[] method6370(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = new byte[arg1];
		Static681.method2476(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method6383() {
		Static52.aClass187_8.method4076();
		Static23.aClass73_1.method1819();
		Static196.aClass73_3.method1819();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
	public static void method6393() {
		if (Static192.anInt3587 > 1) {
			Static514.anInt9026 = Static441.anInt7833;
			Static192.anInt3587--;
		}
		if (Static91.aBoolean169) {
			Static91.aBoolean169 = false;
			Static456.method6584();
			return;
		}
		if (!Static505.aBoolean629) {
			Static229.method3485();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static54.method1179(); local29++) {
		}
		if (Static430.anInt7691 != 10) {
			return;
		}
		@Pc(51) Class14_Sub19 local51;
		@Pc(60) int local60;
		while (Static75.method1421()) {
			local51 = Static286.method4081(Static205.aClass394_1, Static615.aClass100_130);
			local51.aClass14_Sub29_Sub1_1.method5854(0);
			local60 = local51.aClass14_Sub29_Sub1_1.anInt7264;
			Static260.method3777(local51.aClass14_Sub29_Sub1_1);
			local51.aClass14_Sub29_Sub1_1.method5853(local51.aClass14_Sub29_Sub1_1.anInt7264 - local60);
			Static576.method8234(local51);
		}
		if (Static178.aClass14_Sub4_1 == null) {
			if (Static639.aLong293 <= Static521.method7499()) {
				Static178.aClass14_Sub4_1 = Static7.aClass361_1.method8677(Static92.aClass337_1.aString103);
			}
		} else if (Static178.aClass14_Sub4_1.anInt458 != -1) {
			local51 = Static286.method4081(Static205.aClass394_1, Static143.aClass100_43);
			local51.aClass14_Sub29_Sub1_1.method5859(Static178.aClass14_Sub4_1.anInt458);
			Static576.method8234(local51);
			Static178.aClass14_Sub4_1 = null;
			Static639.aLong293 = Static521.method7499() + 30000L;
		}
		@Pc(129) Class14_Sub30 local129 = (Class14_Sub30) Static425.aClass262_44.method6318();
		@Pc(142) int local142;
		@Pc(165) int local165;
		@Pc(181) int local181;
		@Pc(230) int local230;
		@Pc(237) int local237;
		@Pc(248) int local248;
		@Pc(140) Class14_Sub19 local140;
		if (local129 != null || Static562.aLong254 < Static521.method7499() - 2000L) {
			local140 = null;
			local142 = 0;
			for (@Pc(147) Class14_Sub30 local147 = (Class14_Sub30) Static205.aClass262_17.method6318(); local147 != null && (local140 == null || local140.aClass14_Sub29_Sub1_1.anInt7264 - local142 < 240); local147 = (Class14_Sub30) Static205.aClass262_17.method6311()) {
				local147.method9315();
				local165 = local147.method8571();
				if (local165 < -1) {
					local165 = -1;
				} else if (local165 > 65534) {
					local165 = 65534;
				}
				local181 = local147.method8578();
				if (local181 < -1) {
					local181 = -1;
				} else if (local181 > 65534) {
					local181 = 65534;
				}
				if (Static605.anInt10203 != local181 || Static2.anInt5 != local165) {
					if (local140 == null) {
						local140 = Static286.method4081(Static205.aClass394_1, Static42.aClass100_16);
						local140.aClass14_Sub29_Sub1_1.method5854(0);
						local142 = local140.aClass14_Sub29_Sub1_1.anInt7264;
					}
					local230 = local181 - Static605.anInt10203;
					Static605.anInt10203 = local181;
					local237 = local165 - Static2.anInt5;
					Static2.anInt5 = local165;
					local248 = (int) ((local147.method8577() - Static562.aLong254) / 20L);
					if (local248 < 8 && local230 >= -32 && local230 <= 31 && local237 >= -32 && local237 <= 31) {
						local237 += 32;
						local230 += 32;
						local140.aClass14_Sub29_Sub1_1.method5859(local237 + (local248 << 12) + (local230 << 6));
					} else if (local248 < 32 && local230 >= -128 && local230 <= 127 && local237 >= -128 && local237 <= 127) {
						local140.aClass14_Sub29_Sub1_1.method5854(local248 + 128);
						local237 += 128;
						local230 += 128;
						local140.aClass14_Sub29_Sub1_1.method5859(local237 + (local230 << 8));
					} else if (local248 < 32) {
						local140.aClass14_Sub29_Sub1_1.method5854(local248 + 192);
						if (local181 == 1 || local165 == -1) {
							local140.aClass14_Sub29_Sub1_1.method5861(Integer.MIN_VALUE);
						} else {
							local140.aClass14_Sub29_Sub1_1.method5861(local165 << 16 | local181);
						}
					} else {
						local140.aClass14_Sub29_Sub1_1.method5859(local248 + 57344);
						if (local181 == 1 || local165 == -1) {
							local140.aClass14_Sub29_Sub1_1.method5861(Integer.MIN_VALUE);
						} else {
							local140.aClass14_Sub29_Sub1_1.method5861(local165 << 16 | local181);
						}
					}
					Static562.aLong254 = local147.method8577();
				}
			}
			if (local140 != null) {
				local140.aClass14_Sub29_Sub1_1.method5853(local140.aClass14_Sub29_Sub1_1.anInt7264 - local142);
				Static576.method8234(local140);
			}
		}
		@Pc(444) int local444;
		if (local129 != null) {
			@Pc(430) long local430 = (local129.method8577() - Static662.aLong299) / 50L;
			if (local430 > 32767L) {
				local430 = 32767L;
			}
			Static662.aLong299 = local129.method8577();
			local444 = local129.method8571();
			if (local444 < 0) {
				local444 = 0;
			} else if (local444 > 65535) {
				local444 = 65535;
			}
			local165 = local129.method8578();
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 65535) {
				local165 = 65535;
			}
			@Pc(478) byte local478 = 0;
			if (local129.method8572() == 2) {
				local478 = 1;
			}
			local230 = (int) local430;
			@Pc(499) Class14_Sub19 local499 = Static286.method4081(Static205.aClass394_1, Static61.aClass100_25);
			local499.aClass14_Sub29_Sub1_1.method5875(local165 | local444 << 16);
			local499.aClass14_Sub29_Sub1_1.method5871(local230 | local478 << 15);
			Static576.method8234(local499);
		}
		@Pc(555) long local555;
		if (Static189.anInt3564 > 0) {
			local140 = Static286.method4081(Static205.aClass394_1, Static404.aClass100_102);
			local140.aClass14_Sub29_Sub1_1.method5854(Static189.anInt3564 * 3);
			for (local142 = 0; local142 < Static189.anInt3564; local142++) {
				@Pc(546) Interface7 local546 = Static594.anInterface7Array2[local142];
				local555 = (local546.method3431() - Static595.aLong265) / 50L;
				Static595.aLong265 = local546.method3431();
				if (local555 > 65535L) {
					local555 = 65535L;
				}
				local140.aClass14_Sub29_Sub1_1.method5854(local546.method3427());
				local140.aClass14_Sub29_Sub1_1.method5859((int) local555);
			}
			Static576.method8234(local140);
		}
		if (Static326.anInt6184 > 0) {
			Static326.anInt6184--;
		}
		if (Static137.aBoolean207 && Static326.anInt6184 <= 0) {
			Static326.anInt6184 = 20;
			Static137.aBoolean207 = false;
			local140 = Static286.method4081(Static205.aClass394_1, Static226.aClass100_89);
			local140.aClass14_Sub29_Sub1_1.method5894((int) Static2.aFloat1 >> 3);
			local140.aClass14_Sub29_Sub1_1.method5859((int) Static543.aFloat228 >> 3);
			Static576.method8234(local140);
		}
		if (Static240.aBoolean304 != Static645.aBoolean743) {
			Static240.aBoolean304 = Static645.aBoolean743;
			local140 = Static286.method4081(Static205.aClass394_1, Static217.aClass100_63);
			local140.aClass14_Sub29_Sub1_1.method5854(Static645.aBoolean743 ? 1 : 0);
			Static576.method8234(local140);
		}
		if (!Static26.aBoolean36) {
			local140 = Static286.method4081(Static205.aClass394_1, Static43.aClass100_17);
			local140.aClass14_Sub29_Sub1_1.method5854(0);
			local142 = local140.aClass14_Sub29_Sub1_1.anInt7264;
			@Pc(684) Class14_Sub29 local684 = Static56.aClass14_Sub22_5.method3007();
			local140.aClass14_Sub29_Sub1_1.method5838(0, local684.aByteArray84, local684.anInt7264);
			local140.aClass14_Sub29_Sub1_1.method5853(local140.aClass14_Sub29_Sub1_1.anInt7264 - local142);
			Static576.method8234(local140);
			Static26.aBoolean36 = true;
		}
		if (Static486.aClass58ArrayArrayArray2 != null) {
			if (Static378.anInt6935 == 2) {
				Static421.method6234();
			} else if (Static378.anInt6935 == 3) {
				Static222.method3454();
			}
		}
		if (Static492.aBoolean626) {
			Static492.aBoolean626 = false;
		} else {
			Static117.aFloat269 /= 2.0F;
		}
		if (Static644.aBoolean742) {
			Static644.aBoolean742 = false;
		} else {
			Static456.aFloat185 /= 2.0F;
		}
		Static579.method8266();
		if (Static430.anInt7691 != 10) {
			return;
		}
		Static529.method7862();
		Static32.method7752();
		Static341.method5278();
		Static487.anInt9463++;
		if (Static487.anInt9463 > 750) {
			Static456.method6584();
			return;
		}
		Static584.method8336();
		Static64.method1267();
		Static322.method5082();
		for (local60 = Static595.aClass241_1.method5823(true); local60 != -1; local60 = Static595.aClass241_1.method5823(false)) {
			Static21.method339(local60);
			Static626.anIntArray778[Static665.anInt4337++ & 0x1F] = local60;
		}
		for (@Pc(804) Class14_Sub3_Sub9 local804 = Static140.method2211(); local804 != null; local804 = Static140.method2211()) {
			local444 = local804.method2821();
			local555 = local804.method2824();
			if (local444 == 1) {
				Static259.anIntArray800[(int) local555] = local804.anInt3419;
				Static354.aBoolean460 |= Static330.aBooleanArray15[(int) local555];
				Static611.anIntArray752[Static283.anInt4863++ & 0x1F] = (int) local555;
			} else if (local444 == 2) {
				Static277.aStringArray13[(int) local555] = local804.aString44;
				Static638.anIntArray796[Static304.anInt5326++ & 0x1F] = (int) local555;
			} else {
				@Pc(861) Class230 local861;
				if (local444 == 3) {
					local861 = Static655.method9094((int) local555);
					if (!local804.aString44.equals(local861.aString72)) {
						local861.aString72 = local804.aString44;
						Static634.method8860(local861);
					}
				} else {
					@Pc(870) int local870;
					if (local444 == 4) {
						local861 = Static655.method9094((int) local555);
						local237 = local804.anInt3419;
						local248 = local804.anInt3413;
						local870 = local804.anInt3409;
						if (local861.anInt6680 != local237 || local248 != local861.anInt6674 || local861.anInt6648 != local870) {
							local861.anInt6674 = local248;
							local861.anInt6648 = local870;
							local861.anInt6680 = local237;
							Static634.method8860(local861);
						}
					} else if (local444 == 5) {
						local861 = Static655.method9094((int) local555);
						if (local861.anInt6637 != local804.anInt3419 || local804.anInt3419 == -1) {
							local861.anInt6728 = 0;
							local861.anInt6723 = 0;
							local861.anInt6666 = 1;
							local861.anInt6637 = local804.anInt3419;
							@Pc(946) Class275 local946 = local861.anInt6637 == -1 ? null : Static501.aClass191_2.method4322(local861.anInt6637);
							if (local946 != null) {
								Static493.method7314(local946, local861.anInt6728);
							}
							Static634.method8860(local861);
						}
					} else if (local444 == 6) {
						local230 = local804.anInt3419;
						local237 = local230 >> 10 & 0x1F;
						local248 = local230 >> 5 & 0x1F;
						local870 = local230 & 0x1F;
						@Pc(994) int local994 = (local870 << 3) + (local248 << 11) + (local237 << 19);
						@Pc(999) Class230 local999 = Static655.method9094((int) local555);
						if (local994 != local999.anInt6713) {
							local999.anInt6713 = local994;
							Static634.method8860(local999);
						}
					} else if (local444 == 7) {
						local861 = Static655.method9094((int) local555);
						@Pc(1392) boolean local1392 = local804.anInt3419 == 1;
						if (local861.aBoolean475 != local1392) {
							local861.aBoolean475 = local1392;
							Static634.method8860(local861);
						}
					} else if (local444 == 8) {
						local861 = Static655.method9094((int) local555);
						if (local861.anInt6640 != local804.anInt3419 || local861.anInt6685 != local804.anInt3413 || local861.anInt6710 != local804.anInt3409) {
							local861.anInt6640 = local804.anInt3419;
							local861.anInt6710 = local804.anInt3409;
							local861.anInt6685 = local804.anInt3413;
							if (local861.anInt6646 != -1) {
								if (local861.anInt6677 > 0) {
									local861.anInt6710 = local861.anInt6710 * 32 / local861.anInt6677;
								} else if (local861.anInt6656 > 0) {
									local861.anInt6710 = local861.anInt6710 * 32 / local861.anInt6656;
								}
							}
							Static634.method8860(local861);
						}
					} else if (local444 == 9) {
						local861 = Static655.method9094((int) local555);
						if (local861.anInt6646 != local804.anInt3419 || local804.anInt3413 != local861.anInt6692) {
							local861.anInt6692 = local804.anInt3413;
							local861.anInt6646 = local804.anInt3419;
							Static634.method8860(local861);
						}
					} else if (local444 == 10) {
						local861 = Static655.method9094((int) local555);
						if (local861.anInt6695 != local804.anInt3419 || local861.anInt6655 != local804.anInt3413 || local804.anInt3409 != local861.anInt6659) {
							local861.anInt6655 = local804.anInt3413;
							local861.anInt6695 = local804.anInt3419;
							local861.anInt6659 = local804.anInt3409;
							Static634.method8860(local861);
						}
					} else if (local444 == 11) {
						local861 = Static655.method9094((int) local555);
						local861.anInt6725 = local861.anInt6642 = local804.anInt3419;
						local861.aByte105 = 0;
						local861.aByte107 = 0;
						local861.anInt6676 = local861.anInt6699 = local804.anInt3413;
						Static634.method8860(local861);
					} else if (local444 == 12) {
						local861 = Static655.method9094((int) local555);
						local237 = local804.anInt3419;
						if (local861 != null && local861.anInt6660 == 0) {
							if (local237 > local861.anInt6638 - local861.anInt6701) {
								local237 = local861.anInt6638 - local861.anInt6701;
							}
							if (local237 < 0) {
								local237 = 0;
							}
							if (local861.anInt6641 != local237) {
								local861.anInt6641 = local237;
								Static634.method8860(local861);
							}
						}
					} else if (local444 == 14) {
						local861 = Static655.method9094((int) local555);
						local861.anInt6688 = local804.anInt3419;
					} else if (local444 == 15) {
						Static659.anInt10975 = local804.anInt3419;
						Static35.anInt964 = local804.anInt3413;
						Static378.aBoolean496 = true;
					} else if (local444 == 16) {
						local861 = Static655.method9094((int) local555);
						local861.anInt6690 = local804.anInt3419;
					} else if (local444 == 17) {
						local861 = Static655.method9094((int) local555);
						local861.anInt6671 = local804.anInt3419;
					} else if (local444 == 18) {
						local861 = Static655.method9094((int) local555);
						local237 = (int) (local555 >> 32);
						local861.method5471((short) local804.anInt3413, (short) local804.anInt3419, local237);
					} else if (local444 == 19) {
						local861 = Static655.method9094((int) local555);
						local237 = (int) (local555 >> 32);
						local861.method5470((short) local804.anInt3413, (short) local804.anInt3419, local237);
					}
				}
			}
		}
		Static475.anInt8259++;
		if (Static538.anInt9253 != 0) {
			Static285.anInt4869 += 20;
			if (Static285.anInt4869 >= 400) {
				Static538.anInt9253 = 0;
			}
		}
		if (Static137.aClass230_1 != null) {
			Static671.anInt11142++;
			if (Static671.anInt11142 >= 15) {
				Static634.method8860(Static137.aClass230_1);
				Static137.aClass230_1 = null;
			}
		}
		Static454.aBoolean547 = false;
		Static361.aClass230_7 = null;
		Static289.aClass230_3 = null;
		Static380.aBoolean497 = false;
		Static369.method5533((Class230) null, -1, -1);
		Static320.method5063((Class230) null, -1, -1);
		if (!Static238.aBoolean302) {
			Static416.anInt7542 = -1;
		}
		Static236.method3561();
		Static441.anInt7833++;
		if (Static672.aBoolean763) {
			@Pc(1523) Class14_Sub19 local1523 = Static286.method4081(Static205.aClass394_1, Static209.aClass100_60);
			local1523.aClass14_Sub29_Sub1_1.method5849(Static92.anInt2036 << 14 | Static671.anInt11144 << 28 | Static386.anInt7119);
			Static576.method8234(local1523);
			Static672.aBoolean763 = false;
		}
		while (true) {
			@Pc(1546) Class14_Sub55 local1546;
			@Pc(1562) Class230 local1562;
			@Pc(1551) Class230 local1551;
			do {
				local1546 = (Class14_Sub55) Static158.aClass262_14.method6323();
				if (local1546 == null) {
					while (true) {
						do {
							local1546 = (Class14_Sub55) Static490.aClass262_58.method6323();
							if (local1546 == null) {
								while (true) {
									do {
										local1546 = (Class14_Sub55) Static576.aClass262_67.method6323();
										if (local1546 == null) {
											if (Static289.aClass230_3 == null) {
												Static119.anInt2451 = 0;
											}
											if (Static299.aClass230_4 != null) {
												Static258.method3703();
											}
											if (Static447.anInt10238 > 0 && Static68.aClass65_1.method1565(82) && Static68.aClass65_1.method1565(81) && Static23.anInt426 != 0) {
												local444 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 - Static23.anInt426;
												if (local444 < 0) {
													local444 = 0;
												} else if (local444 > 3) {
													local444 = 3;
												}
												Static524.method7529(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray241[0] + Static329.anInt6225, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anIntArray242[0] + Static202.anInt3755, local444);
											}
											Static149.method5516();
											for (local444 = 0; local444 < 5; local444++) {
												@Pc(1757) int local1757 = Static417.anIntArray788[local444]++;
											}
											if (Static354.aBoolean460 && Static38.aLong23 < Static521.method7499() - 60000L) {
												Static559.method7855();
											}
											for (@Pc(1780) Class12_Sub7_Sub1 local1780 = (Class12_Sub7_Sub1) Static548.aClass376_9.method9008(); local1780 != null; local1780 = (Class12_Sub7_Sub1) Static548.aClass376_9.method9014()) {
												if ((long) local1780.anInt6098 < Static521.method7499() / 1000L - 5L) {
													if (local1780.aShort69 > 0) {
														Static149.method5512("", "", local1780.aString66 + Static514.aClass303_21.method7473(Static232.anInt4258), 5, 0, "");
													}
													if (local1780.aShort69 == 0) {
														Static149.method5512("", "", local1780.aString66 + Static514.aClass303_22.method7473(Static232.anInt4258), 5, 0, "");
													}
													local1780.method9143();
												}
											}
											Static113.anInt2285++;
											if (Static113.anInt2285 > 500) {
												Static113.anInt2285 = 0;
												local181 = (int) (Math.random() * 8.0D);
												if ((local181 & 0x1) == 1) {
													Static40.anInt1717 += Static451.anInt7927;
												}
												if ((local181 & 0x2) == 2) {
													Static121.anInt2453 += Static81.anInt1792;
												}
												if ((local181 & 0x4) == 4) {
													Static97.anInt2095 += Static526.anInt9139;
												}
											}
											if (Static40.anInt1717 < -50) {
												Static451.anInt7927 = 2;
											}
											if (Static121.anInt2453 < -55) {
												Static81.anInt1792 = 2;
											}
											if (Static40.anInt1717 > 50) {
												Static451.anInt7927 = -2;
											}
											if (Static97.anInt2095 < -40) {
												Static526.anInt9139 = 1;
											}
											if (Static121.anInt2453 > 55) {
												Static81.anInt1792 = -2;
											}
											if (Static97.anInt2095 > 40) {
												Static526.anInt9139 = -1;
											}
											Static642.anInt10722++;
											if (Static642.anInt10722 > 500) {
												Static642.anInt10722 = 0;
												local181 = (int) (Math.random() * 8.0D);
												if ((local181 & 0x2) == 2) {
													Static422.anInt7593 += Static576.anInt9887;
												}
												if ((local181 & 0x1) == 1) {
													Static470.anInt10171 += Static134.anInt4240;
												}
											}
											if (Static470.anInt10171 < -60) {
												Static134.anInt4240 = 2;
											}
											if (Static470.anInt10171 > 60) {
												Static134.anInt4240 = -2;
											}
											if (Static422.anInt7593 < -20) {
												Static576.anInt9887 = 1;
											}
											if (Static422.anInt7593 > 10) {
												Static576.anInt9887 = -1;
											}
											Static287.anInt4907++;
											if (Static287.anInt4907 > 50) {
												@Pc(1994) Class14_Sub19 local1994 = Static286.method4081(Static205.aClass394_1, Static269.aClass100_143);
												Static576.method8234(local1994);
											}
											if (Static434.aBoolean523) {
												Static28.method623();
												Static434.aBoolean523 = false;
											}
											try {
												Static363.method47();
												return;
											} catch (@Pc(2007) IOException local2007) {
												Static456.method6584();
												return;
											}
										}
										local1551 = local1546.aClass230_14;
										if (local1551.anInt6679 < 0) {
											break;
										}
										local1562 = Static655.method9094(local1551.anInt6668);
									} while (local1562 == null || local1562.aClass230Array2 == null || local1562.aClass230Array2.length <= local1551.anInt6679 || local1551 != local1562.aClass230Array2[local1551.anInt6679]);
									Static632.method8830(local1546);
								}
							}
							local1551 = local1546.aClass230_14;
							if (local1551.anInt6679 < 0) {
								break;
							}
							local1562 = Static655.method9094(local1551.anInt6668);
						} while (local1562 == null || local1562.aClass230Array2 == null || local1562.aClass230Array2.length <= local1551.anInt6679 || local1551 != local1562.aClass230Array2[local1551.anInt6679]);
						Static632.method8830(local1546);
					}
				}
				local1551 = local1546.aClass230_14;
				if (local1551.anInt6679 < 0) {
					break;
				}
				local1562 = Static655.method9094(local1551.anInt6668);
			} while (local1562 == null || local1562.aClass230Array2 == null || local1562.aClass230Array2.length <= local1551.anInt6679 || local1562.aClass230Array2[local1551.anInt6679] != local1551);
			Static632.method8830(local1546);
		}
	}
}
