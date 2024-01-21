import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
	public static int anInt4104;

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1616 = Static120.method1824("<img=0>");

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	public static int anInt4111 = 0;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1617 = Static120.method1824("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Color;Lclient!rd;I)V")
	public static void method2938(@OriginalArg(1) Color arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Graphics local6 = Static146.aCanvas1.getGraphics();
			if (Static77.aFont3 == null) {
				Static77.aFont3 = new Font("Helvetica", 1, 13);
				Static54.aFontMetrics1 = Static146.aCanvas1.getFontMetrics(Static77.aFont3);
			}
			if (Static180.aBoolean158) {
				Static180.aBoolean158 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static182.anInt4068, Static86.anInt1783);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static112.anImage4 == null) {
					Static112.anImage4 = Static146.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static112.anImage4.getGraphics();
				local51.setColor(arg0);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg2 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local51.setFont(Static77.aFont3);
				local51.setColor(Color.white);
				arg1.method2452(22, (304 - arg1.method2443(Static54.aFontMetrics1)) / 2, local51);
				local6.drawImage(Static112.anImage4, Static182.anInt4068 / 2 - 152, Static86.anInt1783 / 2 - 18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static182.anInt4068 / 2 - 152;
				@Pc(141) int local141 = Static86.anInt1783 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local135, local141, 303, 33);
				local6.fillRect(local135 + 2, local141 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local135 + 1, local141 + 1, 301, 31);
				local6.fillRect(local135 + arg2 * 3 + 2, local141 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static77.aFont3);
				local6.setColor(Color.white);
				arg1.method2452(local141 + 22, (-arg1.method2443(Static54.aFontMetrics1) + 304) / 2 + local135, local6);
			}
		} catch (@Pc(220) Exception local220) {
			Static146.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)I")
	public static int method2946(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Z")
	public static boolean method2952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(24) Class3_Sub1_Sub1 local24 = Static162.method2627(arg1);
		return local24.method111(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
	public static int method2955(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
