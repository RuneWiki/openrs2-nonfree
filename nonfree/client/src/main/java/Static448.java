import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!da;")
	public static Class38 aClass38_10;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!ad;")
	public static final Class7 aClass7_6 = new Class7();

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method6505(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static68.aCanvas2.getGraphics();
			if (Static657.aFont1 == null) {
				Static657.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static350.anImage3 == null) {
					Static350.anImage3 = Static68.aCanvas2.createImage(Static561.anInt9759, Static639.anInt10685);
				}
				@Pc(48) Graphics local48 = Static350.anImage3.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static561.anInt9759, Static639.anInt10685);
				local63 = Static561.anInt9759 / 2 - 152;
				@Pc(69) int local69 = Static639.anInt10685 / 2 - 18;
				local48.setColor(arg3);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg2);
				local48.fillRect(local63 + 2, local69 + 2, arg1 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(arg1 * 3 + local63 + 2, local69 + 2, 300 - arg1 * 3, 30);
				local48.setFont(Static657.aFont1);
				local48.setColor(arg4);
				local48.drawString(arg0, local63 + (304 - arg0.length() * 6) / 2, local69 + 22);
				if (Static343.aString67 != null) {
					local48.setFont(Static657.aFont1);
					local48.setColor(arg4);
					local48.drawString(Static343.aString67, Static561.anInt9759 / 2 - Static343.aString67.length() * 6 / 2, Static639.anInt10685 / 2 - 26);
				}
				local2.drawImage(Static350.anImage3, 0, 0, (ImageObserver) null);
			} catch (@Pc(183) Exception local183) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static561.anInt9759, Static639.anInt10685);
				@Pc(198) int local198 = Static561.anInt9759 / 2 - 152;
				local63 = Static639.anInt10685 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local198, local63, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local198 + 2, local63 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local198 + 1, local63 + 1, 301, 31);
				local2.fillRect(arg1 * 3 + local198 + 2, local63 - -2, 300 - arg1 * 3, 30);
				local2.setFont(Static657.aFont1);
				local2.setColor(arg4);
				if (Static343.aString67 != null) {
					local2.setFont(Static657.aFont1);
					local2.setColor(arg4);
					local2.drawString(Static343.aString67, Static561.anInt9759 / 2 - Static343.aString67.length() * 6 / 2, Static639.anInt10685 / 2 + -26);
				}
				local2.drawString(arg0, (304 - arg0.length() * 6) / 2 + local198, local63 - -22);
			}
		} catch (@Pc(311) Exception local311) {
			Static68.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBILclient!mea;ILclient!ha;)V")
	public static void method6507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class230 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4) {
		for (@Pc(7) int local7 = 7; local7 >= 0; local7--) {
			for (@Pc(11) int local11 = 127; local11 >= 0; local11--) {
				@Pc(29) int local29 = (arg1 & 0x3F) << 10 | (local7 & 0x7) << 7 | local11 & 0x7F;
				Static479.method7114(true, false);
				@Pc(37) int local37 = Static659.anIntArray816[local29];
				Static349.method5327(true, false);
				arg4.aa(arg0 + (local11 * arg2.anInt6703 >> 7), arg3 + (arg2.anInt6701 * (7 - local7) >> 3), (arg2.anInt6703 >> 7) + 1, (arg2.anInt6701 >> 3) + 1, local37, 0);
			}
		}
	}
}
