import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	public static int anInt4521;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "Lclient!bh;")
	public static Class15 aClass15_8;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!dh;")
	public static Class33 aClass33_34 = new Class33(64);

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
	public static int anInt4523 = 0;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	public static int anInt4525 = 0;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!an;")
	public static Class10 aClass10_47 = new Class10();

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray21 = new boolean[5];

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "[S")
	public static short[] aShortArray76 = new short[256];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)I")
	public static int method3626(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static160.method2501(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void method3627() {
		aClass10_47 = null;
		aBooleanArray21 = null;
		aBooleanArray22 = null;
		aShortArray76 = null;
		anIntArrayArrayArray12 = null;
		aClass33_34 = null;
		aClass15_8 = null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;IILjava/awt/Color;Z)V")
	public static void method3628(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) boolean arg3) {
		try {
			@Pc(9) Graphics local9 = Static235.aCanvas1.getGraphics();
			if (Static118.aFont1 == null) {
				Static118.aFont1 = new Font("Helvetica", 1, 13);
				Static169.aFontMetrics1 = Static235.aCanvas1.getFontMetrics(Static118.aFont1);
			}
			if (arg3) {
				local9.setColor(Color.black);
				local9.fillRect(0, 0, Static111.anInt2450, Static216.anInt4287);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static76.anImage1 == null) {
					Static76.anImage1 = Static235.aCanvas1.createImage(304, 34);
				}
				@Pc(56) Graphics local56 = Static76.anImage1.getGraphics();
				local56.setColor(arg2);
				local56.drawRect(0, 0, 303, 33);
				local56.fillRect(2, 2, arg1 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(1, 1, 301, 31);
				local56.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local56.setFont(Static118.aFont1);
				local56.setColor(Color.white);
				local56.drawString(arg0, (304 - Static169.aFontMetrics1.stringWidth(arg0)) / 2, 22);
				local9.drawImage(Static76.anImage1, Static111.anInt2450 / 2 - 152, Static216.anInt4287 / 2 - 18, null);
			} catch (@Pc(131) Exception local131) {
				@Pc(137) int local137 = Static111.anInt2450 / 2 - 152;
				@Pc(143) int local143 = Static216.anInt4287 / 2 - 18;
				local9.setColor(arg2);
				local9.drawRect(local137, local143, 303, 33);
				local9.fillRect(local137 + 2, local143 + 2, arg1 * 3, 30);
				local9.setColor(Color.black);
				local9.drawRect(local137 + 1, local143 - -1, 301, 31);
				local9.fillRect(arg1 * 3 + local137 + 2, local143 + 2, 300 - arg1 * 3, 30);
				local9.setFont(Static118.aFont1);
				local9.setColor(Color.white);
				local9.drawString(arg0, local137 + (304 - Static169.aFontMetrics1.stringWidth(arg0)) / 2, local143 + 22);
			}
			if (Static184.aString121 != null) {
				local9.setFont(Static118.aFont1);
				local9.setColor(Color.white);
				local9.drawString(Static184.aString121, Static111.anInt2450 / 2 - Static169.aFontMetrics1.stringWidth(Static184.aString121) / 2, Static216.anInt4287 / 2 + -26);
			}
		} catch (@Pc(248) Exception local248) {
			Static235.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIZI)V")
	public static void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static246.anInt5549 = arg2;
		Static261.anInt4962 = arg0;
		Static120.anInt2636 = arg5;
		Static27.anInt1300 = arg1;
		Static57.anInt1128 = arg3;
		if (arg4 && Static261.anInt4962 >= 100) {
			Static211.anInt4210 = Static27.anInt1300 * 128 + 64;
			Static149.anInt3032 = Static246.anInt5549 * 128 + 64;
			Static160.anInt3185 = Static96.method1559(Static210.anInt4103, Static211.anInt4210, Static149.anInt3032) - Static120.anInt2636;
		}
		Static239.anInt4616 = 2;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIIII)V")
	public static void method3630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static150.anInt3043 == 0 || arg1 == 0 || Static7.anInt173 >= 50 || arg0 == -1) {
			return;
		}
		Static92.anIntArray205[Static7.anInt173] = arg0;
		Static66.anIntArray137[Static7.anInt173] = arg1;
		Static262.anIntArray440[Static7.anInt173] = arg3;
		Static211.aClass60Array1[Static7.anInt173] = null;
		Static200.anIntArray336[Static7.anInt173] = 0;
		Static10.anIntArray23[Static7.anInt173] = arg2;
		Static7.anInt173++;
	}
}
