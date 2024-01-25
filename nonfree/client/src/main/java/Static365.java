import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!si", name = "E", descriptor = "I")
	public static int anInt6176;

	@OriginalMember(owner = "client!si", name = "J", descriptor = "Lclient!um;")
	public static Class244 aClass244_8;

	@OriginalMember(owner = "client!si", name = "K", descriptor = "I")
	public static int anInt6180;

	@OriginalMember(owner = "client!si", name = "L", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/lang/String;II)V")
	public static void method4743(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(6) Graphics local6 = Static226.aCanvas9.getGraphics();
			if (Static288.aFont1 == null) {
				Static288.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static126.anInt2202, Static92.anInt1618);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static315.anImage2 == null) {
					Static315.anImage2 = Static226.aCanvas9.createImage(304, 34);
				}
				@Pc(67) Graphics local67 = Static315.anImage2.getGraphics();
				local67.setColor(arg0);
				local67.drawRect(0, 0, 303, 33);
				local67.setColor(arg2);
				local67.fillRect(2, 2, arg5 * 3, 30);
				local67.setColor(Color.black);
				local67.drawRect(1, 1, 301, 31);
				local67.fillRect(arg5 * 3 + 2, 2, 300 - arg5 * 3, 30);
				local67.setFont(Static288.aFont1);
				local67.setColor(arg1);
				local67.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static315.anImage2, Static126.anInt2202 / 2 - 152, Static92.anInt1618 / 2 - 18, null);
			} catch (@Pc(146) Exception local146) {
				@Pc(152) int local152 = Static126.anInt2202 / 2 - 152;
				@Pc(158) int local158 = Static92.anInt1618 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local152 + 2, local158 + 2, arg5 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local152 + 1, local158 + 1, 301, 31);
				local6.fillRect(arg5 * 3 + local152 + 2, local158 + 2, 300 - arg5 * 3, 30);
				local6.setFont(Static288.aFont1);
				local6.setColor(arg1);
				local6.drawString(arg4, (304 - arg4.length() * 6) / 2 + local152, local158 - -22);
			}
			if (Static436.aString67 != null) {
				local6.setFont(Static288.aFont1);
				local6.setColor(arg1);
				local6.drawString(Static436.aString67, Static126.anInt2202 / 2 - Static436.aString67.length() * 6 / 2, Static92.anInt1618 / 2 + -26);
			}
		} catch (@Pc(265) Exception local265) {
			Static226.aCanvas9.repaint();
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I")
	public static int method4744() {
		return 2;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIBIIII)V")
	public static void method4745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static271.anInt4271 <= arg1 - arg3 && arg1 + arg3 <= Static13.anInt263 && arg0 - arg3 >= Static74.anInt1413 && Static149.anInt7384 >= arg3 + arg0) {
			Static274.method3488(arg0, arg2, arg3, arg4, arg5, arg1);
		} else {
			Static78.method1213(arg3, arg5, arg1, arg4, arg2, arg0);
		}
	}
}
