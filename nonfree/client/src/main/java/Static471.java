import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_82 = new Class236(48, 2);

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "[I")
	public static final int[] anIntArray628 = new int[2];

	@OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
	public static int anInt8135 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public static void method6592() {
		Static206.aClass62_24.method7041(Static497.aFloat370, Static291.aFloat253, Static477.aFloat341);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V")
	public static void method6593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass15_Sub1_3 != null) {
			local7.aClass15_Sub1_3 = null;
		}
		if (local7.aClass15_Sub1_2 != null) {
			local7.aClass15_Sub1_2 = null;
		}
	}
}
