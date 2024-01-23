import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!va", name = "w", descriptor = "[I")
	public static int[] anIntArray508;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	public static int anInt5345;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "I")
	public static int anInt5342 = 0;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "I")
	public static int anInt5344 = 1;

	@OriginalMember(owner = "client!va", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString311 = "Loading wordpack - ";

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!gk;")
	public static Class1_Sub2_Sub10 method4179(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub10 local10 = (Class1_Sub2_Sub10) Static108.aClass135_10.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static232.method3600(Static26.aClass91_28, Static260.aClass91_207, arg0);
		if (local10 != null) {
			Static108.aClass135_10.method3321((long) arg0, local10);
		}
		return local10;
	}
}
