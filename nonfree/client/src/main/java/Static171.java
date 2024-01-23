import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt3868;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public static int anInt3879;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
	public static int anInt3870 = 0;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public static int anInt3878 = 0;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString112 = "glow2:";

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	public static void method3144() {
		Static199.aClass155_37.method4364(5);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLjava/lang/String;ZLjava/awt/Color;I)V")
	public static void method3146(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(6) Graphics local6 = Static9.aCanvas1.getGraphics();
			if (Static8.aFont2 == null) {
				Static8.aFont2 = new Font("Helvetica", 1, 13);
				Static209.aFontMetrics1 = Static9.aCanvas1.getFontMetrics(Static8.aFont2);
			}
			if (arg1) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static193.anInt4370, Static144.anInt3368);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static144.anImage4 == null) {
					Static144.anImage4 = Static9.aCanvas1.createImage(304, 34);
				}
				@Pc(53) Graphics local53 = Static144.anImage4.getGraphics();
				local53.setColor(arg2);
				local53.drawRect(0, 0, 303, 33);
				local53.fillRect(2, 2, arg3 * 3, 30);
				local53.setColor(Color.black);
				local53.drawRect(1, 1, 301, 31);
				local53.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local53.setFont(Static8.aFont2);
				local53.setColor(Color.white);
				local53.drawString(arg0, (304 - Static209.aFontMetrics1.stringWidth(arg0)) / 2, 22);
				local6.drawImage(Static144.anImage4, Static193.anInt4370 / 2 - 152, Static144.anInt3368 / 2 + -18, null);
			} catch (@Pc(133) Exception local133) {
				@Pc(139) int local139 = Static193.anInt4370 / 2 - 152;
				@Pc(145) int local145 = Static144.anInt3368 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local139, local145, 303, 33);
				local6.fillRect(local139 + 2, local145 + 2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local139 + 1, local145 + 1, 301, 31);
				local6.fillRect(arg3 * 3 + local139 + 2, local145 + 2, 300 - arg3 * 3, 30);
				local6.setFont(Static8.aFont2);
				local6.setColor(Color.white);
				local6.drawString(arg0, (304 - Static209.aFontMetrics1.stringWidth(arg0)) / 2 + local139, local145 - -22);
			}
			if (Static226.aString154 != null) {
				local6.setFont(Static8.aFont2);
				local6.setColor(Color.white);
				local6.drawString(Static226.aString154, Static193.anInt4370 / 2 - Static209.aFontMetrics1.stringWidth(Static226.aString154) / 2, Static144.anInt3368 / 2 + -26);
			}
		} catch (@Pc(247) Exception local247) {
			Static9.aCanvas1.repaint();
		}
	}
}
