import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "[S")
	public static short[] aShortArray92;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
	public static int anInt4796;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "Z")
	public static boolean aBoolean318 = false;

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
	public static int anInt4795 = -1;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!kh;I)Lclient!gk;")
	public static Class83 method4208(@OriginalArg(0) Class11_Sub25 arg0) {
		@Pc(12) Class83 local12 = new Class83();
		local12.anInt1976 = arg0.method5187();
		local12.aClass11_Sub4_Sub16_1 = Static117.method1777(local12.anInt1976);
		return local12;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)I")
	public static int method4211(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)Z")
	public static boolean method4212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(22) Class84 local22 = Static108.method1650(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local22.method1639(arg1);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ja;ILclient!uo;)V")
	public static void method4214(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class129 arg1) {
		if (Static271.aClass11_Sub4_Sub7_2 == null) {
			return;
		}
		if (Static145.anInt2660 < 10) {
			if (!Static271.aClass144_65.method3900(Static271.aClass11_Sub4_Sub7_2.aString20)) {
				Static145.anInt2660 = Static225.aClass144_74.method3889(Static271.aClass11_Sub4_Sub7_2.aString20) / 10;
				return;
			}
			Static137.method2133();
			Static145.anInt2660 = 10;
		}
		if (Static145.anInt2660 == 10) {
			Static271.anInt4332 = Static271.aClass11_Sub4_Sub7_2.anInt1921 >> 6 << 6;
			Static271.anInt4339 = Static271.aClass11_Sub4_Sub7_2.anInt1920 >> 6 << 6;
			Static271.anInt4331 = (Static271.aClass11_Sub4_Sub7_2.anInt1925 >> 6 << 6) + 64 - Static271.anInt4332;
			Static271.anInt4338 = (Static271.aClass11_Sub4_Sub7_2.anInt1914 >> 6 << 6) + 64 - Static271.anInt4339;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static271.aClass11_Sub4_Sub7_2.method1584(local78, (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7) + Static182.anInt3662, Static322.anInt6250, Static169.anInt6312 + (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7))) {
				local82 = local78[2] - Static271.anInt4339;
				local80 = local78[1] - Static271.anInt4332;
			}
			if (!Static134.aBoolean161 && local80 >= 0 && local80 < Static271.anInt4331 && local82 >= 0 && local82 < Static271.anInt4338) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static247.anInt4959 = local80;
				Static140.anInt2591 = local82;
			} else if (Static252.anInt5976 == -1 || Static4.anInt19 == -1) {
				Static271.aClass11_Sub4_Sub7_2.method1585(local78, Static271.aClass11_Sub4_Sub7_2.anInt1915 & 0x3FFF, Static271.aClass11_Sub4_Sub7_2.anInt1915 >> 14 & 0x3FFF);
				Static247.anInt4959 = local78[1] - Static271.anInt4332;
				Static140.anInt2591 = local78[2] - Static271.anInt4339;
			} else {
				Static271.aClass11_Sub4_Sub7_2.method1585(local78, Static4.anInt19, Static252.anInt5976);
				if (local78 != null) {
					Static140.anInt2591 = local78[2] - Static271.anInt4339;
					Static247.anInt4959 = local78[1] - Static271.anInt4332;
				}
				Static4.anInt19 = -1;
				Static252.anInt5976 = -1;
				Static134.aBoolean161 = false;
			}
			if (Static271.aClass11_Sub4_Sub7_2.anInt1917 == 37) {
				Static271.aFloat47 = 3.0F;
				Static271.aFloat48 = 3.0F;
			} else if (Static271.aClass11_Sub4_Sub7_2.anInt1917 == 50) {
				Static271.aFloat47 = 4.0F;
				Static271.aFloat48 = 4.0F;
			} else if (Static271.aClass11_Sub4_Sub7_2.anInt1917 == 75) {
				Static271.aFloat47 = 6.0F;
				Static271.aFloat48 = 6.0F;
			} else if (Static271.aClass11_Sub4_Sub7_2.anInt1917 == 100) {
				Static271.aFloat47 = 8.0F;
				Static271.aFloat48 = 8.0F;
			} else if (Static271.aClass11_Sub4_Sub7_2.anInt1917 == 200) {
				Static271.aFloat47 = 16.0F;
				Static271.aFloat48 = 16.0F;
			} else {
				Static271.aFloat47 = 8.0F;
				Static271.aFloat48 = 8.0F;
			}
			Static271.anInt4329 = (int) Static271.aFloat47 >> 1;
			Static271.aByteArrayArrayArray7 = Static229.method4046(Static271.anInt4329);
			Static32.method457();
			Static271.method3821();
			Static4.aClass16_1 = new Class16();
			Static271.anInt4327 += (int) (Math.random() * 5.0D) - 2;
			if (Static271.anInt4327 < -8) {
				Static271.anInt4327 = -8;
			}
			if (Static271.anInt4327 > 8) {
				Static271.anInt4327 = 8;
			}
			Static271.anInt4328 += (int) (Math.random() * 5.0D) - 2;
			if (Static271.anInt4328 < -16) {
				Static271.anInt4328 = -16;
			}
			if (Static271.anInt4328 > 16) {
				Static271.anInt4328 = 16;
			}
			Static271.method3824(arg0, Static271.anInt4327 >> 2 << 10, Static271.anInt4328 >> 1);
			Static85.method1232(256, 1024);
			Static200.method3610(256, 256);
			Static349.method5645(4096);
			Static129.method1988(256);
			Static145.anInt2660 = 20;
		} else if (Static145.anInt2660 == 20) {
			Static102.method1554(true);
			Static271.method3811(arg1, Static271.anInt4327, Static271.anInt4328);
			Static145.anInt2660 = 60;
			Static102.method1554(true);
			Static277.method4683();
		} else if (Static145.anInt2660 == 60) {
			if (Static271.aClass144_65.method3892(Static271.aClass11_Sub4_Sub7_2.aString20 + "_staticelements")) {
				if (!Static271.aClass144_65.method3900(Static271.aClass11_Sub4_Sub7_2.aString20 + "_staticelements")) {
					return;
				}
				Static271.aClass199_3 = Static33.method467(Static220.aBoolean298, Static271.aClass11_Sub4_Sub7_2.aString20 + "_staticelements", Static271.aClass144_65);
			} else {
				Static271.aClass199_3 = new Class199(0);
			}
			Static271.method3806();
			Static145.anInt2660 = 70;
			Static102.method1554(true);
			Static277.method4683();
		} else if (Static145.anInt2660 == 70) {
			Static306.aClass30_8 = new Class30(arg1, 11, true, Static34.aCanvas1);
			Static145.anInt2660 = 73;
			Static102.method1554(true);
			Static277.method4683();
		} else if (Static145.anInt2660 == 73) {
			Static124.aClass30_3 = new Class30(arg1, 12, true, Static34.aCanvas1);
			Static145.anInt2660 = 76;
			Static102.method1554(true);
			Static277.method4683();
		} else if (Static145.anInt2660 == 76) {
			Static16.aClass30_1 = new Class30(arg1, 14, true, Static34.aCanvas1);
			Static145.anInt2660 = 79;
			Static102.method1554(true);
			Static277.method4683();
		} else if (Static145.anInt2660 == 79) {
			Static237.aClass30_5 = new Class30(arg1, 17, true, Static34.aCanvas1);
			Static145.anInt2660 = 82;
			Static102.method1554(true);
			Static277.method4683();
		} else if (Static145.anInt2660 == 82) {
			Static71.aClass30_2 = new Class30(arg1, 19, true, Static34.aCanvas1);
			Static145.anInt2660 = 85;
			Static102.method1554(true);
			Static277.method4683();
		} else if (Static145.anInt2660 == 85) {
			Static287.aClass30_7 = new Class30(arg1, 22, true, Static34.aCanvas1);
			Static145.anInt2660 = 88;
			Static102.method1554(true);
			Static277.method4683();
		} else if (Static145.anInt2660 == 88) {
			Static221.aClass30_4 = new Class30(arg1, 26, true, Static34.aCanvas1);
			Static145.anInt2660 = 91;
			Static102.method1554(true);
			Static277.method4683();
		} else {
			Static244.aClass30_6 = new Class30(arg1, 30, true, Static34.aCanvas1);
			Static145.anInt2660 = 100;
			Static102.method1554(true);
			Static277.method4683();
			System.gc();
		}
	}
}
