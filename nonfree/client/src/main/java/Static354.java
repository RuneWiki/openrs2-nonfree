import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lclient!nh;")
	public static Class226 aClass226_4;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "[I")
	public static final int[] anIntArray338 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIII)V")
	public static void method5252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class3_Sub42 local6 = Static366.method5366();
		local6.aClass3_Sub11_Sub1_1.method5213(Static546.aClass224_7.anInt6213);
		local6.aClass3_Sub11_Sub1_1.method5213(arg1);
		local6.aClass3_Sub11_Sub1_1.method5213(arg0);
		local6.aClass3_Sub11_Sub1_1.method5200(arg3);
		local6.aClass3_Sub11_Sub1_1.method5200(arg2);
		Static511.method6885(local6);
		Static300.anInt5105 = 0;
		Static230.anInt4042 = 0;
		Static479.anInt8303 = -3;
		Static126.anInt2887 = 1;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
	public static void method5253() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static488.anInt7961 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(40) Exception local40) {
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "([BI)V")
	public static void method5254(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		while (true) {
			@Pc(17) int local17 = local8.method5175();
			if (local17 == 0) {
				return;
			}
			if (local17 == 2) {
				Static359.anInt6489 = local8.method5198();
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZ)Z")
	public static boolean method5255(@OriginalArg(0) int arg0) {
		if (arg0 == 47 || arg0 == 45 || arg0 == 46 || arg0 == 60 || arg0 == 9) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;ZILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method5257(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static387.aCanvas9.getGraphics();
			if (Static481.aFont2 == null) {
				Static481.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(72) int local72;
			try {
				if (Static50.anImage1 == null) {
					Static50.anImage1 = Static387.aCanvas9.createImage(Static40.anInt758, Static308.anInt5171);
				}
				@Pc(57) Graphics local57 = Static50.anImage1.getGraphics();
				local57.setColor(Color.black);
				local57.fillRect(0, 0, Static40.anInt758, Static308.anInt5171);
				local72 = Static40.anInt758 / 2 - 152;
				@Pc(78) int local78 = Static308.anInt5171 / 2 - 18;
				local57.setColor(arg4);
				local57.drawRect(local72, local78, 303, 33);
				local57.setColor(arg3);
				local57.fillRect(local72 + 2, local78 - -2, arg1 * 3, 30);
				local57.setColor(Color.black);
				local57.drawRect(local72 + 1, local78 + 1, 301, 31);
				local57.fillRect(arg1 * 3 + local72 + 2, local78 + 2, 300 - arg1 * 3, 30);
				local57.setFont(Static481.aFont2);
				local57.setColor(arg2);
				local57.drawString(arg0, local72 + (304 - arg0.length() * 6) / 2, local78 + 22);
				if (Static285.aString33 != null) {
					local57.setFont(Static481.aFont2);
					local57.setColor(arg2);
					local57.drawString(Static285.aString33, Static40.anInt758 / 2 - Static285.aString33.length() * 6 / 2, Static308.anInt5171 / 2 - 26);
				}
				local6.drawImage(Static50.anImage1, 0, 0, null);
			} catch (@Pc(194) Exception local194) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static40.anInt758, Static308.anInt5171);
				@Pc(209) int local209 = Static40.anInt758 / 2 - 152;
				local72 = Static308.anInt5171 / 2 - 18;
				local6.setColor(arg4);
				local6.drawRect(local209, local72, 303, 33);
				local6.setColor(arg3);
				local6.fillRect(local209 + 2, local72 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local209 + 1, local72 + 1, 301, 31);
				local6.fillRect(local209 + arg1 * 3 + 2, local72 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static481.aFont2);
				local6.setColor(arg2);
				if (Static285.aString33 != null) {
					local6.setFont(Static481.aFont2);
					local6.setColor(arg2);
					local6.drawString(Static285.aString33, Static40.anInt758 / 2 - Static285.aString33.length() * 6 / 2, Static308.anInt5171 / 2 + -26);
				}
				local6.drawString(arg0, local209 + (304 - arg0.length() * 6) / 2, local72 + 22);
			}
		} catch (@Pc(324) Exception local324) {
			Static387.aCanvas9.repaint();
		}
	}
}
