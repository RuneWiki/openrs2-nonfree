import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!th", name = "x", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_21 = new Class33(10, 2);

	@OriginalMember(owner = "client!th", name = "J", descriptor = "[I")
	public static final int[] anIntArray620 = new int[4096];

	@OriginalMember(owner = "client!th", name = "ab", descriptor = "[I")
	public static int[] anIntArray621 = new int[2];

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(II)Z")
	public static boolean method6777(@OriginalArg(0) int arg0) {
		if (arg0 == 49 || arg0 == 12 || arg0 == 22 || arg0 == 9 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 15 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZI)I")
	public static int method6779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;)V")
	public static void method6780(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(6) Graphics local6 = Static78.aCanvas7.getGraphics();
			if (Static158.aFont1 == null) {
				Static158.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static290.anInt6867, Static90.anInt2326);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			try {
				if (Static429.anImage3 == null) {
					Static429.anImage3 = Static78.aCanvas7.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static429.anImage3.getGraphics();
				local63.setColor(arg5);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg3);
				local63.fillRect(2, 2, arg0 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local63.setFont(Static158.aFont1);
				local63.setColor(arg4);
				local63.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
				local6.drawImage(Static429.anImage3, Static290.anInt6867 / 2 - 152, Static90.anInt2326 / 2 + -18, null);
			} catch (@Pc(150) Exception local150) {
				@Pc(156) int local156 = Static290.anInt6867 / 2 - 152;
				@Pc(162) int local162 = Static90.anInt2326 / 2 - 18;
				local6.setColor(arg5);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg3);
				local6.fillRect(local156 + 2, local162 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local156 + 1, local162 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local156 + 2, local162 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static158.aFont1);
				local6.setColor(arg4);
				local6.drawString(arg1, (304 - arg1.length() * 6) / 2 + local156, local162 + 22);
			}
			if (Static492.aString75 != null) {
				local6.setFont(Static158.aFont1);
				local6.setColor(arg4);
				local6.drawString(Static492.aString75, Static290.anInt6867 / 2 - Static492.aString75.length() * 6 / 2, Static90.anInt2326 / 2 - 26);
			}
		} catch (@Pc(269) Exception local269) {
			Static78.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	public static void method6783() {
		if (!Static210.aBoolean265) {
			return;
		}
		while (true) {
			while (Static538.aClass50_Sub1Array2.length > Static310.anInt5941) {
				@Pc(26) Class50_Sub1 local26 = Static538.aClass50_Sub1Array2[Static310.anInt5941];
				if (local26 != null && local26.anInt1991 == -1) {
					if (Static176.aClass1_Sub36_1 == null) {
						Static176.aClass1_Sub36_1 = Static27.aClass54_1.method1976(local26.aString11);
					}
					@Pc(49) int local49 = Static176.aClass1_Sub36_1.anInt6597;
					if (local49 == -1) {
						return;
					}
					local26.anInt1991 = local49;
					Static310.anInt5941++;
					Static176.aClass1_Sub36_1 = null;
				} else {
					Static310.anInt5941++;
				}
			}
			return;
		}
	}
}
