import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!di", name = "Y", descriptor = "Lclient!wn;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!di", name = "X", descriptor = "[I")
	public static final int[] anIntArray92 = new int[8];

	@OriginalMember(owner = "client!di", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString54 = "Loaded update list";

	@OriginalMember(owner = "client!di", name = "cb", descriptor = "I")
	public static int anInt1376 = 1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ZI)V")
	public static void method1293(@OriginalArg(0) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(7) Graphics local7 = Static95.aCanvas2.getGraphics();
			if (Static151.aFont1 == null) {
				Static151.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4) {
				local7.setColor(Color.black);
				local7.fillRect(0, 0, Static294.anInt5659, Static46.anInt1173);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static175.anImage2 == null) {
					Static175.anImage2 = Static95.aCanvas2.createImage(304, 34);
				}
				@Pc(64) Graphics local64 = Static175.anImage2.getGraphics();
				local64.setColor(arg0);
				local64.drawRect(0, 0, 303, 33);
				local64.setColor(arg2);
				local64.fillRect(2, 2, arg5 * 3, 30);
				local64.setColor(Color.black);
				local64.drawRect(1, 1, 301, 31);
				local64.fillRect(arg5 * 3 + 2, 2, 300 - arg5 * 3, 30);
				local64.setFont(Static151.aFont1);
				local64.setColor(arg1);
				local64.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local7.drawImage(Static175.anImage2, Static294.anInt5659 / 2 - 152, Static46.anInt1173 / 2 + -18, null);
			} catch (@Pc(144) Exception local144) {
				@Pc(150) int local150 = Static294.anInt5659 / 2 - 152;
				@Pc(156) int local156 = Static46.anInt1173 / 2 - 18;
				local7.setColor(arg0);
				local7.drawRect(0, 0, 303, 33);
				local7.setColor(arg2);
				local7.fillRect(local150 + 2, local156 + 2, arg5 * 3, 30);
				local7.setColor(Color.black);
				local7.drawRect(local150 + 1, local156 + 1, 301, 31);
				local7.fillRect(arg5 * 3 + local150 + 2, local156 - -2, 300 - arg5 * 3, 30);
				local7.setFont(Static151.aFont1);
				local7.setColor(arg1);
				local7.drawString(arg3, local150 + (304 - arg3.length() * 6) / 2, local156 - -22);
			}
			if (Static31.aString28 != null) {
				local7.setFont(Static151.aFont1);
				local7.setColor(arg1);
				local7.drawString(Static31.aString28, Static294.anInt5659 / 2 - Static31.aString28.length() * 6 / 2, Static46.anInt1173 / 2 + -26);
			}
		} catch (@Pc(263) Exception local263) {
			Static95.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ne;B)Lclient!ne;")
	public static Class146 method1294(@OriginalArg(0) Class146 arg0) {
		@Pc(11) Class146 local11 = Static42.method1045(arg0);
		if (local11 == null) {
			local11 = arg0.aClass146_42;
		}
		return local11;
	}
}
