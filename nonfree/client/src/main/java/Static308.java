import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public static int anInt5111;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public static int anInt5112;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_191 = new Class67(97, 7);

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!du;")
	public static final Class62 aClass62_31 = new Class62(8, 6);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILclient!jg;I)V")
	public static void method4081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub1_Sub3 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class164 local9 = arg2.method2640();
		@Pc(19) int local19 = arg2.anInt3282 - arg2.aClass41_7.anInt774 & 0x3FFF;
		if (arg0 == -1) {
			if (local19 != 0 || arg2.anInt3277 > 25) {
				if (arg1 < 0 && local9.anInt4602 != -1) {
					arg2.anInt3317 = local9.anInt4602;
				} else if (arg1 <= 0 || local9.anInt4608 == -1) {
					arg2.anInt3317 = local9.anInt4606;
				} else {
					arg2.anInt3317 = local9.anInt4608;
				}
				arg2.aBoolean322 = false;
			} else if (!arg2.aBoolean322 || !local9.method3660(arg2.anInt3317)) {
				arg2.anInt3317 = local9.method3665();
				arg2.aBoolean322 = arg2.anInt3317 != -1;
			}
		} else if (arg2.anInt3318 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(115) int local115 = Static130.anIntArray173[arg3] - arg2.aClass41_7.anInt774 & 0x3FFF;
			if (arg0 == 2 && local9.anInt4636 != -1) {
				if (local115 > 2048 && local115 <= 6144 && local9.anInt4599 != -1) {
					arg2.anInt3317 = local9.anInt4599;
				} else if (local115 >= 10240 && local115 < 14336 && local9.anInt4609 != -1) {
					arg2.anInt3317 = local9.anInt4609;
				} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt4598 == -1) {
					arg2.anInt3317 = local9.anInt4636;
				} else {
					arg2.anInt3317 = local9.anInt4598;
				}
			} else if (arg0 == 0 && local9.anInt4611 != -1) {
				if (local115 > 2048 && local115 <= 6144 && local9.anInt4620 != -1) {
					arg2.anInt3317 = local9.anInt4620;
				} else if (local115 >= 10240 && local115 < 14336 && local9.anInt4610 != -1) {
					arg2.anInt3317 = local9.anInt4610;
				} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt4595 == -1) {
					arg2.anInt3317 = local9.anInt4611;
				} else {
					arg2.anInt3317 = local9.anInt4595;
				}
			} else if (local115 > 2048 && local115 <= 6144 && local9.anInt4621 != -1) {
				arg2.anInt3317 = local9.anInt4621;
			} else if (local115 >= 10240 && local115 < 14336 && local9.anInt4619 != -1) {
				arg2.anInt3317 = local9.anInt4619;
			} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt4607 == -1) {
				arg2.anInt3317 = local9.anInt4606;
			} else {
				arg2.anInt3317 = local9.anInt4607;
			}
			arg2.aBoolean322 = false;
		} else if (local19 == 0 && arg2.anInt3277 <= 25) {
			arg2.aBoolean322 = false;
			if (arg0 == 2 && local9.anInt4636 != -1) {
				arg2.anInt3317 = local9.anInt4636;
			} else if (arg0 == 0 && local9.anInt4611 != -1) {
				arg2.anInt3317 = local9.anInt4611;
			} else {
				arg2.anInt3317 = local9.anInt4606;
			}
		} else {
			if (arg0 == 2 && local9.anInt4636 != -1) {
				if (arg1 < 0 && local9.anInt4617 != -1) {
					arg2.anInt3317 = local9.anInt4617;
				} else if (arg1 <= 0 || local9.anInt4613 == -1) {
					arg2.anInt3317 = local9.anInt4636;
				} else {
					arg2.anInt3317 = local9.anInt4613;
				}
			} else if (arg0 == 0 && local9.anInt4611 != -1) {
				if (arg1 < 0 && local9.anInt4630 != -1) {
					arg2.anInt3317 = local9.anInt4630;
				} else if (arg1 <= 0 || local9.anInt4604 == -1) {
					arg2.anInt3317 = local9.anInt4611;
				} else {
					arg2.anInt3317 = local9.anInt4604;
				}
			} else if (arg1 < 0 && local9.anInt4625 != -1) {
				arg2.anInt3317 = local9.anInt4625;
			} else if (arg1 <= 0 || local9.anInt4638 == -1) {
				arg2.anInt3317 = local9.anInt4606;
			} else {
				arg2.anInt3317 = local9.anInt4638;
			}
			arg2.aBoolean322 = false;
		}
	}
}
