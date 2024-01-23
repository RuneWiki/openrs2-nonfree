import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "[Lclient!tk;")
	public static Class170[] aClass170Array3;

	@OriginalMember(owner = "client!wm", name = "P", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)Z")
	public static boolean method4761(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;ILjava/awt/Color;Z)V")
	public static void method4762(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) boolean arg3) {
		try {
			@Pc(6) Graphics local6 = Static227.aCanvas1.getGraphics();
			if (Static273.aFont1 == null) {
				Static273.aFont1 = new Font("Helvetica", 1, 13);
				Static270.aFontMetrics2 = Static227.aCanvas1.getFontMetrics(Static273.aFont1);
			}
			if (arg3) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static60.anInt1510, Static120.anInt2649);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static134.anImage3 == null) {
					Static134.anImage3 = Static227.aCanvas1.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static134.anImage3.getGraphics();
				local52.setColor(arg2);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg0 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local52.setFont(Static273.aFont1);
				local52.setColor(Color.white);
				local52.drawString(arg1, (304 - Static270.aFontMetrics2.stringWidth(arg1)) / 2, 22);
				local6.drawImage(Static134.anImage3, Static60.anInt1510 / 2 - 152, Static120.anInt2649 / 2 + -18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static60.anInt1510 / 2 - 152;
				@Pc(140) int local140 = Static120.anInt2649 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local134, local140, 303, 33);
				local6.fillRect(local134 + 2, local140 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local134 + 1, local140 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local134 + 2, local140 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static273.aFont1);
				local6.setColor(Color.white);
				local6.drawString(arg1, local134 + (304 - Static270.aFontMetrics2.stringWidth(arg1)) / 2, local140 - -22);
			}
			if (Static35.aString47 != null) {
				local6.setFont(Static273.aFont1);
				local6.setColor(Color.white);
				local6.drawString(Static35.aString47, Static60.anInt1510 / 2 - Static270.aFontMetrics2.stringWidth(Static35.aString47) / 2, Static120.anInt2649 / 2 + -26);
			}
		} catch (@Pc(245) Exception local245) {
			Static227.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)V")
	public static void method4764(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(4, arg0);
		local8.method2043();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4765(@OriginalArg(0) String arg0) {
		Static155.method2848(arg0, "", 0, "", 0);
	}
}
