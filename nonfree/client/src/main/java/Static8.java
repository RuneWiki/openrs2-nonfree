import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "J")
	public static long aLong11;

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
	public static int anInt98;

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "Lclient!um;")
	public static Class372 aClass372_1;

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_7 = new Class225(70, 28);

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "I")
	public static int anInt99 = 0;

	@OriginalMember(owner = "client!ada", name = "o", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;BLjava/lang/String;I)V")
	public static void method113(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(2) Graphics local2 = Static316.aCanvas1.getGraphics();
			if (Static300.aFont2 == null) {
				Static300.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(76) int local76;
			try {
				if (anImage1 == null) {
					anImage1 = Static316.aCanvas1.createImage(Static151.anInt7983, Static295.anInt4558);
				}
				@Pc(54) Graphics local54 = anImage1.getGraphics();
				local54.setColor(Color.black);
				local54.fillRect(0, 0, Static151.anInt7983, Static295.anInt4558);
				local76 = Static151.anInt7983 / 2 - 152;
				@Pc(82) int local82 = Static295.anInt4558 / 2 - 18;
				local54.setColor(arg1);
				local54.drawRect(local76, local82, 303, 33);
				local54.setColor(arg0);
				local54.fillRect(local76 + 2, local82 + 2, arg4 * 3, 30);
				local54.setColor(Color.black);
				local54.drawRect(local76 + 1, local82 + 1, 301, 31);
				local54.fillRect(local76 + arg4 * 3 + 2, local82 + 2, 300 - arg4 * 3, 30);
				local54.setFont(Static300.aFont2);
				local54.setColor(arg2);
				local54.drawString(arg3, local76 + (304 - arg3.length() * 6) / 2, local82 + 22);
				if (Static270.aString49 != null) {
					local54.setFont(Static300.aFont2);
					local54.setColor(arg2);
					local54.drawString(Static270.aString49, Static151.anInt7983 / 2 - Static270.aString49.length() * 6 / 2, Static295.anInt4558 / 2 - 26);
				}
				local2.drawImage(anImage1, 0, 0, (ImageObserver) null);
			} catch (@Pc(198) Exception local198) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static151.anInt7983, Static295.anInt4558);
				@Pc(213) int local213 = Static151.anInt7983 / 2 - 152;
				local76 = Static295.anInt4558 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local213, local76, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local213 + 2, local76 + 2, arg4 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local213 + 1, local76 - -1, 301, 31);
				local2.fillRect(arg4 * 3 + local213 + 2, local76 - -2, 300 - arg4 * 3, 30);
				local2.setFont(Static300.aFont2);
				local2.setColor(arg2);
				if (Static270.aString49 != null) {
					local2.setFont(Static300.aFont2);
					local2.setColor(arg2);
					local2.drawString(Static270.aString49, Static151.anInt7983 / 2 - Static270.aString49.length() * 6 / 2, Static295.anInt4558 / 2 + -26);
				}
				local2.drawString(arg3, (304 - arg3.length() * 6) / 2 + local213, local76 + 22);
			}
		} catch (@Pc(329) Exception local329) {
			Static316.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "(B)V")
	public static void method114() {
		for (@Pc(12) Class2_Sub6_Sub7 local12 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9213(); local12 != null; local12 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9212()) {
			if (local12.anInt4448 > 1) {
				local12.anInt4448 = 0;
				Static279.aClass85_31.method1745(((Class2_Sub6_Sub20) local12.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64).aLong303, 16383, local12);
				local12.aClass388_4.method9211();
			}
		}
		if (16 != 16) {
			method115(-29);
		}
		Static7.anInt82 = 0;
		Static535.anInt8486 = 0;
		Static273.aClass60_88.method1223();
		Static678.aClass218_43.method5097();
		Static416.aClass388_6.method9211();
		Static470.method6734(Static395.aClass2_Sub6_Sub20_4);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)V")
	public static void method116() {
		if (Static307.aClass264ArrayArray1 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < Static307.aClass264ArrayArray1.length; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static307.aClass264ArrayArray1[local9].length; local13++) {
				Static307.aClass264ArrayArray1[local9][local13] = Static559.aClass264_2;
			}
		}
	}
}
