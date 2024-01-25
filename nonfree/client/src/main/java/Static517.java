import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public static int anInt8622;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;BLjava/awt/Color;ILjava/awt/Color;)V")
	public static void method7333(@OriginalArg(0) Color arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static140.aCanvas1.getGraphics();
			if (Static557.aFont2 == null) {
				Static557.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static559.anImage13 == null) {
					Static559.anImage13 = Static140.aCanvas1.createImage(Static449.anInt7506, Static348.anInt5935);
				}
				@Pc(48) Graphics local48 = Static559.anImage13.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static449.anInt7506, Static348.anInt5935);
				local63 = Static449.anInt7506 / 2 - 152;
				@Pc(79) int local79 = Static348.anInt5935 / 2 - 18;
				local48.setColor(arg0);
				local48.drawRect(local63, local79, 303, 33);
				local48.setColor(arg2);
				local48.fillRect(local63 + 2, local79 - -2, arg3 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local79 + 1, 301, 31);
				local48.fillRect(arg3 * 3 + local63 + 2, local79 + 2, 300 - arg3 * 3, 30);
				local48.setFont(Static557.aFont2);
				local48.setColor(arg4);
				local48.drawString(arg1, local63 + (304 - arg1.length() * 6) / 2, local79 - -22);
				if (Static231.aString40 != null) {
					local48.setFont(Static557.aFont2);
					local48.setColor(arg4);
					local48.drawString(Static231.aString40, Static449.anInt7506 / 2 - Static231.aString40.length() * 6 / 2, Static348.anInt5935 / 2 - 26);
				}
				local2.drawImage(Static559.anImage13, 0, 0, (ImageObserver) null);
			} catch (@Pc(194) Exception local194) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static449.anInt7506, Static348.anInt5935);
				@Pc(209) int local209 = Static449.anInt7506 / 2 - 152;
				local63 = Static348.anInt5935 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local209, local63, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local209 + 2, local63 + 2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local209 + 1, local63 - -1, 301, 31);
				local2.fillRect(local209 + arg3 * 3 + 2, local63 - -2, 300 - arg3 * 3, 30);
				local2.setFont(Static557.aFont2);
				local2.setColor(arg4);
				if (Static231.aString40 != null) {
					local2.setFont(Static557.aFont2);
					local2.setColor(arg4);
					local2.drawString(Static231.aString40, Static449.anInt7506 / 2 - Static231.aString40.length() * 6 / 2, Static348.anInt5935 / 2 + -26);
				}
				local2.drawString(arg1, (304 - arg1.length() * 6) / 2 + local209, local63 + 22);
			}
		} catch (@Pc(323) Exception local323) {
			Static140.aCanvas1.repaint();
		}
	}
}
