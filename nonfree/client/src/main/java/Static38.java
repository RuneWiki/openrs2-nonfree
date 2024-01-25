import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Lclient!dj;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "[Lclient!wea;")
	public static Class28_Sub1[] aClass28_Sub1Array5;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public static int anInt904;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt905;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V")
	public static void method1026(@OriginalArg(0) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static126.aCanvas6.getGraphics();
			if (Static473.aFont2 == null) {
				Static473.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			@Pc(68) int local68;
			try {
				if (Static174.anImage12 == null) {
					Static174.anImage12 = Static126.aCanvas6.createImage(Static312.anInt5191, Static222.anInt4196);
				}
				@Pc(48) Graphics local48 = Static174.anImage12.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static312.anInt5191, Static222.anInt4196);
				local68 = Static312.anInt5191 / 2 - 152;
				@Pc(74) int local74 = Static222.anInt4196 / 2 - 18;
				local48.setColor(arg4);
				local48.drawRect(local68, local74, 303, 33);
				local48.setColor(arg1);
				local48.fillRect(local68 + 2, local74 + 2, arg3 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local68 + 1, local74 + 1, 301, 31);
				local48.fillRect(local68 + arg3 * 3 + 2, local74 + 2, 300 - arg3 * 3, 30);
				local48.setFont(Static473.aFont2);
				local48.setColor(arg0);
				local48.drawString(arg2, local68 + (304 - arg2.length() * 6) / 2, local74 - -22);
				if (Static424.aString69 != null) {
					local48.setFont(Static473.aFont2);
					local48.setColor(arg0);
					local48.drawString(Static424.aString69, Static312.anInt5191 / 2 - Static424.aString69.length() * 6 / 2, Static222.anInt4196 / 2 + -26);
				}
				local2.drawImage(Static174.anImage12, 0, 0, (ImageObserver) null);
			} catch (@Pc(188) Exception local188) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static312.anInt5191, Static222.anInt4196);
				@Pc(203) int local203 = Static312.anInt5191 / 2 - 152;
				local68 = Static222.anInt4196 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(local203, local68, 303, 33);
				local2.setColor(arg1);
				local2.fillRect(local203 + 2, local68 + 2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local203 + 1, local68 - -1, 301, 31);
				local2.fillRect(local203 + arg3 * 3 + 2, local68 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static473.aFont2);
				local2.setColor(arg0);
				if (Static424.aString69 != null) {
					local2.setFont(Static473.aFont2);
					local2.setColor(arg0);
					local2.drawString(Static424.aString69, Static312.anInt5191 / 2 - Static424.aString69.length() * 6 / 2, Static222.anInt4196 / 2 - 26);
				}
				local2.drawString(arg2, (304 - arg2.length() * 6) / 2 + local203, local68 - -22);
			}
		} catch (@Pc(317) Exception local317) {
			Static126.aCanvas6.repaint();
		}
	}
}
