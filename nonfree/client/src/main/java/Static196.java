import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_64 = new Class186(20, 7);

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Lclient!uk;")
	public static final Class290 aClass290_2 = new Class290(128);

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "J")
	public static long aLong112 = -1L;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method3648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass47_Sub3_1 != null) {
			local7.aClass47_Sub3_1 = null;
		}
	}
}
