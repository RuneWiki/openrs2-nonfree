import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "[I")
	public static final int[] anIntArray88 = new int[2];

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(ZI)Z")
	public static boolean method701(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;II)V")
	public static void method702(@OriginalArg(0) Color arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(2) Graphics local2 = Static499.aCanvas9.getGraphics();
			if (Static242.aFont1 == null) {
				Static242.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static383.anImage12 == null) {
					Static383.anImage12 = Static499.aCanvas9.createImage(Static130.anInt2566, Static499.anInt4149);
				}
				@Pc(48) Graphics local48 = Static383.anImage12.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static130.anInt2566, Static499.anInt4149);
				local63 = Static130.anInt2566 / 2 - 152;
				@Pc(69) int local69 = Static499.anInt4149 / 2 - 18;
				local48.setColor(arg3);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg2);
				local48.fillRect(local63 + 2, local69 + 2, arg4 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(arg4 * 3 + local63 + 2, local69 + 2, 300 - arg4 * 3, 30);
				local48.setFont(Static242.aFont1);
				local48.setColor(arg0);
				local48.drawString(arg1, (304 - arg1.length() * 6) / 2 + local63, local69 - -22);
				if (Static410.aString70 != null) {
					local48.setFont(Static242.aFont1);
					local48.setColor(arg0);
					local48.drawString(Static410.aString70, Static130.anInt2566 / 2 - Static410.aString70.length() * 6 / 2, Static499.anInt4149 / 2 + -26);
				}
				local2.drawImage(Static383.anImage12, 0, 0, null);
			} catch (@Pc(182) Exception local182) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static130.anInt2566, Static499.anInt4149);
				@Pc(197) int local197 = Static130.anInt2566 / 2 - 152;
				local63 = Static499.anInt4149 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local197, local63, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local197 + 2, local63 + 2, arg4 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local197 + 1, local63 + 1, 301, 31);
				local2.fillRect(local197 + arg4 * 3 + 2, local63 + 2, 300 - arg4 * 3, 30);
				local2.setFont(Static242.aFont1);
				local2.setColor(arg0);
				if (Static410.aString70 != null) {
					local2.setFont(Static242.aFont1);
					local2.setColor(arg0);
					local2.drawString(Static410.aString70, Static130.anInt2566 / 2 - Static410.aString70.length() * 6 / 2, Static499.anInt4149 / 2 + -26);
				}
				local2.drawString(arg1, local197 + (304 - arg1.length() * 6) / 2, local63 + 22);
			}
		} catch (@Pc(311) Exception local311) {
			Static499.aCanvas9.repaint();
		}
	}
}
