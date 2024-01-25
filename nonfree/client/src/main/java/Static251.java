import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!iga", name = "y", descriptor = "I")
	public static int anInt4685;

	@OriginalMember(owner = "client!iga", name = "z", descriptor = "Lclient!gj;")
	public static Class143 aClass143_60;

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
	public static int anInt4680 = 104;

	@OriginalMember(owner = "client!iga", name = "q", descriptor = "I")
	public static int anInt4681 = 1;

	@OriginalMember(owner = "client!iga", name = "E", descriptor = "I")
	public static int anInt4687 = -1;

	@OriginalMember(owner = "client!iga", name = "G", descriptor = "I")
	public static int anInt4688 = -1;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;I)V")
	public static void method3971(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static469.aCanvas11.getGraphics();
			if (Static502.aFont1 == null) {
				Static502.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(68) int local68;
			try {
				if (Static582.anImage3 == null) {
					Static582.anImage3 = Static469.aCanvas11.createImage(Static654.anInt10064, Static483.anInt8181);
				}
				@Pc(53) Graphics local53 = Static582.anImage3.getGraphics();
				local53.setColor(Color.black);
				local53.fillRect(0, 0, Static654.anInt10064, Static483.anInt8181);
				local68 = Static654.anInt10064 / 2 - 152;
				@Pc(74) int local74 = Static483.anInt8181 / 2 - 18;
				local53.setColor(arg1);
				local53.drawRect(local68, local74, 303, 33);
				local53.setColor(arg4);
				local53.fillRect(local68 + 2, local74 + 2, arg0 * 3, 30);
				local53.setColor(Color.black);
				local53.drawRect(local68 + 1, local74 + 1, 301, 31);
				local53.fillRect(arg0 * 3 + local68 + 2, local74 - -2, 300 - arg0 * 3, 30);
				local53.setFont(Static502.aFont1);
				local53.setColor(arg2);
				local53.drawString(arg3, local68 + (304 - arg3.length() * 6) / 2, local74 + 22);
				if (Static471.aString127 != null) {
					local53.setFont(Static502.aFont1);
					local53.setColor(arg2);
					local53.drawString(Static471.aString127, Static654.anInt10064 / 2 - Static471.aString127.length() * 6 / 2, Static483.anInt8181 / 2 + -26);
				}
				local2.drawImage(Static582.anImage3, 0, 0, (ImageObserver) null);
			} catch (@Pc(190) Exception local190) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static654.anInt10064, Static483.anInt8181);
				@Pc(205) int local205 = Static654.anInt10064 / 2 - 152;
				local68 = Static483.anInt8181 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local205, local68, 303, 33);
				local2.setColor(arg4);
				local2.fillRect(local205 + 2, local68 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local205 + 1, local68 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local205 + 2, local68 - -2, 300 - arg0 * 3, 30);
				local2.setFont(Static502.aFont1);
				local2.setColor(arg2);
				if (Static471.aString127 != null) {
					local2.setFont(Static502.aFont1);
					local2.setColor(arg2);
					local2.drawString(Static471.aString127, Static654.anInt10064 / 2 - Static471.aString127.length() * 6 / 2, Static483.anInt8181 / 2 + -26);
				}
				local2.drawString(arg3, local205 + (304 - arg3.length() * 6) / 2, local68 + 22);
			}
		} catch (@Pc(320) Exception local320) {
			Static469.aCanvas11.repaint();
		}
	}
}
