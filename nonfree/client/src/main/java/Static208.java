import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!ne;")
	public static final Class166 aClass166_5 = new Class166("WTRC", 1);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
	public static boolean method2802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static186.method3972(arg1, arg0) || Static359.method4652(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static399.method5010(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!ji;Ljava/awt/Frame;)V")
	public static void method2803(@OriginalArg(1) Class124 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class215 local6 = arg0.method2525(arg1);
			while (local6.anInt5791 == 0) {
				Static252.method2874(10L);
			}
			if (local6.anInt5791 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static252.method2874(100L);
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(III)I")
	public static int method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(25) int local25 = ((arg0 & 0xFF00) * local7 & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return local25 + (((arg1 & 0xFF00FF) * local30 & 0xFF00FF00 | (arg1 & 0xFF00) * local30 & 0xFF0000) >>> 8);
	}
}
