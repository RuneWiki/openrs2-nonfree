import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	public static int anInt3191 = 0;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	public static int anInt3192 = 0;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "[J")
	public static long[] aLongArray13 = new long[1000];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZ)V")
	public static void method2612(@OriginalArg(1) boolean arg0) {
		@Pc(6) Class2_Sub23 local6;
		for (local6 = (Class2_Sub23) Static238.aClass1_24.method13(); local6 != null; local6 = (Class2_Sub23) Static238.aClass1_24.method9()) {
			if (local6.aClass2_Sub5_Sub2_1 != null) {
				Static43.aClass2_Sub5_Sub1_1.method404(local6.aClass2_Sub5_Sub2_1);
				local6.aClass2_Sub5_Sub2_1 = null;
			}
			if (local6.aClass2_Sub5_Sub2_2 != null) {
				Static43.aClass2_Sub5_Sub1_1.method404(local6.aClass2_Sub5_Sub2_2);
				local6.aClass2_Sub5_Sub2_2 = null;
			}
			local6.method4926();
		}
		if (!arg0) {
			return;
		}
		for (local6 = (Class2_Sub23) Static143.aClass1_12.method13(); local6 != null; local6 = (Class2_Sub23) Static143.aClass1_12.method9()) {
			if (local6.aClass2_Sub5_Sub2_1 != null) {
				Static43.aClass2_Sub5_Sub1_1.method404(local6.aClass2_Sub5_Sub2_1);
				local6.aClass2_Sub5_Sub2_1 = null;
			}
			local6.method4926();
		}
		for (local6 = (Class2_Sub23) Static259.aClass79_21.method1992(); local6 != null; local6 = (Class2_Sub23) Static259.aClass79_21.method1991()) {
			if (local6.aClass2_Sub5_Sub2_1 != null) {
				Static43.aClass2_Sub5_Sub1_1.method404(local6.aClass2_Sub5_Sub2_1);
				local6.aClass2_Sub5_Sub2_1 = null;
			}
			local6.method4926();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public static void method2614() {
		Static146.aClass46_25.method1079();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BILjava/awt/Color;ZLjava/lang/String;)V")
	public static void method2615(@OriginalArg(1) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		try {
			@Pc(2) Graphics local2 = Static105.aCanvas1.getGraphics();
			if (Static66.aFont1 == null) {
				Static66.aFont1 = new Font("Helvetica", 1, 13);
				Static177.aFontMetrics1 = Static105.aCanvas1.getFontMetrics(Static66.aFont1);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static257.anInt5343, Static20.anInt1235);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static198.anImage4 == null) {
					Static198.anImage4 = Static105.aCanvas1.createImage(304, 34);
				}
				@Pc(54) Graphics local54 = Static198.anImage4.getGraphics();
				local54.setColor(arg1);
				local54.drawRect(0, 0, 303, 33);
				local54.fillRect(2, 2, arg0 * 3, 30);
				local54.setColor(Color.black);
				local54.drawRect(1, 1, 301, 31);
				local54.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local54.setFont(Static66.aFont1);
				local54.setColor(Color.white);
				local54.drawString(arg3, (304 - Static177.aFontMetrics1.stringWidth(arg3)) / 2, 22);
				local2.drawImage(Static198.anImage4, Static257.anInt5343 / 2 - 152, Static20.anInt1235 / 2 - 18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static257.anInt5343 / 2 - 152;
				@Pc(141) int local141 = Static20.anInt1235 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local135, local141, 303, 33);
				local2.fillRect(local135 + 2, local141 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local135 + 1, local141 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local135 + 2, local141 - -2, 300 - arg0 * 3, 30);
				local2.setFont(Static66.aFont1);
				local2.setColor(Color.white);
				local2.drawString(arg3, (304 - Static177.aFontMetrics1.stringWidth(arg3)) / 2 + local135, local141 + 22);
			}
			if (Static87.aString94 != null) {
				local2.setFont(Static66.aFont1);
				local2.setColor(Color.white);
				local2.drawString(Static87.aString94, Static257.anInt5343 / 2 - Static177.aFontMetrics1.stringWidth(Static87.aString94) / 2, Static20.anInt1235 / 2 + -26);
			}
		} catch (@Pc(242) Exception local242) {
			Static105.aCanvas1.repaint();
		}
	}
}
