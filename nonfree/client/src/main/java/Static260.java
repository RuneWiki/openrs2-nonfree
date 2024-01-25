import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method4299(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(14) Graphics local14 = Static379.aCanvas13.getGraphics();
			if (Static551.aFont2 == null) {
				Static551.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(75) int local75;
			try {
				if (Static314.anImage16 == null) {
					Static314.anImage16 = Static379.aCanvas13.createImage(Static2.anInt29, Static19.anInt390);
				}
				@Pc(60) Graphics local60 = Static314.anImage16.getGraphics();
				local60.setColor(Color.black);
				local60.fillRect(0, 0, Static2.anInt29, Static19.anInt390);
				local75 = Static2.anInt29 / 2 - 152;
				@Pc(81) int local81 = Static19.anInt390 / 2 - 18;
				local60.setColor(arg4);
				local60.drawRect(local75, local81, 303, 33);
				local60.setColor(arg2);
				local60.fillRect(local75 + 2, local81 + 2, arg1 * 3, 30);
				local60.setColor(Color.black);
				local60.drawRect(local75 + 1, local81 + 1, 301, 31);
				local60.fillRect(arg1 * 3 + local75 + 2, local81 + 2, 300 - arg1 * 3, 30);
				local60.setFont(Static551.aFont2);
				local60.setColor(arg3);
				local60.drawString(arg0, (304 - arg0.length() * 6) / 2 + local75, local81 + 22);
				if (Static121.aString83 != null) {
					local60.setFont(Static551.aFont2);
					local60.setColor(arg3);
					local60.drawString(Static121.aString83, Static2.anInt29 / 2 - Static121.aString83.length() * 6 / 2, Static19.anInt390 / 2 + -26);
				}
				local14.drawImage(Static314.anImage16, 0, 0, null);
			} catch (@Pc(196) Exception local196) {
				local14.setColor(Color.black);
				local14.fillRect(0, 0, Static2.anInt29, Static19.anInt390);
				@Pc(211) int local211 = Static2.anInt29 / 2 - 152;
				local75 = Static19.anInt390 / 2 - 18;
				local14.setColor(arg4);
				local14.drawRect(local211, local75, 303, 33);
				local14.setColor(arg2);
				local14.fillRect(local211 + 2, local75 + 2, arg1 * 3, 30);
				local14.setColor(Color.black);
				local14.drawRect(local211 + 1, local75 + 1, 301, 31);
				local14.fillRect(local211 + arg1 * 3 + 2, local75 - -2, 300 - arg1 * 3, 30);
				local14.setFont(Static551.aFont2);
				local14.setColor(arg3);
				if (Static121.aString83 != null) {
					local14.setFont(Static551.aFont2);
					local14.setColor(arg3);
					local14.drawString(Static121.aString83, Static2.anInt29 / 2 - Static121.aString83.length() * 6 / 2, Static19.anInt390 / 2 + -26);
				}
				local14.drawString(arg0, local211 + (304 - arg0.length() * 6) / 2, local75 - -22);
			}
		} catch (@Pc(326) Exception local326) {
			Static379.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public static boolean method4300(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
