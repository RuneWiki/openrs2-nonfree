import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vea", name = "n", descriptor = "Lclient!wv;")
	public static Class400 aClass400_2;

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)V")
	public static void method9005() {
		if (Static132.anInt2081 > 1) {
			Static504.anInt8772 = Static154.anInt2379;
			Static132.anInt2081--;
		}
		if (Static277.aClass347_2.aBoolean662) {
			Static277.aClass347_2.aBoolean662 = false;
			Static486.method7340();
			return;
		}
		if (!Static455.aBoolean533) {
			Static374.method5795();
		}
		for (@Pc(34) int local34 = 0; local34 < 100 && Static572.method8155(Static277.aClass347_2); local34++) {
		}
		if (Static387.anInt9114 != 11) {
			return;
		}
		@Pc(69) Class14_Sub54 local69;
		@Pc(78) int local78;
		while (Static130.method2009()) {
			local69 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static212.aClass251_98);
			local69.aClass14_Sub21_Sub2_2.method7747(0);
			local78 = local69.aClass14_Sub21_Sub2_2.anInt8936;
			Static635.method8897(local69.aClass14_Sub21_Sub2_2);
			local69.aClass14_Sub21_Sub2_2.method7715(local69.aClass14_Sub21_Sub2_2.anInt8936 - local78);
			Static277.aClass347_2.method8308(local69);
		}
		if (Static335.aClass14_Sub47_1 == null) {
			if (Static26.method382() >= Static40.aLong31) {
				Static335.aClass14_Sub47_1 = Static193.aClass101_5.method2156(Static564.aClass357_4.aString110);
			}
		} else if (Static335.aClass14_Sub47_1.anInt10186 != -1) {
			local69 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static552.aClass251_223);
			local69.aClass14_Sub21_Sub2_2.method7751(Static335.aClass14_Sub47_1.anInt10186);
			Static277.aClass347_2.method8308(local69);
			Static335.aClass14_Sub47_1 = null;
			Static40.aLong31 = Static26.method382() + 30000L;
		}
		@Pc(159) Class14_Sub29 local159 = (Class14_Sub29) Static477.aClass32_54.method584();
		@Pc(174) int local174;
		@Pc(199) int local199;
		@Pc(217) int local217;
		@Pc(269) int local269;
		@Pc(276) int local276;
		@Pc(288) int local288;
		@Pc(172) Class14_Sub54 local172;
		if (local159 != null || Static562.aLong258 < Static26.method382() - 2000L) {
			local172 = null;
			local174 = 0;
			for (@Pc(179) Class14_Sub29 local179 = (Class14_Sub29) Static502.aClass32_58.method584(); local179 != null && (local172 == null || local172.aClass14_Sub21_Sub2_2.anInt8936 - local174 < 240); local179 = (Class14_Sub29) Static502.aClass32_58.method577()) {
				local179.method9513();
				local199 = local179.method7859();
				if (local199 < -1) {
					local199 = -1;
				} else if (local199 > 65534) {
					local199 = 65534;
				}
				local217 = local179.method7858();
				if (local217 < -1) {
					local217 = -1;
				} else if (local217 > 65534) {
					local217 = 65534;
				}
				if (Static108.anInt1852 != local217 || local199 != Static623.anInt10496) {
					if (local172 == null) {
						local172 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static203.aClass251_97);
						local172.aClass14_Sub21_Sub2_2.method7747(0);
						local174 = local172.aClass14_Sub21_Sub2_2.anInt8936;
					}
					local269 = local217 - Static108.anInt1852;
					Static108.anInt1852 = local217;
					local276 = local199 - Static623.anInt10496;
					Static623.anInt10496 = local199;
					local288 = (int) ((local179.method7861() - Static562.aLong258) / 20L);
					if (local288 < 8 && local269 >= -32 && local269 <= 31 && local276 >= -32 && local276 <= 31) {
						local269 += 32;
						local276 += 32;
						local172.aClass14_Sub21_Sub2_2.method7751((local288 << 12) - (-(local269 << 6) - local276));
					} else if (local288 < 32 && local269 >= -128 && local269 <= 127 && local276 >= -128 && local276 <= 127) {
						local276 += 128;
						local269 += 128;
						local172.aClass14_Sub21_Sub2_2.method7747(local288 + 128);
						local172.aClass14_Sub21_Sub2_2.method7751((local269 << 8) + local276);
					} else if (local288 >= 32) {
						local172.aClass14_Sub21_Sub2_2.method7751(local288 + 57344);
						if (local217 == 1 || local199 == -1) {
							local172.aClass14_Sub21_Sub2_2.method7730(Integer.MIN_VALUE);
						} else {
							local172.aClass14_Sub21_Sub2_2.method7730(local199 << 16 | local217);
						}
					} else {
						local172.aClass14_Sub21_Sub2_2.method7747(local288 + 192);
						if (local217 == 1 || local199 == -1) {
							local172.aClass14_Sub21_Sub2_2.method7730(Integer.MIN_VALUE);
						} else {
							local172.aClass14_Sub21_Sub2_2.method7730(local199 << 16 | local217);
						}
					}
					Static562.aLong258 = local179.method7861();
				}
			}
			if (local172 != null) {
				local172.aClass14_Sub21_Sub2_2.method7715(local172.aClass14_Sub21_Sub2_2.anInt8936 - local174);
				Static277.aClass347_2.method8308(local172);
			}
		}
		@Pc(533) int local533;
		if (local159 != null) {
			@Pc(517) long local517 = (local159.method7861() - Static123.aLong86) / 50L;
			if (local517 > 32767L) {
				local517 = 32767L;
			}
			Static123.aLong86 = local159.method7861();
			local533 = local159.method7859();
			if (local533 < 0) {
				local533 = 0;
			} else if (local533 > 65535) {
				local533 = 65535;
			}
			local199 = local159.method7858();
			if (local199 < 0) {
				local199 = 0;
			} else if (local199 > 65535) {
				local199 = 65535;
			}
			@Pc(567) byte local567 = 0;
			if (local159.method7856() == 2) {
				local567 = 1;
			}
			local269 = (int) local517;
			@Pc(589) Class14_Sub54 local589 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static149.aClass251_82);
			local589.aClass14_Sub21_Sub2_2.method7721(local199 | local533 << 16);
			local589.aClass14_Sub21_Sub2_2.method7733(local567 << 15 | local269);
			Static277.aClass347_2.method8308(local589);
		}
		@Pc(646) long local646;
		if (Static200.anInt9878 > 0) {
			local172 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static196.aClass251_93);
			local172.aClass14_Sub21_Sub2_2.method7747(Static200.anInt9878 * 3);
			for (local174 = 0; local174 < Static200.anInt9878; local174++) {
				@Pc(638) Interface17 local638 = Static376.anInterface17Array3[local174];
				local646 = (local638.method648() - Static245.aLong131) / 50L;
				Static245.aLong131 = local638.method648();
				if (local646 > 65535L) {
					local646 = 65535L;
				}
				local172.aClass14_Sub21_Sub2_2.method7747(local638.method647());
				local172.aClass14_Sub21_Sub2_2.method7751((int) local646);
			}
			Static277.aClass347_2.method8308(local172);
		}
		if (Static575.anInt9549 > 0) {
			Static575.anInt9549--;
		}
		if (Static5.aBoolean5 && Static575.anInt9549 <= 0) {
			Static575.anInt9549 = 20;
			Static5.aBoolean5 = false;
			local172 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static540.aClass251_219);
			local172.aClass14_Sub21_Sub2_2.method7733((int) Static139.aFloat16 >> 3);
			local172.aClass14_Sub21_Sub2_2.method7705((int) Static680.aFloat210 >> 3);
			Static277.aClass347_2.method8308(local172);
		}
		if (Static271.aBoolean373 != Static519.aBoolean677) {
			Static519.aBoolean677 = Static271.aBoolean373;
			local172 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static280.aClass251_120);
			local172.aClass14_Sub21_Sub2_2.method7747(Static271.aBoolean373 ? 1 : 0);
			Static277.aClass347_2.method8308(local172);
		}
		if (!Static411.aBoolean499) {
			local172 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static506.aClass251_210);
			local172.aClass14_Sub21_Sub2_2.method7747(0);
			local174 = local172.aClass14_Sub21_Sub2_2.anInt8936;
			@Pc(795) Class14_Sub21 local795 = Static181.aClass14_Sub26_9.method5279();
			local172.aClass14_Sub21_Sub2_2.method7743(0, local795.aByteArray99, local795.anInt8936);
			local172.aClass14_Sub21_Sub2_2.method7715(local172.aClass14_Sub21_Sub2_2.anInt8936 - local174);
			Static277.aClass347_2.method8308(local172);
			Static411.aBoolean499 = true;
		}
		if (Static63.aClass89ArrayArrayArray1 != null) {
			if (Static304.anInt5410 == 2) {
				Static502.method7567();
			} else if (Static304.anInt5410 == 3) {
				Static267.method4408();
			}
		}
		if (Static101.aBoolean128) {
			Static101.aBoolean128 = false;
		} else {
			Static173.aFloat21 /= 2.0F;
		}
		if (Static438.aBoolean518) {
			Static438.aBoolean518 = false;
		} else {
			Static193.aFloat190 /= 2.0F;
		}
		Static405.method6127();
		if (Static387.anInt9114 != 11) {
			return;
		}
		Static417.method6263();
		Static404.method6116(true);
		Static652.method9130();
		Static277.aClass347_2.anInt9630++;
		if (Static277.aClass347_2.anInt9630 > 750) {
			Static486.method7340();
			return;
		}
		Static374.method5796();
		Static441.method6595();
		Static542.method7952();
		for (local78 = Static188.aClass238_1.method5872(true); local78 != -1; local78 = Static188.aClass238_1.method5872(false)) {
			Static361.method5465(local78);
			Static420.anIntArray368[Static301.anInt5894++ & 0x1F] = local78;
		}
		for (@Pc(943) Class14_Sub2_Sub9 local943 = Static345.method5262(); local943 != null; local943 = Static345.method5262()) {
			local533 = local943.method4002();
			local646 = local943.method4006();
			if (local533 == 1) {
				Static184.anIntArray401[(int) local646] = local943.anInt4595;
				Static610.aBoolean693 |= Static195.aBooleanArray6[(int) local646];
				Static388.anIntArray351[Static663.anInt10807++ & 0x1F] = (int) local646;
			} else if (local533 == 2) {
				Static110.aStringArray14[(int) local646] = local943.aString55;
				Static370.anIntArray342[Static262.anInt4886++ & 0x1F] = (int) local646;
			} else {
				@Pc(989) Class299 local989;
				if (local533 == 3) {
					local989 = Static391.method5936((int) local646);
					if (!local943.aString55.equals(local989.aString96)) {
						local989.aString96 = local943.aString55;
						Static538.method7933(local989);
					}
				} else {
					@Pc(1058) int local1058;
					if (local533 == 4) {
						local989 = Static391.method5936((int) local646);
						local276 = local943.anInt4595;
						local288 = local943.anInt4592;
						local1058 = local943.anInt4599;
						if (local276 != local989.anInt8543 || local989.anInt8546 != local288 || local1058 != local989.anInt8559) {
							local989.anInt8559 = local1058;
							local989.anInt8543 = local276;
							local989.anInt8546 = local288;
							Static538.method7933(local989);
						}
					} else if (local533 == 5) {
						local989 = Static391.method5936((int) local646);
						if (local943.anInt4595 != local989.anInt8567) {
							if (local943.anInt4595 == -1) {
								local989.aClass181_11 = null;
							} else {
								if (local989.aClass181_11 == null) {
									local989.aClass181_11 = new Class181_Sub1();
								}
								local989.aClass181_11.method8964(local943.anInt4595, 0);
							}
							local989.anInt8567 = local943.anInt4595;
							Static538.method7933(local989);
						}
					} else if (local533 == 6) {
						local269 = local943.anInt4595;
						local276 = local269 >> 10 & 0x1F;
						local288 = local269 >> 5 & 0x1F;
						local1058 = local269 & 0x1F;
						@Pc(1071) int local1071 = (local276 << 19) + (local288 << 11) + (local1058 << 3);
						@Pc(1076) Class299 local1076 = Static391.method5936((int) local646);
						if (local1076.anInt8566 != local1071) {
							local1076.anInt8566 = local1071;
							Static538.method7933(local1076);
						}
					} else if (local533 == 7) {
						local989 = Static391.method5936((int) local646);
						@Pc(1556) boolean local1556 = local943.anInt4595 == 1;
						if (local1556 != local989.aBoolean604) {
							local989.aBoolean604 = local1556;
							Static538.method7933(local989);
						}
					} else if (local533 == 8) {
						local989 = Static391.method5936((int) local646);
						if (local943.anInt4595 != local989.anInt8593 || local989.anInt8598 != local943.anInt4592 || local943.anInt4599 != local989.anInt8587) {
							local989.anInt8593 = local943.anInt4595;
							local989.anInt8598 = local943.anInt4592;
							local989.anInt8587 = local943.anInt4599;
							if (local989.anInt8621 != -1) {
								if (local989.anInt8545 > 0) {
									local989.anInt8587 = local989.anInt8587 * 32 / local989.anInt8545;
								} else if (local989.anInt8583 > 0) {
									local989.anInt8587 = local989.anInt8587 * 32 / local989.anInt8583;
								}
							}
							Static538.method7933(local989);
						}
					} else if (local533 == 9) {
						local989 = Static391.method5936((int) local646);
						if (local989.anInt8621 != local943.anInt4595 || local989.anInt8565 != local943.anInt4592) {
							local989.anInt8565 = local943.anInt4592;
							local989.anInt8621 = local943.anInt4595;
							Static538.method7933(local989);
						}
					} else if (local533 == 10) {
						local989 = Static391.method5936((int) local646);
						if (local989.anInt8554 != local943.anInt4595 || local943.anInt4592 != local989.anInt8574 || local943.anInt4599 != local989.anInt8585) {
							local989.anInt8554 = local943.anInt4595;
							local989.anInt8585 = local943.anInt4599;
							local989.anInt8574 = local943.anInt4592;
							Static538.method7933(local989);
						}
					} else if (local533 == 11) {
						local989 = Static391.method5936((int) local646);
						local989.anInt8534 = local989.anInt8532 = local943.anInt4595;
						local989.aByte107 = 0;
						local989.aByte109 = 0;
						local989.anInt8603 = local989.anInt8529 = local943.anInt4592;
						Static538.method7933(local989);
					} else if (local533 == 12) {
						local989 = Static391.method5936((int) local646);
						local276 = local943.anInt4595;
						if (local989 != null && local989.anInt8610 == 0) {
							if (local989.anInt8599 - local989.anInt8547 < local276) {
								local276 = local989.anInt8599 - local989.anInt8547;
							}
							if (local276 < 0) {
								local276 = 0;
							}
							if (local989.anInt8617 != local276) {
								local989.anInt8617 = local276;
								Static538.method7933(local989);
							}
						}
					} else if (local533 == 14) {
						local989 = Static391.method5936((int) local646);
						local989.anInt8611 = local943.anInt4595;
					} else if (local533 == 15) {
						Static60.anInt998 = local943.anInt4595;
						Static483.aBoolean590 = true;
						Static605.anInt7003 = local943.anInt4592;
					} else if (local533 == 16) {
						local989 = Static391.method5936((int) local646);
						local989.anInt8575 = local943.anInt4595;
					} else if (local533 == 20) {
						local989 = Static391.method5936((int) local646);
						local989.aBoolean607 = local943.anInt4595 == 1;
					} else if (local533 == 17) {
						local989 = Static391.method5936((int) local646);
						local989.anInt8582 = local943.anInt4595;
					} else if (local533 == 18) {
						local989 = Static391.method5936((int) local646);
						local276 = (int) (local646 >> 32);
						local989.method7441((short) local943.anInt4592, (short) local943.anInt4595, local276);
					} else if (local533 == 19) {
						local989 = Static391.method5936((int) local646);
						local276 = (int) (local646 >> 32);
						local989.method7432((short) local943.anInt4595, (short) local943.anInt4592, local276);
					}
				}
			}
		}
		if (Static354.anInt6058 != 0) {
			Static440.anInt2581 += 20;
			if (Static440.anInt2581 >= 400) {
				Static354.anInt6058 = 0;
			}
		}
		Static468.anInt7945++;
		if (Static588.aClass299_10 != null) {
			Static406.anInt7030++;
			if (Static406.anInt7030 >= 15) {
				Static538.method7933(Static588.aClass299_10);
				Static588.aClass299_10 = null;
			}
		}
		Static690.aBoolean785 = false;
		Static30.aBoolean33 = false;
		Static125.aClass299_4 = null;
		Static381.aClass299_6 = null;
		Static97.method1617(-1, -1, (Class299) null);
		Static507.method7601(-1, -1, (Class299) null);
		if (!Static546.aBoolean727) {
			Static573.anInt9481 = -1;
		}
		Static327.method5104();
		Static154.anInt2379++;
		if (Static381.aBoolean482) {
			@Pc(1791) Class14_Sub54 local1791 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static230.aClass251_105);
			local1791.aClass14_Sub21_Sub2_2.method7711(Static307.anInt5459 | Static142.anInt2275 << 28 | Static65.anInt1018 << 14);
			Static277.aClass347_2.method8308(local1791);
			Static381.aBoolean482 = false;
		}
		while (true) {
			@Pc(1815) Class14_Sub10 local1815;
			@Pc(1835) Class299 local1835;
			@Pc(1820) Class299 local1820;
			do {
				local1815 = (Class14_Sub10) Static401.aClass32_41.method579();
				if (local1815 == null) {
					while (true) {
						do {
							local1815 = (Class14_Sub10) Static72.aClass32_1.method579();
							if (local1815 == null) {
								while (true) {
									do {
										local1815 = (Class14_Sub10) Static97.aClass32_6.method579();
										if (local1815 == null) {
											if (Static125.aClass299_4 == null) {
												Static563.anInt4937 = 0;
											}
											if (Static649.aClass299_12 != null) {
												Static377.method5815();
											}
											if (Static469.anInt11068 > 0 && Static89.aClass207_3.method5068(82) && Static89.aClass207_3.method5068(81) && Static438.anInt7390 != 0) {
												local533 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 - Static438.anInt7390;
												if (local533 < 0) {
													local533 = 0;
												} else if (local533 > 3) {
													local533 = 3;
												}
												Static489.method7382(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0] + Static550.anInt9242, local533, Static36.anInt617 + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0]);
											}
											Static553.method7985();
											for (local533 = 0; local533 < 5; local533++) {
												@Pc(2046) int local2046 = Static246.anIntArray236[local533]++;
											}
											if (Static610.aBoolean693 && Static26.method382() - 60000L > Static3.aLong5) {
												Static32.method9346();
											}
											for (@Pc(2081) Class4_Sub4_Sub2 local2081 = (Class4_Sub4_Sub2) Static417.aClass283_9.method6791(); local2081 != null; local2081 = (Class4_Sub4_Sub2) Static417.aClass283_9.method6792()) {
												if ((long) local2081.anInt8718 < Static26.method382() / 1000L - 5L) {
													if (local2081.aShort85 > 0) {
														Static187.method2752(local2081.aString100 + Static21.aClass21_18.method324(Static26.anInt352), 0, "", "", 5, "");
													}
													if (local2081.aShort85 == 0) {
														Static187.method2752(local2081.aString100 + Static21.aClass21_19.method324(Static26.anInt352), 0, "", "", 5, "");
													}
													local2081.method9473();
												}
											}
											Static618.anInt10150++;
											if (Static618.anInt10150 > 500) {
												Static618.anInt10150 = 0;
												local217 = (int) (Math.random() * 8.0D);
												if ((local217 & 0x4) == 4) {
													Static185.anInt3051 += Static42.anInt4898;
												}
												if ((local217 & 0x2) == 2) {
													Static159.anInt2418 += Static166.anInt2564;
												}
												if ((local217 & 0x1) == 1) {
													Static342.anInt5820 += Static556.anInt9311;
												}
											}
											if (Static342.anInt5820 < -50) {
												Static556.anInt9311 = 2;
											}
											if (Static342.anInt5820 > 50) {
												Static556.anInt9311 = -2;
											}
											if (Static159.anInt2418 < -55) {
												Static166.anInt2564 = 2;
											}
											if (Static159.anInt2418 > 55) {
												Static166.anInt2564 = -2;
											}
											if (Static185.anInt3051 < -40) {
												Static42.anInt4898 = 1;
											}
											Static286.anInt5249++;
											if (Static185.anInt3051 > 40) {
												Static42.anInt4898 = -1;
											}
											if (Static286.anInt5249 > 500) {
												Static286.anInt5249 = 0;
												local217 = (int) (Math.random() * 8.0D);
												if ((local217 & 0x2) == 2) {
													Static195.anInt3404 += Static518.anInt8898;
												}
												if ((local217 & 0x1) == 1) {
													Static405.anInt7023 += Static646.anInt10621;
												}
											}
											if (Static405.anInt7023 < -60) {
												Static646.anInt10621 = 2;
											}
											if (Static195.anInt3404 < -20) {
												Static518.anInt8898 = 1;
											}
											if (Static405.anInt7023 > 60) {
												Static646.anInt10621 = -2;
											}
											if (Static195.anInt3404 > 10) {
												Static518.anInt8898 = -1;
											}
											Static277.aClass347_2.anInt9632++;
											if (Static277.aClass347_2.anInt9632 > 50) {
												@Pc(2349) Class14_Sub54 local2349 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static117.aClass251_66);
												Static277.aClass347_2.method8308(local2349);
											}
											if (Static489.aBoolean596) {
												Static235.method3974();
												Static489.aBoolean596 = false;
											}
											try {
												Static277.aClass347_2.method8303();
												return;
											} catch (@Pc(2366) IOException local2366) {
												Static486.method7340();
												return;
											}
										}
										local1820 = local1815.aClass299_2;
										if (local1820.anInt8590 < 0) {
											break;
										}
										local1835 = Static391.method5936(local1820.anInt8527);
									} while (local1835 == null || local1835.aClass299Array1 == null || local1820.anInt8590 >= local1835.aClass299Array1.length || local1835.aClass299Array1[local1820.anInt8590] != local1820);
									Static672.method9304(local1815);
								}
							}
							local1820 = local1815.aClass299_2;
							if (local1820.anInt8590 < 0) {
								break;
							}
							local1835 = Static391.method5936(local1820.anInt8527);
						} while (local1835 == null || local1835.aClass299Array1 == null || local1820.anInt8590 >= local1835.aClass299Array1.length || local1835.aClass299Array1[local1820.anInt8590] != local1820);
						Static672.method9304(local1815);
					}
				}
				local1820 = local1815.aClass299_2;
				if (local1820.anInt8590 < 0) {
					break;
				}
				local1835 = Static391.method5936(local1820.anInt8527);
			} while (local1835 == null || local1835.aClass299Array1 == null || local1835.aClass299Array1.length <= local1820.anInt8590 || local1820 != local1835.aClass299Array1[local1820.anInt8590]);
			Static672.method9304(local1815);
		}
	}
}
