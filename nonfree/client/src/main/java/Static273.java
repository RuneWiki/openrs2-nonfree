import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "I")
	public static int anInt4424;

	@OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
	public static int anInt4428;

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "I")
	public static int anInt4430;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Lclient!bga;")
	public static Class3_Sub1_Sub3 method3954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_Sub3_1;
	}
}
