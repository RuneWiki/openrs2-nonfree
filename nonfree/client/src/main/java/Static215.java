import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	public static int anInt6070;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
	public static int anInt6071 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static347.method5856(arg4);
		@Pc(19) int local19 = 0;
		@Pc(24) int local24 = arg4 - arg0;
		if (local24 < 0) {
			local24 = 0;
		}
		@Pc(30) int local30 = arg4;
		@Pc(33) int local33 = -arg4;
		@Pc(35) int local35 = local24;
		@Pc(38) int local38 = -local24;
		@Pc(40) int local40 = -1;
		@Pc(67) int local67;
		@Pc(75) int local75;
		@Pc(84) int local84;
		@Pc(93) int local93;
		if (arg2 >= Static55.anInt1303 && Static208.anInt4309 >= arg2) {
			@Pc(58) int[] local58 = Static333.anIntArrayArray56[arg2];
			local67 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 - arg4);
			local75 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 + arg4);
			local84 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 - local24);
			local93 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 + local24);
			Static426.method6794(local84, local58, local67, arg3);
			Static426.method6794(local93, local58, local84, arg5);
			Static426.method6794(local75, local58, local93, arg3);
		}
		@Pc(113) int local113 = -1;
		while (local19 < local30) {
			local40 += 2;
			local113 += 2;
			local38 += local113;
			local33 += local40;
			if (local38 >= 0 && local35 >= 1) {
				local35--;
				Static370.anIntArray467[local35] = local19;
				local38 -= local35 << 1;
			}
			local19++;
			@Pc(211) int local211;
			@Pc(220) int local220;
			@Pc(227) int[] local227;
			@Pc(163) int local163;
			if (local33 >= 0) {
				local30--;
				local33 -= local30 << 1;
				local163 = arg2 - local30;
				local67 = local30 + arg2;
				if (local67 >= Static55.anInt1303 && local163 <= Static208.anInt4309) {
					if (local24 > local30) {
						local75 = Static370.anIntArray467[local30];
						local84 = Static44.method1168(Static35.anInt993, Static535.anInt9696, local19 + arg1);
						local93 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 - local19);
						local211 = Static44.method1168(Static35.anInt993, Static535.anInt9696, local75 + arg1);
						local220 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 - local75);
						if (local67 <= Static208.anInt4309) {
							local227 = Static333.anIntArrayArray56[local67];
							Static426.method6794(local220, local227, local93, arg3);
							Static426.method6794(local211, local227, local220, arg5);
							Static426.method6794(local84, local227, local211, arg3);
						}
						if (local163 >= Static55.anInt1303) {
							local227 = Static333.anIntArrayArray56[local163];
							Static426.method6794(local220, local227, local93, arg3);
							Static426.method6794(local211, local227, local220, arg5);
							Static426.method6794(local84, local227, local211, arg3);
						}
					} else {
						local75 = Static44.method1168(Static35.anInt993, Static535.anInt9696, local19 + arg1);
						local84 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 - local19);
						if (Static208.anInt4309 >= local67) {
							Static426.method6794(local75, Static333.anIntArrayArray56[local67], local84, arg3);
						}
						if (local163 >= Static55.anInt1303) {
							Static426.method6794(local75, Static333.anIntArrayArray56[local163], local84, arg3);
						}
					}
				}
			}
			local163 = arg2 - local19;
			local67 = arg2 + local19;
			if (Static55.anInt1303 <= local67 && Static208.anInt4309 >= local163) {
				local75 = local30 + arg1;
				local84 = arg1 - local30;
				if (local75 >= Static535.anInt9696 && Static35.anInt993 >= local84) {
					local75 = Static44.method1168(Static35.anInt993, Static535.anInt9696, local75);
					local84 = Static44.method1168(Static35.anInt993, Static535.anInt9696, local84);
					if (local24 > local19) {
						local93 = local35 < local19 ? Static370.anIntArray467[local19] : local35;
						local211 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 + local93);
						local220 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 - local93);
						if (local67 <= Static208.anInt4309) {
							local227 = Static333.anIntArrayArray56[local67];
							Static426.method6794(local220, local227, local84, arg3);
							Static426.method6794(local211, local227, local220, arg5);
							Static426.method6794(local75, local227, local211, arg3);
						}
						if (local163 >= Static55.anInt1303) {
							local227 = Static333.anIntArrayArray56[local163];
							Static426.method6794(local220, local227, local84, arg3);
							Static426.method6794(local211, local227, local220, arg5);
							Static426.method6794(local75, local227, local211, arg3);
						}
					} else {
						if (local67 <= Static208.anInt4309) {
							Static426.method6794(local75, Static333.anIntArrayArray56[local67], local84, arg3);
						}
						if (Static55.anInt1303 <= local163) {
							Static426.method6794(local75, Static333.anIntArrayArray56[local163], local84, arg3);
						}
					}
				}
			}
		}
	}
}
