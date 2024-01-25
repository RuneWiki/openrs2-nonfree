import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!pca", name = "D", descriptor = "I")
	public static int anInt7667;

	@OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
	public static int anInt7668 = 0;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
	public static void method6861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static192.method2751(local7.aClass4_Sub2_Sub4_1);
		Static192.method2751(local7.aClass4_Sub2_Sub4_2);
		if (local7.aClass4_Sub2_Sub4_1 != null) {
			local7.aClass4_Sub2_Sub4_1 = null;
		}
		if (local7.aClass4_Sub2_Sub4_2 != null) {
			local7.aClass4_Sub2_Sub4_2 = null;
		}
	}
}
