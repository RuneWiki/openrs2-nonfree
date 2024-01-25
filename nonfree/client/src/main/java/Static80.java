import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
	public static int anInt1391;

	@OriginalMember(owner = "client!dca", name = "p", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_33 = new Class275();

	@OriginalMember(owner = "client!dca", name = "r", descriptor = "Lclient!nd;")
	public static final Class210 aClass210_4 = new Class210("WIP", 2);

	@OriginalMember(owner = "client!dca", name = "t", descriptor = "I")
	public static int anInt1397 = -1;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)Z")
	public static boolean method1296() {
		return Static69.method889("jaclib") ? Static69.method889("hw3d") : false;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/awt/Color;IZLjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method1297(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static34.aCanvas15.getGraphics();
			if (Static478.aFont1 == null) {
				Static478.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static58.anImage1 == null) {
					Static58.anImage1 = Static34.aCanvas15.createImage(Static502.anInt8364, Static476.anInt8045);
				}
				@Pc(52) Graphics local52 = Static58.anImage1.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static502.anInt8364, Static476.anInt8045);
				local67 = Static502.anInt8364 / 2 - 152;
				@Pc(73) int local73 = Static476.anInt8045 / 2 - 18;
				local52.setColor(arg3);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg4);
				local52.fillRect(local67 + 2, local73 - -2, arg1 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 - -1, 301, 31);
				local52.fillRect(local67 + arg1 * 3 + 2, local73 - -2, 300 - arg1 * 3, 30);
				local52.setFont(Static478.aFont1);
				local52.setColor(arg0);
				local52.drawString(arg2, (304 - arg2.length() * 6) / 2 + local67, local73 + 22);
				if (Static58.aString8 != null) {
					local52.setFont(Static478.aFont1);
					local52.setColor(arg0);
					local52.drawString(Static58.aString8, Static502.anInt8364 / 2 - Static58.aString8.length() * 6 / 2, Static476.anInt8045 / 2 + -26);
				}
				local6.drawImage(Static58.anImage1, 0, 0, null);
			} catch (@Pc(193) Exception local193) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static502.anInt8364, Static476.anInt8045);
				@Pc(208) int local208 = Static502.anInt8364 / 2 - 152;
				local67 = Static476.anInt8045 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local208, local67, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local208 + 2, local67 - -2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local208 + 1, local67 + 1, 301, 31);
				local6.fillRect(local208 + arg1 * 3 + 2, local67 - -2, 300 - arg1 * 3, 30);
				local6.setFont(Static478.aFont1);
				local6.setColor(arg0);
				if (Static58.aString8 != null) {
					local6.setFont(Static478.aFont1);
					local6.setColor(arg0);
					local6.drawString(Static58.aString8, Static502.anInt8364 / 2 - Static58.aString8.length() * 6 / 2, Static476.anInt8045 / 2 + -26);
				}
				local6.drawString(arg2, local208 + (304 - arg2.length() * 6) / 2, local67 + 22);
			}
		} catch (@Pc(324) Exception local324) {
			Static34.aCanvas15.repaint();
		}
	}
}
