import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_122;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public static int anInt4451;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_1173 = Static184.method2923("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Lclient!i;")
	private static Class41 aClass41_1177 = Static184.method2923("Please try using a different world)3");

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_1174 = aClass41_1177;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	public static int anInt4444 = 0;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_1175 = aClass41_1177;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
	public static int anInt4445 = 0;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	public static int anInt4446 = 0;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_1176 = aClass41_1177;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!i;")
	private static Class41 aClass41_1183 = Static184.method2923("Your account is already logged in)3");

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_1178 = aClass41_1183;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_1179 = aClass41_1177;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_1180 = aClass41_1177;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Lclient!i;")
	public static Class41 aClass41_1181 = Static184.method2923("overlay2)3dat");

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "Lclient!i;")
	public static Class41 aClass41_1182 = aClass41_1177;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public static int anInt4450 = 127;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!i;IILclient!i;)V")
	public static void method3075(@OriginalArg(0) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41 arg2) {
		Static104.method1777(arg0, -1, arg2, arg1, null);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) int local18 = arg5 - arg6;
		@Pc(23) int local23 = arg7 - arg4;
		@Pc(32) int local32 = (arg2 - arg1 << 16) / local18;
		@Pc(40) int local40 = (arg3 - arg0 << 16) / local23;
		@Pc(49) boolean local49;
		if (Static49.anInt1395 > 0 && Static49.anInt1395 % 10 < 5) {
			local49 = true;
		} else {
			local49 = false;
		}
		@Pc(65) int local65;
		@Pc(76) int local76;
		@Pc(96) int local96;
		@Pc(112) int local112;
		@Pc(106) int local106;
		@Pc(155) int local155;
		@Pc(161) int local161;
		for (@Pc(55) int local55 = 0; local55 < local18; local55++) {
			local65 = local32 * (local55 + 1) >> 16;
			@Pc(71) int local71 = local55 * local32 >> 16;
			local76 = local65 - local71;
			if (local76 > 0) {
				@Pc(86) int[][] local86 = Static44.anIntArrayArrayArray6[local55 + arg6 >> 6];
				local71 += arg1;
				for (local96 = 0; local96 < local23; local96++) {
					local106 = (local96 + 1) * local40 >> 16;
					local112 = local96 * local40 >> 16;
					@Pc(117) int local117 = local106 - local112;
					if (local117 > 0) {
						local112 += arg0;
						@Pc(136) int local136 = local96 + arg4 >> 6;
						if (local86[local136] != null) {
							local155 = (local55 + arg6 & 0x3F) + ((local96 + arg4 & 0x3F) << 6);
							local161 = local86[local136][local155];
							if (local161 != 0) {
								@Pc(169) Class2_Sub2_Sub14 local169 = Static168.method2705(local161 - 1);
								if (local49 && Static40.anInt1221 == local169.anInt3065) {
									@Pc(179) Class2_Sub8 local179 = new Class2_Sub8();
									local179.anInt1630 = local71;
									local179.anInt1631 = local169.anInt3065;
									local179.anInt1629 = local112;
									Static41.aClass108_3.method3334(local179);
								}
								Static28.aClass2_Sub2_Sub16_Sub1Array1[local169.anInt3065].method2407(local71 - 7, local112 + -7);
							}
						}
					}
				}
			}
		}
		if (Static54.aDouble1 == Static135.aDouble10) {
			for (@Pc(229) Class2_Sub27 local229 = (Class2_Sub27) Static144.aClass108_11.method3322(); local229 != null; local229 = (Class2_Sub27) Static144.aClass108_11.method3331()) {
				local65 = local229.anInt4750;
				local65 -= Static15.anInt422;
				local76 = local229.anInt4752;
				local76 = Static105.anInt2549 + Static40.anInt1214 - local76;
				@Pc(264) int local264 = arg1 + (arg2 - arg1) * (local65 - arg6) / (arg5 - arg6);
				local96 = (local76 - arg4) * (arg3 - arg0) / (arg7 - arg4) + arg0;
				local112 = local229.anInt4755;
				local106 = 16777215;
				@Pc(288) Class39 local288 = null;
				if (local112 == 0) {
					if (Static54.aDouble1 == 3.0D) {
						local288 = Static11.aClass39_1;
					}
					if (Static54.aDouble1 == 4.0D) {
						local288 = Static104.aClass39_2;
					}
					if (Static54.aDouble1 == 6.0D) {
						local288 = Static209.aClass39_8;
					}
					if (Static54.aDouble1 == 8.0D) {
						local288 = Static173.aClass39_5;
					}
				}
				if (local112 == 1) {
					if (Static54.aDouble1 == 3.0D) {
						local288 = Static209.aClass39_8;
					}
					if (Static54.aDouble1 == 4.0D) {
						local288 = Static173.aClass39_5;
					}
					if (Static54.aDouble1 == 6.0D) {
						local288 = Static150.aClass39_4;
					}
					if (Static54.aDouble1 == 8.0D) {
						local288 = Static149.aClass39_3;
					}
				}
				if (local112 == 2) {
					local106 = 16755200;
					if (Static54.aDouble1 == 3.0D) {
						local288 = Static150.aClass39_4;
					}
					if (Static54.aDouble1 == 4.0D) {
						local288 = Static149.aClass39_3;
					}
					if (Static54.aDouble1 == 6.0D) {
						local288 = Static205.aClass39_7;
					}
					if (Static54.aDouble1 == 8.0D) {
						local288 = Static201.aClass39_6;
					}
				}
				if (local288 != null) {
					@Pc(377) Class41[] local377 = local229.aClass41Array72;
					local155 = local377.length;
					local96 -= local288.method1207() * (local155 - 1) / 2;
					local96 += local288.method1204() / 2;
					for (local161 = 0; local161 < local155; local161++) {
						local288.method1210(local377[local161], local264, local96, local106);
						local96 += local288.method1207();
					}
				}
			}
		}
		for (@Pc(432) Class2_Sub8 local432 = (Class2_Sub8) Static41.aClass108_3.method3322(); local432 != null; local432 = (Class2_Sub8) Static41.aClass108_3.method3331()) {
			Static28.aClass2_Sub2_Sub16_Sub1Array1[local432.anInt1631].method2407(local432.anInt1630 - 7, local432.anInt1629 + -7);
			Static64.method1169(local432.anInt1630, local432.anInt1629, 15, 16776960, 128);
			Static64.method1169(local432.anInt1630, local432.anInt1629, 7, 16777215, 256);
		}
		Static41.aClass108_3.method3328();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZI)V")
	public static void method3078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg4; local3++) {
			Static204.method3147(arg0, arg1, arg2, Static3.anIntArrayArray1[local3]);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZIZIIZIILclient!ia;II)V")
	public static void method3079(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class42 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		if (arg4 && (Static102.aByteArrayArrayArray7[0][arg9][arg8] & 0x2) == 0) {
			if ((Static102.aByteArrayArrayArray7[arg1][arg9][arg8] & 0x10) != 0) {
				return;
			}
			if (Static208.method3216(arg8, arg9, arg1) != Static142.anInt3258) {
				return;
			}
		}
		if (arg1 < Static26.anInt660) {
			Static26.anInt660 = arg1;
		}
		@Pc(64) Class2_Sub2_Sub14 local64 = Static168.method2705(arg5);
		@Pc(77) int local77;
		@Pc(80) int local80;
		if (arg2 == 1 || arg2 == 3) {
			local77 = local64.anInt3050;
			local80 = local64.anInt3040;
		} else {
			local80 = local64.anInt3050;
			local77 = local64.anInt3040;
		}
		@Pc(99) int local99;
		@Pc(107) int local107;
		if (local77 + arg9 <= 104) {
			local99 = (local77 >> 1) + arg9;
			local107 = (local77 + 1 >> 1) + arg9;
		} else {
			local99 = arg9;
			local107 = arg9 + 1;
		}
		@Pc(122) int local122;
		@Pc(126) int local126;
		if (arg8 + local80 > 104) {
			local122 = arg8;
			local126 = arg8 + 1;
		} else {
			local122 = (local80 >> 1) + arg8;
			local126 = arg8 + (local80 + 1 >> 1);
		}
		@Pc(147) int[][] local147 = Static56.anIntArrayArrayArray7[arg6];
		@Pc(155) int local155 = (local77 << 6) + (arg9 << 7);
		@Pc(181) int local181 = local147[local107][local126] + local147[local99][local126] + local147[local107][local122] + local147[local99][local122] >> 2;
		@Pc(189) int local189 = (local80 << 6) + (arg8 << 7);
		@Pc(191) int[][] local191 = null;
		@Pc(208) long local208 = (long) ((arg2 | 0x400) << 20 | arg3 << 14 | arg8 << 7 | arg9);
		if (local64.anInt3077 == 0) {
			local208 |= Long.MIN_VALUE;
		}
		if (arg6 < 3) {
			local191 = Static56.anIntArrayArrayArray7[arg6 + 1];
		}
		if (local64.anInt3042 == 1) {
			local208 |= 0x400000L;
		}
		local208 |= (long) arg5 << 32;
		if (arg0 && local64.method2116()) {
			Static16.method308(arg9, arg1, arg2, arg8, local64);
		}
		@Pc(309) Class12 local309;
		@Pc(306) Class2_Sub2_Sub21 local306;
		if (arg3 == 22) {
			if (!arg4 || local64.anInt3077 != 0 || local64.anInt3067 == 1 || local64.aBoolean174) {
				if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
					local306 = local64.method2119(22, local191, local147, local155, arg0, local189, arg2, local181);
					local309 = local306.aClass12_8;
				} else {
					local309 = new Class12_Sub5(arg5, 22, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
				}
				Static33.method653(arg1, arg9, arg8, local181, local309, local208, local64.aBoolean172);
				if (local64.anInt3067 == 1 && arg7 != null) {
					arg7.method1435(arg8, arg9);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
				local306 = local64.method2119(10, local191, local147, local155, arg0, local189, arg2, local181);
				local309 = local306.aClass12_8;
			} else {
				local309 = new Class12_Sub5(arg5, 10, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
			}
			if (local309 != null) {
				@Pc(416) boolean local416 = Static48.method962(arg1, arg9, arg8, local181, local77, local80, local309, arg3 == 11 ? 256 : 0, local208);
				if (local64.aBoolean168 && local416 && arg0) {
					@Pc(425) int local425 = 15;
					if (local309 instanceof Class12_Sub2) {
						local425 = ((Class12_Sub2) local309).method1861() / 4;
						if (local425 > 30) {
							local425 = 30;
						}
					}
					for (@Pc(443) int local443 = 0; local443 <= local77; local443++) {
						for (@Pc(447) int local447 = 0; local447 <= local80; local447++) {
							if (local425 > Static97.aByteArrayArrayArray6[arg1][arg9 + local443][local447 + arg8]) {
								Static97.aByteArrayArrayArray6[arg1][arg9 + local443][local447 + arg8] = (byte) local425;
							}
						}
					}
				}
			}
			if (local64.anInt3067 != 0 && arg7 != null) {
				arg7.method1433(local77, local80, local64.aBoolean171, arg9, arg8);
			}
		} else if (arg3 >= 12) {
			if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
				local306 = local64.method2119(arg3, local191, local147, local155, arg0, local189, arg2, local181);
				local309 = local306.aClass12_8;
			} else {
				local309 = new Class12_Sub5(arg5, arg3, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
			}
			Static48.method962(arg1, arg9, arg8, local181, 1, 1, local309, 0, local208);
			if (arg0 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
				Static120.anIntArrayArrayArray15[arg1][arg9][arg8] |= 0x924;
			}
			if (local64.anInt3067 != 0 && arg7 != null) {
				arg7.method1433(local77, local80, local64.aBoolean171, arg9, arg8);
			}
		} else if (arg3 == 0) {
			if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
				local306 = local64.method2119(0, local191, local147, local155, arg0, local189, arg2, local181);
				local309 = local306.aClass12_8;
			} else {
				local309 = new Class12_Sub5(arg5, 0, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
			}
			Static96.method1673(arg1, arg9, arg8, local181, local309, null, Static184.anIntArray438[arg2], 0, local208);
			if (arg0) {
				if (arg2 == 0) {
					if (local64.aBoolean168) {
						Static97.aByteArrayArrayArray6[arg1][arg9][arg8] = 50;
						Static97.aByteArrayArrayArray6[arg1][arg9][arg8 + 1] = 50;
					}
					if (local64.aBoolean167) {
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local64.aBoolean168) {
						Static97.aByteArrayArrayArray6[arg1][arg9][arg8 + 1] = 50;
						Static97.aByteArrayArrayArray6[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (local64.aBoolean167) {
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local64.aBoolean168) {
						Static97.aByteArrayArrayArray6[arg1][arg9 + 1][arg8] = 50;
						Static97.aByteArrayArrayArray6[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (local64.aBoolean167) {
						Static120.anIntArrayArrayArray15[arg1][arg9 + 1][arg8] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local64.aBoolean168) {
						Static97.aByteArrayArrayArray6[arg1][arg9][arg8] = 50;
						Static97.aByteArrayArrayArray6[arg1][arg9 + 1][arg8] = 50;
					}
					if (local64.aBoolean167) {
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8] |= 0x492;
					}
				}
			}
			if (local64.anInt3067 != 0 && arg7 != null) {
				arg7.method1434(arg3, arg8, local64.aBoolean171, arg2, arg9);
			}
			if (local64.anInt3058 != 16) {
				Static217.method3294(arg1, arg9, arg8, local64.anInt3058);
			}
		} else if (arg3 == 1) {
			if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
				local306 = local64.method2119(1, local191, local147, local155, arg0, local189, arg2, local181);
				local309 = local306.aClass12_8;
			} else {
				local309 = new Class12_Sub5(arg5, 1, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
			}
			Static96.method1673(arg1, arg9, arg8, local181, local309, null, Static211.anIntArray486[arg2], 0, local208);
			if (local64.aBoolean168 && arg0) {
				if (arg2 == 0) {
					Static97.aByteArrayArrayArray6[arg1][arg9][arg8 + 1] = 50;
				} else if (arg2 == 1) {
					Static97.aByteArrayArrayArray6[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg2 == 2) {
					Static97.aByteArrayArrayArray6[arg1][arg9 + 1][arg8] = 50;
				} else if (arg2 == 3) {
					Static97.aByteArrayArrayArray6[arg1][arg9][arg8] = 50;
				}
			}
			if (local64.anInt3067 != 0 && arg7 != null) {
				arg7.method1434(arg3, arg8, local64.aBoolean171, arg2, arg9);
			}
		} else {
			@Pc(1032) int local1032;
			if (arg3 == 2) {
				local1032 = arg2 + 1 & 0x3;
				@Pc(1072) Class12 local1072;
				@Pc(1057) Class12 local1057;
				if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
					@Pc(1088) Class2_Sub2_Sub21 local1088 = local64.method2119(2, local191, local147, local155, arg0, local189, arg2 + 4, local181);
					local1057 = local1088.aClass12_8;
					@Pc(1103) Class2_Sub2_Sub21 local1103 = local64.method2119(2, local191, local147, local155, arg0, local189, local1032, local181);
					local1072 = local1103.aClass12_8;
				} else {
					local1057 = new Class12_Sub5(arg5, 2, arg2 + 4, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
					local1072 = new Class12_Sub5(arg5, 2, local1032, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
				}
				Static96.method1673(arg1, arg9, arg8, local181, local1057, local1072, Static184.anIntArray438[arg2], Static184.anIntArray438[local1032], local208);
				if (local64.aBoolean167 && arg0) {
					if (arg2 == 0) {
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8] |= 0x249;
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8 + 1] |= 0x492;
					} else if (arg2 == 1) {
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8 + 1] |= 0x492;
						Static120.anIntArrayArrayArray15[arg1][arg9 + 1][arg8] |= 0x249;
					} else if (arg2 == 2) {
						Static120.anIntArrayArrayArray15[arg1][arg9 + 1][arg8] |= 0x249;
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8] |= 0x492;
					} else if (arg2 == 3) {
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8] |= 0x492;
						Static120.anIntArrayArrayArray15[arg1][arg9][arg8] |= 0x249;
					}
				}
				if (local64.anInt3067 != 0 && arg7 != null) {
					arg7.method1434(arg3, arg8, local64.aBoolean171, arg2, arg9);
				}
				if (local64.anInt3058 != 16) {
					Static217.method3294(arg1, arg9, arg8, local64.anInt3058);
				}
			} else if (arg3 == 3) {
				if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
					local306 = local64.method2119(3, local191, local147, local155, arg0, local189, arg2, local181);
					local309 = local306.aClass12_8;
				} else {
					local309 = new Class12_Sub5(arg5, 3, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
				}
				Static96.method1673(arg1, arg9, arg8, local181, local309, null, Static211.anIntArray486[arg2], 0, local208);
				if (local64.aBoolean168 && arg0) {
					if (arg2 == 0) {
						Static97.aByteArrayArrayArray6[arg1][arg9][arg8 + 1] = 50;
					} else if (arg2 == 1) {
						Static97.aByteArrayArrayArray6[arg1][arg9 + 1][arg8 + 1] = 50;
					} else if (arg2 == 2) {
						Static97.aByteArrayArrayArray6[arg1][arg9 + 1][arg8] = 50;
					} else if (arg2 == 3) {
						Static97.aByteArrayArrayArray6[arg1][arg9][arg8] = 50;
					}
				}
				if (local64.anInt3067 != 0 && arg7 != null) {
					arg7.method1434(arg3, arg8, local64.aBoolean171, arg2, arg9);
				}
			} else if (arg3 == 9) {
				if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
					local306 = local64.method2119(arg3, local191, local147, local155, arg0, local189, arg2, local181);
					local309 = local306.aClass12_8;
				} else {
					local309 = new Class12_Sub5(arg5, arg3, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
				}
				Static48.method962(arg1, arg9, arg8, local181, 1, 1, local309, 0, local208);
				if (local64.anInt3067 != 0 && arg7 != null) {
					arg7.method1433(local77, local80, local64.aBoolean171, arg9, arg8);
				}
				if (local64.anInt3058 != 16) {
					Static217.method3294(arg1, arg9, arg8, local64.anInt3058);
				}
			} else if (arg3 == 4) {
				if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
					local306 = local64.method2119(4, local191, local147, local155, arg0, local189, arg2, local181);
					local309 = local306.aClass12_8;
				} else {
					local309 = new Class12_Sub5(arg5, 4, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
				}
				Static201.method3128(arg1, arg9, arg8, local181, local309, null, Static184.anIntArray438[arg2], 0, 0, 0, local208);
			} else {
				@Pc(1617) long local1617;
				@Pc(1655) Class12 local1655;
				@Pc(1669) Class2_Sub2_Sub21 local1669;
				if (arg3 == 5) {
					local1032 = 16;
					local1617 = Static142.method2228(arg1, arg9, arg8);
					if (local1617 != 0L) {
						local1032 = Static168.method2705((int) (local1617 >>> 32) & Integer.MAX_VALUE).anInt3058;
					}
					if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
						local1669 = local64.method2119(4, local191, local147, local155, arg0, local189, arg2, local181);
						local1655 = local1669.aClass12_8;
					} else {
						local1655 = new Class12_Sub5(arg5, 4, arg2, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
					}
					Static201.method3128(arg1, arg9, arg8, local181, local1655, null, Static184.anIntArray438[arg2], 0, local1032 * Static12.anIntArray22[arg2], local1032 * Static75.anIntArray400[arg2], local208);
				} else if (arg3 == 6) {
					local1032 = 8;
					local1617 = Static142.method2228(arg1, arg9, arg8);
					if (local1617 != 0L) {
						local1032 = Static168.method2705(Integer.MAX_VALUE & (int) (local1617 >>> 32)).anInt3058 / 2;
					}
					if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
						local1669 = local64.method2119(4, local191, local147, local155, arg0, local189, arg2 + 4, local181);
						local1655 = local1669.aClass12_8;
					} else {
						local1655 = new Class12_Sub5(arg5, 4, arg2 + 4, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
					}
					Static201.method3128(arg1, arg9, arg8, local181, local1655, null, 256, arg2, Static151.anIntArray350[arg2] * local1032, Static30.anIntArray64[arg2] * local1032, local208);
				} else if (arg3 == 7) {
					@Pc(1795) int local1795 = arg2 + 2 & 0x3;
					if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
						@Pc(1816) Class2_Sub2_Sub21 local1816 = local64.method2119(4, local191, local147, local155, arg0, local189, local1795 + 4, local181);
						local309 = local1816.aClass12_8;
					} else {
						local309 = new Class12_Sub5(arg5, 4, local1795 + 4, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
					}
					Static201.method3128(arg1, arg9, arg8, local181, local309, null, 256, local1795, 0, 0, local208);
				} else if (arg3 == 8) {
					local1032 = 8;
					local1617 = Static142.method2228(arg1, arg9, arg8);
					if (local1617 != 0L) {
						local1032 = Static168.method2705((int) (local1617 >>> 32) & Integer.MAX_VALUE).anInt3058 / 2;
					}
					@Pc(1887) int local1887 = arg2 + 2 & 0x3;
					@Pc(1929) Class12 local1929;
					if (local64.anInt3063 == -1 && local64.anIntArray324 == null) {
						@Pc(1945) Class2_Sub2_Sub21 local1945 = local64.method2119(4, local191, local147, local155, arg0, local189, arg2 + 4, local181);
						local1655 = local1945.aClass12_8;
						@Pc(1962) Class2_Sub2_Sub21 local1962 = local64.method2119(4, local191, local147, local155, arg0, local189, local1887 + 4, local181);
						local1929 = local1962.aClass12_8;
					} else {
						local1655 = new Class12_Sub5(arg5, 4, arg2 + 4, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
						local1929 = new Class12_Sub5(arg5, 4, local1887 + 4, arg6, arg9, arg8, local64.anInt3063, local64.aBoolean175, null);
					}
					Static201.method3128(arg1, arg9, arg8, local181, local1655, local1929, 256, arg2, Static151.anIntArray350[arg2] * local1032, local1032 * Static30.anIntArray64[arg2], local208);
				}
			}
		}
	}
}
