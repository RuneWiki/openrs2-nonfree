import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "Z")
	public static boolean aBoolean417 = false;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!hd;)V")
	public static void method4682(@OriginalArg(1) Class110 arg0) {
		if (!Static70.aBoolean94) {
			return;
		}
		if (arg0.anObjectArray23 != null) {
			@Pc(18) Class110 local18 = Static220.method2992(Static259.anInt4347, Static270.anInt4512);
			if (local18 != null) {
				@Pc(24) Class4_Sub34 local24 = new Class4_Sub34();
				local24.aClass110_15 = local18;
				local24.aClass110_14 = arg0;
				local24.anObjectArray34 = arg0.anObjectArray23;
				Static80.method1289(local24);
			}
		}
		Static448.method5935(Static417.aClass146_100);
		Static247.aClass4_Sub9_Sub2_2.method5047(arg0.anInt2675);
		Static247.aClass4_Sub9_Sub2_2.method5055(Static270.anInt4512);
		Static247.aClass4_Sub9_Sub2_2.method5029(Static81.anInt1601);
		Static247.aClass4_Sub9_Sub2_2.method5017(Static259.anInt4347);
		Static247.aClass4_Sub9_Sub2_2.method5055(arg0.anInt2588);
		Static247.aClass4_Sub9_Sub2_2.method5018(arg0.anInt2585);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static39.method544(arg4, Static254.anInt4211, Static275.anInt4594);
		@Pc(17) int local17 = Static39.method544(arg0, Static254.anInt4211, Static275.anInt4594);
		@Pc(23) int local23 = Static39.method544(arg2, Static62.anInt1114, Static207.anInt3632);
		@Pc(29) int local29 = Static39.method544(arg1, Static62.anInt1114, Static207.anInt3632);
		@Pc(37) int local37 = Static39.method544(arg4 + arg6, Static254.anInt4211, Static275.anInt4594);
		@Pc(46) int local46 = Static39.method544(arg0 - arg6, Static254.anInt4211, Static275.anInt4594);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static249.method6044(Static267.anIntArrayArray50[local48], arg3, local29, local23);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static249.method6044(Static267.anIntArrayArray50[local64], arg3, local29, local23);
		}
		@Pc(86) int local86 = Static39.method544(arg6 + arg2, Static62.anInt1114, Static207.anInt3632);
		@Pc(95) int local95 = Static39.method544(arg1 - arg6, Static62.anInt1114, Static207.anInt3632);
		for (@Pc(103) int local103 = local37; local103 <= local46; local103++) {
			@Pc(109) int[] local109 = Static267.anIntArrayArray50[local103];
			Static249.method6044(local109, arg3, local86, local23);
			Static249.method6044(local109, arg5, local95, local86);
			Static249.method6044(local109, arg3, local29, local95);
		}
	}
}
