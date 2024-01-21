import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!sd;")
	public static Class2 aClass2_26;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_18;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_19;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1334 = Static56.method972("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1335 = Static56.method972("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1336 = Static56.method972("Schlie-8en");

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1337 = Static56.method972("null");

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1338 = Static56.method972("Duell akzeptieren");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1339 = Static56.method972("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJ)V")
	public static void method1938(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static5.anInt346 >= 100 && Static105.anInt2692 != 1 || Static5.anInt346 >= 200) {
			Static64.method1084(Static110.aClass5_1307, Static1.aClass5_3, 0);
			return;
		}
		@Pc(33) Class5 local33 = Static82.method1301(arg0).method147();
		for (@Pc(35) int local35 = 0; local35 < Static5.anInt346; local35++) {
			if (Static94.aLongArray2[local35] == arg0) {
				Static64.method1084(Static110.aClass5_1307, Static75.method1261(new Class5[] { local33, Static101.aClass5_1152 }), 0);
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static17.anInt616; local72++) {
			if (arg0 == Static56.aLongArray4[local72]) {
				Static64.method1084(Static110.aClass5_1307, Static75.method1261(new Class5[] { Static89.aClass5_1035, local33, Static60.aClass5_1357 }), 0);
				return;
			}
		}
		if (local33.method163(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass5_765)) {
			return;
		}
		Static34.aClass5Array8[Static5.anInt346] = local33;
		Static94.aLongArray2[Static5.anInt346] = arg0;
		Static57.anIntArray183[Static5.anInt346] = 0;
		Static5.anInt346++;
		Static116.aBoolean157 = true;
		Static95.aClass3_Sub6_Sub1_3.method1645(90);
		Static95.aClass3_Sub6_Sub1_3.method1606(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
	public static void method1939(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static36.aBooleanArray21[arg0]) {
			return;
		}
		Static101.aClass11_64.method1870(arg0);
		if (Static31.aClass3_Sub1_Sub17ArrayArray3[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static31.aClass3_Sub1_Sub17ArrayArray3[arg0].length; local28++) {
			if (Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local28] != null) {
				if (Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local28].anInt2658 == 2) {
					local26 = false;
				} else {
					Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static31.aClass3_Sub1_Sub17ArrayArray3[arg0] = null;
		}
		Static36.aBooleanArray21[arg0] = false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!m;Lclient!ae;I)I")
	public static int method1940(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(2) int local2 = arg0.anInt2416;
		arg0.method1633(arg1.anInt311);
		arg0.anInt2416 += Static35.aClass43_1.method1068(arg1.aByteArray1, 0, arg1.anInt311, arg0.anInt2416, arg0.aByteArray17);
		return arg0.anInt2416 - local2;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method1941() {
		aClass5_1339 = null;
		aClass3_Sub1_Sub2_Sub4_19 = null;
		aClass5_1336 = null;
		aClass5_1335 = null;
		aClass5_1334 = null;
		aClass5_1338 = null;
		aClass2_26 = null;
		aClass3_Sub1_Sub2_Sub4_18 = null;
		aClass5_1337 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!te;)I")
	public static int method1942(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub17 arg1) {
		if (arg1.anIntArrayArray20 == null || arg0 >= arg1.anIntArrayArray20.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray20[arg0];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local22++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local24;
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 1) {
					local38 = Static47.anIntArray150[local20[local22++]];
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 2) {
					local38 = Static103.anIntArray313[local20[local22++]];
				}
				if (local36 == 3) {
					local38 = Static116.anIntArray384[local20[local22++]];
				}
				@Pc(107) int local107;
				@Pc(118) Class3_Sub1_Sub17 local118;
				@Pc(123) int local123;
				@Pc(135) int local135;
				if (local36 == 4) {
					local107 = local20[local22++] << 16;
					@Pc(114) int local114 = local107 + local20[local22++];
					local118 = Static58.method1009(local114);
					local123 = local20[local22++];
					if (local123 != -1 && (!Static37.method694(local123).aBoolean30 || Static23.aBoolean34)) {
						for (local135 = 0; local135 < local118.anIntArray309.length; local135++) {
							if (local118.anIntArray309[local135] == local123 + 1) {
								local38 += local118.anIntArray308[local135];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static110.anIntArray373[local20[local22++]];
				}
				if (local36 == 6) {
					local38 = Class55.anIntArray265[Static103.anIntArray313[local20[local22++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static110.anIntArray373[local20[local22++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1581;
				}
				if (local36 == 9) {
					for (local107 = 0; local107 < 25; local107++) {
						if (Static84.aBooleanArray16[local107]) {
							local38 += Static103.anIntArray313[local107];
						}
					}
				}
				if (local36 == 10) {
					local107 = local20[local22++] << 16;
					local107 += local20[local22++];
					local118 = Static58.method1009(local107);
					local123 = local20[local22++];
					if (local123 != -1 && (!Static37.method694(local123).aBoolean30 || Static23.aBoolean34)) {
						for (local135 = 0; local135 < local118.anIntArray309.length; local135++) {
							if (local118.anIntArray309[local135] == local123 + 1) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static78.anInt1954;
				}
				if (local36 == 12) {
					local38 = Static50.anInt1360;
				}
				if (local36 == 13) {
					local107 = Static110.anIntArray373[local20[local22++]];
					@Pc(326) int local326 = local20[local22++];
					local38 = (local107 & 0x1 << local326) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local107 = local20[local22++];
					local38 = Static73.method1216(local107);
				}
				if (local36 == 18) {
					local38 = Static109.anInt2875 + (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 >> 7);
				}
				if (local36 == 19) {
					local38 = (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 >> 7) + Static52.anInt1378;
				}
				if (local36 == 20) {
					local38 = local20[local22++];
				}
				if (local40 == 0) {
					if (local26 == 0) {
						local24 += local38;
					}
					if (local26 == 1) {
						local24 -= local38;
					}
					if (local26 == 2 && local38 != 0) {
						local24 /= local38;
					}
					if (local26 == 3) {
						local24 *= local38;
					}
					local26 = 0;
				} else {
					local26 = local40;
				}
			}
		} catch (@Pc(428) Exception local428) {
			return -1;
		}
	}
}
