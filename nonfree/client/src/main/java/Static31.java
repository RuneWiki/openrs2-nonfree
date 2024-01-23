import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
	public static int anInt704 = 7759444;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method538(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static103.aClass50_2);
		arg0.addMouseMotionListener(Static103.aClass50_2);
		arg0.addFocusListener(Static103.aClass50_2);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIILclient!ij;IJIIII)Z")
	public static boolean method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static14.method277(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method540() {
		Static204.aClass53_26.method1498();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	public static void method542() {
		Static50.aClass53_9.method1496(5);
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	public static void method543() {
		Static23.aClass102_3 = new Class102(32);
	}
}
