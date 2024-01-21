import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_10;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public static int anInt2272;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_688 = Static170.method3101("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Lclient!eh;")
	private static Class28 aClass28_690 = Static170.method3101("Loading textures )2 ");

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_689 = aClass28_690;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
	public static void method1732(@OriginalArg(0) boolean arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static69.anInt2115; local13++) {
			@Pc(23) long local23 = (long) Static117.anIntArray523[local13] << 32 | 0x20000000L;
			@Pc(29) Class3_Sub2_Sub1_Sub2_Sub2 local29 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[Static117.anIntArray523[local13]];
			if (local29 != null && local29.method1436() && arg0 == local29.aClass3_Sub2_Sub7_1.aBoolean71 && local29.aClass3_Sub2_Sub7_1.method1114()) {
				@Pc(54) int local54 = local29.anInt1800 >> 7;
				@Pc(59) int local59 = local29.anInt1792 >> 7;
				if (local54 >= 0 && local54 < 104 && local59 >= 0 && local59 < 104) {
					if (local29.anInt1787 == 1 && (local29.anInt1800 & 0x7F) == 64 && (local29.anInt1792 & 0x7F) == 64) {
						if (Static112.anIntArrayArray24[local54][local59] == Static44.anInt3939) {
							continue;
						}
						Static112.anIntArrayArray24[local54][local59] = Static44.anInt3939;
					}
					if (!local29.aClass3_Sub2_Sub7_1.aBoolean69) {
						local23 |= Long.MIN_VALUE;
					}
					local29.anInt1809 = Static33.method848((local29.anInt1787 - 1) * 64 + local29.anInt1800, Static171.anInt4109, local29.anInt1792 + local29.anInt1787 * 64 - 64);
					Static63.method1494(Static171.anInt4109, local29.anInt1800, local29.anInt1792, local29.anInt1809, (local29.anInt1787 - 1) * 64 + 60, local29, local29.anInt1795, local23, local29.aBoolean100);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!gf;I)Lclient!gf;")
	public static Class33 method1733(@OriginalArg(0) Class33 arg0) {
		@Pc(7) Class33 local7 = Static96.method3164(arg0);
		if (local7 == null) {
			local7 = arg0.aClass33_7;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!eh;Lclient!eh;Lclient!ah;I)[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] method1734(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(8) int local8 = arg2.method1029(arg1);
		@Pc(14) int local14 = arg2.method1031(arg0, local8);
		return Static94.method2077(arg2, local8, local14);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V")
	public static void method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class55 local13 = local7.aClass55_1;
		if (local13 != null) {
			local13.anInt2659 = local13.anInt2659 * arg3 / 16;
			local13.anInt2662 = local13.anInt2662 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lclient!i;")
	public static Class3_Sub2_Sub10 method1736(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub2_Sub10 local6 = (Class3_Sub2_Sub10) Static175.aClass63_30.method2337((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static11.aClass7_7.method1021(10, arg0);
		local6 = new Class3_Sub2_Sub10();
		local6.anInt1869 = arg0;
		if (local28 != null) {
			local6.method1458(new Class3_Sub8(local28));
		}
		local6.method1454();
		if (local6.anInt1890 != -1) {
			local6.method1462(method1736(local6.anInt1887), method1736(local6.anInt1890));
		}
		if (!Static9.aBoolean19 && local6.aBoolean103) {
			local6.aClass28Array10 = null;
			local6.aClass28_566 = Static140.aClass28_1181;
			local6.aClass28Array11 = null;
			local6.anInt1888 = 0;
			local6.aBoolean104 = false;
		}
		Static175.aClass63_30.method2338((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1737() {
		try {
			if (Static8.anInt1209 == 1) {
				@Pc(17) int local17 = Static156.aClass3_Sub3_Sub2_2.method1923();
				if (local17 > 0 && Static156.aClass3_Sub3_Sub2_2.method1908()) {
					local17 -= Static128.anInt3266;
					if (local17 < 0) {
						local17 = 0;
					}
					Static156.aClass3_Sub3_Sub2_2.method1898(local17);
				} else {
					Static156.aClass3_Sub3_Sub2_2.method1930();
					Static156.aClass3_Sub3_Sub2_2.method1905();
					Static24.aClass66_1 = null;
					if (Static75.aClass7_32 == null) {
						Static8.anInt1209 = 0;
					} else {
						Static8.anInt1209 = 2;
					}
					Static179.aClass3_Sub9_1 = null;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static156.aClass3_Sub3_Sub2_2.method1930();
			Static75.aClass7_32 = null;
			Static24.aClass66_1 = null;
			Static8.anInt1209 = 0;
			Static179.aClass3_Sub9_1 = null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method1738(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static31.anInt969 > 0) {
			local21 = Static17.aByteArrayArray18[--Static31.anInt969];
			Static17.aByteArrayArray18[Static31.anInt969] = null;
			return local21;
		} else if (arg0 == 5000 && Static5.anInt136 > 0) {
			local21 = Static96.aByteArrayArray112[--Static5.anInt136];
			Static96.aByteArrayArray112[Static5.anInt136] = null;
			return local21;
		} else if (arg0 == 30000 && Static180.anInt4279 > 0) {
			local21 = Static101.aByteArrayArray70[--Static180.anInt4279];
			Static101.aByteArrayArray70[Static180.anInt4279] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method1739() {
		aClass28_690 = null;
		aClass7_Sub1_10 = null;
		aClass28_689 = null;
		aClass28_688 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!db;B)V")
	public static void method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub2_Sub1_Sub2_Sub1 arg2) {
		if (arg0 == arg2.anInt1833 && arg0 != -1) {
			@Pc(66) int local66 = Static21.method594(arg0).anInt549;
			if (local66 == 1) {
				arg2.anInt1837 = 0;
				arg2.anInt1799 = 0;
				arg2.anInt1832 = arg1;
				arg2.anInt1813 = 0;
			}
			if (local66 == 2) {
				arg2.anInt1837 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt1833 == -1 || Static21.method594(arg0).anInt535 >= Static21.method594(arg2.anInt1833).anInt535) {
			arg2.anInt1808 = arg2.anInt1783;
			arg2.anInt1813 = 0;
			arg2.anInt1832 = arg1;
			arg2.anInt1833 = arg0;
			arg2.anInt1799 = 0;
			arg2.anInt1837 = 0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method1741() {
		if (!Static67.aBoolean109) {
			return;
		}
		@Pc(11) Class33 local11 = Static27.method739(Static38.anInt1094, Static176.anInt4193);
		if (local11 != null && local11.anObjectArray17 != null) {
			@Pc(20) Class3_Sub6 local20 = new Class3_Sub6();
			local20.aClass33_3 = local11;
			local20.anObjectArray2 = local11.anObjectArray17;
			Static163.method3014(local20);
		}
		Static67.aBoolean109 = false;
		Static16.method534(local11);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Lclient!ne;")
	public static Class3_Sub2_Sub14 method1742(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub2_Sub14 local16 = (Class3_Sub2_Sub14) Static144.aClass63_8.method2337((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Static90.aClass7_42.method1021(8, arg0);
		local16 = new Class3_Sub2_Sub14();
		if (local28 != null) {
			local16.method2174(new Class3_Sub8(local28));
		}
		Static144.aClass63_8.method2338((long) arg0, local16);
		return local16;
	}
}
