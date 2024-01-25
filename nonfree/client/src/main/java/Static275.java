import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[Lclient!mc;")
	public static Class208[] aClass208Array1;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public static int anInt5823 = -1;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	public static int anInt5826 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;ILjava/lang/String;)V")
	public static void method4788(@OriginalArg(0) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(2) Graphics local2 = Static545.aCanvas14.getGraphics();
			if (Static160.aFont1 == null) {
				Static160.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static350.anImage12 == null) {
					Static350.anImage12 = Static545.aCanvas14.createImage(Static582.anInt10234, Static294.anInt10217);
				}
				@Pc(48) Graphics local48 = Static350.anImage12.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static582.anInt10234, Static294.anInt10217);
				local63 = Static582.anInt10234 / 2 - 152;
				@Pc(69) int local69 = Static294.anInt10217 / 2 - 18;
				local48.setColor(arg0);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg2);
				local48.fillRect(local63 + 2, local69 + 2, arg3 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 - -1, 301, 31);
				local48.fillRect(local63 + arg3 * 3 + 2, local69 - -2, 300 - arg3 * 3, 30);
				local48.setFont(Static160.aFont1);
				local48.setColor(arg1);
				local48.drawString(arg4, local63 + (304 - arg4.length() * 6) / 2, local69 + 22);
				if (Static211.aString44 != null) {
					local48.setFont(Static160.aFont1);
					local48.setColor(arg1);
					local48.drawString(Static211.aString44, Static582.anInt10234 / 2 - Static211.aString44.length() * 6 / 2, Static294.anInt10217 / 2 + -26);
				}
				local2.drawImage(Static350.anImage12, 0, 0, null);
			} catch (@Pc(184) Exception local184) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static582.anInt10234, Static294.anInt10217);
				@Pc(199) int local199 = Static582.anInt10234 / 2 - 152;
				local63 = Static294.anInt10217 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local199, local63, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local199 + 2, local63 + 2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local199 + 1, local63 - -1, 301, 31);
				local2.fillRect(arg3 * 3 + local199 + 2, local63 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static160.aFont1);
				local2.setColor(arg1);
				if (Static211.aString44 != null) {
					local2.setFont(Static160.aFont1);
					local2.setColor(arg1);
					local2.drawString(Static211.aString44, Static582.anInt10234 / 2 - Static211.aString44.length() * 6 / 2, Static294.anInt10217 / 2 + -26);
				}
				local2.drawString(arg4, (304 - arg4.length() * 6) / 2 + local199, local63 + 22);
			}
		} catch (@Pc(313) Exception local313) {
			Static545.aCanvas14.repaint();
		}
	}
}
