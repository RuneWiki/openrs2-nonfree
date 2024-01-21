import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!w;")
	public static Class15 aClass15_4;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!fa;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public static int anInt63 = -1;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "[Lclient!ib;")
	public static Class10_Sub1_Sub5_Sub2_Sub1[] aClass10_Sub1_Sub5_Sub2_Sub1Array1 = new Class10_Sub1_Sub5_Sub2_Sub1[16384];

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	public static int anInt66 = -1;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public static int anInt68 = 0;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	public static final int anInt69 = 20;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public static int anInt70 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI[BZ)V")
	public static void method64(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		if (Static5.aClass13_1 == null) {
			return;
		}
		if (Static55.anInt1488 >= 0) {
			Static5.aClass13_1.method1506();
			Static55.anInt1488 = -1;
			Static40.aByteArray4 = null;
			Static80.anInt2152 = 20;
			Static25.anInt781 = 0;
		}
		if (arg1 == null) {
			return;
		}
		if (Static80.anInt2152 > 0) {
			Static5.aClass13_1.method1504(arg0);
			Static80.anInt2152 = 0;
		}
		Static55.anInt1488 = arg0;
		Static5.aClass13_1.method1500(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method66() {
		aClass15_4 = null;
		aClass19_1 = null;
		aClass10_Sub1_Sub5_Sub2_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method68(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Color;Lclient!va;II)V")
	public static void method69(@OriginalArg(0) Color arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Graphics local6 = Static38.aCanvas1.getGraphics();
			if (Static50.aFont1 == null) {
				Static50.aFont1 = new Font("Helvetica", 1, 13);
				Static95.aFontMetrics1 = Static38.aCanvas1.getFontMetrics(Static50.aFont1);
			}
			if (Static40.aBoolean51) {
				Static40.aBoolean51 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static34.anInt1002, Static53.anInt1454);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static96.anImage4 == null) {
					Static96.anImage4 = Static38.aCanvas1.createImage(304, 34);
				}
				@Pc(56) Graphics local56 = Static96.anImage4.getGraphics();
				local56.setColor(arg0);
				local56.drawRect(0, 0, 303, 33);
				local56.fillRect(2, 2, arg2 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(1, 1, 301, 31);
				local56.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local56.setFont(Static50.aFont1);
				local56.setColor(Color.white);
				arg1.method1595((304 - arg1.method1599(Static95.aFontMetrics1)) / 2, 22, local56);
				local6.drawImage(Static96.anImage4, Static34.anInt1002 / 2 - 152, Static53.anInt1454 / 2 + -18, null);
			} catch (@Pc(137) Exception local137) {
				@Pc(143) int local143 = Static34.anInt1002 / 2 - 152;
				@Pc(149) int local149 = Static53.anInt1454 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local143, local149, 303, 33);
				local6.fillRect(local143 + 2, local149 - -2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local143 + 1, local149 + 1, 301, 31);
				local6.fillRect(arg2 * 3 + local143 + 2, local149 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static50.aFont1);
				local6.setColor(Color.white);
				arg1.method1595(local143 + (304 - arg1.method1599(Static95.aFontMetrics1)) / 2, local149 - -22, local6);
			}
		} catch (@Pc(228) Exception local228) {
			Static38.aCanvas1.repaint();
		}
	}
}
