import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "[I")
	public static int[] anIntArray178 = new int[2000];

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "Lclient!tg;")
	private static Class81 aClass81_650 = Static120.method2057("Unable to connect)3");

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_648 = aClass81_650;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_649 = aClass81_650;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public static int anInt1888 = 0;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Lclient!rh;")
	public static Class77 aClass77_11 = null;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!tg;Ljava/awt/Color;)V")
	public static void method1389(@OriginalArg(0) int arg0, @OriginalArg(2) Class81 arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(6) Graphics local6 = Static114.aCanvas3.getGraphics();
			if (Static54.aFont1 == null) {
				Static54.aFont1 = new Font("Helvetica", 1, 13);
				Static149.aFontMetrics1 = Static114.aCanvas3.getFontMetrics(Static54.aFont1);
			}
			if (Static139.aBoolean119) {
				Static139.aBoolean119 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static162.anInt3715, Static3.anInt112);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static12.anImage44 == null) {
					Static12.anImage44 = Static114.aCanvas3.createImage(304, 34);
				}
				@Pc(56) Graphics local56 = Static12.anImage44.getGraphics();
				local56.setColor(arg2);
				local56.drawRect(0, 0, 303, 33);
				local56.fillRect(2, 2, arg0 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(1, 1, 301, 31);
				local56.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local56.setFont(Static54.aFont1);
				local56.setColor(Color.white);
				arg1.method2819(local56, 22, (304 - arg1.method2804(Static149.aFontMetrics1)) / 2);
				local6.drawImage(Static12.anImage44, Static162.anInt3715 / 2 - 152, Static3.anInt112 / 2 + -18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static162.anInt3715 / 2 - 152;
				@Pc(146) int local146 = Static3.anInt112 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local140, local146, 303, 33);
				local6.fillRect(local140 + 2, local146 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local140 + 1, local146 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local140 + 2, local146 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static54.aFont1);
				local6.setColor(Color.white);
				arg1.method2819(local6, local146 + 22, local140 + (304 - arg1.method2804(Static149.aFontMetrics1)) / 2);
			}
		} catch (@Pc(224) Exception local224) {
			Static114.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Z")
	public static boolean method1390(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!vb;III)Z")
	public static boolean method1391(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2942(arg1, arg2);
		if (local5 == null) {
			return false;
		} else {
			Static67.method1206(local5);
			return true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method1392() {
		aClass81_648 = null;
		aClass81_650 = null;
		aClass77_11 = null;
		aClass81_649 = null;
		anIntArray178 = null;
	}
}
