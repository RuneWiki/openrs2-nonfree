import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!fs;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	public static int anInt1983 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBIIII)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static84.method1650(Static328.anInt6154, arg5, Static394.anInt7462);
		@Pc(17) int local17 = Static84.method1650(Static328.anInt6154, arg1, Static394.anInt7462);
		@Pc(23) int local23 = Static84.method1650(Static7.anInt8119, arg0, Static34.anInt603);
		@Pc(29) int local29 = Static84.method1650(Static7.anInt8119, arg3, Static34.anInt603);
		@Pc(37) int local37 = Static84.method1650(Static328.anInt6154, arg5 + arg4, Static394.anInt7462);
		@Pc(46) int local46 = Static84.method1650(Static328.anInt6154, arg1 - arg4, Static394.anInt7462);
		for (@Pc(56) int local56 = local11; local56 < local37; local56++) {
			Static403.method6377(arg2, Static130.anIntArrayArray89[local56], local29, local23);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static403.method6377(arg2, Static130.anIntArrayArray89[local72], local29, local23);
		}
		@Pc(95) int local95 = Static84.method1650(Static7.anInt8119, arg0 + arg4, Static34.anInt603);
		@Pc(104) int local104 = Static84.method1650(Static7.anInt8119, arg3 - arg4, Static34.anInt603);
		for (@Pc(106) int local106 = local37; local106 <= local46; local106++) {
			@Pc(112) int[] local112 = Static130.anIntArrayArray89[local106];
			Static403.method6377(arg2, local112, local95, local23);
			Static403.method6377(arg2, local112, local29, local104);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)V")
	public static void method1924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static394.anInt7462 < arg4 || Static328.anInt6154 > arg2) {
			return;
		}
		@Pc(31) boolean local31;
		if (arg3 < Static7.anInt8119) {
			arg3 = Static7.anInt8119;
			local31 = false;
		} else if (arg3 <= Static34.anInt603) {
			local31 = true;
		} else {
			local31 = false;
			arg3 = Static34.anInt603;
		}
		@Pc(59) boolean local59;
		if (Static7.anInt8119 > arg0) {
			arg0 = Static7.anInt8119;
			local59 = false;
		} else if (arg0 > Static34.anInt603) {
			arg0 = Static34.anInt603;
			local59 = false;
		} else {
			local59 = true;
		}
		if (Static328.anInt6154 <= arg4) {
			Static403.method6377(arg1, Static130.anIntArrayArray89[arg4++], arg0, arg3);
		} else {
			arg4 = Static328.anInt6154;
		}
		if (Static394.anInt7462 < arg2) {
			arg2 = Static394.anInt7462;
		} else {
			Static403.method6377(arg1, Static130.anIntArrayArray89[arg2--], arg0, arg3);
		}
		@Pc(114) int local114;
		if (local31 && local59) {
			for (local114 = arg4; local114 <= arg2; local114++) {
				@Pc(120) int[] local120 = Static130.anIntArrayArray89[local114];
				local120[arg3] = local120[arg0] = arg1;
			}
		} else if (local31) {
			for (local114 = arg4; local114 <= arg2; local114++) {
				Static130.anIntArrayArray89[local114][arg3] = arg1;
			}
		} else if (local59) {
			for (local114 = arg4; local114 <= arg2; local114++) {
				Static130.anIntArrayArray89[local114][arg0] = arg1;
			}
			return;
		}
	}
}
