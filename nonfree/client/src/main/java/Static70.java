import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!di", name = "D", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "I")
	public static int anInt1305 = -1;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "Lclient!vg;")
	public static Class250 aClass250_3 = null;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([FII)[F")
	public static float[] method1119(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static459.method2115(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
