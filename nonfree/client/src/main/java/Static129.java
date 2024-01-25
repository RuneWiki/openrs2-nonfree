import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "I")
	public static int anInt2807;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "I")
	public static int anInt2809;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_93 = new Class217(99, 8);

	@OriginalMember(owner = "client!i", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public static int anInt2808 = 0;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "I")
	public static int anInt2812 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[[B[[BZ[[BIILclient!ui;Lclient!fp;[[II[[BLclient!ui;)V")
	public static void method2660(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class36 arg6, @OriginalArg(8) Class63 arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class36 arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg5; local7++) {
				if (Static150.method4956() || Static320.method4042(local3, local7, arg9, Static75.anInt3288)) {
					@Pc(27) byte local27 = arg10[local3][local7];
					@Pc(33) byte local33 = arg4[local3][local7];
					@Pc(41) int local41 = arg2[local3][local7] & 0xFF;
					@Pc(49) int local49 = arg1[local3][local7] & 0xFF;
					@Pc(59) Class180 local59 = local41 == 0 ? null : Static201.method3743(local41 - 1);
					@Pc(74) Class189 local74 = local49 == 0 ? null : Static49.method1146(local49 - 1);
					@Pc(76) int local76 = 0;
					@Pc(78) int local78 = 0;
					if (local27 != 0) {
						local78 = local59 == null ? 0 : Static44.anIntArray74[local27];
						local76 = local74 == null ? 0 : Static295.anIntArray441[local27];
					} else if (local59 != null) {
						local78 = Static44.anIntArray74[local27];
					} else if (local74 != null) {
						local76 = Static44.anIntArray74[local27];
					}
					@Pc(120) int local120 = local78 + local76;
					@Pc(122) int local122 = 0;
					if (local120 != 0) {
						@Pc(130) int[] local130 = new int[local120];
						@Pc(133) int[] local133 = new int[local120];
						@Pc(136) int[] local136 = new int[local120];
						@Pc(139) int[] local139 = new int[local120];
						@Pc(141) boolean local141 = false;
						@Pc(159) int local159;
						@Pc(191) int local191;
						if (local59 == null || local59.anInt5293 == -1 && local59.anInt5283 == -1 && local59.anInt5286 == -1) {
							for (local159 = 0; local159 < local78; local159++) {
								local130[local122] = -1;
								local122++;
							}
						} else {
							local159 = arg7.method4598() ? local59.anInt5286 : local59.anInt5289;
							if (!Static239.aBoolean363) {
								local159 = -1;
							}
							for (local191 = 0; local191 < local78; local191++) {
								local136[local122] = local159;
								local139[local122] = local59.anInt5284;
								if (local59.anInt5293 == -1) {
									local130[local122] = -1;
								} else {
									local130[local122] = local59.anInt5293;
								}
								if (local59.anInt5283 == -1) {
									local133[local122] = -1;
								} else {
									local141 = true;
									local133[local122] = local59.anInt5283;
								}
								local122++;
							}
							if (!arg3 && arg9 == 0) {
								Static318.method5490(local3, local7, local59.anInt5294, local59.anInt5285 * 8);
							}
						}
						if (!local141) {
							local133 = null;
						}
						if (local74 == null) {
							for (local159 = 0; local159 < local76; local159++) {
								local130[local122] = -1;
								local122++;
							}
						} else {
							local159 = local74.anInt5576;
							if (!Static239.aBoolean363) {
								local159 = -1;
							}
							for (local191 = 0; local191 < local76; local191++) {
								local136[local122] = local159;
								local139[local122] = local74.anInt5583;
								local130[local122] = arg8[local3][local7];
								if (local133 != null) {
									local133[local122] = -1;
								}
								local122++;
							}
						}
						local159 = Static195.anIntArray302.length;
						@Pc(323) int[] local323 = arg3 ? new int[local159] : null;
						@Pc(326) int[] local326 = new int[local159];
						@Pc(329) int[] local329 = new int[local159];
						@Pc(337) int local337;
						@Pc(341) int local341;
						@Pc(425) int local425;
						@Pc(433) int local433;
						for (@Pc(331) int local331 = 0; local331 < local159; local331++) {
							local337 = Static195.anIntArray302[local331];
							local341 = Static2.anIntArray6[local331];
							if (local33 == 0) {
								local326[local331] = local337;
								local329[local331] = local341;
							} else if (local33 == 1) {
								local326[local331] = local341;
								local329[local331] = 128 - local337;
							} else if (local33 == 2) {
								local326[local331] = 128 - local337;
								local329[local331] = 128 - local341;
							} else if (local33 == 3) {
								local326[local331] = 128 - local341;
								local329[local331] = local337;
							}
							if (arg3 && Static214.aBooleanArrayArray7[local27][local331]) {
								local425 = local326[local331] + (local3 << 7);
								local433 = local329[local331] + (local7 << 7);
								local323[local331] = arg6.method4433(local425, local433) - arg11.method4433(local425, local433);
							}
						}
						local337 = arg11.method4431(local3, local7);
						local341 = arg11.method4431(local3 + 1, local7);
						local425 = arg11.method4431(local3 + 1, local7 + 1);
						local433 = arg11.method4431(local3, local7 + 1);
						if (arg9 > 0) {
							@Pc(489) boolean local489 = true;
							if (local49 == 0 && local27 != 0) {
								local489 = false;
							}
							if (local41 > 0 && local59 != null && !local59.aBoolean402) {
								local489 = false;
							}
							if (local489 && local337 == local341 && local337 == local425 && local337 == local433) {
								Static312.aByteArrayArrayArray9[arg9][local3][local7] = (byte) (Static312.aByteArrayArrayArray9[arg9][local3][local7] | 0x4);
							}
						}
						@Pc(541) int local541 = 0;
						@Pc(543) int local543 = 0;
						if (arg3) {
							local541 = Static60.method1457(local3, local7);
							local543 = Static1.method48(local3, local7);
						}
						arg11.method4440(local3, local7, local326, local323, local329, Static215.anIntArrayArray40[local27], Static289.anIntArrayArray63[local27], Static196.anIntArrayArray34[local27], local130, local133, local136, local139, local541, local543);
						Static85.method1806(arg9, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!kg;I)V")
	public static void method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2) {
		@Pc(8) Class92 local8 = arg2.method3110(Static9.aClass63_1);
		if (local8 == null) {
			return;
		}
		Static9.aClass63_1.method4566(arg1, arg0, arg2.anInt3381 + arg1, arg0 - -arg2.anInt3444);
		if (Static294.anInt5663 < 3) {
			Static66.aClass4_6.method5954((float) arg2.anInt3381 / 2.0F + (float) arg1, (float) arg0 + (float) arg2.anInt3444 / 2.0F, ((int) -Static357.aFloat76 & 0x3FFF) << 2, local8, arg1, arg0);
		} else {
			Static9.aClass63_1.method4594(local8, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZILclient!kg;)V")
	public static void method2662(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class112 arg1) {
		@Pc(16) int local16 = arg1.anInt3374 == 0 ? arg1.anInt3381 : arg1.anInt3374;
		@Pc(28) int local28 = arg1.anInt3427 == 0 ? arg1.anInt3444 : arg1.anInt3427;
		Static279.method4981(Static341.aClass112ArrayArray1[arg1.anInt3376 >> 16], arg1.anInt3376, arg0, local16, local28);
		if (arg1.aClass112Array2 != null) {
			Static279.method4981(arg1.aClass112Array2, arg1.anInt3376, arg0, local16, local28);
		}
		@Pc(61) Class1_Sub15 local61 = (Class1_Sub15) Static281.aClass38_30.method1475((long) arg1.anInt3376);
		if (local61 != null) {
			Static73.method1613(local28, arg0, local61.anInt1496, local16);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method2663(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(112) int local112;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local73 <= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(159) int local159;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local159 = 0; local159 < arg0; local159++) {
				if (local159 >= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(204) int local204;
		for (local159 = arg0 - 1; local159 >= 0; local159--) {
			for (local204 = 0; local204 < arg0; local204++) {
				if (local204 <= local159 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(246) int local246;
		for (local204 = 0; local204 < arg0; local204++) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local204 << 1 <= local246) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(307) int local307;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local307 = arg0 - 1; local307 >= 0; local307--) {
				if (local307 <= local246 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(360) int local360;
		for (local307 = arg0 - 1; local307 >= 0; local307--) {
			for (local360 = arg0 - 1; local360 >= 0; local360--) {
				if (local307 << 1 <= local360) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(408) int local408;
		for (local360 = arg0 - 1; local360 >= 0; local360--) {
			for (local408 = arg0 - 1; local408 >= 0; local408--) {
				if (local408 <= local360 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(457) int local457;
		for (local408 = arg0 - 1; local408 >= 0; local408--) {
			for (local457 = 0; local457 < arg0; local457++) {
				if (local408 << 1 <= local457) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(506) int local506;
		for (local457 = 0; local457 < arg0; local457++) {
			for (local506 = 0; local506 < arg0; local506++) {
				if (local457 >> 1 >= local506) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(547) int local547;
		for (local506 = 0; local506 < arg0; local506++) {
			for (local547 = arg0 - 1; local547 >= 0; local547--) {
				if (local547 >= local506 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(590) int local590;
		for (local547 = arg0 - 1; local547 >= 0; local547--) {
			for (local590 = 0; local590 < arg0; local590++) {
				if (local547 >> 1 <= local590) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(632) int local632;
		for (local590 = 0; local590 < arg0; local590++) {
			for (local632 = 0; local632 < arg0; local632++) {
				if (local632 <= local590 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(681) int local681;
		for (local632 = 0; local632 < arg0; local632++) {
			for (local681 = arg0 - 1; local681 >= 0; local681--) {
				if (local632 >> 1 <= local681) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(734) int local734;
		for (local681 = arg0 - 1; local681 >= 0; local681--) {
			for (local734 = arg0 - 1; local734 >= 0; local734--) {
				if (local734 <= local681 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(782) int local782;
		for (local734 = arg0 - 1; local734 >= 0; local734--) {
			for (local782 = arg0 - 1; local782 >= 0; local782--) {
				if (local734 >> 1 <= local782) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(821) int local821;
		for (local782 = arg0 - 1; local782 >= 0; local782--) {
			for (local821 = 0; local821 < arg0; local821++) {
				if (local782 << 1 >= local821) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(862) int local862;
		for (local821 = 0; local821 < arg0; local821++) {
			for (local862 = 0; local862 < arg0; local862++) {
				if (local821 >> 1 <= local862) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(911) int local911;
		for (local862 = 0; local862 < arg0; local862++) {
			for (local911 = arg0 - 1; local911 >= 0; local911--) {
				if (local862 << 1 >= local911) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(953) int local953;
		for (local911 = 0; local911 < arg0; local911++) {
			for (local953 = 0; local953 < arg0; local953++) {
				if (arg0 / 2 >= local953) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1004) int local1004;
		for (local953 = 0; local953 < arg0; local953++) {
			for (local1004 = 0; local1004 < arg0; local1004++) {
				if (arg0 / 2 >= local953) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1051) int local1051;
		for (local1004 = 0; local1004 < arg0; local1004++) {
			for (local1051 = 0; local1051 < arg0; local1051++) {
				if (arg0 / 2 <= local1051) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1098) int local1098;
		for (local1051 = 0; local1051 < arg0; local1051++) {
			for (local1098 = 0; local1098 < arg0; local1098++) {
				if (arg0 / 2 <= local1051) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1145) int local1145;
		for (local1098 = 0; local1098 < arg0; local1098++) {
			for (local1145 = 0; local1145 < arg0; local1145++) {
				if (local1145 <= local1098 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1197) int local1197;
		for (local1145 = arg0 - 1; local1145 >= 0; local1145--) {
			for (local1197 = 0; local1197 < arg0; local1197++) {
				if (local1145 - arg0 / 2 >= local1197) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1242) int local1242;
		for (local1197 = arg0 - 1; local1197 >= 0; local1197--) {
			for (local1242 = arg0 - 1; local1242 >= 0; local1242--) {
				if (local1242 <= local1197 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1291) int local1291;
		for (local1242 = 0; local1242 < arg0; local1242++) {
			for (local1291 = arg0 - 1; local1291 >= 0; local1291--) {
				if (local1291 <= local1242 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1343) int local1343;
		for (local1291 = 0; local1291 < arg0; local1291++) {
			for (local1343 = 0; local1343 < arg0; local1343++) {
				if (local1343 >= local1291 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1391) int local1391;
		for (local1343 = arg0 - 1; local1343 >= 0; local1343--) {
			for (local1391 = 0; local1391 < arg0; local1391++) {
				if (local1391 >= local1343 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1451) int local1451;
		for (local1391 = arg0 - 1; local1391 >= 0; local1391--) {
			for (local1451 = arg0 - 1; local1451 >= 0; local1451--) {
				if (local1391 - arg0 / 2 <= local1451) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1451 = 0; local1451 < arg0; local1451++) {
			for (@Pc(1499) int local1499 = arg0 - 1; local1499 >= 0; local1499--) {
				if (local1499 >= local1451 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pk;)V")
	public static void method2664(@OriginalArg(0) Class1_Sub5_Sub1 arg0) {
		if (Static92.anInt2063 >= 65535) {
			return;
		}
		Static13.aClass1_Sub5_Sub1Array1[Static92.anInt2063] = arg0;
		Static181.aBooleanArray19[Static92.anInt2063] = false;
		Static92.anInt2063++;
		@Pc(18) int local18 = arg0.anInt4976;
		if (arg0.aBoolean372) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt4976;
		if (arg0.aBoolean371) {
			local26 = Static263.anInt5201 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt4965 + Static145.anInt3090 - arg0.anInt4963 >> Static153.anInt3177;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt4965 + arg0.anInt4963 - Static145.anInt3090 >> Static153.anInt3177;
			if (local66 >= Static354.anInt6714) {
				local66 = Static354.anInt6714 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray89[local38++];
				@Pc(96) int local96 = (arg0.anInt4966 + Static145.anInt3090 - arg0.anInt4963 >> Static153.anInt3177) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static300.anInt5778) {
					local104 = Static300.anInt5778 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static275.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static275.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static92.anInt2063;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static275.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static92.anInt2063 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static275.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static92.anInt2063 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static275.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static92.anInt2063 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIILclient!fp;)V")
	public static void method2665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class63 arg2) {
		Static51.aClass63_2 = arg2;
		Static247.aClass54ArrayArray1 = new Class54[arg1][arg0];
		if (Static17.anIntArray168 != null) {
			Static345.aClass13_4 = Static334.method5891(Static17.anIntArray168[1], Static17.anIntArray168[0], Static17.anIntArray168[5], Static17.anIntArray168[3], Static17.anIntArray168[2], Static17.anIntArray168[4]);
		}
		Static346.aClass54_1 = new Class54();
		Static102.method6043();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method2666() {
		Static176.aClass21_170.method857();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)V")
	public static void method2668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg0, 16);
		local13.method3480();
		local13.anInt3727 = arg1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method2669() {
		Static195.aClass30_57.anInt1229 = 1;
		Static48.aClient2.method1049();
		Static177.aBoolean275 = true;
		Static22.aBoolean498 = true;
		Static261.method4786();
		Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
		Static166.anInt3465 = 0;
		Static293.aClass217_165 = null;
		Static206.aClass217_177 = null;
		Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
		Static16.anInt401 = 0;
		Static197.aClass217_134 = null;
		Static341.aClass217_202 = null;
		Static133.anInt2883 = 0;
		for (@Pc(4381) int local4381 = 0; local4381 < Static60.aClass101Array1.length; local4381++) {
			Static60.aClass101Array1[local4381] = null;
		}
		for (@Pc(4400) int local4400 = 0; local4400 < 100; local4400++) {
			Static275.aStringArray30[local4400] = null;
		}
		Static255.anInt5175 = (int) (Math.random() * 100.0D) - 50;
		Static163.anInt3359 = (int) (Math.random() * 120.0D) - 60;
		Static93.anInt5010 = 0;
		Static38.anInt944 = (int) (Math.random() * 80.0D) - 40;
		Static315.anInt5994 = (int) (Math.random() * 110.0D) - 55;
		Static77.aBoolean119 = false;
		Static357.aFloat76 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static116.anInt2537 = 0;
		Static293.anInt4951 = (int) (Math.random() * 30.0D) - 20;
		Static217.method4011();
		for (@Pc(4465) int local4465 = 0; local4465 < 2048; local4465++) {
			Static275.aClass11_Sub2_Sub6_Sub1Array1[local4465] = null;
		}
		Static277.anInt5394 = 0;
		for (@Pc(4479) int local4479 = 0; local4479 < 32768; local4479++) {
			Static231.aClass11_Sub2_Sub6_Sub2Array1[local4479] = null;
		}
		Static356.aClass42_46.method1542();
		Static42.aClass42_3.method1542();
		Static299.aClass195_8.method5297();
		Static46.aClass38_4.method1466();
		Static75.aClass42_19 = new Class42();
		Static67.anInt1589 = 0;
		Static195.anInt3948 = 0;
		Static17.method2105();
		Static329.method5547();
		Static363.anInt6978 = 0;
		Static101.anInt2315 = 0;
		Static12.anInt292 = 0;
		Static144.anInt3083 = 0;
		Static116.anInt2536 = 0;
		anInt2807 = 0;
		Static301.anInt5792 = 0;
		Static319.anInt6112 = 0;
		Static133.anInt2876 = 0;
		Static31.anInt789 = 0;
		for (@Pc(4535) int local4535 = 0; local4535 < Static7.anIntArray24.length; local4535++) {
			if (!Static237.aBooleanArray11[local4535]) {
				Static7.anIntArray24[local4535] = -1;
			}
		}
		if (Static336.anInt6389 != -1) {
			Static181.method3455(Static336.anInt6389);
		}
		for (@Pc(4565) Class1_Sub15 local4565 = (Class1_Sub15) Static281.aClass38_30.method1474(); local4565 != null; local4565 = (Class1_Sub15) Static281.aClass38_30.method1470()) {
			if (!local4565.method6047()) {
				local4565 = (Class1_Sub15) Static281.aClass38_30.method1474();
				if (local4565 == null) {
					break;
				}
			}
			Static15.method343(false, true, local4565);
		}
		Static336.anInt6389 = -1;
		Static281.aClass38_30 = new Class38(8);
		Static46.method1123();
		Static323.aClass112_13 = null;
		for (@Pc(4605) int local4605 = 0; local4605 < 8; local4605++) {
			Static19.aStringArray2[local4605] = null;
			Static135.aBooleanArray15[local4605] = false;
			Static182.anIntArray283[local4605] = -1;
		}
		Static177.method3441();
		Static248.aBoolean378 = true;
		for (@Pc(4629) int local4629 = 0; local4629 < 100; local4629++) {
			Static207.aBooleanArray21[local4629] = true;
		}
		Static365.aClass126Array1 = null;
		Static135.anInt2903 = 0;
		Static223.aString44 = null;
		for (@Pc(4649) int local4649 = 0; local4649 < 6; local4649++) {
			Static277.aClass104Array1[local4649] = new Class104();
		}
		for (@Pc(4663) int local4663 = 0; local4663 < 25; local4663++) {
			Static25.anIntArray81[local4663] = 0;
			Static225.anIntArray372[local4663] = 0;
			Static21.anIntArray39[local4663] = 0;
		}
		Static119.method2539();
		Static195.aBoolean294 = true;
		Static218.aShortArray87 = Static149.aShortArray64 = Static65.aShortArray99 = Static27.aShortArray15 = new short[256];
		Static325.aString48 = Static166.aClass106_121.method2927(Static254.anInt5172);
		Static235.anInt4759 = 0;
		Static180.aBoolean277 = false;
		Static31.method821();
		Static330.method5563();
		Static195.aClass30_57.anInt1229 = 2;
		Static153.aLong113 = 0L;
		Static285.aClass1_Sub12_2 = null;
	}
}
