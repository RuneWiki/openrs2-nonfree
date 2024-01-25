import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!ij;")
	public static Class93 aClass93_65;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	public static int anInt3515;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt3505 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLclient!ea;)Z")
	public static boolean method3176(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(27) int local27 = (Static22.anInt481 - 104) / 2;
		@Pc(33) int local33 = (Static269.anInt5281 - 104) / 2;
		@Pc(35) boolean local35 = true;
		@Pc(45) int local45;
		@Pc(56) int local56;
		for (@Pc(37) int local37 = local27; local37 < local27 + 104; local37++) {
			for (@Pc(41) int local41 = local33; local41 < local33 + 104; local41++) {
				for (local45 = arg0; local45 <= 3; local45++) {
					if (Static64.method1603(local45, local37, arg0, local41)) {
						local56 = local45;
						if (Static203.method4477(local37, local41)) {
							local56 = local45 - 1;
						}
						if (local56 >= 0) {
							local35 &= Static26.method478(local56, local37, local41);
						}
					}
				}
			}
		}
		if (!local35) {
			return false;
		}
		@Pc(101) int[] local101 = new int[262144];
		for (local45 = 0; local45 < local101.length; local45++) {
			local101[local45] = -16777216;
		}
		Static98.aClass95_7 = arg1.method5210(local101, 512, 512, 512);
		Static272.method4782();
		local56 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - -((int) (Math.random() * 20.0D)) - 10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(176) int local176 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x2E5AFF00) << 16;
		@Pc(195) int local195 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(199) boolean[][] local199 = new boolean[Static272.anInt5330][Static272.anInt5330];
		@Pc(205) int local205;
		@Pc(222) int local222;
		@Pc(226) int local226;
		@Pc(230) int local230;
		@Pc(283) int local283;
		@Pc(289) int local289;
		@Pc(293) int local293;
		@Pc(312) int local312;
		for (@Pc(201) int local201 = local27; local201 < local27 + 104; local201 += Static272.anInt5330) {
			for (local205 = local33; local205 < local33 + 104; local205 += Static272.anInt5330) {
				arg1.method5258(0, 0, Static272.anInt5330 * 4, Static272.anInt5330 * 4);
				arg1.method5226(-16777216);
				for (local222 = arg0; local222 <= 3; local222++) {
					for (local226 = 0; local226 < Static272.anInt5330; local226++) {
						for (local230 = 0; local230 < Static272.anInt5330; local230++) {
							local199[local226][local230] = Static64.method1603(local222, local226 + local201, arg0, local230 + local205);
						}
					}
					Static56.aClass51Array2[local222].method1845(local201, local205, Static272.anInt5330 + local201, Static272.anInt5330 + local205, local199);
					if (!Static230.aBoolean378) {
						for (local230 = -4; local230 < Static272.anInt5330; local230++) {
							for (local283 = -4; local283 < Static272.anInt5330; local283++) {
								local289 = local230 + local201;
								local293 = local205 + local283;
								if (local289 >= local27 && local293 >= local33 && Static64.method1603(local222, local289, arg0, local293)) {
									local312 = local222;
									if (Static203.method4477(local289, local293)) {
										local312 = local222 - 1;
									}
									if (local312 >= 0) {
										Static253.method4485(arg1, (Static272.anInt5330 - local283) * 4 - 4, local176, local230 * 4, local293, local56, local289, local312);
									}
								}
							}
						}
					}
				}
				if (Static230.aBoolean378) {
					@Pc(365) Class24 local365 = Static152.aClass24Array3[arg0];
					for (local230 = 0; local230 < Static272.anInt5330; local230++) {
						for (local283 = 0; local283 < Static272.anInt5330; local283++) {
							local289 = local230 + local201;
							local293 = local283 + local205;
							local312 = local365.anIntArrayArray15[local289 - local365.anInt543][local293 - local365.anInt542];
							if ((local312 & 0x40240000) != 0) {
								arg1.method5254(4, -1713569622, 4, local230 * 4, (Static272.anInt5330 - local283) * 4 - 4);
							} else if ((local312 & 0x800000) != 0) {
								arg1.method5243(4, (Static272.anInt5330 - local283) * 4 - 4, -1713569622, local230 * 4);
							} else if ((local312 & 0x2000000) != 0) {
								arg1.method5178(-1713569622, local230 * 4 + 3, 4, (Static272.anInt5330 - local283) * 4 - 4);
							} else if ((local312 & 0x8000000) != 0) {
								arg1.method5243(4, (Static272.anInt5330 - local283) * 4 + 3 - 4, -1713569622, local230 * 4);
							} else if ((local312 & 0x20000000) != 0) {
								arg1.method5178(-1713569622, local230 * 4, 4, (Static272.anInt5330 - local283) * 4 - 4);
							}
						}
					}
				}
				arg1.method5205(0, 0, Static272.anInt5330 * 4, Static272.anInt5330 * 4, local195, 2);
				Static98.aClass95_7.method5497((local201 - local27) * 4 + 48, -((-local33 + local205) * 4) + 464 - Static272.anInt5330 * 4, Static272.anInt5330 * 4, Static272.anInt5330 * 4);
			}
		}
		arg1.method5186();
		arg1.method5226(-16777215);
		Static300.method5274();
		Static76.anInt1459 = 0;
		Static111.aClass103_54.method2751();
		if (!Static230.aBoolean378) {
			for (local205 = local27; local205 < local27 + 104; local205++) {
				for (local222 = local33; local222 < local33 + 104; local222++) {
					for (local226 = arg0; arg0 + 1 >= local226 && local226 <= 3; local226++) {
						if (Static64.method1603(local226, local205, arg0, local222)) {
							@Pc(628) Interface5 local628 = (Interface5) Static101.method1810(local226, local205, local222);
							if (local628 == null) {
								local628 = (Interface5) Static259.method4533(local226, local205, local222, iq.class);
							}
							if (local628 == null) {
								local628 = (Interface5) Static330.method5730(local226, local205, local222);
							}
							if (local628 == null) {
								local628 = (Interface5) Static241.method4296(local226, local205, local222);
							}
							if (local628 != null) {
								@Pc(668) Class156 local668 = Static111.method1967(local628.method5910());
								if (!local668.aBoolean384 || Static331.aBoolean537) {
									local289 = local668.anInt4753;
									if (local668.anIntArray437 != null) {
										for (local293 = 0; local293 < local668.anIntArray437.length; local293++) {
											if (local668.anIntArray437[local293] != -1) {
												@Pc(696) Class156 local696 = Static111.method1967(local668.anIntArray437[local293]);
												if (local696.anInt4753 >= 0) {
													local289 = local696.anInt4753;
												}
											}
										}
									}
									if (local289 >= 0) {
										@Pc(719) boolean local719 = false;
										if (local289 >= 0) {
											@Pc(725) Class215 local725 = Static252.method4463(local289);
											if (local725 != null && local725.aBoolean587) {
												local719 = true;
											}
										}
										local312 = local205;
										@Pc(736) int local736 = local222;
										if (local719) {
											@Pc(743) int[][] local743 = Static152.aClass24Array3[local226].anIntArrayArray15;
											@Pc(748) int local748 = Static152.aClass24Array3[local226].anInt543;
											@Pc(753) int local753 = Static152.aClass24Array3[local226].anInt542;
											for (@Pc(755) int local755 = 0; local755 < 10; local755++) {
												@Pc(762) int local762 = (int) (Math.random() * 4.0D);
												if (local762 == 0 && local312 > local27 && local312 > local205 - 3 && (local743[local312 - local748 - 1][local736 - local753] & 0x2C0108) == 0) {
													local312--;
												}
												if (local762 == 1 && local27 + 103 > local312 && local312 < local205 + 3 && (local743[local312 + 1 - local748][local736 - local753] & 0x2C0180) == 0) {
													local312++;
												}
												if (local762 == 2 && local33 < local736 && local736 > local222 - 3 && (local743[local312 - local748][local736 - local753 - 1] & 0x2C0102) == 0) {
													local736--;
												}
												if (local762 == 3 && local736 < local33 + 104 - 1 && local736 < local222 + 3 && (local743[local312 - local748][local736 + 1 - local753] & 0x2C0120) == 0) {
													local736++;
												}
											}
										}
										Static127.anIntArray242[Static76.anInt1459] = local668.lb;
										Static320.anIntArray595[Static76.anInt1459] = local312;
										Static207.anIntArray393[Static76.anInt1459] = local736;
										Static76.anInt1459++;
									}
								}
							}
						}
					}
				}
			}
			if (Static353.aClass64_3 != null) {
				Static200.aClass93_77.anInt2609 = 1;
				Static88.method1589(64, 1024);
				for (local222 = 0; local222 < Static353.aClass64_3.anInt1473; local222++) {
					local226 = Static353.aClass64_3.anIntArray122[local222];
					if (local226 >> 28 == Static239.anInt4811) {
						local230 = (local226 >> 14 & 0x3FFF) - Static172.anInt4394;
						local283 = (local226 & 0x3FFF) - Static12.anInt3797;
						if (local230 >= 0 && Static22.anInt481 > local230 && local283 >= 0 && local283 < Static269.anInt5281) {
							Static111.aClass103_54.method2745(new Class5_Sub15(local222));
						} else {
							@Pc(1029) Class215 local1029 = Static252.method4463(Static353.aClass64_3.anIntArray123[local222]);
							if (local1029.anIntArray638 != null && local1029.anInt6752 + local230 >= 0 && local1029.anInt6755 + local230 < Static22.anInt481 && local1029.anInt6753 + local283 >= 0 && local283 + local1029.anInt6763 < Static269.anInt5281) {
								Static111.aClass103_54.method2745(new Class5_Sub15(local222));
							}
						}
					}
				}
				Static88.method1589(64, 128);
				Static200.aClass93_77.anInt2609 = 2;
				Static200.aClass93_77.method2396();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIIILclient!bm;)Z")
	public static boolean method3178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class24 arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg3 - 64;
		Static107.anIntArrayArray75[64][64] = 99;
		@Pc(29) int local29 = arg6 - 64;
		Static240.anIntArrayArray76[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static85.anIntArray131[0] = arg3;
		@Pc(51) int local51 = local42 + 1;
		Static352.anIntArray637[0] = arg6;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray15;
		while (local44 != local51) {
			local9 = Static352.anIntArray637[local44];
			local7 = Static85.anIntArray131[local44];
			@Pc(71) int local71 = local9 - local29;
			@Pc(75) int local75 = local7 - local18;
			local44 = local44 + 1 & 0xFFF;
			@Pc(87) int local87 = local7 - arg9.anInt543;
			@Pc(92) int local92 = local9 - arg9.anInt542;
			if (arg5 == -4) {
				if (arg0 == local7 && arg7 == local9) {
					Static42.anInt742 = local7;
					Static63.anInt5184 = local9;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static174.method3164(local9, arg8, 2, arg0, arg4, local7, arg7, 2)) {
					Static63.anInt5184 = local9;
					Static42.anInt742 = local7;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg9.method495(local9, local7, 2, arg4, arg7, arg0, 2, arg8, arg2)) {
					Static42.anInt742 = local7;
					Static63.anInt5184 = local9;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg9.method496(arg2, local7, arg7, arg4, arg0, local9, arg8, 2)) {
					Static42.anInt742 = local7;
					Static63.anInt5184 = local9;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg9.method481(arg7, arg5, 2, arg1, arg0, local7, local9)) {
					Static42.anInt742 = local7;
					Static63.anInt5184 = local9;
					return true;
				}
			} else if (arg9.method497(arg0, 2, arg7, arg1, local7, local9, arg5)) {
				Static42.anInt742 = local7;
				Static63.anInt5184 = local9;
				return true;
			}
			@Pc(251) int local251 = Static240.anIntArrayArray76[local75][local71] + 1;
			if (local75 > 0 && Static107.anIntArrayArray75[local75 - 1][local71] == 0 && (local56[local87 - 1][local92] & 0x43A40000) == 0 && (local56[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static85.anIntArray131[local51] = local7 - 1;
				Static352.anIntArray637[local51] = local9;
				Static107.anIntArrayArray75[local75 - 1][local71] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static240.anIntArrayArray76[local75 - 1][local71] = local251;
			}
			if (local75 < 126 && Static107.anIntArrayArray75[local75 + 1][local71] == 0 && (local56[local87 + 2][local92] & 0x60E40000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static85.anIntArray131[local51] = local7 + 1;
				Static352.anIntArray637[local51] = local9;
				Static107.anIntArrayArray75[local75 + 1][local71] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static240.anIntArrayArray76[local75 + 1][local71] = local251;
			}
			if (local71 > 0 && Static107.anIntArrayArray75[local75][local71 - 1] == 0 && (local56[local87][local92 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static85.anIntArray131[local51] = local7;
				Static352.anIntArray637[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local75][local71 - 1] = 1;
				Static240.anIntArrayArray76[local75][local71 - 1] = local251;
			}
			if (local71 < 126 && Static107.anIntArrayArray75[local75][local71 + 1] == 0 && (local56[local87][local92 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static85.anIntArray131[local51] = local7;
				Static352.anIntArray637[local51] = local9 + 1;
				Static107.anIntArrayArray75[local75][local71 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static240.anIntArrayArray76[local75][local71 + 1] = local251;
			}
			if (local75 > 0 && local71 > 0 && Static107.anIntArrayArray75[local75 - 1][local71 - 1] == 0 && (local56[local87 - 1][local92] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local87][local92 - 1] & 0x63E40000) == 0) {
				Static85.anIntArray131[local51] = local7 - 1;
				Static352.anIntArray637[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local75 - 1][local71 - 1] = 3;
				Static240.anIntArrayArray76[local75 - 1][local71 - 1] = local251;
			}
			if (local75 < 126 && local71 > 0 && Static107.anIntArrayArray75[local75 + 1][local71 - 1] == 0 && (local56[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local92] & 0x78E40000) == 0) {
				Static85.anIntArray131[local51] = local7 + 1;
				Static352.anIntArray637[local51] = local9 - 1;
				Static107.anIntArrayArray75[local75 + 1][local71 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static240.anIntArrayArray76[local75 + 1][local71 - 1] = local251;
			}
			if (local75 > 0 && local71 < 126 && Static107.anIntArrayArray75[local75 - 1][local71 + 1] == 0 && (local56[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local56[local87][local92 + 2] & 0x7E240000) == 0) {
				Static85.anIntArray131[local51] = local7 - 1;
				Static352.anIntArray637[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local75 - 1][local71 + 1] = 6;
				Static240.anIntArrayArray76[local75 - 1][local71 + 1] = local251;
			}
			if (local75 < 126 && local71 < 126 && Static107.anIntArrayArray75[local75 + 1][local71 + 1] == 0 && (local56[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static85.anIntArray131[local51] = local7 + 1;
				Static352.anIntArray637[local51] = local9 + 1;
				Static107.anIntArrayArray75[local75 + 1][local71 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static240.anIntArrayArray76[local75 + 1][local71 + 1] = local251;
			}
		}
		Static63.anInt5184 = local9;
		Static42.anInt742 = local7;
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIBIII)V")
	public static void method3182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static163.anInt3234 <= arg2 - arg1 && arg1 + arg2 <= Static353.anInt6760 && arg4 - arg1 >= Static75.anInt1447 && Static346.anInt6668 >= arg4 + arg1) {
			Static80.method1441(arg5, arg0, arg3, arg2, arg1, arg4);
		} else {
			Static2.method1428(arg4, arg0, arg5, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method3183() {
		Static17.aStringArray4 = new String[500];
		Static56.anInt1019 = Static268.aClass36_8.anInt737 + Static268.aClass36_8.anInt728 + 2;
		Static176.anInt3501 = Static92.aClass36_4.anInt728 + Static92.aClass36_4.anInt737 + 2;
		for (@Pc(24) int local24 = 0; local24 < Static17.aStringArray4.length; local24++) {
			Static17.aStringArray4[local24] = "";
		}
	}
}
