import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
	public static int anInt3106 = 0;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BIZLjava/lang/String;Ljava/awt/Color;)V")
	public static void method2673(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Color arg3) {
		try {
			@Pc(2) Graphics local2 = Static229.aCanvas2.getGraphics();
			if (Static39.aFont1 == null) {
				Static39.aFont1 = new Font("Helvetica", 1, 13);
				Static234.aFontMetrics1 = Static229.aCanvas2.getFontMetrics(Static39.aFont1);
			}
			if (arg1) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static194.anInt3876, Static288.anInt5232);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static226.anImage2 == null) {
					Static226.anImage2 = Static229.aCanvas2.createImage(304, 34);
				}
				@Pc(48) Graphics local48 = Static226.anImage2.getGraphics();
				local48.setColor(arg3);
				local48.drawRect(0, 0, 303, 33);
				local48.fillRect(2, 2, arg0 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(1, 1, 301, 31);
				local48.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local48.setFont(Static39.aFont1);
				local48.setColor(Color.white);
				local48.drawString(arg2, (304 - Static234.aFontMetrics1.stringWidth(arg2)) / 2, 22);
				local2.drawImage(Static226.anImage2, Static194.anInt3876 / 2 - 152, Static288.anInt5232 / 2 + -18, null);
			} catch (@Pc(131) Exception local131) {
				@Pc(137) int local137 = Static194.anInt3876 / 2 - 152;
				@Pc(143) int local143 = Static288.anInt5232 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local137, local143, 303, 33);
				local2.fillRect(local137 + 2, local143 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local137 + 1, local143 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local137 + 2, local143 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static39.aFont1);
				local2.setColor(Color.white);
				local2.drawString(arg2, local137 + (304 - Static234.aFontMetrics1.stringWidth(arg2)) / 2, local143 + 22);
			}
			if (Static35.aString28 != null) {
				local2.setFont(Static39.aFont1);
				local2.setColor(Color.white);
				local2.drawString(Static35.aString28, Static194.anInt3876 / 2 - Static234.aFontMetrics1.stringWidth(Static35.aString28) / 2, Static288.anInt5232 / 2 - 26);
			}
		} catch (@Pc(248) Exception local248) {
			Static229.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method2674(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static184.aClass13_1);
		arg0.removeMouseMotionListener(Static184.aClass13_1);
		arg0.removeFocusListener(Static184.aClass13_1);
		Static241.anInt4478 = 0;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IB)V")
	public static void method2675(@OriginalArg(0) int arg0) {
		if (arg0 == Static167.anInt636) {
			@Pc(21) Interface3 local21 = Static281.anInterface3Array2[arg0];
			local21.method3930(Static82.anInt1831);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method2676(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local4; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	public static void method2677(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub5_Sub21 local15 = Static278.method4266(4, arg0);
		local15.method4064();
	}
}
