import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_5 = new Class241(42, 15);

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;I)V")
	public static void method180(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static4.aCanvas1.getGraphics();
			if (Static191.aFont2 == null) {
				Static191.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(78) int local78;
			try {
				if (Static599.anImage12 == null) {
					Static599.anImage12 = Static4.aCanvas1.createImage(Static535.anInt4128, Static274.anInt3226);
				}
				@Pc(63) Graphics local63 = Static599.anImage12.getGraphics();
				local63.setColor(Color.black);
				local63.fillRect(0, 0, Static535.anInt4128, Static274.anInt3226);
				local78 = Static535.anInt4128 / 2 - 152;
				@Pc(84) int local84 = Static274.anInt3226 / 2 - 18;
				local63.setColor(arg3);
				local63.drawRect(local78, local84, 303, 33);
				local63.setColor(arg1);
				local63.fillRect(local78 + 2, local84 + 2, arg0 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(local78 + 1, local84 - -1, 301, 31);
				local63.fillRect(arg0 * 3 + local78 + 2, local84 + 2, 300 - arg0 * 3, 30);
				local63.setFont(Static191.aFont2);
				local63.setColor(arg4);
				local63.drawString(arg2, (304 - arg2.length() * 6) / 2 + local78, local84 - -22);
				if (Static299.aString59 != null) {
					local63.setFont(Static191.aFont2);
					local63.setColor(arg4);
					local63.drawString(Static299.aString59, Static535.anInt4128 / 2 - Static299.aString59.length() * 6 / 2, Static274.anInt3226 / 2 + -26);
				}
				local6.drawImage(Static599.anImage12, 0, 0, (ImageObserver) null);
			} catch (@Pc(200) Exception local200) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static535.anInt4128, Static274.anInt3226);
				@Pc(215) int local215 = Static535.anInt4128 / 2 - 152;
				local78 = Static274.anInt3226 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local215, local78, 303, 33);
				local6.setColor(arg1);
				local6.fillRect(local215 + 2, local78 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local215 + 1, local78 + 1, 301, 31);
				local6.fillRect(local215 + arg0 * 3 + 2, local78 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static191.aFont2);
				local6.setColor(arg4);
				if (Static299.aString59 != null) {
					local6.setFont(Static191.aFont2);
					local6.setColor(arg4);
					local6.drawString(Static299.aString59, Static535.anInt4128 / 2 - Static299.aString59.length() * 6 / 2, Static274.anInt3226 / 2 + -26);
				}
				local6.drawString(arg2, (304 - arg2.length() * 6) / 2 + local215, local78 - -22);
			}
		} catch (@Pc(330) Exception local330) {
			Static4.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)Z")
	public static boolean method182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static41.method528(arg0, arg1) & Static170.method3322(arg1, arg0);
	}
}
