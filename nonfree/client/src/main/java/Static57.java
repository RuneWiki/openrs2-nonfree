import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Lclient!d;")
	public static Interface9 anInterface9_4;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "[Lclient!es;")
	public static final Class4_Sub11[] aClass4_Sub11Array1 = new Class4_Sub11[2048];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)I")
	public static int method1303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static119.method2169(4, arg0 + 91923, arg1 + 45365) + (Static119.method2169(2, arg0 + 37821, arg1 - -10294) - 128 >> 1) + (Static119.method2169(1, arg0, arg1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBI)V")
	public static void method1304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg3, 4);
		local9.method3955();
		local9.anInt4429 = arg1;
		local9.anInt4425 = arg0;
		local9.anInt4427 = arg2;
	}
}
