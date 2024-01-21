import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public static int anInt2755;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_66;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_22;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
	public static int[] anIntArray415;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!kb;")
	public static Class41 aClass41_27;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!nd;")
	public static Class53 aClass53_15 = new Class53();

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public static int anInt2753 = 0;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public static int anInt2756 = 0;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_1280 = method1937("nav");

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method1931() {
		aClass53_15 = null;
		anIntArray415 = null;
		aClass1_Sub17_66 = null;
		aClass5_1280 = null;
		anIntArray414 = null;
		aClass41_Sub1_22 = null;
		aClass41_27 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIB)Z")
	public static boolean method1932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = Static44.aClass68_1.method1847(Static7.anInt213, arg2, arg0, arg1);
		@Pc(23) int local23 = arg1 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(35) int local35 = local12 >> 6 & 0x3;
		@Pc(39) int local39 = local12 & 0x1F;
		if (local39 == 10 || local39 == 11 || local39 == 22) {
			@Pc(56) Class1_Sub3_Sub10 local56 = Static131.method2263(local23);
			@Pc(70) int local70;
			@Pc(67) int local67;
			if (local35 == 0 || local35 == 2) {
				local70 = local56.anInt1696;
				local67 = local56.anInt1693;
			} else {
				local67 = local56.anInt1696;
				local70 = local56.anInt1693;
			}
			@Pc(81) int local81 = local56.anInt1701;
			if (local35 != 0) {
				local81 = (local81 << local35 & 0xF) + (local81 >> 4 - local35);
			}
			Static54.method946(arg2, arg0, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], local81, local67, local70, true, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
		} else {
			Static54.method946(arg2, arg0, local39 + 1, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 0, 0, true, 2, local35, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
		}
		Static36.anInt950 = 0;
		Static120.anInt1841 = Static97.anInt2390;
		Static28.anInt860 = 2;
		anInt2753 = Static9.anInt280;
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method1933() {
		Static121.aClass28_82.method792();
		Static12.aClass28_87.method792();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Z)I")
	public static int method1934(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1702(Static81.aClass5_1005, Static93.aClass5_1117)) {
			local5++;
		}
		if (arg0.method1702(Static84.aClass5_1044, Static93.aClass5_1117)) {
			local5++;
		}
		if (arg0.method1702(Static3.aClass5_41, Static93.aClass5_1117)) {
			local5++;
		}
		if (arg0.method1702(Static119.aClass5_1376, Static93.aClass5_1117)) {
			local5++;
		}
		if (arg0.method1702(Static66.aClass5_1399, Static93.aClass5_1117)) {
			local5++;
		}
		if (arg0.method1702(Static64.aClass5_787, Static93.aClass5_1117)) {
			local5++;
		}
		arg0.method1702(Static74.aClass5_849, Static93.aClass5_1117);
		arg0.method1702(Static97.aClass5_1147, Static93.aClass5_1117);
		arg0.method1702(Static12.aClass5_1448, Static93.aClass5_1117);
		arg0.method1702(Static104.aClass5_1214, Static93.aClass5_1117);
		arg0.method1702(Static125.aClass5_1415, Static93.aClass5_1117);
		return local5;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)Lclient!af;")
	public static Class5 method1937(@OriginalArg(1) String arg0) {
		@Pc(11) byte[] local11 = arg0.getBytes();
		@Pc(14) int local14 = local11.length;
		@Pc(16) int local16 = 0;
		@Pc(20) Class5 local20 = new Class5();
		local20.aByteArray2 = new byte[local14];
		while (local14 > local16) {
			@Pc(32) int local32 = local11[local16++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local16 >= local14) {
					break;
				}
				@Pc(54) int local54 = local11[local16++] & 0xFF;
				local20.aByteArray2[local20.anInt178++] = (byte) (local54 + local32 * 43 - 48 - 1720);
			} else if (local32 != 0) {
				local20.aByteArray2[local20.anInt178++] = (byte) local32;
			}
		}
		local20.method181();
		return local20.method189();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
	public static void method1938(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static18.aBoolean117) {
			Static120.method1342();
		} else if (arg0 != -1 && arg0 != Static108.anInt2659 && Static82.anInt2065 != 0 && !Static18.aBoolean117) {
			Static127.method2246(0, Static98.aClass41_Sub1_16, Static82.anInt2065, arg0);
		}
		Static108.anInt2659 = arg0;
	}
}
