import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!wa", name = "qb", descriptor = "Lclient!ga;")
	public static Class29 aClass29_23;

	@OriginalMember(owner = "client!wa", name = "Xc", descriptor = "Lclient!p;")
	public static Class6_Sub3_Sub1_Sub2_Sub2 aClass6_Sub3_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
	public static int anInt3217 = -1;

	@OriginalMember(owner = "client!wa", name = "Mb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1767 = Static80.method1463("Connection lost");

	@OriginalMember(owner = "client!wa", name = "Sb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1768 = Static80.method1463("@gr2@");

	@OriginalMember(owner = "client!wa", name = "Tc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1769 = aClass63_1767;

	@OriginalMember(owner = "client!wa", name = "Yc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1771 = Static80.method1463("welle:");

	@OriginalMember(owner = "client!wa", name = "sd", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1774 = Static80.method1463(":");

	@OriginalMember(owner = "client!wa", name = "td", descriptor = "I")
	public static int anInt3288 = 2;

	@OriginalMember(owner = "client!wa", name = "xd", descriptor = "I")
	public static int anInt3290 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
	public static void method2135(@OriginalArg(0) int arg0) {
		Static42.anInt1322 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ua;I)V")
	public static void method2138(@OriginalArg(0) Class6_Sub18 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt3030 == 0) {
			local5 = Static76.aClass19_1.method689(arg0.anInt3031, arg0.anInt3020, arg0.anInt3018);
		}
		if (arg0.anInt3030 == 1) {
			local5 = Static76.aClass19_1.method679(arg0.anInt3031, arg0.anInt3020, arg0.anInt3018);
		}
		if (arg0.anInt3030 == 2) {
			local5 = Static76.aClass19_1.method690(arg0.anInt3031, arg0.anInt3020, arg0.anInt3018);
		}
		if (arg0.anInt3030 == 3) {
			local5 = Static76.aClass19_1.method694(arg0.anInt3031, arg0.anInt3020, arg0.anInt3018);
		}
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		if (local5 != 0) {
			local61 = local5 >> 14 & 0x7FFF;
			@Pc(84) int local84 = Static76.aClass19_1.method697(arg0.anInt3031, arg0.anInt3020, arg0.anInt3018, local5);
			local65 = local84 >> 6 & 0x3;
			local63 = local84 & 0x1F;
		}
		arg0.anInt3023 = local61;
		arg0.anInt3028 = local65;
		arg0.anInt3025 = local63;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
	public static void method2139() {
		aClass6_Sub3_Sub1_Sub2_Sub2_1 = null;
		aClass29_23 = null;
		aClass63_1769 = null;
		aClass63_1767 = null;
		aClass63_1774 = null;
		aClass63_1771 = null;
		aClass63_1768 = null;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V")
	public static void method2142() {
		@Pc(1) Class41 local1 = Static31.aClass41_1;
		synchronized (Static31.aClass41_1) {
			Static47.anInt1499 = Static24.anInt829;
			Static102.anInt2823 = Static31.anInt1030;
			Static59.anInt1768 = Static110.anInt3043;
			Static19.anInt642 = Static31.anInt1029;
			Static59.anInt1765 = Static29.anInt942;
			Static61.anInt1804 = Static46.anInt1444;
			Static117.aLong82 = Static73.aLong50;
			Static31.anInt1029 = 0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)Z")
	public static boolean method2145() {
		@Pc(10) Class65 local10 = Static65.aClass65_1;
		synchronized (Static65.aClass65_1) {
			if (Static98.anInt2755 == Static66.anInt3199) {
				return false;
			} else {
				Static79.anInt2157 = Static58.anIntArray187[Static98.anInt2755];
				Static123.anInt3314 = Static119.anIntArray359[Static98.anInt2755];
				Static98.anInt2755 = Static98.anInt2755 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)Lclient!vd;")
	public static Class56 method2147() {
		try {
			return (Class56) Class.forName("Class56_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class56_Sub1();
		}
	}

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(I)V")
	public static void method2148() {
		Static89.aClass49_23.method1389();
		Static87.aClass49_22.method1389();
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] method2149() {
		@Pc(8) Class6_Sub3_Sub3_Sub2[] local8 = new Class6_Sub3_Sub3_Sub2[Static2.anInt18];
		for (@Pc(18) int local18 = 0; local18 < Static2.anInt18; local18++) {
			@Pc(28) Class6_Sub3_Sub3_Sub2 local28 = local8[local18] = new Class6_Sub3_Sub3_Sub2();
			local28.anInt1890 = Static12.anInt417;
			local28.anInt1891 = Static18.anInt566;
			local28.anInt1893 = Static22.anIntArray65[local18];
			local28.anInt1889 = Static39.anIntArray143[local18];
			local28.anInt1894 = Static117.anIntArray345[local18];
			local28.anInt1892 = Static59.anIntArray189[local18];
			@Pc(60) int local60 = local28.anInt1894 * local28.anInt1892;
			@Pc(64) byte[] local64 = Static61.aByteArrayArray6[local18];
			local28.anIntArray221 = new int[local60];
			for (@Pc(70) int local70 = 0; local70 < local60; local70++) {
				local28.anIntArray221[local70] = Static61.anIntArray190[local64[local70] & 0xFF];
			}
		}
		Static5.method36();
		return local8;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)I")
	public static int method2150(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local6 | local6 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
