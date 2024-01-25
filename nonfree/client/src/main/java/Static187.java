import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public static int anInt3419;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Z")
	public static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBZI)I")
	public static int method2928(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub32 local8 = Static457.method6232(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray274.length) {
			return local8.anIntArray274[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
	public static void method2929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(12, arg1);
		local8.method1003();
		local8.anInt972 = arg0;
	}
}
