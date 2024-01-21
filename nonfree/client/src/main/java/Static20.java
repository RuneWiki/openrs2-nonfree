import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!db", name = "Oc", descriptor = "Z")
	public static boolean aBoolean29;

	@OriginalMember(owner = "client!db", name = "Sc", descriptor = "Lclient!we;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!db", name = "Zc", descriptor = "[I")
	public static int[] anIntArray69;

	@OriginalMember(owner = "client!db", name = "jd", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!db", name = "Jc", descriptor = "Lclient!na;")
	private static Class53 aClass53_254 = Static109.method1737("Members object");

	@OriginalMember(owner = "client!db", name = "Lc", descriptor = "I")
	public static int anInt691 = 0;

	@OriginalMember(owner = "client!db", name = "Nc", descriptor = "I")
	public static int anInt693 = 0;

	@OriginalMember(owner = "client!db", name = "Xc", descriptor = "Lclient!na;")
	private static Class53 aClass53_257 = Static109.method1737("K");

	@OriginalMember(owner = "client!db", name = "Pc", descriptor = "Lclient!na;")
	public static Class53 aClass53_255 = aClass53_257;

	@OriginalMember(owner = "client!db", name = "fd", descriptor = "Lclient!na;")
	private static Class53 aClass53_261 = Static109.method1737("Unexpected server response");

	@OriginalMember(owner = "client!db", name = "Rc", descriptor = "Lclient!na;")
	public static Class53 aClass53_256 = aClass53_261;

	@OriginalMember(owner = "client!db", name = "bd", descriptor = "Lclient!na;")
	public static Class53 aClass53_258 = Static109.method1737("mapscene");

	@OriginalMember(owner = "client!db", name = "cd", descriptor = "Lclient!na;")
	public static Class53 aClass53_259 = Static109.method1737("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!db", name = "ed", descriptor = "Lclient!na;")
	public static Class53 aClass53_260 = aClass53_257;

	@OriginalMember(owner = "client!db", name = "hd", descriptor = "Lclient!na;")
	public static Class53 aClass53_262 = aClass53_254;

	@OriginalMember(owner = "client!db", name = "id", descriptor = "Lclient!na;")
	public static Class53 aClass53_263 = null;

	@OriginalMember(owner = "client!db", name = "kd", descriptor = "Lclient!na;")
	public static Class53 aClass53_264 = Static109.method1737("Ignorieren");

	@OriginalMember(owner = "client!db", name = "ld", descriptor = "[I")
	public static int[] anIntArray70 = new int[128];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!na;Lclient!we;Lclient!na;B)Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 method374(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class53 arg2) {
		@Pc(4) int local4 = arg1.method1504(arg0);
		@Pc(19) int local19 = arg1.method1502(arg2, local4);
		return Static69.method1198(arg1, local19, local4);
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
	public static void method375() {
		Static101.anInt2376 = 0;
		Static107.anInt2462 = 0;
		Static3.method49();
		Static50.method1915();
		method382();
		Static12.method192();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static101.anInt2376; local19++) {
			local25 = Static119.anIntArray46[local19];
			if (Static27.anInt843 != Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local25].anInt1455) {
				Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local25] = null;
			}
		}
		if (Static62.aClass3_Sub7_Sub1_2.anInt964 != Static37.anInt2211) {
			throw new RuntimeException("gpp1 pos:" + Static62.aClass3_Sub7_Sub1_2.anInt964 + " psize:" + Static37.anInt2211);
		}
		for (local25 = 0; local25 < Static72.anInt1820; local25++) {
			if (Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[Static71.anIntArray228[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static72.anInt1820);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
	public static void method376() {
		aClass53_257 = null;
		aClass53_262 = null;
		aClass53_261 = null;
		aClass62_2 = null;
		aClass53_256 = null;
		aClass53_255 = null;
		aClass53_254 = null;
		aClass53_259 = null;
		aClass53_260 = null;
		anIntArray69 = null;
		aClass53_263 = null;
		anIntArray70 = null;
		aClass53_264 = null;
		aClass53_258 = null;
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(B)V")
	public static void method377() {
		@Pc(13) Object local13 = Static66.anObject4;
		synchronized (Static66.anObject4) {
			if (Static118.anInt2757 != 0) {
				Static118.anInt2757 = 1;
				try {
					Static66.anObject4.wait();
				} catch (@Pc(26) InterruptedException local26) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I")
	public static int method378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg1;
			arg1 = local6;
		}
		@Pc(14) int local14 = arg4 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg2;
		} else if (local14 == 2) {
			return 1 + 7 - arg3 - arg0;
		} else {
			return 8 - arg1 - arg2;
		}
	}

	@OriginalMember(owner = "client!db", name = "k", descriptor = "(I)V")
	public static void method379() {
		@Pc(3) Class5 local3 = Static41.aClass5_1;
		synchronized (Static41.aClass5_1) {
			Static12.anInt316 = Static87.anInt2094;
			@Pc(22) int local22;
			if (Static126.anInt2161 < 0) {
				for (local22 = 0; local22 < 112; local22++) {
					Static37.aBooleanArray11[local22] = false;
				}
				Static126.anInt2161 = Static111.anInt2569;
			} else {
				while (Static126.anInt2161 != Static111.anInt2569) {
					local22 = Static2.anIntArray3[Static111.anInt2569];
					Static111.anInt2569 = Static111.anInt2569 + 1 & 0x7F;
					if (local22 >= 0) {
						Static37.aBooleanArray11[local22] = true;
					} else {
						Static37.aBooleanArray11[~local22] = false;
					}
				}
			}
			Static87.anInt2094 = Static27.anInt857;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Color;IILclient!na;)V")
	public static void method380(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class53 arg2) {
		try {
			@Pc(2) Graphics local2 = Static87.aCanvas1.getGraphics();
			if (Static66.aFont1 == null) {
				Static66.aFont1 = new Font("Helvetica", 1, 13);
				Static38.aFontMetrics1 = Static87.aCanvas1.getFontMetrics(Static66.aFont1);
			}
			if (Static123.aBoolean128) {
				Static123.aBoolean128 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static60.anInt1561, Static70.anInt1781);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static108.anImage4 == null) {
					Static108.anImage4 = Static87.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static108.anImage4.getGraphics();
				local47.setColor(arg0);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg1 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local47.setFont(Static66.aFont1);
				local47.setColor(Color.white);
				arg2.method1297((304 - arg2.method1275(Static38.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static108.anImage4, Static60.anInt1561 / 2 - 152, Static70.anInt1781 / 2 + -18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static60.anInt1561 / 2 - 152;
				@Pc(141) int local141 = Static70.anInt1781 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local135, local141, 303, 33);
				local2.fillRect(local135 + 2, local141 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local135 + 1, local141 + 1, 301, 31);
				local2.fillRect(arg1 * 3 + local135 + 2, local141 - -2, 300 - arg1 * 3, 30);
				local2.setFont(Static66.aFont1);
				local2.setColor(Color.white);
				arg2.method1297((304 - arg2.method1275(Static38.aFontMetrics1)) / 2 + local135, local141 + 22, local2);
			}
		} catch (@Pc(220) Exception local220) {
			Static87.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!vb;)Lclient!na;")
	public static Class53 method381(@OriginalArg(1) Class3_Sub1_Sub15 arg0) {
		if (Static63.method1114(Static50.method1914(arg0)) == 0) {
			return null;
		} else if (arg0.aClass53_1356 == null || arg0.aClass53_1356.method1256().method1294() == 0) {
			return Static102.aBoolean101 ? Static2.aClass53_14 : null;
		} else {
			return arg0.aClass53_1356;
		}
	}

	@OriginalMember(owner = "client!db", name = "l", descriptor = "(I)V")
	private static void method382() {
		while (true) {
			if (Static62.aClass3_Sub7_Sub1_2.method655(Static37.anInt2211) >= 11) {
				@Pc(12) int local12 = Static62.aClass3_Sub7_Sub1_2.method661(11);
				if (local12 != 2047) {
					@Pc(17) boolean local17 = false;
					if (Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local12] == null) {
						local17 = true;
						Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local12] = new Class3_Sub1_Sub4_Sub1_Sub2();
						if (Static16.aClass3_Sub7Array1[local12] != null) {
							Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local12].method1044(Static16.aClass3_Sub7Array1[local12]);
						}
					}
					Static71.anIntArray228[Static72.anInt1820++] = local12;
					@Pc(53) Class3_Sub1_Sub4_Sub1_Sub2 local53 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local12];
					local53.anInt1455 = Static27.anInt843;
					@Pc(61) int local61 = Static62.aClass3_Sub7_Sub1_2.method661(5);
					if (local61 > 15) {
						local61 -= 32;
					}
					@Pc(70) int local70 = Static62.aClass3_Sub7_Sub1_2.method661(5);
					@Pc(77) int local77 = Static83.anIntArray268[Static62.aClass3_Sub7_Sub1_2.method661(3)];
					if (local70 > 15) {
						local70 -= 32;
					}
					if (local17) {
						local53.anInt1426 = local77;
					}
					@Pc(93) int local93 = Static62.aClass3_Sub7_Sub1_2.method661(1);
					@Pc(98) int local98 = Static62.aClass3_Sub7_Sub1_2.method661(1);
					if (local98 == 1) {
						Static5.anIntArray19[Static107.anInt2462++] = local12;
					}
					local53.method1032(local70 + Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local93 == 1, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0] + local61);
					continue;
				}
			}
			Static62.aClass3_Sub7_Sub1_2.method659();
			return;
		}
	}
}
