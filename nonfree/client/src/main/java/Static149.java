import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!gi;")
	public static Class39 aClass39_3;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!eh;")
	public static Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_929 = Static184.method2923("(U2");

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!i;")
	private static Class41 aClass41_931 = Static184.method2923("The server is being updated)3");

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_930 = aClass41_931;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public static int anInt3379 = -1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[Lclient!ia;")
	public static Class42[] aClass42Array1 = new Class42[4];

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_932 = Static184.method2923("<img=0>");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lclient!i;I)Lclient!i;")
	public static Class41 method2324(@OriginalArg(0) Class41[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static148.method2317(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Color;Lclient!i;ZI)V")
	public static void method2326(@OriginalArg(1) Color arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(2) Graphics local2 = Static139.aCanvas1.getGraphics();
			if (Static14.aFont1 == null) {
				Static14.aFont1 = new Font("Helvetica", 1, 13);
				Static177.aFontMetrics1 = Static139.aCanvas1.getFontMetrics(Static14.aFont1);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static197.anInt4442, Static130.anInt3906);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static128.anImage4 == null) {
					Static128.anImage4 = Static139.aCanvas1.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static128.anImage4.getGraphics();
				local45.setColor(arg0);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg3 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local45.setFont(Static14.aFont1);
				local45.setColor(Color.white);
				arg1.method1409((304 - arg1.method1398(Static177.aFontMetrics1)) / 2, 22, local45);
				local2.drawImage(Static128.anImage4, Static197.anInt4442 / 2 - 152, Static130.anInt3906 / 2 + -18, null);
			} catch (@Pc(127) Exception local127) {
				@Pc(133) int local133 = Static197.anInt4442 / 2 - 152;
				@Pc(139) int local139 = Static130.anInt3906 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local133, local139, 303, 33);
				local2.fillRect(local133 + 2, local139 + 2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local133 + 1, local139 + 1, 301, 31);
				local2.fillRect(arg3 * 3 + local133 + 2, local139 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static14.aFont1);
				local2.setColor(Color.white);
				arg1.method1409(local133 + (304 - arg1.method1398(Static177.aFontMetrics1)) / 2, local139 + 22, local2);
			}
			if (Static132.aClass41_846 != null) {
				local2.setFont(Static14.aFont1);
				local2.setColor(Color.white);
				Static132.aClass41_846.method1409(Static197.anInt4442 / 2 - Static132.aClass41_846.method1398(Static177.aFontMetrics1) / 2, Static130.anInt3906 / 2 + -26, local2);
			}
		} catch (@Pc(245) Exception local245) {
			Static139.aCanvas1.repaint();
		}
	}
}
