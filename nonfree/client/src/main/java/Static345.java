import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!vn", name = "N", descriptor = "Lclient!lo;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!vn", name = "V", descriptor = "Lclient!lm;")
	public static Class2_Sub24 aClass2_Sub24_1;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V", line = 135)
	public static void method6247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass11_Sub2_2 != null) {
			local7.aClass11_Sub2_2 = null;
		}
	}
}
