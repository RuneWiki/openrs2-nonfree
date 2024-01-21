import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "[Lclient!qf;")
	public static Class77[] aClass77Array2;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1358 = Static120.method1824("Loading wordpack )2 ");

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	public static int anInt3500 = 0;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	public static int anInt3501 = -1;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	public static int anInt3502 = 0;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1359 = aClass80_1358;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "[Lclient!nf;")
	public static final Class64[] aClass64Array1 = new Class64[6];

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	public static int anInt3506 = 0;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Z")
	public static final boolean aBoolean144 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] method2499() {
		@Pc(4) Class3_Sub1_Sub4_Sub1[] local4 = new Class3_Sub1_Sub4_Sub1[Static64.anInt1391];
		for (@Pc(11) int local11 = 0; local11 < Static64.anInt1391; local11++) {
			@Pc(17) Class3_Sub1_Sub4_Sub1 local17 = new Class3_Sub1_Sub4_Sub1();
			local17.anInt822 = Static175.anInt3951;
			local17.anInt820 = Static147.anInt3287;
			local17.anInt817 = Static49.anIntArray152[local11];
			local17.anInt821 = Static17.anIntArray64[local11];
			local17.anInt819 = Static86.anIntArray220[local11];
			local17.anInt818 = Static27.anIntArray523[local11];
			local17.anIntArray108 = Static101.anIntArray288;
			local17.aByteArray2 = Static167.aByteArrayArray10[local11];
			local4[local11] = local17;
		}
		Static164.method2645();
		return local4;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLclient!ph;I)V")
	public static void method2500(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub20 arg1) {
		@Pc(7) int local7 = (int) arg1.aLong154;
		@Pc(10) int local10 = arg1.anInt2996;
		arg1.method3159();
		if (arg0) {
			Static44.method681(local10);
		}
		Static152.method2423(local10);
		@Pc(25) Class77 local25 = Static92.method2208(local7);
		if (local25 != null) {
			Static186.method3014(local25);
		}
		Static173.anInt3892 = 0;
		Static148.aBoolean134 = false;
		Static89.method1311(Static191.anInt4389, Static58.anInt1293, Static46.anInt1056, Static27.anInt4466);
		if (Static121.anInt2651 != -1) {
			Static29.method491(Static121.anInt2651, 1);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Z")
	public static boolean method2501() {
		if (Static31.aClass78_1 == null) {
			return false;
		}
		@Pc(145) int local145;
		try {
			@Pc(13) int local13 = Static31.aClass78_1.method2416();
			if (local13 == 0) {
				return false;
			}
			if (Static85.anInt1777 == -1) {
				local13--;
				Static31.aClass78_1.method2415(1, 0, Static63.aClass3_Sub17_Sub1_2.aByteArray40);
				Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
				Static85.anInt1777 = Static63.aClass3_Sub17_Sub1_2.method2147();
				Static41.anInt905 = Static96.anIntArray281[Static85.anInt1777];
			}
			if (Static41.anInt905 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static31.aClass78_1.method2415(1, 0, Static63.aClass3_Sub17_Sub1_2.aByteArray40);
				Static41.anInt905 = Static63.aClass3_Sub17_Sub1_2.aByteArray40[0] & 0xFF;
			}
			if (Static41.anInt905 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static31.aClass78_1.method2415(2, 0, Static63.aClass3_Sub17_Sub1_2.aByteArray40);
				Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
				Static41.anInt905 = Static63.aClass3_Sub17_Sub1_2.method2111();
			}
			if (local13 < Static41.anInt905) {
				return false;
			}
			Static63.aClass3_Sub17_Sub1_2.anInt2923 = 0;
			Static31.aClass78_1.method2415(Static41.anInt905, 0, Static63.aClass3_Sub17_Sub1_2.aByteArray40);
			Static124.anInt2671 = 0;
			anInt3500 = Static59.anInt1309;
			Static59.anInt1309 = Static77.anInt1824;
			Static77.anInt1824 = Static85.anInt1777;
			@Pc(127) int local127;
			if (Static85.anInt1777 == 18) {
				for (local127 = 0; local127 < Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1.length; local127++) {
					if (Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local127] != null) {
						Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local127].anInt4323 = -1;
					}
				}
				for (local145 = 0; local145 < Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1.length; local145++) {
					if (Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local145] != null) {
						Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local145].anInt4323 = -1;
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 154) {
				Static8.anInt226 = Static63.aClass3_Sub17_Sub1_2.method2109();
				Static28.anInt697 = Static63.aClass3_Sub17_Sub1_2.method2091();
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(225) int local225;
			@Pc(201) long local201;
			@Pc(211) long local211;
			@Pc(232) long local232;
			@Pc(216) long local216;
			if (Static85.anInt1777 == 175) {
				local201 = Static63.aClass3_Sub17_Sub1_2.method2115();
				Static63.aClass3_Sub17_Sub1_2.method2123();
				@Pc(207) boolean local207 = false;
				local211 = Static63.aClass3_Sub17_Sub1_2.method2115();
				local216 = Static63.aClass3_Sub17_Sub1_2.method2111();
				@Pc(221) long local221 = (long) Static63.aClass3_Sub17_Sub1_2.method2136();
				local225 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local232 = (local216 << 32) + local221;
				for (@Pc(234) int local234 = 0; local234 < 100; local234++) {
					if (Static96.aLongArray8[local234] == local232) {
						local207 = true;
						break;
					}
				}
				if (local225 <= 1) {
					for (@Pc(255) int local255 = 0; local255 < Static133.anInt2865; local255++) {
						if (Static47.aLongArray4[local255] == local201) {
							local207 = true;
							break;
						}
					}
				}
				if (!local207 && Static173.anInt3889 == 0) {
					Static96.aLongArray8[Static7.anInt222] = local232;
					Static7.anInt222 = (Static7.anInt222 + 1) % 100;
					@Pc(298) Class80 local298 = Static76.method2250(Static175.method2824(Static63.aClass3_Sub17_Sub1_2).method2455());
					if (local225 == 2 || local225 == 3) {
						Static86.method1249(local298, Static19.method321(local211).method2451(), 9, Static154.method2467(new Class80[] { Static149.aClass80_1312, Static19.method321(local201).method2451() }));
					} else if (local225 == 1) {
						Static86.method1249(local298, Static19.method321(local211).method2451(), 9, Static154.method2467(new Class80[] { Static72.aClass80_1616, Static19.method321(local201).method2451() }));
					} else {
						Static86.method1249(local298, Static19.method321(local211).method2451(), 9, Static19.method321(local201).method2451());
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(411) int local411;
			@Pc(415) Class77 local415;
			if (Static85.anInt1777 == 142) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2114();
				if (local127 == 65535) {
					local127 = -1;
				}
				local145 = Static63.aClass3_Sub17_Sub1_2.method2133();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2140();
				local415 = Static92.method2208(local411);
				@Pc(435) Class3_Sub1_Sub2 local435;
				if (local415.aBoolean127) {
					local415.anInt3245 = local145;
					local415.anInt3233 = local127;
					local435 = Static173.method2793(local127);
					local415.anInt3242 = local435.anInt355;
					local415.anInt3194 = local435.anInt359;
					local415.anInt3232 = local435.anInt377;
					local415.anInt3225 = local435.anInt391;
					local415.anInt3200 = local435.anInt347;
					if (local415.anInt3251 > 0) {
						local415.anInt3242 = local415.anInt3242 * 32 / local415.anInt3251;
					}
					local415.anInt3244 = local435.anInt381;
					Static186.method3014(local415);
				} else if (local127 == -1) {
					Static85.anInt1777 = -1;
					local415.anInt3212 = 0;
					return true;
				} else {
					local435 = Static173.method2793(local127);
					local415.anInt3242 = local435.anInt355 * 100 / local145;
					local415.anInt3212 = 4;
					local415.anInt3253 = local127;
					local415.anInt3225 = local435.anInt391;
					local415.anInt3232 = local435.anInt377;
					Static186.method3014(local415);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(526) Class77 local526;
			if (Static85.anInt1777 == 245) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2132();
				local526 = Static92.method2208(local127);
				for (local411 = 0; local411 < local526.anIntArray418.length; local411++) {
					local526.anIntArray418[local411] = -1;
					local526.anIntArray418[local411] = 0;
				}
				Static186.method3014(local526);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 216) {
				Static53.aClass80_456 = Static63.aClass3_Sub17_Sub1_2.method2102();
				Static125.method1860(Static53.aClass80_456);
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(595) Class77 local595;
			if (Static85.anInt1777 == 161) {
				@Pc(587) boolean local587 = Static63.aClass3_Sub17_Sub1_2.method2109() == 1;
				local145 = Static63.aClass3_Sub17_Sub1_2.method2133();
				local595 = Static92.method2208(local145);
				if (local595.aBoolean122 != local587) {
					local595.aBoolean122 = local587;
					Static186.method3014(local595);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 225) {
				Static133.anInt2865 = Static41.anInt905 / 8;
				for (local127 = 0; local127 < Static133.anInt2865; local127++) {
					Static47.aLongArray4[local127] = Static63.aClass3_Sub17_Sub1_2.method2115();
					Static170.aClass80Array28[local127] = Static19.method321(Static47.aLongArray4[local127]);
				}
				Static168.anInt3770 = Static31.anInt747;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 21) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2098();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2114();
				Static165.anInt3680 = local127;
				Static85.anInt1777 = -1;
				Static163.anInt3648 = local145;
				return true;
			}
			if (Static85.anInt1777 == 120) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2141();
				Static121.anInt2651 = local127;
				Static69.method1031(local127);
				Static196.method2820(Static121.anInt2651);
				for (local145 = 0; local145 < 100; local145++) {
					Static63.aBooleanArray8[local145] = true;
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 167) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2098();
				@Pc(717) byte local717 = Static63.aClass3_Sub17_Sub1_2.method2103();
				Static83.anIntArray216[local127] = local717;
				if (Static41.anIntArray131[local127] != local717) {
					Static41.anIntArray131[local127] = local717;
					Static7.method152(local127);
				}
				Static187.anIntArray505[Static109.anInt2441++ & 0x1F] = local127;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 204) {
				Static14.method242();
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 184) {
				Static8.anInt226 = Static63.aClass3_Sub17_Sub1_2.method2109();
				Static28.anInt697 = Static63.aClass3_Sub17_Sub1_2.method2091();
				for (local127 = Static28.anInt697; local127 < Static28.anInt697 + 8; local127++) {
					for (local145 = Static8.anInt226; local145 < Static8.anInt226 + 8; local145++) {
						if (Static142.aClass70ArrayArrayArray1[Static153.anInt673][local127][local145] != null) {
							Static142.aClass70ArrayArrayArray1[Static153.anInt673][local127][local145] = null;
							Static166.method2679(local127, local145);
						}
					}
				}
				for (@Pc(818) Class3_Sub22 local818 = (Class3_Sub22) Static97.aClass70_9.method1953(); local818 != null; local818 = (Class3_Sub22) Static97.aClass70_9.method1948()) {
					if (local818.anInt3780 >= Static28.anInt697 && Static28.anInt697 + 8 > local818.anInt3780 && local818.anInt3764 >= Static8.anInt226 && Static8.anInt226 + 8 > local818.anInt3764 && Static153.anInt673 == local818.anInt3769) {
						local818.anInt3779 = 0;
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(888) int local888;
			@Pc(897) int local897;
			if (Static85.anInt1777 == 114) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2114();
				if (local127 == 65535) {
					local127 = -1;
				}
				local145 = Static63.aClass3_Sub17_Sub1_2.method2132();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2132();
				local888 = Static63.aClass3_Sub17_Sub1_2.method2111();
				if (local888 == 65535) {
					local888 = -1;
				}
				for (local897 = local127; local897 <= local888; local897++) {
					@Pc(908) long local908 = ((long) local145 << 32) + ((long) local897);
					@Pc(913) Class3 local913 = Static51.aClass54_5.method1496(local908);
					if (local913 != null) {
						local913.method3159();
					}
					Static51.aClass54_5.method1494(local908, new Class3_Sub11(local411));
				}
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(965) int local965;
			if (Static85.anInt1777 == 174) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2088();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2133();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2088();
				local415 = Static92.method2208(local145);
				local897 = local415.anInt3230 + local127;
				local965 = local411 + local415.anInt3209;
				if (local415.anInt3229 != local897 || local965 != local415.anInt3259) {
					local415.anInt3259 = local965;
					local415.anInt3229 = local897;
					Static186.method3014(local415);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 98) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2140();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2114();
				local595 = Static92.method2208(local127);
				if (local595 != null && local595.anInt3206 == 0) {
					if (local595.anInt3249 - local595.anInt3221 < local145) {
						local145 = local595.anInt3249 - local595.anInt3221;
					}
					if (local145 < 0) {
						local145 = 0;
					}
					if (local145 != local595.anInt3213) {
						local595.anInt3213 = local145;
						Static186.method3014(local595);
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(1106) int local1106;
			@Pc(1176) boolean local1176;
			@Pc(1172) int local1172;
			@Pc(1179) int local1179;
			if (Static85.anInt1777 == 179) {
				Static116.anInt4478 = Static31.anInt747;
				local201 = Static63.aClass3_Sub17_Sub1_2.method2115();
				if (local201 == 0L) {
					Static85.anInt1777 = -1;
					Static90.aClass80_745 = null;
					Static153.aClass3_Sub9Array2 = null;
					Static118.aClass80_1028 = null;
					Static63.anInt1378 = 0;
					return true;
				}
				local211 = Static63.aClass3_Sub17_Sub1_2.method2115();
				Static118.aClass80_1028 = Static19.method321(local211);
				Static90.aClass80_745 = Static19.method321(local201);
				Static182.aByte8 = Static63.aClass3_Sub17_Sub1_2.method2123();
				local897 = Static63.aClass3_Sub17_Sub1_2.method2107();
				if (local897 == 255) {
					Static85.anInt1777 = -1;
					return true;
				}
				Static63.anInt1378 = local897;
				@Pc(1104) Class3_Sub9[] local1104 = new Class3_Sub9[100];
				for (local1106 = 0; local1106 < Static63.anInt1378; local1106++) {
					local1104[local1106] = new Class3_Sub9();
					local1104[local1106].aLong154 = Static63.aClass3_Sub17_Sub1_2.method2115();
					local1104[local1106].aClass80_419 = Static19.method321(local1104[local1106].aLong154);
					local1104[local1106].anInt1091 = Static63.aClass3_Sub17_Sub1_2.method2111();
					local1104[local1106].aByte2 = Static63.aClass3_Sub17_Sub1_2.method2123();
					local1104[local1106].aClass80_417 = Static63.aClass3_Sub17_Sub1_2.method2102();
					if (Static34.aLong26 == local1104[local1106].aLong154) {
						Static144.aByte7 = local1104[local1106].aByte2;
					}
				}
				local1172 = Static63.anInt1378;
				while (local1172 > 0) {
					local1176 = true;
					local1172--;
					for (local1179 = 0; local1179 < local1172; local1179++) {
						if (local1104[local1179].aClass80_419.method2442(local1104[local1179 + 1].aClass80_419) > 0) {
							@Pc(1200) Class3_Sub9 local1200 = local1104[local1179];
							local1176 = false;
							local1104[local1179] = local1104[local1179 + 1];
							local1104[local1179 + 1] = local1200;
						}
					}
					if (local1176) {
						break;
					}
				}
				Static153.aClass3_Sub9Array2 = local1104;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 40) {
				Static111.anInt2489 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static153.anInt685 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static34.anInt787 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 194) {
				if (Static121.anInt2651 != -1) {
					Static29.method491(Static121.anInt2651, 0);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 19) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local145 = local127 >> 6;
				@Pc(1291) Class34 local1291 = new Class34();
				local1291.anInt1330 = local127 & 0x3F;
				local1291.anInt1329 = Static63.aClass3_Sub17_Sub1_2.method2107();
				if (local1291.anInt1329 >= 0 && Static181.aClass3_Sub1_Sub4_Sub4Array15.length > local1291.anInt1329) {
					if (local1291.anInt1330 == 1 || local1291.anInt1330 == 10) {
						local1291.anInt1331 = Static63.aClass3_Sub17_Sub1_2.method2111();
					}
					if (local1291.anInt1330 >= 2 && local1291.anInt1330 <= 6) {
						if (local1291.anInt1330 == 2) {
							local1291.anInt1319 = 64;
							local1291.anInt1318 = 64;
						}
						if (local1291.anInt1330 == 3) {
							local1291.anInt1319 = 64;
							local1291.anInt1318 = 0;
						}
						if (local1291.anInt1330 == 4) {
							local1291.anInt1319 = 64;
							local1291.anInt1318 = 128;
						}
						if (local1291.anInt1330 == 5) {
							local1291.anInt1319 = 0;
							local1291.anInt1318 = 64;
						}
						if (local1291.anInt1330 == 6) {
							local1291.anInt1319 = 128;
							local1291.anInt1318 = 64;
						}
						local1291.anInt1330 = 2;
						local1291.anInt1323 = Static63.aClass3_Sub17_Sub1_2.method2111();
						local1291.anInt1325 = Static63.aClass3_Sub17_Sub1_2.method2111();
						local1291.anInt1322 = Static63.aClass3_Sub17_Sub1_2.method2107();
					}
					Static94.aClass34Array1[local145] = local1291;
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 143) {
				Static7.method154(Static41.anInt905, Static63.aClass3_Sub17_Sub1_2, Static58.aClass61_1);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 248) {
				Static130.method1951(false);
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(1447) Class80 local1447;
			if (Static85.anInt1777 == 164) {
				local1447 = Static63.aClass3_Sub17_Sub1_2.method2102();
				@Pc(1454) Object[] local1454 = new Object[local1447.method2462() + 1];
				for (local411 = local1447.method2462() - 1; local411 >= 0; local411--) {
					if (local1447.method2456(local411) == 115) {
						local1454[local411 + 1] = Static63.aClass3_Sub17_Sub1_2.method2102();
					} else {
						local1454[local411 + 1] = Integer.valueOf(Static63.aClass3_Sub17_Sub1_2.method2132());
					}
				}
				local1454[0] = Integer.valueOf(Static63.aClass3_Sub17_Sub1_2.method2132());
				@Pc(1512) Class3_Sub16 local1512 = new Class3_Sub16();
				local1512.anObjectArray3 = local1454;
				Static168.method2710(local1512);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 229) {
				local201 = Static63.aClass3_Sub17_Sub1_2.method2115();
				@Pc(1536) Class80 local1536 = Static76.method2250(Static175.method2824(Static63.aClass3_Sub17_Sub1_2).method2455());
				Static147.method2354(Static19.method321(local201).method2451(), 6, local1536);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 44) {
				Static155.method2489();
				local127 = Static63.aClass3_Sub17_Sub1_2.method2104();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2091();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2135();
				Static15.anIntArray55[local145] = local127;
				Static176.anIntArray476[local145] = local411;
				Static28.anIntArray87[local145] = 1;
				for (local888 = 0; local888 < 98; local888++) {
					if (Class28.anIntArray154[local888] <= local127) {
						Static28.anIntArray87[local145] = local888 + 2;
					}
				}
				Static39.anIntArray116[Static32.anInt4270++ & 0x1F] = local145;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 109) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2141();
				if (local127 == 65535) {
					local127 = -1;
				}
				Static99.method1487(local127);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 55) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2137();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2114();
				if (local145 == 65535) {
					local145 = -1;
				}
				Static28.method464(local127, local145);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 136) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2104();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2111();
				local888 = local145 >> 5 & 0x1F;
				local897 = local145 & 0x1F;
				local411 = local145 >> 10 & 0x1F;
				local965 = (local897 << 3) + (local411 << 19) + (local888 << 11);
				@Pc(1709) Class77 local1709 = Static92.method2208(local127);
				if (local965 != local1709.anInt3198) {
					local1709.anInt3198 = local965;
					Static186.method3014(local1709);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 129) {
				Static130.method1951(true);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 223) {
				Static162.method2630();
				Static85.anInt1777 = -1;
				return false;
			}
			if (Static85.anInt1777 == 149) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2114();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2132();
				Static83.anIntArray216[local127] = local145;
				if (local145 != Static41.anIntArray131[local127]) {
					Static41.anIntArray131[local127] = local145;
					Static7.method152(local127);
				}
				Static187.anIntArray505[Static109.anInt2441++ & 0x1F] = local127;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 158) {
				Static19.anInt464 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static85.anInt1777 = -1;
				Static168.anInt3770 = Static31.anInt747;
				return true;
			}
			if (Static85.anInt1777 == 145) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2111();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2107();
				if (local127 == 65535) {
					local127 = -1;
				}
				local411 = Static63.aClass3_Sub17_Sub1_2.method2111();
				Static110.method1707(local127, local411, local145);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 4) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2098();
				if (local127 == 65535) {
					local127 = -1;
				}
				local145 = Static63.aClass3_Sub17_Sub1_2.method2132();
				local595 = Static92.method2208(local145);
				if (local595.anInt3212 != 1 || local127 != local595.anInt3253) {
					local595.anInt3253 = local127;
					local595.anInt3212 = 1;
					Static186.method3014(local595);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 254) {
				Static188.method3072(Static63.aClass3_Sub17_Sub1_2);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 89) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2132();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2088();
				local595 = Static92.method2208(local127);
				if (local595.anInt3250 != local145 || local145 == -1) {
					local595.anInt3250 = local145;
					local595.anInt3211 = 0;
					local595.anInt3243 = 0;
					Static186.method3014(local595);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 238) {
				Static100.aBoolean86 = false;
				for (local127 = 0; local127 < 5; local127++) {
					Static48.aBooleanArray4[local127] = false;
				}
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(2051) Class80 local2051;
			if (Static85.anInt1777 == 1) {
				local201 = Static63.aClass3_Sub17_Sub1_2.method2115();
				local211 = Static63.aClass3_Sub17_Sub1_2.method2111();
				local216 = Static63.aClass3_Sub17_Sub1_2.method2136();
				local1106 = Static63.aClass3_Sub17_Sub1_2.method2107();
				@Pc(1978) long local1978 = local216 + (local211 << 32);
				@Pc(1980) boolean local1980 = false;
				for (local1179 = 0; local1179 < 100; local1179++) {
					if (Static96.aLongArray8[local1179] == local1978) {
						local1980 = true;
						break;
					}
				}
				if (local1106 <= 1) {
					for (@Pc(2003) int local2003 = 0; local2003 < Static133.anInt2865; local2003++) {
						if (local201 == Static47.aLongArray4[local2003]) {
							local1980 = true;
							break;
						}
					}
				}
				if (!local1980 && Static173.anInt3889 == 0) {
					Static96.aLongArray8[Static7.anInt222] = local1978;
					Static7.anInt222 = (Static7.anInt222 + 1) % 100;
					local2051 = Static76.method2250(Static175.method2824(Static63.aClass3_Sub17_Sub1_2).method2455());
					if (local1106 == 2 || local1106 == 3) {
						Static147.method2354(Static154.method2467(new Class80[] { Static149.aClass80_1312, Static19.method321(local201).method2451() }), 7, local2051);
					} else if (local1106 == 1) {
						Static147.method2354(Static154.method2467(new Class80[] { Static72.aClass80_1616, Static19.method321(local201).method2451() }), 7, local2051);
					} else {
						Static147.method2354(Static19.method321(local201).method2451(), 3, local2051);
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 139) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2132();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2111();
				if (local145 == 65535) {
					local145 = -1;
				}
				local595 = Static92.method2208(local127);
				if (local595.anInt3212 != 2 || local595.anInt3253 != local145) {
					local595.anInt3253 = local145;
					local595.anInt3212 = 2;
					Static186.method3014(local595);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 28) {
				for (local127 = 0; local127 < Static87.anInt1821; local127++) {
					@Pc(2181) Class3_Sub1_Sub17 local2181 = Static44.method678(local127);
					if (local2181 != null && local2181.anInt4152 == 0) {
						Static83.anIntArray216[local127] = 0;
						Static41.anIntArray131[local127] = 0;
					}
				}
				Static155.method2489();
				Static85.anInt1777 = -1;
				Static109.anInt2441 += 32;
				return true;
			}
			if (Static85.anInt1777 == 156) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2132();
				@Pc(2225) Class3_Sub20 local2225 = (Class3_Sub20) Static28.aClass54_4.method1496((long) local127);
				if (local2225 != null) {
					method2500(true, local2225);
				}
				if (Static83.aClass77_4 != null) {
					Static186.method3014(Static83.aClass77_4);
					Static83.aClass77_4 = null;
				}
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(2348) Class3_Sub20 local2348;
			@Pc(2392) int local2392;
			if (Static85.anInt1777 == 152) {
				local127 = Static41.anInt905 + Static63.aClass3_Sub17_Sub1_2.anInt2923;
				local145 = Static63.aClass3_Sub17_Sub1_2.method2111();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2111();
				if (Static121.anInt2651 != local145) {
					Static121.anInt2651 = local145;
					Static69.method1031(Static121.anInt2651);
					Static196.method2820(Static121.anInt2651);
					for (local888 = 0; local888 < 100; local888++) {
						Static63.aBooleanArray8[local888] = true;
					}
				}
				while (local411-- > 0) {
					local888 = Static63.aClass3_Sub17_Sub1_2.method2132();
					local897 = Static63.aClass3_Sub17_Sub1_2.method2111();
					local965 = Static63.aClass3_Sub17_Sub1_2.method2107();
					@Pc(2310) Class3_Sub20 local2310 = (Class3_Sub20) Static28.aClass54_4.method1496((long) local888);
					if (local2310 != null && local897 != local2310.anInt2996) {
						method2500(true, local2310);
						local2310 = null;
					}
					if (local2310 == null) {
						local2310 = Static112.method1741(local965, local897, local888);
					}
					local2310.aBoolean116 = true;
				}
				for (local2348 = (Class3_Sub20) Static28.aClass54_4.method1503(); local2348 != null; local2348 = (Class3_Sub20) Static28.aClass54_4.method1497()) {
					if (local2348.aBoolean116) {
						local2348.aBoolean116 = false;
					} else {
						method2500(true, local2348);
					}
				}
				Static51.aClass54_5 = new Class54(512);
				while (Static63.aClass3_Sub17_Sub1_2.anInt2923 < local127) {
					local897 = Static63.aClass3_Sub17_Sub1_2.method2132();
					local965 = Static63.aClass3_Sub17_Sub1_2.method2111();
					local1106 = Static63.aClass3_Sub17_Sub1_2.method2111();
					local2392 = Static63.aClass3_Sub17_Sub1_2.method2132();
					for (local225 = local965; local225 <= local1106; local225++) {
						local232 = (long) local225 + ((long) local897 << 32);
						Static51.aClass54_5.method1494(local232, new Class3_Sub11(local2392));
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 235) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2140();
				local526 = Static92.method2208(local127);
				local526.anInt3212 = 3;
				local526.anInt3253 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.aClass55_2.method1530();
				Static186.method3014(local526);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 193) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2132();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2111();
				if (local127 < -70000) {
					local145 += 32768;
				}
				if (local127 >= 0) {
					local595 = Static92.method2208(local127);
				} else {
					local595 = null;
				}
				if (local595 != null) {
					for (local888 = 0; local888 < local595.anIntArray418.length; local888++) {
						local595.anIntArray418[local888] = 0;
						local595.anIntArray417[local888] = 0;
					}
				}
				Static1.method64(local145);
				local888 = Static63.aClass3_Sub17_Sub1_2.method2111();
				for (local897 = 0; local897 < local888; local897++) {
					local965 = Static63.aClass3_Sub17_Sub1_2.method2098();
					local1106 = Static63.aClass3_Sub17_Sub1_2.method2109();
					if (local1106 == 255) {
						local1106 = Static63.aClass3_Sub17_Sub1_2.method2133();
					}
					if (local595 != null && local897 < local595.anIntArray418.length) {
						local595.anIntArray418[local897] = local965;
						local595.anIntArray417[local897] = local1106;
					}
					Static174.method2813(local1106, local897, local965 - 1, local145);
				}
				if (local595 != null) {
					Static186.method3014(local595);
				}
				Static155.method2489();
				Static156.anIntArray435[Static174.anInt3928++ & 0x1F] = local145 & 0x7FFF;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 42 || Static85.anInt1777 == 242 || Static85.anInt1777 == 181 || Static85.anInt1777 == 13 || Static85.anInt1777 == 90 || Static85.anInt1777 == 116 || Static85.anInt1777 == 61 || Static85.anInt1777 == 122 || Static85.anInt1777 == 72 || Static85.anInt1777 == 10 || Static85.anInt1777 == 177) {
				Static155.method2491();
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 104) {
				Static100.aBoolean86 = true;
				Static71.anInt1577 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static7.anInt223 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static162.anInt3631 = Static63.aClass3_Sub17_Sub1_2.method2111();
				Static49.anInt1090 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static184.anInt4146 = Static63.aClass3_Sub17_Sub1_2.method2107();
				if (Static184.anInt4146 >= 100) {
					Static56.anInt1216 = Static71.anInt1577 * 128 + 64;
					Static86.anInt1786 = Static7.anInt223 * 128 + 64;
					Static149.anInt3350 = Static50.method742(Static153.anInt673, Static86.anInt1786, Static56.anInt1216) - Static162.anInt3631;
				}
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(2750) Class80 local2750;
			@Pc(2732) boolean local2732;
			if (Static85.anInt1777 == 138) {
				local201 = Static63.aClass3_Sub17_Sub1_2.method2115();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2111();
				@Pc(2730) byte local2730 = Static63.aClass3_Sub17_Sub1_2.method2123();
				local2732 = false;
				if ((Long.MIN_VALUE & local201) != 0L) {
					local2732 = true;
				}
				if (local2732) {
					if (Static63.anInt1378 == 0) {
						Static85.anInt1777 = -1;
						return true;
					}
					local201 &= Long.MAX_VALUE;
					for (local965 = 0; local965 < Static63.anInt1378 && (Static153.aClass3_Sub9Array2[local965].aLong154 != local201 || Static153.aClass3_Sub9Array2[local965].anInt1091 != local411); local965++) {
					}
					if (Static63.anInt1378 > local965) {
						while (Static63.anInt1378 - 1 > local965) {
							Static153.aClass3_Sub9Array2[local965] = Static153.aClass3_Sub9Array2[local965 + 1];
							local965++;
						}
						Static63.anInt1378--;
						Static153.aClass3_Sub9Array2[Static63.anInt1378] = null;
					}
				} else {
					local2750 = Static63.aClass3_Sub17_Sub1_2.method2102();
					@Pc(2754) Class3_Sub9 local2754 = new Class3_Sub9();
					local2754.aLong154 = local201;
					local2754.aClass80_419 = Static19.method321(local2754.aLong154);
					local2754.aClass80_417 = local2750;
					local2754.aByte2 = local2730;
					local2754.anInt1091 = local411;
					for (local2392 = Static63.anInt1378 - 1; local2392 >= 0; local2392--) {
						local225 = Static153.aClass3_Sub9Array2[local2392].aClass80_419.method2442(local2754.aClass80_419);
						if (local225 == 0) {
							Static153.aClass3_Sub9Array2[local2392].anInt1091 = local411;
							Static153.aClass3_Sub9Array2[local2392].aByte2 = local2730;
							Static153.aClass3_Sub9Array2[local2392].aClass80_417 = local2750;
							if (local201 == Static34.aLong26) {
								Static144.aByte7 = local2730;
							}
							Static116.anInt4478 = Static31.anInt747;
							Static85.anInt1777 = -1;
							return true;
						}
						if (local225 < 0) {
							break;
						}
					}
					if (Static63.anInt1378 >= Static153.aClass3_Sub9Array2.length) {
						Static85.anInt1777 = -1;
						return true;
					}
					for (local225 = Static63.anInt1378 - 1; local225 > local2392; local225--) {
						Static153.aClass3_Sub9Array2[local225 + 1] = Static153.aClass3_Sub9Array2[local225];
					}
					if (Static63.anInt1378 == 0) {
						Static153.aClass3_Sub9Array2 = new Class3_Sub9[100];
					}
					Static153.aClass3_Sub9Array2[local2392 + 1] = local2754;
					Static63.anInt1378++;
					if (local201 == Static34.aLong26) {
						Static144.aByte7 = local2730;
					}
				}
				Static116.anInt4478 = Static31.anInt747;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 74) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2141();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2141();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2104();
				local415 = Static92.method2208(local411);
				local415.anInt3193 = (local127 << 16) + local145;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 51) {
				for (local127 = 0; local127 < Static41.anIntArray131.length; local127++) {
					if (Static41.anIntArray131[local127] != Static83.anIntArray216[local127]) {
						Static41.anIntArray131[local127] = Static83.anIntArray216[local127];
						Static7.method152(local127);
						Static187.anIntArray505[Static109.anInt2441++ & 0x1F] = local127;
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 46) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2133();
				Static163.aClass94_7 = Static58.aClass61_1.method1791(local127);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 71) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2098();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2104();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local2348 = (Class3_Sub20) Static28.aClass54_4.method1496((long) local145);
				if (local2348 != null) {
					method2500(local2348.anInt2996 != local127, local2348);
				}
				Static112.method1741(local411, local127, local145);
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 3) {
				Static100.aBoolean86 = true;
				Static31.anInt749 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static32.anInt4271 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static16.anInt364 = Static63.aClass3_Sub17_Sub1_2.method2111();
				Static58.anInt1282 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static68.anInt1520 = Static63.aClass3_Sub17_Sub1_2.method2107();
				if (Static68.anInt1520 >= 100) {
					local127 = Static31.anInt749 * 128 + 64;
					local145 = Static32.anInt4271 * 128 + 64;
					local411 = Static50.method742(Static153.anInt673, local145, local127) - Static16.anInt364;
					local888 = local127 - Static56.anInt1216;
					local965 = local145 - Static86.anInt1786;
					local897 = local411 - Static149.anInt3350;
					local1106 = (int) Math.sqrt((double) (local888 * local888 + local965 * local965));
					Static165.anInt3680 = (int) (Math.atan2((double) local897, (double) local1106) * 325.949D) & 0x7FF;
					Static163.anInt3648 = (int) (Math.atan2((double) local888, (double) local965) * -325.949D) & 0x7FF;
					if (Static165.anInt3680 < 128) {
						Static165.anInt3680 = 128;
					}
					if (Static165.anInt3680 > 383) {
						Static165.anInt3680 = 383;
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 206) {
				Static49.anInt1087 = 0;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 150) {
				Static155.method2489();
				Static109.anInt2442 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static104.anInt2186 = Static31.anInt747;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 92) {
				Static58.anInt1284 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 147) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2098();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2098();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2098();
				local888 = Static63.aClass3_Sub17_Sub1_2.method2104();
				@Pc(3273) Class77 local3273 = Static92.method2208(local888);
				if (local145 != local3273.anInt3232 || local127 != local3273.anInt3225 || local411 != local3273.anInt3242) {
					local3273.anInt3242 = local411;
					local3273.anInt3232 = local145;
					local3273.anInt3225 = local127;
					Static186.method3014(local3273);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 23) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2111();
				Static22.method362(local127);
				Static156.anIntArray435[Static174.anInt3928++ & 0x1F] = local127 & 0x7FFF;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 199) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2135();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2109();
				Static153.anInt673 = local127 >> 1;
				Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.method3061((local127 & 0x1) == 1, local411, local145);
				Static85.anInt1777 = -1;
				return true;
			}
			@Pc(3384) Class80 local3384;
			if (Static85.anInt1777 == 115) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2140();
				local3384 = Static63.aClass3_Sub17_Sub1_2.method2102();
				local595 = Static92.method2208(local127);
				if (!local3384.method2437(local595.aClass80_1260)) {
					local595.aClass80_1260 = local3384;
					Static186.method3014(local595);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 47) {
				local1447 = Static63.aClass3_Sub17_Sub1_2.method2102();
				if (local1447.method2440(Static19.aClass80_146)) {
					local3384 = local1447.method2464(0, local1447.method2460(Static130.aClass80_1114));
					local211 = local3384.method2441();
					local2732 = false;
					for (local965 = 0; local965 < Static133.anInt2865; local965++) {
						if (Static47.aLongArray4[local965] == local211) {
							local2732 = true;
							break;
						}
					}
					if (!local2732 && Static173.anInt3889 == 0) {
						Static147.method2354(local3384, 4, Static52.aClass80_438);
					}
				} else if (local1447.method2440(Static192.aClass80_1704)) {
					local3384 = local1447.method2464(0, local1447.method2460(Static130.aClass80_1114));
					local211 = local3384.method2441();
					local2732 = false;
					for (local965 = 0; local965 < Static133.anInt2865; local965++) {
						if (local211 == Static47.aLongArray4[local965]) {
							local2732 = true;
							break;
						}
					}
					if (!local2732 && Static173.anInt3889 == 0) {
						@Pc(3831) Class80 local3831 = local1447.method2464(local1447.method2460(Static130.aClass80_1114) + 1, local1447.method2462() - 9);
						Static147.method2354(local3384, 8, local3831);
					}
				} else if (local1447.method2440(Static145.aClass80_1254)) {
					local2732 = false;
					local3384 = local1447.method2464(0, local1447.method2460(Static130.aClass80_1114));
					local211 = local3384.method2441();
					for (local965 = 0; local965 < Static133.anInt2865; local965++) {
						if (local211 == Static47.aLongArray4[local965]) {
							local2732 = true;
							break;
						}
					}
					if (!local2732 && Static173.anInt3889 == 0) {
						Static147.method2354(local3384, 10, Static185.aClass80_1637);
					}
				} else if (local1447.method2440(Static35.aClass80_690)) {
					local3384 = local1447.method2464(0, local1447.method2460(Static35.aClass80_690));
					Static147.method2354(Static185.aClass80_1637, 11, local3384);
				} else if (local1447.method2440(Static14.aClass80_100)) {
					local3384 = local1447.method2464(0, local1447.method2460(Static14.aClass80_100));
					if (Static173.anInt3889 == 0) {
						Static147.method2354(Static185.aClass80_1637, 12, local3384);
					}
				} else if (local1447.method2440(Static174.aClass80_1509)) {
					local3384 = local1447.method2464(0, local1447.method2460(Static174.aClass80_1509));
					if (Static173.anInt3889 == 0) {
						Static147.method2354(Static185.aClass80_1637, 13, local3384);
					}
				} else if (local1447.method2440(Static84.aClass80_1651)) {
					local3384 = local1447.method2464(0, local1447.method2460(Static130.aClass80_1114));
					local211 = local3384.method2441();
					local2732 = false;
					for (local965 = 0; local965 < Static133.anInt2865; local965++) {
						if (Static47.aLongArray4[local965] == local211) {
							local2732 = true;
							break;
						}
					}
					if (!local2732 && Static173.anInt3889 == 0) {
						Static147.method2354(local3384, 14, Static185.aClass80_1637);
					}
				} else if (local1447.method2440(Static100.aClass80_851)) {
					local3384 = local1447.method2464(0, local1447.method2460(Static130.aClass80_1114));
					local2732 = false;
					local211 = local3384.method2441();
					for (local965 = 0; local965 < Static133.anInt2865; local965++) {
						if (local211 == Static47.aLongArray4[local965]) {
							local2732 = true;
							break;
						}
					}
					if (!local2732 && Static173.anInt3889 == 0) {
						Static147.method2354(local3384, 15, Static185.aClass80_1637);
					}
				} else if (local1447.method2440(Static138.aClass80_1155)) {
					local3384 = local1447.method2464(0, local1447.method2460(Static130.aClass80_1114));
					local211 = local3384.method2441();
					local2732 = false;
					for (local965 = 0; local965 < Static133.anInt2865; local965++) {
						if (Static47.aLongArray4[local965] == local211) {
							local2732 = true;
							break;
						}
					}
					if (!local2732 && Static173.anInt3889 == 0) {
						Static147.method2354(local3384, 16, Static185.aClass80_1637);
					}
				} else {
					Static147.method2354(Static185.aClass80_1637, 0, local1447);
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 118) {
				Static155.method2489();
				Static183.anInt4099 = Static63.aClass3_Sub17_Sub1_2.method2138();
				Static85.anInt1777 = -1;
				Static104.anInt2186 = Static31.anInt747;
				return true;
			}
			if (Static85.anInt1777 == 188) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2107();
				if (Static63.aClass3_Sub17_Sub1_2.method2107() == 0) {
					aClass64Array1[local127] = new Class64();
				} else {
					Static63.aClass3_Sub17_Sub1_2.anInt2923--;
					aClass64Array1[local127] = new Class64(Static63.aClass3_Sub17_Sub1_2);
				}
				Static120.anInt2634 = Static31.anInt747;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 221) {
				Static28.anInt697 = Static63.aClass3_Sub17_Sub1_2.method2107();
				Static8.anInt226 = Static63.aClass3_Sub17_Sub1_2.method2135();
				while (Static63.aClass3_Sub17_Sub1_2.anInt2923 < Static41.anInt905) {
					Static85.anInt1777 = Static63.aClass3_Sub17_Sub1_2.method2107();
					Static155.method2491();
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 111) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2132();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2111();
				if (local127 < 0) {
					local595 = null;
				} else {
					local595 = Static92.method2208(local127);
				}
				if (local127 < -70000) {
					local145 += 32768;
				}
				while (Static41.anInt905 > Static63.aClass3_Sub17_Sub1_2.anInt2923) {
					local888 = Static63.aClass3_Sub17_Sub1_2.method2090();
					local965 = 0;
					local897 = Static63.aClass3_Sub17_Sub1_2.method2111();
					if (local897 != 0) {
						local965 = Static63.aClass3_Sub17_Sub1_2.method2107();
						if (local965 == 255) {
							local965 = Static63.aClass3_Sub17_Sub1_2.method2132();
						}
					}
					if (local595 != null && local888 >= 0 && local595.anIntArray418.length > local888) {
						local595.anIntArray418[local888] = local897;
						local595.anIntArray417[local888] = local965;
					}
					Static174.method2813(local965, local888, local897 - 1, local145);
				}
				if (local595 != null) {
					Static186.method3014(local595);
				}
				Static155.method2489();
				Static156.anIntArray435[Static174.anInt3928++ & 0x1F] = local145 & 0x7FFF;
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 222) {
				Static67.method1004();
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 135) {
				local1447 = Static63.aClass3_Sub17_Sub1_2.method2102();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2109();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2091();
				if (local411 >= 1 && local411 <= 8) {
					if (local1447.method2432(Static139.aClass80_1170)) {
						local1447 = null;
					}
					Static122.aClass80Array19[local411 - 1] = local1447;
					Static139.aBooleanArray17[local411 - 1] = local145 == 0;
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 102) {
				local201 = Static63.aClass3_Sub17_Sub1_2.method2115();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2111();
				local888 = Static63.aClass3_Sub17_Sub1_2.method2107();
				@Pc(4124) Class80 local4124 = Static185.aClass80_1637;
				if (local411 > 0) {
					local4124 = Static63.aClass3_Sub17_Sub1_2.method2102();
				}
				local2750 = Static19.method321(local201).method2451();
				for (local1106 = 0; local1106 < Static116.anInt4479; local1106++) {
					if (local201 == Static186.aLongArray10[local1106]) {
						if (local411 != Static161.anIntArray450[local1106]) {
							Static161.anIntArray450[local1106] = local411;
							if (local411 > 0) {
								Static147.method2354(Static185.aClass80_1637, 5, Static154.method2467(new Class80[] { local2750, Static120.aClass80_1047 }));
							}
							if (local411 == 0) {
								Static147.method2354(Static185.aClass80_1637, 5, Static154.method2467(new Class80[] { local2750, Static163.aClass80_1407 }));
							}
						}
						Static56.aClass80Array10[local1106] = local4124;
						Static184.anIntArray496[local1106] = local888;
						local2750 = null;
						break;
					}
				}
				if (local2750 != null && Static116.anInt4479 < 200) {
					Static186.aLongArray10[Static116.anInt4479] = local201;
					Static141.aClass80Array20[Static116.anInt4479] = local2750;
					Static161.anIntArray450[Static116.anInt4479] = local411;
					Static56.aClass80Array10[Static116.anInt4479] = local4124;
					Static184.anIntArray496[Static116.anInt4479] = local888;
					Static116.anInt4479++;
				}
				local225 = Static116.anInt4479;
				Static168.anInt3770 = Static31.anInt747;
				while (local225 > 0) {
					local225--;
					local1176 = true;
					for (local1172 = 0; local1172 < local225; local1172++) {
						if (Static120.anInt2639 != Static161.anIntArray450[local1172] && Static161.anIntArray450[local1172 + 1] == Static120.anInt2639 || Static161.anIntArray450[local1172] == 0 && Static161.anIntArray450[local1172 + 1] != 0) {
							local1176 = false;
							local1179 = Static161.anIntArray450[local1172];
							Static161.anIntArray450[local1172] = Static161.anIntArray450[local1172 + 1];
							Static161.anIntArray450[local1172 + 1] = local1179;
							local2051 = Static56.aClass80Array10[local1172];
							Static56.aClass80Array10[local1172] = Static56.aClass80Array10[local1172 + 1];
							Static56.aClass80Array10[local1172 + 1] = local2051;
							@Pc(4337) Class80 local4337 = Static141.aClass80Array20[local1172];
							Static141.aClass80Array20[local1172] = Static141.aClass80Array20[local1172 + 1];
							Static141.aClass80Array20[local1172 + 1] = local4337;
							@Pc(4355) long local4355 = Static186.aLongArray10[local1172];
							Static186.aLongArray10[local1172] = Static186.aLongArray10[local1172 + 1];
							Static186.aLongArray10[local1172 + 1] = local4355;
							@Pc(4373) int local4373 = Static184.anIntArray496[local1172];
							Static184.anIntArray496[local1172] = Static184.anIntArray496[local1172 + 1];
							Static184.anIntArray496[local1172 + 1] = local4373;
						}
					}
					if (local1176) {
						break;
					}
				}
				Static85.anInt1777 = -1;
				return true;
			}
			if (Static85.anInt1777 == 53) {
				Static10.anInt247 = Static63.aClass3_Sub17_Sub1_2.method2141() * 30;
				Static85.anInt1777 = -1;
				Static104.anInt2186 = Static31.anInt747;
				return true;
			}
			if (Static85.anInt1777 == 127) {
				local127 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local145 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local411 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local888 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local897 = Static63.aClass3_Sub17_Sub1_2.method2111();
				Static48.aBooleanArray4[local127] = true;
				Static86.anIntArray219[local127] = local145;
				Static116.anIntArray524[local127] = local411;
				Static104.anIntArray302[local127] = local888;
				Static111.anIntArray326[local127] = local897;
				Static85.anInt1777 = -1;
				return true;
			}
			Static67.method1005(null, "T1 - " + Static85.anInt1777 + "," + Static59.anInt1309 + "," + anInt3500 + " - " + Static41.anInt905);
			Static162.method2630();
		} catch (@Pc(4502) IOException local4502) {
			Static9.method169();
		} catch (@Pc(4508) Exception local4508) {
			@Pc(4548) String local4548 = "T2 - " + Static85.anInt1777 + "," + Static59.anInt1309 + "," + anInt3500 + " - " + Static41.anInt905 + "," + (Static97.anInt2062 + Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0]) + "," + (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0] + Static39.anInt875) + " - ";
			for (local145 = 0; Static41.anInt905 > local145 && local145 < 50; local145++) {
				local4548 = local4548 + Static63.aClass3_Sub17_Sub1_2.aByteArray40[local145] + ",";
			}
			Static67.method1005(local4508, local4548);
			Static162.method2630();
		}
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!fa;IIIIIII)V")
	public static void method2502(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static87.anInt1818;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static143.anInt3081;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static111.anIntArrayArrayArray7[arg1][arg6][arg7] - Static95.anInt3659;
		@Pc(49) int local49 = Static111.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static95.anInt3659;
		@Pc(63) int local63 = Static111.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static95.anInt3659;
		@Pc(75) int local75 = Static111.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static95.anInt3659;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static65.anInt1422 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static65.anInt1416 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static65.anInt1422 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static65.anInt1416 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static65.anInt1422 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static65.anInt1416 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static65.anInt1422 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static65.anInt1416 + (local85 << 9) / local261;
		Static65.anInt1420 = 0;
		@Pc(467) int local467;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static86.aBoolean69 && Static121.method1831(Static2.anInt82, Static51.anInt1132, local315, local331, local299, local307, local323, local291)) {
				Static103.anInt2178 = arg6;
				Static125.anInt2695 = arg7;
			}
			Static65.aBoolean59 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static65.anInt1417 || local323 > Static65.anInt1417 || local291 > Static65.anInt1417) {
				Static65.aBoolean59 = true;
			}
			if (arg0.anInt1069 == -1) {
				if (arg0.anInt1070 != 12345678) {
					Static65.method955(local315, local331, local299, local307, local323, local291, arg0.anInt1070, arg0.anInt1072, arg0.anInt1065);
				}
			} else if (Static193.aBoolean174) {
				local467 = Static65.anInterface1_2.method2650(arg0.anInt1069);
				Static65.method955(local315, local331, local299, local307, local323, local291, Static113.method1746(local467, arg0.anInt1070), Static113.method1746(local467, arg0.anInt1072), Static113.method1746(local467, arg0.anInt1065));
			} else if (arg0.aBoolean47) {
				Static65.method968(local315, local331, local299, local307, local323, local291, arg0.anInt1070, arg0.anInt1072, arg0.anInt1065, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1069);
			} else {
				Static65.method968(local315, local331, local299, local307, local323, local291, arg0.anInt1070, arg0.anInt1072, arg0.anInt1065, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt1069);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static86.aBoolean69 && Static121.method1831(Static2.anInt82, Static51.anInt1132, local283, local299, local331, local275, local291, local323)) {
			Static103.anInt2178 = arg6;
			Static125.anInt2695 = arg7;
		}
		Static65.aBoolean59 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static65.anInt1417 || local291 > Static65.anInt1417 || local323 > Static65.anInt1417) {
			Static65.aBoolean59 = true;
		}
		if (arg0.anInt1069 != -1) {
			if (!Static193.aBoolean174) {
				Static65.method968(local283, local299, local331, local275, local291, local323, arg0.anInt1066, arg0.anInt1065, arg0.anInt1072, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1069);
				return;
			}
			local467 = Static65.anInterface1_2.method2650(arg0.anInt1069);
			Static65.method955(local283, local299, local331, local275, local291, local323, Static113.method1746(local467, arg0.anInt1066), Static113.method1746(local467, arg0.anInt1065), Static113.method1746(local467, arg0.anInt1072));
		} else if (arg0.anInt1066 != 12345678) {
			Static65.method955(local283, local299, local331, local275, local291, local323, arg0.anInt1066, arg0.anInt1065, arg0.anInt1072);
			return;
		}
	}
}
