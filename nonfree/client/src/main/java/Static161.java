import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "Lclient!ba;")
	public static Class11 aClass11_15 = null;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "Lclient!ba;")
	public static Class11 aClass11_16 = null;

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "[I")
	public static final int[] anIntArray295 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2533(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static216.method2200(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!vd;IBLjava/awt/Color;Z)V")
	public static void method2534(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) boolean arg3) {
		try {
			@Pc(9) Graphics local9 = Static119.aCanvas1.getGraphics();
			if (Static62.aFont1 == null) {
				Static62.aFont1 = new Font("Helvetica", 1, 13);
				Static129.aFontMetrics1 = Static119.aCanvas1.getFontMetrics(Static62.aFont1);
			}
			if (arg3) {
				local9.setColor(Color.black);
				local9.fillRect(0, 0, Static63.anInt3568, Static111.anInt2396);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static11.anImage1 == null) {
					Static11.anImage1 = Static119.aCanvas1.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static11.anImage1.getGraphics();
				local52.setColor(arg2);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg1 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local52.setFont(Static62.aFont1);
				local52.setColor(Color.white);
				arg0.method3222((304 - arg0.method3199(Static129.aFontMetrics1)) / 2, local52, 22);
				local9.drawImage(Static11.anImage1, Static63.anInt3568 / 2 - 152, Static111.anInt2396 / 2 + -18, null);
			} catch (@Pc(130) Exception local130) {
				@Pc(136) int local136 = Static63.anInt3568 / 2 - 152;
				@Pc(142) int local142 = Static111.anInt2396 / 2 - 18;
				local9.setColor(arg2);
				local9.drawRect(local136, local142, 303, 33);
				local9.fillRect(local136 + 2, local142 + 2, arg1 * 3, 30);
				local9.setColor(Color.black);
				local9.drawRect(local136 + 1, local142 - -1, 301, 31);
				local9.fillRect(arg1 * 3 + local136 + 2, local142 + 2, 300 - arg1 * 3, 30);
				local9.setFont(Static62.aFont1);
				local9.setColor(Color.white);
				arg0.method3222(local136 + (304 - arg0.method3199(Static129.aFontMetrics1)) / 2, local9, local142 + 22);
			}
		} catch (@Pc(221) Exception local221) {
			Static119.aCanvas1.repaint();
		}
	}
}
