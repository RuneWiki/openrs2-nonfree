import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!il", name = "c", descriptor = "Lclient!wia;")
	public static Class386 aClass386_63;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIZIIIIII)V")
	public static void method3686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg4 && arg1 == arg0 && arg7 == arg2 && arg6 == arg3) {
			Static265.method3856(arg5, arg4, arg2, arg6, arg0);
			return;
		}
		@Pc(35) int local35 = arg4;
		@Pc(37) int local37 = arg0;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg0 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg1 * 3;
		@Pc(57) int local57 = arg7 * 3;
		@Pc(61) int local61 = arg3 * 3;
		@Pc(71) int local71 = arg2 + local49 - local57 - arg4;
		@Pc(82) int local82 = arg6 + local53 - local61 - arg0;
		@Pc(92) int local92 = local57 + local41 - local49 - local49;
		@Pc(100) int local100 = local61 + local45 - local53 - local53;
		@Pc(105) int local105 = local49 - local41;
		@Pc(110) int local110 = local53 - local45;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(120) int local120 = local112 * local112 >> 12;
			@Pc(126) int local126 = local120 * local112 >> 12;
			@Pc(130) int local130 = local71 * local126;
			@Pc(134) int local134 = local126 * local82;
			@Pc(138) int local138 = local92 * local120;
			@Pc(142) int local142 = local100 * local120;
			@Pc(146) int local146 = local105 * local112;
			@Pc(150) int local150 = local112 * local110;
			@Pc(161) int local161 = (local130 + local138 + local146 >> 12) + arg4;
			@Pc(171) int local171 = (local150 + local134 + local142 >> 12) + arg0;
			Static265.method3856(arg5, local35, local161, local171, local37);
			local35 = local161;
			local37 = local171;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)I")
	public static int method3687() {
		if (Static299.aClass230_4 == null) {
			if (!Static505.aBoolean629 && Static12.aClass14_Sub3_Sub11_1 != null) {
				return Static12.aClass14_Sub3_Sub11_1.anInt4751;
			}
			@Pc(20) int local20 = Static666.aClass79_1.method3361();
			@Pc(24) int local24 = Static666.aClass79_1.method3358();
			@Pc(50) int local50;
			@Pc(52) int local52;
			@Pc(64) int local64;
			@Pc(132) Class14_Sub3_Sub11 local132;
			if (Static436.aBoolean534) {
				@Pc(127) Class280 local127;
				if (Static222.anInt4164 < local20 && Static189.anInt3555 + Static222.anInt4164 > local20) {
					local50 = -1;
					for (local52 = 0; local52 < Static569.anInt9810; local52++) {
						if (Static575.aBoolean699) {
							local64 = Static370.anInt10482 + local52 * 16 + 33;
							if (local24 > local64 - 13 && local24 <= local64 + 3) {
								local50 = local52;
							}
						} else {
							local64 = Static370.anInt10482 + local52 * 16 + 31;
							if (local24 > local64 - 13 && local24 <= local64 + 3) {
								local50 = local52;
							}
						}
					}
					if (local50 != -1) {
						local64 = 0;
						local127 = new Class280(Static563.aClass73_11);
						for (@Pc(227) Class14_Sub3_Sub21 local227 = (Class14_Sub3_Sub21) local127.method6863(); local227 != null; local227 = (Class14_Sub3_Sub21) local127.method6860()) {
							if (local64++ == local50) {
								return ((Class14_Sub3_Sub11) local227.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67).anInt4751;
							}
						}
					}
				} else if (Static665.aClass14_Sub3_Sub21_4 != null && local20 > Static652.anInt10893 && local20 < Static62.anInt9091 + Static652.anInt10893) {
					local50 = -1;
					for (local52 = 0; local52 < Static665.aClass14_Sub3_Sub21_4.anInt11129; local52++) {
						if (Static575.aBoolean699) {
							local64 = Static539.anInt9256 + local52 * 16 + 33;
							if (local64 - 13 < local24 && local64 + 3 >= local24) {
								local50 = local52;
							}
						} else {
							local64 = local52 * 16 + Static539.anInt9256 + 31;
							if (local24 > local64 - 13 && local64 + 3 >= local24) {
								local50 = local52;
							}
						}
					}
					if (local50 != -1) {
						local64 = 0;
						local127 = new Class280(Static665.aClass14_Sub3_Sub21_4.aClass73_13);
						for (local132 = (Class14_Sub3_Sub11) local127.method6863(); local132 != null; local132 = (Class14_Sub3_Sub11) local127.method6860()) {
							if (local50 == local64++) {
								return local132.anInt4751;
							}
						}
					}
				}
			} else if (Static222.anInt4164 < local20 && local20 < Static222.anInt4164 + Static189.anInt3555) {
				local50 = -1;
				for (local52 = 0; local52 < Static313.anInt9044; local52++) {
					if (Static575.aBoolean699) {
						local64 = Static370.anInt10482 + (-local52 + -1 + Static313.anInt9044) * 16 + 33;
						if (local64 - 13 < local24 && local64 + 3 >= local24) {
							local50 = local52;
						}
					} else {
						local64 = (Static313.anInt9044 - local52 - 1) * 16 + Static370.anInt10482 + 31;
						if (local24 > local64 - 13 && local64 + 3 >= local24) {
							local50 = local52;
						}
					}
				}
				if (local50 != -1) {
					local64 = 0;
					@Pc(350) Class118 local350 = new Class118(Static16.aClass262_68);
					for (local132 = (Class14_Sub3_Sub11) local350.method2831(); local132 != null; local132 = (Class14_Sub3_Sub11) local350.method2832()) {
						if (local50 == local64++) {
							return local132.anInt4751;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method3688(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static178.method2845(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static677.method9301(local45, arg1);
		}
	}
}
