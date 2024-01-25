import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_178 = new Class156(88, -2);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;I)V")
	public static void method7418(@OriginalArg(0) Color arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) Graphics local6 = Static357.aCanvas8.getGraphics();
			if (Static311.aFont2 == null) {
				Static311.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(73) int local73;
			try {
				if (Static655.anImage13 == null) {
					Static655.anImage13 = Static357.aCanvas8.createImage(Static85.anInt9921, Static256.anInt4629);
				}
				@Pc(58) Graphics local58 = Static655.anImage13.getGraphics();
				local58.setColor(Color.black);
				local58.fillRect(0, 0, Static85.anInt9921, Static256.anInt4629);
				local73 = Static85.anInt9921 / 2 - 152;
				@Pc(79) int local79 = Static256.anInt4629 / 2 - 18;
				local58.setColor(arg2);
				local58.drawRect(local73, local79, 303, 33);
				local58.setColor(arg0);
				local58.fillRect(local73 + 2, local79 - -2, arg4 * 3, 30);
				local58.setColor(Color.black);
				local58.drawRect(local73 + 1, local79 + 1, 301, 31);
				local58.fillRect(local73 + arg4 * 3 + 2, local79 + 2, 300 - arg4 * 3, 30);
				local58.setFont(Static311.aFont2);
				local58.setColor(arg3);
				local58.drawString(arg1, (304 - arg1.length() * 6) / 2 + local73, local79 - -22);
				if (Static160.aString100 != null) {
					local58.setFont(Static311.aFont2);
					local58.setColor(arg3);
					local58.drawString(Static160.aString100, Static85.anInt9921 / 2 - Static160.aString100.length() * 6 / 2, Static256.anInt4629 / 2 + -26);
				}
				local6.drawImage(Static655.anImage13, 0, 0, (ImageObserver) null);
			} catch (@Pc(202) Exception local202) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static85.anInt9921, Static256.anInt4629);
				@Pc(217) int local217 = Static85.anInt9921 / 2 - 152;
				local73 = Static256.anInt4629 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local217, local73, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local217 + 2, local73 + 2, arg4 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local217 + 1, local73 + 1, 301, 31);
				local6.fillRect(local217 + arg4 * 3 + 2, local73 + 2, 300 - arg4 * 3, 30);
				local6.setFont(Static311.aFont2);
				local6.setColor(arg3);
				if (Static160.aString100 != null) {
					local6.setFont(Static311.aFont2);
					local6.setColor(arg3);
					local6.drawString(Static160.aString100, Static85.anInt9921 / 2 - Static160.aString100.length() * 6 / 2, Static256.anInt4629 / 2 + -26);
				}
				local6.drawString(arg1, local217 + (304 - arg1.length() * 6) / 2, local73 + 22);
			}
		} catch (@Pc(333) Exception local333) {
			Static357.aCanvas8.repaint();
		}
	}
}
