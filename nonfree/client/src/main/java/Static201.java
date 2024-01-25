import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_273 = new Class22(42, -1);

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
	public static final int[] anIntArray410 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public static void method4602(@OriginalArg(1) int arg0) {
		if (-1 != arg0 && Static453.aBooleanArray25[arg0]) {
			Static356.aClass76_81.method2115(arg0);
			Static297.aClass247ArrayArray2[arg0] = null;
			Static30.aClass247ArrayArray1[arg0] = null;
			Static453.aBooleanArray25[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;IZLjava/lang/String;)V")
	public static void method4604(@OriginalArg(0) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5) {
		try {
			@Pc(6) Graphics local6 = Static273.aCanvas5.getGraphics();
			if (Static381.aFont1 == null) {
				Static381.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static141.anInt2881, Static302.anInt5346);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static253.anImage2 == null) {
					Static253.anImage2 = Static273.aCanvas5.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static253.anImage2.getGraphics();
				local63.setColor(arg1);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg2);
				local63.fillRect(2, 2, arg3 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local63.setFont(Static381.aFont1);
				local63.setColor(arg0);
				local63.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local6.drawImage(Static253.anImage2, Static141.anInt2881 / 2 - 152, Static302.anInt5346 / 2 + -18, null);
			} catch (@Pc(149) Exception local149) {
				@Pc(155) int local155 = Static141.anInt2881 / 2 - 152;
				@Pc(161) int local161 = Static302.anInt5346 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local155 + 2, local161 + 2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local155 + 1, local161 + 1, 301, 31);
				local6.fillRect(arg3 * 3 + local155 + 2, local161 - -2, 300 - arg3 * 3, 30);
				local6.setFont(Static381.aFont1);
				local6.setColor(arg0);
				local6.drawString(arg5, (304 - arg5.length() * 6) / 2 + local155, local161 - -22);
			}
			if (Static129.aString30 != null) {
				local6.setFont(Static381.aFont1);
				local6.setColor(arg0);
				local6.drawString(Static129.aString30, Static141.anInt2881 / 2 - Static129.aString30.length() * 6 / 2, Static302.anInt5346 / 2 + -26);
			}
		} catch (@Pc(268) Exception local268) {
			Static273.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method4605() {
		if (Static142.aClass199_6 == null) {
			return;
		}
		if (Static142.aClass199_6.anInt5760 == 1) {
			Static142.aClass199_6 = null;
			return;
		}
		if (Static142.aClass199_6.anInt5760 == 2) {
			Static197.method3110(Static248.aClass66_6, 2, Static333.aString57);
			Static142.aClass199_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method4607() {
		@Pc(9) int local9 = (int) ((double) Static326.anInt5666 * 34.46D);
		local9 <<= 0x0;
		if (Static122.aClass19_16.method4286()) {
			local9 += 128;
		}
		Static122.aClass19_16.ia(50, local9);
	}
}
