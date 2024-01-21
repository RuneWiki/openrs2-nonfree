import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!je", name = "Jb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1741 = Static94.method1596("Could not complete login)3");

	@OriginalMember(owner = "client!je", name = "Tb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1745 = Static94.method1596("Too many connections from your address)3");

	@OriginalMember(owner = "client!je", name = "Kb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1742 = aClass1_1745;

	@OriginalMember(owner = "client!je", name = "Lb", descriptor = "[I")
	public static int[] anIntArray173 = new int[25];

	@OriginalMember(owner = "client!je", name = "Ob", descriptor = "Lclient!a;")
	private static Class1 aClass1_1743 = Static94.method1596("Members object");

	@OriginalMember(owner = "client!je", name = "Pb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1744 = Static94.method1596("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!je", name = "Qb", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[112];

	@OriginalMember(owner = "client!je", name = "Ub", descriptor = "I")
	public static int anInt1703 = 0;

	@OriginalMember(owner = "client!je", name = "Wb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1746 = Static94.method1596("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!je", name = "Zb", descriptor = "I")
	public static int anInt1707 = -1;

	@OriginalMember(owner = "client!je", name = "ac", descriptor = "Lclient!a;")
	public static Class1 aClass1_1747 = aClass1_1741;

	@OriginalMember(owner = "client!je", name = "cc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1748 = Static94.method1596(" )2> @whi@");

	@OriginalMember(owner = "client!je", name = "dc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1749 = aClass1_1743;

	@OriginalMember(owner = "client!je", name = "fc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1750 = Static94.method1596("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	public static void method1167() {
		@Pc(10) int local10 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 + Static81.anInt2132;
		@Pc(21) int local21 = Static7.anInt1194 + Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724;
		if (Static41.anInt1395 - local21 < -500 || Static41.anInt1395 - local21 > 500 || Static62.anInt1878 - local10 < -500 || Static62.anInt1878 - local10 > 500) {
			Static62.anInt1878 = local10;
			Static41.anInt1395 = local21;
		}
		if (Static41.anInt1395 != local21) {
			Static41.anInt1395 += (local21 - Static41.anInt1395) / 16;
		}
		if (Static62.anInt1878 != local10) {
			Static62.anInt1878 += (local10 - Static62.anInt1878) / 16;
		}
		if (aBooleanArray12[96]) {
			Static15.anInt693 += (-Static15.anInt693 - 24) / 2;
		} else if (aBooleanArray12[97]) {
			Static15.anInt693 += (24 - Static15.anInt693) / 2;
		} else {
			Static15.anInt693 /= 2;
		}
		if (aBooleanArray12[98]) {
			Static99.anInt2526 += (12 - Static99.anInt2526) / 2;
		} else if (aBooleanArray12[99]) {
			Static99.anInt2526 += (-Static99.anInt2526 - 12) / 2;
		} else {
			Static99.anInt2526 /= 2;
		}
		@Pc(143) int local143 = Static62.anInt1878 >> 7;
		Static94.anInt2376 = Static15.anInt693 / 2 + Static94.anInt2376 & 0x7FF;
		@Pc(155) int local155 = Static41.anInt1395 >> 7;
		Static110.anInt2777 += Static99.anInt2526 / 2;
		@Pc(163) int local163 = 0;
		if (Static110.anInt2777 < 128) {
			Static110.anInt2777 = 128;
		}
		if (Static110.anInt2777 > 383) {
			Static110.anInt2777 = 383;
		}
		@Pc(181) int local181 = Static65.method1338(Static2.anInt287, Static41.anInt1395, Static62.anInt1878);
		@Pc(203) int local203;
		if (local155 > 3 && local143 > 3 && local155 < 100 && local143 < 100) {
			for (local203 = local155 - 4; local203 <= local155 + 4; local203++) {
				for (@Pc(209) int local209 = local143 - 4; local209 <= local143 + 4; local209++) {
					@Pc(213) int local213 = Static2.anInt287;
					if (local213 < 3 && (Static29.aByteArrayArrayArray2[1][local203][local209] & 0x2) == 2) {
						local213++;
					}
					@Pc(243) int local243 = local181 - Static50.anIntArrayArrayArray7[local213][local203][local209];
					if (local243 > local163) {
						local163 = local243;
					}
				}
			}
		}
		local203 = local163 * 192;
		if (local203 > 98048) {
			local203 = 98048;
		}
		if (local203 < 32768) {
			local203 = 32768;
		}
		if (Static50.anInt1637 < local203) {
			Static50.anInt1637 += (local203 - Static50.anInt1637) / 24;
		} else if (Static50.anInt1637 > local203) {
			Static50.anInt1637 += (local203 - Static50.anInt1637) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public static void method1168() {
		if (Static54.anInt1771 != 0 || Static103.anInt2617 != 1) {
			return;
		}
		@Pc(23) int local23 = Static93.anInt2360 - 575;
		@Pc(29) int local29 = Static1.anInt13 - 4 - 5;
		if (local23 < 0 || local29 < 0 || local23 >= 146 || local29 >= 151) {
			return;
		}
		local29 -= 75;
		local23 -= 73;
		@Pc(53) int local53 = Static72.anInt1975 + Static94.anInt2376 & 0x7FF;
		@Pc(57) int local57 = Class2_Sub1_Sub2_Sub3.anIntArray106[local53];
		@Pc(61) int local61 = Class2_Sub1_Sub2_Sub3.anIntArray107[local53];
		@Pc(69) int local69 = (Static85.anInt2254 + 256) * local61 >> 8;
		@Pc(77) int local77 = (Static85.anInt2254 + 256) * local57 >> 8;
		@Pc(88) int local88 = local29 * local77 + local23 * local69 >> 11;
		@Pc(98) int local98 = local69 * local29 - local23 * local77 >> 11;
		@Pc(106) int local106 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 + local88 >> 7;
		@Pc(114) int local114 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 - local98 >> 7;
		@Pc(134) boolean local134 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local106, 0, true, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local114, 1);
		if (!local134) {
			return;
		}
		Static59.aClass2_Sub3_Sub1_2.method788(local23);
		Static59.aClass2_Sub3_Sub1_2.method788(local29);
		Static59.aClass2_Sub3_Sub1_2.method797(Static94.anInt2376);
		Static59.aClass2_Sub3_Sub1_2.method788(57);
		Static59.aClass2_Sub3_Sub1_2.method788(Static72.anInt1975);
		Static59.aClass2_Sub3_Sub1_2.method788(Static85.anInt2254);
		Static59.aClass2_Sub3_Sub1_2.method788(89);
		Static59.aClass2_Sub3_Sub1_2.method797(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724);
		Static59.aClass2_Sub3_Sub1_2.method797(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717);
		Static59.aClass2_Sub3_Sub1_2.method788(Static95.anInt2395);
		Static59.aClass2_Sub3_Sub1_2.method788(63);
		return;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Lclient!a;")
	public static Class1 method1169() {
		@Pc(7) Class1 local7 = new Class1();
		local7.aByteArray1 = new byte[100];
		local7.anInt23 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!wa;)V")
	public static void method1170(@OriginalArg(1) Class67 arg0) {
		Static79.aClass67_1 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;ZLclient!bd;Lclient!bd;)V")
	public static void method1171(@OriginalArg(0) Component arg0, @OriginalArg(2) Class8 arg1, @OriginalArg(3) Class8 arg2) {
		if (Static34.aBoolean61) {
			return;
		}
		Static12.aClass4_61 = Static86.method1550(265, 128, arg0);
		Static92.method1127();
		Static48.aClass4_33 = Static86.method1550(265, 128, arg0);
		Static92.method1127();
		Static68.aClass4_44 = Static86.method1550(171, 509, arg0);
		Static92.method1127();
		Static85.aClass4_52 = Static86.method1550(132, 360, arg0);
		Static92.method1127();
		Static66.aClass4_55 = Static86.method1550(200, 360, arg0);
		Static92.method1127();
		Static27.aClass4_19 = Static86.method1550(238, 202, arg0);
		Static92.method1127();
		Static89.aClass4_54 = Static86.method1550(238, 203, arg0);
		Static92.method1127();
		Static44.aClass4_30 = Static86.method1550(94, 74, arg0);
		Static92.method1127();
		Static113.aClass4_50 = Static86.method1550(94, 75, arg0);
		Static92.method1127();
		@Pc(77) byte[] local77 = arg1.method1682(Static104.aClass1_1591, Static59.aClass1_1848);
		@Pc(83) Class2_Sub1_Sub2_Sub4 local83 = new Class2_Sub1_Sub2_Sub4(local77, arg0);
		Static12.aClass4_61.method1527();
		local83.method1146(0, 0);
		Static48.aClass4_33.method1527();
		local83.method1146(-637, 0);
		Static68.aClass4_44.method1527();
		local83.method1146(-128, 0);
		Static85.aClass4_52.method1527();
		local83.method1146(-202, -371);
		Static66.aClass4_55.method1527();
		local83.method1146(-202, -171);
		Static27.aClass4_19.method1527();
		local83.method1146(0, -265);
		Static89.aClass4_54.method1527();
		local83.method1146(-562, -265);
		Static44.aClass4_30.method1527();
		local83.method1146(-128, -171);
		Static113.aClass4_50.method1527();
		local83.method1146(-562, -171);
		@Pc(150) int[] local150 = new int[local83.anInt1670];
		@Pc(156) int local156;
		@Pc(187) int local187;
		for (@Pc(152) int local152 = 0; local152 < local83.anInt1669; local152++) {
			for (local156 = 0; local156 < local83.anInt1670; local156++) {
				local150[local156] = local83.anIntArray170[local152 * local83.anInt1670 + local83.anInt1670 - local156 - 1];
			}
			for (local187 = 0; local187 < local83.anInt1670; local187++) {
				local83.anIntArray170[local187 + local83.anInt1670 * local152] = local150[local187];
			}
		}
		Static12.aClass4_61.method1527();
		local83.method1146(382, 0);
		Static48.aClass4_33.method1527();
		local83.method1146(-255, 0);
		Static68.aClass4_44.method1527();
		local83.method1146(254, 0);
		Static85.aClass4_52.method1527();
		local83.method1146(180, -371);
		Static66.aClass4_55.method1527();
		local83.method1146(180, -171);
		Static27.aClass4_19.method1527();
		local83.method1146(382, -265);
		Static89.aClass4_54.method1527();
		local83.method1146(-180, -265);
		Static44.aClass4_30.method1527();
		local83.method1146(254, -171);
		Static113.aClass4_50.method1527();
		local83.method1146(-180, -171);
		local83 = Static111.method1805(arg2, Static17.aClass1_674, Static104.aClass1_1591);
		Static68.aClass4_44.method1527();
		local83.method1140(382 - local83.anInt1670 / 2 - 128, 18);
		Static95.aClass2_Sub1_Sub2_Sub2_25 = Static54.method1225(Static42.aClass1_1435, Static104.aClass1_1591, arg2);
		Static98.aClass2_Sub1_Sub2_Sub2_27 = Static54.method1225(Static34.aClass1_1235, Static104.aClass1_1591, arg2);
		Static40.aClass2_Sub1_Sub2_Sub2Array7 = Static25.method716(arg2, Static12.aClass1_2751, Static104.aClass1_1591);
		Static68.aClass2_Sub1_Sub2_Sub4_4 = new Class2_Sub1_Sub2_Sub4(128, 265);
		Static28.aClass2_Sub1_Sub2_Sub4_2 = new Class2_Sub1_Sub2_Sub4(128, 265);
		for (local156 = 0; local156 < 33920; local156++) {
			Static68.aClass2_Sub1_Sub2_Sub4_4.anIntArray170[local156] = Static12.aClass4_61.anIntArray283[local156];
		}
		for (local187 = 0; local187 < 33920; local187++) {
			Static28.aClass2_Sub1_Sub2_Sub4_2.anIntArray170[local187] = Static48.aClass4_33.anIntArray283[local187];
		}
		Static85.anIntArray286 = new int[256];
		for (@Pc(368) int local368 = 0; local368 < 64; local368++) {
			Static85.anIntArray286[local368] = local368 * 262144;
		}
		for (@Pc(382) int local382 = 0; local382 < 64; local382++) {
			Static85.anIntArray286[local382 + 64] = local382 * 1024 + 16711680;
		}
		for (@Pc(400) int local400 = 0; local400 < 64; local400++) {
			Static85.anIntArray286[local400 + 128] = local400 * 4 + 16776960;
		}
		for (@Pc(419) int local419 = 0; local419 < 64; local419++) {
			Static85.anIntArray286[local419 + 192] = 16777215;
		}
		Static107.anIntArray338 = new int[256];
		for (@Pc(438) int local438 = 0; local438 < 64; local438++) {
			Static107.anIntArray338[local438] = local438 * 1024;
		}
		for (@Pc(454) int local454 = 0; local454 < 64; local454++) {
			Static107.anIntArray338[local454 + 64] = local454 * 4 + 65280;
		}
		for (@Pc(474) int local474 = 0; local474 < 64; local474++) {
			Static107.anIntArray338[local474 + 128] = local474 * 262144 + 65535;
		}
		for (@Pc(500) int local500 = 0; local500 < 64; local500++) {
			Static107.anIntArray338[local500 + 192] = 16777215;
		}
		Static97.anIntArray307 = new int[256];
		for (@Pc(517) int local517 = 0; local517 < 64; local517++) {
			Static97.anIntArray307[local517] = local517 * 4;
		}
		for (@Pc(533) int local533 = 0; local533 < 64; local533++) {
			Static97.anIntArray307[local533 + 64] = local533 * 262144 + 255;
		}
		for (@Pc(554) int local554 = 0; local554 < 64; local554++) {
			Static97.anIntArray307[local554 + 128] = local554 * 1024 + 16711935;
		}
		for (@Pc(572) int local572 = 0; local572 < 64; local572++) {
			Static97.anIntArray307[local572 + 192] = 16777215;
		}
		Static71.anIntArray216 = new int[256];
		Static102.anIntArray323 = new int[32768];
		Static84.anIntArray284 = new int[32768];
		Static106.method1755(null);
		Static97.anIntArray310 = new int[32768];
		Static104.aClass1_1582 = Static104.aClass1_1591;
		Static104.aClass1_1593 = Static104.aClass1_1591;
		Static6.anIntArray42 = new int[32768];
		Static47.anInt1558 = 0;
		if (Static53.anInt1755 == 0 || Static77.aBoolean113) {
			Static60.method1278();
		} else {
			Static60.method1285(Static90.aClass8_Sub1_20, Static57.aClass1_1846, Static104.aClass1_1591, Static53.anInt1755);
		}
		Static55.method478(false);
		Static80.aBoolean119 = true;
		Static34.aBoolean61 = true;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
	public static void method1172() {
		aBooleanArray12 = null;
		aClass1_1743 = null;
		aClass1_1742 = null;
		aClass1_1745 = null;
		aClass1_1749 = null;
		aClass1_1746 = null;
		aClass1_1747 = null;
		aClass1_1748 = null;
		anIntArray173 = null;
		aClass1_1744 = null;
		aClass1_1741 = null;
		aClass1_1750 = null;
	}
}
