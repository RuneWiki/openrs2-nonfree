import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2072 = Static122.method531("<col=ffffff>");

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2073 = Static122.method531("Could not complete login)3");

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2074 = aClass73_2073;

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2075 = Static122.method531(" <col=00ff80>");

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2076 = Static122.method531("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(III)V")
	public static void method2752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (Static86.anInt1942 != arg1) {
			Static165.anIntArray17 = new int[arg1];
			for (local14 = 0; local14 < arg1; local14++) {
				Static165.anIntArray17[local14] = (local14 << 12) / arg1;
			}
			Static165.anInt321 = arg1 - 1;
			Static86.anInt1942 = arg1;
		}
		if (arg0 == Static152.anInt3405) {
			return;
		}
		Static123.anIntArray308 = new int[arg0];
		for (local14 = 0; local14 < arg0; local14++) {
			Static123.anIntArray308[local14] = (local14 << 12) / arg0;
		}
		Static152.anInt3405 = arg0;
		Static124.anInt2869 = arg0 - 1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Color;Lclient!sd;B)V")
	public static void method2753(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Class73 arg2) {
		try {
			@Pc(6) Graphics local6 = Static102.aCanvas1.getGraphics();
			if (Static5.aFont1 == null) {
				Static5.aFont1 = new Font("Helvetica", 1, 13);
				Static140.aFontMetrics1 = Static102.aCanvas1.getFontMetrics(Static5.aFont1);
			}
			if (Static135.aBoolean209) {
				Static135.aBoolean209 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static147.anInt3307, Static43.anInt1008);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static97.anImage3 == null) {
					Static97.anImage3 = Static102.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static97.anImage3.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static5.aFont1);
				local51.setColor(Color.white);
				arg2.method2446(22, (304 - arg2.method2439(Static140.aFontMetrics1)) / 2, local51);
				local6.drawImage(Static97.anImage3, Static147.anInt3307 / 2 - 152, Static43.anInt1008 / 2 + -18, null);
			} catch (@Pc(136) Exception local136) {
				@Pc(142) int local142 = Static43.anInt1008 / 2 - 18;
				@Pc(148) int local148 = Static147.anInt3307 / 2 - 152;
				local6.setColor(arg1);
				local6.drawRect(local148, local142, 303, 33);
				local6.fillRect(local148 + 2, local142 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local148 + 1, local142 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local148 + 2, local142 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static5.aFont1);
				local6.setColor(Color.white);
				arg2.method2446(local142 + 22, (304 - arg2.method2439(Static140.aFontMetrics1)) / 2 + local148, local6);
			}
		} catch (@Pc(225) Exception local225) {
			Static102.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
	public static void method2754() {
		aClass73_2072 = null;
		aClass73_2076 = null;
		aClass73_2073 = null;
		aClass73_2074 = null;
		aClass73_2075 = null;
	}
}
