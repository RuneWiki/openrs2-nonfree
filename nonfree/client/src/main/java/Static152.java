import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!le", name = "J", descriptor = "I")
	public static int anInt2815;

	@OriginalMember(owner = "client!le", name = "zb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!hh;")
	public static Class69 aClass69_12 = new Class69();

	@OriginalMember(owner = "client!le", name = "vb", descriptor = "I")
	public static int anInt2837 = 0;

	@OriginalMember(owner = "client!le", name = "Ab", descriptor = "Lclient!vd;")
	public static Class169 aClass169_1 = new Class169();

	@OriginalMember(owner = "client!le", name = "Cb", descriptor = "Ljava/lang/String;")
	public static String aString98 = "rating: ";

	@OriginalMember(owner = "client!le", name = "Eb", descriptor = "I")
	public static int anInt2841 = 0;

	@OriginalMember(owner = "client!le", name = "Fb", descriptor = "F")
	public static float aFloat81 = 128.0F;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method2348() {
		if (Static72.aClass24_1 != null) {
			Static72.aClass24_1.method2462();
		}
		if (Static159.aClass24_2 != null) {
			Static159.aClass24_2.method2462();
		}
		Static147.method2290(Static99.aBoolean138);
		Static72.aClass24_1 = Static4.method108(Static189.aCanvas1, 22050, Static13.aClass84_3, 0);
		Static72.aClass24_1.method2453(Static93.aClass1_Sub8_Sub4_2);
		Static159.aClass24_2 = Static4.method108(Static189.aCanvas1, 2048, Static13.aClass84_3, 1);
		Static159.aClass24_2.method2453(Static28.aClass1_Sub8_Sub3_1);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static228.method3502(arg6)) {
			Static43.method804(Static86.aClass127ArrayArray1[arg6], -1, arg4, arg2, arg0, arg5, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZILjava/lang/String;Ljava/awt/Color;I)V")
	public static void method2362(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Color arg3) {
		try {
			@Pc(6) Graphics local6 = Static189.aCanvas1.getGraphics();
			if (Static103.aFont1 == null) {
				Static103.aFont1 = new Font("Helvetica", 1, 13);
				Static293.aFontMetrics1 = Static189.aCanvas1.getFontMetrics(Static103.aFont1);
			}
			if (arg0) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static145.anInt2690, Static166.anInt3046);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static108.anImage4 == null) {
					Static108.anImage4 = Static189.aCanvas1.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static108.anImage4.getGraphics();
				local52.setColor(arg3);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg1 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local52.setFont(Static103.aFont1);
				local52.setColor(Color.white);
				local52.drawString(arg2, (304 - Static293.aFontMetrics1.stringWidth(arg2)) / 2, 22);
				local6.drawImage(Static108.anImage4, Static145.anInt2690 / 2 - 152, Static166.anInt3046 / 2 + -18, null);
			} catch (@Pc(133) Exception local133) {
				@Pc(139) int local139 = Static166.anInt3046 / 2 - 18;
				@Pc(145) int local145 = Static145.anInt2690 / 2 - 152;
				local6.setColor(arg3);
				local6.drawRect(local145, local139, 303, 33);
				local6.fillRect(local145 + 2, local139 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local145 + 1, local139 + 1, 301, 31);
				local6.fillRect(local145 + arg1 * 3 + 2, local139 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static103.aFont1);
				local6.setColor(Color.white);
				local6.drawString(arg2, (304 - Static293.aFontMetrics1.stringWidth(arg2)) / 2 + local145, local139 - -22);
			}
			if (Static4.aString4 != null) {
				local6.setFont(Static103.aFont1);
				local6.setColor(Color.white);
				local6.drawString(Static4.aString4, Static145.anInt2690 / 2 - Static293.aFontMetrics1.stringWidth(Static4.aString4) / 2, Static166.anInt3046 / 2 - 26);
			}
		} catch (@Pc(250) Exception local250) {
			Static189.aCanvas1.repaint();
		}
	}
}
