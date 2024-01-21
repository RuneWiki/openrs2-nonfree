import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "Lclient!pe;")
	public static Class6_Sub6_Sub2 aClass6_Sub6_Sub2_1;

	@OriginalMember(owner = "client!ie", name = "fb", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "Lclient!be;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!ie", name = "jb", descriptor = "Lclient!wa;")
	public static Class6_Sub3_Sub17 aClass6_Sub3_Sub17_4;

	@OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
	public static int anInt1633;

	@OriginalMember(owner = "client!ie", name = "yb", descriptor = "Lclient!ce;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!ie", name = "Eb", descriptor = "Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 aClass6_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lclient!rd;")
	public static Class63 aClass63_861 = Static80.method1463("@cr1@");

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
	public static int anInt1630 = 1;

	@OriginalMember(owner = "client!ie", name = "nb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_862 = Static80.method1463("null");

	@OriginalMember(owner = "client!ie", name = "ub", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!ie", name = "xb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_863 = Static80.method1463("backleft2");

	@OriginalMember(owner = "client!ie", name = "Bb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_864 = Static80.method1463("mapmarker");

	@OriginalMember(owner = "client!ie", name = "Cb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_865 = Static80.method1463("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ie", name = "Db", descriptor = "Lclient!rd;")
	public static Class63 aClass63_866 = Static80.method1463("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!qd;")
	public static RuntimeException_Sub1 method1088(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString4 = local9.aString4 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ge;Lclient!rd;Lclient!rd;)[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] method1089(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(4) int local4 = arg0.method91(arg1);
		@Pc(10) int local10 = arg0.method107(local4, arg2);
		return Static33.method840(arg0, local10, local4);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILclient!p;)V")
	public static void method1090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub3_Sub1_Sub2_Sub2 arg2) {
		if (arg0 == arg2.anInt2307 && arg0 != -1) {
			@Pc(12) int local12 = Static30.method721(arg0).anInt1302;
			if (local12 == 1) {
				arg2.anInt2329 = 0;
				arg2.anInt2292 = 0;
				arg2.anInt2314 = arg1;
				arg2.anInt2325 = 0;
			}
			if (local12 == 2) {
				arg2.anInt2325 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt2307 == -1 || Static30.method721(arg0).anInt1315 >= Static30.method721(arg2.anInt2307).anInt1315) {
			arg2.anInt2299 = arg2.anInt2337;
			arg2.anInt2325 = 0;
			arg2.anInt2292 = 0;
			arg2.anInt2329 = 0;
			arg2.anInt2307 = arg0;
			arg2.anInt2314 = arg1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Z")
	public static boolean method1091(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)I")
	public static int method1092() {
		return Static42.anInt1322++;
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
	public static void method1093() {
		aClass6_Sub3_Sub17_4 = null;
		aClass63_864 = null;
		aClass6_Sub6_Sub2_1 = null;
		aClass63_865 = null;
		aClass63_861 = null;
		aClass11_1 = null;
		Class6_Sub3_Sub9.anIntArray179 = null;
		aClass6_Sub3_Sub3_Sub2_1 = null;
		aClass63_866 = null;
		aClass63_863 = null;
		aClass63_862 = null;
		aLongArray3 = null;
		aClass10_1 = null;
		anIntArray178 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZII)Lclient!rd;")
	public static Class63 method1094(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = 1;
		for (@Pc(19) int local19 = arg0 / 10; local19 != 0; local19 /= 10) {
			local15++;
		}
		@Pc(32) int local32 = local15;
		if (arg0 < 0 || arg1) {
			local32 = local15 + 1;
		}
		@Pc(40) byte[] local40 = new byte[local32];
		if (arg0 < 0) {
			local40[0] = 45;
		} else if (arg1) {
			local40[0] = 43;
		}
		for (@Pc(60) int local60 = 0; local60 < local15; local60++) {
			@Pc(65) int local65 = arg0 % 10;
			arg0 /= 10;
			if (local65 < 0) {
				local65 = -local65;
			}
			if (local65 > 9) {
				local65 += 39;
			}
			local40[local32 - local60 - 1] = (byte) (local65 + 48);
		}
		@Pc(100) Class63 local100 = new Class63();
		local100.aByteArray33 = local40;
		local100.anInt2746 = local32;
		return local100;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLclient!wa;)Z")
	public static boolean method1095(@OriginalArg(1) Class6_Sub3_Sub17 arg0) {
		if (Static66.aBoolean170) {
			if (Static82.method1498(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3284 == 0) {
				return false;
			}
		}
		return arg0.aBoolean182;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)I")
	public static int method1096(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return local10 + arg0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
	public static void method1097() {
		if (Static79.anInt2162 == 0) {
			return;
		}
		@Pc(10) Class6_Sub3_Sub3_Sub1 local10 = Static48.aClass6_Sub3_Sub3_Sub1_2;
		@Pc(12) int local12 = 0;
		if (Static31.anInt1015 != 0) {
			local12 = 1;
		}
		for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
			if (Static106.aClass63Array20[local18] != null) {
				@Pc(28) int local28 = Static100.anIntArray296[local18];
				@Pc(32) Class63 local32 = Static39.aClass63Array9[local18];
				@Pc(34) byte local34 = 0;
				if (local32 != null && local32.method1803(aClass63_861)) {
					local34 = 1;
					local32 = local32.method1806(5);
				}
				if (local32 != null && local32.method1803(Static35.aClass63_627)) {
					local34 = 2;
					local32 = local32.method1806(5);
				}
				@Pc(93) int local93;
				if ((local28 == 3 || local28 == 7) && (local28 == 7 || Static38.anInt1233 == 0 || Static38.anInt1233 == 1 && Static52.method1073(local32))) {
					local93 = 329 - local12 * 13;
					local12++;
					local10.method456(Static33.aClass63_614, 4, local93, 0);
					local10.method456(Static33.aClass63_614, 4, local93 - 1, 65535);
					@Pc(116) int local116 = local10.method450(Static33.aClass63_614) + 4;
					local116 += local10.method442(32);
					if (local34 == 1) {
						Static6.aClass6_Sub3_Sub3_Sub3Array1[0].method1768(local116, local93 - 12);
						local116 += 14;
					}
					if (local34 == 2) {
						Static6.aClass6_Sub3_Sub3_Sub3Array1[1].method1768(local116, local93 - 12);
						local116 += 14;
					}
					local10.method456(Static15.method374(new Class63[] { local32, Static101.aClass63_1528, Static106.aClass63Array20[local18] }), local116, local93, 0);
					local10.method456(Static15.method374(new Class63[] { local32, Static101.aClass63_1528, Static106.aClass63Array20[local18] }), local116, local93 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
				if (local28 == 5 && Static38.anInt1233 < 2) {
					local93 = 329 - local12 * 13;
					local12++;
					local10.method456(Static106.aClass63Array20[local18], 4, local93, 0);
					local10.method456(Static106.aClass63Array20[local18], 4, local93 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
				if (local28 == 6 && Static38.anInt1233 < 2) {
					local93 = 329 - local12 * 13;
					local12++;
					local10.method456(Static15.method374(new Class63[] { Static15.aClass63_330, Static41.aClass63_700, local32, Static101.aClass63_1528, Static106.aClass63Array20[local18] }), 4, local93, 0);
					local10.method456(Static15.method374(new Class63[] { Static15.aClass63_330, Static41.aClass63_700, local32, Static101.aClass63_1528, Static106.aClass63Array20[local18] }), 4, local93 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
			}
		}
	}
}
