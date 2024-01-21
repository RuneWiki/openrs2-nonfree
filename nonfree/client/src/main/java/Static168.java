import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_8;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public static int anInt2253;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!rf;")
	public static Class70 aClass70_720 = Static49.method1293(" <col=ffff00>");

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_721 = Static49.method1293("null");

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_722 = Static49.method1293("jlv");

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[I")
	public static int[] anIntArray215 = new int[4000];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public static void method1664() {
		aClass70_721 = null;
		anIntArray215 = null;
		aClass70_720 = null;
		aClass70_722 = null;
		aClass1_Sub1_Sub1_Sub4_8 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/awt/Color;Lclient!rf;I)V")
	public static void method1665(@OriginalArg(1) Color arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(10) Graphics local10 = Static24.aCanvas1.getGraphics();
			if (Static20.aFont1 == null) {
				Static20.aFont1 = new Font("Helvetica", 1, 13);
				Static110.aFontMetrics1 = Static24.aCanvas1.getFontMetrics(Static20.aFont1);
			}
			if (Static11.aBoolean16) {
				Static11.aBoolean16 = false;
				local10.setColor(Color.black);
				local10.fillRect(0, 0, Static152.anInt2186, Static5.anInt210);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static142.anImage3 == null) {
					Static142.anImage3 = Static24.aCanvas1.createImage(304, 34);
				}
				@Pc(55) Graphics local55 = Static142.anImage3.getGraphics();
				local55.setColor(arg0);
				local55.drawRect(0, 0, 303, 33);
				local55.fillRect(2, 2, arg2 * 3, 30);
				local55.setColor(Color.black);
				local55.drawRect(1, 1, 301, 31);
				local55.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local55.setFont(Static20.aFont1);
				local55.setColor(Color.white);
				arg1.method2895(22, (304 - arg1.method2913(Static110.aFontMetrics1)) / 2, local55);
				local10.drawImage(Static142.anImage3, Static152.anInt2186 / 2 - 152, Static5.anInt210 / 2 + -18, null);
			} catch (@Pc(132) Exception local132) {
				@Pc(138) int local138 = Static152.anInt2186 / 2 - 152;
				@Pc(144) int local144 = Static5.anInt210 / 2 - 18;
				local10.setColor(arg0);
				local10.drawRect(local138, local144, 303, 33);
				local10.fillRect(local138 + 2, local144 + 2, arg2 * 3, 30);
				local10.setColor(Color.black);
				local10.drawRect(local138 + 1, local144 + 1, 301, 31);
				local10.fillRect(arg2 * 3 + local138 + 2, local144 + 2, 300 - arg2 * 3, 30);
				local10.setFont(Static20.aFont1);
				local10.setColor(Color.white);
				arg1.method2895(local144 + 22, local138 + (-arg1.method2913(Static110.aFontMetrics1) + 304) / 2, local10);
			}
		} catch (@Pc(222) Exception local222) {
			Static24.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Lclient!jf;")
	public static Class1_Sub1_Sub11 method1666() {
		if (Static133.aClass1_Sub1_Sub11_1 == null) {
			Static133.aClass1_Sub1_Sub11_1 = new Class1_Sub1_Sub11();
		}
		return Static133.aClass1_Sub1_Sub11_1;
	}
}
