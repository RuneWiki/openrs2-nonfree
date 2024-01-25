import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
	public static int anInt10223;

	@OriginalMember(owner = "client!ww", name = "r", descriptor = "Lclient!fw;")
	public static final Class120 aClass120_9 = new Class120();

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/awt/Color;IBLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V")
	public static void method8766(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(2) Graphics local2 = Static364.aCanvas13.getGraphics();
			if (Static195.aFont1 == null) {
				Static195.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static7.anImage6 == null) {
					Static7.anImage6 = Static364.aCanvas13.createImage(Static109.anInt2357, Static330.anInt6165);
				}
				@Pc(48) Graphics local48 = Static7.anImage6.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static109.anInt2357, Static330.anInt6165);
				local63 = Static109.anInt2357 / 2 - 152;
				@Pc(69) int local69 = Static330.anInt6165 / 2 - 18;
				local48.setColor(arg3);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg0);
				local48.fillRect(local63 + 2, local69 + 2, arg1 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(arg1 * 3 + local63 + 2, local69 - -2, 300 - arg1 * 3, 30);
				local48.setFont(Static195.aFont1);
				local48.setColor(arg2);
				local48.drawString(arg4, (304 - arg4.length() * 6) / 2 + local63, local69 - -22);
				if (Static323.aString65 != null) {
					local48.setFont(Static195.aFont1);
					local48.setColor(arg2);
					local48.drawString(Static323.aString65, Static109.anInt2357 / 2 - Static323.aString65.length() * 6 / 2, Static330.anInt6165 / 2 - 26);
				}
				local2.drawImage(Static7.anImage6, 0, 0, null);
			} catch (@Pc(189) Exception local189) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static109.anInt2357, Static330.anInt6165);
				@Pc(204) int local204 = Static109.anInt2357 / 2 - 152;
				local63 = Static330.anInt6165 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local204, local63, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local204 + 2, local63 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local204 + 1, local63 + 1, 301, 31);
				local2.fillRect(arg1 * 3 + local204 + 2, local63 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static195.aFont1);
				local2.setColor(arg2);
				if (Static323.aString65 != null) {
					local2.setFont(Static195.aFont1);
					local2.setColor(arg2);
					local2.drawString(Static323.aString65, Static109.anInt2357 / 2 - Static323.aString65.length() * 6 / 2, Static330.anInt6165 / 2 + -26);
				}
				local2.drawString(arg4, local204 + (304 - arg4.length() * 6) / 2, local63 - -22);
			}
		} catch (@Pc(318) Exception local318) {
			Static364.aCanvas13.repaint();
		}
	}
}
