import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)V")
	public static void method1761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (Static153.anInt3378 != arg0) {
			Static107.anIntArray234 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static107.anIntArray234[local9] = (local9 << 12) / arg0;
			}
			Static153.anInt3378 = arg0;
			Static86.anInt2150 = arg0 * 32;
			Static250.anInt5127 = arg0 - 1;
		}
		if (arg1 == Static319.anInt6144) {
			return;
		}
		if (Static153.anInt3378 == arg1) {
			Static266.anIntArray454 = Static107.anIntArray234;
		} else {
			Static266.anIntArray454 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static266.anIntArray454[local9] = (local9 << 12) / arg1;
			}
		}
		Static49.anInt1526 = arg1 - 1;
		Static319.anInt6144 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!wo;B)V")
	public static void method1762(@OriginalArg(0) Class216 arg0) {
		Static109.aClass216_34 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)V")
	public static void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class23 local3 = new Class23();
		local3.anInt1026 = arg1 >> 7;
		local3.anInt1012 = arg2 >> 7;
		local3.anInt1023 = arg3 >> 7;
		local3.anInt1025 = arg4 >> 7;
		local3.anInt1028 = arg0;
		local3.anInt1032 = arg1;
		local3.anInt1022 = arg2;
		local3.anInt1020 = arg3;
		local3.anInt1021 = arg4;
		local3.anInt1016 = arg5;
		local3.anInt1017 = arg6;
		Static121.aClass23Array2[Static28.anInt1030++] = local3;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method1764() {
		for (@Pc(14) Class1_Sub25 local14 = (Class1_Sub25) Static290.aClass16_35.method410(); local14 != null; local14 = (Class1_Sub25) Static290.aClass16_35.method419()) {
			if (local14.anInt3972 == -1) {
				local14.anInt3969 = 0;
				Static102.method2113(local14);
			} else {
				local14.method5628();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIIII)V")
	public static void method1765(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class1_Sub19 local20 = (Class1_Sub19) Static190.aClass197_16.method5157(local14);
		if (local20 == null) {
			local20 = new Class1_Sub19();
			Static190.aClass197_16.method5166(local20, local14);
		}
		if (local20.anIntArray247.length <= arg3) {
			@Pc(45) int[] local45 = new int[arg3 + 1];
			@Pc(50) int[] local50 = new int[arg3 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray247.length; local52++) {
				local45[local52] = local20.anIntArray247[local52];
				local50[local52] = local20.anIntArray248[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray247.length; local78 < arg3; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray247 = local45;
			local20.anIntArray248 = local50;
		}
		local20.anIntArray247[arg3] = arg1;
		local20.anIntArray248[arg3] = arg4;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ZB)V")
	public static void method1766(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(2) Graphics local2 = Static349.aCanvas5.getGraphics();
			if (Static63.aFont2 == null) {
				Static63.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static194.anInt4145, Static271.anInt5530);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static7.anImage1 == null) {
					Static7.anImage1 = Static349.aCanvas5.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static7.anImage1.getGraphics();
				local59.setColor(arg1);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg2);
				local59.fillRect(2, 2, arg0 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local59.setFont(Static63.aFont2);
				local59.setColor(arg3);
				local59.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local2.drawImage(Static7.anImage1, Static194.anInt4145 / 2 - 152, Static271.anInt5530 / 2 - 18, null);
			} catch (@Pc(144) Exception local144) {
				@Pc(150) int local150 = Static194.anInt4145 / 2 - 152;
				@Pc(156) int local156 = Static271.anInt5530 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local150 + 2, local156 - -2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local150 + 1, local156 - -1, 301, 31);
				local2.fillRect(arg0 * 3 + local150 + 2, local156 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static63.aFont2);
				local2.setColor(arg3);
				local2.drawString(arg4, (304 - arg4.length() * 6) / 2 + local150, local156 + 22);
			}
			if (Static267.aString54 != null) {
				local2.setFont(Static63.aFont2);
				local2.setColor(arg3);
				local2.drawString(Static267.aString54, Static194.anInt4145 / 2 - Static267.aString54.length() * 6 / 2, Static271.anInt5530 / 2 + -26);
			}
		} catch (@Pc(262) Exception local262) {
			Static349.aCanvas5.repaint();
		}
	}
}
