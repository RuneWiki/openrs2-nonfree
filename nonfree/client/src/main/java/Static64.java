import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1097 = Static15.method178("Hide");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1094 = aClass23_1097;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1096 = Static15.method178("Take");

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1095 = aClass23_1096;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1098 = Static15.method178("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1099 = aClass23_1098;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1100 = Static15.method178("Freunde");

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1101 = Static15.method178("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1102 = Static15.method178("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1103 = Static15.method178("Loaded sprites");

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1104 = Static15.method178("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	public static int anInt1940 = 0;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1105 = aClass23_1101;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1106 = Static15.method178("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1107 = Static15.method178("Okay");

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1108 = aClass23_1103;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1109 = Static15.method178("@lre@");

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method1239() {
		Static3.anInt131++;
		Static108.method1837(true);
		Static12.method1545(true);
		Static108.method1837(false);
		Static12.method1545(false);
		Static1.method43();
		Static106.method1798();
		@Pc(29) int local29;
		@Pc(49) int local49;
		if (!Static9.aBoolean5) {
			local29 = Static13.anInt233;
			if (Static49.anInt1439 / 256 > local29) {
				local29 = Static49.anInt1439 / 256;
			}
			local49 = Static3.anInt133 + Static68.anInt386 & 0x7FF;
			if (Static76.aBooleanArray6[4] && Static41.anIntArray168[4] + 128 > local29) {
				local29 = Static41.anIntArray168[4] + 128;
			}
			Static96.method1106(local29, Static77.anInt2102, Static48.method987(Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196, Static79.anInt2137) - 50, local49, local29 * 3 + 600, Static83.anInt2320);
		}
		if (Static9.aBoolean5) {
			local29 = Static66.method1262();
		} else {
			local29 = Static46.method976();
		}
		local49 = Static54.anInt1684;
		@Pc(104) int local104 = Static21.anInt702;
		@Pc(106) int local106 = Static96.anInt1793;
		@Pc(108) int local108 = Static44.anInt1488;
		@Pc(110) int local110 = Static107.anInt2775;
		for (@Pc(112) int local112 = 0; local112 < 5; local112++) {
			if (Static76.aBooleanArray6[local112]) {
				@Pc(154) int local154 = (int) ((double) -Static76.anIntArray239[local112] + (double) (Static76.anIntArray239[local112] * 2 + 1) * Math.random() + Math.sin((double) Static14.anIntArray49[local112] * ((double) Static62.anIntArray220[local112] / 100.0D)) * (double) Static41.anIntArray168[local112]);
				if (local112 == 1) {
					Static96.anInt1793 += local154;
				}
				if (local112 == 0) {
					Static54.anInt1684 += local154;
				}
				if (local112 == 4) {
					Static44.anInt1488 += local154;
					if (Static44.anInt1488 < 128) {
						Static44.anInt1488 = 128;
					}
					if (Static44.anInt1488 > 383) {
						Static44.anInt1488 = 383;
					}
				}
				if (local112 == 3) {
					Static107.anInt2775 = local154 + Static107.anInt2775 & 0x7FF;
				}
				if (local112 == 2) {
					Static21.anInt702 += local154;
				}
			}
		}
		Static96.method1113();
		Static81.anInt2308 = 0;
		Static81.anInt2310 = Static32.anInt1007 - 4;
		Static81.anInt2305 = Static110.anInt2872 - 4;
		Static81.aBoolean108 = true;
		Static24.method1576();
		Static19.aClass65_1.method1754(Static54.anInt1684, Static96.anInt1793, Static21.anInt702, Static44.anInt1488, Static107.anInt2775, local29);
		Static19.aClass65_1.method1757();
		Static27.method442();
		Static63.method1230();
		((Class47) Static93.anInterface2_1).method1332(Static70.anInt1829);
		Static21.method349();
		if (Static67.aBoolean100 && Static110.method1894() == 0) {
			Static67.aBoolean100 = false;
		}
		if (Static67.aBoolean100) {
			Static96.method1113();
			Static24.method1576();
			Static83.method1459(false, null, Static56.aClass23_933);
		}
		Static60.method1128();
		Static107.anInt2775 = local110;
		Static96.anInt1793 = local106;
		Static21.anInt702 = local104;
		Static54.anInt1684 = local49;
		Static44.anInt1488 = local108;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method1240(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1241() {
		if (Static8.aClass9_1 != null) {
			Static8.aClass9_1.method1549();
			Static8.aClass9_1 = null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method1242() {
		@Pc(7) Class23 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static40.anInt1400; local9++) {
			if (Static109.aClass23Array18[local9].method528(aClass23_1109) != -1) {
				local7 = Static109.aClass23Array18[local9].method510(Static109.aClass23Array18[local9].method528(aClass23_1109));
				break;
			}
		}
		if (local7 == null) {
			Static61.method1201();
			return;
		}
		@Pc(44) int local44 = Static84.anInt2351;
		@Pc(46) int local46 = Static55.anInt1713;
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(52) int local52 = Static13.anInt238;
		if (local52 > 190) {
			local52 = 190;
		}
		@Pc(63) int local63 = Static55.anInt1715;
		Static24.method1578(local44, local46, local52, local63, 6116423);
		Static24.method1578(local44 + 1, local46 - -1, local52 - 2, 16, 0);
		Static24.method1582(local44 + 1, local46 + 18, local52 - 2, local63 + -19, 0);
		Static2.aClass1_Sub1_Sub6_Sub2_13.method841(local7, local44 + 3, local46 + 14, 6116423, false);
		@Pc(108) int local108 = Static110.anInt2872;
		@Pc(114) int local114 = Static32.anInt1007;
		if (Static96.anInt1798 == 0) {
			local114 -= 4;
			local108 -= 4;
		}
		if (Static96.anInt1798 == 1) {
			local108 -= 205;
			local114 -= 553;
		}
		if (Static96.anInt1798 == 2) {
			local108 -= 357;
			local114 -= 17;
		}
		for (@Pc(135) int local135 = 0; local135 < Static40.anInt1400; local135++) {
			@Pc(150) int local150 = (Static40.anInt1400 - local135 - 1) * 15 + local46 + 31;
			@Pc(154) Class23 local154 = Static109.aClass23Array18[local135];
			if (local154.method531(local7)) {
				local154 = local154.method512(0, local154.method525() - local7.method525());
				if (local154.method531(Static27.aClass23_472)) {
					local154 = local154.method512(0, local154.method525() - Static27.aClass23_472.method525());
				}
			}
			@Pc(191) int local191 = 16777215;
			if (local44 < local114 && local114 < local44 + local52 && local108 > local150 - 13 && local150 + 3 > local108) {
				local191 = 16776960;
			}
			Static2.aClass1_Sub1_Sub6_Sub2_13.method841(local154, local44 + 3, local150, local191, true);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lclient!je;")
	public static Class22 method1243() {
		try {
			return (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class22_Sub2();
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public static void method1244() {
		aClass23_1101 = null;
		aClass23_1109 = null;
		aClass23_1105 = null;
		aClass23_1098 = null;
		aClass23_1107 = null;
		aClass23_1104 = null;
		aClass23_1100 = null;
		aClass23_1099 = null;
		aClass23_1095 = null;
		aClass23_1102 = null;
		aClass23_1094 = null;
		aClass23_1096 = null;
		aClass23_1108 = null;
		aClass23_1103 = null;
		anIntArray227 = null;
		aClass23_1097 = null;
		aClass23_1106 = null;
	}
}
