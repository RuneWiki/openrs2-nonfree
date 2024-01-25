import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "Lclient!cf;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public static int anInt269;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	public static int anInt270;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_7 = new Class208(30, -1);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
	public static boolean method175() {
		@Pc(8) Class2_Sub43 local8 = (Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243;
		if (local8 == null || local8 == Static262.aClass238_29.aClass2_225) {
			return false;
		} else {
			if (local8.anInt7126 >= 2000) {
				local8.anInt7126 -= 2000;
			}
			return local8.anInt7126 == 1010;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/awt/Color;IZLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V")
	public static void method176(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) String arg5) {
		try {
			@Pc(6) Graphics local6 = Static343.aCanvas5.getGraphics();
			if (Static160.aFont1 == null) {
				Static160.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static7.anInt157, Static336.anInt6217);
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
			try {
				if (Static379.anImage3 == null) {
					Static379.anImage3 = Static343.aCanvas5.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static379.anImage3.getGraphics();
				local63.setColor(arg3);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg1);
				local63.fillRect(2, 2, arg0 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local63.setFont(Static160.aFont1);
				local63.setColor(arg4);
				local63.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local6.drawImage(Static379.anImage3, Static7.anInt157 / 2 - 152, Static336.anInt6217 / 2 + -18, null);
			} catch (@Pc(149) Exception local149) {
				@Pc(155) int local155 = Static7.anInt157 / 2 - 152;
				@Pc(161) int local161 = Static336.anInt6217 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg1);
				local6.fillRect(local155 + 2, local161 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local155 + 1, local161 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local155 + 2, local161 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static160.aFont1);
				local6.setColor(arg4);
				local6.drawString(arg5, local155 + (304 - arg5.length() * 6) / 2, local161 + 22);
			}
			if (Static326.aString57 != null) {
				local6.setFont(Static160.aFont1);
				local6.setColor(arg4);
				local6.drawString(Static326.aString57, Static7.anInt157 / 2 - Static326.aString57.length() * 6 / 2, Static336.anInt6217 / 2 - 26);
			}
		} catch (@Pc(268) Exception local268) {
			Static343.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public static void method178() {
		Static120.aClass41_29.method829();
	}
}
