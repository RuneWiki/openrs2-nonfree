import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	public static int anInt3862;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
	public static int anInt3863;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	public static int anInt3864;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "[[Lclient!td;")
	public static Class8_Sub29[][] aClass8_Sub29ArrayArray5;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "Z")
	public static boolean aBoolean314 = true;

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString140 = "Select";

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)I")
	public static int method3004(@OriginalArg(0) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	public static void method3006(@OriginalArg(1) int arg0) {
		@Pc(23) Class8_Sub1_Sub6 local23 = Static181.method2779(3, arg0);
		local23.method929();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method3008(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			try {
				Static304.method1290(Static199.aClass17_3.anApplet1, "loggedout");
			} catch (@Pc(61) Throwable local61) {
			}
			try {
				Static17.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static17.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
			} catch (@Pc(73) Exception local73) {
			}
			return;
		}
		if (Static116.aBoolean188 && Static40.aBoolean59) {
			try {
				Static304.method1291(new Object[] { (new URL(Static17.anApplet_Sub1_1.getCodeBase(), arg0)).toString() }, Static199.aClass17_3.anApplet1, "openjs");
				return;
			} catch (@Pc(39) Throwable local39) {
			}
		}
		try {
			Static17.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static17.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)V")
	public static void method3009(@OriginalArg(0) boolean arg0) {
		@Pc(3) byte local3;
		if (arg0) {
			local3 = 1;
		} else {
			local3 = 4;
		}
		Static241.anInt4830 = 99;
		Static74.anIntArrayArrayArray3 = new int[local3][105][105];
		Static153.anIntArray246 = new int[104];
		Static42.anIntArray63 = new int[104];
		Static132.aByteArrayArrayArray6 = new byte[local3][104][104];
		Static21.anIntArray42 = new int[104];
		Static4.anIntArray6 = new int[104];
		Static44.anIntArray72 = new int[5];
		Static147.aByteArrayArrayArray8 = new byte[local3][104][104];
		Static254.aByteArrayArrayArray15 = new byte[local3][104][104];
		Static183.anIntArray269 = new int[104];
		Static40.aByteArrayArrayArray1 = new byte[local3][105][105];
		Static75.aByteArrayArrayArray4 = new byte[local3][104][104];
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] method3010(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(27) byte[] local27 = (byte[]) arg1;
			return arg0 ? Static219.method3423(local27) : local27;
		} else if (arg1 instanceof Class45) {
			@Pc(41) Class45 local41 = (Class45) arg1;
			return local41.method3809();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIILclient!eh;IJZ)Z")
	public static boolean method3011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class36 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static34.method537(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;BZILjava/awt/Color;)V")
	public static void method3012(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Color arg3) {
		try {
			@Pc(6) Graphics local6 = Static39.aCanvas1.getGraphics();
			if (Static292.aFont1 == null) {
				Static292.aFont1 = new Font("Helvetica", 1, 13);
				Static282.aFontMetrics2 = Static39.aCanvas1.getFontMetrics(Static292.aFont1);
			}
			if (arg1) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static250.anInt4959, Static13.anInt356);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static215.anImage3 == null) {
					Static215.anImage3 = Static39.aCanvas1.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static215.anImage3.getGraphics();
				local52.setColor(arg3);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg2 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local52.setFont(Static292.aFont1);
				local52.setColor(Color.white);
				local52.drawString(arg0, (304 - Static282.aFontMetrics2.stringWidth(arg0)) / 2, 22);
				local6.drawImage(Static215.anImage3, Static250.anInt4959 / 2 - 152, Static13.anInt356 / 2 + -18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static250.anInt4959 / 2 - 152;
				@Pc(140) int local140 = Static13.anInt356 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local134, local140, 303, 33);
				local6.fillRect(local134 + 2, local140 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local134 + 1, local140 + 1, 301, 31);
				local6.fillRect(local134 + arg2 * 3 + 2, local140 - -2, 300 - arg2 * 3, 30);
				local6.setFont(Static292.aFont1);
				local6.setColor(Color.white);
				local6.drawString(arg0, (304 - Static282.aFontMetrics2.stringWidth(arg0)) / 2 + local134, local140 - -22);
			}
			if (Static189.aString134 != null) {
				local6.setFont(Static292.aFont1);
				local6.setColor(Color.white);
				local6.drawString(Static189.aString134, Static250.anInt4959 / 2 - Static282.aFontMetrics2.stringWidth(Static189.aString134) / 2, Static13.anInt356 / 2 + -26);
			}
		} catch (@Pc(249) Exception local249) {
			Static39.aCanvas1.repaint();
		}
	}
}
