import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_711 = Static69.method1231("Clientscript error in: ");

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_712 = Static69.method1231("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_713 = Static69.method1231("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_714 = Static69.method1231("sch-Utteln:");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method942() {
		aClass40_711 = null;
		aClass40_712 = null;
		aClass40_714 = null;
		aClass40_713 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!je;Ljava/awt/Color;B)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Color arg2) {
		try {
			@Pc(2) Graphics local2 = Static80.aCanvas1.getGraphics();
			if (Static60.aFont1 == null) {
				Static60.aFont1 = new Font("Helvetica", 1, 13);
				Static37.aFontMetrics1 = Static80.aCanvas1.getFontMetrics(Static60.aFont1);
			}
			if (Static7.aBoolean20) {
				Static7.aBoolean20 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static88.anInt2284, Static13.anInt237);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static85.anImage3 == null) {
					Static85.anImage3 = Static80.aCanvas1.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static85.anImage3.getGraphics();
				local52.setColor(arg2);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg0 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local52.setFont(Static60.aFont1);
				local52.setColor(Color.white);
				arg1.method954(22, (304 - arg1.method966(Static37.aFontMetrics1)) / 2, local52);
				local2.drawImage(Static85.anImage3, Static88.anInt2284 / 2 - 152, Static13.anInt237 / 2 - 18, null);
			} catch (@Pc(130) Exception local130) {
				@Pc(136) int local136 = Static88.anInt2284 / 2 - 152;
				@Pc(142) int local142 = Static13.anInt237 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local136, local142, 303, 33);
				local2.fillRect(local136 + 2, local142 - -2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local136 + 1, local142 - -1, 301, 31);
				local2.fillRect(local136 + arg0 * 3 + 2, local142 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static60.aFont1);
				local2.setColor(Color.white);
				arg1.method954(local142 + 22, (-arg1.method966(Static37.aFontMetrics1) + 304) / 2 + local136, local2);
			}
		} catch (@Pc(220) Exception local220) {
			Static80.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BB)[B")
	public static byte[] method944(@OriginalArg(0) byte[] arg0) {
		@Pc(10) int local10 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local10];
		Static141.method1907(arg0, 0, local17, 0, local10);
		return local17;
	}
}
