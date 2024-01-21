import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static int anInt1775 = 0;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!lf;")
	private static Class49 aClass49_882 = Static32.method683("Attack");

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "Lclient!lf;")
	private static Class49 aClass49_884 = Static32.method683("Connection timed out)3");

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Lclient!lf;")
	public static Class49 aClass49_883 = aClass49_884;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!lf;")
	public static Class49 aClass49_885 = aClass49_882;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Lclient!lf;")
	public static Class49 aClass49_886 = Static32.method683("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!jf", name = "J", descriptor = "[I")
	public static int[] anIntArray187 = new int[32];

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "Lclient!lf;")
	public static Class49 aClass49_887 = Static32.method683("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Color;ILclient!lf;I)V")
	public static void method1426(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2) {
		try {
			@Pc(2) Graphics local2 = Static5.aCanvas1.getGraphics();
			if (Static22.aFont1 == null) {
				Static22.aFont1 = new Font("Helvetica", 1, 13);
				Static25.aFontMetrics1 = Static5.aCanvas1.getFontMetrics(Static22.aFont1);
			}
			if (Static74.aBoolean68) {
				Static74.aBoolean68 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static121.anInt2515, Static124.anInt2737);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static129.anImage4 == null) {
					Static129.anImage4 = Static5.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static129.anImage4.getGraphics();
				local47.setColor(arg0);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg1 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local47.setFont(Static22.aFont1);
				local47.setColor(Color.white);
				arg2.method1659((304 - arg2.method1655(Static25.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static129.anImage4, Static121.anInt2515 / 2 - 152, Static124.anInt2737 / 2 + -18, null);
			} catch (@Pc(125) Exception local125) {
				@Pc(131) int local131 = Static121.anInt2515 / 2 - 152;
				@Pc(137) int local137 = Static124.anInt2737 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local131, local137, 303, 33);
				local2.fillRect(local131 + 2, local137 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local131 + 1, local137 - -1, 301, 31);
				local2.fillRect(local131 + arg1 * 3 + 2, local137 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static22.aFont1);
				local2.setColor(Color.white);
				arg2.method1659((304 - arg2.method1655(Static25.aFontMetrics1)) / 2 + local131, local137 + 22, local2);
			}
		} catch (@Pc(215) Exception local215) {
			Static5.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
	public static void method1427() {
		aClass49_885 = null;
		aClass49_882 = null;
		anIntArray187 = null;
		aClass49_887 = null;
		aClass49_884 = null;
		aClass49_886 = null;
		aClass49_883 = null;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V")
	public static void method1428() {
		if (Static175.aClass57_4 != null) {
			Static175.aClass57_4.method1892();
		}
	}
}
