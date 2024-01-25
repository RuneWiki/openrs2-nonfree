import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!saa", name = "r", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_105 = new Class316(35, 7);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)Z")
	public static boolean method6470(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method6471(@OriginalArg(1) Class90 arg0) {
		Static564.aClass118Array1 = new Class118[Static98.anIntArray146.length];
		for (@Pc(9) int local9 = 0; local9 < Static98.anIntArray146.length; local9++) {
			@Pc(17) int local17 = Static98.anIntArray146[local9];
			@Pc(22) Class202 local22 = Static258.method3974(Static85.aClass248_14, local17);
			@Pc(30) Class82 local30 = arg0.method7523(local22, Static593.method4141(Static585.aClass248_57, local17));
			Static564.aClass118Array1[local9] = new Class118(local30, local22);
		}
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(II)V")
	public static void method6472(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub5_Sub8 local11 = Static49.method760(11, arg0);
		local11.method3257();
	}
}
