import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "J")
	public static long aLong75;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_36 = new Class32("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public static int anInt2318 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!ae;I)V")
	public static void method2266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2) {
		@Pc(13) Class165 local13 = arg2.method83(Static111.aClass63_3);
		if (local13 == null) {
			return;
		}
		Static111.aClass63_3.method1958(arg0, arg1, arg0 + arg2.anInt101, arg1 + arg2.anInt113);
		if (Static233.anInt4156 >= 3) {
			Static111.aClass63_3.method1977(local13, arg0, arg1);
		} else {
			Static263.aClass18_19.method4561((float) arg2.anInt101 / 2.0F + (float) arg0, (float) arg1 + (float) arg2.anInt113 / 2.0F, ((int) -Static127.aFloat41 & 0x3FFF) << 2, local13, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;II)V")
	public static void method2270(@OriginalArg(0) Color arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(6) Graphics local6 = Static257.aCanvas4.getGraphics();
			if (Static72.aFont2 == null) {
				Static72.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static253.anInt4467, Static362.anInt6102);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static334.anImage3 == null) {
					Static334.anImage3 = Static257.aCanvas4.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static334.anImage3.getGraphics();
				local63.setColor(arg2);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg3);
				local63.fillRect(2, 2, arg5 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg5 * 3 + 2, 2, 300 - arg5 * 3, 30);
				local63.setFont(Static72.aFont2);
				local63.setColor(arg0);
				local63.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static334.anImage3, Static253.anInt4467 / 2 - 152, Static362.anInt6102 / 2 + -18, null);
			} catch (@Pc(147) Exception local147) {
				@Pc(153) int local153 = Static253.anInt4467 / 2 - 152;
				@Pc(159) int local159 = Static362.anInt6102 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg3);
				local6.fillRect(local153 + 2, local159 - -2, arg5 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local153 + 1, local159 - -1, 301, 31);
				local6.fillRect(arg5 * 3 + local153 + 2, local159 - -2, 300 - arg5 * 3, 30);
				local6.setFont(Static72.aFont2);
				local6.setColor(arg0);
				local6.drawString(arg4, (304 - arg4.length() * 6) / 2 + local153, local159 + 22);
			}
			if (Static72.aString54 != null) {
				local6.setFont(Static72.aFont2);
				local6.setColor(arg0);
				local6.drawString(Static72.aString54, Static253.anInt4467 / 2 - Static72.aString54.length() * 6 / 2, Static362.anInt6102 / 2 - 26);
			}
		} catch (@Pc(266) Exception local266) {
			Static257.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V")
	public static void method2272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(14) int local14 = arg4 - arg3;
		if (local14 == 0) {
			if (local10 != 0) {
				Static3.method80(arg0, arg3, arg2, arg1);
			}
		} else if (local10 == 0) {
			Static339.method4975(arg4, arg2, arg0, arg3);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(67) boolean local67 = local10 > local14;
			@Pc(71) int local71;
			@Pc(75) int local75;
			if (local67) {
				local71 = arg3;
				arg3 = arg0;
				local75 = arg4;
				arg0 = local71;
				arg4 = arg1;
				arg1 = local75;
			}
			if (arg3 > arg4) {
				local71 = arg3;
				local75 = arg0;
				arg3 = arg4;
				arg0 = arg1;
				arg4 = local71;
				arg1 = local75;
			}
			local71 = arg0;
			local75 = arg4 - arg3;
			@Pc(112) int local112 = arg1 - arg0;
			@Pc(117) int local117 = -(local75 >> 1);
			if (local112 < 0) {
				local112 = -local112;
			}
			@Pc(133) int local133 = arg1 > arg0 ? 1 : -1;
			@Pc(137) int local137;
			if (local67) {
				for (local137 = arg3; local137 <= arg4; local137++) {
					local117 += local112;
					Static15.anIntArrayArray1[local137][local71] = arg2;
					if (local117 > 0) {
						local117 -= local75;
						local71 += local133;
					}
				}
			} else {
				for (local137 = arg3; local137 <= arg4; local137++) {
					Static15.anIntArrayArray1[local71][local137] = arg2;
					local117 += local112;
					if (local117 > 0) {
						local71 += local133;
						local117 -= local75;
					}
				}
			}
		}
	}
}
