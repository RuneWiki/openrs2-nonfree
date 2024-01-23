import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Z")
	public static boolean aBoolean162 = true;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIBII)V")
	public static void method2014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub3_Sub22 local12 = Static271.method4108(4, arg2);
		local12.method4468();
		local12.anInt5852 = arg0;
		local12.anInt5849 = arg1;
		local12.anInt5843 = arg3;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBII)V")
	public static void method2017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 * Static87.anInt2035 >> 8;
		if (local9 != 0 && arg2 != -1) {
			Static88.method1533(Static27.aClass168_148, arg2, local9);
			Static82.aBoolean132 = true;
		}
	}
}
