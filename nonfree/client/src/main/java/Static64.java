import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
	public static int anInt781;

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "[Ljava/lang/Object;")
	public static Object[] anObjectArray1;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Lclient!vea;")
	public static Class60_Sub1_Sub2 method787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass60_Sub1_Sub2_1 == null ? null : local7.aClass60_Sub1_Sub2_1;
	}
}
