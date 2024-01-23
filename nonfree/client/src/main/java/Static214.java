import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public static int anInt4717;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!i;")
	private static Class41 aClass41_1262 = Static184.method2923("cyan:");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_1263 = aClass41_1262;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!ob;")
	public static Class70 aClass70_18 = new Class70(4096);

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_1264 = aClass41_1262;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!ca;")
	public static Class16 aClass16_11 = new Class16(50);

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!id;")
	public static Class43 aClass43_25 = new Class43(64);

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_1265 = Static184.method2923("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!q;IIIIBI)V")
	public static void method3265(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg3 * arg3 + arg1 * arg1;
		if (local12 > 360000) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg0.anInt3635 / 2, arg0.anInt3660 / 2);
		if (local30 * local30 >= local12) {
			Static52.method1009(arg2, arg5, arg3, arg0, Static201.aClass2_Sub2_Sub16Array19[arg4], arg1);
			return;
		}
		local30 -= 10;
		@Pc(42) int local42 = Static47.anInt1372 + Static183.anInt1324 & 0x7FF;
		@Pc(46) int local46 = Class79.anIntArray375[local42];
		@Pc(54) int local54 = local46 * 256 / (Static58.anInt1635 + 256);
		@Pc(58) int local58 = Class79.anIntArray377[local42];
		@Pc(66) int local66 = local58 * 256 / (Static58.anInt1635 + 256);
		@Pc(76) int local76 = local54 * arg3 - arg1 * local66 >> 16;
		@Pc(87) int local87 = arg3 * local66 + arg1 * local54 >> 16;
		@Pc(93) double local93 = Math.atan2((double) local87, (double) local76);
		@Pc(100) int local100 = (int) ((double) local30 * Math.sin(local93));
		@Pc(107) int local107 = (int) (Math.cos(local93) * (double) local30);
		((Class2_Sub2_Sub16_Sub1) Static99.aClass2_Sub2_Sub16Array12[arg4]).method2418(arg5 + arg0.anInt3635 / 2 + local100 - 10, arg0.anInt3660 / 2 + -10 + arg2 - local107, local93);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
	public static void method3267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static64.method1166(arg1, arg0, arg2 + arg1, arg3 + arg0);
		Static64.method1164(arg1, arg0, arg2, arg3, 0);
		if (Static202.anInt1737 < 100) {
			return;
		}
		if (Static217.aClass2_Sub2_Sub16_4 == null) {
			@Pc(32) Class2_Sub2_Sub16_Sub1 local32 = new Class2_Sub2_Sub16_Sub1(arg2, arg3);
			Static64.method1182(local32.anIntArray354, arg2, arg3);
			Static42.method210(arg3, arg2, 0, 0, Static40.anInt1214, 0, Static95.anInt2353, 0);
			Static217.aClass2_Sub2_Sub16_4 = local32;
			Static178.aClass22_1.method1213();
		}
		Static217.aClass2_Sub2_Sub16_4.method2396(arg1, arg0);
		@Pc(64) int local64 = arg1 + Static36.anInt949 * arg2 / Static95.anInt2353;
		@Pc(70) int local70 = Static63.anInt1688 * arg2 / Static95.anInt2353;
		@Pc(78) int local78 = arg0 + Static39.anInt1059 * arg3 / Static40.anInt1214;
		@Pc(84) int local84 = Static147.anInt3347 * arg3 / Static40.anInt1214;
		Static64.method1183(local64, local78, local70, local84, 16711680, 128);
		Static64.method1162(local64, local78, local70, local84, 16711680);
		if (Static49.anInt1395 <= 0 || Static49.anInt1395 % 10 >= 5) {
			return;
		}
		for (@Pc(112) Class2_Sub8 local112 = (Class2_Sub8) Static206.aClass108_19.method3322(); local112 != null; local112 = (Class2_Sub8) Static206.aClass108_19.method3331()) {
			if (local112.anInt1631 == Static40.anInt1221) {
				@Pc(128) int local128 = arg1 + arg2 * local112.anInt1630 / Static95.anInt2353;
				@Pc(137) int local137 = local112.anInt1629 * arg3 / Static40.anInt1214 + arg0;
				Static64.method1164(local128 - 2, local137 + -2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIZIIIII)Z")
	public static boolean method3268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static168.anIntArrayArray35[local3][local7] = 0;
				Static202.anIntArrayArray15[local3][local7] = 99999999;
			}
		}
		Static168.anIntArrayArray35[arg5][arg8] = 99;
		Static202.anIntArrayArray15[arg5][arg8] = 0;
		local7 = arg5;
		@Pc(56) int local56 = arg8;
		@Pc(58) int local58 = 0;
		@Pc(60) boolean local60 = false;
		@Pc(62) byte local62 = 0;
		Static106.anIntArray254[0] = arg5;
		@Pc(69) int local69 = local62 + 1;
		Static84.anIntArray209[0] = arg8;
		@Pc(76) int[][] local76 = Static149.aClass42Array1[Static134.anInt3147].anIntArrayArray19;
		@Pc(197) int local197;
		@Pc(236) int local236;
		label367: while (local58 != local69) {
			local56 = Static84.anIntArray209[local58];
			local7 = Static106.anIntArray254[local58];
			local58 = local58 + 1 & 0xFFF;
			if (local7 == arg1 && arg4 == local56) {
				local60 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static149.aClass42Array1[Static134.anInt3147].method1429(local56, arg3 - 1, arg1, arg4, arg2, arg6, local7)) {
					local60 = true;
					break;
				}
				if (arg3 < 10 && Static149.aClass42Array1[Static134.anInt3147].method1437(arg6, local7, arg3 - 1, arg4, arg2, local56, arg1)) {
					local60 = true;
					break;
				}
			}
			if (arg0 != 0 && arg11 != 0 && Static149.aClass42Array1[Static134.anInt3147].method1439(arg2, arg4, arg0, local56, arg11, local7, arg1, arg10)) {
				local60 = true;
				break;
			}
			local197 = Static202.anIntArrayArray15[local7][local56] + 1;
			if (local7 > 0 && Static168.anIntArrayArray35[local7 - 1][local56] == 0 && (local76[local7 - 1][local56] & 0x12C010E) == 0 && (local76[local7 - 1][local56 + arg2 - 1] & 0x12C0138) == 0) {
				local236 = 1;
				while (true) {
					if (arg2 - 1 <= local236) {
						Static106.anIntArray254[local69] = local7 - 1;
						Static84.anIntArray209[local69] = local56;
						local69 = local69 + 1 & 0xFFF;
						Static168.anIntArrayArray35[local7 - 1][local56] = 2;
						Static202.anIntArrayArray15[local7 - 1][local56] = local197;
						break;
					}
					if ((local76[local7 - 1][local236 + local56] & 0x12C013E) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local7 < 102 && Static168.anIntArrayArray35[local7 + 1][local56] == 0 && (local76[local7 + arg2][local56] & 0x12C0183) == 0 && (local76[local7 + arg2][arg2 + local56 - 1] & 0x12C01E0) == 0) {
				local236 = 1;
				while (true) {
					if (local236 >= arg2 - 1) {
						Static106.anIntArray254[local69] = local7 + 1;
						Static84.anIntArray209[local69] = local56;
						local69 = local69 + 1 & 0xFFF;
						Static168.anIntArrayArray35[local7 + 1][local56] = 8;
						Static202.anIntArrayArray15[local7 + 1][local56] = local197;
						break;
					}
					if ((local76[local7 + arg2][local236 + local56] & 0x12C01E3) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local56 > 0 && Static168.anIntArrayArray35[local7][local56 - 1] == 0 && (local76[local7][local56 - 1] & 0x12C010E) == 0 && (local76[arg2 + local7 - 1][local56 - 1] & 0x12C0183) == 0) {
				local236 = 1;
				while (true) {
					if (arg2 - 1 <= local236) {
						Static106.anIntArray254[local69] = local7;
						Static84.anIntArray209[local69] = local56 - 1;
						local69 = local69 + 1 & 0xFFF;
						Static168.anIntArrayArray35[local7][local56 - 1] = 1;
						Static202.anIntArrayArray15[local7][local56 - 1] = local197;
						break;
					}
					if ((local76[local7 + local236][local56 - 1] & 0x12C018F) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local56 < 102 && Static168.anIntArrayArray35[local7][local56 + 1] == 0 && (local76[local7][arg2 + local56] & 0x12C0138) == 0 && (local76[arg2 + local7 - 1][local56 + arg2] & 0x12C01E0) == 0) {
				local236 = 1;
				while (true) {
					if (local236 >= arg2 - 1) {
						Static106.anIntArray254[local69] = local7;
						Static84.anIntArray209[local69] = local56 + 1;
						local69 = local69 + 1 & 0xFFF;
						Static168.anIntArrayArray35[local7][local56 + 1] = 4;
						Static202.anIntArrayArray15[local7][local56 + 1] = local197;
						break;
					}
					if ((local76[local7 + local236][arg2 + local56] & 0x12C01F8) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local7 > 0 && local56 > 0 && Static168.anIntArrayArray35[local7 - 1][local56 - 1] == 0 && (local76[local7 - 1][local56 + arg2 - 1 - 1] & 0x12C0138) == 0 && (local76[local7 - 1][local56 - 1] & 0x12C010E) == 0 && (local76[arg2 + local7 - 1 - 1][local56 - 1] & 0x12C0183) == 0) {
				local236 = 1;
				while (true) {
					if (local236 >= arg2 - 1) {
						Static106.anIntArray254[local69] = local7 - 1;
						Static84.anIntArray209[local69] = local56 - 1;
						local69 = local69 + 1 & 0xFFF;
						Static168.anIntArrayArray35[local7 - 1][local56 - 1] = 3;
						Static202.anIntArrayArray15[local7 - 1][local56 - 1] = local197;
						break;
					}
					if ((local76[local7 - 1][local56 + local236 - 1] & 0x12C013E) != 0 || (local76[local7 + local236 - 1][local56 - 1] & 0x12C018F) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local7 < 102 && local56 > 0 && Static168.anIntArrayArray35[local7 + 1][local56 - 1] == 0 && (local76[local7 + 1][local56 - 1] & 0x12C010E) == 0 && (local76[arg2 + local7][local56 - 1] & 0x12C0183) == 0 && (local76[arg2 + local7][local56 + arg2 - 1 - 1] & 0x12C01E0) == 0) {
				local236 = 1;
				while (true) {
					if (arg2 - 1 <= local236) {
						Static106.anIntArray254[local69] = local7 + 1;
						Static84.anIntArray209[local69] = local56 - 1;
						Static168.anIntArrayArray35[local7 + 1][local56 - 1] = 9;
						Static202.anIntArrayArray15[local7 + 1][local56 - 1] = local197;
						local69 = local69 + 1 & 0xFFF;
						break;
					}
					if ((local76[local7 + arg2][local236 + local56 - 1] & 0x12C01E3) != 0 || (local76[local7 + local236 + 1][local56 - 1] & 0x12C018F) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local7 > 0 && local56 < 102 && Static168.anIntArrayArray35[local7 - 1][local56 + 1] == 0 && (local76[local7 - 1][local56 + 1] & 0x12C010E) == 0 && (local76[local7 - 1][arg2 + local56] & 0x12C0138) == 0 && (local76[local7][local56 + arg2] & 0x12C01E0) == 0) {
				local236 = 1;
				while (true) {
					if (local236 >= arg2 - 1) {
						Static106.anIntArray254[local69] = local7 - 1;
						Static84.anIntArray209[local69] = local56 + 1;
						local69 = local69 + 1 & 0xFFF;
						Static168.anIntArrayArray35[local7 - 1][local56 + 1] = 6;
						Static202.anIntArrayArray15[local7 - 1][local56 + 1] = local197;
						break;
					}
					if ((local76[local7 - 1][local236 + local56 + 1] & 0x12C013E) != 0 || (local76[local7 + local236 - 1][local56 + arg2] & 0x12C01F8) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local7 < 102 && local56 < 102 && Static168.anIntArrayArray35[local7 + 1][local56 + 1] == 0 && (local76[local7 + 1][arg2 + local56] & 0x12C0138) == 0 && (local76[arg2 + local7][arg2 + local56] & 0x12C01E0) == 0 && (local76[arg2 + local7][local56 + 1] & 0x12C0183) == 0) {
				for (local236 = 1; local236 < arg2 - 1; local236++) {
					if ((local76[local236 + local7 + 1][local56 + arg2] & 0x12C01F8) != 0 || (local76[arg2 + local7][local56 + local236 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				Static106.anIntArray254[local69] = local7 + 1;
				Static84.anIntArray209[local69] = local56 + 1;
				local69 = local69 + 1 & 0xFFF;
				Static168.anIntArrayArray35[local7 + 1][local56 + 1] = 12;
				Static202.anIntArrayArray15[local7 + 1][local56 + 1] = local197;
			}
		}
		Static106.anInt2579 = 0;
		if (!local60) {
			if (!arg7) {
				return false;
			}
			local197 = 1000;
			local236 = 100;
			for (@Pc(1207) int local1207 = arg1 - 10; local1207 <= arg1 + 10; local1207++) {
				for (@Pc(1214) int local1214 = arg4 - 10; local1214 <= arg4 + 10; local1214++) {
					if (local1207 >= 0 && local1214 >= 0 && local1207 < 104 && local1214 < 104 && Static202.anIntArrayArray15[local1207][local1214] < 100) {
						@Pc(1244) int local1244 = 0;
						if (arg1 > local1207) {
							local1244 = arg1 - local1207;
						} else if (arg0 + arg1 - 1 < local1207) {
							local1244 = local1207 + 1 - arg1 - arg0;
						}
						@Pc(1272) int local1272 = 0;
						if (arg4 > local1214) {
							local1272 = arg4 - local1214;
						} else if (local1214 > arg11 + arg4 - 1) {
							local1272 = local1214 + 1 - arg11 - arg4;
						}
						@Pc(1310) int local1310 = local1244 * local1244 + local1272 * local1272;
						if (local197 > local1310 || local197 == local1310 && local236 > Static202.anIntArrayArray15[local1207][local1214]) {
							local7 = local1207;
							local197 = local1310;
							local236 = Static202.anIntArrayArray15[local1207][local1214];
							local56 = local1214;
						}
					}
				}
			}
			if (local197 == 1000) {
				return false;
			}
			if (local7 == arg5 && local56 == arg8) {
				return false;
			}
			Static106.anInt2579 = 1;
		}
		@Pc(1380) byte local1380 = 0;
		Static106.anIntArray254[0] = local7;
		local58 = local1380 + 1;
		Static84.anIntArray209[0] = local56;
		local197 = local236 = Static168.anIntArrayArray35[local7][local56];
		while (local7 != arg5 || local56 != arg8) {
			if (local197 != local236) {
				local236 = local197;
				Static106.anIntArray254[local58] = local7;
				Static84.anIntArray209[local58++] = local56;
			}
			if ((local197 & 0x1) != 0) {
				local56++;
			} else if ((local197 & 0x4) != 0) {
				local56--;
			}
			if ((local197 & 0x2) != 0) {
				local7++;
			} else if ((local197 & 0x8) != 0) {
				local7--;
			}
			local197 = Static168.anIntArrayArray35[local7][local56];
		}
		if (local58 > 0) {
			Static220.method3323(arg9, Static106.anIntArray254, Static84.anIntArray209, local58);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
	public static void method3269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = (arg1 - 32) * arg1 / arg3;
		if (local7 < 8) {
			local7 = 8;
		}
		Static6.aClass60Array3[0].method2740(arg4, arg2);
		@Pc(35) int local35 = arg0 * (arg1 - local7 - 32) / (arg3 - arg1);
		Static6.aClass60Array3[1].method2740(arg4, arg1 + arg2 - 16);
		Static64.method1164(arg4, arg2 + 16, 16, arg1 - 32, Static211.anInt4702);
		Static64.method1164(arg4, local35 + arg2 + 16, 16, local7, Static3.anInt71);
		Static64.method1173(arg4, local35 + arg2 + 16, local7, Static204.anInt4551);
		Static64.method1173(arg4 + 1, local35 + 16 + arg2, local7, Static204.anInt4551);
		Static64.method1175(arg4, arg2 + local35 + 16, 16, Static204.anInt4551);
		Static64.method1175(arg4, local35 + arg2 + 17, 16, Static204.anInt4551);
		Static64.method1173(arg4 + 15, arg2 + 16 + local35, local7, Static47.anInt1368);
		Static64.method1173(arg4 + 14, arg2 - -local35 + 17, local7 - 1, Static47.anInt1368);
		Static64.method1175(arg4, local35 + arg2 + local7 + 15, 16, Static47.anInt1368);
		Static64.method1175(arg4 + 1, local35 + 14 + arg2 + local7, 15, Static47.anInt1368);
	}
}
