import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "[I")
	public static int[] anIntArray291 = new int[1];

	@OriginalMember(owner = "client!hba", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
	public static int anInt3116 = 0;

	@OriginalMember(owner = "client!hba", name = "H", descriptor = "J")
	public static long aLong144 = -1L;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/lang/String;I)V")
	public static void method2634(@OriginalArg(1) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(6) Graphics local6 = Static105.aCanvas3.getGraphics();
			if (Static468.aFont1 == null) {
				Static468.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static83.anInt1567, Static350.anInt6255);
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
			try {
				if (Static466.anImage3 == null) {
					Static466.anImage3 = Static105.aCanvas3.createImage(304, 34);
				}
				@Pc(71) Graphics local71 = Static466.anImage3.getGraphics();
				local71.setColor(arg1);
				local71.drawRect(0, 0, 303, 33);
				local71.setColor(arg0);
				local71.fillRect(2, 2, arg5 * 3, 30);
				local71.setColor(Color.black);
				local71.drawRect(1, 1, 301, 31);
				local71.fillRect(arg5 * 3 + 2, 2, 300 - arg5 * 3, 30);
				local71.setFont(Static468.aFont1);
				local71.setColor(arg2);
				local71.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static466.anImage3, Static83.anInt1567 / 2 - 152, Static350.anInt6255 / 2 + -18, null);
			} catch (@Pc(151) Exception local151) {
				@Pc(157) int local157 = Static83.anInt1567 / 2 - 152;
				@Pc(163) int local163 = Static350.anInt6255 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local157 + 2, local163 + 2, arg5 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local157 + 1, local163 + 1, 301, 31);
				local6.fillRect(arg5 * 3 + local157 + 2, local163 + 2, 300 - arg5 * 3, 30);
				local6.setFont(Static468.aFont1);
				local6.setColor(arg2);
				local6.drawString(arg4, local157 + (304 - arg4.length() * 6) / 2, local163 - -22);
			}
			if (Static424.aString69 != null) {
				local6.setFont(Static468.aFont1);
				local6.setColor(arg2);
				local6.drawString(Static424.aString69, Static83.anInt1567 / 2 - Static424.aString69.length() * 6 / 2, Static350.anInt6255 / 2 + -26);
			}
		} catch (@Pc(272) Exception local272) {
			Static105.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
	public static void method2635(@OriginalArg(0) int arg0) {
		Static546.anInt2811 = 3;
		Static361.anInt6368 = arg0;
		Static99.anInt1989 = 100;
		Static299.anInt5548 = -1;
	}
}
