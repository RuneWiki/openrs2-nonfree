import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "o", descriptor = "I")
	public static int anInt329;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "I")
	public static int anInt317 = 0;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "I")
	public static int anInt319 = 0;

	@OriginalMember(owner = "client!at", name = "e", descriptor = "I")
	public static int anInt321 = 0;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "F")
	public static float aFloat1 = 1024.0F;

	@OriginalMember(owner = "client!at", name = "t", descriptor = "[I")
	public static final int[] anIntArray32 = new int[4];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)I")
	public static int method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static230.anIntArray726[arg0 & 0x3] : Static113.anIntArray257[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Z)V")
	public static void method208(@OriginalArg(0) String arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(6) Graphics local6 = Static177.aCanvas3.getGraphics();
			if (Static202.aFont1 == null) {
				Static202.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static136.anInt6304, Static218.anInt3871);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			try {
				if (Static335.anImage2 == null) {
					Static335.anImage2 = Static177.aCanvas3.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static335.anImage2.getGraphics();
				local63.setColor(arg2);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg1);
				local63.fillRect(2, 2, arg3 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local63.setFont(Static202.aFont1);
				local63.setColor(arg4);
				local63.drawString(arg0, (304 - arg0.length() * 6) / 2, 22);
				local6.drawImage(Static335.anImage2, Static136.anInt6304 / 2 - 152, Static218.anInt3871 / 2 + -18, null);
			} catch (@Pc(153) Exception local153) {
				@Pc(159) int local159 = Static136.anInt6304 / 2 - 152;
				@Pc(165) int local165 = Static218.anInt3871 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg1);
				local6.fillRect(local159 + 2, local165 + 2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local159 + 1, local165 - -1, 301, 31);
				local6.fillRect(arg3 * 3 + local159 + 2, local165 - -2, 300 - arg3 * 3, 30);
				local6.setFont(Static202.aFont1);
				local6.setColor(arg4);
				local6.drawString(arg0, local159 + (304 - arg0.length() * 6) / 2, local165 - -22);
			}
			if (Static176.aString32 != null) {
				local6.setFont(Static202.aFont1);
				local6.setColor(arg4);
				local6.drawString(Static176.aString32, Static136.anInt6304 / 2 - Static176.aString32.length() * 6 / 2, Static218.anInt3871 / 2 + -26);
			}
		} catch (@Pc(273) Exception local273) {
			Static177.aCanvas3.repaint();
		}
	}
}
