import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt5541;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public static int anInt5556;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4420(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg1); local14 != -1; local14 = arg0.indexOf(arg1, arg2.length() + local14)) {
			arg0 = arg0.substring(0, local14) + arg2 + arg0.substring(arg1.length() + local14);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ph;I)V")
	public static void method4421(@OriginalArg(0) Class187 arg0) {
		Static448.aClass187_123 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method4424(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class10_Sub1_Sub17 local12 = Static154.method2630(2, arg0);
		local12.method5345();
		local12.aString66 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
	public static void method4425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		Static212.method3267(arg1 - arg0, arg0 + arg1, arg3, Class10_Sub10_Sub1.lb[arg2]);
		while (local9 > local7) {
			local14 += 2;
			local7++;
			local12 += local14;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(50) int[] local50 = Class10_Sub10_Sub1.lb[local9 + arg2];
				@Pc(57) int[] local57 = Class10_Sub10_Sub1.lb[arg2 - local9];
				@Pc(62) int local62 = arg1 + local7;
				@Pc(67) int local67 = arg1 - local7;
				Static212.method3267(local67, local62, arg3, local50);
				Static212.method3267(local67, local62, arg3, local57);
			}
			@Pc(84) int local84 = arg1 + local9;
			@Pc(89) int local89 = arg1 - local9;
			@Pc(95) int[] local95 = Class10_Sub10_Sub1.lb[local7 + arg2];
			@Pc(102) int[] local102 = Class10_Sub10_Sub1.lb[arg2 - local7];
			Static212.method3267(local89, local84, arg3, local95);
			Static212.method3267(local89, local84, arg3, local102);
		}
	}
}
