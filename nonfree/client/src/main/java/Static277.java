import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "Lclient!mo;")
	public static Class143 aClass143_97;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!al;")
	public static final Class11 aClass11_121 = new Class11(64);

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	public static int anInt5269 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!tm;I)V")
	public static void method4695(@OriginalArg(0) Class10_Sub3_Sub3_Sub2 arg0) {
		@Pc(16) Class14_Sub28 local16 = (Class14_Sub28) Static316.aClass25_16.method691((long) arg0.anInt5954);
		if (local16 == null) {
			Static117.method4693(arg0.anIntArray535[0], arg0, Static219.anInt4400, 0, null, null, arg0.anIntArray536[0]);
		} else {
			local16.method4729();
		}
	}
}
