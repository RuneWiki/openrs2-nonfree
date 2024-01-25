import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "[I")
	public static final int[] anIntArray574 = new int[32];

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "[I")
	public static final int[] anIntArray575 = new int[32];

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "[Lclient!el;")
	public static Class95[] aClass95Array1 = null;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;BLjava/awt/Color;)V")
	public static void method7483(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static639.aCanvas10.getGraphics();
			if (Static127.aFont1 == null) {
				Static127.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static118.anImage1 == null) {
					Static118.anImage1 = Static639.aCanvas10.createImage(Static81.anInt2497, Static423.anInt7984);
				}
				@Pc(52) Graphics local52 = Static118.anImage1.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static81.anInt2497, Static423.anInt7984);
				local67 = Static81.anInt2497 / 2 - 152;
				@Pc(73) int local73 = Static423.anInt7984 / 2 - 18;
				local52.setColor(arg3);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg1);
				local52.fillRect(local67 + 2, local73 - -2, arg0 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(arg0 * 3 + local67 + 2, local73 + 2, 300 - arg0 * 3, 30);
				local52.setFont(Static127.aFont1);
				local52.setColor(arg4);
				local52.drawString(arg2, local67 + (304 - arg2.length() * 6) / 2, local73 + 22);
				if (Static150.aString93 != null) {
					local52.setFont(Static127.aFont1);
					local52.setColor(arg4);
					local52.drawString(Static150.aString93, Static81.anInt2497 / 2 - Static150.aString93.length() * 6 / 2, Static423.anInt7984 / 2 + -26);
				}
				local6.drawImage(Static118.anImage1, 0, 0, null);
			} catch (@Pc(190) Exception local190) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static81.anInt2497, Static423.anInt7984);
				@Pc(205) int local205 = Static81.anInt2497 / 2 - 152;
				local67 = Static423.anInt7984 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local205, local67, 303, 33);
				local6.setColor(arg1);
				local6.fillRect(local205 + 2, local67 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local205 + 1, local67 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local205 + 2, local67 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static127.aFont1);
				local6.setColor(arg4);
				if (Static150.aString93 != null) {
					local6.setFont(Static127.aFont1);
					local6.setColor(arg4);
					local6.drawString(Static150.aString93, Static81.anInt2497 / 2 - Static150.aString93.length() * 6 / 2, Static423.anInt7984 / 2 - 26);
				}
				local6.drawString(arg2, local205 + (304 - arg2.length() * 6) / 2, local67 + 22);
			}
		} catch (@Pc(320) Exception local320) {
			Static639.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
	public static int method7485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static98.aByteArrayArray6 == null ? 0 : Static98.aByteArrayArray6[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
	public static void method7487(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 10);
		local8.method3093();
	}
}
