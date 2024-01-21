import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_8;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "Lclient!gd;")
	public static Class28 aClass28_35 = new Class28(500);

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "[I")
	public static int[] anIntArray214 = new int[200];

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "Lclient!af;")
	public static Class5 aClass5_671 = Static45.method1937("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ia", name = "gb", descriptor = "Lclient!af;")
	public static Class5 aClass5_672 = Static45.method1937("<col=40ff00>");

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "Lclient!af;")
	public static Class5 aClass5_673 = Static45.method1937("Lade)3)3)3");

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "[I")
	public static int[] anIntArray215 = new int[32];

	@OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
	public static int anInt1300 = 1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)Z")
	public static boolean method939(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!rd;Lclient!oc;ZI)V")
	public static void method941(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub10 local9 = new Class1_Sub10();
		local9.anInt1388 = arg0.method2053();
		local9.anInt1391 = arg0.method2094();
		local9.aClass51Array1 = new Class51[local9.anInt1388];
		local9.aClass51Array2 = new Class51[local9.anInt1388];
		local9.anIntArray228 = new int[local9.anInt1388];
		local9.anIntArray226 = new int[local9.anInt1388];
		local9.anIntArray227 = new int[local9.anInt1388];
		local9.aByteArrayArrayArray3 = new byte[local9.anInt1388][][];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt1388; local55++) {
			try {
				@Pc(61) int local61 = arg0.method2053();
				@Pc(80) String local80;
				@Pc(89) String local89;
				@Pc(91) int local91;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local80 = new String(arg0.method2101().method220());
					local89 = new String(arg0.method2101().method220());
					local91 = 0;
					if (local61 == 1) {
						local91 = arg0.method2094();
					}
					local9.anIntArray227[local55] = local61;
					local9.anIntArray226[local55] = local91;
					local9.aClass51Array2[local55] = arg1.method1540(local89, Static3.method62(local80));
				} else if (local61 == 3 || local61 == 4) {
					local80 = new String(arg0.method2101().method220());
					local89 = new String(arg0.method2101().method220());
					local91 = arg0.method2053();
					@Pc(154) String[] local154 = new String[local91];
					for (@Pc(156) int local156 = 0; local156 < local91; local156++) {
						local154[local156] = new String(arg0.method2101().method220());
					}
					@Pc(180) byte[][] local180 = new byte[local91][];
					@Pc(191) int local191;
					if (local61 == 3) {
						for (@Pc(185) int local185 = 0; local185 < local91; local185++) {
							local191 = arg0.method2094();
							local180[local185] = new byte[local191];
							arg0.method2077(local191, local180[local185]);
						}
					}
					@Pc(215) Class[] local215 = new Class[local91];
					local9.anIntArray227[local55] = local61;
					for (local191 = 0; local191 < local91; local191++) {
						local215[local191] = Static3.method62(local154[local191]);
					}
					local9.aClass51Array1[local55] = arg1.method1539(local89, local215, Static3.method62(local80));
					local9.aByteArrayArrayArray3[local55] = local180;
				}
			} catch (@Pc(259) ClassNotFoundException local259) {
				local9.anIntArray228[local55] = -1;
			} catch (@Pc(266) SecurityException local266) {
				local9.anIntArray228[local55] = -2;
			} catch (@Pc(273) NullPointerException local273) {
				local9.anIntArray228[local55] = -3;
			} catch (@Pc(280) Exception local280) {
				local9.anIntArray228[local55] = -4;
			} catch (@Pc(287) Throwable local287) {
				local9.anIntArray228[local55] = -5;
			}
		}
		Static104.aClass53_12.method1449(local9);
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
	public static void method943() {
		aClass5_673 = null;
		anIntArray215 = null;
		anIntArray214 = null;
		aClass28_35 = null;
		aClass41_Sub1_8 = null;
		aClass5_672 = null;
		aClass5_671 = null;
		Class1_Sub3_Sub9.anIntArray213 = null;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)V")
	public static void method944() {
		if (!Static131.aBoolean125) {
			return;
		}
		Static5.aClass1_Sub3_Sub1_Sub3Array2 = null;
		Static93.aClass1_Sub3_Sub1_Sub3Array6 = null;
		Static100.aClass1_Sub3_Sub1_Sub3Array9 = null;
		Static71.anIntArray276 = null;
		Static57.aClass1_Sub3_Sub1_Sub3Array4 = null;
		Static58.aClass1_Sub3_Sub1_Sub3_3 = null;
		Static93.aClass1_Sub3_Sub1_Sub3Array7 = null;
		Static44.anIntArray187 = null;
		Static55.aClass1_Sub3_Sub1_Sub2_2 = null;
		Static17.anIntArray70 = null;
		Static3.anIntArray14 = null;
		Static8.aClass1_Sub3_Sub1_Sub3_1 = null;
		Static25.anIntArray89 = null;
		Static10.aClass1_Sub3_Sub1_Sub3_2 = null;
		Static106.anIntArray396 = null;
		Static11.anIntArray43 = null;
		Static96.aClass1_Sub3_Sub1_Sub2Array5 = null;
		Static131.aClass1_Sub3_Sub1_Sub3_5 = null;
		Static122.aClass1_Sub3_Sub1_Sub2_5 = null;
		Static99.anIntArray376 = null;
		Static1.method52();
		Static51.method896(true);
		Static131.aBoolean125 = false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!kb;ILjava/awt/Component;Lclient!kb;)V")
	public static void method945(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class41 arg2) {
		if (Static131.aBoolean125) {
			return;
		}
		Static33.method1980();
		@Pc(15) byte[] local15 = arg2.method1711(Static93.aClass5_1117, Static81.aClass5_1005);
		Static122.aClass1_Sub3_Sub1_Sub2_5 = new Class1_Sub3_Sub1_Sub2(local15, arg1);
		Static55.aClass1_Sub3_Sub1_Sub2_2 = Static122.aClass1_Sub3_Sub1_Sub2_5.method737();
		Static131.aClass1_Sub3_Sub1_Sub3_5 = Static90.method1563(Static84.aClass5_1044, Static93.aClass5_1117, arg0);
		Static58.aClass1_Sub3_Sub1_Sub3_3 = Static90.method1563(Static3.aClass5_41, Static93.aClass5_1117, arg0);
		Static10.aClass1_Sub3_Sub1_Sub3_2 = Static90.method1563(Static119.aClass5_1376, Static93.aClass5_1117, arg0);
		Static93.aClass1_Sub3_Sub1_Sub3Array7 = Static24.method541(Static93.aClass5_1117, Static66.aClass5_1399, arg0);
		Static93.aClass1_Sub3_Sub1_Sub3Array6 = Static24.method541(Static93.aClass5_1117, Static64.aClass5_787, arg0);
		Static71.anIntArray276 = new int[256];
		for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
			Static71.anIntArray276[local67] = local67 * 262144;
		}
		for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
			Static71.anIntArray276[local81 + 64] = local81 * 1024 + 16711680;
		}
		for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
			Static71.anIntArray276[local99 + 128] = local99 * 4 + 16776960;
		}
		for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
			Static71.anIntArray276[local117 + 192] = 16777215;
		}
		Static99.anIntArray376 = new int[256];
		for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
			Static99.anIntArray376[local134] = local134 * 1024;
		}
		for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
			Static99.anIntArray376[local148 + 64] = local148 * 4 + 65280;
		}
		for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
			Static99.anIntArray376[local166 + 128] = local166 * 262144 + 65535;
		}
		for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
			Static99.anIntArray376[local184 + 192] = 16777215;
		}
		Static3.anIntArray14 = new int[256];
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static3.anIntArray14[local203] = local203 * 4;
		}
		for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
			Static3.anIntArray14[local217 + 64] = local217 * 262144 + 255;
		}
		for (@Pc(238) int local238 = 0; local238 < 64; local238++) {
			Static3.anIntArray14[local238 + 128] = local238 * 1024 + 16711935;
		}
		for (@Pc(258) int local258 = 0; local258 < 64; local258++) {
			Static3.anIntArray14[local258 + 192] = 16777215;
		}
		Static44.anIntArray187 = new int[256];
		Static17.anIntArray70 = new int[32768];
		Static25.anIntArray89 = new int[32768];
		Static103.method1752(null);
		Static93.aClass5_1120 = Static93.aClass5_1117;
		Static106.anIntArray396 = new int[32768];
		Static11.anIntArray43 = new int[32768];
		Static93.aClass5_1114 = Static93.aClass5_1117;
		Static78.anInt1875 = 0;
		Static84.aBoolean75 = false;
		if (Static82.anInt2065 == 0) {
			Static97.aBoolean96 = true;
		} else {
			Static97.aBoolean96 = false;
		}
		if (Static97.aBoolean96) {
			Static1.method52();
		} else {
			Static108.method1880(Static98.aClass41_Sub1_16, Static93.aClass5_1117, Static24.aClass5_352);
		}
		Static51.method896(false);
		Static131.aBoolean125 = true;
		Static122.aClass1_Sub3_Sub1_Sub2_5.method760(0, 0);
		Static55.aClass1_Sub3_Sub1_Sub2_2.method760(382, 0);
		Static131.aClass1_Sub3_Sub1_Sub3_5.method1687(382 - Static131.aClass1_Sub3_Sub1_Sub3_5.anInt2443 / 2, 18);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	public static boolean method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static47.anIntArrayArray37[local3][local7] = 0;
				Static111.anIntArrayArray79[local3][local7] = 99999999;
			}
		}
		local7 = arg3;
		Static47.anIntArrayArray37[arg3][arg10] = 99;
		Static111.anIntArrayArray79[arg3][arg10] = 0;
		@Pc(49) byte local49 = 0;
		@Pc(55) int local55 = arg10;
		Static91.anIntArray347[0] = arg3;
		@Pc(61) int local61 = 0;
		@Pc(64) int local64 = local49 + 1;
		Static97.anIntArray367[0] = arg10;
		@Pc(68) boolean local68 = false;
		@Pc(71) int local71 = Static91.anIntArray347.length;
		@Pc(76) int[][] local76 = Static131.aClass49Array1[Static7.anInt213].anIntArrayArray58;
		@Pc(194) int local194;
		while (local61 != local64) {
			local7 = Static91.anIntArray347[local61];
			local55 = Static97.anIntArray367[local61];
			local61 = (local61 + 1) % local71;
			if (arg0 == local7 && arg1 == local55) {
				local68 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static131.aClass49Array1[Static7.anInt213].method1324(arg2 - 1, local55, arg9, arg1, local7, arg0)) {
					local68 = true;
					break;
				}
				if (arg2 < 10 && Static131.aClass49Array1[Static7.anInt213].method1323(local55, arg1, arg9, local7, arg0, arg2 - 1)) {
					local68 = true;
					break;
				}
			}
			if (arg6 != 0 && arg5 != 0 && Static131.aClass49Array1[Static7.anInt213].method1330(local7, arg5, arg1, arg0, arg4, local55, arg6)) {
				local68 = true;
				break;
			}
			local194 = Static111.anIntArrayArray79[local7][local55] + 1;
			if (local7 > 0 && Static47.anIntArrayArray37[local7 - 1][local55] == 0 && (local76[local7 - 1][local55] & 0x12C0108) == 0) {
				Static91.anIntArray347[local64] = local7 - 1;
				Static97.anIntArray367[local64] = local55;
				local64 = (local64 + 1) % local71;
				Static47.anIntArrayArray37[local7 - 1][local55] = 2;
				Static111.anIntArrayArray79[local7 - 1][local55] = local194;
			}
			if (local7 < 103 && Static47.anIntArrayArray37[local7 + 1][local55] == 0 && (local76[local7 + 1][local55] & 0x12C0180) == 0) {
				Static91.anIntArray347[local64] = local7 + 1;
				Static97.anIntArray367[local64] = local55;
				local64 = (local64 + 1) % local71;
				Static47.anIntArrayArray37[local7 + 1][local55] = 8;
				Static111.anIntArrayArray79[local7 + 1][local55] = local194;
			}
			if (local55 > 0 && Static47.anIntArrayArray37[local7][local55 - 1] == 0 && (local76[local7][local55 - 1] & 0x12C0102) == 0) {
				Static91.anIntArray347[local64] = local7;
				Static97.anIntArray367[local64] = local55 - 1;
				Static47.anIntArrayArray37[local7][local55 - 1] = 1;
				local64 = (local64 + 1) % local71;
				Static111.anIntArrayArray79[local7][local55 - 1] = local194;
			}
			if (local55 < 103 && Static47.anIntArrayArray37[local7][local55 + 1] == 0 && (local76[local7][local55 + 1] & 0x12C0120) == 0) {
				Static91.anIntArray347[local64] = local7;
				Static97.anIntArray367[local64] = local55 + 1;
				Static47.anIntArrayArray37[local7][local55 + 1] = 4;
				Static111.anIntArrayArray79[local7][local55 + 1] = local194;
				local64 = (local64 + 1) % local71;
			}
			if (local7 > 0 && local55 > 0 && Static47.anIntArrayArray37[local7 - 1][local55 - 1] == 0 && (local76[local7 - 1][local55 - 1] & 0x12C010E) == 0 && (local76[local7 - 1][local55] & 0x12C0108) == 0 && (local76[local7][local55 - 1] & 0x12C0102) == 0) {
				Static91.anIntArray347[local64] = local7 - 1;
				Static97.anIntArray367[local64] = local55 - 1;
				Static47.anIntArrayArray37[local7 - 1][local55 - 1] = 3;
				Static111.anIntArrayArray79[local7 - 1][local55 - 1] = local194;
				local64 = (local64 + 1) % local71;
			}
			if (local7 < 103 && local55 > 0 && Static47.anIntArrayArray37[local7 + 1][local55 - 1] == 0 && (local76[local7 + 1][local55 - 1] & 0x12C0183) == 0 && (local76[local7 + 1][local55] & 0x12C0180) == 0 && (local76[local7][local55 - 1] & 0x12C0102) == 0) {
				Static91.anIntArray347[local64] = local7 + 1;
				Static97.anIntArray367[local64] = local55 - 1;
				Static47.anIntArrayArray37[local7 + 1][local55 - 1] = 9;
				Static111.anIntArrayArray79[local7 + 1][local55 - 1] = local194;
				local64 = (local64 + 1) % local71;
			}
			if (local7 > 0 && local55 < 103 && Static47.anIntArrayArray37[local7 - 1][local55 + 1] == 0 && (local76[local7 - 1][local55 + 1] & 0x12C0138) == 0 && (local76[local7 - 1][local55] & 0x12C0108) == 0 && (local76[local7][local55 + 1] & 0x12C0120) == 0) {
				Static91.anIntArray347[local64] = local7 - 1;
				Static97.anIntArray367[local64] = local55 + 1;
				local64 = (local64 + 1) % local71;
				Static47.anIntArrayArray37[local7 - 1][local55 + 1] = 6;
				Static111.anIntArrayArray79[local7 - 1][local55 + 1] = local194;
			}
			if (local7 < 103 && local55 < 103 && Static47.anIntArrayArray37[local7 + 1][local55 + 1] == 0 && (local76[local7 + 1][local55 + 1] & 0x12C01E0) == 0 && (local76[local7 + 1][local55] & 0x12C0180) == 0 && (local76[local7][local55 + 1] & 0x12C0120) == 0) {
				Static91.anIntArray347[local64] = local7 + 1;
				Static97.anIntArray367[local64] = local55 + 1;
				local64 = (local64 + 1) % local71;
				Static47.anIntArrayArray37[local7 + 1][local55 + 1] = 12;
				Static111.anIntArrayArray79[local7 + 1][local55 + 1] = local194;
			}
		}
		Static118.anInt2975 = 0;
		@Pc(813) int local813;
		@Pc(822) int local822;
		@Pc(829) int local829;
		if (!local68) {
			if (!arg7) {
				return false;
			}
			local813 = 100;
			local194 = 1000;
			for (local822 = arg0 - 10; local822 <= arg0 + 10; local822++) {
				for (local829 = arg1 - 10; local829 <= arg1 + 10; local829++) {
					if (local822 >= 0 && local829 >= 0 && local822 < 104 && local829 < 104 && Static111.anIntArrayArray79[local822][local829] < 100) {
						@Pc(857) int local857 = 0;
						if (arg0 > local822) {
							local857 = arg0 - local822;
						} else if (arg0 + arg6 - 1 < local822) {
							local857 = local822 + 1 - arg0 - arg6;
						}
						@Pc(889) int local889 = 0;
						if (arg1 > local829) {
							local889 = arg1 - local829;
						} else if (arg1 + arg5 - 1 < local829) {
							local889 = local829 + 1 - arg5 - arg1;
						}
						@Pc(932) int local932 = local889 * local889 + local857 * local857;
						if (local194 > local932 || local932 == local194 && local813 > Static111.anIntArrayArray79[local822][local829]) {
							local194 = local932;
							local55 = local829;
							local7 = local822;
							local813 = Static111.anIntArrayArray79[local822][local829];
						}
					}
				}
			}
			if (local194 == 1000) {
				return false;
			}
			if (local7 == arg3 && local55 == arg10) {
				return false;
			}
			Static118.anInt2975 = 1;
		}
		@Pc(1006) byte local1006 = 0;
		Static91.anIntArray347[0] = local7;
		local61 = local1006 + 1;
		Static97.anIntArray367[0] = local55;
		local194 = local813 = Static47.anIntArrayArray37[local7][local55];
		while (arg3 != local7 || arg10 != local55) {
			if (local813 != local194) {
				Static91.anIntArray347[local61] = local7;
				Static97.anIntArray367[local61++] = local55;
				local813 = local194;
			}
			if ((local194 & 0x1) != 0) {
				local55++;
			} else if ((local194 & 0x4) != 0) {
				local55--;
			}
			if ((local194 & 0x2) != 0) {
				local7++;
			} else if ((local194 & 0x8) != 0) {
				local7--;
			}
			local194 = Static47.anIntArrayArray37[local7][local55];
		}
		if (local61 > 0) {
			local71 = local61;
			if (local61 > 25) {
				local71 = 25;
			}
			local61--;
			@Pc(1094) int local1094 = Static91.anIntArray347[local61];
			local822 = Static97.anIntArray367[local61];
			if (arg8 == 0) {
				Static44.aClass1_Sub20_Sub1_1.method2108(53);
				Static44.aClass1_Sub20_Sub1_1.method2081(local71 + local71 + 3);
			}
			if (arg8 == 1) {
				Static44.aClass1_Sub20_Sub1_1.method2108(111);
				Static44.aClass1_Sub20_Sub1_1.method2081(local71 + local71 + 14 + 3);
			}
			if (arg8 == 2) {
				Static44.aClass1_Sub20_Sub1_1.method2108(110);
				Static44.aClass1_Sub20_Sub1_1.method2081(local71 + local71 + 3);
			}
			Static44.aClass1_Sub20_Sub1_1.method2086(Static102.aBooleanArray24[82] ? 1 : 0);
			Static44.aClass1_Sub20_Sub1_1.method2061(Static32.anInt927 + local822);
			Static44.aClass1_Sub20_Sub1_1.method2064(Static129.anInt3262 + local1094);
			Static75.anInt1750 = Static97.anIntArray367[0];
			Static39.anInt1037 = Static91.anIntArray347[0];
			for (local829 = 1; local829 < local71; local829++) {
				local61--;
				Static44.aClass1_Sub20_Sub1_1.method2082(Static91.anIntArray347[local61] - local1094);
				Static44.aClass1_Sub20_Sub1_1.method2058(Static97.anIntArray367[local61] - local822);
			}
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
