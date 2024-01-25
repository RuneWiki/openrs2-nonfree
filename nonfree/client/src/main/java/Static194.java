import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static194 {

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "Lclient!ri;")
	public static Class284 aClass284_60;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
	public static int anInt4231;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
	public static int anInt4230 = 0;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)I")
	public static int method3401(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "([Ljava/lang/Object;I[I)V")
	public static void method3403(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static363.method4395(arg1.length - 1, arg0, 0, arg1);
	}
}
