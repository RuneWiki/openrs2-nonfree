import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Lclient!cc;")
	public static Class26 aClass26_2 = new Class26(50);

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString22 = "Examine";

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString23 = "Connected to update server";

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(DB)V")
	public static void method200(@OriginalArg(0) double arg0) {
		if (Static194.aDouble11 == arg0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local13 / 255.0D, arg0) * 255.0D);
			Static150.anIntArray267[local13] = local28 > 255 ? 255 : local28;
		}
		Static194.aDouble11 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public static void method201() {
		Static157.aClass26_29.method511();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Color;ZZILjava/lang/String;)V")
	public static void method202(@OriginalArg(0) Color arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			@Pc(2) Graphics local2 = Static188.aCanvas115.getGraphics();
			if (Static34.aFont1 == null) {
				Static34.aFont1 = new Font("Helvetica", 1, 13);
				Static28.aFontMetrics1 = Static188.aCanvas115.getFontMetrics(Static34.aFont1);
			}
			if (arg1) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static31.anInt526, Static40.anInt690);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static58.anImage2 == null) {
					Static58.anImage2 = Static188.aCanvas115.createImage(304, 34);
				}
				@Pc(48) Graphics local48 = Static58.anImage2.getGraphics();
				local48.setColor(arg0);
				local48.drawRect(0, 0, 303, 33);
				local48.fillRect(2, 2, arg2 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(1, 1, 301, 31);
				local48.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local48.setFont(Static34.aFont1);
				local48.setColor(Color.white);
				local48.drawString(arg3, (304 - Static28.aFontMetrics1.stringWidth(arg3)) / 2, 22);
				local2.drawImage(Static58.anImage2, Static31.anInt526 / 2 - 152, Static40.anInt690 / 2 + -18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static31.anInt526 / 2 - 152;
				@Pc(140) int local140 = Static40.anInt690 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local134, local140, 303, 33);
				local2.fillRect(local134 + 2, local140 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local134 + 1, local140 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local134 + 2, local140 - -2, 300 - arg2 * 3, 30);
				local2.setFont(Static34.aFont1);
				local2.setColor(Color.white);
				local2.drawString(arg3, local134 + (304 - Static28.aFontMetrics1.stringWidth(arg3)) / 2, local140 + 22);
			}
			if (Static221.aString262 != null) {
				local2.setFont(Static34.aFont1);
				local2.setColor(Color.white);
				local2.drawString(Static221.aString262, Static31.anInt526 / 2 - Static28.aFontMetrics1.stringWidth(Static221.aString262) / 2, Static40.anInt690 / 2 + -26);
			}
		} catch (@Pc(243) Exception local243) {
			Static188.aCanvas115.repaint();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIILclient!vc;Lclient!vc;IIIIJ)V")
	public static void method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class186 local6 = new Class186();
		local6.aLong199 = arg10;
		local6.anInt5630 = arg1 * 128 + 64;
		local6.anInt5628 = arg2 * 128 + 64;
		local6.anInt5631 = arg3;
		local6.aClass53_10 = arg4;
		local6.aClass53_9 = arg5;
		local6.anInt5633 = arg6;
		local6.anInt5635 = arg7;
		local6.anInt5637 = arg8;
		local6.anInt5629 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static6.aClass4_Sub19ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static6.aClass4_Sub19ArrayArrayArray1[local46][arg1][arg2] = new Class4_Sub19(local46, arg1, arg2);
			}
		}
		Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass186_1 = local6;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Lclient!ma;")
	public static Class56 method204() {
		@Pc(31) Class56 local31;
		if (Static94.aBoolean138) {
			local31 = new Class56_Sub2(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[0], Static187.anIntArray391[0], Static110.anIntArray185[0], Static301.anIntArray643[0], Static230.aByteArrayArray36[0], Static58.anIntArray85);
		} else {
			local31 = new Class56_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[0], Static187.anIntArray391[0], Static110.anIntArray185[0], Static301.anIntArray643[0], Static230.aByteArrayArray36[0], Static58.anIntArray85);
		}
		Static304.method4707();
		return local31;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[[III)I")
	public static int method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4) {
		@Pc(31) int local31 = arg0 * arg3[arg1 + 1][arg4] + arg3[arg1][arg4] * (128 - arg0) >> 7;
		@Pc(58) int local58 = arg3[arg1][arg4 + 1] * (128 - arg0) + arg0 * arg3[arg1 + 1][arg4 + 1] >> 7;
		return local31 * (128 - arg2) + local58 * arg2 >> 7;
	}
}
