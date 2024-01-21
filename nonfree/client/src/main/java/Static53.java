import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public static int anInt1184;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "J")
	public static long aLong49;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_11;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[S")
	public static short[] aShortArray3 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!lf;")
	private static Class49 aClass49_597 = Static32.method683("Cancel");

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_595 = aClass49_597;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!lf;")
	private static Class49 aClass49_596 = Static32.method683("Invalid username or password)3");

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!lf;")
	public static Class49 aClass49_598 = aClass49_596;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZJI)Z")
	public static boolean method926(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg1 >> 20 & 0x3;
		@Pc(19) int local19 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		@Pc(31) int local31 = (int) arg1 >> 14 & 0x1F;
		if (local31 == 10 || local31 == 11 || local31 == 22) {
			@Pc(72) Class2_Sub2_Sub9 local72 = Static124.method2146(local19);
			@Pc(75) int local75 = local72.anInt1508;
			@Pc(88) int local88;
			@Pc(85) int local85;
			if (local12 == 0 || local12 == 2) {
				local85 = local72.anInt1480;
				local88 = local72.anInt1482;
			} else {
				local85 = local72.anInt1482;
				local88 = local72.anInt1480;
			}
			if (local12 != 0) {
				local75 = (local75 << local12 & 0xF) + (local75 >> 4 - local12);
			}
			Static51.method905(local88, local85, arg2, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], true, arg0, 0, local75);
		} else {
			Static51.method905(0, 0, arg2, local12, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], true, arg0, local31 + 1, 0);
		}
		Static129.anInt2804 = Static61.anInt1320;
		Static82.anInt1768 = 0;
		Static55.anInt1205 = Static114.anInt2394;
		Static175.anInt3819 = 2;
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!oe;III)V")
	public static void method927(@OriginalArg(0) Class2_Sub2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub1 local12;
		@Pc(27) Class2_Sub2_Sub3_Sub6 local27;
		if (arg2 < Static91.anInt1931) {
			local12 = Static72.aClass2_Sub1ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass26_1 != null && local12.aClass26_1.aClass2_Sub2_Sub3_7 instanceof Class2_Sub2_Sub3_Sub6) {
				local27 = (Class2_Sub2_Sub3_Sub6) local12.aClass26_1.aClass2_Sub2_Sub3_7;
				Static119.method2019(arg0, local27, 128, 0, 0, true);
			}
		}
		if (arg3 < Static91.anInt1931) {
			local12 = Static72.aClass2_Sub1ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass26_1 != null && local12.aClass26_1.aClass2_Sub2_Sub3_7 instanceof Class2_Sub2_Sub3_Sub6) {
				local27 = (Class2_Sub2_Sub3_Sub6) local12.aClass26_1.aClass2_Sub2_Sub3_7;
				Static119.method2019(arg0, local27, 0, 0, 128, true);
			}
		}
		if (arg2 < Static91.anInt1931 && arg3 < Static59.anInt1256) {
			local12 = Static72.aClass2_Sub1ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass26_1 != null && local12.aClass26_1.aClass2_Sub2_Sub3_7 instanceof Class2_Sub2_Sub3_Sub6) {
				local27 = (Class2_Sub2_Sub3_Sub6) local12.aClass26_1.aClass2_Sub2_Sub3_7;
				Static119.method2019(arg0, local27, 128, 0, 128, true);
			}
		}
		if (arg2 >= Static91.anInt1931 || arg3 <= 0) {
			return;
		}
		local12 = Static72.aClass2_Sub1ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local12 != null && local12.aClass26_1 != null && local12.aClass26_1.aClass2_Sub2_Sub3_7 instanceof Class2_Sub2_Sub3_Sub6) {
			local27 = (Class2_Sub2_Sub3_Sub6) local12.aClass26_1.aClass2_Sub2_Sub3_7;
			Static119.method2019(arg0, local27, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public static void method928() {
		aClass49_598 = null;
		aClass11_Sub1_11 = null;
		aClass49_596 = null;
		aShortArray3 = null;
		aClass49_597 = null;
		aClass49_595 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ja;B)Lclient!lf;")
	public static Class49 method929(@OriginalArg(0) Class2_Sub13 arg0) {
		return Static93.method1598(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] method930() {
		@Pc(8) Class2_Sub2_Sub2_Sub3[] local8 = new Class2_Sub2_Sub2_Sub3[Static116.anInt2433];
		for (@Pc(18) int local18 = 0; local18 < Static116.anInt2433; local18++) {
			@Pc(24) Class2_Sub2_Sub2_Sub3 local24 = new Class2_Sub2_Sub2_Sub3();
			local24.anInt1887 = Static148.anInt3150;
			local24.anInt1889 = Static103.anInt2179;
			local24.anInt1888 = Static142.anIntArray282[local18];
			local24.anInt1890 = Static178.anIntArray364[local18];
			local24.anInt1886 = Static20.anIntArray41[local18];
			local24.anInt1885 = Static63.anIntArray165[local18];
			@Pc(56) int local56 = local24.anInt1886 * local24.anInt1885;
			@Pc(60) byte[] local60 = Static9.aByteArrayArray1[local18];
			local24.anIntArray191 = new int[local56];
			for (@Pc(66) int local66 = 0; local66 < local56; local66++) {
				local24.anIntArray191[local66] = Static47.anIntArray105[local60[local66] & 0xFF];
			}
			local8[local18] = local24;
		}
		Static63.method1094();
		return local8;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
	public static boolean method931(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!bg;ILclient!bg;Ljava/awt/Component;)V")
	public static void method932(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Component arg2) {
		if (Static77.aBoolean71) {
			return;
		}
		Static10.method1846();
		@Pc(23) byte[] local23 = arg1.method2058(Static129.aClass49_1268, Static117.aClass49_1123);
		Static88.aClass2_Sub2_Sub2_Sub3_4 = new Class2_Sub2_Sub2_Sub3(local23, arg2);
		Static47.aClass2_Sub2_Sub2_Sub3_2 = Static88.aClass2_Sub2_Sub2_Sub3_4.method1534();
		Static140.aClass2_Sub2_Sub2_Sub2_3 = Static145.method2397(Static129.aClass49_1268, arg0, Static73.aClass49_796);
		Static31.aClass2_Sub2_Sub2_Sub2_1 = Static145.method2397(Static129.aClass49_1268, arg0, Static78.aClass49_843);
		Static113.aClass2_Sub2_Sub2_Sub2_2 = Static145.method2397(Static129.aClass49_1268, arg0, Static19.aClass49_261);
		Static185.aClass2_Sub2_Sub2_Sub2Array10 = Static125.method2152(Static129.aClass49_1268, Static180.aClass49_1732, arg0);
		Static76.aClass2_Sub2_Sub2_Sub2Array5 = Static125.method2152(Static129.aClass49_1268, Static143.aClass49_1381, arg0);
		Static70.anIntArray170 = new int[256];
		for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
			Static70.anIntArray170[local67] = local67 * 262144;
		}
		for (@Pc(83) int local83 = 0; local83 < 64; local83++) {
			Static70.anIntArray170[local83 + 64] = local83 * 1024 + 16711680;
		}
		for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
			Static70.anIntArray170[local102 + 128] = local102 * 4 + 16776960;
		}
		for (@Pc(122) int local122 = 0; local122 < 64; local122++) {
			Static70.anIntArray170[local122 + 192] = 16777215;
		}
		Static127.anIntArray263 = new int[256];
		for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
			Static127.anIntArray263[local141] = local141 * 1024;
		}
		for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
			Static127.anIntArray263[local155 + 64] = local155 * 4 + 65280;
		}
		for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
			Static127.anIntArray263[local176 + 128] = local176 * 262144 + 65535;
		}
		for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
			Static127.anIntArray263[local194 + 192] = 16777215;
		}
		Static150.anIntArray287 = new int[256];
		for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
			Static150.anIntArray287[local213] = local213 * 4;
		}
		for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
			Static150.anIntArray287[local227 + 64] = local227 * 262144 + 255;
		}
		for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
			Static150.anIntArray287[local247 + 128] = local247 * 1024 + 16711935;
		}
		for (@Pc(266) int local266 = 0; local266 < 64; local266++) {
			Static150.anIntArray287[local266 + 192] = 16777215;
		}
		Static102.anIntArray208 = new int[256];
		Static167.anIntArray323 = new int[32768];
		Static9.anIntArray12 = new int[32768];
		Static20.method389(null);
		Static118.aBoolean110 = false;
		if (Static156.anInt3412 == 0) {
			Static43.aBoolean37 = true;
		} else {
			Static43.aBoolean37 = false;
		}
		Static96.anInt2050 = 0;
		Static129.aClass49_1276 = Static129.aClass49_1268;
		Static129.aClass49_1264 = Static129.aClass49_1268;
		Static34.anIntArray80 = new int[32768];
		Static11.anIntArray14 = new int[32768];
		if (Static43.aBoolean37) {
			Static45.method832();
		} else {
			Static159.method2690(Static121.aClass49_1163, Static91.aClass11_Sub1_23, Static129.aClass49_1268);
		}
		Static37.method758(false);
		Static77.aBoolean71 = true;
		Static88.aClass2_Sub2_Sub2_Sub3_4.method1544(0, 0);
		Static47.aClass2_Sub2_Sub2_Sub3_2.method1544(382, 0);
		Static140.aClass2_Sub2_Sub2_Sub2_3.method722(382 - Static140.aClass2_Sub2_Sub2_Sub2_3.anInt878 / 2, 18);
		Static71.aClass2_Sub2_Sub2_Sub3_3 = new Class2_Sub2_Sub2_Sub3(128, 254);
		Static142.aClass2_Sub2_Sub2_Sub3_6 = new Class2_Sub2_Sub2_Sub3(128, 254);
	}
}
