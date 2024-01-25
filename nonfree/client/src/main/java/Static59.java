import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bu", name = "Q", descriptor = "I")
	public static int anInt912 = 0;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V")
	public static void method813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static81.method1222(local7.aClass28_Sub1_Sub3_2);
		Static81.method1222(local7.aClass28_Sub1_Sub3_1);
		if (local7.aClass28_Sub1_Sub3_2 != null) {
			local7.aClass28_Sub1_Sub3_2 = null;
		}
		if (local7.aClass28_Sub1_Sub3_1 != null) {
			local7.aClass28_Sub1_Sub3_1 = null;
		}
	}
}
