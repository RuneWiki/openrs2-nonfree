import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
	public static int anInt1297;

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
	public static int anInt1299;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "S")
	public static short aShort20 = 256;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static585.method7929(arg3, arg6, arg8)) {
			return false;
		}
		@Pc(15) int local15 = Static427.anIntArray497[0];
		@Pc(19) int local19 = Static427.anIntArray497[1];
		@Pc(23) int local23 = Static427.anIntArray497[2];
		if (!Static585.method7929(arg4, arg1, arg5)) {
			return false;
		}
		@Pc(40) int local40 = Static427.anIntArray497[1];
		@Pc(44) int local44 = Static427.anIntArray497[2];
		@Pc(48) int local48 = Static427.anIntArray497[0];
		if (Static585.method7929(arg2, arg0, arg7)) {
			@Pc(60) int local60 = Static427.anIntArray497[0];
			@Pc(64) int local64 = Static427.anIntArray497[1];
			@Pc(68) int local68 = Static427.anIntArray497[2];
			return Static517.method7145(local15, local68, local48, local64, local40, local60, local23, local44, local19);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	public static void method938() {
		Static350.aBoolean498 = false;
		Static139.method2348();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class196 local12 = Static217.method3485(arg3, arg0);
		if (local12 == null) {
			return;
		}
		if (local12.anObjectArray30 != null) {
			@Pc(22) Class2_Sub31 local22 = new Class2_Sub31();
			local22.anInt6081 = arg1;
			local22.aClass196_4 = local12;
			local22.anObjectArray32 = local12.anObjectArray30;
			local22.aString52 = arg2;
			Static552.method7490(local22);
		}
		if (Static201.anInt3963 != 10 || !Static67.method1102(local12).method5423(arg1 - 1)) {
			return;
		}
		@Pc(64) Class2_Sub42 local64;
		if (arg1 == 1) {
			local64 = Static249.method3910(Static547.aClass286_131, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 2) {
			local64 = Static249.method3910(Static275.aClass286_91, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 3) {
			local64 = Static249.method3910(Static383.aClass286_123, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 4) {
			local64 = Static249.method3910(Static92.aClass286_33, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 5) {
			local64 = Static249.method3910(Static50.aClass286_17, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 6) {
			local64 = Static249.method3910(Static326.aClass286_106, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 7) {
			local64 = Static249.method3910(Static367.aClass286_114, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 8) {
			local64 = Static249.method3910(Static153.aClass286_46, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 9) {
			local64 = Static249.method3910(Static51.aClass286_18, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
		if (arg1 == 10) {
			local64 = Static249.method3910(Static276.aClass286_54, Static400.aClass145_2);
			Static302.method4550(arg0, local12.anInt5152, arg3, local64);
			Static531.method7296(local64);
		}
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)I")
	public static int method940() {
		if ((double) Static270.aFloat48 == 3.0D) {
			return 37;
		} else if ((double) Static270.aFloat48 == 4.0D) {
			return 50;
		} else if ((double) Static270.aFloat48 == 6.0D) {
			return 75;
		} else if ((double) Static270.aFloat48 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
