import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public static int anInt4594;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_163 = new Class48(30, 8);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIIII)V")
	public static void method4064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static334.anInt5572 = arg3;
		Static360.anInt3947 = arg4;
		Static17.anInt306 = arg0;
		Static354.anInt5768 = arg1;
		Static122.anInt2187 = arg5;
		if (arg2 && Static334.anInt5572 >= 100) {
			Static133.anInt2471 = Static360.anInt3947 * 128 + 64;
			Static256.anInt4409 = Static17.anInt306 * 128 + 64;
			Static337.anInt5598 = Static236.method3260(Static122.anInt2188, Static133.anInt2471, Static256.anInt4409) - Static354.anInt5768;
		}
		Static323.anInt5463 = 2;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ng;Ljava/lang/Object;I)V")
	public static void method4065(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static57.method5056(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method4067(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!tf;IIIIIIIII)Z")
	public static boolean method4068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class222 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg9;
		@Pc(23) int local23 = arg8 - 64;
		@Pc(27) int local27 = arg9 - 64;
		Static364.anIntArrayArray61[64][64] = 99;
		Static324.anIntArrayArray32[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static296.anIntArray604[0] = arg8;
		@Pc(50) int local50 = local41 + 1;
		Static225.anIntArray493[0] = arg9;
		@Pc(55) int[][] local55 = arg2.anIntArrayArray59;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(81) int local81;
				@Pc(87) int local87;
				@Pc(92) int local92;
				@Pc(248) int local248;
				@Pc(290) int local290;
				do {
					do {
						do {
							label259: do {
								if (local43 == local50) {
									Static143.anInt2675 = local7;
									Static92.anInt1673 = local9;
									return false;
								}
								local7 = Static296.anIntArray604[local43];
								local9 = Static225.anIntArray493[local43];
								local70 = local7 - local23;
								local43 = local43 + 1 & 0xFFF;
								local81 = local9 - local27;
								local87 = local7 - arg2.anInt5619;
								local92 = local9 - arg2.anInt5625;
								if (arg7 == -4) {
									if (arg1 == local7 && arg5 == local9) {
										Static92.anInt1673 = local9;
										Static143.anInt2675 = local7;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static318.method4692(arg3, arg4, arg1, arg4, local7, local9, arg5, arg10)) {
										Static143.anInt2675 = local7;
										Static92.anInt1673 = local9;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg2.method4837(arg10, arg4, local7, arg4, local9, arg5, arg0, arg3, arg1)) {
										Static92.anInt1673 = local9;
										Static143.anInt2675 = local7;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg2.method4835(arg10, arg0, arg3, arg1, local7, arg5, local9, arg4)) {
										Static143.anInt2675 = local7;
										Static92.anInt1673 = local9;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg2.method4827(arg1, arg5, arg7, arg6, local9, local7, arg4)) {
										Static143.anInt2675 = local7;
										Static92.anInt1673 = local9;
										return true;
									}
								} else if (arg2.method4822(arg1, arg4, arg7, local9, arg5, local7, arg6)) {
									Static143.anInt2675 = local7;
									Static92.anInt1673 = local9;
									return true;
								}
								local248 = Static324.anIntArrayArray32[local70][local81] + 1;
								if (local70 > 0 && Static364.anIntArrayArray61[local70 - 1][local81] == 0 && (local55[local87 - 1][local92] & 0x43A40000) == 0 && (local55[local87 - 1][arg4 + local92 - 1] & 0x4E240000) == 0) {
									local290 = 1;
									while (true) {
										if (arg4 - 1 <= local290) {
											Static296.anIntArray604[local50] = local7 - 1;
											Static225.anIntArray493[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static364.anIntArrayArray61[local70 - 1][local81] = 2;
											Static324.anIntArrayArray32[local70 - 1][local81] = local248;
											break;
										}
										if ((local55[local87 - 1][local92 + local290] & 0x4FA40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (128 - arg4 > local70 && Static364.anIntArrayArray61[local70 + 1][local81] == 0 && (local55[local87 + arg4][local92] & 0x60E40000) == 0 && (local55[arg4 + local87][local92 + arg4 - 1] & 0x78240000) == 0) {
									local290 = 1;
									while (true) {
										if (local290 >= arg4 - 1) {
											Static296.anIntArray604[local50] = local7 + 1;
											Static225.anIntArray493[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static364.anIntArrayArray61[local70 + 1][local81] = 8;
											Static324.anIntArrayArray32[local70 + 1][local81] = local248;
											break;
										}
										if ((local55[local87 + arg4][local92 + local290] & 0x78E40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local81 > 0 && Static364.anIntArrayArray61[local70][local81 - 1] == 0 && (local55[local87][local92 - 1] & 0x43A40000) == 0 && (local55[arg4 + local87 - 1][local92 - 1] & 0x60E40000) == 0) {
									local290 = 1;
									while (true) {
										if (local290 >= arg4 - 1) {
											Static296.anIntArray604[local50] = local7;
											Static225.anIntArray493[local50] = local9 - 1;
											Static364.anIntArrayArray61[local70][local81 - 1] = 1;
											local50 = local50 + 1 & 0xFFF;
											Static324.anIntArrayArray32[local70][local81 - 1] = local248;
											break;
										}
										if ((local55[local87 + local290][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local81 < 128 - arg4 && Static364.anIntArrayArray61[local70][local81 + 1] == 0 && (local55[local87][arg4 + local92] & 0x4E240000) == 0 && (local55[arg4 + local87 - 1][arg4 + local92] & 0x78240000) == 0) {
									local290 = 1;
									while (true) {
										if (arg4 - 1 <= local290) {
											Static296.anIntArray604[local50] = local7;
											Static225.anIntArray493[local50] = local9 + 1;
											Static364.anIntArrayArray61[local70][local81 + 1] = 4;
											local50 = local50 + 1 & 0xFFF;
											Static324.anIntArrayArray32[local70][local81 + 1] = local248;
											break;
										}
										if ((local55[local87 + local290][local92 + arg4] & 0x7E240000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local70 > 0 && local81 > 0 && Static364.anIntArrayArray61[local70 - 1][local81 - 1] == 0 && (local55[local87 - 1][local92 - 1] & 0x43A40000) == 0) {
									local290 = 1;
									while (true) {
										if (arg4 <= local290) {
											Static296.anIntArray604[local50] = local7 - 1;
											Static225.anIntArray493[local50] = local9 - 1;
											Static364.anIntArrayArray61[local70 - 1][local81 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static324.anIntArrayArray32[local70 - 1][local81 - 1] = local248;
											break;
										}
										if ((local55[local87 - 1][local290 + local92 - 1] & 0x4FA40000) != 0 || (local55[local290 + local87 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local70 < 128 - arg4 && local81 > 0 && Static364.anIntArrayArray61[local70 + 1][local81 - 1] == 0 && (local55[arg4 + local87][local92 - 1] & 0x60E40000) == 0) {
									local290 = 1;
									while (true) {
										if (local290 >= arg4) {
											Static296.anIntArray604[local50] = local7 + 1;
											Static225.anIntArray493[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static364.anIntArrayArray61[local70 + 1][local81 - 1] = 9;
											Static324.anIntArrayArray32[local70 + 1][local81 - 1] = local248;
											break;
										}
										if ((local55[local87 + arg4][local92 + local290 - 1] & 0x78E40000) != 0 || (local55[local87 + local290][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local290++;
									}
								}
								if (local70 > 0 && 128 - arg4 > local81 && Static364.anIntArrayArray61[local70 - 1][local81 + 1] == 0 && (local55[local87 - 1][arg4 + local92] & 0x4E240000) == 0) {
									for (local290 = 1; local290 < arg4; local290++) {
										if ((local55[local87 - 1][local290 + local92] & 0x4FA40000) != 0 || (local55[local87 + local290 - 1][local92 + arg4] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static296.anIntArray604[local50] = local7 - 1;
									Static225.anIntArray493[local50] = local9 + 1;
									local50 = local50 + 1 & 0xFFF;
									Static364.anIntArrayArray61[local70 - 1][local81 + 1] = 6;
									Static324.anIntArrayArray32[local70 - 1][local81 + 1] = local248;
								}
							} while (local70 >= 128 - arg4);
						} while (local81 >= 128 - arg4);
					} while (Static364.anIntArrayArray61[local70 + 1][local81 + 1] != 0);
				} while ((local55[arg4 + local87][arg4 + local92] & 0x78240000) != 0);
				for (local290 = 1; local290 < arg4; local290++) {
					if ((local55[local290 + local87][arg4 + local92] & 0x7E240000) != 0 || (local55[local87 + arg4][local290 + local92] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static296.anIntArray604[local50] = local7 + 1;
				Static225.anIntArray493[local50] = local9 + 1;
				Static364.anIntArrayArray61[local70 + 1][local81 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static324.anIntArrayArray32[local70 + 1][local81 + 1] = local248;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z")
	public static boolean method4069(@OriginalArg(1) int arg0) {
		if (arg0 == 2 || arg0 == 12 || arg0 == 17 || arg0 == 9 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1008;
		}
	}
}
