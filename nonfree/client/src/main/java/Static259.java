import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_108 = new Class7("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public static int anInt4646 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method3863(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class1_Sub5 local12 = new Class1_Sub5(arg0);
		@Pc(14) int local14 = -1;
		label56: while (true) {
			@Pc(18) int local18 = local12.method5384();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(34) int local34;
				while (!local28) {
					local34 = local12.method5361();
					if (local34 == 0) {
						continue label56;
					}
					local26 += local34 - 1;
					@Pc(61) int local61 = local26 & 0x3F;
					@Pc(67) int local67 = local26 >> 6 & 0x3F;
					@Pc(73) int local73 = local12.method5366() >> 2;
					@Pc(77) int local77 = local67 + arg1;
					@Pc(82) int local82 = local61 + arg2;
					if (local77 > 0 && local82 > 0 && local77 < arg3 - 1 && local82 < arg4 - 1) {
						@Pc(112) Class129 local112 = Static349.aClass115_4.method2766(local14);
						if (local73 != 22 || Static38.aClass135_Sub1_1.aBoolean356 || local112.anInt3504 != 0 || local112.anInt3506 == 1 || local112.aBoolean226) {
							if (!local112.method3032()) {
								Static378.anInt4252++;
								local7 = false;
							}
							local28 = true;
						}
					}
				}
				local34 = local12.method5361();
				if (local34 == 0) {
					break;
				}
				local12.method5366();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I")
	public static int method3864() {
		return Static68.anInt1555;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIBI)V")
	public static void method3865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - (local29 - 1) * local25;
		@Pc(52) int local52 = local13 << 2;
		@Pc(64) int local64 = local17 << 2;
		@Pc(72) int local72 = local21 * 3;
		@Pc(80) int local80 = ((arg3 << 1) - 3) * local25;
		@Pc(86) int local86 = local64;
		@Pc(92) int local92 = (arg3 - 1) * local52;
		@Pc(110) int local110;
		@Pc(119) int local119;
		if (arg1 >= Static108.anInt2276 && Static173.anInt3208 >= arg1) {
			local110 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg4 + arg0);
			local119 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg4 - arg0);
			Static59.method1261(Static163.anIntArrayArray35[arg1], local110, local119, arg2);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local86;
					local39 += local72;
					local86 += local64;
					local7++;
					local72 += local64;
				}
			}
			if (local48 < 0) {
				local39 += local72;
				local48 += local86;
				local86 += local64;
				local72 += local64;
				local7++;
			}
			local39 += -local92;
			local48 += -local80;
			local9--;
			local80 -= local52;
			local92 -= local52;
			local110 = arg1 - local9;
			local119 = arg1 + local9;
			if (local119 >= Static108.anInt2276 && Static173.anInt3208 >= local110) {
				@Pc(223) int local223 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local7 + arg4);
				@Pc(232) int local232 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg4 - local7);
				if (Static108.anInt2276 <= local110) {
					Static59.method1261(Static163.anIntArrayArray35[local110], local223, local232, arg2);
				}
				if (Static173.anInt3208 >= local119) {
					Static59.method1261(Static163.anIntArrayArray35[local119], local223, local232, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)V")
	public static void method3866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class31_Sub4 local13 = local7.aClass31_Sub4_2;
		@Pc(16) Class31_Sub4 local16 = local7.aClass31_Sub4_1;
		if (local13 != null) {
			local13.anInt6198 = local13.anInt6198 * arg3 / (0x10 << Static31.anInt665 - 7);
			local13.anInt6200 = local13.anInt6200 * arg3 / (0x10 << Static31.anInt665 - 7);
		}
		if (local16 != null) {
			local16.anInt6198 = local16.anInt6198 * arg3 / (0x10 << Static31.anInt665 - 7);
			local16.anInt6200 = local16.anInt6200 * arg3 / (0x10 << Static31.anInt665 - 7);
		}
	}
}
