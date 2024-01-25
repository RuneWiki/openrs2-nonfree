import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static200 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_62 = new Class337(3, -1);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIB)V")
	public static void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 - arg1 >= Static275.anInt4919 && Static529.anInt9089 >= arg0 + arg1 && Static554.anInt9362 <= arg3 - arg1 && arg1 + arg3 <= Static62.anInt1300) {
			Static186.method2817(arg0, arg1, arg2, arg3);
		} else {
			Static555.method8084(arg2, arg3, arg0, arg1);
		}
	}
}
