import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_10 = new Class181(0, 4);

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_157 = new Class81(40, -2);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLclient!io;)Lclient!qm;")
	public static Class78_Sub4 method5564(@OriginalArg(1) Class1_Sub20 arg0) {
		return new Class78_Sub4(arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4396(), arg0.method4396(), arg0.method4393());
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Lclient!ia;")
	public static Class20_Sub2_Sub2 method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub2_Sub2_2;
	}
}
