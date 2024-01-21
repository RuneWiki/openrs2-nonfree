import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public static int anInt340;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	public static volatile int anInt337 = 0;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_99 = Static151.method2243("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_100 = Static151.method2243("k");

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public static int anInt339 = 0;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[5][5000];

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_101 = Static151.method2243("(Z");

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method236() {
		for (@Pc(7) int local7 = 0; local7 < Static196.anInt4032; local7++) {
			@Pc(13) int local13 = Static187.anIntArray355[local7];
			@Pc(17) Class7_Sub2_Sub1 local17 = Static9.aClass7_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = Static108.aClass2_Sub11_Sub1_3.method1534();
			@Pc(32) int local32;
			@Pc(36) int local36;
			if ((local21 & 0x1) != 0) {
				local32 = Static108.aClass2_Sub11_Sub1_3.method1529();
				local36 = Static108.aClass2_Sub11_Sub1_3.method1529();
				local17.method2171(local32, Static25.anInt581, local36);
			}
			if ((local21 & 0x80) != 0) {
				local32 = Static108.aClass2_Sub11_Sub1_3.method1562();
				if (local32 == 65535) {
					local32 = -1;
				}
				local36 = Static108.aClass2_Sub11_Sub1_3.method1534();
				if (local32 == local17.anInt3062 && local32 != -1) {
					@Pc(77) Class2_Sub1_Sub25 local77 = Static90.method27(local32);
					@Pc(80) int local80 = local77.anInt4373;
					if (local80 == 1) {
						local17.anInt3066 = 0;
						local17.anInt3075 = local36;
						local17.anInt3044 = 0;
						local17.anInt3055 = 0;
						Static153.method2281(local17.anInt3066, local77, local17.anInt3046, false, local17.anInt3085);
					}
					if (local80 == 2) {
						local17.anInt3044 = 0;
					}
				} else if (local32 == -1 || local17.anInt3062 == -1 || Static90.method27(local32).anInt4372 >= Static90.method27(local17.anInt3062).anInt4372) {
					local17.anInt3062 = local32;
					local17.anInt3044 = 0;
					local17.anInt3066 = 0;
					local17.anInt3086 = local17.anInt3064;
					local17.anInt3055 = 0;
					local17.anInt3075 = local36;
					if (local17.anInt3062 != -1) {
						Static153.method2281(local17.anInt3066, Static90.method27(local17.anInt3062), local17.anInt3046, false, local17.anInt3085);
					}
				}
			}
			if ((local21 & 0x10) != 0) {
				local32 = Static108.aClass2_Sub11_Sub1_3.method1534();
				local36 = Static108.aClass2_Sub11_Sub1_3.method1550();
				local17.method2171(local32, Static25.anInt581, local36);
				local17.anInt3045 = Static25.anInt581 + 300;
				local17.anInt3065 = Static108.aClass2_Sub11_Sub1_3.method1534();
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt3052 = Static108.aClass2_Sub11_Sub1_3.method1548();
				local17.anInt3083 = Static108.aClass2_Sub11_Sub1_3.method1562();
			}
			if ((local21 & 0x20) != 0) {
				local17.aClass2_Sub1_Sub20_1 = Static170.method2500(Static108.aClass2_Sub11_Sub1_3.method1562());
				local17.anInt3074 = local17.aClass2_Sub1_Sub20_1.anInt3560;
				local17.anInt3068 = local17.aClass2_Sub1_Sub20_1.anInt3564;
				local17.anInt3077 = local17.aClass2_Sub1_Sub20_1.anInt3544;
				local17.anInt3082 = local17.aClass2_Sub1_Sub20_1.anInt3546;
				local17.anInt3054 = local17.aClass2_Sub1_Sub20_1.anInt3554;
				local17.anInt3095 = local17.aClass2_Sub1_Sub20_1.anInt3541;
				local17.anInt3072 = local17.aClass2_Sub1_Sub20_1.anInt3543;
				local17.anInt3048 = local17.aClass2_Sub1_Sub20_1.anInt3558;
				local17.anInt3088 = local17.aClass2_Sub1_Sub20_1.anInt3545;
			}
			if ((local21 & 0x40) != 0) {
				local17.aClass62_1066 = Static108.aClass2_Sub11_Sub1_3.method1538();
				local17.anInt3090 = 100;
			}
			if ((local21 & 0x4) != 0) {
				local17.anInt3067 = Static108.aClass2_Sub11_Sub1_3.method1571();
				if (local17.anInt3067 == 65535) {
					local17.anInt3067 = -1;
				}
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt3091 = Static108.aClass2_Sub11_Sub1_3.method1548();
				local32 = Static108.aClass2_Sub11_Sub1_3.method1566();
				local17.anInt3070 = (local32 & 0xFFFF) + Static25.anInt581;
				local17.anInt3078 = 0;
				if (local17.anInt3091 == 65535) {
					local17.anInt3091 = -1;
				}
				local17.anInt3079 = local32 >> 16;
				local17.anInt3099 = 0;
				if (local17.anInt3070 > Static25.anInt581) {
					local17.anInt3099 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
	public static void method238(@OriginalArg(0) int arg0) {
		Static51.method767();
		Static6.method126();
		@Pc(10) int local10 = Static125.method1956(arg0).anInt3157;
		if (local10 == 0) {
			return;
		}
		@Pc(21) int local21 = Static71.anIntArray123[arg0];
		if (local10 == 1) {
			Static161.anInt3417 = local21;
			if (Static161.anInt3417 == 1) {
				Static45.method710(0.9F);
			}
			if (Static161.anInt3417 == 2) {
				Static45.method710(0.8F);
			}
			if (Static161.anInt3417 == 3) {
				Static45.method710(0.7F);
			}
			if (Static161.anInt3417 == 4) {
				Static45.method710(0.6F);
			}
			Static163.method2392();
		}
		if (local10 == 3) {
			@Pc(63) short local63 = 0;
			if (local21 == 0) {
				local63 = 255;
			}
			if (local21 == 1) {
				local63 = 192;
			}
			if (local21 == 2) {
				local63 = 128;
			}
			if (local21 == 3) {
				local63 = 64;
			}
			if (local21 == 4) {
				local63 = 0;
			}
			if (Static95.anInt2134 != local63) {
				if (Static95.anInt2134 == 0 && Static164.anInt3460 != -1) {
					Static78.method1104(local63, Static63.aClass71_Sub1_5, Static164.anInt3460);
					Static164.aBoolean148 = false;
				} else if (local63 == 0) {
					Static184.method1386();
					Static164.aBoolean148 = false;
				} else {
					Static186.method2665(local63);
				}
				Static95.anInt2134 = local63;
			}
		}
		if (local10 == 4) {
			if (local21 == 0) {
				Static181.anInt3784 = 127;
			}
			if (local21 == 1) {
				Static181.anInt3784 = 96;
			}
			if (local21 == 2) {
				Static181.anInt3784 = 64;
			}
			if (local21 == 3) {
				Static181.anInt3784 = 32;
			}
			if (local21 == 4) {
				Static181.anInt3784 = 0;
			}
		}
		if (local10 == 5) {
			Static13.anInt329 = local21;
		}
		if (local10 == 10) {
			if (local21 == 0) {
				Static81.anInt4473 = 127;
			}
			if (local21 == 1) {
				Static81.anInt4473 = 96;
			}
			if (local21 == 2) {
				Static81.anInt4473 = 64;
			}
			if (local21 == 3) {
				Static81.anInt4473 = 32;
			}
			if (local21 == 4) {
				Static81.anInt4473 = 0;
			}
		}
		if (local10 == 9) {
			Static127.anInt2814 = local21;
		}
		if (local10 == 6) {
			Static39.anInt4456 = local21;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	public static int method239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local13 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local13;
		} else {
			return local13;
		}
	}
}
