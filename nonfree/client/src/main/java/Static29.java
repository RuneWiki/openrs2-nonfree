import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
	public static int anInt847;

	@OriginalMember(owner = "client!aw", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIB)Z")
	public static boolean method752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method753(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static275.aStringArray21.length; local7++) {
			if (Static275.aStringArray21[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/String;)V")
	public static void method754(@OriginalArg(1) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(6) Graphics local6 = Static26.aCanvas3.getGraphics();
			if (Static322.aFont6 == null) {
				Static322.aFont6 = new Font("Helvetica", 1, 13);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static197.anImage11 == null) {
					Static197.anImage11 = Static26.aCanvas3.createImage(Static443.anInt7718, Static300.anInt5516);
				}
				@Pc(52) Graphics local52 = Static197.anImage11.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static443.anInt7718, Static300.anInt5516);
				local67 = Static443.anInt7718 / 2 - 152;
				@Pc(73) int local73 = Static300.anInt5516 / 2 - 18;
				local52.setColor(arg1);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg0);
				local52.fillRect(local67 + 2, local73 - -2, arg3 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(local67 + arg3 * 3 + 2, local73 + 2, 300 - arg3 * 3, 30);
				local52.setFont(Static322.aFont6);
				local52.setColor(arg2);
				local52.drawString(arg4, local67 + (304 - arg4.length() * 6) / 2, local73 + 22);
				if (Static532.aString90 != null) {
					local52.setFont(Static322.aFont6);
					local52.setColor(arg2);
					local52.drawString(Static532.aString90, Static443.anInt7718 / 2 - Static532.aString90.length() * 6 / 2, Static300.anInt5516 / 2 + -26);
				}
				local6.drawImage(Static197.anImage11, 0, 0, null);
			} catch (@Pc(188) Exception local188) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static443.anInt7718, Static300.anInt5516);
				@Pc(203) int local203 = Static443.anInt7718 / 2 - 152;
				local67 = Static300.anInt5516 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local203, local67, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local203 + 2, local67 - -2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local203 + 1, local67 + 1, 301, 31);
				local6.fillRect(arg3 * 3 + local203 + 2, local67 + 2, 300 - arg3 * 3, 30);
				local6.setFont(Static322.aFont6);
				local6.setColor(arg2);
				if (Static532.aString90 != null) {
					local6.setFont(Static322.aFont6);
					local6.setColor(arg2);
					local6.drawString(Static532.aString90, Static443.anInt7718 / 2 - Static532.aString90.length() * 6 / 2, Static300.anInt5516 / 2 + -26);
				}
				local6.drawString(arg4, local203 + (304 - arg4.length() * 6) / 2, local67 + 22);
			}
		} catch (@Pc(322) Exception local322) {
			Static26.aCanvas3.repaint();
		}
	}
}
