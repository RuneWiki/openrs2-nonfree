import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
	public static int anInt6865 = 0;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_111 = new Class142(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIII)V")
	public static void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = ((arg1 << 1) - 3) * local25;
		@Pc(81) int local81 = local55;
		@Pc(99) int local99;
		@Pc(108) int local108;
		if (Static142.anInt2163 <= arg4 && Static182.anInt3402 >= arg4) {
			local99 = Static241.method3467(arg2 + arg3, Static281.anInt4757, Static457.anInt7264);
			local108 = Static241.method3467(arg3 - arg2, Static281.anInt4757, Static457.anInt7264);
			Static298.method3977(local108, arg0, local99, Static194.anIntArrayArray28[arg4]);
		}
		@Pc(122) int local122 = (arg1 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local67;
					local47 += local81;
					local81 += local55;
					local7++;
					local67 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local67;
				local47 += local81;
				local81 += local55;
				local7++;
				local67 += local55;
			}
			local38 += -local122;
			local47 += -local75;
			local9--;
			local122 -= local51;
			local75 -= local51;
			local99 = arg4 - local9;
			local108 = arg4 + local9;
			if (local108 >= Static142.anInt2163 && local99 <= Static182.anInt3402) {
				@Pc(211) int local211 = Static241.method3467(local7 + arg3, Static281.anInt4757, Static457.anInt7264);
				@Pc(220) int local220 = Static241.method3467(arg3 - local7, Static281.anInt4757, Static457.anInt7264);
				if (Static142.anInt2163 <= local99) {
					Static298.method3977(local220, arg0, local211, Static194.anIntArrayArray28[local99]);
				}
				if (local108 <= Static182.anInt3402) {
					Static298.method3977(local220, arg0, local211, Static194.anIntArrayArray28[local108]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	public static void method5460() {
		Static274.method3735(Static112.anInt1710);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method5461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class1_Sub20 local7 = null;
		for (@Pc(12) Class1_Sub20 local12 = (Class1_Sub20) Static303.aClass14_33.method203(); local12 != null; local12 = (Class1_Sub20) Static303.aClass14_33.method208()) {
			if (arg0 == local12.anInt2542 && local12.anInt2536 == arg5 && local12.anInt2539 == arg3 && local12.anInt2537 == arg6) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub20();
			local7.anInt2539 = arg3;
			local7.anInt2536 = arg5;
			local7.anInt2537 = arg6;
			local7.anInt2542 = arg0;
			if (arg5 >= 0 && arg3 >= 0 && Static147.anInt2300 > arg5 && arg3 < Static293.anInt4886) {
				Static397.method5143(local7);
			}
			Static303.aClass14_33.method205(local7);
		}
		local7.anInt2544 = arg1;
		local7.anInt2533 = 0;
		local7.anInt2541 = -1;
		local7.anInt2546 = arg4;
		local7.anInt2543 = arg2;
	}
}
