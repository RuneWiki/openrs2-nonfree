import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!uh", name = "pb", descriptor = "I")
	public static int anInt8353;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_59 = new Class316(4);

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
	public static int anInt8330 = 0;

	@OriginalMember(owner = "client!uh", name = "Cb", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_130 = new Class6(24, 7);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!vp;B)Lclient!vp;")
	public static Class309 method7056(@OriginalArg(0) Class309 arg0) {
		if (arg0.anInt8764 != -1) {
			return Static80.method2005(arg0.anInt8764);
		}
		@Pc(18) int local18 = arg0.anInt8750 >>> 16;
		@Pc(28) Class230 local28 = new Class230(Static484.aClass174_32);
		for (@Pc(33) Class1_Sub5 local33 = (Class1_Sub5) local28.method5700(); local33 != null; local33 = (Class1_Sub5) local28.method5702()) {
			if (local18 == local33.anInt1389) {
				return Static80.method2005((int) local33.aLong244);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!lp;I)V")
	public static void method7067(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class182 arg1) {
		while (true) {
			@Pc(8) Class243 local8 = arg1.method4805(arg0);
			while (local8.anInt6905 == 0) {
				Static505.method7295(10L);
			}
			if (local8.anInt6905 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static505.method7295(100L);
		}
	}
}
