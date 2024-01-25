import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "Z")
	public static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
	public static int anInt7604 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6580(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static65.aStringArray12.length; local7++) {
			if (Static65.aStringArray12[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BB)Z")
	public static boolean method6581(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static454.aCharArray6[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
	public static void method6590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(19) int local19 = -arg2;
		Static270.method3998(arg1, arg3 - arg2, arg2 + arg3, Static173.anIntArrayArray15[arg0]);
		@Pc(34) int local34 = -1;
		while (local9 > local7) {
			local34 += 2;
			local7++;
			local19 += local34;
			if (local19 >= 0) {
				local9--;
				local19 -= local9 << 1;
				@Pc(60) int[] local60 = Static173.anIntArrayArray15[local9 + arg0];
				@Pc(67) int[] local67 = Static173.anIntArrayArray15[arg0 - local9];
				@Pc(71) int local71 = local7 + arg3;
				@Pc(76) int local76 = arg3 - local7;
				Static270.method3998(arg1, local76, local71, local60);
				Static270.method3998(arg1, local76, local71, local67);
			}
			@Pc(96) int local96 = local9 + arg3;
			@Pc(101) int local101 = arg3 - local9;
			@Pc(107) int[] local107 = Static173.anIntArrayArray15[local7 + arg0];
			@Pc(114) int[] local114 = Static173.anIntArrayArray15[arg0 - local7];
			Static270.method3998(arg1, local101, local96, local107);
			Static270.method3998(arg1, local101, local96, local114);
		}
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)I")
	public static int method6591() {
		if (Static289.aFrame1 == null) {
			return Static534.aBoolean621 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
