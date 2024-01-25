import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!mb;")
	public static Class132 aClass132_8 = null;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_47 = new Class70(260);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)I")
	public static int method2601(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(61) char local61;
			if (local17 == '\u0000') {
				local61 = arg0.charAt(local13++);
			} else {
				local61 = local17;
			}
			@Pc(74) char local74;
			if (local19 == '\u0000') {
				local74 = arg2.charAt(local15++);
			} else {
				local74 = local19;
			}
			local17 = Static250.method424(local61);
			local19 = Static250.method424(local74);
			local61 = Static243.method4270(arg1, local61);
			local74 = Static243.method4270(arg1, local74);
			if (local74 != local61 && Character.toUpperCase(local61) != Character.toUpperCase(local74)) {
				local61 = Character.toLowerCase(local61);
				local74 = Character.toLowerCase(local74);
				if (local61 != local74) {
					return Static346.method5705(arg1, local61) - Static346.method5705(arg1, local74);
				}
			}
		}
		@Pc(133) int local133 = Math.min(local8, local11);
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			if (arg1 == 2) {
				local15 = local11 - local135 - 1;
				local13 = local8 - local135 - 1;
			} else {
				local15 = local135;
				local13 = local135;
			}
			@Pc(165) char local165 = arg0.charAt(local13);
			@Pc(169) char local169 = arg2.charAt(local15);
			if (local165 != local169 && Character.toUpperCase(local165) != Character.toUpperCase(local169)) {
				local165 = Character.toLowerCase(local165);
				local169 = Character.toLowerCase(local169);
				if (local169 != local165) {
					return Static346.method5705(arg1, local165) - Static346.method5705(arg1, local169);
				}
			}
		}
		@Pc(218) int local218 = local8 - local11;
		if (local218 != 0) {
			return local218;
		}
		for (@Pc(227) int local227 = 0; local227 < local133; local227++) {
			@Pc(233) char local233 = arg0.charAt(local227);
			@Pc(237) char local237 = arg2.charAt(local227);
			if (local237 != local233) {
				return Static346.method5705(arg1, local233) - Static346.method5705(arg1, local237);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLclient!vg;Lclient!dp;Lclient!dp;)V")
	public static void method2602(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Class53 arg2) {
		Static239.anInterface9_8 = arg0;
		Static149.aClass53_83 = arg1;
		Static338.aClass53_154 = arg2;
		if (Static149.aClass53_83 != null) {
			Static340.anInt655 = Static149.aClass53_83.method1011(1);
		}
		if (Static338.aClass53_154 != null) {
			Static104.anInt1920 = Static338.aClass53_154.method1011(1);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)I")
	public static int method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;BILjava/awt/Color;Z)V")
	public static void method2604(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(6) Graphics local6 = Static354.aCanvas5.getGraphics();
			if (Static205.aFont3 == null) {
				Static205.aFont3 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static209.anInt3815, Static94.anInt1731);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static104.anImage1 == null) {
					Static104.anImage1 = Static354.aCanvas5.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static104.anImage1.getGraphics();
				local63.setColor(arg0);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg4);
				local63.fillRect(2, 2, arg3 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local63.setFont(Static205.aFont3);
				local63.setColor(arg1);
				local63.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
				local6.drawImage(Static104.anImage1, Static209.anInt3815 / 2 - 152, Static94.anInt1731 / 2 - 18, null);
			} catch (@Pc(150) Exception local150) {
				@Pc(156) int local156 = Static209.anInt3815 / 2 - 152;
				@Pc(162) int local162 = Static94.anInt1731 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local156 + 2, local162 + 2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local156 + 1, local162 + 1, 301, 31);
				local6.fillRect(arg3 * 3 + local156 + 2, local162 + 2, 300 - arg3 * 3, 30);
				local6.setFont(Static205.aFont3);
				local6.setColor(arg1);
				local6.drawString(arg2, (304 - arg2.length() * 6) / 2 + local156, local162 - -22);
			}
			if (Static51.aString40 != null) {
				local6.setFont(Static205.aFont3);
				local6.setColor(arg1);
				local6.drawString(Static51.aString40, Static209.anInt3815 / 2 - Static51.aString40.length() * 6 / 2, Static94.anInt1731 / 2 - 26);
			}
		} catch (@Pc(269) Exception local269) {
			Static354.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!nc;II[[BZ[[B[[B[[IILclient!nc;Z[[BLclient!ja;)V")
	public static void method2605(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class106 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class81 arg11) {
		if (Static13.anInt232 == 0 && !Static354.aBoolean428) {
			Static34.method527(arg10, arg1, arg4, arg0, arg5, arg9, arg3, arg7, arg2, arg8, arg6, arg11);
		} else {
			Static220.method3907(arg8, arg0, arg6, arg2, arg3, arg10, arg1, arg9, arg5, arg11, arg7, arg4);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIII)I")
	public static int method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + (arg0 >> 2 << 10);
	}
}
