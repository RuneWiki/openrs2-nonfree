import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
	public static int anInt6017;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_62 = new Class286(52, -1);

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_11 = new Class206(5, 4);

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZBI)V")
	public static void method5125(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub56 local10 = arg0 ? Static410.aClass3_Sub56_3 : Static267.aClass3_Sub56_2;
		if (local10 == null || arg1 < 0 || arg1 >= local10.anInt11265) {
			return;
		}
		@Pc(33) Class407 local33 = local10.aClass407Array1[arg1];
		if (local33.aByte147 != -1) {
			return;
		}
		@Pc(43) String local43 = local33.aString133;
		@Pc(46) Class400 local46 = Static81.method1057();
		@Pc(52) Class3_Sub48 local52 = Static89.method1200(Static722.aClass286_131, local46.aClass399_2);
		local52.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(local43) + 3);
		local52.aClass3_Sub28_Sub2_1.method5329(arg0 ? 1 : 0);
		local52.aClass3_Sub28_Sub2_1.method5282(arg1);
		local52.aClass3_Sub28_Sub2_1.method5283(local43);
		local46.method9223(local52);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIZI)V")
	public static void method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static373.method5411();
		Static92.aLong74 = 0L;
		@Pc(17) int local17 = Static502.method7210();
		if (arg3 == 3 || local17 == 3) {
			arg2 = true;
		}
		if (!Static488.aClass67_12.method7637()) {
			arg2 = true;
		}
		Static673.method8915(arg1, arg0, arg3, -113, arg2, local17);
	}
}
