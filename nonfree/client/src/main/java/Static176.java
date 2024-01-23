import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "[Lclient!l;")
	public static Class1_Sub17[] aClass1_Sub17Array1;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "J")
	public static long aLong132;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_49;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1316 = Static64.method1101("_");

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
	public static int anInt3865 = 0;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1317 = Static64.method1101(":clan:");

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	public static int anInt3867 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static15.anInt355 + arg0 * Static123.anInt2715 >> 16;
		@Pc(19) int local19 = arg3 * Static123.anInt2715 - arg0 * Static15.anInt355 >> 16;
		@Pc(29) int local29 = arg1 * Static116.anInt1300 + local19 * Static157.anInt3436 >> 16;
		@Pc(39) int local39 = arg1 * Static157.anInt3436 - local19 * Static116.anInt1300 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static116.anInt1300 + local19 * Static157.anInt3436 >> 16;
		@Pc(76) int local76 = arg2 * Static157.anInt3436 - local19 * Static116.anInt1300 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static161.anInt3476 && local87 < Static161.anInt3476) {
			return false;
		} else if (local50 > Static53.anInt1240 && local87 > Static53.anInt1240) {
			return false;
		} else if (local56 < Static192.anInt4156 && local93 < Static192.anInt4156) {
			return false;
		} else {
			return local56 <= Static220.anInt4645 || local93 <= Static220.anInt4645;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLjava/awt/Color;IILclient!ia;)V")
	public static void method2993(@OriginalArg(0) boolean arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class51 arg3) {
		try {
			@Pc(2) Graphics local2 = Static36.aCanvas1.getGraphics();
			if (Static228.aFont1 == null) {
				Static228.aFont1 = new Font("Helvetica", 1, 13);
				Static193.aFontMetrics1 = Static36.aCanvas1.getFontMetrics(Static228.aFont1);
			}
			if (arg0) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static185.anInt4016, Static90.anInt4701);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static14.anImage1 == null) {
					Static14.anImage1 = Static36.aCanvas1.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static14.anImage1.getGraphics();
				local45.setColor(arg1);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg2 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local45.setFont(Static228.aFont1);
				local45.setColor(Color.white);
				arg3.method1398(22, local45, (304 - arg3.method1414(Static193.aFontMetrics1)) / 2);
				local2.drawImage(Static14.anImage1, Static185.anInt4016 / 2 - 152, Static90.anInt4701 / 2 + -18, null);
			} catch (@Pc(126) Exception local126) {
				@Pc(132) int local132 = Static185.anInt4016 / 2 - 152;
				@Pc(138) int local138 = Static90.anInt4701 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local132, local138, 303, 33);
				local2.fillRect(local132 + 2, local138 - -2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local132 + 1, local138 - -1, 301, 31);
				local2.fillRect(arg2 * 3 + local132 + 2, local138 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static228.aFont1);
				local2.setColor(Color.white);
				arg3.method1398(local138 + 22, local2, local132 + (304 - arg3.method1414(Static193.aFontMetrics1)) / 2);
			}
			if (Static208.aClass51_1536 != null) {
				local2.setFont(Static228.aFont1);
				local2.setColor(Color.white);
				Static208.aClass51_1536.method1398(Static90.anInt4701 / 2 - 26, local2, Static185.anInt4016 / 2 - Static208.aClass51_1536.method1414(Static193.aFontMetrics1) / 2);
			}
		} catch (@Pc(257) Exception local257) {
			Static36.aCanvas1.repaint();
		}
	}
}
