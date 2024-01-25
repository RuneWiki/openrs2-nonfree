import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public static int anInt4829;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public static int anInt4831 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method4187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static54.method1088(Static41.anInt1131, arg6, Static165.anInt3409);
		@Pc(17) int local17 = Static54.method1088(Static41.anInt1131, arg5, Static165.anInt3409);
		@Pc(23) int local23 = Static54.method1088(Static60.anInt1399, arg3, Static138.anInt6334);
		@Pc(29) int local29 = Static54.method1088(Static60.anInt1399, arg2, Static138.anInt6334);
		@Pc(37) int local37 = Static54.method1088(Static41.anInt1131, arg1 + arg6, Static165.anInt3409);
		@Pc(46) int local46 = Static54.method1088(Static41.anInt1131, arg5 - arg1, Static165.anInt3409);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static244.method5351(local23, local29, Static319.anIntArrayArray31[local48], arg4);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static244.method5351(local23, local29, Static319.anIntArrayArray31[local64], arg4);
		}
		@Pc(91) int local91 = Static54.method1088(Static60.anInt1399, arg3 + arg1, Static138.anInt6334);
		@Pc(112) int local112 = Static54.method1088(Static60.anInt1399, arg2 - arg1, Static138.anInt6334);
		for (@Pc(114) int local114 = local37; local114 <= local46; local114++) {
			@Pc(120) int[] local120 = Static319.anIntArrayArray31[local114];
			Static244.method5351(local23, local91, local120, arg4);
			Static244.method5351(local91, local112, local120, arg0);
			Static244.method5351(local112, local29, local120, arg4);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lclient!nb;")
	public static Class1_Sub2_Sub11 method4188(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub11 local12 = (Class1_Sub2_Sub11) Static19.aClass37_9.method915((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static83.aClass134_34.method3009(arg0, 26);
		local12 = new Class1_Sub2_Sub11();
		if (local27 != null) {
			local12.method3447(new Class1_Sub21(local27));
		}
		Static19.aClass37_9.method922((long) arg0, local12);
		return local12;
	}
}
