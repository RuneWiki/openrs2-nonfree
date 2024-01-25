import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "Lclient!lia;")
	public static Class195 aClass195_1;

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
	public static int anInt9469 = 0;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
	public static int anInt9471 = 0;

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "Lclient!jt;")
	public static final Class165 aClass165_10 = new Class165("", 12);

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V")
	public static void method7712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static260.method4580(local7.aClass15_Sub1_Sub3_1);
			if (local7.aClass15_Sub1_Sub3_1 != null) {
				local7.aClass15_Sub1_Sub3_1 = null;
			}
		}
	}
}
