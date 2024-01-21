import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	public static int anInt1753;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!sb;")
	public static Class25 aClass25_84;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!ad;")
	private static Class4 aClass4_925 = Static75.method1216("flash1:");

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!ad;")
	public static Class4 aClass4_926 = aClass4_925;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!ad;")
	private static Class4 aClass4_927 = Static75.method1216("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!ad;")
	public static Class4 aClass4_928 = aClass4_927;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_929 = Static75.method1216("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[I")
	public static int[] anIntArray235 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	public static int anInt1759 = 0;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_930 = Static75.method1216("Untersuchen");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!aa;ILclient!gb;)V")
	public static void method1178(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(3) Class3_Sub4 arg2) {
		@Pc(9) Class3_Sub5 local9 = new Class3_Sub5();
		local9.anInt1064 = arg2.method446();
		local9.anInt1077 = arg2.method438();
		local9.anIntArray111 = new int[local9.anInt1064];
		local9.aByteArrayArrayArray16 = new byte[local9.anInt1064][][];
		local9.anIntArray113 = new int[local9.anInt1064];
		local9.anIntArray110 = new int[local9.anInt1064];
		local9.aClass42Array1 = new Class42[local9.anInt1064];
		local9.aClass42Array2 = new Class42[local9.anInt1064];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt1064; local51++) {
			try {
				@Pc(57) int local57 = arg2.method446();
				@Pc(87) String local87;
				@Pc(96) String local96;
				@Pc(100) int local100;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local87 = new String(arg2.method417().method156());
					local100 = 0;
					local96 = new String(arg2.method417().method156());
					if (local57 == 1) {
						local100 = arg2.method438();
					}
					local9.anIntArray110[local51] = local57;
					local9.anIntArray113[local51] = local100;
					local9.aClass42Array2[local51] = arg1.method6(local96, Static109.method1884(local87));
				} else if (local57 == 3 || local57 == 4) {
					local87 = new String(arg2.method417().method156());
					local96 = new String(arg2.method417().method156());
					local100 = arg2.method446();
					@Pc(103) String[] local103 = new String[local100];
					for (@Pc(105) int local105 = 0; local105 < local100; local105++) {
						local103[local105] = new String(arg2.method417().method156());
					}
					@Pc(129) byte[][] local129 = new byte[local100][];
					@Pc(140) int local140;
					if (local57 == 3) {
						for (@Pc(134) int local134 = 0; local134 < local100; local134++) {
							local140 = arg2.method438();
							local129[local134] = new byte[local140];
							arg2.method429(local140, local129[local134]);
						}
					}
					@Pc(164) Class[] local164 = new Class[local100];
					local9.anIntArray110[local51] = local57;
					for (local140 = 0; local140 < local100; local140++) {
						local164[local140] = Static109.method1884(local103[local140]);
					}
					local9.aClass42Array1[local51] = arg1.method15(local96, local164, Static109.method1884(local87));
					local9.aByteArrayArrayArray16[local51] = local129;
				}
			} catch (@Pc(254) ClassNotFoundException local254) {
				local9.anIntArray111[local51] = -1;
			} catch (@Pc(261) SecurityException local261) {
				local9.anIntArray111[local51] = -2;
			} catch (@Pc(268) NullPointerException local268) {
				local9.anIntArray111[local51] = -3;
			} catch (@Pc(275) Exception local275) {
				local9.anIntArray111[local51] = -4;
			} catch (@Pc(282) Throwable local282) {
				local9.anIntArray111[local51] = -5;
			}
		}
		Static52.aClass20_5.method304(local9);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I")
	public static int method1179() {
		return Static17.anInt377++;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method1180() {
		Static67.aClass8_22.method198();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ab;Z)V")
	public static void method1181(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		arg0.aBoolean192 = false;
		@Pc(17) Class3_Sub1_Sub6 local17;
		if (arg0.anInt2295 != -1) {
			local17 = Static67.method1107(arg0.anInt2295);
			if (local17 == null || local17.anIntArray220 == null) {
				arg0.anInt2295 = -1;
			} else {
				arg0.anInt2287++;
				if (arg0.anInt2298 < local17.anIntArray220.length && arg0.anInt2287 > local17.anIntArray224[arg0.anInt2298]) {
					arg0.anInt2298++;
					arg0.anInt2287 = 1;
				}
				if (local17.anIntArray220.length <= arg0.anInt2298) {
					arg0.anInt2298 = 0;
					arg0.anInt2287 = 0;
				}
			}
		}
		if (arg0.anInt2335 != -1 && Static60.anInt1489 >= arg0.anInt2340) {
			if (arg0.anInt2338 < 0) {
				arg0.anInt2338 = 0;
			}
			@Pc(100) int local100 = Static47.method827(arg0.anInt2335).anInt2212;
			if (local100 == -1) {
				arg0.anInt2335 = -1;
			} else {
				@Pc(112) Class3_Sub1_Sub6 local112 = Static67.method1107(local100);
				if (local112 == null || local112.anIntArray220 == null) {
					arg0.anInt2335 = -1;
				} else {
					arg0.anInt2309++;
					if (local112.anIntArray220.length > arg0.anInt2338 && arg0.anInt2309 > local112.anIntArray224[arg0.anInt2338]) {
						arg0.anInt2309 = 1;
						arg0.anInt2338++;
					}
					if (arg0.anInt2338 >= local112.anIntArray220.length && (arg0.anInt2338 < 0 || arg0.anInt2338 >= local112.anIntArray220.length)) {
						arg0.anInt2335 = -1;
					}
				}
			}
		}
		if (arg0.anInt2320 != -1 && arg0.anInt2318 <= 1) {
			local17 = Static67.method1107(arg0.anInt2320);
			if (local17.anInt1588 == 1 && arg0.anInt2315 > 0 && Static60.anInt1489 >= arg0.anInt2334 && arg0.anInt2303 < Static60.anInt1489) {
				arg0.anInt2318 = 1;
				return;
			}
		}
		if (arg0.anInt2320 != -1 && arg0.anInt2318 == 0) {
			local17 = Static67.method1107(arg0.anInt2320);
			if (local17 == null || local17.anIntArray220 == null) {
				arg0.anInt2320 = -1;
			} else {
				arg0.anInt2297++;
				if (local17.anIntArray220.length > arg0.anInt2339 && local17.anIntArray224[arg0.anInt2339] < arg0.anInt2297) {
					arg0.anInt2297 = 1;
					arg0.anInt2339++;
				}
				if (arg0.anInt2339 >= local17.anIntArray220.length) {
					arg0.anInt2339 -= local17.anInt1593;
					arg0.anInt2286++;
					if (local17.anInt1587 <= arg0.anInt2286) {
						arg0.anInt2320 = -1;
					}
					if (arg0.anInt2339 < 0 || arg0.anInt2339 >= local17.anIntArray220.length) {
						arg0.anInt2320 = -1;
					}
				}
				arg0.aBoolean192 = local17.aBoolean125;
			}
		}
		if (arg0.anInt2318 > 0) {
			arg0.anInt2318--;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!rd;)Z")
	public static boolean method1182(@OriginalArg(1) int arg0, @OriginalArg(2) Class64 arg1) {
		@Pc(8) byte[] local8 = arg1.method1631(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static113.method1935(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[B)I")
	public static int method1183(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static62.method1079(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Lclient!qe;")
	public static Class3_Sub1_Sub13 method1184(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub13 local12 = (Class3_Sub1_Sub13) Static53.aClass8_29.method195((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static9.aClass64_11.method1625(4, arg0);
		local12 = new Class3_Sub1_Sub13();
		if (local22 != null) {
			local12.method1395(arg0, new Class3_Sub4(local22));
		}
		local12.method1388();
		Static53.aClass8_29.method199((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public static void method1185() {
		for (@Pc(7) int local7 = 0; local7 < Static29.anInt905; local7++) {
			@Pc(13) int local13 = Static24.anIntArray40[local7];
			@Pc(17) Class3_Sub1_Sub1_Sub1_Sub1 local17 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local13];
			if (local17 != null) {
				Static24.method465(local17, local17.aClass3_Sub1_Sub17_1.anInt2516);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method1186(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return Static100.method1650(arg3) ? Static52.method878(-1, 0, 0, arg3, Static104.aClass3_Sub1_Sub14ArrayArray1[arg3], 0, arg0, 0, arg2, arg1) : false;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method1187() {
		aClass4_928 = null;
		aClass4_930 = null;
		anIntArray235 = null;
		aClass4_926 = null;
		aClass4_929 = null;
		aClass4_927 = null;
		aClass4_925 = null;
		aClass25_84 = null;
	}
}
