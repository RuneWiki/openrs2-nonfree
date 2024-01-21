import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "sb", descriptor = "I")
	public static int anInt265;

	@OriginalMember(owner = "client!ba", name = "vb", descriptor = "Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 aClass1_Sub3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ba", name = "xb", descriptor = "Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ba", name = "zb", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_11;

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "Lclient!nd;")
	public static Class53 aClass53_3 = new Class53();

	@OriginalMember(owner = "client!ba", name = "T", descriptor = "Lclient!af;")
	public static Class5 aClass5_128 = Static45.method1937("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "Lclient!af;")
	public static Class5 aClass5_129 = Static45.method1937("b12_full");

	@OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lclient!af;")
	public static Class5 aClass5_130 = Static45.method1937("blinken2:");

	@OriginalMember(owner = "client!ba", name = "jb", descriptor = "Lclient!af;")
	public static Class5 aClass5_131 = Static45.method1937("hitmarks");

	@OriginalMember(owner = "client!ba", name = "qb", descriptor = "Lclient!af;")
	private static Class5 aClass5_135 = Static45.method1937("Error loading your profile)3");

	@OriginalMember(owner = "client!ba", name = "kb", descriptor = "Lclient!af;")
	public static Class5 aClass5_132 = aClass5_135;

	@OriginalMember(owner = "client!ba", name = "lb", descriptor = "I")
	public static int anInt263 = 128;

	@OriginalMember(owner = "client!ba", name = "mb", descriptor = "Lclient!nd;")
	public static Class53 aClass53_4 = new Class53();

	@OriginalMember(owner = "client!ba", name = "nb", descriptor = "I")
	public static int anInt264 = 0;

	@OriginalMember(owner = "client!ba", name = "ob", descriptor = "Lclient!af;")
	public static Class5 aClass5_133 = Static45.method1937(")1p");

	@OriginalMember(owner = "client!ba", name = "pb", descriptor = "Lclient!af;")
	public static Class5 aClass5_134 = null;

	@OriginalMember(owner = "client!ba", name = "rb", descriptor = "Lclient!af;")
	private static Class5 aClass5_136 = Static45.method1937("Prepared sound engine");

	@OriginalMember(owner = "client!ba", name = "tb", descriptor = "Lclient!af;")
	public static Class5 aClass5_137 = aClass5_136;

	@OriginalMember(owner = "client!ba", name = "ub", descriptor = "Lclient!af;")
	public static Class5 aClass5_138 = Static45.method1937("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!ba", name = "wb", descriptor = "I")
	public static int anInt266 = -1;

	@OriginalMember(owner = "client!ba", name = "yb", descriptor = "[[[Lclient!nd;")
	public static Class53[][][] aClass53ArrayArrayArray1 = new Class53[4][104][104];

	@OriginalMember(owner = "client!ba", name = "Ab", descriptor = "Lclient!af;")
	public static Class5 aClass5_139 = Static45.method1937("<col=ffff00>");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Color;Lclient!af;I)V")
	public static void method242(@OriginalArg(1) Color arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static12.aCanvas3.getGraphics();
			if (Static91.aFont1 == null) {
				Static91.aFont1 = new Font("Helvetica", 1, 13);
				Static129.aFontMetrics1 = Static12.aCanvas3.getFontMetrics(Static91.aFont1);
			}
			if (Static7.aBoolean5) {
				Static7.aBoolean5 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static70.anInt1626, Static72.anInt1641);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static74.anImage2 == null) {
					Static74.anImage2 = Static12.aCanvas3.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static74.anImage2.getGraphics();
				local47.setColor(arg0);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static91.aFont1);
				local47.setColor(Color.white);
				arg1.method210(22, local47, (304 - arg1.method204(Static129.aFontMetrics1)) / 2);
				local2.drawImage(Static74.anImage2, Static70.anInt1626 / 2 - 152, Static72.anInt1641 / 2 + -18, null);
			} catch (@Pc(124) Exception local124) {
				@Pc(130) int local130 = Static70.anInt1626 / 2 - 152;
				@Pc(136) int local136 = Static72.anInt1641 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local130, local136, 303, 33);
				local2.fillRect(local130 + 2, local136 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local130 + 1, local136 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local130 + 2, local136 - -2, 300 - arg2 * 3, 30);
				local2.setFont(Static91.aFont1);
				local2.setColor(Color.white);
				arg1.method210(local136 + 22, local2, (304 - arg1.method204(Static129.aFontMetrics1)) / 2 + local130);
			}
		} catch (@Pc(215) Exception local215) {
			Static12.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Z")
	public static boolean method244(@OriginalArg(0) int arg0) {
		if (Static89.aBooleanArray26[arg0]) {
			return true;
		} else if (Static122.aClass41_30.method1703(arg0)) {
			@Pc(28) int local28 = Static122.aClass41_30.method1700(arg0);
			if (local28 == 0) {
				Static89.aBooleanArray26[arg0] = true;
				return true;
			}
			if (Static49.aClass1_Sub17ArrayArray1[arg0] == null) {
				Static49.aClass1_Sub17ArrayArray1[arg0] = new Class1_Sub17[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static49.aClass1_Sub17ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static122.aClass41_30.method1710(arg0, local47);
					if (local61 != null) {
						Static49.aClass1_Sub17ArrayArray1[arg0][local47] = new Class1_Sub17();
						Static49.aClass1_Sub17ArrayArray1[arg0][local47].anInt2248 = local47 + (arg0 << 16);
						if (local61[0] == -1) {
							Static49.aClass1_Sub17ArrayArray1[arg0][local47].method1574(new Class1_Sub20(local61));
						} else {
							Static49.aClass1_Sub17ArrayArray1[arg0][local47].method1578(new Class1_Sub20(local61));
						}
					}
				}
			}
			Static89.aBooleanArray26[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V")
	public static void method246(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static92.anInt2321; local14++) {
			if (arg0 == Static38.aLongArray1[local14]) {
				Static92.anInt2321--;
				for (@Pc(36) int local36 = local14; local36 < Static92.anInt2321; local36++) {
					Static38.aLongArray1[local36] = Static38.aLongArray1[local36 + 1];
				}
				Static83.anInt2119 = Static60.anInt1441;
				Static44.aClass1_Sub20_Sub1_1.method2108(139);
				Static44.aClass1_Sub20_Sub1_1.method2078(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	public static void method248() {
		aClass5_130 = null;
		aClass5_134 = null;
		aClass5_135 = null;
		aClass5_129 = null;
		aClass5_137 = null;
		aClass5_138 = null;
		aClass1_Sub17_11 = null;
		aClass1_Sub3_Sub1_Sub3_1 = null;
		aClass5_133 = null;
		aClass53_4 = null;
		aClass5_131 = null;
		aClass5_139 = null;
		aClass5_128 = null;
		aClass5_132 = null;
		aClass53ArrayArrayArray1 = null;
		aClass1_Sub3_Sub1_Sub2_1 = null;
		aClass53_3 = null;
		aClass5_136 = null;
	}
}
