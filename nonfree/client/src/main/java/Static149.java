import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!he", name = "L", descriptor = "I")
	public static int anInt2847;

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_38 = new Class44(77, -1);

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "[I")
	public static final int[] anIntArray198 = new int[1000];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(12) Class2_Sub10 local12 = null;
		for (@Pc(17) Class2_Sub10 local17 = (Class2_Sub10) Static222.aClass265_32.method6005(); local17 != null; local17 = (Class2_Sub10) Static222.aClass265_32.method6001()) {
			if (local17.anInt1381 == arg1 && local17.anInt1383 == arg5 && local17.anInt1387 == arg4 && local17.anInt1375 == arg3) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class2_Sub10();
			local12.anInt1375 = arg3;
			local12.anInt1387 = arg4;
			local12.anInt1383 = arg5;
			local12.anInt1381 = arg1;
			if (arg5 >= 0 && arg4 >= 0 && Static81.anInt1950 > arg5 && arg4 < Static171.anInt3288) {
				Static37.method712(local12);
			}
			Static222.aClass265_32.method5999(local12);
		}
		local12.anInt1382 = arg0;
		local12.anInt1376 = -1;
		local12.anInt1386 = arg2;
		local12.anInt1377 = arg6;
		local12.anInt1385 = 0;
	}
}
