import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!og", name = "i", descriptor = "B")
	public static byte aByte23;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
	public static int[] anIntArray314 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!og", name = "e", descriptor = "[J")
	public static long[] aLongArray10 = new long[200];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIIIIZII)V")
	public static void method3259(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6) {
		if (!arg0 && arg4 == Static129.anInt2589 && Static11.anInt171 == arg2 && (Static43.anInt905 == arg6 || Static278.method4290())) {
			return;
		}
		Static43.anInt905 = arg6;
		Static129.anInt2589 = arg4;
		Static11.anInt171 = arg2;
		if (Static278.method4290()) {
			Static43.anInt905 = 0;
		}
		if (arg5) {
			Static65.method1215(28);
		} else {
			Static65.method1215(25);
		}
		Static1.method14(true, Static180.aString200);
		@Pc(63) int local63 = Static192.anInt3637;
		@Pc(65) int local65 = Static199.anInt3817;
		Static199.anInt3817 = arg4 * 8 - 48;
		Static192.anInt3637 = arg2 * 8 - 48;
		Static199.aClass1_Sub2_Sub21_2 = Static109.method3581(Static129.anInt2589 * 8, Static11.anInt171 * 8);
		@Pc(90) int local90 = Static192.anInt3637 - local63;
		@Pc(97) int local97 = Static199.anInt3817 - local65;
		Static228.aClass150_2 = null;
		@Pc(105) int local105;
		@Pc(112) Class15_Sub5_Sub1 local112;
		@Pc(116) int local116;
		if (arg5) {
			Static85.anInt1689 = 0;
			for (local105 = 0; local105 < 32768; local105++) {
				local112 = Static83.aClass15_Sub5_Sub1Array1[local105];
				if (local112 != null) {
					local112.anInt5557 -= local90 * 128;
					local112.anInt5559 -= local97 * 128;
					if (local112.anInt5559 >= 0 && local112.anInt5559 <= 13184 && local112.anInt5557 >= 0 && local112.anInt5557 <= 13184) {
						for (local116 = 0; local116 < 10; local116++) {
							local112.anIntArray501[local116] -= local97;
							local112.anIntArray504[local116] -= local90;
						}
						Static104.anIntArray178[Static85.anInt1689++] = local105;
					} else {
						Static83.aClass15_Sub5_Sub1Array1[local105].method3200(null);
						Static83.aClass15_Sub5_Sub1Array1[local105] = null;
					}
				}
			}
		} else {
			for (local105 = 0; local105 < 32768; local105++) {
				local112 = Static83.aClass15_Sub5_Sub1Array1[local105];
				if (local112 != null) {
					for (local116 = 0; local116 < 10; local116++) {
						local112.anIntArray501[local116] -= local97;
						local112.anIntArray504[local116] -= local90;
					}
					local112.anInt5557 -= local90 * 128;
					local112.anInt5559 -= local97 * 128;
				}
			}
		}
		for (local105 = 0; local105 < 2048; local105++) {
			@Pc(269) Class15_Sub5_Sub2 local269 = Static17.aClass15_Sub5_Sub2Array1[local105];
			if (local269 != null) {
				for (local116 = 0; local116 < 10; local116++) {
					local269.anIntArray501[local116] -= local97;
					local269.anIntArray504[local116] -= local90;
				}
				local269.anInt5559 -= local97 * 128;
				local269.anInt5557 -= local90 * 128;
			}
		}
		Static65.anInt1300 = arg6;
		Static90.aClass15_Sub5_Sub2_2.method4704(arg3, arg1, false);
		@Pc(325) byte local325 = 0;
		@Pc(327) byte local327 = 1;
		@Pc(329) byte local329 = 104;
		if (local97 < 0) {
			local325 = 103;
			local327 = -1;
			local329 = -1;
		}
		@Pc(343) byte local343 = 0;
		@Pc(345) byte local345 = 1;
		@Pc(347) byte local347 = 104;
		if (local90 < 0) {
			local343 = 103;
			local347 = -1;
			local345 = -1;
		}
		for (@Pc(357) int local357 = local325; local357 != local329; local357 += local327) {
			for (@Pc(362) int local362 = local343; local362 != local347; local362 += local345) {
				@Pc(373) int local373 = local90 + local362;
				@Pc(377) int local377 = local97 + local357;
				for (@Pc(379) int local379 = 0; local379 < 4; local379++) {
					if (local377 >= 0 && local373 >= 0 && local377 < 104 && local373 < 104) {
						Static270.aClass59ArrayArrayArray1[local379][local357][local362] = Static270.aClass59ArrayArrayArray1[local379][local377][local373];
					} else {
						Static270.aClass59ArrayArrayArray1[local379][local357][local362] = null;
					}
				}
			}
		}
		for (@Pc(442) Class1_Sub18 local442 = (Class1_Sub18) Static159.aClass59_26.method1704(); local442 != null; local442 = (Class1_Sub18) Static159.aClass59_26.method1701()) {
			local442.anInt1785 -= local90;
			local442.anInt1791 -= local97;
			if (local442.anInt1791 < 0 || local442.anInt1785 < 0 || local442.anInt1791 >= 104 || local442.anInt1785 >= 104) {
				local442.method4779();
			}
		}
		Static295.anInt5297 = 0;
		if (arg5) {
			Static139.anInt2808 -= local97;
			Static307.anInt5433 -= local90;
			Static233.anInt4252 -= local90 * 128;
			Static94.anInt3434 -= local97 * 128;
			Static90.anInt1746 -= local97;
			Static268.anInt4883 -= local90;
		} else {
			Static167.anInt3292 = 1;
		}
		if (Static162.anInt3171 != 0) {
			Static196.anInt3703 -= local90;
			Static162.anInt3171 -= local97;
		}
		if (Static156.aBoolean211 && arg5 && (Math.abs(local97) > 104 || Math.abs(local90) > 104)) {
			Static243.method4742();
		}
		Static309.method4708();
		Static225.aClass59_32.method1703();
		Static35.aClass59_31.method1703();
		Static158.method2710();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!gi;IIIII)V")
	public static void method3260(@OriginalArg(1) Class15_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static312.method4784(arg3, arg2, arg4, arg5, arg0.anInt5557, arg1, arg0.anInt5559);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Color;IILjava/lang/String;Z)V")
	public static void method3261(@OriginalArg(0) Color arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		try {
			@Pc(6) Graphics local6 = Static127.aCanvas1.getGraphics();
			if (Static117.aFont1 == null) {
				Static117.aFont1 = new Font("Helvetica", 1, 13);
				Static73.aFontMetrics1 = Static127.aCanvas1.getFontMetrics(Static117.aFont1);
			}
			if (arg3) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static292.anInt5236, Static120.anInt2505);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static146.anImage3 == null) {
					Static146.anImage3 = Static127.aCanvas1.createImage(304, 34);
				}
				@Pc(55) Graphics local55 = Static146.anImage3.getGraphics();
				local55.setColor(arg0);
				local55.drawRect(0, 0, 303, 33);
				local55.fillRect(2, 2, arg1 * 3, 30);
				local55.setColor(Color.black);
				local55.drawRect(1, 1, 301, 31);
				local55.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local55.setFont(Static117.aFont1);
				local55.setColor(Color.white);
				local55.drawString(arg2, (304 - Static73.aFontMetrics1.stringWidth(arg2)) / 2, 22);
				local6.drawImage(Static146.anImage3, Static292.anInt5236 / 2 - 152, Static120.anInt2505 / 2 + -18, null);
			} catch (@Pc(142) Exception local142) {
				@Pc(148) int local148 = Static292.anInt5236 / 2 - 152;
				@Pc(154) int local154 = Static120.anInt2505 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local148, local154, 303, 33);
				local6.fillRect(local148 + 2, local154 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local148 + 1, local154 + 1, 301, 31);
				local6.fillRect(local148 + arg1 * 3 + 2, local154 - -2, 300 - arg1 * 3, 30);
				local6.setFont(Static117.aFont1);
				local6.setColor(Color.white);
				local6.drawString(arg2, (304 - Static73.aFontMetrics1.stringWidth(arg2)) / 2 + local148, local154 + 22);
			}
			if (Static129.aString149 != null) {
				local6.setFont(Static117.aFont1);
				local6.setColor(Color.white);
				local6.drawString(Static129.aString149, Static292.anInt5236 / 2 - Static73.aFontMetrics1.stringWidth(Static129.aString149) / 2, Static120.anInt2505 / 2 + -26);
			}
		} catch (@Pc(258) Exception local258) {
			Static127.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
	public static int method3263(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIBIII)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = Static226.method3512(arg4, Static98.anInt2007, Static213.anInt4452);
		@Pc(30) int local30 = Static226.method3512(arg2, Static98.anInt2007, Static213.anInt4452);
		@Pc(38) int local38 = Static226.method3512(arg3, Static29.anInt517, Static11.anInt170);
		@Pc(46) int local46 = Static226.method3512(arg1, Static29.anInt517, Static11.anInt170);
		@Pc(55) int local55 = Static226.method3512(arg4 + arg5, Static98.anInt2007, Static213.anInt4452);
		@Pc(64) int local64 = Static226.method3512(arg2 - arg5, Static98.anInt2007, Static213.anInt4452);
		@Pc(66) int local66;
		for (local66 = local22; local66 < local55; local66++) {
			Static273.method4257(local38, Static183.anIntArrayArray26[local66], arg0, local46);
		}
		for (local66 = local30; local66 > local64; local66--) {
			Static273.method4257(local38, Static183.anIntArrayArray26[local66], arg0, local46);
		}
		@Pc(104) int local104 = Static226.method3512(arg3 + arg5, Static29.anInt517, Static11.anInt170);
		@Pc(115) int local115 = Static226.method3512(arg1 - arg5, Static29.anInt517, Static11.anInt170);
		for (local66 = local55; local66 <= local64; local66++) {
			@Pc(124) int[] local124 = Static183.anIntArrayArray26[local66];
			Static273.method4257(local38, local124, arg0, local104);
			Static273.method4257(local115, local124, arg0, local46);
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)Lclient!uc;")
	public static Class1_Sub2_Sub21 method3265() {
		return Static109.aClass1_Sub2_Sub21_3;
	}
}
