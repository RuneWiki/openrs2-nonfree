import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	public static int anInt732;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Lclient!ca;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "[Lclient!jc;")
	public static final Class48[] aClass48Array1 = new Class48[50];

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_226 = Static151.method2243("hitmarks");

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_227 = Static151.method2243("sl_button");

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "I")
	public static int anInt735 = 0;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_228 = Static151.method2243("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!d", name = "A", descriptor = "[I")
	public static final int[] anIntArray62 = new int[256];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)I")
	public static int method533(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
	public static void method534() {
		Static25.aBoolean21 = true;
		Static28.aLong35 = 0L;
		Static46.aBoolean47 = true;
		Static28.aClass91_1.anInt3780 = 0;
		Static126.anInt2801 = 0;
		Static106.method1672();
		Static78.anInt1622 = -1;
		Static124.anInt2732 = 0;
		Static58.aClass2_Sub11_Sub1_2.anInt2235 = 0;
		Static102.anInt2333 = -1;
		Static49.anInt1076 = -1;
		Static58.anInt1152 = 0;
		Static184.anInt2028 = 0;
		Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
		Static158.anInt3381 = -1;
		for (@Pc(2638) int local2638 = 0; local2638 < Static181.aClass32Array1.length; local2638++) {
			Static181.aClass32Array1[local2638] = null;
		}
		Static51.anInt1111 = 0;
		Static180.aBoolean167 = false;
		Static80.method1133(0);
		for (@Pc(2668) int local2668 = 0; local2668 < 100; local2668++) {
			Static81.aClass62Array134[local2668] = null;
		}
		Static197.anInt4089 = 0;
		Static145.anInt3126 = 0;
		Static118.anInt2607 = 0;
		Static151.anInt3204 = (int) (Math.random() * 120.0D) - 60;
		Static196.anInt4044 = (int) (Math.random() * 100.0D) - 50;
		Static83.anInt1739 = 0;
		Static179.anInt3763 = -1;
		Static39.anInt4448 = (int) (Math.random() * 80.0D) - 40;
		Static6.anInt182 = 0;
		Static203.anInt4219 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static76.anInt1575 = 0;
		Static11.anInt310 = 0;
		Static206.anInt397 = (int) (Math.random() * 30.0D) - 20;
		Static97.anInt2284 = 0;
		Static8.aBoolean12 = false;
		Static128.anInt149 = (int) (Math.random() * 110.0D) - 55;
		for (@Pc(2746) int local2746 = 0; local2746 < 2048; local2746++) {
			Static62.aClass7_Sub2_Sub2Array1[local2746] = null;
			Static169.aClass2_Sub11Array1[local2746] = null;
		}
		for (@Pc(2764) int local2764 = 0; local2764 < 32768; local2764++) {
			Static9.aClass7_Sub2_Sub1Array1[local2764] = null;
		}
		Static186.aClass7_Sub2_Sub2_1 = Static62.aClass7_Sub2_Sub2Array1[2047] = new Class7_Sub2_Sub2();
		Static179.aClass13_13.method314();
		Static163.aClass13_11.method314();
		@Pc(2794) int local2794;
		@Pc(2798) int local2798;
		for (@Pc(2790) int local2790 = 0; local2790 < 4; local2790++) {
			for (local2794 = 0; local2794 < 104; local2794++) {
				for (local2798 = 0; local2798 < 104; local2798++) {
					Static13.aClass13ArrayArrayArray1[local2790][local2794][local2798] = null;
				}
			}
		}
		Static76.aClass13_3 = new Class13();
		Static93.anInt2052 = 0;
		Static29.anInt714 = 0;
		for (local2794 = 0; local2794 < Static111.anInt2434; local2794++) {
			@Pc(2838) Class2_Sub1_Sub18 local2838 = Static125.method1956(local2794);
			if (local2838 != null && local2838.anInt3157 == 0) {
				Static173.anIntArray316[local2794] = 0;
				Static71.anIntArray123[local2794] = 0;
			}
		}
		for (local2798 = 0; local2798 < Static122.anIntArray244.length; local2798++) {
			Static122.anIntArray244[local2798] = -1;
		}
		if (Static40.anInt969 != -1) {
			Static35.method606(Static40.anInt969);
		}
		for (@Pc(2886) Class2_Sub7 local2886 = (Class2_Sub7) Static49.aClass58_7.method1709(); local2886 != null; local2886 = (Class2_Sub7) Static49.aClass58_7.method1705()) {
			Static20.method371(local2886, true);
		}
		Static40.anInt969 = -1;
		Static49.aClass58_7 = new Class58(8);
		Static51.anInt1111 = 0;
		Static154.aClass47_14 = null;
		Static180.aBoolean167 = false;
		Static27.aClass28_1.method721(new int[5], false, null, -1);
		for (@Pc(2922) int local2922 = 0; local2922 < 8; local2922++) {
			Static38.aClass62Array94[local2922] = null;
			Static132.aBooleanArray16[local2922] = false;
		}
		Static38.method2170();
		Static173.aBoolean158 = true;
		for (@Pc(2946) int local2946 = 0; local2946 < 100; local2946++) {
			Static176.aBooleanArray19[local2946] = true;
		}
		Static123.aClass2_Sub22Array11 = null;
		Static120.aClass62_925 = null;
		Static106.anInt2394 = 0;
		for (@Pc(2966) int local2966 = 0; local2966 < 6; local2966++) {
			Static50.aClass60Array1[local2966] = new Class60();
		}
		for (@Pc(2980) int local2980 = 0; local2980 < 25; local2980++) {
			Static54.anIntArray88[local2980] = 0;
			Static184.anIntArray195[local2980] = 0;
			Static176.anIntArray323[local2980] = 0;
		}
		Static124.aBoolean120 = true;
		Static2.aShortArray7 = Static211.aShortArray156 = Static131.aShortArray56 = new short[256];
		Static102.aClass62_799 = Static38.aClass62_1070;
	}
}
