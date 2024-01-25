import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
	public static int anInt2156;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
	public static int anInt2157;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_33 = new Class186(49, 6);

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
	public static int anInt2158 = 0;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_34 = new Class186(21, 4);

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[5];

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
	public static int anInt2160 = 0;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "Lclient!jc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ea;IIIIIIIBII)Z")
	public static boolean method1994(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg3 - 64;
		Static159.anIntArrayArray25[64][64] = 99;
		@Pc(29) int local29 = arg2 - 64;
		Static233.anIntArrayArray33[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static238.anIntArray367[0] = arg3;
		@Pc(46) int local46 = local37 + 1;
		Static449.anIntArray635[0] = arg2;
		@Pc(51) int[][] local51 = arg1.anIntArrayArray18;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(66) int local66;
				@Pc(83) int local83;
				@Pc(89) int local89;
				@Pc(237) int local237;
				@Pc(282) int local282;
				do {
					do {
						do {
							label259: do {
								if (local46 == local39) {
									Static211.anInt3670 = local9;
									Static327.anInt5539 = local7;
									return false;
								}
								local7 = Static238.anIntArray367[local39];
								local9 = Static449.anIntArray635[local39];
								local66 = local9 - local29;
								local71 = local7 - local18;
								local39 = local39 + 1 & 0xFFF;
								local83 = local7 - arg1.anInt1585;
								local89 = local9 - arg1.anInt1580;
								if (arg0 == -4) {
									if (arg7 == local7 && arg5 == local9) {
										Static211.anInt3670 = local9;
										Static327.anInt5539 = local7;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static186.method2907(arg4, arg6, local9, arg8, arg7, arg5, local7, arg6)) {
										Static327.anInt5539 = local7;
										Static211.anInt3670 = local9;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg1.method1485(arg8, local7, arg10, local9, arg6, arg7, arg4, arg5, arg6)) {
										Static327.anInt5539 = local7;
										Static211.anInt3670 = local9;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg1.method1489(local7, local9, arg7, arg8, arg10, arg4, arg6, arg5)) {
										Static327.anInt5539 = local7;
										Static211.anInt3670 = local9;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg1.method1492(arg7, local7, arg5, arg9, local9, arg6, arg0)) {
										Static327.anInt5539 = local7;
										Static211.anInt3670 = local9;
										return true;
									}
								} else if (arg1.method1479(arg5, arg9, local9, local7, arg6, arg0, arg7)) {
									Static327.anInt5539 = local7;
									Static211.anInt3670 = local9;
									return true;
								}
								local237 = Static233.anIntArrayArray33[local71][local66] + 1;
								if (local71 > 0 && Static159.anIntArrayArray25[local71 - 1][local66] == 0 && (local51[local83 - 1][local89] & 0x43A40000) == 0 && (local51[local83 - 1][local89 + arg6 - 1] & 0x4E240000) == 0) {
									local282 = 1;
									while (true) {
										if (arg6 - 1 <= local282) {
											Static238.anIntArray367[local46] = local7 - 1;
											Static449.anIntArray635[local46] = local9;
											Static159.anIntArrayArray25[local71 - 1][local66] = 2;
											local46 = local46 + 1 & 0xFFF;
											Static233.anIntArrayArray33[local71 - 1][local66] = local237;
											break;
										}
										if ((local51[local83 - 1][local282 + local89] & 0x4FA40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg6 > local71 && Static159.anIntArrayArray25[local71 + 1][local66] == 0 && (local51[arg6 + local83][local89] & 0x60E40000) == 0 && (local51[local83 + arg6][arg6 + local89 - 1] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6 - 1) {
											Static238.anIntArray367[local46] = local7 + 1;
											Static449.anIntArray635[local46] = local9;
											Static159.anIntArrayArray25[local71 + 1][local66] = 8;
											local46 = local46 + 1 & 0xFFF;
											Static233.anIntArrayArray33[local71 + 1][local66] = local237;
											break;
										}
										if ((local51[local83 + arg6][local89 + local282] & 0x78E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local66 > 0 && Static159.anIntArrayArray25[local71][local66 - 1] == 0 && (local51[local83][local89 - 1] & 0x43A40000) == 0 && (local51[arg6 + local83 - 1][local89 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (arg6 - 1 <= local282) {
											Static238.anIntArray367[local46] = local7;
											Static449.anIntArray635[local46] = local9 - 1;
											Static159.anIntArrayArray25[local71][local66 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static233.anIntArrayArray33[local71][local66 - 1] = local237;
											break;
										}
										if ((local51[local83 + local282][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local66 < 128 - arg6 && Static159.anIntArrayArray25[local71][local66 + 1] == 0 && (local51[local83][arg6 + local89] & 0x4E240000) == 0 && (local51[local83 + arg6 - 1][arg6 + local89] & 0x78240000) == 0) {
									local282 = 1;
									while (true) {
										if (arg6 - 1 <= local282) {
											Static238.anIntArray367[local46] = local7;
											Static449.anIntArray635[local46] = local9 + 1;
											local46 = local46 + 1 & 0xFFF;
											Static159.anIntArrayArray25[local71][local66 + 1] = 4;
											Static233.anIntArrayArray33[local71][local66 + 1] = local237;
											break;
										}
										if ((local51[local83 + local282][arg6 + local89] & 0x7E240000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local71 > 0 && local66 > 0 && Static159.anIntArrayArray25[local71 - 1][local66 - 1] == 0 && (local51[local83 - 1][local89 - 1] & 0x43A40000) == 0) {
									local282 = 1;
									while (true) {
										if (arg6 <= local282) {
											Static238.anIntArray367[local46] = local7 - 1;
											Static449.anIntArray635[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static159.anIntArrayArray25[local71 - 1][local66 - 1] = 3;
											Static233.anIntArrayArray33[local71 - 1][local66 - 1] = local237;
											break;
										}
										if ((local51[local83 - 1][local282 + local89 - 1] & 0x4FA40000) != 0 || (local51[local282 + local83 - 1][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (128 - arg6 > local71 && local66 > 0 && Static159.anIntArrayArray25[local71 + 1][local66 - 1] == 0 && (local51[arg6 + local83][local89 - 1] & 0x60E40000) == 0) {
									local282 = 1;
									while (true) {
										if (local282 >= arg6) {
											Static238.anIntArray367[local46] = local7 + 1;
											Static449.anIntArray635[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static159.anIntArrayArray25[local71 + 1][local66 - 1] = 9;
											Static233.anIntArrayArray33[local71 + 1][local66 - 1] = local237;
											break;
										}
										if ((local51[local83 + arg6][local282 + local89 - 1] & 0x78E40000) != 0 || (local51[local83 + local282][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local282++;
									}
								}
								if (local71 > 0 && 128 - arg6 > local66 && Static159.anIntArrayArray25[local71 - 1][local66 + 1] == 0 && (local51[local83 - 1][local89 + arg6] & 0x4E240000) == 0) {
									for (local282 = 1; local282 < arg6; local282++) {
										if ((local51[local83 - 1][local89 + local282] & 0x4FA40000) != 0 || (local51[local83 + local282 - 1][local89 + arg6] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static238.anIntArray367[local46] = local7 - 1;
									Static449.anIntArray635[local46] = local9 + 1;
									Static159.anIntArrayArray25[local71 - 1][local66 + 1] = 6;
									local46 = local46 + 1 & 0xFFF;
									Static233.anIntArrayArray33[local71 - 1][local66 + 1] = local237;
								}
							} while (128 - arg6 <= local71);
						} while (local66 >= 128 - arg6);
					} while (Static159.anIntArrayArray25[local71 + 1][local66 + 1] != 0);
				} while ((local51[arg6 + local83][arg6 + local89] & 0x78240000) != 0);
				for (local282 = 1; local282 < arg6; local282++) {
					if ((local51[local282 + local83][local89 + arg6] & 0x7E240000) != 0 || (local51[local83 + arg6][local89 + local282] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static238.anIntArray367[local46] = local7 + 1;
				Static449.anIntArray635[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local71 + 1][local66 + 1] = 12;
				Static233.anIntArrayArray33[local71 + 1][local66 + 1] = local237;
			}
		}
	}
}
