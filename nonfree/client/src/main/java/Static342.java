import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Lclient!it;")
	public static Class122 aClass122_9;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Z")
	public static boolean aBoolean369;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
	public static void method4957(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg0, 1);
		local8.method3084();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([[BBLclient!uo;)V")
	public static void method4962(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class115_Sub1 arg1) {
		@Pc(20) int[] local20 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(22) int local22 = 0; local22 < arg1.anInt7278; local22++) {
			Static280.method4210();
			for (@Pc(28) int local28 = 0; local28 < Static181.anInt3574 >> 3; local28++) {
				for (@Pc(32) int local32 = 0; local32 < Static117.anInt2450 >> 3; local32++) {
					@Pc(36) boolean local36 = false;
					@Pc(44) int local44 = Static287.anIntArrayArrayArray10[local22][local28][local32];
					if (local44 != -1) {
						@Pc(54) int local54 = local44 >> 24 & 0x3;
						if (!arg1.aBoolean462 || local54 == 0) {
							@Pc(65) int local65 = local44 >> 1 & 0x3;
							@Pc(71) int local71 = local44 >> 14 & 0x3FF;
							@Pc(77) int local77 = local44 >> 3 & 0x7FF;
							@Pc(87) int local87 = local77 / 8 + (local71 / 8 << 8);
							for (@Pc(89) int local89 = 0; local89 < Static411.anIntArray508.length; local89++) {
								if (Static411.anIntArray508[local89] == local87 && arg0[local89] != null) {
									@Pc(107) Class6_Sub1 local107 = new Class6_Sub1(arg0[local89]);
									arg1.method5990(local32 * 8, local54, local65, local22, local71, local77, Static209.aClass210Array2, local107, local28 * 8);
									local36 = true;
									arg1.method6004(local20[0] == -1 ? local20 : null, local32 * 8, local65, local54, local22, local77, local71, local28 * 8, Static126.aClass66_5, local107);
									break;
								}
							}
						}
					}
					if (!local36) {
						arg1.method5989(local32 * 8, 8, local28 * 8, local22, 8);
					}
				}
			}
		}
		if (local20[0] != -1) {
			Static249.aClass107_1 = Static133.aClass133_2.method3056(local20[0], Static89.aClass70_1, local20[3], local20[2], local20[1]);
			Static292.anInt5205 = local20[4];
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z")
	public static boolean method4963() {
		return Static125.aBoolean171;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method4964(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static404.aClass267_97.method6581(Static161.anInt3239) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static336.aClass267_80.method6581(Static161.anInt3239) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
