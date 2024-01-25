import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	public static int anInt4076;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public static final int anInt4071 = 1;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_50 = new Class187(7, 12);

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Lclient!be;")
	public static final Class31 aClass31_3 = new Class31();

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_149 = new Class196(56, 4);

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
	public static int anInt4077 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIBII)V")
	public static void method3581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(12) Class41_Sub8 local12 = (Class41_Sub8) Static261.aClass102_2.method2062(); local12 != null; local12 = (Class41_Sub8) Static261.aClass102_2.method2054()) {
			if (local12.anInt8698 <= Static421.anInt7434) {
				local12.method8644();
			} else {
				Static529.method7396(local12.anInt8702 * 2, (local12.anInt8708 << 9) + 256, (local12.anInt8700 << 9) + 256, arg3 >> 1, arg2 >> 1, local12.anInt8701);
				Static32.aClass72_2.method6919(local12.anInt8704 | 0xFF000000, arg0 + Static340.anIntArray352[0], local12.aString95, arg1 + Static340.anIntArray352[1], 0);
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BD)V")
	public static void method3583(@OriginalArg(1) double arg0) {
		Static162.aClass56_11.method8393(Static448.aClass56_10);
		Static162.aClass56_11.method8390(0, 0, (int) arg0);
		Static371.aClass143_7.method6222(Static162.aClass56_11);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZIILclient!li;)V")
	public static void method3584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub1_Sub1_Sub3 arg3) {
		@Pc(7) Class201 local7 = arg3.method7933();
		@Pc(21) int local21 = arg3.anInt9460 - arg3.aClass165_7.anInt3981 & 0x3FFF;
		if (arg1 == -1) {
			if (local21 != 0 || arg3.anInt9494 > 25) {
				if (arg2 < 0 && local7.anInt4752 != -1) {
					arg3.anInt9484 = local7.anInt4752;
					arg3.aBoolean690 = false;
				} else if (arg2 <= 0 || local7.anInt4760 == -1) {
					arg3.anInt9484 = local7.anInt4745;
				} else {
					arg3.anInt9484 = local7.anInt4760;
				}
				arg3.aBoolean690 = false;
			} else if (!arg3.aBoolean690 || !local7.method4158(arg3.anInt9484)) {
				arg3.anInt9484 = local7.method4159();
				arg3.aBoolean690 = arg3.anInt9484 != -1;
			}
		} else if (arg3.anInt9452 != -1 && (local21 >= 10240 || local21 <= 2048)) {
			@Pc(204) int local204 = Static557.anIntArray501[arg0] - arg3.aClass165_7.anInt3981 & 0x3FFF;
			if (arg1 == 2 && local7.anInt4759 != -1) {
				if (local204 > 2048 && local204 <= 6144 && local7.anInt4776 != -1) {
					arg3.anInt9484 = local7.anInt4776;
				} else if (local204 >= 10240 && local204 < 14336 && local7.anInt4761 != -1) {
					arg3.anInt9484 = local7.anInt4761;
				} else if (local204 <= 6144 || local204 >= 10240 || local7.anInt4786 == -1) {
					arg3.anInt9484 = local7.anInt4759;
				} else {
					arg3.anInt9484 = local7.anInt4786;
				}
			} else if (arg1 == 0 && local7.anInt4781 != -1) {
				if (local204 > 2048 && local204 <= 6144 && local7.anInt4765 != -1) {
					arg3.anInt9484 = local7.anInt4765;
				} else if (local204 >= 10240 && local204 < 14336 && local7.anInt4753 != -1) {
					arg3.anInt9484 = local7.anInt4753;
				} else if (local204 <= 6144 || local204 >= 10240 || local7.anInt4779 == -1) {
					arg3.anInt9484 = local7.anInt4781;
				} else {
					arg3.anInt9484 = local7.anInt4779;
				}
			} else if (local204 > 2048 && local204 <= 6144 && local7.anInt4762 != -1) {
				arg3.anInt9484 = local7.anInt4762;
			} else if (local204 >= 10240 && local204 < 14336 && local7.anInt4750 != -1) {
				arg3.anInt9484 = local7.anInt4750;
			} else if (local204 <= 6144 || local204 >= 10240 || local7.anInt4778 == -1) {
				arg3.anInt9484 = local7.anInt4745;
			} else {
				arg3.anInt9484 = local7.anInt4778;
			}
			arg3.aBoolean690 = false;
		} else if (local21 == 0 && arg3.anInt9494 <= 25) {
			if (arg1 == 2 && local7.anInt4759 != -1) {
				arg3.anInt9484 = local7.anInt4759;
			} else if (arg1 == 0 && local7.anInt4781 != -1) {
				arg3.anInt9484 = local7.anInt4781;
			} else {
				arg3.anInt9484 = local7.anInt4745;
			}
			arg3.aBoolean690 = false;
		} else {
			arg3.aBoolean690 = false;
			if (arg1 == 2 && local7.anInt4759 != -1) {
				if (arg2 < 0 && local7.anInt4782 != -1) {
					arg3.anInt9484 = local7.anInt4782;
				} else if (arg2 <= 0 || local7.anInt4756 == -1) {
					arg3.anInt9484 = local7.anInt4759;
				} else {
					arg3.anInt9484 = local7.anInt4756;
				}
			} else if (arg1 == 0 && local7.anInt4781 != -1) {
				if (arg2 < 0 && local7.anInt4746 != -1) {
					arg3.anInt9484 = local7.anInt4746;
				} else if (arg2 <= 0 || local7.anInt4749 == -1) {
					arg3.anInt9484 = local7.anInt4781;
				} else {
					arg3.anInt9484 = local7.anInt4749;
				}
			} else if (arg2 < 0 && local7.anInt4769 != -1) {
				arg3.anInt9484 = local7.anInt4769;
			} else if (arg2 <= 0 || local7.anInt4767 == -1) {
				arg3.anInt9484 = local7.anInt4745;
			} else {
				arg3.anInt9484 = local7.anInt4767;
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V")
	public static void method3585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(25) int local25 = (arg1 + arg0) / 2;
		@Pc(27) int local27 = arg1;
		@Pc(31) long local31 = arg2[local25];
		arg2[local25] = arg2[arg0];
		arg2[arg0] = local31;
		@Pc(45) Object local45 = arg3[local25];
		arg3[local25] = arg3[arg0];
		arg3[arg0] = local45;
		@Pc(65) int local65 = ~local31 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(67) int local67 = arg1; local67 < arg0; local67++) {
			if (local31 + (long) (local65 & local67) > arg2[local67]) {
				@Pc(84) long local84 = arg2[local67];
				arg2[local67] = arg2[local27];
				arg2[local27] = local84;
				@Pc(98) Object local98 = arg3[local67];
				arg3[local67] = arg3[local27];
				arg3[local27++] = local98;
			}
		}
		arg2[arg0] = arg2[local27];
		arg2[local27] = local31;
		arg3[arg0] = arg3[local27];
		arg3[local27] = local45;
		method3585(local27 - 1, arg1, arg2, arg3);
		method3585(arg0, local27 + 1, arg2, arg3);
	}
}
