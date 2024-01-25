import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!sb;")
	public static Class212 aClass212_5;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static int anInt4519;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public static int anInt4518 = 0;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_203 = new Class22(21, 6);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILclient!fs;)Lclient!gt;")
	public static Class89 method3546(@OriginalArg(2) int arg0, @OriginalArg(3) Class76 arg1) {
		@Pc(14) byte[] local14 = arg1.method2104(0, arg0);
		return local14 == null ? null : new Class89(local14);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ti;I)V")
	public static void method3547(@OriginalArg(0) Class4_Sub15 arg0) {
		if (arg0.aClass4_Sub4_5 != null) {
			arg0.aClass4_Sub4_5.anInt3724 = 0;
		}
		arg0.aBoolean569 = false;
		for (@Pc(24) Class4_Sub15 local24 = arg0.method4860(); local24 != null; local24 = arg0.method4857()) {
			method3547(local24);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg6;
		@Pc(21) int local21 = arg4 - arg6;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg4 << 1;
		@Pc(68) int local68 = local21 << 1;
		@Pc(77) int local77 = (1 - local57) * local25 + local41;
		@Pc(85) int local85 = local29 - local45 * (local57 - 1);
		@Pc(95) int local95 = local33 * (1 - local68) + local49;
		@Pc(104) int local104 = local37 - local53 * (local68 - 1);
		@Pc(108) int local108 = local25 << 2;
		@Pc(112) int local112 = local29 << 2;
		@Pc(116) int local116 = local33 << 2;
		@Pc(120) int local120 = local37 << 2;
		@Pc(124) int local124 = local41 * 3;
		@Pc(130) int local130 = (local57 - 3) * local45;
		@Pc(134) int local134 = local49 * 3;
		@Pc(140) int local140 = (local68 - 3) * local53;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (arg4 - 1);
		@Pc(150) int local150 = local120;
		@Pc(156) int local156 = (local21 - 1) * local116;
		@Pc(179) int local179;
		@Pc(188) int local188;
		@Pc(197) int local197;
		@Pc(206) int local206;
		if (arg5 >= Static376.anInt6287 && Static168.anInt3256 >= arg5) {
			@Pc(170) int[] local170 = Static96.anIntArrayArray21[arg5];
			local179 = Static332.method4519(Static208.anInt2656, arg0 - arg2, Static354.anInt6186);
			local188 = Static332.method4519(Static208.anInt2656, arg0 + arg2, Static354.anInt6186);
			local197 = Static332.method4519(Static208.anInt2656, arg0 - local16, Static354.anInt6186);
			local206 = Static332.method4519(Static208.anInt2656, arg0 + local16, Static354.anInt6186);
			Static251.method3640(local179, arg1, local197, local170);
			Static251.method3640(local197, arg3, local206, local170);
			Static251.method3640(local206, arg1, local188, local170);
		}
		while (local9 > 0) {
			@Pc(237) boolean local237 = local9 <= local21;
			if (local77 < 0) {
				while (local77 < 0) {
					local77 += local124;
					local85 += local142;
					local7++;
					local124 += local112;
					local142 += local112;
				}
			}
			if (local237) {
				if (local95 < 0) {
					while (local95 < 0) {
						local95 += local134;
						local104 += local150;
						local11++;
						local134 += local120;
						local150 += local120;
					}
				}
				if (local104 < 0) {
					local95 += local134;
					local104 += local150;
					local134 += local120;
					local11++;
					local150 += local120;
				}
				local104 += -local140;
				local95 += -local156;
				local140 -= local116;
				local156 -= local116;
			}
			if (local85 < 0) {
				local77 += local124;
				local85 += local142;
				local142 += local112;
				local7++;
				local124 += local112;
			}
			local77 += -local148;
			local85 += -local130;
			local148 -= local108;
			local9--;
			local130 -= local108;
			local179 = arg5 - local9;
			local188 = arg5 + local9;
			if (local188 >= Static376.anInt6287 && Static168.anInt3256 >= local179) {
				local197 = Static332.method4519(Static208.anInt2656, arg0 + local7, Static354.anInt6186);
				local206 = Static332.method4519(Static208.anInt2656, arg0 - local7, Static354.anInt6186);
				if (local237) {
					@Pc(417) int local417 = Static332.method4519(Static208.anInt2656, local11 + arg0, Static354.anInt6186);
					@Pc(426) int local426 = Static332.method4519(Static208.anInt2656, arg0 - local11, Static354.anInt6186);
					@Pc(433) int[] local433;
					if (local179 >= Static376.anInt6287) {
						local433 = Static96.anIntArrayArray21[local179];
						Static251.method3640(local206, arg1, local426, local433);
						Static251.method3640(local426, arg3, local417, local433);
						Static251.method3640(local417, arg1, local197, local433);
					}
					if (Static168.anInt3256 >= local188) {
						local433 = Static96.anIntArrayArray21[local188];
						Static251.method3640(local206, arg1, local426, local433);
						Static251.method3640(local426, arg3, local417, local433);
						Static251.method3640(local417, arg1, local197, local433);
					}
				} else {
					if (local179 >= Static376.anInt6287) {
						Static251.method3640(local206, arg1, local197, Static96.anIntArrayArray21[local179]);
					}
					if (Static168.anInt3256 >= local188) {
						Static251.method3640(local206, arg1, local197, Static96.anIntArrayArray21[local188]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method3549(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static413.anInt6823; local16++) {
			if (arg0.equalsIgnoreCase(Static102.aStringArray7[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static141.aStringArray11[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
	public static void method3551(@OriginalArg(0) int arg0) {
		Static50.method813();
		Static142.method2426();
		Static440.method5561(true, arg0);
		Static40.method696(Static122.aClass19_16, Static293.aClass76_60, Static209.aClass76_48);
		Static97.method1700(Static293.aClass76_60, Static122.aClass19_16);
		Static324.method4387(Static429.aClass57Array18);
		Static246.method3601();
		Static369.method4940();
		if (Static403.anInt6667 == 10) {
			Static374.method4994(false);
		} else if (Static403.anInt6667 == 30) {
			Static187.method2932(25);
		} else if (Static403.anInt6667 == 5) {
			Static443.method5592(Static122.aClass19_16, Static293.aClass76_60);
			return;
		}
	}
}
