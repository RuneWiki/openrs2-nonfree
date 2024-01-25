import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!sea", name = "O", descriptor = "[I")
	public static int[] anIntArray499;

	@OriginalMember(owner = "client!sea", name = "Q", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/awt/Color;IILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V")
	public static void method6587(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(6) Graphics local6 = Static129.aCanvas6.getGraphics();
			if (Static145.aFont1 == null) {
				Static145.aFont1 = new Font("Helvetica", 1, 13);
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
			@Pc(67) int local67;
			try {
				if (Static355.anImage3 == null) {
					Static355.anImage3 = Static129.aCanvas6.createImage(Static34.anInt3201, Static492.anInt8445);
				}
				@Pc(52) Graphics local52 = Static355.anImage3.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static34.anInt3201, Static492.anInt8445);
				local67 = Static34.anInt3201 / 2 - 152;
				@Pc(73) int local73 = Static492.anInt8445 / 2 - 18;
				local52.setColor(arg2);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg0);
				local52.fillRect(local67 + 2, local73 - -2, arg1 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(arg1 * 3 + local67 + 2, local73 + 2, 300 - arg1 * 3, 30);
				local52.setFont(Static145.aFont1);
				local52.setColor(arg3);
				local52.drawString(arg4, local67 + (304 - arg4.length() * 6) / 2, local73 - -22);
				if (Static591.aString266 != null) {
					local52.setFont(Static145.aFont1);
					local52.setColor(arg3);
					local52.drawString(Static591.aString266, Static34.anInt3201 / 2 - Static591.aString266.length() * 6 / 2, Static492.anInt8445 / 2 - 26);
				}
				local6.drawImage(Static355.anImage3, 0, 0, null);
			} catch (@Pc(192) Exception local192) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static34.anInt3201, Static492.anInt8445);
				@Pc(207) int local207 = Static34.anInt3201 / 2 - 152;
				local67 = Static492.anInt8445 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local207, local67, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local207 + 2, local67 - -2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local207 + 1, local67 + 1, 301, 31);
				local6.fillRect(arg1 * 3 + local207 + 2, local67 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static145.aFont1);
				local6.setColor(arg3);
				if (Static591.aString266 != null) {
					local6.setFont(Static145.aFont1);
					local6.setColor(arg3);
					local6.drawString(Static591.aString266, Static34.anInt3201 / 2 - Static591.aString266.length() * 6 / 2, Static492.anInt8445 / 2 + -26);
				}
				local6.drawString(arg4, local207 + (304 - arg4.length() * 6) / 2, local67 + 22);
			}
		} catch (@Pc(318) Exception local318) {
			Static129.aCanvas6.repaint();
		}
	}
}
