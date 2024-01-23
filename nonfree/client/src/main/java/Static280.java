import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!mf;")
	public static Class100 aClass100_8;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "[Lclient!ok;")
	public static Class116[] aClass116Array2;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
	public static int anInt5999;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "J")
	public static long aLong196 = 0L;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "Lclient!pm;")
	public static Class125 aClass125_13 = new Class125(128);

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "S")
	public static short aShort42 = 32767;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
	public static int anInt5995 = 0;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString193 = null;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method4646() {
		if (Static93.aString66.toLowerCase().indexOf("microsoft") != -1) {
			Static48.anIntArray138[219] = 42;
			Static48.anIntArray138[223] = 28;
			Static48.anIntArray138[220] = 74;
			Static48.anIntArray138[191] = 73;
			Static48.anIntArray138[192] = 58;
			Static48.anIntArray138[190] = 72;
			Static48.anIntArray138[187] = 27;
			Static48.anIntArray138[221] = 43;
			Static48.anIntArray138[222] = 59;
			Static48.anIntArray138[186] = 57;
			Static48.anIntArray138[189] = 26;
			Static48.anIntArray138[188] = 71;
			return;
		}
		Static48.anIntArray138[91] = 42;
		Static48.anIntArray138[93] = 43;
		if (Static93.aMethod2 == null) {
			Static48.anIntArray138[192] = 58;
			Static48.anIntArray138[222] = 59;
		} else {
			Static48.anIntArray138[222] = 58;
			Static48.anIntArray138[520] = 59;
			Static48.anIntArray138[192] = 28;
		}
		Static48.anIntArray138[47] = 73;
		Static48.anIntArray138[45] = 26;
		Static48.anIntArray138[46] = 72;
		Static48.anIntArray138[59] = 57;
		Static48.anIntArray138[61] = 27;
		Static48.anIntArray138[44] = 71;
		Static48.anIntArray138[92] = 74;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!kb;)V")
	public static void method4649(@OriginalArg(1) Class83 arg0) {
		Static224.aClass83_150 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)V")
	public static void method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static159.anInt3706 = 0;
		@Pc(13) int local13;
		@Pc(615) int local615;
		@Pc(241) int local241;
		@Pc(109) int local109;
		@Pc(150) int local150;
		@Pc(195) int local195;
		@Pc(623) int local623;
		for (local13 = -1; local13 < Static266.anInt5789 + Static147.anInt3493; local13++) {
			@Pc(34) Class25_Sub1 local34;
			if (local13 == -1) {
				local34 = Static239.aClass25_Sub1_Sub1_2;
			} else if (local13 < Static266.anInt5789) {
				local34 = Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local13]];
			} else {
				local34 = Static27.aClass25_Sub1_Sub2Array1[Static65.anIntArray25[local13 - Static266.anInt5789]];
			}
			if (local34 != null && local34.method1244()) {
				@Pc(64) Class143 local64;
				if (local34 instanceof Class25_Sub1_Sub2) {
					local64 = ((Class25_Sub1_Sub2) local34).aClass143_1;
					if (local64.anIntArray535 != null) {
						local64 = local64.method4065();
					}
					if (local64 == null) {
						continue;
					}
				}
				@Pc(326) int local326;
				if (Static266.anInt5789 <= local13) {
					local64 = ((Class25_Sub1_Sub2) local34).aClass143_1;
					if (local64.anIntArray535 != null) {
						local64 = local64.method4065();
					}
					if (local64.anInt5185 >= 0 && local64.anInt5185 < Static250.aClass1_Sub2_Sub14Array8.length) {
						if (local64.anInt5177 == -1) {
							local109 = local34.method1228() + 15;
						} else {
							local109 = local64.anInt5177 + 15;
						}
						Static287.method4706(arg2 >> 1, arg4, local34, arg1, arg0 >> 1, local109);
						if (Static22.anInt480 > -1) {
							Static250.aClass1_Sub2_Sub14Array8[local64.anInt5185].method2727(arg5 + Static22.anInt480 - 12, arg3 + -30 + Static25.anInt512);
						}
					}
					local150 = 0;
					@Pc(152) Class81[] local152 = Static129.aClass81Array1;
					while (local150 < local152.length) {
						@Pc(164) Class81 local164 = local152[local150];
						if (local164 != null && local164.anInt3022 == 1 && Static65.anIntArray25[local13 - Static266.anInt5789] == local164.anInt3010 && Static32.anInt809 % 20 < 10) {
							if (local64.anInt5177 == -1) {
								local195 = local34.method1228() + 15;
							} else {
								local195 = local64.anInt5177 + 15;
							}
							Static287.method4706(arg2 >> 1, arg4, local34, arg1, arg0 >> 1, local195);
							if (Static22.anInt480 > -1) {
								Static215.aClass1_Sub2_Sub14Array15[local164.anInt3011].method2727(Static22.anInt480 + arg5 - 12, Static25.anInt512 + arg3 - 28);
							}
						}
						local150++;
					}
				} else {
					local241 = 30;
					@Pc(244) Class25_Sub1_Sub1 local244 = (Class25_Sub1_Sub1) local34;
					if (local244.anInt732 != -1 || local244.anInt711 != -1) {
						Static287.method4706(arg2 >> 1, arg4, local34, arg1, arg0 >> 1, local34.method1228() + 15);
						if (Static22.anInt480 > -1) {
							if (local244.anInt732 != -1) {
								Static9.aClass1_Sub2_Sub14Array1[local244.anInt732].method2727(Static22.anInt480 + arg5 - 12, arg3 + -30 - -Static25.anInt512);
								local241 += 25;
							}
							if (local244.anInt711 != -1) {
								Static250.aClass1_Sub2_Sub14Array8[local244.anInt711].method2727(arg5 + Static22.anInt480 - 12, -local241 + Static25.anInt512 + arg3);
								local241 += 25;
							}
						}
					}
					if (local13 >= 0) {
						local326 = 0;
						@Pc(328) Class81[] local328 = Static129.aClass81Array1;
						while (local328.length > local326) {
							@Pc(340) Class81 local340 = local328[local326];
							if (local340 != null && local340.anInt3022 == 10 && local340.anInt3010 == Static39.anIntArray108[local13]) {
								Static287.method4706(arg2 >> 1, arg4, local34, arg1, arg0 >> 1, local34.method1228() + 15);
								if (Static22.anInt480 > -1) {
									Static215.aClass1_Sub2_Sub14Array15[local340.anInt3011].method2727(arg5 + Static22.anInt480 - 12, -local241 + Static25.anInt512 + arg3);
								}
							}
							local326++;
						}
					}
				}
				if (local34.aString52 != null && (local13 >= Static266.anInt5789 || Static133.anInt3019 == 0 || Static133.anInt3019 == 3 || Static133.anInt3019 == 1 && Static141.method2525(((Class25_Sub1_Sub1) local34).aString26))) {
					Static287.method4706(arg2 >> 1, arg4, local34, arg1, arg0 >> 1, local34.method1228());
					if (Static22.anInt480 > -1 && Static197.anInt4471 > Static159.anInt3706) {
						Static197.anIntArray452[Static159.anInt3706] = Static156.aClass1_Sub2_Sub16_3.method3966(local34.aString52) / 2;
						Static197.anIntArray456[Static159.anInt3706] = Static156.aClass1_Sub2_Sub16_3.anInt5004;
						Static197.anIntArray454[Static159.anInt3706] = Static22.anInt480;
						Static197.anIntArray451[Static159.anInt3706] = Static25.anInt512;
						Static197.anIntArray453[Static159.anInt3706] = local34.anInt1678;
						Static197.anIntArray458[Static159.anInt3706] = local34.anInt1620;
						Static197.anIntArray457[Static159.anInt3706] = local34.anInt1675;
						Static197.aStringArray22[Static159.anInt3706] = local34.aString52;
						Static159.anInt3706++;
					}
				}
				if (local34.anInt1644 > Static32.anInt809) {
					@Pc(491) Class1_Sub2_Sub14 local491 = Static11.aClass1_Sub2_Sub14Array13[0];
					@Pc(495) Class1_Sub2_Sub14 local495 = Static11.aClass1_Sub2_Sub14Array13[1];
					if (local34 instanceof Class25_Sub1_Sub2) {
						@Pc(501) Class25_Sub1_Sub2 local501 = (Class25_Sub1_Sub2) local34;
						@Pc(511) Class1_Sub2_Sub14[] local511 = (Class1_Sub2_Sub14[]) Static231.aClass155_41.method4358((long) local501.aClass143_1.anInt5175);
						if (local511 == null) {
							local511 = Static167.method3093(local501.aClass143_1.anInt5175, Static33.aClass83_20);
							if (local511 != null) {
								Static231.aClass155_41.method4360((long) local501.aClass143_1.anInt5175, local511);
							}
						}
						if (local511 != null && local511.length == 2) {
							local495 = local511[1];
							local491 = local511[0];
						}
						@Pc(550) Class143 local550 = local501.aClass143_1;
						if (local550.anInt5177 == -1) {
							local150 = local34.method1228();
						} else {
							local150 = local550.anInt5177;
						}
					} else {
						local150 = local34.method1228();
					}
					Static287.method4706(arg2 >> 1, arg4, local34, arg1, arg0 >> 1, local150 + local491.anInt3430 + 10);
					if (Static22.anInt480 > -1) {
						local326 = Static22.anInt480 + arg5 - (local491.anInt3438 >> 1);
						local195 = Static25.anInt512 + arg3 - 3;
						local491.method2727(local326, local195);
						local615 = local491.anInt3430;
						local623 = local491.anInt3438 * local34.anInt1682 / 255;
						if (Static296.aBoolean335) {
							Static288.method4717(local326, local195, local623 + local326, local195 - -local615);
						} else {
							Static203.method3596(local326, local195, local326 + local623, local615 + local195);
						}
						local495.method2727(local326, local195);
						if (Static296.aBoolean335) {
							Static288.method4714(arg5, arg3, arg2 + arg5, arg3 + arg0);
						} else {
							Static203.method3590(arg5, arg3, arg2 + arg5, arg3 + arg0);
						}
					}
				}
				for (local241 = 0; local241 < 4; local241++) {
					if (Static32.anInt809 < local34.anIntArray174[local241]) {
						if (local34 instanceof Class25_Sub1_Sub2) {
							@Pc(693) Class25_Sub1_Sub2 local693 = (Class25_Sub1_Sub2) local34;
							@Pc(696) Class143 local696 = local693.aClass143_1;
							if (local696.anInt5177 == -1) {
								local109 = local34.method1228() / 2;
							} else {
								local109 = local696.anInt5177 / 2;
							}
						} else {
							local109 = local34.method1228() / 2;
						}
						Static287.method4706(arg2 >> 1, arg4, local34, arg1, arg0 >> 1, local109);
						if (Static22.anInt480 > -1) {
							if (local241 == 1) {
								Static25.anInt512 -= 20;
							}
							if (local241 == 2) {
								Static25.anInt512 -= 10;
								Static22.anInt480 -= 15;
							}
							if (local241 == 3) {
								Static22.anInt480 += 15;
								Static25.anInt512 -= 10;
							}
							Static282.aClass1_Sub2_Sub14Array17[local34.anIntArray171[local241]].method2727(Static22.anInt480 + arg5 - 12, arg3 + -12 + Static25.anInt512);
							Static14.aClass1_Sub2_Sub16_1.method3972(Integer.toString(local34.anIntArray175[local241]), Static22.anInt480 + arg5 - 1, Static25.anInt512 + 3 + arg3, 16777215, 0);
						}
					}
				}
			}
		}
		for (local13 = 0; local13 < Static159.anInt3706; local13++) {
			local241 = Static197.anIntArray451[local13];
			local109 = Static197.anIntArray452[local13];
			@Pc(833) int local833 = Static197.anIntArray454[local13];
			local150 = Static197.anIntArray456[local13];
			@Pc(839) boolean local839 = true;
			while (local839) {
				local839 = false;
				for (local195 = 0; local195 < local13; local195++) {
					if (Static197.anIntArray451[local195] - Static197.anIntArray456[local195] < local241 + 2 && Static197.anIntArray451[local195] + 2 > -local150 + local241 && Static197.anIntArray454[local195] + Static197.anIntArray452[local195] > local833 - local109 && local109 + local833 > Static197.anIntArray454[local195] + -Static197.anIntArray452[local195] && Static197.anIntArray451[local195] - Static197.anIntArray456[local195] < local241) {
						local241 = Static197.anIntArray451[local195] - Static197.anIntArray456[local195];
						local839 = true;
					}
				}
			}
			Static22.anInt480 = Static197.anIntArray454[local13];
			Static25.anInt512 = Static197.anIntArray451[local13] = local241;
			@Pc(951) String local951 = Static197.aStringArray22[local13];
			if (Static32.anInt823 == 0) {
				local623 = 16776960;
				if (Static197.anIntArray453[local13] < 6) {
					local623 = Static43.anIntArray118[Static197.anIntArray453[local13]];
				}
				if (Static197.anIntArray453[local13] == 6) {
					local623 = Static121.anInt2729 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static197.anIntArray453[local13] == 7) {
					local623 = Static121.anInt2729 % 20 >= 10 ? 65535 : 255;
				}
				if (Static197.anIntArray453[local13] == 8) {
					local623 = Static121.anInt2729 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static197.anIntArray453[local13] == 9) {
					local615 = 150 - Static197.anIntArray457[local13];
					if (local615 < 50) {
						local623 = local615 * 1280 + 16711680;
					} else if (local615 < 100) {
						local623 = 16776960 - (local615 - 50) * 327680;
					} else if (local615 < 150) {
						local623 = (local615 - 100) * 5 + 65280;
					}
				}
				if (Static197.anIntArray453[local13] == 10) {
					local615 = 150 - Static197.anIntArray457[local13];
					if (local615 < 50) {
						local623 = local615 * 5 + 16711680;
					} else if (local615 < 100) {
						local623 = 33095935 - local615 * 327680;
					} else if (local615 < 150) {
						local623 = local615 * 327680 + 500 + 255 - local615 * 5 - 32768000;
					}
				}
				if (Static197.anIntArray453[local13] == 11) {
					local615 = 150 - Static197.anIntArray457[local13];
					if (local615 < 50) {
						local623 = 16777215 - local615 * 327685;
					} else if (local615 < 100) {
						local623 = local615 * 327685 - 16318970;
					} else if (local615 < 150) {
						local623 = 16777215 - (local615 - 100) * 327680;
					}
				}
				if (Static197.anIntArray458[local13] == 0) {
					Static156.aClass1_Sub2_Sub16_3.method3972(local951, Static22.anInt480 + arg5, arg3 + Static25.anInt512, local623, 0);
				}
				if (Static197.anIntArray458[local13] == 1) {
					Static156.aClass1_Sub2_Sub16_3.method3965(local951, arg5 + Static22.anInt480, Static25.anInt512 + arg3, local623, Static121.anInt2729);
				}
				if (Static197.anIntArray458[local13] == 2) {
					Static156.aClass1_Sub2_Sub16_3.method3973(local951, arg5 + Static22.anInt480, Static25.anInt512 + arg3, local623, Static121.anInt2729);
				}
				if (Static197.anIntArray458[local13] == 3) {
					Static156.aClass1_Sub2_Sub16_3.method3985(local951, arg5 + Static22.anInt480, arg3 - -Static25.anInt512, local623, Static121.anInt2729, 150 - Static197.anIntArray457[local13]);
				}
				if (Static197.anIntArray458[local13] == 4) {
					local615 = (150 - Static197.anIntArray457[local13]) * (Static156.aClass1_Sub2_Sub16_3.method3966(local951) - -100) / 150;
					if (Static296.aBoolean335) {
						Static288.method4717(arg5 + Static22.anInt480 - 50, arg3, Static22.anInt480 + arg5 + 50, arg0 + arg3);
					} else {
						Static203.method3596(arg5 + Static22.anInt480 - 50, arg3, arg5 + Static22.anInt480 + 50, arg3 - -arg0);
					}
					Static156.aClass1_Sub2_Sub16_3.method3981(local951, Static22.anInt480 + arg5 + 50 - local615, arg3 + Static25.anInt512, local623, 0);
					if (Static296.aBoolean335) {
						Static288.method4714(arg5, arg3, arg5 + arg2, arg0 + arg3);
					} else {
						Static203.method3590(arg5, arg3, arg5 + arg2, arg0 + arg3);
					}
				}
				if (Static197.anIntArray458[local13] == 5) {
					local615 = 150 - Static197.anIntArray457[local13];
					@Pc(1384) int local1384 = 0;
					if (local615 < 25) {
						local1384 = local615 - 25;
					} else if (local615 > 125) {
						local1384 = local615 - 125;
					}
					if (Static296.aBoolean335) {
						Static288.method4717(arg5, arg3 + Static25.anInt512 - Static156.aClass1_Sub2_Sub16_3.anInt5004 - 1, arg2 + arg5, Static25.anInt512 + arg3 + 5);
					} else {
						Static203.method3596(arg5, Static25.anInt512 + arg3 - Static156.aClass1_Sub2_Sub16_3.anInt5004 - 1, arg5 + arg2, Static25.anInt512 + arg3 + 5);
					}
					Static156.aClass1_Sub2_Sub16_3.method3972(local951, Static22.anInt480 + arg5, local1384 + Static25.anInt512 + arg3, local623, 0);
					if (Static296.aBoolean335) {
						Static288.method4714(arg5, arg3, arg5 + arg2, arg3 - -arg0);
					} else {
						Static203.method3590(arg5, arg3, arg5 + arg2, arg0 + arg3);
					}
				}
			} else {
				Static156.aClass1_Sub2_Sub16_3.method3972(local951, Static22.anInt480 + arg5, arg3 + Static25.anInt512, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB[S[Ljava/lang/String;I)V")
	public static void method4652(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg3) / 2;
		@Pc(24) int local24 = arg0;
		@Pc(28) String local28 = arg2[local22];
		arg2[local22] = arg2[arg3];
		arg2[arg3] = local28;
		@Pc(42) short local42 = arg1[local22];
		arg1[local22] = arg1[arg3];
		arg1[arg3] = local42;
		for (@Pc(54) int local54 = arg0; local54 < arg3; local54++) {
			if (local28 == null || arg2[local54] != null && (local54 & 0x1) > arg2[local54].compareTo(local28)) {
				@Pc(77) String local77 = arg2[local54];
				arg2[local54] = arg2[local24];
				arg2[local24] = local77;
				@Pc(91) short local91 = arg1[local54];
				arg1[local54] = arg1[local24];
				arg1[local24++] = local91;
			}
		}
		arg2[arg3] = arg2[local24];
		arg2[local24] = local28;
		arg1[arg3] = arg1[local24];
		arg1[local24] = local42;
		method4652(arg0, arg1, arg2, local24 - 1);
		method4652(local24 + 1, arg1, arg2, arg3);
	}
}
