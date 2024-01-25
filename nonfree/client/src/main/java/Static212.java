import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!f;")
	public static Class46 aClass46_9;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public static int anInt4225 = 0;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	public static int anInt4226 = -1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method3742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 != null) {
			Static251.method4061(local7.aClass9_Sub1_Sub3_1);
			if (local7.aClass9_Sub1_Sub3_1 != null) {
				local7.aClass9_Sub1_Sub3_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method3743() {
		if (Static246.anInt4542 == 9) {
			Static113.method2374(5);
		} else if (Static246.anInt4542 == 5 || Static246.anInt4542 == 6) {
			Static113.method2374(3);
		} else if (Static246.anInt4542 == 12) {
			Static113.method2374(3);
		}
	}
}
