import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static472 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!nd;")
	public static final Class214 aClass214_4 = new Class214();

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIZ)V")
	public static void method6553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 - arg2 >= Static529.anInt9806 && Static205.anInt3906 >= arg2 + arg0 && arg3 - arg2 >= Static133.anInt2531 && Static52.anInt1226 >= arg2 + arg3) {
			Static288.method6403(arg0, arg1, arg2, arg3);
		} else {
			Static260.method3994(arg1, arg0, arg2, arg3);
		}
	}
}
