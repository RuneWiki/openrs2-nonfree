import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!sb", name = "Qg", descriptor = "I")
	public static int anInt8390;

	@OriginalMember(owner = "client!sb", name = "fh", descriptor = "Lclient!tfa;")
	public static Class335 aClass335_1;

	@OriginalMember(owner = "client!sb", name = "kh", descriptor = "I")
	public static int anInt8408;

	@OriginalMember(owner = "client!sb", name = "Hi", descriptor = "I")
	public static int anInt8477;

	@OriginalMember(owner = "client!sb", name = "ih", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!sb", name = "zh", descriptor = "I")
	public static int anInt8422 = 16777215;

	@OriginalMember(owner = "client!sb", name = "Ph", descriptor = "Z")
	public static boolean aBoolean635 = true;

	@OriginalMember(owner = "client!sb", name = "ti", descriptor = "I")
	public static int anInt8466 = -1;

	@OriginalMember(owner = "client!sb", name = "ui", descriptor = "I")
	public static int anInt8467 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;IILjava/awt/Color;Ljava/awt/Color;)V")
	public static void method7151(@OriginalArg(0) Color arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static504.aCanvas11.getGraphics();
			if (Static469.aFont2 == null) {
				Static469.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static3.anImage17 == null) {
					Static3.anImage17 = Static504.aCanvas11.createImage(Static511.anInt8548, Static153.anInt2747);
				}
				@Pc(48) Graphics local48 = Static3.anImage17.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static511.anInt8548, Static153.anInt2747);
				local63 = Static511.anInt8548 / 2 - 152;
				@Pc(69) int local69 = Static153.anInt2747 / 2 - 18;
				local48.setColor(arg0);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg4);
				local48.fillRect(local63 + 2, local69 + 2, arg2 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(local63 + arg2 * 3 + 2, local69 - -2, 300 - arg2 * 3, 30);
				local48.setFont(Static469.aFont2);
				local48.setColor(arg3);
				local48.drawString(arg1, (304 - arg1.length() * 6) / 2 + local63, local69 - -22);
				if (Static367.aString75 != null) {
					local48.setFont(Static469.aFont2);
					local48.setColor(arg3);
					local48.drawString(Static367.aString75, Static511.anInt8548 / 2 - Static367.aString75.length() * 6 / 2, Static153.anInt2747 / 2 + -26);
				}
				local2.drawImage(Static3.anImage17, 0, 0, null);
			} catch (@Pc(183) Exception local183) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static511.anInt8548, Static153.anInt2747);
				@Pc(198) int local198 = Static511.anInt8548 / 2 - 152;
				local63 = Static153.anInt2747 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local198, local63, 303, 33);
				local2.setColor(arg4);
				local2.fillRect(local198 + 2, local63 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local198 + 1, local63 + 1, 301, 31);
				local2.fillRect(local198 + arg2 * 3 + 2, local63 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static469.aFont2);
				local2.setColor(arg3);
				if (Static367.aString75 != null) {
					local2.setFont(Static469.aFont2);
					local2.setColor(arg3);
					local2.drawString(Static367.aString75, Static511.anInt8548 / 2 - Static367.aString75.length() * 6 / 2, Static153.anInt2747 / 2 + -26);
				}
				local2.drawString(arg1, local198 + (304 - arg1.length() * 6) / 2, local63 + 22);
			}
		} catch (@Pc(313) Exception local313) {
			Static504.aCanvas11.repaint();
		}
	}
}
