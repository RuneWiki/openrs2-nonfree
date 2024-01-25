import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "Lclient!bb;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_75 = new Class212(60, 2);

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_76 = new Class212(78, -1);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!qa;IIII)V")
	public static void method4711(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.w(arg1, arg4, arg2 + arg1, arg3 + arg4);
		arg0.method2072(arg4, arg1, arg2, arg3, -16777216);
		if (Static165.anInt3267 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static425.anInt3667 / (float) Static425.anInt3659;
		@Pc(39) int local39 = arg2;
		@Pc(41) int local41 = arg3;
		if (local33 < 1.0F) {
			local41 = (int) ((float) arg2 * local33);
		} else {
			local39 = (int) ((float) arg3 / local33);
		}
		@Pc(68) int local68 = arg1 + (arg2 - local39) / 2;
		@Pc(77) int local77 = arg4 + (arg3 - local41) / 2;
		if (Static266.aClass2_26 == null || arg2 != Static266.aClass2_26.TA() || arg3 != Static266.aClass2_26.V()) {
			Static425.method3284(Static425.anInt3657, Static425.anInt3658 + Static425.anInt3667, Static425.anInt3657 + Static425.anInt3659, Static425.anInt3658, local68, local77, local39 + local68, local77 + local41);
			Static425.method3289(arg0);
			Static266.aClass2_26 = arg0.method2058(local68, local77, local39, local41, false);
		}
		Static266.aClass2_26.method5921(local68, local77);
		@Pc(128) int local128 = Static399.anInt7065 * local39 / Static425.anInt3659;
		@Pc(134) int local134 = local41 * Static421.anInt7288 / Static425.anInt3667;
		@Pc(142) int local142 = local68 + Static332.anInt5920 * local39 / Static425.anInt3659;
		@Pc(156) int local156 = local77 + local41 - Static69.anInt1699 * local41 / Static425.anInt3667 - local134;
		@Pc(158) int local158 = -1996554240;
		if (Static323.aClass235_5 == Static332.aClass235_6) {
			local158 = -1996488705;
		}
		arg0.M(local142, local156, local128, local134, local158, 1);
		arg0.method2074(local142, local156, local128, local134, local158, 0);
		if (Static355.anInt6248 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static399.anInt7064 > 50) {
			local193 = 500 - Static399.anInt7064 * 5;
		} else {
			local193 = Static399.anInt7064 * 5;
		}
		for (@Pc(204) Class4_Sub4 local204 = (Class4_Sub4) Static425.aClass91_24.method2584(); local204 != null; local204 = (Class4_Sub4) Static425.aClass91_24.method2586()) {
			@Pc(212) Class217 local212 = Static425.aClass116_3.method3300(local204.anInt366);
			if (Static408.method5691(local212)) {
				@Pc(236) int local236;
				@Pc(248) int local248;
				if (local204.anInt366 == Static9.anInt194) {
					local236 = local68 + local39 * local204.anInt359 / Static425.anInt3659;
					local248 = (Static425.anInt3667 - local204.anInt364) * local41 / Static425.anInt3667 + local77;
					arg0.method2072(local248 - 2, local236 + -2, 4, 4, local193 << 24 | 0xFFFF00);
				} else if (Static209.anInt4256 != -1 && Static209.anInt4256 == local212.anInt6182) {
					local236 = local39 * local204.anInt359 / Static425.anInt3659 + local68;
					local248 = local77 + local41 * (Static425.anInt3667 - local204.anInt364) / Static425.anInt3667;
					arg0.method2072(local248 - 2, local236 - 2, 4, 4, local193 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!po;)V")
	public static void method4714(@OriginalArg(1) Class4_Sub7 arg0) {
		if (arg0.aClass4_Sub9_5 != null) {
			arg0.aClass4_Sub9_5.anInt1417 = 0;
		}
		arg0.aBoolean490 = false;
		for (@Pc(18) Class4_Sub7 local18 = arg0.method5466(); local18 != null; local18 = arg0.method5468()) {
			method4714(local18);
		}
	}
}
