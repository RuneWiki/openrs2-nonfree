import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "[I")
	public static int[] anIntArray574;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_213 = new Class214(21, 0);

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "[I")
	public static final int[] anIntArray573 = new int[3];

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	public static int anInt7091 = 0;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public static int anInt7092 = 0;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!uo;III)V")
	public static void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub42 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg0 | arg2 << 14 | arg3 << 28);
		@Pc(22) Class4_Sub47 local22 = (Class4_Sub47) Static377.aClass96_31.method2797(local16);
		if (local22 == null) {
			local22 = new Class4_Sub47();
			Static377.aClass96_31.method2805(local16, local22);
			local22.aClass91_54.method2587(arg1);
			return;
		}
		@Pc(49) Class274 local49 = Static139.aClass193_1.method4650(arg1.anInt7301);
		@Pc(52) int local52 = local49.anInt7863;
		if (local49.anInt7881 == 1) {
			local52 *= arg1.anInt7299 + 1;
		}
		for (@Pc(73) Class4_Sub42 local73 = (Class4_Sub42) local22.aClass91_54.method2584(); local73 != null; local73 = (Class4_Sub42) local22.aClass91_54.method2586()) {
			local49 = Static139.aClass193_1.method4650(local73.anInt7301);
			@Pc(84) int local84 = local49.anInt7863;
			if (local49.anInt7881 == 1) {
				local84 *= local73.anInt7299 + 1;
			}
			if (local84 < local52) {
				Static113.method2203(arg1, local73);
				return;
			}
		}
		local22.aClass91_54.method2587(arg1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public static void method5649() {
		Static352.anInt6233 = 0;
		Static289.aClass91_31.method2582();
		Static87.aBoolean142 = false;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	public static void method5651() {
		if (Static293.anInt5391 > 1) {
			Static234.anInt4636 = Static446.anInt7635;
			Static293.anInt5391--;
		}
		if (Static82.aBoolean140) {
			Static82.aBoolean140 = false;
			Static124.method2333();
			return;
		}
		if (!Static87.aBoolean142) {
			Static311.method4738();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static278.method4399(); local27++) {
		}
		if (Static70.anInt1726 != 9) {
			return;
		}
		Static328.method4875(Static457.aClass4_Sub20_Sub1_5, Static6.aClass212_1.method4984());
		if (Static42.aClass4_Sub23_1 == null) {
			if (Static167.method2929() >= Static364.aLong187) {
				Static42.aClass4_Sub23_1 = Static372.aClass197_1.method4735(Static302.aClass9_6.aString1);
			}
		} else if (Static42.aClass4_Sub23_1.anInt4495 != -1) {
			Static448.method6134(Static463.aClass212_100);
			Static457.aClass4_Sub20_Sub1_5.method4558(Static42.aClass4_Sub23_1.anInt4495);
			Static42.aClass4_Sub23_1 = null;
			Static364.aLong187 = Static167.method2929() + 30000L;
		}
		@Pc(97) Class4_Sub15 local97 = (Class4_Sub15) Static296.aClass91_50.method2584();
		@Pc(138) int local138;
		@Pc(158) int local158;
		@Pc(174) boolean local174;
		@Pc(223) int local223;
		@Pc(230) int local230;
		@Pc(242) int local242;
		if (local97 != null || Static456.aLong225 < Static167.method2929() - 2000L) {
			@Pc(112) boolean local112 = false;
			@Pc(115) int local115 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
			for (@Pc(120) Class4_Sub15 local120 = (Class4_Sub15) Static92.aClass91_12.method2584(); local120 != null && Static457.aClass4_Sub20_Sub1_5.anInt5526 - local115 < 240; local120 = (Class4_Sub15) Static92.aClass91_12.method2586()) {
				local120.method6330();
				local138 = local120.method5050();
				if (local138 < 0) {
					local138 = 0;
				} else if (local138 > 65534) {
					local138 = 65534;
				}
				local158 = local120.method5049();
				if (local158 < 0) {
					local158 = 0;
				} else if (local158 > 65534) {
					local158 = 65534;
				}
				local174 = false;
				if (local120.method5050() == -1 && local120.method5049() == -1) {
					local174 = true;
					local158 = -1;
					local138 = -1;
				}
				if (local158 != Static461.anInt5549 || local138 != Static328.anInt5872) {
					if (!local112) {
						Static448.method6134(Static160.aClass212_49);
						Static457.aClass4_Sub20_Sub1_5.method4590(0);
						local115 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
						local112 = true;
					}
					local223 = local158 - Static461.anInt5549;
					Static461.anInt5549 = local158;
					local230 = local138 - Static328.anInt5872;
					Static328.anInt5872 = local138;
					local242 = (int) ((local120.method5051() - Static456.aLong225) / 20L);
					if (local242 < 8 && local223 >= -32 && local223 <= 31 && local230 >= -32 && local230 <= 31) {
						local223 += 32;
						local230 += 32;
						Static457.aClass4_Sub20_Sub1_5.method4558(local230 + (local242 << 12) + (local223 << 6));
					} else if (local242 < 32 && local223 >= -128 && local223 <= 127 && local230 >= -128 && local230 <= 127) {
						local223 += 128;
						Static457.aClass4_Sub20_Sub1_5.method4590(local242 + 128);
						local230 += 128;
						Static457.aClass4_Sub20_Sub1_5.method4558(local230 + (local223 << 8));
					} else if (local242 >= 32) {
						Static457.aClass4_Sub20_Sub1_5.method4558(local242 + 57344);
						if (local174) {
							Static457.aClass4_Sub20_Sub1_5.method4561(Integer.MIN_VALUE);
						} else {
							Static457.aClass4_Sub20_Sub1_5.method4561(local158 | local138 << 16);
						}
					} else {
						Static457.aClass4_Sub20_Sub1_5.method4590(local242 + 192);
						if (local174) {
							Static457.aClass4_Sub20_Sub1_5.method4561(Integer.MIN_VALUE);
						} else {
							Static457.aClass4_Sub20_Sub1_5.method4561(local158 | local138 << 16);
						}
					}
					Static456.aLong225 = local120.method5051();
				}
			}
			if (local112) {
				Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local115);
			}
		}
		@Pc(413) int local413;
		@Pc(468) int local468;
		if (local97 != null) {
			@Pc(399) long local399 = (local97.method5051() - Static396.aLong201) / 50L;
			if (local399 > 32767L) {
				local399 = 32767L;
			}
			Static396.aLong201 = local97.method5051();
			local413 = local97.method5050();
			if (local413 < 0) {
				local413 = 0;
			} else if (local413 > 65535) {
				local413 = 65535;
			}
			local138 = local97.method5049();
			if (local138 < 0) {
				local138 = 0;
			} else if (local138 > 65535) {
				local138 = 65535;
			}
			@Pc(451) byte local451 = 0;
			if (local97.method5048() == 2) {
				local451 = 1;
			}
			Static448.method6134(Static355.aClass212_83);
			local468 = (int) local399;
			Static457.aClass4_Sub20_Sub1_5.method4610(local468 | local451 << 15);
			Static457.aClass4_Sub20_Sub1_5.method4562(local413 << 16 | local138);
		}
		@Pc(501) int local501;
		if (Static183.anInt3717 > 0) {
			Static448.method6134(Static146.aClass212_45);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static183.anInt3717 * 3);
			for (local501 = 0; local501 < Static183.anInt3717; local501++) {
				@Pc(507) Interface5 local507 = Static18.anInterface5Array1[local501];
				@Pc(516) long local516 = (local507.method2831() - Static125.aLong79) / 50L;
				if (local516 > 65535L) {
					local516 = 65535L;
				}
				Static125.aLong79 = local507.method2831();
				Static457.aClass4_Sub20_Sub1_5.method4590(local507.method2832());
				Static457.aClass4_Sub20_Sub1_5.method4558((int) local516);
			}
		}
		if (Static367.anInt7457 > 0) {
			Static367.anInt7457--;
		}
		if (Static110.aBoolean165 && Static367.anInt7457 <= 0) {
			Static110.aBoolean165 = false;
			Static367.anInt7457 = 20;
			Static448.method6134(Static428.aClass212_95);
			Static457.aClass4_Sub20_Sub1_5.method4571((int) Static43.aFloat26 >> 3);
			Static457.aClass4_Sub20_Sub1_5.method4610((int) Static322.aFloat82 >> 3);
		}
		if (Static155.aBoolean211 && !Static293.aBoolean387) {
			Static293.aBoolean387 = true;
			Static448.method6134(Static89.aClass212_27);
			Static457.aClass4_Sub20_Sub1_5.method4590(1);
		}
		if (!Static155.aBoolean211 && Static293.aBoolean387) {
			Static293.aBoolean387 = false;
			Static448.method6134(Static89.aClass212_27);
			Static457.aClass4_Sub20_Sub1_5.method4590(0);
		}
		if (!Static316.aBoolean426) {
			Static448.method6134(Static214.aClass212_59);
			Static457.aClass4_Sub20_Sub1_5.method4590(0);
			local501 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
			@Pc(643) Class4_Sub20 local643 = Static157.aClass185_Sub1_1.method4642();
			Static457.aClass4_Sub20_Sub1_5.method4600(local643.aByteArray77, local643.anInt5526);
			Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local501);
			Static316.aBoolean426 = true;
		}
		if (Static294.aClass162ArrayArrayArray2 != null) {
			if (Static275.anInt5173 == 2) {
				Static250.method4109();
			} else if (Static275.anInt5173 == 3) {
				Static161.method5247();
			}
		}
		if (Static39.aBoolean62) {
			Static39.aBoolean62 = false;
		} else {
			Static249.aFloat69 /= 2.0F;
		}
		if (Static367.aBoolean546) {
			Static367.aBoolean546 = false;
		} else {
			Static275.aFloat76 /= 2.0F;
		}
		Static454.method6185();
		if (Static70.anInt1726 != 9) {
			return;
		}
		Static143.method2618();
		Static198.method3515();
		Static57.method1244();
		Static247.method4078();
		Static270.anInt5899++;
		if (Static270.anInt5899 > 750) {
			Static124.method2333();
			return;
		}
		Static446.method6101();
		Static124.method2326();
		Static305.method4696();
		for (local501 = Static67.aClass224_1.method5156(true); local501 != -1; local501 = Static67.aClass224_1.method5156(false)) {
			Static280.method4406(local501);
			Static399.anIntArray570[Static295.anInt5429++ & 0x1F] = local501;
		}
		@Pc(831) Class240 local831;
		for (@Pc(765) Class4_Sub1_Sub5 local765 = Static124.method2331(); local765 != null; local765 = Static124.method2331()) {
			local413 = local765.method515();
			local138 = local765.method518();
			if (local413 == 1) {
				Static355.anIntArray503[local138] = local765.anInt621;
				Static67.aBoolean117 |= Static241.aBooleanArray89[local138];
				Static170.anIntArray272[Static282.anInt5283++ & 0x1F] = local138;
			} else if (local413 == 2) {
				Static256.aStringArray25[local138] = local765.aString2;
				Static353.anIntArray502[Static160.anInt3257++ & 0x1F] = local138;
			} else if (local413 == 3) {
				local831 = Static92.method1820(local138);
				if (!local765.aString2.equals(local831.aString61)) {
					local831.aString61 = local765.aString2;
					Static273.method4374(local831);
				}
			} else if (local413 == 4) {
				local831 = Static92.method1820(local138);
				local468 = local765.anInt621;
				local223 = local765.anInt614;
				local230 = local765.anInt616;
				if (local831.anInt6880 != local468 || local223 != local831.anInt6902 || local831.anInt6869 != local230) {
					local831.anInt6880 = local468;
					local831.anInt6902 = local223;
					local831.anInt6869 = local230;
					Static273.method4374(local831);
				}
			} else if (local413 == 5) {
				local831 = Static92.method1820(local138);
				if (local831.anInt6858 != local765.anInt621 || local765.anInt621 == -1) {
					local831.anInt6858 = local765.anInt621;
					local831.anInt6890 = 0;
					local831.anInt6847 = 1;
					local831.anInt6867 = 0;
					Static273.method4374(local831);
				}
			} else if (local413 == 6) {
				local158 = local765.anInt621;
				local468 = local158 >> 10 & 0x1F;
				local223 = local158 >> 5 & 0x1F;
				local230 = local158 & 0x1F;
				local242 = (local223 << 11) + (local468 << 19) + (local230 << 3);
				@Pc(911) Class240 local911 = Static92.method1820(local138);
				if (local242 != local911.anInt6883) {
					local911.anInt6883 = local242;
					Static273.method4374(local911);
				}
			} else if (local413 == 7) {
				local831 = Static92.method1820(local138);
				local174 = local765.anInt621 == 1;
				if (local831.aBoolean502 != local174) {
					local831.aBoolean502 = local174;
					Static273.method4374(local831);
				}
			} else if (local413 == 8) {
				local831 = Static92.method1820(local138);
				if (local831.anInt6875 != local765.anInt621 || local765.anInt614 != local831.anInt6887 || local831.anInt6851 != local765.anInt616) {
					local831.anInt6875 = local765.anInt621;
					local831.anInt6851 = local765.anInt616;
					local831.anInt6887 = local765.anInt614;
					if (local831.anInt6876 != -1) {
						if (local831.anInt6841 > 0) {
							local831.anInt6851 = local831.anInt6851 * 32 / local831.anInt6841;
						} else if (local831.anInt6892 > 0) {
							local831.anInt6851 = local831.anInt6851 * 32 / local831.anInt6892;
						}
					}
					Static273.method4374(local831);
				}
			} else if (local413 == 9) {
				local831 = Static92.method1820(local138);
				if (local831.anInt6876 != local765.anInt621 || local831.anInt6881 != local765.anInt614) {
					local831.anInt6881 = local765.anInt614;
					local831.anInt6876 = local765.anInt621;
					Static273.method4374(local831);
				}
			} else if (local413 == 10) {
				local831 = Static92.method1820(local138);
				if (local765.anInt621 != local831.anInt6849 || local765.anInt614 != local831.anInt6912 || local765.anInt616 != local831.anInt6903) {
					local831.anInt6912 = local765.anInt614;
					local831.anInt6903 = local765.anInt616;
					local831.anInt6849 = local765.anInt621;
					Static273.method4374(local831);
				}
			} else if (local413 == 11) {
				local831 = Static92.method1820(local138);
				local831.anInt6862 = local831.anInt6920 = local765.anInt621;
				local831.aByte84 = 0;
				local831.anInt6879 = local831.anInt6913 = local765.anInt614;
				local831.aByte83 = 0;
				Static273.method4374(local831);
			} else if (local413 == 12) {
				local831 = Static92.method1820(local138);
				local468 = local765.anInt621;
				if (local831 != null && local831.anInt6873 == 0) {
					if (local468 > local831.anInt6926 - local831.anInt6894) {
						local468 = local831.anInt6926 - local831.anInt6894;
					}
					if (local468 < 0) {
						local468 = 0;
					}
					if (local831.anInt6845 != local468) {
						local831.anInt6845 = local468;
						Static273.method4374(local831);
					}
				}
			} else if (local413 == 14) {
				local831 = Static92.method1820(local138);
				local831.anInt6886 = local765.anInt621;
			} else if (local413 == 15) {
				Static184.anInt3729 = local765.anInt614;
				Static38.anInt906 = local765.anInt621;
				Static381.aBoolean486 = true;
			} else if (local413 == 16) {
				local831 = Static92.method1820(local138);
				local831.anInt6918 = local765.anInt621;
			}
		}
		if (Static210.anInt4281 != 0) {
			Static317.anInt5744 += 20;
			if (Static317.anInt5744 >= 400) {
				Static210.anInt4281 = 0;
			}
		}
		Static75.anInt1854++;
		if (Static262.aClass240_12 != null) {
			Static298.anInt5468++;
			if (Static298.anInt5468 >= 15) {
				Static273.method4374(Static262.aClass240_12);
				Static262.aClass240_12 = null;
			}
		}
		Static89.aClass240_7 = null;
		Static62.aBoolean112 = false;
		Static47.aClass240_1 = null;
		Static77.aBoolean131 = false;
		Static429.method5910(-1, null, -1);
		Static335.method4925(-1, -1, null);
		if (!Static449.aBoolean564) {
			Static457.anInt7815 = -1;
		}
		Static146.method2690();
		Static446.anInt7635++;
		if (Static406.aBoolean480) {
			Static448.method6134(Static370.aClass212_85);
			Static457.aClass4_Sub20_Sub1_5.method4562(Static157.anInt3218 << 14 | Static85.anInt1971 << 28 | Static65.anInt1620);
			Static406.aBoolean480 = false;
		}
		while (true) {
			@Pc(1380) Class4_Sub10 local1380;
			@Pc(1385) Class240 local1385;
			do {
				local1380 = (Class4_Sub10) Static331.aClass91_37.method2583();
				if (local1380 == null) {
					while (true) {
						do {
							local1380 = (Class4_Sub10) Static274.aClass91_30.method2583();
							if (local1380 == null) {
								while (true) {
									do {
										local1380 = (Class4_Sub10) Static459.aClass91_53.method2583();
										if (local1380 == null) {
											if (Static89.aClass240_7 == null) {
												Static128.anInt3397 = 0;
											}
											if (Static65.aClass240_4 != null) {
												Static410.method5701();
											}
											if (Static70.anInt1720 > 0 && Static115.aClass173_1.method4895(82) && Static115.aClass173_1.method4895(81) && Static278.anInt5205 != 0) {
												local413 = Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 - Static278.anInt5205;
												if (local413 < 0) {
													local413 = 0;
												} else if (local413 > 3) {
													local413 = 3;
												}
												Static328.method4877(Static426.anInt7325 + Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0], local413, Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0] + Static72.anInt1776);
											}
											Static363.method5196();
											for (local413 = 0; local413 < 5; local413++) {
												@Pc(1586) int local1586 = Static368.anIntArray514[local413]++;
											}
											if (Static67.aBoolean117 && Static73.aLong53 < Static167.method2929() - 60000L) {
												Static386.method6045();
											}
											for (@Pc(1621) Class71_Sub1_Sub1 local1621 = (Class71_Sub1_Sub1) Static436.aClass273_8.method6246(); local1621 != null; local1621 = (Class71_Sub1_Sub1) Static436.aClass273_8.method6249()) {
												if ((long) local1621.anInt2565 < Static167.method2929() / 1000L - 5L) {
													if (local1621.aShort22 > 0) {
														Static238.method4006("", 5, local1621.aString17 + Static424.aClass21_111.method362(Static168.anInt3290), "", 0);
													}
													if (local1621.aShort22 == 0) {
														Static238.method4006("", 5, local1621.aString17 + Static229.aClass21_62.method362(Static168.anInt3290), "", 0);
													}
													local1621.method6187();
												}
											}
											Static361.anInt6300++;
											if (Static361.anInt6300 > 500) {
												Static361.anInt6300 = 0;
												local158 = (int) (Math.random() * 8.0D);
												if ((local158 & 0x2) == 2) {
													Static26.anInt470 += Static157.anInt3220;
												}
												if ((local158 & 0x4) == 4) {
													Static270.anInt5902 += Static292.anInt5388;
												}
												if ((local158 & 0x1) == 1) {
													Static326.anInt5852 += Static186.anInt3778;
												}
											}
											if (Static326.anInt5852 < -50) {
												Static186.anInt3778 = 2;
											}
											if (Static326.anInt5852 > 50) {
												Static186.anInt3778 = -2;
											}
											if (Static26.anInt470 < -55) {
												Static157.anInt3220 = 2;
											}
											if (Static26.anInt470 > 55) {
												Static157.anInt3220 = -2;
											}
											if (Static270.anInt5902 < -40) {
												Static292.anInt5388 = 1;
											}
											Static281.anInt5277++;
											if (Static270.anInt5902 > 40) {
												Static292.anInt5388 = -1;
											}
											if (Static281.anInt5277 > 500) {
												Static281.anInt5277 = 0;
												local158 = (int) (Math.random() * 8.0D);
												if ((local158 & 0x2) == 2) {
													Static437.anInt7473 += Static9.anInt193;
												}
												if ((local158 & 0x1) == 1) {
													Static53.anInt4624 += Static154.anInt3202;
												}
											}
											if (Static53.anInt4624 < -60) {
												Static154.anInt3202 = 2;
											}
											if (Static53.anInt4624 > 60) {
												Static154.anInt3202 = -2;
											}
											if (Static437.anInt7473 < -20) {
												Static9.anInt193 = 1;
											}
											if (Static437.anInt7473 > 10) {
												Static9.anInt193 = -1;
											}
											Static458.anInt7819++;
											if (Static458.anInt7819 > 50) {
												Static448.method6134(Static127.aClass212_34);
											}
											if (Static225.aBoolean293) {
												Static351.method5115();
												Static225.aBoolean293 = false;
											}
											try {
												if (Static172.aClass13_1 != null && Static457.aClass4_Sub20_Sub1_5.anInt5526 > 0) {
													Static30.anInt525 += Static457.aClass4_Sub20_Sub1_5.anInt5526;
													Static172.aClass13_1.method177(Static457.aClass4_Sub20_Sub1_5.anInt5526, Static457.aClass4_Sub20_Sub1_5.aByteArray77);
													Static457.aClass4_Sub20_Sub1_5.anInt5526 = 0;
													Static458.anInt7819 = 0;
													return;
												}
												return;
											} catch (@Pc(1882) IOException local1882) {
												Static124.method2333();
												return;
											}
										}
										local1385 = local1380.aClass240_5;
										if (local1385.anInt6885 < 0) {
											break;
										}
										local831 = Static92.method1820(local1385.anInt6917);
									} while (local831 == null || local831.aClass240Array2 == null || local831.aClass240Array2.length <= local1385.anInt6885 || local831.aClass240Array2[local1385.anInt6885] != local1385);
									Static64.method1462(local1380);
								}
							}
							local1385 = local1380.aClass240_5;
							if (local1385.anInt6885 < 0) {
								break;
							}
							local831 = Static92.method1820(local1385.anInt6917);
						} while (local831 == null || local831.aClass240Array2 == null || local1385.anInt6885 >= local831.aClass240Array2.length || local831.aClass240Array2[local1385.anInt6885] != local1385);
						Static64.method1462(local1380);
					}
				}
				local1385 = local1380.aClass240_5;
				if (local1385.anInt6885 < 0) {
					break;
				}
				local831 = Static92.method1820(local1385.anInt6917);
			} while (local831 == null || local831.aClass240Array2 == null || local1385.anInt6885 >= local831.aClass240Array2.length || local831.aClass240Array2[local1385.anInt6885] != local1385);
			Static64.method1462(local1380);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZ)B")
	public static byte method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
