import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!st", name = "t", descriptor = "S")
	public static short aShort15 = 256;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(JJ)J")
	public static long method379(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	public static void method382() {
		if (Static443.anInt7473 > 1) {
			Static443.anInt7473--;
			Static20.anInt442 = Static278.anInt4551;
		}
		if (Static156.aBoolean236) {
			Static156.aBoolean236 = false;
			Static18.method449();
			return;
		}
		if (!Static251.aBoolean343) {
			Static313.method4948();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static277.method4156(); local29++) {
		}
		if (Static469.anInt7883 != 10) {
			return;
		}
		@Pc(53) Class5_Sub40 local53;
		@Pc(62) int local62;
		while (Static406.method6231()) {
			local53 = Static25.method507(Static98.aClass208_2, Static270.aClass181_42);
			local53.aClass5_Sub12_Sub2_2.method8647(0);
			local62 = local53.aClass5_Sub12_Sub2_2.anInt10154;
			Static85.method1340(local53.aClass5_Sub12_Sub2_2);
			local53.aClass5_Sub12_Sub2_2.method8652(local53.aClass5_Sub12_Sub2_2.anInt10154 - local62);
			Static612.method8496(local53);
		}
		if (Static214.aClass5_Sub44_1 == null) {
			if (Static205.method3179() >= Static357.aLong178) {
				Static214.aClass5_Sub44_1 = Static525.aClass340_1.method8132(Static282.aClass109_2.aString44);
			}
		} else if (Static214.aClass5_Sub44_1.anInt9280 != -1) {
			local53 = Static25.method507(Static98.aClass208_2, Static473.aClass181_67);
			local53.aClass5_Sub12_Sub2_2.method8655(Static214.aClass5_Sub44_1.anInt9280);
			Static612.method8496(local53);
			Static214.aClass5_Sub44_1 = null;
			Static357.aLong178 = Static205.method3179() + 30000L;
		}
		@Pc(131) Class5_Sub33 local131 = (Class5_Sub33) Static622.aClass306_65.method7313();
		@Pc(148) int local148;
		@Pc(173) int local173;
		@Pc(192) int local192;
		@Pc(238) int local238;
		@Pc(244) int local244;
		@Pc(255) int local255;
		@Pc(146) Class5_Sub40 local146;
		if (local131 != null || Static96.aLong58 < Static205.method3179() - 2000L) {
			local146 = null;
			local148 = 0;
			for (@Pc(153) Class5_Sub33 local153 = (Class5_Sub33) Static103.aClass306_11.method7313(); local153 != null && (local146 == null || local146.aClass5_Sub12_Sub2_2.anInt10154 - local148 < 240); local153 = (Class5_Sub33) Static103.aClass306_11.method7301()) {
				local153.method8911();
				local173 = local153.method6094();
				if (local173 < -1) {
					local173 = -1;
				} else if (local173 > 65534) {
					local173 = 65534;
				}
				local192 = local153.method6099();
				if (local192 < -1) {
					local192 = -1;
				} else if (local192 > 65534) {
					local192 = 65534;
				}
				if (Static81.anInt1372 != local192 || local173 != Static308.anInt4885) {
					if (local146 == null) {
						local146 = Static25.method507(Static98.aClass208_2, Static37.aClass181_10);
						local146.aClass5_Sub12_Sub2_2.method8647(0);
						local148 = local146.aClass5_Sub12_Sub2_2.anInt10154;
					}
					local238 = local192 - Static81.anInt1372;
					Static81.anInt1372 = local192;
					local244 = local173 - Static308.anInt4885;
					Static308.anInt4885 = local173;
					local255 = (int) ((local153.method6093() - Static96.aLong58) / 20L);
					if (local255 < 8 && local238 >= -32 && local238 <= 31 && local244 >= -32 && local244 <= 31) {
						local244 += 32;
						local238 += 32;
						local146.aClass5_Sub12_Sub2_2.method8655(local244 + (local238 << 6) + (local255 << 12));
					} else if (local255 < 32 && local238 >= -128 && local238 <= 127 && local244 >= -128 && local244 <= 127) {
						local244 += 128;
						local146.aClass5_Sub12_Sub2_2.method8647(local255 + 128);
						local238 += 128;
						local146.aClass5_Sub12_Sub2_2.method8655(local244 + (local238 << 8));
					} else if (local255 < 32) {
						local146.aClass5_Sub12_Sub2_2.method8647(local255 + 192);
						if (local192 == 1 || local173 == -1) {
							local146.aClass5_Sub12_Sub2_2.method8622(Integer.MIN_VALUE);
						} else {
							local146.aClass5_Sub12_Sub2_2.method8622(local173 << 16 | local192);
						}
					} else {
						local146.aClass5_Sub12_Sub2_2.method8655(local255 + 57344);
						if (local192 == 1 || local173 == -1) {
							local146.aClass5_Sub12_Sub2_2.method8622(Integer.MIN_VALUE);
						} else {
							local146.aClass5_Sub12_Sub2_2.method8622(local192 | local173 << 16);
						}
					}
					Static96.aLong58 = local153.method6093();
				}
			}
			if (local146 != null) {
				local146.aClass5_Sub12_Sub2_2.method8652(local146.aClass5_Sub12_Sub2_2.anInt10154 - local148);
				Static612.method8496(local146);
			}
		}
		@Pc(454) int local454;
		if (local131 != null) {
			@Pc(440) long local440 = (local131.method6093() - Static604.aLong264) / 50L;
			Static604.aLong264 = local131.method6093();
			if (local440 > 32767L) {
				local440 = 32767L;
			}
			local454 = local131.method6094();
			if (local454 < 0) {
				local454 = 0;
			} else if (local454 > 65535) {
				local454 = 65535;
			}
			local173 = local131.method6099();
			if (local173 < 0) {
				local173 = 0;
			} else if (local173 > 65535) {
				local173 = 65535;
			}
			@Pc(487) byte local487 = 0;
			if (local131.method6097() == 2) {
				local487 = 1;
			}
			local238 = (int) local440;
			@Pc(506) Class5_Sub40 local506 = Static25.method507(Static98.aClass208_2, Static565.aClass181_85);
			local506.aClass5_Sub12_Sub2_2.method8655(local487 << 15 | local238);
			local506.aClass5_Sub12_Sub2_2.method8622(local173 | local454 << 16);
			Static612.method8496(local506);
		}
		if (Static626.anInt10210 > 0) {
			local146 = Static25.method507(Static98.aClass208_2, Static126.aClass181_20);
			local146.aClass5_Sub12_Sub2_2.method8647(Static626.anInt10210 * 3);
			for (local148 = 0; local148 < Static626.anInt10210; local148++) {
				@Pc(553) Interface24 local553 = Static495.anInterface24Array3[local148];
				@Pc(561) long local561 = (local553.method5141() - Static291.aLong146) / 50L;
				Static291.aLong146 = local553.method5141();
				if (local561 > 65535L) {
					local561 = 65535L;
				}
				local146.aClass5_Sub12_Sub2_2.method8647(local553.method5143());
				local146.aClass5_Sub12_Sub2_2.method8655((int) local561);
			}
			Static612.method8496(local146);
		}
		if (Static277.anInt4536 > 0) {
			Static277.anInt4536--;
		}
		if (Static349.aBoolean501 && Static277.anInt4536 <= 0) {
			Static277.anInt4536 = 20;
			Static349.aBoolean501 = false;
			local146 = Static25.method507(Static98.aClass208_2, Static29.aClass181_9);
			local146.aClass5_Sub12_Sub2_2.method8604((int) Static371.aFloat65 >> 3);
			local146.aClass5_Sub12_Sub2_2.method8655((int) Static112.aFloat22 >> 3);
			Static612.method8496(local146);
		}
		if (Static342.aBoolean492 != Static292.aBoolean386) {
			Static342.aBoolean492 = Static292.aBoolean386;
			local146 = Static25.method507(Static98.aClass208_2, Static189.aClass181_31);
			local146.aClass5_Sub12_Sub2_2.method8647(Static292.aBoolean386 ? 1 : 0);
			Static612.method8496(local146);
		}
		if (!Static71.aBoolean80) {
			local146 = Static25.method507(Static98.aClass208_2, Static458.aClass181_66);
			local146.aClass5_Sub12_Sub2_2.method8647(0);
			local148 = local146.aClass5_Sub12_Sub2_2.anInt10154;
			@Pc(691) Class5_Sub12 local691 = Static627.aClass5_Sub46_31.method8189();
			local146.aClass5_Sub12_Sub2_2.method8651(0, local691.aByteArray104, local691.anInt10154);
			local146.aClass5_Sub12_Sub2_2.method8652(local146.aClass5_Sub12_Sub2_2.anInt10154 - local148);
			Static612.method8496(local146);
			Static71.aBoolean80 = true;
		}
		if (Static535.aClass156ArrayArrayArray2 != null) {
			if (Static584.anInt9543 == 2) {
				Static590.method8289();
			} else if (Static584.anInt9543 == 3) {
				Static270.method4084();
			}
		}
		if (Static378.aBoolean549) {
			Static378.aBoolean549 = false;
		} else {
			Static554.aFloat192 /= 2.0F;
		}
		if (Static609.aBoolean813) {
			Static609.aBoolean813 = false;
		} else {
			Static322.aFloat112 /= 2.0F;
		}
		Static513.method7411();
		if (Static469.anInt7883 != 10) {
			return;
		}
		Static383.method5943();
		Static517.method7432();
		Static632.method8757();
		Static80.anInt1302++;
		if (Static80.anInt1302 > 750) {
			Static18.method449();
			return;
		}
		Static487.method7153();
		Static532.method7606();
		Static209.method3206();
		for (local62 = Static564.aClass304_1.method7291(true); local62 != -1; local62 = Static564.aClass304_1.method7291(false)) {
			Static249.method3874(local62);
			Static280.anIntArray375[Static202.anInt3586++ & 0x1F] = local62;
		}
		@Pc(845) Class357 local845;
		for (@Pc(815) Class5_Sub4_Sub13 local815 = Static345.method5279(); local815 != null; local815 = Static345.method5279()) {
			local454 = local815.method4133();
			local173 = local815.method4139();
			if (local454 == 1) {
				Static605.anIntArray802[local173] = local815.anInt4508;
				Static383.aBoolean558 |= Static361.aBooleanArray42[local173];
				Static535.anIntArray690[Static457.anInt7737++ & 0x1F] = local173;
			} else if (local454 == 2) {
				Static18.aStringArray1[local173] = local815.aString66;
				Static584.anIntArray756[Static197.anInt3541++ & 0x1F] = local173;
			} else if (local454 == 3) {
				local845 = Static472.method6903(local173);
				if (!local815.aString66.equals(local845.aString140)) {
					local845.aString140 = local815.aString66;
					Static637.method8778(local845);
				}
			} else if (local454 == 4) {
				local845 = Static472.method6903(local173);
				local238 = local815.anInt4508;
				local244 = local815.anInt4504;
				local255 = local815.anInt4507;
				if (local238 != local845.anInt9796 || local244 != local845.anInt9817 || local845.anInt9856 != local255) {
					local845.anInt9796 = local238;
					local845.anInt9817 = local244;
					local845.anInt9856 = local255;
					Static637.method8778(local845);
				}
			} else if (local454 == 5) {
				local845 = Static472.method6903(local173);
				if (local845.anInt9806 != local815.anInt4508 || local815.anInt4508 == -1) {
					local845.anInt9800 = 0;
					local845.anInt9798 = 0;
					local845.anInt9806 = local815.anInt4508;
					local845.anInt9827 = 1;
					@Pc(928) Class200 local928 = local845.anInt9806 == -1 ? null : Static396.aClass359_2.method8415(local845.anInt9806);
					if (local928 != null) {
						Static91.method1412(local928, local845.anInt9800);
					}
					Static637.method8778(local845);
				}
			} else if (local454 == 6) {
				local192 = local815.anInt4508;
				local238 = local192 >> 10 & 0x1F;
				local244 = local192 >> 5 & 0x1F;
				local255 = local192 & 0x1F;
				@Pc(1309) int local1309 = (local244 << 11) + (local238 << 19) + (local255 << 3);
				@Pc(1313) Class357 local1313 = Static472.method6903(local173);
				if (local1313.anInt9841 != local1309) {
					local1313.anInt9841 = local1309;
					Static637.method8778(local1313);
				}
			} else if (local454 == 7) {
				local845 = Static472.method6903(local173);
				@Pc(960) boolean local960 = local815.anInt4508 == 1;
				if (local845.aBoolean797 != local960) {
					local845.aBoolean797 = local960;
					Static637.method8778(local845);
				}
			} else if (local454 == 8) {
				local845 = Static472.method6903(local173);
				if (local845.anInt9849 != local815.anInt4508 || local845.anInt9788 != local815.anInt4504 || local845.anInt9873 != local815.anInt4507) {
					local845.anInt9849 = local815.anInt4508;
					local845.anInt9788 = local815.anInt4504;
					local845.anInt9873 = local815.anInt4507;
					if (local845.anInt9871 != -1) {
						if (local845.anInt9845 > 0) {
							local845.anInt9873 = local845.anInt9873 * 32 / local845.anInt9845;
						} else if (local845.anInt9840 > 0) {
							local845.anInt9873 = local845.anInt9873 * 32 / local845.anInt9840;
						}
					}
					Static637.method8778(local845);
				}
			} else if (local454 == 9) {
				local845 = Static472.method6903(local173);
				if (local845.anInt9871 != local815.anInt4508 || local845.anInt9815 != local815.anInt4504) {
					local845.anInt9871 = local815.anInt4508;
					local845.anInt9815 = local815.anInt4504;
					Static637.method8778(local845);
				}
			} else if (local454 == 10) {
				local845 = Static472.method6903(local173);
				if (local845.anInt9825 != local815.anInt4508 || local845.anInt9865 != local815.anInt4504 || local845.anInt9831 != local815.anInt4507) {
					local845.anInt9831 = local815.anInt4507;
					local845.anInt9825 = local815.anInt4508;
					local845.anInt9865 = local815.anInt4504;
					Static637.method8778(local845);
				}
			} else if (local454 == 11) {
				local845 = Static472.method6903(local173);
				local845.aByte133 = 0;
				local845.anInt9813 = local845.anInt9851 = local815.anInt4508;
				local845.anInt9876 = local845.anInt9801 = local815.anInt4504;
				local845.aByte132 = 0;
				Static637.method8778(local845);
			} else if (local454 == 12) {
				local845 = Static472.method6903(local173);
				local238 = local815.anInt4508;
				if (local845 != null && local845.anInt9828 == 0) {
					if (local238 > local845.anInt9861 - local845.anInt9797) {
						local238 = local845.anInt9861 - local845.anInt9797;
					}
					if (local238 < 0) {
						local238 = 0;
					}
					if (local238 != local845.anInt9819) {
						local845.anInt9819 = local238;
						Static637.method8778(local845);
					}
				}
			} else if (local454 == 14) {
				local845 = Static472.method6903(local173);
				local845.anInt9810 = local815.anInt4508;
			} else if (local454 == 15) {
				Static269.anInt1227 = local815.anInt4508;
				Static119.anInt1885 = local815.anInt4504;
				Static647.aBoolean840 = true;
			} else if (local454 == 16) {
				local845 = Static472.method6903(local173);
				local845.anInt9821 = local815.anInt4508;
			} else if (local454 == 17) {
				local845 = Static472.method6903(local173);
				local845.anInt9855 = local815.anInt4508;
			}
		}
		if (Static472.anInt7920 != 0) {
			Static372.anInt6544 += 20;
			if (Static372.anInt6544 >= 400) {
				Static472.anInt7920 = 0;
			}
		}
		Static128.anInt2091++;
		if (Static34.aClass357_1 != null) {
			Static94.anInt10279++;
			if (Static94.anInt10279 >= 15) {
				Static637.method8778(Static34.aClass357_1);
				Static34.aClass357_1 = null;
			}
		}
		Static523.aBoolean713 = false;
		Static157.aClass357_6 = null;
		Static501.aClass357_11 = null;
		Static226.aBoolean324 = false;
		Static173.method2667(-1, (Class357) null, -1);
		Static94.method8737(-1, (Class357) null, -1);
		if (!Static202.aBoolean295) {
			Static522.anInt7724 = -1;
		}
		Static528.method7562();
		Static278.anInt4551++;
		if (Static366.aBoolean538) {
			@Pc(1457) Class5_Sub40 local1457 = Static25.method507(Static98.aClass208_2, Static573.aClass181_88);
			local1457.aClass5_Sub12_Sub2_2.method8602(Static401.anInt8426 << 14 | Static370.anInt6539 << 28 | Static578.anInt9490);
			Static612.method8496(local1457);
			Static366.aBoolean538 = false;
		}
		while (true) {
			@Pc(1480) Class5_Sub9 local1480;
			@Pc(1485) Class357 local1485;
			do {
				local1480 = (Class5_Sub9) Static272.aClass306_17.method7302();
				if (local1480 == null) {
					while (true) {
						do {
							local1480 = (Class5_Sub9) Static118.aClass306_12.method7302();
							if (local1480 == null) {
								while (true) {
									do {
										local1480 = (Class5_Sub9) Static297.aClass306_18.method7302();
										if (local1480 == null) {
											if (Static157.aClass357_6 == null) {
												Static239.anInt4038 = 0;
											}
											if (Static629.aClass357_15 != null) {
												Static199.method7027();
											}
											if (Static408.anInt7025 > 0 && Static600.aClass38_1.method799(82) && Static600.aClass38_1.method799(81) && Static565.anInt9287 != 0) {
												local454 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 - Static565.anInt9287;
												if (local454 < 0) {
													local454 = 0;
												} else if (local454 > 3) {
													local454 = 3;
												}
												Static442.method6574(Static622.anInt10087 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0], Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0] + Static113.anInt1785, local454);
											}
											Static243.method3690();
											for (local454 = 0; local454 < 5; local454++) {
												@Pc(1676) int local1676 = Static48.anIntArray63[local454]++;
											}
											if (Static383.aBoolean558 && Static27.aLong14 < Static205.method3179() - 60000L) {
												Static159.method2410();
											}
											for (@Pc(1701) Class14_Sub2_Sub1 local1701 = (Class14_Sub2_Sub1) Static172.aClass363_3.method8484(); local1701 != null; local1701 = (Class14_Sub2_Sub1) Static172.aClass363_3.method8478()) {
												if ((long) local1701.anInt455 < Static205.method3179() / 1000L - 5L) {
													if (local1701.aShort16 > 0) {
														Static365.method5696(0, local1701.aString6 + Static76.aClass58_20.method1237(Static321.anInt5554), "", "", "", 5);
													}
													if (local1701.aShort16 == 0) {
														Static365.method5696(0, local1701.aString6 + Static76.aClass58_21.method1237(Static321.anInt5554), "", "", "", 5);
													}
													local1701.method8904();
												}
											}
											Static460.anInt7782++;
											if (Static460.anInt7782 > 500) {
												Static460.anInt7782 = 0;
												local192 = (int) (Math.random() * 8.0D);
												if ((local192 & 0x1) == 1) {
													Static541.anInt8999 += Static4.anInt32;
												}
												if ((local192 & 0x4) == 4) {
													Static145.anInt6904 += Static631.anInt10282;
												}
												if ((local192 & 0x2) == 2) {
													Static314.anInt6318 += Static525.anInt8758;
												}
											}
											if (Static541.anInt8999 < -50) {
												Static4.anInt32 = 2;
											}
											if (Static541.anInt8999 > 50) {
												Static4.anInt32 = -2;
											}
											if (Static314.anInt6318 < -55) {
												Static525.anInt8758 = 2;
											}
											if (Static314.anInt6318 > 55) {
												Static525.anInt8758 = -2;
											}
											if (Static145.anInt6904 < -40) {
												Static631.anInt10282 = 1;
											}
											Static181.anInt3280++;
											if (Static145.anInt6904 > 40) {
												Static631.anInt10282 = -1;
											}
											if (Static181.anInt3280 > 500) {
												Static181.anInt3280 = 0;
												local192 = (int) (Math.random() * 8.0D);
												if ((local192 & 0x2) == 2) {
													Static425.anInt7212 += Static493.anInt8446;
												}
												if ((local192 & 0x1) == 1) {
													Static402.anInt9327 += Static312.anInt5495;
												}
											}
											if (Static402.anInt9327 < -60) {
												Static312.anInt5495 = 2;
											}
											if (Static402.anInt9327 > 60) {
												Static312.anInt5495 = -2;
											}
											if (Static425.anInt7212 < -20) {
												Static493.anInt8446 = 1;
											}
											Static294.anInt4739++;
											if (Static425.anInt7212 > 10) {
												Static493.anInt8446 = -1;
											}
											if (Static294.anInt4739 > 50) {
												@Pc(1927) Class5_Sub40 local1927 = Static25.method507(Static98.aClass208_2, Static389.aClass181_54);
												Static612.method8496(local1927);
											}
											if (Static198.aBoolean292) {
												Static374.method5829();
												Static198.aBoolean292 = false;
											}
											try {
												Static483.method6971();
												return;
											} catch (@Pc(1940) IOException local1940) {
												Static18.method449();
												return;
											}
										}
										local1485 = local1480.aClass357_2;
										if (local1485.anInt9846 < 0) {
											break;
										}
										local845 = Static472.method6903(local1485.anInt9837);
									} while (local845 == null || local845.aClass357Array2 == null || local1485.anInt9846 >= local845.aClass357Array2.length || local1485 != local845.aClass357Array2[local1485.anInt9846]);
									Static82.method1317(local1480);
								}
							}
							local1485 = local1480.aClass357_2;
							if (local1485.anInt9846 < 0) {
								break;
							}
							local845 = Static472.method6903(local1485.anInt9837);
						} while (local845 == null || local845.aClass357Array2 == null || local845.aClass357Array2.length <= local1485.anInt9846 || local1485 != local845.aClass357Array2[local1485.anInt9846]);
						Static82.method1317(local1480);
					}
				}
				local1485 = local1480.aClass357_2;
				if (local1485.anInt9846 < 0) {
					break;
				}
				local845 = Static472.method6903(local1485.anInt9837);
			} while (local845 == null || local845.aClass357Array2 == null || local1485.anInt9846 >= local845.aClass357Array2.length || local845.aClass357Array2[local1485.anInt9846] != local1485);
			Static82.method1317(local1480);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)Z")
	public static boolean method384(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static485.aClass126_17.method7025();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static485.aClass126_17.method7038();
		} else if (!Static485.aClass126_17.method7055()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub27_1, arg0 ? 1 : 0);
			Static499.method7307();
			return true;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Z")
	public static boolean method386() {
		return Static571.anInt9391 == 0 ? Static275.aClass5_Sub16_Sub1_5.method2569() : true;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
	public static void method389() {
		Static540.aClass126_21.xa(((float) Static627.aClass5_Sub46_31.aClass11_Sub2_1.method447() * 0.1F + 0.7F) * Static637.aFloat205);
		Static540.aClass126_21.ZA(Static186.anInt3362, Static591.aFloat198, Static13.aFloat5, (float) (Static505.anInt6237 << 2), (float) (Static142.anInt8584 << 2), (float) (Static582.anInt9526 << 2));
		Static540.aClass126_21.method7009(Static339.aClass91_2);
	}
}
