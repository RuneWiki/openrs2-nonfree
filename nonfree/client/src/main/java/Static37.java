import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "Lclient!ff;")
	public static Class11 aClass11_21;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_9;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!i;")
	public static Class32 aClass32_22 = new Class32(64);

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "[I")
	public static int[] anIntArray152 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
	public static int anInt1212 = 0;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "Lclient!wd;")
	public static Class80 aClass80_428 = Static2.method59("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "Lclient!wd;")
	private static Class80 aClass80_429 = Static2.method59("To play on this world move to a free area first");

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "Lclient!wd;")
	public static Class80 aClass80_430 = aClass80_429;

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
	public static int anInt1213 = 0;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!va;I)I")
	public static int method651(@OriginalArg(1) Class2_Sub1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray30 == null || arg1 >= arg0.anIntArrayArray30.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg0.anIntArrayArray30[arg1];
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local29++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local22;
				}
				if (local36 == 1) {
					local38 = Static111.anIntArray393[local20[local29++]];
				}
				if (local36 == 2) {
					local38 = Static94.anIntArray315[local20[local29++]];
				}
				if (local36 == 3) {
					local38 = Static7.anIntArray16[local20[local29++]];
				}
				@Pc(92) int local92;
				@Pc(103) Class2_Sub1_Sub17 local103;
				@Pc(108) int local108;
				@Pc(121) int local121;
				if (local36 == 4) {
					local92 = local20[local29++] << 16;
					@Pc(99) int local99 = local92 + local20[local29++];
					local103 = Static123.method1976(local99);
					local108 = local20[local29++];
					if (local108 != -1 && (!Static4.method95(local108).aBoolean55 || Static43.aBoolean80)) {
						for (local121 = 0; local121 < local103.anIntArray397.length; local121++) {
							if (local108 + 1 == local103.anIntArray397[local121]) {
								local38 += local103.anIntArray396[local121];
							}
						}
					}
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 5) {
					local38 = Static15.anIntArray66[local20[local29++]];
				}
				if (local36 == 6) {
					local38 = Class2_Sub1_Sub12.anIntArray287[Static94.anIntArray315[local20[local29++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static15.anIntArray66[local20[local29++]] * 100 / 46875;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 8) {
					local38 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2387;
				}
				if (local36 == 9) {
					for (local92 = 0; local92 < 25; local92++) {
						if (Static121.aBooleanArray15[local92]) {
							local38 += Static94.anIntArray315[local92];
						}
					}
				}
				if (local36 == 10) {
					local92 = local20[local29++] << 16;
					local92 += local20[local29++];
					local103 = Static123.method1976(local92);
					local108 = local20[local29++];
					if (local108 != -1 && (!Static4.method95(local108).aBoolean55 || Static43.aBoolean80)) {
						for (local121 = 0; local121 < local103.anIntArray397.length; local121++) {
							if (local108 + 1 == local103.anIntArray397[local121]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static120.anInt3077;
				}
				if (local36 == 12) {
					local38 = Static55.anInt1307;
				}
				if (local36 == 13) {
					local92 = Static15.anIntArray66[local20[local29++]];
					@Pc(332) int local332 = local20[local29++];
					local38 = (0x1 << local332 & local92) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local92 = local20[local29++];
					local38 = Static73.method1165(local92);
				}
				if (local36 == 18) {
					local38 = Static57.anInt1736 + (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 >> 7);
				}
				if (local36 == 19) {
					local38 = Static66.anInt1860 + (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 >> 7);
				}
				if (local36 == 20) {
					local38 = local20[local29++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local22 += local38;
					}
					if (local31 == 1) {
						local22 -= local38;
					}
					if (local31 == 2 && local38 != 0) {
						local22 /= local38;
					}
					if (local31 == 3) {
						local22 *= local38;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(430) Exception local430) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)V")
	public static void method652(@OriginalArg(1) boolean arg0) {
		Static38.method657();
		Static11.anInt302++;
		if (Static11.anInt302 < 50 && !arg0) {
			return;
		}
		Static11.anInt302 = 0;
		if (Static85.aBoolean155 || Static44.aClass10_2 == null) {
			return;
		}
		Static120.aClass2_Sub17_Sub1_3.method1799(251);
		try {
			Static44.aClass10_2.method256(Static120.aClass2_Sub17_Sub1_3.aByteArray38, Static120.aClass2_Sub17_Sub1_3.anInt2799);
			Static120.aClass2_Sub17_Sub1_3.anInt2799 = 0;
		} catch (@Pc(50) IOException local50) {
			Static85.aBoolean155 = true;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
	public static boolean method653() {
		if (Static44.aClass10_2 == null) {
			return false;
		}
		@Pc(179) int local179;
		try {
			@Pc(13) int local13 = Static44.aClass10_2.method259();
			if (local13 == 0) {
				return false;
			}
			if (Static10.anInt298 == -1) {
				local13--;
				Static44.aClass10_2.method257(Static100.aClass2_Sub17_Sub1_1.aByteArray38, 1, 0);
				Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
				Static10.anInt298 = Static100.aClass2_Sub17_Sub1_1.method1809();
				Static65.anInt1843 = Static60.anIntArray222[Static10.anInt298];
			}
			if (Static65.anInt1843 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static44.aClass10_2.method257(Static100.aClass2_Sub17_Sub1_1.aByteArray38, 1, 0);
				local13--;
				Static65.anInt1843 = Static100.aClass2_Sub17_Sub1_1.aByteArray38[0] & 0xFF;
			}
			if (Static65.anInt1843 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static44.aClass10_2.method257(Static100.aClass2_Sub17_Sub1_1.aByteArray38, 2, 0);
				Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
				Static65.anInt1843 = Static100.aClass2_Sub17_Sub1_1.method1783();
				local13 -= 2;
			}
			if (Static65.anInt1843 > local13) {
				return false;
			}
			Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
			Static44.aClass10_2.method257(Static100.aClass2_Sub17_Sub1_1.aByteArray38, Static65.anInt1843, 0);
			Static88.anInt2152 = Static9.anInt255;
			Static9.anInt255 = Static79.anInt2023;
			Static63.anInt1818 = 0;
			Static79.anInt2023 = Static10.anInt298;
			@Pc(126) int local126;
			if (Static10.anInt298 == 112) {
				for (local126 = 0; local126 < Static118.anInt3040; local126++) {
					@Pc(132) Class2_Sub1_Sub11 local132 = Static14.method244(local126);
					if (local132 != null && local132.anInt2157 == 0) {
						Static100.anIntArray337[local126] = 0;
						Static15.anIntArray66[local126] = 0;
					}
				}
				Static10.anInt298 = -1;
				Static70.aBoolean131 = true;
				Static106.anInt2836 = Static10.anInt300;
				if (Static28.anInt2316 != -1) {
					aBoolean77 = true;
				}
				return true;
			}
			@Pc(183) Class2_Sub1_Sub17 local183;
			if (Static10.anInt298 == 40) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1788();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1779();
				local183 = Static123.method1976(local126);
				Static10.anInt298 = -1;
				local183.anInt3019 = local179;
				local183.anInt3018 = 1;
				return true;
			}
			if (Static10.anInt298 == 98) {
				Static89.anInt2165 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static70.aBoolean131 = true;
				Static106.anInt2836 = Static10.anInt300;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 153) {
				Static106.method1802(false);
				Static10.anInt298 = -1;
				return true;
			}
			@Pc(229) long local229;
			@Pc(235) Class80 local235;
			if (Static10.anInt298 == 14) {
				local229 = Static100.aClass2_Sub17_Sub1_1.method1792();
				local235 = Static124.method1978(Static100.aClass2_Sub17_Sub1_1).method2010();
				Static3.method65(6, local235, Static102.method1658(local229).method2000());
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 13) {
				Static39.anInt699 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 188) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1789();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1770();
				local235 = Static100.aClass2_Sub17_Sub1_1.method1797();
				if (local179 >= 1 && local179 <= 5) {
					if (local235.method2006(Static44.aClass80_507)) {
						local235 = null;
					}
					Static65.aClass80Array10[local179 - 1] = local235;
					Static1.aBooleanArray1[local179 - 1] = local126 == 0;
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 17) {
				Static121.method1962();
				Static10.anInt298 = -1;
				return false;
			}
			if (Static10.anInt298 == 93) {
				Static40.aClass80_453 = Static100.aClass2_Sub17_Sub1_1.method1797();
				if (Static57.anInt1737 != -1) {
					Static59.method1042(Static57.anInt1737);
					Static57.anInt1737 = -1;
				}
				Static53.aBoolean109 = false;
				aBoolean77 = true;
				Static10.anInt298 = -1;
				Static40.aClass80_455 = Static40.aClass80_446;
				Static42.anInt1258 = 4;
				return true;
			}
			if (Static10.anInt298 == 65) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1751();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1756();
				if (local179 == 65535) {
					local179 = -1;
				}
				if (local179 == Static39.anIntArray89[local126]) {
					Static10.method174(Static39.anIntArray89[local126]);
				} else {
					Static59.method1042(Static39.anIntArray89[local126]);
					Static39.anIntArray89[local126] = local179;
				}
				Static57.aBoolean119 = true;
				Static70.aBoolean131 = true;
				Static17.method325(Static39.anIntArray89[local126]);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 219) {
				Static23.anInt886 = Static100.aClass2_Sub17_Sub1_1.method1770();
				Static11.anInt304 = Static100.aClass2_Sub17_Sub1_1.method1751();
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 195) {
				for (local126 = 0; local126 < Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1.length; local126++) {
					if (Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local126] != null) {
						Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local126].anInt2374 = -1;
					}
				}
				for (local179 = 0; local179 < Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1.length; local179++) {
					if (Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local179] != null) {
						Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local179].anInt2374 = -1;
					}
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 61) {
				Static56.anInt1718 = Static100.aClass2_Sub17_Sub1_1.method1783() * 30;
				Static10.anInt298 = -1;
				return true;
			}
			@Pc(502) int local502;
			@Pc(506) int local506;
			if (Static10.anInt298 == 108) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local506 = Static100.aClass2_Sub17_Sub1_1.method1780();
				aBooleanArray11[local126] = true;
				Static108.anIntArray366[local126] = local179;
				Static82.anIntArray403[local126] = local502;
				Static103.anIntArray352[local126] = local506;
				Static10.anIntArray28[local126] = 0;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 89) {
				@Pc(544) boolean local544 = Static100.aClass2_Sub17_Sub1_1.method1789() == 1;
				local179 = Static100.aClass2_Sub17_Sub1_1.method1796();
				local183 = Static123.method1976(local179);
				Static10.anInt298 = -1;
				local183.aBoolean229 = local544;
				return true;
			}
			@Pc(584) long local584;
			@Pc(588) int local588;
			@Pc(566) Class80 local566;
			if (Static10.anInt298 == 20) {
				local566 = Static100.aClass2_Sub17_Sub1_1.method1797();
				@Pc(586) boolean local586;
				@Pc(580) Class80 local580;
				if (local566.method2014(Static122.aClass80_1188)) {
					local580 = local566.method2027(0, local566.method2025(Static40.aClass80_458));
					local584 = local580.method2023();
					local586 = false;
					for (local588 = 0; local588 < Static64.anInt1824; local588++) {
						if (local584 == Static64.aLongArray5[local588]) {
							local586 = true;
							break;
						}
					}
					if (!local586 && Static59.anInt1768 == 0) {
						Static3.method65(4, Static35.aClass80_391, local580);
					}
				} else if (local566.method2014(Static44.aClass80_504)) {
					local580 = local566.method2027(0, local566.method2025(Static40.aClass80_458));
					local586 = false;
					local584 = local580.method2023();
					for (local588 = 0; local588 < Static64.anInt1824; local588++) {
						if (Static64.aLongArray5[local588] == local584) {
							local586 = true;
							break;
						}
					}
					if (!local586 && Static59.anInt1768 == 0) {
						Static3.method65(8, Static29.aClass80_355, local580);
					}
				} else if (local566.method2014(Static106.aClass80_1066)) {
					local586 = false;
					local580 = local566.method2027(0, local566.method2025(Static40.aClass80_458));
					local584 = local580.method2023();
					for (local588 = 0; local588 < Static64.anInt1824; local588++) {
						if (local584 == Static64.aLongArray5[local588]) {
							local586 = true;
							break;
						}
					}
					if (!local586 && Static59.anInt1768 == 0) {
						@Pc(762) Class80 local762 = local566.method2027(local566.method2025(Static40.aClass80_458) + 1, local566.method1999() + -9);
						Static3.method65(8, local762, local580);
					}
				} else {
					Static3.method65(0, local566, Static40.aClass80_446);
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 70) {
				Static111.anInt2998 = Static100.aClass2_Sub17_Sub1_1.method1783();
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 35) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1756();
				if (local126 == 65535) {
					local126 = -1;
				}
				Static60.method1047(local126);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 25) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1762();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1779();
				if (local179 == 65535) {
					local179 = -1;
				}
				Static88.method1316(local126, local179);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 26) {
				Static63.method1077();
				Static10.anInt298 = -1;
				return true;
			}
			@Pc(872) long local872;
			if (Static10.anInt298 == 97) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1790();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1788();
				if (local126 == 65535) {
					local126 = -1;
				}
				local502 = Static100.aClass2_Sub17_Sub1_1.method1766();
				local872 = (long) local126 + ((long) local502 << 32);
				@Pc(877) Class2 local877 = Static2.aClass41_1.method1056(local872);
				if (local877 != null) {
					local877.method1961();
				}
				Static2.aClass41_1.method1063(new Class2_Sub11(local179), local872);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 74) {
				for (local126 = 0; local126 < Static15.anIntArray66.length; local126++) {
					if (Static15.anIntArray66[local126] != Static100.anIntArray337[local126]) {
						Static15.anIntArray66[local126] = Static100.anIntArray337[local126];
						Static90.method1345(local126);
						Static70.aBoolean131 = true;
					}
				}
				Static10.anInt298 = -1;
				Static106.anInt2836 = Static10.anInt300;
				return true;
			}
			@Pc(959) Class2_Sub1_Sub17 local959;
			if (Static10.anInt298 == 54) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1796();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1786();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1748();
				local959 = Static123.method1976(local126);
				local959.anInt3037 = local179 + local959.anInt3064;
				local959.anInt3012 = local959.anInt3042 + local502;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 9) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1790();
				@Pc(989) byte local989 = Static100.aClass2_Sub17_Sub1_1.method1777();
				Static100.anIntArray337[local126] = local989;
				if (local989 != Static15.anIntArray66[local126]) {
					Static15.anIntArray66[local126] = local989;
					Static90.method1345(local126);
					Static70.aBoolean131 = true;
					if (Static28.anInt2316 != -1) {
						aBoolean77 = true;
					}
				}
				Static106.anInt2836 = Static10.anInt300;
				Static10.anInt298 = -1;
				return true;
			}
			@Pc(1034) Class2_Sub1_Sub17 local1034;
			if (Static10.anInt298 == 250) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1766();
				local1034 = Static123.method1976(local126);
				for (local502 = 0; local502 < local1034.anIntArray397.length; local502++) {
					local1034.anIntArray397[local502] = -1;
					local1034.anIntArray397[local502] = 0;
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 160) {
				Static63.method1075(Static65.anInt1843, Static100.aClass2_Sub17_Sub1_1, Static9.aClass74_1);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 211) {
				Static64.anInt1824 = Static65.anInt1843 / 8;
				for (local126 = 0; local126 < Static64.anInt1824; local126++) {
					Static64.aLongArray5[local126] = Static100.aClass2_Sub17_Sub1_1.method1792();
				}
				Static10.anInt298 = -1;
				return true;
			}
			@Pc(1332) long local1332;
			if (Static10.anInt298 == 186) {
				local229 = Static100.aClass2_Sub17_Sub1_1.method1792();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1783();
				local506 = Static100.aClass2_Sub17_Sub1_1.method1780();
				@Pc(1132) Class80 local1132 = Static102.method1658(local229).method2000();
				for (local588 = 0; local588 < Static45.anInt2090; local588++) {
					if (local229 == Static3.aLongArray1[local588]) {
						if (local502 != Static29.anIntArray125[local588]) {
							Static29.anIntArray125[local588] = local502;
							Static70.aBoolean131 = true;
							if (local502 > 0) {
								Static3.method65(5, Static93.method1444(new Class80[] { local1132, Static87.aClass80_893 }), Static40.aClass80_446);
							}
							if (local502 == 0) {
								Static3.method65(5, Static93.method1444(new Class80[] { local1132, Static98.aClass80_995 }), Static40.aClass80_446);
							}
						}
						local1132 = null;
						Static118.anIntArray401[local588] = local506;
						break;
					}
				}
				@Pc(1219) boolean local1219 = false;
				if (local1132 != null && Static45.anInt2090 < 200) {
					Static3.aLongArray1[Static45.anInt2090] = local229;
					Static123.aClass80Array20[Static45.anInt2090] = local1132;
					Static29.anIntArray125[Static45.anInt2090] = local502;
					Static118.anIntArray401[Static45.anInt2090] = local506;
					Static70.aBoolean131 = true;
					Static106.anInt2836 = Static10.anInt300;
					Static45.anInt2090++;
				}
				while (!local1219) {
					local1219 = true;
					for (@Pc(1256) int local1256 = 0; local1256 < Static45.anInt2090 - 1; local1256++) {
						if (Static106.anInt2839 != Static29.anIntArray125[local1256] && Static29.anIntArray125[local1256 + 1] == Static106.anInt2839 || Static29.anIntArray125[local1256] == 0 && Static29.anIntArray125[local1256 + 1] != 0) {
							local1219 = false;
							@Pc(1296) int local1296 = Static29.anIntArray125[local1256];
							Static29.anIntArray125[local1256] = Static29.anIntArray125[local1256 + 1];
							Static29.anIntArray125[local1256 + 1] = local1296;
							@Pc(1314) Class80 local1314 = Static123.aClass80Array20[local1256];
							Static123.aClass80Array20[local1256] = Static123.aClass80Array20[local1256 + 1];
							Static123.aClass80Array20[local1256 + 1] = local1314;
							local1332 = Static3.aLongArray1[local1256];
							Static3.aLongArray1[local1256] = Static3.aLongArray1[local1256 + 1];
							Static3.aLongArray1[local1256 + 1] = local1332;
							@Pc(1350) int local1350 = Static118.anIntArray401[local1256];
							Static118.anIntArray401[local1256] = Static118.anIntArray401[local1256 + 1];
							Static118.anIntArray401[local1256 + 1] = local1350;
							Static70.aBoolean131 = true;
						}
					}
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 254) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1770();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1789();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1751();
				Static16.anInt444 = local502 >> 1;
				Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.method1434(local179, local126, (local502 & 0x1) == 1);
				Static10.anInt298 = -1;
				return true;
			}
			@Pc(1465) int local1465;
			if (Static10.anInt298 == 21) {
				Static70.aBoolean131 = true;
				local126 = Static100.aClass2_Sub17_Sub1_1.method1747();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1783();
				if (local126 < 0) {
					local183 = null;
				} else {
					local183 = Static123.method1976(local126);
				}
				if (local126 < -70000) {
					local179 += 32768;
				}
				while (Static65.anInt1843 > Static100.aClass2_Sub17_Sub1_1.anInt2799) {
					local506 = Static100.aClass2_Sub17_Sub1_1.method1787();
					local588 = 0;
					local1465 = Static100.aClass2_Sub17_Sub1_1.method1783();
					if (local1465 != 0) {
						local588 = Static100.aClass2_Sub17_Sub1_1.method1780();
						if (local588 == 255) {
							local588 = Static100.aClass2_Sub17_Sub1_1.method1747();
						}
					}
					if (local183 != null && local506 >= 0 && local506 < local183.anIntArray397.length) {
						local183.anIntArray397[local506] = local1465;
						local183.anIntArray396[local506] = local588;
					}
					Static105.method1432(local506, local588, local1465 - 1, local179);
				}
				Static36.anInt1184 = Static10.anInt300;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 27) {
				local566 = Static100.aClass2_Sub17_Sub1_1.method1797();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1747();
				local183 = Static123.method1976(local179);
				local183.aClass80_1160 = local566;
				if (Static39.anIntArray89[Static23.anInt875] == local179 >> 16) {
					Static70.aBoolean131 = true;
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 136) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1747();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1786();
				local183 = Static123.method1976(local126);
				Static10.anInt298 = -1;
				if (local183.anInt3013 != local179 || local179 == -1) {
					local183.anInt3068 = 0;
					local183.anInt3013 = local179;
					local183.anInt3026 = 0;
				}
				return true;
			}
			if (Static10.anInt298 == 184) {
				Static112.anInt2924 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static6.anInt172 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static111.anInt2993 = Static100.aClass2_Sub17_Sub1_1.method1780();
				aBoolean77 = true;
				Static15.aBoolean35 = true;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 232) {
				Static23.anInt875 = Static100.aClass2_Sub17_Sub1_1.method1751();
				Static10.anInt298 = -1;
				Static70.aBoolean131 = true;
				Static57.aBoolean119 = true;
				return true;
			}
			if (Static10.anInt298 == 220) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1790();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1790();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1766();
				local506 = Static100.aClass2_Sub17_Sub1_1.method1779();
				@Pc(1668) Class2_Sub1_Sub17 local1668 = Static123.method1976(local502);
				local1668.anInt3062 = local179;
				Static10.anInt298 = -1;
				local1668.anInt3014 = local126;
				local1668.anInt3046 = local506;
				return true;
			}
			if (Static10.anInt298 == 111) {
				if (Static97.anInt2559 != -1) {
					Static59.method1042(Static97.anInt2559);
					Static57.aBoolean119 = true;
					Static97.anInt2559 = -1;
					Static70.aBoolean131 = true;
				}
				if (Static57.anInt1737 != -1) {
					Static59.method1042(Static57.anInt1737);
					Static57.anInt1737 = -1;
					aBoolean77 = true;
				}
				if (Static91.anInt2232 != -1) {
					Static59.method1042(Static91.anInt2232);
					Static91.anInt2232 = -1;
					Static10.method167(30);
				}
				if (Static121.anInt3090 != -1) {
					Static59.method1042(Static121.anInt3090);
					Static121.anInt3090 = -1;
				}
				if (Static90.anInt2214 != -1) {
					Static59.method1042(Static90.anInt2214);
					Static90.anInt2214 = -1;
				}
				Static10.anInt298 = -1;
				if (Static42.anInt1258 != 0) {
					Static42.anInt1258 = 0;
					aBoolean77 = true;
				}
				Static124.anInt3134 = -1;
				return true;
			}
			if (Static10.anInt298 == 24) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1779();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1766();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1783();
				local959 = Static123.method1976(local179);
				local959.anInt3011 = local502 + (local126 << 16);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 107) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1786();
				if (local126 >= 0) {
					Static15.method249(local126);
				}
				if (Static67.anInt1865 != local126) {
					Static59.method1042(Static67.anInt1865);
					Static67.anInt1865 = local126;
				}
				Static17.method325(Static67.anInt1865);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 126 || Static10.anInt298 == 148 || Static10.anInt298 == 43 || Static10.anInt298 == 100 || Static10.anInt298 == 196 || Static10.anInt298 == 142 || Static10.anInt298 == 116 || Static10.anInt298 == 60 || Static10.anInt298 == 10 || Static10.anInt298 == 127 || Static10.anInt298 == 236) {
				Static106.method1800();
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 217) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1783();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1783();
				Static55.method714(local502, local179, local126);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 16) {
				if (Static57.anInt1737 != -1) {
					Static59.method1042(Static57.anInt1737);
					Static57.anInt1737 = -1;
				}
				Static42.anInt1258 = 2;
				Static53.aBoolean109 = false;
				aBoolean77 = true;
				Static10.anInt298 = -1;
				Static40.aClass80_455 = Static40.aClass80_446;
				return true;
			}
			if (Static10.anInt298 == 137) {
				if (Static57.anInt1737 != -1) {
					Static59.method1042(Static57.anInt1737);
					Static57.anInt1737 = -1;
				}
				Static40.aClass80_455 = Static40.aClass80_446;
				aBoolean77 = true;
				Static42.anInt1258 = 1;
				Static10.anInt298 = -1;
				Static53.aBoolean109 = false;
				return true;
			}
			if (Static10.anInt298 == 190) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1796();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1779();
				local502 = local179 >> 10 & 0x1F;
				local1465 = local179 & 0x1F;
				local506 = local179 >> 5 & 0x1F;
				@Pc(1975) Class2_Sub1_Sub17 local1975 = Static123.method1976(local126);
				local1975.anInt3069 = (local1465 << 3) + (local502 << 19) + (local506 << 11);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 152) {
				local566 = Static100.aClass2_Sub17_Sub1_1.method1797();
				@Pc(2008) Object[] local2008 = new Object[local566.method1999() + 1];
				for (local502 = local566.method1999() - 1; local502 >= 0; local502--) {
					if (local566.method2031(local502) == 115) {
						local2008[local502 + 1] = Static100.aClass2_Sub17_Sub1_1.method1797();
					} else {
						local2008[local502 + 1] = Integer.valueOf(Static100.aClass2_Sub17_Sub1_1.method1747());
					}
				}
				local2008[0] = Integer.valueOf(Static100.aClass2_Sub17_Sub1_1.method1747());
				Static40.method667(local2008, null, 0, 0, 0, null);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 212) {
				Static112.anInt2919 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 121) {
				Static106.method1802(true);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 73) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1790();
				Static15.method249(local126);
				if (Static97.anInt2559 != -1) {
					Static59.method1042(Static97.anInt2559);
					Static97.anInt2559 = -1;
					Static57.aBoolean119 = true;
					Static70.aBoolean131 = true;
				}
				if (Static57.anInt1737 != -1) {
					Static59.method1042(Static57.anInt1737);
					Static57.anInt1737 = -1;
					aBoolean77 = true;
				}
				if (Static91.anInt2232 != -1) {
					Static59.method1042(Static91.anInt2232);
					Static91.anInt2232 = -1;
					Static10.method167(30);
				}
				if (Static121.anInt3090 != -1) {
					Static59.method1042(Static121.anInt3090);
					Static121.anInt3090 = -1;
				}
				if (local126 == Static90.anInt2214) {
					Static10.method174(Static90.anInt2214);
				} else {
					Static59.method1042(Static90.anInt2214);
					Static90.anInt2214 = local126;
				}
				Static124.anInt3134 = -1;
				if (Static42.anInt1258 != 0) {
					aBoolean77 = true;
					Static42.anInt1258 = 0;
				}
				Static17.method325(Static90.anInt2214);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 199) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1747();
				Static21.aClass56_2 = Static9.aClass74_1.method1867(local126);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 166) {
				Static23.anInt886 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static11.anInt304 = Static100.aClass2_Sub17_Sub1_1.method1780();
				while (Static100.aClass2_Sub17_Sub1_1.anInt2799 < Static65.anInt1843) {
					Static10.anInt298 = Static100.aClass2_Sub17_Sub1_1.method1780();
					Static106.method1800();
				}
				Static10.anInt298 = -1;
				return true;
			}
			@Pc(2309) int local2309;
			if (Static10.anInt298 == 51) {
				Static45.aBoolean157 = true;
				Static40.anInt1236 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static110.anInt2909 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static81.anInt2042 = Static100.aClass2_Sub17_Sub1_1.method1783();
				Static57.anInt1734 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static108.anInt2877 = Static100.aClass2_Sub17_Sub1_1.method1780();
				if (Static108.anInt2877 >= 100) {
					local126 = Static40.anInt1236 * 128 + 64;
					local179 = Static110.anInt2909 * 128 + 64;
					local502 = Static24.method513(local126, Static16.anInt444, local179) - Static81.anInt2042;
					local1465 = local502 - Static107.anInt2863;
					local588 = local179 - Static42.anInt1257;
					local506 = local126 - Static53.anInt1647;
					local2309 = (int) Math.sqrt((double) (local588 * local588 + local506 * local506));
					Static82.anInt3082 = (int) (Math.atan2((double) local1465, (double) local2309) * 325.949D) & 0x7FF;
					Static80.anInt2025 = (int) (Math.atan2((double) local506, (double) local588) * -325.949D) & 0x7FF;
					if (Static82.anInt3082 < 128) {
						Static82.anInt3082 = 128;
					}
					if (Static82.anInt3082 > 383) {
						Static82.anInt3082 = 383;
					}
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 149) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1788();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1788();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1779();
				if (local502 == 65535) {
					local502 = -1;
				}
				local959 = Static123.method1976(local179);
				@Pc(2389) Class2_Sub1_Sub5 local2389;
				if (local959.aBoolean232) {
					local959.anInt3035 = local126;
					local959.anInt3006 = local502;
					local2389 = Static4.method95(local502);
					local959.anInt3046 = local2389.anInt773;
					local959.anInt3062 = local2389.anInt802;
					local959.anInt3052 = local2389.anInt817;
					local959.anInt3023 = local2389.anInt818;
					local959.anInt3014 = local2389.anInt774;
					if (local959.anInt3020 > 0) {
						local959.anInt3014 = local959.anInt3014 * 32 / local959.anInt3020;
					}
					local959.anInt3057 = local2389.anInt776;
					Static66.method1106(local959);
				} else if (local502 == -1) {
					Static10.anInt298 = -1;
					local959.anInt3018 = 0;
					return true;
				} else {
					local2389 = Static4.method95(local502);
					local959.anInt3046 = local2389.anInt773;
					local959.anInt3062 = local2389.anInt802;
					local959.anInt3014 = local2389.anInt774 * 100 / local126;
					local959.anInt3018 = 4;
					local959.anInt3019 = local502;
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 122) {
				if (Static23.anInt875 == 12) {
					Static70.aBoolean131 = true;
				}
				Static120.anInt3077 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static10.anInt298 = -1;
				return true;
			}
			@Pc(2517) long local2517;
			if (Static10.anInt298 == 83) {
				local229 = Static100.aClass2_Sub17_Sub1_1.method1792();
				local584 = Static100.aClass2_Sub17_Sub1_1.method1783();
				@Pc(2507) long local2507 = (long) Static100.aClass2_Sub17_Sub1_1.method1795();
				local2309 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local2517 = (local584 << 32) + local2507;
				@Pc(2519) boolean local2519 = false;
				for (@Pc(2521) int local2521 = 0; local2521 < 100; local2521++) {
					if (Static104.aLongArray9[local2521] == local2517) {
						local2519 = true;
						break;
					}
				}
				if (local2309 <= 1) {
					for (@Pc(2548) int local2548 = 0; local2548 < Static64.anInt1824; local2548++) {
						if (Static64.aLongArray5[local2548] == local229) {
							local2519 = true;
							break;
						}
					}
				}
				if (!local2519 && Static59.anInt1768 == 0) {
					Static104.aLongArray9[Static64.anInt1820] = local2517;
					Static64.anInt1820 = (Static64.anInt1820 + 1) % 100;
					@Pc(2587) Class80 local2587 = Static124.method1978(Static100.aClass2_Sub17_Sub1_1).method2010();
					if (local2309 == 2 || local2309 == 3) {
						Static3.method65(7, local2587, Static93.method1444(new Class80[] { Static4.aClass80_49, Static102.method1658(local229).method2000() }));
					} else if (local2309 == 1) {
						Static3.method65(7, local2587, Static93.method1444(new Class80[] { Static92.aClass80_886, Static102.method1658(local229).method2000() }));
					} else {
						Static3.method65(3, local2587, Static102.method1658(local229).method2000());
					}
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 208) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1783();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1788();
				local183 = Static123.method1976(local179);
				if (local183 != null && local183.anInt3038 == 0) {
					if (local183.anInt3050 - local183.anInt3024 < local126) {
						local126 = local183.anInt3050 - local183.anInt3024;
					}
					if (local126 < 0) {
						local126 = 0;
					}
					local183.anInt3015 = local126;
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 150) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1783();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1783();
				Static15.method249(local126);
				if (local179 != -1) {
					Static15.method249(local179);
				}
				if (Static90.anInt2214 != -1) {
					Static59.method1042(Static90.anInt2214);
					Static90.anInt2214 = -1;
				}
				if (Static97.anInt2559 != -1) {
					Static59.method1042(Static97.anInt2559);
					Static97.anInt2559 = -1;
				}
				if (Static57.anInt1737 != -1) {
					Static59.method1042(Static57.anInt1737);
					Static57.anInt1737 = -1;
				}
				if (Static91.anInt2232 == local126) {
					Static10.method174(Static91.anInt2232);
				} else {
					Static59.method1042(Static91.anInt2232);
					Static91.anInt2232 = local126;
					Static10.method167(35);
				}
				if (local126 == Static121.anInt3090) {
					Static10.method174(Static121.anInt3090);
				} else {
					Static59.method1042(Static121.anInt3090);
					Static121.anInt3090 = local179;
				}
				Static124.anInt3134 = -1;
				Static42.anInt1258 = 0;
				Static17.method325(Static91.anInt2232);
				Static17.method325(Static121.anInt3090);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 104) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1756();
				Static35.method626(local126);
				Static10.anInt298 = -1;
				Static36.anInt1184 = Static10.anInt300;
				return true;
			}
			if (Static10.anInt298 == 1) {
				Static11.anInt304 = Static100.aClass2_Sub17_Sub1_1.method1789();
				Static23.anInt886 = Static100.aClass2_Sub17_Sub1_1.method1770();
				for (local126 = Static23.anInt886; local126 < Static23.anInt886 + 8; local126++) {
					for (local179 = Static11.anInt304; local179 < Static11.anInt304 + 8; local179++) {
						if (Static45.aClass58ArrayArrayArray3[Static16.anInt444][local126][local179] != null) {
							Static45.aClass58ArrayArrayArray3[Static16.anInt444][local126][local179] = null;
							Static86.method1284(local126, local179);
						}
					}
				}
				for (@Pc(2900) Class2_Sub5 local2900 = (Class2_Sub5) Static90.aClass58_11.method1285(); local2900 != null; local2900 = (Class2_Sub5) Static90.aClass58_11.method1281()) {
					if (local2900.anInt1509 >= Static23.anInt886 && Static23.anInt886 + 8 > local2900.anInt1509 && Static11.anInt304 <= local2900.anInt1497 && Static11.anInt304 + 8 > local2900.anInt1497 && local2900.anInt1502 == Static16.anInt444) {
						local2900.anInt1505 = 0;
					}
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 46) {
				Static110.anInt2904 = Static100.aClass2_Sub17_Sub1_1.method1770();
				if (Static110.anInt2904 == Static23.anInt875) {
					Static70.aBoolean131 = true;
					if (Static110.anInt2904 == 3) {
						Static23.anInt875 = 1;
					} else {
						Static23.anInt875 = 3;
					}
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 145) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1796();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1790();
				Static100.anIntArray337[local179] = local126;
				if (Static15.anIntArray66[local179] != local126) {
					Static15.anIntArray66[local179] = local126;
					Static90.method1345(local179);
					if (Static28.anInt2316 != -1) {
						aBoolean77 = true;
					}
					Static70.aBoolean131 = true;
				}
				Static10.anInt298 = -1;
				Static106.anInt2836 = Static10.anInt300;
				return true;
			}
			if (Static10.anInt298 == 38) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1766();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1779();
				local183 = Static123.method1976(local126);
				local183.anInt3018 = 2;
				local183.anInt3019 = local179;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 120) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1756();
				Static15.method249(local126);
				if (Static97.anInt2559 != -1) {
					Static59.method1042(Static97.anInt2559);
					Static57.aBoolean119 = true;
					Static70.aBoolean131 = true;
					Static97.anInt2559 = -1;
				}
				if (Static91.anInt2232 != -1) {
					Static59.method1042(Static91.anInt2232);
					Static91.anInt2232 = -1;
					Static10.method167(30);
				}
				if (Static121.anInt3090 != -1) {
					Static59.method1042(Static121.anInt3090);
					Static121.anInt3090 = -1;
				}
				if (Static90.anInt2214 != -1) {
					Static59.method1042(Static90.anInt2214);
					Static90.anInt2214 = -1;
				}
				if (Static57.anInt1737 == local126) {
					Static10.method174(Static57.anInt1737);
				} else {
					Static59.method1042(Static57.anInt1737);
					Static57.anInt1737 = local126;
				}
				Static124.anInt3134 = -1;
				Static17.method325(Static57.anInt1737);
				aBoolean77 = true;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 29) {
				Static39.method367();
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 244) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1783();
				Static15.method249(local126);
				if (Static57.anInt1737 != -1) {
					Static59.method1042(Static57.anInt1737);
					aBoolean77 = true;
					Static57.anInt1737 = -1;
				}
				if (Static91.anInt2232 != -1) {
					Static59.method1042(Static91.anInt2232);
					Static91.anInt2232 = -1;
					Static10.method167(30);
				}
				if (Static121.anInt3090 != -1) {
					Static59.method1042(Static121.anInt3090);
					Static121.anInt3090 = -1;
				}
				if (Static90.anInt2214 != -1) {
					Static59.method1042(Static90.anInt2214);
					Static90.anInt2214 = -1;
				}
				if (local126 == Static97.anInt2559) {
					Static10.method174(Static97.anInt2559);
				} else {
					Static59.method1042(Static97.anInt2559);
					Static97.anInt2559 = local126;
				}
				if (Static42.anInt1258 != 0) {
					aBoolean77 = true;
					Static42.anInt1258 = 0;
				}
				Static70.aBoolean131 = true;
				Static124.anInt3134 = -1;
				Static57.aBoolean119 = true;
				Static17.method325(Static97.anInt2559);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 139) {
				Static45.aBoolean157 = true;
				Static55.anInt1315 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static68.anInt1871 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static24.anInt987 = Static100.aClass2_Sub17_Sub1_1.method1783();
				Static123.anInt3120 = Static100.aClass2_Sub17_Sub1_1.method1780();
				Static45.anInt2097 = Static100.aClass2_Sub17_Sub1_1.method1780();
				if (Static45.anInt2097 >= 100) {
					Static53.anInt1647 = Static55.anInt1315 * 128 + 64;
					Static42.anInt1257 = Static68.anInt1871 * 128 + 64;
					Static107.anInt2863 = Static24.method513(Static53.anInt1647, Static16.anInt444, Static42.anInt1257) - Static24.anInt987;
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 146) {
				if (Static23.anInt875 == 12) {
					Static70.aBoolean131 = true;
				}
				Static55.anInt1307 = Static100.aClass2_Sub17_Sub1_1.method1784();
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 198) {
				Static70.aBoolean131 = true;
				local126 = Static100.aClass2_Sub17_Sub1_1.method1747();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1783();
				if (local126 < -70000) {
					local179 += 32768;
				}
				if (local126 < 0) {
					local183 = null;
				} else {
					local183 = Static123.method1976(local126);
				}
				if (local183 != null) {
					for (local506 = 0; local506 < local183.anIntArray397.length; local506++) {
						local183.anIntArray397[local506] = 0;
						local183.anIntArray396[local506] = 0;
					}
				}
				Static119.method999(local179);
				local506 = Static100.aClass2_Sub17_Sub1_1.method1783();
				for (local1465 = 0; local1465 < local506; local1465++) {
					local588 = Static100.aClass2_Sub17_Sub1_1.method1770();
					if (local588 == 255) {
						local588 = Static100.aClass2_Sub17_Sub1_1.method1788();
					}
					local2309 = Static100.aClass2_Sub17_Sub1_1.method1790();
					if (local183 != null && local1465 < local183.anIntArray397.length) {
						local183.anIntArray397[local1465] = local2309;
						local183.anIntArray396[local1465] = local588;
					}
					Static105.method1432(local1465, local588, local2309 - 1, local179);
				}
				Static36.anInt1184 = Static10.anInt300;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 79) {
				Static85.anInt2063 = Static100.aClass2_Sub17_Sub1_1.method1780();
				if (Static85.anInt2063 == 1) {
					Static28.anInt2314 = Static100.aClass2_Sub17_Sub1_1.method1783();
				}
				if (Static85.anInt2063 >= 2 && Static85.anInt2063 <= 6) {
					if (Static85.anInt2063 == 2) {
						Static121.anInt3094 = 64;
						Static31.anInt1091 = 64;
					}
					if (Static85.anInt2063 == 3) {
						Static121.anInt3094 = 64;
						Static31.anInt1091 = 0;
					}
					if (Static85.anInt2063 == 4) {
						Static121.anInt3094 = 64;
						Static31.anInt1091 = 128;
					}
					if (Static85.anInt2063 == 5) {
						Static31.anInt1091 = 64;
						Static121.anInt3094 = 0;
					}
					if (Static85.anInt2063 == 6) {
						Static31.anInt1091 = 64;
						Static121.anInt3094 = 128;
					}
					Static85.anInt2063 = 2;
					Static94.anInt2418 = Static100.aClass2_Sub17_Sub1_1.method1783();
					Static108.anInt2878 = Static100.aClass2_Sub17_Sub1_1.method1783();
					Static88.anInt2162 = Static100.aClass2_Sub17_Sub1_1.method1780();
				}
				if (Static85.anInt2063 == 10) {
					Static83.anInt2048 = Static100.aClass2_Sub17_Sub1_1.method1783();
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 76) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1779();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1783();
				if (Static57.anInt1737 != -1) {
					Static59.method1042(Static57.anInt1737);
					aBoolean77 = true;
					Static57.anInt1737 = -1;
				}
				if (Static91.anInt2232 != -1) {
					Static59.method1042(Static91.anInt2232);
					Static91.anInt2232 = -1;
					Static10.method167(30);
				}
				if (Static121.anInt3090 != -1) {
					Static59.method1042(Static121.anInt3090);
					Static121.anInt3090 = -1;
				}
				if (local179 == Static90.anInt2214) {
					Static10.method174(Static90.anInt2214);
				} else {
					Static59.method1042(Static90.anInt2214);
					Static90.anInt2214 = local179;
				}
				if (local126 == Static97.anInt2559) {
					Static10.method174(Static97.anInt2559);
				} else {
					Static59.method1042(Static97.anInt2559);
					Static97.anInt2559 = local126;
				}
				Static57.aBoolean119 = true;
				Static70.aBoolean131 = true;
				Static124.anInt3134 = -1;
				if (Static42.anInt1258 != 0) {
					aBoolean77 = true;
					Static42.anInt1258 = 0;
				}
				Static17.method325(Static90.anInt2214);
				Static17.method325(Static97.anInt2559);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 194) {
				Static45.aBoolean157 = false;
				for (local126 = 0; local126 < 5; local126++) {
					aBooleanArray11[local126] = false;
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 163) {
				local229 = Static100.aClass2_Sub17_Sub1_1.method1792();
				@Pc(3669) byte local3669 = Static100.aClass2_Sub17_Sub1_1.method1767();
				local872 = Static100.aClass2_Sub17_Sub1_1.method1792();
				@Pc(3680) long local3680 = (long) Static100.aClass2_Sub17_Sub1_1.method1783();
				local2517 = Static100.aClass2_Sub17_Sub1_1.method1795();
				@Pc(3691) int local3691 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local1332 = local2517 + (local3680 << 32);
				@Pc(3699) boolean local3699 = false;
				for (@Pc(3701) int local3701 = 0; local3701 < 100; local3701++) {
					if (local1332 == Static104.aLongArray9[local3701]) {
						local3699 = true;
						break;
					}
				}
				if (local3691 <= 1) {
					for (@Pc(3728) int local3728 = 0; local3728 < Static64.anInt1824; local3728++) {
						if (Static64.aLongArray5[local3728] == local229) {
							local3699 = true;
							break;
						}
					}
				}
				if (!local3699 && Static59.anInt1768 == 0) {
					Static104.aLongArray9[Static64.anInt1820] = local1332;
					Static64.anInt1820 = (Static64.anInt1820 + 1) % 100;
					@Pc(3764) Class80 local3764 = Static124.method1978(Static100.aClass2_Sub17_Sub1_1).method2010();
					@Pc(3793) Class80 local3793 = Static93.method1444(new Class80[] { Static124.aClass80_1197, Static102.method1658(local872), Static19.aClass80_269, Static28.method1422(local3669), Static50.aClass80_547 });
					if (local3691 == 2 || local3691 == 3) {
						Static3.method65(7, local3764, Static93.method1444(new Class80[] { local3793, Static4.aClass80_49, Static102.method1658(local229).method2000() }));
					} else if (local3691 == 1) {
						Static3.method65(7, local3764, Static93.method1444(new Class80[] { local3793, Static92.aClass80_886, Static102.method1658(local229).method2000() }));
					} else {
						Static3.method65(3, local3764, Static93.method1444(new Class80[] { local3793, Static102.method1658(local229).method2000() }));
					}
				}
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 110) {
				Static70.aBoolean131 = true;
				local126 = Static100.aClass2_Sub17_Sub1_1.method1747();
				local179 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local502 = Static100.aClass2_Sub17_Sub1_1.method1770();
				Static7.anIntArray16[local179] = local126;
				Static111.anIntArray393[local179] = local502;
				Static94.anIntArray315[local179] = 1;
				for (local506 = 0; local506 < 98; local506++) {
					if (Class2_Sub1_Sub12.anIntArray287[local506] <= local126) {
						Static94.anIntArray315[local179] = local506 + 2;
					}
				}
				Static97.anInt2557 = Static10.anInt300;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 105) {
				Static119.anInt1678 = 0;
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 192) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1786();
				if (local126 != Static28.anInt2316) {
					Static59.method1042(Static28.anInt2316);
					Static28.anInt2316 = local126;
				}
				aBoolean77 = true;
				Static17.method325(Static28.anInt2316);
				Static10.anInt298 = -1;
				return true;
			}
			if (Static10.anInt298 == 134) {
				local126 = Static100.aClass2_Sub17_Sub1_1.method1796();
				local1034 = Static123.method1976(local126);
				local1034.anInt3018 = 3;
				local1034.anInt3019 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass79_2.method1987();
				Static10.anInt298 = -1;
				return true;
			}
			Static53.method953("T1 - " + Static10.anInt298 + "," + Static9.anInt255 + "," + Static88.anInt2152 + " - " + Static65.anInt1843, null);
			Static121.method1962();
		} catch (@Pc(4035) IOException local4035) {
			Static108.method1827();
		} catch (@Pc(4041) Exception local4041) {
			@Pc(4081) String local4081 = "T2 - " + Static10.anInt298 + "," + Static9.anInt255 + "," + Static88.anInt2152 + " - " + Static65.anInt1843 + "," + (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0] + Static57.anInt1736) + "," + (Static66.anInt1860 + Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0]) + " - ";
			for (local179 = 0; Static65.anInt1843 > local179 && local179 < 50; local179++) {
				local4081 = local4081 + Static100.aClass2_Sub17_Sub1_1.aByteArray38[local179] + ",";
			}
			Static53.method953(local4081, local4041);
			Static121.method1962();
		}
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public static void method654() {
		aClass11_Sub1_9 = null;
		aClass32_22 = null;
		aClass80_430 = null;
		aClass80_428 = null;
		anIntArray152 = null;
		aBooleanArray11 = null;
		anIntArrayArrayArray1 = null;
		aClass80_429 = null;
		aClass11_21 = null;
		aFrame1 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!se;II)V")
	public static void method655(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		Static78.method1209(arg0.anInt2370, arg1, arg0.anInt2324);
	}
}
