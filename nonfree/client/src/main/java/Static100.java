import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] aClass1_Sub3_Sub1_Sub3Array9;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "Lclient!rd;")
	public static Class1_Sub20 aClass1_Sub20_5;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!td;")
	public static Class74 aClass74_2 = new Class74();

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!af;")
	public static Class5 aClass5_1174 = Static45.method1937("Null");

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!af;")
	private static Class5 aClass5_1175 = Static45.method1937("Password: ");

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
	public static int[] anIntArray378 = new int[5];

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!af;")
	private static Class5 aClass5_1176 = Static45.method1937("Checking for updates )2 ");

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_1177 = aClass5_1176;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_1178 = aClass5_1175;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
	public static int[] anIntArray379 = new int[32];

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_1179 = Static45.method1937("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!kb;I)Lclient!bb;")
	public static Class1_Sub4 method1692(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1) {
		@Pc(13) byte[] local13 = arg1.method1706(arg0);
		return local13 == null ? null : new Class1_Sub4(local13);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method1693() {
		aClass5_1178 = null;
		aClass5_1179 = null;
		aClass5_1175 = null;
		aClass5_1176 = null;
		anIntArray378 = null;
		aClass5_1177 = null;
		aClass1_Sub20_5 = null;
		aClass74_2 = null;
		aClass5_1174 = null;
		anIntArray379 = null;
		aClass1_Sub3_Sub1_Sub3Array9 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ad;Lclient!ad;)V")
	public static void method1694(@OriginalArg(1) Class1_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) Class1_Sub3_Sub1_Sub1 arg1) {
		if (Static84.aBoolean75) {
			Static122.method2174(arg1, arg0);
			return;
		}
		if (Static95.anInt2352 == 0 || Static95.anInt2352 == 5) {
			arg0.method170(Static11.aClass5_165, 382, 225, 16777215, -1);
			Static33.method1979(230, 233, 304, 34, 9179409);
			Static33.method1979(231, 234, 302, 32, 0);
			Static33.method1984(232, 235, Static12.anInt3240 * 3, 30, 9179409);
			Static33.method1984(Static12.anInt3240 * 3 + 232, 235, 300 - Static12.anInt3240 * 3, 30, 0);
			arg0.method170(Static93.aClass5_1109, 382, 256, 16777215, -1);
		}
		@Pc(117) short local117;
		@Pc(125) int local125;
		if (Static95.anInt2352 == 20) {
			Static58.aClass1_Sub3_Sub1_Sub3_3.method1687(382 - Static58.aClass1_Sub3_Sub1_Sub3_3.anInt2443 / 2, -(Static58.aClass1_Sub3_Sub1_Sub3_3.anInt2442 / 2) + 271);
			local117 = 211;
			arg0.method170(Static93.aClass5_1110, 382, 211, 16776960, 0);
			local125 = local117 + 15;
			arg0.method170(Static93.aClass5_1116, 382, 226, 16776960, 0);
			@Pc(133) int local133 = local125 + 15;
			arg0.method170(Static93.aClass5_1118, 382, 241, 16776960, 0);
			@Pc(141) int local141 = local133 + 15;
			@Pc(142) int local142 = local141 + 10;
			arg0.method165(method1696(new Class5[] { Static117.aClass5_1430, Static4.method163(Static93.aClass5_1114) }), 272, 266, 16777215, 0);
			@Pc(162) int local162 = local142 + 15;
			arg0.method165(method1696(new Class5[] { aClass5_1178, Static93.aClass5_1120.method183() }), 274, 281, 16777215, 0);
			@Pc(183) int local183 = local162 + 15;
		}
		if (Static95.anInt2352 == 10) {
			Static58.aClass1_Sub3_Sub1_Sub3_3.method1687(202, 171);
			if (Static78.anInt1875 == 0) {
				local117 = 251;
				arg0.method170(Static17.aClass5_265, 382, 251, 16776960, 0);
				local125 = local117 + 30;
				Static10.aClass1_Sub3_Sub1_Sub3_2.method1687(229, 271);
				arg0.method153(Static78.aClass5_951, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static10.aClass1_Sub3_Sub1_Sub3_2.method1687(389, 271);
				arg0.method153(Static124.aClass5_1401, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static78.anInt1875 == 2) {
				local117 = 211;
				arg0.method170(Static93.aClass5_1110, 382, 211, 16776960, 0);
				local125 = local117 + 15;
				arg0.method170(Static93.aClass5_1116, 382, 226, 16776960, 0);
				local125 += 15;
				arg0.method170(Static93.aClass5_1118, 382, 241, 16776960, 0);
				local125 += 15;
				local125 += 10;
				arg0.method165(method1696(new Class5[] { Static117.aClass5_1430, Static4.method163(Static93.aClass5_1114), Static36.anInt959 == 0 & Static131.anInt3270 % 40 < 20 ? Static39.aClass5_487 : Static93.aClass5_1117 }), 272, 266, 16777215, 0);
				local125 += 15;
				arg0.method165(method1696(new Class5[] { aClass5_1178, Static93.aClass5_1120.method183(), Static131.anInt3270 % 40 < 20 & Static36.anInt959 == 1 ? Static39.aClass5_487 : Static93.aClass5_1117 }), 274, 281, 16777215, 0);
				Static10.aClass1_Sub3_Sub1_Sub3_2.method1687(229, 301);
				local125 += 15;
				arg0.method170(Static64.aClass5_785, 302, 326, 16777215, 0);
				Static10.aClass1_Sub3_Sub1_Sub3_2.method1687(389, 301);
				arg0.method170(Static70.aClass5_819, 462, 326, 16777215, 0);
			} else if (Static78.anInt1875 == 3) {
				local117 = 236;
				arg0.method170(Static75.aClass5_870, 382, 211, 16776960, 0);
				arg0.method170(Static119.aClass5_1382, 382, 236, 16777215, 0);
				local125 = local117 + 15;
				arg0.method170(Static63.aClass5_881, 382, 251, 16777215, 0);
				local125 += 15;
				arg0.method170(Static72.aClass5_822, 382, 266, 16777215, 0);
				local125 += 15;
				arg0.method170(Static113.aClass5_1292, 382, 281, 16777215, 0);
				local125 += 15;
				Static10.aClass1_Sub3_Sub1_Sub3_2.method1687(309, 301);
				arg0.method170(Static70.aClass5_819, 382, 326, 16777215, 0);
			}
		}
		if (Static36.anInt952 != 1) {
			if (Static127.anInt3252 > 0) {
				Static25.method543(Static127.anInt3252);
				Static127.anInt3252 = 0;
			}
			Static21.method530();
		}
		Static93.aClass1_Sub3_Sub1_Sub3Array6[Static97.aBoolean96 ? 1 : 0].method1687(725, 463);
		if (Static95.anInt2352 > 5 && Static108.anInt2670 != 2 && Static131.anInt3269 == 0) {
			if (Static8.aClass1_Sub3_Sub1_Sub3_1 == null) {
				Static8.aClass1_Sub3_Sub1_Sub3_1 = Static90.method1563(Static125.aClass5_1415, Static93.aClass5_1117, Static109.aClass41_Sub1_20);
			} else {
				Static8.aClass1_Sub3_Sub1_Sub3_1.method1687(5, 463);
				arg0.method170(method1696(new Class5[] { Static127.aClass5_1456, Static32.aClass5_434, Static48.method838(Static113.anInt2771) }), 55, 478, 16777215, 0);
				if (Static43.aClass45_1 == null) {
					arg1.method170(Static83.aClass5_1031, 55, 492, 16777215, 0);
				} else {
					arg1.method170(Static59.aClass5_730, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(622) Graphics local622 = Static12.aCanvas3.getGraphics();
			Static90.aClass43_1.method2199(local622);
		} catch (@Pc(630) Exception local630) {
			Static12.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!se;I)V")
	public static void method1695(@OriginalArg(0) Class1_Sub22 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.anInt2725 == 0) {
			local1 = Static44.aClass68_1.method1875(arg0.anInt2730, arg0.anInt2743, arg0.anInt2722);
		}
		if (arg0.anInt2725 == 1) {
			local1 = Static44.aClass68_1.method1869(arg0.anInt2730, arg0.anInt2743, arg0.anInt2722);
		}
		if (arg0.anInt2725 == 2) {
			local1 = Static44.aClass68_1.method1848(arg0.anInt2730, arg0.anInt2743, arg0.anInt2722);
		}
		if (arg0.anInt2725 == 3) {
			local1 = Static44.aClass68_1.method1862(arg0.anInt2730, arg0.anInt2743, arg0.anInt2722);
		}
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = -1;
		@Pc(70) int local70 = 0;
		if (local1 != 0) {
			@Pc(82) int local82 = Static44.aClass68_1.method1847(arg0.anInt2730, arg0.anInt2743, arg0.anInt2722, local1);
			local62 = local1 >> 14 & 0x7FFF;
			local70 = local82 >> 6 & 0x3;
			local60 = local82 & 0x1F;
		}
		arg0.anInt2731 = local60;
		arg0.anInt2740 = local62;
		arg0.anInt2726 = local70;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([Lclient!af;I)Lclient!af;")
	public static Class5 method1696(@OriginalArg(0) Class5[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static59.method1060(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!of;)Z")
	public static boolean method1697(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(2) int local2 = arg0.anInt2291;
		if (local2 == 205) {
			Static13.anInt348 = 250;
			return true;
		}
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (local2 >= 300 && local2 <= 313) {
			local38 = (local2 - 300) / 2;
			local42 = local2 & 0x1;
			aClass74_2.method2041(local42 == 1, local38);
		}
		if (local2 >= 314 && local2 <= 323) {
			local38 = (local2 - 314) / 2;
			local42 = local2 & 0x1;
			aClass74_2.method2040(local42 == 1, local38);
		}
		if (local2 == 324) {
			aClass74_2.method2036(false);
		}
		if (local2 == 325) {
			aClass74_2.method2036(true);
		}
		if (local2 == 326) {
			Static44.aClass1_Sub20_Sub1_1.method2108(96);
			aClass74_2.method2038(Static44.aClass1_Sub20_Sub1_1);
			return true;
		} else {
			return false;
		}
	}
}
