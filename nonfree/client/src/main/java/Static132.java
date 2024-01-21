import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!wd", name = "gc", descriptor = "[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array10;

	@OriginalMember(owner = "client!wd", name = "hc", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_16;

	@OriginalMember(owner = "client!wd", name = "Gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1586 = Static9.method266("<col=c0ff00>");

	@OriginalMember(owner = "client!wd", name = "Hb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1587 = Static9.method266(")3runescape)3com");

	@OriginalMember(owner = "client!wd", name = "Kb", descriptor = "I")
	public static int anInt3152 = 0;

	@OriginalMember(owner = "client!wd", name = "Mb", descriptor = "I")
	public static int anInt3154 = 0;

	@OriginalMember(owner = "client!wd", name = "Qb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1588 = Static9.method266("null");

	@OriginalMember(owner = "client!wd", name = "Sb", descriptor = "Lclient!id;")
	private static Class34 aClass34_1589 = Static9.method266("scroll:");

	@OriginalMember(owner = "client!wd", name = "Tb", descriptor = "I")
	public static int anInt3159 = 0;

	@OriginalMember(owner = "client!wd", name = "Ub", descriptor = "Lclient!id;")
	public static Class34 aClass34_1590 = aClass34_1589;

	@OriginalMember(owner = "client!wd", name = "Wb", descriptor = "[I")
	public static int[] anIntArray380 = new int[32];

	@OriginalMember(owner = "client!wd", name = "Yb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1591 = Static9.method266("event_opbase");

	@OriginalMember(owner = "client!wd", name = "Zb", descriptor = "I")
	public static int anInt3162 = 0;

	@OriginalMember(owner = "client!wd", name = "dc", descriptor = "Lclient!id;")
	public static Class34 aClass34_1592 = Static9.method266("titlebutton");

	@OriginalMember(owner = "client!wd", name = "ic", descriptor = "Lclient!id;")
	public static Class34 aClass34_1593 = aClass34_1589;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	public static int method2097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 2) {
			@Pc(17) int local17 = method2097(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local17 *= arg1;
			}
			return local17;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "(I)V")
	public static void method2098() {
		Static32.anInt1453 = 0;
		Static92.anInt2405 = 0;
		Static32.method898();
		Static128.method1993();
		Static17.method388();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static92.anInt2405; local17++) {
			local23 = Static120.anIntArray354[local17];
			if (Static73.anInt1947 != Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local23].anInt1435) {
				Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local23].aClass1_Sub1_Sub17_1 = null;
				Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local23] = null;
			}
		}
		if (Static51.aClass1_Sub19_Sub1_4.anInt3111 != Static81.anInt2134) {
			throw new RuntimeException("gnp1 pos:" + Static51.aClass1_Sub19_Sub1_4.anInt3111 + " psize:" + Static81.anInt2134);
		}
		for (local23 = 0; local23 < Static64.anInt1731; local23++) {
			if (Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray19[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static64.anInt1731);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "(I)V")
	public static void method2099() {
		aClass1_Sub1_Sub2_Sub1Array10 = null;
		aClass34_1589 = null;
		aClass34_1590 = null;
		aClass34_1586 = null;
		anIntArray380 = null;
		aClass34_1588 = null;
		aClass34_1587 = null;
		aClass34_1592 = null;
		aClass34_1591 = null;
		aClass34_1593 = null;
		aClass1_Sub9_16 = null;
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(Z)V")
	public static void method2101() {
		@Pc(10) Object local10 = Static1.anObject1;
		synchronized (Static1.anObject1) {
			if (Static27.anInt890 == 0) {
				Static100.aClass15_4.method488(5, new Class70());
			}
			Static27.anInt890 = 600;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Color;ILclient!id;B)V")
	public static void method2106(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		try {
			@Pc(2) Graphics local2 = Static7.aCanvas1.getGraphics();
			if (Static54.aFont1 == null) {
				Static54.aFont1 = new Font("Helvetica", 1, 13);
				Static80.aFontMetrics1 = Static7.aCanvas1.getFontMetrics(Static54.aFont1);
			}
			if (Static86.aBoolean121) {
				Static86.aBoolean121 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static49.anInt1468, Static19.anInt660);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static47.anImage3 == null) {
					Static47.anImage3 = Static7.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static47.anImage3.getGraphics();
				local51.setColor(arg0);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg1 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local51.setFont(Static54.aFont1);
				local51.setColor(Color.white);
				arg2.method971((304 - arg2.method992(Static80.aFontMetrics1)) / 2, 22, local51);
				local2.drawImage(Static47.anImage3, Static49.anInt1468 / 2 - 152, Static19.anInt660 / 2 + -18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static19.anInt660 / 2 - 18;
				@Pc(140) int local140 = Static49.anInt1468 / 2 - 152;
				local2.setColor(arg0);
				local2.drawRect(local140, local134, 303, 33);
				local2.fillRect(local140 + 2, local134 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local140 + 1, local134 - -1, 301, 31);
				local2.fillRect(local140 + arg1 * 3 + 2, local134 - -2, 300 - arg1 * 3, 30);
				local2.setFont(Static54.aFont1);
				local2.setColor(Color.white);
				arg2.method971((304 - arg2.method992(Static80.aFontMetrics1)) / 2 + local140, local134 + 22, local2);
			}
		} catch (@Pc(220) Exception local220) {
			Static7.aCanvas1.repaint();
		}
	}
}
