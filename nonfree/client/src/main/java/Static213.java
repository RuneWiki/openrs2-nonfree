import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array17;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "Lclient!up;")
	public static Class201 aClass201_1 = new Class201(8);

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
	public static void method3837() {
		Static159.aClass26_29.method333();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!kr;)V")
	public static void method3839(@OriginalArg(0) Class67_Sub3 arg0) {
		for (@Pc(2) int local2 = arg0.aShort91; local2 <= arg0.aShort93; local2++) {
			for (@Pc(6) int local6 = arg0.aShort90; local6 <= arg0.aShort92; local6++) {
				@Pc(16) Class106 local16 = Static212.aClass106ArrayArrayArray2[arg0.aByte73][local2][local6];
				if (local16 != null) {
					@Pc(21) Class64 local21 = local16.aClass64_4;
					@Pc(23) Class64 local23 = null;
					while (local21 != null) {
						if (local21.aClass67_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass64_4 = local21.aClass64_2;
							} else {
								local23.aClass64_2 = local21.aClass64_2;
							}
							local21.method1148();
							break;
						}
						local23 = local21;
						local21 = local21.aClass64_2;
					}
					local16.aByte28 = 0;
					for (@Pc(56) Class64 local56 = local16.aClass64_4; local56 != null; local56 = local56.aClass64_2) {
						local16.aByte28 = (byte) (local16.aByte28 | local56.anInt1418);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!oo;Lclient!oo;IIIIZIII)V")
	public static void method3845(@OriginalArg(0) Class67_Sub3_Sub3 arg0, @OriginalArg(1) Class67_Sub3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method4375();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class97 local20 = (Class97) Static100.aClass26_15.method332((long) local7);
		if (local20 == null) {
			@Pc(27) Class125[] local27 = Static368.method2868(Static182.aClass144_49, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static107.aClass129_4.method5018(local27[0]);
			Static100.aClass26_15.method330((long) local7, local20);
		}
		Static117.method1775(arg1.anInt6310, 0, arg1.method4368() * 64, arg1.anInt6308, arg6 >> 1, arg2 >> 1);
		@Pc(75) int local75 = arg5 + Static267.anIntArray414[0] - 18;
		@Pc(83) int local83 = local75 + arg3 / 4 * 18;
		@Pc(97) int local97 = Static267.anIntArray414[1] + arg4 - 16 - 54;
		@Pc(105) int local105 = local97 + arg3 % 4 * 18;
		local20.method5555(local83, local105);
		if (arg0 == arg1) {
			Static107.aClass129_4.method4993(18, 18, local83 - 1, local105 + -1, -256);
		}
		@Pc(127) Class10_Sub6 local127 = Static278.method5397();
		local127.anInt6295 = local83 + 16;
		local127.anInt6292 = local105;
		local127.anInt6293 = local83;
		local127.aClass67_Sub3_Sub3_1 = arg0;
		local127.anInt6294 = local105 + 16;
		Static169.aClass210_14.method5612(local127);
	}
}
