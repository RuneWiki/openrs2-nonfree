import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg5);
		@Pc(23) int local23 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg0);
		@Pc(29) int local29 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3);
		@Pc(35) int local35 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4);
		@Pc(43) int local43 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg6 + arg5);
		@Pc(54) int local54 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg0 - arg6);
		for (@Pc(56) int local56 = local17; local56 < local43; local56++) {
			Static236.method3990(local35, local29, Static400.anIntArrayArray54[local56], arg1);
		}
		for (@Pc(72) int local72 = local23; local72 > local54; local72--) {
			Static236.method3990(local35, local29, Static400.anIntArrayArray54[local72], arg1);
		}
		@Pc(94) int local94 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg6 + arg3);
		@Pc(102) int local102 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg4 - arg6);
		for (@Pc(104) int local104 = local43; local104 <= local54; local104++) {
			@Pc(110) int[] local110 = Static400.anIntArrayArray54[local104];
			Static236.method3990(local94, local29, local110, arg1);
			Static236.method3990(local102, local94, local110, arg2);
			Static236.method3990(local35, local102, local110, arg1);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIZZ)V")
	public static void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static418.method2683(arg1, arg3, arg0, arg2, 0, Static155.aClass82_Sub1Array3.length - 1);
		Static221.aClass4_Sub23_2 = null;
		Static261.anInt4996 = 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZII)V")
	public static void method2250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (Static192.anInt3828 == 0) {
			Static35.method519(false);
		} else {
			Static254.anInt4915 = Static192.anInt3828;
			Static391.method5496(0);
		}
		Static290.anInt5374 = arg3;
		Static254.anInt4914 = arg1;
		Static93.aBoolean147 = arg2;
		Static425.method3270(arg0);
	}
}
