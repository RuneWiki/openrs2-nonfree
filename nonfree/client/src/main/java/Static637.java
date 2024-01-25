import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
	public static int anInt8890;

	@OriginalMember(owner = "client!tv", name = "G", descriptor = "[Ljava/lang/Object;")
	public static Object[] anObjectArray39;

	@OriginalMember(owner = "client!tv", name = "N", descriptor = "[I")
	public static final int[] anIntArray647 = new int[256];

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "[I")
	public static final int[] anIntArray648 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!tv", name = "L", descriptor = "Lclient!dc;")
	public static final Class72 aClass72_24 = new Class72();

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "[I")
	public static final int[] anIntArray649 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZI)I")
	public static int method7548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(33) byte local33;
		if (arg1 > 20000) {
			Static542.method7186();
			local33 = 4;
		} else if (arg1 > 10000) {
			Static71.method1572();
			local33 = 3;
		} else if (arg1 <= 5000) {
			Static274.method3861();
			local33 = 1;
		} else {
			local33 = 2;
			Static719.method6597();
		}
		if (arg0 != Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620()) {
			Static580.aClass3_Sub22_24.method2423(arg0, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
			Static36.method1127(false, arg0);
		}
		Static124.method2284();
		return local33;
	}
}
