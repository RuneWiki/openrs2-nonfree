import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static571 {

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "Lclient!vd;")
	public static Class353 aClass353_126;

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_90 = new Class208(56, 4);

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)V")
	public static void method8292(@OriginalArg(0) int arg0) {
		if (Static578.method5705(arg0)) {
			Static502.method7484(Static605.aClass302ArrayArray4[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
	public static void method8295(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static155.method2437(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)Z")
	public static boolean method8296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
