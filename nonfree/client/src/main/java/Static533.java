import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V")
	public static void method7260(@OriginalArg(1) int arg0) {
		Static49.anInt883 = 3;
		Static50.anInt8645 = -1;
		Static190.anInt7946 = 100;
		Static119.anInt7220 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Lclient!ti;")
	public static Class15_Sub4 method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub4_2;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!pj;)V")
	public static void method7264(@OriginalArg(1) Class248 arg0) {
		Static396.aClass248_69 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg1;
		@Pc(14) int local14 = arg6 - arg1;
		for (@Pc(16) int local16 = arg2; local16 < local9; local16++) {
			Static264.method4006(arg3, arg5, arg4, Static155.anIntArrayArray32[local16]);
		}
		@Pc(35) int local35 = arg3 - arg1;
		for (@Pc(37) int local37 = arg6; local37 > local14; local37--) {
			Static264.method4006(arg3, arg5, arg4, Static155.anIntArrayArray32[local37]);
		}
		@Pc(57) int local57 = arg4 + arg1;
		for (@Pc(59) int local59 = local9; local59 <= local14; local59++) {
			@Pc(65) int[] local65 = Static155.anIntArrayArray32[local59];
			Static264.method4006(local57, arg5, arg4, local65);
			Static264.method4006(local35, arg0, local57, local65);
			Static264.method4006(arg3, arg5, local35, local65);
		}
	}
}
