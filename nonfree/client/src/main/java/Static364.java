import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!mea", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42;

	@OriginalMember(owner = "client!mea", name = "r", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_13 = new Class93(7, 0, 1, 1);

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(Z)V")
	public static void method5243() {
		if (Static226.anInt3963 > 1) {
			Static226.anInt3963--;
			Static70.anInt1402 = Static156.anInt2887;
		}
		if (Static231.aBoolean352) {
			Static231.aBoolean352 = false;
			Static226.method3385();
			return;
		}
		if (!Static532.aBoolean580) {
			Static79.method1311();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static678.method9026(); local27++) {
		}
		if (Static221.anInt3831 != 10) {
			return;
		}
		@Pc(51) Class3_Sub37 local51;
		@Pc(60) int local60;
		while (Static360.method5208()) {
			local51 = Static90.method1509(Static135.aClass240_28, Static226.aClass144_2);
			local51.aClass3_Sub4_Sub1_2.method7948(0);
			local60 = local51.aClass3_Sub4_Sub1_2.anInt9739;
			Static629.method8501(local51.aClass3_Sub4_Sub1_2);
			local51.aClass3_Sub4_Sub1_2.method7949(local51.aClass3_Sub4_Sub1_2.anInt9739 - local60);
			Static301.method2678(local51);
		}
		if (Static665.aClass3_Sub42_3 == null) {
			if (Static15.method380() >= Static214.aLong274) {
				Static665.aClass3_Sub42_3 = Static480.aClass79_1.method1710(Static98.aClass275_2.aString91);
			}
		} else if (Static665.aClass3_Sub42_3.anInt8103 != -1) {
			local51 = Static90.method1509(Static619.aClass240_110, Static226.aClass144_2);
			local51.aClass3_Sub4_Sub1_2.method7956(Static665.aClass3_Sub42_3.anInt8103);
			Static301.method2678(local51);
			Static665.aClass3_Sub42_3 = null;
			Static214.aLong274 = Static15.method380() + 30000L;
		}
		@Pc(124) Class3_Sub6 local124 = (Class3_Sub6) Static388.aClass302_43.method6603();
		@Pc(137) int local137;
		@Pc(159) int local159;
		@Pc(178) int local178;
		@Pc(223) int local223;
		@Pc(230) int local230;
		@Pc(242) int local242;
		@Pc(135) Class3_Sub37 local135;
		if (local124 != null || Static15.method380() - 2000L > Static435.aLong194) {
			local135 = null;
			local137 = 0;
			for (@Pc(142) Class3_Sub6 local142 = (Class3_Sub6) Static242.aClass302_47.method6603(); local142 != null && (local135 == null || local135.aClass3_Sub4_Sub1_2.anInt9739 - local137 < 240); local142 = (Class3_Sub6) Static242.aClass302_47.method6605()) {
				local142.method9034();
				local159 = local142.method5323();
				if (local159 < -1) {
					local159 = -1;
				} else if (local159 > 65534) {
					local159 = 65534;
				}
				local178 = local142.method5324();
				if (local178 < -1) {
					local178 = -1;
				} else if (local178 > 65534) {
					local178 = 65534;
				}
				if (Static561.anInt9073 != local178 || Static467.anInt7419 != local159) {
					if (local135 == null) {
						local135 = Static90.method1509(Static488.aClass240_84, Static226.aClass144_2);
						local135.aClass3_Sub4_Sub1_2.method7948(0);
						local137 = local135.aClass3_Sub4_Sub1_2.anInt9739;
					}
					local223 = local178 - Static561.anInt9073;
					Static561.anInt9073 = local178;
					local230 = local159 - Static467.anInt7419;
					Static467.anInt7419 = local159;
					local242 = (int) ((local142.method5327() - Static435.aLong194) / 20L);
					if (local242 < 8 && local223 >= -32 && local223 <= 31 && local230 >= -32 && local230 <= 31) {
						local230 += 32;
						local223 += 32;
						local135.aClass3_Sub4_Sub1_2.method7956(local230 + (local242 << 12) + (local223 << 6));
					} else if (local242 < 32 && local223 >= -128 && local223 <= 127 && local230 >= -128 && local230 <= 127) {
						local223 += 128;
						local135.aClass3_Sub4_Sub1_2.method7948(local242 + 128);
						local230 += 128;
						local135.aClass3_Sub4_Sub1_2.method7956(local230 + (local223 << 8));
					} else if (local242 < 32) {
						local135.aClass3_Sub4_Sub1_2.method7948(local242 + 192);
						if (local178 == 1 || local159 == -1) {
							local135.aClass3_Sub4_Sub1_2.method7909(Integer.MIN_VALUE);
						} else {
							local135.aClass3_Sub4_Sub1_2.method7909(local159 << 16 | local178);
						}
					} else {
						local135.aClass3_Sub4_Sub1_2.method7956(local242 + 57344);
						if (local178 == 1 || local159 == -1) {
							local135.aClass3_Sub4_Sub1_2.method7909(Integer.MIN_VALUE);
						} else {
							local135.aClass3_Sub4_Sub1_2.method7909(local178 | local159 << 16);
						}
					}
					Static435.aLong194 = local142.method5327();
				}
			}
			if (local135 != null) {
				local135.aClass3_Sub4_Sub1_2.method7949(local135.aClass3_Sub4_Sub1_2.anInt9739 - local137);
				Static301.method2678(local135);
			}
		}
		@Pc(433) int local433;
		if (local124 != null) {
			@Pc(419) long local419 = (local124.method5327() - Static351.aLong166) / 50L;
			if (local419 > 32767L) {
				local419 = 32767L;
			}
			Static351.aLong166 = local124.method5327();
			local433 = local124.method5323();
			if (local433 < 0) {
				local433 = 0;
			} else if (local433 > 65535) {
				local433 = 65535;
			}
			local159 = local124.method5324();
			if (local159 < 0) {
				local159 = 0;
			} else if (local159 > 65535) {
				local159 = 65535;
			}
			@Pc(467) byte local467 = 0;
			if (local124.method5326() == 2) {
				local467 = 1;
			}
			local223 = (int) local419;
			@Pc(486) Class3_Sub37 local486 = Static90.method1509(Static168.aClass240_31, Static226.aClass144_2);
			local486.aClass3_Sub4_Sub1_2.method7941(local223 | local467 << 15);
			local486.aClass3_Sub4_Sub1_2.method7909(local159 | local433 << 16);
			Static301.method2678(local486);
		}
		@Pc(541) long local541;
		if (Static273.anInt4689 > 0) {
			local135 = Static90.method1509(Static514.aClass240_88, Static226.aClass144_2);
			local135.aClass3_Sub4_Sub1_2.method7948(Static273.anInt4689 * 3);
			for (local137 = 0; local137 < Static273.anInt4689; local137++) {
				@Pc(533) Interface18 local533 = Static139.anInterface18Array3[local137];
				local541 = (local533.method3022() - Static41.aLong30) / 50L;
				Static41.aLong30 = local533.method3022();
				if (local541 > 65535L) {
					local541 = 65535L;
				}
				local135.aClass3_Sub4_Sub1_2.method7948(local533.method3023());
				local135.aClass3_Sub4_Sub1_2.method7956((int) local541);
			}
			Static301.method2678(local135);
		}
		if (Static201.anInt3562 > 0) {
			Static201.anInt3562--;
		}
		if (Static258.aBoolean305 && Static201.anInt3562 <= 0) {
			Static201.anInt3562 = 20;
			Static258.aBoolean305 = false;
			local135 = Static90.method1509(Static258.aClass240_42, Static226.aClass144_2);
			local135.aClass3_Sub4_Sub1_2.method7956((int) Static376.aFloat104 >> 3);
			local135.aClass3_Sub4_Sub1_2.method7956((int) Static318.aFloat81 >> 3);
			Static301.method2678(local135);
		}
		if (Static43.aBoolean56 != Static584.aBoolean658) {
			Static43.aBoolean56 = Static584.aBoolean658;
			local135 = Static90.method1509(Static24.aClass240_8, Static226.aClass144_2);
			local135.aClass3_Sub4_Sub1_2.method7948(Static584.aBoolean658 ? 1 : 0);
			Static301.method2678(local135);
		}
		if (!Static74.aBoolean102) {
			local135 = Static90.method1509(Static262.aClass240_43, Static226.aClass144_2);
			local135.aClass3_Sub4_Sub1_2.method7948(0);
			local137 = local135.aClass3_Sub4_Sub1_2.anInt9739;
			@Pc(670) Class3_Sub4 local670 = Static336.aClass3_Sub41_18.method6701();
			local135.aClass3_Sub4_Sub1_2.method7939(local670.aByteArray90, local670.anInt9739, 0);
			local135.aClass3_Sub4_Sub1_2.method7949(local135.aClass3_Sub4_Sub1_2.anInt9739 - local137);
			Static301.method2678(local135);
			Static74.aBoolean102 = true;
		}
		if (Static254.aClass368ArrayArrayArray2 != null) {
			if (Static451.anInt7263 == 2) {
				Static62.method1133();
			} else if (Static451.anInt7263 == 3) {
				Static29.method628();
			}
		}
		if (Static6.aBoolean4) {
			Static6.aBoolean4 = false;
		} else {
			Static209.aFloat66 /= 2.0F;
		}
		if (Static615.aBoolean715) {
			Static615.aBoolean715 = false;
		} else {
			Static560.aFloat177 /= 2.0F;
		}
		Static260.method3890();
		if (Static221.anInt3831 != 10) {
			return;
		}
		Static181.method2862();
		Static572.method7506();
		Static351.method5106();
		Static493.anInt7808++;
		if (Static493.anInt7808 > 750) {
			Static226.method3385();
			return;
		}
		Static589.method7797();
		Static426.method5889();
		Static482.method6364();
		for (local60 = Static210.aClass262_1.method5778(true); local60 != -1; local60 = Static210.aClass262_1.method5778(false)) {
			Static297.method4350(local60);
			Static146.anIntArray150[Static473.anInt7527++ & 0x1F] = local60;
		}
		for (@Pc(791) Class3_Sub5_Sub20 local791 = Static528.method6835(); local791 != null; local791 = Static528.method6835()) {
			local433 = local791.method8833();
			local541 = local791.method8829();
			if (local433 == 1) {
				Static484.anIntArray417[(int) local541] = local791.anInt10754;
				Static24.aBoolean32 |= Static373.aBooleanArray21[(int) local541];
				Static678.anIntArray632[Static113.anInt2068++ & 0x1F] = (int) local541;
			} else if (local433 == 2) {
				aStringArray42[(int) local541] = local791.aString117;
				Static318.anIntArray299[Static179.anInt9618++ & 0x1F] = (int) local541;
			} else {
				@Pc(909) Class265 local909;
				if (local433 == 3) {
					local909 = Static223.method3278((int) local541);
					if (!local791.aString117.equals(local909.aString86)) {
						local909.aString86 = local791.aString117;
						Static218.method3194(local909);
					}
				} else {
					@Pc(872) int local872;
					if (local433 == 4) {
						local909 = Static223.method3278((int) local541);
						local230 = local791.anInt10754;
						local242 = local791.anInt10756;
						local872 = local791.anInt10757;
						if (local909.anInt7023 != local230 || local242 != local909.anInt7050 || local909.anInt6988 != local872) {
							local909.anInt7050 = local242;
							local909.anInt6988 = local872;
							local909.anInt7023 = local230;
							Static218.method3194(local909);
						}
					} else if (local433 == 5) {
						local909 = Static223.method3278((int) local541);
						if (local909.anInt7026 != local791.anInt10754 || local791.anInt10754 == -1) {
							local909.anInt7026 = local791.anInt10754;
							local909.anInt7041 = 0;
							local909.anInt6979 = 0;
							local909.anInt7022 = 1;
							@Pc(1323) Class239 local1323 = local909.anInt7026 == -1 ? null : Static13.aClass213_1.method5008(local909.anInt7026);
							if (local1323 != null) {
								Static367.method9033(local909.anInt6979, local1323);
							}
							Static218.method3194(local909);
						}
					} else if (local433 == 6) {
						local223 = local791.anInt10754;
						local230 = local223 >> 10 & 0x1F;
						local242 = local223 >> 5 & 0x1F;
						local872 = local223 & 0x1F;
						@Pc(884) int local884 = (local872 << 3) + (local242 << 11) + (local230 << 19);
						@Pc(889) Class265 local889 = Static223.method3278((int) local541);
						if (local884 != local889.anInt6999) {
							local889.anInt6999 = local884;
							Static218.method3194(local889);
						}
					} else if (local433 == 7) {
						local909 = Static223.method3278((int) local541);
						@Pc(917) boolean local917 = local791.anInt10754 == 1;
						if (local917 != local909.aBoolean495) {
							local909.aBoolean495 = local917;
							Static218.method3194(local909);
						}
					} else if (local433 == 8) {
						local909 = Static223.method3278((int) local541);
						if (local791.anInt10754 != local909.anInt7030 || local791.anInt10756 != local909.anInt7036 || local791.anInt10757 != local909.anInt6969) {
							local909.anInt7030 = local791.anInt10754;
							local909.anInt7036 = local791.anInt10756;
							local909.anInt6969 = local791.anInt10757;
							if (local909.anInt7005 != -1) {
								if (local909.anInt7043 > 0) {
									local909.anInt6969 = local909.anInt6969 * 32 / local909.anInt7043;
								} else if (local909.anInt7011 > 0) {
									local909.anInt6969 = local909.anInt6969 * 32 / local909.anInt7011;
								}
							}
							Static218.method3194(local909);
						}
					} else if (local433 == 9) {
						local909 = Static223.method3278((int) local541);
						if (local791.anInt10754 != local909.anInt7005 || local909.anInt7045 != local791.anInt10756) {
							local909.anInt7005 = local791.anInt10754;
							local909.anInt7045 = local791.anInt10756;
							Static218.method3194(local909);
						}
					} else if (local433 == 10) {
						local909 = Static223.method3278((int) local541);
						if (local791.anInt10754 != local909.anInt7037 || local909.anInt7027 != local791.anInt10756 || local909.anInt6982 != local791.anInt10757) {
							local909.anInt6982 = local791.anInt10757;
							local909.anInt7027 = local791.anInt10756;
							local909.anInt7037 = local791.anInt10754;
							Static218.method3194(local909);
						}
					} else if (local433 == 11) {
						local909 = Static223.method3278((int) local541);
						local909.anInt6968 = local909.anInt7035 = local791.anInt10756;
						local909.aByte108 = 0;
						local909.aByte109 = 0;
						local909.anInt6993 = local909.anInt7048 = local791.anInt10754;
						Static218.method3194(local909);
					} else if (local433 == 12) {
						local909 = Static223.method3278((int) local541);
						local230 = local791.anInt10754;
						if (local909 != null && local909.anInt6967 == 0) {
							if (local909.anInt7020 - local909.anInt6997 < local230) {
								local230 = local909.anInt7020 - local909.anInt6997;
							}
							if (local230 < 0) {
								local230 = 0;
							}
							if (local909.anInt7002 != local230) {
								local909.anInt7002 = local230;
								Static218.method3194(local909);
							}
						}
					} else if (local433 == 14) {
						local909 = Static223.method3278((int) local541);
						local909.anInt7012 = local791.anInt10754;
					} else if (local433 == 15) {
						Static280.aBoolean314 = true;
						Static643.anInt10566 = local791.anInt10756;
						Static622.anInt10293 = local791.anInt10754;
					} else if (local433 == 16) {
						local909 = Static223.method3278((int) local541);
						local909.anInt6975 = local791.anInt10754;
					} else if (local433 == 17) {
						local909 = Static223.method3278((int) local541);
						local909.anInt6964 = local791.anInt10754;
					} else if (local433 == 18) {
						local909 = Static223.method3278((int) local541);
						local230 = (int) (local541 >> 32);
						local909.method5904((short) local791.anInt10754, local230, (short) local791.anInt10756);
					} else if (local433 == 19) {
						local909 = Static223.method3278((int) local541);
						local230 = (int) (local541 >> 32);
						local909.method5915((short) local791.anInt10756, local230, (short) local791.anInt10754);
					}
				}
			}
		}
		if (Static221.anInt3832 != 0) {
			Static668.anInt10817 += 20;
			if (Static668.anInt10817 >= 400) {
				Static221.anInt3832 = 0;
			}
		}
		Static281.anInt4774++;
		if (Static167.aClass265_5 != null) {
			Static42.anInt883++;
			if (Static42.anInt883 >= 15) {
				Static218.method3194(Static167.aClass265_5);
				Static167.aClass265_5 = null;
			}
		}
		Static52.aBoolean75 = false;
		Static464.aBoolean528 = false;
		Static118.aClass265_13 = null;
		Static630.aClass265_14 = null;
		Static103.method1672((Class265) null, -1, -1);
		Static421.method5795(-1, -1, (Class265) null);
		if (!Static47.aBoolean59) {
			Static530.anInt8325 = -1;
		}
		Static357.method5168();
		Static156.anInt2887++;
		if (Static292.aBoolean339) {
			@Pc(1493) Class3_Sub37 local1493 = Static90.method1509(Static666.aClass240_115, Static226.aClass144_2);
			local1493.aClass3_Sub4_Sub1_2.method7943(Static62.anInt1291 | Static367.anInt10957 << 28 | Static276.anInt4708 << 14);
			Static301.method2678(local1493);
			Static292.aBoolean339 = false;
		}
		while (true) {
			@Pc(1516) Class3_Sub53 local1516;
			@Pc(1529) Class265 local1529;
			@Pc(1521) Class265 local1521;
			do {
				local1516 = (Class3_Sub53) Static432.aClass302_46.method6611();
				if (local1516 == null) {
					while (true) {
						do {
							local1516 = (Class3_Sub53) Static538.aClass302_53.method6611();
							if (local1516 == null) {
								while (true) {
									do {
										local1516 = (Class3_Sub53) Static221.aClass302_22.method6611();
										if (local1516 == null) {
											if (Static118.aClass265_13 == null) {
												Static263.anInt2105 = 0;
											}
											if (Static264.aClass265_8 != null) {
												Static289.method4164();
											}
											if (Static512.anInt8070 > 0 && Static413.aClass154_1.method5014(82) && Static413.aClass154_1.method5014(81) && Static565.anInt9132 != 0) {
												local433 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 - Static565.anInt9132;
												if (local433 < 0) {
													local433 = 0;
												} else if (local433 > 3) {
													local433 = 3;
												}
												Static290.method4178(local433, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] + Static534.anInt8358, Static402.anInt6661 - -Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0]);
											}
											Static265.method3920();
											for (local433 = 0; local433 < 5; local433++) {
												@Pc(1716) int local1716 = Static522.anIntArray441[local433]++;
											}
											if (Static24.aBoolean32 && Static643.aLong291 < Static15.method380() - 60000L) {
												Static5.method85();
											}
											for (@Pc(1745) Class34_Sub3_Sub1 local1745 = (Class34_Sub3_Sub1) Static315.aClass317_4.method6891(); local1745 != null; local1745 = (Class34_Sub3_Sub1) Static315.aClass317_4.method6894()) {
												if ((long) local1745.anInt3082 < Static15.method380() / 1000L - 5L) {
													if (local1745.aShort33 > 0) {
														Static390.method5455(0, local1745.aString43 + Static114.aClass84_19.method1729(Static654.anInt10668), "", 5, "", "");
													}
													if (local1745.aShort33 == 0) {
														Static390.method5455(0, local1745.aString43 + Static114.aClass84_20.method1729(Static654.anInt10668), "", 5, "", "");
													}
													local1745.method8764();
												}
											}
											Static608.anInt10131++;
											if (Static608.anInt10131 > 500) {
												Static608.anInt10131 = 0;
												local178 = (int) (Math.random() * 8.0D);
												if ((local178 & 0x4) == 4) {
													Static307.anInt5275 += Static316.anInt5291;
												}
												if ((local178 & 0x1) == 1) {
													Static388.anInt6480 += Static310.anInt5194;
												}
												if ((local178 & 0x2) == 2) {
													Static212.anInt3684 += Static286.anInt4850;
												}
											}
											if (Static388.anInt6480 < -50) {
												Static310.anInt5194 = 2;
											}
											if (Static388.anInt6480 > 50) {
												Static310.anInt5194 = -2;
											}
											if (Static212.anInt3684 < -55) {
												Static286.anInt4850 = 2;
											}
											if (Static212.anInt3684 > 55) {
												Static286.anInt4850 = -2;
											}
											if (Static307.anInt5275 < -40) {
												Static316.anInt5291 = 1;
											}
											Static587.anInt9547++;
											if (Static307.anInt5275 > 40) {
												Static316.anInt5291 = -1;
											}
											if (Static587.anInt9547 > 500) {
												Static587.anInt9547 = 0;
												local178 = (int) (Math.random() * 8.0D);
												if ((local178 & 0x2) == 2) {
													Static30.anInt1549 += Static386.anInt6435;
												}
												if ((local178 & 0x1) == 1) {
													Static234.anInt4142 += Static164.anInt3011;
												}
											}
											if (Static234.anInt4142 < -60) {
												Static164.anInt3011 = 2;
											}
											if (Static234.anInt4142 > 60) {
												Static164.anInt3011 = -2;
											}
											if (Static30.anInt1549 < -20) {
												Static386.anInt6435 = 1;
											}
											Static156.anInt2889++;
											if (Static30.anInt1549 > 10) {
												Static386.anInt6435 = -1;
											}
											if (Static156.anInt2889 > 50) {
												@Pc(1977) Class3_Sub37 local1977 = Static90.method1509(Static441.aClass240_74, Static226.aClass144_2);
												Static301.method2678(local1977);
											}
											if (Static212.aBoolean258) {
												Static272.method4015();
												Static212.aBoolean258 = false;
											}
											try {
												Static538.method6888();
												return;
											} catch (@Pc(1990) IOException local1990) {
												Static226.method3385();
												return;
											}
										}
										local1521 = local1516.aClass265_16;
										if (local1521.anInt7004 < 0) {
											break;
										}
										local1529 = Static223.method3278(local1521.anInt6985);
									} while (local1529 == null || local1529.aClass265Array4 == null || local1529.aClass265Array4.length <= local1521.anInt7004 || local1521 != local1529.aClass265Array4[local1521.anInt7004]);
									Static250.method3767(local1516);
								}
							}
							local1521 = local1516.aClass265_16;
							if (local1521.anInt7004 < 0) {
								break;
							}
							local1529 = Static223.method3278(local1521.anInt6985);
						} while (local1529 == null || local1529.aClass265Array4 == null || local1521.anInt7004 >= local1529.aClass265Array4.length || local1529.aClass265Array4[local1521.anInt7004] != local1521);
						Static250.method3767(local1516);
					}
				}
				local1521 = local1516.aClass265_16;
				if (local1521.anInt7004 < 0) {
					break;
				}
				local1529 = Static223.method3278(local1521.anInt6985);
			} while (local1529 == null || local1529.aClass265Array4 == null || local1521.anInt7004 >= local1529.aClass265Array4.length || local1529.aClass265Array4[local1521.anInt7004] != local1521);
			Static250.method3767(local1516);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)I")
	public static int method5246(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg0 + arg4 && arg5 + arg1 > arg0) {
			return arg3 + arg6 > arg7 && arg7 + arg2 > arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method5248(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				@Pc(63) char local63 = Static138.aCharArray1[(int) (local49 - arg0 * 37L)];
				if (local63 == '_') {
					@Pc(71) int local71 = local45.length() - 1;
					local45.setCharAt(local71, Character.toUpperCase(local45.charAt(local71)));
					local63 = ' ';
				}
				local45.append(local63);
			}
			local45.reverse();
			local45.setCharAt(0, Character.toUpperCase(local45.charAt(0)));
			return local45.toString();
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
	public static void method5249() {
		if (Static221.anInt3831 == 3) {
			Static279.method4069(4);
		} else if (Static221.anInt3831 == 7) {
			Static279.method4069(8);
		} else if (Static221.anInt3831 == 10) {
			Static279.method4069(11);
		}
	}
}
