import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!gaa;I)V")
	public static void method3446(@OriginalArg(0) Class108 arg0) {
		@Pc(7) Class108 local7 = Static200.method3945(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static256.anInt5669;
			local12 = Static114.anInt2970;
		} else {
			local12 = local7.anInt4067;
			local15 = local7.anInt4037;
		}
		Static510.method7402(false, local15, arg0, local12);
		Static259.method4852(local12, local15, arg0);
	}
}
