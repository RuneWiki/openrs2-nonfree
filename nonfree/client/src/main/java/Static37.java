import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
	public static int anInt1017;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!sd;")
	public static Class2 aClass2_6;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static int anInt1012 = -1;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_474 = Static56.method972("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	public static int anInt1023 = 0;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
	public static int anInt1024 = -1;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_475 = Static56.method972(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!ae;")
	private static Class5 aClass5_476 = Static56.method972("Loading sprites )2 ");

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!ae;")
	public static Class5 aClass5_477 = aClass5_476;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "[I")
	public static int[] anIntArray123 = new int[1000];

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
	public static int anInt1040 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method692() {
		aClass5_475 = null;
		anIntArray123 = null;
		aClass5_476 = null;
		aClass5_477 = null;
		aClass2_6 = null;
		aClass5_474 = null;
		aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
	public static boolean method693(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Lclient!db;")
	public static Class3_Sub1_Sub3 method694(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub3 local10 = (Class3_Sub1_Sub3) Static91.aClass9_22.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static47.aClass11_29.method1882(10, arg0);
		local10 = new Class3_Sub1_Sub3();
		local10.anInt667 = arg0;
		if (local20 != null) {
			local10.method421(new Class3_Sub6(local20));
		}
		local10.method432();
		if (local10.anInt657 != -1) {
			local10.method424(method694(local10.anInt666), method694(local10.anInt657));
		}
		if (!Static79.aBoolean94 && local10.aBoolean30) {
			local10.aClass5Array4 = null;
			local10.aClass5Array5 = null;
			local10.anInt665 = 0;
			local10.aClass5_300 = Static68.aClass5_757;
		}
		Static91.aClass9_22.method284(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZZII[B)V")
	public static void method695(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (Static93.aClass25_1 == null) {
			return;
		}
		if (Static42.anInt1188 >= 0) {
			arg1 -= 20;
			if (arg1 < 1) {
				arg1 = 1;
			}
			Static78.anInt1964 = arg1;
			if (Static42.anInt1188 == 0) {
				Static92.anInt2363 = 0;
			} else {
				@Pc(31) int local31 = Static68.method995(Static42.anInt1188);
				@Pc(35) int local35 = local31 - Static109.anInt2872;
				Static92.anInt2363 = (local35 + arg1 + 3600 - 1) / arg1;
			}
			Static44.aByteArray8 = arg3;
			Static52.aBoolean66 = arg0;
			Static112.anInt2928 = arg2;
		} else if (Static78.anInt1964 == 0) {
			Static78.method1270(arg2, arg0, arg3);
		} else {
			Static44.aByteArray8 = arg3;
			Static112.anInt2928 = arg2;
			Static52.aBoolean66 = arg0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIZIIII)Z")
	public static boolean method696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static12.anIntArrayArray3[local3][local7] = 0;
				Static49.anIntArrayArray12[local3][local7] = 99999999;
			}
		}
		Static12.anIntArrayArray3[arg8][arg9] = 99;
		local7 = arg8;
		Static49.anIntArrayArray12[arg8][arg9] = 0;
		@Pc(53) byte local53 = 0;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = arg9;
		Static4.anIntArray36[0] = arg8;
		@Pc(71) int local71 = local53 + 1;
		Static102.anIntArray312[0] = arg9;
		@Pc(76) int local76 = Static4.anIntArray36.length;
		@Pc(81) int[][] local81 = Static80.aClass30Array1[Static12.anInt480].anIntArrayArray9;
		@Pc(83) boolean local83 = false;
		@Pc(195) int local195;
		while (local71 != local62) {
			local64 = Static102.anIntArray312[local62];
			local7 = Static4.anIntArray36[local62];
			local62 = (local62 + 1) % local76;
			if (local7 == arg10 && local64 == arg1) {
				local83 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static80.aClass30Array1[Static12.anInt480].method712(arg1, local64, arg10, arg2, local7, arg0 - 1)) {
					local83 = true;
					break;
				}
				if (arg0 < 10 && Static80.aClass30Array1[Static12.anInt480].method710(arg1, arg10, arg0 - 1, arg2, local64, local7)) {
					local83 = true;
					break;
				}
			}
			if (arg4 != 0 && arg5 != 0 && Static80.aClass30Array1[Static12.anInt480].method700(arg7, local64, arg1, local7, arg5, arg10, arg4)) {
				local83 = true;
				break;
			}
			local195 = Static49.anIntArrayArray12[local7][local64] + 1;
			if (local7 > 0 && Static12.anIntArrayArray3[local7 - 1][local64] == 0 && (local81[local7 - 1][local64] & 0x1280108) == 0) {
				Static4.anIntArray36[local71] = local7 - 1;
				Static102.anIntArray312[local71] = local64;
				Static12.anIntArrayArray3[local7 - 1][local64] = 2;
				Static49.anIntArrayArray12[local7 - 1][local64] = local195;
				local71 = (local71 + 1) % local76;
			}
			if (local7 < 103 && Static12.anIntArrayArray3[local7 + 1][local64] == 0 && (local81[local7 + 1][local64] & 0x1280180) == 0) {
				Static4.anIntArray36[local71] = local7 + 1;
				Static102.anIntArray312[local71] = local64;
				local71 = (local71 + 1) % local76;
				Static12.anIntArrayArray3[local7 + 1][local64] = 8;
				Static49.anIntArrayArray12[local7 + 1][local64] = local195;
			}
			if (local64 > 0 && Static12.anIntArrayArray3[local7][local64 - 1] == 0 && (local81[local7][local64 - 1] & 0x1280102) == 0) {
				Static4.anIntArray36[local71] = local7;
				Static102.anIntArray312[local71] = local64 - 1;
				local71 = (local71 + 1) % local76;
				Static12.anIntArrayArray3[local7][local64 - 1] = 1;
				Static49.anIntArrayArray12[local7][local64 - 1] = local195;
			}
			if (local64 < 103 && Static12.anIntArrayArray3[local7][local64 + 1] == 0 && (local81[local7][local64 + 1] & 0x1280120) == 0) {
				Static4.anIntArray36[local71] = local7;
				Static102.anIntArray312[local71] = local64 + 1;
				local71 = (local71 + 1) % local76;
				Static12.anIntArrayArray3[local7][local64 + 1] = 4;
				Static49.anIntArrayArray12[local7][local64 + 1] = local195;
			}
			if (local7 > 0 && local64 > 0 && Static12.anIntArrayArray3[local7 - 1][local64 - 1] == 0 && (local81[local7 - 1][local64 - 1] & 0x128010E) == 0 && (local81[local7 - 1][local64] & 0x1280108) == 0 && (local81[local7][local64 - 1] & 0x1280102) == 0) {
				Static4.anIntArray36[local71] = local7 - 1;
				Static102.anIntArray312[local71] = local64 - 1;
				local71 = (local71 + 1) % local76;
				Static12.anIntArrayArray3[local7 - 1][local64 - 1] = 3;
				Static49.anIntArrayArray12[local7 - 1][local64 - 1] = local195;
			}
			if (local7 < 103 && local64 > 0 && Static12.anIntArrayArray3[local7 + 1][local64 - 1] == 0 && (local81[local7 + 1][local64 - 1] & 0x1280183) == 0 && (local81[local7 + 1][local64] & 0x1280180) == 0 && (local81[local7][local64 - 1] & 0x1280102) == 0) {
				Static4.anIntArray36[local71] = local7 + 1;
				Static102.anIntArray312[local71] = local64 - 1;
				local71 = (local71 + 1) % local76;
				Static12.anIntArrayArray3[local7 + 1][local64 - 1] = 9;
				Static49.anIntArrayArray12[local7 + 1][local64 - 1] = local195;
			}
			if (local7 > 0 && local64 < 103 && Static12.anIntArrayArray3[local7 - 1][local64 + 1] == 0 && (local81[local7 - 1][local64 + 1] & 0x1280138) == 0 && (local81[local7 - 1][local64] & 0x1280108) == 0 && (local81[local7][local64 + 1] & 0x1280120) == 0) {
				Static4.anIntArray36[local71] = local7 - 1;
				Static102.anIntArray312[local71] = local64 + 1;
				local71 = (local71 + 1) % local76;
				Static12.anIntArrayArray3[local7 - 1][local64 + 1] = 6;
				Static49.anIntArrayArray12[local7 - 1][local64 + 1] = local195;
			}
			if (local7 < 103 && local64 < 103 && Static12.anIntArrayArray3[local7 + 1][local64 + 1] == 0 && (local81[local7 + 1][local64 + 1] & 0x12801E0) == 0 && (local81[local7 + 1][local64] & 0x1280180) == 0 && (local81[local7][local64 + 1] & 0x1280120) == 0) {
				Static4.anIntArray36[local71] = local7 + 1;
				Static102.anIntArray312[local71] = local64 + 1;
				Static12.anIntArrayArray3[local7 + 1][local64 + 1] = 12;
				local71 = (local71 + 1) % local76;
				Static49.anIntArrayArray12[local7 + 1][local64 + 1] = local195;
			}
		}
		Static7.anInt367 = 0;
		@Pc(825) int local825;
		@Pc(830) int local830;
		@Pc(837) int local837;
		if (!local83) {
			if (!arg6) {
				return false;
			}
			local195 = 1000;
			local825 = 100;
			for (local830 = arg10 - 10; local830 <= arg10 + 10; local830++) {
				for (local837 = arg1 - 10; local837 <= arg1 + 10; local837++) {
					if (local830 >= 0 && local837 >= 0 && local830 < 104 && local837 < 104 && Static49.anIntArrayArray12[local830][local837] < 100) {
						@Pc(867) int local867 = 0;
						@Pc(869) int local869 = 0;
						if (local837 < arg1) {
							local869 = arg1 - local837;
						} else if (arg5 + arg1 - 1 < local837) {
							local869 = local837 + 1 - arg1 - arg5;
						}
						if (arg10 > local830) {
							local867 = arg10 - local830;
						} else if (local830 > arg10 + arg4 - 1) {
							local867 = local830 + 1 - arg4 - arg10;
						}
						@Pc(936) int local936 = local867 * local867 + local869 * local869;
						if (local936 < local195 || local936 == local195 && local825 > Static49.anIntArrayArray12[local830][local837]) {
							local7 = local830;
							local825 = Static49.anIntArrayArray12[local830][local837];
							local64 = local837;
							local195 = local936;
						}
					}
				}
			}
			if (local195 == 1000) {
				return false;
			}
			if (local7 == arg8 && local64 == arg9) {
				return false;
			}
			Static7.anInt367 = 1;
		}
		@Pc(1009) byte local1009 = 0;
		Static4.anIntArray36[0] = local7;
		local62 = local1009 + 1;
		Static102.anIntArray312[0] = local64;
		local195 = local825 = Static12.anIntArrayArray3[local7][local64];
		while (arg8 != local7 || arg9 != local64) {
			if (local825 != local195) {
				Static4.anIntArray36[local62] = local7;
				local825 = local195;
				Static102.anIntArray312[local62++] = local64;
			}
			if ((local195 & 0x1) != 0) {
				local64++;
			} else if ((local195 & 0x4) != 0) {
				local64--;
			}
			if ((local195 & 0x2) != 0) {
				local7++;
			} else if ((local195 & 0x8) != 0) {
				local7--;
			}
			local195 = Static12.anIntArrayArray3[local7][local64];
		}
		if (local62 > 0) {
			local76 = local62;
			if (local62 > 25) {
				local76 = 25;
			}
			local62--;
			local830 = Static102.anIntArray312[local62];
			@Pc(1116) int local1116 = Static4.anIntArray36[local62];
			if (arg3 == 0) {
				Static95.aClass3_Sub6_Sub1_3.method1645(99);
				Static95.aClass3_Sub6_Sub1_3.method1608(local76 + local76 + 3);
			}
			if (arg3 == 1) {
				Static95.aClass3_Sub6_Sub1_3.method1645(80);
				Static95.aClass3_Sub6_Sub1_3.method1608(local76 + local76 + 3 + 14);
			}
			if (arg3 == 2) {
				Static95.aClass3_Sub6_Sub1_3.method1645(81);
				Static95.aClass3_Sub6_Sub1_3.method1608(local76 + local76 + 3);
			}
			Static95.aClass3_Sub6_Sub1_3.method1599(local1116 + Static109.anInt2875);
			Static95.aClass3_Sub6_Sub1_3.method1588(Static14.aBooleanArray25[82] ? 1 : 0);
			Static95.aClass3_Sub6_Sub1_3.method1589(Static52.anInt1378 + local830);
			Static46.anInt1284 = Static4.anIntArray36[0];
			Static78.anInt1956 = Static102.anIntArray312[0];
			for (local837 = 1; local837 < local76; local837++) {
				local62--;
				Static95.aClass3_Sub6_Sub1_3.method1608(Static4.anIntArray36[local62] - local1116);
				Static95.aClass3_Sub6_Sub1_3.method1600(Static102.anIntArray312[local62] - local830);
			}
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLclient!ae;Lclient!ae;I)V")
	public static void method697(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class5 arg2) {
		@Pc(1) short local1 = 151;
		@Pc(2) int local2 = local1 - 3;
		if (Static27.aBoolean42) {
			Static27.aBoolean42 = false;
			Static55.method946();
			Static7.method200();
			Static67.method1169();
			Static110.method1916();
			Static115.method1957(Static9.anInt428, Static99.anInt2488, Static88.aClass3_Sub1_Sub2_Sub1_3, Static12.anInt479);
			Static101.method1687(Static88.anIntArray255, Static106.anInt2736 == -1, -1, Static60.anInt2979);
			Static88.aBoolean110 = true;
			Static73.aBoolean87 = true;
			Static12.aBoolean20 = true;
		}
		Static27.method544();
		Static88.aClass3_Sub1_Sub2_Sub1_3.method259(arg1, 257, 148, 0);
		Static88.aClass3_Sub1_Sub2_Sub1_3.method259(arg1, 256, 147, 16777215);
		if (arg2 != null) {
			local2 += 15;
			if (arg0) {
				@Pc(77) int local77 = Static88.aClass3_Sub1_Sub2_Sub1_3.method267(arg2) + 4;
				Static66.method1839(257 - local77 / 2, 152, local77, 11, 0);
			}
			Static88.aClass3_Sub1_Sub2_Sub1_3.method259(arg2, 257, 163, 0);
			Static88.aClass3_Sub1_Sub2_Sub1_3.method259(arg2, 256, 162, 16777215);
		}
		Static76.method1697();
	}
}
