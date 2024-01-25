import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!vj;I)V")
	public static void method3290(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class206 arg1) {
		while (true) {
			@Pc(12) Class196 local12 = arg1.method5513(arg0);
			while (local12.anInt5851 == 0) {
				Static278.method5283(10L);
			}
			if (local12.anInt5851 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static278.method5283(100L);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)I")
	public static int method3291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)V")
	public static void method3292() {
		if (Static176.aBoolean237 && Static354.aBooleanArray30[81] && Static256.anInt4749 > 2) {
			Static142.method2686((Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247.aClass6_247);
		} else {
			Static142.method2686((Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247);
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
	public static void method3293() {
		Static47.aClass70_23.method1399();
	}
}
