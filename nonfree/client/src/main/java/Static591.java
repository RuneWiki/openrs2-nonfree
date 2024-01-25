import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method8208(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static438.method6621(local6.height, local6.width);
		if (Static424.anInt7715 == 1) {
			Static366.aClass82_11.method6123(arg0, Static646.anInt4677, Static606.anInt9796);
		} else {
			Static366.aClass82_11.method6123(arg0, Static456.anInt7760, Static15.anInt239);
		}
	}
}
