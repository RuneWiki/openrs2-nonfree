import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!e", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[8];

	@OriginalMember(owner = "client!e", name = "X", descriptor = "I")
	public static int anInt979 = 0;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "[I")
	public static int[] anIntArray77 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "Lclient!vb;")
	public static Class121 aClass121_2 = new Class121();

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_360 = Static186.method3527("blinken1:");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!gj;II)V")
	public static void method720(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub3_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13;
		if ((arg2 & 0x8) != 0) {
			local13 = Static97.aClass1_Sub17_Sub1_2.method2139();
			@Pc(16) byte[] local16 = new byte[local13];
			@Pc(21) Class1_Sub17 local21 = new Class1_Sub17(local16);
			Static97.aClass1_Sub17_Sub1_2.method2169(local16, local13);
			Static119.aClass1_Sub17Array1[arg0] = local21;
			arg1.method1092(local21);
		}
		@Pc(57) int local57;
		if ((arg2 & 0x80) != 0) {
			local13 = Static97.aClass1_Sub17_Sub1_2.method2149();
			if (local13 == 65535) {
				local13 = -1;
			}
			local57 = Static97.aClass1_Sub17_Sub1_2.method2142();
			Static170.method2814(local13, arg1, local57);
		}
		if ((arg2 & 0x40) != 0) {
			local13 = Static97.aClass1_Sub17_Sub1_2.method2149();
			local57 = Static97.aClass1_Sub17_Sub1_2.method2142();
			@Pc(82) int local82 = Static97.aClass1_Sub17_Sub1_2.method2139();
			@Pc(85) int local85 = Static97.aClass1_Sub17_Sub1_2.anInt2656;
			@Pc(93) boolean local93 = (local13 & 0x8000) != 0;
			if (arg1.aClass50_493 != null && arg1.aClass25_2 != null) {
				@Pc(104) long local104 = arg1.aClass50_493.method1221();
				@Pc(106) boolean local106 = false;
				if (local57 <= 1) {
					if (!local93 && (Static138.anInt2817 == 1 || anInt979 == 1)) {
						local106 = true;
					} else {
						for (@Pc(123) int local123 = 0; local123 < Static201.anInt4066; local123++) {
							if (local104 == Static118.aLongArray5[local123]) {
								local106 = true;
								break;
							}
						}
					}
				}
				if (!local106 && Static69.anInt1317 == 0) {
					Static221.aClass1_Sub17_5.anInt2656 = 0;
					Static97.aClass1_Sub17_Sub1_2.method2143(Static221.aClass1_Sub17_5.aByteArray40, local82);
					Static221.aClass1_Sub17_5.anInt2656 = 0;
					@Pc(162) int local162 = -1;
					@Pc(181) Class50 local181;
					if (local93) {
						local13 &= 0x7FFF;
						@Pc(172) Class80 local172 = Static152.method2547(Static221.aClass1_Sub17_5);
						local162 = local172.anInt3082;
						local181 = local172.aClass1_Sub1_Sub11_1.method1919(Static221.aClass1_Sub17_5);
					} else {
						local181 = Static154.method1824(Static146.method2476(Static221.aClass1_Sub17_5).method1228());
					}
					arg1.aClass50_1013 = local181.method1222();
					arg1.anInt3015 = local13 & 0xFF;
					arg1.anInt3066 = 150;
					arg1.anInt3032 = local13 >> 8;
					if (local57 == 2) {
						Static181.method2964(local181, local162, Static17.method257(new Class50[] { Static99.aClass50_1436, arg1.method1089() }), local93 ? 17 : 1, null);
					} else if (local57 == 1) {
						Static181.method2964(local181, local162, Static17.method257(new Class50[] { Static210.aClass50_1326, arg1.method1089() }), local93 ? 17 : 1, null);
					} else {
						Static181.method2964(local181, local162, arg1.method1089(), local93 ? 17 : 2, null);
					}
				}
			}
			Static97.aClass1_Sub17_Sub1_2.anInt2656 = local85 + local82;
		}
		if ((arg2 & 0x10) != 0) {
			arg1.anInt3010 = Static97.aClass1_Sub17_Sub1_2.method2134();
			if (arg1.anInt3010 == 65535) {
				arg1.anInt3010 = -1;
			}
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt3058 = Static97.aClass1_Sub17_Sub1_2.method2178();
			local13 = Static97.aClass1_Sub17_Sub1_2.method2123();
			arg1.anInt3045 = (local13 & 0xFFFF) + Static107.anInt2132;
			arg1.anInt3019 = 0;
			arg1.anInt3037 = local13 >> 16;
			if (arg1.anInt3058 == 65535) {
				arg1.anInt3058 = -1;
			}
			if (arg1.anInt3045 > Static107.anInt2132) {
				arg1.anInt3019 = -1;
			}
			arg1.anInt3025 = 0;
		}
		if ((arg2 & 0x4) != 0) {
			arg1.anInt3023 = Static97.aClass1_Sub17_Sub1_2.method2134();
			arg1.anInt3065 = Static97.aClass1_Sub17_Sub1_2.method2131();
		}
		if ((arg2 & 0x200) != 0) {
			local13 = Static97.aClass1_Sub17_Sub1_2.method2139();
			local57 = Static97.aClass1_Sub17_Sub1_2.method2129();
			arg1.method2469(local13, Static107.anInt2132, local57);
		}
		if ((arg2 & 0x20) != 0) {
			local13 = Static97.aClass1_Sub17_Sub1_2.method2129();
			local57 = Static97.aClass1_Sub17_Sub1_2.method2129();
			arg1.method2469(local13, Static107.anInt2132, local57);
			arg1.anInt3013 = Static107.anInt2132 + 300;
			arg1.anInt3056 = Static97.aClass1_Sub17_Sub1_2.method2142();
		}
		if ((arg2 & 0x1) != 0) {
			arg1.aClass50_1013 = Static97.aClass1_Sub17_Sub1_2.method2125();
			if (arg1.aClass50_1013.method1241(0) == 126) {
				arg1.aClass50_1013 = arg1.aClass50_1013.method1244(1);
				Static123.method1275(arg1.aClass50_1013, arg1.method1089(), 2);
			} else if (arg1 == Static230.aClass20_Sub3_Sub1_3) {
				Static123.method1275(arg1.aClass50_1013, arg1.method1089(), 2);
			}
			arg1.anInt3015 = 0;
			arg1.anInt3066 = 150;
			arg1.anInt3032 = 0;
		}
		if ((arg2 & 0x100) == 0) {
			return;
		}
		arg1.anInt3049 = Static97.aClass1_Sub17_Sub1_2.method2129();
		arg1.anInt3059 = Static97.aClass1_Sub17_Sub1_2.method2139();
		arg1.anInt3017 = Static97.aClass1_Sub17_Sub1_2.method2139();
		arg1.anInt3063 = Static97.aClass1_Sub17_Sub1_2.method2139();
		arg1.anInt3028 = Static97.aClass1_Sub17_Sub1_2.method2178() + Static107.anInt2132;
		arg1.anInt3030 = Static97.aClass1_Sub17_Sub1_2.method2131() + Static107.anInt2132;
		arg1.anInt3031 = Static97.aClass1_Sub17_Sub1_2.method2139();
		arg1.anInt3009 = 0;
		arg1.anInt3041 = 1;
	}
}
