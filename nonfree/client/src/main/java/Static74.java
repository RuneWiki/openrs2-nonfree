import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt1780 = -1;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public static int anInt1781 = 0;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "[I")
	public static int[] anIntArray227 = new int[5];

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public static int anInt1786 = 0;

	@OriginalMember(owner = "client!le", name = "x", descriptor = "Lclient!ic;")
	private static Class34 aClass34_835 = Static56.method816("World");

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_831 = aClass34_835;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_832 = Static56.method816("Nehmen");

	@OriginalMember(owner = "client!le", name = "p", descriptor = "[I")
	public static int[] anIntArray229 = new int[4000];

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_833 = Static56.method816("runes");

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!ic;")
	public static Class34 aClass34_834 = aClass34_835;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!wd;)V")
	public static void method1088(@OriginalArg(1) Class8_Sub20 arg0) {
		if (Static132.aClass35_6 != null) {
			try {
				Static132.aClass35_6.method910(0L);
				Static132.aClass35_6.method908(24, arg0.anInt2853, arg0.aByteArray44);
			} catch (@Pc(15) Exception local15) {
			}
		}
		arg0.anInt2853 += 24;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Color;Lclient!ic;ZI)V")
	public static void method1089(@OriginalArg(0) Color arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Graphics local6 = Static119.aCanvas1.getGraphics();
			if (Static119.aFont1 == null) {
				Static119.aFont1 = new Font("Helvetica", 1, 13);
				Static39.aFontMetrics1 = Static119.aCanvas1.getFontMetrics(Static119.aFont1);
			}
			if (Static39.aBoolean46) {
				Static39.aBoolean46 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static10.anInt225, Static32.anInt874);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static91.anImage1 == null) {
					Static91.anImage1 = Static119.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static91.anImage1.getGraphics();
				local51.setColor(arg0);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg2 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local51.setFont(Static119.aFont1);
				local51.setColor(Color.white);
				arg1.method828(22, local51, (304 - arg1.method841(Static39.aFontMetrics1)) / 2);
				local6.drawImage(Static91.anImage1, Static10.anInt225 / 2 - 152, Static32.anInt874 / 2 - 18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static32.anInt874 / 2 - 18;
				@Pc(146) int local146 = Static10.anInt225 / 2 - 152;
				local6.setColor(arg0);
				local6.drawRect(local146, local140, 303, 33);
				local6.fillRect(local146 + 2, local140 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local146 + 1, local140 + 1, 301, 31);
				local6.fillRect(local146 + arg2 * 3 + 2, local140 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static119.aFont1);
				local6.setColor(Color.white);
				arg1.method828(local140 + 22, local6, (304 - arg1.method841(Static39.aFontMetrics1)) / 2 + local146);
			}
		} catch (@Pc(226) Exception local226) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	public static void method1090() {
		aClass34_835 = null;
		anIntArray229 = null;
		aClass34_832 = null;
		aClass34_834 = null;
		anIntArray227 = null;
		aClass34_833 = null;
		aClass34_831 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ic;Lclient!ic;ILclient!ic;)V")
	public static void method1091(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) Class34 arg2) {
		Static83.aClass34_943 = arg1;
		Static83.aClass34_942 = arg0;
		Static83.aClass34_933 = arg2;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
	public static void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			Static87.anInt2186 = -1;
			Static125.anInt2997 = -1;
			return;
		}
		@Pc(33) int local33 = Static123.method1945(arg0, Static42.anInt1024, arg1) - arg2;
		@Pc(37) int local37 = local33 - Static113.anInt2579;
		@Pc(41) int local41 = arg1 - Static48.anInt2951;
		@Pc(49) int local49 = arg0 - Static13.anInt345;
		@Pc(53) int local53 = Class8_Sub1_Sub3_Sub1.anIntArray38[Static24.anInt1900];
		@Pc(57) int local57 = Class8_Sub1_Sub3_Sub1.anIntArray40[Static24.anInt1900];
		@Pc(61) int local61 = Class8_Sub1_Sub3_Sub1.anIntArray40[Static19.anInt593];
		@Pc(65) int local65 = Class8_Sub1_Sub3_Sub1.anIntArray38[Static19.anInt593];
		@Pc(75) int local75 = local49 * local65 + local61 * local41 >> 16;
		@Pc(86) int local86 = local61 * local49 - local65 * local41 >> 16;
		@Pc(88) int local88 = local75;
		@Pc(99) int local99 = local57 * local37 - local53 * local86 >> 16;
		@Pc(109) int local109 = local57 * local86 + local53 * local37 >> 16;
		if (local109 >= 50) {
			Static125.anInt2997 = (local99 << 9) / local109 + 167;
			Static87.anInt2186 = (local88 << 9) / local109 + 256;
		} else {
			Static125.anInt2997 = -1;
			Static87.anInt2186 = -1;
		}
	}
}
