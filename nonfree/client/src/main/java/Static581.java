import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public static int anInt6126;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIIIII)V")
	public static void method4964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static176.method2504(arg1, Static451.anInt7775, Static514.anInt8722);
		@Pc(17) int local17 = Static176.method2504(arg3, Static451.anInt7775, Static514.anInt8722);
		@Pc(23) int local23 = Static176.method2504(arg2, Static162.anInt2935, Static270.anInt4759);
		@Pc(29) int local29 = Static176.method2504(arg0, Static162.anInt2935, Static270.anInt4759);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static433.method6039(arg4, local29, Static171.anIntArrayArray79[local31], local23);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lclient!cfa;")
	public static Class50 method4965(@OriginalArg(1) int arg0) {
		@Pc(12) Class50 local12 = (Class50) Static200.aClass222_23.method4430((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static570.aClass270_117.method5704(1, arg0);
		local12 = new Class50();
		local12.anInt1083 = arg0;
		if (local22 != null) {
			local12.method1017(new Class1_Sub35(local22));
		}
		local12.method1016();
		if (local12.anInt1078 == 2 && Static288.aClass187_21.method3797((long) arg0) == null) {
			Static288.aClass187_21.method3795(new Class1_Sub13(Static303.anInt5261), (long) arg0);
			Static280.aClass50Array1[Static303.anInt5261++] = local12;
		}
		Static200.aClass222_23.method4434(local12, (long) arg0);
		return local12;
	}
}
