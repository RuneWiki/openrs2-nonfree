import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
	public static int anInt966;

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_19;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!u;")
	private static Class74 aClass74_693 = Static72.method1077(":  ");

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!u;")
	private static Class74 aClass74_694 = Static72.method1077("Type");

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!u;")
	private static Class74 aClass74_695 = Static72.method1077("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_696 = Static72.method1077("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public static int anInt963 = 0;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public static int anInt964 = 0;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_697 = aClass74_695;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_698 = Static72.method1077("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "[[[Lclient!da;")
	public static Class13[][][] aClass13ArrayArrayArray1 = new Class13[4][104][104];

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	public static int anInt968 = 0;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_699 = aClass74_694;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
	public static int anInt973 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZI)I")
	public static int method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lclient!ve;")
	public static Class2_Sub2_Sub17 method668(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = arg0 >> 16;
		@Pc(12) int local12 = arg0 & 0xFFFF;
		if (Static89.aClass2_Sub2_Sub17ArrayArray1[local8] == null || Static89.aClass2_Sub2_Sub17ArrayArray1[local8][local12] == null) {
			@Pc(30) boolean local30 = Static77.method1209(local8);
			if (!local30) {
				return null;
			}
		}
		return Static89.aClass2_Sub2_Sub17ArrayArray1[local8][local12];
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	public static int method669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	public static void method670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class2_Sub9 local15 = (Class2_Sub9) Static35.aClass13_69.method415(); local15 != null; local15 = (Class2_Sub9) Static35.aClass13_69.method414()) {
			if (local15.anInt1178 != -1 || local15.anIntArray138 != null) {
				@Pc(26) int local26 = 0;
				if (local15.anInt1185 < arg1) {
					local26 = arg1 - local15.anInt1185;
				} else if (local15.anInt1182 > arg1) {
					local26 = local15.anInt1182 - arg1;
				}
				if (arg2 > local15.anInt1184) {
					local26 += arg2 - local15.anInt1184;
				} else if (local15.anInt1186 > arg2) {
					local26 += local15.anInt1186 - arg2;
				}
				if (local26 - 64 > local15.anInt1177 || Static75.anInt1600 == 0 || local15.anInt1176 != arg0) {
					if (local15.aClass2_Sub16_Sub1_3 != null) {
						Static55.aClass2_Sub16_Sub3_2.method1842(local15.aClass2_Sub16_Sub1_3);
						local15.aClass2_Sub16_Sub1_3 = null;
					}
					if (local15.aClass2_Sub16_Sub1_2 != null) {
						Static55.aClass2_Sub16_Sub3_2.method1842(local15.aClass2_Sub16_Sub1_2);
						local15.aClass2_Sub16_Sub1_2 = null;
					}
				} else {
					local26 -= 64;
					if (local26 < 0) {
						local26 = 0;
					}
					@Pc(136) int local136 = (local15.anInt1177 - local26) * Static75.anInt1600 / local15.anInt1177;
					if (local15.aClass2_Sub16_Sub1_3 != null) {
						local15.aClass2_Sub16_Sub1_3.method1172(local136);
					} else if (local15.anInt1178 >= 0) {
						@Pc(157) Class36 local157 = Static131.method880(Static82.aClass26_Sub1_54, local15.anInt1178, 0);
						if (local157 != null) {
							@Pc(164) Class2_Sub14_Sub1 local164 = local157.method882().method993(Static52.aClass33_1);
							@Pc(169) Class2_Sub16_Sub1 local169 = Static134.method1190(local164, local136);
							local169.method1174(-1);
							Static55.aClass2_Sub16_Sub3_2.method1839(local169);
							local15.aClass2_Sub16_Sub1_3 = local169;
						}
					}
					if (local15.aClass2_Sub16_Sub1_2 != null) {
						local15.aClass2_Sub16_Sub1_2.method1172(local136);
						if (!local15.aClass2_Sub16_Sub1_2.method1932()) {
							local15.aClass2_Sub16_Sub1_2 = null;
						}
					} else if (local15.anIntArray138 != null && (local15.anInt1183 -= arg3) <= 0) {
						@Pc(203) int local203 = (int) (Math.random() * (double) local15.anIntArray138.length);
						@Pc(211) Class36 local211 = Static131.method880(Static82.aClass26_Sub1_54, local15.anIntArray138[local203], 0);
						if (local211 != null) {
							@Pc(218) Class2_Sub14_Sub1 local218 = local211.method882().method993(Static52.aClass33_1);
							@Pc(223) Class2_Sub16_Sub1 local223 = Static134.method1190(local218, local136);
							local223.method1174(0);
							Static55.aClass2_Sub16_Sub3_2.method1839(local223);
							local15.aClass2_Sub16_Sub1_2 = local223;
							local15.anInt1183 = (int) ((double) (local15.anInt1173 - local15.anInt1172) * Math.random()) + local15.anInt1172;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method671() {
		if (Static54.anInt1314 == 0) {
			return;
		}
		@Pc(13) Class2_Sub2_Sub1_Sub3 local13 = Static77.aClass2_Sub2_Sub1_Sub3_9;
		@Pc(15) int local15 = 0;
		if (Static54.anInt1332 != 0) {
			local15 = 1;
		}
		for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
			if (Static106.aClass74Array17[local24] != null) {
				@Pc(43) int local43 = Static100.anIntArray314[local24];
				@Pc(47) Class74 local47 = Static20.aClass74Array3[local24];
				@Pc(49) byte local49 = 0;
				if (local47 != null && local47.method1719(Static48.aClass74_838)) {
					local47 = local47.method1697(5);
					local49 = 1;
				}
				if (local47 != null && local47.method1719(Static21.aClass74_474)) {
					local49 = 2;
					local47 = local47.method1697(5);
				}
				@Pc(111) int local111;
				if ((local43 == 3 || local43 == 7) && (local43 == 7 || anInt964 == 0 || anInt964 == 1 && Static7.method1864(local47))) {
					local111 = 329 - local15 * 13;
					local15++;
					local13.method308(Static15.aClass74_408, 4, local111, 0);
					local13.method308(Static15.aClass74_408, 4, local111 - 1, 65535);
					@Pc(132) int local132 = local13.method302(Static15.aClass74_408) + 4;
					local132 += local13.method310(32);
					if (local49 == 1) {
						Static34.aClass2_Sub2_Sub1_Sub1Array2[0].method97(local132, local111 - 12);
						local132 += 14;
					}
					if (local49 == 2) {
						Static34.aClass2_Sub2_Sub1_Sub1Array2[1].method97(local132, local111 - 12);
						local132 += 14;
					}
					local13.method308(Static91.method1340(new Class74[] { local47, Static2.aClass74_31, Static106.aClass74Array17[local24] }), local132, local111, 0);
					local13.method308(Static91.method1340(new Class74[] { local47, Static2.aClass74_31, Static106.aClass74Array17[local24] }), local132, local111 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local43 == 5 && anInt964 < 2) {
					local111 = 329 - local15 * 13;
					local15++;
					local13.method308(Static106.aClass74Array17[local24], 4, local111, 0);
					local13.method308(Static106.aClass74Array17[local24], 4, local111 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local43 == 6 && anInt964 < 2) {
					local111 = 329 - local15 * 13;
					local15++;
					local13.method308(Static91.method1340(new Class74[] { Static68.aClass74_1053, Static1.aClass74_1397, local47, Static2.aClass74_31, Static106.aClass74Array17[local24] }), 4, local111, 0);
					local13.method308(Static91.method1340(new Class74[] { Static68.aClass74_1053, Static1.aClass74_1397, local47, Static2.aClass74_31, Static106.aClass74Array17[local24] }), 4, local111 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method672() {
		if (Static54.anInt1314 == 0) {
			return;
		}
		@Pc(13) int local13 = 0;
		if (Static54.anInt1332 != 0) {
			local13 = 1;
		}
		for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
			if (Static106.aClass74Array17[local20] != null) {
				@Pc(30) int local30 = Static100.anIntArray314[local20];
				@Pc(34) Class74 local34 = Static20.aClass74Array3[local20];
				if (local34 != null && local34.method1719(Static48.aClass74_838)) {
					local34 = local34.method1697(5);
				}
				if (local34 != null && local34.method1719(Static21.aClass74_474)) {
					local34 = local34.method1697(5);
				}
				if ((local30 == 3 || local30 == 7) && (local30 == 7 || anInt964 == 0 || anInt964 == 1 && Static7.method1864(local34))) {
					@Pc(90) int local90 = 329 - local13 * 13;
					if (Static46.anInt1062 > 4 && Static62.anInt1414 - 4 > local90 + -10 && local90 + 3 >= Static62.anInt1414 - 4) {
						@Pc(144) int local144 = Static77.aClass2_Sub2_Sub1_Sub3_9.method302(Static91.method1340(new Class74[] { Static15.aClass74_408, aClass74_693, local34, Static106.aClass74Array17[local20] })) + 25;
						if (local144 > 450) {
							local144 = 450;
						}
						if (local144 + 4 > Static46.anInt1062) {
							if (Static5.anInt64 >= 1) {
								Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local34 }), Static105.aClass74_1484, 0, 2045);
							}
							Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local34 }), Static125.aClass74_1688, 0, 2056);
							Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local34 }), Static67.aClass74_1040, 0, 2013);
						}
					}
					local13++;
					if (local13 >= 5) {
						return;
					}
				}
				if ((local30 == 5 || local30 == 6) && anInt964 < 2) {
					local13++;
					if (local13 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method673() {
		aClass74_697 = null;
		aClass2_Sub2_Sub1_Sub1_19 = null;
		aClass74_696 = null;
		aClass74_698 = null;
		aClass74_694 = null;
		aClass13ArrayArrayArray1 = null;
		aClass74_695 = null;
		aClass74_693 = null;
		aClass74_699 = null;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
	public static void method674(@OriginalArg(0) int arg0) {
		Static88.method1311();
		@Pc(8) int local8 = Static36.method619(arg0).anInt1052;
		if (local8 == 0) {
			return;
		}
		@Pc(23) int local23 = Static88.anIntArray260[arg0];
		if (local8 == 1) {
			if (local23 == 1) {
				Static44.method718(0.9D);
				((Class46) Static44.anInterface2_1).method1062(0.9D);
			}
			if (local23 == 2) {
				Static44.method718(0.8D);
				((Class46) Static44.anInterface2_1).method1062(0.8D);
			}
			if (local23 == 3) {
				Static44.method718(0.7D);
				((Class46) Static44.anInterface2_1).method1062(0.7D);
			}
			if (local23 == 4) {
				Static44.method718(0.6D);
				((Class46) Static44.anInterface2_1).method1062(0.6D);
			}
			Static57.method955();
			Static46.aBoolean43 = true;
		}
		if (local8 == 3) {
			@Pc(79) short local79 = 0;
			if (local23 == 0) {
				local79 = 255;
			}
			if (local23 == 1) {
				local79 = 192;
			}
			if (local23 == 2) {
				local79 = 128;
			}
			if (local23 == 3) {
				local79 = 64;
			}
			if (local23 == 4) {
				local79 = 0;
			}
			if (Static69.anInt1519 != local79) {
				if (Static69.anInt1519 == 0 && Static64.anInt1437 != -1) {
					Static4.method26(0, Static35.aClass26_Sub1_77, Static64.anInt1437, local79);
					Static57.aBoolean52 = false;
				} else if (local79 == 0) {
					Static87.method926();
					Static57.aBoolean52 = false;
				} else {
					Static75.method1101(local79);
				}
				Static69.anInt1519 = local79;
			}
		}
		if (local8 == 4) {
			if (local23 == 0) {
				Static33.anInt827 = 127;
			}
			if (local23 == 1) {
				Static33.anInt827 = 96;
			}
			if (local23 == 2) {
				Static33.anInt827 = 64;
			}
			if (local23 == 3) {
				Static33.anInt827 = 32;
			}
			if (local23 == 4) {
				Static33.anInt827 = 0;
			}
		}
		if (local8 == 9) {
			Static95.anInt2093 = local23;
		}
		if (local8 == 6) {
			Static64.anInt1433 = local23;
		}
		if (local8 == 10) {
			if (local23 == 0) {
				Static75.anInt1600 = 127;
			}
			if (local23 == 1) {
				Static75.anInt1600 = 96;
			}
			if (local23 == 2) {
				Static75.anInt1600 = 64;
			}
			if (local23 == 3) {
				Static75.anInt1600 = 32;
			}
			if (local23 == 4) {
				Static75.anInt1600 = 0;
			}
		}
		if (local8 == 5) {
			Static128.anInt2901 = local23;
		}
		if (local8 == 8) {
			Static54.anInt1314 = local23;
			Static55.aBoolean16 = true;
		}
	}
}
