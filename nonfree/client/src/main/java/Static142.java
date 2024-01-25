import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "Lclient!dda;")
	public static Class53 aClass53_43;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
	public static int anInt2630 = 0;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_63 = new Class239(96, 20);

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "[I")
	public static final int[] anIntArray333 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
	public static void method2486() {
		if (Static281.aClass104_1 != null) {
			Static281.aClass104_1.method7816();
		}
		if (Static465.aClass104_2 != null) {
			Static465.aClass104_2.method7816();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIII)I")
	public static int method2488(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub16 local13 = Static218.method3456(arg0, arg1);
		if (local13 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local13.anIntArray129.length) {
			return local13.anIntArray129[arg2];
		} else {
			return 0;
		}
	}
}
