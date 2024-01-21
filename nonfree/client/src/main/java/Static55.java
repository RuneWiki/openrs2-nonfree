import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Lclient!pb;")
	public static Class41 aClass41_77;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1808 = Static69.method1153("Please wait)3)3)3");

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1812 = Static69.method1153("Accept trade");

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1809 = aClass64_1812;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "[I")
	public static int[] anIntArray447 = new int[200];

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1810 = aClass64_1808;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger52 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1811 = aClass64_1808;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1816 = Static69.method1153("wave2:");

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1813 = aClass64_1816;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	public static int anInt2826 = 0;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1814 = Static69.method1153("Cabbage");

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1815 = Static69.method1153(" )2> @yel@");

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!dd;")
	public static Class19 aClass19_109 = new Class19(64);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method2070() {
		aClass64_1816 = null;
		aClass64_1813 = null;
		aClass64_1808 = null;
		aClass64_1815 = null;
		aClass64_1812 = null;
		aClass64_1814 = null;
		aClass19_109 = null;
		anIntArray447 = null;
		aClass64_1811 = null;
		aBigInteger52 = null;
		aClass41_77 = null;
		aClass64_1810 = null;
		aClass64_1809 = null;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)I")
	public static int method2071() {
		@Pc(7) int local7 = 3;
		if (Static72.anInt1642 < 310) {
			@Pc(21) int local21 = Static119.anInt2846 >> 7;
			@Pc(26) int local26 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375 >> 7;
			@Pc(30) int local30 = Static80.anInt1899 >> 7;
			if ((Static18.aByteArrayArrayArray2[Static15.anInt463][local21][local30] & 0x4) != 0) {
				local7 = Static15.anInt463;
			}
			@Pc(50) int local50;
			if (local26 <= local21) {
				local50 = local21 - local26;
			} else {
				local50 = local26 - local21;
			}
			@Pc(62) int local62 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412 >> 7;
			@Pc(73) int local73;
			if (local62 <= local30) {
				local73 = local30 - local62;
			} else {
				local73 = local62 - local30;
			}
			@Pc(89) int local89;
			@Pc(91) int local91;
			if (local73 < local50) {
				local89 = local73 * 65536 / local50;
				local91 = 32768;
				while (local21 != local26) {
					local91 += local89;
					if (local26 > local21) {
						local21++;
					} else if (local21 > local26) {
						local21--;
					}
					if ((Static18.aByteArrayArrayArray2[Static15.anInt463][local21][local30] & 0x4) != 0) {
						local7 = Static15.anInt463;
					}
					if (local91 >= 65536) {
						local91 -= 65536;
						if (local62 > local30) {
							local30++;
						} else if (local30 > local62) {
							local30--;
						}
						if ((Static18.aByteArrayArrayArray2[Static15.anInt463][local21][local30] & 0x4) != 0) {
							local7 = Static15.anInt463;
						}
					}
				}
			} else {
				local89 = local50 * 65536 / local73;
				local91 = 32768;
				while (local30 != local62) {
					if (local62 > local30) {
						local30++;
					} else if (local62 < local30) {
						local30--;
					}
					local91 += local89;
					if ((Static18.aByteArrayArrayArray2[Static15.anInt463][local21][local30] & 0x4) != 0) {
						local7 = Static15.anInt463;
					}
					if (local91 >= 65536) {
						local91 -= 65536;
						if (local21 < local26) {
							local21++;
						} else if (local21 > local26) {
							local21--;
						}
						if ((Static18.aByteArrayArrayArray2[Static15.anInt463][local21][local30] & 0x4) != 0) {
							local7 = Static15.anInt463;
						}
					}
				}
			}
		}
		if ((Static18.aByteArrayArrayArray2[Static15.anInt463][Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375 >> 7][Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412 >> 7] & 0x4) != 0) {
			local7 = Static15.anInt463;
		}
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public static void method2072() {
		if (Static12.anInt1941 != 0) {
			return;
		}
		Static48.anInt2603 = 1;
		Static101.aClass64Array16[0] = Static38.aClass64_593;
		Static95.anIntArray315[0] = 1004;
		if (Static27.anInt889 != -1) {
			Static39.anInt909 = -1;
			Static121.anInt2879 = -1;
			Static62.method1090(503, Static63.anInt1474, 765, 0, 0, 0, Static27.anInt889, Static81.anInt1404);
			Static11.anInt425 = Static39.anInt909;
			Static12.anInt1942 = Static121.anInt2879;
			return;
		}
		@Pc(42) boolean local42 = false;
		Static66.method1130();
		Static121.anInt2879 = -1;
		Static39.anInt909 = -1;
		if (Static81.anInt1404 > 4 && Static63.anInt1474 > 4 && Static81.anInt1404 < 516 && Static63.anInt1474 < 338) {
			if (Static95.anInt2177 == -1) {
				Static27.method679();
			} else {
				Static62.method1090(338, Static63.anInt1474, 516, 4, 4, 0, Static95.anInt2177, Static81.anInt1404);
			}
		}
		Static11.anInt425 = Static39.anInt909;
		Static39.anInt909 = -1;
		Static12.anInt1942 = Static121.anInt2879;
		Static121.anInt2879 = -1;
		if (Static81.anInt1404 > 553 && Static63.anInt1474 > 205 && Static81.anInt1404 < 743 && Static63.anInt1474 < 466) {
			if (Static101.anInt2274 != -1) {
				Static62.method1090(466, Static63.anInt1474, 743, 553, 205, 1, Static101.anInt2274, Static81.anInt1404);
			} else if (Static101.anIntArray334[Static83.anInt1922] != -1) {
				Static62.method1090(466, Static63.anInt1474, 743, 553, 205, 1, Static101.anIntArray334[Static83.anInt1922], Static81.anInt1404);
			}
		}
		if (Static87.anInt1997 != Static39.anInt909) {
			Static19.aBoolean41 = true;
			Static87.anInt1997 = Static39.anInt909;
		}
		if (Static121.anInt2879 != Static13.anInt455) {
			Static13.anInt455 = Static121.anInt2879;
			Static19.aBoolean41 = true;
		}
		Static121.anInt2879 = -1;
		Static39.anInt909 = -1;
		if (Static81.anInt1404 > 17 && Static63.anInt1474 > 357 && Static81.anInt1404 < 496 && Static63.anInt1474 < 453) {
			if (Static101.anInt2272 != -1) {
				Static62.method1090(453, Static63.anInt1474, 496, 17, 357, 2, Static101.anInt2272, Static81.anInt1404);
			} else if (Static6.anInt322 != -1) {
				Static62.method1090(453, Static63.anInt1474, 496, 17, 357, 3, Static6.anInt322, Static81.anInt1404);
			} else if (Static63.anInt1474 < 434 && Static81.anInt1404 < 426) {
				Static22.method430(Static81.anInt1404 - 17, Static63.anInt1474 + -357);
			}
		}
		if ((Static101.anInt2272 != -1 || Static6.anInt322 != -1) && Static106.anInt2495 != Static39.anInt909) {
			Static106.anInt2495 = Static39.anInt909;
			Static116.aBoolean166 = true;
		}
		if ((Static101.anInt2272 != -1 || Static6.anInt322 != -1) && Static105.anInt2469 != Static121.anInt2879) {
			Static105.anInt2469 = Static121.anInt2879;
			Static116.aBoolean166 = true;
		}
		while (!local42) {
			local42 = true;
			for (@Pc(282) int local282 = 0; local282 < Static48.anInt2603 - 1; local282++) {
				if (Static95.anIntArray315[local282] < 1000 && Static95.anIntArray315[local282 + 1] > 1000) {
					local42 = false;
					@Pc(306) Class64 local306 = Static101.aClass64Array16[local282];
					Static101.aClass64Array16[local282] = Static101.aClass64Array16[local282 + 1];
					Static101.aClass64Array16[local282 + 1] = local306;
					@Pc(324) int local324 = Static95.anIntArray315[local282];
					Static95.anIntArray315[local282] = Static95.anIntArray315[local282 + 1];
					Static95.anIntArray315[local282 + 1] = local324;
					@Pc(342) int local342 = Static60.anIntArray207[local282];
					Static60.anIntArray207[local282] = Static60.anIntArray207[local282 + 1];
					Static60.anIntArray207[local282 + 1] = local342;
					@Pc(360) int local360 = Static96.anIntArray434[local282];
					Static96.anIntArray434[local282] = Static96.anIntArray434[local282 + 1];
					Static96.anIntArray434[local282 + 1] = local360;
					@Pc(378) int local378 = Static84.anIntArray287[local282];
					Static84.anIntArray287[local282] = Static84.anIntArray287[local282 + 1];
					Static84.anIntArray287[local282 + 1] = local378;
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!jd;")
	public static Class37 method2074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class37_Sub2");
			@Pc(15) Class37 local15 = (Class37) local11.getDeclaredConstructor().newInstance();
			local15.method1464(arg0, arg1, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class37_Sub1 local28 = new Class37_Sub1();
			local28.method1464(arg0, arg1, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	public static void method2075() {
		Static96.aClass37_38.method1459();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Color;ILclient!rd;I)V")
	public static void method2077(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2) {
		try {
			@Pc(2) Graphics local2 = Static93.aCanvas1.getGraphics();
			if (Static74.aFont1 == null) {
				Static74.aFont1 = new Font("Helvetica", 1, 13);
				Static101.aFontMetrics1 = Static93.aCanvas1.getFontMetrics(Static74.aFont1);
			}
			if (Static27.aBoolean59) {
				Static27.aBoolean59 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static80.anInt1895, Static57.anInt1299);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static28.anImage6 == null) {
					Static28.anImage6 = Static93.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static28.anImage6.getGraphics();
				local47.setColor(arg0);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg1 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local47.setFont(Static74.aFont1);
				local47.setColor(Color.white);
				arg2.method1484((304 - arg2.method1497(Static101.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static28.anImage6, Static80.anInt1895 / 2 - 152, Static57.anInt1299 / 2 + -18, null);
			} catch (@Pc(130) Exception local130) {
				@Pc(136) int local136 = Static80.anInt1895 / 2 - 152;
				@Pc(142) int local142 = Static57.anInt1299 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local136, local142, 303, 33);
				local2.fillRect(local136 + 2, local142 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local136 + 1, local142 + 1, 301, 31);
				local2.fillRect(local136 + arg1 * 3 + 2, local142 - -2, 300 - arg1 * 3, 30);
				local2.setFont(Static74.aFont1);
				local2.setColor(Color.white);
				arg2.method1484(local136 + (304 - arg2.method1497(Static101.aFontMetrics1)) / 2, local142 + 22, local2);
			}
		} catch (@Pc(221) Exception local221) {
			Static93.aCanvas1.repaint();
		}
	}
}
