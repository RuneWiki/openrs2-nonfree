import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public static int anInt70;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!wd;")
	public static Class8_Sub20 aClass8_Sub20_1 = new Class8_Sub20(new byte[5000]);

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	public static int anInt71 = 0;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_30 = Static56.method816("<img=1>");

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "[J")
	public static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!ic;")
	private static Class34 aClass34_31 = Static56.method816("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_32 = Static56.method816(" <col=ffffff>");

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_33 = Static56.method816("white:");

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!ic;")
	public static Class34 aClass34_34 = aClass34_33;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_35 = null;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!ic;")
	public static Class34 aClass34_36 = aClass34_31;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array2 = new Class34[100];

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_37 = aClass34_33;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_38 = Static56.method816("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method34() {
		for (@Pc(14) int local14 = 0; local14 < Static95.anInt2240; local14++) {
			@Pc(20) int local20 = Static3.anIntArray4[local14];
			@Pc(24) Class8_Sub1_Sub1_Sub4_Sub2 local24 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local20];
			@Pc(28) int local28 = Static10.aClass8_Sub20_Sub1_1.method1872();
			if ((local28 & 0x10) != 0) {
				local24.aClass8_Sub1_Sub16_1 = Static18.method308(Static10.aClass8_Sub20_Sub1_1.method1839());
				local24.anInt2054 = local24.aClass8_Sub1_Sub16_1.anInt2458;
				local24.anInt2056 = local24.aClass8_Sub1_Sub16_1.anInt2453;
				local24.anInt2048 = local24.aClass8_Sub1_Sub16_1.anInt2443;
				local24.anInt2031 = local24.aClass8_Sub1_Sub16_1.anInt2430;
				local24.anInt2016 = local24.aClass8_Sub1_Sub16_1.anInt2433;
				local24.anInt2033 = local24.aClass8_Sub1_Sub16_1.anInt2444;
				local24.anInt2063 = local24.aClass8_Sub1_Sub16_1.anInt2438;
				local24.anInt2030 = local24.aClass8_Sub1_Sub16_1.anInt2439;
				local24.anInt2028 = local24.aClass8_Sub1_Sub16_1.anInt2429;
			}
			@Pc(98) int local98;
			@Pc(102) int local102;
			if ((local28 & 0x4) != 0) {
				local98 = Static10.aClass8_Sub20_Sub1_1.method1851();
				local102 = Static10.aClass8_Sub20_Sub1_1.method1848();
				local24.method1227(local102, Static21.anInt655, local98);
				local24.anInt2008 = Static21.anInt655 + 300;
				local24.anInt2018 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local24.anInt2019 = Static10.aClass8_Sub20_Sub1_1.method1848();
			}
			if ((local28 & 0x40) != 0) {
				local24.anInt2029 = Static10.aClass8_Sub20_Sub1_1.method1889();
				if (local24.anInt2029 == 65535) {
					local24.anInt2029 = -1;
				}
			}
			if ((local28 & 0x20) != 0) {
				local24.aClass34_919 = Static10.aClass8_Sub20_Sub1_1.method1892();
				local24.anInt2035 = 100;
			}
			if ((local28 & 0x1) != 0) {
				local24.anInt2053 = Static10.aClass8_Sub20_Sub1_1.method1889();
				local24.anInt2040 = Static10.aClass8_Sub20_Sub1_1.method1889();
			}
			if ((local28 & 0x2) != 0) {
				local98 = Static10.aClass8_Sub20_Sub1_1.method1839();
				local102 = Static10.aClass8_Sub20_Sub1_1.method1877();
				if (local98 == 65535) {
					local98 = -1;
				}
				if (local98 == local24.anInt2009 && local98 != -1) {
					@Pc(248) int local248 = Static47.method733(local98).anInt711;
					if (local248 == 1) {
						local24.anInt2015 = 0;
						local24.anInt2027 = local102;
						local24.anInt2060 = 0;
						local24.anInt2052 = 0;
					}
					if (local248 == 2) {
						local24.anInt2052 = 0;
					}
				} else if (local98 == -1 || local24.anInt2009 == -1 || Static47.method733(local98).anInt723 >= Static47.method733(local24.anInt2009).anInt723) {
					local24.anInt2009 = local98;
					local24.anInt2015 = 0;
					local24.anInt2052 = 0;
					local24.anInt2005 = local24.anInt2032;
					local24.anInt2027 = local102;
					local24.anInt2060 = 0;
				}
			}
			if ((local28 & 0x80) != 0) {
				local98 = Static10.aClass8_Sub20_Sub1_1.method1851();
				local102 = Static10.aClass8_Sub20_Sub1_1.method1848();
				local24.method1227(local102, Static21.anInt655, local98);
				local24.anInt2008 = Static21.anInt655 + 300;
				local24.anInt2018 = Static10.aClass8_Sub20_Sub1_1.method1848();
				local24.anInt2019 = Static10.aClass8_Sub20_Sub1_1.method1851();
			}
			if ((local28 & 0x8) != 0) {
				local24.anInt2006 = Static10.aClass8_Sub20_Sub1_1.method1858();
				local98 = Static10.aClass8_Sub20_Sub1_1.method1853();
				if (local24.anInt2006 == 65535) {
					local24.anInt2006 = -1;
				}
				local24.anInt2055 = Static21.anInt655 + (local98 & 0xFFFF);
				local24.anInt2050 = 0;
				local24.anInt2013 = local98 >> 16;
				local24.anInt2024 = 0;
				if (local24.anInt2055 > Static21.anInt655) {
					local24.anInt2050 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z")
	public static boolean method35(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method36() {
		aClass34_33 = null;
		aClass34_30 = null;
		aLongArray2 = null;
		aClass34_34 = null;
		aClass34_36 = null;
		aClass34_31 = null;
		aClass34_37 = null;
		aClass34Array2 = null;
		aClass34_32 = null;
		aClass34_38 = null;
		aClass34_35 = null;
		aClass8_Sub20_1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
	public static void method37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class8_Sub14 local10 = (Class8_Sub14) Static58.aClass49_7.method1107(); local10 != null; local10 = (Class8_Sub14) Static58.aClass49_7.method1109()) {
			if (local10.anInt1873 != -1 || local10.anIntArray243 != null) {
				@Pc(22) int local22 = 0;
				if (local10.anInt1867 < arg1) {
					local22 = arg1 - local10.anInt1867;
				} else if (arg1 < local10.anInt1880) {
					local22 = local10.anInt1880 - arg1;
				}
				if (local10.anInt1871 < arg2) {
					local22 += arg2 - local10.anInt1871;
				} else if (arg2 < local10.anInt1869) {
					local22 += local10.anInt1869 - arg2;
				}
				if (local22 - 64 > local10.anInt1879 || Static67.anInt1640 == 0 || local10.anInt1868 != arg0) {
					if (local10.aClass8_Sub11_Sub2_1 != null) {
						Static104.aClass8_Sub11_Sub4_1.method1927(local10.aClass8_Sub11_Sub2_1);
						local10.aClass8_Sub11_Sub2_1 = null;
					}
					if (local10.aClass8_Sub11_Sub2_2 != null) {
						Static104.aClass8_Sub11_Sub4_1.method1927(local10.aClass8_Sub11_Sub2_2);
						local10.aClass8_Sub11_Sub2_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(134) int local134 = Static67.anInt1640 * (local10.anInt1879 - local22) / local10.anInt1879;
					if (local10.aClass8_Sub11_Sub2_1 != null) {
						local10.aClass8_Sub11_Sub2_1.method977(local134);
					} else if (local10.anInt1873 >= 0) {
						@Pc(149) Class57 local149 = Static139.method1328(Static94.aClass14_Sub1_17, local10.anInt1873, 0);
						if (local149 != null) {
							@Pc(156) Class8_Sub9_Sub1 local156 = local149.method1329().method1343(Static132.aClass51_2);
							@Pc(161) Class8_Sub11_Sub2 local161 = Static136.method990(local156, local134);
							local161.method984(-1);
							Static104.aClass8_Sub11_Sub4_1.method1922(local161);
							local10.aClass8_Sub11_Sub2_1 = local161;
						}
					}
					if (local10.aClass8_Sub11_Sub2_2 != null) {
						local10.aClass8_Sub11_Sub2_2.method977(local134);
						if (!local10.aClass8_Sub11_Sub2_2.method2011()) {
							local10.aClass8_Sub11_Sub2_2 = null;
						}
					} else if (local10.anIntArray243 != null && (local10.anInt1882 -= arg3) <= 0) {
						@Pc(198) int local198 = (int) (Math.random() * (double) local10.anIntArray243.length);
						@Pc(206) Class57 local206 = Static139.method1328(Static94.aClass14_Sub1_17, local10.anIntArray243[local198], 0);
						if (local206 != null) {
							@Pc(213) Class8_Sub9_Sub1 local213 = local206.method1329().method1343(Static132.aClass51_2);
							@Pc(218) Class8_Sub11_Sub2 local218 = Static136.method990(local213, local134);
							local218.method984(0);
							Static104.aClass8_Sub11_Sub4_1.method1922(local218);
							local10.aClass8_Sub11_Sub2_2 = local218;
							local10.anInt1882 = local10.anInt1875 + (int) ((double) (local10.anInt1866 - local10.anInt1875) * Math.random());
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!wf;)Z")
	public static boolean method38(@OriginalArg(1) Class8_Sub24 arg0) {
		if (Static33.aBoolean42) {
			if (Static99.method1445(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3145 == 0) {
				return false;
			}
		}
		return arg0.aBoolean119;
	}
}
