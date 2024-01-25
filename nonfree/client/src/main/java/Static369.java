import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "Lclient!ada;")
	public static Class3_Sub3 aClass3_Sub3_2;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_6 = new Class123(2, 4, 4, 0);

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "[I")
	public static final int[] anIntArray414 = new int[8];

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
	public static int anInt5763 = -1;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5071(@OriginalArg(0) String arg0) {
		if (Static547.aStringArray37 == null) {
			Static8.method250();
		}
		Static214.aCalendar1.setTime(new Date(Static517.method6965()));
		@Pc(22) int local22 = Static214.aCalendar1.get(11);
		@Pc(26) int local26 = Static214.aCalendar1.get(12);
		@Pc(30) int local30 = Static214.aCalendar1.get(13);
		@Pc(64) String local64 = Integer.toString(local22 / 10) + local22 % 10 + ":" + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
		@Pc(69) String[] local69 = Static104.method2099(arg0, '\n');
		for (@Pc(71) int local71 = 0; local71 < local69.length; local71++) {
			for (@Pc(75) int local75 = Static181.anInt3158; local75 > 0; local75--) {
				Static547.aStringArray37[local75] = Static547.aStringArray37[local75 - 1];
			}
			Static547.aStringArray37[0] = local64 + ": " + local69[local71];
			if (Static568.aFileOutputStream1 != null) {
				try {
					Static568.aFileOutputStream1.write(Static85.method1867(Static547.aStringArray37[0] + "\n"));
				} catch (@Pc(130) IOException local130) {
				}
			}
			if (Static547.aStringArray37.length - 1 > Static181.anInt3158) {
				Static181.anInt3158++;
				if (Static630.anInt9714 > 0) {
					Static630.anInt9714++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class9_Sub7 local6 = (Class9_Sub7) Static291.aClass319_4.method7195(); local6 != null; local6 = (Class9_Sub7) Static291.aClass319_4.method7188()) {
			if (Static716.anInt11157 >= local6.anInt8208) {
				local6.method9182();
			} else {
				Static454.method6013(local6.anInt8214 * 2, local6.anInt8210, (local6.anInt8209 << 9) + 256, arg3 >> 1, (local6.anInt8211 << 9) + 256, arg1 >> 1);
				Static561.aClass57_10.method9146(Static143.anIntArray165[0] + arg2, arg0 - -Static143.anIntArray165[1], local6.anInt8212 | 0xFF000000, local6.aString102, 0);
			}
		}
		if (-44 != -44) {
			aClass3_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;BILjava/awt/Color;)V")
	public static void method5075(@OriginalArg(0) String arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static508.aCanvas8.getGraphics();
			if (Static256.aFont2 == null) {
				Static256.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(76) int local76;
			try {
				if (Static565.anImage13 == null) {
					Static565.anImage13 = Static508.aCanvas8.createImage(Static681.anInt10652, Static76.anInt1720);
				}
				@Pc(61) Graphics local61 = Static565.anImage13.getGraphics();
				local61.setColor(Color.black);
				local61.fillRect(0, 0, Static681.anInt10652, Static76.anInt1720);
				local76 = Static681.anInt10652 / 2 - 152;
				@Pc(82) int local82 = Static76.anInt1720 / 2 - 18;
				local61.setColor(arg1);
				local61.drawRect(local76, local82, 303, 33);
				local61.setColor(arg4);
				local61.fillRect(local76 + 2, local82 - -2, arg3 * 3, 30);
				local61.setColor(Color.black);
				local61.drawRect(local76 + 1, local82 + 1, 301, 31);
				local61.fillRect(local76 + arg3 * 3 + 2, local82 + 2, 300 - arg3 * 3, 30);
				local61.setFont(Static256.aFont2);
				local61.setColor(arg2);
				local61.drawString(arg0, local76 + (304 - arg0.length() * 6) / 2, local82 + 22);
				if (Static310.aString61 != null) {
					local61.setFont(Static256.aFont2);
					local61.setColor(arg2);
					local61.drawString(Static310.aString61, Static681.anInt10652 / 2 - Static310.aString61.length() * 6 / 2, Static76.anInt1720 / 2 + -26);
				}
				local2.drawImage(Static565.anImage13, 0, 0, (ImageObserver) null);
			} catch (@Pc(199) Exception local199) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static681.anInt10652, Static76.anInt1720);
				@Pc(214) int local214 = Static681.anInt10652 / 2 - 152;
				local76 = Static76.anInt1720 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local214, local76, 303, 33);
				local2.setColor(arg4);
				local2.fillRect(local214 + 2, local76 - -2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local214 + 1, local76 + 1, 301, 31);
				local2.fillRect(local214 + arg3 * 3 + 2, local76 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static256.aFont2);
				local2.setColor(arg2);
				if (Static310.aString61 != null) {
					local2.setFont(Static256.aFont2);
					local2.setColor(arg2);
					local2.drawString(Static310.aString61, Static681.anInt10652 / 2 - Static310.aString61.length() * 6 / 2, Static76.anInt1720 / 2 + -26);
				}
				local2.drawString(arg0, local214 + (304 - arg0.length() * 6) / 2, local76 + 22);
			}
		} catch (@Pc(329) Exception local329) {
			Static508.aCanvas8.repaint();
		}
	}
}
