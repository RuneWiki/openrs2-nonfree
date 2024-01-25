import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_1 = new Class163(46, -1);

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!of;")
	public static final Class174 aClass174_2 = new Class174("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;II)V")
	public static void method63(@OriginalArg(0) boolean arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Color arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(6) Graphics local6 = Static151.aCanvas2.getGraphics();
			if (Static257.aFont1 == null) {
				Static257.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg0) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static310.anInt5307, Static166.anInt3014);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			try {
				if (Static54.anImage1 == null) {
					Static54.anImage1 = Static151.aCanvas2.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static54.anImage1.getGraphics();
				local63.setColor(arg1);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg2);
				local63.fillRect(2, 2, arg5 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg5 * 3 + 2, 2, 300 - arg5 * 3, 30);
				local63.setFont(Static257.aFont1);
				local63.setColor(arg4);
				local63.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local6.drawImage(Static54.anImage1, Static310.anInt5307 / 2 - 152, Static166.anInt3014 / 2 + -18, null);
			} catch (@Pc(147) Exception local147) {
				@Pc(153) int local153 = Static310.anInt5307 / 2 - 152;
				@Pc(159) int local159 = Static166.anInt3014 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local153 + 2, local159 - -2, arg5 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local153 + 1, local159 - -1, 301, 31);
				local6.fillRect(local153 + arg5 * 3 + 2, local159 + 2, 300 - arg5 * 3, 30);
				local6.setFont(Static257.aFont1);
				local6.setColor(arg4);
				local6.drawString(arg3, (304 - arg3.length() * 6) / 2 + local153, local159 + 22);
			}
			if (Static139.aString36 != null) {
				local6.setFont(Static257.aFont1);
				local6.setColor(arg4);
				local6.drawString(Static139.aString36, Static310.anInt5307 / 2 - Static139.aString36.length() * 6 / 2, Static166.anInt3014 / 2 + -26);
			}
		} catch (@Pc(265) Exception local265) {
			Static151.aCanvas2.repaint();
		}
	}
}
