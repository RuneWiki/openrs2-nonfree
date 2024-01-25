import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!rea;")
	public static Class291 aClass291_7;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!mga;")
	public static final Class220 aClass220_11 = new Class220("LIVE", "", "", 0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;BLjava/awt/Color;)V")
	public static void method7715(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static617.aCanvas13.getGraphics();
			if (Static451.aFont1 == null) {
				Static451.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static103.anImage1 == null) {
					Static103.anImage1 = Static617.aCanvas13.createImage(Static330.anInt6254, Static190.anInt3576);
				}
				@Pc(52) Graphics local52 = Static103.anImage1.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static330.anInt6254, Static190.anInt3576);
				local67 = Static330.anInt6254 / 2 - 152;
				@Pc(73) int local73 = Static190.anInt3576 / 2 - 18;
				local52.setColor(arg4);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg3);
				local52.fillRect(local67 + 2, local73 + 2, arg1 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(local67 + arg1 * 3 + 2, local73 + 2, 300 - arg1 * 3, 30);
				local52.setFont(Static451.aFont1);
				local52.setColor(arg2);
				local52.drawString(arg0, local67 + (304 - arg0.length() * 6) / 2, local73 + 22);
				if (Static595.aString97 != null) {
					local52.setFont(Static451.aFont1);
					local52.setColor(arg2);
					local52.drawString(Static595.aString97, Static330.anInt6254 / 2 - Static595.aString97.length() * 6 / 2, Static190.anInt3576 / 2 + -26);
				}
				local6.drawImage(Static103.anImage1, 0, 0, (ImageObserver) null);
			} catch (@Pc(190) Exception local190) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static330.anInt6254, Static190.anInt3576);
				@Pc(205) int local205 = Static330.anInt6254 / 2 - 152;
				local67 = Static190.anInt3576 / 2 - 18;
				local6.setColor(arg4);
				local6.drawRect(local205, local67, 303, 33);
				local6.setColor(arg3);
				local6.fillRect(local205 + 2, local67 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local205 + 1, local67 - -1, 301, 31);
				local6.fillRect(arg1 * 3 + local205 + 2, local67 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static451.aFont1);
				local6.setColor(arg2);
				if (Static595.aString97 != null) {
					local6.setFont(Static451.aFont1);
					local6.setColor(arg2);
					local6.drawString(Static595.aString97, Static330.anInt6254 / 2 - Static595.aString97.length() * 6 / 2, Static190.anInt3576 / 2 + -26);
				}
				local6.drawString(arg0, local205 + (304 - arg0.length() * 6) / 2, local67 + 22);
			}
		} catch (@Pc(317) Exception local317) {
			Static617.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7720(@OriginalArg(0) String arg0) {
		return Static377.method5950(10, arg0);
	}
}
