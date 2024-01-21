import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
	public static boolean aBoolean71;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "I")
	public static int anInt1233;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_26;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "Lclient!kb;")
	public static Class9 aClass9_24;

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "Lclient!mb;")
	public static Class42 aClass42_32;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	public static int anInt1226 = 0;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	public static int anInt1234 = 255;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!jb;")
	public static Class34 aClass34_15 = new Class34(64);

	@OriginalMember(owner = "client!j", name = "I", descriptor = "[I")
	public static int[] anIntArray96 = new int[128];

	@OriginalMember(owner = "client!j", name = "J", descriptor = "Lclient!v;")
	public static Class62 aClass62_539 = Static45.method753("Geben Sie Ihren Benutzernamen und Passwort ein)3");

	@OriginalMember(owner = "client!j", name = "N", descriptor = "Lclient!v;")
	public static Class62 aClass62_540 = Static45.method753("Ung\u001c1ltige Session)2ID)3");

	@OriginalMember(owner = "client!j", name = "S", descriptor = "Lclient!v;")
	public static Class62 aClass62_541 = Static45.method753("Lade Sprites )2 ");

	@OriginalMember(owner = "client!j", name = "W", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6 = new byte[4][104][104];

	@OriginalMember(owner = "client!j", name = "X", descriptor = "Lclient!fc;")
	public static Class24 aClass24_37 = new Class24();

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "[I")
	public static int[] anIntArray98 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method717() {
		aClass9_24 = null;
		aClass24_37 = null;
		aClass62_539 = null;
		aClass34_15 = null;
		aByteArrayArrayArray6 = null;
		aCanvas1 = null;
		anIntArray98 = null;
		anIntArray96 = null;
		aClass42_32 = null;
		aClass62_540 = null;
		aClass42_Sub1_26 = null;
		aClass62_541 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!mb;I)Z")
	public static boolean method718(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1) {
		@Pc(8) byte[] local8 = arg1.method1512(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static29.method581(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)I")
	public static int method719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIILclient!db;I)V")
	public static void method720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		if (Static41.anInt1209 >= 400) {
			return;
		}
		if (arg2.anIntArray49 != null) {
			arg2 = arg2.method443();
		}
		if (arg2 == null || !arg2.aBoolean33) {
			return;
		}
		@Pc(26) Class62 local26 = arg2.aClass62_267;
		if (arg2.anInt652 != 0) {
			local26 = Static49.method782(new Class62[] { local26, Static22.method494(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1359, arg2.anInt652), Static95.aClass62_1158, Static54.aClass62_1246, Static99.method1662(arg2.anInt652), Static90.aClass62_1087 });
		}
		if (Static102.anInt2653 == 1) {
			Static91.method1543(Static83.aClass62_209, arg3, 13, arg0, Static49.method782(new Class62[] { Static51.aClass62_1035, Static16.aClass62_272, local26 }), arg1);
		} else if (Static77.anInt2067 != 1) {
			@Pc(84) Class62[] local84 = arg2.aClass62Array5;
			if (Static76.aBoolean119) {
				local84 = Static76.method1250(local84);
			}
			@Pc(98) int local98;
			if (local84 != null) {
				for (local98 = 4; local98 >= 0; local98--) {
					if (local84[local98] != null && !local84[local98].method1680(Static96.aClass62_1174)) {
						@Pc(117) byte local117 = 0;
						if (local98 == 0) {
							local117 = 19;
						}
						if (local98 == 1) {
							local117 = 5;
						}
						if (local98 == 2) {
							local117 = 48;
						}
						if (local98 == 3) {
							local117 = 39;
						}
						if (local98 == 4) {
							local117 = 3;
						}
						Static91.method1543(local84[local98], arg3, local117, arg0, Static49.method782(new Class62[] { Static40.aClass62_502, local26 }), arg1);
					}
				}
			}
			if (local84 != null) {
				for (local98 = 4; local98 >= 0; local98--) {
					if (local84[local98] != null && local84[local98].method1680(Static96.aClass62_1174)) {
						@Pc(200) int local200 = 0;
						@Pc(202) short local202 = 0;
						if (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1359 < arg2.anInt652) {
							local202 = 2000;
						}
						if (local98 == 0) {
							local200 = local202 + 19;
						}
						if (local98 == 1) {
							local200 = local202 + 5;
						}
						if (local98 == 2) {
							local200 = local202 + 48;
						}
						if (local98 == 3) {
							local200 = local202 + 39;
						}
						if (local98 == 4) {
							local200 = local202 + 3;
						}
						Static91.method1543(local84[local98], arg3, local200, arg0, Static49.method782(new Class62[] { Static40.aClass62_502, local26 }), arg1);
					}
				}
			}
			Static91.method1543(Static99.aClass62_1214, arg3, 1005, arg0, Static49.method782(new Class62[] { Static40.aClass62_502, local26 }), arg1);
			return;
		} else if ((Static25.anInt771 & 0x2) == 2) {
			Static91.method1543(Static16.aClass62_266, arg3, 44, arg0, Static49.method782(new Class62[] { Static59.aClass62_704, Static16.aClass62_272, local26 }), arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!v;Ljava/awt/Color;Z)V")
	public static void method721(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Color arg2) {
		try {
			@Pc(6) Graphics local6 = aCanvas1.getGraphics();
			if (Static18.aFont1 == null) {
				Static18.aFont1 = new Font("Helvetica", 1, 13);
				Static90.aFontMetrics1 = aCanvas1.getFontMetrics(Static18.aFont1);
			}
			if (Static69.aBoolean112) {
				Static69.aBoolean112 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static39.anInt1166, Static24.anInt765);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static25.anImage3 == null) {
					Static25.anImage3 = aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static25.anImage3.getGraphics();
				local51.setColor(arg2);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static18.aFont1);
				local51.setColor(Color.white);
				arg1.method1708((304 - arg1.method1672(Static90.aFontMetrics1)) / 2, 22, local51);
				local6.drawImage(Static25.anImage3, Static39.anInt1166 / 2 - 152, Static24.anInt765 / 2 + -18, null);
			} catch (@Pc(137) Exception local137) {
				@Pc(143) int local143 = Static39.anInt1166 / 2 - 152;
				@Pc(149) int local149 = Static24.anInt765 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local143, local149, 303, 33);
				local6.fillRect(local143 + 2, local149 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local143 + 1, local149 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local143 + 2, local149 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static18.aFont1);
				local6.setColor(Color.white);
				arg1.method1708((304 - arg1.method1672(Static90.aFontMetrics1)) / 2 + local143, local149 - -22, local6);
			}
		} catch (@Pc(227) Exception local227) {
			aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!fe;B)Z")
	public static boolean method722(@OriginalArg(0) Class3_Sub1_Sub6 arg0) {
		@Pc(8) int local8 = arg0.anInt917;
		if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
			if (local8 >= 801) {
				local8 -= 701;
			} else if (local8 >= 701) {
				local8 -= 601;
			} else if (local8 < 101) {
				local8--;
			} else {
				local8 -= 101;
			}
			Static91.method1543(Static15.aClass62_232, 0, 36, 0, Static49.method782(new Class62[] { Static75.aClass62_890, Static64.aClass62Array10[local8] }), 0);
			Static91.method1543(Static2.aClass62_14, 0, 37, 0, Static49.method782(new Class62[] { Static75.aClass62_890, Static64.aClass62Array10[local8] }), 0);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static91.method1543(Static15.aClass62_232, 0, 6, 0, Static49.method782(new Class62[] { Static75.aClass62_890, arg0.aClass62_386 }), 0);
			return true;
		} else {
			return false;
		}
	}
}
