import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
	public static final int[] anIntArray474 = new int[250];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIBIIII)V")
	public static void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg5) {
			Static329.method3597(arg0, arg3, arg6, arg1, arg5, arg4);
		} else if (arg1 - arg5 >= Static5.anInt2965 && arg1 + arg5 <= Static220.anInt6565 && Static349.anInt6619 <= arg6 - arg2 && arg6 + arg2 <= Static195.anInt4097) {
			Static301.method4955(arg1, arg6, arg2, arg4, arg3, arg0, arg5);
		} else {
			Static312.method5143(arg2, arg5, arg3, arg0, arg1, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!ml;I)V")
	public static void method5120(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class134 arg1) {
		while (true) {
			@Pc(6) Class185 local6 = arg1.method3755(arg0);
			while (local6.anInt5682 == 0) {
				Static249.method4396(10L);
			}
			if (local6.anInt5682 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static249.method4396(100L);
		}
	}
}
