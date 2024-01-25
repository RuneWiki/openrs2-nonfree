import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "[I")
	public static final int[] anIntArray428 = new int[14];

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "Z")
	public static boolean aBoolean486 = false;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!vk;Ljava/awt/Frame;)V")
	public static void method5509(@OriginalArg(1) Class359 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(4) Class26 local4 = arg0.method8262(arg1);
			while (local4.anInt762 == 0) {
				Static57.method1062(10L);
			}
			if (local4.anInt762 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static57.method1062(100L);
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)I")
	public static int method5510() {
		return Static244.anInt4841 == 1 ? Static326.anInt5898 : Static400.anInt7142;
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)Lclient!lda;")
	public static Class202_Sub1 method5511() {
		return Static339.aClass202_Sub1Array1.length > Static288.anInt5417 ? Static339.aClass202_Sub1Array1[Static288.anInt5417++] : null;
	}
}
