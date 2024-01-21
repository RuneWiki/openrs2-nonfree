import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!m;")
	public static Class1_Sub1_Sub8_Sub2_Sub1 aClass1_Sub1_Sub8_Sub2_Sub1_37;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_51;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1207 = Static8.method128("Error connecting to server)3");

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1205 = aClass18_1207;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public static int anInt4661 = 0;

	@OriginalMember(owner = "client!bd", name = "F", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1209 = Static8.method128("World");

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1206 = aClass18_1209;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1208 = aClass18_1209;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "Lclient!pg;")
	public static Class59 aClass59_59 = new Class59();

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)I")
	public static int method3140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static145.method2766(arg0 - 1, arg1 - 1) + Static145.method2766(arg0 - 1, arg1 - -1) + Static145.method2766(arg0 + 1, arg1 + -1) + Static145.method2766(arg0 + 1, arg1 + 1);
		@Pc(79) int local79 = Static145.method2766(arg0, arg1 - 1) + Static145.method2766(arg0, arg1 + 1) + Static145.method2766(arg0 - 1, arg1) + Static145.method2766(arg0 + 1, arg1);
		@Pc(84) int local84 = Static145.method2766(arg0, arg1);
		return local79 / 8 + local42 / 16 + local84 / 4;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method3141() {
		Static104.aClass66_11.method2604();
		Static173.aClass66_26.method2604();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Lclient!n;")
	public static Class43 method3142() {
		try {
			return (Class43) Class.forName("Class43_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIZIIIIIII)Z")
	public static boolean method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static66.anIntArrayArray53[local7][local11] = 0;
				Static144.anIntArrayArray114[local7][local11] = 99999999;
			}
		}
		Static66.anIntArrayArray53[arg3][arg0] = 99;
		Static144.anIntArrayArray114[arg3][arg0] = 0;
		local11 = arg3;
		@Pc(49) int local49 = arg0;
		@Pc(51) int local51 = 0;
		@Pc(53) byte local53 = 0;
		Static125.anIntArray318[0] = arg3;
		@Pc(60) int local60 = local53 + 1;
		Static169.anIntArray419[0] = arg0;
		@Pc(65) int local65 = Static125.anIntArray318.length;
		@Pc(67) boolean local67 = false;
		@Pc(72) int[][] local72 = Static141.aClass22Array2[Static9.anInt295].anIntArrayArray45;
		@Pc(183) int local183;
		while (local60 != local51) {
			local11 = Static125.anIntArray318[local51];
			local49 = Static169.anIntArray419[local51];
			local51 = (local51 + 1) % local65;
			if (arg2 == local11 && arg9 == local49) {
				local67 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static141.aClass22Array2[Static9.anInt295].method1057(arg9, local11, arg2, local49, arg6 - 1, arg8)) {
					local67 = true;
					break;
				}
				if (arg6 < 10 && Static141.aClass22Array2[Static9.anInt295].method1055(arg8, local49, arg2, arg9, arg6 - 1, local11)) {
					local67 = true;
					break;
				}
			}
			if (arg10 != 0 && arg7 != 0 && Static141.aClass22Array2[Static9.anInt295].method1049(arg7, arg1, arg10, local11, local49, arg9, arg2)) {
				local67 = true;
				break;
			}
			local183 = Static144.anIntArrayArray114[local11][local49] + 1;
			if (local11 > 0 && Static66.anIntArrayArray53[local11 - 1][local49] == 0 && (local72[local11 - 1][local49] & 0x12C0108) == 0) {
				Static125.anIntArray318[local60] = local11 - 1;
				Static169.anIntArray419[local60] = local49;
				Static66.anIntArrayArray53[local11 - 1][local49] = 2;
				Static144.anIntArrayArray114[local11 - 1][local49] = local183;
				local60 = (local60 + 1) % local65;
			}
			if (local11 < 103 && Static66.anIntArrayArray53[local11 + 1][local49] == 0 && (local72[local11 + 1][local49] & 0x12C0180) == 0) {
				Static125.anIntArray318[local60] = local11 + 1;
				Static169.anIntArray419[local60] = local49;
				local60 = (local60 + 1) % local65;
				Static66.anIntArrayArray53[local11 + 1][local49] = 8;
				Static144.anIntArrayArray114[local11 + 1][local49] = local183;
			}
			if (local49 > 0 && Static66.anIntArrayArray53[local11][local49 - 1] == 0 && (local72[local11][local49 - 1] & 0x12C0102) == 0) {
				Static125.anIntArray318[local60] = local11;
				Static169.anIntArray419[local60] = local49 - 1;
				Static66.anIntArrayArray53[local11][local49 - 1] = 1;
				local60 = (local60 + 1) % local65;
				Static144.anIntArrayArray114[local11][local49 - 1] = local183;
			}
			if (local49 < 103 && Static66.anIntArrayArray53[local11][local49 + 1] == 0 && (local72[local11][local49 + 1] & 0x12C0120) == 0) {
				Static125.anIntArray318[local60] = local11;
				Static169.anIntArray419[local60] = local49 + 1;
				local60 = (local60 + 1) % local65;
				Static66.anIntArrayArray53[local11][local49 + 1] = 4;
				Static144.anIntArrayArray114[local11][local49 + 1] = local183;
			}
			if (local11 > 0 && local49 > 0 && Static66.anIntArrayArray53[local11 - 1][local49 - 1] == 0 && (local72[local11 - 1][local49 - 1] & 0x12C010E) == 0 && (local72[local11 - 1][local49] & 0x12C0108) == 0 && (local72[local11][local49 - 1] & 0x12C0102) == 0) {
				Static125.anIntArray318[local60] = local11 - 1;
				Static169.anIntArray419[local60] = local49 - 1;
				local60 = (local60 + 1) % local65;
				Static66.anIntArrayArray53[local11 - 1][local49 - 1] = 3;
				Static144.anIntArrayArray114[local11 - 1][local49 - 1] = local183;
			}
			if (local11 < 103 && local49 > 0 && Static66.anIntArrayArray53[local11 + 1][local49 - 1] == 0 && (local72[local11 + 1][local49 - 1] & 0x12C0183) == 0 && (local72[local11 + 1][local49] & 0x12C0180) == 0 && (local72[local11][local49 - 1] & 0x12C0102) == 0) {
				Static125.anIntArray318[local60] = local11 + 1;
				Static169.anIntArray419[local60] = local49 - 1;
				Static66.anIntArrayArray53[local11 + 1][local49 - 1] = 9;
				local60 = (local60 + 1) % local65;
				Static144.anIntArrayArray114[local11 + 1][local49 - 1] = local183;
			}
			if (local11 > 0 && local49 < 103 && Static66.anIntArrayArray53[local11 - 1][local49 + 1] == 0 && (local72[local11 - 1][local49 + 1] & 0x12C0138) == 0 && (local72[local11 - 1][local49] & 0x12C0108) == 0 && (local72[local11][local49 + 1] & 0x12C0120) == 0) {
				Static125.anIntArray318[local60] = local11 - 1;
				Static169.anIntArray419[local60] = local49 + 1;
				Static66.anIntArrayArray53[local11 - 1][local49 + 1] = 6;
				local60 = (local60 + 1) % local65;
				Static144.anIntArrayArray114[local11 - 1][local49 + 1] = local183;
			}
			if (local11 < 103 && local49 < 103 && Static66.anIntArrayArray53[local11 + 1][local49 + 1] == 0 && (local72[local11 + 1][local49 + 1] & 0x12C01E0) == 0 && (local72[local11 + 1][local49] & 0x12C0180) == 0 && (local72[local11][local49 + 1] & 0x12C0120) == 0) {
				Static125.anIntArray318[local60] = local11 + 1;
				Static169.anIntArray419[local60] = local49 + 1;
				Static66.anIntArrayArray53[local11 + 1][local49 + 1] = 12;
				Static144.anIntArrayArray114[local11 + 1][local49 + 1] = local183;
				local60 = (local60 + 1) % local65;
			}
		}
		Static51.anInt1671 = 0;
		@Pc(803) int local803;
		@Pc(810) int local810;
		@Pc(817) int local817;
		if (!local67) {
			if (!arg4) {
				return false;
			}
			local183 = 1000;
			local803 = 100;
			for (local810 = arg2 - 10; local810 <= arg2 + 10; local810++) {
				for (local817 = arg9 - 10; local817 <= arg9 + 10; local817++) {
					if (local810 >= 0 && local817 >= 0 && local810 < 104 && local817 < 104 && Static144.anIntArrayArray114[local810][local817] < 100) {
						@Pc(844) int local844 = 0;
						@Pc(846) int local846 = 0;
						if (arg9 > local817) {
							local846 = arg9 - local817;
						} else if (local817 > arg7 + arg9 - 1) {
							local846 = local817 + 1 - arg7 - arg9;
						}
						if (arg2 > local810) {
							local844 = arg2 - local810;
						} else if (local810 > arg10 + arg2 - 1) {
							local844 = local810 + 1 - arg10 - arg2;
						}
						@Pc(914) int local914 = local844 * local844 + local846 * local846;
						if (local183 > local914 || local183 == local914 && Static144.anIntArrayArray114[local810][local817] < local803) {
							local11 = local810;
							local49 = local817;
							local183 = local914;
							local803 = Static144.anIntArrayArray114[local810][local817];
						}
					}
				}
			}
			if (local183 == 1000) {
				return false;
			}
			if (local11 == arg3 && arg0 == local49) {
				return false;
			}
			Static51.anInt1671 = 1;
		}
		@Pc(992) byte local992 = 0;
		Static125.anIntArray318[0] = local11;
		local51 = local992 + 1;
		Static169.anIntArray419[0] = local49;
		local183 = local803 = Static66.anIntArrayArray53[local11][local49];
		while (local11 != arg3 || local49 != arg0) {
			if (local183 != local803) {
				Static125.anIntArray318[local51] = local11;
				Static169.anIntArray419[local51++] = local49;
				local803 = local183;
			}
			if ((local183 & 0x1) != 0) {
				local49++;
			} else if ((local183 & 0x4) != 0) {
				local49--;
			}
			if ((local183 & 0x2) != 0) {
				local11++;
			} else if ((local183 & 0x8) != 0) {
				local11--;
			}
			local183 = Static66.anIntArrayArray53[local11][local49];
		}
		if (local51 > 0) {
			local65 = local51;
			if (local51 > 25) {
				local65 = 25;
			}
			local51--;
			@Pc(1089) int local1089 = Static125.anIntArray318[local51];
			local810 = Static169.anIntArray419[local51];
			if (arg5 == 0) {
				Static95.aClass1_Sub6_Sub1_1.method555(46);
				Static95.aClass1_Sub6_Sub1_1.method530(local65 + local65 + 3);
			}
			if (arg5 == 1) {
				Static95.aClass1_Sub6_Sub1_1.method555(11);
				Static95.aClass1_Sub6_Sub1_1.method530(local65 + local65 + 17);
			}
			if (arg5 == 2) {
				Static95.aClass1_Sub6_Sub1_1.method555(59);
				Static95.aClass1_Sub6_Sub1_1.method530(local65 + local65 + 3);
			}
			Static161.anInt4393 = Static125.anIntArray318[0];
			Static166.anInt4506 = Static169.anIntArray419[0];
			for (local817 = 1; local817 < local65; local817++) {
				local51--;
				Static95.aClass1_Sub6_Sub1_1.method530(Static125.anIntArray318[local51] - local1089);
				Static95.aClass1_Sub6_Sub1_1.method512(Static169.anIntArray419[local51] - local810);
			}
			Static95.aClass1_Sub6_Sub1_1.method511(local1089 + Static117.anInt3328);
			Static95.aClass1_Sub6_Sub1_1.method528(local810 + Static110.anInt3227);
			Static95.aClass1_Sub6_Sub1_1.method530(Static45.aBooleanArray6[82] ? 1 : 0);
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	public static void method3144() {
		aClass18_1207 = null;
		aClass18_1205 = null;
		aClass18_1206 = null;
		aClass16_Sub1_51 = null;
		aClass59_59 = null;
		aClass18_1208 = null;
		aClass18_1209 = null;
		aClass1_Sub1_Sub8_Sub2_Sub1_37 = null;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public static void method3145() {
		if (!Static21.aBoolean19) {
			return;
		}
		@Pc(11) Class20 local11 = Static168.method3089(Static73.anInt1884, Static52.anInt1677);
		if (local11 != null && local11.anObjectArray12 != null) {
			@Pc(20) Class1_Sub10 local20 = new Class1_Sub10();
			local20.aClass20_6 = local11;
			local20.anObjectArray28 = local11.anObjectArray12;
			Static97.method2118(local20);
		}
		Static21.aBoolean19 = false;
		Static152.method2858(local11);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V")
	public static void method3146(@OriginalArg(1) boolean arg0) {
		if (Static97.aClass21_4 == null) {
			return;
		}
		try {
			@Pc(15) Class1_Sub6 local15 = new Class1_Sub6(4);
			local15.method530(arg0 ? 2 : 3);
			local15.method496(0);
			Static97.aClass21_4.method1024(local15.aByteArray3, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				Static97.aClass21_4.method1029();
			} catch (@Pc(41) Exception local41) {
			}
			Static97.aClass21_4 = null;
			Static122.anInt3468++;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!dd;)V")
	public static void method3148(@OriginalArg(1) Class16 arg0) {
		Static113.aClass16_32 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
	public static void method3149() {
		Static153.anIntArray390 = new int[151];
		Static2.anIntArray3 = new int[33];
		Static89.anIntArray238 = new int[151];
		Static144.anIntArray371 = new int[33];
		@Pc(25) int local25;
		@Pc(23) int local23;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 0;
			local25 = 999;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static69.aClass1_Sub1_Sub8_Sub1_2.aByteArray7[local27 + Static69.aClass1_Sub1_Sub8_Sub1_2.anInt1435 * local19] == 0) {
					if (local25 == 999) {
						local25 = local27;
					}
				} else if (local25 != 999) {
					local23 = local27;
					break;
				}
			}
			Static2.anIntArray3[local19] = local25;
			Static144.anIntArray371[local19] = local23 - local25;
		}
		for (local25 = 5; local25 < 156; local25++) {
			local23 = 999;
			local27 = 0;
			for (@Pc(95) int local95 = 25; local95 < 172; local95++) {
				if (Static69.aClass1_Sub1_Sub8_Sub1_2.aByteArray7[local95 + local25 * Static69.aClass1_Sub1_Sub8_Sub1_2.anInt1435] == 0 && (local95 > 34 || local25 > 34)) {
					if (local23 == 999) {
						local23 = local95;
					}
				} else if (local23 != 999) {
					local27 = local95;
					break;
				}
			}
			Static89.anIntArray238[local25 - 5] = local23 - 25;
			Static153.anIntArray390[local25 - 5] = local27 - local23;
		}
	}
}
