import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
	public static int anInt4193;

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_7 = new Class262(8, 16);

	@OriginalMember(owner = "client!jga", name = "p", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_20 = new Class63(15, 0, 1, 0);

	@OriginalMember(owner = "client!jga", name = "r", descriptor = "Z")
	public static boolean aBoolean314 = false;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;BLjava/awt/Color;ILjava/awt/Color;)V")
	public static void method3588(@OriginalArg(0) String arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(7) Graphics local7 = Static9.aCanvas1.getGraphics();
			if (Static417.aFont4 == null) {
				Static417.aFont4 = new Font("Helvetica", 1, 13);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(68) int local68;
			try {
				if (Static290.anImage12 == null) {
					Static290.anImage12 = Static9.aCanvas1.createImage(Static172.anInt2621, Static187.anInt8962);
				}
				@Pc(53) Graphics local53 = Static290.anImage12.getGraphics();
				local53.setColor(Color.black);
				local53.fillRect(0, 0, Static172.anInt2621, Static187.anInt8962);
				local68 = Static172.anInt2621 / 2 - 152;
				@Pc(74) int local74 = Static187.anInt8962 / 2 - 18;
				local53.setColor(arg4);
				local53.drawRect(local68, local74, 303, 33);
				local53.setColor(arg1);
				local53.fillRect(local68 + 2, local74 + 2, arg3 * 3, 30);
				local53.setColor(Color.black);
				local53.drawRect(local68 + 1, local74 + 1, 301, 31);
				local53.fillRect(local68 + arg3 * 3 + 2, local74 + 2, 300 - arg3 * 3, 30);
				local53.setFont(Static417.aFont4);
				local53.setColor(arg2);
				local53.drawString(arg0, (304 - arg0.length() * 6) / 2 + local68, local74 + 22);
				if (Static16.aString6 != null) {
					local53.setFont(Static417.aFont4);
					local53.setColor(arg2);
					local53.drawString(Static16.aString6, Static172.anInt2621 / 2 - Static16.aString6.length() * 6 / 2, Static187.anInt8962 / 2 - 26);
				}
				local7.drawImage(Static290.anImage12, 0, 0, null);
			} catch (@Pc(189) Exception local189) {
				local7.setColor(Color.black);
				local7.fillRect(0, 0, Static172.anInt2621, Static187.anInt8962);
				@Pc(204) int local204 = Static172.anInt2621 / 2 - 152;
				local68 = Static187.anInt8962 / 2 - 18;
				local7.setColor(arg4);
				local7.drawRect(local204, local68, 303, 33);
				local7.setColor(arg1);
				local7.fillRect(local204 + 2, local68 + 2, arg3 * 3, 30);
				local7.setColor(Color.black);
				local7.drawRect(local204 + 1, local68 + 1, 301, 31);
				local7.fillRect(local204 + arg3 * 3 + 2, local68 + 2, 300 - arg3 * 3, 30);
				local7.setFont(Static417.aFont4);
				local7.setColor(arg2);
				if (Static16.aString6 != null) {
					local7.setFont(Static417.aFont4);
					local7.setColor(arg2);
					local7.drawString(Static16.aString6, Static172.anInt2621 / 2 - Static16.aString6.length() * 6 / 2, Static187.anInt8962 / 2 + -26);
				}
				local7.drawString(arg0, local204 + (304 - arg0.length() * 6) / 2, local68 - -22);
			}
		} catch (@Pc(319) Exception local319) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IB)Z")
	public static boolean method3590(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
