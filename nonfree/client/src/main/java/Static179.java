import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_111;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "Lclient!q;")
	public static Class80 aClass80_14;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public static int anInt4147 = 0;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	public static int anInt4148 = 0;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_1095 = Static184.method2923("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public static int anInt4149 = 0;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public static int anInt4150 = 0;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
	public static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray21 = new boolean[8];

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
	public static int anInt4160 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static151.anInt3441 + arg0 * Static144.anInt3296 >> 16;
		@Pc(19) int local19 = arg3 * Static144.anInt3296 - arg0 * Static151.anInt3441 >> 16;
		@Pc(29) int local29 = arg1 * Static86.anInt2170 + local19 * Static177.anInt4128 >> 16;
		@Pc(39) int local39 = arg1 * Static177.anInt4128 - local19 * Static86.anInt2170 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static86.anInt2170 + local19 * Static177.anInt4128 >> 16;
		@Pc(76) int local76 = arg2 * Static177.anInt4128 - local19 * Static86.anInt2170 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static132.anInt3021 && local87 < Static132.anInt3021) {
			return false;
		} else if (local50 > Static136.anInt3159 && local87 > Static136.anInt3159) {
			return false;
		} else if (local56 < Static53.anInt1533 && local93 < Static53.anInt1533) {
			return false;
		} else {
			return local56 <= Static192.anInt4375 || local93 <= Static192.anInt4375;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!i;III)V")
	public static void method2860(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class80 local8 = Static34.method675(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray7 != null) {
			@Pc(18) Class2_Sub5 local18 = new Class2_Sub5();
			local18.anInt942 = arg0;
			local18.aClass80_3 = local8;
			local18.anObjectArray3 = local8.anObjectArray7;
			local18.aClass41_265 = arg1;
			Static176.method2835(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt3670 > 0) {
			local36 = Static48.method961(local8);
		}
		if (!local36 || !Static92.method1620(arg0 - 1, Static70.method1287(local8))) {
			return;
		}
		if (arg0 == 1) {
			Static131.aClass2_Sub3_Sub1_2.method221(44);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 2) {
			Static131.aClass2_Sub3_Sub1_2.method221(50);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 3) {
			Static131.aClass2_Sub3_Sub1_2.method221(103);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 4) {
			Static131.aClass2_Sub3_Sub1_2.method221(64);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 5) {
			Static131.aClass2_Sub3_Sub1_2.method221(178);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 6) {
			Static131.aClass2_Sub3_Sub1_2.method221(81);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 7) {
			Static131.aClass2_Sub3_Sub1_2.method221(236);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 8) {
			Static131.aClass2_Sub3_Sub1_2.method221(188);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 9) {
			Static131.aClass2_Sub3_Sub1_2.method221(128);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
		if (arg0 == 10) {
			Static131.aClass2_Sub3_Sub1_2.method221(254);
			Static131.aClass2_Sub3_Sub1_2.method200(arg3);
			Static131.aClass2_Sub3_Sub1_2.method167(arg2);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZI)V")
	public static void method2861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static131.aClass2_Sub3_Sub1_2.method221(95);
		Static131.aClass2_Sub3_Sub1_2.method178(arg1);
		Static131.aClass2_Sub3_Sub1_2.method176(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)Lclient!rc;")
	public static Class2_Sub2_Sub16 method2863() {
		@Pc(9) byte[] local9 = Static102.aByteArrayArray6[0];
		@Pc(17) int local17 = Static89.anIntArray224[0] * Static60.anIntArray498[0];
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			local20[local22] = Static25.anIntArray494[local9[local22] & 0xFF];
		}
		@Pc(61) Class2_Sub2_Sub16_Sub1 local61 = new Class2_Sub2_Sub16_Sub1(Static14.anInt415, Static114.anInt2772, Static219.anIntArray501[0], Static120.anIntArray310[0], Static89.anIntArray224[0], Static60.anIntArray498[0], local20);
		Static212.method3255();
		return local61;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!dj;II)V")
	public static void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		if ((arg0 & 0x4) != 0) {
			arg1.aClass41_1039 = Static204.aClass2_Sub3_Sub1_3.method160();
			if (arg1.aClass41_1039.method1388(0) == 126) {
				arg1.aClass41_1039 = arg1.aClass41_1039.method1424(1);
				Static198.method3075(arg1.aClass41_1039, 2, arg1.aClass41_362);
			} else if (arg1 == Static213.aClass12_Sub3_Sub1_1) {
				Static198.method3075(arg1.aClass41_1039, 2, arg1.aClass41_362);
			}
			arg1.anInt3963 = 0;
			arg1.anInt3914 = 0;
			arg1.anInt3941 = 150;
		}
		if ((arg0 & 0x400) != 0) {
			arg1.anInt3942 = Static204.aClass2_Sub3_Sub1_3.method214();
			arg1.anInt3923 = Static204.aClass2_Sub3_Sub1_3.method157();
			arg1.anInt3929 = Static204.aClass2_Sub3_Sub1_3.method157();
			arg1.anInt3907 = Static204.aClass2_Sub3_Sub1_3.method181();
			arg1.anInt3959 = Static204.aClass2_Sub3_Sub1_3.method205() + Static103.anInt2511;
			arg1.anInt3957 = Static204.aClass2_Sub3_Sub1_3.method205() + Static103.anInt2511;
			arg1.anInt3964 = Static204.aClass2_Sub3_Sub1_3.method181();
			arg1.anInt3962 = 0;
			arg1.anInt3960 = 1;
		}
		if ((arg0 & 0x10) != 0) {
			arg1.anInt3925 = Static204.aClass2_Sub3_Sub1_3.method211();
			arg1.anInt3928 = Static204.aClass2_Sub3_Sub1_3.method164();
		}
		@Pc(141) int local141;
		if ((arg0 & 0x200) != 0) {
			arg1.anInt3911 = Static204.aClass2_Sub3_Sub1_3.method163();
			local141 = Static204.aClass2_Sub3_Sub1_3.method175();
			if (arg1.anInt3911 == 65535) {
				arg1.anInt3911 = -1;
			}
			arg1.anInt3953 = local141 >> 16;
			arg1.anInt3913 = (local141 & 0xFFFF) + Static103.anInt2511;
			arg1.anInt3908 = 0;
			arg1.anInt3948 = 0;
			if (Static103.anInt2511 < arg1.anInt3913) {
				arg1.anInt3908 = -1;
			}
		}
		@Pc(196) int local196;
		if ((arg0 & 0x8) != 0) {
			local141 = Static204.aClass2_Sub3_Sub1_3.method163();
			if (local141 == 65535) {
				local141 = -1;
			}
			local196 = Static204.aClass2_Sub3_Sub1_3.method209();
			Static200.method3113(local141, local196, arg1);
		}
		if ((arg0 & 0x40) != 0) {
			local141 = Static204.aClass2_Sub3_Sub1_3.method209();
			@Pc(212) byte[] local212 = new byte[local141];
			@Pc(217) Class2_Sub3 local217 = new Class2_Sub3(local212);
			Static204.aClass2_Sub3_Sub1_3.method169(local141, local212);
			Static67.aClass2_Sub3Array1[arg2] = local217;
			arg1.method859(local217);
		}
		if ((arg0 & 0x80) != 0) {
			local141 = Static204.aClass2_Sub3_Sub1_3.method214();
			local196 = Static204.aClass2_Sub3_Sub1_3.method209();
			arg1.method2725(Static103.anInt2511, local196, local141);
			arg1.anInt3946 = Static103.anInt2511 + 300;
			arg1.anInt3938 = Static204.aClass2_Sub3_Sub1_3.method157();
		}
		if ((arg0 & 0x100) != 0) {
			local141 = Static204.aClass2_Sub3_Sub1_3.method214();
			local196 = Static204.aClass2_Sub3_Sub1_3.method214();
			arg1.method2725(Static103.anInt2511, local196, local141);
		}
		if ((arg0 & 0x1) != 0) {
			local141 = Static204.aClass2_Sub3_Sub1_3.method211();
			@Pc(307) boolean local307 = (local141 & 0x8000) != 0;
			local196 = Static204.aClass2_Sub3_Sub1_3.method214();
			@Pc(315) int local315 = Static204.aClass2_Sub3_Sub1_3.method209();
			@Pc(318) int local318 = Static204.aClass2_Sub3_Sub1_3.anInt239;
			if (arg1.aClass41_362 != null && arg1.aClass91_1 != null) {
				@Pc(329) long local329 = arg1.aClass41_362.method1419();
				@Pc(331) boolean local331 = false;
				if (local196 <= 1) {
					if (!local307 && (Static211.anInt4700 == 1 || Static158.anInt3725 == 1)) {
						local331 = true;
					} else {
						for (@Pc(352) int local352 = 0; local352 < Static60.anInt4785; local352++) {
							if (Static83.aLongArray6[local352] == local329) {
								local331 = true;
								break;
							}
						}
					}
				}
				if (!local331 && Static31.anInt806 == 0) {
					Static49.aClass2_Sub3_2.anInt239 = 0;
					@Pc(384) int local384 = -1;
					Static204.aClass2_Sub3_Sub1_3.method177(Static49.aClass2_Sub3_2.aByteArray4, local315);
					Static49.aClass2_Sub3_2.anInt239 = 0;
					@Pc(403) Class41 local403;
					if (local307) {
						@Pc(409) Class94 local409 = Static80.method1466(Static49.aClass2_Sub3_2);
						local384 = local409.anInt4376;
						local141 &= 0x7FFF;
						local403 = local409.aClass2_Sub2_Sub20_1.method2894(Static49.aClass2_Sub3_2);
					} else {
						local403 = Static24.method792(Static19.method349(Static49.aClass2_Sub3_2).method1411());
					}
					arg1.aClass41_1039 = local403.method1391();
					arg1.anInt3941 = 150;
					arg1.anInt3914 = local141 >> 8;
					arg1.anInt3963 = local141 & 0xFF;
					if (local196 == 2) {
						Static104.method1777(local403, local384, Static149.method2324(new Class41[] { Static26.aClass41_175, arg1.aClass41_362 }), local307 ? 17 : 1, null);
					} else if (local196 == 1) {
						Static104.method1777(local403, local384, Static149.method2324(new Class41[] { Static149.aClass41_932, arg1.aClass41_362 }), local307 ? 17 : 1, null);
					} else {
						Static104.method1777(local403, local384, arg1.aClass41_362, local307 ? 17 : 2, null);
					}
				}
			}
			Static204.aClass2_Sub3_Sub1_3.anInt239 = local315 + local318;
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		arg1.anInt3943 = Static204.aClass2_Sub3_Sub1_3.method163();
		if (arg1.anInt3943 == 65535) {
			arg1.anInt3943 = -1;
			return;
		}
	}
}
