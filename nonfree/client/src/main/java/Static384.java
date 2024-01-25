import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public static int anInt6418;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "Lclient!nr;")
	public static Class169 aClass169_3;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!cp;")
	public static Class44 aClass44_39 = new Class44(64);

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public static int anInt6421 = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;B)V")
	public static void method5677(@OriginalArg(0) Color arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Color arg5) {
		try {
			@Pc(6) Graphics local6 = Static173.aCanvas2.getGraphics();
			if (Static45.aFont1 == null) {
				Static45.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static199.anInt3567, Static207.anInt2251);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(255, 255, 255);
			}
			try {
				if (Static141.anImage1 == null) {
					Static141.anImage1 = Static173.aCanvas2.createImage(304, 34);
				}
				@Pc(67) Graphics local67 = Static141.anImage1.getGraphics();
				local67.setColor(arg2);
				local67.drawRect(0, 0, 303, 33);
				local67.setColor(arg0);
				local67.fillRect(2, 2, arg4 * 3, 30);
				local67.setColor(Color.black);
				local67.drawRect(1, 1, 301, 31);
				local67.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
				local67.setFont(Static45.aFont1);
				local67.setColor(arg5);
				local67.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local6.drawImage(Static141.anImage1, Static199.anInt3567 / 2 - 152, Static207.anInt2251 / 2 + -18, null);
			} catch (@Pc(147) Exception local147) {
				@Pc(153) int local153 = Static199.anInt3567 / 2 - 152;
				@Pc(159) int local159 = Static207.anInt2251 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local153 + 2, local159 + 2, arg4 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local153 + 1, local159 + 1, 301, 31);
				local6.fillRect(arg4 * 3 + local153 + 2, local159 + 2, 300 - arg4 * 3, 30);
				local6.setFont(Static45.aFont1);
				local6.setColor(arg5);
				local6.drawString(arg3, (304 - arg3.length() * 6) / 2 + local153, local159 + 22);
			}
			if (Static181.aString32 != null) {
				local6.setFont(Static45.aFont1);
				local6.setColor(arg5);
				local6.drawString(Static181.aString32, Static199.anInt3567 / 2 - Static181.aString32.length() * 6 / 2, Static207.anInt2251 / 2 - 26);
			}
		} catch (@Pc(267) Exception local267) {
			Static173.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method5678() {
		Static295.aClass139_62.method3075();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)I")
	public static int method5679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class226.anIntArray613[arg0 * 8192 / arg3] >> 1;
		return (arg2 * local16 >> 16) + ((65536 - local16) * arg1 >> 16);
	}
}
