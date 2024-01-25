import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!be", name = "n", descriptor = "[S")
	public static final short[] aShortArray15 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!fi;")
	public static final Class65 aClass65_2 = new Class65();

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
	public static boolean aBoolean29 = true;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public static void method422() {
		Static24.aClass24_29.method608();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	public static int method423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub43 local17 = (Class3_Sub43) Static24.aClass24_29.method609((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local17.anIntArray559.length; local30++) {
				if (local17.anIntArray560[local30] == arg1) {
					local28 += local17.anIntArray559[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Color;IILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Z)V")
	public static void method424(@OriginalArg(0) Color arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(2) Graphics local2 = Static295.aCanvas4.getGraphics();
			if (Static231.aFont1 == null) {
				Static231.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static298.anInt5944, Static171.anInt3583);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static156.anImage2 == null) {
					Static156.anImage2 = Static295.aCanvas4.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static156.anImage2.getGraphics();
				local59.setColor(arg3);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg0);
				local59.fillRect(2, 2, arg1 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local59.setFont(Static231.aFont1);
				local59.setColor(arg2);
				local59.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local2.drawImage(Static156.anImage2, Static298.anInt5944 / 2 - 152, Static171.anInt3583 / 2 + -18, null);
			} catch (@Pc(138) Exception local138) {
				@Pc(144) int local144 = Static298.anInt5944 / 2 - 152;
				@Pc(150) int local150 = Static171.anInt3583 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local144 + 2, local150 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local144 + 1, local150 + 1, 301, 31);
				local2.fillRect(arg1 * 3 + local144 + 2, local150 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static231.aFont1);
				local2.setColor(arg2);
				local2.drawString(arg4, local144 + (304 - arg4.length() * 6) / 2, local150 + 22);
			}
			if (Static262.aString261 != null) {
				local2.setFont(Static231.aFont1);
				local2.setColor(arg2);
				local2.drawString(Static262.aString261, Static298.anInt5944 / 2 - Static262.aString261.length() * 6 / 2, Static171.anInt3583 / 2 + -26);
			}
		} catch (@Pc(259) Exception local259) {
			Static295.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
	public static void method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static286.anInt5771 = arg1 - Static193.anInt2349;
		Static265.anInt5321 = arg0 - Static193.anInt2354;
	}
}
