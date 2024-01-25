import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	public static int anInt6209;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Lclient!st;")
	public static final Class314 aClass314_92 = new Class314(46, 3);

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "Lclient!st;")
	public static final Class314 aClass314_93 = new Class314(48, 7);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method5367(@OriginalArg(0) Canvas arg0) {
		@Pc(11) Dimension local11 = arg0.getSize();
		Static438.method6621(local11.height, local11.width);
		if (Static424.anInt7715 == 1) {
			Static366.aClass82_11.method6149(arg0, Static646.anInt4677, Static606.anInt9796);
		} else {
			Static366.aClass82_11.method6149(arg0, Static456.anInt7760, Static15.anInt239);
		}
	}
}
