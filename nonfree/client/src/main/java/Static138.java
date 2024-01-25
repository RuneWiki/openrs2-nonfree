import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "J")
	public static long aLong275 = -1L;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)I")
	public static int method7411() {
		@Pc(10) Class223 local10 = Static291.aClass223_42;
		synchronized (Static291.aClass223_42) {
			return Static291.aClass223_42.method4929();
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method7414(@OriginalArg(0) Class66 arg0) {
		if (Static200.anInt4239 != Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 && (Static309.aClass100ArrayArrayArray2 != null && Static455.method6426(Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101, arg0))) {
			Static200.anInt4239 = Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101;
		}
	}
}
