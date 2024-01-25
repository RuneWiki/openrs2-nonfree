import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "Lclient!gh;")
	public static final Class131 aClass131_12 = new Class131(2, 4, 4, 0);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;IILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method5357(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static141.aCanvas7.getGraphics();
			if (Static137.aFont1 == null) {
				Static137.aFont1 = new Font("Helvetica", 1, 13);
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
			@Pc(67) int local67;
			try {
				if (Static336.anImage13 == null) {
					Static336.anImage13 = Static141.aCanvas7.createImage(Static32.anInt510, Static79.anInt1140);
				}
				@Pc(52) Graphics local52 = Static336.anImage13.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static32.anInt510, Static79.anInt1140);
				local67 = Static32.anInt510 / 2 - 152;
				@Pc(73) int local73 = Static79.anInt1140 / 2 - 18;
				local52.setColor(arg4);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg3);
				local52.fillRect(local67 + 2, local73 - -2, arg1 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 - -1, 301, 31);
				local52.fillRect(arg1 * 3 + local67 + 2, local73 + 2, 300 - arg1 * 3, 30);
				local52.setFont(Static137.aFont1);
				local52.setColor(arg2);
				local52.drawString(arg0, (304 - arg0.length() * 6) / 2 + local67, local73 + 22);
				if (Static516.aString84 != null) {
					local52.setFont(Static137.aFont1);
					local52.setColor(arg2);
					local52.drawString(Static516.aString84, Static32.anInt510 / 2 - Static516.aString84.length() * 6 / 2, Static79.anInt1140 / 2 + -26);
				}
				local6.drawImage(Static336.anImage13, 0, 0, (ImageObserver) null);
			} catch (@Pc(192) Exception local192) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static32.anInt510, Static79.anInt1140);
				@Pc(207) int local207 = Static32.anInt510 / 2 - 152;
				local67 = Static79.anInt1140 / 2 - 18;
				local6.setColor(arg4);
				local6.drawRect(local207, local67, 303, 33);
				local6.setColor(arg3);
				local6.fillRect(local207 + 2, local67 - -2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local207 + 1, local67 + 1, 301, 31);
				local6.fillRect(local207 + arg1 * 3 + 2, local67 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static137.aFont1);
				local6.setColor(arg2);
				if (Static516.aString84 != null) {
					local6.setFont(Static137.aFont1);
					local6.setColor(arg2);
					local6.drawString(Static516.aString84, Static32.anInt510 / 2 - Static516.aString84.length() * 6 / 2, Static79.anInt1140 / 2 - 26);
				}
				local6.drawString(arg0, (304 - arg0.length() * 6) / 2 + local207, local67 + 22);
			}
		} catch (@Pc(322) Exception local322) {
			Static141.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V")
	public static void method5358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static168.anInt3361; local5++) {
			@Pc(10) Rectangle local10 = Class12_Sub8.aRectangleArray1[local5];
			if (arg0 < local10.x + local10.width && local10.x < arg3 + arg0 && arg2 < local10.y + local10.height && arg1 + arg2 > local10.y) {
				Static57.aBooleanArray2[local5] = true;
			}
		}
		Static520.method7366(arg0, arg1 + arg2, arg2, arg0 + arg3);
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	public static synchronized void method5360() {
		if (Static120.anObject6 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(24) Object local24 = local14.invoke((Object) null, (Object[]) null);
			@Pc(57) Method local57 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static120.anObject6 = local57.invoke((Object) null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}
