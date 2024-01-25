import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!hu", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
	public static int anInt2859;

	@OriginalMember(owner = "client!hu", name = "R", descriptor = "Lclient!um;")
	public static Class243 aClass243_96;

	@OriginalMember(owner = "client!hu", name = "E", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_45 = new Class194(70, 18);

	@OriginalMember(owner = "client!hu", name = "J", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[200];

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII)V")
	public static void method2315(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class88_Sub4 local6 = (Class88_Sub4) Static107.aClass107_4.method2326(); local6 != null; local6 = (Class88_Sub4) Static107.aClass107_4.method2327()) {
			if (local6.anInt5030 <= Static85.anInt1536) {
				local6.method5917();
			} else {
				Static93.method1319((local6.anInt5025 << 7) + 64, local6.anInt5022, arg0 >> 1, arg3 >> 1, local6.anInt5024 * 2, (local6.anInt5029 << 7) + 64);
				Static56.aClass23_1.method5739(arg1 + Static205.anIntArray194[0], local6.aString56, Static205.anIntArray194[1] + arg2, local6.anInt5031 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLjava/awt/Color;ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Z)V")
	public static void method2316(@OriginalArg(1) Color arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(6) Graphics local6 = Static246.aCanvas2.getGraphics();
			if (Static459.aFont2 == null) {
				Static459.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static178.anInt5792, Static102.anInt1723);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static173.anImage1 == null) {
					Static173.anImage1 = Static246.aCanvas2.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static173.anImage1.getGraphics();
				local63.setColor(arg4);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg0);
				local63.fillRect(2, 2, arg1 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local63.setFont(Static459.aFont2);
				local63.setColor(arg3);
				local63.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
				local6.drawImage(Static173.anImage1, Static178.anInt5792 / 2 - 152, Static102.anInt1723 / 2 - 18, null);
			} catch (@Pc(143) Exception local143) {
				@Pc(149) int local149 = Static178.anInt5792 / 2 - 152;
				@Pc(155) int local155 = Static102.anInt1723 / 2 - 18;
				local6.setColor(arg4);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local149 + 2, local155 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local149 + 1, local155 - -1, 301, 31);
				local6.fillRect(arg1 * 3 + local149 + 2, local155 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static459.aFont2);
				local6.setColor(arg3);
				local6.drawString(arg2, local149 + (304 - arg2.length() * 6) / 2, local155 + 22);
			}
			if (Static218.aString55 != null) {
				local6.setFont(Static459.aFont2);
				local6.setColor(arg3);
				local6.drawString(Static218.aString55, Static178.anInt5792 / 2 - Static218.aString55.length() * 6 / 2, Static102.anInt1723 / 2 + -26);
			}
		} catch (@Pc(269) Exception local269) {
			Static246.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZI)V")
	public static void method2317(@OriginalArg(0) boolean arg0) {
		if (Static14.aClass99_2 != null) {
			Static14.aClass99_2.method4963();
			Static14.aClass99_2 = null;
		}
		Static51.anInt913 = 0;
		Static159.method2247();
		Static45.method34();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static163.aClass240Array1[local19].method5416();
		}
		Static182.method2493(false);
		System.gc();
		Static125.method1761();
		Static180.aBoolean201 = false;
		Static172.anInt3753 = -1;
		Static402.method5352(true);
		Static226.anInt3768 = 0;
		Static31.anInt618 = 0;
		Static375.anInt6241 = 0;
		Static148.anInt2668 = 0;
		Static2.anInt7507 = 0;
		Static345.anInt5641 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static186.aClass266Array1.length; local60++) {
			Static186.aClass266Array1[local60] = null;
		}
		Static251.method3217();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static359.aClass2_Sub1_Sub3_Sub2Array1[local75] = null;
		}
		Static424.anInt7114 = 0;
		Static380.aClass252_36.method5661();
		Static111.anInt1879 = 0;
		Static400.aClass252_38.method5661();
		Static185.method2530();
		Static31.anInt615 = 0;
		Static408.aClass39_1.method961();
		Static203.method2695();
		Static309.method3813();
		Static379.aLong134 = 0L;
		Static332.aClass5_Sub10_2 = null;
		if (arg0) {
			Static407.method5394(11);
			return;
		}
		Static407.method5394(2);
		try {
			Static471.method4680("loggedout", Static7.aClass93_1.anApplet1);
		} catch (@Pc(135) Throwable local135) {
		}
	}
}
