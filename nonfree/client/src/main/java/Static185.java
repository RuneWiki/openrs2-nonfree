import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
	public static int anInt3720;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "Lclient!bo;")
	public static Class24 aClass24_21 = new Class24();

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
	public static int anInt3729 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILjava/awt/Color;Ljava/lang/String;Z)V")
	public static void method3037(@OriginalArg(0) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		try {
			@Pc(2) Graphics local2 = Static304.aCanvas1.getGraphics();
			if (Static263.aFont1 == null) {
				Static263.aFont1 = new Font("Helvetica", 1, 13);
				Static253.aFontMetrics3 = Static304.aCanvas1.getFontMetrics(Static263.aFont1);
			}
			if (arg3) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static159.anInt3348, Static136.anInt2696);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static307.anImage4 == null) {
					Static307.anImage4 = Static304.aCanvas1.createImage(304, 34);
				}
				@Pc(46) Graphics local46 = Static307.anImage4.getGraphics();
				local46.setColor(arg1);
				local46.drawRect(0, 0, 303, 33);
				local46.fillRect(2, 2, arg0 * 3, 30);
				local46.setColor(Color.black);
				local46.drawRect(1, 1, 301, 31);
				local46.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local46.setFont(Static263.aFont1);
				local46.setColor(Color.white);
				local46.drawString(arg2, (304 - Static253.aFontMetrics3.stringWidth(arg2)) / 2, 22);
				local2.drawImage(Static307.anImage4, Static159.anInt3348 / 2 - 152, Static136.anInt2696 / 2 + -18, null);
			} catch (@Pc(122) Exception local122) {
				@Pc(128) int local128 = Static159.anInt3348 / 2 - 152;
				@Pc(134) int local134 = Static136.anInt2696 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local128, local134, 303, 33);
				local2.fillRect(local128 + 2, local134 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local128 + 1, local134 + 1, 301, 31);
				local2.fillRect(local128 + arg0 * 3 + 2, local134 - -2, 300 - arg0 * 3, 30);
				local2.setFont(Static263.aFont1);
				local2.setColor(Color.white);
				local2.drawString(arg2, local128 + (304 - Static253.aFontMetrics3.stringWidth(arg2)) / 2, local134 + 22);
			}
			if (Static105.aString78 != null) {
				local2.setFont(Static263.aFont1);
				local2.setColor(Color.white);
				local2.drawString(Static105.aString78, Static159.anInt3348 / 2 - Static253.aFontMetrics3.stringWidth(Static105.aString78) / 2, Static136.anInt2696 / 2 + -26);
			}
		} catch (@Pc(239) Exception local239) {
			Static304.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)I")
	public static int method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static121.method1947(arg1 + 91923, arg0 + 45365, 4) + (Static121.method1947(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static121.method1947(arg1, arg0, 1) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
