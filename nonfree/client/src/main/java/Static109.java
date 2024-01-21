import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!sd", name = "Jc", descriptor = "[I")
	public static int[] anIntArray290 = new int[100];

	@OriginalMember(owner = "client!sd", name = "Oc", descriptor = "[I")
	public static int[] anIntArray291 = new int[128];

	@OriginalMember(owner = "client!sd", name = "Uc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1067 = Static121.method2047("Freie Welt");

	@OriginalMember(owner = "client!sd", name = "cd", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1068 = Static121.method2047("rot:");

	@OriginalMember(owner = "client!sd", name = "fd", descriptor = "Lclient!sb;")
	public static Class66 aClass66_11 = new Class66(512);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!qc;IILjava/awt/Color;)V")
	public static void method1884(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(6) Graphics local6 = Static83.aCanvas1.getGraphics();
			if (Static43.aFont1 == null) {
				Static43.aFont1 = new Font("Helvetica", 1, 13);
				Static31.aFontMetrics1 = Static83.aCanvas1.getFontMetrics(Static43.aFont1);
			}
			if (Static23.aBoolean20) {
				Static23.aBoolean20 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static28.anInt810, Static111.anInt2680);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static59.anImage4 == null) {
					Static59.anImage4 = Static83.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static59.anImage4.getGraphics();
				local51.setColor(arg2);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg1 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local51.setFont(Static43.aFont1);
				local51.setColor(Color.white);
				arg0.method1650(local51, 22, (304 - arg0.method1653(Static31.aFontMetrics1)) / 2);
				local6.drawImage(Static59.anImage4, Static28.anInt810 / 2 - 152, Static111.anInt2680 / 2 + -18, null);
			} catch (@Pc(132) Exception local132) {
				@Pc(138) int local138 = Static28.anInt810 / 2 - 152;
				@Pc(144) int local144 = Static111.anInt2680 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local138, local144, 303, 33);
				local6.fillRect(local138 + 2, local144 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local138 + 1, local144 + 1, 301, 31);
				local6.fillRect(arg1 * 3 + local138 + 2, local144 - -2, 300 - arg1 * 3, 30);
				local6.setFont(Static43.aFont1);
				local6.setColor(Color.white);
				arg0.method1650(local6, local144 + 22, local138 + (-arg0.method1653(Static31.aFontMetrics1) + 304) / 2);
			}
		} catch (@Pc(223) Exception local223) {
			Static83.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public static void method1885() {
		aClass66_11 = null;
		aClass60_1067 = null;
		anIntArray291 = null;
		aClass60_1068 = null;
		anIntArray290 = null;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	public static void method1887() {
		for (@Pc(3) int local3 = -1; local3 < Static43.anInt1107; local3++) {
			@Pc(10) int local10;
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static94.anIntArray231[local3];
			}
			@Pc(20) Class4_Sub4_Sub1_Sub2_Sub2 local20 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local10];
			if (local20 != null) {
				Static33.method612(1, local20);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)[B")
	public static byte[] method1888(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static135.method1053(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)I")
	public static int method1889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static20.method365(arg1 + 91923, arg0 + 45365, 4) + (Static20.method365(arg1 + 37821, arg0 - -10294, 2) + -128 >> 1) + (Static20.method365(arg1, arg0, 1) + -128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)I")
	public static int method1890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1891(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static54.aClass3_1);
		arg0.removeMouseMotionListener(Static54.aClass3_1);
		arg0.removeFocusListener(Static54.aClass3_1);
		Static56.anInt1432 = 0;
	}
}
