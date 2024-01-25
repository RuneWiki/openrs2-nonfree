import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
	public static int anInt10320 = 0;

	@OriginalMember(owner = "client!uo", name = "T", descriptor = "[I")
	public static final int[] anIntArray664 = new int[5];

	@OriginalMember(owner = "client!uo", name = "jb", descriptor = "I")
	public static int anInt10337 = 1;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)Z")
	public static boolean method8630(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V")
	public static void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(14) Class373[] local14 = Static351.aClass373Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class373 local22 = local14[local16];
			if (local22 != null && local22.anInt11021 == 2) {
				Static294.method5267(arg2 >> 1, local22.anInt11020 * 2, arg3 >> 1, local22.anInt11019, local22.anInt11013, local22.anInt11016);
				if (Static613.anIntArray690[0] > -1 && Static407.anInt7704 % 20 < 10) {
					@Pc(66) Class46 local66 = Static352.aClass46Array11[local22.anInt11012];
					@Pc(75) int local75 = arg0 + Static613.anIntArray690[0] - 12;
					@Pc(84) int local84 = arg1 + Static613.anIntArray690[1] - 28;
					local66.method6213(local75, local84);
					Static113.method2842(local75, local75 + local66.method6205(), local84, local66.method6219() + local84);
				}
			}
		}
	}
}
