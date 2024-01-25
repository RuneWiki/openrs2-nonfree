import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_9 = new Class136(260);

	@OriginalMember(owner = "client!bha", name = "r", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIII)V")
	public static void method733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 * Static32.aClass3_Sub41_3.aClass7_Sub15_1.method5663() >> 8;
		if (arg0 == -1 && !Static145.aBoolean263) {
			Static70.method1243();
		} else if (arg0 != -1 && (Static573.anInt6752 != arg0 || !Static291.method4809()) && local8 != 0 && !Static145.aBoolean263) {
			Static481.method7113(Static521.aClass343_238, arg1, arg0, local8);
			Static612.method8364();
		}
		if (Static573.anInt6752 != arg0) {
			Static267.aClass3_Sub3_Sub1_2 = null;
		}
		Static573.anInt6752 = arg0;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)Z")
	public static boolean method735() {
		if (Static349.aClass3_Sub7_Sub19_36 == null) {
			return false;
		} else {
			if (Static349.aClass3_Sub7_Sub19_36.anInt8564 >= 2000) {
				Static349.aClass3_Sub7_Sub19_36.anInt8564 -= 2000;
			}
			return Static349.aClass3_Sub7_Sub19_36.anInt8564 == 1002;
		}
	}
}
