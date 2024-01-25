import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
	public static int anInt2446;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IBIIIII)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 - arg3 >= Static270.anInt4759 && Static162.anInt2935 >= arg0 + arg3 && arg2 - arg3 >= Static514.anInt8722 && Static451.anInt7775 >= arg2 + arg3) {
			Static531.method7295(arg3, arg2, arg1, arg5, arg4, arg0);
		} else {
			Static48.method744(arg1, arg5, arg3, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZIBI)I")
	public static int method1926(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub25 local8 = Static189.method2917(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray328.length) {
			return local8.anIntArray328[arg2];
		} else {
			return -1;
		}
	}
}
