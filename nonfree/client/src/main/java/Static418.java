import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	public static int anInt7212;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_264 = new Class184(79, -2);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	public static int anInt7207 = 0;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_239 = new Class92(23, 2);

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static int anInt7210 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
	public static void method5597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub3_Sub7 local12 = Static139.method2522(12, arg0);
		local12.method1570();
		local12.anInt1933 = arg1;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method5598() {
		if (Static108.anInt3455 == 5) {
			Static108.anInt3455 = 6;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg3) {
			Static393.method5311(arg3, arg5, arg6, arg1, arg2, arg0);
		} else if (arg1 - arg3 >= Static142.anInt3212 && Static450.anInt7594 >= arg3 + arg1 && Static161.anInt3448 <= arg2 - arg4 && arg4 + arg2 <= Static163.anInt3488) {
			Static35.method4615(arg6, arg0, arg3, arg5, arg2, arg4, arg1);
		} else {
			Static175.method3705(arg6, arg1, arg0, arg3, arg5, arg2, arg4);
		}
	}
}
