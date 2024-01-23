import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	public static int anInt1679;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "Lclient!ia;")
	public static Class51 aClass51_569 = Static64.method1101("::tele 0)1");

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_570 = Static64.method1101("weiss:");

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Lclient!ia;")
	public static Class51 aClass51_571 = Static64.method1101("mapflag");

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
	public static void method1294() {
		if (Static229.aClass71_31 != null || Static111.aClass71_22 != null) {
			return;
		}
		@Pc(13) int local13 = Static15.anInt371;
		@Pc(28) int local28;
		@Pc(75) int local75;
		if (Static156.aBoolean164) {
			@Pc(26) int local26;
			if (local13 != 1) {
				local26 = Static205.anInt4361;
				local28 = Static15.anInt373;
				if (Static53.anInt1242 - 10 > local26 || Static53.anInt1242 + Static200.anInt4245 + 10 < local26 || local28 < Static72.anInt1644 - 10 || Static184.anInt3998 + Static72.anInt1644 + 10 < local28) {
					Static156.aBoolean164 = false;
					Static221.method3642(Static72.anInt1644, Static200.anInt4245, Static184.anInt3998, Static53.anInt1242);
				}
			}
			if (local13 == 1) {
				local26 = Static53.anInt1242;
				local75 = Static200.anInt4245;
				@Pc(77) int local77 = Static148.anInt3214;
				local28 = Static72.anInt1644;
				@Pc(81) int local81 = Static106.anInt2346;
				@Pc(83) int local83 = -1;
				for (@Pc(85) int local85 = 0; local85 < Static202.anInt4289; local85++) {
					@Pc(101) int local101 = local28 + (-local85 + -1 + Static202.anInt4289) * 15 + 31;
					if (local77 > local26 && local77 < local26 + local75 && local81 > local101 - 13 && local81 < local101 + 3) {
						local83 = local85;
					}
				}
				if (local83 != -1) {
					Static179.method3039(local83);
				}
				Static156.aBoolean164 = false;
				Static221.method3642(Static72.anInt1644, Static200.anInt4245, Static184.anInt3998, Static53.anInt1242);
				return;
			}
			return;
		}
		if (local13 == 1 && Static202.anInt4289 > 0) {
			@Pc(174) short local174 = Static227.aShortArray59[Static202.anInt4289 - 1];
			if (local174 == 38 || local174 == 40 || local174 == 23 || local174 == 57 || local174 == 36 || local174 == 41 || local174 == 29 || local174 == 13 || local174 == 42 || local174 == 17 || local174 == 32 || local174 == 1003) {
				local28 = Static185.anIntArray302[Static202.anInt4289 - 1];
				local75 = Static179.anIntArray299[Static202.anInt4289 - 1];
				@Pc(238) Class71 local238 = Static7.method102(local75);
				if (Static155.method2674(Static33.method587(local238)) || Static119.method3322(Static33.method587(local238))) {
					Static36.aBoolean44 = false;
					Static151.anInt3327 = 0;
					if (Static229.aClass71_31 != null) {
						Static82.method1438(Static229.aClass71_31);
					}
					Static229.aClass71_31 = Static7.method102(local75);
					Static36.anInt866 = Static106.anInt2346;
					Static46.anInt1132 = local28;
					Static169.anInt3805 = Static148.anInt3214;
					Static82.method1438(Static229.aClass71_31);
					return;
				}
			}
		}
		if (local13 == 1 && (Static179.anInt3918 == 1 && Static202.anInt4289 > 2 || Static62.method1084(Static202.anInt4289 - 1))) {
			local13 = 2;
		}
		if (local13 == 1 && Static202.anInt4289 > 0) {
			Static179.method3039(Static202.anInt4289 - 1);
		}
		if (local13 != 2 || Static202.anInt4289 <= 0) {
			return;
		}
		Static58.method1031();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!rd;IIIIIIZ)V")
	public static void method1295(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray294.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray294[local5] - Static155.anInt3423;
			local20 = arg0.anIntArray285[local5] - Static115.anInt2533;
			local27 = arg0.anIntArray280[local5] - Static70.anInt1623;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray282 != null) {
				Static173.anIntArray287[local5] = local37;
				Static173.anIntArray292[local5] = local59;
				Static173.anIntArray289[local5] = local69;
			}
			Static173.anIntArray288[local5] = Static171.anInt3826 + (local37 << 9) / local69;
			Static173.anIntArray286[local5] = Static171.anInt3828 + (local59 << 9) / local69;
		}
		Static171.anInt3830 = 0;
		local3 = arg0.anIntArray291.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray291[local13];
			local27 = arg0.anIntArray293[local13];
			local37 = arg0.anIntArray281[local13];
			@Pc(142) int local142 = Static173.anIntArray288[local20];
			@Pc(146) int local146 = Static173.anIntArray288[local27];
			@Pc(150) int local150 = Static173.anIntArray288[local37];
			@Pc(154) int local154 = Static173.anIntArray286[local20];
			@Pc(158) int local158 = Static173.anIntArray286[local27];
			@Pc(162) int local162 = Static173.anIntArray286[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (aBoolean75 && Static84.method1468(Static166.anInt3727 + Static171.anInt3826, Static88.anInt2019 + Static171.anInt3828, local154, local158, local162, local142, local146, local150)) {
					Static36.anInt872 = arg5;
					Static66.anInt1486 = arg6;
				}
				if (!arg7) {
					Static171.aBoolean179 = false;
					if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static171.anInt3827 || local146 > Static171.anInt3827 || local150 > Static171.anInt3827) {
						Static171.aBoolean179 = true;
					}
					if (arg0.anIntArray282 == null || arg0.anIntArray282[local13] == -1) {
						if (arg0.anIntArray284[local13] != 12345678) {
							Static171.method2959(local154, local158, local162, local142, local146, local150, arg0.anIntArray284[local13], arg0.anIntArray290[local13], arg0.anIntArray283[local13]);
						}
					} else if (!Static103.aBoolean214) {
						@Pc(369) int local369 = Static171.anInterface3_2.method128(arg0.anIntArray282[local13]);
						Static171.method2959(local154, local158, local162, local142, local146, local150, Static21.method465(local369, arg0.anIntArray284[local13]), Static21.method465(local369, arg0.anIntArray290[local13]), Static21.method465(local369, arg0.anIntArray283[local13]));
					} else if (arg0.aBoolean180) {
						Static171.method2962(local154, local158, local162, local142, local146, local150, arg0.anIntArray284[local13], arg0.anIntArray290[local13], arg0.anIntArray283[local13], Static173.anIntArray287[0], Static173.anIntArray287[1], Static173.anIntArray287[3], Static173.anIntArray292[0], Static173.anIntArray292[1], Static173.anIntArray292[3], Static173.anIntArray289[0], Static173.anIntArray289[1], Static173.anIntArray289[3], arg0.anIntArray282[local13]);
					} else {
						Static171.method2962(local154, local158, local162, local142, local146, local150, arg0.anIntArray284[local13], arg0.anIntArray290[local13], arg0.anIntArray283[local13], Static173.anIntArray287[local20], Static173.anIntArray287[local27], Static173.anIntArray287[local37], Static173.anIntArray292[local20], Static173.anIntArray292[local27], Static173.anIntArray292[local37], Static173.anIntArray289[local20], Static173.anIntArray289[local27], Static173.anIntArray289[local37], arg0.anIntArray282[local13]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ad;)V")
	public static void method1297(@OriginalArg(1) Class5_Sub1 arg0) {
		arg0.aBoolean167 = false;
		@Pc(20) Class40 local20;
		if (arg0.anInt3620 != -1) {
			local20 = Static32.method546(arg0.anInt3620);
			if (local20 == null || local20.anIntArray75 == null) {
				arg0.anInt3620 = -1;
			} else {
				arg0.anInt3587++;
				if (arg0.anInt3632 < local20.anIntArray75.length && arg0.anInt3587 > local20.anIntArray76[arg0.anInt3632]) {
					arg0.anInt3587 = 1;
					arg0.anInt3632++;
					Static79.method1375(arg0.anInt3598, arg0 == Static73.aClass5_Sub1_Sub1_1, arg0.anInt3632, local20, arg0.anInt3624);
				}
				if (arg0.anInt3632 >= local20.anIntArray75.length) {
					arg0.anInt3587 = 0;
					arg0.anInt3632 = 0;
					Static79.method1375(arg0.anInt3598, arg0 == Static73.aClass5_Sub1_Sub1_1, arg0.anInt3632, local20, arg0.anInt3624);
				}
			}
		}
		if (arg0.anInt3622 != -1 && Static109.anInt2430 >= arg0.anInt3631) {
			if (arg0.anInt3605 < 0) {
				arg0.anInt3605 = 0;
			}
			@Pc(136) int local136 = Static103.method3801(arg0.anInt3622).anInt4605;
			if (local136 == -1) {
				arg0.anInt3622 = -1;
			} else {
				@Pc(144) Class40 local144 = Static32.method546(local136);
				if (local144 == null || local144.anIntArray75 == null) {
					arg0.anInt3622 = -1;
				} else {
					arg0.anInt3628++;
					if (arg0.anInt3605 < local144.anIntArray75.length && arg0.anInt3628 > local144.anIntArray76[arg0.anInt3605]) {
						arg0.anInt3628 = 1;
						arg0.anInt3605++;
						Static79.method1375(arg0.anInt3598, Static73.aClass5_Sub1_Sub1_1 == arg0, arg0.anInt3605, local144, arg0.anInt3624);
					}
					if (local144.anIntArray75.length <= arg0.anInt3605) {
						arg0.anInt3622 = -1;
					}
				}
			}
		}
		if (arg0.anInt3585 != -1 && arg0.anInt3599 <= 1) {
			local20 = Static32.method546(arg0.anInt3585);
			if (local20.anInt1254 == 1 && arg0.anInt3619 > 0 && Static109.anInt2430 >= arg0.anInt3610 && Static109.anInt2430 > arg0.anInt3578) {
				arg0.anInt3599 = 1;
				return;
			}
		}
		if (arg0.anInt3585 != -1 && arg0.anInt3599 == 0) {
			local20 = Static32.method546(arg0.anInt3585);
			if (local20 == null || local20.anIntArray75 == null) {
				arg0.anInt3585 = -1;
			} else {
				arg0.anInt3595++;
				if (arg0.anInt3576 < local20.anIntArray75.length && arg0.anInt3595 > local20.anIntArray76[arg0.anInt3576]) {
					arg0.anInt3576++;
					arg0.anInt3595 = 1;
					Static79.method1375(arg0.anInt3598, arg0 == Static73.aClass5_Sub1_Sub1_1, arg0.anInt3576, local20, arg0.anInt3624);
				}
				if (local20.anIntArray75.length <= arg0.anInt3576) {
					arg0.anInt3583++;
					arg0.anInt3576 -= local20.anInt1248;
					if (local20.anInt1249 <= arg0.anInt3583) {
						arg0.anInt3585 = -1;
					} else if (arg0.anInt3576 >= 0 && arg0.anInt3576 < local20.anIntArray75.length) {
						Static79.method1375(arg0.anInt3598, Static73.aClass5_Sub1_Sub1_1 == arg0, arg0.anInt3576, local20, arg0.anInt3624);
					} else {
						arg0.anInt3585 = -1;
					}
				}
				arg0.aBoolean167 = local20.aBoolean62;
			}
		}
		if (arg0.anInt3599 > 0) {
			arg0.anInt3599--;
		}
	}
}
