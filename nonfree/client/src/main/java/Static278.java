import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!iq;")
	public static Class104 aClass104_146;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
	public static boolean aBoolean498 = true;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ZZ)V")
	public static void method4773(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(6) Graphics local6 = Static95.aCanvas3.getGraphics();
			if (Static309.aFont1 == null) {
				Static309.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static335.anInt6496, Static25.anInt396);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static263.anImage3 == null) {
					Static263.anImage3 = Static95.aCanvas3.createImage(304, 34);
				}
				@Pc(68) Graphics local68 = Static263.anImage3.getGraphics();
				local68.setColor(arg3);
				local68.drawRect(0, 0, 303, 33);
				local68.setColor(arg0);
				local68.fillRect(2, 2, arg2 * 3, 30);
				local68.setColor(Color.black);
				local68.drawRect(1, 1, 301, 31);
				local68.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local68.setFont(Static309.aFont1);
				local68.setColor(arg1);
				local68.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static263.anImage3, Static335.anInt6496 / 2 - 152, Static25.anInt396 / 2 + -18, null);
			} catch (@Pc(149) Exception local149) {
				@Pc(155) int local155 = Static335.anInt6496 / 2 - 152;
				@Pc(161) int local161 = Static25.anInt396 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local155 + 2, local161 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local155 + 1, local161 + 1, 301, 31);
				local6.fillRect(arg2 * 3 + local155 + 2, local161 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static309.aFont1);
				local6.setColor(arg1);
				local6.drawString(arg4, (304 - arg4.length() * 6) / 2 + local155, local161 + 22);
			}
			if (Static270.aString53 != null) {
				local6.setFont(Static309.aFont1);
				local6.setColor(arg1);
				local6.drawString(Static270.aString53, Static335.anInt6496 / 2 - Static270.aString53.length() * 6 / 2, Static25.anInt396 / 2 + -26);
			}
		} catch (@Pc(267) Exception local267) {
			Static95.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method4774(@OriginalArg(1) Class104 arg0) {
		Static344.anInt6693 = arg0.method2769("p11_full");
		Static213.anInt4642 = arg0.method2769("p12_full");
		Static313.anInt6151 = arg0.method2769("b12_full");
		Static128.anInt2761 = arg0.method2769("hitmarks");
		Static224.anInt6535 = arg0.method2769("hitbar_default");
		Static160.anInt3748 = arg0.method2769("timerbar_default");
		Static275.anInt5639 = arg0.method2769("headicons_pk");
		Static108.anInt2250 = arg0.method2769("headicons_prayer");
		Static123.anInt2609 = arg0.method2769("hint_headicons");
		Static9.anInt175 = arg0.method2769("hint_mapmarkers");
		Static74.anInt3608 = arg0.method2769("mapflag");
		Static152.anInt3474 = arg0.method2769("cross");
		Static121.anInt2556 = arg0.method2769("mapdots");
		Static101.anInt2079 = arg0.method2769("scrollbar");
		Static133.anInt2846 = arg0.method2769("name_icons");
		Static36.anInt552 = arg0.method2769("floorshadows");
		Static300.anInt5976 = arg0.method2769("compass");
		Static162.anInt3756 = arg0.method2769("otherlevel");
		Static112.anInt2360 = arg0.method2769("hint_mapedge");
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
	public static void method4776() {
		Static34.aClass107_1.method3011(5);
	}
}
