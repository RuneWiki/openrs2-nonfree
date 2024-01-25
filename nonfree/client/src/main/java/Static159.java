import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "Lclient!sw;")
	public static Class346 aClass346_1;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method2362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static475.method6833(arg4, arg2, arg1)) {
			return false;
		}
		@Pc(18) int local18 = Static370.anIntArray281[1];
		@Pc(22) int local22 = Static370.anIntArray281[0];
		@Pc(26) int local26 = Static370.anIntArray281[2];
		if (!Static475.method6833(arg5, arg7, arg8)) {
			return false;
		}
		@Pc(45) int local45 = Static370.anIntArray281[2];
		@Pc(49) int local49 = Static370.anIntArray281[0];
		@Pc(53) int local53 = Static370.anIntArray281[1];
		if (Static475.method6833(arg3, arg6, arg0)) {
			@Pc(66) int local66 = Static370.anIntArray281[1];
			@Pc(70) int local70 = Static370.anIntArray281[2];
			@Pc(74) int local74 = Static370.anIntArray281[0];
			return Static215.method2997(local18, local26, local53, local66, local49, local70, local74, local22, local45);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
	public static void method2363() {
		if (Static479.aClass70_2 != null) {
			Static479.aClass70_2.method9352();
		}
		if (Static600.aClass70_3 != null) {
			Static600.aClass70_3.method9352();
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
	public static void method2364(@OriginalArg(0) int arg0) {
		Static215.method2998();
		@Pc(11) int local11 = Static13.aClass119_1.method2608(arg0).anInt10680;
		if (local11 == 0) {
			return;
		}
		@Pc(20) int local20 = Static396.aClass107_1.anIntArray197[arg0];
		if (local11 == 6) {
			Static607.anInt9426 = local20;
		}
		if (local11 == 5) {
			Static410.anInt6714 = local20;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	public static void method2365() {
		@Pc(12) int local12;
		if (Static314.aClass252Array1 != null) {
			for (local12 = 0; local12 < Static219.anInt3509; local12++) {
				Static314.aClass252Array1[local12] = null;
			}
			Static314.aClass252Array1 = null;
		}
		if (Static437.aClass252Array3 != null) {
			for (local12 = 0; local12 < Static672.anInt10469; local12++) {
				Static437.aClass252Array3[local12] = null;
			}
			Static437.aClass252Array3 = null;
		}
		if (Static449.aClass252Array4 != null) {
			for (local12 = 0; local12 < Static670.anInt10425; local12++) {
				Static449.aClass252Array4[local12] = null;
			}
			Static449.aClass252Array4 = null;
		}
		Static371.aClass252Array2 = null;
		Static146.anIntArray186 = null;
		Static627.anInt9602 = -1;
		Static451.anInt7308 = -1;
		Static613.anIntArrayArrayArray18 = null;
	}
}
