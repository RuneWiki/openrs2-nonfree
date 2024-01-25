import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	public static int anInt9609;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
	public static int anInt9615;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
	public static int anInt9619;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "[I")
	public static final int[] anIntArray734 = new int[6];

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "[I")
	public static final int[] anIntArray735 = new int[200];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLclient!vq;)V")
	public static void method7837(@OriginalArg(1) Class8_Sub3_Sub3_Sub1 arg0) {
		if (arg0 instanceof Class8_Sub3_Sub3_Sub1_Sub2) {
			@Pc(39) Class8_Sub3_Sub3_Sub1_Sub2 local39 = (Class8_Sub3_Sub3_Sub1_Sub2) arg0;
			if (local39.aClass20_1 == null) {
				return;
			}
			Static331.method4533(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 != local39.aByte123, local39);
		} else if (arg0 instanceof Class8_Sub3_Sub3_Sub1_Sub1) {
			@Pc(20) Class8_Sub3_Sub3_Sub1_Sub1 local20 = (Class8_Sub3_Sub3_Sub1_Sub1) arg0;
			Static185.method2597(local20.aByte123 != Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, local20);
			return;
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V")
	public static void method7839() {
		if (Static216.anInt4135 == 7) {
			Static424.method5868(false);
		} else {
			Static91.aClass149_1 = Static568.aClass149_2;
			Static568.aClass149_2 = null;
			Static426.method5887(13);
		}
	}
}
