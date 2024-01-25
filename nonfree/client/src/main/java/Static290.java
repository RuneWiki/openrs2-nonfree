import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray16 = new int[2][][];

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
	public static int anInt4940 = 0;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "J")
	public static long aLong153 = 0L;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZLclient!gk;Lclient!gk;)V")
	public static void method4555(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		if (arg1.aClass28_67 != null) {
			arg1.method9276();
		}
		arg1.aClass28_67 = arg0.aClass28_67;
		arg1.aClass28_68 = arg0;
		arg1.aClass28_67.aClass28_68 = arg1;
		arg1.aClass28_68.aClass28_67 = arg1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!jp;I)Lclient!kv;")
	public static Class196 method4556(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(7) int local7 = arg0.method8632();
		@Pc(20) Class356 local20 = Static126.method2369()[arg0.method8632()];
		@Pc(29) Class56 local29 = Static398.method5612()[arg0.method8632()];
		@Pc(33) int local33 = arg0.method8589();
		@Pc(39) int local39 = arg0.method8589();
		@Pc(45) int local45 = arg0.method8593();
		@Pc(49) int local49 = arg0.method8593();
		@Pc(55) int local55 = arg0.method8618();
		@Pc(59) int local59 = arg0.method8618();
		@Pc(63) int local63 = arg0.method8618();
		@Pc(74) boolean local74 = arg0.method8632() == 1;
		return new Class196(local7, local20, local29, local33, local39, local45, local49, local55, local59, local63, local74);
	}
}
