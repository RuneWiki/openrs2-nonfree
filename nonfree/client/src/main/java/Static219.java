import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "[I")
	public static final int[] anIntArray345 = new int[32];

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLjava/awt/Frame;Lclient!tt;)V")
	public static void method3486(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class313 arg1) {
		while (true) {
			@Pc(6) Class224 local6 = arg1.method6981(arg0);
			while (local6.anInt6632 == 0) {
				Static183.method3079(10L);
			}
			if (local6.anInt6632 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static183.method3079(100L);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method3491(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0.charAt(local10) == arg1) {
				local5++;
			}
		}
		return local5;
	}
}
