import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
	public static int anInt3439;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "Lclient!qa;")
	public static Class128 aClass128_22;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
	public static void method2838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass20_Sub1_2 != null) {
			local7.aClass20_Sub1_2 = null;
		}
		if (local7.aClass20_Sub1_3 != null) {
			local7.aClass20_Sub1_3 = null;
		}
	}
}
