import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "[[Lclient!vv;")
	public static Class11_Sub1[][] aClass11_Sub1ArrayArray2;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "[F")
	public static final float[] aFloatArray42 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "Lclient!dca;")
	public static final Class54 aClass54_5 = new Class54();

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
	public static int anInt4887 = 0;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZB)V")
	public static void method3889(@OriginalArg(0) boolean arg0) {
		for (@Pc(17) Class1_Sub4 local17 = (Class1_Sub4) Static592.aClass111_65.method2547(); local17 != null; local17 = (Class1_Sub4) Static592.aClass111_65.method2554()) {
			if (local17.aClass1_Sub6_Sub4_1 != null) {
				Static425.aClass1_Sub6_Sub3_2.method6532(local17.aClass1_Sub6_Sub4_1);
				local17.aClass1_Sub6_Sub4_1 = null;
			}
			if (local17.aClass1_Sub6_Sub4_2 != null) {
				Static425.aClass1_Sub6_Sub3_2.method6532(local17.aClass1_Sub6_Sub4_2);
				local17.aClass1_Sub6_Sub4_2 = null;
			}
			local17.method7908();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(56) Class1_Sub4 local56 = (Class1_Sub4) Static452.aClass111_52.method2547(); local56 != null; local56 = (Class1_Sub4) Static452.aClass111_52.method2554()) {
			if (local56.aClass1_Sub6_Sub4_1 != null) {
				Static425.aClass1_Sub6_Sub3_2.method6532(local56.aClass1_Sub6_Sub4_1);
				local56.aClass1_Sub6_Sub4_1 = null;
			}
			local56.method7908();
		}
		for (@Pc(83) Class1_Sub4 local83 = (Class1_Sub4) Static60.aClass91_3.method2278(); local83 != null; local83 = (Class1_Sub4) Static60.aClass91_3.method2276()) {
			if (local83.aClass1_Sub6_Sub4_1 != null) {
				Static425.aClass1_Sub6_Sub3_2.method6532(local83.aClass1_Sub6_Sub4_1);
				local83.aClass1_Sub6_Sub4_1 = null;
			}
			local83.method7908();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)I")
	public static int method3892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
	public static void method3895() {
		if (Static208.anInt8063 > 1) {
			Static303.anInt5647 = Static259.anInt4739;
			Static208.anInt8063--;
		}
		if (Static303.aBoolean438) {
			Static303.aBoolean438 = false;
			Static335.method4988();
			return;
		}
		if (!Static406.aBoolean553) {
			Static217.method3239();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static259.method3767(); local29++) {
		}
		if (Static55.anInt1068 != 10) {
			return;
		}
		@Pc(49) Class1_Sub9 local49;
		@Pc(58) int local58;
		while (Static304.method4604()) {
			local49 = Static123.method2194(Static469.aClass235_2, Static498.aClass208_20);
			local49.aClass1_Sub3_Sub1_1.method7917(0);
			local58 = local49.aClass1_Sub3_Sub1_1.anInt9802;
			Static10.method240(local49.aClass1_Sub3_Sub1_1);
			local49.aClass1_Sub3_Sub1_1.method7947(local49.aClass1_Sub3_Sub1_1.anInt9802 - local58);
			Static42.method746(local49);
		}
		if (Static169.aClass1_Sub46_1 == null) {
			if (Static480.method6650() >= Static328.aLong147) {
				Static169.aClass1_Sub46_1 = Static225.aClass72_1.method1499(Static221.aClass261_3.aString81);
			}
		} else if (Static169.aClass1_Sub46_1.anInt8973 != -1) {
			local49 = Static123.method2194(Static469.aClass235_2, Static334.aClass208_78);
			local49.aClass1_Sub3_Sub1_1.method7937(Static169.aClass1_Sub46_1.anInt8973);
			Static42.method746(local49);
			Static169.aClass1_Sub46_1 = null;
			Static328.aLong147 = Static480.method6650() + 30000L;
		}
		@Pc(130) Class1_Sub12 local130 = (Class1_Sub12) Static121.aClass111_9.method2547();
		@Pc(147) int local147;
		@Pc(170) int local170;
		@Pc(189) int local189;
		@Pc(234) int local234;
		@Pc(240) int local240;
		@Pc(251) int local251;
		@Pc(145) Class1_Sub9 local145;
		if (local130 != null || Static263.aLong122 < Static480.method6650() - 2000L) {
			local145 = null;
			local147 = 0;
			for (@Pc(152) Class1_Sub12 local152 = (Class1_Sub12) Static152.aClass111_13.method2547(); local152 != null && (local145 == null || local145.aClass1_Sub3_Sub1_1.anInt9802 - local147 < 240); local152 = (Class1_Sub12) Static152.aClass111_13.method2554()) {
				local152.method7908();
				local170 = local152.method6689();
				if (local170 < -1) {
					local170 = -1;
				} else if (local170 > 65534) {
					local170 = 65534;
				}
				local189 = local152.method6682();
				if (local189 < -1) {
					local189 = -1;
				} else if (local189 > 65534) {
					local189 = 65534;
				}
				if (local189 != Static541.anInt9068 || Static52.anInt7869 != local170) {
					if (local145 == null) {
						local145 = Static123.method2194(Static469.aClass235_2, Static8.aClass208_72);
						local145.aClass1_Sub3_Sub1_1.method7917(0);
						local147 = local145.aClass1_Sub3_Sub1_1.anInt9802;
					}
					local234 = local189 - Static541.anInt9068;
					Static541.anInt9068 = local189;
					local240 = local170 - Static52.anInt7869;
					Static52.anInt7869 = local170;
					local251 = (int) ((local152.method6684() - Static263.aLong122) / 20L);
					if (local251 < 8 && local234 >= -32 && local234 <= 31 && local240 >= -32 && local240 <= 31) {
						local234 += 32;
						local240 += 32;
						local145.aClass1_Sub3_Sub1_1.method7937((local234 << 6) + (local251 << 12) + local240);
					} else if (local251 < 32 && local234 >= -128 && local234 <= 127 && local240 >= -128 && local240 <= 127) {
						local234 += 128;
						local145.aClass1_Sub3_Sub1_1.method7917(local251 + 128);
						local240 += 128;
						local145.aClass1_Sub3_Sub1_1.method7937(local240 + (local234 << 8));
					} else if (local251 >= 32) {
						local145.aClass1_Sub3_Sub1_1.method7937(local251 + 57344);
						if (local189 == 1 || local170 == -1) {
							local145.aClass1_Sub3_Sub1_1.method7936(Integer.MIN_VALUE);
						} else {
							local145.aClass1_Sub3_Sub1_1.method7936(local170 << 16 | local189);
						}
					} else {
						local145.aClass1_Sub3_Sub1_1.method7917(local251 + 192);
						if (local189 == 1 || local170 == -1) {
							local145.aClass1_Sub3_Sub1_1.method7936(Integer.MIN_VALUE);
						} else {
							local145.aClass1_Sub3_Sub1_1.method7936(local170 << 16 | local189);
						}
					}
					Static263.aLong122 = local152.method6684();
				}
			}
			if (local145 != null) {
				local145.aClass1_Sub3_Sub1_1.method7947(local145.aClass1_Sub3_Sub1_1.anInt9802 - local147);
				Static42.method746(local145);
			}
		}
		@Pc(450) int local450;
		if (local130 != null) {
			@Pc(434) long local434 = (local130.method6684() - Static288.aLong130) / 50L;
			Static288.aLong130 = local130.method6684();
			if (local434 > 32767L) {
				local434 = 32767L;
			}
			local450 = local130.method6689();
			if (local450 < 0) {
				local450 = 0;
			} else if (local450 > 65535) {
				local450 = 65535;
			}
			local170 = local130.method6682();
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 65535) {
				local170 = 65535;
			}
			@Pc(483) byte local483 = 0;
			if (local130.method6688() == 2) {
				local483 = 1;
			}
			local234 = (int) local434;
			@Pc(504) Class1_Sub9 local504 = Static123.method2194(Static469.aClass235_2, Static243.aClass208_55);
			local504.aClass1_Sub3_Sub1_1.method7936(local170 | local450 << 16);
			local504.aClass1_Sub3_Sub1_1.method7923(local483 << 15 | local234);
			Static42.method746(local504);
		}
		if (Static582.anInt9584 > 0) {
			local145 = Static123.method2194(Static469.aClass235_2, Static197.aClass208_44);
			local145.aClass1_Sub3_Sub1_1.method7917(Static582.anInt9584 * 3);
			for (local147 = 0; local147 < Static582.anInt9584; local147++) {
				@Pc(554) Interface14 local554 = Static182.anInterface14Array1[local147];
				@Pc(563) long local563 = (local554.method6439() - Static194.aLong97) / 50L;
				if (local563 > 65535L) {
					local563 = 65535L;
				}
				Static194.aLong97 = local554.method6439();
				local145.aClass1_Sub3_Sub1_1.method7917(local554.method6440());
				local145.aClass1_Sub3_Sub1_1.method7937((int) local563);
			}
			Static42.method746(local145);
		}
		if (Static296.anInt5347 > 0) {
			Static296.anInt5347--;
		}
		if (Static539.aBoolean676 && Static296.anInt5347 <= 0) {
			Static539.aBoolean676 = false;
			Static296.anInt5347 = 20;
			local145 = Static123.method2194(Static469.aClass235_2, Static30.aClass208_13);
			local145.aClass1_Sub3_Sub1_1.method7912((int) Static331.aFloat172 >> 3);
			local145.aClass1_Sub3_Sub1_1.method7912((int) Static487.aFloat206 >> 3);
			Static42.method746(local145);
		}
		if (Static95.aBoolean112 != Static13.aBoolean9) {
			Static95.aBoolean112 = Static13.aBoolean9;
			local145 = Static123.method2194(Static469.aClass235_2, Static551.aClass208_106);
			local145.aClass1_Sub3_Sub1_1.method7917(Static13.aBoolean9 ? 1 : 0);
			Static42.method746(local145);
		}
		if (!Static518.aBoolean696) {
			local145 = Static123.method2194(Static469.aClass235_2, Static437.aClass208_95);
			local145.aClass1_Sub3_Sub1_1.method7917(0);
			local147 = local145.aClass1_Sub3_Sub1_1.anInt9802;
			@Pc(691) Class1_Sub3 local691 = new Class1_Sub3(Static5.method84());
			Static86.aClass1_Sub30_Sub1_1.method5021(local691);
			local145.aClass1_Sub3_Sub1_1.method7973(local691.anInt9802, local691.aByteArray104);
			local145.aClass1_Sub3_Sub1_1.method7947(local145.aClass1_Sub3_Sub1_1.anInt9802 - local147);
			Static42.method746(local145);
			Static518.aBoolean696 = true;
		}
		if (Static568.aClass360ArrayArrayArray22 != null) {
			if (Static358.anInt9363 == 2) {
				Static391.method5621();
			} else if (Static358.anInt9363 == 3) {
				Static527.method7267();
			}
		}
		if (Static202.aBoolean275) {
			Static202.aBoolean275 = false;
		} else {
			Static240.aFloat125 /= 2.0F;
		}
		if (Static188.aBoolean269) {
			Static188.aBoolean269 = false;
		} else {
			Static372.aFloat179 /= 2.0F;
		}
		Static510.method7144();
		if (Static55.anInt1068 != 10) {
			return;
		}
		Static205.method3164();
		Static461.method6447();
		Static565.method7636();
		Static101.anInt1769++;
		if (Static101.anInt1769 > 750) {
			Static335.method4988();
			return;
		}
		Static171.method2749();
		Static240.method3552();
		Static211.method3206();
		for (local58 = Static390.aClass353_29.method7625(true); local58 != -1; local58 = Static390.aClass353_29.method7625(false)) {
			Static129.method2274(local58);
			Static537.anIntArray566[Static317.anInt9284++ & 0x1F] = local58;
		}
		@Pc(881) Class160 local881;
		for (@Pc(829) Class1_Sub8_Sub9 local829 = Static355.method5290(); local829 != null; local829 = Static355.method5290()) {
			local450 = local829.method4837();
			local170 = local829.method4836();
			if (local450 == 1) {
				Static250.anIntArray251[local170] = local829.anInt5968;
				Static136.aBoolean203 |= Static166.aBooleanArray34[local170];
				Static180.anIntArray598[Static316.anInt5789++ & 0x1F] = local170;
			} else if (local450 == 2) {
				Static69.aStringArray1[local170] = local829.aString71;
				Static160.anIntArray140[Static465.anInt8053++ & 0x1F] = local170;
			} else if (local450 == 3) {
				local881 = Static512.method7155(local170);
				if (!local829.aString71.equals(local881.aString44)) {
					local881.aString44 = local829.aString71;
					Static415.method5900(local881);
				}
			} else if (local450 == 4) {
				local881 = Static512.method7155(local170);
				local234 = local829.anInt5968;
				local240 = local829.anInt5970;
				local251 = local829.anInt5969;
				if (local881.anInt4172 != local234 || local240 != local881.anInt4189 || local881.anInt4197 != local251) {
					local881.anInt4172 = local234;
					local881.anInt4197 = local251;
					local881.anInt4189 = local240;
					Static415.method5900(local881);
				}
			} else if (local450 == 5) {
				local881 = Static512.method7155(local170);
				if (local881.anInt4143 != local829.anInt5968 || local829.anInt5968 == -1) {
					local881.anInt4154 = 1;
					local881.anInt4222 = 0;
					local881.anInt4143 = local829.anInt5968;
					local881.anInt4148 = 0;
					@Pc(920) Class197 local920 = local881.anInt4143 == -1 ? null : Static223.aClass245_1.method5312(local881.anInt4143);
					if (local920 != null) {
						Static392.method5630(local920, local881.anInt4148);
					}
					Static415.method5900(local881);
				}
			} else if (local450 == 6) {
				local189 = local829.anInt5968;
				local234 = local189 >> 10 & 0x1F;
				local240 = local189 >> 5 & 0x1F;
				local251 = local189 & 0x1F;
				@Pc(1290) int local1290 = (local251 << 3) + (local240 << 11) + (local234 << 19);
				@Pc(1294) Class160 local1294 = Static512.method7155(local170);
				if (local1294.anInt4225 != local1290) {
					local1294.anInt4225 = local1290;
					Static415.method5900(local1294);
				}
			} else if (local450 == 7) {
				local881 = Static512.method7155(local170);
				@Pc(954) boolean local954 = local829.anInt5968 == 1;
				if (local881.aBoolean295 != local954) {
					local881.aBoolean295 = local954;
					Static415.method5900(local881);
				}
			} else if (local450 == 8) {
				local881 = Static512.method7155(local170);
				if (local881.anInt4179 != local829.anInt5968 || local881.anInt4214 != local829.anInt5970 || local881.anInt4209 != local829.anInt5969) {
					local881.anInt4179 = local829.anInt5968;
					local881.anInt4214 = local829.anInt5970;
					local881.anInt4209 = local829.anInt5969;
					if (local881.anInt4205 != -1) {
						if (local881.anInt4150 > 0) {
							local881.anInt4209 = local881.anInt4209 * 32 / local881.anInt4150;
						} else if (local881.anInt4173 > 0) {
							local881.anInt4209 = local881.anInt4209 * 32 / local881.anInt4173;
						}
					}
					Static415.method5900(local881);
				}
			} else if (local450 == 9) {
				local881 = Static512.method7155(local170);
				if (local829.anInt5968 != local881.anInt4205 || local829.anInt5970 != local881.anInt4178) {
					local881.anInt4205 = local829.anInt5968;
					local881.anInt4178 = local829.anInt5970;
					Static415.method5900(local881);
				}
			} else if (local450 == 10) {
				local881 = Static512.method7155(local170);
				if (local881.anInt4212 != local829.anInt5968 || local881.anInt4135 != local829.anInt5970 || local829.anInt5969 != local881.anInt4175) {
					local881.anInt4135 = local829.anInt5970;
					local881.anInt4175 = local829.anInt5969;
					local881.anInt4212 = local829.anInt5968;
					Static415.method5900(local881);
				}
			} else if (local450 == 11) {
				local881 = Static512.method7155(local170);
				local881.anInt4169 = local881.anInt4137 = local829.anInt5968;
				local881.aByte58 = 0;
				local881.anInt4171 = local881.anInt4202 = local829.anInt5970;
				local881.aByte56 = 0;
				Static415.method5900(local881);
			} else if (local450 == 12) {
				local881 = Static512.method7155(local170);
				local234 = local829.anInt5968;
				if (local881 != null && local881.anInt4166 == 0) {
					if (local881.anInt4198 - local881.anInt4156 < local234) {
						local234 = local881.anInt4198 - local881.anInt4156;
					}
					if (local234 < 0) {
						local234 = 0;
					}
					if (local881.anInt4218 != local234) {
						local881.anInt4218 = local234;
						Static415.method5900(local881);
					}
				}
			} else if (local450 == 14) {
				local881 = Static512.method7155(local170);
				local881.anInt4203 = local829.anInt5968;
			} else if (local450 == 15) {
				Static395.aBoolean537 = true;
				Static258.anInt4724 = local829.anInt5968;
				Static345.anInt9498 = local829.anInt5970;
			} else if (local450 == 16) {
				local881 = Static512.method7155(local170);
				local881.anInt4145 = local829.anInt5968;
			}
		}
		Static175.anInt3258++;
		if (Static361.anInt6564 != 0) {
			Static300.anInt9559 += 20;
			if (Static300.anInt9559 >= 400) {
				Static361.anInt6564 = 0;
			}
		}
		if (Static375.aClass160_24 != null) {
			Static80.anInt1540++;
			if (Static80.anInt1540 >= 15) {
				Static415.method5900(Static375.aClass160_24);
				Static375.aClass160_24 = null;
			}
		}
		Static241.aBoolean321 = false;
		Static348.aClass160_23 = null;
		Static263.aBoolean363 = false;
		Static345.aClass160_44 = null;
		Static273.method1045(null, -1, -1);
		Static443.method6237(-1, null, -1);
		if (!Static563.aBoolean697) {
			Static422.anInt7430 = -1;
		}
		Static276.method4017();
		Static259.anInt4739++;
		if (Static409.aBoolean555) {
			@Pc(1472) Class1_Sub9 local1472 = Static123.method2194(Static469.aClass235_2, Static204.aClass208_47);
			local1472.aClass1_Sub3_Sub1_1.method7960(Static210.anInt3910 | Static506.anInt8779 << 28 | Static311.anInt5697 << 14);
			Static42.method746(local1472);
			Static409.aBoolean555 = false;
		}
		while (true) {
			@Pc(1495) Class1_Sub22 local1495;
			@Pc(1500) Class160 local1500;
			do {
				local1495 = (Class1_Sub22) Static464.aClass111_64.method2553();
				if (local1495 == null) {
					while (true) {
						do {
							local1495 = (Class1_Sub22) Static25.aClass111_2.method2553();
							if (local1495 == null) {
								while (true) {
									do {
										local1495 = (Class1_Sub22) Static438.aClass111_48.method2553();
										if (local1495 == null) {
											if (Static345.aClass160_44 == null) {
												Static32.anInt689 = 0;
											}
											if (Static488.aClass160_36 != null) {
												Static5.method83();
											}
											if (Static203.anInt3822 > 0 && Static326.aClass97_3.method2365(82) && Static326.aClass97_3.method2365(81) && Static415.anInt7330 != 0) {
												local450 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 - Static415.anInt7330;
												if (local450 < 0) {
													local450 = 0;
												} else if (local450 > 3) {
													local450 = 3;
												}
												Static499.method7030(local450, Static539.anInt9045 + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0], Static311.anInt5708 - -Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0]);
											}
											Static390.method7710();
											for (local450 = 0; local450 < 5; local450++) {
												@Pc(1701) int local1701 = Static472.anIntArray513[local450]++;
											}
											if (Static136.aBoolean203 && Static190.aLong163 < Static480.method6650() - 60000L) {
												Static132.method2304();
											}
											for (@Pc(1728) Class11_Sub5_Sub2 local1728 = (Class11_Sub5_Sub2) Static386.aClass196_7.method4024(); local1728 != null; local1728 = (Class11_Sub5_Sub2) Static386.aClass196_7.method4028()) {
												if (Static480.method6650() / 1000L - 5L > (long) local1728.anInt4913) {
													if (local1728.aShort57 > 0) {
														Static308.method4624("", 0, 5, "", local1728.aString55 + Static375.aClass253_23.method5453(Static161.anInt3095), "");
													}
													if (local1728.aShort57 == 0) {
														Static308.method4624("", 0, 5, "", local1728.aString55 + Static375.aClass253_24.method5453(Static161.anInt3095), "");
													}
													local1728.method7200();
												}
											}
											Static385.anInt6900++;
											if (Static385.anInt6900 > 500) {
												Static385.anInt6900 = 0;
												local189 = (int) (Math.random() * 8.0D);
												if ((local189 & 0x1) == 1) {
													Static439.anInt8378 += Static19.anInt535;
												}
												if ((local189 & 0x4) == 4) {
													Static570.anInt9433 += Static384.anInt6820;
												}
												if ((local189 & 0x2) == 2) {
													Static324.anInt5952 += Static131.anInt2623;
												}
											}
											if (Static439.anInt8378 < -50) {
												Static19.anInt535 = 2;
											}
											if (Static324.anInt5952 < -55) {
												Static131.anInt2623 = 2;
											}
											if (Static439.anInt8378 > 50) {
												Static19.anInt535 = -2;
											}
											if (Static324.anInt5952 > 55) {
												Static131.anInt2623 = -2;
											}
											if (Static570.anInt9433 < -40) {
												Static384.anInt6820 = 1;
											}
											if (Static570.anInt9433 > 40) {
												Static384.anInt6820 = -1;
											}
											Static505.anInt8774++;
											if (Static505.anInt8774 > 500) {
												Static505.anInt8774 = 0;
												local189 = (int) (Math.random() * 8.0D);
												if ((local189 & 0x2) == 2) {
													anInt4887 += Static295.anInt5332;
												}
												if ((local189 & 0x1) == 1) {
													Static272.anInt5007 += Static369.anInt9005;
												}
											}
											if (Static272.anInt5007 < -60) {
												Static369.anInt9005 = 2;
											}
											if (Static272.anInt5007 > 60) {
												Static369.anInt9005 = -2;
											}
											if (anInt4887 < -20) {
												Static295.anInt5332 = 1;
											}
											if (anInt4887 > 10) {
												Static295.anInt5332 = -1;
											}
											Static337.anInt6171++;
											if (Static337.anInt6171 > 50) {
												@Pc(1957) Class1_Sub9 local1957 = Static123.method2194(Static469.aClass235_2, Static508.aClass208_101);
												Static42.method746(local1957);
											}
											if (Static337.aBoolean471) {
												Static187.method3026();
												Static337.aBoolean471 = false;
											}
											try {
												Static54.method938();
												return;
											} catch (@Pc(1970) IOException local1970) {
												Static335.method4988();
												return;
											}
										}
										local1500 = local1495.aClass160_10;
										if (local1500.anInt4146 < 0) {
											break;
										}
										local881 = Static512.method7155(local1500.anInt4224);
									} while (local881 == null || local881.aClass160Array1 == null || local881.aClass160Array1.length <= local1500.anInt4146 || local1500 != local881.aClass160Array1[local1500.anInt4146]);
									Static451.method6311(local1495);
								}
							}
							local1500 = local1495.aClass160_10;
							if (local1500.anInt4146 < 0) {
								break;
							}
							local881 = Static512.method7155(local1500.anInt4224);
						} while (local881 == null || local881.aClass160Array1 == null || local1500.anInt4146 >= local881.aClass160Array1.length || local1500 != local881.aClass160Array1[local1500.anInt4146]);
						Static451.method6311(local1495);
					}
				}
				local1500 = local1495.aClass160_10;
				if (local1500.anInt4146 < 0) {
					break;
				}
				local881 = Static512.method7155(local1500.anInt4224);
			} while (local881 == null || local881.aClass160Array1 == null || local881.aClass160Array1.length <= local1500.anInt4146 || local1500 != local881.aClass160Array1[local1500.anInt4146]);
			Static451.method6311(local1495);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!pn;B)I")
	public static int method3896(@OriginalArg(0) Class271 arg0) {
		if (arg0 == Static573.aClass271_15) {
			return 6407;
		} else if (Static429.aClass271_12 == arg0) {
			return 6408;
		} else if (Static268.aClass271_7 == arg0) {
			return 6406;
		} else if (Static253.aClass271_6 == arg0) {
			return 6409;
		} else if (Static560.aClass271_14 == arg0) {
			return 6410;
		} else if (arg0 == Static243.aClass271_5) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
