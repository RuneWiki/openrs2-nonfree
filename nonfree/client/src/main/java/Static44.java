import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!cs;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ZZ)V")
	public static void method694(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(6) Graphics local6 = Static339.aCanvas7.getGraphics();
			if (Static136.aFont1 == null) {
				Static136.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static86.anInt4394, Static395.anInt6582);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static352.anImage3 == null) {
					Static352.anImage3 = Static339.aCanvas7.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static352.anImage3.getGraphics();
				local63.setColor(arg3);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg0);
				local63.fillRect(2, 2, arg2 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local63.setFont(Static136.aFont1);
				local63.setColor(arg1);
				local63.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static352.anImage3, Static86.anInt4394 / 2 - 152, Static395.anInt6582 / 2 - 18, null);
			} catch (@Pc(154) Exception local154) {
				@Pc(160) int local160 = Static86.anInt4394 / 2 - 152;
				@Pc(166) int local166 = Static395.anInt6582 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local160 + 2, local166 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local160 + 1, local166 - -1, 301, 31);
				local6.fillRect(arg2 * 3 + local160 + 2, local166 - -2, 300 - arg2 * 3, 30);
				local6.setFont(Static136.aFont1);
				local6.setColor(arg1);
				local6.drawString(arg4, local160 + (304 - arg4.length() * 6) / 2, local166 + 22);
			}
			if (Static278.aString48 != null) {
				local6.setFont(Static136.aFont1);
				local6.setColor(arg1);
				local6.drawString(Static278.aString48, Static86.anInt4394 / 2 - Static278.aString48.length() * 6 / 2, Static395.anInt6582 / 2 + -26);
			}
		} catch (@Pc(272) Exception local272) {
			Static339.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!dn;B)Z")
	public static boolean method695(@OriginalArg(0) Class56 arg0) {
		return arg0 == Static89.aClass56_3 || Static202.aClass56_6 == arg0 || Static184.aClass56_5 == arg0 || Static343.aClass56_7 == arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILclient!co;ZII)V")
	public static void method697(@OriginalArg(2) int arg0, @OriginalArg(3) Class3_Sub2_Sub1 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static33.method575(arg1.anInt6119, arg3, arg0, 0, arg2, arg1.anInt6121, arg1.aByte89);
	}
}
