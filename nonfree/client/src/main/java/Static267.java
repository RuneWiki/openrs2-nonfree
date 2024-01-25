import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "Lclient!ns;")
	public static Class166 aClass166_190;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "F")
	public static float aFloat135 = 1.0F;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_39 = new Class263(14, 0, 4, 1);

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	public static int anInt4770 = 0;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "[B")
	public static final byte[] aByteArray48 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;ILjava/lang/String;)V")
	public static void method3630(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4, @OriginalArg(6) String arg5) {
		try {
			@Pc(2) Graphics local2 = Static248.aCanvas5.getGraphics();
			if (Static412.aFont1 == null) {
				Static412.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static87.anInt1948, Static349.anInt6303);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static418.anImage3 == null) {
					Static418.anImage3 = Static248.aCanvas5.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static418.anImage3.getGraphics();
				local59.setColor(arg1);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg4);
				local59.fillRect(2, 2, arg0 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local59.setFont(Static412.aFont1);
				local59.setColor(arg3);
				local59.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local2.drawImage(Static418.anImage3, Static87.anInt1948 / 2 - 152, Static349.anInt6303 / 2 - 18, null);
			} catch (@Pc(146) Exception local146) {
				@Pc(152) int local152 = Static87.anInt1948 / 2 - 152;
				@Pc(158) int local158 = Static349.anInt6303 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg4);
				local2.fillRect(local152 + 2, local158 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local152 + 1, local158 - -1, 301, 31);
				local2.fillRect(local152 + arg0 * 3 + 2, local158 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static412.aFont1);
				local2.setColor(arg3);
				local2.drawString(arg5, local152 + (304 - arg5.length() * 6) / 2, local158 + 22);
			}
			if (Static59.aString18 != null) {
				local2.setFont(Static412.aFont1);
				local2.setColor(arg3);
				local2.drawString(Static59.aString18, Static87.anInt1948 / 2 - Static59.aString18.length() * 6 / 2, Static349.anInt6303 / 2 + -26);
			}
		} catch (@Pc(267) Exception local267) {
			Static248.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3631(@OriginalArg(0) String arg0) {
		if (Static76.aStringArray10 == null) {
			Static19.method434();
		}
		@Pc(22) String[] local22 = Static220.method4275('\n', arg0);
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			for (@Pc(28) int local28 = Static130.anInt2598; local28 > 0; local28--) {
				Static76.aStringArray10[local28] = Static76.aStringArray10[local28 - 1];
			}
			Static76.aStringArray10[0] = local22[local24];
			if (Static130.anInt2598 < Static76.aStringArray10.length - 1) {
				if (Static331.anInt5817 > 0) {
					Static331.anInt5817++;
				}
				Static130.anInt2598++;
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z")
	public static boolean method3633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
