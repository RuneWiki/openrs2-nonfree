import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_4 = new Class4();

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
	public static int anInt1498 = -1;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_14 = new Class77(49, 8);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)S")
	public static short method1477(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(43) int local43 = local24 <= 64 ? local24 * local20 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(47) int local47 = local24 + local43;
		@Pc(53) int local53;
		if (local47 == 0) {
			local53 = local43 << 1;
		} else {
			local53 = (local43 << 8) / local47;
		}
		return (short) (local47 | local53 >> 4 << 7 | local14 << 10);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Lclient!si;")
	public static Class143 method1478() {
		try {
			return (Class143) Class.forName("Class143_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
	public static void method1479() {
		Static464.aClass220_6.method5378();
		Static73.aClass47_2.method1416();
		Static274.aClass78_1.method2173();
		Static49.aClass155_2.method4064();
		Static161.aClass110_3.method3017();
		Static150.aClass254_2.method6339();
		Static47.aClass41_1.method913();
		Static82.aClass212_2.method5065();
		Static64.aClass296_10.method7299();
		Static367.aClass146_1.method3867();
		Static218.aClass160_1.method4127();
		Static149.aClass292_2.method7214();
		Static293.aClass93_8.method2481();
		Static139.aClass106_1.method2872();
		Static453.aClass258_2.method6424();
		Static114.aClass252_1.method6265();
		Static496.aClass60_3.method1676();
		Static367.aClass156_1.method4103();
		Static317.aClass148_1.method3978();
		Static285.aClass172_1.method4374();
		Static482.method7215();
		Static269.method4557();
		Static424.method6543();
		if (Static79.aClass285_2 != Static171.aClass285_4) {
			for (@Pc(82) int local82 = 0; local82 < Static407.aByteArrayArray25.length; local82++) {
				Static407.aByteArrayArray25[local82] = null;
			}
			Static106.anInt2437 = 0;
		}
		Static304.method4953();
		Static438.method6666();
		Static299.method4821();
		Static234.method4143();
		Static294.method4772();
		Static312.aClass125_44.method3440();
		Static243.aClass42_4.method5841();
		Static474.aClass14_3.method358();
		Static29.method560();
		Static242.aClass16_65.method385();
		Static252.aClass16_68.method385();
		Static539.aClass16_120.method385();
		Static315.aClass16_82.method385();
		Static85.aClass16_17.method385();
		Static129.aClass16_119.method385();
		Static250.aClass16_67.method385();
		Static103.aClass16_21.method385();
		Static440.aClass16_103.method385();
		Static107.aClass16_28.method385();
		Static369.aClass16_89.method385();
		Static207.aClass16_53.method385();
		Static306.aClass16_77.method385();
		Static466.aClass16_109.method385();
		Static482.aClass16_112.method385();
		Static25.aClass16_5.method385();
		Static362.aClass16_88.method385();
		Static458.aClass16_106.method385();
		Static222.aClass16_59.method385();
		Static115.aClass16_29.method385();
		Static354.aClass16_87.method385();
		Static170.aClass16_47.method385();
		Static395.aClass16_93.method385();
		Static224.aClass16_108.method385();
		Static336.aClass16_84.method385();
		Static55.aClass16_10.method385();
		Static96.aClass16_20.method385();
		Static371.aClass16_90.method385();
		Static81.aClass16_16.method385();
		Static19.aClass16_4.method385();
		Static398.aClass16_97.method385();
		Static7.aClass16_118.method385();
		Static316.aClass125_45.method3440();
		Static420.aClass125_58.method3440();
		Static355.aClass125_51.method3440();
		Static197.aClass125_23.method3440();
	}
}
