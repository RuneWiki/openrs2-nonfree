import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "[Lclient!rc;")
	public static Class3_Sub1_Sub1_Sub3[] aClass3_Sub1_Sub1_Sub3Array5;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!mb;")
	public static Class42 aClass42_66;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!v;")
	private static Class62 aClass62_1112 = Static45.method753("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt2469 = 0;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!v;")
	public static Class62 aClass62_1113 = aClass62_1112;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_1114 = Static45.method753(": ");

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!v;")
	private static Class62 aClass62_1117 = Static45.method753(" has logged in)3");

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!v;")
	public static Class62 aClass62_1115 = aClass62_1117;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!v;")
	public static Class62 aClass62_1116 = Static45.method753("Hierhin gehen");

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Lclient!v;")
	public static Class62 aClass62_1118 = Static45.method753(":  ");

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!v;")
	public static Class62 aClass62_1119 = Static45.method753("@cya@");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!bd;)V")
	public static void method1576(@OriginalArg(1) Class3_Sub1_Sub3_Sub1 arg0) {
		arg0.anInt1854 = arg0.anInt1847;
		if (arg0.anInt1838 == 0) {
			arg0.anInt1881 = 0;
			return;
		}
		if (arg0.anInt1868 != -1 && arg0.anInt1843 == 0) {
			@Pc(32) Class3_Sub1_Sub11 local32 = Static41.method705(arg0.anInt1868);
			if (arg0.anInt1855 > 0 && local32.anInt2018 == 0) {
				arg0.anInt1881++;
				return;
			}
			if (arg0.anInt1855 <= 0 && local32.anInt2014 == 0) {
				arg0.anInt1881++;
				return;
			}
		}
		@Pc(70) int local70 = arg0.anInt1882;
		@Pc(73) int local73 = arg0.anInt1887;
		@Pc(89) int local89 = arg0.anIntArray194[arg0.anInt1838 - 1] * 128 + arg0.anInt1861 * 64;
		@Pc(104) int local104 = arg0.anInt1861 * 64 + arg0.anIntArray195[arg0.anInt1838 - 1] * 128;
		if (local89 - local70 > 256 || local89 - local70 < -256 || local104 - local73 > 256 || local104 - local73 < -256) {
			arg0.anInt1882 = local89;
			arg0.anInt1887 = local104;
			return;
		}
		if (local70 < local89) {
			if (local73 < local104) {
				arg0.anInt1834 = 1280;
			} else if (local73 <= local104) {
				arg0.anInt1834 = 1536;
			} else {
				arg0.anInt1834 = 1792;
			}
		} else if (local70 <= local89) {
			if (local73 >= local104) {
				arg0.anInt1834 = 0;
			} else {
				arg0.anInt1834 = 1024;
			}
		} else if (local73 < local104) {
			arg0.anInt1834 = 768;
		} else if (local104 < local73) {
			arg0.anInt1834 = 256;
		} else {
			arg0.anInt1834 = 512;
		}
		@Pc(217) int local217 = arg0.anInt1834 - arg0.anInt1849 & 0x7FF;
		if (local217 > 1024) {
			local217 -= 2048;
		}
		@Pc(224) int local224 = arg0.anInt1836;
		if (local217 >= -256 && local217 <= 256) {
			local224 = arg0.anInt1833;
		} else if (local217 >= 256 && local217 < 768) {
			local224 = arg0.anInt1846;
		} else if (local217 >= -768 && local217 <= -256) {
			local224 = arg0.anInt1879;
		}
		if (local224 == -1) {
			local224 = arg0.anInt1833;
		}
		@Pc(273) int local273 = 4;
		if (arg0.anInt1834 != arg0.anInt1849 && arg0.anInt1867 == -1 && arg0.anInt1844 != 0) {
			local273 = 2;
		}
		arg0.anInt1854 = local224;
		if (arg0.anInt1838 > 2) {
			local273 = 6;
		}
		if (arg0.anInt1838 > 3) {
			local273 = 8;
		}
		if (arg0.anInt1881 > 0 && arg0.anInt1838 > 1) {
			local273 = 8;
			arg0.anInt1881--;
		}
		if (arg0.aBooleanArray8[arg0.anInt1838 - 1]) {
			local273 <<= 0x1;
		}
		if (local73 < local104) {
			arg0.anInt1887 += local273;
			if (arg0.anInt1887 > local104) {
				arg0.anInt1887 = local104;
			}
		} else if (local104 < local73) {
			arg0.anInt1887 -= local273;
			if (arg0.anInt1887 < local104) {
				arg0.anInt1887 = local104;
			}
		}
		if (local89 > local70) {
			arg0.anInt1882 += local273;
			if (arg0.anInt1882 > local89) {
				arg0.anInt1882 = local89;
			}
		} else if (local70 > local89) {
			arg0.anInt1882 -= local273;
			if (local89 > arg0.anInt1882) {
				arg0.anInt1882 = local89;
			}
		}
		if (local89 == arg0.anInt1882 && local104 == arg0.anInt1887) {
			if (arg0.anInt1855 > 0) {
				arg0.anInt1855--;
			}
			arg0.anInt1838--;
		}
		if (local273 >= 8 && arg0.anInt1854 == arg0.anInt1833 && arg0.anInt1869 != -1) {
			arg0.anInt1854 = arg0.anInt1869;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
	public static void method1580(@OriginalArg(0) int arg0) {
		if (!Static45.method754()) {
			return;
		}
		if (Static79.aBoolean124) {
			Static7.anInt214 = arg0;
		} else {
			Static72.method1182(arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public static void method1582() {
		Static27.aByteArrayArrayArray5 = new byte[4][104][104];
		Static83.anIntArray45 = new int[104];
		Static93.anIntArray273 = new int[104];
		Static10.aByteArrayArrayArray11 = new byte[4][104][104];
		Static16.aByteArrayArrayArray3 = new byte[4][104][104];
		Static40.anIntArrayArray7 = new int[105][105];
		Static109.anIntArray319 = new int[104];
		Static20.anIntArray55 = new int[104];
		Static78.anInt2069 = 99;
		Static20.aByteArrayArrayArray4 = new byte[4][105][105];
		Static72.anIntArrayArrayArray3 = new int[4][105][105];
		Static59.anIntArray168 = new int[104];
		aByteArrayArrayArray15 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	public static void method1583() {
		aClass62_1116 = null;
		aByteArrayArrayArray15 = null;
		aClass62_1112 = null;
		aClass62_1119 = null;
		aClass62_1118 = null;
		aClass42_66 = null;
		anIntArray272 = null;
		aClass62_1113 = null;
		aClass62_1117 = null;
		aClass62_1114 = null;
		aClass62_1115 = null;
		aClass3_Sub1_Sub1_Sub3Array5 = null;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IB)I")
	public static int method1585(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub1_Sub12 local13 = Static56.method926(arg0);
		@Pc(16) int local16 = local13.anInt2057;
		@Pc(19) int local19 = local13.anInt2047;
		@Pc(22) int local22 = local13.anInt2054;
		@Pc(29) int local29 = Class51.anIntArray224[local19 - local22];
		return local29 & Static62.anIntArray174[local16] >> local22;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V")
	public static void method1587(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static99.aClass3_Sub1_Sub1_Sub4_5.anIntArray306;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local39 = (103 - local25) * 512 * 4 + 24628;
			for (local41 = 1; local41 < 103; local41++) {
				if ((Static44.aByteArrayArrayArray6[arg0][local41][local25] & 0x18) == 0) {
					Static76.aClass1_1.method30(local8, local39, arg0, local41, local25);
				}
				if (arg0 < 3 && (Static44.aByteArrayArrayArray6[arg0 + 1][local41][local25] & 0x8) != 0) {
					Static76.aClass1_1.method30(local8, local39, arg0 + 1, local41, local25);
				}
				local39 += 4;
			}
		}
		Static99.aClass3_Sub1_Sub1_Sub4_5.method1745();
		local39 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10;
		local41 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(146) int local146;
		for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
			for (local146 = 1; local146 < 103; local146++) {
				if ((Static44.aByteArrayArrayArray6[arg0][local146][local142] & 0x18) == 0) {
					Static75.method1227(arg0, local146, local142, local39, local41);
				}
				if (arg0 < 3 && (Static44.aByteArrayArrayArray6[arg0 + 1][local146][local142] & 0x8) != 0) {
					Static75.method1227(arg0 + 1, local146, local142, local39, local41);
				}
			}
		}
		Static37.anInt1124 = 0;
		for (local146 = 0; local146 < 104; local146++) {
			for (@Pc(212) int local212 = 0; local212 < 104; local212++) {
				@Pc(220) int local220 = Static76.aClass1_1.method3(Static27.anInt818, local146, local212);
				if (local220 != 0) {
					local220 = local220 >> 14 & 0x7FFF;
					@Pc(236) int local236 = Static10.method1322(local220).anInt1067;
					if (local236 >= 0) {
						@Pc(243) int local243 = local146;
						@Pc(245) int local245 = local212;
						if (local236 != 22 && local236 != 29 && local236 != 34 && local236 != 36 && local236 != 46 && local236 != 47 && local236 != 48) {
							@Pc(279) int[][] local279 = Static32.aClass11Array1[Static27.anInt818].anIntArrayArray3;
							for (@Pc(281) int local281 = 0; local281 < 10; local281++) {
								@Pc(288) int local288 = (int) (Math.random() * 4.0D);
								if (local288 == 0 && local243 > 0 && local243 > local146 - 3 && (local279[local243 - 1][local245] & 0x1280108) == 0) {
									local243--;
								}
								if (local288 == 1 && local243 < 103 && local146 + 3 > local243 && (local279[local243 + 1][local245] & 0x1280180) == 0) {
									local243++;
								}
								if (local288 == 2 && local245 > 0 && local245 > local212 - 3 && (local279[local243][local245 - 1] & 0x1280102) == 0) {
									local245--;
								}
								if (local288 == 3 && local245 < 103 && local212 + 3 > local245 && (local279[local243][local245 + 1] & 0x1280120) == 0) {
									local245++;
								}
							}
						}
						Static76.aClass3_Sub1_Sub1_Sub4Array42[Static37.anInt1124] = Static61.aClass3_Sub1_Sub1_Sub4Array35[local236];
						Static92.anIntArray269[Static37.anInt1124] = local243;
						Static49.anIntArray111[Static37.anInt1124] = local245;
						Static37.anInt1124++;
					}
				}
			}
		}
	}
}
