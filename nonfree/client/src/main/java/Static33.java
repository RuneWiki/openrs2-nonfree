import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
	public static int anInt766;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!pe;")
	public static Class65 aClass65_355 = Static119.method1462("Hier wechseln");

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Lclient!pe;")
	private static Class65 aClass65_361 = Static119.method1462("purple:");

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_356 = aClass65_361;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!pe;")
	private static Class65 aClass65_357 = Static119.method1462("World");

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public static final int anInt760 = 0;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	public static int anInt761 = 0;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "Lclient!pe;")
	private static Class65 aClass65_358 = Static119.method1462("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_359 = aClass65_357;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_360 = aClass65_357;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!pe;")
	private static Class65 aClass65_362 = Static119.method1462("Your account has been disabled)3");

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!pe;")
	public static Class65 aClass65_363 = aClass65_361;

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "Lclient!pe;")
	public static Class65 aClass65_364 = aClass65_362;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Lclient!pe;")
	public static Class65 aClass65_365 = Static119.method1462("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "Lclient!pe;")
	public static Class65 aClass65_366 = Static119.method1462(" (X");

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_367 = aClass65_358;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class2_Sub1_Sub8 method625(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub8 local10 = (Class2_Sub1_Sub8) Static3.aClass8_7.method172((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static40.aClass56_15.method1666(arg0, 4);
		local10 = new Class2_Sub1_Sub8();
		if (local20 != null) {
			local10.method1072(new Class2_Sub4(local20), arg0);
		}
		local10.method1069();
		Static3.aClass8_7.method176((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([BIBI)Lclient!pe;")
	public static Class65 method626(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class65 local12 = new Class65();
		local12.aByteArray27 = new byte[arg1];
		local12.anInt2005 = 0;
		for (@Pc(21) int local21 = arg2; local21 < arg2 + arg1; local21++) {
			if (arg0[local21] != 0) {
				local12.aByteArray27[local12.anInt2005++] = arg0[local21];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIBII)V")
	public static void method627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (Static48.aBoolean47 && Static59.anInt1479 != arg4) {
			return;
		}
		@Pc(33) int local33 = 0;
		if (arg6 == 0) {
			local33 = Static124.aClass49_1.method1175(arg4, arg2, arg0);
		}
		if (arg6 == 1) {
			local33 = Static124.aClass49_1.method1152(arg4, arg2, arg0);
		}
		if (arg6 == 2) {
			local33 = Static124.aClass49_1.method1176(arg4, arg2, arg0);
		}
		if (arg6 == 3) {
			local33 = Static124.aClass49_1.method1170(arg4, arg2, arg0);
		}
		@Pc(91) int local91;
		if (local33 != 0) {
			@Pc(84) int local84 = local33 >> 14 & 0x7FFF;
			local91 = Static124.aClass49_1.method1159(arg4, arg2, arg0, local33);
			@Pc(95) int local95 = local91 & 0x1F;
			@Pc(101) int local101 = local91 >> 6 & 0x3;
			@Pc(115) Class2_Sub1_Sub15 local115;
			if (arg6 == 0) {
				Static124.aClass49_1.method1179(arg4, arg2, arg0);
				local115 = Static73.method1248(local84);
				if (local115.anInt2695 != 0) {
					Static90.aClass46Array1[arg4].method1114(arg0, arg2, local101, local115.aBoolean114, local95);
				}
			}
			if (arg6 == 1) {
				Static124.aClass49_1.method1186(arg4, arg2, arg0);
			}
			if (arg6 == 2) {
				Static124.aClass49_1.method1184(arg4, arg2, arg0);
				local115 = Static73.method1248(local84);
				if (arg2 + local115.anInt2671 > 103 || local115.anInt2671 + arg0 > 103 || local115.anInt2689 + arg2 > 103 || arg0 + local115.anInt2689 > 103) {
					return;
				}
				if (local115.anInt2695 != 0) {
					Static90.aClass46Array1[arg4].method1102(arg2, local115.aBoolean114, local115.anInt2671, arg0, local101, local115.anInt2689);
				}
			}
			if (arg6 == 3) {
				Static124.aClass49_1.method1188(arg4, arg2, arg0);
				local115 = Static73.method1248(local84);
				if (local115.anInt2695 == 1) {
					Static90.aClass46Array1[arg4].method1108(arg0, arg2);
				}
			}
		}
		if (arg3 < 0) {
			return;
		}
		local91 = arg4;
		if (arg4 < 3 && (Static88.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) == 2) {
			local91 = arg4 + 1;
		}
		Static95.method1573(arg0, arg1, arg2, Static124.aClass49_1, arg3, arg4, local91, arg5, Static90.aClass46Array1[arg4]);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method628(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static128.aBoolean115) {
			try {
				@Pc(23) Class19 local23 = (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
				local23.method1317(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static128.aBoolean115 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method629() {
		for (@Pc(9) int local9 = 0; local9 < anInt761; local9++) {
			@Pc(14) int local14 = Static68.anIntArray376[local9];
			@Pc(18) Class2_Sub1_Sub1_Sub4_Sub2 local18 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local14];
			@Pc(22) int local22 = Static66.aClass2_Sub4_Sub1_2.method933();
			if ((local22 & 0x80) != 0) {
				local18.aClass2_Sub1_Sub12_1 = Static116.method1856(Static66.aClass2_Sub4_Sub1_2.method927());
				local18.anInt1964 = local18.aClass2_Sub1_Sub12_1.anInt2127;
				local18.anInt1932 = local18.aClass2_Sub1_Sub12_1.anInt2149;
				local18.anInt1929 = local18.aClass2_Sub1_Sub12_1.anInt2142;
				local18.anInt1930 = local18.aClass2_Sub1_Sub12_1.anInt2119;
				local18.anInt1923 = local18.aClass2_Sub1_Sub12_1.anInt2145;
				local18.anInt1959 = local18.aClass2_Sub1_Sub12_1.anInt2147;
				local18.anInt1960 = local18.aClass2_Sub1_Sub12_1.anInt2136;
				local18.anInt1931 = local18.aClass2_Sub1_Sub12_1.anInt2126;
				local18.anInt1917 = local18.aClass2_Sub1_Sub12_1.anInt2125;
			}
			@Pc(89) int local89;
			@Pc(98) int local98;
			if ((local22 & 0x4) != 0) {
				local89 = Static66.aClass2_Sub4_Sub1_2.method919();
				if (local89 == 65535) {
					local89 = -1;
				}
				local98 = Static66.aClass2_Sub4_Sub1_2.method911();
				if (local18.anInt1972 == local89 && local89 != -1) {
					@Pc(152) int local152 = Static23.method1313(local89).anInt168;
					if (local152 == 1) {
						local18.anInt1936 = local98;
						local18.anInt1938 = 0;
						local18.anInt1970 = 0;
						local18.anInt1922 = 0;
					}
					if (local152 == 2) {
						local18.anInt1922 = 0;
					}
				} else if (local89 == -1 || local18.anInt1972 == -1 || Static23.method1313(local89).anInt179 >= Static23.method1313(local18.anInt1972).anInt179) {
					local18.anInt1938 = 0;
					local18.anInt1972 = local89;
					local18.anInt1970 = 0;
					local18.anInt1922 = 0;
					local18.anInt1936 = local98;
					local18.anInt1961 = local18.anInt1935;
				}
			}
			if ((local22 & 0x2) != 0) {
				local89 = Static66.aClass2_Sub4_Sub1_2.method923();
				local98 = Static66.aClass2_Sub4_Sub1_2.method933();
				local18.method1467(local89, Static10.anInt2951, local98);
				local18.anInt1951 = Static10.anInt2951 + 300;
				local18.anInt1940 = Static66.aClass2_Sub4_Sub1_2.method923();
				local18.anInt1968 = Static66.aClass2_Sub4_Sub1_2.method899();
			}
			if ((local22 & 0x20) != 0) {
				local18.aClass65_838 = Static66.aClass2_Sub4_Sub1_2.method931();
				local18.anInt1955 = 100;
			}
			if ((local22 & 0x40) != 0) {
				local89 = Static66.aClass2_Sub4_Sub1_2.method911();
				local98 = Static66.aClass2_Sub4_Sub1_2.method923();
				local18.method1467(local89, Static10.anInt2951, local98);
				local18.anInt1951 = Static10.anInt2951 + 300;
				local18.anInt1940 = Static66.aClass2_Sub4_Sub1_2.method933();
				local18.anInt1968 = Static66.aClass2_Sub4_Sub1_2.method899();
			}
			if ((local22 & 0x10) != 0) {
				local18.anInt1933 = Static66.aClass2_Sub4_Sub1_2.method896();
				local18.anInt1954 = Static66.aClass2_Sub4_Sub1_2.method896();
			}
			if ((local22 & 0x8) != 0) {
				local18.anInt1971 = Static66.aClass2_Sub4_Sub1_2.method896();
				if (local18.anInt1971 == 65535) {
					local18.anInt1971 = -1;
				}
			}
			if ((local22 & 0x1) != 0) {
				local18.anInt1975 = Static66.aClass2_Sub4_Sub1_2.method927();
				local89 = Static66.aClass2_Sub4_Sub1_2.method918();
				local18.anInt1921 = local89 >> 16;
				if (local18.anInt1975 == 65535) {
					local18.anInt1975 = -1;
				}
				local18.anInt1937 = 0;
				local18.anInt1924 = 0;
				local18.anInt1916 = Static10.anInt2951 + (local89 & 0xFFFF);
				if (Static10.anInt2951 < local18.anInt1916) {
					local18.anInt1924 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!na;BI)Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2 method630(@OriginalArg(0) Class56 arg0, @OriginalArg(2) int arg1) {
		return Static114.method1832(arg0, arg1) ? Static63.method1131() : null;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method631() {
		@Pc(5) int local5 = Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2087(Static126.aClass65_1177);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static49.anInt1205; local11++) {
			local19 = Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2087(Static70.method1235(local11));
			if (local5 < local19) {
				local5 = local19;
			}
		}
		Static3.aBoolean5 = true;
		Static15.anInt372 = Static49.anInt1205 * 15 + 22;
		local5 += 8;
		local19 = Static49.anInt1205 * 15 + 21;
		Static45.anInt1093 = local5;
		@Pc(52) int local52 = Static96.anInt2190 - local5 / 2;
		@Pc(54) int local54 = Static100.anInt2282;
		if (local52 + local5 > 765) {
			local52 = 765 - local5;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		if (local54 + local19 > 503) {
			local54 = 503 - local19;
		}
		Static56.anInt1421 = local52;
		if (local54 < 0) {
			local54 = 0;
		}
		Static75.anInt2326 = local54;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method632() {
		Static49.aClass2_Sub4_Sub1_1.method962(45);
		Static49.aClass2_Sub4_Sub1_1.method948(0L);
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method633() {
		aClass65_355 = null;
		aClass65_356 = null;
		aClass65_365 = null;
		aClass65_357 = null;
		aClass65_358 = null;
		aClass65_364 = null;
		aClass65_362 = null;
		aClass65_363 = null;
		aClass65_367 = null;
		aClass65_366 = null;
		aClass65_359 = null;
		aClass65_360 = null;
		aClass65_361 = null;
	}
}
