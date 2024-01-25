import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "[Lclient!jr;")
	public static final Class104[] aClass104Array1 = new Class104[8];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[Lclient!kh;)V")
	public static void method2636(@OriginalArg(1) Class54[] arg0) {
		Static320.anInt6060 = arg0.length;
		Static49.aClass54Array4 = new Class54[Static320.anInt6060 + 10];
		Static311.anIntArray557 = new int[Static320.anInt6060 + 10];
		Static359.method755(arg0, 0, Static49.aClass54Array4, 0, Static320.anInt6060);
		for (@Pc(31) int local31 = 0; local31 < Static320.anInt6060; local31++) {
			Static311.anIntArray557[local31] = Static49.aClass54Array4[local31].method5576();
		}
		for (@Pc(46) int local46 = Static320.anInt6060; local46 < Static49.aClass54Array4.length; local46++) {
			Static311.anIntArray557[local46] = 12;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;BLjava/awt/Color;)V")
	public static void method2639(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static243.aCanvas3.getGraphics();
			if (Static8.aFont1 == null) {
				Static8.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg0) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static17.anInt5991, Static246.anInt4801);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static161.anImage3 == null) {
					Static161.anImage3 = Static243.aCanvas3.createImage(304, 34);
				}
				@Pc(64) Graphics local64 = Static161.anImage3.getGraphics();
				local64.setColor(arg3);
				local64.drawRect(0, 0, 303, 33);
				local64.setColor(arg5);
				local64.fillRect(2, 2, arg1 * 3, 30);
				local64.setColor(Color.black);
				local64.drawRect(1, 1, 301, 31);
				local64.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local64.setFont(Static8.aFont1);
				local64.setColor(arg2);
				local64.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local2.drawImage(Static161.anImage3, Static17.anInt5991 / 2 - 152, Static246.anInt4801 / 2 - 18, null);
			} catch (@Pc(144) Exception local144) {
				@Pc(150) int local150 = Static17.anInt5991 / 2 - 152;
				@Pc(156) int local156 = Static246.anInt4801 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg5);
				local2.fillRect(local150 + 2, local156 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local150 + 1, local156 - -1, 301, 31);
				local2.fillRect(local150 + arg1 * 3 + 2, local156 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static8.aFont1);
				local2.setColor(arg2);
				local2.drawString(arg4, (304 - arg4.length() * 6) / 2 + local150, local156 + 22);
			}
			if (Static145.aString358 != null) {
				local2.setFont(Static8.aFont1);
				local2.setColor(arg2);
				local2.drawString(Static145.aString358, Static17.anInt5991 / 2 - Static145.aString358.length() * 6 / 2, Static246.anInt4801 / 2 + -26);
			}
		} catch (@Pc(263) Exception local263) {
			Static243.aCanvas3.repaint();
		}
	}
}
