import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "J")
	public static long aLong193;

	// $FF: synthetic field
	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Ljava/lang/Class;")
	private static Class aClass14;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V")
	public static void method5162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static398.anInt6878 <= arg0 && Static8.anInt136 >= arg2 && Static605.anInt9561 <= arg5 && Static223.anInt4380 >= arg1) {
			if (arg3 == 1) {
				Static102.method1982(arg0, arg2, arg4, arg1, arg5);
			} else {
				Static241.method4234(arg1, arg3, arg5, arg4, arg2, arg0);
			}
		} else if (arg3 == 1) {
			Static32.method423(arg0, arg2, arg4, arg5, arg1);
		} else {
			Static292.method4773(arg2, arg1, arg3, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method5163() {
		if (Static594.anInt9443 > 1) {
			Static594.anInt9443--;
			Static128.anInt2539 = Static633.anInt8242;
		}
		if (Static525.aClass260_4.aBoolean538) {
			Static525.aClass260_4.aBoolean538 = false;
			Static578.method8055();
			return;
		}
		if (!Static484.aBoolean623) {
			Static67.method816();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Static150.method2926(Static525.aClass260_4); local36++) {
		}
		if (Static37.anInt498 != 11) {
			return;
		}
		@Pc(71) Class6_Sub13 local71;
		@Pc(80) int local80;
		while (Static343.method5282()) {
			local71 = Static30.method353(Static16.aClass241_6, Static525.aClass260_4.aClass270_2);
			local71.aClass6_Sub15_Sub1_1.method3016(0);
			local80 = local71.aClass6_Sub15_Sub1_1.anInt3174;
			Static17.method219(local71.aClass6_Sub15_Sub1_1);
			local71.aClass6_Sub15_Sub1_1.method2999(local71.aClass6_Sub15_Sub1_1.anInt3174 - local80);
			Static525.aClass260_4.method6404(local71);
		}
		if (Static442.aClass6_Sub46_2 == null) {
			if (Static182.aLong105 <= Static549.method7758()) {
				Static442.aClass6_Sub46_2 = Static239.aClass5_1.method30(Static82.aClass165_2.aString47);
			}
		} else if (Static442.aClass6_Sub46_2.anInt8354 != -1) {
			local71 = Static30.method353(Static548.aClass241_107, Static525.aClass260_4.aClass270_2);
			local71.aClass6_Sub15_Sub1_1.method3040(Static442.aClass6_Sub46_2.anInt8354);
			Static525.aClass260_4.method6404(local71);
			Static442.aClass6_Sub46_2 = null;
			Static182.aLong105 = Static549.method7758() + 30000L;
		}
		@Pc(161) Class6_Sub9 local161 = (Class6_Sub9) Static518.aClass340_65.method8124();
		@Pc(180) int local180;
		@Pc(205) int local205;
		@Pc(226) int local226;
		@Pc(276) int local276;
		@Pc(283) int local283;
		@Pc(295) int local295;
		@Pc(178) Class6_Sub13 local178;
		if (local161 != null || Static549.method7758() - 2000L > Static167.aLong100) {
			local178 = null;
			local180 = 0;
			for (@Pc(185) Class6_Sub9 local185 = (Class6_Sub9) Static150.aClass340_22.method8124(); local185 != null && (local178 == null || local178.aClass6_Sub15_Sub1_1.anInt3174 - local180 < 240); local185 = (Class6_Sub9) Static150.aClass340_22.method8134()) {
				local185.method9051();
				local205 = local185.method7139();
				if (local205 < -1) {
					local205 = -1;
				} else if (local205 > 65534) {
					local205 = 65534;
				}
				local226 = local185.method7137();
				if (local226 < -1) {
					local226 = -1;
				} else if (local226 > 65534) {
					local226 = 65534;
				}
				if (local226 != Static180.anInt3648 || local205 != Static509.anInt8459) {
					if (local178 == null) {
						local178 = Static30.method353(Static249.aClass241_66, Static525.aClass260_4.aClass270_2);
						local178.aClass6_Sub15_Sub1_1.method3016(0);
						local180 = local178.aClass6_Sub15_Sub1_1.anInt3174;
					}
					local276 = local226 - Static180.anInt3648;
					Static180.anInt3648 = local226;
					local283 = local205 - Static509.anInt8459;
					Static509.anInt8459 = local205;
					local295 = (int) ((local185.method7138() - Static167.aLong100) / 20L);
					if (local295 < 8 && local276 >= -32 && local276 <= 31 && local283 >= -32 && local283 <= 31) {
						local276 += 32;
						local283 += 32;
						local178.aClass6_Sub15_Sub1_1.method3040((local276 << 6) + (local295 << 12) + local283);
					} else if (local295 < 32 && local276 >= -128 && local276 <= 127 && local283 >= -128 && local283 <= 127) {
						local283 += 128;
						local276 += 128;
						local178.aClass6_Sub15_Sub1_1.method3016(local295 + 128);
						local178.aClass6_Sub15_Sub1_1.method3040((local276 << 8) + local283);
					} else if (local295 < 32) {
						local178.aClass6_Sub15_Sub1_1.method3016(local295 + 192);
						if (local226 == 1 || local205 == -1) {
							local178.aClass6_Sub15_Sub1_1.method3029(Integer.MIN_VALUE);
						} else {
							local178.aClass6_Sub15_Sub1_1.method3029(local226 | local205 << 16);
						}
					} else {
						local178.aClass6_Sub15_Sub1_1.method3040(local295 + 57344);
						if (local226 == 1 || local205 == -1) {
							local178.aClass6_Sub15_Sub1_1.method3029(Integer.MIN_VALUE);
						} else {
							local178.aClass6_Sub15_Sub1_1.method3029(local205 << 16 | local226);
						}
					}
					Static167.aLong100 = local185.method7138();
				}
			}
			if (local178 != null) {
				local178.aClass6_Sub15_Sub1_1.method2999(local178.aClass6_Sub15_Sub1_1.anInt3174 - local180);
				Static525.aClass260_4.method6404(local178);
			}
		}
		@Pc(548) int local548;
		if (local161 != null) {
			@Pc(530) long local530 = (local161.method7138() - Static357.aLong204) / 50L;
			Static357.aLong204 = local161.method7138();
			if (local530 > 32767L) {
				local530 = 32767L;
			}
			local548 = local161.method7139();
			if (local548 < 0) {
				local548 = 0;
			} else if (local548 > 65535) {
				local548 = 65535;
			}
			local205 = local161.method7137();
			if (local205 < 0) {
				local205 = 0;
			} else if (local205 > 65535) {
				local205 = 65535;
			}
			@Pc(582) byte local582 = 0;
			if (local161.method7140() == 2) {
				local582 = 1;
			}
			local276 = (int) local530;
			@Pc(604) Class6_Sub13 local604 = Static30.method353(Static135.aClass241_38, Static525.aClass260_4.aClass270_2);
			local604.aClass6_Sub15_Sub1_1.method3020(local582 << 15 | local276);
			local604.aClass6_Sub15_Sub1_1.method3029(local548 << 16 | local205);
			Static525.aClass260_4.method6404(local604);
		}
		@Pc(661) long local661;
		if (Static575.anInt9550 > 0) {
			local178 = Static30.method353(Static540.aClass241_58, Static525.aClass260_4.aClass270_2);
			local178.aClass6_Sub15_Sub1_1.method3016(Static575.anInt9550 * 3);
			for (local180 = 0; local180 < Static575.anInt9550; local180++) {
				@Pc(653) Interface17 local653 = Static136.anInterface17Array1[local180];
				local661 = (local653.method8953() - Static631.aLong322) / 50L;
				if (local661 > 65535L) {
					local661 = 65535L;
				}
				Static631.aLong322 = local653.method8953();
				local178.aClass6_Sub15_Sub1_1.method3016(local653.method8950());
				local178.aClass6_Sub15_Sub1_1.method3040((int) local661);
			}
			Static525.aClass260_4.method6404(local178);
		}
		if (Static613.anInt9701 > 0) {
			Static613.anInt9701--;
		}
		if (Static114.aBoolean195 && Static613.anInt9701 <= 0) {
			Static613.anInt9701 = 20;
			Static114.aBoolean195 = false;
			local178 = Static30.method353(Static326.aClass241_72, Static525.aClass260_4.aClass270_2);
			local178.aClass6_Sub15_Sub1_1.method3040((int) Static135.aFloat51 >> 3);
			local178.aClass6_Sub15_Sub1_1.method3020((int) Static409.aFloat135 >> 3);
			Static525.aClass260_4.method6404(local178);
		}
		if (Static391.aBoolean504 != Static285.aBoolean390) {
			Static391.aBoolean504 = Static285.aBoolean390;
			local178 = Static30.method353(Static477.aClass241_69, Static525.aClass260_4.aClass270_2);
			local178.aClass6_Sub15_Sub1_1.method3016(Static285.aBoolean390 ? 1 : 0);
			Static525.aClass260_4.method6404(local178);
		}
		if (!Static554.aBoolean681) {
			local178 = Static30.method353(Static46.aClass241_13, Static525.aClass260_4.aClass270_2);
			local178.aClass6_Sub15_Sub1_1.method3016(0);
			local180 = local178.aClass6_Sub15_Sub1_1.anInt3174;
			@Pc(822) Class6_Sub15 local822 = Static687.aClass6_Sub44_33.method7084();
			local178.aClass6_Sub15_Sub1_1.method2988(0, local822.aByteArray20, local822.anInt3174);
			local178.aClass6_Sub15_Sub1_1.method2999(local178.aClass6_Sub15_Sub1_1.anInt3174 - local180);
			Static525.aClass260_4.method6404(local178);
			Static554.aBoolean681 = true;
		}
		if (Static334.aClass243ArrayArrayArray2 != null) {
			if (Static526.anInt8626 == 2) {
				Static372.method8355();
			} else if (Static526.anInt8626 == 3) {
				Static231.method4108();
			}
		}
		if (Static587.aBoolean697) {
			Static587.aBoolean697 = false;
		} else {
			Static145.aFloat52 /= 2.0F;
		}
		if (Static508.aBoolean255) {
			Static508.aBoolean255 = false;
		} else {
			Static620.aFloat195 /= 2.0F;
		}
		Static340.method5224();
		if (Static37.anInt498 != 11) {
			return;
		}
		Static550.method7787();
		Static190.method3593();
		Static226.method4054();
		Static525.aClass260_4.anInt7199++;
		if (Static525.aClass260_4.anInt7199 > 750) {
			Static578.method8055();
			return;
		}
		Static106.method2035();
		Static385.method5929();
		Static520.method7511();
		for (local80 = Static303.aClass55_2.method939(true); local80 != -1; local80 = Static303.aClass55_2.method939(false)) {
			Static478.method7149(local80);
			Static566.anIntArray531[Static521.anInt9056++ & 0x1F] = local80;
		}
		for (@Pc(973) Class6_Sub2_Sub4 local973 = Static232.method4115(); local973 != null; local973 = Static232.method4115()) {
			local548 = local973.method2034();
			local661 = local973.method2033();
			if (local548 == 1) {
				Static333.anIntArray333[(int) local661] = local973.anInt2111;
				Static269.aBoolean380 |= Static371.aBooleanArray19[(int) local661];
				Static73.anIntArray175[Static89.anInt1348++ & 0x1F] = (int) local661;
			} else if (local548 == 2) {
				Static592.aStringArray37[(int) local661] = local973.aString17;
				Static212.anIntArray482[Static391.anInt6745++ & 0x1F] = (int) local661;
			} else {
				@Pc(1037) Class381 local1037;
				if (local548 == 3) {
					local1037 = Static69.method899((int) local661);
					if (!local973.aString17.equals(local1037.aString123)) {
						local1037.aString123 = local973.aString17;
						Static168.method3312(local1037);
					}
				} else {
					@Pc(1073) int local1073;
					if (local548 == 4) {
						local1037 = Static69.method899((int) local661);
						local283 = local973.anInt2111;
						local295 = local973.anInt2113;
						local1073 = local973.anInt2116;
						if (local283 != local1037.anInt10086 || local1037.anInt10114 != local295 || local1037.anInt10071 != local1073) {
							local1037.anInt10071 = local1073;
							local1037.anInt10086 = local283;
							local1037.anInt10114 = local295;
							Static168.method3312(local1037);
						}
					} else if (local548 == 5) {
						local1037 = Static69.method899((int) local661);
						if (local973.anInt2111 != local1037.anInt10158) {
							if (local973.anInt2111 == -1) {
								local1037.aClass104_11 = null;
							} else {
								if (local1037.aClass104_11 == null) {
									local1037.aClass104_11 = new Class104_Sub1();
								}
								local1037.aClass104_11.method9035(local973.anInt2111);
							}
							local1037.anInt10158 = local973.anInt2111;
							Static168.method3312(local1037);
						}
					} else if (local548 == 6) {
						local276 = local973.anInt2111;
						local283 = local276 >> 10 & 0x1F;
						local295 = local276 >> 5 & 0x1F;
						local1073 = local276 & 0x1F;
						@Pc(1204) int local1204 = (local1073 << 3) + (local295 << 11) + (local283 << 19);
						@Pc(1209) Class381 local1209 = Static69.method899((int) local661);
						if (local1204 != local1209.anInt10106) {
							local1209.anInt10106 = local1204;
							Static168.method3312(local1209);
						}
					} else if (local548 == 7) {
						local1037 = Static69.method899((int) local661);
						@Pc(1678) boolean local1678 = local973.anInt2111 == 1;
						if (local1678 != local1037.aBoolean749) {
							local1037.aBoolean749 = local1678;
							Static168.method3312(local1037);
						}
					} else if (local548 == 8) {
						local1037 = Static69.method899((int) local661);
						if (local973.anInt2111 != local1037.anInt10101 || local1037.anInt10144 != local973.anInt2113 || local973.anInt2116 != local1037.anInt10111) {
							local1037.anInt10111 = local973.anInt2116;
							local1037.anInt10144 = local973.anInt2113;
							local1037.anInt10101 = local973.anInt2111;
							if (local1037.anInt10149 != -1) {
								if (local1037.anInt10092 > 0) {
									local1037.anInt10111 = local1037.anInt10111 * 32 / local1037.anInt10092;
								} else if (local1037.anInt10094 > 0) {
									local1037.anInt10111 = local1037.anInt10111 * 32 / local1037.anInt10094;
								}
							}
							Static168.method3312(local1037);
						}
					} else if (local548 == 9) {
						local1037 = Static69.method899((int) local661);
						if (local973.anInt2111 != local1037.anInt10149 || local973.anInt2113 != local1037.anInt10160) {
							local1037.anInt10160 = local973.anInt2113;
							local1037.anInt10149 = local973.anInt2111;
							Static168.method3312(local1037);
						}
					} else if (local548 == 10) {
						local1037 = Static69.method899((int) local661);
						if (local973.anInt2111 != local1037.anInt10127 || local973.anInt2113 != local1037.anInt10109 || local1037.anInt10128 != local973.anInt2116) {
							local1037.anInt10128 = local973.anInt2116;
							local1037.anInt10109 = local973.anInt2113;
							local1037.anInt10127 = local973.anInt2111;
							Static168.method3312(local1037);
						}
					} else if (local548 == 11) {
						local1037 = Static69.method899((int) local661);
						local1037.aByte145 = 0;
						local1037.anInt10155 = local1037.anInt10135 = local973.anInt2111;
						local1037.aByte143 = 0;
						local1037.anInt10116 = local1037.anInt10143 = local973.anInt2113;
						Static168.method3312(local1037);
					} else if (local548 == 12) {
						local1037 = Static69.method899((int) local661);
						local283 = local973.anInt2111;
						if (local1037 != null && local1037.anInt10156 == 0) {
							if (local283 > local1037.anInt10142 - local1037.anInt10131) {
								local283 = local1037.anInt10142 - local1037.anInt10131;
							}
							if (local283 < 0) {
								local283 = 0;
							}
							if (local1037.anInt10141 != local283) {
								local1037.anInt10141 = local283;
								Static168.method3312(local1037);
							}
						}
					} else if (local548 == 14) {
						local1037 = Static69.method899((int) local661);
						local1037.anInt10126 = local973.anInt2111;
					} else if (local548 == 15) {
						Static208.anInt4167 = local973.anInt2113;
						Static97.anInt1434 = local973.anInt2111;
						Static566.aBoolean645 = true;
					} else if (local548 == 16) {
						local1037 = Static69.method899((int) local661);
						local1037.anInt10080 = local973.anInt2111;
					} else if (local548 == 17) {
						local1037 = Static69.method899((int) local661);
						local1037.anInt10121 = local973.anInt2111;
					} else if (local548 == 18) {
						local1037 = Static69.method899((int) local661);
						local283 = (int) (local661 >> 32);
						local1037.method8758((short) local973.anInt2111, local283, (short) local973.anInt2113);
					} else if (local548 == 19) {
						local1037 = Static69.method899((int) local661);
						local283 = (int) (local661 >> 32);
						local1037.method8754((short) local973.anInt2113, local283, (short) local973.anInt2111);
					}
				}
			}
		}
		Static2.anInt3++;
		if (Static266.anInt5026 != 0) {
			Static129.anInt2573 += 20;
			if (Static129.anInt2573 >= 400) {
				Static266.anInt5026 = 0;
			}
		}
		if (Static302.aClass381_7 != null) {
			Static426.anInt10021++;
			if (Static426.anInt10021 >= 15) {
				Static168.method3312(Static302.aClass381_7);
				Static302.aClass381_7 = null;
			}
		}
		Static88.aClass381_2 = null;
		Static636.aBoolean732 = false;
		Static340.aClass381_9 = null;
		Static486.aBoolean632 = false;
		Static616.method8499((Class381) null, -1, -1);
		Static581.method8106((Class381) null, -1, -1);
		if (!Static162.aBoolean266) {
			Static475.anInt8093 = -1;
		}
		Static509.method7379();
		Static633.anInt8242++;
		if (Static236.aBoolean354) {
			@Pc(1805) Class6_Sub13 local1805 = Static30.method353(Static328.aClass241_73, Static525.aClass260_4.aClass270_2);
			local1805.aClass6_Sub15_Sub1_1.method3017(Static665.anInt10253 << 14 | Static43.anInt550 << 28 | Static375.anInt6308);
			Static525.aClass260_4.method6404(local1805);
			Static236.aBoolean354 = false;
		}
		while (true) {
			@Pc(1829) Class6_Sub53 local1829;
			@Pc(1846) Class381 local1846;
			@Pc(1834) Class381 local1834;
			do {
				local1829 = (Class6_Sub53) Static157.aClass340_23.method8127();
				if (local1829 == null) {
					while (true) {
						do {
							local1829 = (Class6_Sub53) Static471.aClass340_61.method8127();
							if (local1829 == null) {
								while (true) {
									do {
										local1829 = (Class6_Sub53) Static131.aClass340_20.method8127();
										if (local1829 == null) {
											if (Static88.aClass381_2 == null) {
												Static102.anInt2058 = 0;
											}
											if (Static637.aClass381_13 != null) {
												Static434.method6606();
											}
											if (Static679.anInt6104 > 0 && Static435.aClass148_1.method3952(82) && Static435.aClass148_1.method3952(81) && Static79.anInt1140 != 0) {
												local548 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 - Static79.anInt1140;
												if (local548 < 0) {
													local548 = 0;
												} else if (local548 > 3) {
													local548 = 3;
												}
												Static86.method1253(local548, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0] + Static50.anInt606, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0] + Static404.anInt7039);
											}
											Static600.method8278();
											for (local548 = 0; local548 < 5; local548++) {
												@Pc(2065) int local2065 = Static237.anIntArray239[local548]++;
											}
											if (Static269.aBoolean380 && Static478.aLong260 < Static549.method7758() - 60000L) {
												Static287.method4705();
											}
											for (@Pc(2111) Class60_Sub2_Sub2 local2111 = (Class60_Sub2_Sub2) Static555.aClass385_9.method8778(); local2111 != null; local2111 = (Class60_Sub2_Sub2) Static555.aClass385_9.method8773()) {
												if (Static549.method7758() / 1000L - 5L > (long) local2111.anInt8052) {
													if (local2111.aShort95 > 0) {
														Static14.method193("", "", "", 0, local2111.aString90 + Static50.aClass43_19.method596(Static601.anInt9518), 5);
													}
													if (local2111.aShort95 == 0) {
														Static14.method193("", "", "", 0, local2111.aString90 + Static50.aClass43_20.method596(Static601.anInt9518), 5);
													}
													local2111.method8914();
												}
											}
											Static452.anInt7800++;
											if (Static452.anInt7800 > 500) {
												Static452.anInt7800 = 0;
												local226 = (int) (Math.random() * 8.0D);
												if ((local226 & 0x1) == 1) {
													Static28.anInt376 += Static10.anInt178;
												}
												if ((local226 & 0x2) == 2) {
													Static200.anInt4057 += Static492.anInt3497;
												}
												if ((local226 & 0x4) == 4) {
													Static28.anInt375 += Static423.anInt7241;
												}
											}
											if (Static28.anInt376 < -50) {
												Static10.anInt178 = 2;
											}
											if (Static200.anInt4057 < -55) {
												Static492.anInt3497 = 2;
											}
											if (Static28.anInt376 > 50) {
												Static10.anInt178 = -2;
											}
											if (Static28.anInt375 < -40) {
												Static423.anInt7241 = 1;
											}
											if (Static200.anInt4057 > 55) {
												Static492.anInt3497 = -2;
											}
											Static409.anInt7140++;
											if (Static28.anInt375 > 40) {
												Static423.anInt7241 = -1;
											}
											if (Static409.anInt7140 > 500) {
												Static409.anInt7140 = 0;
												local226 = (int) (Math.random() * 8.0D);
												if ((local226 & 0x2) == 2) {
													Static41.anInt542 += Static590.anInt9393;
												}
												if ((local226 & 0x1) == 1) {
													Static51.anInt622 += Static483.anInt8237;
												}
											}
											if (Static51.anInt622 < -60) {
												Static483.anInt8237 = 2;
											}
											if (Static51.anInt622 > 60) {
												Static483.anInt8237 = -2;
											}
											if (Static41.anInt542 < -20) {
												Static590.anInt9393 = 1;
											}
											if (Static41.anInt542 > 10) {
												Static590.anInt9393 = -1;
											}
											Static525.aClass260_4.anInt7200++;
											if (Static525.aClass260_4.anInt7200 > 50) {
												@Pc(2384) Class6_Sub13 local2384 = Static30.method353(Static479.aClass241_99, Static525.aClass260_4.aClass270_2);
												Static525.aClass260_4.method6404(local2384);
											}
											if (Static362.aBoolean452) {
												Static431.method6567();
												Static362.aBoolean452 = false;
											}
											try {
												Static525.aClass260_4.method6399();
												return;
											} catch (@Pc(2401) IOException local2401) {
												Static578.method8055();
												return;
											}
										}
										local1834 = local1829.aClass381_11;
										if (local1834.anInt10112 < 0) {
											break;
										}
										local1846 = Static69.method899(local1834.anInt10079);
									} while (local1846 == null || local1846.aClass381Array1 == null || local1846.aClass381Array1.length <= local1834.anInt10112 || local1834 != local1846.aClass381Array1[local1834.anInt10112]);
									Static301.method4842(local1829);
								}
							}
							local1834 = local1829.aClass381_11;
							if (local1834.anInt10112 < 0) {
								break;
							}
							local1846 = Static69.method899(local1834.anInt10079);
						} while (local1846 == null || local1846.aClass381Array1 == null || local1834.anInt10112 >= local1846.aClass381Array1.length || local1846.aClass381Array1[local1834.anInt10112] != local1834);
						Static301.method4842(local1829);
					}
				}
				local1834 = local1829.aClass381_11;
				if (local1834.anInt10112 < 0) {
					break;
				}
				local1846 = Static69.method899(local1834.anInt10079);
			} while (local1846 == null || local1846.aClass381Array1 == null || local1834.anInt10112 >= local1846.aClass381Array1.length || local1834 != local1846.aClass381Array1[local1834.anInt10112]);
			Static301.method4842(local1829);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BZLjava/io/File;)V")
	public static void method5164(@OriginalArg(2) File arg0) {
		if (Static441.anObject15 == null) {
			Static662.method8830();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(40) Method local40 = local14.getDeclaredMethod("dumpHeap", aClass14 == null ? (aClass14 = Class218.a("java.lang.String")) : aClass14, Boolean.TYPE);
			local40.invoke(Static441.anObject15, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(67) Exception local67) {
			System.out.println("HeapDump error:");
			local67.printStackTrace();
		}
	}
}
