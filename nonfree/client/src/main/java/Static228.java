import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!aa;")
	public static Class2 aClass2_4;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt4243 = -1;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
	public static final int[] anIntArray424 = new int[14];

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
	public static void method3399(@OriginalArg(1) int arg0) {
		if (!Static419.method5518(arg0)) {
			return;
		}
		@Pc(14) Class89[] local14 = Static166.aClass89ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class89 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2665 = 1;
				local22.anInt2704 = 0;
				local22.anInt2661 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method3400(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg1;
			return arg0 ? Static322.method4417(local21) : local21;
		} else if (arg1 instanceof Class164) {
			@Pc(35) Class164 local35 = (Class164) arg1;
			return local35.method3655();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
	public static boolean method3401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIZ)V")
	public static void method3402(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static136.anInt2818--;
			if (Static136.anInt2818 == 0) {
				Static451.anIntArray744 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static327.anInt4704--;
		if (Static327.anInt4704 == 0) {
			Static261.anIntArray461 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;ZLjava/awt/Color;IZLjava/awt/Color;)V")
	public static void method3403(@OriginalArg(0) String arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(6) Graphics local6 = Static412.aCanvas7.getGraphics();
			if (Static30.aFont1 == null) {
				Static30.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static90.anInt1891, Static340.anInt5756);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static97.anImage3 == null) {
					Static97.anImage3 = Static412.aCanvas7.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static97.anImage3.getGraphics();
				local63.setColor(arg5);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg2);
				local63.fillRect(2, 2, arg3 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local63.setFont(Static30.aFont1);
				local63.setColor(arg1);
				local63.drawString(arg0, (304 - arg0.length() * 6) / 2, 22);
				local6.drawImage(Static97.anImage3, Static90.anInt1891 / 2 - 152, Static340.anInt5756 / 2 + -18, null);
			} catch (@Pc(155) Exception local155) {
				@Pc(161) int local161 = Static90.anInt1891 / 2 - 152;
				@Pc(167) int local167 = Static340.anInt5756 / 2 - 18;
				local6.setColor(arg5);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local161 + 2, local167 - -2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local161 + 1, local167 + 1, 301, 31);
				local6.fillRect(local161 + arg3 * 3 + 2, local167 + 2, 300 - arg3 * 3, 30);
				local6.setFont(Static30.aFont1);
				local6.setColor(arg1);
				local6.drawString(arg0, (304 - arg0.length() * 6) / 2 + local161, local167 + 22);
			}
			if (Static346.aString53 != null) {
				local6.setFont(Static30.aFont1);
				local6.setColor(arg1);
				local6.drawString(Static346.aString53, Static90.anInt1891 / 2 - Static346.aString53.length() * 6 / 2, Static340.anInt5756 / 2 - 26);
			}
		} catch (@Pc(275) Exception local275) {
			Static412.aCanvas7.repaint();
		}
	}
}
