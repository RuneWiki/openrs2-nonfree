import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
	public static int anInt2090;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "Z")
	public static boolean aBoolean115;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!hf", name = "G", descriptor = "[I")
	public static int[] anIntArray178 = new int[1024];

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "Lclient!vh;")
	public static Class187 aClass187_62 = new Class187(64);

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	public static void method1887() {
		if (Static109.aClass1_Sub2_Sub21_3 == null) {
			return;
		}
		if (Static155.anInt3037 < 10) {
			if (!Static109.aClass121_100.method3114(Static109.aClass1_Sub2_Sub21_3.aString301)) {
				Static155.anInt3037 = Static242.aClass121_104.method3113(Static109.aClass1_Sub2_Sub21_3.aString301) / 10;
				return;
			}
			Static118.method2107();
			Static155.anInt3037 = 10;
		}
		if (Static155.anInt3037 == 10) {
			Static109.anInt4232 = Static109.aClass1_Sub2_Sub21_3.anInt5085 >> 6 << 6;
			Static109.anInt4231 = (Static109.aClass1_Sub2_Sub21_3.anInt5074 >> 6 << 6) + 64 - Static109.anInt4232;
			@Pc(65) int local65 = -1;
			@Pc(68) int[] local68 = new int[3];
			Static109.anInt4229 = Static109.aClass1_Sub2_Sub21_3.anInt5086 >> 6 << 6;
			@Pc(77) int local77 = -1;
			Static109.anInt4234 = (Static109.aClass1_Sub2_Sub21_3.anInt5079 >> 6 << 6) + 64 - Static109.anInt4229;
			if (Static109.aClass1_Sub2_Sub21_3.method4333(Static65.anInt1300, Static192.anInt3637 + (Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7), local68, (Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7) + Static199.anInt3817)) {
				local77 = Static109.anInt4231 + Static109.anInt4232 - local68[2] - 1;
				local65 = local68[1] - Static109.anInt4229;
			}
			if (!Static297.aBoolean360 && local65 >= 0 && Static109.anInt4234 > local65 && local77 >= 0 && local77 < Static109.anInt4231) {
				local65 += (int) (Math.random() * 10.0D) - 5;
				Static125.anInt2557 = local65;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static293.anInt5263 = local77;
			} else if (Static181.anInt3482 == -1 || Static252.anInt4556 == -1) {
				Static109.aClass1_Sub2_Sub21_3.method4336(Static109.aClass1_Sub2_Sub21_3.anInt5072 & 0x3FFF, local68, Static109.aClass1_Sub2_Sub21_3.anInt5072 >> 14 & 0x3FFF);
				Static125.anInt2557 = local68[1] - Static109.anInt4229;
				Static293.anInt5263 = Static109.anInt4232 + Static109.anInt4231 - local68[2] - 1;
			} else {
				Static109.aClass1_Sub2_Sub21_3.method4336(Static252.anInt4556, local68, Static181.anInt3482);
				Static297.aBoolean360 = false;
				Static252.anInt4556 = -1;
				Static181.anInt3482 = -1;
				if (local68 != null) {
					Static125.anInt2557 = local68[1] - Static109.anInt4229;
					Static293.anInt5263 = Static109.anInt4231 + Static109.anInt4232 - local68[2] - 1;
				}
			}
			if (Static109.aClass1_Sub2_Sub21_3.anInt5084 == 37) {
				Static109.aFloat132 = 3.0F;
				Static109.aFloat131 = 3.0F;
			} else if (Static109.aClass1_Sub2_Sub21_3.anInt5084 == 50) {
				Static109.aFloat132 = 4.0F;
				Static109.aFloat131 = 4.0F;
			} else if (Static109.aClass1_Sub2_Sub21_3.anInt5084 == 75) {
				Static109.aFloat132 = 6.0F;
				Static109.aFloat131 = 6.0F;
			} else if (Static109.aClass1_Sub2_Sub21_3.anInt5084 == 100) {
				Static109.aFloat132 = 8.0F;
				Static109.aFloat131 = 8.0F;
			} else if (Static109.aClass1_Sub2_Sub21_3.anInt5084 == 200) {
				Static109.aFloat132 = 16.0F;
				Static109.aFloat131 = 16.0F;
			} else {
				Static109.aFloat132 = 8.0F;
				Static109.aFloat131 = 8.0F;
			}
			Static257.method4079();
			@Pc(313) int local313 = Static109.anInt4234 >> 6;
			@Pc(317) int local317 = Static109.anInt4231 >> 6;
			Static109.aByteArrayArrayArray13 = new byte[local313][local317][];
			Static109.anIntArray361 = new int[Static114.anInt2376 + 1];
			Static109.anIntArrayArrayArray12 = new int[local313][local317][];
			Static109.aByteArrayArrayArray14 = new byte[local313][local317][];
			Static109.anIntArrayArrayArray13 = new int[local313][local317][];
			Static109.aByteArrayArrayArray15 = new byte[local313][local317][];
			Static109.aByteArrayArrayArray17 = new byte[local313][local317][];
			Static109.aByteArrayArrayArray16 = new byte[local313][local317][];
			Static71.aClass59_17 = new Class59();
			Static117.aClass124_1 = new Class124();
			@Pc(362) int local362 = Static229.anInt4205 >> 1;
			@Pc(368) int local368 = Static52.anInt5632 >> 2 << 10;
			Static109.method3583(local368, local362);
			Static155.method2652(256, 1024);
			Static153.method2610(256);
			Static155.anInt3037 = 20;
		} else if (Static155.anInt3037 == 20) {
			Static159.method2734(new Class1_Sub14(Static109.aClass121_100.method3134(Static109.aClass1_Sub2_Sub21_3.aString301, "underlay")));
			Static155.anInt3037 = 30;
			Static157.method1360(true);
			Static57.method1003();
		} else if (Static155.anInt3037 == 30) {
			Static109.method3594(new Class1_Sub14(Static109.aClass121_100.method3134(Static109.aClass1_Sub2_Sub21_3.aString301, "overlay")));
			Static155.anInt3037 = 40;
			Static57.method1003();
		} else if (Static155.anInt3037 == 40) {
			Static109.method3589(new Class1_Sub14(Static109.aClass121_100.method3134(Static109.aClass1_Sub2_Sub21_3.aString301, "overlay2")));
			Static155.anInt3037 = 50;
			Static57.method1003();
		} else if (Static155.anInt3037 == 50) {
			Static109.method3592(new Class1_Sub14(Static109.aClass121_100.method3134(Static109.aClass1_Sub2_Sub21_3.aString301, "loc")), Static254.aBoolean315);
			Static155.anInt3037 = 60;
			Static157.method1360(true);
			Static57.method1003();
		} else if (Static155.anInt3037 == 60) {
			if (Static109.aClass121_100.method3120(Static109.aClass1_Sub2_Sub21_3.aString301 + "_labels")) {
				if (!Static109.aClass121_100.method3114(Static109.aClass1_Sub2_Sub21_3.aString301 + "_labels")) {
					return;
				}
				Static109.aClass150_3 = Static45.method887(Static109.aClass1_Sub2_Sub21_3.aString301 + "_labels", Static109.aClass121_100, Static254.aBoolean315);
			} else {
				Static109.aClass150_3 = new Class150(0);
			}
			Static109.method3588();
			Static155.anInt3037 = 70;
			Static57.method1003();
		} else if (Static155.anInt3037 == 70) {
			Static51.aClass90_1 = new Class90(11, true, Static127.aCanvas1);
			Static155.anInt3037 = 73;
			Static157.method1360(true);
			Static57.method1003();
		} else if (Static155.anInt3037 == 73) {
			Static186.aClass90_6 = new Class90(12, true, Static127.aCanvas1);
			Static155.anInt3037 = 76;
			Static157.method1360(true);
			Static57.method1003();
		} else if (Static155.anInt3037 == 76) {
			Static172.aClass90_5 = new Class90(14, true, Static127.aCanvas1);
			Static155.anInt3037 = 79;
			Static157.method1360(true);
			Static57.method1003();
		} else if (Static155.anInt3037 == 79) {
			Static189.aClass90_7 = new Class90(17, true, Static127.aCanvas1);
			Static155.anInt3037 = 82;
			Static157.method1360(true);
			Static57.method1003();
		} else if (Static155.anInt3037 == 82) {
			Static285.aClass90_8 = new Class90(19, true, Static127.aCanvas1);
			Static155.anInt3037 = 85;
			Static157.method1360(true);
			Static57.method1003();
		} else if (Static155.anInt3037 == 85) {
			Static159.aClass90_4 = new Class90(22, true, Static127.aCanvas1);
			Static155.anInt3037 = 88;
			Static157.method1360(true);
			Static57.method1003();
		} else if (Static155.anInt3037 == 88) {
			Static103.aClass90_3 = new Class90(26, true, Static127.aCanvas1);
			Static155.anInt3037 = 91;
			Static157.method1360(true);
			Static57.method1003();
		} else {
			Static84.aClass90_2 = new Class90(30, true, Static127.aCanvas1);
			Static155.anInt3037 = 100;
			Static157.method1360(true);
			Static57.method1003();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBII)I")
	public static int method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class135.anIntArray338[arg2 * 1024 / arg3] >> 1;
		return ((65536 - local24) * arg0 >> 16) + (local24 * arg1 >> 16);
	}
}
