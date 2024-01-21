import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "Lclient!na;")
	public static Class1_Sub2_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "Lclient!wf;")
	public static Class31 aClass31_2;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Lclient!h;")
	public static Class30 aClass30_14 = new Class30();

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean119 = true;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1076 = Static120.method2057("level)2");

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1075 = aClass81_1076;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "[[[Lclient!h;")
	public static Class30[][][] aClass30ArrayArrayArray1 = new Class30[4][104][104];

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1077 = Static120.method2057("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "[I")
	public static int[] anIntArray322 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[250][];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!de;)V")
	public static void method2336(@OriginalArg(1) Class1_Sub2_Sub1_Sub3 arg0) {
		arg0.aBoolean121 = false;
		@Pc(18) Class1_Sub2_Sub18 local18;
		if (arg0.anInt3054 != -1) {
			local18 = Static73.method1277(arg0.anInt3054);
			if (local18 == null || local18.anIntArray396 == null) {
				arg0.anInt3054 = -1;
			} else {
				arg0.anInt3064++;
				if (arg0.anInt3046 < local18.anIntArray396.length && arg0.anInt3064 > local18.anIntArray394[arg0.anInt3046]) {
					arg0.anInt3064 = 1;
					arg0.anInt3046++;
					Static118.method2029(local18, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1 == arg0, arg0.anInt3026, arg0.anInt3040, arg0.anInt3046);
				}
				if (local18.anIntArray396.length <= arg0.anInt3046) {
					arg0.anInt3046 = 0;
					arg0.anInt3064 = 0;
					Static118.method2029(local18, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1 == arg0, arg0.anInt3026, arg0.anInt3040, arg0.anInt3046);
				}
			}
		}
		if (arg0.anInt3028 != -1 && arg0.anInt3044 <= Static142.anInt3104) {
			if (arg0.anInt3058 < 0) {
				arg0.anInt3058 = 0;
			}
			@Pc(138) int local138 = Static67.method1207(arg0.anInt3028).anInt1217;
			if (local138 == -1) {
				arg0.anInt3028 = -1;
			} else {
				@Pc(152) Class1_Sub2_Sub18 local152 = Static73.method1277(local138);
				if (local152 == null || local152.anIntArray396 == null) {
					arg0.anInt3028 = -1;
				} else {
					arg0.anInt3020++;
					if (local152.anIntArray396.length > arg0.anInt3058 && local152.anIntArray394[arg0.anInt3058] < arg0.anInt3020) {
						arg0.anInt3058++;
						arg0.anInt3020 = 1;
						Static118.method2029(local152, arg0 == Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1, arg0.anInt3026, arg0.anInt3040, arg0.anInt3058);
					}
					if (arg0.anInt3058 >= local152.anIntArray396.length) {
						arg0.anInt3028 = -1;
					}
				}
			}
		}
		if (arg0.anInt3024 != -1 && arg0.anInt3037 <= 1) {
			local18 = Static73.method1277(arg0.anInt3024);
			if (local18.anInt3788 == 1 && arg0.anInt3045 > 0 && arg0.anInt3029 <= Static142.anInt3104 && Static142.anInt3104 > arg0.anInt3038) {
				arg0.anInt3037 = 1;
				return;
			}
		}
		if (arg0.anInt3024 != -1 && arg0.anInt3037 == 0) {
			local18 = Static73.method1277(arg0.anInt3024);
			if (local18 == null || local18.anIntArray396 == null) {
				arg0.anInt3024 = -1;
			} else {
				arg0.anInt3008++;
				if (arg0.anInt3013 < local18.anIntArray396.length && local18.anIntArray394[arg0.anInt3013] < arg0.anInt3008) {
					arg0.anInt3013++;
					arg0.anInt3008 = 1;
					Static118.method2029(local18, arg0 == Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1, arg0.anInt3026, arg0.anInt3040, arg0.anInt3013);
				}
				if (local18.anIntArray396.length <= arg0.anInt3013) {
					arg0.anInt3013 -= local18.anInt3793;
					arg0.anInt3060++;
					if (arg0.anInt3060 >= local18.anInt3792) {
						arg0.anInt3024 = -1;
					} else if (arg0.anInt3013 >= 0 && arg0.anInt3013 < local18.anIntArray396.length) {
						Static118.method2029(local18, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1 == arg0, arg0.anInt3026, arg0.anInt3040, arg0.anInt3013);
					} else {
						arg0.anInt3024 = -1;
					}
				}
				arg0.aBoolean121 = local18.aBoolean156;
			}
		}
		if (arg0.anInt3037 > 0) {
			arg0.anInt3037--;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLclient!af;Z)V")
	public static void method2337(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub4 arg1) {
		@Pc(3) int local3 = (int) arg1.aLong148;
		@Pc(6) int local6 = arg1.anInt155;
		arg1.method3134();
		if (arg0) {
			Static120.method2062(local6);
		}
		Static1.method16(local6);
		@Pc(25) Class77 local25 = Static41.method800(local3);
		if (local25 != null) {
			Static51.method913(local25);
		}
		Static118.anInt2616 = 0;
		Static149.aBoolean145 = false;
		Static67.method1208(Static61.anInt1539, Static100.anInt2176, Static110.anInt2512, Static48.anInt3638);
		if (Static97.anInt2134 != -1) {
			Static162.method2839(1, Static97.anInt2134);
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public static void method2338() {
		aByteArrayArray7 = null;
		aClass81_1077 = null;
		anIntArray322 = null;
		aClass1_Sub2_Sub2_Sub2_Sub1_4 = null;
		aClass81_1075 = null;
		aClass30ArrayArrayArray1 = null;
		aClass31_2 = null;
		aClass81_1076 = null;
		aClass30_14 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZIIIIIIIIII)Z")
	public static boolean method2339(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = 0; local12 < 104; local12++) {
			for (local16 = 0; local16 < 104; local16++) {
				Static94.anIntArrayArray19[local12][local16] = 0;
				Static151.anIntArrayArray27[local12][local16] = 99999999;
			}
		}
		Static94.anIntArrayArray19[arg5][arg7] = 99;
		Static151.anIntArrayArray27[arg5][arg7] = 0;
		local16 = arg5;
		@Pc(58) int local58 = arg7;
		@Pc(60) byte local60 = 0;
		@Pc(62) int local62 = 0;
		Static184.anIntArray433[0] = arg5;
		@Pc(69) int local69 = local60 + 1;
		Static86.anIntArray218[0] = arg7;
		@Pc(74) int local74 = Static184.anIntArray433.length;
		@Pc(79) int[][] local79 = Static141.aClass28Array2[Static44.anInt1086].anIntArrayArray8;
		@Pc(81) boolean local81 = false;
		@Pc(200) int local200;
		while (local62 != local69) {
			local16 = Static184.anIntArray433[local62];
			local58 = Static86.anIntArray218[local62];
			local62 = (local62 + 1) % local74;
			if (local16 == arg6 && local58 == arg8) {
				local81 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static141.aClass28Array2[Static44.anInt1086].method1037(arg8, arg2, local58, arg9 - 1, local16, arg6)) {
					local81 = true;
					break;
				}
				if (arg9 < 10 && Static141.aClass28Array2[Static44.anInt1086].method1039(local58, local16, arg8, arg2, arg6, arg9 - 1)) {
					local81 = true;
					break;
				}
			}
			if (arg1 != 0 && arg4 != 0 && Static141.aClass28Array2[Static44.anInt1086].method1047(arg6, arg8, local58, arg4, arg1, arg10, local16)) {
				local81 = true;
				break;
			}
			local200 = Static151.anIntArrayArray27[local16][local58] + 1;
			if (local16 > 0 && Static94.anIntArrayArray19[local16 - 1][local58] == 0 && (local79[local16 - 1][local58] & 0x12C0108) == 0) {
				Static184.anIntArray433[local69] = local16 - 1;
				Static86.anIntArray218[local69] = local58;
				local69 = (local69 + 1) % local74;
				Static94.anIntArrayArray19[local16 - 1][local58] = 2;
				Static151.anIntArrayArray27[local16 - 1][local58] = local200;
			}
			if (local16 < 103 && Static94.anIntArrayArray19[local16 + 1][local58] == 0 && (local79[local16 + 1][local58] & 0x12C0180) == 0) {
				Static184.anIntArray433[local69] = local16 + 1;
				Static86.anIntArray218[local69] = local58;
				Static94.anIntArrayArray19[local16 + 1][local58] = 8;
				Static151.anIntArrayArray27[local16 + 1][local58] = local200;
				local69 = (local69 + 1) % local74;
			}
			if (local58 > 0 && Static94.anIntArrayArray19[local16][local58 - 1] == 0 && (local79[local16][local58 - 1] & 0x12C0102) == 0) {
				Static184.anIntArray433[local69] = local16;
				Static86.anIntArray218[local69] = local58 - 1;
				Static94.anIntArrayArray19[local16][local58 - 1] = 1;
				local69 = (local69 + 1) % local74;
				Static151.anIntArrayArray27[local16][local58 - 1] = local200;
			}
			if (local58 < 103 && Static94.anIntArrayArray19[local16][local58 + 1] == 0 && (local79[local16][local58 + 1] & 0x12C0120) == 0) {
				Static184.anIntArray433[local69] = local16;
				Static86.anIntArray218[local69] = local58 + 1;
				Static94.anIntArrayArray19[local16][local58 + 1] = 4;
				local69 = (local69 + 1) % local74;
				Static151.anIntArrayArray27[local16][local58 + 1] = local200;
			}
			if (local16 > 0 && local58 > 0 && Static94.anIntArrayArray19[local16 - 1][local58 - 1] == 0 && (local79[local16 - 1][local58 - 1] & 0x12C010E) == 0 && (local79[local16 - 1][local58] & 0x12C0108) == 0 && (local79[local16][local58 - 1] & 0x12C0102) == 0) {
				Static184.anIntArray433[local69] = local16 - 1;
				Static86.anIntArray218[local69] = local58 - 1;
				local69 = (local69 + 1) % local74;
				Static94.anIntArrayArray19[local16 - 1][local58 - 1] = 3;
				Static151.anIntArrayArray27[local16 - 1][local58 - 1] = local200;
			}
			if (local16 < 103 && local58 > 0 && Static94.anIntArrayArray19[local16 + 1][local58 - 1] == 0 && (local79[local16 + 1][local58 - 1] & 0x12C0183) == 0 && (local79[local16 + 1][local58] & 0x12C0180) == 0 && (local79[local16][local58 - 1] & 0x12C0102) == 0) {
				Static184.anIntArray433[local69] = local16 + 1;
				Static86.anIntArray218[local69] = local58 - 1;
				Static94.anIntArrayArray19[local16 + 1][local58 - 1] = 9;
				Static151.anIntArrayArray27[local16 + 1][local58 - 1] = local200;
				local69 = (local69 + 1) % local74;
			}
			if (local16 > 0 && local58 < 103 && Static94.anIntArrayArray19[local16 - 1][local58 + 1] == 0 && (local79[local16 - 1][local58 + 1] & 0x12C0138) == 0 && (local79[local16 - 1][local58] & 0x12C0108) == 0 && (local79[local16][local58 + 1] & 0x12C0120) == 0) {
				Static184.anIntArray433[local69] = local16 - 1;
				Static86.anIntArray218[local69] = local58 + 1;
				Static94.anIntArrayArray19[local16 - 1][local58 + 1] = 6;
				local69 = (local69 + 1) % local74;
				Static151.anIntArrayArray27[local16 - 1][local58 + 1] = local200;
			}
			if (local16 < 103 && local58 < 103 && Static94.anIntArrayArray19[local16 + 1][local58 + 1] == 0 && (local79[local16 + 1][local58 + 1] & 0x12C01E0) == 0 && (local79[local16 + 1][local58] & 0x12C0180) == 0 && (local79[local16][local58 + 1] & 0x12C0120) == 0) {
				Static184.anIntArray433[local69] = local16 + 1;
				Static86.anIntArray218[local69] = local58 + 1;
				local69 = (local69 + 1) % local74;
				Static94.anIntArrayArray19[local16 + 1][local58 + 1] = 12;
				Static151.anIntArrayArray27[local16 + 1][local58 + 1] = local200;
			}
		}
		Static37.anInt979 = 0;
		@Pc(821) int local821;
		@Pc(828) int local828;
		@Pc(835) int local835;
		if (!local81) {
			if (!arg0) {
				return false;
			}
			local200 = 1000;
			local821 = 100;
			for (local828 = arg6 - 10; local828 <= arg6 + 10; local828++) {
				for (local835 = arg8 - 10; local835 <= arg8 + 10; local835++) {
					if (local828 >= 0 && local835 >= 0 && local828 < 104 && local835 < 104 && Static151.anIntArrayArray27[local828][local835] < 100) {
						@Pc(860) int local860 = 0;
						if (arg8 > local835) {
							local860 = arg8 - local835;
						} else if (local835 > arg8 + arg4 - 1) {
							local860 = local835 + 1 - arg8 - arg4;
						}
						@Pc(888) int local888 = 0;
						if (arg6 > local828) {
							local888 = arg6 - local828;
						} else if (local828 > arg6 + arg1 - 1) {
							local888 = local828 + 1 - arg6 - arg1;
						}
						@Pc(927) int local927 = local888 * local888 + local860 * local860;
						if (local200 > local927 || local927 == local200 && local821 > Static151.anIntArrayArray27[local828][local835]) {
							local16 = local828;
							local200 = local927;
							local821 = Static151.anIntArrayArray27[local828][local835];
							local58 = local835;
						}
					}
				}
			}
			if (local200 == 1000) {
				return false;
			}
			if (local16 == arg5 && local58 == arg7) {
				return false;
			}
			Static37.anInt979 = 1;
		}
		@Pc(989) byte local989 = 0;
		Static184.anIntArray433[0] = local16;
		local62 = local989 + 1;
		Static86.anIntArray218[0] = local58;
		local200 = local821 = Static94.anIntArrayArray19[local16][local58];
		while (local16 != arg5 || arg7 != local58) {
			if (local200 != local821) {
				Static184.anIntArray433[local62] = local16;
				local821 = local200;
				Static86.anIntArray218[local62++] = local58;
			}
			if ((local200 & 0x1) != 0) {
				local58++;
			} else if ((local200 & 0x4) != 0) {
				local58--;
			}
			if ((local200 & 0x2) != 0) {
				local16++;
			} else if ((local200 & 0x8) != 0) {
				local16--;
			}
			local200 = Static94.anIntArrayArray19[local16][local58];
		}
		if (local62 > 0) {
			local74 = local62--;
			@Pc(1084) int local1084 = Static184.anIntArray433[local62];
			local828 = Static86.anIntArray218[local62];
			if (local74 > 25) {
				local74 = 25;
			}
			if (arg3 == 0) {
				Static104.aClass1_Sub8_Sub1_2.method366(179);
				Static104.aClass1_Sub8_Sub1_2.method331(local74 + local74 + 3);
			}
			if (arg3 == 1) {
				Static104.aClass1_Sub8_Sub1_2.method366(234);
				Static104.aClass1_Sub8_Sub1_2.method331(local74 + local74 + 17);
			}
			if (arg3 == 2) {
				Static104.aClass1_Sub8_Sub1_2.method366(76);
				Static104.aClass1_Sub8_Sub1_2.method331(local74 + local74 + 3);
			}
			Static135.anInt2049 = Static86.anIntArray218[0];
			Static37.anInt977 = Static184.anIntArray433[0];
			for (local835 = 1; local835 < local74; local835++) {
				local62--;
				Static104.aClass1_Sub8_Sub1_2.method331(Static184.anIntArray433[local62] - local1084);
				Static104.aClass1_Sub8_Sub1_2.method340(Static86.anIntArray218[local62] - local828);
			}
			Static104.aClass1_Sub8_Sub1_2.method318(Static51.anInt1219 + local1084);
			Static104.aClass1_Sub8_Sub1_2.method331(Static107.aBooleanArray13[82] ? 1 : 0);
			Static104.aClass1_Sub8_Sub1_2.method321(Static114.anInt2140 + local828);
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
