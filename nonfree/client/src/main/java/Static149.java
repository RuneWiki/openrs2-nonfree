import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	public static int anInt2817 = 0;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString103 = "Use";

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public static void method2520() {
		Static308.aClass98_47.method2572();
		Static79.aClass98_13.method2572();
		Static248.aClass98_39.method2572();
		Static64.aClass98_10.method2572();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZILjava/awt/Color;ILjava/lang/String;)V")
	public static void method2521(@OriginalArg(0) boolean arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			@Pc(6) Graphics local6 = Static224.aCanvas12.getGraphics();
			if (Static118.aFont1 == null) {
				Static118.aFont1 = new Font("Helvetica", 1, 13);
				Static282.aFontMetrics1 = Static224.aCanvas12.getFontMetrics(Static118.aFont1);
			}
			if (arg0) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static253.anInt5224, Static123.anInt2333);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static18.anImage1 == null) {
					Static18.anImage1 = Static224.aCanvas12.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static18.anImage1.getGraphics();
				local52.setColor(arg1);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg2 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local52.setFont(Static118.aFont1);
				local52.setColor(Color.white);
				local52.drawString(arg3, (304 - Static282.aFontMetrics1.stringWidth(arg3)) / 2, 22);
				local6.drawImage(Static18.anImage1, Static253.anInt5224 / 2 - 152, Static123.anInt2333 / 2 + -18, null);
			} catch (@Pc(138) Exception local138) {
				@Pc(144) int local144 = Static253.anInt5224 / 2 - 152;
				@Pc(150) int local150 = Static123.anInt2333 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local144, local150, 303, 33);
				local6.fillRect(local144 + 2, local150 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local144 + 1, local150 + 1, 301, 31);
				local6.fillRect(local144 + arg2 * 3 + 2, local150 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static118.aFont1);
				local6.setColor(Color.white);
				local6.drawString(arg3, (304 - Static282.aFontMetrics1.stringWidth(arg3)) / 2 + local144, local150 - -22);
			}
			if (Static265.aString202 != null) {
				local6.setFont(Static118.aFont1);
				local6.setColor(Color.white);
				local6.drawString(Static265.aString202, Static253.anInt5224 / 2 - Static282.aFontMetrics1.stringWidth(Static265.aString202) / 2, Static123.anInt2333 / 2 - 26);
			}
		} catch (@Pc(256) Exception local256) {
			Static224.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(CB)C")
	public static char method2523(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2524(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class3_Sub26 local13 = new Class3_Sub26(arg0);
		@Pc(17) int local17 = local13.method3915();
		@Pc(21) int local21 = local13.method3896();
		if (local21 < 0 || Static138.anInt2666 != 0 && local21 > Static138.anInt2666) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(49) byte[] local49 = new byte[local21];
			local13.method3935(local21, local49);
			return local49;
		} else {
			@Pc(61) int local61 = local13.method3896();
			if (local61 < 0 || Static138.anInt2666 != 0 && Static138.anInt2666 < local61) {
				throw new RuntimeException();
			}
			@Pc(83) byte[] local83 = new byte[local61];
			if (local17 == 1) {
				Static55.method845(local83, local61, arg0, local21);
			} else {
				Static263.aClass82_1.method2037(local13, local83);
			}
			return local83;
		}
	}
}
