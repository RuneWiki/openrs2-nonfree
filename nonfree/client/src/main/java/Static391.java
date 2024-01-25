import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_159 = new Class81(45, 8);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5583(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class1_Sub10 local7 = null;
		for (@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static16.aClass361_15.method7854(); local12 != null; local12 = (Class1_Sub10) Static16.aClass361_15.method7853()) {
			if (local12.anInt2083 == arg1 && arg2 == local12.anInt2090 && local12.anInt2089 == arg4 && arg6 == local12.anInt2093) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub10();
			local7.anInt2089 = arg4;
			local7.anInt2093 = arg6;
			local7.anInt2083 = arg1;
			local7.anInt2090 = arg2;
			if (arg2 >= 0 && arg4 >= 0 && Static500.anInt6888 > arg2 && arg4 < Static573.anInt9325) {
				Static416.method5830(local7);
			}
			Static16.aClass361_15.method7855(local7);
		}
		local7.anInt2082 = arg5;
		local7.anInt2088 = arg0;
		local7.anInt2091 = -1;
		local7.anInt2080 = 0;
		local7.anInt2081 = arg3;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)Z")
	public static boolean method5585(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
