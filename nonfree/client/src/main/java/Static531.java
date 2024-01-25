import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public static int anInt8928;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
	public static int anInt8934 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public static void method7353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass49_Sub3_1 != null) {
			local7.aClass49_Sub3_1 = null;
		}
		if (local7.aClass49_Sub3_2 != null) {
			local7.aClass49_Sub3_2 = null;
		}
	}
}
