import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public static int anInt4447;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1272 = Static158.method3034(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!pi;")
	public static final Class67 aClass67_12 = new Class67();

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1273 = Static158.method3034("Mem:");

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ob;Ljava/awt/Color;BI)V")
	public static void method3424(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) Graphics local7 = Static159.aCanvas36.getGraphics();
			if (Static70.aFont1 == null) {
				Static70.aFont1 = new Font("Helvetica", 1, 13);
				Static47.aFontMetrics2 = Static159.aCanvas36.getFontMetrics(Static70.aFont1);
			}
			if (Static94.aBoolean109) {
				Static94.aBoolean109 = false;
				local7.setColor(Color.black);
				local7.fillRect(0, 0, Static99.anInt2872, Static18.anInt4398);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static129.anImage4 == null) {
					Static129.anImage4 = Static159.aCanvas36.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static129.anImage4.getGraphics();
				local52.setColor(arg1);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg2 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local52.setFont(Static70.aFont1);
				local52.setColor(Color.white);
				arg0.method2662(local52, 22, (304 - arg0.method2681(Static47.aFontMetrics2)) / 2);
				local7.drawImage(Static129.anImage4, Static99.anInt2872 / 2 - 152, Static18.anInt4398 / 2 - 18, null);
			} catch (@Pc(130) Exception local130) {
				@Pc(136) int local136 = Static99.anInt2872 / 2 - 152;
				@Pc(142) int local142 = Static18.anInt4398 / 2 - 18;
				local7.setColor(arg1);
				local7.drawRect(local136, local142, 303, 33);
				local7.fillRect(local136 + 2, local142 - -2, arg2 * 3, 30);
				local7.setColor(Color.black);
				local7.drawRect(local136 + 1, local142 + 1, 301, 31);
				local7.fillRect(arg2 * 3 + local136 + 2, local142 + 2, 300 - arg2 * 3, 30);
				local7.setFont(Static70.aFont1);
				local7.setColor(Color.white);
				arg0.method2662(local7, local142 + 22, (-arg0.method2681(Static47.aFontMetrics2) + 304) / 2 + local136);
			}
		} catch (@Pc(221) Exception local221) {
			Static159.aCanvas36.repaint();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBII)V")
	public static void method3426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(15) int local15 = arg2 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static144.method2915(arg1, arg0, arg4, arg2);
			}
		} else if (local15 == 0) {
			Static73.method1677(arg1, arg4, arg3, arg0);
		} else {
			@Pc(52) int local52 = (local15 << 12) / local10;
			@Pc(61) int local61 = arg1 - (local52 * arg4 >> 12);
			@Pc(69) int local69;
			@Pc(77) int local77;
			if (Static64.anInt1962 > arg3) {
				local69 = Static64.anInt1962;
				local77 = (Static64.anInt1962 * local52 >> 12) + local61;
			} else if (Static123.anInt3379 < arg3) {
				local69 = Static123.anInt3379;
				local77 = (Static123.anInt3379 * local52 >> 12) + local61;
			} else {
				local77 = arg2;
				local69 = arg3;
			}
			if (local77 < Static36.anInt1076) {
				local69 = (Static36.anInt1076 - local61 << 12) / local52;
				local77 = Static36.anInt1076;
			} else if (Static117.anInt951 < local77) {
				local69 = (Static117.anInt951 - local61 << 12) / local52;
				local77 = Static117.anInt951;
			}
			@Pc(143) int local143;
			@Pc(141) int local141;
			if (Static64.anInt1962 > arg4) {
				local143 = Static64.anInt1962;
				local141 = (local52 * Static64.anInt1962 >> 12) + local61;
			} else if (arg4 <= Static123.anInt3379) {
				local141 = arg1;
				local143 = arg4;
			} else {
				local143 = Static123.anInt3379;
				local141 = (local52 * Static123.anInt3379 >> 12) + local61;
			}
			if (Static36.anInt1076 > local141) {
				local143 = (Static36.anInt1076 - local61 << 12) / local52;
				local141 = Static36.anInt1076;
			} else if (Static117.anInt951 < local141) {
				local143 = (Static117.anInt951 - local61 << 12) / local52;
				local141 = Static117.anInt951;
			}
			Static164.method3100(local77, local141, arg0, local143, local69);
		}
	}
}
