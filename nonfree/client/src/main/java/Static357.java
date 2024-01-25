import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "Lclient!ij;")
	public static Class93 aClass93_140;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "[I")
	public static final int[] anIntArray646 = new int[13];

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "[I")
	public static final int[] anIntArray647 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)Lclient!sg;")
	public static Class54 method6057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(45) long local45 = (long) arg4 * 76724863L ^ (long) arg3 * 986053L ^ (long) arg1 * 67481L ^ (long) arg0 * 97549L ^ (long) arg5 * 475427L ^ (long) arg2 * 32147369L;
		@Pc(51) Class54 local51 = (Class54) Static167.aClass109_37.method2857(local45);
		if (local51 == null) {
			local51 = Static291.aClass55_11.method5238(arg1, arg0, arg5, arg3, arg2, arg4);
			Static167.aClass109_37.method2855(local45, local51);
			return local51;
		} else {
			return local51;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/lang/String;Ljava/awt/Color;ILjava/awt/Color;B)V")
	public static void method6058(@OriginalArg(0) Color arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static102.aCanvas3.getGraphics();
			if (Static77.aFont1 == null) {
				Static77.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static168.anInt3376, Static256.anInt5066);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static149.anImage3 == null) {
					Static149.anImage3 = Static102.aCanvas3.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static149.anImage3.getGraphics();
				local59.setColor(arg5);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg3);
				local59.fillRect(2, 2, arg4 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
				local59.setFont(Static77.aFont1);
				local59.setColor(arg0);
				local59.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
				local2.drawImage(Static149.anImage3, Static168.anInt3376 / 2 - 152, Static256.anInt5066 / 2 + -18, null);
			} catch (@Pc(139) Exception local139) {
				@Pc(145) int local145 = Static168.anInt3376 / 2 - 152;
				@Pc(151) int local151 = Static256.anInt5066 / 2 - 18;
				local2.setColor(arg5);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg3);
				local2.fillRect(local145 + 2, local151 - -2, arg4 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local145 + 1, local151 - -1, 301, 31);
				local2.fillRect(local145 + arg4 * 3 + 2, local151 - -2, 300 - arg4 * 3, 30);
				local2.setFont(Static77.aFont1);
				local2.setColor(arg0);
				local2.drawString(arg2, local145 + (304 - arg2.length() * 6) / 2, local151 + 22);
			}
			if (Static257.aString51 != null) {
				local2.setFont(Static77.aFont1);
				local2.setColor(arg0);
				local2.drawString(Static257.aString51, Static168.anInt3376 / 2 - Static257.aString51.length() * 6 / 2, Static256.anInt5066 / 2 + -26);
			}
		} catch (@Pc(259) Exception local259) {
			Static102.aCanvas3.repaint();
		}
	}
}
