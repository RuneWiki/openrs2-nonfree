import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!dd;")
	public static Class14 aClass14_23;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public static int anInt2396;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!dd;")
	public static Class14 aClass14_24;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public static int anInt2400;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1122 = Static56.method816("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5 = new byte[4][104][104];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public static void method1476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static17.anInt434 != 0 && Static17.anInt434 != 3 || Static39.anInt964 != 1) {
			return;
		}
		@Pc(26) int local26 = Static3.anInt51 - arg0 - 25;
		@Pc(33) int local33 = Static74.anInt1781 - arg1 - 5;
		if (local26 < 0 || local33 < 0 || local26 >= 146 || local33 >= 151) {
			return;
		}
		local33 -= 75;
		local26 -= 73;
		@Pc(53) int local53 = Static111.anInt3027 + Static72.anInt1744 & 0x7FF;
		@Pc(57) int local57 = Class8_Sub1_Sub3_Sub1.anIntArray38[local53];
		@Pc(65) int local65 = local57 * (Static47.anInt1268 + 256) >> 8;
		@Pc(69) int local69 = Class8_Sub1_Sub3_Sub1.anIntArray40[local53];
		@Pc(77) int local77 = (Static47.anInt1268 + 256) * local69 >> 8;
		@Pc(88) int local88 = local33 * local65 + local77 * local26 >> 11;
		@Pc(95) int local95 = local88 + Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 >> 7;
		@Pc(106) int local106 = local77 * local33 - local65 * local26 >> 11;
		@Pc(114) int local114 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 - local106 >> 7;
		@Pc(136) boolean local136 = method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 1, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local95, local114, 0, true);
		if (!local136) {
			return;
		}
		Static106.aClass8_Sub20_Sub1_3.method1883(local26);
		Static106.aClass8_Sub20_Sub1_3.method1883(local33);
		Static106.aClass8_Sub20_Sub1_3.method1884(Static72.anInt1744);
		Static106.aClass8_Sub20_Sub1_3.method1883(57);
		Static106.aClass8_Sub20_Sub1_3.method1883(Static111.anInt3027);
		Static106.aClass8_Sub20_Sub1_3.method1883(Static47.anInt1268);
		Static106.aClass8_Sub20_Sub1_3.method1883(89);
		Static106.aClass8_Sub20_Sub1_3.method1884(Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043);
		Static106.aClass8_Sub20_Sub1_3.method1884(Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059);
		Static106.aClass8_Sub20_Sub1_3.method1883(Static22.anInt2546);
		Static106.aClass8_Sub20_Sub1_3.method1883(63);
		return;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ic;ZB)V")
	public static void method1477(@OriginalArg(0) Class34 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = Static81.aClass8_Sub1_Sub3_Sub4_Sub1_3.method1764(arg0, 250);
		@Pc(17) int local17 = Static81.aClass8_Sub1_Sub3_Sub4_Sub1_3.method1759(arg0, 250) * 13;
		Static110.method1729(6, 6, local8 + 4 + 4, local17 + 4 - -4, 0);
		Static110.method1738(6, 6, local8 + 4 + 4, local17 - -4 + 4, 16777215);
		Static81.aClass8_Sub1_Sub3_Sub4_Sub1_3.method1763(arg0, 10, 10, local8, local17, 16777215, -1, 1, 1, 0);
		Static125.method1974(local17 + 4 + 4, local8 + 8, 6, 6);
		if (!arg1) {
			Static24.method1160(10, local17, local8, 10);
			return;
		}
		try {
			@Pc(104) Graphics local104 = Static119.aCanvas1.getGraphics();
			Static31.aClass62_1.method1990(local104);
		} catch (@Pc(112) Exception local112) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method1478() {
		aClass34_1122 = null;
		aClass14_23 = null;
		aClass14_24 = null;
		aByteArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)I")
	public static int method1479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((aByteArrayArrayArray5[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (aByteArrayArrayArray5[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method1480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = 0; local12 < 104; local12++) {
			for (local16 = 0; local16 < 104; local16++) {
				Static93.anIntArrayArray23[local12][local16] = 0;
				Static60.anIntArrayArray11[local12][local16] = 99999999;
			}
		}
		local16 = arg2;
		Static93.anIntArrayArray23[arg2][arg4] = 99;
		Static60.anIntArrayArray11[arg2][arg4] = 0;
		@Pc(56) int local56 = arg4;
		@Pc(58) boolean local58 = false;
		@Pc(60) byte local60 = 0;
		@Pc(62) int local62 = 0;
		Static74.anIntArray229[0] = arg2;
		@Pc(69) int local69 = local60 + 1;
		Static24.anIntArray250[0] = arg4;
		@Pc(76) int[][] local76 = Static97.aClass42Array1[Static42.anInt1024].anIntArrayArray12;
		@Pc(79) int local79 = Static74.anIntArray229.length;
		@Pc(185) int local185;
		while (local62 != local69) {
			local56 = Static24.anIntArray250[local62];
			local16 = Static74.anIntArray229[local62];
			local62 = (local62 + 1) % local79;
			if (arg7 == local16 && arg8 == local56) {
				local58 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static97.aClass42Array1[Static42.anInt1024].method1026(arg0 - 1, local56, arg8, arg7, local16, arg1)) {
					local58 = true;
					break;
				}
				if (arg0 < 10 && Static97.aClass42Array1[Static42.anInt1024].method1016(arg8, arg0 - 1, local16, local56, arg1, arg7)) {
					local58 = true;
					break;
				}
			}
			if (arg6 != 0 && arg9 != 0 && Static97.aClass42Array1[Static42.anInt1024].method1025(arg6, local16, arg9, arg7, arg5, local56, arg8)) {
				local58 = true;
				break;
			}
			local185 = Static60.anIntArrayArray11[local16][local56] + 1;
			if (local16 > 0 && Static93.anIntArrayArray23[local16 - 1][local56] == 0 && (local76[local16 - 1][local56] & 0x12C0108) == 0) {
				Static74.anIntArray229[local69] = local16 - 1;
				Static24.anIntArray250[local69] = local56;
				Static93.anIntArrayArray23[local16 - 1][local56] = 2;
				Static60.anIntArrayArray11[local16 - 1][local56] = local185;
				local69 = (local69 + 1) % local79;
			}
			if (local16 < 103 && Static93.anIntArrayArray23[local16 + 1][local56] == 0 && (local76[local16 + 1][local56] & 0x12C0180) == 0) {
				Static74.anIntArray229[local69] = local16 + 1;
				Static24.anIntArray250[local69] = local56;
				Static93.anIntArrayArray23[local16 + 1][local56] = 8;
				Static60.anIntArrayArray11[local16 + 1][local56] = local185;
				local69 = (local69 + 1) % local79;
			}
			if (local56 > 0 && Static93.anIntArrayArray23[local16][local56 - 1] == 0 && (local76[local16][local56 - 1] & 0x12C0102) == 0) {
				Static74.anIntArray229[local69] = local16;
				Static24.anIntArray250[local69] = local56 - 1;
				local69 = (local69 + 1) % local79;
				Static93.anIntArrayArray23[local16][local56 - 1] = 1;
				Static60.anIntArrayArray11[local16][local56 - 1] = local185;
			}
			if (local56 < 103 && Static93.anIntArrayArray23[local16][local56 + 1] == 0 && (local76[local16][local56 + 1] & 0x12C0120) == 0) {
				Static74.anIntArray229[local69] = local16;
				Static24.anIntArray250[local69] = local56 + 1;
				Static93.anIntArrayArray23[local16][local56 + 1] = 4;
				local69 = (local69 + 1) % local79;
				Static60.anIntArrayArray11[local16][local56 + 1] = local185;
			}
			if (local16 > 0 && local56 > 0 && Static93.anIntArrayArray23[local16 - 1][local56 - 1] == 0 && (local76[local16 - 1][local56 - 1] & 0x12C010E) == 0 && (local76[local16 - 1][local56] & 0x12C0108) == 0 && (local76[local16][local56 - 1] & 0x12C0102) == 0) {
				Static74.anIntArray229[local69] = local16 - 1;
				Static24.anIntArray250[local69] = local56 - 1;
				local69 = (local69 + 1) % local79;
				Static93.anIntArrayArray23[local16 - 1][local56 - 1] = 3;
				Static60.anIntArrayArray11[local16 - 1][local56 - 1] = local185;
			}
			if (local16 < 103 && local56 > 0 && Static93.anIntArrayArray23[local16 + 1][local56 - 1] == 0 && (local76[local16 + 1][local56 - 1] & 0x12C0183) == 0 && (local76[local16 + 1][local56] & 0x12C0180) == 0 && (local76[local16][local56 - 1] & 0x12C0102) == 0) {
				Static74.anIntArray229[local69] = local16 + 1;
				Static24.anIntArray250[local69] = local56 - 1;
				local69 = (local69 + 1) % local79;
				Static93.anIntArrayArray23[local16 + 1][local56 - 1] = 9;
				Static60.anIntArrayArray11[local16 + 1][local56 - 1] = local185;
			}
			if (local16 > 0 && local56 < 103 && Static93.anIntArrayArray23[local16 - 1][local56 + 1] == 0 && (local76[local16 - 1][local56 + 1] & 0x12C0138) == 0 && (local76[local16 - 1][local56] & 0x12C0108) == 0 && (local76[local16][local56 + 1] & 0x12C0120) == 0) {
				Static74.anIntArray229[local69] = local16 - 1;
				Static24.anIntArray250[local69] = local56 + 1;
				Static93.anIntArrayArray23[local16 - 1][local56 + 1] = 6;
				local69 = (local69 + 1) % local79;
				Static60.anIntArrayArray11[local16 - 1][local56 + 1] = local185;
			}
			if (local16 < 103 && local56 < 103 && Static93.anIntArrayArray23[local16 + 1][local56 + 1] == 0 && (local76[local16 + 1][local56 + 1] & 0x12C01E0) == 0 && (local76[local16 + 1][local56] & 0x12C0180) == 0 && (local76[local16][local56 + 1] & 0x12C0120) == 0) {
				Static74.anIntArray229[local69] = local16 + 1;
				Static24.anIntArray250[local69] = local56 + 1;
				local69 = (local69 + 1) % local79;
				Static93.anIntArrayArray23[local16 + 1][local56 + 1] = 12;
				Static60.anIntArrayArray11[local16 + 1][local56 + 1] = local185;
			}
		}
		Static22.anInt2546 = 0;
		@Pc(805) int local805;
		@Pc(810) int local810;
		@Pc(817) int local817;
		if (!local58) {
			if (!arg10) {
				return false;
			}
			local185 = 1000;
			local805 = 100;
			for (local810 = arg7 - 10; local810 <= arg7 + 10; local810++) {
				for (local817 = arg8 - 10; local817 <= arg8 + 10; local817++) {
					if (local810 >= 0 && local817 >= 0 && local810 < 104 && local817 < 104 && Static60.anIntArrayArray11[local810][local817] < 100) {
						@Pc(842) int local842 = 0;
						if (arg8 > local817) {
							local842 = arg8 - local817;
						} else if (local817 > arg8 + arg9 - 1) {
							local842 = local817 + 1 - arg8 - arg9;
						}
						@Pc(874) int local874 = 0;
						if (local810 < arg7) {
							local874 = arg7 - local810;
						} else if (local810 > arg6 + arg7 - 1) {
							local874 = local810 + 1 - arg7 - arg6;
						}
						@Pc(912) int local912 = local842 * local842 + local874 * local874;
						if (local185 > local912 || local185 == local912 && local805 > Static60.anIntArrayArray11[local810][local817]) {
							local16 = local810;
							local185 = local912;
							local56 = local817;
							local805 = Static60.anIntArrayArray11[local810][local817];
						}
					}
				}
			}
			if (local185 == 1000) {
				return false;
			}
			if (arg2 == local16 && arg4 == local56) {
				return false;
			}
			Static22.anInt2546 = 1;
		}
		@Pc(987) byte local987 = 0;
		Static74.anIntArray229[0] = local16;
		local62 = local987 + 1;
		Static24.anIntArray250[0] = local56;
		local185 = local805 = Static93.anIntArrayArray23[local16][local56];
		while (local16 != arg2 || local56 != arg4) {
			if (local805 != local185) {
				local805 = local185;
				Static74.anIntArray229[local62] = local16;
				Static24.anIntArray250[local62++] = local56;
			}
			if ((local185 & 0x2) != 0) {
				local16++;
			} else if ((local185 & 0x8) != 0) {
				local16--;
			}
			if ((local185 & 0x1) != 0) {
				local56++;
			} else if ((local185 & 0x4) != 0) {
				local56--;
			}
			local185 = Static93.anIntArrayArray23[local16][local56];
		}
		if (local62 > 0) {
			local79 = local62--;
			@Pc(1079) int local1079 = Static74.anIntArray229[local62];
			if (local79 > 25) {
				local79 = 25;
			}
			local810 = Static24.anIntArray250[local62];
			if (arg3 == 0) {
				Static106.aClass8_Sub20_Sub1_3.method1907(165);
				Static106.aClass8_Sub20_Sub1_3.method1883(local79 + local79 + 3);
			}
			if (arg3 == 1) {
				Static106.aClass8_Sub20_Sub1_3.method1907(245);
				Static106.aClass8_Sub20_Sub1_3.method1883(local79 + local79 + 3 + 14);
			}
			if (arg3 == 2) {
				Static106.aClass8_Sub20_Sub1_3.method1907(141);
				Static106.aClass8_Sub20_Sub1_3.method1883(local79 + local79 + 3);
			}
			Static106.aClass8_Sub20_Sub1_3.method1884(local810 + Static64.anInt2062);
			Static106.aClass8_Sub20_Sub1_3.method1843(local1079 + Static82.anInt1959);
			Static106.aClass8_Sub20_Sub1_3.method1866(Static87.aBooleanArray17[82] ? 1 : 0);
			Static81.anInt1951 = Static74.anIntArray229[0];
			Static50.anInt1321 = Static24.anIntArray250[0];
			for (local817 = 1; local817 < local79; local817++) {
				local62--;
				Static106.aClass8_Sub20_Sub1_3.method1886(Static74.anIntArray229[local62] - local1079);
				Static106.aClass8_Sub20_Sub1_3.method1886(Static24.anIntArray250[local62] - local810);
			}
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
