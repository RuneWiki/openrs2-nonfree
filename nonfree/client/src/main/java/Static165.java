import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)Lclient!pj;")
	public static Class25_Sub1 method2380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub1_2;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([Ljava/lang/Object;[JB)V")
	public static void method2381(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static109.method3822(arg0, arg1.length - 1, arg1, 0);
	}
}
