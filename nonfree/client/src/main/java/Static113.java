import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
	public static int anInt2603;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "Lclient!qc;")
	public static Class135 aClass135_11 = new Class135(20);

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	public static int anInt2602 = -2;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
	public static volatile int anInt2604 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method2066() {
		Static180.aClass135_17.method3324();
		Static108.aClass135_10.method3324();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZBILjava/lang/String;Ljava/awt/Color;)V")
	public static void method2068(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Color arg3) {
		try {
			@Pc(2) Graphics local2 = Static156.aCanvas2.getGraphics();
			if (Static170.aFont1 == null) {
				Static170.aFont1 = new Font("Helvetica", 1, 13);
				Static130.aFontMetrics1 = Static156.aCanvas2.getFontMetrics(Static170.aFont1);
			}
			if (arg0) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static3.anInt122, Static148.anInt3206);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static186.anImage3 == null) {
					Static186.anImage3 = Static156.aCanvas2.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static186.anImage3.getGraphics();
				local47.setColor(arg3);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg1 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local47.setFont(Static170.aFont1);
				local47.setColor(Color.white);
				local47.drawString(arg2, (304 - Static130.aFontMetrics1.stringWidth(arg2)) / 2, 22);
				local2.drawImage(Static186.anImage3, Static3.anInt122 / 2 - 152, Static148.anInt3206 / 2 + -18, null);
			} catch (@Pc(126) Exception local126) {
				@Pc(132) int local132 = Static3.anInt122 / 2 - 152;
				@Pc(138) int local138 = Static148.anInt3206 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local132, local138, 303, 33);
				local2.fillRect(local132 + 2, local138 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local132 + 1, local138 + 1, 301, 31);
				local2.fillRect(local132 + arg1 * 3 + 2, local138 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static170.aFont1);
				local2.setColor(Color.white);
				local2.drawString(arg2, (304 - Static130.aFontMetrics1.stringWidth(arg2)) / 2 + local132, local138 - -22);
			}
			if (Static15.aString25 != null) {
				local2.setFont(Static170.aFont1);
				local2.setColor(Color.white);
				local2.drawString(Static15.aString25, Static3.anInt122 / 2 - Static130.aFontMetrics1.stringWidth(Static15.aString25) / 2, Static148.anInt3206 / 2 + -26);
			}
		} catch (@Pc(244) Exception local244) {
			Static156.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)I")
	public static int method2069(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([IBJI)Ljava/lang/String;")
	public static String method2070(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (Static109.anInterface3_1 != null) {
			@Pc(21) String local21 = Static109.anInterface3_1.method3806(arg2, arg1, arg0);
			if (local21 != null) {
				return local21;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBZIIILclient!km;)V")
	public static void method2071(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class91 arg2) {
		Static299.anInt5641 = 1;
		Static244.anInt4854 = arg0;
		Static200.anInt4074 = 2;
		Static14.aClass91_14 = arg2;
		Static237.anInt4708 = arg1;
		Static59.anInt3983 = 0;
		Static139.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Lclient!rh;")
	public static Class146 method2072(@OriginalArg(1) int arg0) {
		@Pc(6) Class146 local6 = (Class146) Static242.aClass135_29.method3316((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static99.aClass91_82.method2495(29, arg0);
		local6 = new Class146();
		if (local20 != null) {
			local6.method3566(arg0, new Class1_Sub11(local20));
		}
		Static242.aClass135_29.method3321((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)I")
	public static int method2073(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
