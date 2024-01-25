import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
	public static final int[] anIntArray676 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Z)V")
	public static void method5426(@OriginalArg(0) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(6) Graphics local6 = Static443.aCanvas33.getGraphics();
			if (Static102.aFont1 == null) {
				Static102.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static152.anInt3234, Static342.anInt6292);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static315.anImage2 == null) {
					Static315.anImage2 = Static443.aCanvas33.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static315.anImage2.getGraphics();
				local63.setColor(arg3);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg1);
				local63.fillRect(2, 2, arg0 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local63.setFont(Static102.aFont1);
				local63.setColor(arg2);
				local63.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static315.anImage2, Static152.anInt3234 / 2 - 152, Static342.anInt6292 / 2 - 18, null);
			} catch (@Pc(144) Exception local144) {
				@Pc(150) int local150 = Static152.anInt3234 / 2 - 152;
				@Pc(156) int local156 = Static342.anInt6292 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg1);
				local6.fillRect(local150 + 2, local156 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local150 + 1, local156 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local150 + 2, local156 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static102.aFont1);
				local6.setColor(arg2);
				local6.drawString(arg4, (304 - arg4.length() * 6) / 2 + local150, local156 + 22);
			}
			if (Static393.aString62 != null) {
				local6.setFont(Static102.aFont1);
				local6.setColor(arg2);
				local6.drawString(Static393.aString62, Static152.anInt3234 / 2 - Static393.aString62.length() * 6 / 2, Static342.anInt6292 / 2 - 26);
			}
		} catch (@Pc(264) Exception local264) {
			Static443.aCanvas33.repaint();
		}
	}
}
