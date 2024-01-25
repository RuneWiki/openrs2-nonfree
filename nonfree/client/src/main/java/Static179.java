import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!nm;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public static int anInt3943 = -1;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
	public static void method3343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass2_Sub1_1 != null) {
			local7.aClass2_Sub1_1 = null;
		}
		if (local7.aClass2_Sub1_2 != null) {
			local7.aClass2_Sub1_2 = null;
		}
	}
}
