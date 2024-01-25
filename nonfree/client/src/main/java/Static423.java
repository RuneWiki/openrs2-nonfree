import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!oha", name = "i", descriptor = "Lclient!da;")
	public static Class19 aClass19_9;

	@OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
	public static int anInt7315;

	@OriginalMember(owner = "client!oha", name = "g", descriptor = "S")
	public static short aShort84 = 32767;

	@OriginalMember(owner = "client!oha", name = "o", descriptor = "I")
	public static int anInt7313 = 0;

	@OriginalMember(owner = "client!oha", name = "v", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lclient!ae;Lclient!ae;Lclient!ae;BLclient!ae;)V")
	public static void method6278(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(4) Class8 arg3) {
		Static140.aClass8_44 = arg1;
		Static465.aClass8_113 = arg2;
		Static582.aClass8_127 = arg0;
		Static109.aClass321ArrayArray1 = new Class321[Static582.aClass8_127.method279()][];
		Static643.aBooleanArray35 = new boolean[Static582.aClass8_127.method279()];
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V")
	public static void method6279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 17);
		local9.method7976();
		local9.anInt9466 = arg1;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZLclient!d;Lclient!ha;)V")
	public static void method6281(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) Class132 arg1) {
		if (Static528.aClass6_Sub4_Sub20_2 == null) {
			return;
		}
		if (Static115.anInt2066 < 10) {
			if (!Static528.aClass8_88.method250(Static528.aClass6_Sub4_Sub20_2.aString152)) {
				Static115.anInt2066 = Static663.aClass8_136.method281(Static528.aClass6_Sub4_Sub20_2.aString152) / 10;
				return;
			}
			Static633.method8700();
			Static115.anInt2066 = 10;
		}
		if (Static115.anInt2066 == 10) {
			Static528.anInt5366 = Static528.aClass6_Sub4_Sub20_2.anInt10634 >> 6 << 6;
			Static528.anInt5361 = Static528.aClass6_Sub4_Sub20_2.anInt10635 >> 6 << 6;
			Static528.anInt5369 = (Static528.aClass6_Sub4_Sub20_2.anInt10644 >> 6 << 6) + 64 - Static528.anInt5366;
			Static528.anInt5364 = (Static528.aClass6_Sub4_Sub20_2.anInt10641 >> 6 << 6) + 64 - Static528.anInt5361;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static528.aClass6_Sub4_Sub20_2.method9026(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, Static534.anInt8753 + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 >> 9), local78, Static234.anInt4239 + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 >> 9))) {
				local82 = local78[2] - Static528.anInt5366;
				local80 = local78[1] - Static528.anInt5361;
			}
			if (!Static86.aBoolean107 && local80 >= 0 && local80 < Static528.anInt5364 && local82 >= 0 && local82 < Static528.anInt5369) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static490.anInt8337 = local82;
				Static417.anInt7258 = local80;
			} else if (Static425.anInt7330 == -1 || Static477.anInt8197 == -1) {
				Static528.aClass6_Sub4_Sub20_2.method9022(local78, Static528.aClass6_Sub4_Sub20_2.anInt10631 & 0x3FFF, Static528.aClass6_Sub4_Sub20_2.anInt10631 >> 14 & 0x3FFF);
				Static417.anInt7258 = local78[1] - Static528.anInt5361;
				Static490.anInt8337 = local78[2] - Static528.anInt5366;
			} else {
				Static528.aClass6_Sub4_Sub20_2.method9022(local78, Static477.anInt8197, Static425.anInt7330);
				Static477.anInt8197 = -1;
				Static425.anInt7330 = -1;
				Static86.aBoolean107 = false;
				if (local78 != null) {
					Static417.anInt7258 = local78[1] - Static528.anInt5361;
					Static490.anInt8337 = local78[2] - Static528.anInt5366;
				}
			}
			if (Static528.aClass6_Sub4_Sub20_2.anInt10630 == 37) {
				Static528.aFloat39 = 3.0F;
				Static528.aFloat40 = 3.0F;
			} else if (Static528.aClass6_Sub4_Sub20_2.anInt10630 == 50) {
				Static528.aFloat39 = 4.0F;
				Static528.aFloat40 = 4.0F;
			} else if (Static528.aClass6_Sub4_Sub20_2.anInt10630 == 75) {
				Static528.aFloat39 = 6.0F;
				Static528.aFloat40 = 6.0F;
			} else if (Static528.aClass6_Sub4_Sub20_2.anInt10630 == 100) {
				Static528.aFloat39 = 8.0F;
				Static528.aFloat40 = 8.0F;
			} else if (Static528.aClass6_Sub4_Sub20_2.anInt10630 == 200) {
				Static528.aFloat39 = 16.0F;
				Static528.aFloat40 = 16.0F;
			} else {
				Static528.aFloat39 = 8.0F;
				Static528.aFloat40 = 8.0F;
			}
			Static528.anInt5356 = (int) Static528.aFloat39 >> 1;
			Static528.aByteArrayArrayArray6 = Static292.method4192(Static528.anInt5356);
			Static524.method7853();
			Static528.method4550();
			Static473.aClass362_54 = new Class362();
			Static528.anInt5358 += (int) (Math.random() * 5.0D) - 2;
			if (Static528.anInt5358 < -8) {
				Static528.anInt5358 = -8;
			}
			Static528.anInt5357 += (int) (Math.random() * 5.0D) - 2;
			if (Static528.anInt5358 > 8) {
				Static528.anInt5358 = 8;
			}
			if (Static528.anInt5357 < -16) {
				Static528.anInt5357 = -16;
			}
			if (Static528.anInt5357 > 16) {
				Static528.anInt5357 = 16;
			}
			Static528.method4541(arg0, Static528.anInt5358 >> 2 << 10, Static528.anInt5357 >> 1);
			Static528.aClass280_3.method6915(256, 1024);
			Static528.aClass186_2.method4237(256, 256);
			Static528.aClass88_2.method2026(4096);
			Static439.aClass372_1.method8723(256);
			Static115.anInt2066 = 20;
		} else if (Static115.anInt2066 == 20) {
			Static507.method7241(true);
			Static528.method4532(arg1, Static528.anInt5358, Static528.anInt5357);
			Static115.anInt2066 = 60;
			Static507.method7241(true);
			Static378.method6991();
		} else if (Static115.anInt2066 == 60) {
			if (Static528.aClass8_88.method258(Static528.aClass6_Sub4_Sub20_2.aString152 + "_staticelements")) {
				if (!Static528.aClass8_88.method250(Static528.aClass6_Sub4_Sub20_2.aString152 + "_staticelements")) {
					return;
				}
				Static528.aClass17_3 = Static669.method9074(Static528.aClass8_88, Static618.aBoolean707, Static528.aClass6_Sub4_Sub20_2.aString152 + "_staticelements");
			} else {
				Static528.aClass17_3 = new Class17(0);
			}
			Static528.method4548();
			Static115.anInt2066 = 70;
			Static507.method7241(true);
			Static378.method6991();
		} else if (Static115.anInt2066 == 70) {
			Static161.aClass81_4 = new Class81(arg1, 11, true, Static140.aCanvas1);
			Static115.anInt2066 = 73;
			Static507.method7241(true);
			Static378.method6991();
		} else if (Static115.anInt2066 == 73) {
			Static62.aClass81_1 = new Class81(arg1, 12, true, Static140.aCanvas1);
			Static115.anInt2066 = 76;
			Static507.method7241(true);
			Static378.method6991();
		} else if (Static115.anInt2066 == 76) {
			Static560.aClass81_3 = new Class81(arg1, 14, true, Static140.aCanvas1);
			Static115.anInt2066 = 79;
			Static507.method7241(true);
			Static378.method6991();
		} else if (Static115.anInt2066 == 79) {
			Static185.aClass81_5 = new Class81(arg1, 17, true, Static140.aCanvas1);
			Static115.anInt2066 = 82;
			Static507.method7241(true);
			Static378.method6991();
		} else if (Static115.anInt2066 == 82) {
			Static363.aClass81_8 = new Class81(arg1, 19, true, Static140.aCanvas1);
			Static115.anInt2066 = 85;
			Static507.method7241(true);
			Static378.method6991();
		} else if (Static115.anInt2066 == 85) {
			Static232.aClass81_6 = new Class81(arg1, 22, true, Static140.aCanvas1);
			Static115.anInt2066 = 88;
			Static507.method7241(true);
			Static378.method6991();
		} else if (Static115.anInt2066 == 88) {
			Static527.aClass81_9 = new Class81(arg1, 26, true, Static140.aCanvas1);
			Static115.anInt2066 = 91;
			Static507.method7241(true);
			Static378.method6991();
		} else {
			Static326.aClass81_7 = new Class81(arg1, 30, true, Static140.aCanvas1);
			Static115.anInt2066 = 100;
			Static507.method7241(true);
			Static378.method6991();
			System.gc();
		}
	}
}
