import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	public static int anInt4011;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt4000 = -1;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "Lclient!oj;")
	public static Class84 aClass84_32 = new Class84(50);

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "Lclient!qh;")
	public static Class93 aClass93_112 = null;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1295 = Static186.method3527("blinken3:");

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "Lclient!oj;")
	public static Class84 aClass84_33 = new Class84(20);

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "[I")
	public static int[] anIntArray462 = new int[100];

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "[Lclient!qj;")
	public static Class95[] aClass95Array1 = new Class95[500];

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1296 = Static186.method3527("Loaded update list");

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1297 = aClass50_1296;

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
	public static int anInt4017 = 500;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public static void method3186() {
		if (Static132.aClass1_Sub1_Sub6_1 == null) {
			return;
		}
		if (Static6.anInt110 < 10) {
			if (!Static163.aClass86_61.method3310(Static132.aClass1_Sub1_Sub6_1.aClass50_396) || !Static163.aClass86_61.method3310(Static17.method257(new Class50[] { Static132.aClass1_Sub1_Sub6_1.aClass50_396, Static85.aClass50_555 }))) {
				Static6.anInt110 = Static204.aClass86_Sub1_36.method3331(Static132.aClass1_Sub1_Sub6_1.aClass50_396) / 10;
				return;
			}
			Static55.method810();
			Static6.anInt110 = 10;
		}
		if (Static6.anInt110 == 10) {
			Static121.anInt2393 = Static132.aClass1_Sub1_Sub6_1.anInt1115 >> 6 << 6;
			Static195.anInt3969 = Static132.aClass1_Sub1_Sub6_1.anInt1133 >> 6 << 6;
			Static12.anInt239 = (Static132.aClass1_Sub1_Sub6_1.anInt1126 >> 6 << 6) + 64 - Static195.anInt3969;
			@Pc(96) int local96 = Static195.anInt3969 + Static12.anInt239 - Static101.anInt2041 - (Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7) - 1;
			Static164.anInt3383 = (Static132.aClass1_Sub1_Sub6_1.anInt1122 >> 6 << 6) + 64 - Static121.anInt2393;
			Static198.aFloat6 = 8.0F;
			Static64.aFloat1 = 8.0F;
			@Pc(121) int local121 = local96 + (int) (Math.random() * 10.0D) - 5;
			@Pc(131) int local131 = (Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7) + Static91.anInt4078 - Static121.anInt2393;
			@Pc(140) int local140 = local131 + (int) (Math.random() * 10.0D) - 5;
			if (local140 >= 0 && local140 < Static164.anInt3383 && local121 >= 0 && local121 < Static12.anInt239) {
				Static177.anInt3717 = local121;
				Static4.anInt87 = local140;
			} else {
				Static177.anInt3717 = Static195.anInt3969 + Static12.anInt239 - Static132.aClass1_Sub1_Sub6_1.anInt1123 * 64 - 1;
				Static4.anInt87 = Static132.aClass1_Sub1_Sub6_1.anInt1118 * 64 - Static121.anInt2393;
			}
			Static107.method1639();
			@Pc(198) int local198 = Static160.anInt3323 >> 2 << 10;
			@Pc(202) int local202 = Static164.anInt3383 >> 6;
			Static114.anIntArray256 = new int[Static223.anInt4339 + 1];
			@Pc(211) int local211 = Static156.anInt3207 >> 1;
			@Pc(215) int local215 = Static12.anInt239 >> 6;
			Static183.aByteArrayArrayArray11 = new byte[local202][local215][];
			Static26.aByteArrayArrayArray3 = new byte[local202][local215][];
			Static173.aShortArrayArrayArray1 = new short[local202][local215][];
			Static128.aByteArrayArrayArray8 = new byte[local202][local215][];
			Static109.anIntArrayArrayArray9 = new int[local202][local215][];
			Static60.aByteArrayArrayArray4 = new byte[local202][local215][];
			Static172.anIntArrayArrayArray11 = new int[local202][local215][];
			Static182.aByteArrayArrayArray10 = new byte[local202][local215][];
			Static149.method2501(local211, local198);
			Static6.anInt110 = 20;
		} else if (Static6.anInt110 == 20) {
			Static223.method3423(new Class1_Sub17(Static163.aClass86_61.method3335(Static66.aClass50_474, Static132.aClass1_Sub1_Sub6_1.aClass50_396)));
			Static6.anInt110 = 30;
			Static121.method1940(true);
			Static19.method292();
		} else if (Static6.anInt110 == 30) {
			Static32.method465(new Class1_Sub17(Static163.aClass86_61.method3335(Static113.aClass50_784, Static132.aClass1_Sub1_Sub6_1.aClass50_396)));
			Static6.anInt110 = 40;
			Static19.method292();
		} else if (Static6.anInt110 == 40) {
			Static88.method1383(new Class1_Sub17(Static163.aClass86_61.method3335(Static177.aClass50_1204, Static132.aClass1_Sub1_Sub6_1.aClass50_396)));
			Static6.anInt110 = 50;
			Static19.method292();
		} else if (Static6.anInt110 == 50) {
			Static35.method560(new Class1_Sub17(Static163.aClass86_61.method3335(Static12.aClass50_107, Static132.aClass1_Sub1_Sub6_1.aClass50_396)));
			Static6.anInt110 = 60;
			Static121.method1940(true);
			Static19.method292();
		} else if (Static6.anInt110 == 60) {
			Static131.aClass62_2 = Static56.method822(Static163.aClass86_61, Static17.method257(new Class50[] { Static132.aClass1_Sub1_Sub6_1.aClass50_396, Static85.aClass50_555 }));
			Static6.anInt110 = 70;
			Static19.method292();
		} else if (Static6.anInt110 == 70) {
			Static102.aClass27_3 = new Class27(11, true, Static193.aCanvas4);
			Static6.anInt110 = 73;
			Static121.method1940(true);
			Static19.method292();
		} else if (Static6.anInt110 == 73) {
			Static225.aClass27_8 = new Class27(12, true, Static193.aCanvas4);
			Static6.anInt110 = 76;
			Static121.method1940(true);
			Static19.method292();
		} else if (Static6.anInt110 == 76) {
			Static131.aClass27_4 = new Class27(14, true, Static193.aCanvas4);
			Static6.anInt110 = 79;
			Static121.method1940(true);
			Static19.method292();
		} else if (Static6.anInt110 == 79) {
			Static5.aClass27_1 = new Class27(17, true, Static193.aCanvas4);
			Static6.anInt110 = 82;
			Static121.method1940(true);
			Static19.method292();
		} else if (Static6.anInt110 == 82) {
			Static189.aClass27_6 = new Class27(19, true, Static193.aCanvas4);
			Static6.anInt110 = 85;
			Static121.method1940(true);
			Static19.method292();
		} else if (Static6.anInt110 == 85) {
			Static190.aClass27_7 = new Class27(22, true, Static193.aCanvas4);
			Static6.anInt110 = 88;
			Static121.method1940(true);
			Static19.method292();
		} else if (Static6.anInt110 == 88) {
			Static132.aClass27_5 = new Class27(26, true, Static193.aCanvas4);
			Static6.anInt110 = 91;
			Static121.method1940(true);
			Static19.method292();
		} else {
			Static43.aClass27_2 = new Class27(30, true, Static193.aCanvas4);
			Static6.anInt110 = 100;
			Static121.method1940(true);
			Static19.method292();
			Static44.anInt939 = -1;
			Static95.anInt1938 = -1;
			System.gc();
		}
	}
}
