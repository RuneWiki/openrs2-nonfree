import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!dg;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!oca;")
	public static final Class237 aClass237_9 = new Class237();

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "[I")
	public static final int[] anIntArray515 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!uc;")
	public static final Class3_Sub47 aClass3_Sub47_1 = new Class3_Sub47(0, 0);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public static void method6917(@OriginalArg(1) int arg0) {
		Static86.method1926();
		@Pc(16) int local16 = Static164.aClass52_1.method1764(arg0).anInt9975;
		if (local16 == 0) {
			return;
		}
		@Pc(24) int local24 = Static588.aClass322_1.anIntArray623[arg0];
		if (local16 == 5) {
			Static539.anInt9736 = local24;
		}
		if (local16 == 6) {
			Static133.anInt3191 = local24;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIII)V")
	public static void method6923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg0 >= arg3) {
			for (local6 = arg3; local6 < arg0; local6++) {
				Static333.anIntArrayArray56[local6][arg1] = arg2;
			}
		} else {
			for (local6 = arg0; local6 < arg3; local6++) {
				Static333.anIntArrayArray56[local6][arg1] = arg2;
			}
		}
	}
}
