import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
	public static int anInt3756;

	@OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
	public static int anInt3757;

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
	public static int anInt3752 = 0;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_30 = new Class129(8);

	@OriginalMember(owner = "client!jl", name = "K", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_85 = new Class81(94, 8);

	@OriginalMember(owner = "client!jl", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[200];

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V")
	public static void method3001() {
		@Pc(3) Class184[] local3 = Class39.aClass184Array1;
		synchronized (Class39.aClass184Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class39.aClass184Array1.length; local7++) {
				Class39.aClass184Array1[local7] = new Class184();
				Static280.anIntArray343[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)V")
	public static void method3002(@OriginalArg(1) int arg0) {
		Static260.anInt4845 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 - arg0;
		@Pc(14) int local14 = arg0 + arg6;
		for (@Pc(16) int local16 = arg6; local16 < local14; local16++) {
			Static49.method990(Static277.anIntArrayArray40[local16], arg3, arg2, arg1);
		}
		for (@Pc(36) int local36 = arg5; local36 > local10; local36--) {
			Static49.method990(Static277.anIntArrayArray40[local36], arg3, arg2, arg1);
		}
		@Pc(54) int local54 = arg2 + arg0;
		@Pc(59) int local59 = arg3 - arg0;
		for (@Pc(73) int local73 = local14; local73 <= local10; local73++) {
			@Pc(79) int[] local79 = Static277.anIntArrayArray40[local73];
			Static49.method990(local79, local54, arg2, arg1);
			Static49.method990(local79, local59, local54, arg4);
			Static49.method990(local79, arg3, local59, arg1);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3004(@OriginalArg(0) String arg0) {
		if (Static359.aStringArray25 == null) {
			Static248.method3826();
		}
		@Pc(14) String[] local14 = Static40.method745(arg0, '\n');
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(20) int local20 = Static372.anInt6682; local20 > 0; local20--) {
				Static359.aStringArray25[local20] = Static359.aStringArray25[local20 - 1];
			}
			Static359.aStringArray25[0] = local14[local16];
			if (Static359.aStringArray25.length - 1 > Static372.anInt6682) {
				Static372.anInt6682++;
				if (Static22.anInt467 > 0) {
					Static22.anInt467++;
				}
			}
		}
	}
}
